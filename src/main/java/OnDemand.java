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

@OriginalClass("ub")
public class OnDemand extends OnDemandProvider implements Runnable {

    @OriginalMember(owner = "ub", name = "b", descriptor = "Z")
    private boolean field800 = false;

    @OriginalMember(owner = "ub", name = "c", descriptor = "I")
    private int field801 = 8;

    @OriginalMember(owner = "ub", name = "d", descriptor = "B")
    private byte field802 = -67;

    @OriginalMember(owner = "ub", name = "e", descriptor = "B")
    private byte field803 = -67;

    @OriginalMember(owner = "ub", name = "f", descriptor = "B")
    private byte field804 = 70;

    @OriginalMember(owner = "ub", name = "g", descriptor = "B")
    private byte field805 = 7;

    @OriginalMember(owner = "ub", name = "h", descriptor = "[[I")
    private int[][] field806 = new int[4][];

    @OriginalMember(owner = "ub", name = "i", descriptor = "[[I")
    private int[][] field807 = new int[4][];

    @OriginalMember(owner = "ub", name = "j", descriptor = "[[B")
    private byte[][] field808 = new byte[4][];

    @OriginalMember(owner = "ub", name = "s", descriptor = "Z")
    private boolean field817 = true;

    @OriginalMember(owner = "ub", name = "u", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field819 = new CRC32();

    @OriginalMember(owner = "ub", name = "v", descriptor = "Z")
    private boolean field820 = false;

    @OriginalMember(owner = "ub", name = "y", descriptor = "Lpb;")
    private DoublyLinkList field823 = new DoublyLinkList(false);

    @OriginalMember(owner = "ub", name = "z", descriptor = "Lob;")
    private LinkList field824 = new LinkList((byte) 5);

    @OriginalMember(owner = "ub", name = "A", descriptor = "Lob;")
    private LinkList field825 = new LinkList((byte) 5);

    @OriginalMember(owner = "ub", name = "B", descriptor = "Lob;")
    private LinkList field826 = new LinkList((byte) 5);

    @OriginalMember(owner = "ub", name = "C", descriptor = "Lob;")
    private LinkList field827 = new LinkList((byte) 5);

    @OriginalMember(owner = "ub", name = "D", descriptor = "Lob;")
    private LinkList field828 = new LinkList((byte) 5);

    @OriginalMember(owner = "ub", name = "E", descriptor = "Ljava/lang/String;")
    public String field829 = "";

    @OriginalMember(owner = "ub", name = "N", descriptor = "[B")
    private byte[] field838 = new byte[500];

    @OriginalMember(owner = "ub", name = "O", descriptor = "[B")
    private byte[] field839 = new byte[65000];

    @OriginalMember(owner = "ub", name = "a", descriptor = "I")
    private int field799;

    @OriginalMember(owner = "ub", name = "k", descriptor = "I")
    private int field809;

    @OriginalMember(owner = "ub", name = "w", descriptor = "I")
    private int field821;

    @OriginalMember(owner = "ub", name = "x", descriptor = "I")
    private int field822;

    @OriginalMember(owner = "ub", name = "F", descriptor = "I")
    private int field830;

    @OriginalMember(owner = "ub", name = "G", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "ub", name = "L", descriptor = "I")
    private int field836;

    @OriginalMember(owner = "ub", name = "M", descriptor = "I")
    private int field837;

    @OriginalMember(owner = "ub", name = "P", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "ub", name = "Q", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "ub", name = "S", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "ub", name = "R", descriptor = "J")
    private long field842;

    @OriginalMember(owner = "ub", name = "K", descriptor = "Lmb;")
    private OnDemandRequest field835;

    @OriginalMember(owner = "ub", name = "t", descriptor = "Lclient;")
    private client field818;

    @OriginalMember(owner = "ub", name = "I", descriptor = "Ljava/io/InputStream;")
    private InputStream field833;

    @OriginalMember(owner = "ub", name = "J", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field834;

    @OriginalMember(owner = "ub", name = "H", descriptor = "Ljava/net/Socket;")
    private Socket field832;

    @OriginalMember(owner = "ub", name = "l", descriptor = "[B")
    private byte[] field810;

    @OriginalMember(owner = "ub", name = "m", descriptor = "[I")
    private int[] field811;

    @OriginalMember(owner = "ub", name = "n", descriptor = "[I")
    private int[] field812;

    @OriginalMember(owner = "ub", name = "o", descriptor = "[I")
    private int[] field813;

    @OriginalMember(owner = "ub", name = "p", descriptor = "[I")
    private int[] field814;

    @OriginalMember(owner = "ub", name = "q", descriptor = "[I")
    private int[] field815;

    @OriginalMember(owner = "ub", name = "r", descriptor = "[I")
    private int[] field816;

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lxb;Lclient;)V")
    public final void method265(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method294(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet((byte) 3, var26);
            this.field806[var4] = new int[var27];
            this.field808[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field806[var4][var29] = var28.method226();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method294(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet((byte) 3, var22);
            this.field807[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field807[var6][var25] = var24.method229();
            }
        }
        byte[] var7 = arg0.method294("model_index", null);
        int var8 = this.field806[0].length;
        this.field810 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field810[var9] = var7[var9];
            } else {
                this.field810[var9] = 0;
            }
        }
        byte[] var10 = arg0.method294("map_index", null);
        Packet var11 = new Packet((byte) 3, var10);
        int var12 = var10.length / 7;
        this.field811 = new int[var12];
        this.field812 = new int[var12];
        this.field813 = new int[var12];
        this.field814 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field811[var13] = var11.method226();
            this.field812[var13] = var11.method226();
            this.field813[var13] = var11.method226();
            this.field814[var13] = var11.method224();
        }
        byte[] var14 = arg0.method294("anim_index", null);
        Packet var15 = new Packet((byte) 3, var14);
        int var16 = var14.length / 2;
        this.field815 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field815[var17] = var15.method226();
        }
        byte[] var18 = arg0.method294("midi_index", null);
        Packet var19 = new Packet((byte) 3, var18);
        int var20 = var18.length;
        this.field816 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field816[var21] = var19.method224();
        }
        this.field818 = arg1;
        this.field817 = true;
        this.field818.method12(this, 2);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "()V")
    public final void method266() {
        this.field817 = false;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(II)I")
    public final int method267(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field799 = -99;
        }
        return this.field806[arg1].length;
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(I)I")
    public final int method268(int arg0) {
        if (arg0 < this.field801 || arg0 > this.field801) {
            this.field801 = 172;
        }
        return this.field815.length;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(ZIII)I")
    public final int method269(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg3 << 8) + arg1;
        for (int var6 = 0; var6 < this.field811.length; var6++) {
            if (this.field811[var6] == var5) {
                if (arg2 == 0) {
                    return this.field812[var6];
                }
                return this.field813[var6];
            }
        }
        if (arg0) {
            this.field800 = !this.field800;
        }
        return -1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(ZI)V")
    public final void method270(boolean arg0, int arg1) {
        int var3 = this.field811.length;
        int var4 = 54 / arg1;
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg0 || this.field814[var5] != 0) {
                this.method277(3, this.field813[var5], (byte) 2, 954);
                this.method277(3, this.field812[var5], (byte) 2, 954);
            }
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BI)Z")
    public final boolean method271(byte arg0, int arg1) {
        for (int var3 = 0; var3 < this.field811.length; var3++) {
            if (this.field813[var3] == arg1) {
                return true;
            }
        }
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(ZI)I")
    public final int method272(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field810[arg1] & 0xFF;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IZ)Z")
    public final boolean method273(int arg0, boolean arg1) {
        if (!arg1) {
            this.field799 = 454;
        }
        return this.field816[arg0] == 1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(I)V")
    public final void method264(int arg0) {
        this.method274(0, arg0);
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(II)V")
    public final void method274(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field806.length || arg1 < 0 || arg1 > this.field806[arg0].length || this.field806[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field823;
        synchronized (this.field823) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field823.method250(); var4 != null; var4 = (OnDemandRequest) this.field823.method251(30869)) {
                if (var4.field715 == arg0 && var4.field716 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field715 = arg0;
            var5.field716 = arg1;
            var5.field719 = true;
            LinkList var6 = this.field824;
            synchronized (this.field824) {
                this.field824.method240(var5);
            }
            this.field823.method248(var5);
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "()I")
    public final int method275() {
        DoublyLinkList var1 = this.field823;
        synchronized (this.field823) {
            return this.field823.method252();
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "()Lmb;")
    public final OnDemandRequest method276() {
        LinkList var1 = this.field827;
        OnDemandRequest var2;
        synchronized (this.field827) {
            var2 = (OnDemandRequest) this.field827.method242();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field823;
        synchronized (this.field823) {
            var2.method107();
        }
        if (var2.field717 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field717));
            while (true) {
                if (this.field839.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field839, var4, this.field839.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field717 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field717[var7] = this.field839[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIBI)V")
    public final void method277(int arg0, int arg1, byte arg2, int arg3) {
        if (this.field818.field1378[0] == null || this.field806[arg0][arg1] == 0) {
            return;
        }
        byte[] var5 = this.field818.field1378[arg0 + 1].method286(arg1, -32477);
        if (this.method284(this.field807[arg0][arg1], (byte) 2, this.field806[arg0][arg1], var5)) {
            return;
        }
        this.field808[arg0][arg1] = arg2;
        if (arg2 > this.field809) {
            this.field809 = arg2;
        }
        this.field831++;
        if (arg3 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        if (arg0 != 21906) {
            this.field800 = !this.field800;
        }
        LinkList var2 = this.field828;
        synchronized (this.field828) {
            this.field828.method247();
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIZ)V")
    public final void method279(int arg0, int arg1, boolean arg2) {
        if (this.field818.field1378[0] == null || (this.field806[arg0][arg1] == 0 || (this.field808[arg0][arg1] == 0 || this.field809 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        var4.field715 = arg0;
        var4.field716 = arg1;
        var4.field719 = false;
        LinkList var6 = this.field828;
        synchronized (this.field828) {
            this.field828.method240(var4);
        }
    }

    @OriginalMember(owner = "ub", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field817) {
                this.field843++;
                byte var1 = 20;
                if (this.field809 == 0 && this.field818.field1378[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field820 = true;
                for (int var2 = 0; var2 < 100 && this.field820; var2++) {
                    this.field820 = false;
                    this.method280(29321);
                    this.method281(this.field802);
                    if (this.field821 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method282(this.field804);
                    if (this.field833 != null) {
                        this.method283(this.field805);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field826.method243(); var4 != null; var4 = (OnDemandRequest) this.field826.method245(30869)) {
                    if (var4.field719) {
                        var3 = true;
                        var4.field718++;
                        if (var4.field718 > 50) {
                            var4.field718 = 0;
                            this.method285(var4, true);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field826.method243(); var5 != null; var5 = (OnDemandRequest) this.field826.method245(30869)) {
                        var3 = true;
                        var5.field718++;
                        if (var5.field718 > 50) {
                            var5.field718 = 0;
                            this.method285(var5, true);
                        }
                    }
                }
                if (var3) {
                    this.field840++;
                    if (this.field840 > 750) {
                        try {
                            this.field832.close();
                        } catch (Exception var8) {
                        }
                        this.field832 = null;
                        this.field833 = null;
                        this.field834 = null;
                        this.field837 = 0;
                    }
                } else {
                    this.field840 = 0;
                    this.field829 = "";
                }
                if (this.field818.field1512 && this.field832 != null && this.field834 != null && (this.field809 > 0 || this.field818.field1378[0] == null)) {
                    this.field841++;
                    if (this.field841 > 500) {
                        this.field841 = 0;
                        this.field838[0] = 0;
                        this.field838[1] = 0;
                        this.field838[2] = 0;
                        this.field838[3] = 10;
                        try {
                            this.field834.write(this.field838, 0, 4);
                        } catch (IOException var7) {
                            this.field840 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "ub", name = "d", descriptor = "(I)V")
    private final void method280(int arg0) {
        LinkList var2 = this.field824;
        OnDemandRequest var3;
        synchronized (this.field824) {
            var3 = (OnDemandRequest) this.field824.method242();
        }
        if (arg0 != 29321) {
            this.field799 = 293;
        }
        while (var3 != null) {
            this.field820 = true;
            byte[] var4 = null;
            if (this.field818.field1378[0] != null) {
                var4 = this.field818.field1378[var3.field715 + 1].method286(var3.field716, -32477);
            }
            if (!this.method284(this.field807[var3.field715][var3.field716], (byte) 2, this.field806[var3.field715][var3.field716], var4)) {
                var4 = null;
            }
            LinkList var5 = this.field824;
            synchronized (this.field824) {
                if (var4 == null) {
                    this.field825.method240(var3);
                } else {
                    var3.field717 = var4;
                    LinkList var6 = this.field827;
                    synchronized (this.field827) {
                        this.field827.method240(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field824.method242();
            }
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(B)V")
    private final void method281(byte arg0) {
        this.field821 = 0;
        this.field822 = 0;
        if (this.field803 != arg0) {
            return;
        }
        for (OnDemandRequest var2 = (OnDemandRequest) this.field826.method243(); var2 != null; var2 = (OnDemandRequest) this.field826.method245(30869)) {
            if (var2.field719) {
                this.field821++;
            } else {
                this.field822++;
            }
        }
        while (this.field821 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field825.method242();
            if (var3 == null) {
                break;
            }
            if (this.field808[var3.field715][var3.field716] != 0) {
                this.field830++;
            }
            this.field808[var3.field715][var3.field716] = 0;
            this.field826.method240(var3);
            this.field821++;
            this.method285(var3, true);
            this.field820 = true;
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(B)V")
    private final void method282(byte arg0) {
        if (arg0 != 70) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.field821 == 0) {
            if (this.field822 >= 10 || this.field809 == 0) {
                return;
            }
            LinkList var3 = this.field828;
            OnDemandRequest var4;
            synchronized (this.field828) {
                var4 = (OnDemandRequest) this.field828.method242();
            }
            while (var4 != null) {
                if (this.field808[var4.field715][var4.field716] != 0) {
                    this.field808[var4.field715][var4.field716] = 0;
                    this.field826.method240(var4);
                    this.method285(var4, true);
                    this.field820 = true;
                    if (this.field830 < this.field831) {
                        this.field830++;
                    }
                    this.field829 = "Loading extra files - " + this.field830 * 100 / this.field831 + "%";
                    this.field822++;
                    if (this.field822 == 10) {
                        return;
                    }
                }
                LinkList var5 = this.field828;
                synchronized (this.field828) {
                    var4 = (OnDemandRequest) this.field828.method242();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field808[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field809) {
                        var7[var9] = 0;
                        OnDemandRequest var10 = new OnDemandRequest();
                        var10.field715 = var6;
                        var10.field716 = var9;
                        var10.field719 = false;
                        this.field826.method240(var10);
                        this.method285(var10, true);
                        this.field820 = true;
                        if (this.field830 < this.field831) {
                            this.field830++;
                        }
                        this.field829 = "Loading extra files - " + this.field830 * 100 / this.field831 + "%";
                        this.field822++;
                        if (this.field822 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field809--;
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(B)V")
    private final void method283(byte arg0) {
        if (arg0 != 7) {
            return;
        }
        try {
            int var2 = this.field833.available();
            if (this.field837 == 0 && var2 >= 6) {
                this.field820 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field833.read(this.field838, var3, 6 - var3)) {
                }
                int var4 = this.field838[0] & 0xFF;
                int var5 = ((this.field838[1] & 0xFF) << 8) + (this.field838[2] & 0xFF);
                int var6 = ((this.field838[3] & 0xFF) << 8) + (this.field838[4] & 0xFF);
                int var7 = this.field838[5] & 0xFF;
                this.field835 = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.field826.method243(); var8 != null; var8 = (OnDemandRequest) this.field826.method245(30869)) {
                    if (var8.field715 == var4 && var8.field716 == var5) {
                        this.field835 = var8;
                    }
                    if (this.field835 != null) {
                        var8.field718 = 0;
                    }
                }
                if (this.field835 != null) {
                    this.field840 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field835.field717 = null;
                        if (this.field835.field719) {
                            LinkList var9 = this.field827;
                            synchronized (this.field827) {
                                this.field827.method240(this.field835);
                            }
                        } else {
                            this.field835.method106();
                        }
                        this.field835 = null;
                    } else {
                        if (this.field835.field717 == null && var7 == 0) {
                            this.field835.field717 = new byte[var6];
                        }
                        if (this.field835.field717 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field836 = var7 * 500;
                this.field837 = 500;
                if (this.field837 > var6 - var7 * 500) {
                    this.field837 = var6 - var7 * 500;
                }
            }
            if (this.field837 > 0 && var2 >= this.field837) {
                this.field820 = true;
                byte[] var10 = this.field838;
                int var11 = 0;
                if (this.field835 != null) {
                    var10 = this.field835.field717;
                    var11 = this.field836;
                }
                for (int var12 = 0; var12 < this.field837; var12 += this.field833.read(var10, var11 + var12, this.field837 - var12)) {
                }
                if (this.field837 + this.field836 >= var10.length && this.field835 != null) {
                    if (this.field818.field1378[0] != null) {
                        this.field818.field1378[this.field835.field715 + 1].method287(var10, this.field835.field716, var10.length, 870);
                    }
                    if (!this.field835.field719 && this.field835.field715 == 3) {
                        this.field835.field719 = true;
                        this.field835.field715 = 93;
                    }
                    if (this.field835.field719) {
                        LinkList var13 = this.field827;
                        synchronized (this.field827) {
                            this.field827.method240(this.field835);
                        }
                    } else {
                        this.field835.method106();
                    }
                }
                this.field837 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field832.close();
            } catch (Exception var15) {
            }
            this.field832 = null;
            this.field833 = null;
            this.field834 = null;
            this.field837 = 0;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IBI[B)Z")
    private final boolean method284(int arg0, byte arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field819.reset();
        if (arg1 != 2) {
            this.field801 = 245;
        }
        this.field819.update(arg3, 0, var5);
        int var7 = (int) this.field819.getValue();
        if (arg2 == var6) {
            return arg0 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lmb;Z)V")
    private final void method285(OnDemandRequest arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        try {
            if (this.field832 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field842 < 5000L) {
                    return;
                }
                this.field842 = var3;
                this.field832 = this.field818.method530(client.field1462 + 43594);
                this.field833 = this.field832.getInputStream();
                this.field834 = this.field832.getOutputStream();
                this.field834.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field833.read();
                }
                this.field840 = 0;
            }
            this.field838[0] = (byte) arg0.field715;
            this.field838[1] = (byte) (arg0.field716 >> 8);
            this.field838[2] = (byte) arg0.field716;
            if (arg0.field719) {
                this.field838[3] = 2;
            } else if (this.field818.field1512) {
                this.field838[3] = 0;
            } else {
                this.field838[3] = 1;
            }
            this.field834.write(this.field838, 0, 4);
            this.field841 = 0;
        } catch (IOException var8) {
            try {
                this.field832.close();
            } catch (Exception var7) {
            }
            this.field832 = null;
            this.field833 = null;
            this.field834 = null;
            this.field837 = 0;
        }
    }
}
