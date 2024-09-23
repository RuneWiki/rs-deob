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
    private boolean field804 = false;

    @OriginalMember(owner = "vb", name = "b", descriptor = "Z")
    private boolean field805 = false;

    @OriginalMember(owner = "vb", name = "c", descriptor = "I")
    private int field806 = -102;

    @OriginalMember(owner = "vb", name = "d", descriptor = "I")
    private int field807 = -62;

    @OriginalMember(owner = "vb", name = "e", descriptor = "I")
    private int field808 = 810;

    @OriginalMember(owner = "vb", name = "f", descriptor = "Z")
    private boolean field809 = true;

    @OriginalMember(owner = "vb", name = "g", descriptor = "[[I")
    private int[][] field810 = new int[4][];

    @OriginalMember(owner = "vb", name = "h", descriptor = "[[I")
    private int[][] field811 = new int[4][];

    @OriginalMember(owner = "vb", name = "i", descriptor = "[[B")
    private byte[][] field812 = new byte[4][];

    @OriginalMember(owner = "vb", name = "r", descriptor = "Z")
    private boolean field821 = true;

    @OriginalMember(owner = "vb", name = "t", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field823 = new CRC32();

    @OriginalMember(owner = "vb", name = "u", descriptor = "Z")
    private boolean field824 = false;

    @OriginalMember(owner = "vb", name = "x", descriptor = "Lqb;")
    private DoublyLinkList field827 = new DoublyLinkList(0);

    @OriginalMember(owner = "vb", name = "y", descriptor = "Lpb;")
    private LinkList field828 = new LinkList(false);

    @OriginalMember(owner = "vb", name = "z", descriptor = "Lpb;")
    private LinkList field829 = new LinkList(false);

    @OriginalMember(owner = "vb", name = "A", descriptor = "Lpb;")
    private LinkList field830 = new LinkList(false);

    @OriginalMember(owner = "vb", name = "B", descriptor = "Lpb;")
    private LinkList field831 = new LinkList(false);

    @OriginalMember(owner = "vb", name = "C", descriptor = "Lpb;")
    private LinkList field832 = new LinkList(false);

    @OriginalMember(owner = "vb", name = "D", descriptor = "Ljava/lang/String;")
    public String field833 = "";

    @OriginalMember(owner = "vb", name = "M", descriptor = "[B")
    private byte[] field842 = new byte[500];

    @OriginalMember(owner = "vb", name = "N", descriptor = "[B")
    private byte[] field843 = new byte[65000];

    @OriginalMember(owner = "vb", name = "j", descriptor = "I")
    private int field813;

    @OriginalMember(owner = "vb", name = "v", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "vb", name = "w", descriptor = "I")
    private int field826;

    @OriginalMember(owner = "vb", name = "E", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "vb", name = "F", descriptor = "I")
    private int field835;

    @OriginalMember(owner = "vb", name = "K", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "vb", name = "L", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "vb", name = "O", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "vb", name = "P", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "vb", name = "R", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "vb", name = "Q", descriptor = "J")
    private long field846;

    @OriginalMember(owner = "vb", name = "J", descriptor = "Lnb;")
    private OnDemandRequest field839;

    @OriginalMember(owner = "vb", name = "s", descriptor = "Lclient;")
    private client field822;

    @OriginalMember(owner = "vb", name = "H", descriptor = "Ljava/io/InputStream;")
    private InputStream field837;

    @OriginalMember(owner = "vb", name = "I", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field838;

    @OriginalMember(owner = "vb", name = "G", descriptor = "Ljava/net/Socket;")
    private Socket field836;

    @OriginalMember(owner = "vb", name = "k", descriptor = "[B")
    private byte[] field814;

    @OriginalMember(owner = "vb", name = "l", descriptor = "[I")
    private int[] field815;

    @OriginalMember(owner = "vb", name = "m", descriptor = "[I")
    private int[] field816;

    @OriginalMember(owner = "vb", name = "n", descriptor = "[I")
    private int[] field817;

    @OriginalMember(owner = "vb", name = "o", descriptor = "[I")
    private int[] field818;

    @OriginalMember(owner = "vb", name = "p", descriptor = "[I")
    private int[] field819;

    @OriginalMember(owner = "vb", name = "q", descriptor = "[I")
    private int[] field820;

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lyb;Lclient;)V")
    public final void method280(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method309(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(var26, (byte) 3);
            this.field810[var4] = new int[var27];
            this.field812[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field810[var4][var29] = var28.method241();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method309(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(var22, (byte) 3);
            this.field811[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field811[var6][var25] = var24.method244();
            }
        }
        byte[] var7 = arg0.method309("model_index", null);
        int var8 = this.field810[0].length;
        this.field814 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field814[var9] = var7[var9];
            } else {
                this.field814[var9] = 0;
            }
        }
        byte[] var10 = arg0.method309("map_index", null);
        Packet var11 = new Packet(var10, (byte) 3);
        int var12 = var10.length / 7;
        this.field815 = new int[var12];
        this.field816 = new int[var12];
        this.field817 = new int[var12];
        this.field818 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field815[var13] = var11.method241();
            this.field816[var13] = var11.method241();
            this.field817[var13] = var11.method241();
            this.field818[var13] = var11.method239();
        }
        byte[] var14 = arg0.method309("anim_index", null);
        Packet var15 = new Packet(var14, (byte) 3);
        int var16 = var14.length / 2;
        this.field819 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field819[var17] = var15.method241();
        }
        byte[] var18 = arg0.method309("midi_index", null);
        Packet var19 = new Packet(var18, (byte) 3);
        int var20 = var18.length;
        this.field820 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field820[var21] = var19.method239();
        }
        this.field822 = arg1;
        this.field821 = true;
        this.field822.method12(this, 2);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "()V")
    public final void method281() {
        this.field821 = false;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IB)I")
    public final int method282(int arg0, byte arg1) {
        if (arg1 != -1) {
            this.field809 = !this.field809;
        }
        return this.field810[arg0].length;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Z)I")
    public final int method283(boolean arg0) {
        return arg0 ? 4 : this.field819.length;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IIII)I")
    public final int method284(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg0 << 8) + arg1;
        for (int var6 = 0; var6 < this.field815.length; var6++) {
            if (this.field815[var6] == var5) {
                if (arg2 == 0) {
                    return this.field816[var6];
                }
                return this.field817[var6];
            }
        }
        return arg3 < 0 ? -1 : 2;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IZ)V")
    public final void method285(int arg0, boolean arg1) {
        int var3 = this.field815.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field818[var4] != 0) {
                this.method292(810, 3, (byte) 2, this.field817[var4]);
                this.method292(810, 3, (byte) 2, this.field816[var4]);
            }
        }
        if (arg0 != 41461) {
            this.field809 = !this.field809;
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(IB)Z")
    public final boolean method286(int arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field815.length; var3++) {
            if (this.field817[var3] == arg0) {
                return true;
            }
        }
        if (arg1 == 1) {
            boolean var4 = false;
        } else {
            this.field805 = !this.field805;
        }
        return false;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(BI)I")
    public final int method287(byte arg0, int arg1) {
        if (arg0 != 5) {
            this.field807 = -465;
        }
        return this.field814[arg1] & 0xFF;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(IZ)Z")
    public final boolean method288(int arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        return this.field820[arg0] == 1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(I)V")
    public final void method279(int arg0) {
        this.method289(0, arg0);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)V")
    public final void method289(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field810.length || arg1 < 0 || arg1 > this.field810[arg0].length || this.field810[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field827;
        synchronized (this.field827) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field827.method265(); var4 != null; var4 = (OnDemandRequest) this.field827.method266(6)) {
                if (var4.field724 == arg0 && var4.field725 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field724 = arg0;
            var5.field725 = arg1;
            var5.field728 = true;
            LinkList var6 = this.field828;
            synchronized (this.field828) {
                this.field828.method255(var5);
            }
            this.field827.method263(var5);
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "()I")
    public final int method290() {
        DoublyLinkList var1 = this.field827;
        synchronized (this.field827) {
            return this.field827.method267();
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "()Lnb;")
    public final OnDemandRequest method291() {
        LinkList var1 = this.field831;
        OnDemandRequest var2;
        synchronized (this.field831) {
            var2 = (OnDemandRequest) this.field831.method257();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field827;
        synchronized (this.field827) {
            var2.method121();
        }
        if (var2.field726 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field726));
            while (true) {
                if (this.field843.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field843, var4, this.field843.length - var4);
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
            var2.field726[var7] = this.field843[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IIBI)V")
    public final void method292(int arg0, int arg1, byte arg2, int arg3) {
        if (this.field822.field1232[0] == null || this.field810[arg1][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field822.field1232[arg1 + 1].method301(9, arg3);
        if (arg0 <= 0) {
            this.field808 = 195;
        }
        if (this.method299(var5, this.field810[arg1][arg3], false, this.field811[arg1][arg3])) {
            return;
        }
        this.field812[arg1][arg3] = arg2;
        if (arg2 > this.field813) {
            this.field813 = arg2;
        }
        this.field835++;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(I)V")
    public final void method293(int arg0) {
        if (arg0 != 0) {
            this.field805 = !this.field805;
        }
        LinkList var2 = this.field832;
        synchronized (this.field832) {
            this.field832.method262();
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(III)V")
    public final void method294(int arg0, int arg1, int arg2) {
        if (this.field822.field1232[0] == null || (this.field810[arg0][arg1] == 0 || (this.field812[arg0][arg1] == 0 || this.field813 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        if (arg2 != 0) {
            this.field809 = !this.field809;
        }
        var4.field724 = arg0;
        var4.field725 = arg1;
        var4.field728 = false;
        LinkList var5 = this.field832;
        synchronized (this.field832) {
            this.field832.method255(var4);
        }
    }

    @OriginalMember(owner = "vb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field821) {
                this.field847++;
                byte var1 = 20;
                if (this.field813 == 0 && this.field822.field1232[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field824 = true;
                for (int var2 = 0; var2 < 100 && this.field824; var2++) {
                    this.field824 = false;
                    this.method295(2);
                    this.method296(908);
                    if (this.field825 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method297(this.field809);
                    if (this.field837 != null) {
                        this.method298(0);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field830.method258(); var4 != null; var4 = (OnDemandRequest) this.field830.method260(6)) {
                    if (var4.field728) {
                        var3 = true;
                        var4.field727++;
                        if (var4.field727 > 50) {
                            var4.field727 = 0;
                            this.method300(var4, 6);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field830.method258(); var5 != null; var5 = (OnDemandRequest) this.field830.method260(6)) {
                        var3 = true;
                        var5.field727++;
                        if (var5.field727 > 50) {
                            var5.field727 = 0;
                            this.method300(var5, 6);
                        }
                    }
                }
                if (var3) {
                    this.field844++;
                    if (this.field844 > 750) {
                        try {
                            this.field836.close();
                        } catch (Exception var8) {
                        }
                        this.field836 = null;
                        this.field837 = null;
                        this.field838 = null;
                        this.field841 = 0;
                    }
                } else {
                    this.field844 = 0;
                    this.field833 = "";
                }
                if (this.field822.field1238 && this.field836 != null && this.field838 != null && (this.field813 > 0 || this.field822.field1232[0] == null)) {
                    this.field845++;
                    if (this.field845 > 500) {
                        this.field845 = 0;
                        this.field842[0] = 0;
                        this.field842[1] = 0;
                        this.field842[2] = 0;
                        this.field842[3] = 10;
                        try {
                            this.field838.write(this.field842, 0, 4);
                        } catch (IOException var7) {
                            this.field844 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(I)V")
    private final void method295(int arg0) {
        if (arg0 != 2) {
            return;
        }
        LinkList var2 = this.field828;
        OnDemandRequest var3;
        synchronized (this.field828) {
            var3 = (OnDemandRequest) this.field828.method257();
        }
        while (var3 != null) {
            this.field824 = true;
            byte[] var4 = null;
            if (this.field822.field1232[0] != null) {
                var4 = this.field822.field1232[var3.field724 + 1].method301(9, var3.field725);
            }
            if (!this.method299(var4, this.field810[var3.field724][var3.field725], false, this.field811[var3.field724][var3.field725])) {
                var4 = null;
            }
            LinkList var5 = this.field828;
            synchronized (this.field828) {
                if (var4 == null) {
                    this.field829.method255(var3);
                } else {
                    var3.field726 = var4;
                    LinkList var6 = this.field831;
                    synchronized (this.field831) {
                        this.field831.method255(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field828.method257();
            }
        }
    }

    @OriginalMember(owner = "vb", name = "d", descriptor = "(I)V")
    private final void method296(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field825 = 0;
        this.field826 = 0;
        for (OnDemandRequest var3 = (OnDemandRequest) this.field830.method258(); var3 != null; var3 = (OnDemandRequest) this.field830.method260(6)) {
            if (var3.field728) {
                this.field825++;
            } else {
                this.field826++;
            }
        }
        while (this.field825 < 10) {
            OnDemandRequest var4 = (OnDemandRequest) this.field829.method257();
            if (var4 == null) {
                break;
            }
            if (this.field812[var4.field724][var4.field725] != 0) {
                this.field834++;
            }
            this.field812[var4.field724][var4.field725] = 0;
            this.field830.method255(var4);
            this.field825++;
            this.method300(var4, 6);
            this.field824 = true;
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(Z)V")
    private final void method297(boolean arg0) {
        if (!arg0) {
            return;
        }
        while (this.field825 == 0) {
            if (this.field826 >= 10 || this.field813 == 0) {
                return;
            }
            LinkList var2 = this.field832;
            OnDemandRequest var3;
            synchronized (this.field832) {
                var3 = (OnDemandRequest) this.field832.method257();
            }
            while (var3 != null) {
                if (this.field812[var3.field724][var3.field725] != 0) {
                    this.field812[var3.field724][var3.field725] = 0;
                    this.field830.method255(var3);
                    this.method300(var3, 6);
                    this.field824 = true;
                    if (this.field834 < this.field835) {
                        this.field834++;
                    }
                    this.field833 = "Loading extra files - " + this.field834 * 100 / this.field835 + "%";
                    this.field826++;
                    if (this.field826 == 10) {
                        return;
                    }
                }
                LinkList var4 = this.field832;
                synchronized (this.field832) {
                    var3 = (OnDemandRequest) this.field832.method257();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field812[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field813) {
                        var6[var8] = 0;
                        OnDemandRequest var9 = new OnDemandRequest();
                        var9.field724 = var5;
                        var9.field725 = var8;
                        var9.field728 = false;
                        this.field830.method255(var9);
                        this.method300(var9, 6);
                        this.field824 = true;
                        if (this.field834 < this.field835) {
                            this.field834++;
                        }
                        this.field833 = "Loading extra files - " + this.field834 * 100 / this.field835 + "%";
                        this.field826++;
                        if (this.field826 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field813--;
        }
    }

    @OriginalMember(owner = "vb", name = "e", descriptor = "(I)V")
    private final void method298(int arg0) {
        if (arg0 != 0) {
            this.field806 = -307;
        }
        try {
            int var2 = this.field837.available();
            if (this.field841 == 0 && var2 >= 6) {
                this.field824 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field837.read(this.field842, var3, 6 - var3)) {
                }
                int var4 = this.field842[0] & 0xFF;
                int var5 = ((this.field842[1] & 0xFF) << 8) + (this.field842[2] & 0xFF);
                int var6 = ((this.field842[3] & 0xFF) << 8) + (this.field842[4] & 0xFF);
                int var7 = this.field842[5] & 0xFF;
                this.field839 = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.field830.method258(); var8 != null; var8 = (OnDemandRequest) this.field830.method260(6)) {
                    if (var8.field724 == var4 && var8.field725 == var5) {
                        this.field839 = var8;
                    }
                    if (this.field839 != null) {
                        var8.field727 = 0;
                    }
                }
                if (this.field839 != null) {
                    this.field844 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field839.field726 = null;
                        if (this.field839.field728) {
                            LinkList var9 = this.field831;
                            synchronized (this.field831) {
                                this.field831.method255(this.field839);
                            }
                        } else {
                            this.field839.method120();
                        }
                        this.field839 = null;
                    } else {
                        if (this.field839.field726 == null && var7 == 0) {
                            this.field839.field726 = new byte[var6];
                        }
                        if (this.field839.field726 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field840 = var7 * 500;
                this.field841 = 500;
                if (this.field841 > var6 - var7 * 500) {
                    this.field841 = var6 - var7 * 500;
                }
            }
            if (this.field841 > 0 && var2 >= this.field841) {
                this.field824 = true;
                byte[] var10 = this.field842;
                int var11 = 0;
                if (this.field839 != null) {
                    var10 = this.field839.field726;
                    var11 = this.field840;
                }
                for (int var12 = 0; var12 < this.field841; var12 += this.field837.read(var10, var11 + var12, this.field841 - var12)) {
                }
                if (this.field841 + this.field840 >= var10.length && this.field839 != null) {
                    if (this.field822.field1232[0] != null) {
                        this.field822.field1232[this.field839.field724 + 1].method302(var10.length, this.field839.field725, var10, this.field804);
                    }
                    if (!this.field839.field728 && this.field839.field724 == 3) {
                        this.field839.field728 = true;
                        this.field839.field724 = 93;
                    }
                    if (this.field839.field728) {
                        LinkList var13 = this.field831;
                        synchronized (this.field831) {
                            this.field831.method255(this.field839);
                        }
                    } else {
                        this.field839.method120();
                    }
                }
                this.field841 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field836.close();
            } catch (Exception var15) {
            }
            this.field836 = null;
            this.field837 = null;
            this.field838 = null;
            this.field841 = 0;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "([BIZI)Z")
    private final boolean method299(byte[] arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field823.reset();
        this.field823.update(arg0, 0, var5);
        if (arg2) {
            this.field805 = !this.field805;
        }
        int var7 = (int) this.field823.getValue();
        if (arg1 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lnb;I)V")
    private final void method300(OnDemandRequest arg0, int arg1) {
        if (arg1 != 6) {
            return;
        }
        try {
            if (this.field836 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field846 < 5000L) {
                    return;
                }
                this.field846 = var3;
                this.field836 = this.field822.method444(client.field1240 + 43594);
                this.field837 = this.field836.getInputStream();
                this.field838 = this.field836.getOutputStream();
                this.field838.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field837.read();
                }
                this.field844 = 0;
            }
            this.field842[0] = (byte) arg0.field724;
            this.field842[1] = (byte) (arg0.field725 >> 8);
            this.field842[2] = (byte) arg0.field725;
            if (arg0.field728) {
                this.field842[3] = 2;
            } else if (this.field822.field1238) {
                this.field842[3] = 0;
            } else {
                this.field842[3] = 1;
            }
            this.field838.write(this.field842, 0, 4);
            this.field845 = 0;
        } catch (IOException var8) {
            try {
                this.field836.close();
            } catch (Exception var7) {
            }
            this.field836 = null;
            this.field837 = null;
            this.field838 = null;
            this.field841 = 0;
        }
    }
}
