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
    private boolean field803 = false;

    @OriginalMember(owner = "ub", name = "b", descriptor = "I")
    private int field804 = -555;

    @OriginalMember(owner = "ub", name = "d", descriptor = "B")
    private byte field806 = 64;

    @OriginalMember(owner = "ub", name = "e", descriptor = "[[I")
    private int[][] field807 = new int[4][];

    @OriginalMember(owner = "ub", name = "f", descriptor = "[[I")
    private int[][] field808 = new int[4][];

    @OriginalMember(owner = "ub", name = "g", descriptor = "[[B")
    private byte[][] field809 = new byte[4][];

    @OriginalMember(owner = "ub", name = "p", descriptor = "Z")
    private boolean field818 = true;

    @OriginalMember(owner = "ub", name = "r", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field820 = new CRC32();

    @OriginalMember(owner = "ub", name = "s", descriptor = "Z")
    private boolean field821 = false;

    @OriginalMember(owner = "ub", name = "v", descriptor = "Lpb;")
    private DoublyLinkList field824 = new DoublyLinkList(9);

    @OriginalMember(owner = "ub", name = "w", descriptor = "Lob;")
    private LinkList field825 = new LinkList(-199);

    @OriginalMember(owner = "ub", name = "x", descriptor = "Lob;")
    private LinkList field826 = new LinkList(-199);

    @OriginalMember(owner = "ub", name = "y", descriptor = "Lob;")
    private LinkList field827 = new LinkList(-199);

    @OriginalMember(owner = "ub", name = "z", descriptor = "Lob;")
    private LinkList field828 = new LinkList(-199);

    @OriginalMember(owner = "ub", name = "A", descriptor = "Lob;")
    private LinkList field829 = new LinkList(-199);

    @OriginalMember(owner = "ub", name = "B", descriptor = "Ljava/lang/String;")
    public String field830 = "";

    @OriginalMember(owner = "ub", name = "L", descriptor = "[B")
    private byte[] field840 = new byte[500];

    @OriginalMember(owner = "ub", name = "M", descriptor = "[B")
    private byte[] field841 = new byte[65000];

    @OriginalMember(owner = "ub", name = "c", descriptor = "I")
    private int field805;

    @OriginalMember(owner = "ub", name = "h", descriptor = "I")
    private int field810;

    @OriginalMember(owner = "ub", name = "t", descriptor = "I")
    private int field822;

    @OriginalMember(owner = "ub", name = "u", descriptor = "I")
    private int field823;

    @OriginalMember(owner = "ub", name = "C", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "ub", name = "D", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "ub", name = "H", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "ub", name = "J", descriptor = "I")
    private int field838;

    @OriginalMember(owner = "ub", name = "K", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "ub", name = "N", descriptor = "I")
    private int field842;

    @OriginalMember(owner = "ub", name = "O", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "ub", name = "Q", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "ub", name = "P", descriptor = "J")
    private long field844;

    @OriginalMember(owner = "ub", name = "I", descriptor = "Lmb;")
    private OnDemandRequest field837;

    @OriginalMember(owner = "ub", name = "q", descriptor = "Lclient;")
    private client field819;

    @OriginalMember(owner = "ub", name = "F", descriptor = "Ljava/io/InputStream;")
    private InputStream field834;

    @OriginalMember(owner = "ub", name = "G", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field835;

    @OriginalMember(owner = "ub", name = "E", descriptor = "Ljava/net/Socket;")
    private Socket field833;

    @OriginalMember(owner = "ub", name = "i", descriptor = "[B")
    private byte[] field811;

    @OriginalMember(owner = "ub", name = "j", descriptor = "[I")
    private int[] field812;

    @OriginalMember(owner = "ub", name = "k", descriptor = "[I")
    private int[] field813;

    @OriginalMember(owner = "ub", name = "l", descriptor = "[I")
    private int[] field814;

    @OriginalMember(owner = "ub", name = "m", descriptor = "[I")
    private int[] field815;

    @OriginalMember(owner = "ub", name = "n", descriptor = "[I")
    private int[] field816;

    @OriginalMember(owner = "ub", name = "o", descriptor = "[I")
    private int[] field817;

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lxb;Lclient;)V")
    public final void method268(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method297(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(var26, 15787);
            this.field807[var4] = new int[var27];
            this.field809[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field807[var4][var29] = var28.method229();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method297(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(var22, 15787);
            this.field808[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field808[var6][var25] = var24.method232();
            }
        }
        byte[] var7 = arg0.method297("model_index", null);
        int var8 = this.field807[0].length;
        this.field811 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field811[var9] = var7[var9];
            } else {
                this.field811[var9] = 0;
            }
        }
        byte[] var10 = arg0.method297("map_index", null);
        Packet var11 = new Packet(var10, 15787);
        int var12 = var10.length / 7;
        this.field812 = new int[var12];
        this.field813 = new int[var12];
        this.field814 = new int[var12];
        this.field815 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field812[var13] = var11.method229();
            this.field813[var13] = var11.method229();
            this.field814[var13] = var11.method229();
            this.field815[var13] = var11.method227();
        }
        byte[] var14 = arg0.method297("anim_index", null);
        Packet var15 = new Packet(var14, 15787);
        int var16 = var14.length / 2;
        this.field816 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field816[var17] = var15.method229();
        }
        byte[] var18 = arg0.method297("midi_index", null);
        Packet var19 = new Packet(var18, 15787);
        int var20 = var18.length;
        this.field817 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field817[var21] = var19.method227();
        }
        this.field819 = arg1;
        this.field818 = true;
        this.field819.method12(this, 2);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "()V")
    public final void method269() {
        this.field818 = false;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IB)I")
    public final int method270(int arg0, byte arg1) {
        if (arg1 == 7) {
            boolean var3 = false;
            return this.field807[arg0].length;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(I)I")
    public final int method271(int arg0) {
        return arg0 == 7 ? this.field816.length : 1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIII)I")
    public final int method272(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg2 << 8) + arg0;
        for (int var6 = 0; var6 < this.field812.length; var6++) {
            if (this.field812[var6] == var5) {
                if (arg3 == 0) {
                    return this.field813[var6];
                }
                return this.field814[var6];
            }
        }
        if (arg1 >= 0) {
            this.field805 = -467;
        }
        return -1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(ZZ)V")
    public final void method273(boolean arg0, boolean arg1) {
        int var3 = this.field812.length;
        if (arg0) {
            this.field803 = !this.field803;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field815[var4] != 0) {
                this.method280(7, 3, (byte) 2, this.field814[var4]);
                this.method280(7, 3, (byte) 2, this.field813[var4]);
            }
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(II)Z")
    public final boolean method274(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field812.length; var3++) {
            if (this.field814[var3] == arg0) {
                return true;
            }
        }
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(II)I")
    public final int method275(int arg0, int arg1) {
        while (arg1 >= 0) {
            this.field804 = 270;
        }
        return this.field811[arg0] & 0xFF;
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(II)Z")
    public final boolean method276(int arg0, int arg1) {
        int var3 = 93 / arg1;
        return this.field817[arg0] == 1;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(I)V")
    public final void method267(int arg0) {
        this.method277(0, arg0);
    }

    @OriginalMember(owner = "ub", name = "d", descriptor = "(II)V")
    public final void method277(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field807.length || arg1 < 0 || arg1 > this.field807[arg0].length || this.field807[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field824;
        synchronized (this.field824) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field824.method253(); var4 != null; var4 = (OnDemandRequest) this.field824.method254(false)) {
                if (var4.field723 == arg0 && var4.field724 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field723 = arg0;
            var5.field724 = arg1;
            var5.field727 = true;
            LinkList var6 = this.field825;
            synchronized (this.field825) {
                this.field825.method243(var5);
            }
            this.field824.method251(var5);
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "()I")
    public final int method278() {
        DoublyLinkList var1 = this.field824;
        synchronized (this.field824) {
            return this.field824.method255();
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "()Lmb;")
    public final OnDemandRequest method279() {
        LinkList var1 = this.field828;
        OnDemandRequest var2;
        synchronized (this.field828) {
            var2 = (OnDemandRequest) this.field828.method245();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field824;
        synchronized (this.field824) {
            var2.method107();
        }
        if (var2.field725 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field725));
            while (true) {
                if (this.field841.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field841, var4, this.field841.length - var4);
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
            var2.field725[var7] = this.field841[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIBI)V")
    public final void method280(int arg0, int arg1, byte arg2, int arg3) {
        if (this.field819.field1629[0] == null || this.field807[arg1][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field819.field1629[arg1 + 1].method289(false, arg3);
        if (this.method287(var5, this.field807[arg1][arg3], (byte) 64, this.field808[arg1][arg3])) {
            return;
        }
        this.field809[arg1][arg3] = arg2;
        if (arg0 >= 7 && arg0 <= 7) {
            if (arg2 > this.field810) {
                this.field810 = arg2;
            }
            this.field832++;
        }
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(I)V")
    public final void method281(int arg0) {
        if (arg0 < 0) {
            LinkList var2 = this.field829;
            synchronized (this.field829) {
                this.field829.method250();
            }
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(IIB)V")
    public final void method282(int arg0, int arg1, byte arg2) {
        if (this.field819.field1629[0] == null || (this.field807[arg1][arg0] == 0 || (this.field809[arg1][arg0] == 0 || this.field810 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.field723 = arg1;
        var4.field724 = arg0;
        var4.field727 = false;
        if (arg2 == 6) {
            LinkList var5 = this.field829;
            synchronized (this.field829) {
                this.field829.method243(var4);
            }
        }
    }

    @OriginalMember(owner = "ub", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field818) {
                this.field845++;
                byte var1 = 20;
                if (this.field810 == 0 && this.field819.field1629[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field821 = true;
                for (int var2 = 0; var2 < 100 && this.field821; var2++) {
                    this.field821 = false;
                    this.method283((byte) -101);
                    this.method284((byte) -3);
                    if (this.field822 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method285(0);
                    if (this.field834 != null) {
                        this.method286(200);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field827.method246(); var4 != null; var4 = (OnDemandRequest) this.field827.method248(false)) {
                    if (var4.field727) {
                        var3 = true;
                        var4.field726++;
                        if (var4.field726 > 50) {
                            var4.field726 = 0;
                            this.method288(var4, 409);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field827.method246(); var5 != null; var5 = (OnDemandRequest) this.field827.method248(false)) {
                        var3 = true;
                        var5.field726++;
                        if (var5.field726 > 50) {
                            var5.field726 = 0;
                            this.method288(var5, 409);
                        }
                    }
                }
                if (var3) {
                    this.field842++;
                    if (this.field842 > 750) {
                        try {
                            this.field833.close();
                        } catch (Exception var8) {
                        }
                        this.field833 = null;
                        this.field834 = null;
                        this.field835 = null;
                        this.field839 = 0;
                    }
                } else {
                    this.field842 = 0;
                    this.field830 = "";
                }
                if (this.field819.field1284 && this.field833 != null && this.field835 != null && (this.field810 > 0 || this.field819.field1629[0] == null)) {
                    this.field843++;
                    if (this.field843 > 500) {
                        this.field843 = 0;
                        this.field840[0] = 0;
                        this.field840[1] = 0;
                        this.field840[2] = 0;
                        this.field840[3] = 10;
                        try {
                            this.field835.write(this.field840, 0, 4);
                        } catch (IOException var7) {
                            this.field842 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(B)V")
    private final void method283(byte arg0) {
        LinkList var2 = this.field825;
        OnDemandRequest var3;
        synchronized (this.field825) {
            var3 = (OnDemandRequest) this.field825.method245();
        }
        if (arg0 != -101) {
            return;
        }
        while (var3 != null) {
            this.field821 = true;
            byte[] var4 = null;
            if (this.field819.field1629[0] != null) {
                var4 = this.field819.field1629[var3.field723 + 1].method289(false, var3.field724);
            }
            if (!this.method287(var4, this.field807[var3.field723][var3.field724], (byte) 64, this.field808[var3.field723][var3.field724])) {
                var4 = null;
            }
            LinkList var5 = this.field825;
            synchronized (this.field825) {
                if (var4 == null) {
                    this.field826.method243(var3);
                } else {
                    var3.field725 = var4;
                    LinkList var6 = this.field828;
                    synchronized (this.field828) {
                        this.field828.method243(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field825.method245();
            }
        }
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(B)V")
    private final void method284(byte arg0) {
        this.field822 = 0;
        this.field823 = 0;
        if (arg0 != -3) {
            this.field805 = -238;
        }
        for (OnDemandRequest var2 = (OnDemandRequest) this.field827.method246(); var2 != null; var2 = (OnDemandRequest) this.field827.method248(false)) {
            if (var2.field727) {
                this.field822++;
            } else {
                this.field823++;
            }
        }
        while (this.field822 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field826.method245();
            if (var3 == null) {
                break;
            }
            if (this.field809[var3.field723][var3.field724] != 0) {
                this.field831++;
            }
            this.field809[var3.field723][var3.field724] = 0;
            this.field827.method243(var3);
            this.field822++;
            this.method288(var3, 409);
            this.field821 = true;
        }
    }

    @OriginalMember(owner = "ub", name = "d", descriptor = "(I)V")
    private final void method285(int arg0) {
        if (arg0 != 0) {
            this.field803 = !this.field803;
        }
        while (this.field822 == 0) {
            if (this.field823 >= 10 || this.field810 == 0) {
                return;
            }
            LinkList var2 = this.field829;
            OnDemandRequest var3;
            synchronized (this.field829) {
                var3 = (OnDemandRequest) this.field829.method245();
            }
            while (var3 != null) {
                if (this.field809[var3.field723][var3.field724] != 0) {
                    this.field809[var3.field723][var3.field724] = 0;
                    this.field827.method243(var3);
                    this.method288(var3, 409);
                    this.field821 = true;
                    if (this.field831 < this.field832) {
                        this.field831++;
                    }
                    this.field830 = "Loading extra files - " + this.field831 * 100 / this.field832 + "%";
                    this.field823++;
                    if (this.field823 == 10) {
                        return;
                    }
                }
                LinkList var4 = this.field829;
                synchronized (this.field829) {
                    var3 = (OnDemandRequest) this.field829.method245();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field809[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field810) {
                        var6[var8] = 0;
                        OnDemandRequest var9 = new OnDemandRequest();
                        var9.field723 = var5;
                        var9.field724 = var8;
                        var9.field727 = false;
                        this.field827.method243(var9);
                        this.method288(var9, 409);
                        this.field821 = true;
                        if (this.field831 < this.field832) {
                            this.field831++;
                        }
                        this.field830 = "Loading extra files - " + this.field831 * 100 / this.field832 + "%";
                        this.field823++;
                        if (this.field823 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field810--;
        }
    }

    @OriginalMember(owner = "ub", name = "e", descriptor = "(I)V")
    private final void method286(int arg0) {
        int var2 = 48 / arg0;
        try {
            int var3 = this.field834.available();
            if (this.field839 == 0 && var3 >= 6) {
                this.field821 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field834.read(this.field840, var4, 6 - var4)) {
                }
                int var5 = this.field840[0] & 0xFF;
                int var6 = ((this.field840[1] & 0xFF) << 8) + (this.field840[2] & 0xFF);
                int var7 = ((this.field840[3] & 0xFF) << 8) + (this.field840[4] & 0xFF);
                int var8 = this.field840[5] & 0xFF;
                this.field837 = null;
                for (OnDemandRequest var9 = (OnDemandRequest) this.field827.method246(); var9 != null; var9 = (OnDemandRequest) this.field827.method248(false)) {
                    if (var9.field723 == var5 && var9.field724 == var6) {
                        this.field837 = var9;
                    }
                    if (this.field837 != null) {
                        var9.field726 = 0;
                    }
                }
                if (this.field837 != null) {
                    this.field842 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field837.field725 = null;
                        if (this.field837.field727) {
                            LinkList var10 = this.field828;
                            synchronized (this.field828) {
                                this.field828.method243(this.field837);
                            }
                        } else {
                            this.field837.method106();
                        }
                        this.field837 = null;
                    } else {
                        if (this.field837.field725 == null && var8 == 0) {
                            this.field837.field725 = new byte[var7];
                        }
                        if (this.field837.field725 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field838 = var8 * 500;
                this.field839 = 500;
                if (this.field839 > var7 - var8 * 500) {
                    this.field839 = var7 - var8 * 500;
                }
            }
            if (this.field839 > 0 && var3 >= this.field839) {
                this.field821 = true;
                byte[] var11 = this.field840;
                int var12 = 0;
                if (this.field837 != null) {
                    var11 = this.field837.field725;
                    var12 = this.field838;
                }
                for (int var13 = 0; var13 < this.field839; var13 += this.field834.read(var11, var12 + var13, this.field839 - var13)) {
                }
                if (this.field839 + this.field838 >= var11.length && this.field837 != null) {
                    if (this.field819.field1629[0] != null) {
                        this.field819.field1629[this.field837.field723 + 1].method290(var11, (byte) 4, var11.length, this.field837.field724);
                    }
                    if (!this.field837.field727 && this.field837.field723 == 3) {
                        this.field837.field727 = true;
                        this.field837.field723 = 93;
                    }
                    if (this.field837.field727) {
                        LinkList var14 = this.field828;
                        synchronized (this.field828) {
                            this.field828.method243(this.field837);
                        }
                    } else {
                        this.field837.method106();
                    }
                }
                this.field839 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field833.close();
            } catch (Exception var16) {
            }
            this.field833 = null;
            this.field834 = null;
            this.field835 = null;
            this.field839 = 0;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "([BIBI)Z")
    private final boolean method287(byte[] arg0, int arg1, byte arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field820.reset();
        if (this.field806 != arg2) {
            throw new NullPointerException();
        }
        this.field820.update(arg0, 0, var5);
        int var7 = (int) this.field820.getValue();
        if (arg1 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Lmb;I)V")
    private final void method288(OnDemandRequest arg0, int arg1) {
        int var3 = 99 / arg1;
        try {
            if (this.field833 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field844 < 4000L) {
                    return;
                }
                this.field844 = var4;
                this.field833 = this.field819.method445(client.field1654 + 43594);
                this.field834 = this.field833.getInputStream();
                this.field835 = this.field833.getOutputStream();
                this.field835.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field834.read();
                }
                this.field842 = 0;
            }
            this.field840[0] = (byte) arg0.field723;
            this.field840[1] = (byte) (arg0.field724 >> 8);
            this.field840[2] = (byte) arg0.field724;
            if (arg0.field727) {
                this.field840[3] = 2;
            } else if (this.field819.field1284) {
                this.field840[3] = 0;
            } else {
                this.field840[3] = 1;
            }
            this.field835.write(this.field840, 0, 4);
            this.field843 = 0;
            this.field836 = -10000;
        } catch (IOException var9) {
            try {
                this.field833.close();
            } catch (Exception var8) {
            }
            this.field833 = null;
            this.field834 = null;
            this.field835 = null;
            this.field839 = 0;
            this.field836++;
        }
    }
}
