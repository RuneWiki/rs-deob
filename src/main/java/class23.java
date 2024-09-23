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

@OriginalClass("GLPUEKVZ")
public class class23 extends class43 implements Runnable {

    @OriginalMember(owner = "GLPUEKVZ", name = "b", descriptor = "LLOISKKJJ;")
    private class36 field757 = new class36(6);

    @OriginalMember(owner = "GLPUEKVZ", name = "c", descriptor = "Z")
    private boolean field758 = false;

    @OriginalMember(owner = "GLPUEKVZ", name = "d", descriptor = "[[I")
    private int[][] field759 = new int[4][];

    @OriginalMember(owner = "GLPUEKVZ", name = "h", descriptor = "I")
    private int field763 = 9;

    @OriginalMember(owner = "GLPUEKVZ", name = "i", descriptor = "I")
    private int field764 = 507;

    @OriginalMember(owner = "GLPUEKVZ", name = "l", descriptor = "LDTFBSXNF;")
    private class9 field767 = new class9(false);

    @OriginalMember(owner = "GLPUEKVZ", name = "m", descriptor = "Z")
    private boolean field768 = true;

    @OriginalMember(owner = "GLPUEKVZ", name = "o", descriptor = "Ljava/lang/String;")
    public String field770 = "";

    @OriginalMember(owner = "GLPUEKVZ", name = "p", descriptor = "Z")
    private boolean field771 = true;

    @OriginalMember(owner = "GLPUEKVZ", name = "s", descriptor = "LLOISKKJJ;")
    private class36 field774 = new class36(6);

    @OriginalMember(owner = "GLPUEKVZ", name = "t", descriptor = "LLOISKKJJ;")
    private class36 field775 = new class36(6);

    @OriginalMember(owner = "GLPUEKVZ", name = "w", descriptor = "LLOISKKJJ;")
    private class36 field778 = new class36(6);

    @OriginalMember(owner = "GLPUEKVZ", name = "C", descriptor = "[[B")
    private byte[][] field784 = new byte[4][];

    @OriginalMember(owner = "GLPUEKVZ", name = "I", descriptor = "LLOISKKJJ;")
    private class36 field790 = new class36(6);

    @OriginalMember(owner = "GLPUEKVZ", name = "K", descriptor = "[B")
    private byte[] field792 = new byte[65000];

    @OriginalMember(owner = "GLPUEKVZ", name = "L", descriptor = "Z")
    private boolean field793 = false;

    @OriginalMember(owner = "GLPUEKVZ", name = "N", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field795 = new CRC32();

    @OriginalMember(owner = "GLPUEKVZ", name = "O", descriptor = "[[I")
    private int[][] field796 = new int[4][];

    @OriginalMember(owner = "GLPUEKVZ", name = "P", descriptor = "Z")
    private boolean field797 = false;

    @OriginalMember(owner = "GLPUEKVZ", name = "T", descriptor = "[B")
    private byte[] field801 = new byte[500];

    @OriginalMember(owner = "GLPUEKVZ", name = "g", descriptor = "I")
    private int field762;

    @OriginalMember(owner = "GLPUEKVZ", name = "k", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "GLPUEKVZ", name = "n", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "GLPUEKVZ", name = "u", descriptor = "I")
    private int field776;

    @OriginalMember(owner = "GLPUEKVZ", name = "v", descriptor = "I")
    private int field777;

    @OriginalMember(owner = "GLPUEKVZ", name = "B", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "GLPUEKVZ", name = "F", descriptor = "I")
    private static int field787;

    @OriginalMember(owner = "GLPUEKVZ", name = "G", descriptor = "I")
    private int field788;

    @OriginalMember(owner = "GLPUEKVZ", name = "H", descriptor = "I")
    private int field789;

    @OriginalMember(owner = "GLPUEKVZ", name = "J", descriptor = "I")
    private int field791;

    @OriginalMember(owner = "GLPUEKVZ", name = "Q", descriptor = "I")
    private int field798;

    @OriginalMember(owner = "GLPUEKVZ", name = "S", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "GLPUEKVZ", name = "M", descriptor = "J")
    private long field794;

    @OriginalMember(owner = "GLPUEKVZ", name = "j", descriptor = "LUWCGEJPY;")
    private class60 field765;

    @OriginalMember(owner = "GLPUEKVZ", name = "f", descriptor = "Lclient;")
    private client field761;

    @OriginalMember(owner = "GLPUEKVZ", name = "x", descriptor = "Ljava/io/InputStream;")
    private InputStream field779;

    @OriginalMember(owner = "GLPUEKVZ", name = "z", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field781;

    @OriginalMember(owner = "GLPUEKVZ", name = "q", descriptor = "Ljava/net/Socket;")
    private Socket field772;

    @OriginalMember(owner = "GLPUEKVZ", name = "y", descriptor = "[B")
    private byte[] field780;

    @OriginalMember(owner = "GLPUEKVZ", name = "e", descriptor = "[I")
    private int[] field760;

    @OriginalMember(owner = "GLPUEKVZ", name = "r", descriptor = "[I")
    private int[] field773;

    @OriginalMember(owner = "GLPUEKVZ", name = "A", descriptor = "[I")
    private int[] field782;

    @OriginalMember(owner = "GLPUEKVZ", name = "D", descriptor = "[I")
    private int[] field785;

    @OriginalMember(owner = "GLPUEKVZ", name = "E", descriptor = "[I")
    private int[] field786;

    @OriginalMember(owner = "GLPUEKVZ", name = "R", descriptor = "[I")
    private int[] field799;

    @OriginalMember(owner = "GLPUEKVZ", name = "b", descriptor = "(I)V")
    private final void method276(int arg0) {
        if (arg0 != -18776) {
            this.field758 = !this.field758;
        }
        try {
            int var2 = this.field779.available();
            if (this.field789 == 0 && var2 >= 6) {
                this.field797 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field779.read(this.field801, var3, 6 - var3)) {
                }
                int var4 = this.field801[0] & 0xFF;
                int var5 = ((this.field801[1] & 0xFF) << 8) + (this.field801[2] & 0xFF);
                int var6 = ((this.field801[3] & 0xFF) << 8) + (this.field801[4] & 0xFF);
                int var7 = this.field801[5] & 0xFF;
                this.field765 = null;
                for (class60 var8 = (class60) this.field778.method451(); var8 != null; var8 = (class60) this.field778.method453((byte) 5)) {
                    if (var8.field1517 == var4 && var8.field1516 == var5) {
                        this.field765 = var8;
                    }
                    if (this.field765 != null) {
                        var8.field1514 = 0;
                    }
                }
                if (this.field765 != null) {
                    this.field800 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field765.field1515 = null;
                        if (this.field765.field1518) {
                            class36 var9 = this.field790;
                            synchronized (this.field790) {
                                this.field790.method448(this.field765);
                            }
                        } else {
                            this.field765.method156();
                        }
                        this.field765 = null;
                    } else {
                        if (this.field765.field1515 == null && var7 == 0) {
                            this.field765.field1515 = new byte[var6];
                        }
                        if (this.field765.field1515 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field788 = var7 * 500;
                this.field789 = 500;
                if (this.field789 > var6 - var7 * 500) {
                    this.field789 = var6 - var7 * 500;
                }
            }
            if (this.field789 > 0 && var2 >= this.field789) {
                this.field797 = true;
                byte[] var10 = this.field801;
                int var11 = 0;
                if (this.field765 != null) {
                    var10 = this.field765.field1515;
                    var11 = this.field788;
                }
                for (int var12 = 0; var12 < this.field789; var12 += this.field779.read(var10, var11 + var12, this.field789 - var12)) {
                }
                if (this.field789 + this.field788 >= var10.length && this.field765 != null) {
                    if (this.field761.field171[0] != null) {
                        this.field761.field171[this.field765.field1517 + 1].method511(var10, this.field765.field1516, 103, var10.length);
                    }
                    if (!this.field765.field1518 && this.field765.field1517 == 3) {
                        this.field765.field1518 = true;
                        this.field765.field1517 = 93;
                    }
                    if (this.field765.field1518) {
                        class36 var13 = this.field790;
                        synchronized (this.field790) {
                            this.field790.method448(this.field765);
                        }
                    } else {
                        this.field765.method156();
                    }
                }
                this.field789 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field772.close();
            } catch (Exception var15) {
            }
            this.field772 = null;
            this.field779 = null;
            this.field781 = null;
            this.field789 = 0;
        }
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "c", descriptor = "(I)V")
    private final void method277(int arg0) {
        int var2 = 98 / arg0;
        class36 var3 = this.field774;
        class60 var4;
        synchronized (this.field774) {
            var4 = (class60) this.field774.method450();
        }
        while (var4 != null) {
            this.field797 = true;
            byte[] var5 = null;
            if (this.field761.field171[0] != null) {
                var5 = this.field761.field171[var4.field1517 + 1].method510(var4.field1516, 16191);
            }
            if (!this.method286(this.field763, this.field759[var4.field1517][var4.field1516], this.field796[var4.field1517][var4.field1516], var5)) {
                var5 = null;
            }
            class36 var6 = this.field774;
            synchronized (this.field774) {
                if (var5 == null) {
                    this.field775.method448(var4);
                } else {
                    var4.field1515 = var5;
                    class36 var7 = this.field790;
                    synchronized (this.field790) {
                        this.field790.method448(var4);
                    }
                }
                var4 = (class60) this.field774.method450();
            }
        }
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "(I)V")
    public final void method278(int arg0) {
        this.method284(0, arg0);
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "(II)I")
    public final int method279(int arg0, int arg1) {
        if (arg0 <= 0) {
            this.field793 = !this.field793;
        }
        return this.field780[arg1] & 0xFF;
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "()I")
    public final int method280() {
        class9 var1 = this.field767;
        synchronized (this.field767) {
            return this.field767.method213();
        }
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "(B)V")
    private final void method281(byte arg0) {
        if (arg0 != -23) {
            return;
        }
        while (this.field776 == 0) {
            if (this.field777 >= 10 || this.field769 == 0) {
                return;
            }
            class36 var2 = this.field757;
            class60 var3;
            synchronized (this.field757) {
                var3 = (class60) this.field757.method450();
            }
            while (var3 != null) {
                if (this.field784[var3.field1517][var3.field1516] != 0) {
                    this.field784[var3.field1517][var3.field1516] = 0;
                    this.field778.method448(var3);
                    this.method290(var3, 332);
                    this.field797 = true;
                    if (this.field762 < this.field791) {
                        this.field762++;
                    }
                    this.field770 = "Loading extra files - " + this.field762 * 100 / this.field791 + "%";
                    this.field777++;
                    if (this.field777 == 10) {
                        return;
                    }
                }
                class36 var4 = this.field757;
                synchronized (this.field757) {
                    var3 = (class60) this.field757.method450();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field784[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field769) {
                        var6[var8] = 0;
                        class60 var9 = new class60();
                        var9.field1517 = var5;
                        var9.field1516 = var8;
                        var9.field1518 = false;
                        this.field778.method448(var9);
                        this.method290(var9, 332);
                        this.field797 = true;
                        if (this.field762 < this.field791) {
                            this.field762++;
                        }
                        this.field770 = "Loading extra files - " + this.field762 * 100 / this.field791 + "%";
                        this.field777++;
                        if (this.field777 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field769--;
        }
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "b", descriptor = "()V")
    public final void method282() {
        this.field768 = false;
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "(IBBI)V")
    public final void method283(int arg0, byte arg1, byte arg2, int arg3) {
        if (arg1 != 39) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field761.field171[0] == null || this.field796[arg3][arg0] == 0) {
            return;
        }
        byte[] var6 = this.field761.field171[arg3 + 1].method510(arg0, 16191);
        if (this.method286(this.field763, this.field759[arg3][arg0], this.field796[arg3][arg0], var6)) {
            return;
        }
        this.field784[arg3][arg0] = arg2;
        if (arg2 > this.field769) {
            this.field769 = arg2;
        }
        this.field791++;
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "b", descriptor = "(II)V")
    public final void method284(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field796.length || arg1 < 0 || arg1 > this.field796[arg0].length || this.field796[arg0][arg1] == 0) {
            return;
        }
        class9 var3 = this.field767;
        synchronized (this.field767) {
            for (class60 var4 = (class60) this.field767.method211(); var4 != null; var4 = (class60) this.field767.method212((byte) 5)) {
                if (var4.field1517 == arg0 && var4.field1516 == arg1) {
                    return;
                }
            }
            class60 var5 = new class60();
            var5.field1517 = arg0;
            var5.field1516 = arg1;
            var5.field1518 = true;
            class36 var6 = this.field774;
            synchronized (this.field774) {
                this.field774.method448(var5);
            }
            this.field767.method209(var5);
        }
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "(IIIZ)I")
    public final int method285(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = (arg2 << 8) + arg0;
        if (!arg3) {
            field787 = 220;
        }
        for (int var6 = 0; var6 < this.field799.length; var6++) {
            if (this.field799[var6] == var5) {
                if (arg1 == 0) {
                    return this.field760[var6];
                }
                return this.field786[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "(III[B)Z")
    private final boolean method286(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        if (arg0 != 9) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field795.reset();
        this.field795.update(arg3, 0, var5);
        int var8 = (int) this.field795.getValue();
        if (arg2 == var7) {
            return arg1 == var8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "(LSPZBTZXL;Lclient;)V")
    public final void method287(class51 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method515(var3[var4], null);
            int var27 = var26.length / 2;
            class34 var28 = new class34(var26, field787);
            this.field796[var4] = new int[var27];
            this.field784[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field796[var4][var29] = var28.method404();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method515(var5[var6], null);
            int var23 = var22.length / 4;
            class34 var24 = new class34(var22, field787);
            this.field759[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field759[var6][var25] = var24.method407();
            }
        }
        byte[] var7 = arg0.method515("model_index", null);
        int var8 = this.field796[0].length;
        this.field780 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field780[var9] = var7[var9];
            } else {
                this.field780[var9] = 0;
            }
        }
        byte[] var10 = arg0.method515("map_index", null);
        class34 var11 = new class34(var10, field787);
        int var12 = var10.length / 7;
        this.field799 = new int[var12];
        this.field760 = new int[var12];
        this.field786 = new int[var12];
        this.field773 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field799[var13] = var11.method404();
            this.field760[var13] = var11.method404();
            this.field786[var13] = var11.method404();
            this.field773[var13] = var11.method402();
        }
        byte[] var14 = arg0.method515("anim_index", null);
        class34 var15 = new class34(var14, field787);
        int var16 = var14.length / 2;
        this.field782 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field782[var17] = var15.method404();
        }
        byte[] var18 = arg0.method515("midi_index", null);
        class34 var19 = new class34(var18, field787);
        int var20 = var18.length;
        this.field785 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field785[var21] = var19.method402();
        }
        this.field761 = arg1;
        this.field768 = true;
        this.field761.method64(this, 2);
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field768) {
                this.field783++;
                byte var1 = 20;
                if (this.field769 == 0 && this.field761.field171[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field797 = true;
                for (int var2 = 0; var2 < 100 && this.field797; var2++) {
                    this.field797 = false;
                    this.method277(593);
                    this.method293((byte) 4);
                    if (this.field776 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method281((byte) -23);
                    if (this.field779 != null) {
                        this.method276(-18776);
                    }
                }
                boolean var3 = false;
                for (class60 var4 = (class60) this.field778.method451(); var4 != null; var4 = (class60) this.field778.method453((byte) 5)) {
                    if (var4.field1518) {
                        var3 = true;
                        var4.field1514++;
                        if (var4.field1514 > 50) {
                            var4.field1514 = 0;
                            this.method290(var4, 332);
                        }
                    }
                }
                if (!var3) {
                    for (class60 var5 = (class60) this.field778.method451(); var5 != null; var5 = (class60) this.field778.method453((byte) 5)) {
                        var3 = true;
                        var5.field1514++;
                        if (var5.field1514 > 50) {
                            var5.field1514 = 0;
                            this.method290(var5, 332);
                        }
                    }
                }
                if (var3) {
                    this.field800++;
                    if (this.field800 > 750) {
                        try {
                            this.field772.close();
                        } catch (Exception var8) {
                        }
                        this.field772 = null;
                        this.field779 = null;
                        this.field781 = null;
                        this.field789 = 0;
                    }
                } else {
                    this.field800 = 0;
                    this.field770 = "";
                }
                if (this.field761.field321 && this.field772 != null && this.field781 != null && (this.field769 > 0 || this.field761.field171[0] == null)) {
                    this.field798++;
                    if (this.field798 > 500) {
                        this.field798 = 0;
                        this.field801[0] = 0;
                        this.field801[1] = 0;
                        this.field801[2] = 0;
                        this.field801[3] = 10;
                        try {
                            this.field781.write(this.field801, 0, 4);
                        } catch (IOException var7) {
                            this.field800 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "(ZI)Z")
    public final boolean method288(boolean arg0, int arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return this.field785[arg1] == 1;
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "b", descriptor = "(ZI)Z")
    public final boolean method289(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.field799.length; var3++) {
            if (this.field786[var3] == arg1) {
                return true;
            }
        }
        if (!arg0) {
            this.field771 = !this.field771;
        }
        return false;
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "(LUWCGEJPY;I)V")
    private final void method290(class60 arg0, int arg1) {
        int var3 = 15 / arg1;
        try {
            if (this.field772 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field794 < 4000L) {
                    return;
                }
                this.field794 = var4;
                this.field772 = this.field761.method105(client.field410 + 43594);
                this.field779 = this.field772.getInputStream();
                this.field781 = this.field772.getOutputStream();
                this.field781.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field779.read();
                }
                this.field800 = 0;
            }
            this.field801[0] = (byte) arg0.field1517;
            this.field801[1] = (byte) (arg0.field1516 >> 8);
            this.field801[2] = (byte) arg0.field1516;
            if (arg0.field1518) {
                this.field801[3] = 2;
            } else if (this.field761.field321) {
                this.field801[3] = 0;
            } else {
                this.field801[3] = 1;
            }
            this.field781.write(this.field801, 0, 4);
            this.field798 = 0;
            this.field766 = -10000;
        } catch (IOException var9) {
            try {
                this.field772.close();
            } catch (Exception var8) {
            }
            this.field772 = null;
            this.field779 = null;
            this.field781 = null;
            this.field789 = 0;
            this.field766++;
        }
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "d", descriptor = "(I)V")
    public final void method291(int arg0) {
        if (arg0 != 0) {
            field787 = -435;
        }
        class36 var2 = this.field757;
        synchronized (this.field757) {
            this.field757.method455();
        }
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "(BZ)V")
    public final void method292(byte arg0, boolean arg1) {
        int var3 = this.field799.length;
        if (arg0 != -7) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field773[var4] != 0) {
                this.method283(this.field786[var4], (byte) 39, (byte) 2, 3);
                this.method283(this.field760[var4], (byte) 39, (byte) 2, 3);
            }
        }
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "b", descriptor = "(B)V")
    private final void method293(byte arg0) {
        this.field776 = 0;
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field758 = !this.field758;
        }
        this.field777 = 0;
        for (class60 var3 = (class60) this.field778.method451(); var3 != null; var3 = (class60) this.field778.method453((byte) 5)) {
            if (var3.field1518) {
                this.field776++;
            } else {
                this.field777++;
            }
        }
        while (this.field776 < 10) {
            class60 var4 = (class60) this.field775.method450();
            if (var4 == null) {
                break;
            }
            if (this.field784[var4.field1517][var4.field1516] != 0) {
                this.field762++;
            }
            this.field784[var4.field1517][var4.field1516] = 0;
            this.field778.method448(var4);
            this.field776++;
            this.method290(var4, 332);
            this.field797 = true;
        }
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "c", descriptor = "()LUWCGEJPY;")
    public final class60 method294() {
        class36 var1 = this.field790;
        class60 var2;
        synchronized (this.field790) {
            var2 = (class60) this.field790.method450();
        }
        if (var2 == null) {
            return null;
        }
        class9 var3 = this.field767;
        synchronized (this.field767) {
            var2.method373();
        }
        if (var2.field1515 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1515));
            while (true) {
                if (this.field792.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field792, var4, this.field792.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1515 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1515[var7] = this.field792[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "(BI)I")
    public final int method295(byte arg0, int arg1) {
        if (arg0 != 9) {
            field787 = -61;
        }
        return this.field796[arg1].length;
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "a", descriptor = "(IBI)V")
    public final void method296(int arg0, byte arg1, int arg2) {
        if (this.field761.field171[0] == null || (this.field796[arg0][arg2] == 0 || (this.field784[arg0][arg2] == 0 || this.field769 == 0))) {
            return;
        }
        class60 var4 = new class60();
        var4.field1517 = arg0;
        var4.field1516 = arg2;
        var4.field1518 = false;
        class36 var5 = this.field757;
        synchronized (this.field757) {
            this.field757.method448(var4);
        }
        if (arg1 == 16) {
            ;
        }
    }

    @OriginalMember(owner = "GLPUEKVZ", name = "e", descriptor = "(I)I")
    public final int method297(int arg0) {
        return arg0 < 0 ? this.field782.length : 4;
    }
}
