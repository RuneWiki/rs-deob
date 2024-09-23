import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sign.signlink;

@OriginalClass("vb")
public class OnDemand extends OnDemandProvider implements Runnable {

    @OriginalMember(owner = "vb", name = "b", descriptor = "Z")
    private boolean field787 = false;

    @OriginalMember(owner = "vb", name = "c", descriptor = "Z")
    private boolean field788 = false;

    @OriginalMember(owner = "vb", name = "d", descriptor = "B")
    private byte field789 = 0;

    @OriginalMember(owner = "vb", name = "e", descriptor = "Z")
    private boolean field790 = false;

    @OriginalMember(owner = "vb", name = "f", descriptor = "[[I")
    private int[][] field791 = new int[4][];

    @OriginalMember(owner = "vb", name = "g", descriptor = "[[I")
    private int[][] field792 = new int[4][];

    @OriginalMember(owner = "vb", name = "h", descriptor = "[[B")
    private byte[][] field793 = new byte[4][];

    @OriginalMember(owner = "vb", name = "o", descriptor = "Z")
    private boolean field800 = true;

    @OriginalMember(owner = "vb", name = "q", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field802 = new CRC32();

    @OriginalMember(owner = "vb", name = "r", descriptor = "Lqb;")
    private DoublyLinkList field803 = new DoublyLinkList(309);

    @OriginalMember(owner = "vb", name = "s", descriptor = "Lpb;")
    private LinkList field804 = new LinkList(-740);

    @OriginalMember(owner = "vb", name = "t", descriptor = "Lpb;")
    private LinkList field805 = new LinkList(-740);

    @OriginalMember(owner = "vb", name = "u", descriptor = "Lpb;")
    private LinkList field806 = new LinkList(-740);

    @OriginalMember(owner = "vb", name = "v", descriptor = "Lpb;")
    private LinkList field807 = new LinkList(-740);

    @OriginalMember(owner = "vb", name = "w", descriptor = "Lpb;")
    private LinkList field808 = new LinkList(-740);

    @OriginalMember(owner = "vb", name = "x", descriptor = "Ljava/lang/String;")
    public String field809 = "";

    @OriginalMember(owner = "vb", name = "G", descriptor = "[B")
    private byte[] field818 = new byte[500];

    @OriginalMember(owner = "vb", name = "H", descriptor = "[B")
    private byte[] field819 = new byte[65000];

    @OriginalMember(owner = "vb", name = "a", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "vb", name = "i", descriptor = "I")
    private int field794;

    @OriginalMember(owner = "vb", name = "y", descriptor = "I")
    private int field810;

    @OriginalMember(owner = "vb", name = "z", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "vb", name = "E", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "vb", name = "F", descriptor = "I")
    private int field817;

    @OriginalMember(owner = "vb", name = "I", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "vb", name = "J", descriptor = "I")
    private int field821;

    @OriginalMember(owner = "vb", name = "L", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "vb", name = "K", descriptor = "J")
    private long field822;

    @OriginalMember(owner = "vb", name = "D", descriptor = "Lnb;")
    private OnDemandRequest field815;

    @OriginalMember(owner = "vb", name = "p", descriptor = "Lclient;")
    private client field801;

    @OriginalMember(owner = "vb", name = "B", descriptor = "Ljava/io/InputStream;")
    private InputStream field813;

    @OriginalMember(owner = "vb", name = "C", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field814;

    @OriginalMember(owner = "vb", name = "A", descriptor = "Ljava/net/Socket;")
    private Socket field812;

    @OriginalMember(owner = "vb", name = "j", descriptor = "[B")
    private byte[] field795;

    @OriginalMember(owner = "vb", name = "k", descriptor = "[I")
    private int[] field796;

    @OriginalMember(owner = "vb", name = "l", descriptor = "[I")
    private int[] field797;

    @OriginalMember(owner = "vb", name = "m", descriptor = "[I")
    private int[] field798;

    @OriginalMember(owner = "vb", name = "n", descriptor = "[I")
    private int[] field799;

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lyb;Lclient;)V")
    public final void method272(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var22 = arg0.method295(var3[var4], null);
            int var23 = var22.length / 2;
            Packet var24 = new Packet(699, var22);
            this.field791[var4] = new int[var23];
            this.field793[var4] = new byte[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field791[var4][var25] = var24.method233();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var18 = arg0.method295(var5[var6], null);
            int var19 = var18.length / 4;
            Packet var20 = new Packet(699, var18);
            this.field792[var6] = new int[var19];
            for (int var21 = 0; var21 < var19; var21++) {
                this.field792[var6][var21] = var20.method236();
            }
        }
        byte[] var7 = arg0.method295("model_index", null);
        int var8 = this.field791[0].length;
        this.field795 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field795[var9] = var7[var9];
            } else {
                this.field795[var9] = 0;
            }
        }
        byte[] var10 = arg0.method295("map_index", null);
        Packet var11 = new Packet(699, var10);
        int var12 = var10.length / 6;
        this.field796 = new int[var12];
        this.field797 = new int[var12];
        this.field798 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field796[var13] = var11.method233();
            this.field797[var13] = var11.method233();
            this.field798[var13] = var11.method233();
        }
        byte[] var14 = arg0.method295("anim_index", null);
        Packet var15 = new Packet(699, var14);
        int var16 = var14.length / 2;
        this.field799 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field799[var17] = var15.method233();
        }
        this.field801 = arg1;
        this.field800 = true;
        this.field801.method12(this, 2);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "()V")
    public final void method273() {
        this.field800 = false;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)I")
    public final int method274(int arg0, int arg1) {
        return arg0 >= 0 ? this.field786 : this.field791[arg1].length;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(B)I")
    public final int method275(byte arg0) {
        return arg0 == 94 ? this.field799.length : this.field786;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IIII)I")
    public final int method276(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg1 << 8) + arg2;
        for (int var6 = 0; var6 < this.field796.length; var6++) {
            if (this.field796[var6] == var5) {
                if (arg3 == 0) {
                    return this.field797[var6];
                }
                return this.field798[var6];
            }
        }
        if (arg0 < 7 || arg0 > 7) {
            this.field787 = !this.field787;
        }
        return -1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZI)Z")
    public final boolean method277(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < this.field796.length; var4++) {
            if (this.field798[var4] == arg1) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(II)I")
    public final int method278(int arg0, int arg1) {
        int var3 = 89 / arg1;
        return this.field795[arg0] & 0xFF;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(I)V")
    public final void method271(int arg0) {
        this.method279(0, arg0);
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(II)V")
    public final void method279(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field791.length || arg1 < 0 || arg1 > this.field791[arg0].length || this.field791[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field803;
        synchronized (this.field803) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field803.method257(); var4 != null; var4 = (OnDemandRequest) this.field803.method258(7)) {
                if (var4.field706 == arg0 && var4.field707 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field706 = arg0;
            var5.field707 = arg1;
            var5.field710 = true;
            LinkList var6 = this.field804;
            synchronized (this.field804) {
                this.field804.method247(var5);
            }
            this.field803.method255(var5);
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "()I")
    public final int method280() {
        DoublyLinkList var1 = this.field803;
        synchronized (this.field803) {
            return this.field803.method259();
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "()Lnb;")
    public final OnDemandRequest method281() {
        LinkList var1 = this.field807;
        OnDemandRequest var2;
        synchronized (this.field807) {
            var2 = (OnDemandRequest) this.field807.method249();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field803;
        synchronized (this.field803) {
            var2.method119();
        }
        if (var2.field708 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field708));
            while (true) {
                if (this.field819.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field819, var4, this.field819.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field708 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field708[var7] = this.field819[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IBBI)V")
    public final void method282(int arg0, byte arg1, byte arg2, int arg3) {
        if (this.field801.field1218[0] == null || this.field791[arg0][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field801.field1218[arg0 + 1].method287(false, arg3);
        if (this.field789 != arg1) {
            this.field786 = 413;
        }
        if (this.method285(var5, this.field792[arg0][arg3], this.field791[arg0][arg3], (byte) -50)) {
            return;
        }
        this.field793[arg0][arg3] = arg2;
        if (arg2 > this.field794) {
            this.field794 = arg2;
        }
        this.field811++;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Z)V")
    public final void method283(boolean arg0) {
        LinkList var2 = this.field808;
        synchronized (this.field808) {
            this.field808.method254();
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(III)V")
    public final void method284(int arg0, int arg1, int arg2) {
        if (this.field801.field1218[0] == null || (this.field791[arg0][arg1] == 0 || (this.field793[arg0][arg1] == 0 || this.field794 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field706 = arg0;
        var4.field707 = arg1;
        var4.field710 = false;
        LinkList var5 = this.field808;
        synchronized (this.field808) {
            this.field808.method247(var4);
        }
        if (arg2 != 0) {
            this.field788 = !this.field788;
        }
    }

    @OriginalMember(owner = "vb", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field800) {
            this.field823++;
            try {
                Thread.sleep(20L);
            } catch (Exception var46) {
            }
            boolean var1 = true;
            for (int var2 = 0; var2 < 100 && var1; var2++) {
                var1 = false;
                LinkList var3 = this.field804;
                OnDemandRequest var4;
                synchronized (this.field804) {
                    var4 = (OnDemandRequest) this.field804.method249();
                }
                while (var4 != null) {
                    var1 = true;
                    byte[] var5 = null;
                    if (this.field801.field1218[0] != null) {
                        var5 = this.field801.field1218[var4.field706 + 1].method287(false, var4.field707);
                    }
                    if (!this.method285(var5, this.field792[var4.field706][var4.field707], this.field791[var4.field706][var4.field707], (byte) -50)) {
                        var5 = null;
                    }
                    LinkList var6 = this.field804;
                    synchronized (this.field804) {
                        if (var5 == null) {
                            this.field805.method247(var4);
                        } else {
                            var4.field708 = var5;
                            LinkList var7 = this.field807;
                            synchronized (this.field807) {
                                this.field807.method247(var4);
                            }
                        }
                        var4 = (OnDemandRequest) this.field804.method249();
                    }
                }
                int var8 = 0;
                int var9 = 0;
                for (OnDemandRequest var10 = (OnDemandRequest) this.field806.method250(); var10 != null; var10 = (OnDemandRequest) this.field806.method252(7)) {
                    if (var10.field710) {
                        var8++;
                    } else {
                        var9++;
                    }
                }
                while (var8 < 10) {
                    OnDemandRequest var11 = (OnDemandRequest) this.field805.method249();
                    if (var11 == null) {
                        break;
                    }
                    if (this.field793[var11.field706][var11.field707] != 0) {
                        this.field810++;
                    }
                    this.field793[var11.field706][var11.field707] = 0;
                    this.field806.method247(var11);
                    var8++;
                    this.method286(var11, false);
                    var1 = true;
                }
                if (var8 == 0 && var2 >= 5) {
                    break;
                }
                label337: while (var8 == 0 && var9 < 10 && this.field794 != 0) {
                    LinkList var12 = this.field808;
                    OnDemandRequest var13;
                    synchronized (this.field808) {
                        var13 = (OnDemandRequest) this.field808.method249();
                    }
                    while (var13 != null) {
                        if (this.field793[var13.field706][var13.field707] != 0) {
                            this.field793[var13.field706][var13.field707] = 0;
                            this.field806.method247(var13);
                            this.method286(var13, false);
                            var1 = true;
                            if (this.field810 < this.field811) {
                                this.field810++;
                            }
                            this.field809 = "Loading extra files - " + this.field810 * 100 / this.field811 + "%";
                            var9++;
                            if (var9 == 10) {
                                break label337;
                            }
                        }
                        LinkList var14 = this.field808;
                        synchronized (this.field808) {
                            var13 = (OnDemandRequest) this.field808.method249();
                        }
                    }
                    for (int var15 = 0; var15 < 4; var15++) {
                        byte[] var16 = this.field793[var15];
                        int var17 = var16.length;
                        for (int var18 = 0; var18 < var17; var18++) {
                            if (var16[var18] == this.field794) {
                                var16[var18] = 0;
                                OnDemandRequest var19 = new OnDemandRequest();
                                var19.field706 = var15;
                                var19.field707 = var18;
                                var19.field710 = false;
                                this.field806.method247(var19);
                                this.method286(var19, false);
                                var1 = true;
                                if (this.field810 < this.field811) {
                                    this.field810++;
                                }
                                this.field809 = "Loading extra files - " + this.field810 * 100 / this.field811 + "%";
                                if (var19.field706 >= 2) {
                                    this.field809 = ".";
                                }
                                var9++;
                                if (var9 == 10) {
                                    break label337;
                                }
                            }
                        }
                    }
                    this.field794--;
                }
                if (this.field813 != null) {
                    try {
                        int var20 = this.field813.available();
                        if (this.field817 == 0 && var20 >= 6) {
                            var1 = true;
                            for (int var21 = 0; var21 < 6; var21 += this.field813.read(this.field818, var21, 6 - var21)) {
                            }
                            int var22 = this.field818[0] & 0xFF;
                            int var23 = ((this.field818[1] & 0xFF) << 8) + (this.field818[2] & 0xFF);
                            int var24 = ((this.field818[3] & 0xFF) << 8) + (this.field818[4] & 0xFF);
                            int var25 = this.field818[5] & 0xFF;
                            this.field815 = null;
                            for (OnDemandRequest var26 = (OnDemandRequest) this.field806.method250(); var26 != null; var26 = (OnDemandRequest) this.field806.method252(7)) {
                                if (var26.field706 == var22 && var26.field707 == var23) {
                                    this.field815 = var26;
                                }
                                if (this.field815 != null) {
                                    var26.field709 = 0;
                                }
                            }
                            if (this.field815 != null) {
                                this.field820 = 0;
                                if (var24 == 0) {
                                    signlink.reporterror("Rej: " + var22 + "," + var23);
                                    this.field815.field708 = null;
                                    if (this.field815.field710) {
                                        LinkList var27 = this.field807;
                                        synchronized (this.field807) {
                                            this.field807.method247(this.field815);
                                        }
                                    } else {
                                        this.field815.method118();
                                    }
                                    this.field815 = null;
                                } else {
                                    if (this.field815.field708 == null && var25 == 0) {
                                        this.field815.field708 = new byte[var24];
                                    }
                                    if (this.field815.field708 == null && var25 != 0) {
                                        throw new IOException("missing start of file");
                                    }
                                }
                            }
                            this.field816 = var25 * 500;
                            this.field817 = 500;
                            if (this.field817 > var24 - var25 * 500) {
                                this.field817 = var24 - var25 * 500;
                            }
                        }
                        if (this.field817 > 0 && var20 >= this.field817) {
                            var1 = true;
                            byte[] var28 = this.field818;
                            int var29 = 0;
                            if (this.field815 != null) {
                                var28 = this.field815.field708;
                                var29 = this.field816;
                            }
                            for (int var30 = 0; var30 < this.field817; var30 += this.field813.read(var28, var29 + var30, this.field817 - var30)) {
                            }
                            if (this.field817 + this.field816 >= var28.length && this.field815 != null) {
                                if (this.field801.field1218[0] != null) {
                                    this.field801.field1218[this.field815.field706 + 1].method288(var28.length, var28, -437, this.field815.field707);
                                }
                                if (!this.field815.field710 && this.field815.field706 == 3) {
                                    this.field815.field710 = true;
                                    this.field815.field706 = 93;
                                }
                                if (this.field815.field710) {
                                    LinkList var31 = this.field807;
                                    synchronized (this.field807) {
                                        this.field807.method247(this.field815);
                                    }
                                } else {
                                    this.field815.method118();
                                }
                            }
                            this.field817 = 0;
                        }
                    } catch (IOException var47) {
                        try {
                            this.field812.close();
                        } catch (Exception var38) {
                        }
                        this.field812 = null;
                        this.field813 = null;
                        this.field814 = null;
                        this.field817 = 0;
                    }
                }
            }
            boolean var33 = false;
            for (OnDemandRequest var34 = (OnDemandRequest) this.field806.method250(); var34 != null; var34 = (OnDemandRequest) this.field806.method252(7)) {
                if (var34.field710) {
                    var33 = true;
                    var34.field709++;
                    if (var34.field709 > 50) {
                        var34.field709 = 0;
                        this.method286(var34, false);
                    }
                }
            }
            if (!var33) {
                for (OnDemandRequest var35 = (OnDemandRequest) this.field806.method250(); var35 != null; var35 = (OnDemandRequest) this.field806.method252(7)) {
                    var33 = true;
                    var35.field709++;
                    if (var35.field709 > 50) {
                        var35.field709 = 0;
                        this.method286(var35, false);
                    }
                }
            }
            if (var33) {
                this.field820++;
                if (this.field820 > 750) {
                    try {
                        this.field812.close();
                    } catch (Exception var37) {
                    }
                    this.field812 = null;
                    this.field813 = null;
                    this.field814 = null;
                    this.field817 = 0;
                }
            } else {
                this.field820 = 0;
                this.field809 = "";
            }
            if (this.field801.field1463 && this.field812 != null && this.field814 != null && this.field794 > 0) {
                this.field821++;
                if (this.field821 > 500) {
                    this.field821 = 0;
                    this.field818[0] = 0;
                    this.field818[1] = 0;
                    this.field818[2] = 0;
                    this.field818[3] = 10;
                    try {
                        this.field814.write(this.field818, 0, 4);
                    } catch (IOException var36) {
                        this.field820 = 5000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "([BIIB)Z")
    private final boolean method285(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field802.reset();
        this.field802.update(arg0, 0, var5);
        if (arg3 != -50) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = (int) this.field802.getValue();
        if (arg2 == var6) {
            return arg1 == var8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lnb;Z)V")
    private final void method286(OnDemandRequest arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        try {
            if (this.field812 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field822 < 5000L) {
                    return;
                }
                this.field822 = var3;
                this.field812 = this.field801.method436(client.field1138 + 43594);
                this.field813 = this.field812.getInputStream();
                this.field814 = this.field812.getOutputStream();
                this.field814.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field813.read();
                }
                this.field820 = 0;
            }
            this.field818[0] = (byte) arg0.field706;
            this.field818[1] = (byte) (arg0.field707 >> 8);
            this.field818[2] = (byte) arg0.field707;
            if (arg0.field710) {
                this.field818[3] = 2;
            } else if (this.field801.field1463 || arg0.field706 > 1) {
                this.field818[3] = 0;
            } else {
                this.field818[3] = 1;
            }
            this.field814.write(this.field818, 0, 4);
            this.field821 = 0;
        } catch (IOException var8) {
            try {
                this.field812.close();
            } catch (Exception var7) {
            }
            this.field812 = null;
            this.field813 = null;
            this.field814 = null;
            this.field817 = 0;
        }
    }
}
