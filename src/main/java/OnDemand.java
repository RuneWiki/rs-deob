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

    @OriginalMember(owner = "vb", name = "b", descriptor = "I")
    private int field837 = 593;

    @OriginalMember(owner = "vb", name = "c", descriptor = "I")
    private int field838 = 32319;

    @OriginalMember(owner = "vb", name = "e", descriptor = "Z")
    private boolean field840 = true;

    @OriginalMember(owner = "vb", name = "f", descriptor = "Z")
    private boolean field841 = true;

    @OriginalMember(owner = "vb", name = "g", descriptor = "Z")
    private boolean field842 = true;

    @OriginalMember(owner = "vb", name = "h", descriptor = "[[I")
    private int[][] field843 = new int[4][];

    @OriginalMember(owner = "vb", name = "i", descriptor = "[[I")
    private int[][] field844 = new int[4][];

    @OriginalMember(owner = "vb", name = "j", descriptor = "[[B")
    private byte[][] field845 = new byte[4][];

    @OriginalMember(owner = "vb", name = "s", descriptor = "Z")
    private boolean field854 = true;

    @OriginalMember(owner = "vb", name = "u", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field856 = new CRC32();

    @OriginalMember(owner = "vb", name = "v", descriptor = "Z")
    private boolean field857 = false;

    @OriginalMember(owner = "vb", name = "y", descriptor = "Lqb;")
    private DoublyLinkList field860 = new DoublyLinkList(false);

    @OriginalMember(owner = "vb", name = "z", descriptor = "Lpb;")
    private LinkList field861 = new LinkList(field839);

    @OriginalMember(owner = "vb", name = "A", descriptor = "Lpb;")
    private LinkList field862 = new LinkList(field839);

    @OriginalMember(owner = "vb", name = "B", descriptor = "Lpb;")
    private LinkList field863 = new LinkList(field839);

    @OriginalMember(owner = "vb", name = "C", descriptor = "Lpb;")
    private LinkList field864 = new LinkList(field839);

    @OriginalMember(owner = "vb", name = "D", descriptor = "Lpb;")
    private LinkList field865 = new LinkList(field839);

    @OriginalMember(owner = "vb", name = "E", descriptor = "Ljava/lang/String;")
    public String field866 = "";

    @OriginalMember(owner = "vb", name = "N", descriptor = "[B")
    private byte[] field875 = new byte[500];

    @OriginalMember(owner = "vb", name = "O", descriptor = "[B")
    private byte[] field876 = new byte[65000];

    @OriginalMember(owner = "vb", name = "d", descriptor = "Z")
    private static boolean field839 = true;

    @OriginalMember(owner = "vb", name = "k", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "vb", name = "w", descriptor = "I")
    private int field858;

    @OriginalMember(owner = "vb", name = "x", descriptor = "I")
    private int field859;

    @OriginalMember(owner = "vb", name = "F", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "vb", name = "G", descriptor = "I")
    private int field868;

    @OriginalMember(owner = "vb", name = "L", descriptor = "I")
    private int field873;

    @OriginalMember(owner = "vb", name = "M", descriptor = "I")
    private int field874;

    @OriginalMember(owner = "vb", name = "P", descriptor = "I")
    private int field877;

    @OriginalMember(owner = "vb", name = "Q", descriptor = "I")
    private int field878;

    @OriginalMember(owner = "vb", name = "S", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "vb", name = "R", descriptor = "J")
    private long field879;

    @OriginalMember(owner = "vb", name = "K", descriptor = "Lnb;")
    private OnDemandRequest field872;

    @OriginalMember(owner = "vb", name = "t", descriptor = "Lclient;")
    private client field855;

    @OriginalMember(owner = "vb", name = "I", descriptor = "Ljava/io/InputStream;")
    private InputStream field870;

    @OriginalMember(owner = "vb", name = "J", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field871;

    @OriginalMember(owner = "vb", name = "H", descriptor = "Ljava/net/Socket;")
    private Socket field869;

    @OriginalMember(owner = "vb", name = "l", descriptor = "[B")
    private byte[] field847;

    @OriginalMember(owner = "vb", name = "m", descriptor = "[I")
    private int[] field848;

    @OriginalMember(owner = "vb", name = "n", descriptor = "[I")
    private int[] field849;

    @OriginalMember(owner = "vb", name = "o", descriptor = "[I")
    private int[] field850;

    @OriginalMember(owner = "vb", name = "p", descriptor = "[I")
    private int[] field851;

    @OriginalMember(owner = "vb", name = "q", descriptor = "[I")
    private int[] field852;

    @OriginalMember(owner = "vb", name = "r", descriptor = "[I")
    private int[] field853;

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lyb;Lclient;)V")
    public final void method280(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method309(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(45427, var26);
            this.field843[var4] = new int[var27];
            this.field845[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field843[var4][var29] = var28.method241();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method309(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(45427, var22);
            this.field844[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field844[var6][var25] = var24.method244();
            }
        }
        byte[] var7 = arg0.method309("model_index", null);
        int var8 = this.field843[0].length;
        this.field847 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field847[var9] = var7[var9];
            } else {
                this.field847[var9] = 0;
            }
        }
        byte[] var10 = arg0.method309("map_index", null);
        Packet var11 = new Packet(45427, var10);
        int var12 = var10.length / 7;
        this.field848 = new int[var12];
        this.field849 = new int[var12];
        this.field850 = new int[var12];
        this.field851 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field848[var13] = var11.method241();
            this.field849[var13] = var11.method241();
            this.field850[var13] = var11.method241();
            this.field851[var13] = var11.method239();
        }
        byte[] var14 = arg0.method309("anim_index", null);
        Packet var15 = new Packet(45427, var14);
        int var16 = var14.length / 2;
        this.field852 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field852[var17] = var15.method241();
        }
        byte[] var18 = arg0.method309("midi_index", null);
        Packet var19 = new Packet(45427, var18);
        int var20 = var18.length;
        this.field853 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field853[var21] = var19.method239();
        }
        this.field855 = arg1;
        this.field854 = true;
        this.field855.method12(this, 2);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "()V")
    public final void method281() {
        this.field854 = false;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(BI)I")
    public final int method282(byte arg0, int arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            this.field840 = !this.field840;
        }
        return this.field843[arg1].length;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(I)I")
    public final int method283(int arg0) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field852.length;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IIII)I")
    public final int method284(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg0 << 8) + arg1;
        if (arg3 != -21445) {
            this.field837 = -418;
        }
        for (int var6 = 0; var6 < this.field848.length; var6++) {
            if (this.field848[var6] == var5) {
                if (arg2 == 0) {
                    return this.field849[var6];
                }
                return this.field850[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IZ)V")
    public final void method285(int arg0, boolean arg1) {
        if (arg0 <= 0) {
            field839 = !field839;
        }
        int var3 = this.field848.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field851[var4] != 0) {
                this.method292(8, (byte) 2, this.field850[var4], 3);
                this.method292(8, (byte) 2, this.field849[var4], 3);
            }
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZI)Z")
    public final boolean method286(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.field848.length; var3++) {
            if (this.field850[var3] == arg1) {
                return true;
            }
        }
        if (!arg0) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)I")
    public final int method287(int arg0, int arg1) {
        return arg1 < 0 ? this.field847[arg0] & 0xFF : 4;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(ZI)Z")
    public final boolean method288(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field853[arg1] == 1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(I)V")
    public final void method279(int arg0) {
        this.method289(0, arg0);
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(II)V")
    public final void method289(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field843.length || arg1 < 0 || arg1 > this.field843[arg0].length || this.field843[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field860;
        synchronized (this.field860) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field860.method265(); var4 != null; var4 = (OnDemandRequest) this.field860.method266(17736)) {
                if (var4.field749 == arg0 && var4.field750 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field749 = arg0;
            var5.field750 = arg1;
            var5.field753 = true;
            LinkList var6 = this.field861;
            synchronized (this.field861) {
                this.field861.method255(var5);
            }
            this.field860.method263(var5);
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "()I")
    public final int method290() {
        DoublyLinkList var1 = this.field860;
        synchronized (this.field860) {
            return this.field860.method267();
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "()Lnb;")
    public final OnDemandRequest method291() {
        LinkList var1 = this.field864;
        OnDemandRequest var2;
        synchronized (this.field864) {
            var2 = (OnDemandRequest) this.field864.method257();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field860;
        synchronized (this.field860) {
            var2.method121();
        }
        if (var2.field751 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field751));
            while (true) {
                if (this.field876.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field876, var4, this.field876.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field751 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field751[var7] = this.field876[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IBII)V")
    public final void method292(int arg0, byte arg1, int arg2, int arg3) {
        if (arg0 != 8) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field855.field1418[0] == null || this.field843[arg3][arg2] == 0) {
            return;
        }
        byte[] var6 = this.field855.field1418[arg3 + 1].method301(arg2, (byte) 66);
        if (this.method299(var6, this.field843[arg3][arg2], false, this.field844[arg3][arg2])) {
            return;
        }
        this.field845[arg3][arg2] = arg1;
        if (arg1 > this.field846) {
            this.field846 = arg1;
        }
        this.field868++;
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(I)V")
    public final void method293(int arg0) {
        LinkList var2 = this.field865;
        synchronized (this.field865) {
            this.field865.method262();
        }
        if (arg0 < 9 || arg0 > 9) {
            this.field838 = -117;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(III)V")
    public final void method294(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field841 = !this.field841;
        }
        if (this.field855.field1418[0] == null || (this.field843[arg1][arg2] == 0 || (this.field845[arg1][arg2] == 0 || this.field846 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field749 = arg1;
        var4.field750 = arg2;
        var4.field753 = false;
        LinkList var5 = this.field865;
        synchronized (this.field865) {
            this.field865.method255(var4);
        }
    }

    @OriginalMember(owner = "vb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field854) {
                this.field880++;
                byte var1 = 20;
                if (this.field846 == 0 && this.field855.field1418[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field857 = true;
                for (int var2 = 0; var2 < 100 && this.field857; var2++) {
                    this.field857 = false;
                    this.method295((byte) 3);
                    this.method296(-529);
                    if (this.field858 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method297(true);
                    if (this.field870 != null) {
                        this.method298(0);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field863.method258(); var4 != null; var4 = (OnDemandRequest) this.field863.method260(17736)) {
                    if (var4.field753) {
                        var3 = true;
                        var4.field752++;
                        if (var4.field752 > 50) {
                            var4.field752 = 0;
                            this.method300(false, var4);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field863.method258(); var5 != null; var5 = (OnDemandRequest) this.field863.method260(17736)) {
                        var3 = true;
                        var5.field752++;
                        if (var5.field752 > 50) {
                            var5.field752 = 0;
                            this.method300(false, var5);
                        }
                    }
                }
                if (var3) {
                    this.field877++;
                    if (this.field877 > 750) {
                        try {
                            this.field869.close();
                        } catch (Exception var8) {
                        }
                        this.field869 = null;
                        this.field870 = null;
                        this.field871 = null;
                        this.field874 = 0;
                    }
                } else {
                    this.field877 = 0;
                    this.field866 = "";
                }
                if (this.field855.field1513 && this.field869 != null && this.field871 != null && (this.field846 > 0 || this.field855.field1418[0] == null)) {
                    this.field878++;
                    if (this.field878 > 500) {
                        this.field878 = 0;
                        this.field875[0] = 0;
                        this.field875[1] = 0;
                        this.field875[2] = 0;
                        this.field875[3] = 10;
                        try {
                            this.field871.write(this.field875, 0, 4);
                        } catch (IOException var7) {
                            this.field877 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(B)V")
    private final void method295(byte arg0) {
        if (arg0 != 3) {
            return;
        }
        LinkList var2 = this.field861;
        OnDemandRequest var3;
        synchronized (this.field861) {
            var3 = (OnDemandRequest) this.field861.method257();
        }
        while (var3 != null) {
            this.field857 = true;
            byte[] var4 = null;
            if (this.field855.field1418[0] != null) {
                var4 = this.field855.field1418[var3.field749 + 1].method301(var3.field750, (byte) 66);
            }
            if (!this.method299(var4, this.field843[var3.field749][var3.field750], false, this.field844[var3.field749][var3.field750])) {
                var4 = null;
            }
            LinkList var5 = this.field861;
            synchronized (this.field861) {
                if (var4 == null) {
                    this.field862.method255(var3);
                } else {
                    var3.field751 = var4;
                    LinkList var6 = this.field864;
                    synchronized (this.field864) {
                        this.field864.method255(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field861.method257();
            }
        }
    }

    @OriginalMember(owner = "vb", name = "d", descriptor = "(I)V")
    private final void method296(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        this.field858 = 0;
        this.field859 = 0;
        for (OnDemandRequest var2 = (OnDemandRequest) this.field863.method258(); var2 != null; var2 = (OnDemandRequest) this.field863.method260(17736)) {
            if (var2.field753) {
                this.field858++;
            } else {
                this.field859++;
            }
        }
        while (this.field858 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field862.method257();
            if (var3 == null) {
                break;
            }
            if (this.field845[var3.field749][var3.field750] != 0) {
                this.field867++;
            }
            this.field845[var3.field749][var3.field750] = 0;
            this.field863.method255(var3);
            this.field858++;
            this.method300(false, var3);
            this.field857 = true;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Z)V")
    private final void method297(boolean arg0) {
        if (!arg0) {
            return;
        }
        while (this.field858 == 0) {
            if (this.field859 >= 10 || this.field846 == 0) {
                return;
            }
            LinkList var2 = this.field865;
            OnDemandRequest var3;
            synchronized (this.field865) {
                var3 = (OnDemandRequest) this.field865.method257();
            }
            while (var3 != null) {
                if (this.field845[var3.field749][var3.field750] != 0) {
                    this.field845[var3.field749][var3.field750] = 0;
                    this.field863.method255(var3);
                    this.method300(false, var3);
                    this.field857 = true;
                    if (this.field867 < this.field868) {
                        this.field867++;
                    }
                    this.field866 = "Loading extra files - " + this.field867 * 100 / this.field868 + "%";
                    this.field859++;
                    if (this.field859 == 10) {
                        return;
                    }
                }
                LinkList var4 = this.field865;
                synchronized (this.field865) {
                    var3 = (OnDemandRequest) this.field865.method257();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field845[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field846) {
                        var6[var8] = 0;
                        OnDemandRequest var9 = new OnDemandRequest();
                        var9.field749 = var5;
                        var9.field750 = var8;
                        var9.field753 = false;
                        this.field863.method255(var9);
                        this.method300(false, var9);
                        this.field857 = true;
                        if (this.field867 < this.field868) {
                            this.field867++;
                        }
                        this.field866 = "Loading extra files - " + this.field867 * 100 / this.field868 + "%";
                        this.field859++;
                        if (this.field859 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field846--;
        }
    }

    @OriginalMember(owner = "vb", name = "e", descriptor = "(I)V")
    private final void method298(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        try {
            int var3 = this.field870.available();
            if (this.field874 == 0 && var3 >= 6) {
                this.field857 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field870.read(this.field875, var4, 6 - var4)) {
                }
                int var5 = this.field875[0] & 0xFF;
                int var6 = ((this.field875[1] & 0xFF) << 8) + (this.field875[2] & 0xFF);
                int var7 = ((this.field875[3] & 0xFF) << 8) + (this.field875[4] & 0xFF);
                int var8 = this.field875[5] & 0xFF;
                this.field872 = null;
                for (OnDemandRequest var9 = (OnDemandRequest) this.field863.method258(); var9 != null; var9 = (OnDemandRequest) this.field863.method260(17736)) {
                    if (var9.field749 == var5 && var9.field750 == var6) {
                        this.field872 = var9;
                    }
                    if (this.field872 != null) {
                        var9.field752 = 0;
                    }
                }
                if (this.field872 != null) {
                    this.field877 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field872.field751 = null;
                        if (this.field872.field753) {
                            LinkList var10 = this.field864;
                            synchronized (this.field864) {
                                this.field864.method255(this.field872);
                            }
                        } else {
                            this.field872.method120();
                        }
                        this.field872 = null;
                    } else {
                        if (this.field872.field751 == null && var8 == 0) {
                            this.field872.field751 = new byte[var7];
                        }
                        if (this.field872.field751 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field873 = var8 * 500;
                this.field874 = 500;
                if (this.field874 > var7 - var8 * 500) {
                    this.field874 = var7 - var8 * 500;
                }
            }
            if (this.field874 > 0 && var3 >= this.field874) {
                this.field857 = true;
                byte[] var11 = this.field875;
                int var12 = 0;
                if (this.field872 != null) {
                    var11 = this.field872.field751;
                    var12 = this.field873;
                }
                for (int var13 = 0; var13 < this.field874; var13 += this.field870.read(var11, var12 + var13, this.field874 - var13)) {
                }
                if (this.field874 + this.field873 >= var11.length && this.field872 != null) {
                    if (this.field855.field1418[0] != null) {
                        this.field855.field1418[this.field872.field749 + 1].method302(var11.length, this.field872.field750, var11, true);
                    }
                    if (!this.field872.field753 && this.field872.field749 == 3) {
                        this.field872.field753 = true;
                        this.field872.field749 = 93;
                    }
                    if (this.field872.field753) {
                        LinkList var14 = this.field864;
                        synchronized (this.field864) {
                            this.field864.method255(this.field872);
                        }
                    } else {
                        this.field872.method120();
                    }
                }
                this.field874 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field869.close();
            } catch (Exception var16) {
            }
            this.field869 = null;
            this.field870 = null;
            this.field871 = null;
            this.field874 = 0;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "([BIZI)Z")
    private final boolean method299(byte[] arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field856.reset();
        if (arg2) {
            throw new NullPointerException();
        }
        this.field856.update(arg0, 0, var5);
        int var7 = (int) this.field856.getValue();
        if (arg1 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZLnb;)V")
    private final void method300(boolean arg0, OnDemandRequest arg1) {
        if (arg0) {
            this.field837 = -150;
        }
        try {
            if (this.field869 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field879 < 5000L) {
                    return;
                }
                this.field879 = var3;
                this.field869 = this.field855.method519(client.field1378 + 43594);
                this.field870 = this.field869.getInputStream();
                this.field871 = this.field869.getOutputStream();
                this.field871.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field870.read();
                }
                this.field877 = 0;
            }
            this.field875[0] = (byte) arg1.field749;
            this.field875[1] = (byte) (arg1.field750 >> 8);
            this.field875[2] = (byte) arg1.field750;
            if (arg1.field753) {
                this.field875[3] = 2;
            } else if (this.field855.field1513) {
                this.field875[3] = 0;
            } else {
                this.field875[3] = 1;
            }
            this.field871.write(this.field875, 0, 4);
            this.field878 = 0;
        } catch (IOException var8) {
            try {
                this.field869.close();
            } catch (Exception var7) {
            }
            this.field869 = null;
            this.field870 = null;
            this.field871 = null;
            this.field874 = 0;
        }
    }
}
