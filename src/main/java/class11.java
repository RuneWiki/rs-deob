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

@OriginalClass("ELICEBAH")
public class class11 extends class17 implements Runnable {

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "Z")
    private boolean field654 = false;

    @OriginalMember(owner = "ELICEBAH", name = "h", descriptor = "Z")
    private boolean field661 = false;

    @OriginalMember(owner = "ELICEBAH", name = "i", descriptor = "I")
    private int field662 = -652;

    @OriginalMember(owner = "ELICEBAH", name = "j", descriptor = "Z")
    private boolean field663 = true;

    @OriginalMember(owner = "ELICEBAH", name = "k", descriptor = "[[B")
    private byte[][] field664 = new byte[4][];

    @OriginalMember(owner = "ELICEBAH", name = "m", descriptor = "LURASIGRB;")
    private class58 field666 = new class58(41824);

    @OriginalMember(owner = "ELICEBAH", name = "n", descriptor = "LURASIGRB;")
    private class58 field667 = new class58(41824);

    @OriginalMember(owner = "ELICEBAH", name = "o", descriptor = "Z")
    private boolean field668 = false;

    @OriginalMember(owner = "ELICEBAH", name = "p", descriptor = "Ljava/lang/String;")
    public String field669 = "";

    @OriginalMember(owner = "ELICEBAH", name = "q", descriptor = "Z")
    private boolean field670 = false;

    @OriginalMember(owner = "ELICEBAH", name = "s", descriptor = "LODYOEFFK;")
    private class39 field672 = new class39(889);

    @OriginalMember(owner = "ELICEBAH", name = "u", descriptor = "LURASIGRB;")
    private class58 field674 = new class58(41824);

    @OriginalMember(owner = "ELICEBAH", name = "x", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field677 = new CRC32();

    @OriginalMember(owner = "ELICEBAH", name = "y", descriptor = "[[I")
    private int[][] field678 = new int[4][];

    @OriginalMember(owner = "ELICEBAH", name = "z", descriptor = "LURASIGRB;")
    private class58 field679 = new class58(41824);

    @OriginalMember(owner = "ELICEBAH", name = "I", descriptor = "LURASIGRB;")
    private class58 field688 = new class58(41824);

    @OriginalMember(owner = "ELICEBAH", name = "L", descriptor = "[B")
    private byte[] field691 = new byte[500];

    @OriginalMember(owner = "ELICEBAH", name = "N", descriptor = "[[I")
    private int[][] field693 = new int[4][];

    @OriginalMember(owner = "ELICEBAH", name = "Q", descriptor = "[B")
    private byte[] field696 = new byte[65000];

    @OriginalMember(owner = "ELICEBAH", name = "b", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "ELICEBAH", name = "e", descriptor = "I")
    private int field658;

    @OriginalMember(owner = "ELICEBAH", name = "f", descriptor = "I")
    private int field659;

    @OriginalMember(owner = "ELICEBAH", name = "t", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "ELICEBAH", name = "v", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "ELICEBAH", name = "w", descriptor = "I")
    private int field676;

    @OriginalMember(owner = "ELICEBAH", name = "B", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "ELICEBAH", name = "E", descriptor = "I")
    private int field684;

    @OriginalMember(owner = "ELICEBAH", name = "F", descriptor = "I")
    private int field685;

    @OriginalMember(owner = "ELICEBAH", name = "K", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "ELICEBAH", name = "O", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "ELICEBAH", name = "P", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "ELICEBAH", name = "D", descriptor = "J")
    private long field683;

    @OriginalMember(owner = "ELICEBAH", name = "A", descriptor = "LVVUONHHF;")
    private class63 field680;

    @OriginalMember(owner = "ELICEBAH", name = "R", descriptor = "Lclient;")
    private client field697;

    @OriginalMember(owner = "ELICEBAH", name = "H", descriptor = "Ljava/io/InputStream;")
    private InputStream field687;

    @OriginalMember(owner = "ELICEBAH", name = "C", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field682;

    @OriginalMember(owner = "ELICEBAH", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field660;

    @OriginalMember(owner = "ELICEBAH", name = "M", descriptor = "[B")
    private byte[] field692;

    @OriginalMember(owner = "ELICEBAH", name = "c", descriptor = "[I")
    private int[] field656;

    @OriginalMember(owner = "ELICEBAH", name = "d", descriptor = "[I")
    private int[] field657;

    @OriginalMember(owner = "ELICEBAH", name = "l", descriptor = "[I")
    private int[] field665;

    @OriginalMember(owner = "ELICEBAH", name = "r", descriptor = "[I")
    private int[] field671;

    @OriginalMember(owner = "ELICEBAH", name = "G", descriptor = "[I")
    private int[] field686;

    @OriginalMember(owner = "ELICEBAH", name = "J", descriptor = "[I")
    private int[] field689;

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "(II)V")
    public final void method184(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field678.length || arg1 < 0 || arg1 > this.field678[arg0].length || this.field678[arg0][arg1] == 0) {
            return;
        }
        class39 var3 = this.field672;
        synchronized (this.field672) {
            for (class63 var4 = (class63) this.field672.method395(); var4 != null; var4 = (class63) this.field672.method396(false)) {
                if (var4.field1557 == arg0 && var4.field1558 == arg1) {
                    return;
                }
            }
            class63 var5 = new class63();
            var5.field1557 = arg0;
            var5.field1558 = arg1;
            var5.field1561 = true;
            class58 var6 = this.field667;
            synchronized (this.field667) {
                this.field667.method500(var5);
            }
            this.field672.method393(var5);
        }
    }

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "(B)V")
    public final void method185(byte arg0) {
        class58 var2 = this.field666;
        synchronized (this.field666) {
            this.field666.method507();
        }
        if (arg0 == 6) {
            ;
        }
    }

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "(ZI)Z")
    public final boolean method186(boolean arg0, int arg1) {
        if (arg0) {
            this.field670 = !this.field670;
        }
        return this.field689[arg1] == 1;
    }

    @OriginalMember(owner = "ELICEBAH", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field663) {
                this.field655++;
                byte var1 = 20;
                if (this.field690 == 0 && this.field697.field434[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field668 = true;
                for (int var2 = 0; var2 < 100 && this.field668; var2++) {
                    this.field668 = false;
                    this.method190((byte) 98);
                    this.method205(-477);
                    if (this.field684 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method192(-45);
                    if (this.field687 != null) {
                        this.method193(-668);
                    }
                }
                boolean var3 = false;
                for (class63 var4 = (class63) this.field674.method503(); var4 != null; var4 = (class63) this.field674.method505(false)) {
                    if (var4.field1561) {
                        var3 = true;
                        var4.field1560++;
                        if (var4.field1560 > 50) {
                            var4.field1560 = 0;
                            this.method189(-207, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class63 var5 = (class63) this.field674.method503(); var5 != null; var5 = (class63) this.field674.method505(false)) {
                        var3 = true;
                        var5.field1560++;
                        if (var5.field1560 > 50) {
                            var5.field1560 = 0;
                            this.method189(-207, var5);
                        }
                    }
                }
                if (var3) {
                    this.field694++;
                    if (this.field694 > 750) {
                        try {
                            this.field660.close();
                        } catch (Exception var8) {
                        }
                        this.field660 = null;
                        this.field687 = null;
                        this.field682 = null;
                        this.field676 = 0;
                    }
                } else {
                    this.field694 = 0;
                    this.field669 = "";
                }
                if (this.field697.field248 && this.field660 != null && this.field682 != null && (this.field690 > 0 || this.field697.field434[0] == null)) {
                    this.field695++;
                    if (this.field695 > 500) {
                        this.field695 = 0;
                        this.field691[0] = 0;
                        this.field691[1] = 0;
                        this.field691[2] = 0;
                        this.field691[3] = 10;
                        try {
                            this.field682.write(this.field691, 0, 4);
                        } catch (IOException var7) {
                            this.field694 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "ELICEBAH", name = "b", descriptor = "(ZI)Z")
    public final boolean method187(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.field665.length; var3++) {
            if (this.field656[var3] == arg1) {
                return true;
            }
        }
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "()V")
    public final void method188() {
        this.field663 = false;
    }

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "(ILVVUONHHF;)V")
    private final void method189(int arg0, class63 arg1) {
        if (arg0 >= 0) {
            return;
        }
        try {
            if (this.field660 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field683 < 4000L) {
                    return;
                }
                this.field683 = var3;
                this.field660 = this.field697.method99(client.field194 + 43594);
                this.field687 = this.field660.getInputStream();
                this.field682 = this.field660.getOutputStream();
                this.field682.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field687.read();
                }
                this.field694 = 0;
            }
            this.field691[0] = (byte) arg1.field1557;
            this.field691[1] = (byte) (arg1.field1558 >> 8);
            this.field691[2] = (byte) arg1.field1558;
            if (arg1.field1561) {
                this.field691[3] = 2;
            } else if (this.field697.field248) {
                this.field691[3] = 0;
            } else {
                this.field691[3] = 1;
            }
            this.field682.write(this.field691, 0, 4);
            this.field695 = 0;
            this.field681 = -10000;
        } catch (IOException var8) {
            try {
                this.field660.close();
            } catch (Exception var7) {
            }
            this.field660 = null;
            this.field687 = null;
            this.field682 = null;
            this.field676 = 0;
            this.field681++;
        }
    }

    @OriginalMember(owner = "ELICEBAH", name = "b", descriptor = "(B)V")
    private final void method190(byte arg0) {
        class58 var2 = this.field667;
        class63 var3;
        synchronized (this.field667) {
            var3 = (class63) this.field667.method502();
        }
        if (arg0 != 98) {
            this.field662 = -335;
        }
        while (var3 != null) {
            this.field668 = true;
            byte[] var4 = null;
            if (this.field697.field434[0] != null) {
                var4 = this.field697.field434[var3.field1557 + 1].method328(-7321, var3.field1558);
            }
            if (!this.method203(this.field661, this.field678[var3.field1557][var3.field1558], this.field693[var3.field1557][var3.field1558], var4)) {
                var4 = null;
            }
            class58 var5 = this.field667;
            synchronized (this.field667) {
                if (var4 == null) {
                    this.field679.method500(var3);
                } else {
                    var3.field1559 = var4;
                    class58 var6 = this.field688;
                    synchronized (this.field688) {
                        this.field688.method500(var3);
                    }
                }
                var3 = (class63) this.field667.method502();
            }
        }
    }

    @OriginalMember(owner = "ELICEBAH", name = "c", descriptor = "(ZI)I")
    public final int method191(boolean arg0, int arg1) {
        return arg0 ? 2 : this.field678[arg1].length;
    }

    @OriginalMember(owner = "ELICEBAH", name = "b", descriptor = "(I)V")
    private final void method192(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.field684 == 0) {
            if (this.field685 >= 10 || this.field690 == 0) {
                return;
            }
            class58 var3 = this.field666;
            class63 var4;
            synchronized (this.field666) {
                var4 = (class63) this.field666.method502();
            }
            while (var4 != null) {
                if (this.field664[var4.field1557][var4.field1558] != 0) {
                    this.field664[var4.field1557][var4.field1558] = 0;
                    this.field674.method500(var4);
                    this.method189(-207, var4);
                    this.field668 = true;
                    if (this.field673 < this.field658) {
                        this.field673++;
                    }
                    this.field669 = "Loading extra files - " + this.field673 * 100 / this.field658 + "%";
                    this.field685++;
                    if (this.field685 == 10) {
                        return;
                    }
                }
                class58 var5 = this.field666;
                synchronized (this.field666) {
                    var4 = (class63) this.field666.method502();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field664[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field690) {
                        var7[var9] = 0;
                        class63 var10 = new class63();
                        var10.field1557 = var6;
                        var10.field1558 = var9;
                        var10.field1561 = false;
                        this.field674.method500(var10);
                        this.method189(-207, var10);
                        this.field668 = true;
                        if (this.field673 < this.field658) {
                            this.field673++;
                        }
                        this.field669 = "Loading extra files - " + this.field673 * 100 / this.field658 + "%";
                        this.field685++;
                        if (this.field685 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field690--;
        }
    }

    @OriginalMember(owner = "ELICEBAH", name = "c", descriptor = "(I)V")
    private final void method193(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        try {
            int var2 = this.field687.available();
            if (this.field676 == 0 && var2 >= 6) {
                this.field668 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field687.read(this.field691, var3, 6 - var3)) {
                }
                int var4 = this.field691[0] & 0xFF;
                int var5 = ((this.field691[1] & 0xFF) << 8) + (this.field691[2] & 0xFF);
                int var6 = ((this.field691[3] & 0xFF) << 8) + (this.field691[4] & 0xFF);
                int var7 = this.field691[5] & 0xFF;
                this.field680 = null;
                for (class63 var8 = (class63) this.field674.method503(); var8 != null; var8 = (class63) this.field674.method505(false)) {
                    if (var8.field1557 == var4 && var8.field1558 == var5) {
                        this.field680 = var8;
                    }
                    if (this.field680 != null) {
                        var8.field1560 = 0;
                    }
                }
                if (this.field680 != null) {
                    this.field694 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field680.field1559 = null;
                        if (this.field680.field1561) {
                            class58 var9 = this.field688;
                            synchronized (this.field688) {
                                this.field688.method500(this.field680);
                            }
                        } else {
                            this.field680.method398();
                        }
                        this.field680 = null;
                    } else {
                        if (this.field680.field1559 == null && var7 == 0) {
                            this.field680.field1559 = new byte[var6];
                        }
                        if (this.field680.field1559 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field675 = var7 * 500;
                this.field676 = 500;
                if (this.field676 > var6 - var7 * 500) {
                    this.field676 = var6 - var7 * 500;
                }
            }
            if (this.field676 > 0 && var2 >= this.field676) {
                this.field668 = true;
                byte[] var10 = this.field691;
                int var11 = 0;
                if (this.field680 != null) {
                    var10 = this.field680.field1559;
                    var11 = this.field675;
                }
                for (int var12 = 0; var12 < this.field676; var12 += this.field687.read(var10, var11 + var12, this.field676 - var12)) {
                }
                if (this.field676 + this.field675 >= var10.length && this.field680 != null) {
                    if (this.field697.field434[0] != null) {
                        this.field697.field434[this.field680.field1557 + 1].method329(this.field680.field1558, this.field659, var10.length, var10);
                    }
                    if (!this.field680.field1561 && this.field680.field1557 == 3) {
                        this.field680.field1561 = true;
                        this.field680.field1557 = 93;
                    }
                    if (this.field680.field1561) {
                        class58 var13 = this.field688;
                        synchronized (this.field688) {
                            this.field688.method500(this.field680);
                        }
                    } else {
                        this.field680.method398();
                    }
                }
                this.field676 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field660.close();
            } catch (Exception var15) {
            }
            this.field660 = null;
            this.field687 = null;
            this.field682 = null;
            this.field676 = 0;
        }
    }

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "(Z)I")
    public final int method194(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field686.length;
    }

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "(III)V")
    public final void method195(int arg0, int arg1, int arg2) {
        if (this.field697.field434[0] == null || (this.field678[arg2][arg1] == 0 || (this.field664[arg2][arg1] == 0 || this.field690 == 0))) {
            return;
        }
        class63 var4 = new class63();
        var4.field1557 = arg2;
        var4.field1558 = arg1;
        var4.field1561 = false;
        class58 var5 = this.field666;
        synchronized (this.field666) {
            this.field666.method500(var4);
        }
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "(LRVLWVPJQ;Lclient;)V")
    public final void method196(class50 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method424(var3[var4], null);
            int var27 = var26.length / 2;
            class55 var28 = new class55(741, var26);
            this.field678[var4] = new int[var27];
            this.field664[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field678[var4][var29] = var28.method457();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method424(var5[var6], null);
            int var23 = var22.length / 4;
            class55 var24 = new class55(741, var22);
            this.field693[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field693[var6][var25] = var24.method460();
            }
        }
        byte[] var7 = arg0.method424("model_index", null);
        int var8 = this.field678[0].length;
        this.field692 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field692[var9] = var7[var9];
            } else {
                this.field692[var9] = 0;
            }
        }
        byte[] var10 = arg0.method424("map_index", null);
        class55 var11 = new class55(741, var10);
        int var12 = var10.length / 7;
        this.field665 = new int[var12];
        this.field671 = new int[var12];
        this.field656 = new int[var12];
        this.field657 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field665[var13] = var11.method457();
            this.field671[var13] = var11.method457();
            this.field656[var13] = var11.method457();
            this.field657[var13] = var11.method455();
        }
        byte[] var14 = arg0.method424("anim_index", null);
        class55 var15 = new class55(741, var14);
        int var16 = var14.length / 2;
        this.field686 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field686[var17] = var15.method457();
        }
        byte[] var18 = arg0.method424("midi_index", null);
        class55 var19 = new class55(741, var18);
        int var20 = var18.length;
        this.field689 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field689[var21] = var19.method455();
        }
        this.field697 = arg1;
        this.field663 = true;
        this.field697.method12(this, 2);
    }

    @OriginalMember(owner = "ELICEBAH", name = "b", descriptor = "()LVVUONHHF;")
    public final class63 method197() {
        class58 var1 = this.field688;
        class63 var2;
        synchronized (this.field688) {
            var2 = (class63) this.field688.method502();
        }
        if (var2 == null) {
            return null;
        }
        class39 var3 = this.field672;
        synchronized (this.field672) {
            var2.method209();
        }
        if (var2.field1559 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1559));
            while (true) {
                if (this.field696.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field696, var4, this.field696.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1559 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1559[var7] = this.field696[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "(I)V")
    public final void method198(int arg0) {
        this.method184(0, arg0);
    }

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "(IIII)I")
    public final int method199(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg3 << 8) + arg0;
        if (arg2 >= 0) {
            this.field670 = !this.field670;
        }
        for (int var6 = 0; var6 < this.field665.length; var6++) {
            if (this.field665[var6] == var5) {
                if (arg1 == 0) {
                    return this.field671[var6];
                }
                return this.field656[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "ELICEBAH", name = "b", descriptor = "(II)I")
    public final int method200(int arg0, int arg1) {
        while (arg1 >= 0) {
            this.field670 = !this.field670;
        }
        return this.field692[arg0] & 0xFF;
    }

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "(IIBI)V")
    public final void method201(int arg0, int arg1, byte arg2, int arg3) {
        if (this.field697.field434[0] == null || this.field678[arg1][arg3] == 0) {
            return;
        }
        byte[] var5 = this.field697.field434[arg1 + 1].method328(-7321, arg3);
        if (this.method203(this.field661, this.field678[arg1][arg3], this.field693[arg1][arg3], var5)) {
            return;
        }
        this.field664[arg1][arg3] = arg2;
        if (arg0 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg2 > this.field690) {
            this.field690 = arg2;
        }
        this.field658++;
    }

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "(IZ)V")
    public final void method202(int arg0, boolean arg1) {
        while (arg0 >= 0) {
            this.field670 = !this.field670;
        }
        int var3 = this.field665.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field657[var4] != 0) {
                this.method201(-279, 3, (byte) 2, this.field656[var4]);
                this.method201(-279, 3, (byte) 2, this.field671[var4]);
            }
        }
    }

    @OriginalMember(owner = "ELICEBAH", name = "a", descriptor = "(ZII[B)Z")
    private final boolean method203(boolean arg0, int arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field677.reset();
        this.field677.update(arg3, 0, var5);
        int var7 = (int) this.field677.getValue();
        if (arg0) {
            this.field654 = !this.field654;
        }
        if (arg1 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "ELICEBAH", name = "c", descriptor = "()I")
    public final int method204() {
        class39 var1 = this.field672;
        synchronized (this.field672) {
            return this.field672.method397();
        }
    }

    @OriginalMember(owner = "ELICEBAH", name = "d", descriptor = "(I)V")
    private final void method205(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        this.field684 = 0;
        this.field685 = 0;
        for (class63 var2 = (class63) this.field674.method503(); var2 != null; var2 = (class63) this.field674.method505(false)) {
            if (var2.field1561) {
                this.field684++;
            } else {
                this.field685++;
            }
        }
        while (this.field684 < 10) {
            class63 var3 = (class63) this.field679.method502();
            if (var3 == null) {
                break;
            }
            if (this.field664[var3.field1557][var3.field1558] != 0) {
                this.field673++;
            }
            this.field664[var3.field1557][var3.field1558] = 0;
            this.field674.method500(var3);
            this.field684++;
            this.method189(-207, var3);
            this.field668 = true;
        }
    }
}
