import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class584 extends class520 {

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    private int field8572 = 0;

    @OriginalMember(owner = "client!jv", name = "P", descriptor = "Z")
    private boolean field8606 = true;

    @OriginalMember(owner = "client!jv", name = "gb", descriptor = "I")
    private int field8623 = 0;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    private int field8579 = 0;

    @OriginalMember(owner = "client!jv", name = "Y", descriptor = "I")
    private int field8615 = 0;

    @OriginalMember(owner = "client!jv", name = "fc", descriptor = "I")
    private int field8674 = 0;

    @OriginalMember(owner = "client!jv", name = "H", descriptor = "Z")
    private boolean field8598 = false;

    @OriginalMember(owner = "client!jv", name = "kc", descriptor = "Los;")
    private class468 field8679;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "Laf;")
    private class156 field8577;

    @OriginalMember(owner = "client!jv", name = "lc", descriptor = "Laf;")
    private class156 field8680;

    @OriginalMember(owner = "client!jv", name = "Cb", descriptor = "Laf;")
    private class156 field8645;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "Laf;")
    private class156 field8580;

    @OriginalMember(owner = "client!jv", name = "Nb", descriptor = "Ltc;")
    private class552 field8656;

    @OriginalMember(owner = "client!jv", name = "O", descriptor = "I")
    private int field8605;

    @OriginalMember(owner = "client!jv", name = "y", descriptor = "I")
    private int field8589;

    @OriginalMember(owner = "client!jv", name = "qc", descriptor = "[I")
    private int[] field8685;

    @OriginalMember(owner = "client!jv", name = "qb", descriptor = "[I")
    private int[] field8633;

    @OriginalMember(owner = "client!jv", name = "S", descriptor = "[I")
    private int[] field8609;

    @OriginalMember(owner = "client!jv", name = "ec", descriptor = "[S")
    private short[] field8673;

    @OriginalMember(owner = "client!jv", name = "gc", descriptor = "[I")
    private int[] field8675;

    @OriginalMember(owner = "client!jv", name = "rc", descriptor = "[Lkv;")
    private class200[] field8686;

    @OriginalMember(owner = "client!jv", name = "M", descriptor = "[Lmm;")
    private class26[] field8603;

    @OriginalMember(owner = "client!jv", name = "ac", descriptor = "I")
    private int field8669;

    @OriginalMember(owner = "client!jv", name = "ib", descriptor = "[Liba;")
    private class456[] field8625;

    @OriginalMember(owner = "client!jv", name = "Gb", descriptor = "[Lkda;")
    private class238[] field8649;

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "[B")
    private byte[] field8590;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "[F")
    private float[] field8584;

    @OriginalMember(owner = "client!jv", name = "jc", descriptor = "[S")
    private short[] field8678;

    @OriginalMember(owner = "client!jv", name = "N", descriptor = "[S")
    private short[] field8604;

    @OriginalMember(owner = "client!jv", name = "nb", descriptor = "[F")
    private float[] field8630;

    @OriginalMember(owner = "client!jv", name = "Q", descriptor = "[B")
    private byte[] field8607;

    @OriginalMember(owner = "client!jv", name = "A", descriptor = "[S")
    private short[] field8591;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "[S")
    private short[] field8586;

    @OriginalMember(owner = "client!jv", name = "hb", descriptor = "[S")
    private short[] field8624;

    @OriginalMember(owner = "client!jv", name = "Qb", descriptor = "S")
    private short field8659;

    @OriginalMember(owner = "client!jv", name = "Kb", descriptor = "[S")
    private short[] field8653;

    @OriginalMember(owner = "client!jv", name = "C", descriptor = "[S")
    private short[] field8593;

    @OriginalMember(owner = "client!jv", name = "F", descriptor = "[S")
    private short[] field8596;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "[S")
    private short[] field8578;

    @OriginalMember(owner = "client!jv", name = "X", descriptor = "S")
    private short field8614;

    @OriginalMember(owner = "client!jv", name = "W", descriptor = "[S")
    private short[] field8613;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "[I")
    private int[] field8581;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "[[I")
    private int[][] field8583;

    @OriginalMember(owner = "client!jv", name = "Jb", descriptor = "[[I")
    private int[][] field8652;

    @OriginalMember(owner = "client!jv", name = "Lb", descriptor = "[[I")
    private int[][] field8654;

    @OriginalMember(owner = "client!jv", name = "ab", descriptor = "Lnj;")
    public static class487 field8617 = new class487("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!jv", name = "wb", descriptor = "Lnj;")
    public static class487 field8639 = new class487("Loading shaders", "Lade shaders", "Chargement des nuanceurs", "Carregando sombreamento - ");

    @OriginalMember(owner = "client!jv", name = "dc", descriptor = "Lnj;")
    public static class487 field8672 = new class487("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!jv", name = "pc", descriptor = "J")
    public static long field8684 = 0L;

    @OriginalMember(owner = "client!jv", name = "U", descriptor = "B")
    private byte field8611;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!jv", name = "B", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!jv", name = "D", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!jv", name = "E", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!jv", name = "G", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!jv", name = "I", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!jv", name = "J", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!jv", name = "K", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!jv", name = "L", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!jv", name = "Z", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!jv", name = "bb", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!jv", name = "cb", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!jv", name = "db", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!jv", name = "eb", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!jv", name = "fb", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!jv", name = "jb", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!jv", name = "kb", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!jv", name = "mb", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!jv", name = "ob", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!jv", name = "pb", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!jv", name = "rb", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!jv", name = "sb", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!jv", name = "tb", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!jv", name = "ub", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!jv", name = "xb", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!jv", name = "yb", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!jv", name = "Ab", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!jv", name = "Bb", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!jv", name = "Eb", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!jv", name = "Fb", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!jv", name = "Hb", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!jv", name = "Ib", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!jv", name = "Mb", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!jv", name = "Ob", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!jv", name = "Pb", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!jv", name = "Rb", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!jv", name = "Sb", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!jv", name = "Ub", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!jv", name = "Vb", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!jv", name = "Wb", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!jv", name = "Xb", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!jv", name = "Yb", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!jv", name = "Zb", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!jv", name = "bc", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!jv", name = "cc", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!jv", name = "hc", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!jv", name = "ic", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!jv", name = "mc", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!jv", name = "nc", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!jv", name = "oc", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "Leea;")
    private class407 field8585;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "Luba;")
    private class628 field8574;

    @OriginalMember(owner = "client!jv", name = "V", descriptor = "Llq;")
    private class9 field8612;

    @OriginalMember(owner = "client!jv", name = "R", descriptor = "S")
    private short field8608;

    @OriginalMember(owner = "client!jv", name = "T", descriptor = "S")
    private short field8610;

    @OriginalMember(owner = "client!jv", name = "lb", descriptor = "S")
    private short field8628;

    @OriginalMember(owner = "client!jv", name = "vb", descriptor = "S")
    private short field8638;

    @OriginalMember(owner = "client!jv", name = "zb", descriptor = "S")
    private short field8642;

    @OriginalMember(owner = "client!jv", name = "Db", descriptor = "S")
    private short field8646;

    @OriginalMember(owner = "client!jv", name = "Tb", descriptor = "S")
    private short field8662;

    @OriginalMember(owner = "client!jv", name = "U", descriptor = "()I")
    public final int method1971() {
        if (!this.field8598) {
            this.method3404((byte) 64);
        }
        field8660++;
        return this.field8608;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZB)V")
    private final void method3403(boolean arg0, byte arg1) {
        if (this.field8623 * 6 > this.field8679.field7005.field6162.length) {
            this.field8679.field7005 = new class444(this.field8623 * 6 + 600);
        } else {
            this.field8679.field7005.field6221 = 0;
        }
        field8634++;
        class444 var3 = this.field8679.field7005;
        if (this.field8679.field7004) {
            for (int var5 = 0; var5 < this.field8623; var5++) {
                var3.method2608(this.field8678[var5], (byte) 52);
                var3.method2608(this.field8604[var5], (byte) 116);
                var3.method2608(this.field8586[var5], (byte) 66);
            }
        } else {
            for (int var4 = 0; var4 < this.field8623; var4++) {
                var3.method2590(this.field8678[var4], (byte) -33);
                var3.method2590(this.field8604[var4], (byte) -39);
                var3.method2590(this.field8586[var4], (byte) -43);
            }
        }
        if (var3.field6221 == 0 || arg1 != 0) {
            return;
        }
        if (arg0) {
            if (this.field8585 == null) {
                this.field8585 = this.field8679.method2825((byte) 124, var3.field6221, var3.field6162, true, 5123);
            } else {
                this.field8585.method55(var3.field6221, var3.field6162, 25321, 5123);
            }
            this.field8656.field8213 = this.field8585;
        } else {
            this.field8656.field8213 = this.field8679.method2825((byte) 119, var3.field6221, var3.field6162, false, 5123);
        }
        if (!arg0) {
            this.field8606 = true;
        }
    }

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "(IIII)V")
    public final void method1976(int arg0, int arg1, int arg2, int arg3) {
        field8655++;
        if (arg0 == 0) {
            class261.field3840 = 0;
            int var5 = 0;
            class631.field9230 = 0;
            class555.field8239 = 0;
            for (int var6 = 0; var6 < this.field8579; var6++) {
                class631.field9230 += this.field8675[var6];
                class555.field8239 += this.field8609[var6];
                var5++;
                class261.field3840 += this.field8633[var6];
            }
            if (var5 <= 0) {
                class631.field9230 = arg1;
                class261.field3840 = arg3;
                class555.field8239 = arg2;
            } else {
                class261.field3840 = class261.field3840 / var5 + arg3;
                class631.field9230 = class631.field9230 / var5 + arg1;
                class555.field8239 = class555.field8239 / var5 + arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field8579; var7++) {
                this.field8675[var7] += arg1;
                this.field8609[var7] += arg2;
                this.field8633[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field8579; var8++) {
                this.field8675[var8] -= class631.field9230;
                this.field8609[var8] -= class555.field8239;
                this.field8633[var8] -= class261.field3840;
                if (arg3 != 0) {
                    int var9 = class14.field129[arg3];
                    int var10 = class14.field130[arg3];
                    int var11 = this.field8675[var8] * var10 + this.field8609[var8] * var9 + 32767 >> 15;
                    this.field8609[var8] = this.field8609[var8] * var10 + 32767 - (this.field8675[var8] * var9) >> 15;
                    this.field8675[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class14.field129[arg1];
                    int var13 = class14.field130[arg1];
                    int var14 = this.field8609[var8] * var13 + 32767 - (this.field8633[var8] * var12) >> 15;
                    this.field8633[var8] = this.field8633[var8] * var13 + this.field8609[var8] * var12 + 32767 >> 15;
                    this.field8609[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class14.field129[arg2];
                    int var16 = class14.field130[arg2];
                    int var17 = this.field8633[var8] * var15 + this.field8675[var8] * var16 + 32767 >> 15;
                    this.field8633[var8] = this.field8633[var8] * var16 + 32767 - (this.field8675[var8] * var15) >> 15;
                    this.field8675[var8] = var17;
                }
                this.field8675[var8] += class631.field9230;
                this.field8609[var8] += class555.field8239;
                this.field8633[var8] += class261.field3840;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field8579; var18++) {
                this.field8675[var18] -= class631.field9230;
                this.field8609[var18] -= class555.field8239;
                this.field8633[var18] -= class261.field3840;
                this.field8675[var18] = this.field8675[var18] * arg1 / 128;
                this.field8609[var18] = this.field8609[var18] * arg2 / 128;
                this.field8633[var18] = this.field8633[var18] * arg3 / 128;
                this.field8675[var18] += class631.field9230;
                this.field8609[var18] += class555.field8239;
                this.field8633[var18] += class261.field3840;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field8615; var19++) {
                int var23 = (this.field8607[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field8607[var19] = (byte) var23;
            }
            if (this.field8580 != null) {
                this.field8580.field1995 = null;
            }
            if (this.field8625 != null) {
                for (int var20 = 0; var20 < this.field8669; var20++) {
                    class456 var21 = this.field8625[var20];
                    class238 var22 = this.field8649[var20];
                    var22.field3480 = 255 - (this.field8607[var21.field6639] & 0xFF) << 24 | var22.field3480 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field8615; var24++) {
                int var28 = this.field8591[var24] & 0xFFFF;
                int var29 = (var28 & 0xFFB1) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = var29 + arg1 & 0x3F;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                int var34 = arg3 + var31;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field8591[var24] = (short) class313.method1926(class313.method1926(var33 << 10, var32 << 7), var34);
            }
            if (this.field8580 != null) {
                this.field8580.field1995 = null;
            }
            if (this.field8625 != null) {
                for (int var25 = 0; var25 < this.field8669; var25++) {
                    class456 var26 = this.field8625[var25];
                    class238 var27 = this.field8649[var25];
                    var27.field3480 = class620.field9045[this.field8591[var26.field6639] & 0xFFFF] & 0xFFFFFF | var27.field3480 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field8669; var35++) {
                class238 var36 = this.field8649[var35];
                var36.field3483 += arg2;
                var36.field3474 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field8669; var37++) {
                class238 var38 = this.field8649[var37];
                var38.field3484 = var38.field3484 * arg2 >> 7;
                var38.field3478 = var38.field3478 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field8669; var39++) {
                class238 var40 = this.field8649[var39];
                var40.field3479 = var40.field3479 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "TA", descriptor = "()I")
    public final int method1954() {
        field8600++;
        if (!this.field8598) {
            this.method3404((byte) 64);
        }
        return this.field8646;
    }

    @OriginalMember(owner = "client!jv", name = "L", descriptor = "(SS)V")
    public final void method1947(short arg0, short arg1) {
        field8670++;
        class472 var3 = this.field8679.field2262;
        for (int var4 = 0; var4 < this.field8615; var4++) {
            if (this.field8596[var4] == arg0) {
                this.field8596[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class83 var7 = var3.method1762(arg0 & 0xFFFF, (byte) 45);
            var5 = var7.field962;
            var6 = var7.field960;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class83 var10 = var3.method1762(arg1 & 0xFFFF, (byte) 45);
            var9 = var10.field960;
            var8 = var10.field962;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field8625 != null) {
            for (int var11 = 0; var11 < this.field8669; var11++) {
                class456 var12 = this.field8625[var11];
                class238 var13 = this.field8649[var11];
                var13.field3480 = var13.field3480 & 0xFF000000 | class620.field9045[this.field8591[var12.field6639] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field8580 != null) {
            this.field8580.field1995 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "(I)V")
    public final void method1973(int arg0) {
        this.field8589 = arg0;
        field8594++;
        this.field8606 = true;
        if (this.field8574 != null && (this.field8589 & 0x10000) == 0) {
            this.field8590 = this.field8574.field9200;
            this.field8593 = this.field8574.field9197;
            this.field8653 = this.field8574.field9199;
            this.field8624 = this.field8574.field9194;
            this.field8574 = null;
        }
        this.method3411(0);
    }

    @OriginalMember(owner = "client!jv", name = "EA", descriptor = "(Lk;)Lk;")
    public final class88 method1960(class88 arg0) {
        field8587++;
        if (this.field8572 == 0) {
            return null;
        }
        if (!this.field8598) {
            this.method3404((byte) 64);
        }
        int var2;
        int var3;
        if (this.field8679.field7033 > 0) {
            var2 = this.field8610 - (this.field8679.field7033 * this.field8638 >> 8) >> this.field8679.field6959;
            var3 = this.field8628 - (this.field8679.field7033 * this.field8646 >> 8) >> this.field8679.field6959;
        } else {
            var2 = this.field8610 - (this.field8679.field7033 * this.field8646 >> 8) >> this.field8679.field6959;
            var3 = this.field8628 - (this.field8679.field7033 * this.field8638 >> 8) >> this.field8679.field6959;
        }
        int var4;
        int var5;
        if (this.field8679.field7090 > 0) {
            var4 = this.field8642 - (this.field8679.field7090 * this.field8638 >> 8) >> this.field8679.field6959;
            var5 = this.field8608 - (this.field8679.field7090 * this.field8646 >> 8) >> this.field8679.field6959;
        } else {
            var4 = this.field8642 - (this.field8679.field7090 * this.field8646 >> 8) >> this.field8679.field6959;
            var5 = this.field8608 - (this.field8679.field7090 * this.field8638 >> 8) >> this.field8679.field6959;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class469 var8 = (class469) arg0;
        class469 var9;
        if (var8 != null && var8.method2856(var7, (byte) -71, var6)) {
            var9 = var8;
            var8.method2854(94);
        } else {
            var9 = new class469(this.field8679, var6, var7);
        }
        var9.method2857(var4, (byte) 0, var5, var2, var3);
        this.method3407(var9, -90);
        return var9;
    }

    @OriginalMember(owner = "client!jv", name = "va", descriptor = "()I")
    public final int method1968() {
        field8602++;
        if (!this.field8598) {
            this.method3404((byte) 64);
        }
        return this.field8628;
    }

    @OriginalMember(owner = "client!jv", name = "ea", descriptor = "(I[IIIIIZ)V")
    public final void method1951(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8643++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            class631.field9230 = 0;
            class261.field3840 = 0;
            int var12 = 0;
            class555.field8239 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field8583.length) {
                    int[] var15 = this.field8583[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class631.field9230 += this.field8675[var17];
                        class555.field8239 += this.field8609[var17];
                        class261.field3840 += this.field8633[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class555.field8239 = class555.field8239 / var12 + var11;
                class261.field3840 = class261.field3840 / var12 + var9;
                class631.field9230 = class631.field9230 / var12 + var10;
            } else {
                class631.field9230 = var10;
                class555.field8239 = var11;
                class261.field3840 = var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field8583.length) {
                    int[] var23 = this.field8583[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field8675[var25] += var20;
                        this.field8609[var25] += var18;
                        this.field8633[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field8583.length) {
                    int[] var46 = this.field8583[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field8675[var59] -= class631.field9230;
                            this.field8609[var59] -= class555.field8239;
                            this.field8633[var59] -= class261.field3840;
                            if (arg4 != 0) {
                                int var60 = class14.field129[arg4];
                                int var61 = class14.field130[arg4];
                                int var62 = this.field8609[var59] * var60 + this.field8675[var59] * var61 + 32767 >> 15;
                                this.field8609[var59] = this.field8609[var59] * var61 + 32767 - (this.field8675[var59] * var60) >> 15;
                                this.field8675[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class14.field129[arg2];
                                int var64 = class14.field130[arg2];
                                int var65 = this.field8609[var59] * var64 + 32767 - (this.field8633[var59] * var63) >> 15;
                                this.field8633[var59] = this.field8633[var59] * var64 + this.field8609[var59] * var63 + 32767 >> 15;
                                this.field8609[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class14.field129[arg3];
                                int var67 = class14.field130[arg3];
                                int var68 = this.field8633[var59] * var66 + (this.field8675[var59] * var67) + 32767 >> 15;
                                this.field8633[var59] = this.field8633[var59] * var67 + 32767 - (this.field8675[var59] * var66) >> 15;
                                this.field8675[var59] = var68;
                            }
                            this.field8675[var59] += class631.field9230;
                            this.field8609[var59] += class555.field8239;
                            this.field8633[var59] += class261.field3840;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field8675[var48] -= class631.field9230;
                            this.field8609[var48] -= class555.field8239;
                            this.field8633[var48] -= class261.field3840;
                            if (arg2 != 0) {
                                int var49 = class14.field129[arg2];
                                int var50 = class14.field130[arg2];
                                int var51 = this.field8609[var48] * var50 + 32767 - (this.field8633[var48] * var49) >> 15;
                                this.field8633[var48] = this.field8609[var48] * var49 + (this.field8633[var48] * var50 + 32767) >> 15;
                                this.field8609[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class14.field129[arg4];
                                int var53 = class14.field130[arg4];
                                int var54 = this.field8675[var48] * var53 + this.field8609[var48] * var52 + 32767 >> 15;
                                this.field8609[var48] = this.field8609[var48] * var53 + 32767 - (this.field8675[var48] * var52) >> 15;
                                this.field8675[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class14.field129[arg3];
                                int var56 = class14.field130[arg3];
                                int var57 = this.field8675[var48] * var56 + this.field8633[var48] * var55 + 32767 >> 15;
                                this.field8633[var48] = this.field8633[var48] * var56 + 32767 - (this.field8675[var48] * var55) >> 15;
                                this.field8675[var48] = var57;
                            }
                            this.field8675[var48] += class631.field9230;
                            this.field8609[var48] += class555.field8239;
                            this.field8633[var48] += class261.field3840;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field8583.length) {
                        int[] var29 = this.field8583[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field8685[var31];
                            int var33 = this.field8685[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field8613[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class14.field129[arg4];
                                    int var37 = class14.field130[arg4];
                                    int var38 = this.field8653[var35] * var36 + this.field8593[var35] * var37 + 32767 >> 15;
                                    this.field8653[var35] = (short) (this.field8653[var35] * var37 + 32767 - (this.field8593[var35] * var36) >> 15);
                                    this.field8593[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class14.field129[arg2];
                                    int var40 = class14.field130[arg2];
                                    int var41 = this.field8653[var35] * var40 + 32767 - (this.field8624[var35] * var39) >> 15;
                                    this.field8624[var35] = (short) (this.field8653[var35] * var39 + this.field8624[var35] * var40 + 32767 >> 15);
                                    this.field8653[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class14.field129[arg3];
                                    int var43 = class14.field130[arg3];
                                    int var44 = this.field8624[var35] * var42 + (this.field8593[var35] * var43) + 32767 >> 15;
                                    this.field8624[var35] = (short) (this.field8624[var35] * var43 + 32767 - (this.field8593[var35] * var42) >> 15);
                                    this.field8593[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field8645 == null && this.field8580 != null) {
                    this.field8580.field1995 = null;
                }
                if (this.field8645 != null) {
                    this.field8645.field1995 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field8583.length > var70) {
                    int[] var71 = this.field8583[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field8675[var73] -= class631.field9230;
                        this.field8609[var73] -= class555.field8239;
                        this.field8633[var73] -= class261.field3840;
                        this.field8675[var73] = this.field8675[var73] * arg2 >> 7;
                        this.field8609[var73] = this.field8609[var73] * arg3 >> 7;
                        this.field8633[var73] = this.field8633[var73] * arg4 >> 7;
                        this.field8675[var73] += class631.field9230;
                        this.field8609[var73] += class555.field8239;
                        this.field8633[var73] += class261.field3840;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8654 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field8654.length) {
                        int[] var79 = this.field8654[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field8607[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field8607[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field8580 != null) {
                            this.field8580.field1995 = null;
                        }
                    }
                }
                if (this.field8625 != null) {
                    for (int var75 = 0; var75 < this.field8669; var75++) {
                        class456 var76 = this.field8625[var75];
                        class238 var77 = this.field8649[var75];
                        var77.field3480 = 255 - (this.field8607[var76.field6639] & 0xFF) << 24 | var77.field3480 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field8654 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field8654.length > var87) {
                        int[] var88 = this.field8654[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field8591[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFE0F) >> 10;
                            int var93 = (var91 & 0x3A2) >> 7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = arg3 / 4 + var93;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            int var97 = arg4 + var94;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field8591[var90] = (short) class313.method1926(class313.method1926(var96 << 7, var95 << 10), var97);
                        }
                        if (var88.length > 0 && this.field8580 != null) {
                            this.field8580.field1995 = null;
                        }
                    }
                }
                if (this.field8625 != null) {
                    for (int var84 = 0; var84 < this.field8669; var84++) {
                        class456 var85 = this.field8625[var84];
                        class238 var86 = this.field8649[var84];
                        var86.field3480 = var86.field3480 & 0xFF000000 | class620.field9045[this.field8591[var85.field6639] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field8652 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field8652.length) {
                        int[] var100 = this.field8652[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class238 var102 = this.field8649[var100[var101]];
                            var102.field3483 += arg3;
                            var102.field3474 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8652 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field8652.length > var104) {
                        int[] var105 = this.field8652[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class238 var107 = this.field8649[var105[var106]];
                            var107.field3478 = var107.field3478 * arg2 >> 7;
                            var107.field3484 = var107.field3484 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8652 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field8652.length) {
                    int[] var110 = this.field8652[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class238 var112 = this.field8649[var110[var111]];
                        var112.field3479 = var112.field3479 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
    private final void method3404(byte arg0) {
        field8599++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field8579; var10++) {
            int var11 = this.field8675[var10];
            int var12 = this.field8609[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field8633[var10];
            if (var11 < var2) {
                var2 = var11;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var11 * var11 - (-(var13 * var13) - var12 * var12);
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field8628 = (short) var5;
        this.field8610 = (short) var2;
        this.field8638 = (short) var6;
        this.field8608 = (short) var7;
        this.field8642 = (short) var4;
        if (arg0 != 64) {
            this.method1965(null, null, -74);
        }
        this.field8646 = (short) var3;
        this.field8662 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field8598 = true;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BIZ)Lr;")
    public final class520 method369(byte arg0, int arg1, boolean arg2) {
        field8636++;
        class584 var4;
        class584 var5;
        if (arg0 == 1) {
            var4 = this.field8679.field7094;
            var5 = this.field8679.field7093;
        } else if (arg0 == 2) {
            var4 = this.field8679.field7021;
            var5 = this.field8679.field7042;
        } else if (arg0 == 3) {
            var4 = this.field8679.field7059;
            var5 = this.field8679.field7048;
        } else if (arg0 == 4) {
            var5 = this.field8679.field7049;
            var4 = this.field8679.field6999;
        } else if (arg0 == 5) {
            var5 = this.field8679.field6984;
            var4 = this.field8679.field7008;
        } else {
            var5 = var4 = new class584(this.field8679);
        }
        return this.method3409(5, arg0 != 0, arg2, var5, arg1, var4);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lm;Lgr;I)V")
    public final void method1965(class105 arg0, class525 arg1, int arg2) {
        field8632++;
        if (this.field8572 == 0) {
            return;
        }
        class252 var4 = this.field8679.field7073;
        class252 var5 = (class252) arg0;
        if (!this.field8598) {
            this.method3404((byte) 64);
        }
        this.method3410(var5, (byte) -72);
        class277.field4062 = var4.field3672 * var5.field3685 + var4.field3685 * var5.field3681 + var4.field3671 * var5.field3658;
        class538.field7952 = var4.field3672 * var5.field3678 + var4.field3685 * var5.field3684 + var4.field3671 * var5.field3664 + var4.field3678;
        float var6 = (float) this.field8646 * class277.field4062 + class538.field7952;
        float var7 = (float) this.field8638 * class277.field4062 + class538.field7952;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = var7 - (float) this.field8662;
            var8 = (float) this.field8662 + var6;
        } else {
            var8 = (float) this.field8662 + var7;
            var9 = (float) (-this.field8662) + var6;
        }
        if ((var9 >= this.field8679.field7006) || ((float) this.field8679.field7099 >= var8)) {
            return;
        }
        class73.field859 = var4.field3676 * var5.field3685 + var4.field3669 * var5.field3658 + var4.field3658 * var5.field3681;
        class642.field9319 = var4.field3676 * var5.field3678 + var4.field3669 * var5.field3664 + var4.field3658 * var5.field3684 + var4.field3664;
        float var10 = (float) this.field8646 * class73.field859 + class642.field9319;
        float var11 = (float) this.field8638 * class73.field859 + class642.field9319;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var12 = ((float) (-this.field8662) + var11) * (float) this.field8679.field7066;
            var13 = ((float) this.field8662 + var10) * (float) this.field8679.field7066;
        } else {
            var12 = (var10 - (float) this.field8662) * (float) this.field8679.field7066;
            var13 = ((float) this.field8662 + var11) * (float) this.field8679.field7066;
        }
        if ((this.field8679.field6985 <= var12 / var8) || (var13 / var8 <= this.field8679.field7002)) {
            return;
        }
        class424.field6065 = var4.field3662 * var5.field3685 + var4.field3681 * var5.field3681 + var4.field3656 * var5.field3658;
        class25.field229 = var4.field3662 * var5.field3678 + var4.field3681 * var5.field3684 + var4.field3656 * var5.field3664 + var4.field3684;
        float var14 = (float) this.field8646 * class424.field6065 + class25.field229;
        float var15 = (float) this.field8638 * class424.field6065 + class25.field229;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var17 = ((float) this.field8662 + var14) * (float) this.field8679.field6989;
            var16 = ((float) (-this.field8662) + var15) * (float) this.field8679.field6989;
        } else {
            var16 = ((float) (-this.field8662) + var14) * (float) this.field8679.field6989;
            var17 = ((float) this.field8662 + var15) * (float) this.field8679.field6989;
        }
        if ((var16 / var8 >= this.field8679.field7060) || (this.field8679.field6997 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field8625 != null) {
            class301.field4408 = var4.field3662 * var5.field3671 + var4.field3681 * var5.field3656 + var4.field3656 * var5.field3669;
            class15.field136 = var4.field3676 * var5.field3672 + var4.field3669 * var5.field3676 + var4.field3658 * var5.field3662;
            class314.field4719 = var4.field3662 * var5.field3672 + var4.field3681 * var5.field3662 + var4.field3656 * var5.field3676;
            class430.field6305 = var4.field3672 * var5.field3672 + var4.field3685 * var5.field3662 + var4.field3671 * var5.field3676;
            class87.field1117 = var4.field3676 * var5.field3671 + var4.field3669 * var5.field3669 + var4.field3658 * var5.field3656;
            class210.field3103 = var4.field3672 * var5.field3671 + var4.field3685 * var5.field3656 + var4.field3671 * var5.field3669;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field8628 + this.field8610 >> 1;
            int var21 = this.field8642 + this.field8608 >> 1;
            int var22 = (int) ((float) var21 * class15.field136 + (float) this.field8646 * class73.field859 + (float) var20 * class87.field1117 + class642.field9319);
            int var23 = (int) ((float) var21 * class314.field4719 + (float) this.field8646 * class424.field6065 + (float) var20 * class301.field4408 + class25.field229);
            int var24 = (int) ((float) var21 * class430.field6305 + (float) this.field8646 * class277.field4062 + (float) var20 * class210.field3103 + class538.field7952);
            if (var24 < this.field8679.field7099) {
                var18 = true;
            } else {
                arg1.field7767 = this.field8679.field7066 * var22 / var24 + this.field8679.field7013;
                arg1.field7769 = this.field8679.field6989 * var23 / var24 + this.field8679.field7026;
            }
            int var25 = (int) ((float) var21 * class15.field136 + (float) this.field8638 * class73.field859 + (float) var20 * class87.field1117 + class642.field9319);
            int var26 = (int) ((float) var21 * class314.field4719 + (float) this.field8638 * class424.field6065 + (float) var20 * class301.field4408 + class25.field229);
            int var27 = (int) ((float) var21 * class430.field6305 + (float) this.field8638 * class277.field4062 + (float) var20 * class210.field3103 + class538.field7952);
            if (var27 >= this.field8679.field7099) {
                arg1.field7770 = this.field8679.field6989 * var26 / var27 + this.field8679.field7026;
                arg1.field7768 = this.field8679.field7066 * var25 / var27 + this.field8679.field7013;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field8679.field7099 > var24 && var27 < this.field8679.field7099) {
                    var19 = false;
                } else if (var24 < this.field8679.field7099) {
                    int var31 = (var27 - this.field8679.field7099 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field7767 = this.field8679.field7066 * var32 / this.field8679.field7099 + this.field8679.field7013;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field7769 = this.field8679.field6989 * var33 / this.field8679.field7099 + this.field8679.field7026;
                } else if (this.field8679.field7099 > var27) {
                    int var28 = (var24 - this.field8679.field7099 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field7767 = this.field8679.field7066 * var29 / this.field8679.field7099 + this.field8679.field7013;
                    arg1.field7769 = this.field8679.field6989 * var30 / this.field8679.field7099 + this.field8679.field7026;
                }
            }
            if (var19) {
                arg1.field7771 = true;
                if (var24 > var27) {
                    arg1.field7766 = (this.field8662 + var22) * this.field8679.field7066 / var24 + (this.field8679.field7013 - arg1.field7767);
                } else {
                    arg1.field7766 = (var25 + this.field8662) * this.field8679.field7066 / var27 + this.field8679.field7013 - arg1.field7768;
                }
            }
        }
        this.field8679.method2804((byte) 114);
        this.field8679.method2829(var5, 0);
        this.method3405(3);
        this.field8679.method2826(true);
        this.method3414(true);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
    private final void method3405(int arg0) {
        field8582++;
        if (this.field8623 == 0) {
            return;
        }
        if (this.field8611 != 0) {
            this.method3412((byte) 33, true);
        }
        if (arg0 != 3) {
            this.field8652 = null;
        }
        this.method3412((byte) 33, false);
        if (this.field8656 != null) {
            if (this.field8656.field8213 == null) {
                this.method3403((this.field8611 & 0x10) != 0, (byte) 0);
            }
            if (this.field8656.field8213 != null) {
                this.field8679.method2828(5126, this.field8645 != null);
                this.field8679.method2846(this.field8577, this.field8580, this.field8680, 32888, this.field8645);
                int var2 = this.field8581.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field8581[var3];
                    int var5 = this.field8581[var3 + 1];
                    int var6 = this.field8596[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field8679.method2807(-110, var6, this.field8645 != null);
                    this.field8679.method2847(-101, this.field8656.field8213, 4, (var5 - var4) * 3, var4 * 3);
                }
            }
        }
        this.method3411(0);
    }

    @OriginalMember(owner = "client!jv", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public final void method1945(int arg0, int arg1, class543 arg2, class543 arg3, int arg4, int arg5, int arg6) {
        field8597++;
        if (!this.field8598) {
            this.method3404((byte) 64);
        }
        int var8 = this.field8610 + arg4;
        int var9 = arg4 + this.field8628;
        int var10 = this.field8642 + arg6;
        int var11 = this.field8608 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field8121 <= (var9 + arg2.field8116 >> arg2.field8119) || var10 < 0 || arg2.field8116 + var11 >> arg2.field8119 >= arg2.field8118) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field8116 + var9 >> arg3.field8119 >= arg3.field8121 || var10 < 0 || (arg3.field8116 + var11 >> arg3.field8119) >= arg3.field8118) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field8119;
            int var13 = arg2.field8116 - (1 - var9) >> arg2.field8119;
            int var14 = var10 >> arg2.field8119;
            int var15 = arg2.field8116 + var11 - 1 >> arg2.field8119;
            if (arg5 == arg2.method1319(var12, var14) && arg5 == arg2.method1319(var13, var14) && arg2.method1319(var12, var15) == arg5 && arg5 == arg2.method1319(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field8579; var16++) {
                this.field8609[var16] = this.field8609[var16] + arg2.method1323(this.field8675[var16] - -arg4, this.field8633[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field8646;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field8579; var31++) {
                int var32 = (this.field8609[var31] << 16) / var30;
                if (arg1 > var32) {
                    this.field8609[var31] += (arg2.method1323(this.field8675[var31] + arg4, this.field8633[var31] + arg6) - arg5) * (arg1 - var32) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var17 = (arg1 & 0xFF) * 4;
            int var18 = (arg1 >> 8 & 0xFF) * 4;
            int var19 = (arg1 & 0xFF3DC6) >> 16 << 6;
            int var20 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var17 >> 1) < 0 || (arg2.field8121 << arg2.field8119) <= ((var17 >> 1) + arg2.field8116 + arg4) || (arg6 - (var18 >> 1)) < 0 || ((var18 >> 1) + arg6 + arg2.field8116) >= (arg2.field8118 << arg2.field8119)) {
                return;
            }
            this.method3083(var19, 97, arg2, var20, arg6, arg5, arg4, var17, var18);
        } else if (arg0 == 4) {
            int var21 = this.field8638 - this.field8646;
            for (int var22 = 0; var22 < this.field8579; var22++) {
                this.field8609[var22] = var21 + (this.field8609[var22] - (arg5 - arg3.method1323(this.field8675[var22] + arg4, this.field8633[var22] + arg6)));
            }
        } else if (arg0 == 5) {
            int var23 = this.field8638 - this.field8646;
            for (int var24 = 0; var24 < this.field8579; var24++) {
                int var25 = this.field8675[var24] + arg4;
                int var26 = this.field8633[var24] + arg6;
                int var27 = arg2.method1323(var25, var26);
                int var28 = arg3.method1323(var25, var26);
                int var29 = var27 - arg1 - var28;
                this.field8609[var24] = ((this.field8609[var24] << 8) / var23 * var29 >> 8) + var27 - arg5;
            }
        }
        this.field8598 = false;
        if (this.field8577 != null) {
            this.field8577.field1995 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BIIIIIIII)Z")
    private final boolean method3406(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8657++;
        if (arg3 < arg2 && arg3 < arg6 && arg3 < arg1) {
            return false;
        } else if (arg2 < arg3 && arg3 > arg6 && arg3 > arg1) {
            return false;
        } else if (arg5 < arg4 && arg8 > arg5 && arg7 > arg5) {
            return false;
        } else if (arg5 > arg4 && arg5 > arg8 && arg5 > arg7) {
            return false;
        } else {
            if (arg0 != -23) {
                this.method1949(9, -5, -83, 124);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jv", name = "sa", descriptor = "()Z")
    public final boolean method1948() {
        field8626++;
        if (this.field8583 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field8674; var1++) {
            this.field8675[var1] <<= 0x4;
            this.field8609[var1] <<= 0x4;
            this.field8633[var1] <<= 0x4;
        }
        class261.field3840 = 0;
        class631.field9230 = 0;
        class555.field8239 = 0;
        return true;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Liaa;I)V")
    private final void method3407(class469 arg0, int arg1) {
        int var3 = -47 % ((-arg1 - 17) / 51);
        field8664++;
        if (this.field8572 > this.field8679.field7105.length) {
            this.field8679.field7104 = new int[this.field8572];
            this.field8679.field7105 = new int[this.field8572];
        }
        int[] var4 = this.field8679.field7105;
        int[] var5 = this.field8679.field7104;
        for (int var6 = 0; var6 < this.field8579; var6++) {
            int var17 = (this.field8675[var6] - (this.field8609[var6] * this.field8679.field7033 >> 8) >> this.field8679.field6959) - arg0.field7117;
            int var18 = (this.field8633[var6] - (this.field8609[var6] * this.field8679.field7090 >> 8) >> this.field8679.field6959) - arg0.field7118;
            int var19 = this.field8685[var6];
            int var20 = this.field8685[var6 + 1];
            for (int var21 = var19; var21 < var20; var21++) {
                int var22 = this.field8613[var21] - 1;
                if (var22 == -1) {
                    break;
                }
                var4[var22] = var17;
                var5[var22] = var18;
            }
        }
        for (int var7 = 0; var7 < this.field8623; var7++) {
            if (this.field8607 == null || this.field8607[var7] <= 128) {
                short var8 = this.field8678[var7];
                short var9 = this.field8604[var7];
                short var10 = this.field8586[var7];
                int var11 = var4[var8];
                int var12 = var4[var9];
                int var13 = var4[var10];
                int var14 = var5[var8];
                int var15 = var5[var9];
                int var16 = var5[var10];
                if ((var11 - var12) * (var15 - var16) - (var13 - var12) * (var15 - var14) > 0) {
                    arg0.method2859(var13, var12, var16, var15, false, var11, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB)V")
    public static final void method3408(int arg0, byte arg1) {
        field8592++;
        class621 var2 = class442.method2691(arg0, 14, true);
        int var3 = -40 % ((-arg1 - 34) / 59);
        var2.method3598(255);
    }

    @OriginalMember(owner = "client!jv", name = "pa", descriptor = "(SS)V")
    public final void method1957(short arg0, short arg1) {
        field8627++;
        for (int var3 = 0; var3 < this.field8615; var3++) {
            if (this.field8591[var3] == arg0) {
                this.field8591[var3] = arg1;
            }
        }
        if (this.field8625 != null) {
            for (int var4 = 0; var4 < this.field8669; var4++) {
                class456 var5 = this.field8625[var4];
                class238 var6 = this.field8649[var4];
                var6.field3480 = class620.field9045[this.field8591[var5.field6639] & 0xFFFF] & 0xFFFFFF | var6.field3480 & 0xFF000000;
            }
        }
        if (this.field8580 != null) {
            this.field8580.field1995 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "X", descriptor = "()V")
    public final void method1959() {
        field8671++;
        for (int var1 = 0; var1 < this.field8579; var1++) {
            this.field8633[var1] = -this.field8633[var1];
        }
        for (int var2 = 0; var2 < this.field8572; var2++) {
            this.field8624[var2] = (short) (-this.field8624[var2]);
        }
        for (int var3 = 0; var3 < this.field8615; var3++) {
            short var4 = this.field8678[var3];
            this.field8678[var3] = this.field8586[var3];
            this.field8586[var3] = var4;
        }
        if (this.field8645 == null && this.field8580 != null) {
            this.field8580.field1995 = null;
        }
        if (this.field8645 != null) {
            this.field8645.field1995 = null;
        }
        this.field8598 = false;
        if (this.field8577 != null) {
            this.field8577.field1995 = null;
        }
        if (this.field8656 != null) {
            this.field8656.field8213 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "OA", descriptor = "(I)V")
    public final void method1979(int arg0) {
        field8648++;
        int var2 = class14.field129[arg0];
        int var3 = class14.field130[arg0];
        for (int var4 = 0; var4 < this.field8579; var4++) {
            int var5 = this.field8675[var4] * var3 + this.field8633[var4] * var2 >> 15;
            this.field8633[var4] = this.field8633[var4] * var3 - this.field8675[var4] * var2 >> 15;
            this.field8675[var4] = var5;
        }
        this.field8598 = false;
        if (this.field8577 != null) {
            this.field8577.field1995 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "ca", descriptor = "(III)V")
    public final void method1984(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field8579; var4++) {
            if (arg0 != 0) {
                this.field8675[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field8609[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field8633[var4] += arg2;
            }
        }
        field8622++;
        if (this.field8577 != null) {
            this.field8577.field1995 = null;
        }
        this.field8598 = false;
    }

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "()I")
    public final int method1986() {
        field8663++;
        if (!this.field8598) {
            this.method3404((byte) 64);
        }
        return this.field8638;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZZLjv;ILjv;)Lr;")
    private final class520 method3409(int arg0, boolean arg1, boolean arg2, class584 arg3, int arg4, class584 arg5) {
        arg3.field8579 = this.field8579;
        arg3.field8605 = this.field8605;
        arg3.field8659 = this.field8659;
        if (arg0 != 5) {
            this.method1966(28);
        }
        arg3.field8674 = this.field8674;
        field8635++;
        arg3.field8589 = arg4;
        arg3.field8669 = this.field8669;
        arg3.field8623 = this.field8623;
        arg3.field8615 = this.field8615;
        arg3.field8572 = this.field8572;
        arg3.field8614 = this.field8614;
        arg3.field8611 = 0;
        boolean var7 = class206.method1342(14042, arg4, this.field8605);
        boolean var8 = class221.method1452(arg4, this.field8605, 0);
        boolean var9 = class420.method2500(this.field8605, 255, arg4);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg3.field8675 = this.field8675;
            } else if (arg5.field8675 == null || arg5.field8675.length < this.field8674) {
                arg3.field8675 = arg5.field8675 = new int[this.field8674];
            } else {
                arg3.field8675 = arg5.field8675;
            }
            if (!var8) {
                arg3.field8609 = this.field8609;
            } else if (arg5.field8609 == null || arg5.field8609.length < this.field8674) {
                arg3.field8609 = arg5.field8609 = new int[this.field8674];
            } else {
                arg3.field8609 = arg5.field8609;
            }
            if (!var9) {
                arg3.field8633 = this.field8633;
            } else if (arg5.field8633 == null || arg5.field8633.length < this.field8674) {
                arg3.field8633 = arg5.field8633 = new int[this.field8674];
            } else {
                arg3.field8633 = arg5.field8633;
            }
            for (int var11 = 0; var11 < this.field8674; var11++) {
                if (var7) {
                    arg3.field8675[var11] = this.field8675[var11];
                }
                if (var8) {
                    arg3.field8609[var11] = this.field8609[var11];
                }
                if (var9) {
                    arg3.field8633[var11] = this.field8633[var11];
                }
            }
        } else {
            arg3.field8633 = this.field8633;
            arg3.field8609 = this.field8609;
            arg3.field8675 = this.field8675;
        }
        if (class559.method3273(27834, arg4, this.field8605)) {
            if (arg1) {
                arg3.field8611 = (byte) (arg3.field8611 | 0x1);
            }
            arg3.field8577 = arg5.field8577;
            arg3.field8577.field1991 = this.field8577.field1991;
            arg3.field8577.field1995 = this.field8577.field1995;
        } else if (class474.method2885(arg0 + 98, arg4, this.field8605)) {
            arg3.field8577 = this.field8577;
        } else {
            arg3.field8577 = null;
        }
        if (class200.method1297(this.field8605, arg4, (byte) -27)) {
            if (arg5.field8591 == null || this.field8615 > arg5.field8591.length) {
                arg3.field8591 = arg5.field8591 = new short[this.field8615];
            } else {
                arg3.field8591 = arg5.field8591;
            }
            for (int var12 = 0; var12 < this.field8615; var12++) {
                arg3.field8591[var12] = this.field8591[var12];
            }
        } else {
            arg3.field8591 = this.field8591;
        }
        if (class542.method3184(6, arg4, this.field8605)) {
            if (arg5.field8607 == null || arg5.field8607.length < this.field8615) {
                arg3.field8607 = arg5.field8607 = new byte[this.field8615];
            } else {
                arg3.field8607 = arg5.field8607;
            }
            for (int var13 = 0; var13 < this.field8615; var13++) {
                arg3.field8607[var13] = this.field8607[var13];
            }
        } else {
            arg3.field8607 = this.field8607;
        }
        if (class133.method812(arg4, arg0, this.field8605)) {
            if (arg1) {
                arg3.field8611 = (byte) (arg3.field8611 | 0x2);
            }
            arg3.field8580 = arg5.field8580;
            arg3.field8580.field1995 = this.field8580.field1995;
            arg3.field8580.field1991 = this.field8580.field1991;
        } else if (class309.method1899(this.field8605, (byte) -93, arg4)) {
            arg3.field8580 = this.field8580;
        } else {
            arg3.field8580 = null;
        }
        if (class587.method3425(this.field8605, arg4, 100)) {
            if (arg5.field8593 == null || arg5.field8593.length < this.field8572) {
                int var14 = this.field8572;
                arg3.field8624 = arg5.field8624 = new short[var14];
                arg3.field8593 = arg5.field8593 = new short[var14];
                arg3.field8653 = arg5.field8653 = new short[var14];
            } else {
                arg3.field8624 = arg5.field8624;
                arg3.field8593 = arg5.field8593;
                arg3.field8653 = arg5.field8653;
            }
            if (this.field8574 == null) {
                for (int var15 = 0; var15 < this.field8572; var15++) {
                    arg3.field8593[var15] = this.field8593[var15];
                    arg3.field8653[var15] = this.field8653[var15];
                    arg3.field8624[var15] = this.field8624[var15];
                }
            } else {
                if (arg5.field8574 == null) {
                    arg5.field8574 = new class628();
                }
                class628 var16 = arg3.field8574 = arg5.field8574;
                if (var16.field9197 == null || this.field8572 > var16.field9197.length) {
                    int var17 = this.field8572;
                    var16.field9194 = new short[var17];
                    var16.field9197 = new short[var17];
                    var16.field9199 = new short[var17];
                    var16.field9200 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field8572; var18++) {
                    arg3.field8593[var18] = this.field8593[var18];
                    arg3.field8653[var18] = this.field8653[var18];
                    arg3.field8624[var18] = this.field8624[var18];
                    var16.field9197[var18] = this.field8574.field9197[var18];
                    var16.field9199[var18] = this.field8574.field9199[var18];
                    var16.field9194[var18] = this.field8574.field9194[var18];
                    var16.field9200[var18] = this.field8574.field9200[var18];
                }
            }
            arg3.field8590 = this.field8590;
        } else {
            arg3.field8574 = this.field8574;
            arg3.field8653 = this.field8653;
            arg3.field8593 = this.field8593;
            arg3.field8624 = this.field8624;
            arg3.field8590 = this.field8590;
        }
        if (class229.method1497((byte) -110, arg4, this.field8605)) {
            if (arg1) {
                arg3.field8611 = (byte) (arg3.field8611 | 0x4);
            }
            arg3.field8645 = arg5.field8645;
            arg3.field8645.field1991 = this.field8645.field1991;
            arg3.field8645.field1995 = this.field8645.field1995;
        } else if (class174.method1172(arg0 ^ 0xFFFFFF83, this.field8605, arg4)) {
            arg3.field8645 = this.field8645;
        } else {
            arg3.field8645 = null;
        }
        if (class474.method2888(arg4, (byte) -43, this.field8605)) {
            if (arg5.field8584 == null || this.field8615 > arg5.field8584.length) {
                int var19 = this.field8572;
                arg3.field8584 = arg5.field8584 = new float[var19];
                arg3.field8630 = arg5.field8630 = new float[var19];
            } else {
                arg3.field8584 = arg5.field8584;
                arg3.field8630 = arg5.field8630;
            }
            for (int var20 = 0; var20 < this.field8572; var20++) {
                arg3.field8584[var20] = this.field8584[var20];
                arg3.field8630[var20] = this.field8630[var20];
            }
        } else {
            arg3.field8584 = this.field8584;
            arg3.field8630 = this.field8630;
        }
        if (class340.method2112(true, arg4, this.field8605)) {
            if (arg1) {
                arg3.field8611 = (byte) (arg3.field8611 | 0x8);
            }
            arg3.field8680 = arg5.field8680;
            arg3.field8680.field1991 = this.field8680.field1991;
            arg3.field8680.field1995 = this.field8680.field1995;
        } else if (class371.method2261(arg4, this.field8605, (byte) -97)) {
            arg3.field8680 = this.field8680;
        } else {
            arg3.field8680 = null;
        }
        if (class3.method10(false, arg4, this.field8605)) {
            if (arg5.field8678 == null || this.field8615 > arg5.field8678.length) {
                int var21 = this.field8615;
                arg3.field8586 = arg5.field8586 = new short[var21];
                arg3.field8604 = arg5.field8604 = new short[var21];
                arg3.field8678 = arg5.field8678 = new short[var21];
            } else {
                arg3.field8604 = arg5.field8604;
                arg3.field8678 = arg5.field8678;
                arg3.field8586 = arg5.field8586;
            }
            for (int var22 = 0; var22 < this.field8615; var22++) {
                arg3.field8678[var22] = this.field8678[var22];
                arg3.field8604[var22] = this.field8604[var22];
                arg3.field8586[var22] = this.field8586[var22];
            }
        } else {
            arg3.field8678 = this.field8678;
            arg3.field8586 = this.field8586;
            arg3.field8604 = this.field8604;
        }
        if (class148.method875(arg4, arg0 - 6, this.field8605)) {
            arg3.field8656 = arg5.field8656;
            if (arg1) {
                arg3.field8611 = (byte) (arg3.field8611 | 0x10);
            }
            arg3.field8656.field8213 = this.field8656.field8213;
        } else if (class511.method3051(this.field8605, 0, arg4)) {
            arg3.field8656 = this.field8656;
        } else {
            arg3.field8656 = null;
        }
        if (class490.method2968(this.field8605, arg4, arg0 + 24426)) {
            if (arg5.field8596 == null || this.field8615 > arg5.field8596.length) {
                int var23 = this.field8615;
                arg3.field8596 = arg5.field8596 = new short[var23];
            } else {
                arg3.field8596 = arg5.field8596;
            }
            for (int var24 = 0; var24 < this.field8615; var24++) {
                arg3.field8596[var24] = this.field8596[var24];
            }
        } else {
            arg3.field8596 = this.field8596;
        }
        if (!class35.method181(this.field8605, arg4, (byte) 82)) {
            arg3.field8649 = this.field8649;
        } else if (arg5.field8649 == null || arg5.field8649.length < this.field8669) {
            int var26 = this.field8669;
            arg3.field8649 = arg5.field8649 = new class238[var26];
            for (int var27 = 0; var27 < this.field8669; var27++) {
                arg3.field8649[var27] = this.field8649[var27].method1530(false);
            }
        } else {
            arg3.field8649 = arg5.field8649;
            for (int var25 = 0; var25 < this.field8669; var25++) {
                arg3.field8649[var25].method1531(this.field8649[var25], arg0 ^ 0xFFFFFFD3);
            }
        }
        arg3.field8603 = this.field8603;
        if (this.field8598) {
            arg3.field8642 = this.field8642;
            arg3.field8628 = this.field8628;
            arg3.field8662 = this.field8662;
            arg3.field8608 = this.field8608;
            arg3.field8638 = this.field8638;
            arg3.field8610 = this.field8610;
            arg3.field8598 = true;
            arg3.field8646 = this.field8646;
        } else {
            arg3.field8598 = false;
        }
        arg3.field8613 = this.field8613;
        arg3.field8685 = this.field8685;
        arg3.field8686 = this.field8686;
        arg3.field8583 = this.field8583;
        arg3.field8652 = this.field8652;
        arg3.field8654 = this.field8654;
        arg3.field8625 = this.field8625;
        arg3.field8673 = this.field8673;
        arg3.field8581 = this.field8581;
        arg3.field8578 = this.field8578;
        return arg3;
    }

    @OriginalMember(owner = "client!jv", name = "V", descriptor = "(III)V")
    public final void method1974(int arg0, int arg1, int arg2) {
        field8637++;
        for (int var4 = 0; var4 < this.field8579; var4++) {
            if (arg0 != 128) {
                this.field8675[var4] = this.field8675[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field8609[var4] = this.field8609[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field8633[var4] = this.field8633[var4] * arg2 >> 7;
            }
        }
        if (this.field8577 != null) {
            this.field8577.field1995 = null;
        }
        this.field8598 = false;
    }

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "(I)V")
    public final void method1978(int arg0) {
        field8681++;
        int var2 = class14.field129[arg0];
        int var3 = class14.field130[arg0];
        for (int var4 = 0; var4 < this.field8579; var4++) {
            int var7 = this.field8675[var4] * var3 + this.field8633[var4] * var2 >> 15;
            this.field8633[var4] = this.field8633[var4] * var3 - (this.field8675[var4] * var2) >> 15;
            this.field8675[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field8572; var5++) {
            int var6 = this.field8624[var5] * var2 + this.field8593[var5] * var3 >> 15;
            this.field8624[var5] = (short) (this.field8624[var5] * var3 - (this.field8593[var5] * var2) >> 15);
            this.field8593[var5] = (short) var6;
        }
        if (this.field8645 == null && this.field8580 != null) {
            this.field8580.field1995 = null;
        }
        if (this.field8645 != null) {
            this.field8645.field1995 = null;
        }
        if (this.field8577 != null) {
            this.field8577.field1995 = null;
        }
        this.field8598 = false;
    }

    @OriginalMember(owner = "client!jv", name = "ga", descriptor = "()I")
    public final int method1969() {
        field8667++;
        return this.field8659;
    }

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "()I")
    public final int method1958() {
        if (!this.field8598) {
            this.method3404((byte) 64);
        }
        field8619++;
        return this.field8662;
    }

    @OriginalMember(owner = "client!jv", name = "M", descriptor = "()I")
    public final int method1962() {
        field8595++;
        return this.field8614;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILm;Z)Z")
    public final boolean method1963(int arg0, int arg1, class105 arg2, boolean arg3) {
        field8641++;
        class252 var5 = (class252) arg2;
        class252 var6 = this.field8679.field7073;
        float var7 = var5.field3678 * var6.field3676 + var5.field3684 * var6.field3658 + var5.field3664 * var6.field3669 + var6.field3664;
        float var8 = var5.field3678 * var6.field3662 + var5.field3684 * var6.field3681 + var5.field3664 * var6.field3656 + var6.field3684;
        class314.field4719 = var5.field3672 * var6.field3662 + var5.field3676 * var6.field3656 + var5.field3662 * var6.field3681;
        class73.field859 = var5.field3685 * var6.field3676 + var5.field3681 * var6.field3658 + var5.field3658 * var6.field3669;
        class424.field6065 = var5.field3685 * var6.field3662 + var5.field3681 * var6.field3681 + var5.field3658 * var6.field3656;
        class87.field1117 = var5.field3671 * var6.field3676 + var5.field3669 * var6.field3669 + var5.field3656 * var6.field3658;
        class15.field136 = var5.field3672 * var6.field3676 + var5.field3676 * var6.field3669 + var5.field3662 * var6.field3658;
        class430.field6305 = var5.field3672 * var6.field3672 + var5.field3676 * var6.field3671 + var5.field3662 * var6.field3685;
        class277.field4062 = var5.field3685 * var6.field3672 + var5.field3681 * var6.field3685 + var5.field3658 * var6.field3671;
        float var9 = var5.field3678 * var6.field3672 + var5.field3684 * var6.field3685 + var5.field3664 * var6.field3671 + var6.field3678;
        class210.field3103 = var5.field3671 * var6.field3672 + var5.field3669 * var6.field3671 + var5.field3656 * var6.field3685;
        class301.field4408 = var5.field3671 * var6.field3662 + var5.field3669 * var6.field3656 + var5.field3656 * var6.field3681;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field8679.field7066;
        int var16 = this.field8679.field6989;
        if (!this.field8598) {
            this.method3404((byte) 64);
        }
        class500.field7493[0] = this.field8610;
        class182.field2788[0] = this.field8646;
        class258.field3768[0] = this.field8642;
        class500.field7493[1] = this.field8628;
        class182.field2788[1] = this.field8646;
        class500.field7493[2] = this.field8610;
        class258.field3768[1] = this.field8642;
        class182.field2788[2] = this.field8638;
        class500.field7493[3] = this.field8628;
        class258.field3768[2] = this.field8642;
        class182.field2788[3] = this.field8638;
        class500.field7493[4] = this.field8610;
        class258.field3768[3] = this.field8642;
        class182.field2788[4] = this.field8646;
        class258.field3768[4] = this.field8608;
        class500.field7493[5] = this.field8628;
        class182.field2788[5] = this.field8646;
        class258.field3768[5] = this.field8608;
        class500.field7493[6] = this.field8610;
        class182.field2788[6] = this.field8638;
        class500.field7493[7] = this.field8628;
        class258.field3768[6] = this.field8608;
        class182.field2788[7] = this.field8638;
        class258.field3768[7] = this.field8608;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class500.field7493[var17];
            float var39 = (float) class258.field3768[var17];
            float var40 = (float) class182.field2788[var17];
            float var41 = class15.field136 * var39 + class87.field1117 * var38 + class73.field859 * var40 + var7;
            float var42 = class314.field4719 * var39 + class424.field6065 * var40 + class301.field4408 * var38 + var8;
            float var43 = class430.field6305 * var39 + class277.field4062 * var40 + class210.field3103 * var38 + var9;
            if (var43 >= (float) this.field8679.field7099) {
                float var44 = (float) var15 * var41 / var43 + (float) this.field8679.field7013;
                float var45 = (float) var16 * var42 / var43 + (float) this.field8679.field7026;
                if (var12 < var44) {
                    var12 = var44;
                }
                if (var11 > var44) {
                    var11 = var44;
                }
                var10 = true;
                if (var13 > var45) {
                    var13 = var45;
                }
                if (var45 > var14) {
                    var14 = var45;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field8572 > this.field8679.field7105.length) {
                this.field8679.field7104 = new int[this.field8572];
                this.field8679.field7105 = new int[this.field8572];
            }
            int[] var18 = this.field8679.field7105;
            int[] var19 = this.field8679.field7104;
            for (int var20 = 0; var20 < this.field8579; var20++) {
                float var22 = (float) this.field8609[var20];
                float var23 = (float) this.field8675[var20];
                float var24 = (float) this.field8633[var20];
                float var25 = class430.field6305 * var24 + class277.field4062 * var22 + class210.field3103 * var23 + var9;
                float var26 = class15.field136 * var24 + class87.field1117 * var23 + class73.field859 * var22 + var7;
                float var27 = class314.field4719 * var24 + class424.field6065 * var22 + class301.field4408 * var23 + var8;
                if (((float) this.field8679.field7099 <= var25)) {
                    int var32 = (int) ((float) var15 * var26 / var25 + (float) this.field8679.field7013);
                    int var33 = (int) ((float) var16 * var27 / var25 + (float) this.field8679.field7026);
                    int var34 = this.field8685[var20];
                    int var35 = this.field8685[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field8613[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field8685[var20];
                    int var29 = this.field8685[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field8613[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field8613[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field8615; var21++) {
                if (var18[this.field8678[var21]] != -999999 && var18[this.field8604[var21]] != -999999 && var18[this.field8586[var21]] != -999999 && this.method3406((byte) -23, var19[this.field8586[var21]], var19[this.field8678[var21]], arg1, var18[this.field8678[var21]], arg0, var19[this.field8604[var21]], var18[this.field8586[var21]], var18[this.field8604[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lol;B)V")
    private final void method3410(class252 arg0, byte arg1) {
        field8666++;
        if (this.field8603 != null) {
            for (int var3 = 0; var3 < this.field8603.length; var3++) {
                class26 var4 = this.field8603[var3];
                class26 var5 = var4;
                if (var4.field234 != null) {
                    var5 = var4.field234;
                }
                var5.field243 = (int) ((float) this.field8633[var4.field236] * arg0.field3676 + (float) this.field8675[var4.field236] * arg0.field3669 + (float) this.field8609[var4.field236] * arg0.field3658 + arg0.field3664);
                var5.field249 = (int) ((float) this.field8633[var4.field236] * arg0.field3662 + (float) this.field8675[var4.field236] * arg0.field3656 + (float) this.field8609[var4.field236] * arg0.field3681 + arg0.field3684);
                var5.field247 = (int) ((float) this.field8633[var4.field236] * arg0.field3672 + (float) this.field8675[var4.field236] * arg0.field3671 + (float) this.field8609[var4.field236] * arg0.field3685 + arg0.field3678);
                var5.field250 = (int) ((float) this.field8633[var4.field244] * arg0.field3676 + (float) this.field8675[var4.field244] * arg0.field3669 + (float) this.field8609[var4.field244] * arg0.field3658 + arg0.field3664);
                var5.field238 = (int) ((float) this.field8633[var4.field244] * arg0.field3662 + (float) this.field8675[var4.field244] * arg0.field3656 + (float) this.field8609[var4.field244] * arg0.field3681 + arg0.field3684);
                var5.field237 = (int) ((float) this.field8633[var4.field244] * arg0.field3672 + (float) this.field8675[var4.field244] * arg0.field3671 + (float) this.field8609[var4.field244] * arg0.field3685 + arg0.field3678);
                var5.field242 = (int) ((float) this.field8633[var4.field248] * arg0.field3676 + (float) this.field8675[var4.field248] * arg0.field3669 + (float) this.field8609[var4.field248] * arg0.field3658 + arg0.field3664);
                var5.field239 = (int) ((float) this.field8633[var4.field248] * arg0.field3662 + (float) this.field8675[var4.field248] * arg0.field3656 + (float) this.field8609[var4.field248] * arg0.field3681 + arg0.field3684);
                var5.field235 = (int) ((float) this.field8633[var4.field248] * arg0.field3672 + (float) this.field8675[var4.field248] * arg0.field3671 + (float) this.field8609[var4.field248] * arg0.field3685 + arg0.field3678);
            }
        }
        if (this.field8686 != null) {
            for (int var6 = 0; var6 < this.field8686.length; var6++) {
                class200 var7 = this.field8686[var6];
                class200 var8 = var7;
                if (var7.field2999 != null) {
                    var8 = var7.field2999;
                }
                if (var7.field2989 == null) {
                    var7.field2989 = arg0.method609();
                } else {
                    var7.field2989.method618(arg0);
                }
                var8.field3002 = (int) ((float) this.field8633[var7.field2991] * arg0.field3676 + (float) this.field8675[var7.field2991] * arg0.field3669 + (float) this.field8609[var7.field2991] * arg0.field3658 + arg0.field3664);
                var8.field3000 = (int) ((float) this.field8633[var7.field2991] * arg0.field3662 + (float) this.field8675[var7.field2991] * arg0.field3656 + (float) this.field8609[var7.field2991] * arg0.field3681 + arg0.field3684);
                var8.field2994 = (int) ((float) this.field8633[var7.field2991] * arg0.field3672 + (float) this.field8675[var7.field2991] * arg0.field3671 + (float) this.field8609[var7.field2991] * arg0.field3685 + arg0.field3678);
            }
        }
        if (arg1 != -72) {
            this.method1986();
        }
    }

    @OriginalMember(owner = "client!jv", name = "wa", descriptor = "()I")
    public final int method1982() {
        field8644++;
        if (!this.field8598) {
            this.method3404((byte) 64);
        }
        return this.field8610;
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "()[Lkv;")
    public final class200[] method1970() {
        field8576++;
        return this.field8686;
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V")
    private final void method3411(int arg0) {
        field8631++;
        if (!this.field8606) {
            return;
        }
        this.field8606 = false;
        if (this.field8603 == null && this.field8686 == null && this.field8625 == null) {
            if (this.field8675 != null && !class86.method496(this.field8605, this.field8589, 0)) {
                if (this.field8577 != null && this.field8577.field1995 == null) {
                    this.field8606 = true;
                } else {
                    if (!this.field8598) {
                        this.method3404((byte) 64);
                    }
                    this.field8675 = null;
                }
            }
            if (this.field8609 != null && !class393.method2370((byte) -125, this.field8605, this.field8589)) {
                if (this.field8577 != null && this.field8577.field1995 == null) {
                    this.field8606 = true;
                } else {
                    if (!this.field8598) {
                        this.method3404((byte) 64);
                    }
                    this.field8609 = null;
                }
            }
            if (this.field8633 != null && !class322.method2016((byte) -103, this.field8605, this.field8589)) {
                if (this.field8577 != null && this.field8577.field1995 == null) {
                    this.field8606 = true;
                } else {
                    if (!this.field8598) {
                        this.method3404((byte) 64);
                    }
                    this.field8633 = null;
                }
            }
        }
        if (this.field8613 != null && this.field8675 == null && this.field8609 == null && this.field8633 == null) {
            this.field8685 = null;
            this.field8613 = null;
        }
        if (this.field8590 != null && !class263.method1684(arg0 ^ 0xFFFFF550, this.field8589, this.field8605)) {
            if (this.field8645 == null) {
                if (this.field8580 != null && this.field8580.field1995 == null) {
                    this.field8606 = true;
                } else {
                    this.field8593 = this.field8653 = this.field8624 = null;
                    this.field8590 = null;
                }
            } else if (this.field8645.field1995 == null) {
                this.field8606 = true;
            } else {
                this.field8590 = null;
                this.field8593 = this.field8653 = this.field8624 = null;
            }
        }
        if (this.field8591 != null && !class34.method163(-12884, this.field8589, this.field8605)) {
            if (this.field8580 != null && this.field8580.field1995 == null) {
                this.field8606 = true;
            } else {
                this.field8591 = null;
            }
        }
        if (this.field8607 != null && !class94.method537((byte) 80, this.field8605, this.field8589)) {
            if (this.field8580 != null && this.field8580.field1995 == null) {
                this.field8606 = true;
            } else {
                this.field8607 = null;
            }
        }
        if (this.field8584 != null && !class321.method2014(this.field8589, this.field8605, (byte) -39)) {
            if (this.field8680 != null && this.field8680.field1995 == null) {
                this.field8606 = true;
            } else {
                this.field8584 = this.field8630 = null;
            }
        }
        if (this.field8596 != null && !class198.method1275(this.field8605, 66, this.field8589)) {
            if (this.field8580 != null && this.field8580.field1995 == null) {
                this.field8606 = true;
            } else {
                this.field8596 = null;
            }
        }
        if (this.field8678 != null && !class84.method489(this.field8605, this.field8589, -1)) {
            if ((this.field8656 == null || this.field8656.field8213 != null) && (this.field8580 == null || this.field8580.field1995 != null)) {
                this.field8678 = this.field8604 = this.field8586 = null;
            } else {
                this.field8606 = true;
            }
        }
        if (arg0 != 0) {
            field8677 = 64;
        }
        if (this.field8654 != null && !class301.method1863(false, this.field8605, this.field8589)) {
            this.field8578 = null;
            this.field8654 = null;
        }
        if (this.field8583 != null && !class533.method3134(this.field8605, this.field8589, false)) {
            this.field8583 = null;
            this.field8673 = null;
        }
        if (this.field8652 != null && !class234.method1521(this.field8589, 0, this.field8605)) {
            this.field8652 = null;
        }
        if (this.field8581 != null && (this.field8589 & 0x800) == 0 && (this.field8589 & 0x40000) == 0) {
            this.field8581 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "()V")
    public final void method1961() {
        field8650++;
        if (this.field8572 <= 0 || this.field8623 <= 0) {
            return;
        }
        this.method3412((byte) 33, false);
        if ((this.field8611 & 0x10) == 0 && this.field8656.field8213 == null) {
            this.method3403(false, (byte) 0);
        }
        this.method3411(0);
    }

    @OriginalMember(owner = "client!jv", name = "I", descriptor = "(I)V")
    public final void method1983(int arg0) {
        if (this.field8580 != null) {
            this.field8580.field1995 = null;
        }
        this.field8659 = (short) arg0;
        field8683++;
        if (this.field8645 != null) {
            this.field8645.field1995 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BZ)V")
    private final void method3412(byte arg0, boolean arg1) {
        field8676++;
        boolean var3 = this.field8580 != null && this.field8580.field1995 == null;
        boolean var4 = this.field8645 != null && this.field8645.field1995 == null;
        boolean var5 = this.field8577 != null && this.field8577.field1995 == null;
        boolean var6 = this.field8680 != null && this.field8680.field1995 == null;
        if (arg1) {
            var3 &= (this.field8611 & 0x2) != 0;
            var5 &= (this.field8611 & 0x1) != 0;
            var6 &= (this.field8611 & 0x8) != 0;
            var4 &= (this.field8611 & 0x4) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (arg0 != 33) {
            this.method1969();
        }
        byte var11 = 0;
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field8572 * var7 > this.field8679.field7005.field6162.length) {
            this.field8679.field7005 = new class444((this.field8572 + 100) * var7);
        } else {
            this.field8679.field7005.field6221 = 0;
        }
        class444 var12 = this.field8679.field7005;
        if (var5) {
            if (this.field8679.field7004) {
                for (int var21 = 0; var21 < this.field8579; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field8675[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field8609[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field8633[var21]);
                    int var25 = this.field8685[var21];
                    int var26 = this.field8685[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field8613[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field6221 = var7 * var28;
                        var12.method2576(true, var22);
                        var12.method2576(true, var23);
                        var12.method2576(true, var24);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field8579; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field8675[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field8609[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field8633[var13]);
                    int var17 = this.field8685[var13];
                    int var18 = this.field8685[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field8613[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field6221 = var7 * var20;
                        var12.method2597(255, var14);
                        var12.method2597(255, var15);
                        var12.method2597(255, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field8645 == null) {
                short[] var29;
                short[] var30;
                short[] var31;
                byte[] var32;
                if (this.field8574 == null) {
                    var29 = this.field8653;
                    var30 = this.field8593;
                    var32 = this.field8590;
                    var31 = this.field8624;
                } else {
                    var29 = this.field8574.field9199;
                    var30 = this.field8574.field9197;
                    var31 = this.field8574.field9194;
                    var32 = this.field8574.field9200;
                }
                float var33 = this.field8679.field7036[0];
                float var34 = this.field8679.field7036[1];
                float var35 = this.field8679.field7036[2];
                float var36 = this.field8679.field7000;
                float var37 = this.field8679.field7045 * 768.0F / (float) this.field8659;
                float var38 = this.field8679.field7046 * 768.0F / (float) this.field8659;
                for (int var39 = 0; var39 < this.field8615; var39++) {
                    int var40 = this.method3415(this.field8614, this.field8591[var39], -8634, this.field8596[var39], this.field8607[var39]);
                    float var41 = (float) ((var40 & 0xFF5598) >> 16) * this.field8679.field7001;
                    float var42 = (float) (var40 >>> 24) * this.field8679.field7063;
                    short var43 = this.field8678[var39];
                    float var44 = (float) ((var40 & 0xFFC4) >> 8) * this.field8679.field7069;
                    short var45 = (short) var32[var43];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var43] * var35 + (float) var29[var43] * var34 + (float) var30[var43] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var43] * var35 + (float) var29[var43] * var34 + (float) var30[var43] * var33) / (float) (var45 * 256);
                    }
                    float var47 = var36 + var46 * (var46 < 0.0F ? var38 : var37);
                    int var48 = (int) (var42 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var41 * var47);
                    int var50 = (int) (var44 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.field6221 = var7 * var43 + var9;
                    var12.method2563(-13021, var48);
                    var12.method2563(-13021, var49);
                    var12.method2563(arg0 - 13054, var50);
                    var12.method2563(-13021, 255 - (this.field8607[var39] & 0xFF));
                    short var51 = this.field8604[var39];
                    short var52 = (short) var32[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var34 + (float) var30[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var34 + (float) var30[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = (var53 < 0.0F ? var38 : var37) * var53 + var36;
                    int var55 = (int) (var42 * var54);
                    int var56 = (int) (var41 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var44 * var54);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field6221 = var7 * var51 + var9;
                    var12.method2563(-13021, var55);
                    var12.method2563(-13021, var56);
                    var12.method2563(arg0 ^ 0xFFFFCD02, var57);
                    var12.method2563(-13021, 255 - (this.field8607[var39] & 0xFF));
                    short var58 = this.field8586[var39];
                    short var59 = (short) var32[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var34 + (float) var30[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var34 + (float) var30[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = (var60 < 0.0F ? var38 : var37) * var60 + var36;
                    int var62 = (int) (var42 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var41 * var61);
                    int var64 = (int) (var44 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var12.field6221 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method2563(-13021, var62);
                    var12.method2563(arg0 ^ 0xFFFFCD02, var63);
                    var12.method2563(-13021, var64);
                    var12.method2563(-13021, 255 - (this.field8607[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field8615; var65++) {
                    int var66 = this.method3415(this.field8614, this.field8591[var65], -8634, this.field8596[var65], this.field8607[var65]);
                    var12.field6221 = this.field8678[var65] * var7 + var9;
                    var12.method2576(true, var66);
                    var12.field6221 = this.field8604[var65] * var7 + var9;
                    var12.method2576(true, var66);
                    var12.field6221 = this.field8586[var65] * var7 + var9;
                    var12.method2576(true, var66);
                }
            }
        }
        if (var4) {
            short[] var67;
            byte[] var68;
            short[] var69;
            short[] var70;
            if (this.field8574 == null) {
                var67 = this.field8624;
                var68 = this.field8590;
                var69 = this.field8653;
                var70 = this.field8593;
            } else {
                var67 = this.field8574.field9194;
                var69 = this.field8574.field9199;
                var68 = this.field8574.field9200;
                var70 = this.field8574.field9197;
            }
            float var71 = 3.0F / (float) this.field8659;
            float var72 = 3.0F / (float) (this.field8659 + (this.field8659 / 2));
            var12.field6221 = var10;
            if (this.field8679.field7004) {
                for (int var73 = 0; var73 < this.field8572; var73++) {
                    int var74 = var68[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2697(-11, (float) var70[var73] * var72);
                        var12.method2697(arg0 - 44, (float) var69[var73] * var72);
                        var12.method2697(-11, (float) var67[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2697(-11, (float) var70[var73] * var75);
                        var12.method2697(-11, (float) var69[var73] * var75);
                        var12.method2697(-11, (float) var67[var73] * var75);
                    }
                    var12.field6221 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field8572; var76++) {
                    int var77 = var68[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2700((float) var70[var76] * var72, arg0 - 353481801);
                        var12.method2700((float) var69[var76] * var72, -353481768);
                        var12.method2700((float) var67[var76] * var72, -353481768);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2700((float) var70[var76] * var78, arg0 - 353481801);
                        var12.method2700((float) var69[var76] * var78, -353481768);
                        var12.method2700((float) var67[var76] * var78, arg0 ^ 0xEAEE4BF9);
                    }
                    var12.field6221 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field6221 = var11;
            if (this.field8679.field7004) {
                for (int var80 = 0; var80 < this.field8572; var80++) {
                    var12.method2697(-11, this.field8584[var80]);
                    var12.method2697(-11, this.field8630[var80]);
                    var12.field6221 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field8572; var79++) {
                    var12.method2700(this.field8584[var79], -353481768);
                    var12.method2700(this.field8630[var79], -353481768);
                    var12.field6221 += var7 - 8;
                }
            }
        }
        var12.field6221 = this.field8572 * var7;
        class9 var81;
        if (arg1) {
            if (this.field8612 == null) {
                this.field8612 = this.field8679.method2781(var12.field6221, var12.field6162, var7, true, 32);
            } else {
                this.field8612.method44((byte) -91, var12.field6221, var12.field6162, var7);
            }
            var81 = this.field8612;
            this.field8611 = 0;
        } else {
            var81 = this.field8679.method2781(var12.field6221, var12.field6162, var7, false, -98);
            this.field8606 = true;
        }
        if (var5) {
            this.field8577.field1991 = var8;
            this.field8577.field1995 = var81;
        }
        if (var6) {
            this.field8680.field1995 = var81;
            this.field8680.field1991 = var11;
        }
        if (var3) {
            this.field8580.field1995 = var81;
            this.field8580.field1991 = var9;
        }
        if (var4) {
            this.field8645.field1995 = var81;
            this.field8645.field1991 = var10;
        }
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "()Z")
    public final boolean method1946() {
        field8573++;
        if (this.field8596 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field8596.length; var1++) {
            if (this.field8596[var1] != -1 && !this.field8679.field2262.method1758((byte) 3, this.field8596[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jv", name = "D", descriptor = "(I)V")
    public final void method1966(int arg0) {
        field8668++;
        int var2 = class14.field129[arg0];
        int var3 = class14.field130[arg0];
        for (int var4 = 0; var4 < this.field8579; var4++) {
            int var5 = this.field8609[var4] * var3 - (this.field8633[var4] * var2) >> 15;
            this.field8633[var4] = this.field8633[var4] * var3 + this.field8609[var4] * var2 >> 15;
            this.field8609[var4] = var5;
        }
        this.field8598 = false;
        if (this.field8577 != null) {
            this.field8577.field1995 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public final void method1977(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field8601++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            class261.field3840 = 0;
            class555.field8239 = 0;
            int var13 = 0;
            class631.field9230 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field8583.length) {
                    int[] var16 = this.field8583[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field8673 == null || (arg6 & this.field8673[var18]) != 0) {
                            class631.field9230 += this.field8675[var18];
                            class555.field8239 += this.field8609[var18];
                            var13++;
                            class261.field3840 += this.field8633[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class555.field8239 = var10;
                class261.field3840 = var11;
                class631.field9230 = var12;
            } else {
                class555.field8239 = class555.field8239 / var13 + var10;
                class261.field3840 = class261.field3840 / var13 + var11;
                class631.field9230 = class631.field9230 / var13 + var12;
                class506.field7536 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 16384 >> 15;
                int var20 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 16384 >> 15;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg2 << 4;
            int var23 = arg4 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field8583.length) {
                    int[] var27 = this.field8583[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field8673 == null || (arg6 & this.field8673[var29]) != 0) {
                            this.field8675[var29] += var22;
                            this.field8609[var29] += var24;
                            this.field8633[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field8583.length) {
                        int[] var110 = this.field8583[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field8673 == null || (this.field8673[var112] & arg6) != 0) {
                                this.field8675[var112] -= class631.field9230;
                                this.field8609[var112] -= class555.field8239;
                                this.field8633[var112] -= class261.field3840;
                                if (arg4 != 0) {
                                    int var113 = class14.field129[arg4];
                                    int var114 = class14.field130[arg4];
                                    int var115 = this.field8675[var112] * var114 + this.field8609[var112] * var113 + 32767 >> 15;
                                    this.field8609[var112] = this.field8609[var112] * var114 + 32767 - (this.field8675[var112] * var113) >> 15;
                                    this.field8675[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class14.field129[arg2];
                                    int var117 = class14.field130[arg2];
                                    int var118 = this.field8609[var112] * var117 + 32767 - this.field8633[var112] * var116 >> 15;
                                    this.field8633[var112] = this.field8633[var112] * var117 + this.field8609[var112] * var116 + 32767 >> 15;
                                    this.field8609[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class14.field129[arg3];
                                    int var120 = class14.field130[arg3];
                                    int var121 = this.field8633[var112] * var119 + this.field8675[var112] * var120 + 32767 >> 15;
                                    this.field8633[var112] = this.field8633[var112] * var120 + 32767 - (this.field8675[var112] * var119) >> 15;
                                    this.field8675[var112] = var121;
                                }
                                this.field8675[var112] += class631.field9230;
                                this.field8609[var112] += class555.field8239;
                                this.field8633[var112] += class261.field3840;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field8583.length) {
                            int[] var93 = this.field8583[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field8673 == null || (this.field8673[var95] & arg6) != 0) {
                                    int var96 = this.field8685[var95];
                                    int var97 = this.field8685[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field8613[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class14.field129[arg4];
                                            int var101 = class14.field130[arg4];
                                            int var102 = this.field8653[var99] * var100 + this.field8593[var99] * var101 + 32767 >> 15;
                                            this.field8653[var99] = (short) (this.field8653[var99] * var101 + 32767 - (this.field8593[var99] * var100) >> 15);
                                            this.field8593[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class14.field129[arg2];
                                            int var104 = class14.field130[arg2];
                                            int var105 = this.field8653[var99] * var104 - (this.field8624[var99] * var103 - 32767) >> 15;
                                            this.field8624[var99] = (short) (this.field8653[var99] * var103 + (this.field8624[var99] * var104 + 32767) >> 15);
                                            this.field8653[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class14.field129[arg3];
                                            int var107 = class14.field130[arg3];
                                            int var108 = this.field8593[var99] * var107 + this.field8624[var99] * var106 + 32767 >> 15;
                                            this.field8624[var99] = (short) (this.field8624[var99] * var107 + 32767 - (this.field8593[var99] * var106) >> 15);
                                            this.field8593[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field8645 == null && this.field8580 != null) {
                        this.field8580.field1995 = null;
                    }
                    if (this.field8645 != null) {
                        this.field8645.field1995 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class506.field7536) {
                    int var36 = arg7[6] * class261.field3840 + (arg7[0] * class631.field9230 + (arg7[3] * class555.field8239) + 16384) >> 15;
                    int var37 = arg7[4] * class555.field8239 + (arg7[1] * class631.field9230 - (-(arg7[7] * class261.field3840) - 16384)) >> 15;
                    int var38 = arg7[2] * class631.field9230 + arg7[5] * class555.field8239 + arg7[8] * class261.field3840 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    class555.field8239 = var40;
                    class631.field9230 = var39;
                    int var41 = var35 + var38;
                    class261.field3840 = var41;
                    class506.field7536 = false;
                }
                int[] var42 = new int[9];
                int var43 = class14.field130[arg2];
                int var44 = class14.field129[arg2];
                int var45 = class14.field130[arg3];
                int var46 = class14.field129[arg3];
                int var47 = class14.field130[arg4];
                int var48 = class14.field129[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                int var51 = var42[1] * -class555.field8239 + var42[0] * -class631.field9230 + (var42[2] * -class261.field3840) + 16384 >> 15;
                int var52 = var42[3] * -class631.field9230 - (-(var42[4] * -class555.field8239) - (var42[5] * -class261.field3840) - 16384) >> 15;
                int var53 = var42[6] * -class631.field9230 + var42[8] * -class261.field3840 + var42[7] * -class555.field8239 + 16384 >> 15;
                int var54 = var51 + class631.field9230;
                int var55 = class555.field8239 + var52;
                int var56 = var53 + class261.field3840;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += arg7[var87 * 3 + var89] * var42[var58 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 16384 >> 15;
                    }
                }
                int var59 = var42[0] * var33 + var42[2] * var35 + var42[1] * var34 + 16384 >> 15;
                int var60 = var42[3] * var33 + (var42[4] * var34) + (var42[5] * var35 - -16384) >> 15;
                int var61 = var42[6] * var33 + var42[7] * var34 + var42[8] * var35 + 16384 >> 15;
                int var62 = var54 + var59;
                int var63 = var55 + var60;
                int var64 = var56 + var61;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[0] * var62 + (arg7[2] * var64) + arg7[1] * var63 + 16384 >> 15;
                int var68 = arg7[5] * var64 + arg7[3] * var62 + arg7[4] * var63 + 16384 >> 15;
                int var69 = var30 + var67;
                int var70 = var31 + var68;
                int var71 = arg7[7] * var63 + arg7[6] * var62 + arg7[8] * var64 + 16384 >> 15;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field8583.length > var74) {
                        int[] var75 = this.field8583[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field8673 == null || (this.field8673[var77] & arg6) != 0) {
                                int var78 = this.field8675[var77] * var65[0] - (-(this.field8609[var77] * var65[1]) - this.field8633[var77] * var65[2] - 16384) >> 15;
                                int var79 = this.field8633[var77] * var65[5] + this.field8675[var77] * var65[3] + this.field8609[var77] * var65[4] + 16384 >> 15;
                                int var80 = var69 + var78;
                                int var81 = this.field8675[var77] * var65[6] + this.field8609[var77] * var65[7] + (this.field8633[var77] * var65[8]) + 16384 >> 15;
                                int var82 = var70 + var79;
                                int var83 = var72 + var81;
                                this.field8675[var77] = var80;
                                this.field8609[var77] = var82;
                                this.field8633[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field8583.length > var123) {
                        int[] var124 = this.field8583[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field8673 == null || (this.field8673[var126] & arg6) != 0) {
                                this.field8675[var126] -= class631.field9230;
                                this.field8609[var126] -= class555.field8239;
                                this.field8633[var126] -= class261.field3840;
                                this.field8675[var126] = this.field8675[var126] * arg2 >> 7;
                                this.field8609[var126] = this.field8609[var126] * arg3 >> 7;
                                this.field8633[var126] = this.field8633[var126] * arg4 >> 7;
                                this.field8675[var126] += class631.field9230;
                                this.field8609[var126] += class555.field8239;
                                this.field8633[var126] += class261.field3840;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class506.field7536) {
                    int var133 = arg7[0] * class631.field9230 + (arg7[3] * class555.field8239 + (arg7[6] * class261.field3840) + 16384) >> 15;
                    int var134 = arg7[7] * class261.field3840 + (arg7[1] * class631.field9230 - (-(arg7[4] * class555.field8239) - 16384)) >> 15;
                    int var135 = var130 + var133;
                    int var136 = var131 + var134;
                    int var137 = arg7[2] * class631.field9230 + (arg7[5] * class555.field8239) - (-(arg7[8] * class261.field3840) - 16384) >> 15;
                    int var138 = var132 + var137;
                    class555.field8239 = var136;
                    class631.field9230 = var135;
                    class506.field7536 = false;
                    class261.field3840 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class631.field9230 * var139 + 16384 >> 15;
                int var143 = -class555.field8239 * var140 + 16384 >> 15;
                int var144 = -class261.field3840 * var141 + 16384 >> 15;
                int var145 = var142 + class631.field9230;
                int var146 = class555.field8239 + var143;
                int var147 = var144 + class261.field3840;
                int[] var148 = new int[] { arg7[0] * var139 + 16384 >> 15, arg7[3] * var139 + 16384 >> 15, arg7[6] * var139 + 16384 >> 15, arg7[1] * var140 + 16384 >> 15, arg7[4] * var140 + 16384 >> 15, arg7[7] * var140 + 16384 >> 15, arg7[2] * var141 + 16384 >> 15, arg7[5] * var141 + 16384 >> 15, arg7[8] * var141 + 16384 >> 15 };
                int var149 = var130 * var139 + 16384 >> 15;
                int var150 = var131 * var140 + 16384 >> 15;
                int var151 = var132 * var141 + 16384 >> 15;
                int var152 = var145 + var149;
                int var153 = var146 + var150;
                int var154 = var147 + var151;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += var148[var174 + (var176 * 3)] * arg7[var156 * 3 + var176];
                        }
                        var155[var156 * 3 + var174] = var175 + 16384 >> 15;
                    }
                }
                int var157 = arg7[2] * var154 + arg7[1] * var153 + arg7[0] * var152 + 16384 >> 15;
                int var158 = arg7[5] * var154 + arg7[3] * var152 - (-(arg7[4] * var153) + -16384) >> 15;
                int var159 = var127 + var157;
                int var160 = var128 + var158;
                int var161 = arg7[8] * var154 + arg7[6] * var152 + arg7[7] * var153 + 16384 >> 15;
                int var162 = var129 + var161;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field8583.length) {
                        int[] var165 = this.field8583[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field8673 == null || (arg6 & this.field8673[var167]) != 0) {
                                int var168 = this.field8675[var167] * var155[0] + this.field8633[var167] * var155[2] + this.field8609[var167] * var155[1] + 16384 >> 15;
                                int var169 = this.field8633[var167] * var155[5] + this.field8609[var167] * var155[4] + this.field8675[var167] * var155[3] + 16384 >> 15;
                                int var170 = var160 + var169;
                                int var171 = this.field8633[var167] * var155[8] + this.field8675[var167] * var155[6] + this.field8609[var167] * var155[7] + 16384 >> 15;
                                int var172 = var159 + var168;
                                int var173 = var162 + var171;
                                this.field8675[var167] = var172;
                                this.field8609[var167] = var170;
                                this.field8633[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8654 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field8654.length) {
                        int[] var182 = this.field8654[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field8578 == null || (arg6 & this.field8578[var184]) != 0) {
                                int var185 = (this.field8607[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field8607[var184] = (byte) var185;
                                if (this.field8580 != null) {
                                    this.field8580.field1995 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field8625 != null) {
                    for (int var178 = 0; var178 < this.field8669; var178++) {
                        class456 var179 = this.field8625[var178];
                        class238 var180 = this.field8649[var178];
                        var180.field3480 = var180.field3480 & 0xFFFFFF | 255 - (this.field8607[var179.field6639] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field8654 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field8654.length > var190) {
                        int[] var191 = this.field8654[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field8578 == null || (arg6 & this.field8578[var193]) != 0) {
                                int var194 = this.field8591[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x381) >> 7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = arg2 + var195 & 0x3F;
                                int var200 = arg4 + var197;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field8591[var193] = (short) class313.method1926(var200, class313.method1926(var198 << 7, var199 << 10));
                                if (this.field8580 != null) {
                                    this.field8580.field1995 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field8625 != null) {
                    for (int var187 = 0; var187 < this.field8669; var187++) {
                        class456 var188 = this.field8625[var187];
                        class238 var189 = this.field8649[var187];
                        var189.field3480 = class620.field9045[this.field8591[var188.field6639] & 0xFFFF] & 0xFFFFFF | var189.field3480 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field8652 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field8652.length > var202) {
                        int[] var203 = this.field8652[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class238 var205 = this.field8649[var203[var204]];
                            var205.field3474 += arg2;
                            var205.field3483 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8652 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field8652.length) {
                        int[] var208 = this.field8652[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class238 var210 = this.field8649[var208[var209]];
                            var210.field3478 = var210.field3478 * arg2 >> 7;
                            var210.field3484 = var210.field3484 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8652 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field8652.length > var212) {
                    int[] var213 = this.field8652[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class238 var215 = this.field8649[var213[var214]];
                        var215.field3479 = var215.field3479 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(FIILbt;JIIBFI)S")
    private final short method3413(float arg0, int arg1, int arg2, class114 arg3, long arg4, int arg5, int arg6, byte arg7, float arg8, int arg9) {
        field8651++;
        int var12 = this.field8685[arg9];
        int var13 = this.field8685[arg9 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field8613[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class190.field2892[var15] == arg4) {
                return (short) (var16 - 1);
            }
        }
        this.field8613[var14] = (short) (this.field8572 + 1);
        class190.field2892[var14] = arg4;
        this.field8593[this.field8572] = (short) arg1;
        this.field8653[this.field8572] = (short) arg6;
        this.field8624[this.field8572] = (short) arg5;
        int var17 = -6 % ((-arg7 - 24) / 42);
        this.field8590[this.field8572] = (byte) arg2;
        this.field8584[this.field8572] = arg0;
        this.field8630[this.field8572] = arg8;
        return (short) (this.field8572++);
    }

    @OriginalMember(owner = "client!jv", name = "ba", descriptor = "()I")
    public final int method1950() {
        field8661++;
        return this.field8589;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lm;Lgr;II)V")
    public final void method1975(class105 arg0, class525 arg1, int arg2, int arg3) {
        field8647++;
        if (this.field8572 == 0) {
            return;
        }
        class252 var5 = this.field8679.field7073;
        if (!this.field8598) {
            this.method3404((byte) 64);
        }
        class252 var6 = (class252) arg0;
        class277.field4062 = var5.field3672 * var6.field3685 + var5.field3685 * var6.field3681 + var5.field3671 * var6.field3658;
        class538.field7952 = var5.field3672 * var6.field3678 + var5.field3685 * var6.field3684 + var5.field3671 * var6.field3664 + var5.field3678;
        float var7 = (float) this.field8646 * class277.field4062 + class538.field7952;
        float var8 = (float) this.field8638 * class277.field4062 + class538.field7952;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var10 = (float) this.field8662 + var7;
            var9 = (float) (-this.field8662) + var8;
        } else {
            var9 = (float) (-this.field8662) + var7;
            var10 = (float) this.field8662 + var8;
        }
        if ((var9 >= this.field8679.field6998) || (var10 <= (float) this.field8679.field7099)) {
            return;
        }
        class642.field9319 = var5.field3676 * var6.field3678 + var5.field3669 * var6.field3664 + var5.field3658 * var6.field3684 + var5.field3664;
        class73.field859 = var5.field3676 * var6.field3685 + var5.field3669 * var6.field3658 + var5.field3658 * var6.field3681;
        float var11 = (float) this.field8646 * class73.field859 + class642.field9319;
        float var12 = (float) this.field8638 * class73.field859 + class642.field9319;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) this.field8662 + var11) * (float) this.field8679.field7066;
            var14 = ((float) (-this.field8662) + var12) * (float) this.field8679.field7066;
        } else {
            var14 = (var11 - (float) this.field8662) * (float) this.field8679.field7066;
            var13 = ((float) this.field8662 + var12) * (float) this.field8679.field7066;
        }
        if ((var14 / (float) arg2 >= this.field8679.field6985) || (this.field8679.field7002 >= var13 / (float) arg2)) {
            return;
        }
        class424.field6065 = var5.field3662 * var6.field3685 + var5.field3681 * var6.field3681 + var5.field3656 * var6.field3658;
        class25.field229 = var5.field3662 * var6.field3678 + var5.field3681 * var6.field3684 + var5.field3656 * var6.field3664 + var5.field3684;
        float var15 = (float) this.field8646 * class424.field6065 + class25.field229;
        float var16 = (float) this.field8638 * class424.field6065 + class25.field229;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = (var16 - (float) this.field8662) * (float) this.field8679.field6989;
            var18 = ((float) this.field8662 + var15) * (float) this.field8679.field6989;
        } else {
            var18 = ((float) this.field8662 + var16) * (float) this.field8679.field6989;
            var17 = (var15 - (float) this.field8662) * (float) this.field8679.field6989;
        }
        if ((this.field8679.field7060 <= var17 / (float) arg2) || (var18 / (float) arg2 <= this.field8679.field6997)) {
            return;
        }
        if (arg1 != null || this.field8625 != null) {
            class87.field1117 = var5.field3676 * var6.field3671 + var5.field3669 * var6.field3669 + var5.field3658 * var6.field3656;
            class15.field136 = var5.field3676 * var6.field3672 + var5.field3669 * var6.field3676 + var5.field3658 * var6.field3662;
            class314.field4719 = var5.field3662 * var6.field3672 + var5.field3681 * var6.field3662 + var5.field3656 * var6.field3676;
            class430.field6305 = var5.field3672 * var6.field3672 + var5.field3685 * var6.field3662 + var5.field3671 * var6.field3676;
            class210.field3103 = var5.field3672 * var6.field3671 + var5.field3685 * var6.field3656 + var5.field3671 * var6.field3669;
            class301.field4408 = var5.field3662 * var6.field3671 + var5.field3681 * var6.field3656 + var5.field3656 * var6.field3669;
        }
        if (arg1 != null) {
            int var19 = this.field8628 + this.field8610 >> 1;
            int var20 = this.field8642 + this.field8608 >> 1;
            int var21 = (int) ((float) var20 * class15.field136 + (float) this.field8646 * class73.field859 + (float) var19 * class87.field1117 + class642.field9319);
            int var22 = (int) ((float) var20 * class314.field4719 + (float) this.field8646 * class424.field6065 + (float) var19 * class301.field4408 + class25.field229);
            int var23 = (int) ((float) var20 * class430.field6305 + (float) this.field8646 * class277.field4062 + (float) var19 * class210.field3103 + class538.field7952);
            int var24 = (int) ((float) var20 * class15.field136 + (float) this.field8638 * class73.field859 + (float) var19 * class87.field1117 + class642.field9319);
            int var25 = (int) ((float) var20 * class314.field4719 + (float) this.field8638 * class424.field6065 + (float) var19 * class301.field4408 + class25.field229);
            arg1.field7770 = this.field8679.field6989 * var25 / arg2 + this.field8679.field7026;
            int var26 = (int) ((float) var20 * class430.field6305 + (float) this.field8638 * class277.field4062 + (float) var19 * class210.field3103 + class538.field7952);
            arg1.field7767 = this.field8679.field7066 * var21 / arg2 + this.field8679.field7013;
            arg1.field7769 = this.field8679.field7026 + (this.field8679.field6989 * var22 / arg2);
            arg1.field7768 = this.field8679.field7013 + (this.field8679.field7066 * var24 / arg2);
            if (this.field8679.field7099 > var23 && var26 < this.field8679.field7099) {
                arg1.field7771 = true;
                arg1.field7766 = (this.field8662 + var21) * this.field8679.field7066 / arg2 + (this.field8679.field7013 - arg1.field7767);
            }
        }
        this.field8679.method2792((float) arg2, true);
        this.field8679.method2794(16);
        this.field8679.method2829(var6, 0);
        this.method3405(3);
        this.field8679.method2826(true);
        this.method3414(true);
    }

    @OriginalMember(owner = "client!jv", name = "Q", descriptor = "()I")
    public final int method1981() {
        if (!this.field8598) {
            this.method3404((byte) 64);
        }
        field8621++;
        return this.field8642;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
    private final void method3414(boolean arg0) {
        if (this.field8625 != null) {
            class252 var2 = this.field8679.field6957;
            float var3 = this.field8679.method1041();
            float var4 = this.field8679.method957();
            this.field8679.method2816((byte) 31);
            this.field8679.method992(false);
            this.field8679.method2828(5126, false);
            this.field8679.method2846(this.field8679.field7054, null, this.field8679.field7062, 32888, null);
            for (int var5 = 0; var5 < this.field8669; var5++) {
                class456 var6 = this.field8625[var5];
                class238 var7 = this.field8649[var5];
                if (!var6.field6650 || !this.field8679.method345()) {
                    float var8 = (float) (this.field8675[var6.field6642] + this.field8675[var6.field6646] + this.field8675[var6.field6645]) * 0.3333333F;
                    float var9 = (float) (this.field8609[var6.field6646] + this.field8609[var6.field6645] + this.field8609[var6.field6642]) * 0.3333333F;
                    float var10 = (float) (this.field8633[var6.field6645] + this.field8633[var6.field6642] + this.field8633[var6.field6646]) * 0.3333333F;
                    float var11 = class15.field136 * var10 + class87.field1117 * var8 + class73.field859 * var9 + class642.field9319;
                    float var12 = class314.field4719 * var10 + class424.field6065 * var9 + class301.field4408 * var8 + class25.field229;
                    float var13 = class430.field6305 * var10 + class277.field4062 * var9 + class210.field3103 * var8 + class538.field7952;
                    var2.method1595(-119, -var13, var7.field3479, var6.field6643 * var7.field3478 >> 7, var6.field6641 * var7.field3484 >> 7, (float) var7.field3483 - var12, (float) var7.field3474 + var11);
                    this.field8679.method2845(var2, arg0);
                    this.field8679.method1009(var4, var3 - (float) var6.field6647 * 1.5F);
                    int var14 = var7.field3480;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field8679.method2778(var6.field6644, 0);
                    this.field8679.method2796((byte) -80, var6.field6649);
                    this.field8679.method2791(var6.field6648, (byte) 124);
                    this.field8679.method2834(7, 4, 0, 71);
                }
            }
            this.field8679.method1009(var4, var3);
            this.field8679.method992(true);
            this.field8679.method2826(true);
        }
        if (arg0) {
            field8616++;
        }
    }

    @OriginalMember(owner = "client!jv", name = "MA", descriptor = "()V")
    public final void method1985() {
        field8629++;
        for (int var1 = 0; var1 < this.field8674; var1++) {
            this.field8675[var1] = this.field8675[var1] + 7 >> 4;
            this.field8609[var1] = this.field8609[var1] + 7 >> 4;
            this.field8633[var1] = this.field8633[var1] + 7 >> 4;
        }
        this.field8598 = false;
        if (this.field8577 != null) {
            this.field8577.field1995 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "()[Lmm;")
    public final class26[] method1964() {
        field8682++;
        return this.field8603;
    }

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "(I)V")
    public final void method1980(int arg0) {
        field8658++;
        this.field8614 = (short) arg0;
        if (this.field8580 != null) {
            this.field8580.field1995 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIII)V")
    public final void method1949(int arg0, int arg1, int arg2, int arg3) {
        field8618++;
        for (int var5 = 0; var5 < this.field8615; var5++) {
            int var9 = this.field8591[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field8591[var5] = (short) class313.method1926(var12, class313.method1926(var11 << 7, var10 << 10));
        }
        if (this.field8625 != null) {
            for (int var6 = 0; var6 < this.field8669; var6++) {
                class456 var7 = this.field8625[var6];
                class238 var8 = this.field8649[var6];
                var8.field3480 = var8.field3480 & 0xFF000000 | class620.field9045[this.field8591[var7.field6639] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field8580 != null) {
            this.field8580.field1995 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIISB)I")
    private final int method3415(int arg0, int arg1, int arg2, short arg3, byte arg4) {
        field8620++;
        int var6 = class620.field9045[class114.method691(arg0, arg1, 9511)];
        if (arg3 != -1) {
            class83 var7 = this.field8679.field2262.method1762(arg3 & 0xFFFF, (byte) 45);
            int var8 = var7.field962 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg0 < 0) {
                    var9 = 0;
                } else if (arg0 <= 127) {
                    var9 = arg0 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field960 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = ((var13 & 0x6A00FF00) << 8) - (-(var15 >> 8) - (var14 & 0xFF00));
            }
        }
        return arg2 == -8634 ? (var6 << 8) + (255 - (arg4 & 0xFF)) : 52;
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
    public final void method1972(int arg0) {
        field8588++;
        int var2 = class14.field129[arg0];
        int var3 = class14.field130[arg0];
        for (int var4 = 0; var4 < this.field8579; var4++) {
            int var5 = this.field8675[var4] * var3 + this.field8609[var4] * var2 >> 15;
            this.field8609[var4] = this.field8609[var4] * var3 - (this.field8675[var4] * var2) >> 15;
            this.field8675[var4] = var5;
        }
        this.field8598 = false;
        if (this.field8577 != null) {
            this.field8577.field1995 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lr;IIIZ)V")
    public final void method1952(class520 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8575++;
        class584 var6 = (class584) arg0;
        if (this.field8615 == 0 || var6.field8615 == 0) {
            return;
        }
        int var7 = var6.field8579;
        int[] var8 = var6.field8675;
        int[] var9 = var6.field8609;
        int[] var10 = var6.field8633;
        short[] var11 = var6.field8593;
        short[] var12 = var6.field8653;
        short[] var13 = var6.field8624;
        byte[] var14 = var6.field8590;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field8574 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var18 = this.field8574.field9200;
            var15 = this.field8574.field9199;
            var16 = this.field8574.field9194;
            var17 = this.field8574.field9197;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field8574 == null) {
            var22 = null;
            var20 = null;
            var21 = null;
            var19 = null;
        } else {
            var19 = var6.field8574.field9199;
            var20 = var6.field8574.field9200;
            var21 = var6.field8574.field9194;
            var22 = var6.field8574.field9197;
        }
        int[] var23 = var6.field8685;
        short[] var24 = var6.field8613;
        if (!var6.field8598) {
            var6.method3404((byte) 64);
        }
        short var25 = var6.field8646;
        short var26 = var6.field8638;
        short var27 = var6.field8610;
        short var28 = var6.field8628;
        short var29 = var6.field8642;
        short var30 = var6.field8608;
        for (int var31 = 0; var31 < this.field8579; var31++) {
            int var32 = this.field8609[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field8675[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field8633[var31] - arg3;
                    if (var29 <= var34 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field8685[var31];
                        int var37 = this.field8685[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field8613[var38] - 1;
                            if (var35 == -1 || this.field8590[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = -1;
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var40; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var17 == null) {
                                            this.field8574 = new class628();
                                            var17 = this.field8574.field9197 = class188.method1228(0, this.field8593);
                                            var15 = this.field8574.field9199 = class188.method1228(0, this.field8653);
                                            var16 = this.field8574.field9194 = class188.method1228(0, this.field8624);
                                            var18 = this.field8574.field9200 = class267.method1704(this.field8590, 1282);
                                        }
                                        if (var22 == null) {
                                            class628 var44 = var6.field8574 = new class628();
                                            var22 = var44.field9197 = class188.method1228(0, var11);
                                            var19 = var44.field9199 = class188.method1228(0, var12);
                                            var21 = var44.field9194 = class188.method1228(0, var13);
                                            var20 = var44.field9200 = class267.method1704(var14, 1282);
                                        }
                                        short var45 = this.field8593[var35];
                                        short var46 = this.field8653[var35];
                                        short var47 = this.field8624[var35];
                                        byte var48 = this.field8590[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var22[var52] += var45;
                                                var19[var52] += var46;
                                                var21[var52] += var47;
                                                var20[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field8685[var31 + 1];
                                        byte var54 = var14[var41];
                                        short var55 = var12[var41];
                                        short var56 = var11[var41];
                                        short var57 = var13[var41];
                                        int var58 = this.field8685[var31];
                                        for (int var59 = var58; var59 < var53; var59++) {
                                            int var60 = this.field8613[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var17[var60] += var56;
                                                var15[var60] += var55;
                                                var16[var60] += var57;
                                                var18[var60] += var54;
                                            }
                                        }
                                        if (this.field8645 == null && this.field8580 != null) {
                                            this.field8580.field1995 = null;
                                        }
                                        if (this.field8645 != null) {
                                            this.field8645.field1995 = null;
                                        }
                                        if (var6.field8645 == null && var6.field8580 != null) {
                                            var6.field8580.field1995 = null;
                                        }
                                        if (var6.field8645 != null) {
                                            var6.field8645.field1995 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(Z)V")
    public static void method3416(boolean arg0) {
        if (!arg0) {
            method3408(-64, (byte) 82);
        }
        field8672 = null;
        field8617 = null;
        field8639 = null;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Los;)V")
    public class584(class468 arg0) {
        this.field8679 = arg0;
        this.field8577 = new class156(null, 5126, 3, 0);
        this.field8680 = new class156(null, 5126, 2, 0);
        this.field8645 = new class156(null, 5126, 3, 0);
        this.field8580 = new class156(null, 5121, 4, 0);
        this.field8656 = new class552();
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Los;Lbt;IIII)V")
    public class584(class468 arg0, class114 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8605 = arg5;
        this.field8679 = arg0;
        this.field8589 = arg2;
        if (class474.method2885(120, arg2, arg5)) {
            this.field8577 = new class156(null, 5126, 3, 0);
        }
        if (class371.method2261(arg2, arg5, (byte) -116)) {
            this.field8680 = new class156(null, 5126, 2, 0);
        }
        if (class174.method1172(-128, arg5, arg2)) {
            this.field8645 = new class156(null, 5126, 3, 0);
        }
        if (class309.method1899(arg5, (byte) -93, arg2)) {
            this.field8580 = new class156(null, 5121, 4, 0);
        }
        if (class511.method3051(arg5, 0, arg2)) {
            this.field8656 = new class552();
        }
        class472 var7 = arg0.field2262;
        int[] var8 = new int[arg1.field1477];
        this.field8685 = new int[arg1.field1491 + 1];
        for (int var9 = 0; var9 < arg1.field1477; var9++) {
            if ((arg1.field1457 == null || arg1.field1457[var9] != 2) && (arg1.field1494 == null || arg1.field1494[var9] == -1 || !var7.method1762(arg1.field1494[var9] & 0xFFFF, (byte) 45).field974)) {
                var8[this.field8615++] = var9;
                this.field8685[arg1.field1489[var9]]++;
                this.field8685[arg1.field1464[var9]]++;
                this.field8685[arg1.field1470[var9]]++;
            }
        }
        this.field8623 = this.field8615;
        long[] var10 = new long[this.field8615];
        boolean var11 = (this.field8589 & 0x100) != 0;
        label499: for (int var12 = 0; var12 < this.field8615; var12++) {
            int var180 = var8[var12];
            class83 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field1499 != null) {
                for (int var186 = 0; var186 < arg1.field1499.length; var186++) {
                    class85 var187 = arg1.field1499[var186];
                    if (var187.field987 == var180) {
                        class163 var188 = class157.method906((byte) 58, var187.field986);
                        if (var188.field2172) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field8623--;
                            continue label499;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field1494 != null) {
                var189 = arg1.field1494[var180];
                if (var189 != -1) {
                    var181 = var7.method1762(var189 & 0xFFFF, (byte) 45);
                    var184 = var181.field968;
                    var185 = var181.field973;
                }
            }
            boolean var190 = arg1.field1500 != null && arg1.field1500[var180] != 0 || var181 != null && !var181.field972 | var181.field961;
            if ((var11 || var190) && arg1.field1505 != null) {
                var182 += arg1.field1505[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = ((var189 & 0xFFFF) << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + ((long) var194);
        }
        class405.method2428(var10, (byte) 97, var8);
        this.field8633 = arg1.field1498;
        this.field8609 = arg1.field1496;
        this.field8579 = arg1.field1491;
        this.field8674 = arg1.field1508;
        this.field8673 = arg1.field1458;
        this.field8675 = arg1.field1463;
        class474[] var13 = new class474[this.field8579];
        this.field8686 = arg1.field1475;
        this.field8603 = arg1.field1507;
        if (arg1.field1499 != null) {
            this.field8669 = arg1.field1499.length;
            this.field8625 = new class456[this.field8669];
            this.field8649 = new class238[this.field8669];
            for (int var14 = 0; var14 < this.field8669; var14++) {
                class85 var15 = arg1.field1499[var14];
                class163 var16 = class157.method906((byte) 66, var15.field986);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field8615; var18++) {
                    if (var8[var18] == var15.field987) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class620.field9045[arg1.field1481[var15.field987] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field1500 == null ? 0 : arg1.field1500[var15.field987]) << 24;
                this.field8625[var14] = new class456(var17, arg1.field1489[var15.field987], arg1.field1464[var15.field987], arg1.field1470[var15.field987], var16.field2173, var16.field2177, var16.field2168, var16.field2171, var16.field2167, var16.field2172, var16.field2176, var15.field992);
                this.field8649[var14] = new class238(var20);
            }
        }
        int var21 = this.field8615 * 3;
        this.field8590 = new byte[var21];
        this.field8584 = new float[var21];
        class190.field2892 = new long[var21];
        this.field8678 = new short[this.field8615];
        this.field8604 = new short[this.field8615];
        this.field8630 = new float[var21];
        this.field8607 = new byte[this.field8615];
        this.field8591 = new short[this.field8615];
        this.field8586 = new short[this.field8615];
        this.field8624 = new short[var21];
        this.field8659 = (short) arg4;
        this.field8653 = new short[var21];
        this.field8593 = new short[var21];
        this.field8596 = new short[this.field8615];
        if (arg1.field1482 != null) {
            this.field8578 = new short[this.field8615];
        }
        this.field8614 = (short) arg3;
        this.field8613 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field1491; var23++) {
            int var179 = this.field8685[var23];
            this.field8685[var23] = var22;
            var13[var23] = new class474();
            var22 += var179;
        }
        this.field8685[arg1.field1491] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field1480 != null) {
            int var28 = arg1.field1466;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field8615; var36++) {
                int var43 = var8[var36];
                if (arg1.field1480[var43] != -1) {
                    int var44 = arg1.field1480[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field1489[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field1464[var43];
                        } else {
                            var46 = arg1.field1470[var43];
                        }
                        int var47 = arg1.field1463[var46];
                        int var48 = arg1.field1496[var46];
                        int var49 = arg1.field1498[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field1472[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field1460[var37];
                        var40 = 64.0F / (float) arg1.field1492[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 <= 0) {
                            var41 = 1.0F;
                            var42 = (float) (-var39) / 1024.0F;
                        } else {
                            var42 = 1.0F;
                            var41 = (float) var39 / 1024.0F;
                        }
                    } else if (var38 == 2) {
                        var42 = 64.0F / (float) arg1.field1460[var37];
                        var40 = 64.0F / (float) arg1.field1492[var37];
                        var41 = 64.0F / (float) arg1.field1502[var37];
                    } else {
                        var41 = (float) arg1.field1502[var37] / 1024.0F;
                        var42 = (float) arg1.field1460[var37] / 1024.0F;
                        var40 = (float) arg1.field1492[var37] / 1024.0F;
                    }
                    var27[var37] = class542.method3188(arg1.field1479[var37], class637.method3693(255, arg1.field1485[var37]), var41, var40, arg1.field1488[var37], arg1.field1493[var37], var42, (byte) -73);
                }
            }
        }
        class393[] var50 = new class393[arg1.field1477];
        for (int var51 = 0; var51 < arg1.field1477; var51++) {
            short var158 = arg1.field1489[var51];
            short var159 = arg1.field1464[var51];
            short var160 = arg1.field1470[var51];
            int var161 = this.field8675[var159] - this.field8675[var158];
            int var162 = this.field8609[var159] - this.field8609[var158];
            int var163 = this.field8633[var159] - this.field8633[var158];
            int var164 = this.field8675[var160] - this.field8675[var158];
            int var165 = this.field8609[var160] - this.field8609[var158];
            int var166 = this.field8633[var160] - this.field8633[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169;
            for (var169 = var161 * var165 - (var162 * var164); var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + (var168 * var168 + (var169 * var169))));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field1457 == null ? 0 : arg1.field1457[var51];
            if (var174 == 0) {
                class474 var175 = var13[var158];
                var175.field7246++;
                var175.field7243 += var172;
                var175.field7249 += var171;
                var175.field7248 += var173;
                class474 var176 = var13[var159];
                var176.field7249 += var171;
                var176.field7246++;
                var176.field7248 += var173;
                var176.field7243 += var172;
                class474 var177 = var13[var160];
                var177.field7243 += var172;
                var177.field7249 += var171;
                var177.field7246++;
                var177.field7248 += var173;
            } else if (var174 == 1) {
                class393 var178 = var50[var51] = new class393();
                var178.field5717 = var171;
                var178.field5715 = var173;
                var178.field5718 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field8615; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field1481[var68] & 0xFFFF;
            short var70;
            if (arg1.field1494 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field1494[var68];
            }
            int var71;
            if (arg1.field1480 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field1480[var68];
            }
            int var72;
            if (arg1.field1500 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field1500[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var78 = 0.0F;
                    var80 = 2;
                    var74 = 1.0F;
                    var76 = 1.0F;
                    var75 = 1.0F;
                    var77 = 0.0F;
                    var73 = 0.0F;
                    var79 = 1;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field1472[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field1489[var68];
                        short var84 = arg1.field1464[var68];
                        short var85 = arg1.field1470[var68];
                        short var86 = arg1.field1488[var71];
                        short var87 = arg1.field1479[var71];
                        short var88 = arg1.field1493[var71];
                        float var89 = (float) arg1.field1463[var86];
                        float var90 = (float) arg1.field1496[var86];
                        float var91 = (float) arg1.field1498[var86];
                        float var92 = (float) arg1.field1463[var87] - var89;
                        float var93 = (float) arg1.field1496[var87] - var90;
                        float var94 = (float) arg1.field1498[var87] - var91;
                        float var95 = (float) arg1.field1463[var88] - var89;
                        float var96 = (float) arg1.field1496[var88] - var90;
                        float var97 = (float) arg1.field1498[var88] - var91;
                        float var98 = (float) arg1.field1463[var83] - var89;
                        float var99 = (float) arg1.field1496[var83] - var90;
                        float var100 = (float) arg1.field1498[var83] - var91;
                        float var101 = (float) arg1.field1463[var84] - var89;
                        float var102 = (float) arg1.field1496[var84] - var90;
                        float var103 = (float) arg1.field1498[var84] - var91;
                        float var104 = (float) arg1.field1463[var85] - var89;
                        float var105 = (float) arg1.field1496[var85] - var90;
                        float var106 = (float) arg1.field1498[var85] - var91;
                        float var107 = var93 * var97 - var94 * var96;
                        float var108 = var94 * var95 - (var92 * var97);
                        float var109 = var92 * var96 - var93 * var95;
                        float var110 = var96 * var109 - (var97 * var108);
                        float var111 = var97 * var107 - (var95 * var109);
                        float var112 = var95 * var108 - (var96 * var107);
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        float var114 = var94 * var107 - (var92 * var109);
                        float var115 = var92 * var108 - (var93 * var107);
                        float var116 = var93 * var109 - (var94 * var108);
                        float var117 = 1.0F / (var97 * var115 + var95 * var116 + var96 * var114);
                        var74 = (var100 * var115 + var98 * var116 + var99 * var114) * var117;
                        var78 = (var106 * var115 + var104 * var116 + var105 * var114) * var117;
                        var76 = (var103 * var115 + var101 * var116 + var102 * var114) * var117;
                    } else {
                        short var118 = arg1.field1489[var68];
                        short var119 = arg1.field1464[var68];
                        short var120 = arg1.field1470[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field1469[var71];
                        float var126 = (float) arg1.field1471[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field1502[var71] / 1024.0F;
                            class347.method2129(var125, -15927, arg1.field1498[var118], var124, var126, var127, arg1.field1496[var118], arg1.field1463[var118], var121, var122, var123);
                            var73 = class463.field6698;
                            var74 = class251.field3648;
                            class347.method2129(var125, -15927, arg1.field1498[var119], var124, var126, var127, arg1.field1496[var119], arg1.field1463[var119], var121, var122, var123);
                            var76 = class251.field3648;
                            var75 = class463.field6698;
                            class347.method2129(var125, -15927, arg1.field1498[var120], var124, var126, var127, arg1.field1496[var120], arg1.field1463[var120], var121, var122, var123);
                            var78 = class251.field3648;
                            var77 = class463.field6698;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > var128) {
                                    var75 -= var127;
                                    var79 = 1;
                                } else if (var73 - var75 > var128) {
                                    var75 += var127;
                                    var79 = 2;
                                }
                                if (var128 < var77 - var73) {
                                    var80 = 1;
                                    var77 -= var127;
                                } else if (var128 < var73 - var77) {
                                    var77 += var127;
                                    var80 = 2;
                                }
                            } else {
                                if ((var128 < var78 - var74)) {
                                    var80 = 1;
                                    var78 -= var127;
                                } else if (var128 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var127;
                                }
                                if (var76 - var74 > var128) {
                                    var76 -= var127;
                                    var79 = 1;
                                } else if (var128 < var74 - var76) {
                                    var76 += var127;
                                    var79 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field1486[var71] / 256.0F;
                            float var130 = (float) arg1.field1504[var71] / 256.0F;
                            int var131 = arg1.field1463[var119] - arg1.field1463[var118];
                            int var132 = arg1.field1496[var119] - arg1.field1496[var118];
                            int var133 = arg1.field1498[var119] - arg1.field1498[var118];
                            int var134 = arg1.field1463[var120] - arg1.field1463[var118];
                            int var135 = arg1.field1496[var120] - arg1.field1496[var118];
                            int var136 = arg1.field1498[var120] - arg1.field1498[var118];
                            int var137 = var132 * var136 - (var133 * var135);
                            int var138 = var133 * var134 - (var131 * var136);
                            int var139 = var131 * var135 - (var132 * var134);
                            float var140 = 64.0F / (float) arg1.field1460[var71];
                            float var141 = 64.0F / (float) arg1.field1492[var71];
                            float var142 = 64.0F / (float) arg1.field1502[var71];
                            float var143 = (var124[2] * (float) var139 + var124[1] * (float) var138 + var124[0] * (float) var137) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[3] * (float) var137 + var124[4] * (float) var138) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[7] * (float) var138 + var124[6] * (float) var137) / var142;
                            var81 = class451.method2721(var145, var144, var143, -85);
                            class11.method58(var124, var122, arg1.field1496[var118], arg1.field1463[var118], var81, var121, var129, var130, var123, arg1.field1498[var118], -23546, var125, var126);
                            var74 = class125.field1648;
                            var73 = class144.field1870;
                            class11.method58(var124, var122, arg1.field1496[var119], arg1.field1463[var119], var81, var121, var129, var130, var123, arg1.field1498[var119], -23546, var125, var126);
                            var75 = class144.field1870;
                            var76 = class125.field1648;
                            class11.method58(var124, var122, arg1.field1496[var120], arg1.field1463[var120], var81, var121, var129, var130, var123, arg1.field1498[var120], -23546, var125, var126);
                            var77 = class144.field1870;
                            var78 = class125.field1648;
                        } else if (var82 == 3) {
                            class260.method1642(var123, 30380, var125, var122, arg1.field1496[var118], var124, var121, var126, arg1.field1463[var118], arg1.field1498[var118]);
                            var74 = class125.field1645;
                            var73 = class281.field4178;
                            class260.method1642(var123, 30380, var125, var122, arg1.field1496[var119], var124, var121, var126, arg1.field1463[var119], arg1.field1498[var119]);
                            var75 = class281.field4178;
                            var76 = class125.field1645;
                            class260.method1642(var123, 30380, var125, var122, arg1.field1496[var120], var124, var121, var126, arg1.field1463[var120], arg1.field1498[var120]);
                            var78 = class125.field1645;
                            var77 = class281.field4178;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if (var77 - var73 > 0.5F) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                            } else {
                                if (var76 - var74 > 0.5F) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field1457 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field1457[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var152 = arg1.field1489[var68];
                short var153 = arg1.field1464[var68];
                short var154 = arg1.field1470[var68];
                class474 var155 = var13[var152];
                this.field8678[var52] = this.method3413(var73, var155.field7248, var155.field7246, arg1, var150, var155.field7243, var155.field7249, (byte) -72, var74, var152);
                class474 var156 = var13[var153];
                this.field8604[var52] = this.method3413(var75, var156.field7248, var156.field7246, arg1, (long) var79 + var150, var156.field7243, var156.field7249, (byte) -95, var76, var153);
                class474 var157 = var13[var154];
                this.field8586[var52] = this.method3413(var77, var157.field7248, var157.field7246, arg1, (long) var80 + var150, var157.field7243, var157.field7249, (byte) -94, var78, var154);
            } else if (var146 == 1) {
                class393 var147 = var50[var68];
                long var148 = ((long) (var81 << 24) + ((long) (var69 << 8)) + (long) var72 << 32) + (long) ((var147.field5717 + 256 << 12) + (var147.field5718 + 256 << 22) + ((var71 << 2) - -(var147.field5715 <= 0 ? 2048 : 1024)));
                this.field8678[var52] = this.method3413(var73, var147.field5715, 0, arg1, var148, var147.field5718, var147.field5717, (byte) 97, var74, arg1.field1489[var68]);
                this.field8604[var52] = this.method3413(var75, var147.field5715, 0, arg1, (long) var79 + var148, var147.field5718, var147.field5717, (byte) -116, var76, arg1.field1464[var68]);
                this.field8586[var52] = this.method3413(var77, var147.field5715, 0, arg1, (long) var80 + var148, var147.field5718, var147.field5717, (byte) 80, var78, arg1.field1470[var68]);
            }
            if (arg1.field1494 == null) {
                this.field8596[var52] = -1;
            } else {
                this.field8596[var52] = arg1.field1494[var68];
            }
            if (arg1.field1500 != null) {
                this.field8607[var52] = arg1.field1500[var68];
            }
            if (arg1.field1482 != null) {
                this.field8578[var52] = arg1.field1482[var68];
            }
            this.field8591[var52] = arg1.field1481[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field8623; var55++) {
            short var67 = this.field8596[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field8581 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field8623; var58++) {
            short var66 = this.field8596[var58];
            if (var56 != var66) {
                var56 = var66;
                this.field8581[var57++] = var58;
            }
        }
        this.field8581[var57] = this.field8623;
        class190.field2892 = null;
        this.field8593 = class213.method1375((byte) 56, this.field8572, this.field8593);
        this.field8653 = class213.method1375((byte) -85, this.field8572, this.field8653);
        this.field8624 = class213.method1375((byte) -103, this.field8572, this.field8624);
        this.field8590 = class35.method180(this.field8572, 19101, this.field8590);
        this.field8584 = class63.method395(-16777216, this.field8572, this.field8584);
        this.field8630 = class63.method395(-16777216, this.field8572, this.field8630);
        if (arg1.field1484 != null && class533.method3134(this.field8605, arg2, false)) {
            this.field8583 = arg1.method704(1, false);
        }
        if (arg1.field1499 != null && class234.method1521(arg2, 0, this.field8605)) {
            this.field8652 = arg1.method692((byte) -2);
        }
        if (arg1.field1465 != null && class301.method1863(false, this.field8605, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field8615; var61++) {
                int var65 = arg1.field1465[var8[var61]];
                if (var65 >= 0) {
                    if (var59 < var65) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field8654 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field8654[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field8615; var63++) {
                int var64 = arg1.field1465[var8[var63]];
                if (var64 >= 0) {
                    this.field8654[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
