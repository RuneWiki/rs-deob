import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class557 extends class487 {

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "[I")
    public static int[] field7596 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "[I")
    public static int[] field7599 = new int[8];

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "F")
    public float field7587;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "F")
    public float field7588;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "F")
    public float field7589;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "F")
    public float field7590;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "F")
    public float field7591;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "F")
    public float field7592;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "F")
    public float field7594;

    @OriginalMember(owner = "client!lu", name = "F", descriptor = "F")
    public float field7610;

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "F")
    public float field7611;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "F")
    public float field7612;

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "F")
    public float field7613;

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "F")
    public float field7614;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!lu", name = "B", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!lu", name = "D", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!lu", name = "E", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!lu", name = "ZA", descriptor = "(I)V", line = 6)
    public final void method349(int arg0) {
        field7601++;
        float var2 = class55.field716[arg0 & 0x3FFF];
        float var3 = class55.field724[arg0 & 0x3FFF];
        float var4 = this.field7594;
        float var5 = this.field7587;
        float var6 = this.field7590;
        this.field7594 = this.field7613 * var3 + var2 * var4;
        float var7 = this.field7612;
        this.field7613 = this.field7613 * var2 - var3 * var4;
        this.field7587 = this.field7591 * var3 + var2 * var5;
        this.field7590 = this.field7610 * var3 + var2 * var6;
        this.field7591 = this.field7591 * var2 - var3 * var5;
        this.field7612 = this.field7611 * var3 + var2 * var7;
        this.field7610 = this.field7610 * var2 - var3 * var6;
        this.field7611 = this.field7611 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!lu", name = "YA", descriptor = "([I)V", line = 34)
    public final void method365(int[] arg0) {
        field7609++;
        float var2 = (float) arg0[0] - this.field7612;
        float var3 = (float) arg0[1] - this.field7592;
        float var4 = (float) arg0[2] - this.field7611;
        arg0[2] = (int) (this.field7610 * var4 + this.field7614 * var3 + this.field7590 * var2);
        arg0[0] = (int) (this.field7613 * var4 + this.field7594 * var2 + this.field7589 * var3);
        arg0[1] = (int) (this.field7591 * var4 + this.field7588 * var3 + this.field7587 * var2);
    }

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "(I)V", line = 56)
    public final void method364(int arg0) {
        field7593++;
        float var2 = class55.field716[arg0 & 0x3FFF];
        float var3 = class55.field724[arg0 & 0x3FFF];
        float var4 = this.field7589;
        float var5 = this.field7588;
        float var6 = this.field7614;
        float var7 = this.field7592;
        this.field7589 = var2 * var4 - this.field7613 * var3;
        this.field7588 = var2 * var5 - this.field7591 * var3;
        this.field7613 = this.field7613 * var2 + var3 * var4;
        this.field7591 = this.field7591 * var2 + var3 * var5;
        this.field7614 = var2 * var6 - (this.field7610 * var3);
        this.field7592 = var2 * var7 - this.field7611 * var3;
        this.field7610 = this.field7610 * var2 + var3 * var6;
        this.field7611 = this.field7611 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!lu", name = "Y", descriptor = "()V", line = 88)
    public final void method352() {
        this.field7589 = this.field7613 = this.field7587 = this.field7591 = this.field7590 = this.field7614 = this.field7612 = this.field7592 = this.field7611 = 0.0F;
        field7604++;
        this.field7594 = this.field7588 = this.field7610 = 1.0F;
    }

    @OriginalMember(owner = "client!lu", name = "wa", descriptor = "(III[I)V", line = 109)
    public final void method358(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field7610 + (float) arg0 * this.field7613 + (float) arg1 * this.field7591);
        arg3[0] = (int) ((float) arg2 * this.field7590 + (float) arg0 * this.field7594 + (float) arg1 * this.field7587);
        field7608++;
        arg3[1] = (int) ((float) arg2 * this.field7614 + (float) arg0 * this.field7589 + (float) arg1 * this.field7588);
    }

    @OriginalMember(owner = "client!lu", name = "AA", descriptor = "(I)V", line = 123)
    public final void method348(int arg0) {
        field7595++;
        float var2 = class55.field716[arg0 & 0x3FFF];
        float var3 = class55.field724[arg0 & 0x3FFF];
        float var4 = this.field7594;
        float var5 = this.field7587;
        float var6 = this.field7590;
        this.field7594 = var2 * var4 - (this.field7589 * var3);
        float var7 = this.field7612;
        this.field7589 = this.field7589 * var2 + var3 * var4;
        this.field7587 = var2 * var5 - (this.field7588 * var3);
        this.field7588 = this.field7588 * var2 + var3 * var5;
        this.field7590 = var2 * var6 - (this.field7614 * var3);
        this.field7612 = var2 * var7 - this.field7592 * var3;
        this.field7614 = this.field7614 * var2 + var3 * var6;
        this.field7592 = this.field7592 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "(I)V", line = 154)
    public final void method354(int arg0) {
        field7600++;
        this.field7610 = 1.0F;
        this.field7594 = this.field7588 = class55.field716[arg0 & 0x3FFF];
        this.field7589 = class55.field724[arg0 & 0x3FFF];
        this.field7587 = -this.field7589;
        this.field7590 = this.field7612 = this.field7614 = this.field7592 = this.field7613 = this.field7591 = this.field7611 = 0.0F;
    }

    @OriginalMember(owner = "client!lu", name = "oa", descriptor = "(I)V", line = 175)
    public final void method361(int arg0) {
        this.field7594 = 1.0F;
        field7607++;
        this.field7588 = this.field7610 = class55.field716[arg0 & 0x3FFF];
        this.field7591 = class55.field724[arg0 & 0x3FFF];
        this.field7587 = this.field7590 = this.field7612 = this.field7589 = this.field7592 = this.field7613 = this.field7611 = 0.0F;
        this.field7614 = -this.field7591;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)V", line = 187)
    public static final void method3097(int arg0, int arg1, int arg2) {
        field7584++;
        if (arg0 != 2) {
            method3099(null, null, (byte) -94, -73);
        }
        class59.field746 = arg2 - class672.field9567;
        class68.field827 = arg1 - class672.field9587;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "()Lq;", line = 201)
    public final class487 method345() {
        field7606++;
        class557 var1 = new class557();
        var1.field7612 = this.field7612;
        var1.field7610 = this.field7610;
        var1.field7591 = this.field7591;
        var1.field7594 = this.field7594;
        var1.field7589 = this.field7589;
        var1.field7592 = this.field7592;
        var1.field7611 = this.field7611;
        var1.field7614 = this.field7614;
        var1.field7613 = this.field7613;
        var1.field7587 = this.field7587;
        var1.field7590 = this.field7590;
        var1.field7588 = this.field7588;
        return var1;
    }

    @OriginalMember(owner = "client!lu", name = "U", descriptor = "(III)V", line = 228)
    public final void method356(int arg0, int arg1, int arg2) {
        field7586++;
        this.field7592 += arg1;
        this.field7612 += arg0;
        this.field7611 += arg2;
    }

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "(I)V", line = 239)
    public final void method357(int arg0) {
        field7585++;
        this.field7588 = 1.0F;
        this.field7594 = this.field7610 = class55.field716[arg0 & 0x3FFF];
        this.field7590 = class55.field724[arg0 & 0x3FFF];
        this.field7587 = this.field7612 = this.field7589 = this.field7614 = this.field7592 = this.field7591 = this.field7611 = 0.0F;
        this.field7613 = -this.field7590;
    }

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "(Lq;)V", line = 251)
    public final void method344(class487 arg0) {
        field7603++;
        class557 var2 = (class557) arg0;
        this.field7614 = var2.field7614;
        this.field7610 = var2.field7610;
        this.field7590 = var2.field7590;
        this.field7589 = var2.field7589;
        this.field7591 = var2.field7591;
        this.field7611 = var2.field7611;
        this.field7588 = var2.field7588;
        this.field7592 = var2.field7592;
        this.field7587 = var2.field7587;
        this.field7613 = var2.field7613;
        this.field7594 = var2.field7594;
        this.field7612 = var2.field7612;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "([II)Ljava/lang/String;", line = 274)
    public static final String method3098(int[] arg0, int arg1) {
        field7583++;
        if (arg1 != 584) {
            return null;
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class571.field7767;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class53 var5 = class258.field3383.method2769(arg0[var4], true);
            if (var5.field674 != -1) {
                class532 var6 = (class532) class704.field9925.method2176(-125, (long) var5.field674);
                if (var6 == null) {
                    class92 var7 = class92.method506(class390.field5228, var5.field674, 0);
                    if (var7 != null) {
                        var6 = class146.field1963.method1139(var7, true);
                        class704.field9925.method2174(var6, (long) var5.field674, (byte) -15);
                    }
                }
                if (var6 != null) {
                    class196.field2683[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!lu", name = "NA", descriptor = "(III)V", line = 328)
    public final void method359(int arg0, int arg1, int arg2) {
        this.field7611 = arg2;
        this.field7594 = this.field7588 = this.field7610 = 1.0F;
        this.field7592 = arg1;
        this.field7589 = this.field7613 = this.field7587 = this.field7591 = this.field7590 = this.field7614 = 0.0F;
        field7597++;
        this.field7612 = arg0;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(III[I)V", line = 340)
    public final void method363(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field7614 + (float) arg0 * this.field7589 + (float) arg1 * this.field7588 + this.field7592);
        field7598++;
        arg3[0] = (int) ((float) arg2 * this.field7590 + (float) arg0 * this.field7594 + (float) arg1 * this.field7587 + this.field7612);
        arg3[2] = (int) ((float) arg2 * this.field7610 + (float) arg0 * this.field7613 + (float) arg1 * this.field7591 + this.field7611);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lr;Lci;BI)V", line = 357)
    public static final void method3099(class562 arg0, class152 arg1, byte arg2, int arg3) {
        field7605++;
        if (class423.field5553 != null && arg3 <= arg1.field2075) {
            for (int var4 = 0; var4 < class423.field5553.length; var4++) {
                if (class423.field5553[var4] != -1000000 && (arg1.field2084[0] <= class423.field5553[var4] || arg1.field2084[1] <= class423.field5553[var4] || arg1.field2084[2] <= class423.field5553[var4] || arg1.field2084[3] <= class423.field5553[var4]) && (class428.field5765[var4] >= arg1.field2078[0] || class428.field5765[var4] >= arg1.field2078[1] || class428.field5765[var4] >= arg1.field2078[2] || class428.field5765[var4] >= arg1.field2078[3]) && (arg1.field2078[0] >= class252.field3305[var4] || class252.field3305[var4] <= arg1.field2078[1] || class252.field3305[var4] <= arg1.field2078[2] || arg1.field2078[3] >= class252.field3305[var4]) && (class480.field6685[var4] >= arg1.field2085[0] || arg1.field2085[1] <= class480.field6685[var4] || arg1.field2085[2] <= class480.field6685[var4] || arg1.field2085[3] <= class480.field6685[var4]) && (class626.field8673[var4] <= arg1.field2085[0] || class626.field8673[var4] <= arg1.field2085[1] || arg1.field2085[2] >= class626.field8673[var4] || class626.field8673[var4] <= arg1.field2085[3])) {
                    return;
                }
            }
        }
        if (arg1.field2083 == 1) {
            int var5 = class312.field4204 + arg1.field2080 - class501.field6888;
            if (var5 >= 0 && (class312.field4204 + class312.field4204) >= var5) {
                int var6 = class312.field4204 + arg1.field2077 - class377.field4997;
                if (var6 < 0) {
                    var6 = 0;
                } else if ((class312.field4204 + class312.field4204) < var6) {
                    return;
                }
                int var7 = class312.field4204 + arg1.field2082 - class377.field4997;
                if (var7 > (class312.field4204 + class312.field4204)) {
                    var7 = class312.field4204 + class312.field4204;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class165.field2371[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class614.field8512 - arg1.field2078[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class505.field6967) && class527.method2980(0, arg1, true) && class527.method2980(1, arg1, true) && class527.method2980(2, arg1, true) && class527.method2980(3, arg1, true)) {
                        class50.field584[class91.field1111++] = arg1;
                    }
                }
            }
            return;
        }
        if (arg2 > -72) {
            field7599 = null;
        }
        if (arg1.field2083 == 2) {
            int var10 = class312.field4204 + arg1.field2077 - class377.field4997;
            if (var10 >= 0 && var10 <= class312.field4204 + class312.field4204) {
                int var11 = arg1.field2080 + class312.field4204 - class501.field6888;
                if (var11 < 0) {
                    var11 = 0;
                } else if (class312.field4204 + class312.field4204 < var11) {
                    return;
                }
                int var12 = class312.field4204 + arg1.field2076 - class501.field6888;
                if ((class312.field4204 + class312.field4204) < var12) {
                    var12 = class312.field4204 + class312.field4204;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var11 <= var12) {
                    if (class165.field2371[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class505.field6960 - arg1.field2085[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!((float) class505.field6967 > var14) && class527.method2980(0, arg1, true) && class527.method2980(1, arg1, true) && class527.method2980(2, arg1, true) && class527.method2980(3, arg1, true)) {
                        class50.field584[class91.field1111++] = arg1;
                    }
                }
            }
        } else if (arg1.field2083 == 16 || arg1.field2083 == 8) {
            int var23 = arg1.field2080 + class312.field4204 - class501.field6888;
            if (var23 >= 0 && class312.field4204 + class312.field4204 >= var23) {
                int var24 = class312.field4204 + arg1.field2077 - class377.field4997;
                if (var24 >= 0 && var24 <= (class312.field4204 + class312.field4204) && class165.field2371[var23][var24]) {
                    float var25 = (float) (class614.field8512 - arg1.field2078[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class505.field6960 - arg1.field2085[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!((float) class505.field6967 > var25) || !(var26 < (float) class505.field6967) && class527.method2980(0, arg1, true) && class527.method2980(1, arg1, true) && class527.method2980(2, arg1, true) && class527.method2980(3, arg1, true)) {
                        class50.field584[class91.field1111++] = arg1;
                    }
                }
            }
        } else if (arg1.field2083 == 4) {
            float var15 = (float) (arg1.field2084[0] - class457.field6008);
            if (!(var15 <= (float) class695.field9812)) {
                int var16 = class312.field4204 + arg1.field2077 - class377.field4997;
                if (var16 < 0) {
                    var16 = 0;
                } else if ((class312.field4204 + class312.field4204) < var16) {
                    return;
                }
                int var17 = arg1.field2082 + class312.field4204 - class377.field4997;
                if (class312.field4204 + class312.field4204 < var17) {
                    var17 = class312.field4204 + class312.field4204;
                } else if (var17 < 0) {
                    return;
                }
                int var18 = arg1.field2080 - (class501.field6888 - class312.field4204);
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > (class312.field4204 + class312.field4204)) {
                    return;
                }
                int var19 = arg1.field2076 + class312.field4204 - class501.field6888;
                if (class312.field4204 + class312.field4204 < var19) {
                    var19 = class312.field4204 + class312.field4204;
                } else if (var19 < 0) {
                    return;
                }
                boolean var20 = false;
                label294: for (int var21 = var18; var21 <= var19; var21++) {
                    for (int var22 = var16; var22 <= var17; var22++) {
                        if (class165.field2371[var21][var22]) {
                            var20 = true;
                            break label294;
                        }
                    }
                }
                if (var20 && class527.method2980(0, arg1, true) && class527.method2980(1, arg1, true) && class527.method2980(2, arg1, true) && class527.method2980(3, arg1, true)) {
                    class50.field584[class91.field1111++] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "na", descriptor = "(IIIIII)V", line = 686)
    public final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7602++;
        float var7 = class55.field716[arg3 & 0x3FFF];
        float var8 = class55.field724[arg3 & 0x3FFF];
        float var9 = class55.field716[arg4 & 0x3FFF];
        float var10 = class55.field724[arg4 & 0x3FFF];
        float var11 = class55.field716[arg5 & 0x3FFF];
        float var12 = class55.field724[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field7590 = -var10 * var11 + var9 * var14;
        this.field7613 = var7 * var10;
        this.field7591 = -var8;
        this.field7614 = var9 * var13 + var10 * var12;
        this.field7594 = var9 * var11 + var10 * var14;
        this.field7588 = var7 * var11;
        this.field7587 = var7 * var12;
        this.field7610 = var7 * var9;
        this.field7589 = -var9 * var12 + var10 * var13;
        this.field7611 = (float) (-arg0) * this.field7613 - (float) arg1 * this.field7591 - (float) arg2 * this.field7610;
        this.field7612 = (float) (-arg0) * this.field7594 - (float) arg1 * this.field7587 - ((float) arg2 * this.field7590);
        this.field7592 = (float) (-arg0) * this.field7589 - (float) arg1 * this.field7588 - ((float) arg2 * this.field7614);
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V", line = 722)
    public static void method3100(byte arg0) {
        field7599 = null;
        field7596 = null;
        int var1 = 77 % ((arg0 - 13) / 41);
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V", line = 735)
    public class557() {
        this.method352();
    }
}
