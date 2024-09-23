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
    private boolean field793 = false;

    @OriginalMember(owner = "vb", name = "c", descriptor = "I")
    private int field794 = 2;

    @OriginalMember(owner = "vb", name = "d", descriptor = "Z")
    private boolean field795 = false;

    @OriginalMember(owner = "vb", name = "e", descriptor = "I")
    private int field796 = 1;

    @OriginalMember(owner = "vb", name = "f", descriptor = "Z")
    private boolean field797 = true;

    @OriginalMember(owner = "vb", name = "g", descriptor = "[[I")
    private int[][] field798 = new int[4][];

    @OriginalMember(owner = "vb", name = "h", descriptor = "[[I")
    private int[][] field799 = new int[4][];

    @OriginalMember(owner = "vb", name = "i", descriptor = "[[B")
    private byte[][] field800 = new byte[4][];

    @OriginalMember(owner = "vb", name = "p", descriptor = "Z")
    private boolean field807 = true;

    @OriginalMember(owner = "vb", name = "r", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field809 = new CRC32();

    @OriginalMember(owner = "vb", name = "s", descriptor = "Z")
    private boolean field810 = false;

    @OriginalMember(owner = "vb", name = "v", descriptor = "Lqb;")
    private DoublyLinkList field813 = new DoublyLinkList((byte) 5);

    @OriginalMember(owner = "vb", name = "w", descriptor = "Lpb;")
    private LinkList field814 = new LinkList((byte) 115);

    @OriginalMember(owner = "vb", name = "x", descriptor = "Lpb;")
    private LinkList field815 = new LinkList((byte) 115);

    @OriginalMember(owner = "vb", name = "y", descriptor = "Lpb;")
    private LinkList field816 = new LinkList((byte) 115);

    @OriginalMember(owner = "vb", name = "z", descriptor = "Lpb;")
    private LinkList field817 = new LinkList((byte) 115);

    @OriginalMember(owner = "vb", name = "A", descriptor = "Lpb;")
    private LinkList field818 = new LinkList((byte) 115);

    @OriginalMember(owner = "vb", name = "B", descriptor = "Ljava/lang/String;")
    public String field819 = "";

    @OriginalMember(owner = "vb", name = "K", descriptor = "[B")
    private byte[] field828 = new byte[500];

    @OriginalMember(owner = "vb", name = "L", descriptor = "[B")
    private byte[] field829 = new byte[65000];

    @OriginalMember(owner = "vb", name = "j", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "vb", name = "t", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "vb", name = "u", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "vb", name = "C", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "vb", name = "D", descriptor = "I")
    private int field821;

    @OriginalMember(owner = "vb", name = "I", descriptor = "I")
    private int field826;

    @OriginalMember(owner = "vb", name = "J", descriptor = "I")
    private int field827;

    @OriginalMember(owner = "vb", name = "M", descriptor = "I")
    private int field830;

    @OriginalMember(owner = "vb", name = "N", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "vb", name = "P", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "vb", name = "O", descriptor = "J")
    private long field832;

    @OriginalMember(owner = "vb", name = "H", descriptor = "Lnb;")
    private OnDemandRequest field825;

    @OriginalMember(owner = "vb", name = "q", descriptor = "Lclient;")
    private client field808;

    @OriginalMember(owner = "vb", name = "F", descriptor = "Ljava/io/InputStream;")
    private InputStream field823;

    @OriginalMember(owner = "vb", name = "G", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field824;

    @OriginalMember(owner = "vb", name = "E", descriptor = "Ljava/net/Socket;")
    private Socket field822;

    @OriginalMember(owner = "vb", name = "k", descriptor = "[B")
    private byte[] field802;

    @OriginalMember(owner = "vb", name = "l", descriptor = "[I")
    private int[] field803;

    @OriginalMember(owner = "vb", name = "m", descriptor = "[I")
    private int[] field804;

    @OriginalMember(owner = "vb", name = "n", descriptor = "[I")
    private int[] field805;

    @OriginalMember(owner = "vb", name = "o", descriptor = "[I")
    private int[] field806;

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lyb;Lclient;)V")
    public final void method272(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var22 = arg0.method299(var3[var4], null);
            int var23 = var22.length / 2;
            Packet var24 = new Packet(var22, true);
            this.field798[var4] = new int[var23];
            this.field800[var4] = new byte[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field798[var4][var25] = var24.method233();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var18 = arg0.method299(var5[var6], null);
            int var19 = var18.length / 4;
            Packet var20 = new Packet(var18, true);
            this.field799[var6] = new int[var19];
            for (int var21 = 0; var21 < var19; var21++) {
                this.field799[var6][var21] = var20.method236();
            }
        }
        byte[] var7 = arg0.method299("model_index", null);
        int var8 = this.field798[0].length;
        this.field802 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field802[var9] = var7[var9];
            } else {
                this.field802[var9] = 0;
            }
        }
        byte[] var10 = arg0.method299("map_index", null);
        Packet var11 = new Packet(var10, true);
        int var12 = var10.length / 6;
        this.field803 = new int[var12];
        this.field804 = new int[var12];
        this.field805 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field803[var13] = var11.method233();
            this.field804[var13] = var11.method233();
            this.field805[var13] = var11.method233();
        }
        byte[] var14 = arg0.method299("anim_index", null);
        Packet var15 = new Packet(var14, true);
        int var16 = var14.length / 2;
        this.field806 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field806[var17] = var15.method233();
        }
        this.field808 = arg1;
        this.field807 = true;
        this.field808.method12(this, 2);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "()V")
    public final void method273() {
        this.field807 = false;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)I")
    public final int method274(int arg0, int arg1) {
        if (arg1 != 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field798[arg0].length;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(B)I")
    public final int method275(byte arg0) {
        if (arg0 != -34) {
            this.field793 = !this.field793;
        }
        return this.field806.length;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IIIB)I")
    public final int method276(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 1) {
            this.field793 = !this.field793;
        }
        int var5 = (arg2 << 8) + arg0;
        for (int var6 = 0; var6 < this.field803.length; var6++) {
            if (this.field803[var6] == var5) {
                if (arg1 == 0) {
                    return this.field804[var6];
                }
                return this.field805[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IZ)Z")
    public final boolean method277(int arg0, boolean arg1) {
        if (arg1) {
            this.field797 = !this.field797;
        }
        for (int var3 = 0; var3 < this.field803.length; var3++) {
            if (this.field805[var3] == arg0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(II)I")
    public final int method278(int arg0, int arg1) {
        return arg0 == 0 ? this.field802[arg1] & 0xFF : 4;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(I)V")
    public final void method271(int arg0) {
        this.method279(0, arg0);
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(II)V")
    public final void method279(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field798.length || arg1 < 0 || arg1 > this.field798[arg0].length || this.field798[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field813;
        synchronized (this.field813) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field813.method257(); var4 != null; var4 = (OnDemandRequest) this.field813.method258(true)) {
                if (var4.field710 == arg0 && var4.field711 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field710 = arg0;
            var5.field711 = arg1;
            var5.field714 = true;
            LinkList var6 = this.field814;
            synchronized (this.field814) {
                this.field814.method247(var5);
            }
            this.field813.method255(var5);
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "()I")
    public final int method280() {
        DoublyLinkList var1 = this.field813;
        synchronized (this.field813) {
            return this.field813.method259();
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "()Lnb;")
    public final OnDemandRequest method281() {
        LinkList var1 = this.field817;
        OnDemandRequest var2;
        synchronized (this.field817) {
            var2 = (OnDemandRequest) this.field817.method249();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field813;
        synchronized (this.field813) {
            var2.method119();
        }
        if (var2.field712 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field712));
            while (true) {
                if (this.field829.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field829, var4, this.field829.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field712 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field712[var7] = this.field829[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(IIIB)V")
    public final void method282(int arg0, int arg1, int arg2, byte arg3) {
        if (this.field808.field1220[0] == null || this.field798[arg1][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field808.field1220[arg1 + 1].method291(3251, arg0);
        if (this.method289(this.field798[arg1][arg0], var5, (byte) -83, this.field799[arg1][arg0])) {
            return;
        }
        this.field800[arg1][arg0] = arg3;
        if (arg2 != 0) {
            this.field793 = !this.field793;
        }
        if (arg3 > this.field801) {
            this.field801 = arg3;
        }
        this.field821++;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Z)V")
    public final void method283(boolean arg0) {
        if (!arg0) {
            this.field796 = -108;
        }
        LinkList var2 = this.field818;
        synchronized (this.field818) {
            this.field818.method254();
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZII)V")
    public final void method284(boolean arg0, int arg1, int arg2) {
        if (this.field808.field1220[0] == null || (this.field798[arg1][arg2] == 0 || (this.field800[arg1][arg2] == 0 || this.field801 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field710 = arg1;
        var4.field711 = arg2;
        var4.field714 = false;
        if (!arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        LinkList var6 = this.field818;
        synchronized (this.field818) {
            this.field818.method247(var4);
        }
    }

    @OriginalMember(owner = "vb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field807) {
                this.field833++;
                try {
                    Thread.sleep(20L);
                } catch (Exception var8) {
                }
                this.field810 = true;
                for (int var1 = 0; var1 < 100 && this.field810; var1++) {
                    this.field810 = false;
                    this.method285(-26888);
                    this.method286(-863);
                    if (this.field811 == 0 && var1 >= 5) {
                        break;
                    }
                    this.method287(false);
                    if (this.field823 != null) {
                        this.method288((byte) 5);
                    }
                }
                boolean var2 = false;
                for (OnDemandRequest var3 = (OnDemandRequest) this.field816.method250(); var3 != null; var3 = (OnDemandRequest) this.field816.method252(true)) {
                    if (var3.field714) {
                        var2 = true;
                        var3.field713++;
                        if (var3.field713 > 50) {
                            var3.field713 = 0;
                            this.method290(false, var3);
                        }
                    }
                }
                if (!var2) {
                    for (OnDemandRequest var4 = (OnDemandRequest) this.field816.method250(); var4 != null; var4 = (OnDemandRequest) this.field816.method252(true)) {
                        var2 = true;
                        var4.field713++;
                        if (var4.field713 > 50) {
                            var4.field713 = 0;
                            this.method290(false, var4);
                        }
                    }
                }
                if (var2) {
                    this.field830++;
                    if (this.field830 > 750) {
                        try {
                            this.field822.close();
                        } catch (Exception var7) {
                        }
                        this.field822 = null;
                        this.field823 = null;
                        this.field824 = null;
                        this.field827 = 0;
                    }
                } else {
                    this.field830 = 0;
                    this.field819 = "";
                }
                if (this.field808.field1577 && this.field822 != null && this.field824 != null && this.field801 > 0) {
                    this.field831++;
                    if (this.field831 > 500) {
                        this.field831 = 0;
                        this.field828[0] = 0;
                        this.field828[1] = 0;
                        this.field828[2] = 0;
                        this.field828[3] = 10;
                        try {
                            this.field824.write(this.field828, 0, 4);
                        } catch (IOException var6) {
                            this.field830 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var9) {
            signlink.reporterror("od_ex " + var9.getMessage());
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(I)V")
    private final void method285(int arg0) {
        LinkList var2 = this.field814;
        OnDemandRequest var3;
        synchronized (this.field814) {
            var3 = (OnDemandRequest) this.field814.method249();
        }
        if (arg0 != -26888) {
            this.field793 = !this.field793;
        }
        while (var3 != null) {
            this.field810 = true;
            byte[] var4 = null;
            if (this.field808.field1220[0] != null) {
                var4 = this.field808.field1220[var3.field710 + 1].method291(3251, var3.field711);
            }
            if (!this.method289(this.field798[var3.field710][var3.field711], var4, (byte) -83, this.field799[var3.field710][var3.field711])) {
                var4 = null;
            }
            LinkList var5 = this.field814;
            synchronized (this.field814) {
                if (var4 == null) {
                    this.field815.method247(var3);
                } else {
                    var3.field712 = var4;
                    LinkList var6 = this.field817;
                    synchronized (this.field817) {
                        this.field817.method247(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field814.method249();
            }
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(I)V")
    private final void method286(int arg0) {
        this.field811 = 0;
        this.field812 = 0;
        OnDemandRequest var2 = (OnDemandRequest) this.field816.method250();
        while (arg0 >= 0) {
            this.field794 = 156;
        }
        while (var2 != null) {
            if (var2.field714) {
                this.field811++;
            } else {
                this.field812++;
            }
            var2 = (OnDemandRequest) this.field816.method252(true);
        }
        while (this.field811 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field815.method249();
            if (var3 == null) {
                break;
            }
            if (this.field800[var3.field710][var3.field711] != 0) {
                this.field820++;
            }
            this.field800[var3.field710][var3.field711] = 0;
            this.field816.method247(var3);
            this.field811++;
            this.method290(false, var3);
            this.field810 = true;
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(Z)V")
    private final void method287(boolean arg0) {
        if (arg0) {
            return;
        }
        while (this.field811 == 0) {
            if (this.field812 >= 10 || this.field801 == 0) {
                return;
            }
            LinkList var2 = this.field818;
            OnDemandRequest var3;
            synchronized (this.field818) {
                var3 = (OnDemandRequest) this.field818.method249();
            }
            while (var3 != null) {
                if (this.field800[var3.field710][var3.field711] != 0) {
                    this.field800[var3.field710][var3.field711] = 0;
                    this.field816.method247(var3);
                    this.method290(false, var3);
                    this.field810 = true;
                    if (this.field820 < this.field821) {
                        this.field820++;
                    }
                    this.field819 = "Loading extra files - " + this.field820 * 100 / this.field821 + "%";
                    this.field812++;
                    if (this.field812 == 10) {
                        return;
                    }
                }
                LinkList var4 = this.field818;
                synchronized (this.field818) {
                    var3 = (OnDemandRequest) this.field818.method249();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field800[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field801) {
                        var6[var8] = 0;
                        OnDemandRequest var9 = new OnDemandRequest();
                        var9.field710 = var5;
                        var9.field711 = var8;
                        var9.field714 = false;
                        this.field816.method247(var9);
                        this.method290(false, var9);
                        this.field810 = true;
                        if (this.field820 < this.field821) {
                            this.field820++;
                        }
                        this.field819 = "Loading extra files - " + this.field820 * 100 / this.field821 + "%";
                        this.field812++;
                        if (this.field812 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field801--;
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(B)V")
    private final void method288(byte arg0) {
        if (arg0 != 5) {
            this.field795 = !this.field795;
        }
        try {
            int var2 = this.field823.available();
            if (this.field827 == 0 && var2 >= 6) {
                this.field810 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field823.read(this.field828, var3, 6 - var3)) {
                }
                int var4 = this.field828[0] & 0xFF;
                int var5 = ((this.field828[1] & 0xFF) << 8) + (this.field828[2] & 0xFF);
                int var6 = ((this.field828[3] & 0xFF) << 8) + (this.field828[4] & 0xFF);
                int var7 = this.field828[5] & 0xFF;
                this.field825 = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.field816.method250(); var8 != null; var8 = (OnDemandRequest) this.field816.method252(true)) {
                    if (var8.field710 == var4 && var8.field711 == var5) {
                        this.field825 = var8;
                    }
                    if (this.field825 != null) {
                        var8.field713 = 0;
                    }
                }
                if (this.field825 != null) {
                    this.field830 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field825.field712 = null;
                        if (this.field825.field714) {
                            LinkList var9 = this.field817;
                            synchronized (this.field817) {
                                this.field817.method247(this.field825);
                            }
                        } else {
                            this.field825.method118();
                        }
                        this.field825 = null;
                    } else {
                        if (this.field825.field712 == null && var7 == 0) {
                            this.field825.field712 = new byte[var6];
                        }
                        if (this.field825.field712 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field826 = var7 * 500;
                this.field827 = 500;
                if (this.field827 > var6 - var7 * 500) {
                    this.field827 = var6 - var7 * 500;
                }
            }
            if (this.field827 > 0 && var2 >= this.field827) {
                this.field810 = true;
                byte[] var10 = this.field828;
                int var11 = 0;
                if (this.field825 != null) {
                    var10 = this.field825.field712;
                    var11 = this.field826;
                }
                for (int var12 = 0; var12 < this.field827; var12 += this.field823.read(var10, var11 + var12, this.field827 - var12)) {
                }
                if (this.field827 + this.field826 >= var10.length && this.field825 != null) {
                    if (this.field808.field1220[0] != null) {
                        this.field808.field1220[this.field825.field710 + 1].method292(this.field825.field711, var10.length, var10, (byte) -83);
                    }
                    if (!this.field825.field714 && this.field825.field710 == 3) {
                        this.field825.field714 = true;
                        this.field825.field710 = 93;
                    }
                    if (this.field825.field714) {
                        LinkList var13 = this.field817;
                        synchronized (this.field817) {
                            this.field817.method247(this.field825);
                        }
                    } else {
                        this.field825.method118();
                    }
                }
                this.field827 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field822.close();
            } catch (Exception var15) {
            }
            this.field822 = null;
            this.field823 = null;
            this.field824 = null;
            this.field827 = 0;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(I[BBI)Z")
    private final boolean method289(int arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 != -83) {
            throw new NullPointerException();
        } else if (arg1 == null || arg1.length < 2) {
            return false;
        } else {
            int var5 = arg1.length - 2;
            int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
            this.field809.reset();
            this.field809.update(arg1, 0, var5);
            int var7 = (int) this.field809.getValue();
            if (arg0 == var6) {
                return arg3 == var7;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZLnb;)V")
    private final void method290(boolean arg0, OnDemandRequest arg1) {
        if (arg0) {
            return;
        }
        try {
            if (this.field822 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field832 < 5000L) {
                    return;
                }
                this.field832 = var3;
                this.field822 = this.field808.method541(client.field1231 + 43594);
                this.field823 = this.field822.getInputStream();
                this.field824 = this.field822.getOutputStream();
                this.field824.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field823.read();
                }
                this.field830 = 0;
            }
            this.field828[0] = (byte) arg1.field710;
            this.field828[1] = (byte) (arg1.field711 >> 8);
            this.field828[2] = (byte) arg1.field711;
            if (arg1.field714) {
                this.field828[3] = 2;
            } else if (this.field808.field1577) {
                this.field828[3] = 0;
            } else {
                this.field828[3] = 1;
            }
            this.field824.write(this.field828, 0, 4);
            this.field831 = 0;
        } catch (IOException var8) {
            try {
                this.field822.close();
            } catch (Exception var7) {
            }
            this.field822 = null;
            this.field823 = null;
            this.field824 = null;
            this.field827 = 0;
        }
    }
}
