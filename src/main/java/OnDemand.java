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
    private boolean field814 = false;

    @OriginalMember(owner = "ub", name = "b", descriptor = "Z")
    private boolean field815 = false;

    @OriginalMember(owner = "ub", name = "c", descriptor = "I")
    private int field816 = 131;

    @OriginalMember(owner = "ub", name = "d", descriptor = "I")
    private int field817 = 2;

    @OriginalMember(owner = "ub", name = "e", descriptor = "I")
    private int field818 = 964;

    @OriginalMember(owner = "ub", name = "g", descriptor = "B")
    private byte field820 = 50;

    @OriginalMember(owner = "ub", name = "h", descriptor = "B")
    private byte field821 = -126;

    @OriginalMember(owner = "ub", name = "i", descriptor = "[[I")
    private int[][] field822 = new int[4][];

    @OriginalMember(owner = "ub", name = "j", descriptor = "[[I")
    private int[][] field823 = new int[4][];

    @OriginalMember(owner = "ub", name = "k", descriptor = "[[B")
    private byte[][] field824 = new byte[4][];

    @OriginalMember(owner = "ub", name = "t", descriptor = "Z")
    private boolean field833 = true;

    @OriginalMember(owner = "ub", name = "v", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field835 = new CRC32();

    @OriginalMember(owner = "ub", name = "w", descriptor = "Z")
    private boolean field836 = false;

    @OriginalMember(owner = "ub", name = "z", descriptor = "Lpb;")
    private DoublyLinkList field839 = new DoublyLinkList(true);

    @OriginalMember(owner = "ub", name = "A", descriptor = "Lob;")
    private LinkList field840 = new LinkList(6);

    @OriginalMember(owner = "ub", name = "B", descriptor = "Lob;")
    private LinkList field841 = new LinkList(6);

    @OriginalMember(owner = "ub", name = "C", descriptor = "Lob;")
    private LinkList field842 = new LinkList(6);

    @OriginalMember(owner = "ub", name = "D", descriptor = "Lob;")
    private LinkList field843 = new LinkList(6);

    @OriginalMember(owner = "ub", name = "E", descriptor = "Lob;")
    private LinkList field844 = new LinkList(6);

    @OriginalMember(owner = "ub", name = "F", descriptor = "Ljava/lang/String;")
    public String field845 = "";

    @OriginalMember(owner = "ub", name = "P", descriptor = "[B")
    private byte[] field855 = new byte[500];

    @OriginalMember(owner = "ub", name = "Q", descriptor = "[B")
    private byte[] field856 = new byte[65000];

    @OriginalMember(owner = "ub", name = "f", descriptor = "I")
    private int field819;

    @OriginalMember(owner = "ub", name = "l", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "ub", name = "x", descriptor = "I")
    private int field837;

    @OriginalMember(owner = "ub", name = "y", descriptor = "I")
    private int field838;

    @OriginalMember(owner = "ub", name = "G", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "ub", name = "H", descriptor = "I")
    private int field847;

    @OriginalMember(owner = "ub", name = "L", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "ub", name = "N", descriptor = "I")
    private int field853;

    @OriginalMember(owner = "ub", name = "O", descriptor = "I")
    private int field854;

    @OriginalMember(owner = "ub", name = "R", descriptor = "I")
    private int field857;

    @OriginalMember(owner = "ub", name = "S", descriptor = "I")
    private int field858;

    @OriginalMember(owner = "ub", name = "U", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "ub", name = "T", descriptor = "J")
    private long field859;

    @OriginalMember(owner = "ub", name = "M", descriptor = "Lmb;")
    private OnDemandRequest field852;

    @OriginalMember(owner = "ub", name = "u", descriptor = "Lclient;")
    private client field834;

    @OriginalMember(owner = "ub", name = "J", descriptor = "Ljava/io/InputStream;")
    private InputStream field849;

    @OriginalMember(owner = "ub", name = "K", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field850;

    @OriginalMember(owner = "ub", name = "I", descriptor = "Ljava/net/Socket;")
    private Socket field848;

    @OriginalMember(owner = "ub", name = "m", descriptor = "[B")
    private byte[] field826;

    @OriginalMember(owner = "ub", name = "n", descriptor = "[I")
    private int[] field827;

    @OriginalMember(owner = "ub", name = "o", descriptor = "[I")
    private int[] field828;

    @OriginalMember(owner = "ub", name = "p", descriptor = "[I")
    private int[] field829;

    @OriginalMember(owner = "ub", name = "q", descriptor = "[I")
    private int[] field830;

    @OriginalMember(owner = "ub", name = "r", descriptor = "[I")
    private int[] field831;

    @OriginalMember(owner = "ub", name = "s", descriptor = "[I")
    private int[] field832;

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lxb;Lclient;)V")
    public final void method270(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method299(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(var26, -26728);
            this.field822[var4] = new int[var27];
            this.field824[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field822[var4][var29] = var28.method231();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method299(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(var22, -26728);
            this.field823[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field823[var6][var25] = var24.method234();
            }
        }
        byte[] var7 = arg0.method299("model_index", null);
        int var8 = this.field822[0].length;
        this.field826 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field826[var9] = var7[var9];
            } else {
                this.field826[var9] = 0;
            }
        }
        byte[] var10 = arg0.method299("map_index", null);
        Packet var11 = new Packet(var10, -26728);
        int var12 = var10.length / 7;
        this.field827 = new int[var12];
        this.field828 = new int[var12];
        this.field829 = new int[var12];
        this.field830 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field827[var13] = var11.method231();
            this.field828[var13] = var11.method231();
            this.field829[var13] = var11.method231();
            this.field830[var13] = var11.method229();
        }
        byte[] var14 = arg0.method299("anim_index", null);
        Packet var15 = new Packet(var14, -26728);
        int var16 = var14.length / 2;
        this.field831 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field831[var17] = var15.method231();
        }
        byte[] var18 = arg0.method299("midi_index", null);
        Packet var19 = new Packet(var18, -26728);
        int var20 = var18.length;
        this.field832 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field832[var21] = var19.method229();
        }
        this.field834 = arg1;
        this.field833 = true;
        this.field834.method12(this, 2);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "()V")
    public final void method271() {
        this.field833 = false;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IB)I")
    public final int method272(int arg0, byte arg1) {
        return arg1 == -73 ? this.field822[arg0].length : 2;
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(I)I")
    public final int method273(int arg0) {
        return arg0 == -1919 ? this.field831.length : 3;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIII)I")
    public final int method274(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg3 << 8) + arg0;
        int var6 = 69 / arg1;
        for (int var7 = 0; var7 < this.field827.length; var7++) {
            if (this.field827[var7] == var5) {
                if (arg2 == 0) {
                    return this.field828[var7];
                }
                return this.field829[var7];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BZ)V")
    public final void method275(byte arg0, boolean arg1) {
        if (arg0 != -34) {
            this.field815 = !this.field815;
        }
        int var3 = this.field827.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field830[var4] != 0) {
                this.method282((byte) 2, this.field829[var4], 3, 8);
                this.method282((byte) 2, this.field828[var4], 3, 8);
            }
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(II)Z")
    public final boolean method276(int arg0, int arg1) {
        label29: while (true) {
            if (arg1 >= 0) {
                int var4 = 1;
                while (true) {
                    if (var4 <= 0) {
                        continue label29;
                    }
                    var4++;
                }
            }
            for (int var3 = 0; var3 < this.field827.length; var3++) {
                if (this.field829[var3] == arg0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(II)I")
    public final int method277(int arg0, int arg1) {
        return arg1 == 0 ? this.field826[arg0] & 0xFF : this.field816;
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(II)Z")
    public final boolean method278(int arg0, int arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return this.field832[arg1] == 1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(I)V")
    public final void method269(int arg0) {
        this.method279(0, arg0);
    }

    @OriginalMember(owner = "ub", name = "d", descriptor = "(II)V")
    public final void method279(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field822.length || arg1 < 0 || arg1 > this.field822[arg0].length || this.field822[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field839;
        synchronized (this.field839) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field839.method255(); var4 != null; var4 = (OnDemandRequest) this.field839.method256(0)) {
                if (var4.field730 == arg0 && var4.field731 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field730 = arg0;
            var5.field731 = arg1;
            var5.field734 = true;
            LinkList var6 = this.field840;
            synchronized (this.field840) {
                this.field840.method245(var5);
            }
            this.field839.method253(var5);
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "()I")
    public final int method280() {
        DoublyLinkList var1 = this.field839;
        synchronized (this.field839) {
            return this.field839.method257();
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "()Lmb;")
    public final OnDemandRequest method281() {
        LinkList var1 = this.field843;
        OnDemandRequest var2;
        synchronized (this.field843) {
            var2 = (OnDemandRequest) this.field843.method247();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field839;
        synchronized (this.field839) {
            var2.method107();
        }
        if (var2.field732 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field732));
            while (true) {
                if (this.field856.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field856, var4, this.field856.length - var4);
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
            var2.field732[var7] = this.field856[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BIII)V")
    public final void method282(byte arg0, int arg1, int arg2, int arg3) {
        if (this.field834.field1240[0] == null || this.field822[arg2][arg1] == 0) {
            return;
        }
        byte[] var5 = this.field834.field1240[arg2 + 1].method291(arg1, 8);
        if (arg3 < 8 || arg3 > 8) {
            this.field814 = !this.field814;
        }
        if (this.method289(var5, (byte) 50, this.field823[arg2][arg1], this.field822[arg2][arg1])) {
            return;
        }
        this.field824[arg2][arg1] = arg0;
        if (arg0 > this.field825) {
            this.field825 = arg0;
        }
        this.field847++;
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(I)V")
    public final void method283(int arg0) {
        LinkList var2 = this.field844;
        synchronized (this.field844) {
            this.field844.method252();
        }
        if (arg0 != 0) {
            this.field817 = -53;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(III)V")
    public final void method284(int arg0, int arg1, int arg2) {
        if (arg1 != 47179) {
            this.field815 = !this.field815;
        }
        if (this.field834.field1240[0] == null || (this.field822[arg0][arg2] == 0 || (this.field824[arg0][arg2] == 0 || this.field825 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field730 = arg0;
        var4.field731 = arg2;
        var4.field734 = false;
        LinkList var5 = this.field844;
        synchronized (this.field844) {
            this.field844.method245(var4);
        }
    }

    @OriginalMember(owner = "ub", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field833) {
                this.field860++;
                byte var1 = 20;
                if (this.field825 == 0 && this.field834.field1240[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field836 = true;
                for (int var2 = 0; var2 < 100 && this.field836; var2++) {
                    this.field836 = false;
                    this.method285((byte) 2);
                    this.method286(0);
                    if (this.field837 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method287(964);
                    if (this.field849 != null) {
                        this.method288(this.field819);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field842.method248(); var4 != null; var4 = (OnDemandRequest) this.field842.method250(0)) {
                    if (var4.field734) {
                        var3 = true;
                        var4.field733++;
                        if (var4.field733 > 50) {
                            var4.field733 = 0;
                            this.method290(var4, (byte) -126);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field842.method248(); var5 != null; var5 = (OnDemandRequest) this.field842.method250(0)) {
                        var3 = true;
                        var5.field733++;
                        if (var5.field733 > 50) {
                            var5.field733 = 0;
                            this.method290(var5, (byte) -126);
                        }
                    }
                }
                if (var3) {
                    this.field857++;
                    if (this.field857 > 750) {
                        try {
                            this.field848.close();
                        } catch (Exception var8) {
                        }
                        this.field848 = null;
                        this.field849 = null;
                        this.field850 = null;
                        this.field854 = 0;
                    }
                } else {
                    this.field857 = 0;
                    this.field845 = "";
                }
                if (this.field834.field1398 && this.field848 != null && this.field850 != null && (this.field825 > 0 || this.field834.field1240[0] == null)) {
                    this.field858++;
                    if (this.field858 > 500) {
                        this.field858 = 0;
                        this.field855[0] = 0;
                        this.field855[1] = 0;
                        this.field855[2] = 0;
                        this.field855[3] = 10;
                        try {
                            this.field850.write(this.field855, 0, 4);
                        } catch (IOException var7) {
                            this.field857 = 5000;
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
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        LinkList var4 = this.field840;
        OnDemandRequest var5;
        synchronized (this.field840) {
            var5 = (OnDemandRequest) this.field840.method247();
        }
        while (var5 != null) {
            this.field836 = true;
            byte[] var6 = null;
            if (this.field834.field1240[0] != null) {
                var6 = this.field834.field1240[var5.field730 + 1].method291(var5.field731, 8);
            }
            if (!this.method289(var6, (byte) 50, this.field823[var5.field730][var5.field731], this.field822[var5.field730][var5.field731])) {
                var6 = null;
            }
            LinkList var7 = this.field840;
            synchronized (this.field840) {
                if (var6 == null) {
                    this.field841.method245(var5);
                } else {
                    var5.field732 = var6;
                    LinkList var8 = this.field843;
                    synchronized (this.field843) {
                        this.field843.method245(var5);
                    }
                }
                var5 = (OnDemandRequest) this.field840.method247();
            }
        }
    }

    @OriginalMember(owner = "ub", name = "d", descriptor = "(I)V")
    private final void method286(int arg0) {
        this.field837 = 0;
        this.field838 = 0;
        OnDemandRequest var2 = (OnDemandRequest) this.field842.method248();
        if (arg0 != 0) {
            this.field819 = 124;
        }
        while (var2 != null) {
            if (var2.field734) {
                this.field837++;
            } else {
                this.field838++;
            }
            var2 = (OnDemandRequest) this.field842.method250(0);
        }
        while (this.field837 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field841.method247();
            if (var3 == null) {
                break;
            }
            if (this.field824[var3.field730][var3.field731] != 0) {
                this.field846++;
            }
            this.field824[var3.field730][var3.field731] = 0;
            this.field842.method245(var3);
            this.field837++;
            this.method290(var3, (byte) -126);
            this.field836 = true;
        }
    }

    @OriginalMember(owner = "ub", name = "e", descriptor = "(I)V")
    private final void method287(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.field837 == 0) {
            if (this.field838 >= 10 || this.field825 == 0) {
                return;
            }
            LinkList var3 = this.field844;
            OnDemandRequest var4;
            synchronized (this.field844) {
                var4 = (OnDemandRequest) this.field844.method247();
            }
            while (var4 != null) {
                if (this.field824[var4.field730][var4.field731] != 0) {
                    this.field824[var4.field730][var4.field731] = 0;
                    this.field842.method245(var4);
                    this.method290(var4, (byte) -126);
                    this.field836 = true;
                    if (this.field846 < this.field847) {
                        this.field846++;
                    }
                    this.field845 = "Loading extra files - " + this.field846 * 100 / this.field847 + "%";
                    this.field838++;
                    if (this.field838 == 10) {
                        return;
                    }
                }
                LinkList var5 = this.field844;
                synchronized (this.field844) {
                    var4 = (OnDemandRequest) this.field844.method247();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field824[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field825) {
                        var7[var9] = 0;
                        OnDemandRequest var10 = new OnDemandRequest();
                        var10.field730 = var6;
                        var10.field731 = var9;
                        var10.field734 = false;
                        this.field842.method245(var10);
                        this.method290(var10, (byte) -126);
                        this.field836 = true;
                        if (this.field846 < this.field847) {
                            this.field846++;
                        }
                        this.field845 = "Loading extra files - " + this.field846 * 100 / this.field847 + "%";
                        this.field838++;
                        if (this.field838 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field825--;
        }
    }

    @OriginalMember(owner = "ub", name = "f", descriptor = "(I)V")
    private final void method288(int arg0) {
        if (arg0 != 0) {
            return;
        }
        try {
            int var2 = this.field849.available();
            if (this.field854 == 0 && var2 >= 6) {
                this.field836 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field849.read(this.field855, var3, 6 - var3)) {
                }
                int var4 = this.field855[0] & 0xFF;
                int var5 = ((this.field855[1] & 0xFF) << 8) + (this.field855[2] & 0xFF);
                int var6 = ((this.field855[3] & 0xFF) << 8) + (this.field855[4] & 0xFF);
                int var7 = this.field855[5] & 0xFF;
                this.field852 = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.field842.method248(); var8 != null; var8 = (OnDemandRequest) this.field842.method250(0)) {
                    if (var8.field730 == var4 && var8.field731 == var5) {
                        this.field852 = var8;
                    }
                    if (this.field852 != null) {
                        var8.field733 = 0;
                    }
                }
                if (this.field852 != null) {
                    this.field857 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field852.field732 = null;
                        if (this.field852.field734) {
                            LinkList var9 = this.field843;
                            synchronized (this.field843) {
                                this.field843.method245(this.field852);
                            }
                        } else {
                            this.field852.method106();
                        }
                        this.field852 = null;
                    } else {
                        if (this.field852.field732 == null && var7 == 0) {
                            this.field852.field732 = new byte[var6];
                        }
                        if (this.field852.field732 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field853 = var7 * 500;
                this.field854 = 500;
                if (this.field854 > var6 - var7 * 500) {
                    this.field854 = var6 - var7 * 500;
                }
            }
            if (this.field854 > 0 && var2 >= this.field854) {
                this.field836 = true;
                byte[] var10 = this.field855;
                int var11 = 0;
                if (this.field852 != null) {
                    var10 = this.field852.field732;
                    var11 = this.field853;
                }
                for (int var12 = 0; var12 < this.field854; var12 += this.field849.read(var10, var11 + var12, this.field854 - var12)) {
                }
                if (this.field854 + this.field853 >= var10.length && this.field852 != null) {
                    if (this.field834.field1240[0] != null) {
                        this.field834.field1240[this.field852.field730 + 1].method292(7, var10, this.field852.field731, var10.length);
                    }
                    if (!this.field852.field734 && this.field852.field730 == 3) {
                        this.field852.field734 = true;
                        this.field852.field730 = 93;
                    }
                    if (this.field852.field734) {
                        LinkList var13 = this.field843;
                        synchronized (this.field843) {
                            this.field843.method245(this.field852);
                        }
                    } else {
                        this.field852.method106();
                    }
                }
                this.field854 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field848.close();
            } catch (Exception var15) {
            }
            this.field848 = null;
            this.field849 = null;
            this.field850 = null;
            this.field854 = 0;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "([BBII)Z")
    private final boolean method289(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field835.reset();
        if (this.field820 != arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field835.update(arg0, 0, var5);
        int var8 = (int) this.field835.getValue();
        if (arg3 == var6) {
            return arg2 == var8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lmb;B)V")
    private final void method290(OnDemandRequest arg0, byte arg1) {
        if (this.field821 != arg1) {
            return;
        }
        try {
            if (this.field848 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field859 < 4000L) {
                    return;
                }
                this.field859 = var3;
                this.field848 = this.field834.method562(client.field1510 + 43594);
                this.field849 = this.field848.getInputStream();
                this.field850 = this.field848.getOutputStream();
                this.field850.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field849.read();
                }
                this.field857 = 0;
            }
            this.field855[0] = (byte) arg0.field730;
            this.field855[1] = (byte) (arg0.field731 >> 8);
            this.field855[2] = (byte) arg0.field731;
            if (arg0.field734) {
                this.field855[3] = 2;
            } else if (this.field834.field1398) {
                this.field855[3] = 0;
            } else {
                this.field855[3] = 1;
            }
            this.field850.write(this.field855, 0, 4);
            this.field858 = 0;
            this.field851 = -10000;
        } catch (IOException var8) {
            try {
                this.field848.close();
            } catch (Exception var7) {
            }
            this.field848 = null;
            this.field849 = null;
            this.field850 = null;
            this.field854 = 0;
            this.field851++;
        }
    }
}
