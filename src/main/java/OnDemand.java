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

    @OriginalMember(owner = "ub", name = "b", descriptor = "I")
    private int field803 = 106;

    @OriginalMember(owner = "ub", name = "c", descriptor = "Z")
    private boolean field804 = true;

    @OriginalMember(owner = "ub", name = "d", descriptor = "Z")
    private boolean field805 = true;

    @OriginalMember(owner = "ub", name = "e", descriptor = "Z")
    private boolean field806 = false;

    @OriginalMember(owner = "ub", name = "g", descriptor = "Z")
    private boolean field808 = false;

    @OriginalMember(owner = "ub", name = "h", descriptor = "[[I")
    private int[][] field809 = new int[4][];

    @OriginalMember(owner = "ub", name = "i", descriptor = "[[I")
    private int[][] field810 = new int[4][];

    @OriginalMember(owner = "ub", name = "j", descriptor = "[[B")
    private byte[][] field811 = new byte[4][];

    @OriginalMember(owner = "ub", name = "s", descriptor = "Z")
    private boolean field820 = true;

    @OriginalMember(owner = "ub", name = "u", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field822 = new CRC32();

    @OriginalMember(owner = "ub", name = "v", descriptor = "Z")
    private boolean field823 = false;

    @OriginalMember(owner = "ub", name = "y", descriptor = "Lpb;")
    private DoublyLinkList field826 = new DoublyLinkList(false);

    @OriginalMember(owner = "ub", name = "z", descriptor = "Lob;")
    private LinkList field827 = new LinkList(false);

    @OriginalMember(owner = "ub", name = "A", descriptor = "Lob;")
    private LinkList field828 = new LinkList(false);

    @OriginalMember(owner = "ub", name = "B", descriptor = "Lob;")
    private LinkList field829 = new LinkList(false);

    @OriginalMember(owner = "ub", name = "C", descriptor = "Lob;")
    private LinkList field830 = new LinkList(false);

    @OriginalMember(owner = "ub", name = "D", descriptor = "Lob;")
    private LinkList field831 = new LinkList(false);

    @OriginalMember(owner = "ub", name = "E", descriptor = "Ljava/lang/String;")
    public String field832 = "";

    @OriginalMember(owner = "ub", name = "O", descriptor = "[B")
    private byte[] field842 = new byte[500];

    @OriginalMember(owner = "ub", name = "P", descriptor = "[B")
    private byte[] field843 = new byte[65000];

    @OriginalMember(owner = "ub", name = "f", descriptor = "I")
    private int field807;

    @OriginalMember(owner = "ub", name = "k", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "ub", name = "w", descriptor = "I")
    private int field824;

    @OriginalMember(owner = "ub", name = "x", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "ub", name = "F", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "ub", name = "G", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "ub", name = "K", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "ub", name = "M", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "ub", name = "N", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "ub", name = "Q", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "ub", name = "R", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "ub", name = "T", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "ub", name = "S", descriptor = "J")
    private long field846;

    @OriginalMember(owner = "ub", name = "L", descriptor = "Lmb;")
    private OnDemandRequest field839;

    @OriginalMember(owner = "ub", name = "t", descriptor = "Lclient;")
    private client field821;

    @OriginalMember(owner = "ub", name = "I", descriptor = "Ljava/io/InputStream;")
    private InputStream field836;

    @OriginalMember(owner = "ub", name = "J", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field837;

    @OriginalMember(owner = "ub", name = "H", descriptor = "Ljava/net/Socket;")
    private Socket field835;

    @OriginalMember(owner = "ub", name = "l", descriptor = "[B")
    private byte[] field813;

    @OriginalMember(owner = "ub", name = "m", descriptor = "[I")
    private int[] field814;

    @OriginalMember(owner = "ub", name = "n", descriptor = "[I")
    private int[] field815;

    @OriginalMember(owner = "ub", name = "o", descriptor = "[I")
    private int[] field816;

    @OriginalMember(owner = "ub", name = "p", descriptor = "[I")
    private int[] field817;

    @OriginalMember(owner = "ub", name = "q", descriptor = "[I")
    private int[] field818;

    @OriginalMember(owner = "ub", name = "r", descriptor = "[I")
    private int[] field819;

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lxb;Lclient;)V")
    public final void method266(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method295(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(var26, 185);
            this.field809[var4] = new int[var27];
            this.field811[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field809[var4][var29] = var28.method227();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method295(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(var22, 185);
            this.field810[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field810[var6][var25] = var24.method230();
            }
        }
        byte[] var7 = arg0.method295("model_index", null);
        int var8 = this.field809[0].length;
        this.field813 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field813[var9] = var7[var9];
            } else {
                this.field813[var9] = 0;
            }
        }
        byte[] var10 = arg0.method295("map_index", null);
        Packet var11 = new Packet(var10, 185);
        int var12 = var10.length / 7;
        this.field814 = new int[var12];
        this.field815 = new int[var12];
        this.field816 = new int[var12];
        this.field817 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field814[var13] = var11.method227();
            this.field815[var13] = var11.method227();
            this.field816[var13] = var11.method227();
            this.field817[var13] = var11.method225();
        }
        byte[] var14 = arg0.method295("anim_index", null);
        Packet var15 = new Packet(var14, 185);
        int var16 = var14.length / 2;
        this.field818 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field818[var17] = var15.method227();
        }
        byte[] var18 = arg0.method295("midi_index", null);
        Packet var19 = new Packet(var18, 185);
        int var20 = var18.length;
        this.field819 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field819[var21] = var19.method225();
        }
        this.field821 = arg1;
        this.field820 = true;
        this.field821.method12(this, 2);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "()V")
    public final void method267() {
        this.field820 = false;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(II)I")
    public final int method268(int arg0, int arg1) {
        while (arg1 >= 0) {
            this.field805 = !this.field805;
        }
        return this.field809[arg0].length;
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(I)I")
    public final int method269(int arg0) {
        return arg0 < 0 ? this.field818.length : 4;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIIZ)I")
    public final int method270(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = (arg1 << 8) + arg2;
        if (!arg3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < this.field814.length; var7++) {
            if (this.field814[var7] == var5) {
                if (arg0 == 0) {
                    return this.field815[var7];
                }
                return this.field816[var7];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BZ)V")
    public final void method271(byte arg0, boolean arg1) {
        if (arg0 == 9) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = this.field814.length;
        for (int var6 = 0; var6 < var5; var6++) {
            if (arg1 || this.field817[var6] != 0) {
                this.method278(this.field816[var6], (byte) 2, 0, 3);
                this.method278(this.field815[var6], (byte) 2, 0, 3);
            }
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(II)Z")
    public final boolean method272(int arg0, int arg1) {
        if (arg0 != 5) {
            this.field805 = !this.field805;
        }
        for (int var3 = 0; var3 < this.field814.length; var3++) {
            if (this.field816[var3] == arg1) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(II)I")
    public final int method273(int arg0, int arg1) {
        if (arg1 != 30455) {
            this.field804 = !this.field804;
        }
        return this.field813[arg0] & 0xFF;
    }

    @OriginalMember(owner = "ub", name = "d", descriptor = "(II)Z")
    public final boolean method274(int arg0, int arg1) {
        if (arg0 >= 0) {
            this.field805 = !this.field805;
        }
        return this.field819[arg1] == 1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(I)V")
    public final void method265(int arg0) {
        this.method275(0, arg0);
    }

    @OriginalMember(owner = "ub", name = "e", descriptor = "(II)V")
    public final void method275(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field809.length || arg1 < 0 || arg1 > this.field809[arg0].length || this.field809[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field826;
        synchronized (this.field826) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field826.method251(); var4 != null; var4 = (OnDemandRequest) this.field826.method252(false)) {
                if (var4.field721 == arg0 && var4.field722 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field721 = arg0;
            var5.field722 = arg1;
            var5.field725 = true;
            LinkList var6 = this.field827;
            synchronized (this.field827) {
                this.field827.method241(var5);
            }
            this.field826.method249(var5);
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "()I")
    public final int method276() {
        DoublyLinkList var1 = this.field826;
        synchronized (this.field826) {
            return this.field826.method253();
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "()Lmb;")
    public final OnDemandRequest method277() {
        LinkList var1 = this.field830;
        OnDemandRequest var2;
        synchronized (this.field830) {
            var2 = (OnDemandRequest) this.field830.method243();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field826;
        synchronized (this.field826) {
            var2.method107();
        }
        if (var2.field723 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field723));
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
        var2.field723 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field723[var7] = this.field843[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IBII)V")
    public final void method278(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field821.field1586[0] == null || this.field809[arg3][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field821.field1586[arg3 + 1].method287(arg0, (byte) 81);
        if (this.method285(-557, var5, this.field809[arg3][arg0], this.field810[arg3][arg0])) {
            return;
        }
        this.field811[arg3][arg0] = arg1;
        if (arg1 > this.field812) {
            this.field812 = arg1;
        }
        this.field834++;
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(B)V")
    public final void method279(byte arg0) {
        LinkList var2 = this.field831;
        synchronized (this.field831) {
            this.field831.method248();
        }
        if (arg0 != -5) {
            this.field803 = -36;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(ZII)V")
    public final void method280(boolean arg0, int arg1, int arg2) {
        if (arg0 || (this.field821.field1586[0] == null || (this.field809[arg1][arg2] == 0 || (this.field811[arg1][arg2] == 0 || this.field812 == 0)))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field721 = arg1;
        var4.field722 = arg2;
        var4.field725 = false;
        LinkList var5 = this.field831;
        synchronized (this.field831) {
            this.field831.method241(var4);
        }
    }

    @OriginalMember(owner = "ub", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field820) {
                this.field847++;
                byte var1 = 20;
                if (this.field812 == 0 && this.field821.field1586[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field823 = true;
                for (int var2 = 0; var2 < 100 && this.field823; var2++) {
                    this.field823 = false;
                    this.method281(true);
                    this.method282(false);
                    if (this.field824 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method283(3);
                    if (this.field836 != null) {
                        this.method284((byte) 79);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field829.method244(); var4 != null; var4 = (OnDemandRequest) this.field829.method246(false)) {
                    if (var4.field725) {
                        var3 = true;
                        var4.field724++;
                        if (var4.field724 > 50) {
                            var4.field724 = 0;
                            this.method286(var4, 6024);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field829.method244(); var5 != null; var5 = (OnDemandRequest) this.field829.method246(false)) {
                        var3 = true;
                        var5.field724++;
                        if (var5.field724 > 50) {
                            var5.field724 = 0;
                            this.method286(var5, 6024);
                        }
                    }
                }
                if (var3) {
                    this.field844++;
                    if (this.field844 > 750) {
                        try {
                            this.field835.close();
                        } catch (Exception var8) {
                        }
                        this.field835 = null;
                        this.field836 = null;
                        this.field837 = null;
                        this.field841 = 0;
                    }
                } else {
                    this.field844 = 0;
                    this.field832 = "";
                }
                if (this.field821.field1578 && this.field835 != null && this.field837 != null && (this.field812 > 0 || this.field821.field1586[0] == null)) {
                    this.field845++;
                    if (this.field845 > 500) {
                        this.field845 = 0;
                        this.field842[0] = 0;
                        this.field842[1] = 0;
                        this.field842[2] = 0;
                        this.field842[3] = 10;
                        try {
                            this.field837.write(this.field842, 0, 4);
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

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Z)V")
    private final void method281(boolean arg0) {
        if (!arg0) {
            this.field803 = -208;
        }
        LinkList var2 = this.field827;
        OnDemandRequest var3;
        synchronized (this.field827) {
            var3 = (OnDemandRequest) this.field827.method243();
        }
        while (var3 != null) {
            this.field823 = true;
            byte[] var4 = null;
            if (this.field821.field1586[0] != null) {
                var4 = this.field821.field1586[var3.field721 + 1].method287(var3.field722, (byte) 81);
            }
            if (!this.method285(-557, var4, this.field809[var3.field721][var3.field722], this.field810[var3.field721][var3.field722])) {
                var4 = null;
            }
            LinkList var5 = this.field827;
            synchronized (this.field827) {
                if (var4 == null) {
                    this.field828.method241(var3);
                } else {
                    var3.field723 = var4;
                    LinkList var6 = this.field830;
                    synchronized (this.field830) {
                        this.field830.method241(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field827.method243();
            }
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(Z)V")
    private final void method282(boolean arg0) {
        this.field824 = 0;
        this.field825 = 0;
        OnDemandRequest var2 = (OnDemandRequest) this.field829.method244();
        if (arg0) {
            this.field807 = 454;
        }
        while (var2 != null) {
            if (var2.field725) {
                this.field824++;
            } else {
                this.field825++;
            }
            var2 = (OnDemandRequest) this.field829.method246(false);
        }
        while (this.field824 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field828.method243();
            if (var3 == null) {
                break;
            }
            if (this.field811[var3.field721][var3.field722] != 0) {
                this.field833++;
            }
            this.field811[var3.field721][var3.field722] = 0;
            this.field829.method241(var3);
            this.field824++;
            this.method286(var3, 6024);
            this.field823 = true;
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(I)V")
    private final void method283(int arg0) {
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.field824 == 0) {
            if (this.field825 >= 10 || this.field812 == 0) {
                return;
            }
            LinkList var3 = this.field831;
            OnDemandRequest var4;
            synchronized (this.field831) {
                var4 = (OnDemandRequest) this.field831.method243();
            }
            while (var4 != null) {
                if (this.field811[var4.field721][var4.field722] != 0) {
                    this.field811[var4.field721][var4.field722] = 0;
                    this.field829.method241(var4);
                    this.method286(var4, 6024);
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
                LinkList var5 = this.field831;
                synchronized (this.field831) {
                    var4 = (OnDemandRequest) this.field831.method243();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field811[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field812) {
                        var7[var9] = 0;
                        OnDemandRequest var10 = new OnDemandRequest();
                        var10.field721 = var6;
                        var10.field722 = var9;
                        var10.field725 = false;
                        this.field829.method241(var10);
                        this.method286(var10, 6024);
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

    @OriginalMember(owner = "ub", name = "b", descriptor = "(B)V")
    private final void method284(byte arg0) {
        if (arg0 != 79) {
            this.field806 = !this.field806;
        }
        try {
            int var2 = this.field836.available();
            if (this.field841 == 0 && var2 >= 6) {
                this.field823 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field836.read(this.field842, var3, 6 - var3)) {
                }
                int var4 = this.field842[0] & 0xFF;
                int var5 = ((this.field842[1] & 0xFF) << 8) + (this.field842[2] & 0xFF);
                int var6 = ((this.field842[3] & 0xFF) << 8) + (this.field842[4] & 0xFF);
                int var7 = this.field842[5] & 0xFF;
                this.field839 = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.field829.method244(); var8 != null; var8 = (OnDemandRequest) this.field829.method246(false)) {
                    if (var8.field721 == var4 && var8.field722 == var5) {
                        this.field839 = var8;
                    }
                    if (this.field839 != null) {
                        var8.field724 = 0;
                    }
                }
                if (this.field839 != null) {
                    this.field844 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field839.field723 = null;
                        if (this.field839.field725) {
                            LinkList var9 = this.field830;
                            synchronized (this.field830) {
                                this.field830.method241(this.field839);
                            }
                        } else {
                            this.field839.method106();
                        }
                        this.field839 = null;
                    } else {
                        if (this.field839.field723 == null && var7 == 0) {
                            this.field839.field723 = new byte[var6];
                        }
                        if (this.field839.field723 == null && var7 != 0) {
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
                this.field823 = true;
                byte[] var10 = this.field842;
                int var11 = 0;
                if (this.field839 != null) {
                    var10 = this.field839.field723;
                    var11 = this.field840;
                }
                for (int var12 = 0; var12 < this.field841; var12 += this.field836.read(var10, var11 + var12, this.field841 - var12)) {
                }
                if (this.field841 + this.field840 >= var10.length && this.field839 != null) {
                    if (this.field821.field1586[0] != null) {
                        this.field821.field1586[this.field839.field721 + 1].method288(var10, -381, this.field839.field722, var10.length);
                    }
                    if (!this.field839.field725 && this.field839.field721 == 3) {
                        this.field839.field725 = true;
                        this.field839.field721 = 93;
                    }
                    if (this.field839.field725) {
                        LinkList var13 = this.field830;
                        synchronized (this.field830) {
                            this.field830.method241(this.field839);
                        }
                    } else {
                        this.field839.method106();
                    }
                }
                this.field841 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field835.close();
            } catch (Exception var15) {
            }
            this.field835 = null;
            this.field836 = null;
            this.field837 = null;
            this.field841 = 0;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(I[BII)Z")
    private final boolean method285(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field822.reset();
        if (arg0 >= 0) {
            this.field807 = 389;
        }
        this.field822.update(arg1, 0, var5);
        int var7 = (int) this.field822.getValue();
        if (arg2 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lmb;I)V")
    private final void method286(OnDemandRequest arg0, int arg1) {
        if (arg1 != 6024) {
            return;
        }
        try {
            if (this.field835 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field846 < 4000L) {
                    return;
                }
                this.field846 = var3;
                this.field835 = this.field821.method512(client.field1307 + 43594);
                this.field836 = this.field835.getInputStream();
                this.field837 = this.field835.getOutputStream();
                this.field837.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field836.read();
                }
                this.field844 = 0;
            }
            this.field842[0] = (byte) arg0.field721;
            this.field842[1] = (byte) (arg0.field722 >> 8);
            this.field842[2] = (byte) arg0.field722;
            if (arg0.field725) {
                this.field842[3] = 2;
            } else if (this.field821.field1578) {
                this.field842[3] = 0;
            } else {
                this.field842[3] = 1;
            }
            this.field837.write(this.field842, 0, 4);
            this.field845 = 0;
            this.field838 = -10000;
        } catch (IOException var8) {
            try {
                this.field835.close();
            } catch (Exception var7) {
            }
            this.field835 = null;
            this.field836 = null;
            this.field837 = null;
            this.field841 = 0;
            this.field838++;
        }
    }
}
