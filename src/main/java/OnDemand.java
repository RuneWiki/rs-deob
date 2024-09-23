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

    @OriginalMember(owner = "vb", name = "a", descriptor = "Z")
    private boolean field807 = false;

    @OriginalMember(owner = "vb", name = "c", descriptor = "Z")
    private boolean field809 = true;

    @OriginalMember(owner = "vb", name = "d", descriptor = "I")
    private int field810 = -66;

    @OriginalMember(owner = "vb", name = "e", descriptor = "I")
    private int field811 = -971;

    @OriginalMember(owner = "vb", name = "f", descriptor = "I")
    private int field812 = -49612;

    @OriginalMember(owner = "vb", name = "h", descriptor = "[[I")
    private int[][] field814 = new int[4][];

    @OriginalMember(owner = "vb", name = "i", descriptor = "[[I")
    private int[][] field815 = new int[4][];

    @OriginalMember(owner = "vb", name = "j", descriptor = "[[B")
    private byte[][] field816 = new byte[4][];

    @OriginalMember(owner = "vb", name = "s", descriptor = "Z")
    private boolean field825 = true;

    @OriginalMember(owner = "vb", name = "u", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field827 = new CRC32();

    @OriginalMember(owner = "vb", name = "v", descriptor = "Z")
    private boolean field828 = false;

    @OriginalMember(owner = "vb", name = "y", descriptor = "Lqb;")
    private DoublyLinkList field831 = new DoublyLinkList(field808);

    @OriginalMember(owner = "vb", name = "z", descriptor = "Lpb;")
    private LinkList field832 = new LinkList(false);

    @OriginalMember(owner = "vb", name = "A", descriptor = "Lpb;")
    private LinkList field833 = new LinkList(false);

    @OriginalMember(owner = "vb", name = "B", descriptor = "Lpb;")
    private LinkList field834 = new LinkList(false);

    @OriginalMember(owner = "vb", name = "C", descriptor = "Lpb;")
    private LinkList field835 = new LinkList(false);

    @OriginalMember(owner = "vb", name = "D", descriptor = "Lpb;")
    private LinkList field836 = new LinkList(false);

    @OriginalMember(owner = "vb", name = "E", descriptor = "Ljava/lang/String;")
    public String field837 = "";

    @OriginalMember(owner = "vb", name = "N", descriptor = "[B")
    private byte[] field846 = new byte[500];

    @OriginalMember(owner = "vb", name = "O", descriptor = "[B")
    private byte[] field847 = new byte[65000];

    @OriginalMember(owner = "vb", name = "b", descriptor = "I")
    private static int field808 = 855;

    @OriginalMember(owner = "vb", name = "g", descriptor = "I")
    private int field813;

    @OriginalMember(owner = "vb", name = "k", descriptor = "I")
    private int field817;

    @OriginalMember(owner = "vb", name = "w", descriptor = "I")
    private int field829;

    @OriginalMember(owner = "vb", name = "x", descriptor = "I")
    private int field830;

    @OriginalMember(owner = "vb", name = "F", descriptor = "I")
    private int field838;

    @OriginalMember(owner = "vb", name = "G", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "vb", name = "L", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "vb", name = "M", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "vb", name = "P", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "vb", name = "Q", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "vb", name = "S", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "vb", name = "R", descriptor = "J")
    private long field850;

    @OriginalMember(owner = "vb", name = "K", descriptor = "Lnb;")
    private OnDemandRequest field843;

    @OriginalMember(owner = "vb", name = "t", descriptor = "Lclient;")
    private client field826;

    @OriginalMember(owner = "vb", name = "I", descriptor = "Ljava/io/InputStream;")
    private InputStream field841;

    @OriginalMember(owner = "vb", name = "J", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field842;

    @OriginalMember(owner = "vb", name = "H", descriptor = "Ljava/net/Socket;")
    private Socket field840;

    @OriginalMember(owner = "vb", name = "l", descriptor = "[B")
    private byte[] field818;

    @OriginalMember(owner = "vb", name = "m", descriptor = "[I")
    private int[] field819;

    @OriginalMember(owner = "vb", name = "n", descriptor = "[I")
    private int[] field820;

    @OriginalMember(owner = "vb", name = "o", descriptor = "[I")
    private int[] field821;

    @OriginalMember(owner = "vb", name = "p", descriptor = "[I")
    private int[] field822;

    @OriginalMember(owner = "vb", name = "q", descriptor = "[I")
    private int[] field823;

    @OriginalMember(owner = "vb", name = "r", descriptor = "[I")
    private int[] field824;

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lyb;Lclient;)V")
    public final void method279(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method308(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(var26, false);
            this.field814[var4] = new int[var27];
            this.field816[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field814[var4][var29] = var28.method240();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method308(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(var22, false);
            this.field815[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field815[var6][var25] = var24.method243();
            }
        }
        byte[] var7 = arg0.method308("model_index", null);
        int var8 = this.field814[0].length;
        this.field818 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field818[var9] = var7[var9];
            } else {
                this.field818[var9] = 0;
            }
        }
        byte[] var10 = arg0.method308("map_index", null);
        Packet var11 = new Packet(var10, false);
        int var12 = var10.length / 7;
        this.field819 = new int[var12];
        this.field820 = new int[var12];
        this.field821 = new int[var12];
        this.field822 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field819[var13] = var11.method240();
            this.field820[var13] = var11.method240();
            this.field821[var13] = var11.method240();
            this.field822[var13] = var11.method238();
        }
        byte[] var14 = arg0.method308("anim_index", null);
        Packet var15 = new Packet(var14, false);
        int var16 = var14.length / 2;
        this.field823 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field823[var17] = var15.method240();
        }
        byte[] var18 = arg0.method308("midi_index", null);
        Packet var19 = new Packet(var18, false);
        int var20 = var18.length;
        this.field824 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field824[var21] = var19.method238();
        }
        this.field826 = arg1;
        this.field825 = true;
        this.field826.method12(this, 2);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "()V")
    public final void method280() {
        this.field825 = false;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)I")
    public final int method281(int arg0, int arg1) {
        return arg1 >= 0 ? this.field810 : this.field814[arg0].length;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(I)I")
    public final int method282(int arg0) {
        return arg0 < 0 ? this.field823.length : field808;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IIII)I")
    public final int method283(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg1 << 8) + arg2;
        if (arg3 < 7 || arg3 > 7) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < this.field819.length; var7++) {
            if (this.field819[var7] == var5) {
                if (arg0 == 0) {
                    return this.field820[var7];
                }
                return this.field821[var7];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IZ)V")
    public final void method284(int arg0, boolean arg1) {
        int var3 = this.field819.length;
        if (arg0 >= 0) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field822[var4] != 0) {
                this.method291(this.field821[var4], 3, (byte) 2, 0);
                this.method291(this.field820[var4], 3, (byte) 2, 0);
            }
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(II)Z")
    public final boolean method285(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field819.length; var3++) {
            if (this.field821[var3] == arg1) {
                return true;
            }
        }
        while (arg0 >= 0) {
            this.field809 = !this.field809;
        }
        return false;
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(II)I")
    public final int method286(int arg0, int arg1) {
        return arg1 < 0 ? this.field818[arg0] & 0xFF : 2;
    }

    @OriginalMember(owner = "vb", name = "d", descriptor = "(II)Z")
    public final boolean method287(int arg0, int arg1) {
        if (this.field812 != arg0) {
            this.field809 = !this.field809;
        }
        return this.field824[arg1] == 1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(I)V")
    public final void method278(int arg0) {
        this.method288(0, arg0);
    }

    @OriginalMember(owner = "vb", name = "e", descriptor = "(II)V")
    public final void method288(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field814.length || arg1 < 0 || arg1 > this.field814[arg0].length || this.field814[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field831;
        synchronized (this.field831) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field831.method264(); var4 != null; var4 = (OnDemandRequest) this.field831.method265(-327)) {
                if (var4.field725 == arg0 && var4.field726 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field725 = arg0;
            var5.field726 = arg1;
            var5.field729 = true;
            LinkList var6 = this.field832;
            synchronized (this.field832) {
                this.field832.method254(var5);
            }
            this.field831.method262(var5);
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "()I")
    public final int method289() {
        DoublyLinkList var1 = this.field831;
        synchronized (this.field831) {
            return this.field831.method266();
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "()Lnb;")
    public final OnDemandRequest method290() {
        LinkList var1 = this.field835;
        OnDemandRequest var2;
        synchronized (this.field835) {
            var2 = (OnDemandRequest) this.field835.method256();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field831;
        synchronized (this.field831) {
            var2.method120();
        }
        if (var2.field727 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field727));
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
        var2.field727 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field727[var7] = this.field847[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IIBI)V")
    public final void method291(int arg0, int arg1, byte arg2, int arg3) {
        if (this.field826.field1306[0] == null || this.field814[arg1][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field826.field1306[arg1 + 1].method300(true, arg0);
        if (this.method298(var5, 0, this.field815[arg1][arg0], this.field814[arg1][arg0])) {
            return;
        }
        this.field816[arg1][arg0] = arg2;
        if (arg3 != 0) {
            this.field809 = !this.field809;
        }
        if (arg2 > this.field817) {
            this.field817 = arg2;
        }
        this.field839++;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Z)V")
    public final void method292(boolean arg0) {
        if (arg0) {
            LinkList var2 = this.field836;
            synchronized (this.field836) {
                this.field836.method261();
            }
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(III)V")
    public final void method293(int arg0, int arg1, int arg2) {
        if (this.field826.field1306[0] == null || (this.field814[arg2][arg1] == 0 || (this.field816[arg2][arg1] == 0 || this.field817 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field725 = arg2;
        var4.field726 = arg1;
        if (arg0 != -26459) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        var4.field729 = false;
        LinkList var6 = this.field836;
        synchronized (this.field836) {
            this.field836.method254(var4);
        }
    }

    @OriginalMember(owner = "vb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field825) {
                this.field851++;
                byte var1 = 20;
                if (this.field817 == 0 && this.field826.field1306[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field828 = true;
                for (int var2 = 0; var2 < 100 && this.field828; var2++) {
                    this.field828 = false;
                    this.method294(true);
                    this.method295(35142);
                    if (this.field829 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method296(false);
                    if (this.field841 != null) {
                        this.method297(this.field813);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field834.method257(); var4 != null; var4 = (OnDemandRequest) this.field834.method259(-327)) {
                    if (var4.field729) {
                        var3 = true;
                        var4.field728++;
                        if (var4.field728 > 50) {
                            var4.field728 = 0;
                            this.method299(var4, (byte) 0);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field834.method257(); var5 != null; var5 = (OnDemandRequest) this.field834.method259(-327)) {
                        var3 = true;
                        var5.field728++;
                        if (var5.field728 > 50) {
                            var5.field728 = 0;
                            this.method299(var5, (byte) 0);
                        }
                    }
                }
                if (var3) {
                    this.field848++;
                    if (this.field848 > 750) {
                        try {
                            this.field840.close();
                        } catch (Exception var8) {
                        }
                        this.field840 = null;
                        this.field841 = null;
                        this.field842 = null;
                        this.field845 = 0;
                    }
                } else {
                    this.field848 = 0;
                    this.field837 = "";
                }
                if (this.field826.field1371 && this.field840 != null && this.field842 != null && (this.field817 > 0 || this.field826.field1306[0] == null)) {
                    this.field849++;
                    if (this.field849 > 500) {
                        this.field849 = 0;
                        this.field846[0] = 0;
                        this.field846[1] = 0;
                        this.field846[2] = 0;
                        this.field846[3] = 10;
                        try {
                            this.field842.write(this.field846, 0, 4);
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

    @OriginalMember(owner = "vb", name = "b", descriptor = "(Z)V")
    private final void method294(boolean arg0) {
        if (!arg0) {
            this.field813 = 217;
        }
        LinkList var2 = this.field832;
        OnDemandRequest var3;
        synchronized (this.field832) {
            var3 = (OnDemandRequest) this.field832.method256();
        }
        while (var3 != null) {
            this.field828 = true;
            byte[] var4 = null;
            if (this.field826.field1306[0] != null) {
                var4 = this.field826.field1306[var3.field725 + 1].method300(true, var3.field726);
            }
            if (!this.method298(var4, 0, this.field815[var3.field725][var3.field726], this.field814[var3.field725][var3.field726])) {
                var4 = null;
            }
            LinkList var5 = this.field832;
            synchronized (this.field832) {
                if (var4 == null) {
                    this.field833.method254(var3);
                } else {
                    var3.field727 = var4;
                    LinkList var6 = this.field835;
                    synchronized (this.field835) {
                        this.field835.method254(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field832.method256();
            }
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(I)V")
    private final void method295(int arg0) {
        this.field829 = 0;
        if (arg0 != 35142) {
            this.field812 = -287;
        }
        this.field830 = 0;
        for (OnDemandRequest var2 = (OnDemandRequest) this.field834.method257(); var2 != null; var2 = (OnDemandRequest) this.field834.method259(-327)) {
            if (var2.field729) {
                this.field829++;
            } else {
                this.field830++;
            }
        }
        while (this.field829 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field833.method256();
            if (var3 == null) {
                break;
            }
            if (this.field816[var3.field725][var3.field726] != 0) {
                this.field838++;
            }
            this.field816[var3.field725][var3.field726] = 0;
            this.field834.method254(var3);
            this.field829++;
            this.method299(var3, (byte) 0);
            this.field828 = true;
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(Z)V")
    private final void method296(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.field829 == 0) {
            if (this.field830 >= 10 || this.field817 == 0) {
                return;
            }
            LinkList var3 = this.field836;
            OnDemandRequest var4;
            synchronized (this.field836) {
                var4 = (OnDemandRequest) this.field836.method256();
            }
            while (var4 != null) {
                if (this.field816[var4.field725][var4.field726] != 0) {
                    this.field816[var4.field725][var4.field726] = 0;
                    this.field834.method254(var4);
                    this.method299(var4, (byte) 0);
                    this.field828 = true;
                    if (this.field838 < this.field839) {
                        this.field838++;
                    }
                    this.field837 = "Loading extra files - " + this.field838 * 100 / this.field839 + "%";
                    this.field830++;
                    if (this.field830 == 10) {
                        return;
                    }
                }
                LinkList var5 = this.field836;
                synchronized (this.field836) {
                    var4 = (OnDemandRequest) this.field836.method256();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field816[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field817) {
                        var7[var9] = 0;
                        OnDemandRequest var10 = new OnDemandRequest();
                        var10.field725 = var6;
                        var10.field726 = var9;
                        var10.field729 = false;
                        this.field834.method254(var10);
                        this.method299(var10, (byte) 0);
                        this.field828 = true;
                        if (this.field838 < this.field839) {
                            this.field838++;
                        }
                        this.field837 = "Loading extra files - " + this.field838 * 100 / this.field839 + "%";
                        this.field830++;
                        if (this.field830 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field817--;
        }
    }

    @OriginalMember(owner = "vb", name = "d", descriptor = "(I)V")
    private final void method297(int arg0) {
        if (arg0 != 0) {
            this.field812 = 216;
        }
        try {
            int var2 = this.field841.available();
            if (this.field845 == 0 && var2 >= 6) {
                this.field828 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field841.read(this.field846, var3, 6 - var3)) {
                }
                int var4 = this.field846[0] & 0xFF;
                int var5 = ((this.field846[1] & 0xFF) << 8) + (this.field846[2] & 0xFF);
                int var6 = ((this.field846[3] & 0xFF) << 8) + (this.field846[4] & 0xFF);
                int var7 = this.field846[5] & 0xFF;
                this.field843 = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.field834.method257(); var8 != null; var8 = (OnDemandRequest) this.field834.method259(-327)) {
                    if (var8.field725 == var4 && var8.field726 == var5) {
                        this.field843 = var8;
                    }
                    if (this.field843 != null) {
                        var8.field728 = 0;
                    }
                }
                if (this.field843 != null) {
                    this.field848 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field843.field727 = null;
                        if (this.field843.field729) {
                            LinkList var9 = this.field835;
                            synchronized (this.field835) {
                                this.field835.method254(this.field843);
                            }
                        } else {
                            this.field843.method119();
                        }
                        this.field843 = null;
                    } else {
                        if (this.field843.field727 == null && var7 == 0) {
                            this.field843.field727 = new byte[var6];
                        }
                        if (this.field843.field727 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field844 = var7 * 500;
                this.field845 = 500;
                if (this.field845 > var6 - var7 * 500) {
                    this.field845 = var6 - var7 * 500;
                }
            }
            if (this.field845 > 0 && var2 >= this.field845) {
                this.field828 = true;
                byte[] var10 = this.field846;
                int var11 = 0;
                if (this.field843 != null) {
                    var10 = this.field843.field727;
                    var11 = this.field844;
                }
                for (int var12 = 0; var12 < this.field845; var12 += this.field841.read(var10, var11 + var12, this.field845 - var12)) {
                }
                if (this.field845 + this.field844 >= var10.length && this.field843 != null) {
                    if (this.field826.field1306[0] != null) {
                        this.field826.field1306[this.field843.field725 + 1].method301(var10, this.field843.field726, var10.length, (byte) -115);
                    }
                    if (!this.field843.field729 && this.field843.field725 == 3) {
                        this.field843.field729 = true;
                        this.field843.field725 = 93;
                    }
                    if (this.field843.field729) {
                        LinkList var13 = this.field835;
                        synchronized (this.field835) {
                            this.field835.method254(this.field843);
                        }
                    } else {
                        this.field843.method119();
                    }
                }
                this.field845 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field840.close();
            } catch (Exception var15) {
            }
            this.field840 = null;
            this.field841 = null;
            this.field842 = null;
            this.field845 = 0;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "([BIII)Z")
    private final boolean method298(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field827.reset();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field827.update(arg0, 0, var5);
        int var7 = (int) this.field827.getValue();
        if (arg3 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lnb;B)V")
    private final void method299(OnDemandRequest arg0, byte arg1) {
        if (arg1 != 0) {
            this.field807 = !this.field807;
        }
        try {
            if (this.field840 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field850 < 5000L) {
                    return;
                }
                this.field850 = var3;
                this.field840 = this.field826.method556(client.field1486 + 43594);
                this.field841 = this.field840.getInputStream();
                this.field842 = this.field840.getOutputStream();
                this.field842.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field841.read();
                }
                this.field848 = 0;
            }
            this.field846[0] = (byte) arg0.field725;
            this.field846[1] = (byte) (arg0.field726 >> 8);
            this.field846[2] = (byte) arg0.field726;
            if (arg0.field729) {
                this.field846[3] = 2;
            } else if (this.field826.field1371) {
                this.field846[3] = 0;
            } else {
                this.field846[3] = 1;
            }
            this.field842.write(this.field846, 0, 4);
            this.field849 = 0;
        } catch (IOException var8) {
            try {
                this.field840.close();
            } catch (Exception var7) {
            }
            this.field840 = null;
            this.field841 = null;
            this.field842 = null;
            this.field845 = 0;
        }
    }
}
