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

@OriginalClass("CXHZUTUD")
public class class9 extends class30 implements Runnable {

    @OriginalMember(owner = "CXHZUTUD", name = "b", descriptor = "[B")
    private byte[] field561 = new byte[500];

    @OriginalMember(owner = "CXHZUTUD", name = "i", descriptor = "LROXEPOUC;")
    private class51 field568 = new class51(0);

    @OriginalMember(owner = "CXHZUTUD", name = "n", descriptor = "Z")
    private boolean field573 = true;

    @OriginalMember(owner = "CXHZUTUD", name = "p", descriptor = "Z")
    private boolean field575 = true;

    @OriginalMember(owner = "CXHZUTUD", name = "q", descriptor = "Z")
    private boolean field576 = false;

    @OriginalMember(owner = "CXHZUTUD", name = "t", descriptor = "Ljava/lang/String;")
    public String field579 = "";

    @OriginalMember(owner = "CXHZUTUD", name = "u", descriptor = "[[I")
    private int[][] field580 = new int[4][];

    @OriginalMember(owner = "CXHZUTUD", name = "y", descriptor = "Z")
    private boolean field584 = true;

    @OriginalMember(owner = "CXHZUTUD", name = "C", descriptor = "[[I")
    private int[][] field588 = new int[4][];

    @OriginalMember(owner = "CXHZUTUD", name = "D", descriptor = "I")
    private int field589 = 4;

    @OriginalMember(owner = "CXHZUTUD", name = "E", descriptor = "I")
    private int field590 = 870;

    @OriginalMember(owner = "CXHZUTUD", name = "F", descriptor = "LROXEPOUC;")
    private class51 field591 = new class51(0);

    @OriginalMember(owner = "CXHZUTUD", name = "G", descriptor = "[[B")
    private byte[][] field592 = new byte[4][];

    @OriginalMember(owner = "CXHZUTUD", name = "H", descriptor = "LKMFVYEKJ;")
    private class37 field593 = new class37(0);

    @OriginalMember(owner = "CXHZUTUD", name = "I", descriptor = "LROXEPOUC;")
    private class51 field594 = new class51(0);

    @OriginalMember(owner = "CXHZUTUD", name = "J", descriptor = "[B")
    private byte[] field595 = new byte[65000];

    @OriginalMember(owner = "CXHZUTUD", name = "K", descriptor = "LROXEPOUC;")
    private class51 field596 = new class51(0);

    @OriginalMember(owner = "CXHZUTUD", name = "L", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field597 = new CRC32();

    @OriginalMember(owner = "CXHZUTUD", name = "M", descriptor = "LROXEPOUC;")
    private class51 field598 = new class51(0);

    @OriginalMember(owner = "CXHZUTUD", name = "Q", descriptor = "Z")
    private boolean field602 = false;

    @OriginalMember(owner = "CXHZUTUD", name = "d", descriptor = "I")
    private int field563;

    @OriginalMember(owner = "CXHZUTUD", name = "e", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "CXHZUTUD", name = "h", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "CXHZUTUD", name = "o", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "CXHZUTUD", name = "v", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "CXHZUTUD", name = "w", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "CXHZUTUD", name = "x", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "CXHZUTUD", name = "z", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "CXHZUTUD", name = "A", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "CXHZUTUD", name = "B", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "CXHZUTUD", name = "O", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "J")
    private long field560;

    @OriginalMember(owner = "CXHZUTUD", name = "l", descriptor = "LCNNODYJR;")
    private class6 field571;

    @OriginalMember(owner = "CXHZUTUD", name = "r", descriptor = "Lclient;")
    private client field577;

    @OriginalMember(owner = "CXHZUTUD", name = "P", descriptor = "Ljava/io/InputStream;")
    private InputStream field601;

    @OriginalMember(owner = "CXHZUTUD", name = "s", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field578;

    @OriginalMember(owner = "CXHZUTUD", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field565;

    @OriginalMember(owner = "CXHZUTUD", name = "R", descriptor = "[B")
    private byte[] field603;

    @OriginalMember(owner = "CXHZUTUD", name = "c", descriptor = "[I")
    private int[] field562;

    @OriginalMember(owner = "CXHZUTUD", name = "g", descriptor = "[I")
    private int[] field566;

    @OriginalMember(owner = "CXHZUTUD", name = "j", descriptor = "[I")
    private int[] field569;

    @OriginalMember(owner = "CXHZUTUD", name = "k", descriptor = "[I")
    private int[] field570;

    @OriginalMember(owner = "CXHZUTUD", name = "m", descriptor = "[I")
    private int[] field572;

    @OriginalMember(owner = "CXHZUTUD", name = "N", descriptor = "[I")
    private int[] field599;

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(ZI)I")
    public final int method165(boolean arg0, int arg1) {
        return arg0 ? 1 : this.field603[arg1] & 0xFF;
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "()V")
    public final void method166() {
        this.field573 = false;
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(IIB[B)Z")
    private final boolean method167(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field597.reset();
        this.field597.update(arg3, 0, var5);
        int var7 = (int) this.field597.getValue();
        if (arg2 != -84) {
            this.field589 = -49;
        }
        if (arg0 == var6) {
            return arg1 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(IZ)V")
    public final void method168(int arg0, boolean arg1) {
        int var3 = this.field599.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field562[var4] != 0) {
                this.method174(this.field569[var4], 3, (byte) 2, 8);
                this.method174(this.field566[var4], 3, (byte) 2, 8);
            }
        }
        if (arg0 == 8) {
            ;
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(IIII)I")
    public final int method169(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg1 << 8) + arg0;
        if (arg3 != 6) {
            return 1;
        }
        for (int var6 = 0; var6 < this.field599.length; var6++) {
            if (this.field599[var6] == var5) {
                if (arg2 == 0) {
                    return this.field566[var6];
                }
                return this.field569[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(LDYBMLHQM;Lclient;)V")
    public final void method170(class16 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method248(var3[var4], null);
            int var27 = var26.length / 2;
            class29 var28 = new class29((byte) -28, var26);
            this.field588[var4] = new int[var27];
            this.field592[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field588[var4][var29] = var28.method310();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method248(var5[var6], null);
            int var23 = var22.length / 4;
            class29 var24 = new class29((byte) -28, var22);
            this.field580[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field580[var6][var25] = var24.method313();
            }
        }
        byte[] var7 = arg0.method248("model_index", null);
        int var8 = this.field588[0].length;
        this.field603 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field603[var9] = var7[var9];
            } else {
                this.field603[var9] = 0;
            }
        }
        byte[] var10 = arg0.method248("map_index", null);
        class29 var11 = new class29((byte) -28, var10);
        int var12 = var10.length / 7;
        this.field599 = new int[var12];
        this.field566 = new int[var12];
        this.field569 = new int[var12];
        this.field562 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field599[var13] = var11.method310();
            this.field566[var13] = var11.method310();
            this.field569[var13] = var11.method310();
            this.field562[var13] = var11.method308();
        }
        byte[] var14 = arg0.method248("anim_index", null);
        class29 var15 = new class29((byte) -28, var14);
        int var16 = var14.length / 2;
        this.field570 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field570[var17] = var15.method310();
        }
        byte[] var18 = arg0.method248("midi_index", null);
        class29 var19 = new class29((byte) -28, var18);
        int var20 = var18.length;
        this.field572 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field572[var21] = var19.method308();
        }
        this.field577 = arg1;
        this.field573 = true;
        this.field577.method113(this, 2);
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(II)V")
    public final void method171(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field588.length || arg1 < 0 || arg1 > this.field588[arg0].length || this.field588[arg0][arg1] == 0) {
            return;
        }
        class37 var3 = this.field593;
        synchronized (this.field593) {
            for (class6 var4 = (class6) this.field593.method373(); var4 != null; var4 = (class6) this.field593.method374(0)) {
                if (var4.field525 == arg0 && var4.field526 == arg1) {
                    return;
                }
            }
            class6 var5 = new class6();
            var5.field525 = arg0;
            var5.field526 = arg1;
            var5.field524 = true;
            class51 var6 = this.field598;
            synchronized (this.field598) {
                this.field598.method424(var5);
            }
            this.field593.method371(var5);
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(IBI)V")
    public final void method172(int arg0, byte arg1, int arg2) {
        if (arg1 != -119) {
            this.field575 = !this.field575;
        }
        if (this.field577.field58[0] == null || (this.field588[arg2][arg0] == 0 || (this.field592[arg2][arg0] == 0 || this.field563 == 0))) {
            return;
        }
        class6 var4 = new class6();
        var4.field525 = arg2;
        var4.field526 = arg0;
        var4.field524 = false;
        class51 var5 = this.field594;
        synchronized (this.field594) {
            this.field594.method424(var4);
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "b", descriptor = "(I)V")
    private final void method173(int arg0) {
        this.field585 = 0;
        if (arg0 != 12184) {
            this.field584 = !this.field584;
        }
        this.field586 = 0;
        for (class6 var2 = (class6) this.field596.method427(); var2 != null; var2 = (class6) this.field596.method429(0)) {
            if (var2.field524) {
                this.field585++;
            } else {
                this.field586++;
            }
        }
        while (this.field585 < 10) {
            class6 var3 = (class6) this.field568.method426();
            if (var3 == null) {
                break;
            }
            if (this.field592[var3.field525][var3.field526] != 0) {
                this.field574++;
            }
            this.field592[var3.field525][var3.field526] = 0;
            this.field596.method424(var3);
            this.field585++;
            this.method183(var3, 7);
            this.field576 = true;
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(IIBI)V")
    public final void method174(int arg0, int arg1, byte arg2, int arg3) {
        if (this.field577.field58[0] == null || this.field588[arg1][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field577.field58[arg1 + 1].method351(6, arg0);
        if (this.method167(this.field588[arg1][arg0], this.field580[arg1][arg0], (byte) -84, var5)) {
            return;
        }
        this.field592[arg1][arg0] = arg2;
        if (arg3 >= 8 && arg3 <= 8) {
            if (arg2 > this.field563) {
                this.field563 = arg2;
            }
            this.field587++;
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        this.method171(0, arg0);
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(IB)Z")
    public final boolean method176(int arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field599.length; var3++) {
            if (this.field569[var3] == arg0) {
                return true;
            }
        }
        if (arg1 != 7) {
            this.field575 = !this.field575;
        }
        return false;
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(Z)I")
    public final int method177(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field570.length;
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(B)V")
    private final void method178(byte arg0) {
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        try {
            int var3 = this.field601.available();
            if (this.field583 == 0 && var3 >= 6) {
                this.field576 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field601.read(this.field561, var4, 6 - var4)) {
                }
                int var5 = this.field561[0] & 0xFF;
                int var6 = ((this.field561[1] & 0xFF) << 8) + (this.field561[2] & 0xFF);
                int var7 = ((this.field561[3] & 0xFF) << 8) + (this.field561[4] & 0xFF);
                int var8 = this.field561[5] & 0xFF;
                this.field571 = null;
                for (class6 var9 = (class6) this.field596.method427(); var9 != null; var9 = (class6) this.field596.method429(0)) {
                    if (var9.field525 == var5 && var9.field526 == var6) {
                        this.field571 = var9;
                    }
                    if (this.field571 != null) {
                        var9.field527 = 0;
                    }
                }
                if (this.field571 != null) {
                    this.field567 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field571.field528 = null;
                        if (this.field571.field524) {
                            class51 var10 = this.field591;
                            synchronized (this.field591) {
                                this.field591.method424(this.field571);
                            }
                        } else {
                            this.field571.method234();
                        }
                        this.field571 = null;
                    } else {
                        if (this.field571.field528 == null && var8 == 0) {
                            this.field571.field528 = new byte[var7];
                        }
                        if (this.field571.field528 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field582 = var8 * 500;
                this.field583 = 500;
                if (this.field583 > var7 - var8 * 500) {
                    this.field583 = var7 - var8 * 500;
                }
            }
            if (this.field583 > 0 && var3 >= this.field583) {
                this.field576 = true;
                byte[] var11 = this.field561;
                int var12 = 0;
                if (this.field571 != null) {
                    var11 = this.field571.field528;
                    var12 = this.field582;
                }
                for (int var13 = 0; var13 < this.field583; var13 += this.field601.read(var11, var12 + var13, this.field583 - var13)) {
                }
                if (this.field583 + this.field582 >= var11.length && this.field571 != null) {
                    if (this.field577.field58[0] != null) {
                        this.field577.field58[this.field571.field525 + 1].method352(this.field571.field526, var11.length, (byte) 48, var11);
                    }
                    if (!this.field571.field524 && this.field571.field525 == 3) {
                        this.field571.field524 = true;
                        this.field571.field525 = 93;
                    }
                    if (this.field571.field524) {
                        class51 var14 = this.field591;
                        synchronized (this.field591) {
                            this.field591.method424(this.field571);
                        }
                    } else {
                        this.field571.method234();
                    }
                }
                this.field583 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field565.close();
            } catch (Exception var16) {
            }
            this.field565 = null;
            this.field601 = null;
            this.field578 = null;
            this.field583 = 0;
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "b", descriptor = "()I")
    public final int method179() {
        class37 var1 = this.field593;
        synchronized (this.field593) {
            return this.field593.method375();
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field573) {
                this.field600++;
                byte var1 = 20;
                if (this.field563 == 0 && this.field577.field58[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field576 = true;
                for (int var2 = 0; var2 < 100 && this.field576; var2++) {
                    this.field576 = false;
                    this.method181((byte) 5);
                    this.method173(12184);
                    if (this.field585 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method180(-766);
                    if (this.field601 != null) {
                        this.method178((byte) 7);
                    }
                }
                boolean var3 = false;
                for (class6 var4 = (class6) this.field596.method427(); var4 != null; var4 = (class6) this.field596.method429(0)) {
                    if (var4.field524) {
                        var3 = true;
                        var4.field527++;
                        if (var4.field527 > 50) {
                            var4.field527 = 0;
                            this.method183(var4, 7);
                        }
                    }
                }
                if (!var3) {
                    for (class6 var5 = (class6) this.field596.method427(); var5 != null; var5 = (class6) this.field596.method429(0)) {
                        var3 = true;
                        var5.field527++;
                        if (var5.field527 > 50) {
                            var5.field527 = 0;
                            this.method183(var5, 7);
                        }
                    }
                }
                if (var3) {
                    this.field567++;
                    if (this.field567 > 750) {
                        try {
                            this.field565.close();
                        } catch (Exception var8) {
                        }
                        this.field565 = null;
                        this.field601 = null;
                        this.field578 = null;
                        this.field583 = 0;
                    }
                } else {
                    this.field567 = 0;
                    this.field579 = "";
                }
                if (this.field577.field191 && this.field565 != null && this.field578 != null && (this.field563 > 0 || this.field577.field58[0] == null)) {
                    this.field581++;
                    if (this.field581 > 500) {
                        this.field581 = 0;
                        this.field561[0] = 0;
                        this.field561[1] = 0;
                        this.field561[2] = 0;
                        this.field561[3] = 10;
                        try {
                            this.field578.write(this.field561, 0, 4);
                        } catch (IOException var7) {
                            this.field567 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "c", descriptor = "(I)V")
    private final void method180(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.field585 == 0) {
            if (this.field586 >= 10 || this.field563 == 0) {
                return;
            }
            class51 var3 = this.field594;
            class6 var4;
            synchronized (this.field594) {
                var4 = (class6) this.field594.method426();
            }
            while (var4 != null) {
                if (this.field592[var4.field525][var4.field526] != 0) {
                    this.field592[var4.field525][var4.field526] = 0;
                    this.field596.method424(var4);
                    this.method183(var4, 7);
                    this.field576 = true;
                    if (this.field574 < this.field587) {
                        this.field574++;
                    }
                    this.field579 = "Loading extra files - " + this.field574 * 100 / this.field587 + "%";
                    this.field586++;
                    if (this.field586 == 10) {
                        return;
                    }
                }
                class51 var5 = this.field594;
                synchronized (this.field594) {
                    var4 = (class6) this.field594.method426();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field592[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field563) {
                        var7[var9] = 0;
                        class6 var10 = new class6();
                        var10.field525 = var6;
                        var10.field526 = var9;
                        var10.field524 = false;
                        this.field596.method424(var10);
                        this.method183(var10, 7);
                        this.field576 = true;
                        if (this.field574 < this.field587) {
                            this.field574++;
                        }
                        this.field579 = "Loading extra files - " + this.field574 * 100 / this.field587 + "%";
                        this.field586++;
                        if (this.field586 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field563--;
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "b", descriptor = "(B)V")
    private final void method181(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field589 = 441;
        }
        class51 var3 = this.field598;
        class6 var4;
        synchronized (this.field598) {
            var4 = (class6) this.field598.method426();
        }
        while (var4 != null) {
            this.field576 = true;
            byte[] var5 = null;
            if (this.field577.field58[0] != null) {
                var5 = this.field577.field58[var4.field525 + 1].method351(6, var4.field526);
            }
            if (!this.method167(this.field588[var4.field525][var4.field526], this.field580[var4.field525][var4.field526], (byte) -84, var5)) {
                var5 = null;
            }
            class51 var6 = this.field598;
            synchronized (this.field598) {
                if (var5 == null) {
                    this.field568.method424(var4);
                } else {
                    var4.field528 = var5;
                    class51 var7 = this.field591;
                    synchronized (this.field591) {
                        this.field591.method424(var4);
                    }
                }
                var4 = (class6) this.field598.method426();
            }
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "c", descriptor = "()LCNNODYJR;")
    public final class6 method182() {
        class51 var1 = this.field591;
        class6 var2;
        synchronized (this.field591) {
            var2 = (class6) this.field591.method426();
        }
        if (var2 == null) {
            return null;
        }
        class37 var3 = this.field593;
        synchronized (this.field593) {
            var2.method379();
        }
        if (var2.field528 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field528));
            while (true) {
                if (this.field595.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field595, var4, this.field595.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field528 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field528[var7] = this.field595[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(LCNNODYJR;I)V")
    private final void method183(class6 arg0, int arg1) {
        if (arg1 != 7) {
            return;
        }
        try {
            if (this.field565 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field560 < 4000L) {
                    return;
                }
                this.field560 = var3;
                this.field565 = this.field577.method112(client.field176 + 43594);
                this.field601 = this.field565.getInputStream();
                this.field578 = this.field565.getOutputStream();
                this.field578.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field601.read();
                }
                this.field567 = 0;
            }
            this.field561[0] = (byte) arg0.field525;
            this.field561[1] = (byte) (arg0.field526 >> 8);
            this.field561[2] = (byte) arg0.field526;
            if (arg0.field524) {
                this.field561[3] = 2;
            } else if (this.field577.field191) {
                this.field561[3] = 0;
            } else {
                this.field561[3] = 1;
            }
            this.field578.write(this.field561, 0, 4);
            this.field581 = 0;
            this.field564 = -10000;
        } catch (IOException var8) {
            try {
                this.field565.close();
            } catch (Exception var7) {
            }
            this.field565 = null;
            this.field601 = null;
            this.field578 = null;
            this.field583 = 0;
            this.field564++;
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "b", descriptor = "(II)Z")
    public final boolean method184(int arg0, int arg1) {
        if (arg0 != 9) {
            this.field602 = !this.field602;
        }
        return this.field572[arg1] == 1;
    }

    @OriginalMember(owner = "CXHZUTUD", name = "d", descriptor = "(I)V")
    public final void method185(int arg0) {
        if (arg0 != 0) {
            this.field589 = -63;
        }
        class51 var2 = this.field594;
        synchronized (this.field594) {
            this.field594.method431();
        }
    }

    @OriginalMember(owner = "CXHZUTUD", name = "a", descriptor = "(BI)I")
    public final int method186(byte arg0, int arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
            return this.field588[arg1].length;
        } else {
            return 1;
        }
    }
}
