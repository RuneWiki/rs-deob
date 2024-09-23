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

    @OriginalMember(owner = "ub", name = "a", descriptor = "Z")
    private boolean field812 = true;

    @OriginalMember(owner = "ub", name = "b", descriptor = "I")
    private int field813 = 942;

    @OriginalMember(owner = "ub", name = "c", descriptor = "I")
    private int field814 = 763;

    @OriginalMember(owner = "ub", name = "d", descriptor = "I")
    private int field815 = 920;

    @OriginalMember(owner = "ub", name = "e", descriptor = "I")
    private int field816 = -112;

    @OriginalMember(owner = "ub", name = "f", descriptor = "[[I")
    private int[][] field817 = new int[4][];

    @OriginalMember(owner = "ub", name = "g", descriptor = "[[I")
    private int[][] field818 = new int[4][];

    @OriginalMember(owner = "ub", name = "h", descriptor = "[[B")
    private byte[][] field819 = new byte[4][];

    @OriginalMember(owner = "ub", name = "q", descriptor = "Z")
    private boolean field828 = true;

    @OriginalMember(owner = "ub", name = "s", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field830 = new CRC32();

    @OriginalMember(owner = "ub", name = "t", descriptor = "Z")
    private boolean field831 = false;

    @OriginalMember(owner = "ub", name = "w", descriptor = "Lpb;")
    private DoublyLinkList field834 = new DoublyLinkList(0);

    @OriginalMember(owner = "ub", name = "x", descriptor = "Lob;")
    private LinkList field835 = new LinkList(464);

    @OriginalMember(owner = "ub", name = "y", descriptor = "Lob;")
    private LinkList field836 = new LinkList(464);

    @OriginalMember(owner = "ub", name = "z", descriptor = "Lob;")
    private LinkList field837 = new LinkList(464);

    @OriginalMember(owner = "ub", name = "A", descriptor = "Lob;")
    private LinkList field838 = new LinkList(464);

    @OriginalMember(owner = "ub", name = "B", descriptor = "Lob;")
    private LinkList field839 = new LinkList(464);

    @OriginalMember(owner = "ub", name = "C", descriptor = "Ljava/lang/String;")
    public String field840 = "";

    @OriginalMember(owner = "ub", name = "M", descriptor = "[B")
    private byte[] field850 = new byte[500];

    @OriginalMember(owner = "ub", name = "N", descriptor = "[B")
    private byte[] field851 = new byte[65000];

    @OriginalMember(owner = "ub", name = "i", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "ub", name = "u", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "ub", name = "v", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "ub", name = "D", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "ub", name = "E", descriptor = "I")
    private int field842;

    @OriginalMember(owner = "ub", name = "I", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "ub", name = "K", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "ub", name = "L", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "ub", name = "O", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "ub", name = "P", descriptor = "I")
    private int field853;

    @OriginalMember(owner = "ub", name = "R", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "ub", name = "Q", descriptor = "J")
    private long field854;

    @OriginalMember(owner = "ub", name = "J", descriptor = "Lmb;")
    private OnDemandRequest field847;

    @OriginalMember(owner = "ub", name = "r", descriptor = "Lclient;")
    private client field829;

    @OriginalMember(owner = "ub", name = "G", descriptor = "Ljava/io/InputStream;")
    private InputStream field844;

    @OriginalMember(owner = "ub", name = "H", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field845;

    @OriginalMember(owner = "ub", name = "F", descriptor = "Ljava/net/Socket;")
    private Socket field843;

    @OriginalMember(owner = "ub", name = "j", descriptor = "[B")
    private byte[] field821;

    @OriginalMember(owner = "ub", name = "k", descriptor = "[I")
    private int[] field822;

    @OriginalMember(owner = "ub", name = "l", descriptor = "[I")
    private int[] field823;

    @OriginalMember(owner = "ub", name = "m", descriptor = "[I")
    private int[] field824;

    @OriginalMember(owner = "ub", name = "n", descriptor = "[I")
    private int[] field825;

    @OriginalMember(owner = "ub", name = "o", descriptor = "[I")
    private int[] field826;

    @OriginalMember(owner = "ub", name = "p", descriptor = "[I")
    private int[] field827;

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lxb;Lclient;)V")
    public final void method270(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method299(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(-49365, var26);
            this.field817[var4] = new int[var27];
            this.field819[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field817[var4][var29] = var28.method231();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method299(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(-49365, var22);
            this.field818[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field818[var6][var25] = var24.method234();
            }
        }
        byte[] var7 = arg0.method299("model_index", null);
        int var8 = this.field817[0].length;
        this.field821 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field821[var9] = var7[var9];
            } else {
                this.field821[var9] = 0;
            }
        }
        byte[] var10 = arg0.method299("map_index", null);
        Packet var11 = new Packet(-49365, var10);
        int var12 = var10.length / 7;
        this.field822 = new int[var12];
        this.field823 = new int[var12];
        this.field824 = new int[var12];
        this.field825 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field822[var13] = var11.method231();
            this.field823[var13] = var11.method231();
            this.field824[var13] = var11.method231();
            this.field825[var13] = var11.method229();
        }
        byte[] var14 = arg0.method299("anim_index", null);
        Packet var15 = new Packet(-49365, var14);
        int var16 = var14.length / 2;
        this.field826 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field826[var17] = var15.method231();
        }
        byte[] var18 = arg0.method299("midi_index", null);
        Packet var19 = new Packet(-49365, var18);
        int var20 = var18.length;
        this.field827 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field827[var21] = var19.method229();
        }
        this.field829 = arg1;
        this.field828 = true;
        this.field829.method12(this, 2);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "()V")
    public final void method271() {
        this.field828 = false;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(II)I")
    public final int method272(int arg0, int arg1) {
        int var3 = 15 / arg1;
        return this.field817[arg0].length;
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(I)I")
    public final int method273(int arg0) {
        if (arg0 != 9) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field826.length;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(ZIII)I")
    public final int method274(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg2 << 8) + arg1;
        for (int var6 = 0; var6 < this.field822.length; var6++) {
            if (this.field822[var6] == var5) {
                if (arg3 == 0) {
                    return this.field823[var6];
                }
                return this.field824[var6];
            }
        }
        return arg0 ? -1 : 4;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IZ)V")
    public final void method275(int arg0, boolean arg1) {
        int var3 = this.field822.length;
        if (arg0 != 35850) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg1 || this.field825[var5] != 0) {
                this.method282(this.field824[var5], false, (byte) 2, 3);
                this.method282(this.field823[var5], false, (byte) 2, 3);
            }
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(II)Z")
    public final boolean method276(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field822.length; var3++) {
            if (this.field824[var3] == arg1) {
                return true;
            }
        }
        if (arg0 != 28967) {
            this.field812 = !this.field812;
        }
        return false;
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(IZ)I")
    public final int method277(int arg0, boolean arg1) {
        return arg1 ? this.field821[arg0] & 0xFF : 2;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(ZI)Z")
    public final boolean method278(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return this.field827[arg1] == 1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(I)V")
    public final void method269(int arg0) {
        this.method279(0, arg0);
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(II)V")
    public final void method279(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field817.length || arg1 < 0 || arg1 > this.field817[arg0].length || this.field817[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field834;
        synchronized (this.field834) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field834.method255(); var4 != null; var4 = (OnDemandRequest) this.field834.method256(true)) {
                if (var4.field735 == arg0 && var4.field736 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field735 = arg0;
            var5.field736 = arg1;
            var5.field739 = true;
            LinkList var6 = this.field835;
            synchronized (this.field835) {
                this.field835.method245(var5);
            }
            this.field834.method253(var5);
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "()I")
    public final int method280() {
        DoublyLinkList var1 = this.field834;
        synchronized (this.field834) {
            return this.field834.method257();
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "()Lmb;")
    public final OnDemandRequest method281() {
        LinkList var1 = this.field838;
        OnDemandRequest var2;
        synchronized (this.field838) {
            var2 = (OnDemandRequest) this.field838.method247();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field834;
        synchronized (this.field834) {
            var2.method107();
        }
        if (var2.field737 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field737));
            while (true) {
                if (this.field851.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field851, var4, this.field851.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field737 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field737[var7] = this.field851[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IZBI)V")
    public final void method282(int arg0, boolean arg1, byte arg2, int arg3) {
        if (this.field829.field1262[0] == null || this.field817[arg3][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field829.field1262[arg3 + 1].method291(arg0, false);
        if (arg1) {
            this.field813 = -188;
        }
        if (this.method289(this.field818[arg3][arg0], this.field817[arg3][arg0], false, var5)) {
            return;
        }
        this.field819[arg3][arg0] = arg2;
        if (arg2 > this.field820) {
            this.field820 = arg2;
        }
        this.field842++;
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(I)V")
    public final void method283(int arg0) {
        LinkList var2 = this.field839;
        synchronized (this.field839) {
            this.field839.method252();
        }
        if (arg0 == -44242) {
            ;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(ZII)V")
    public final void method284(boolean arg0, int arg1, int arg2) {
        if (this.field829.field1262[0] == null || (this.field817[arg1][arg2] == 0 || (this.field819[arg1][arg2] == 0 || this.field820 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field735 = arg1;
        var4.field736 = arg2;
        var4.field739 = false;
        LinkList var5 = this.field839;
        synchronized (this.field839) {
            this.field839.method245(var4);
        }
        if (arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "ub", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field828) {
                this.field855++;
                byte var1 = 20;
                if (this.field820 == 0 && this.field829.field1262[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field831 = true;
                for (int var2 = 0; var2 < 100 && this.field831; var2++) {
                    this.field831 = false;
                    this.method285(-169);
                    this.method286(this.field815);
                    if (this.field832 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method287((byte) 8);
                    if (this.field844 != null) {
                        this.method288(-112);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field837.method248(); var4 != null; var4 = (OnDemandRequest) this.field837.method250(true)) {
                    if (var4.field739) {
                        var3 = true;
                        var4.field738++;
                        if (var4.field738 > 50) {
                            var4.field738 = 0;
                            this.method290((byte) 114, var4);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field837.method248(); var5 != null; var5 = (OnDemandRequest) this.field837.method250(true)) {
                        var3 = true;
                        var5.field738++;
                        if (var5.field738 > 50) {
                            var5.field738 = 0;
                            this.method290((byte) 114, var5);
                        }
                    }
                }
                if (var3) {
                    this.field852++;
                    if (this.field852 > 750) {
                        try {
                            this.field843.close();
                        } catch (Exception var8) {
                        }
                        this.field843 = null;
                        this.field844 = null;
                        this.field845 = null;
                        this.field849 = 0;
                    }
                } else {
                    this.field852 = 0;
                    this.field840 = "";
                }
                if (this.field829.field1450 && this.field843 != null && this.field845 != null && (this.field820 > 0 || this.field829.field1262[0] == null)) {
                    this.field853++;
                    if (this.field853 > 500) {
                        this.field853 = 0;
                        this.field850[0] = 0;
                        this.field850[1] = 0;
                        this.field850[2] = 0;
                        this.field850[3] = 10;
                        try {
                            this.field845.write(this.field850, 0, 4);
                        } catch (IOException var7) {
                            this.field852 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "ub", name = "d", descriptor = "(I)V")
    private final void method285(int arg0) {
        LinkList var2 = this.field835;
        OnDemandRequest var3;
        synchronized (this.field835) {
            var3 = (OnDemandRequest) this.field835.method247();
        }
        while (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (var3 != null) {
            this.field831 = true;
            byte[] var5 = null;
            if (this.field829.field1262[0] != null) {
                var5 = this.field829.field1262[var3.field735 + 1].method291(var3.field736, false);
            }
            if (!this.method289(this.field818[var3.field735][var3.field736], this.field817[var3.field735][var3.field736], false, var5)) {
                var5 = null;
            }
            LinkList var6 = this.field835;
            synchronized (this.field835) {
                if (var5 == null) {
                    this.field836.method245(var3);
                } else {
                    var3.field737 = var5;
                    LinkList var7 = this.field838;
                    synchronized (this.field838) {
                        this.field838.method245(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field835.method247();
            }
        }
    }

    @OriginalMember(owner = "ub", name = "e", descriptor = "(I)V")
    private final void method286(int arg0) {
        this.field832 = 0;
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field833 = 0;
        for (OnDemandRequest var3 = (OnDemandRequest) this.field837.method248(); var3 != null; var3 = (OnDemandRequest) this.field837.method250(true)) {
            if (var3.field739) {
                this.field832++;
            } else {
                this.field833++;
            }
        }
        while (this.field832 < 10) {
            OnDemandRequest var4 = (OnDemandRequest) this.field836.method247();
            if (var4 == null) {
                break;
            }
            if (this.field819[var4.field735][var4.field736] != 0) {
                this.field841++;
            }
            this.field819[var4.field735][var4.field736] = 0;
            this.field837.method245(var4);
            this.field832++;
            this.method290((byte) 114, var4);
            this.field831 = true;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(B)V")
    private final void method287(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (this.field832 == 0) {
            if (this.field833 >= 10 || this.field820 == 0) {
                return;
            }
            LinkList var4 = this.field839;
            OnDemandRequest var5;
            synchronized (this.field839) {
                var5 = (OnDemandRequest) this.field839.method247();
            }
            while (var5 != null) {
                if (this.field819[var5.field735][var5.field736] != 0) {
                    this.field819[var5.field735][var5.field736] = 0;
                    this.field837.method245(var5);
                    this.method290((byte) 114, var5);
                    this.field831 = true;
                    if (this.field841 < this.field842) {
                        this.field841++;
                    }
                    this.field840 = "Loading extra files - " + this.field841 * 100 / this.field842 + "%";
                    this.field833++;
                    if (this.field833 == 10) {
                        return;
                    }
                }
                LinkList var6 = this.field839;
                synchronized (this.field839) {
                    var5 = (OnDemandRequest) this.field839.method247();
                }
            }
            for (int var7 = 0; var7 < 4; var7++) {
                byte[] var8 = this.field819[var7];
                int var9 = var8.length;
                for (int var10 = 0; var10 < var9; var10++) {
                    if (var8[var10] == this.field820) {
                        var8[var10] = 0;
                        OnDemandRequest var11 = new OnDemandRequest();
                        var11.field735 = var7;
                        var11.field736 = var10;
                        var11.field739 = false;
                        this.field837.method245(var11);
                        this.method290((byte) 114, var11);
                        this.field831 = true;
                        if (this.field841 < this.field842) {
                            this.field841++;
                        }
                        this.field840 = "Loading extra files - " + this.field841 * 100 / this.field842 + "%";
                        this.field833++;
                        if (this.field833 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field820--;
        }
    }

    @OriginalMember(owner = "ub", name = "f", descriptor = "(I)V")
    private final void method288(int arg0) {
        while (arg0 >= 0) {
            this.field812 = !this.field812;
        }
        try {
            int var2 = this.field844.available();
            if (this.field849 == 0 && var2 >= 6) {
                this.field831 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field844.read(this.field850, var3, 6 - var3)) {
                }
                int var4 = this.field850[0] & 0xFF;
                int var5 = ((this.field850[1] & 0xFF) << 8) + (this.field850[2] & 0xFF);
                int var6 = ((this.field850[3] & 0xFF) << 8) + (this.field850[4] & 0xFF);
                int var7 = this.field850[5] & 0xFF;
                this.field847 = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.field837.method248(); var8 != null; var8 = (OnDemandRequest) this.field837.method250(true)) {
                    if (var8.field735 == var4 && var8.field736 == var5) {
                        this.field847 = var8;
                    }
                    if (this.field847 != null) {
                        var8.field738 = 0;
                    }
                }
                if (this.field847 != null) {
                    this.field852 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field847.field737 = null;
                        if (this.field847.field739) {
                            LinkList var9 = this.field838;
                            synchronized (this.field838) {
                                this.field838.method245(this.field847);
                            }
                        } else {
                            this.field847.method106();
                        }
                        this.field847 = null;
                    } else {
                        if (this.field847.field737 == null && var7 == 0) {
                            this.field847.field737 = new byte[var6];
                        }
                        if (this.field847.field737 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field848 = var7 * 500;
                this.field849 = 500;
                if (this.field849 > var6 - var7 * 500) {
                    this.field849 = var6 - var7 * 500;
                }
            }
            if (this.field849 > 0 && var2 >= this.field849) {
                this.field831 = true;
                byte[] var10 = this.field850;
                int var11 = 0;
                if (this.field847 != null) {
                    var10 = this.field847.field737;
                    var11 = this.field848;
                }
                for (int var12 = 0; var12 < this.field849; var12 += this.field844.read(var10, var11 + var12, this.field849 - var12)) {
                }
                if (this.field849 + this.field848 >= var10.length && this.field847 != null) {
                    if (this.field829.field1262[0] != null) {
                        this.field829.field1262[this.field847.field735 + 1].method292(this.field847.field736, (byte) 9, var10.length, var10);
                    }
                    if (!this.field847.field739 && this.field847.field735 == 3) {
                        this.field847.field739 = true;
                        this.field847.field735 = 93;
                    }
                    if (this.field847.field739) {
                        LinkList var13 = this.field838;
                        synchronized (this.field838) {
                            this.field838.method245(this.field847);
                        }
                    } else {
                        this.field847.method106();
                    }
                }
                this.field849 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field843.close();
            } catch (Exception var15) {
            }
            this.field843 = null;
            this.field844 = null;
            this.field845 = null;
            this.field849 = 0;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIZ[B)Z")
    private final boolean method289(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        if (arg2) {
            this.field814 = 292;
        }
        this.field830.reset();
        this.field830.update(arg3, 0, var5);
        int var7 = (int) this.field830.getValue();
        if (arg1 == var6) {
            return arg0 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BLmb;)V")
    private final void method290(byte arg0, OnDemandRequest arg1) {
        if (arg0 != 114) {
            return;
        }
        try {
            if (this.field843 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field854 < 4000L) {
                    return;
                }
                this.field854 = var3;
                this.field843 = this.field829.method500(client.field1498 + 43594);
                this.field844 = this.field843.getInputStream();
                this.field845 = this.field843.getOutputStream();
                this.field845.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field844.read();
                }
                this.field852 = 0;
            }
            this.field850[0] = (byte) arg1.field735;
            this.field850[1] = (byte) (arg1.field736 >> 8);
            this.field850[2] = (byte) arg1.field736;
            if (arg1.field739) {
                this.field850[3] = 2;
            } else if (this.field829.field1450) {
                this.field850[3] = 0;
            } else {
                this.field850[3] = 1;
            }
            this.field845.write(this.field850, 0, 4);
            this.field853 = 0;
            this.field846 = -10000;
        } catch (IOException var8) {
            try {
                this.field843.close();
            } catch (Exception var7) {
            }
            this.field843 = null;
            this.field844 = null;
            this.field845 = null;
            this.field849 = 0;
            this.field846++;
        }
    }
}
