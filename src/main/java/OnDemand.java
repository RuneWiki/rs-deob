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

    @OriginalMember(owner = "ub", name = "c", descriptor = "I")
    private int field798 = 625;

    @OriginalMember(owner = "ub", name = "d", descriptor = "I")
    private int field799 = 617;

    @OriginalMember(owner = "ub", name = "e", descriptor = "Z")
    private boolean field800 = true;

    @OriginalMember(owner = "ub", name = "f", descriptor = "Z")
    private boolean field801 = true;

    @OriginalMember(owner = "ub", name = "g", descriptor = "Z")
    private boolean field802 = false;

    @OriginalMember(owner = "ub", name = "i", descriptor = "[[I")
    private int[][] field804 = new int[4][];

    @OriginalMember(owner = "ub", name = "j", descriptor = "[[I")
    private int[][] field805 = new int[4][];

    @OriginalMember(owner = "ub", name = "k", descriptor = "[[B")
    private byte[][] field806 = new byte[4][];

    @OriginalMember(owner = "ub", name = "t", descriptor = "Z")
    private boolean field815 = true;

    @OriginalMember(owner = "ub", name = "v", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field817 = new CRC32();

    @OriginalMember(owner = "ub", name = "w", descriptor = "Z")
    private boolean field818 = false;

    @OriginalMember(owner = "ub", name = "z", descriptor = "Lpb;")
    private DoublyLinkList field821 = new DoublyLinkList(-39453);

    @OriginalMember(owner = "ub", name = "A", descriptor = "Lob;")
    private LinkList field822 = new LinkList(18783);

    @OriginalMember(owner = "ub", name = "B", descriptor = "Lob;")
    private LinkList field823 = new LinkList(18783);

    @OriginalMember(owner = "ub", name = "C", descriptor = "Lob;")
    private LinkList field824 = new LinkList(18783);

    @OriginalMember(owner = "ub", name = "D", descriptor = "Lob;")
    private LinkList field825 = new LinkList(18783);

    @OriginalMember(owner = "ub", name = "E", descriptor = "Lob;")
    private LinkList field826 = new LinkList(18783);

    @OriginalMember(owner = "ub", name = "F", descriptor = "Ljava/lang/String;")
    public String field827 = "";

    @OriginalMember(owner = "ub", name = "P", descriptor = "[B")
    private byte[] field837 = new byte[500];

    @OriginalMember(owner = "ub", name = "Q", descriptor = "[B")
    private byte[] field838 = new byte[65000];

    @OriginalMember(owner = "ub", name = "b", descriptor = "I")
    private static int field797 = 1000;

    @OriginalMember(owner = "ub", name = "h", descriptor = "I")
    private int field803;

    @OriginalMember(owner = "ub", name = "l", descriptor = "I")
    private int field807;

    @OriginalMember(owner = "ub", name = "x", descriptor = "I")
    private int field819;

    @OriginalMember(owner = "ub", name = "y", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "ub", name = "G", descriptor = "I")
    private int field828;

    @OriginalMember(owner = "ub", name = "H", descriptor = "I")
    private int field829;

    @OriginalMember(owner = "ub", name = "L", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "ub", name = "N", descriptor = "I")
    private int field835;

    @OriginalMember(owner = "ub", name = "O", descriptor = "I")
    private int field836;

    @OriginalMember(owner = "ub", name = "R", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "ub", name = "S", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "ub", name = "U", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "ub", name = "T", descriptor = "J")
    private long field841;

    @OriginalMember(owner = "ub", name = "M", descriptor = "Lmb;")
    private OnDemandRequest field834;

    @OriginalMember(owner = "ub", name = "u", descriptor = "Lclient;")
    private client field816;

    @OriginalMember(owner = "ub", name = "J", descriptor = "Ljava/io/InputStream;")
    private InputStream field831;

    @OriginalMember(owner = "ub", name = "K", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field832;

    @OriginalMember(owner = "ub", name = "I", descriptor = "Ljava/net/Socket;")
    private Socket field830;

    @OriginalMember(owner = "ub", name = "m", descriptor = "[B")
    private byte[] field808;

    @OriginalMember(owner = "ub", name = "n", descriptor = "[I")
    private int[] field809;

    @OriginalMember(owner = "ub", name = "o", descriptor = "[I")
    private int[] field810;

    @OriginalMember(owner = "ub", name = "p", descriptor = "[I")
    private int[] field811;

    @OriginalMember(owner = "ub", name = "q", descriptor = "[I")
    private int[] field812;

    @OriginalMember(owner = "ub", name = "r", descriptor = "[I")
    private int[] field813;

    @OriginalMember(owner = "ub", name = "s", descriptor = "[I")
    private int[] field814;

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lxb;Lclient;)V")
    public final void method270(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method299(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(field797, var26);
            this.field804[var4] = new int[var27];
            this.field806[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field804[var4][var29] = var28.method231();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method299(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(field797, var22);
            this.field805[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field805[var6][var25] = var24.method234();
            }
        }
        byte[] var7 = arg0.method299("model_index", null);
        int var8 = this.field804[0].length;
        this.field808 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field808[var9] = var7[var9];
            } else {
                this.field808[var9] = 0;
            }
        }
        byte[] var10 = arg0.method299("map_index", null);
        Packet var11 = new Packet(field797, var10);
        int var12 = var10.length / 7;
        this.field809 = new int[var12];
        this.field810 = new int[var12];
        this.field811 = new int[var12];
        this.field812 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field809[var13] = var11.method231();
            this.field810[var13] = var11.method231();
            this.field811[var13] = var11.method231();
            this.field812[var13] = var11.method229();
        }
        byte[] var14 = arg0.method299("anim_index", null);
        Packet var15 = new Packet(field797, var14);
        int var16 = var14.length / 2;
        this.field813 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field813[var17] = var15.method231();
        }
        byte[] var18 = arg0.method299("midi_index", null);
        Packet var19 = new Packet(field797, var18);
        int var20 = var18.length;
        this.field814 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field814[var21] = var19.method229();
        }
        this.field816 = arg1;
        this.field815 = true;
        this.field816.method12(this, 2);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "()V")
    public final void method271() {
        this.field815 = false;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(II)I")
    public final int method272(int arg0, int arg1) {
        if (arg0 != 26014) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field804[arg1].length;
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(I)I")
    public final int method273(int arg0) {
        return arg0 == -3812 ? this.field813.length : this.field799;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIII)I")
    public final int method274(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 5 || arg0 > 5) {
            this.field801 = !this.field801;
        }
        int var5 = (arg1 << 8) + arg3;
        for (int var6 = 0; var6 < this.field809.length; var6++) {
            if (this.field809[var6] == var5) {
                if (arg2 == 0) {
                    return this.field810[var6];
                }
                return this.field811[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(ZI)V")
    public final void method275(boolean arg0, int arg1) {
        int var3 = this.field809.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field812[var4] != 0) {
                this.method282(this.field803, 3, (byte) 2, this.field811[var4]);
                this.method282(this.field803, 3, (byte) 2, this.field810[var4]);
            }
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(II)Z")
    public final boolean method276(int arg0, int arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field809.length; var3++) {
            if (this.field811[var3] == arg1) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IB)I")
    public final int method277(int arg0, byte arg1) {
        if (arg1 == 6) {
            boolean var3 = false;
        } else {
            this.field802 = !this.field802;
        }
        return this.field808[arg0] & 0xFF;
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(II)Z")
    public final boolean method278(int arg0, int arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return this.field814[arg1] == 1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(I)V")
    public final void method269(int arg0) {
        this.method279(0, arg0);
    }

    @OriginalMember(owner = "ub", name = "d", descriptor = "(II)V")
    public final void method279(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field804.length || arg1 < 0 || arg1 > this.field804[arg0].length || this.field804[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field821;
        synchronized (this.field821) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field821.method255(); var4 != null; var4 = (OnDemandRequest) this.field821.method256((byte) 71)) {
                if (var4.field716 == arg0 && var4.field717 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field716 = arg0;
            var5.field717 = arg1;
            var5.field720 = true;
            LinkList var6 = this.field822;
            synchronized (this.field822) {
                this.field822.method245(var5);
            }
            this.field821.method253(var5);
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "()I")
    public final int method280() {
        DoublyLinkList var1 = this.field821;
        synchronized (this.field821) {
            return this.field821.method257();
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "()Lmb;")
    public final OnDemandRequest method281() {
        LinkList var1 = this.field825;
        OnDemandRequest var2;
        synchronized (this.field825) {
            var2 = (OnDemandRequest) this.field825.method247();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field821;
        synchronized (this.field821) {
            var2.method107();
        }
        if (var2.field718 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field718));
            while (true) {
                if (this.field838.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field838, var4, this.field838.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field718 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field718[var7] = this.field838[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIBI)V")
    public final void method282(int arg0, int arg1, byte arg2, int arg3) {
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field816.field1232[0] == null || this.field804[arg1][arg3] == 0) {
            return;
        }
        byte[] var6 = this.field816.field1232[arg1 + 1].method291(8, arg3);
        if (this.method289(this.field804[arg1][arg3], false, this.field805[arg1][arg3], var6)) {
            return;
        }
        this.field806[arg1][arg3] = arg2;
        if (arg2 > this.field807) {
            this.field807 = arg2;
        }
        this.field829++;
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(I)V")
    public final void method283(int arg0) {
        int var2 = 94 / arg0;
        LinkList var3 = this.field826;
        synchronized (this.field826) {
            this.field826.method252();
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IBI)V")
    public final void method284(int arg0, byte arg1, int arg2) {
        if (this.field816.field1232[0] == null || (this.field804[arg0][arg2] == 0 || (this.field806[arg0][arg2] == 0 || this.field807 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        if (arg1 != 3) {
            this.field802 = !this.field802;
        }
        var4.field716 = arg0;
        var4.field717 = arg2;
        var4.field720 = false;
        LinkList var5 = this.field826;
        synchronized (this.field826) {
            this.field826.method245(var4);
        }
    }

    @OriginalMember(owner = "ub", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field815) {
                this.field842++;
                byte var1 = 20;
                if (this.field807 == 0 && this.field816.field1232[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field818 = true;
                for (int var2 = 0; var2 < 100 && this.field818; var2++) {
                    this.field818 = false;
                    this.method285(960);
                    this.method286(4204);
                    if (this.field819 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method287(275);
                    if (this.field831 != null) {
                        this.method288(2645);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field824.method248(); var4 != null; var4 = (OnDemandRequest) this.field824.method250((byte) 71)) {
                    if (var4.field720) {
                        var3 = true;
                        var4.field719++;
                        if (var4.field719 > 50) {
                            var4.field719 = 0;
                            this.method290(557, var4);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field824.method248(); var5 != null; var5 = (OnDemandRequest) this.field824.method250((byte) 71)) {
                        var3 = true;
                        var5.field719++;
                        if (var5.field719 > 50) {
                            var5.field719 = 0;
                            this.method290(557, var5);
                        }
                    }
                }
                if (var3) {
                    this.field839++;
                    if (this.field839 > 750) {
                        try {
                            this.field830.close();
                        } catch (Exception var8) {
                        }
                        this.field830 = null;
                        this.field831 = null;
                        this.field832 = null;
                        this.field836 = 0;
                    }
                } else {
                    this.field839 = 0;
                    this.field827 = "";
                }
                if (this.field816.field1337 && this.field830 != null && this.field832 != null && (this.field807 > 0 || this.field816.field1232[0] == null)) {
                    this.field840++;
                    if (this.field840 > 500) {
                        this.field840 = 0;
                        this.field837[0] = 0;
                        this.field837[1] = 0;
                        this.field837[2] = 0;
                        this.field837[3] = 10;
                        try {
                            this.field832.write(this.field837, 0, 4);
                        } catch (IOException var7) {
                            this.field839 = 5000;
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
        int var2 = 11 / arg0;
        LinkList var3 = this.field822;
        OnDemandRequest var4;
        synchronized (this.field822) {
            var4 = (OnDemandRequest) this.field822.method247();
        }
        while (var4 != null) {
            this.field818 = true;
            byte[] var5 = null;
            if (this.field816.field1232[0] != null) {
                var5 = this.field816.field1232[var4.field716 + 1].method291(8, var4.field717);
            }
            if (!this.method289(this.field804[var4.field716][var4.field717], false, this.field805[var4.field716][var4.field717], var5)) {
                var5 = null;
            }
            LinkList var6 = this.field822;
            synchronized (this.field822) {
                if (var5 == null) {
                    this.field823.method245(var4);
                } else {
                    var4.field718 = var5;
                    LinkList var7 = this.field825;
                    synchronized (this.field825) {
                        this.field825.method245(var4);
                    }
                }
                var4 = (OnDemandRequest) this.field822.method247();
            }
        }
    }

    @OriginalMember(owner = "ub", name = "e", descriptor = "(I)V")
    private final void method286(int arg0) {
        this.field819 = 0;
        this.field820 = 0;
        if (arg0 != 4204) {
            this.field800 = !this.field800;
        }
        for (OnDemandRequest var2 = (OnDemandRequest) this.field824.method248(); var2 != null; var2 = (OnDemandRequest) this.field824.method250((byte) 71)) {
            if (var2.field720) {
                this.field819++;
            } else {
                this.field820++;
            }
        }
        while (this.field819 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field823.method247();
            if (var3 == null) {
                break;
            }
            if (this.field806[var3.field716][var3.field717] != 0) {
                this.field828++;
            }
            this.field806[var3.field716][var3.field717] = 0;
            this.field824.method245(var3);
            this.field819++;
            this.method290(557, var3);
            this.field818 = true;
        }
    }

    @OriginalMember(owner = "ub", name = "f", descriptor = "(I)V")
    private final void method287(int arg0) {
        int var2 = 94 / arg0;
        while (this.field819 == 0) {
            if (this.field820 >= 10 || this.field807 == 0) {
                return;
            }
            LinkList var3 = this.field826;
            OnDemandRequest var4;
            synchronized (this.field826) {
                var4 = (OnDemandRequest) this.field826.method247();
            }
            while (var4 != null) {
                if (this.field806[var4.field716][var4.field717] != 0) {
                    this.field806[var4.field716][var4.field717] = 0;
                    this.field824.method245(var4);
                    this.method290(557, var4);
                    this.field818 = true;
                    if (this.field828 < this.field829) {
                        this.field828++;
                    }
                    this.field827 = "Loading extra files - " + this.field828 * 100 / this.field829 + "%";
                    this.field820++;
                    if (this.field820 == 10) {
                        return;
                    }
                }
                LinkList var5 = this.field826;
                synchronized (this.field826) {
                    var4 = (OnDemandRequest) this.field826.method247();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field806[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field807) {
                        var7[var9] = 0;
                        OnDemandRequest var10 = new OnDemandRequest();
                        var10.field716 = var6;
                        var10.field717 = var9;
                        var10.field720 = false;
                        this.field824.method245(var10);
                        this.method290(557, var10);
                        this.field818 = true;
                        if (this.field828 < this.field829) {
                            this.field828++;
                        }
                        this.field827 = "Loading extra files - " + this.field828 * 100 / this.field829 + "%";
                        this.field820++;
                        if (this.field820 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field807--;
        }
    }

    @OriginalMember(owner = "ub", name = "g", descriptor = "(I)V")
    private final void method288(int arg0) {
        if (arg0 != 2645) {
            return;
        }
        try {
            int var2 = this.field831.available();
            if (this.field836 == 0 && var2 >= 6) {
                this.field818 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field831.read(this.field837, var3, 6 - var3)) {
                }
                int var4 = this.field837[0] & 0xFF;
                int var5 = ((this.field837[1] & 0xFF) << 8) + (this.field837[2] & 0xFF);
                int var6 = ((this.field837[3] & 0xFF) << 8) + (this.field837[4] & 0xFF);
                int var7 = this.field837[5] & 0xFF;
                this.field834 = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.field824.method248(); var8 != null; var8 = (OnDemandRequest) this.field824.method250((byte) 71)) {
                    if (var8.field716 == var4 && var8.field717 == var5) {
                        this.field834 = var8;
                    }
                    if (this.field834 != null) {
                        var8.field719 = 0;
                    }
                }
                if (this.field834 != null) {
                    this.field839 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field834.field718 = null;
                        if (this.field834.field720) {
                            LinkList var9 = this.field825;
                            synchronized (this.field825) {
                                this.field825.method245(this.field834);
                            }
                        } else {
                            this.field834.method106();
                        }
                        this.field834 = null;
                    } else {
                        if (this.field834.field718 == null && var7 == 0) {
                            this.field834.field718 = new byte[var6];
                        }
                        if (this.field834.field718 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field835 = var7 * 500;
                this.field836 = 500;
                if (this.field836 > var6 - var7 * 500) {
                    this.field836 = var6 - var7 * 500;
                }
            }
            if (this.field836 > 0 && var2 >= this.field836) {
                this.field818 = true;
                byte[] var10 = this.field837;
                int var11 = 0;
                if (this.field834 != null) {
                    var10 = this.field834.field718;
                    var11 = this.field835;
                }
                for (int var12 = 0; var12 < this.field836; var12 += this.field831.read(var10, var11 + var12, this.field836 - var12)) {
                }
                if (this.field836 + this.field835 >= var10.length && this.field834 != null) {
                    if (this.field816.field1232[0] != null) {
                        this.field816.field1232[this.field834.field716 + 1].method292(this.field834.field717, this.field798, var10, var10.length);
                    }
                    if (!this.field834.field720 && this.field834.field716 == 3) {
                        this.field834.field720 = true;
                        this.field834.field716 = 93;
                    }
                    if (this.field834.field720) {
                        LinkList var13 = this.field825;
                        synchronized (this.field825) {
                            this.field825.method245(this.field834);
                        }
                    } else {
                        this.field834.method106();
                    }
                }
                this.field836 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field830.close();
            } catch (Exception var15) {
            }
            this.field830 = null;
            this.field831 = null;
            this.field832 = null;
            this.field836 = 0;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IZI[B)Z")
    private final boolean method289(int arg0, boolean arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        if (arg1) {
            throw new NullPointerException();
        }
        this.field817.reset();
        this.field817.update(arg3, 0, var5);
        int var7 = (int) this.field817.getValue();
        if (arg0 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(ILmb;)V")
    private final void method290(int arg0, OnDemandRequest arg1) {
        int var3 = 99 / arg0;
        try {
            if (this.field830 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field841 < 4000L) {
                    return;
                }
                this.field841 = var4;
                this.field830 = this.field816.method495(client.field1292 + 43594);
                this.field831 = this.field830.getInputStream();
                this.field832 = this.field830.getOutputStream();
                this.field832.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field831.read();
                }
                this.field839 = 0;
            }
            this.field837[0] = (byte) arg1.field716;
            this.field837[1] = (byte) (arg1.field717 >> 8);
            this.field837[2] = (byte) arg1.field717;
            if (arg1.field720) {
                this.field837[3] = 2;
            } else if (this.field816.field1337) {
                this.field837[3] = 0;
            } else {
                this.field837[3] = 1;
            }
            this.field832.write(this.field837, 0, 4);
            this.field840 = 0;
            this.field833 = -10000;
        } catch (IOException var9) {
            try {
                this.field830.close();
            } catch (Exception var8) {
            }
            this.field830 = null;
            this.field831 = null;
            this.field832 = null;
            this.field836 = 0;
            this.field833++;
        }
    }
}
