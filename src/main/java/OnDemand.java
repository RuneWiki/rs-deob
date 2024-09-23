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
    private int field812 = -7326;

    @OriginalMember(owner = "vb", name = "b", descriptor = "I")
    private int field813 = 98;

    @OriginalMember(owner = "vb", name = "c", descriptor = "Z")
    private boolean field814 = false;

    @OriginalMember(owner = "vb", name = "d", descriptor = "Z")
    private boolean field815 = false;

    @OriginalMember(owner = "vb", name = "e", descriptor = "Z")
    private boolean field816 = true;

    @OriginalMember(owner = "vb", name = "f", descriptor = "Z")
    private boolean field817 = true;

    @OriginalMember(owner = "vb", name = "g", descriptor = "[[I")
    private int[][] field818 = new int[4][];

    @OriginalMember(owner = "vb", name = "h", descriptor = "[[I")
    private int[][] field819 = new int[4][];

    @OriginalMember(owner = "vb", name = "i", descriptor = "[[B")
    private byte[][] field820 = new byte[4][];

    @OriginalMember(owner = "vb", name = "r", descriptor = "Z")
    private boolean field829 = true;

    @OriginalMember(owner = "vb", name = "t", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field831 = new CRC32();

    @OriginalMember(owner = "vb", name = "u", descriptor = "Z")
    private boolean field832 = false;

    @OriginalMember(owner = "vb", name = "x", descriptor = "Lqb;")
    private DoublyLinkList field835 = new DoublyLinkList(526);

    @OriginalMember(owner = "vb", name = "y", descriptor = "Lpb;")
    private LinkList field836 = new LinkList((byte) 7);

    @OriginalMember(owner = "vb", name = "z", descriptor = "Lpb;")
    private LinkList field837 = new LinkList((byte) 7);

    @OriginalMember(owner = "vb", name = "A", descriptor = "Lpb;")
    private LinkList field838 = new LinkList((byte) 7);

    @OriginalMember(owner = "vb", name = "B", descriptor = "Lpb;")
    private LinkList field839 = new LinkList((byte) 7);

    @OriginalMember(owner = "vb", name = "C", descriptor = "Lpb;")
    private LinkList field840 = new LinkList((byte) 7);

    @OriginalMember(owner = "vb", name = "D", descriptor = "Ljava/lang/String;")
    public String field841 = "";

    @OriginalMember(owner = "vb", name = "M", descriptor = "[B")
    private byte[] field850 = new byte[500];

    @OriginalMember(owner = "vb", name = "N", descriptor = "[B")
    private byte[] field851 = new byte[65000];

    @OriginalMember(owner = "vb", name = "j", descriptor = "I")
    private int field821;

    @OriginalMember(owner = "vb", name = "v", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "vb", name = "w", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "vb", name = "E", descriptor = "I")
    private int field842;

    @OriginalMember(owner = "vb", name = "F", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "vb", name = "K", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "vb", name = "L", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "vb", name = "O", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "vb", name = "P", descriptor = "I")
    private int field853;

    @OriginalMember(owner = "vb", name = "R", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "vb", name = "Q", descriptor = "J")
    private long field854;

    @OriginalMember(owner = "vb", name = "J", descriptor = "Lnb;")
    private OnDemandRequest field847;

    @OriginalMember(owner = "vb", name = "s", descriptor = "Lclient;")
    private client field830;

    @OriginalMember(owner = "vb", name = "H", descriptor = "Ljava/io/InputStream;")
    private InputStream field845;

    @OriginalMember(owner = "vb", name = "I", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field846;

    @OriginalMember(owner = "vb", name = "G", descriptor = "Ljava/net/Socket;")
    private Socket field844;

    @OriginalMember(owner = "vb", name = "k", descriptor = "[B")
    private byte[] field822;

    @OriginalMember(owner = "vb", name = "l", descriptor = "[I")
    private int[] field823;

    @OriginalMember(owner = "vb", name = "m", descriptor = "[I")
    private int[] field824;

    @OriginalMember(owner = "vb", name = "n", descriptor = "[I")
    private int[] field825;

    @OriginalMember(owner = "vb", name = "o", descriptor = "[I")
    private int[] field826;

    @OriginalMember(owner = "vb", name = "p", descriptor = "[I")
    private int[] field827;

    @OriginalMember(owner = "vb", name = "q", descriptor = "[I")
    private int[] field828;

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lyb;Lclient;)V")
    public final void method279(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method308(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet((byte) -109, var26);
            this.field818[var4] = new int[var27];
            this.field820[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field818[var4][var29] = var28.method240();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method308(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet((byte) -109, var22);
            this.field819[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field819[var6][var25] = var24.method243();
            }
        }
        byte[] var7 = arg0.method308("model_index", null);
        int var8 = this.field818[0].length;
        this.field822 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field822[var9] = var7[var9];
            } else {
                this.field822[var9] = 0;
            }
        }
        byte[] var10 = arg0.method308("map_index", null);
        Packet var11 = new Packet((byte) -109, var10);
        int var12 = var10.length / 7;
        this.field823 = new int[var12];
        this.field824 = new int[var12];
        this.field825 = new int[var12];
        this.field826 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field823[var13] = var11.method240();
            this.field824[var13] = var11.method240();
            this.field825[var13] = var11.method240();
            this.field826[var13] = var11.method238();
        }
        byte[] var14 = arg0.method308("anim_index", null);
        Packet var15 = new Packet((byte) -109, var14);
        int var16 = var14.length / 2;
        this.field827 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field827[var17] = var15.method240();
        }
        byte[] var18 = arg0.method308("midi_index", null);
        Packet var19 = new Packet((byte) -109, var18);
        int var20 = var18.length;
        this.field828 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field828[var21] = var19.method238();
        }
        this.field830 = arg1;
        this.field829 = true;
        this.field830.method12(this, 2);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "()V")
    public final void method280() {
        this.field829 = false;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)I")
    public final int method281(int arg0, int arg1) {
        return arg1 == 0 ? this.field818[arg0].length : 2;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(B)I")
    public final int method282(byte arg0) {
        if (arg0 != 4) {
            this.field812 = -196;
        }
        return this.field827.length;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IIII)I")
    public final int method283(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg1 << 8) + arg0;
        for (int var6 = 0; var6 < this.field823.length; var6++) {
            if (this.field823[var6] == var5) {
                if (arg2 == 0) {
                    return this.field824[var6];
                }
                return this.field825[var6];
            }
        }
        if (arg3 != 5) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return -1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZI)V")
    public final void method284(boolean arg0, int arg1) {
        int var3 = this.field823.length;
        if (arg1 != 0) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field826[var4] != 0) {
                this.method291(3, false, this.field825[var4], (byte) 2);
                this.method291(3, false, this.field824[var4], (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(II)Z")
    public final boolean method285(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field823.length; var3++) {
            if (this.field825[var3] == arg0) {
                return true;
            }
        }
        if (arg1 != 9) {
            this.field816 = !this.field816;
        }
        return false;
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(II)I")
    public final int method286(int arg0, int arg1) {
        if (arg0 >= 0) {
            this.field815 = !this.field815;
        }
        return this.field822[arg1] & 0xFF;
    }

    @OriginalMember(owner = "vb", name = "d", descriptor = "(II)Z")
    public final boolean method287(int arg0, int arg1) {
        if (arg1 != -23943) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field828[arg0] == 1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(I)V")
    public final void method278(int arg0) {
        this.method288(0, arg0);
    }

    @OriginalMember(owner = "vb", name = "e", descriptor = "(II)V")
    public final void method288(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field818.length || arg1 < 0 || arg1 > this.field818[arg0].length || this.field818[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field835;
        synchronized (this.field835) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field835.method264(); var4 != null; var4 = (OnDemandRequest) this.field835.method265(-976)) {
                if (var4.field731 == arg0 && var4.field732 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field731 = arg0;
            var5.field732 = arg1;
            var5.field735 = true;
            LinkList var6 = this.field836;
            synchronized (this.field836) {
                this.field836.method254(var5);
            }
            this.field835.method262(var5);
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "()I")
    public final int method289() {
        DoublyLinkList var1 = this.field835;
        synchronized (this.field835) {
            return this.field835.method266();
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "()Lnb;")
    public final OnDemandRequest method290() {
        LinkList var1 = this.field839;
        OnDemandRequest var2;
        synchronized (this.field839) {
            var2 = (OnDemandRequest) this.field839.method256();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field835;
        synchronized (this.field835) {
            var2.method120();
        }
        if (var2.field733 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field733));
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
        var2.field733 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field733[var7] = this.field851[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IZIB)V")
    public final void method291(int arg0, boolean arg1, int arg2, byte arg3) {
        if (this.field830.field1231[0] == null || this.field818[arg0][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field830.field1231[arg0 + 1].method300(168, arg2);
        if (this.method298(var5, this.field819[arg0][arg2], -498, this.field818[arg0][arg2])) {
            return;
        }
        this.field820[arg0][arg2] = arg3;
        if (!arg1) {
            if (arg3 > this.field821) {
                this.field821 = arg3;
            }
            this.field843++;
        }
    }

    @OriginalMember(owner = "vb", name = "b", descriptor = "(I)V")
    public final void method292(int arg0) {
        if (arg0 != 0) {
            this.field812 = 461;
        }
        LinkList var2 = this.field840;
        synchronized (this.field840) {
            this.field840.method261();
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(III)V")
    public final void method293(int arg0, int arg1, int arg2) {
        if (arg2 >= 0 || (this.field830.field1231[0] == null || (this.field818[arg0][arg1] == 0 || (this.field820[arg0][arg1] == 0 || this.field821 == 0)))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field731 = arg0;
        var4.field732 = arg1;
        var4.field735 = false;
        LinkList var5 = this.field840;
        synchronized (this.field840) {
            this.field840.method254(var4);
        }
    }

    @OriginalMember(owner = "vb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field829) {
                this.field855++;
                byte var1 = 20;
                if (this.field821 == 0 && this.field830.field1231[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field832 = true;
                for (int var2 = 0; var2 < 100 && this.field832; var2++) {
                    this.field832 = false;
                    this.method294((byte) 7);
                    this.method295((byte) 6);
                    if (this.field833 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method296(412);
                    if (this.field845 != null) {
                        this.method297((byte) 29);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field838.method257(); var4 != null; var4 = (OnDemandRequest) this.field838.method259(-976)) {
                    if (var4.field735) {
                        var3 = true;
                        var4.field734++;
                        if (var4.field734 > 50) {
                            var4.field734 = 0;
                            this.method299(var4, true);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field838.method257(); var5 != null; var5 = (OnDemandRequest) this.field838.method259(-976)) {
                        var3 = true;
                        var5.field734++;
                        if (var5.field734 > 50) {
                            var5.field734 = 0;
                            this.method299(var5, true);
                        }
                    }
                }
                if (var3) {
                    this.field852++;
                    if (this.field852 > 750) {
                        try {
                            this.field844.close();
                        } catch (Exception var8) {
                        }
                        this.field844 = null;
                        this.field845 = null;
                        this.field846 = null;
                        this.field849 = 0;
                    }
                } else {
                    this.field852 = 0;
                    this.field841 = "";
                }
                if (this.field830.field1361 && this.field844 != null && this.field846 != null && (this.field821 > 0 || this.field830.field1231[0] == null)) {
                    this.field853++;
                    if (this.field853 > 500) {
                        this.field853 = 0;
                        this.field850[0] = 0;
                        this.field850[1] = 0;
                        this.field850[2] = 0;
                        this.field850[3] = 10;
                        try {
                            this.field846.write(this.field850, 0, 4);
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

    @OriginalMember(owner = "vb", name = "b", descriptor = "(B)V")
    private final void method294(byte arg0) {
        LinkList var2 = this.field836;
        OnDemandRequest var3;
        synchronized (this.field836) {
            var3 = (OnDemandRequest) this.field836.method256();
        }
        if (arg0 != 7) {
            this.field813 = 313;
        }
        while (var3 != null) {
            this.field832 = true;
            byte[] var4 = null;
            if (this.field830.field1231[0] != null) {
                var4 = this.field830.field1231[var3.field731 + 1].method300(168, var3.field732);
            }
            if (!this.method298(var4, this.field819[var3.field731][var3.field732], -498, this.field818[var3.field731][var3.field732])) {
                var4 = null;
            }
            LinkList var5 = this.field836;
            synchronized (this.field836) {
                if (var4 == null) {
                    this.field837.method254(var3);
                } else {
                    var3.field733 = var4;
                    LinkList var6 = this.field839;
                    synchronized (this.field839) {
                        this.field839.method254(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field836.method256();
            }
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(B)V")
    private final void method295(byte arg0) {
        this.field833 = 0;
        if (arg0 != 6) {
            this.field814 = !this.field814;
        }
        this.field834 = 0;
        for (OnDemandRequest var2 = (OnDemandRequest) this.field838.method257(); var2 != null; var2 = (OnDemandRequest) this.field838.method259(-976)) {
            if (var2.field735) {
                this.field833++;
            } else {
                this.field834++;
            }
        }
        while (this.field833 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field837.method256();
            if (var3 == null) {
                break;
            }
            if (this.field820[var3.field731][var3.field732] != 0) {
                this.field842++;
            }
            this.field820[var3.field731][var3.field732] = 0;
            this.field838.method254(var3);
            this.field833++;
            this.method299(var3, true);
            this.field832 = true;
        }
    }

    @OriginalMember(owner = "vb", name = "c", descriptor = "(I)V")
    private final void method296(int arg0) {
        if (arg0 <= 0) {
            return;
        }
        while (this.field833 == 0) {
            if (this.field834 >= 10 || this.field821 == 0) {
                return;
            }
            LinkList var2 = this.field840;
            OnDemandRequest var3;
            synchronized (this.field840) {
                var3 = (OnDemandRequest) this.field840.method256();
            }
            while (var3 != null) {
                if (this.field820[var3.field731][var3.field732] != 0) {
                    this.field820[var3.field731][var3.field732] = 0;
                    this.field838.method254(var3);
                    this.method299(var3, true);
                    this.field832 = true;
                    if (this.field842 < this.field843) {
                        this.field842++;
                    }
                    this.field841 = "Loading extra files - " + this.field842 * 100 / this.field843 + "%";
                    this.field834++;
                    if (this.field834 == 10) {
                        return;
                    }
                }
                LinkList var4 = this.field840;
                synchronized (this.field840) {
                    var3 = (OnDemandRequest) this.field840.method256();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field820[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field821) {
                        var6[var8] = 0;
                        OnDemandRequest var9 = new OnDemandRequest();
                        var9.field731 = var5;
                        var9.field732 = var8;
                        var9.field735 = false;
                        this.field838.method254(var9);
                        this.method299(var9, true);
                        this.field832 = true;
                        if (this.field842 < this.field843) {
                            this.field842++;
                        }
                        this.field841 = "Loading extra files - " + this.field842 * 100 / this.field843 + "%";
                        this.field834++;
                        if (this.field834 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field821--;
        }
    }

    @OriginalMember(owner = "vb", name = "d", descriptor = "(B)V")
    private final void method297(byte arg0) {
        if (arg0 != 29) {
            return;
        }
        try {
            int var2 = this.field845.available();
            if (this.field849 == 0 && var2 >= 6) {
                this.field832 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field845.read(this.field850, var3, 6 - var3)) {
                }
                int var4 = this.field850[0] & 0xFF;
                int var5 = ((this.field850[1] & 0xFF) << 8) + (this.field850[2] & 0xFF);
                int var6 = ((this.field850[3] & 0xFF) << 8) + (this.field850[4] & 0xFF);
                int var7 = this.field850[5] & 0xFF;
                this.field847 = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.field838.method257(); var8 != null; var8 = (OnDemandRequest) this.field838.method259(-976)) {
                    if (var8.field731 == var4 && var8.field732 == var5) {
                        this.field847 = var8;
                    }
                    if (this.field847 != null) {
                        var8.field734 = 0;
                    }
                }
                if (this.field847 != null) {
                    this.field852 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field847.field733 = null;
                        if (this.field847.field735) {
                            LinkList var9 = this.field839;
                            synchronized (this.field839) {
                                this.field839.method254(this.field847);
                            }
                        } else {
                            this.field847.method119();
                        }
                        this.field847 = null;
                    } else {
                        if (this.field847.field733 == null && var7 == 0) {
                            this.field847.field733 = new byte[var6];
                        }
                        if (this.field847.field733 == null && var7 != 0) {
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
                this.field832 = true;
                byte[] var10 = this.field850;
                int var11 = 0;
                if (this.field847 != null) {
                    var10 = this.field847.field733;
                    var11 = this.field848;
                }
                for (int var12 = 0; var12 < this.field849; var12 += this.field845.read(var10, var11 + var12, this.field849 - var12)) {
                }
                if (this.field849 + this.field848 >= var10.length && this.field847 != null) {
                    if (this.field830.field1231[0] != null) {
                        this.field830.field1231[this.field847.field731 + 1].method301(var10, this.field847.field732, true, var10.length);
                    }
                    if (!this.field847.field735 && this.field847.field731 == 3) {
                        this.field847.field735 = true;
                        this.field847.field731 = 93;
                    }
                    if (this.field847.field735) {
                        LinkList var13 = this.field839;
                        synchronized (this.field839) {
                            this.field839.method254(this.field847);
                        }
                    } else {
                        this.field847.method119();
                    }
                }
                this.field849 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field844.close();
            } catch (Exception var15) {
            }
            this.field844 = null;
            this.field845 = null;
            this.field846 = null;
            this.field849 = 0;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "([BIII)Z")
    private final boolean method298(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field831.reset();
        this.field831.update(arg0, 0, var5);
        if (arg2 >= 0) {
            throw new NullPointerException();
        }
        int var7 = (int) this.field831.getValue();
        if (arg3 == var6) {
            return arg1 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Lnb;Z)V")
    private final void method299(OnDemandRequest arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        try {
            if (this.field844 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field854 < 5000L) {
                    return;
                }
                this.field854 = var3;
                this.field844 = this.field830.method507(client.field1399 + 43594);
                this.field845 = this.field844.getInputStream();
                this.field846 = this.field844.getOutputStream();
                this.field846.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field845.read();
                }
                this.field852 = 0;
            }
            this.field850[0] = (byte) arg0.field731;
            this.field850[1] = (byte) (arg0.field732 >> 8);
            this.field850[2] = (byte) arg0.field732;
            if (arg0.field735) {
                this.field850[3] = 2;
            } else if (this.field830.field1361) {
                this.field850[3] = 0;
            } else {
                this.field850[3] = 1;
            }
            this.field846.write(this.field850, 0, 4);
            this.field853 = 0;
        } catch (IOException var8) {
            try {
                this.field844.close();
            } catch (Exception var7) {
            }
            this.field844 = null;
            this.field845 = null;
            this.field846 = null;
            this.field849 = 0;
        }
    }
}
