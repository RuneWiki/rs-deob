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
    private boolean field811 = false;

    @OriginalMember(owner = "vb", name = "c", descriptor = "I")
    private int field812 = 73;

    @OriginalMember(owner = "vb", name = "e", descriptor = "I")
    private int field814 = 2;

    @OriginalMember(owner = "vb", name = "f", descriptor = "[[I")
    private int[][] field815 = new int[4][];

    @OriginalMember(owner = "vb", name = "g", descriptor = "[[I")
    private int[][] field816 = new int[4][];

    @OriginalMember(owner = "vb", name = "h", descriptor = "[[B")
    private byte[][] field817 = new byte[4][];

    @OriginalMember(owner = "vb", name = "q", descriptor = "Z")
    private boolean field826 = true;

    @OriginalMember(owner = "vb", name = "s", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field828 = new CRC32();

    @OriginalMember(owner = "vb", name = "t", descriptor = "Z")
    private boolean field829 = false;

    @OriginalMember(owner = "vb", name = "w", descriptor = "Lqb;")
    private DoublyLinkList field832 = new DoublyLinkList(956);

    @OriginalMember(owner = "vb", name = "x", descriptor = "Lpb;")
    private LinkList field833 = new LinkList((byte) 9);

    @OriginalMember(owner = "vb", name = "y", descriptor = "Lpb;")
    private LinkList field834 = new LinkList((byte) 9);

    @OriginalMember(owner = "vb", name = "z", descriptor = "Lpb;")
    private LinkList field835 = new LinkList((byte) 9);

    @OriginalMember(owner = "vb", name = "A", descriptor = "Lpb;")
    private LinkList field836 = new LinkList((byte) 9);

    @OriginalMember(owner = "vb", name = "B", descriptor = "Lpb;")
    private LinkList field837 = new LinkList((byte) 9);

    @OriginalMember(owner = "vb", name = "C", descriptor = "Ljava/lang/String;")
    public String field838 = "";

    @OriginalMember(owner = "vb", name = "L", descriptor = "[B")
    private byte[] field847 = new byte[500];

    @OriginalMember(owner = "vb", name = "M", descriptor = "[B")
    private byte[] field848 = new byte[65000];

    @OriginalMember(owner = "vb", name = "d", descriptor = "I")
    private int field813;

    @OriginalMember(owner = "vb", name = "i", descriptor = "I")
    private int field818;

    @OriginalMember(owner = "vb", name = "u", descriptor = "I")
    private int field830;

    @OriginalMember(owner = "vb", name = "v", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "vb", name = "D", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "vb", name = "E", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "vb", name = "J", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "vb", name = "K", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "vb", name = "N", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "vb", name = "O", descriptor = "I")
    private int field850;

    @OriginalMember(owner = "vb", name = "Q", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "vb", name = "P", descriptor = "J")
    private long field851;

    @OriginalMember(owner = "vb", name = "I", descriptor = "Lnb;")
    private OnDemandRequest field844;

    @OriginalMember(owner = "vb", name = "r", descriptor = "Lclient;")
    private client field827;

    @OriginalMember(owner = "vb", name = "G", descriptor = "Ljava/io/InputStream;")
    private InputStream field842;

    @OriginalMember(owner = "vb", name = "H", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field843;

    @OriginalMember(owner = "vb", name = "F", descriptor = "Ljava/net/Socket;")
    private Socket field841;

    @OriginalMember(owner = "vb", name = "j", descriptor = "[B")
    private byte[] field819;

    @OriginalMember(owner = "vb", name = "k", descriptor = "[I")
    private int[] field820;

    @OriginalMember(owner = "vb", name = "l", descriptor = "[I")
    private int[] field821;

    @OriginalMember(owner = "vb", name = "m", descriptor = "[I")
    private int[] field822;

    @OriginalMember(owner = "vb", name = "n", descriptor = "[I")
    private int[] field823;

    @OriginalMember(owner = "vb", name = "o", descriptor = "[I")
    private int[] field824;

    @OriginalMember(owner = "vb", name = "p", descriptor = "[I")
    private int[] field825;

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lyb;Lclient;)V")
    public final void method269(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method298(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(var26, true);
            this.field815[var4] = new int[var27];
            this.field817[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field815[var4][var29] = var28.method230();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method298(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(var22, true);
            this.field816[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field816[var6][var25] = var24.method233();
            }
        }
        byte[] var7 = arg0.method298("model_index", null);
        int var8 = this.field815[0].length;
        this.field819 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field819[var9] = var7[var9];
            } else {
                this.field819[var9] = 0;
            }
        }
        byte[] var10 = arg0.method298("map_index", null);
        Packet var11 = new Packet(var10, true);
        int var12 = var10.length / 7;
        this.field820 = new int[var12];
        this.field821 = new int[var12];
        this.field822 = new int[var12];
        this.field823 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field820[var13] = var11.method230();
            this.field821[var13] = var11.method230();
            this.field822[var13] = var11.method230();
            this.field823[var13] = var11.method228();
        }
        byte[] var14 = arg0.method298("anim_index", null);
        Packet var15 = new Packet(var14, true);
        int var16 = var14.length / 2;
        this.field824 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field824[var17] = var15.method230();
        }
        byte[] var18 = arg0.method298("midi_index", null);
        Packet var19 = new Packet(var18, true);
        int var20 = var18.length;
        this.field825 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field825[var21] = var19.method228();
        }
        this.field827 = arg1;
        this.field826 = true;
        this.field827.method12(this, 2);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "()V")
    public final void method270() {
        this.field826 = false;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)I")
    public final int method271(int arg0, int arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field815[arg1].length;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(I)I")
    public final int method272(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            this.field812 = -73;
        }
        return this.field824.length;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IIII)I")
    public final int method273(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 23320) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = (arg1 << 8) + arg3;
        for (int var7 = 0; var7 < this.field820.length; var7++) {
            if (this.field820[var7] == var6) {
                if (arg2 == 0) {
                    return this.field821[var7];
                }
                return this.field822[var7];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZB)V")
    public final void method274(boolean arg0, byte arg1) {
        if (arg1 != 2) {
            this.field811 = !this.field811;
        }
        int var3 = this.field820.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field823[var4] != 0) {
                this.method281(this.field822[var4], (byte) 2, true, 3);
                this.method281(this.field821[var4], (byte) 2, true, 3);
            }
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(II)Z")
    public final boolean method275(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field820.length; var3++) {
            if (this.field822[var3] == arg1) {
                return true;
            }
        }
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(II)I")
    public final int method276(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field819[arg0] & 0xFF;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZI)Z")
    public final boolean method277(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return this.field825[arg1] == 1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(I)V")
    public final void method268(int arg0) {
        this.method278(0, arg0);
    }

    @OriginalMember(owner = "vb", name = "d", descriptor = "(II)V")
    public final void method278(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field815.length || arg1 < 0 || arg1 > this.field815[arg0].length || this.field815[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field832;
        synchronized (this.field832) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field832.method254(); var4 != null; var4 = (OnDemandRequest) this.field832.method255(633)) {
                if (var4.field727 == arg0 && var4.field728 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field727 = arg0;
            var5.field728 = arg1;
            var5.field731 = true;
            LinkList var6 = this.field833;
            synchronized (this.field833) {
                this.field833.method244(var5);
            }
            this.field832.method252(var5);
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "()I")
    public final int method279() {
        DoublyLinkList var1 = this.field832;
        synchronized (this.field832) {
            return this.field832.method256();
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "()Lnb;")
    public final OnDemandRequest method280() {
        LinkList var1 = this.field836;
        OnDemandRequest var2;
        synchronized (this.field836) {
            var2 = (OnDemandRequest) this.field836.method246();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field832;
        synchronized (this.field832) {
            var2.method107();
        }
        if (var2.field729 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field729));
            while (true) {
                if (this.field848.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field848, var4, this.field848.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field729 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field729[var7] = this.field848[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IBZI)V")
    public final void method281(int arg0, byte arg1, boolean arg2, int arg3) {
        if (this.field827.field1499[0] == null || this.field815[arg3][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field827.field1499[arg3 + 1].method290((byte) 44, arg0);
        if (this.method288(this.field815[arg3][arg0], this.field816[arg3][arg0], this.field814, var5)) {
            return;
        }
        this.field817[arg3][arg0] = arg1;
        if (!arg2) {
            this.field812 = -392;
        }
        if (arg1 > this.field818) {
            this.field818 = arg1;
        }
        this.field840++;
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(I)V")
    public final void method282(int arg0) {
        LinkList var2 = this.field837;
        synchronized (this.field837) {
            this.field837.method251();
        }
        if (arg0 == 29974) {
            ;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IBI)V")
    public final void method283(int arg0, byte arg1, int arg2) {
        if (this.field827.field1499[0] == null || (this.field815[arg0][arg2] == 0 || (this.field817[arg0][arg2] == 0 || this.field818 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field727 = arg0;
        var4.field728 = arg2;
        if (arg1 != 3) {
            return;
        }
        var4.field731 = false;
        LinkList var5 = this.field837;
        synchronized (this.field837) {
            this.field837.method244(var4);
        }
    }

    @OriginalMember(owner = "vb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field826) {
                this.field852++;
                byte var1 = 20;
                if (this.field818 == 0 && this.field827.field1499[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field829 = true;
                for (int var2 = 0; var2 < 100 && this.field829; var2++) {
                    this.field829 = false;
                    this.method284((byte) -104);
                    this.method285(this.field813);
                    if (this.field830 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method286((byte) 8);
                    if (this.field842 != null) {
                        this.method287(24);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field835.method247(); var4 != null; var4 = (OnDemandRequest) this.field835.method249(633)) {
                    if (var4.field731) {
                        var3 = true;
                        var4.field730++;
                        if (var4.field730 > 50) {
                            var4.field730 = 0;
                            this.method289(var4, true);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field835.method247(); var5 != null; var5 = (OnDemandRequest) this.field835.method249(633)) {
                        var3 = true;
                        var5.field730++;
                        if (var5.field730 > 50) {
                            var5.field730 = 0;
                            this.method289(var5, true);
                        }
                    }
                }
                if (var3) {
                    this.field849++;
                    if (this.field849 > 750) {
                        try {
                            this.field841.close();
                        } catch (Exception var8) {
                        }
                        this.field841 = null;
                        this.field842 = null;
                        this.field843 = null;
                        this.field846 = 0;
                    }
                } else {
                    this.field849 = 0;
                    this.field838 = "";
                }
                if (this.field827.field1663 && this.field841 != null && this.field843 != null && (this.field818 > 0 || this.field827.field1499[0] == null)) {
                    this.field850++;
                    if (this.field850 > 500) {
                        this.field850 = 0;
                        this.field847[0] = 0;
                        this.field847[1] = 0;
                        this.field847[2] = 0;
                        this.field847[3] = 10;
                        try {
                            this.field843.write(this.field847, 0, 4);
                        } catch (IOException var7) {
                            this.field849 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(B)V")
    private final void method284(byte arg0) {
        if (arg0 != -104) {
            this.field811 = !this.field811;
        }
        LinkList var2 = this.field833;
        OnDemandRequest var3;
        synchronized (this.field833) {
            var3 = (OnDemandRequest) this.field833.method246();
        }
        while (var3 != null) {
            this.field829 = true;
            byte[] var4 = null;
            if (this.field827.field1499[0] != null) {
                var4 = this.field827.field1499[var3.field727 + 1].method290((byte) 44, var3.field728);
            }
            if (!this.method288(this.field815[var3.field727][var3.field728], this.field816[var3.field727][var3.field728], this.field814, var4)) {
                var4 = null;
            }
            LinkList var5 = this.field833;
            synchronized (this.field833) {
                if (var4 == null) {
                    this.field834.method244(var3);
                } else {
                    var3.field729 = var4;
                    LinkList var6 = this.field836;
                    synchronized (this.field836) {
                        this.field836.method244(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field833.method246();
            }
        }
    }

    @OriginalMember(owner = "vb", name = "d", descriptor = "(I)V")
    private final void method285(int arg0) {
        this.field830 = 0;
        this.field831 = 0;
        if (arg0 != 0) {
            return;
        }
        for (OnDemandRequest var2 = (OnDemandRequest) this.field835.method247(); var2 != null; var2 = (OnDemandRequest) this.field835.method249(633)) {
            if (var2.field731) {
                this.field830++;
            } else {
                this.field831++;
            }
        }
        while (this.field830 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field834.method246();
            if (var3 == null) {
                break;
            }
            if (this.field817[var3.field727][var3.field728] != 0) {
                this.field839++;
            }
            this.field817[var3.field727][var3.field728] = 0;
            this.field835.method244(var3);
            this.field830++;
            this.method289(var3, true);
            this.field829 = true;
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(B)V")
    private final void method286(byte arg0) {
        if (arg0 != 8) {
            return;
        }
        while (this.field830 == 0) {
            if (this.field831 >= 10 || this.field818 == 0) {
                return;
            }
            LinkList var2 = this.field837;
            OnDemandRequest var3;
            synchronized (this.field837) {
                var3 = (OnDemandRequest) this.field837.method246();
            }
            while (var3 != null) {
                if (this.field817[var3.field727][var3.field728] != 0) {
                    this.field817[var3.field727][var3.field728] = 0;
                    this.field835.method244(var3);
                    this.method289(var3, true);
                    this.field829 = true;
                    if (this.field839 < this.field840) {
                        this.field839++;
                    }
                    this.field838 = "Loading extra files - " + this.field839 * 100 / this.field840 + "%";
                    this.field831++;
                    if (this.field831 == 10) {
                        return;
                    }
                }
                LinkList var4 = this.field837;
                synchronized (this.field837) {
                    var3 = (OnDemandRequest) this.field837.method246();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field817[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field818) {
                        var6[var8] = 0;
                        OnDemandRequest var9 = new OnDemandRequest();
                        var9.field727 = var5;
                        var9.field728 = var8;
                        var9.field731 = false;
                        this.field835.method244(var9);
                        this.method289(var9, true);
                        this.field829 = true;
                        if (this.field839 < this.field840) {
                            this.field839++;
                        }
                        this.field838 = "Loading extra files - " + this.field839 * 100 / this.field840 + "%";
                        this.field831++;
                        if (this.field831 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field818--;
        }
    }

    @OriginalMember(owner = "vb", name = "e", descriptor = "(I)V")
    private final void method287(int arg0) {
        int var2 = 31 / arg0;
        try {
            int var3 = this.field842.available();
            if (this.field846 == 0 && var3 >= 6) {
                this.field829 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field842.read(this.field847, var4, 6 - var4)) {
                }
                int var5 = this.field847[0] & 0xFF;
                int var6 = ((this.field847[1] & 0xFF) << 8) + (this.field847[2] & 0xFF);
                int var7 = ((this.field847[3] & 0xFF) << 8) + (this.field847[4] & 0xFF);
                int var8 = this.field847[5] & 0xFF;
                this.field844 = null;
                for (OnDemandRequest var9 = (OnDemandRequest) this.field835.method247(); var9 != null; var9 = (OnDemandRequest) this.field835.method249(633)) {
                    if (var9.field727 == var5 && var9.field728 == var6) {
                        this.field844 = var9;
                    }
                    if (this.field844 != null) {
                        var9.field730 = 0;
                    }
                }
                if (this.field844 != null) {
                    this.field849 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field844.field729 = null;
                        if (this.field844.field731) {
                            LinkList var10 = this.field836;
                            synchronized (this.field836) {
                                this.field836.method244(this.field844);
                            }
                        } else {
                            this.field844.method106();
                        }
                        this.field844 = null;
                    } else {
                        if (this.field844.field729 == null && var8 == 0) {
                            this.field844.field729 = new byte[var7];
                        }
                        if (this.field844.field729 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field845 = var8 * 500;
                this.field846 = 500;
                if (this.field846 > var7 - var8 * 500) {
                    this.field846 = var7 - var8 * 500;
                }
            }
            if (this.field846 > 0 && var3 >= this.field846) {
                this.field829 = true;
                byte[] var11 = this.field847;
                int var12 = 0;
                if (this.field844 != null) {
                    var11 = this.field844.field729;
                    var12 = this.field845;
                }
                for (int var13 = 0; var13 < this.field846; var13 += this.field842.read(var11, var12 + var13, this.field846 - var13)) {
                }
                if (this.field846 + this.field845 >= var11.length && this.field844 != null) {
                    if (this.field827.field1499[0] != null) {
                        this.field827.field1499[this.field844.field727 + 1].method291(var11, false, this.field844.field728, var11.length);
                    }
                    if (!this.field844.field731 && this.field844.field727 == 3) {
                        this.field844.field731 = true;
                        this.field844.field727 = 93;
                    }
                    if (this.field844.field731) {
                        LinkList var14 = this.field836;
                        synchronized (this.field836) {
                            this.field836.method244(this.field844);
                        }
                    } else {
                        this.field844.method106();
                    }
                }
                this.field846 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field841.close();
            } catch (Exception var16) {
            }
            this.field841 = null;
            this.field842 = null;
            this.field843 = null;
            this.field846 = 0;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(III[B)Z")
    private final boolean method288(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 < 2 || arg2 > 2) {
            this.field812 = 133;
        }
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field828.reset();
        this.field828.update(arg3, 0, var5);
        int var7 = (int) this.field828.getValue();
        if (arg0 == var6) {
            return arg1 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lnb;Z)V")
    private final void method289(OnDemandRequest arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        try {
            if (this.field841 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field851 < 5000L) {
                    return;
                }
                this.field851 = var3;
                this.field841 = this.field827.method450(client.field1460 + 43594);
                this.field842 = this.field841.getInputStream();
                this.field843 = this.field841.getOutputStream();
                this.field843.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field842.read();
                }
                this.field849 = 0;
            }
            this.field847[0] = (byte) arg0.field727;
            this.field847[1] = (byte) (arg0.field728 >> 8);
            this.field847[2] = (byte) arg0.field728;
            if (arg0.field731) {
                this.field847[3] = 2;
            } else if (this.field827.field1663) {
                this.field847[3] = 0;
            } else {
                this.field847[3] = 1;
            }
            this.field843.write(this.field847, 0, 4);
            this.field850 = 0;
        } catch (IOException var8) {
            try {
                this.field841.close();
            } catch (Exception var7) {
            }
            this.field841 = null;
            this.field842 = null;
            this.field843 = null;
            this.field846 = 0;
        }
    }
}
