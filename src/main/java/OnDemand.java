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

    @OriginalMember(owner = "vb", name = "a", descriptor = "I")
    private int field810 = -33617;

    @OriginalMember(owner = "vb", name = "b", descriptor = "B")
    private byte field811 = 8;

    @OriginalMember(owner = "vb", name = "c", descriptor = "I")
    private int field812 = 7;

    @OriginalMember(owner = "vb", name = "d", descriptor = "Z")
    private boolean field813 = true;

    @OriginalMember(owner = "vb", name = "e", descriptor = "I")
    private int field814 = 6;

    @OriginalMember(owner = "vb", name = "f", descriptor = "B")
    private byte field815 = 3;

    @OriginalMember(owner = "vb", name = "g", descriptor = "B")
    private byte field816 = 79;

    @OriginalMember(owner = "vb", name = "h", descriptor = "[[I")
    private int[][] field817 = new int[4][];

    @OriginalMember(owner = "vb", name = "i", descriptor = "[[I")
    private int[][] field818 = new int[4][];

    @OriginalMember(owner = "vb", name = "j", descriptor = "[[B")
    private byte[][] field819 = new byte[4][];

    @OriginalMember(owner = "vb", name = "s", descriptor = "Z")
    private boolean field828 = true;

    @OriginalMember(owner = "vb", name = "u", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field830 = new CRC32();

    @OriginalMember(owner = "vb", name = "v", descriptor = "Z")
    private boolean field831 = false;

    @OriginalMember(owner = "vb", name = "y", descriptor = "Lqb;")
    private DoublyLinkList field834 = new DoublyLinkList(2);

    @OriginalMember(owner = "vb", name = "z", descriptor = "Lpb;")
    private LinkList field835 = new LinkList((byte) -118);

    @OriginalMember(owner = "vb", name = "A", descriptor = "Lpb;")
    private LinkList field836 = new LinkList((byte) -118);

    @OriginalMember(owner = "vb", name = "B", descriptor = "Lpb;")
    private LinkList field837 = new LinkList((byte) -118);

    @OriginalMember(owner = "vb", name = "C", descriptor = "Lpb;")
    private LinkList field838 = new LinkList((byte) -118);

    @OriginalMember(owner = "vb", name = "D", descriptor = "Lpb;")
    private LinkList field839 = new LinkList((byte) -118);

    @OriginalMember(owner = "vb", name = "E", descriptor = "Ljava/lang/String;")
    public String field840 = "";

    @OriginalMember(owner = "vb", name = "N", descriptor = "[B")
    private byte[] field849 = new byte[500];

    @OriginalMember(owner = "vb", name = "O", descriptor = "[B")
    private byte[] field850 = new byte[65000];

    @OriginalMember(owner = "vb", name = "k", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "vb", name = "w", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "vb", name = "x", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "vb", name = "F", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "vb", name = "G", descriptor = "I")
    private int field842;

    @OriginalMember(owner = "vb", name = "L", descriptor = "I")
    private int field847;

    @OriginalMember(owner = "vb", name = "M", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "vb", name = "P", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "vb", name = "Q", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "vb", name = "S", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "vb", name = "R", descriptor = "J")
    private long field853;

    @OriginalMember(owner = "vb", name = "K", descriptor = "Lnb;")
    private OnDemandRequest field846;

    @OriginalMember(owner = "vb", name = "t", descriptor = "Lclient;")
    private client field829;

    @OriginalMember(owner = "vb", name = "I", descriptor = "Ljava/io/InputStream;")
    private InputStream field844;

    @OriginalMember(owner = "vb", name = "J", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field845;

    @OriginalMember(owner = "vb", name = "H", descriptor = "Ljava/net/Socket;")
    private Socket field843;

    @OriginalMember(owner = "vb", name = "l", descriptor = "[B")
    private byte[] field821;

    @OriginalMember(owner = "vb", name = "m", descriptor = "[I")
    private int[] field822;

    @OriginalMember(owner = "vb", name = "n", descriptor = "[I")
    private int[] field823;

    @OriginalMember(owner = "vb", name = "o", descriptor = "[I")
    private int[] field824;

    @OriginalMember(owner = "vb", name = "p", descriptor = "[I")
    private int[] field825;

    @OriginalMember(owner = "vb", name = "q", descriptor = "[I")
    private int[] field826;

    @OriginalMember(owner = "vb", name = "r", descriptor = "[I")
    private int[] field827;

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lyb;Lclient;)V")
    public final void method280(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method309(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(16, var26);
            this.field817[var4] = new int[var27];
            this.field819[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field817[var4][var29] = var28.method241();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method309(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(16, var22);
            this.field818[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field818[var6][var25] = var24.method244();
            }
        }
        byte[] var7 = arg0.method309("model_index", null);
        int var8 = this.field817[0].length;
        this.field821 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field821[var9] = var7[var9];
            } else {
                this.field821[var9] = 0;
            }
        }
        byte[] var10 = arg0.method309("map_index", null);
        Packet var11 = new Packet(16, var10);
        int var12 = var10.length / 7;
        this.field822 = new int[var12];
        this.field823 = new int[var12];
        this.field824 = new int[var12];
        this.field825 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field822[var13] = var11.method241();
            this.field823[var13] = var11.method241();
            this.field824[var13] = var11.method241();
            this.field825[var13] = var11.method239();
        }
        byte[] var14 = arg0.method309("anim_index", null);
        Packet var15 = new Packet(16, var14);
        int var16 = var14.length / 2;
        this.field826 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field826[var17] = var15.method241();
        }
        byte[] var18 = arg0.method309("midi_index", null);
        Packet var19 = new Packet(16, var18);
        int var20 = var18.length;
        this.field827 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field827[var21] = var19.method239();
        }
        this.field829 = arg1;
        this.field828 = true;
        this.field829.method12(this, 2);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "()V")
    public final void method281() {
        this.field828 = false;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IB)I")
    public final int method282(int arg0, byte arg1) {
        if (this.field815 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field817[arg0].length;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(I)I")
    public final int method283(int arg0) {
        if (arg0 != 3) {
            this.field813 = !this.field813;
        }
        return this.field826.length;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IIII)I")
    public final int method284(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg1 << 8) + arg2;
        for (int var6 = 0; var6 < this.field822.length; var6++) {
            if (this.field822[var6] == var5) {
                if (arg3 == 0) {
                    return this.field823[var6];
                }
                return this.field824[var6];
            }
        }
        return arg0 == 31009 ? -1 : 3;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZZ)V")
    public final void method285(boolean arg0, boolean arg1) {
        int var3 = this.field822.length;
        if (arg1) {
            this.field814 = 187;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field825[var4] != 0) {
                this.method292(3, this.field824[var4], (byte) 2, 33601);
                this.method292(3, this.field823[var4], (byte) 2, 33601);
            }
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)Z")
    public final boolean method286(int arg0, int arg1) {
        if (arg1 != 30646) {
            this.field812 = -227;
        }
        for (int var3 = 0; var3 < this.field822.length; var3++) {
            if (this.field824[var3] == arg0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(IB)I")
    public final int method287(int arg0, byte arg1) {
        if (arg1 == 1) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return this.field821[arg0] & 0xFF;
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(II)Z")
    public final boolean method288(int arg0, int arg1) {
        if (arg0 != -31662) {
            this.field810 = 394;
        }
        return this.field827[arg1] == 1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(I)V")
    public final void method279(int arg0) {
        this.method289(0, arg0);
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(II)V")
    public final void method289(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field817.length || arg1 < 0 || arg1 > this.field817[arg0].length || this.field817[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field834;
        synchronized (this.field834) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field834.method265(); var4 != null; var4 = (OnDemandRequest) this.field834.method266(-536)) {
                if (var4.field730 == arg0 && var4.field731 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field730 = arg0;
            var5.field731 = arg1;
            var5.field734 = true;
            LinkList var6 = this.field835;
            synchronized (this.field835) {
                this.field835.method255(var5);
            }
            this.field834.method263(var5);
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "()I")
    public final int method290() {
        DoublyLinkList var1 = this.field834;
        synchronized (this.field834) {
            return this.field834.method267();
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "()Lnb;")
    public final OnDemandRequest method291() {
        LinkList var1 = this.field838;
        OnDemandRequest var2;
        synchronized (this.field838) {
            var2 = (OnDemandRequest) this.field838.method257();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field834;
        synchronized (this.field834) {
            var2.method121();
        }
        if (var2.field732 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field732));
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
        var2.field732 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field732[var7] = this.field850[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IIBI)V")
    public final void method292(int arg0, int arg1, byte arg2, int arg3) {
        if (this.field829.field1558[0] == null || this.field817[arg0][arg1] == 0) {
            return;
        }
        byte[] var5 = this.field829.field1558[arg0 + 1].method301(891, arg1);
        if (arg3 != 33601) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (this.method299(var5, this.field817[arg0][arg1], this.field818[arg0][arg1], (byte) 79)) {
            return;
        }
        this.field819[arg0][arg1] = arg2;
        if (arg2 > this.field820) {
            this.field820 = arg2;
        }
        this.field842++;
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(I)V")
    public final void method293(int arg0) {
        if (arg0 < 0) {
            LinkList var2 = this.field839;
            synchronized (this.field839) {
                this.field839.method262();
            }
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(BII)V")
    public final void method294(byte arg0, int arg1, int arg2) {
        if (this.field829.field1558[0] == null || (this.field817[arg2][arg1] == 0 || (this.field819[arg2][arg1] == 0 || this.field820 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        if (arg0 != 70) {
            return;
        }
        var4.field730 = arg2;
        var4.field731 = arg1;
        var4.field734 = false;
        LinkList var5 = this.field839;
        synchronized (this.field839) {
            this.field839.method255(var4);
        }
    }

    @OriginalMember(owner = "vb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field828) {
                this.field854++;
                byte var1 = 20;
                if (this.field820 == 0 && this.field829.field1558[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field831 = true;
                for (int var2 = 0; var2 < 100 && this.field831; var2++) {
                    this.field831 = false;
                    this.method295(38100);
                    this.method296(2);
                    if (this.field832 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method297(0);
                    if (this.field844 != null) {
                        this.method298(false);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field837.method258(); var4 != null; var4 = (OnDemandRequest) this.field837.method260(-536)) {
                    if (var4.field734) {
                        var3 = true;
                        var4.field733++;
                        if (var4.field733 > 50) {
                            var4.field733 = 0;
                            this.method300(var4, (byte) 1);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field837.method258(); var5 != null; var5 = (OnDemandRequest) this.field837.method260(-536)) {
                        var3 = true;
                        var5.field733++;
                        if (var5.field733 > 50) {
                            var5.field733 = 0;
                            this.method300(var5, (byte) 1);
                        }
                    }
                }
                if (var3) {
                    this.field851++;
                    if (this.field851 > 750) {
                        try {
                            this.field843.close();
                        } catch (Exception var8) {
                        }
                        this.field843 = null;
                        this.field844 = null;
                        this.field845 = null;
                        this.field848 = 0;
                    }
                } else {
                    this.field851 = 0;
                    this.field840 = "";
                }
                if (this.field829.field1448 && this.field843 != null && this.field845 != null && (this.field820 > 0 || this.field829.field1558[0] == null)) {
                    this.field852++;
                    if (this.field852 > 500) {
                        this.field852 = 0;
                        this.field849[0] = 0;
                        this.field849[1] = 0;
                        this.field849[2] = 0;
                        this.field849[3] = 10;
                        try {
                            this.field845.write(this.field849, 0, 4);
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

    @OriginalMember(owner = "vb", name = "d", descriptor = "(I)V")
    private final void method295(int arg0) {
        LinkList var2 = this.field835;
        OnDemandRequest var3;
        synchronized (this.field835) {
            var3 = (OnDemandRequest) this.field835.method257();
        }
        if (arg0 != 38100) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (var3 != null) {
            this.field831 = true;
            byte[] var5 = null;
            if (this.field829.field1558[0] != null) {
                var5 = this.field829.field1558[var3.field730 + 1].method301(891, var3.field731);
            }
            if (!this.method299(var5, this.field817[var3.field730][var3.field731], this.field818[var3.field730][var3.field731], (byte) 79)) {
                var5 = null;
            }
            LinkList var6 = this.field835;
            synchronized (this.field835) {
                if (var5 == null) {
                    this.field836.method255(var3);
                } else {
                    var3.field732 = var5;
                    LinkList var7 = this.field838;
                    synchronized (this.field838) {
                        this.field838.method255(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field835.method257();
            }
        }
    }

    @OriginalMember(owner = "vb", name = "e", descriptor = "(I)V")
    private final void method296(int arg0) {
        if (arg0 != 2) {
            return;
        }
        this.field832 = 0;
        this.field833 = 0;
        for (OnDemandRequest var2 = (OnDemandRequest) this.field837.method258(); var2 != null; var2 = (OnDemandRequest) this.field837.method260(-536)) {
            if (var2.field734) {
                this.field832++;
            } else {
                this.field833++;
            }
        }
        while (this.field832 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field836.method257();
            if (var3 == null) {
                break;
            }
            if (this.field819[var3.field730][var3.field731] != 0) {
                this.field841++;
            }
            this.field819[var3.field730][var3.field731] = 0;
            this.field837.method255(var3);
            this.field832++;
            this.method300(var3, (byte) 1);
            this.field831 = true;
        }
    }

    @OriginalMember(owner = "vb", name = "f", descriptor = "(I)V")
    private final void method297(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.field832 == 0) {
            if (this.field833 >= 10 || this.field820 == 0) {
                return;
            }
            LinkList var3 = this.field839;
            OnDemandRequest var4;
            synchronized (this.field839) {
                var4 = (OnDemandRequest) this.field839.method257();
            }
            while (var4 != null) {
                if (this.field819[var4.field730][var4.field731] != 0) {
                    this.field819[var4.field730][var4.field731] = 0;
                    this.field837.method255(var4);
                    this.method300(var4, (byte) 1);
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
                LinkList var5 = this.field839;
                synchronized (this.field839) {
                    var4 = (OnDemandRequest) this.field839.method257();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field819[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field820) {
                        var7[var9] = 0;
                        OnDemandRequest var10 = new OnDemandRequest();
                        var10.field730 = var6;
                        var10.field731 = var9;
                        var10.field734 = false;
                        this.field837.method255(var10);
                        this.method300(var10, (byte) 1);
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

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Z)V")
    private final void method298(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        try {
            int var3 = this.field844.available();
            if (this.field848 == 0 && var3 >= 6) {
                this.field831 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field844.read(this.field849, var4, 6 - var4)) {
                }
                int var5 = this.field849[0] & 0xFF;
                int var6 = ((this.field849[1] & 0xFF) << 8) + (this.field849[2] & 0xFF);
                int var7 = ((this.field849[3] & 0xFF) << 8) + (this.field849[4] & 0xFF);
                int var8 = this.field849[5] & 0xFF;
                this.field846 = null;
                for (OnDemandRequest var9 = (OnDemandRequest) this.field837.method258(); var9 != null; var9 = (OnDemandRequest) this.field837.method260(-536)) {
                    if (var9.field730 == var5 && var9.field731 == var6) {
                        this.field846 = var9;
                    }
                    if (this.field846 != null) {
                        var9.field733 = 0;
                    }
                }
                if (this.field846 != null) {
                    this.field851 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field846.field732 = null;
                        if (this.field846.field734) {
                            LinkList var10 = this.field838;
                            synchronized (this.field838) {
                                this.field838.method255(this.field846);
                            }
                        } else {
                            this.field846.method120();
                        }
                        this.field846 = null;
                    } else {
                        if (this.field846.field732 == null && var8 == 0) {
                            this.field846.field732 = new byte[var7];
                        }
                        if (this.field846.field732 == null && var8 != 0) {
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
                this.field831 = true;
                byte[] var11 = this.field849;
                int var12 = 0;
                if (this.field846 != null) {
                    var11 = this.field846.field732;
                    var12 = this.field847;
                }
                for (int var13 = 0; var13 < this.field848; var13 += this.field844.read(var11, var12 + var13, this.field848 - var13)) {
                }
                if (this.field848 + this.field847 >= var11.length && this.field846 != null) {
                    if (this.field829.field1558[0] != null) {
                        this.field829.field1558[this.field846.field730 + 1].method302(this.field846.field731, var11, this.field811, var11.length);
                    }
                    if (!this.field846.field734 && this.field846.field730 == 3) {
                        this.field846.field734 = true;
                        this.field846.field730 = 93;
                    }
                    if (this.field846.field734) {
                        LinkList var14 = this.field838;
                        synchronized (this.field838) {
                            this.field838.method255(this.field846);
                        }
                    } else {
                        this.field846.method120();
                    }
                }
                this.field848 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field843.close();
            } catch (Exception var16) {
            }
            this.field843 = null;
            this.field844 = null;
            this.field845 = null;
            this.field848 = 0;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "([BIIB)Z")
    private final boolean method299(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field830.reset();
        if (this.field816 != arg3) {
            throw new NullPointerException();
        }
        this.field830.update(arg0, 0, var5);
        int var7 = (int) this.field830.getValue();
        if (arg1 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lnb;B)V")
    private final void method300(OnDemandRequest arg0, byte arg1) {
        if (arg1 != 1) {
            return;
        }
        boolean var3 = false;
        try {
            if (this.field843 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field853 < 5000L) {
                    return;
                }
                this.field853 = var4;
                this.field843 = this.field829.method500(client.field1300 + 43594);
                this.field844 = this.field843.getInputStream();
                this.field845 = this.field843.getOutputStream();
                this.field845.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field844.read();
                }
                this.field851 = 0;
            }
            this.field849[0] = (byte) arg0.field730;
            this.field849[1] = (byte) (arg0.field731 >> 8);
            this.field849[2] = (byte) arg0.field731;
            if (arg0.field734) {
                this.field849[3] = 2;
            } else if (this.field829.field1448) {
                this.field849[3] = 0;
            } else {
                this.field849[3] = 1;
            }
            this.field845.write(this.field849, 0, 4);
            this.field852 = 0;
        } catch (IOException var9) {
            try {
                this.field843.close();
            } catch (Exception var8) {
            }
            this.field843 = null;
            this.field844 = null;
            this.field845 = null;
            this.field848 = 0;
        }
    }
}
