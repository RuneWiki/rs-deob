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
    private boolean field804 = true;

    @OriginalMember(owner = "ub", name = "c", descriptor = "B")
    private byte field806 = 0;

    @OriginalMember(owner = "ub", name = "d", descriptor = "I")
    private int field807 = 477;

    @OriginalMember(owner = "ub", name = "e", descriptor = "[[I")
    private int[][] field808 = new int[4][];

    @OriginalMember(owner = "ub", name = "f", descriptor = "[[I")
    private int[][] field809 = new int[4][];

    @OriginalMember(owner = "ub", name = "g", descriptor = "[[B")
    private byte[][] field810 = new byte[4][];

    @OriginalMember(owner = "ub", name = "p", descriptor = "Z")
    private boolean field819 = true;

    @OriginalMember(owner = "ub", name = "r", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field821 = new CRC32();

    @OriginalMember(owner = "ub", name = "s", descriptor = "Z")
    private boolean field822 = false;

    @OriginalMember(owner = "ub", name = "v", descriptor = "Lpb;")
    private DoublyLinkList field825 = new DoublyLinkList((byte) 8);

    @OriginalMember(owner = "ub", name = "w", descriptor = "Lob;")
    private LinkList field826 = new LinkList(-822);

    @OriginalMember(owner = "ub", name = "x", descriptor = "Lob;")
    private LinkList field827 = new LinkList(-822);

    @OriginalMember(owner = "ub", name = "y", descriptor = "Lob;")
    private LinkList field828 = new LinkList(-822);

    @OriginalMember(owner = "ub", name = "z", descriptor = "Lob;")
    private LinkList field829 = new LinkList(-822);

    @OriginalMember(owner = "ub", name = "A", descriptor = "Lob;")
    private LinkList field830 = new LinkList(-822);

    @OriginalMember(owner = "ub", name = "B", descriptor = "Ljava/lang/String;")
    public String field831 = "";

    @OriginalMember(owner = "ub", name = "L", descriptor = "[B")
    private byte[] field841 = new byte[500];

    @OriginalMember(owner = "ub", name = "M", descriptor = "[B")
    private byte[] field842 = new byte[65000];

    @OriginalMember(owner = "ub", name = "b", descriptor = "I")
    private int field805;

    @OriginalMember(owner = "ub", name = "h", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "ub", name = "t", descriptor = "I")
    private int field823;

    @OriginalMember(owner = "ub", name = "u", descriptor = "I")
    private int field824;

    @OriginalMember(owner = "ub", name = "C", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "ub", name = "D", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "ub", name = "H", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "ub", name = "J", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "ub", name = "K", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "ub", name = "N", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "ub", name = "O", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "ub", name = "Q", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "ub", name = "P", descriptor = "J")
    private long field845;

    @OriginalMember(owner = "ub", name = "I", descriptor = "Lmb;")
    private OnDemandRequest field838;

    @OriginalMember(owner = "ub", name = "q", descriptor = "Lclient;")
    private client field820;

    @OriginalMember(owner = "ub", name = "F", descriptor = "Ljava/io/InputStream;")
    private InputStream field835;

    @OriginalMember(owner = "ub", name = "G", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field836;

    @OriginalMember(owner = "ub", name = "E", descriptor = "Ljava/net/Socket;")
    private Socket field834;

    @OriginalMember(owner = "ub", name = "i", descriptor = "[B")
    private byte[] field812;

    @OriginalMember(owner = "ub", name = "j", descriptor = "[I")
    private int[] field813;

    @OriginalMember(owner = "ub", name = "k", descriptor = "[I")
    private int[] field814;

    @OriginalMember(owner = "ub", name = "l", descriptor = "[I")
    private int[] field815;

    @OriginalMember(owner = "ub", name = "m", descriptor = "[I")
    private int[] field816;

    @OriginalMember(owner = "ub", name = "n", descriptor = "[I")
    private int[] field817;

    @OriginalMember(owner = "ub", name = "o", descriptor = "[I")
    private int[] field818;

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lxb;Lclient;)V")
    public final void method265(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method294(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(var26, (byte) 1);
            this.field808[var4] = new int[var27];
            this.field810[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field808[var4][var29] = var28.method226();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method294(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(var22, (byte) 1);
            this.field809[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field809[var6][var25] = var24.method229();
            }
        }
        byte[] var7 = arg0.method294("model_index", null);
        int var8 = this.field808[0].length;
        this.field812 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field812[var9] = var7[var9];
            } else {
                this.field812[var9] = 0;
            }
        }
        byte[] var10 = arg0.method294("map_index", null);
        Packet var11 = new Packet(var10, (byte) 1);
        int var12 = var10.length / 7;
        this.field813 = new int[var12];
        this.field814 = new int[var12];
        this.field815 = new int[var12];
        this.field816 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field813[var13] = var11.method226();
            this.field814[var13] = var11.method226();
            this.field815[var13] = var11.method226();
            this.field816[var13] = var11.method224();
        }
        byte[] var14 = arg0.method294("anim_index", null);
        Packet var15 = new Packet(var14, (byte) 1);
        int var16 = var14.length / 2;
        this.field817 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field817[var17] = var15.method226();
        }
        byte[] var18 = arg0.method294("midi_index", null);
        Packet var19 = new Packet(var18, (byte) 1);
        int var20 = var18.length;
        this.field818 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field818[var21] = var19.method224();
        }
        this.field820 = arg1;
        this.field819 = true;
        this.field820.method12(this, 2);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "()V")
    public final void method266() {
        this.field819 = false;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(II)I")
    public final int method267(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field804 = !this.field804;
        }
        return this.field808[arg1].length;
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(I)I")
    public final int method268(int arg0) {
        return arg0 <= 0 ? this.field807 : this.field817.length;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIZI)I")
    public final int method269(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = (arg1 << 8) + arg3;
        for (int var6 = 0; var6 < this.field813.length; var6++) {
            if (this.field813[var6] == var5) {
                if (arg0 == 0) {
                    return this.field814[var6];
                }
                return this.field815[var6];
            }
        }
        if (arg2) {
            this.field804 = !this.field804;
        }
        return -1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(ZI)V")
    public final void method270(boolean arg0, int arg1) {
        if (arg1 >= 0) {
            return;
        }
        int var3 = this.field813.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field816[var4] != 0) {
                this.method277((byte) 5, this.field815[var4], 3, (byte) 2);
                this.method277((byte) 5, this.field814[var4], 3, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(II)Z")
    public final boolean method271(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < this.field813.length; var4++) {
            if (this.field815[var4] == arg0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IB)I")
    public final int method272(int arg0, byte arg1) {
        if (arg1 == 9) {
            boolean var3 = false;
        } else {
            this.field805 = 154;
        }
        return this.field812[arg0] & 0xFF;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IZ)Z")
    public final boolean method273(int arg0, boolean arg1) {
        if (arg1) {
            this.field805 = -117;
        }
        return this.field818[arg0] == 1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(I)V")
    public final void method264(int arg0) {
        this.method274(0, arg0);
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(II)V")
    public final void method274(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field808.length || arg1 < 0 || arg1 > this.field808[arg0].length || this.field808[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field825;
        synchronized (this.field825) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field825.method250(); var4 != null; var4 = (OnDemandRequest) this.field825.method251(this.field806)) {
                if (var4.field722 == arg0 && var4.field723 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field722 = arg0;
            var5.field723 = arg1;
            var5.field726 = true;
            LinkList var6 = this.field826;
            synchronized (this.field826) {
                this.field826.method240(var5);
            }
            this.field825.method248(var5);
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "()I")
    public final int method275() {
        DoublyLinkList var1 = this.field825;
        synchronized (this.field825) {
            return this.field825.method252();
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "()Lmb;")
    public final OnDemandRequest method276() {
        LinkList var1 = this.field829;
        OnDemandRequest var2;
        synchronized (this.field829) {
            var2 = (OnDemandRequest) this.field829.method242();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field825;
        synchronized (this.field825) {
            var2.method107();
        }
        if (var2.field724 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field724));
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
        var2.field724 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field724[var7] = this.field842[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BIIB)V")
    public final void method277(byte arg0, int arg1, int arg2, byte arg3) {
        if (arg0 != 5) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field820.field1641[0] == null || this.field808[arg2][arg1] == 0) {
            return;
        }
        byte[] var6 = this.field820.field1641[arg2 + 1].method286((byte) 2, arg1);
        if (this.method284((byte) 103, this.field809[arg2][arg1], this.field808[arg2][arg1], var6)) {
            return;
        }
        this.field810[arg2][arg1] = arg3;
        if (arg3 > this.field811) {
            this.field811 = arg3;
        }
        this.field833++;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(B)V")
    public final void method278(byte arg0) {
        if (arg0 != 41) {
            this.field804 = !this.field804;
        }
        LinkList var2 = this.field830;
        synchronized (this.field830) {
            this.field830.method247();
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(III)V")
    public final void method279(int arg0, int arg1, int arg2) {
        if (this.field820.field1641[0] == null || (this.field808[arg1][arg2] == 0 || (this.field810[arg1][arg2] == 0 || this.field811 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field722 = arg1;
        var4.field723 = arg2;
        var4.field726 = false;
        LinkList var5 = this.field830;
        synchronized (this.field830) {
            this.field830.method240(var4);
        }
        if (arg0 != -21322) {
            this.field807 = 454;
        }
    }

    @OriginalMember(owner = "ub", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field819) {
                this.field846++;
                byte var1 = 20;
                if (this.field811 == 0 && this.field820.field1641[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field822 = true;
                for (int var2 = 0; var2 < 100 && this.field822; var2++) {
                    this.field822 = false;
                    this.method280((byte) 7);
                    this.method281(false);
                    if (this.field823 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method282(0);
                    if (this.field835 != null) {
                        this.method283(-194);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field828.method243(); var4 != null; var4 = (OnDemandRequest) this.field828.method245(this.field806)) {
                    if (var4.field726) {
                        var3 = true;
                        var4.field725++;
                        if (var4.field725 > 50) {
                            var4.field725 = 0;
                            this.method285(var4, 295);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field828.method243(); var5 != null; var5 = (OnDemandRequest) this.field828.method245(this.field806)) {
                        var3 = true;
                        var5.field725++;
                        if (var5.field725 > 50) {
                            var5.field725 = 0;
                            this.method285(var5, 295);
                        }
                    }
                }
                if (var3) {
                    this.field843++;
                    if (this.field843 > 750) {
                        try {
                            this.field834.close();
                        } catch (Exception var8) {
                        }
                        this.field834 = null;
                        this.field835 = null;
                        this.field836 = null;
                        this.field840 = 0;
                    }
                } else {
                    this.field843 = 0;
                    this.field831 = "";
                }
                if (this.field820.field1321 && this.field834 != null && this.field836 != null && (this.field811 > 0 || this.field820.field1641[0] == null)) {
                    this.field844++;
                    if (this.field844 > 500) {
                        this.field844 = 0;
                        this.field841[0] = 0;
                        this.field841[1] = 0;
                        this.field841[2] = 0;
                        this.field841[3] = 10;
                        try {
                            this.field836.write(this.field841, 0, 4);
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

    @OriginalMember(owner = "ub", name = "b", descriptor = "(B)V")
    private final void method280(byte arg0) {
        if (arg0 != 7) {
            return;
        }
        boolean var2 = false;
        LinkList var3 = this.field826;
        OnDemandRequest var4;
        synchronized (this.field826) {
            var4 = (OnDemandRequest) this.field826.method242();
        }
        while (var4 != null) {
            this.field822 = true;
            byte[] var5 = null;
            if (this.field820.field1641[0] != null) {
                var5 = this.field820.field1641[var4.field722 + 1].method286((byte) 2, var4.field723);
            }
            if (!this.method284((byte) 103, this.field809[var4.field722][var4.field723], this.field808[var4.field722][var4.field723], var5)) {
                var5 = null;
            }
            LinkList var6 = this.field826;
            synchronized (this.field826) {
                if (var5 == null) {
                    this.field827.method240(var4);
                } else {
                    var4.field724 = var5;
                    LinkList var7 = this.field829;
                    synchronized (this.field829) {
                        this.field829.method240(var4);
                    }
                }
                var4 = (OnDemandRequest) this.field826.method242();
            }
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Z)V")
    private final void method281(boolean arg0) {
        this.field823 = 0;
        this.field824 = 0;
        OnDemandRequest var2 = (OnDemandRequest) this.field828.method243();
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (var2 != null) {
            if (var2.field726) {
                this.field823++;
            } else {
                this.field824++;
            }
            var2 = (OnDemandRequest) this.field828.method245(this.field806);
        }
        while (this.field823 < 10) {
            OnDemandRequest var4 = (OnDemandRequest) this.field827.method242();
            if (var4 == null) {
                break;
            }
            if (this.field810[var4.field722][var4.field723] != 0) {
                this.field832++;
            }
            this.field810[var4.field722][var4.field723] = 0;
            this.field828.method240(var4);
            this.field823++;
            this.method285(var4, 295);
            this.field822 = true;
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(I)V")
    private final void method282(int arg0) {
        if (arg0 != 0) {
            return;
        }
        while (this.field823 == 0) {
            if (this.field824 >= 10 || this.field811 == 0) {
                return;
            }
            LinkList var2 = this.field830;
            OnDemandRequest var3;
            synchronized (this.field830) {
                var3 = (OnDemandRequest) this.field830.method242();
            }
            while (var3 != null) {
                if (this.field810[var3.field722][var3.field723] != 0) {
                    this.field810[var3.field722][var3.field723] = 0;
                    this.field828.method240(var3);
                    this.method285(var3, 295);
                    this.field822 = true;
                    if (this.field832 < this.field833) {
                        this.field832++;
                    }
                    this.field831 = "Loading extra files - " + this.field832 * 100 / this.field833 + "%";
                    this.field824++;
                    if (this.field824 == 10) {
                        return;
                    }
                }
                LinkList var4 = this.field830;
                synchronized (this.field830) {
                    var3 = (OnDemandRequest) this.field830.method242();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field810[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field811) {
                        var6[var8] = 0;
                        OnDemandRequest var9 = new OnDemandRequest();
                        var9.field722 = var5;
                        var9.field723 = var8;
                        var9.field726 = false;
                        this.field828.method240(var9);
                        this.method285(var9, 295);
                        this.field822 = true;
                        if (this.field832 < this.field833) {
                            this.field832++;
                        }
                        this.field831 = "Loading extra files - " + this.field832 * 100 / this.field833 + "%";
                        this.field824++;
                        if (this.field824 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field811--;
        }
    }

    @OriginalMember(owner = "ub", name = "d", descriptor = "(I)V")
    private final void method283(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        try {
            int var2 = this.field835.available();
            if (this.field840 == 0 && var2 >= 6) {
                this.field822 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field835.read(this.field841, var3, 6 - var3)) {
                }
                int var4 = this.field841[0] & 0xFF;
                int var5 = ((this.field841[1] & 0xFF) << 8) + (this.field841[2] & 0xFF);
                int var6 = ((this.field841[3] & 0xFF) << 8) + (this.field841[4] & 0xFF);
                int var7 = this.field841[5] & 0xFF;
                this.field838 = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.field828.method243(); var8 != null; var8 = (OnDemandRequest) this.field828.method245(this.field806)) {
                    if (var8.field722 == var4 && var8.field723 == var5) {
                        this.field838 = var8;
                    }
                    if (this.field838 != null) {
                        var8.field725 = 0;
                    }
                }
                if (this.field838 != null) {
                    this.field843 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field838.field724 = null;
                        if (this.field838.field726) {
                            LinkList var9 = this.field829;
                            synchronized (this.field829) {
                                this.field829.method240(this.field838);
                            }
                        } else {
                            this.field838.method106();
                        }
                        this.field838 = null;
                    } else {
                        if (this.field838.field724 == null && var7 == 0) {
                            this.field838.field724 = new byte[var6];
                        }
                        if (this.field838.field724 == null && var7 != 0) {
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
                this.field822 = true;
                byte[] var10 = this.field841;
                int var11 = 0;
                if (this.field838 != null) {
                    var10 = this.field838.field724;
                    var11 = this.field839;
                }
                for (int var12 = 0; var12 < this.field840; var12 += this.field835.read(var10, var11 + var12, this.field840 - var12)) {
                }
                if (this.field840 + this.field839 >= var10.length && this.field838 != null) {
                    if (this.field820.field1641[0] != null) {
                        this.field820.field1641[this.field838.field722 + 1].method287(var10.length, this.field838.field723, var10, (byte) 8);
                    }
                    if (!this.field838.field726 && this.field838.field722 == 3) {
                        this.field838.field726 = true;
                        this.field838.field722 = 93;
                    }
                    if (this.field838.field726) {
                        LinkList var13 = this.field829;
                        synchronized (this.field829) {
                            this.field829.method240(this.field838);
                        }
                    } else {
                        this.field838.method106();
                    }
                }
                this.field840 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field834.close();
            } catch (Exception var15) {
            }
            this.field834 = null;
            this.field835 = null;
            this.field836 = null;
            this.field840 = 0;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BII[B)Z")
    private final boolean method284(byte arg0, int arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        if (arg0 != 103) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field821.reset();
        this.field821.update(arg3, 0, var5);
        int var8 = (int) this.field821.getValue();
        if (arg2 == var6) {
            return arg1 == var8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lmb;I)V")
    private final void method285(OnDemandRequest arg0, int arg1) {
        if (arg1 <= 0) {
            this.field804 = !this.field804;
        }
        try {
            if (this.field834 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field845 < 4000L) {
                    return;
                }
                this.field845 = var3;
                this.field834 = this.field820.method480(client.field1654 + 43594);
                this.field835 = this.field834.getInputStream();
                this.field836 = this.field834.getOutputStream();
                this.field836.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field835.read();
                }
                this.field843 = 0;
            }
            this.field841[0] = (byte) arg0.field722;
            this.field841[1] = (byte) (arg0.field723 >> 8);
            this.field841[2] = (byte) arg0.field723;
            if (arg0.field726) {
                this.field841[3] = 2;
            } else if (this.field820.field1321) {
                this.field841[3] = 0;
            } else {
                this.field841[3] = 1;
            }
            this.field836.write(this.field841, 0, 4);
            this.field844 = 0;
            this.field837 = -10000;
        } catch (IOException var8) {
            try {
                this.field834.close();
            } catch (Exception var7) {
            }
            this.field834 = null;
            this.field835 = null;
            this.field836 = null;
            this.field840 = 0;
            this.field837++;
        }
    }
}
