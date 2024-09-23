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

    @OriginalMember(owner = "ub", name = "d", descriptor = "Z")
    private boolean field813 = true;

    @OriginalMember(owner = "ub", name = "e", descriptor = "Z")
    private boolean field814 = true;

    @OriginalMember(owner = "ub", name = "f", descriptor = "Z")
    private boolean field815 = true;

    @OriginalMember(owner = "ub", name = "g", descriptor = "[[I")
    private int[][] field816 = new int[4][];

    @OriginalMember(owner = "ub", name = "h", descriptor = "[[I")
    private int[][] field817 = new int[4][];

    @OriginalMember(owner = "ub", name = "i", descriptor = "[[B")
    private byte[][] field818 = new byte[4][];

    @OriginalMember(owner = "ub", name = "r", descriptor = "Z")
    private boolean field827 = true;

    @OriginalMember(owner = "ub", name = "t", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field829 = new CRC32();

    @OriginalMember(owner = "ub", name = "u", descriptor = "Z")
    private boolean field830 = false;

    @OriginalMember(owner = "ub", name = "x", descriptor = "Lpb;")
    private DoublyLinkList field833 = new DoublyLinkList(49694);

    @OriginalMember(owner = "ub", name = "y", descriptor = "Lob;")
    private LinkList field834 = new LinkList(field811);

    @OriginalMember(owner = "ub", name = "z", descriptor = "Lob;")
    private LinkList field835 = new LinkList(field811);

    @OriginalMember(owner = "ub", name = "A", descriptor = "Lob;")
    private LinkList field836 = new LinkList(field811);

    @OriginalMember(owner = "ub", name = "B", descriptor = "Lob;")
    private LinkList field837 = new LinkList(field811);

    @OriginalMember(owner = "ub", name = "C", descriptor = "Lob;")
    private LinkList field838 = new LinkList(field811);

    @OriginalMember(owner = "ub", name = "D", descriptor = "Ljava/lang/String;")
    public String field839 = "";

    @OriginalMember(owner = "ub", name = "N", descriptor = "[B")
    private byte[] field849 = new byte[500];

    @OriginalMember(owner = "ub", name = "O", descriptor = "[B")
    private byte[] field850 = new byte[65000];

    @OriginalMember(owner = "ub", name = "b", descriptor = "I")
    private static int field811 = 888;

    @OriginalMember(owner = "ub", name = "c", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "ub", name = "j", descriptor = "I")
    private int field819;

    @OriginalMember(owner = "ub", name = "v", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "ub", name = "w", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "ub", name = "E", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "ub", name = "F", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "ub", name = "J", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "ub", name = "L", descriptor = "I")
    private int field847;

    @OriginalMember(owner = "ub", name = "M", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "ub", name = "P", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "ub", name = "Q", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "ub", name = "S", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "ub", name = "R", descriptor = "J")
    private long field853;

    @OriginalMember(owner = "ub", name = "K", descriptor = "Lmb;")
    private OnDemandRequest field846;

    @OriginalMember(owner = "ub", name = "s", descriptor = "Lclient;")
    private client field828;

    @OriginalMember(owner = "ub", name = "H", descriptor = "Ljava/io/InputStream;")
    private InputStream field843;

    @OriginalMember(owner = "ub", name = "I", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field844;

    @OriginalMember(owner = "ub", name = "G", descriptor = "Ljava/net/Socket;")
    private Socket field842;

    @OriginalMember(owner = "ub", name = "k", descriptor = "[B")
    private byte[] field820;

    @OriginalMember(owner = "ub", name = "l", descriptor = "[I")
    private int[] field821;

    @OriginalMember(owner = "ub", name = "m", descriptor = "[I")
    private int[] field822;

    @OriginalMember(owner = "ub", name = "n", descriptor = "[I")
    private int[] field823;

    @OriginalMember(owner = "ub", name = "o", descriptor = "[I")
    private int[] field824;

    @OriginalMember(owner = "ub", name = "p", descriptor = "[I")
    private int[] field825;

    @OriginalMember(owner = "ub", name = "q", descriptor = "[I")
    private int[] field826;

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lxb;Lclient;)V")
    public final void method270(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method299(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(false, var26);
            this.field816[var4] = new int[var27];
            this.field818[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field816[var4][var29] = var28.method231();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method299(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(false, var22);
            this.field817[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field817[var6][var25] = var24.method234();
            }
        }
        byte[] var7 = arg0.method299("model_index", null);
        int var8 = this.field816[0].length;
        this.field820 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field820[var9] = var7[var9];
            } else {
                this.field820[var9] = 0;
            }
        }
        byte[] var10 = arg0.method299("map_index", null);
        Packet var11 = new Packet(false, var10);
        int var12 = var10.length / 7;
        this.field821 = new int[var12];
        this.field822 = new int[var12];
        this.field823 = new int[var12];
        this.field824 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field821[var13] = var11.method231();
            this.field822[var13] = var11.method231();
            this.field823[var13] = var11.method231();
            this.field824[var13] = var11.method229();
        }
        byte[] var14 = arg0.method299("anim_index", null);
        Packet var15 = new Packet(false, var14);
        int var16 = var14.length / 2;
        this.field825 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field825[var17] = var15.method231();
        }
        byte[] var18 = arg0.method299("midi_index", null);
        Packet var19 = new Packet(false, var18);
        int var20 = var18.length;
        this.field826 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field826[var21] = var19.method229();
        }
        this.field828 = arg1;
        this.field827 = true;
        this.field828.method12(this, 2);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "()V")
    public final void method271() {
        this.field827 = false;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(II)I")
    public final int method272(int arg0, int arg1) {
        int var3 = 2 / arg1;
        return this.field816[arg0].length;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Z)I")
    public final int method273(boolean arg0) {
        return arg0 ? this.field825.length : this.field812;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIII)I")
    public final int method274(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 41 / arg3;
        int var6 = (arg1 << 8) + arg2;
        for (int var7 = 0; var7 < this.field821.length; var7++) {
            if (this.field821[var7] == var6) {
                if (arg0 == 0) {
                    return this.field822[var7];
                }
                return this.field823[var7];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(ZI)V")
    public final void method275(boolean arg0, int arg1) {
        int var3 = this.field821.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field824[var4] != 0) {
                this.method282((byte) 2, this.field823[var4], 0, 3);
                this.method282((byte) 2, this.field822[var4], 0, 3);
            }
        }
        if (arg1 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(II)Z")
    public final boolean method276(int arg0, int arg1) {
        if (arg0 != 47587) {
            this.field812 = 110;
        }
        for (int var3 = 0; var3 < this.field821.length; var3++) {
            if (this.field823[var3] == arg1) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(II)I")
    public final int method277(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field813 = !this.field813;
        }
        return this.field820[arg0] & 0xFF;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IZ)Z")
    public final boolean method278(int arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        return this.field826[arg0] == 1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(I)V")
    public final void method269(int arg0) {
        this.method279(0, arg0);
    }

    @OriginalMember(owner = "ub", name = "d", descriptor = "(II)V")
    public final void method279(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field816.length || arg1 < 0 || arg1 > this.field816[arg0].length || this.field816[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field833;
        synchronized (this.field833) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field833.method255(); var4 != null; var4 = (OnDemandRequest) this.field833.method256(7)) {
                if (var4.field729 == arg0 && var4.field730 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field729 = arg0;
            var5.field730 = arg1;
            var5.field733 = true;
            LinkList var6 = this.field834;
            synchronized (this.field834) {
                this.field834.method245(var5);
            }
            this.field833.method253(var5);
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "()I")
    public final int method280() {
        DoublyLinkList var1 = this.field833;
        synchronized (this.field833) {
            return this.field833.method257();
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "()Lmb;")
    public final OnDemandRequest method281() {
        LinkList var1 = this.field837;
        OnDemandRequest var2;
        synchronized (this.field837) {
            var2 = (OnDemandRequest) this.field837.method247();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field833;
        synchronized (this.field833) {
            var2.method107();
        }
        if (var2.field731 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field731));
            while (true) {
                if (this.field850.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field850, var4, this.field850.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field731 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field731[var7] = this.field850[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BIII)V")
    public final void method282(byte arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field813 = !this.field813;
        }
        if (this.field828.field1573[0] == null || this.field816[arg3][arg1] == 0) {
            return;
        }
        byte[] var5 = this.field828.field1573[arg3 + 1].method291(arg1, false);
        if (this.method289(true, var5, this.field817[arg3][arg1], this.field816[arg3][arg1])) {
            return;
        }
        this.field818[arg3][arg1] = arg0;
        if (arg0 > this.field819) {
            this.field819 = arg0;
        }
        this.field841++;
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(Z)V")
    public final void method283(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        LinkList var3 = this.field838;
        synchronized (this.field838) {
            this.field838.method252();
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(III)V")
    public final void method284(int arg0, int arg1, int arg2) {
        if (this.field828.field1573[0] == null || (this.field816[arg2][arg1] == 0 || (this.field818[arg2][arg1] == 0 || this.field819 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field729 = arg2;
        var4.field730 = arg1;
        if (arg0 != 0) {
            this.field812 = -103;
        }
        var4.field733 = false;
        LinkList var5 = this.field838;
        synchronized (this.field838) {
            this.field838.method245(var4);
        }
    }

    @OriginalMember(owner = "ub", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field827) {
                this.field854++;
                byte var1 = 20;
                if (this.field819 == 0 && this.field828.field1573[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field830 = true;
                for (int var2 = 0; var2 < 100 && this.field830; var2++) {
                    this.field830 = false;
                    this.method285((byte) -45);
                    this.method286(-34026);
                    if (this.field831 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method287(0);
                    if (this.field843 != null) {
                        this.method288((byte) 1);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field836.method248(); var4 != null; var4 = (OnDemandRequest) this.field836.method250(7)) {
                    if (var4.field733) {
                        var3 = true;
                        var4.field732++;
                        if (var4.field732 > 50) {
                            var4.field732 = 0;
                            this.method290((byte) 107, var4);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field836.method248(); var5 != null; var5 = (OnDemandRequest) this.field836.method250(7)) {
                        var3 = true;
                        var5.field732++;
                        if (var5.field732 > 50) {
                            var5.field732 = 0;
                            this.method290((byte) 107, var5);
                        }
                    }
                }
                if (var3) {
                    this.field851++;
                    if (this.field851 > 750) {
                        try {
                            this.field842.close();
                        } catch (Exception var8) {
                        }
                        this.field842 = null;
                        this.field843 = null;
                        this.field844 = null;
                        this.field848 = 0;
                    }
                } else {
                    this.field851 = 0;
                    this.field839 = "";
                }
                if (this.field828.field1645 && this.field842 != null && this.field844 != null && (this.field819 > 0 || this.field828.field1573[0] == null)) {
                    this.field852++;
                    if (this.field852 > 500) {
                        this.field852 = 0;
                        this.field849[0] = 0;
                        this.field849[1] = 0;
                        this.field849[2] = 0;
                        this.field849[3] = 10;
                        try {
                            this.field844.write(this.field849, 0, 4);
                        } catch (IOException var7) {
                            this.field851 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(B)V")
    private final void method285(byte arg0) {
        LinkList var2 = this.field834;
        OnDemandRequest var3;
        synchronized (this.field834) {
            var3 = (OnDemandRequest) this.field834.method247();
        }
        if (arg0 != -45) {
            return;
        }
        while (var3 != null) {
            this.field830 = true;
            byte[] var4 = null;
            if (this.field828.field1573[0] != null) {
                var4 = this.field828.field1573[var3.field729 + 1].method291(var3.field730, false);
            }
            if (!this.method289(true, var4, this.field817[var3.field729][var3.field730], this.field816[var3.field729][var3.field730])) {
                var4 = null;
            }
            LinkList var5 = this.field834;
            synchronized (this.field834) {
                if (var4 == null) {
                    this.field835.method245(var3);
                } else {
                    var3.field731 = var4;
                    LinkList var6 = this.field837;
                    synchronized (this.field837) {
                        this.field837.method245(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field834.method247();
            }
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(I)V")
    private final void method286(int arg0) {
        this.field831 = 0;
        this.field832 = 0;
        if (arg0 != -34026) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (OnDemandRequest var3 = (OnDemandRequest) this.field836.method248(); var3 != null; var3 = (OnDemandRequest) this.field836.method250(7)) {
            if (var3.field733) {
                this.field831++;
            } else {
                this.field832++;
            }
        }
        while (this.field831 < 10) {
            OnDemandRequest var4 = (OnDemandRequest) this.field835.method247();
            if (var4 == null) {
                break;
            }
            if (this.field818[var4.field729][var4.field730] != 0) {
                this.field840++;
            }
            this.field818[var4.field729][var4.field730] = 0;
            this.field836.method245(var4);
            this.field831++;
            this.method290((byte) 107, var4);
            this.field830 = true;
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(I)V")
    private final void method287(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.field831 == 0) {
            if (this.field832 >= 10 || this.field819 == 0) {
                return;
            }
            LinkList var3 = this.field838;
            OnDemandRequest var4;
            synchronized (this.field838) {
                var4 = (OnDemandRequest) this.field838.method247();
            }
            while (var4 != null) {
                if (this.field818[var4.field729][var4.field730] != 0) {
                    this.field818[var4.field729][var4.field730] = 0;
                    this.field836.method245(var4);
                    this.method290((byte) 107, var4);
                    this.field830 = true;
                    if (this.field840 < this.field841) {
                        this.field840++;
                    }
                    this.field839 = "Loading extra files - " + this.field840 * 100 / this.field841 + "%";
                    this.field832++;
                    if (this.field832 == 10) {
                        return;
                    }
                }
                LinkList var5 = this.field838;
                synchronized (this.field838) {
                    var4 = (OnDemandRequest) this.field838.method247();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field818[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field819) {
                        var7[var9] = 0;
                        OnDemandRequest var10 = new OnDemandRequest();
                        var10.field729 = var6;
                        var10.field730 = var9;
                        var10.field733 = false;
                        this.field836.method245(var10);
                        this.method290((byte) 107, var10);
                        this.field830 = true;
                        if (this.field840 < this.field841) {
                            this.field840++;
                        }
                        this.field839 = "Loading extra files - " + this.field840 * 100 / this.field841 + "%";
                        this.field832++;
                        if (this.field832 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field819--;
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(B)V")
    private final void method288(byte arg0) {
        if (arg0 != 1) {
            return;
        }
        boolean var2 = false;
        try {
            int var3 = this.field843.available();
            if (this.field848 == 0 && var3 >= 6) {
                this.field830 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field843.read(this.field849, var4, 6 - var4)) {
                }
                int var5 = this.field849[0] & 0xFF;
                int var6 = ((this.field849[1] & 0xFF) << 8) + (this.field849[2] & 0xFF);
                int var7 = ((this.field849[3] & 0xFF) << 8) + (this.field849[4] & 0xFF);
                int var8 = this.field849[5] & 0xFF;
                this.field846 = null;
                for (OnDemandRequest var9 = (OnDemandRequest) this.field836.method248(); var9 != null; var9 = (OnDemandRequest) this.field836.method250(7)) {
                    if (var9.field729 == var5 && var9.field730 == var6) {
                        this.field846 = var9;
                    }
                    if (this.field846 != null) {
                        var9.field732 = 0;
                    }
                }
                if (this.field846 != null) {
                    this.field851 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field846.field731 = null;
                        if (this.field846.field733) {
                            LinkList var10 = this.field837;
                            synchronized (this.field837) {
                                this.field837.method245(this.field846);
                            }
                        } else {
                            this.field846.method106();
                        }
                        this.field846 = null;
                    } else {
                        if (this.field846.field731 == null && var8 == 0) {
                            this.field846.field731 = new byte[var7];
                        }
                        if (this.field846.field731 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field847 = var8 * 500;
                this.field848 = 500;
                if (this.field848 > var7 - var8 * 500) {
                    this.field848 = var7 - var8 * 500;
                }
            }
            if (this.field848 > 0 && var3 >= this.field848) {
                this.field830 = true;
                byte[] var11 = this.field849;
                int var12 = 0;
                if (this.field846 != null) {
                    var11 = this.field846.field731;
                    var12 = this.field847;
                }
                for (int var13 = 0; var13 < this.field848; var13 += this.field843.read(var11, var12 + var13, this.field848 - var13)) {
                }
                if (this.field848 + this.field847 >= var11.length && this.field846 != null) {
                    if (this.field828.field1573[0] != null) {
                        this.field828.field1573[this.field846.field729 + 1].method292(true, var11.length, var11, this.field846.field730);
                    }
                    if (!this.field846.field733 && this.field846.field729 == 3) {
                        this.field846.field733 = true;
                        this.field846.field729 = 93;
                    }
                    if (this.field846.field733) {
                        LinkList var14 = this.field837;
                        synchronized (this.field837) {
                            this.field837.method245(this.field846);
                        }
                    } else {
                        this.field846.method106();
                    }
                }
                this.field848 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field842.close();
            } catch (Exception var16) {
            }
            this.field842 = null;
            this.field843 = null;
            this.field844 = null;
            this.field848 = 0;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Z[BII)Z")
    private final boolean method289(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field829.reset();
        if (!arg0) {
            throw new NullPointerException();
        }
        this.field829.update(arg1, 0, var5);
        int var7 = (int) this.field829.getValue();
        if (arg3 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BLmb;)V")
    private final void method290(byte arg0, OnDemandRequest arg1) {
        if (arg0 != 107) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            if (this.field842 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field853 < 4000L) {
                    return;
                }
                this.field853 = var4;
                this.field842 = this.field828.method560(client.field1342 + 43594);
                this.field843 = this.field842.getInputStream();
                this.field844 = this.field842.getOutputStream();
                this.field844.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field843.read();
                }
                this.field851 = 0;
            }
            this.field849[0] = (byte) arg1.field729;
            this.field849[1] = (byte) (arg1.field730 >> 8);
            this.field849[2] = (byte) arg1.field730;
            if (arg1.field733) {
                this.field849[3] = 2;
            } else if (this.field828.field1645) {
                this.field849[3] = 0;
            } else {
                this.field849[3] = 1;
            }
            this.field844.write(this.field849, 0, 4);
            this.field852 = 0;
            this.field845 = -10000;
        } catch (IOException var9) {
            try {
                this.field842.close();
            } catch (Exception var8) {
            }
            this.field842 = null;
            this.field843 = null;
            this.field844 = null;
            this.field848 = 0;
            this.field845++;
        }
    }
}
