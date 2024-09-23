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
    private boolean field806 = true;

    @OriginalMember(owner = "ub", name = "c", descriptor = "Z")
    private boolean field807 = false;

    @OriginalMember(owner = "ub", name = "d", descriptor = "I")
    private int field808 = 4;

    @OriginalMember(owner = "ub", name = "e", descriptor = "B")
    private byte field809 = 4;

    @OriginalMember(owner = "ub", name = "f", descriptor = "B")
    private byte field810 = -13;

    @OriginalMember(owner = "ub", name = "h", descriptor = "B")
    private byte field812 = -25;

    @OriginalMember(owner = "ub", name = "i", descriptor = "[[I")
    private int[][] field813 = new int[4][];

    @OriginalMember(owner = "ub", name = "j", descriptor = "[[I")
    private int[][] field814 = new int[4][];

    @OriginalMember(owner = "ub", name = "k", descriptor = "[[B")
    private byte[][] field815 = new byte[4][];

    @OriginalMember(owner = "ub", name = "t", descriptor = "Z")
    private boolean field824 = true;

    @OriginalMember(owner = "ub", name = "v", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field826 = new CRC32();

    @OriginalMember(owner = "ub", name = "w", descriptor = "Z")
    private boolean field827 = false;

    @OriginalMember(owner = "ub", name = "z", descriptor = "Lpb;")
    private DoublyLinkList field830 = new DoublyLinkList(true);

    @OriginalMember(owner = "ub", name = "A", descriptor = "Lob;")
    private LinkList field831 = new LinkList(0);

    @OriginalMember(owner = "ub", name = "B", descriptor = "Lob;")
    private LinkList field832 = new LinkList(0);

    @OriginalMember(owner = "ub", name = "C", descriptor = "Lob;")
    private LinkList field833 = new LinkList(0);

    @OriginalMember(owner = "ub", name = "D", descriptor = "Lob;")
    private LinkList field834 = new LinkList(0);

    @OriginalMember(owner = "ub", name = "E", descriptor = "Lob;")
    private LinkList field835 = new LinkList(0);

    @OriginalMember(owner = "ub", name = "F", descriptor = "Ljava/lang/String;")
    public String field836 = "";

    @OriginalMember(owner = "ub", name = "P", descriptor = "[B")
    private byte[] field846 = new byte[500];

    @OriginalMember(owner = "ub", name = "Q", descriptor = "[B")
    private byte[] field847 = new byte[65000];

    @OriginalMember(owner = "ub", name = "g", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "ub", name = "l", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "ub", name = "x", descriptor = "I")
    private int field828;

    @OriginalMember(owner = "ub", name = "y", descriptor = "I")
    private int field829;

    @OriginalMember(owner = "ub", name = "G", descriptor = "I")
    private int field837;

    @OriginalMember(owner = "ub", name = "H", descriptor = "I")
    private int field838;

    @OriginalMember(owner = "ub", name = "L", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "ub", name = "N", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "ub", name = "O", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "ub", name = "R", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "ub", name = "S", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "ub", name = "U", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "ub", name = "T", descriptor = "J")
    private long field850;

    @OriginalMember(owner = "ub", name = "M", descriptor = "Lmb;")
    private OnDemandRequest field843;

    @OriginalMember(owner = "ub", name = "u", descriptor = "Lclient;")
    private client field825;

    @OriginalMember(owner = "ub", name = "J", descriptor = "Ljava/io/InputStream;")
    private InputStream field840;

    @OriginalMember(owner = "ub", name = "K", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field841;

    @OriginalMember(owner = "ub", name = "I", descriptor = "Ljava/net/Socket;")
    private Socket field839;

    @OriginalMember(owner = "ub", name = "m", descriptor = "[B")
    private byte[] field817;

    @OriginalMember(owner = "ub", name = "n", descriptor = "[I")
    private int[] field818;

    @OriginalMember(owner = "ub", name = "o", descriptor = "[I")
    private int[] field819;

    @OriginalMember(owner = "ub", name = "p", descriptor = "[I")
    private int[] field820;

    @OriginalMember(owner = "ub", name = "q", descriptor = "[I")
    private int[] field821;

    @OriginalMember(owner = "ub", name = "r", descriptor = "[I")
    private int[] field822;

    @OriginalMember(owner = "ub", name = "s", descriptor = "[I")
    private int[] field823;

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lxb;Lclient;)V")
    public final void method270(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method299(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(var26, 58);
            this.field813[var4] = new int[var27];
            this.field815[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field813[var4][var29] = var28.method231();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method299(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(var22, 58);
            this.field814[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field814[var6][var25] = var24.method234();
            }
        }
        byte[] var7 = arg0.method299("model_index", null);
        int var8 = this.field813[0].length;
        this.field817 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field817[var9] = var7[var9];
            } else {
                this.field817[var9] = 0;
            }
        }
        byte[] var10 = arg0.method299("map_index", null);
        Packet var11 = new Packet(var10, 58);
        int var12 = var10.length / 7;
        this.field818 = new int[var12];
        this.field819 = new int[var12];
        this.field820 = new int[var12];
        this.field821 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field818[var13] = var11.method231();
            this.field819[var13] = var11.method231();
            this.field820[var13] = var11.method231();
            this.field821[var13] = var11.method229();
        }
        byte[] var14 = arg0.method299("anim_index", null);
        Packet var15 = new Packet(var14, 58);
        int var16 = var14.length / 2;
        this.field822 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field822[var17] = var15.method231();
        }
        byte[] var18 = arg0.method299("midi_index", null);
        Packet var19 = new Packet(var18, 58);
        int var20 = var18.length;
        this.field823 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field823[var21] = var19.method229();
        }
        this.field825 = arg1;
        this.field824 = true;
        this.field825.method12(this, 2);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "()V")
    public final void method271() {
        this.field824 = false;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(II)I")
    public final int method272(int arg0, int arg1) {
        if (arg0 < 4 || arg0 > 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field813[arg1].length;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Z)I")
    public final int method273(boolean arg0) {
        if (arg0) {
            this.field807 = !this.field807;
        }
        return this.field822.length;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IBII)I")
    public final int method274(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = (arg0 << 8) + arg2;
        for (int var6 = 0; var6 < this.field818.length; var6++) {
            if (this.field818[var6] == var5) {
                if (arg3 == 0) {
                    return this.field819[var6];
                }
                return this.field820[var6];
            }
        }
        return arg1 == -55 ? -1 : 4;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BZ)V")
    public final void method275(byte arg0, boolean arg1) {
        int var3 = this.field818.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field821[var4] != 0) {
                this.method282((byte) 2, 3, (byte) -13, this.field820[var4]);
                this.method282((byte) 2, 3, (byte) -13, this.field819[var4]);
            }
        }
        if (this.field809 != arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(II)Z")
    public final boolean method276(int arg0, int arg1) {
        if (arg1 != -46678) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field818.length; var3++) {
            if (this.field820[var3] == arg0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(II)I")
    public final int method277(int arg0, int arg1) {
        return arg0 <= 0 ? 4 : this.field817[arg1] & 0xFF;
    }

    @OriginalMember(owner = "ub", name = "d", descriptor = "(II)Z")
    public final boolean method278(int arg0, int arg1) {
        while (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field823[arg0] == 1) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(I)V")
    public final void method269(int arg0) {
        this.method279(0, arg0);
    }

    @OriginalMember(owner = "ub", name = "e", descriptor = "(II)V")
    public final void method279(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field813.length || arg1 < 0 || arg1 > this.field813[arg0].length || this.field813[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field830;
        synchronized (this.field830) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field830.method255(); var4 != null; var4 = (OnDemandRequest) this.field830.method256((byte) 8)) {
                if (var4.field724 == arg0 && var4.field725 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field724 = arg0;
            var5.field725 = arg1;
            var5.field728 = true;
            LinkList var6 = this.field831;
            synchronized (this.field831) {
                this.field831.method245(var5);
            }
            this.field830.method253(var5);
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "()I")
    public final int method280() {
        DoublyLinkList var1 = this.field830;
        synchronized (this.field830) {
            return this.field830.method257();
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "()Lmb;")
    public final OnDemandRequest method281() {
        LinkList var1 = this.field834;
        OnDemandRequest var2;
        synchronized (this.field834) {
            var2 = (OnDemandRequest) this.field834.method247();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field830;
        synchronized (this.field830) {
            var2.method107();
        }
        if (var2.field726 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field726));
            while (true) {
                if (this.field847.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field847, var4, this.field847.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field726 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field726[var7] = this.field847[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BIBI)V")
    public final void method282(byte arg0, int arg1, byte arg2, int arg3) {
        if (this.field825.field1284[0] == null || this.field813[arg1][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field825.field1284[arg1 + 1].method291(arg3, 913);
        if (this.method289(this.field814[arg1][arg3], this.field813[arg1][arg3], var5, 1)) {
            return;
        }
        this.field815[arg1][arg3] = arg0;
        if (arg0 > this.field816) {
            this.field816 = arg0;
        }
        this.field838++;
        if (this.field810 == arg2) {
            ;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(B)V")
    public final void method283(byte arg0) {
        if (arg0 != 4) {
            this.field807 = !this.field807;
        }
        LinkList var2 = this.field835;
        synchronized (this.field835) {
            this.field835.method252();
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIB)V")
    public final void method284(int arg0, int arg1, byte arg2) {
        if (arg2 != 3 || (this.field825.field1284[0] == null || (this.field813[arg0][arg1] == 0 || (this.field815[arg0][arg1] == 0 || this.field816 == 0)))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field724 = arg0;
        var4.field725 = arg1;
        var4.field728 = false;
        LinkList var5 = this.field835;
        synchronized (this.field835) {
            this.field835.method245(var4);
        }
    }

    @OriginalMember(owner = "ub", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field824) {
                this.field851++;
                byte var1 = 20;
                if (this.field816 == 0 && this.field825.field1284[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field827 = true;
                for (int var2 = 0; var2 < 100 && this.field827; var2++) {
                    this.field827 = false;
                    this.method285((byte) -25);
                    this.method286((byte) 45);
                    if (this.field828 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method287((byte) 14);
                    if (this.field840 != null) {
                        this.method288(0);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field833.method248(); var4 != null; var4 = (OnDemandRequest) this.field833.method250((byte) 8)) {
                    if (var4.field728) {
                        var3 = true;
                        var4.field727++;
                        if (var4.field727 > 50) {
                            var4.field727 = 0;
                            this.method290(var4, -590);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field833.method248(); var5 != null; var5 = (OnDemandRequest) this.field833.method250((byte) 8)) {
                        var3 = true;
                        var5.field727++;
                        if (var5.field727 > 50) {
                            var5.field727 = 0;
                            this.method290(var5, -590);
                        }
                    }
                }
                if (var3) {
                    this.field848++;
                    if (this.field848 > 750) {
                        try {
                            this.field839.close();
                        } catch (Exception var8) {
                        }
                        this.field839 = null;
                        this.field840 = null;
                        this.field841 = null;
                        this.field845 = 0;
                    }
                } else {
                    this.field848 = 0;
                    this.field836 = "";
                }
                if (this.field825.field1602 && this.field839 != null && this.field841 != null && (this.field816 > 0 || this.field825.field1284[0] == null)) {
                    this.field849++;
                    if (this.field849 > 500) {
                        this.field849 = 0;
                        this.field846[0] = 0;
                        this.field846[1] = 0;
                        this.field846[2] = 0;
                        this.field846[3] = 10;
                        try {
                            this.field841.write(this.field846, 0, 4);
                        } catch (IOException var7) {
                            this.field848 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(B)V")
    private final void method285(byte arg0) {
        if (this.field812 != arg0) {
            return;
        }
        LinkList var2 = this.field831;
        OnDemandRequest var3;
        synchronized (this.field831) {
            var3 = (OnDemandRequest) this.field831.method247();
        }
        while (var3 != null) {
            this.field827 = true;
            byte[] var4 = null;
            if (this.field825.field1284[0] != null) {
                var4 = this.field825.field1284[var3.field724 + 1].method291(var3.field725, 913);
            }
            if (!this.method289(this.field814[var3.field724][var3.field725], this.field813[var3.field724][var3.field725], var4, 1)) {
                var4 = null;
            }
            LinkList var5 = this.field831;
            synchronized (this.field831) {
                if (var4 == null) {
                    this.field832.method245(var3);
                } else {
                    var3.field726 = var4;
                    LinkList var6 = this.field834;
                    synchronized (this.field834) {
                        this.field834.method245(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field831.method247();
            }
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(B)V")
    private final void method286(byte arg0) {
        if (arg0 != 45) {
            this.field811 = -308;
        }
        this.field828 = 0;
        this.field829 = 0;
        for (OnDemandRequest var2 = (OnDemandRequest) this.field833.method248(); var2 != null; var2 = (OnDemandRequest) this.field833.method250((byte) 8)) {
            if (var2.field728) {
                this.field828++;
            } else {
                this.field829++;
            }
        }
        while (this.field828 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field832.method247();
            if (var3 == null) {
                break;
            }
            if (this.field815[var3.field724][var3.field725] != 0) {
                this.field837++;
            }
            this.field815[var3.field724][var3.field725] = 0;
            this.field833.method245(var3);
            this.field828++;
            this.method290(var3, -590);
            this.field827 = true;
        }
    }

    @OriginalMember(owner = "ub", name = "d", descriptor = "(B)V")
    private final void method287(byte arg0) {
        if (arg0 != 14) {
            this.field808 = -74;
        }
        while (this.field828 == 0) {
            if (this.field829 >= 10 || this.field816 == 0) {
                return;
            }
            LinkList var2 = this.field835;
            OnDemandRequest var3;
            synchronized (this.field835) {
                var3 = (OnDemandRequest) this.field835.method247();
            }
            while (var3 != null) {
                if (this.field815[var3.field724][var3.field725] != 0) {
                    this.field815[var3.field724][var3.field725] = 0;
                    this.field833.method245(var3);
                    this.method290(var3, -590);
                    this.field827 = true;
                    if (this.field837 < this.field838) {
                        this.field837++;
                    }
                    this.field836 = "Loading extra files - " + this.field837 * 100 / this.field838 + "%";
                    this.field829++;
                    if (this.field829 == 10) {
                        return;
                    }
                }
                LinkList var4 = this.field835;
                synchronized (this.field835) {
                    var3 = (OnDemandRequest) this.field835.method247();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field815[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field816) {
                        var6[var8] = 0;
                        OnDemandRequest var9 = new OnDemandRequest();
                        var9.field724 = var5;
                        var9.field725 = var8;
                        var9.field728 = false;
                        this.field833.method245(var9);
                        this.method290(var9, -590);
                        this.field827 = true;
                        if (this.field837 < this.field838) {
                            this.field837++;
                        }
                        this.field836 = "Loading extra files - " + this.field837 * 100 / this.field838 + "%";
                        this.field829++;
                        if (this.field829 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field816--;
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(I)V")
    private final void method288(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        try {
            int var3 = this.field840.available();
            if (this.field845 == 0 && var3 >= 6) {
                this.field827 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field840.read(this.field846, var4, 6 - var4)) {
                }
                int var5 = this.field846[0] & 0xFF;
                int var6 = ((this.field846[1] & 0xFF) << 8) + (this.field846[2] & 0xFF);
                int var7 = ((this.field846[3] & 0xFF) << 8) + (this.field846[4] & 0xFF);
                int var8 = this.field846[5] & 0xFF;
                this.field843 = null;
                for (OnDemandRequest var9 = (OnDemandRequest) this.field833.method248(); var9 != null; var9 = (OnDemandRequest) this.field833.method250((byte) 8)) {
                    if (var9.field724 == var5 && var9.field725 == var6) {
                        this.field843 = var9;
                    }
                    if (this.field843 != null) {
                        var9.field727 = 0;
                    }
                }
                if (this.field843 != null) {
                    this.field848 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field843.field726 = null;
                        if (this.field843.field728) {
                            LinkList var10 = this.field834;
                            synchronized (this.field834) {
                                this.field834.method245(this.field843);
                            }
                        } else {
                            this.field843.method106();
                        }
                        this.field843 = null;
                    } else {
                        if (this.field843.field726 == null && var8 == 0) {
                            this.field843.field726 = new byte[var7];
                        }
                        if (this.field843.field726 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field844 = var8 * 500;
                this.field845 = 500;
                if (this.field845 > var7 - var8 * 500) {
                    this.field845 = var7 - var8 * 500;
                }
            }
            if (this.field845 > 0 && var3 >= this.field845) {
                this.field827 = true;
                byte[] var11 = this.field846;
                int var12 = 0;
                if (this.field843 != null) {
                    var11 = this.field843.field726;
                    var12 = this.field844;
                }
                for (int var13 = 0; var13 < this.field845; var13 += this.field840.read(var11, var12 + var13, this.field845 - var13)) {
                }
                if (this.field845 + this.field844 >= var11.length && this.field843 != null) {
                    if (this.field825.field1284[0] != null) {
                        this.field825.field1284[this.field843.field724 + 1].method292(6, this.field843.field725, var11, var11.length);
                    }
                    if (!this.field843.field728 && this.field843.field724 == 3) {
                        this.field843.field728 = true;
                        this.field843.field724 = 93;
                    }
                    if (this.field843.field728) {
                        LinkList var14 = this.field834;
                        synchronized (this.field834) {
                            this.field834.method245(this.field843);
                        }
                    } else {
                        this.field843.method106();
                    }
                }
                this.field845 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field839.close();
            } catch (Exception var16) {
            }
            this.field839 = null;
            this.field840 = null;
            this.field841 = null;
            this.field845 = 0;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(II[BI)Z")
    private final boolean method289(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg2 == null || arg2.length < 2) {
            return false;
        }
        int var5 = arg2.length - 2;
        int var6 = ((arg2[var5] & 0xFF) << 8) + (arg2[var5 + 1] & 0xFF);
        if (arg3 != 1) {
            this.field806 = !this.field806;
        }
        this.field826.reset();
        this.field826.update(arg2, 0, var5);
        int var7 = (int) this.field826.getValue();
        if (arg1 == var6) {
            return arg0 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lmb;I)V")
    private final void method290(OnDemandRequest arg0, int arg1) {
        if (arg1 >= 0) {
            return;
        }
        try {
            if (this.field839 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field850 < 4000L) {
                    return;
                }
                this.field850 = var3;
                this.field839 = this.field825.method545(client.field1548 + 43594);
                this.field840 = this.field839.getInputStream();
                this.field841 = this.field839.getOutputStream();
                this.field841.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field840.read();
                }
                this.field848 = 0;
            }
            this.field846[0] = (byte) arg0.field724;
            this.field846[1] = (byte) (arg0.field725 >> 8);
            this.field846[2] = (byte) arg0.field725;
            if (arg0.field728) {
                this.field846[3] = 2;
            } else if (this.field825.field1602) {
                this.field846[3] = 0;
            } else {
                this.field846[3] = 1;
            }
            this.field841.write(this.field846, 0, 4);
            this.field849 = 0;
            this.field842 = -10000;
        } catch (IOException var8) {
            try {
                this.field839.close();
            } catch (Exception var7) {
            }
            this.field839 = null;
            this.field840 = null;
            this.field841 = null;
            this.field845 = 0;
            this.field842++;
        }
    }
}
