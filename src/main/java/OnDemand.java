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
    private boolean field807 = true;

    @OriginalMember(owner = "vb", name = "c", descriptor = "I")
    private int field808 = 1;

    @OriginalMember(owner = "vb", name = "d", descriptor = "[[I")
    private int[][] field809 = new int[4][];

    @OriginalMember(owner = "vb", name = "e", descriptor = "[[I")
    private int[][] field810 = new int[4][];

    @OriginalMember(owner = "vb", name = "f", descriptor = "[[B")
    private byte[][] field811 = new byte[4][];

    @OriginalMember(owner = "vb", name = "o", descriptor = "Z")
    private boolean field820 = true;

    @OriginalMember(owner = "vb", name = "q", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field822 = new CRC32();

    @OriginalMember(owner = "vb", name = "r", descriptor = "Z")
    private boolean field823 = false;

    @OriginalMember(owner = "vb", name = "u", descriptor = "Lqb;")
    private DoublyLinkList field826 = new DoublyLinkList(true);

    @OriginalMember(owner = "vb", name = "v", descriptor = "Lpb;")
    private LinkList field827 = new LinkList(-767);

    @OriginalMember(owner = "vb", name = "w", descriptor = "Lpb;")
    private LinkList field828 = new LinkList(-767);

    @OriginalMember(owner = "vb", name = "x", descriptor = "Lpb;")
    private LinkList field829 = new LinkList(-767);

    @OriginalMember(owner = "vb", name = "y", descriptor = "Lpb;")
    private LinkList field830 = new LinkList(-767);

    @OriginalMember(owner = "vb", name = "z", descriptor = "Lpb;")
    private LinkList field831 = new LinkList(-767);

    @OriginalMember(owner = "vb", name = "A", descriptor = "Ljava/lang/String;")
    public String field832 = "";

    @OriginalMember(owner = "vb", name = "J", descriptor = "[B")
    private byte[] field841 = new byte[500];

    @OriginalMember(owner = "vb", name = "K", descriptor = "[B")
    private byte[] field842 = new byte[65000];

    @OriginalMember(owner = "vb", name = "g", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "vb", name = "s", descriptor = "I")
    private int field824;

    @OriginalMember(owner = "vb", name = "t", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "vb", name = "B", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "vb", name = "C", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "vb", name = "H", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "vb", name = "I", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "vb", name = "L", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "vb", name = "M", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "vb", name = "O", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "vb", name = "N", descriptor = "J")
    private long field845;

    @OriginalMember(owner = "vb", name = "G", descriptor = "Lnb;")
    private OnDemandRequest field838;

    @OriginalMember(owner = "vb", name = "p", descriptor = "Lclient;")
    private client field821;

    @OriginalMember(owner = "vb", name = "E", descriptor = "Ljava/io/InputStream;")
    private InputStream field836;

    @OriginalMember(owner = "vb", name = "F", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field837;

    @OriginalMember(owner = "vb", name = "D", descriptor = "Ljava/net/Socket;")
    private Socket field835;

    @OriginalMember(owner = "vb", name = "h", descriptor = "[B")
    private byte[] field813;

    @OriginalMember(owner = "vb", name = "i", descriptor = "[I")
    private int[] field814;

    @OriginalMember(owner = "vb", name = "j", descriptor = "[I")
    private int[] field815;

    @OriginalMember(owner = "vb", name = "k", descriptor = "[I")
    private int[] field816;

    @OriginalMember(owner = "vb", name = "l", descriptor = "[I")
    private int[] field817;

    @OriginalMember(owner = "vb", name = "m", descriptor = "[I")
    private int[] field818;

    @OriginalMember(owner = "vb", name = "n", descriptor = "[I")
    private int[] field819;

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lyb;Lclient;)V")
    public final void method280(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method309(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(var26, 337);
            this.field809[var4] = new int[var27];
            this.field811[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field809[var4][var29] = var28.method241();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method309(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(var22, 337);
            this.field810[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field810[var6][var25] = var24.method244();
            }
        }
        byte[] var7 = arg0.method309("model_index", null);
        int var8 = this.field809[0].length;
        this.field813 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field813[var9] = var7[var9];
            } else {
                this.field813[var9] = 0;
            }
        }
        byte[] var10 = arg0.method309("map_index", null);
        Packet var11 = new Packet(var10, 337);
        int var12 = var10.length / 7;
        this.field814 = new int[var12];
        this.field815 = new int[var12];
        this.field816 = new int[var12];
        this.field817 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field814[var13] = var11.method241();
            this.field815[var13] = var11.method241();
            this.field816[var13] = var11.method241();
            this.field817[var13] = var11.method239();
        }
        byte[] var14 = arg0.method309("anim_index", null);
        Packet var15 = new Packet(var14, 337);
        int var16 = var14.length / 2;
        this.field818 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field818[var17] = var15.method241();
        }
        byte[] var18 = arg0.method309("midi_index", null);
        Packet var19 = new Packet(var18, 337);
        int var20 = var18.length;
        this.field819 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field819[var21] = var19.method239();
        }
        this.field821 = arg1;
        this.field820 = true;
        this.field821.method12(this, 2);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "()V")
    public final void method281() {
        this.field820 = false;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)I")
    public final int method282(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field809[arg0].length;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Z)I")
    public final int method283(boolean arg0) {
        if (arg0) {
            this.field807 = !this.field807;
        }
        return this.field818.length;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IIII)I")
    public final int method284(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = (arg3 << 8) + arg0;
        for (int var7 = 0; var7 < this.field814.length; var7++) {
            if (this.field814[var7] == var6) {
                if (arg1 == 0) {
                    return this.field815[var7];
                }
                return this.field816[var7];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IZ)V")
    public final void method285(int arg0, boolean arg1) {
        int var3 = this.field814.length;
        if (arg0 != 0) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field817[var4] != 0) {
                this.method292(0, (byte) 2, this.field816[var4], 3);
                this.method292(0, (byte) 2, this.field815[var4], 3);
            }
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(II)Z")
    public final boolean method286(int arg0, int arg1) {
        if (arg1 != -47341) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field814.length; var3++) {
            if (this.field816[var3] == arg0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(II)I")
    public final int method287(int arg0, int arg1) {
        return arg0 == 4 ? this.field813[arg1] & 0xFF : this.field808;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(IZ)Z")
    public final boolean method288(int arg0, boolean arg1) {
        if (arg1) {
            this.field807 = !this.field807;
        }
        return this.field819[arg0] == 1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(I)V")
    public final void method279(int arg0) {
        this.method289(0, arg0);
    }

    @OriginalMember(owner = "vb", name = "d", descriptor = "(II)V")
    public final void method289(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field809.length || arg1 < 0 || arg1 > this.field809[arg0].length || this.field809[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field826;
        synchronized (this.field826) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field826.method265(); var4 != null; var4 = (OnDemandRequest) this.field826.method266(true)) {
                if (var4.field723 == arg0 && var4.field724 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field723 = arg0;
            var5.field724 = arg1;
            var5.field727 = true;
            LinkList var6 = this.field827;
            synchronized (this.field827) {
                this.field827.method255(var5);
            }
            this.field826.method263(var5);
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "()I")
    public final int method290() {
        DoublyLinkList var1 = this.field826;
        synchronized (this.field826) {
            return this.field826.method267();
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "()Lnb;")
    public final OnDemandRequest method291() {
        LinkList var1 = this.field830;
        OnDemandRequest var2;
        synchronized (this.field830) {
            var2 = (OnDemandRequest) this.field830.method257();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field826;
        synchronized (this.field826) {
            var2.method121();
        }
        if (var2.field725 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field725));
            while (true) {
                if (this.field842.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field842, var4, this.field842.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field725 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field725[var7] = this.field842[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IBII)V")
    public final void method292(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field821.field1356[0] == null || this.field809[arg3][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field821.field1356[arg3 + 1].method301(0, arg2);
        if (this.method299(this.field810[arg3][arg2], (byte) 2, var5, this.field809[arg3][arg2])) {
            return;
        }
        this.field811[arg3][arg2] = arg1;
        if (arg1 > this.field812) {
            this.field812 = arg1;
        }
        this.field834++;
        if (arg0 != 0) {
            this.field807 = !this.field807;
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(I)V")
    public final void method293(int arg0) {
        if (arg0 >= 0) {
            this.field807 = !this.field807;
        }
        LinkList var2 = this.field831;
        synchronized (this.field831) {
            this.field831.method262();
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZII)V")
    public final void method294(boolean arg0, int arg1, int arg2) {
        if (this.field821.field1356[0] == null || (this.field809[arg1][arg2] == 0 || (this.field811[arg1][arg2] == 0 || this.field812 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field723 = arg1;
        if (arg0) {
            return;
        }
        var4.field724 = arg2;
        var4.field727 = false;
        LinkList var5 = this.field831;
        synchronized (this.field831) {
            this.field831.method255(var4);
        }
    }

    @OriginalMember(owner = "vb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field820) {
                this.field846++;
                byte var1 = 20;
                if (this.field812 == 0 && this.field821.field1356[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field823 = true;
                for (int var2 = 0; var2 < 100 && this.field823; var2++) {
                    this.field823 = false;
                    this.method295(1);
                    this.method296(-193);
                    if (this.field824 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method297(true);
                    if (this.field836 != null) {
                        this.method298(19519);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field829.method258(); var4 != null; var4 = (OnDemandRequest) this.field829.method260(true)) {
                    if (var4.field727) {
                        var3 = true;
                        var4.field726++;
                        if (var4.field726 > 50) {
                            var4.field726 = 0;
                            this.method300(var4, 231);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field829.method258(); var5 != null; var5 = (OnDemandRequest) this.field829.method260(true)) {
                        var3 = true;
                        var5.field726++;
                        if (var5.field726 > 50) {
                            var5.field726 = 0;
                            this.method300(var5, 231);
                        }
                    }
                }
                if (var3) {
                    this.field843++;
                    if (this.field843 > 750) {
                        try {
                            this.field835.close();
                        } catch (Exception var8) {
                        }
                        this.field835 = null;
                        this.field836 = null;
                        this.field837 = null;
                        this.field840 = 0;
                    }
                } else {
                    this.field843 = 0;
                    this.field832 = "";
                }
                if (this.field821.field1220 && this.field835 != null && this.field837 != null && (this.field812 > 0 || this.field821.field1356[0] == null)) {
                    this.field844++;
                    if (this.field844 > 500) {
                        this.field844 = 0;
                        this.field841[0] = 0;
                        this.field841[1] = 0;
                        this.field841[2] = 0;
                        this.field841[3] = 10;
                        try {
                            this.field837.write(this.field841, 0, 4);
                        } catch (IOException var7) {
                            this.field843 = 5000;
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
        if (arg0 < 1 || arg0 > 1) {
            return;
        }
        LinkList var2 = this.field827;
        OnDemandRequest var3;
        synchronized (this.field827) {
            var3 = (OnDemandRequest) this.field827.method257();
        }
        while (var3 != null) {
            this.field823 = true;
            byte[] var4 = null;
            if (this.field821.field1356[0] != null) {
                var4 = this.field821.field1356[var3.field723 + 1].method301(0, var3.field724);
            }
            if (!this.method299(this.field810[var3.field723][var3.field724], (byte) 2, var4, this.field809[var3.field723][var3.field724])) {
                var4 = null;
            }
            LinkList var5 = this.field827;
            synchronized (this.field827) {
                if (var4 == null) {
                    this.field828.method255(var3);
                } else {
                    var3.field725 = var4;
                    LinkList var6 = this.field830;
                    synchronized (this.field830) {
                        this.field830.method255(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field827.method257();
            }
        }
    }

    @OriginalMember(owner = "vb", name = "d", descriptor = "(I)V")
    private final void method296(int arg0) {
        this.field824 = 0;
        this.field825 = 0;
        if (arg0 >= 0) {
            this.field807 = !this.field807;
        }
        for (OnDemandRequest var2 = (OnDemandRequest) this.field829.method258(); var2 != null; var2 = (OnDemandRequest) this.field829.method260(true)) {
            if (var2.field727) {
                this.field824++;
            } else {
                this.field825++;
            }
        }
        while (this.field824 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field828.method257();
            if (var3 == null) {
                break;
            }
            if (this.field811[var3.field723][var3.field724] != 0) {
                this.field833++;
            }
            this.field811[var3.field723][var3.field724] = 0;
            this.field829.method255(var3);
            this.field824++;
            this.method300(var3, 231);
            this.field823 = true;
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(Z)V")
    private final void method297(boolean arg0) {
        if (!arg0) {
            return;
        }
        while (this.field824 == 0) {
            if (this.field825 >= 10 || this.field812 == 0) {
                return;
            }
            LinkList var2 = this.field831;
            OnDemandRequest var3;
            synchronized (this.field831) {
                var3 = (OnDemandRequest) this.field831.method257();
            }
            while (var3 != null) {
                if (this.field811[var3.field723][var3.field724] != 0) {
                    this.field811[var3.field723][var3.field724] = 0;
                    this.field829.method255(var3);
                    this.method300(var3, 231);
                    this.field823 = true;
                    if (this.field833 < this.field834) {
                        this.field833++;
                    }
                    this.field832 = "Loading extra files - " + this.field833 * 100 / this.field834 + "%";
                    this.field825++;
                    if (this.field825 == 10) {
                        return;
                    }
                }
                LinkList var4 = this.field831;
                synchronized (this.field831) {
                    var3 = (OnDemandRequest) this.field831.method257();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field811[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field812) {
                        var6[var8] = 0;
                        OnDemandRequest var9 = new OnDemandRequest();
                        var9.field723 = var5;
                        var9.field724 = var8;
                        var9.field727 = false;
                        this.field829.method255(var9);
                        this.method300(var9, 231);
                        this.field823 = true;
                        if (this.field833 < this.field834) {
                            this.field833++;
                        }
                        this.field832 = "Loading extra files - " + this.field833 * 100 / this.field834 + "%";
                        this.field825++;
                        if (this.field825 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field812--;
        }
    }

    @OriginalMember(owner = "vb", name = "e", descriptor = "(I)V")
    private final void method298(int arg0) {
        if (arg0 != 19519) {
            return;
        }
        try {
            int var2 = this.field836.available();
            if (this.field840 == 0 && var2 >= 6) {
                this.field823 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field836.read(this.field841, var3, 6 - var3)) {
                }
                int var4 = this.field841[0] & 0xFF;
                int var5 = ((this.field841[1] & 0xFF) << 8) + (this.field841[2] & 0xFF);
                int var6 = ((this.field841[3] & 0xFF) << 8) + (this.field841[4] & 0xFF);
                int var7 = this.field841[5] & 0xFF;
                this.field838 = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.field829.method258(); var8 != null; var8 = (OnDemandRequest) this.field829.method260(true)) {
                    if (var8.field723 == var4 && var8.field724 == var5) {
                        this.field838 = var8;
                    }
                    if (this.field838 != null) {
                        var8.field726 = 0;
                    }
                }
                if (this.field838 != null) {
                    this.field843 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field838.field725 = null;
                        if (this.field838.field727) {
                            LinkList var9 = this.field830;
                            synchronized (this.field830) {
                                this.field830.method255(this.field838);
                            }
                        } else {
                            this.field838.method120();
                        }
                        this.field838 = null;
                    } else {
                        if (this.field838.field725 == null && var7 == 0) {
                            this.field838.field725 = new byte[var6];
                        }
                        if (this.field838.field725 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field839 = var7 * 500;
                this.field840 = 500;
                if (this.field840 > var6 - var7 * 500) {
                    this.field840 = var6 - var7 * 500;
                }
            }
            if (this.field840 > 0 && var2 >= this.field840) {
                this.field823 = true;
                byte[] var10 = this.field841;
                int var11 = 0;
                if (this.field838 != null) {
                    var10 = this.field838.field725;
                    var11 = this.field839;
                }
                for (int var12 = 0; var12 < this.field840; var12 += this.field836.read(var10, var11 + var12, this.field840 - var12)) {
                }
                if (this.field840 + this.field839 >= var10.length && this.field838 != null) {
                    if (this.field821.field1356[0] != null) {
                        this.field821.field1356[this.field838.field723 + 1].method302(var10, true, this.field838.field724, var10.length);
                    }
                    if (!this.field838.field727 && this.field838.field723 == 3) {
                        this.field838.field727 = true;
                        this.field838.field723 = 93;
                    }
                    if (this.field838.field727) {
                        LinkList var13 = this.field830;
                        synchronized (this.field830) {
                            this.field830.method255(this.field838);
                        }
                    } else {
                        this.field838.method120();
                    }
                }
                this.field840 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field835.close();
            } catch (Exception var15) {
            }
            this.field835 = null;
            this.field836 = null;
            this.field837 = null;
            this.field840 = 0;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IB[BI)Z")
    private final boolean method299(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg2 == null || arg2.length < 2) {
            return false;
        }
        int var5 = arg2.length - 2;
        int var6 = ((arg2[var5] & 0xFF) << 8) + (arg2[var5 + 1] & 0xFF);
        if (arg1 != 2) {
            this.field808 = -486;
        }
        this.field822.reset();
        this.field822.update(arg2, 0, var5);
        int var7 = (int) this.field822.getValue();
        if (arg3 == var6) {
            return arg0 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lnb;I)V")
    private final void method300(OnDemandRequest arg0, int arg1) {
        if (arg1 <= 0) {
            return;
        }
        try {
            if (this.field835 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field845 < 5000L) {
                    return;
                }
                this.field845 = var3;
                this.field835 = this.field821.method464(client.field1229 + 43594);
                this.field836 = this.field835.getInputStream();
                this.field837 = this.field835.getOutputStream();
                this.field837.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field836.read();
                }
                this.field843 = 0;
            }
            this.field841[0] = (byte) arg0.field723;
            this.field841[1] = (byte) (arg0.field724 >> 8);
            this.field841[2] = (byte) arg0.field724;
            if (arg0.field727) {
                this.field841[3] = 2;
            } else if (this.field821.field1220) {
                this.field841[3] = 0;
            } else {
                this.field841[3] = 1;
            }
            this.field837.write(this.field841, 0, 4);
            this.field844 = 0;
        } catch (IOException var8) {
            try {
                this.field835.close();
            } catch (Exception var7) {
            }
            this.field835 = null;
            this.field836 = null;
            this.field837 = null;
            this.field840 = 0;
        }
    }
}
