import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class105 extends class772 {

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    private int field1416 = 0;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    private int field1423 = 0;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    private int field1412 = 0;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "Z")
    private boolean field1426 = false;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    private int field1438 = 0;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    private int field1424;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "Lgd;")
    private class696 field1435;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Lw;")
    private class471 field1414;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Z")
    private boolean field1420;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Z")
    private boolean field1431;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "Z")
    private boolean field1425;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "Z")
    private boolean field1430;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()I", line = 5)
    public final int method612() {
        field1437++;
        return this.field1436;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII[III)V", line = 14)
    private final void method613(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field1414.method1124(true, arg4, arg0, arg3, arg1, arg2, arg5, arg6);
        field1434++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFIIII)V", line = 24)
    public final void method614(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field1433++;
        class588 var11 = this.field1435.method3783(120);
        class588 var12 = this.field1435.method3763(1);
        this.field1414.method774((byte) -104, this.field1420 || this.field1431 || (arg9 & 0x1) == 0 ? class166.field2196 : class212.field2911);
        this.field1435.method3746(false);
        this.field1435.method3756(10, this.field1414);
        this.field1435.method3750(false, arg8);
        this.field1435.method3740(arg6, 125);
        this.field1435.method3736(class324.field4001, 1, (byte) -88);
        this.field1435.method3718(1, class324.field4001, 1);
        this.field1435.method3771(arg7, -9445);
        if (this.field1426) {
            float var13 = (float) this.method623();
            float var14 = (float) this.method628();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field1412 * var17;
            float var20 = (float) this.field1412 * var18;
            float var21 = (float) this.field1423 * var15;
            float var22 = (float) this.field1423 * var16;
            float var23 = (float) this.field1416 * -var15;
            float var24 = (float) this.field1416 * -var16;
            float var25 = (float) this.field1438 * -var17;
            arg3 = arg3 + var24 + var20;
            arg4 = arg4 + var21 + var25;
            arg2 = arg2 + var23 + var19;
            arg1 = arg1 + var22 + var20;
            arg0 = arg0 + var21 + var19;
            float var26 = (float) this.field1438 * -var18;
            arg5 = arg5 + var22 + var26;
        }
        var11.method3157(125, arg4 - arg0, -arg1 + arg5, arg3 - arg1, 0.0F, arg2 - arg0, 0.0F, 0.0F, 0.0F, 1.0F);
        var11.method3164(0.0F, arg0, arg1, 1);
        var12.method3158(11663, this.field1414.method1129(-128, (float) this.field1436), 1.0F, this.field1414.method1125(true, (float) this.field1424));
        this.field1435.method3744(55, class627.field7959);
        this.field1435.method3761(0);
        this.field1435.method3731((byte) 108);
        this.field1435.method3754(false);
        this.field1435.method3736(class13.field134, 1, (byte) -88);
        this.field1435.method3718(1, class13.field134, 1);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([I)V", line = 93)
    public final void method615(int[] arg0) {
        arg0[3] = this.field1438;
        arg0[2] = this.field1416;
        arg0[1] = this.field1412;
        field1413++;
        arg0[0] = this.field1423;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V", line = 104)
    public final void method616(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1421++;
        class588 var6 = this.field1435.method3783(117);
        class588 var7 = this.field1435.method3763(1);
        int var8 = this.field1412 + arg1;
        int var9 = this.field1423 + arg0;
        this.field1414.method774((byte) -115, class166.field2196);
        this.field1435.method3746(false);
        this.field1435.method3756(10, this.field1414);
        this.field1435.method3750(false, arg4);
        this.field1435.method3740(arg2, 82);
        this.field1435.method3736(class324.field4001, 1, (byte) -88);
        this.field1435.method3718(1, class324.field4001, 1);
        this.field1435.method3771(arg3, -9445);
        var6.method3158(11663, (float) this.field1436, 0.0F, (float) this.field1424);
        var6.method450(var9, var8, 0);
        var7.method3158(11663, this.field1414.method1129(-127, (float) this.field1436), 1.0F, this.field1414.method1125(true, (float) this.field1424));
        this.field1435.method3744(77, class627.field7959);
        this.field1435.method3761(0);
        this.field1435.method3731((byte) 103);
        this.field1435.method3754(false);
        this.field1435.method3736(class13.field134, 1, (byte) -88);
        this.field1435.method3718(1, class13.field134, 1);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 134)
    public final void method617(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class596 arg7, int arg8, int arg9) {
        field1410++;
        class588 var11 = this.field1435.method3783(87);
        class588 var12 = this.field1435.method3763(1);
        class218 var13 = (class218) arg7;
        class471 var14 = var13.field2968;
        this.field1414.method774((byte) 88, this.field1420 || this.field1431 || (arg6 & 0x1) == 0 ? class166.field2196 : class212.field2911);
        this.field1435.method3746(false);
        this.field1435.method3756(10, this.field1414);
        this.field1435.method3750(false, 1);
        this.field1435.method3740(1, 78);
        if (this.field1426) {
            float var15 = (float) this.field1424 / (float) this.method623();
            float var16 = (float) this.field1436 / (float) this.method628();
            var11.method3157(127, (arg4 - arg0) * var16, (arg5 - arg1) * var16, (arg3 - arg1) * var15, 0.0F, (arg2 - arg0) * var15, 0.0F, 0.0F, 0.0F, 1.0F);
            var11.method3164(0.0F, ((float) this.field1423 + arg0) * var15, ((float) this.field1412 + arg1) * var16, 1);
        } else {
            var11.method3157(127, arg4 - arg0, arg5 - arg1, arg3 - arg1, 0.0F, arg2 - arg0, 0.0F, 0.0F, 0.0F, 1.0F);
            var11.method3164(0.0F, arg0, arg1, 1);
        }
        var12.method3158(11663, this.field1414.method1129(-119, (float) this.field1436), 1.0F, this.field1414.method1125(true, (float) this.field1424));
        this.field1435.method3744(66, class627.field7959);
        this.field1435.method3712(-14720, 1);
        this.field1435.method3756(10, var14);
        this.field1435.method3759(false, class174.field2285, class137.field1820);
        this.field1435.method3736(class13.field134, 0, (byte) -88);
        class588 var17 = this.field1435.method3763(1);
        var17.method468(var11);
        var17.method450(-arg8, -arg9, 0);
        var17.method3161(var14.method1125(true, 1.0F), 1.0F, var14.method1129(-117, 1.0F), -7272);
        this.field1435.method3744(120, class627.field7959);
        this.field1435.method3761(0);
        this.field1435.method3731((byte) 124);
        this.field1435.method3754(false);
        this.field1435.method3736(class171.field2262, 0, (byte) -88);
        this.field1435.method3759(false, class137.field1820, class137.field1820);
        this.field1435.method3756(10, null);
        this.field1435.method3712(-14720, 0);
        this.field1435.method3754(false);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIII)V", line = 190)
    public final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1419++;
        class588 var9 = this.field1435.method3783(84);
        class588 var10 = this.field1435.method3763(1);
        this.field1414.method774((byte) -127, this.field1420 || this.field1431 || (arg7 & 0x1) == 0 ? class166.field2196 : class212.field2911);
        this.field1435.method3746(false);
        this.field1435.method3756(10, this.field1414);
        this.field1435.method3750(false, arg6);
        this.field1435.method3740(arg4, 66);
        this.field1435.method3736(class324.field4001, 1, (byte) -88);
        this.field1435.method3718(1, class324.field4001, 1);
        this.field1435.method3771(arg5, -9445);
        var10.method3158(11663, this.field1414.method1129(-121, (float) this.field1436), 1.0F, this.field1414.method1125(true, (float) this.field1424));
        if (this.field1426) {
            arg2 = this.field1424 * arg2 / this.method623();
            arg3 = this.field1436 * arg3 / this.method628();
            arg1 += this.field1412 * arg3 / this.field1436;
            arg0 += this.field1423 * arg2 / this.field1424;
        }
        var9.method3158(11663, (float) arg3, 0.0F, (float) arg2);
        var9.method450(arg0, arg1, 0);
        this.field1435.method3744(115, class627.field7959);
        this.field1435.method3761(0);
        this.field1435.method3731((byte) 124);
        this.field1435.method3754(false);
        this.field1435.method3736(class13.field134, 1, (byte) -88);
        this.field1435.method3718(1, class13.field134, 1);
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lgd;IIZ)V", line = 810)
    public class105(class696 arg0, int arg1, int arg2, boolean arg3) {
        this.field1424 = arg1;
        this.field1436 = arg2;
        this.field1435 = arg0;
        this.field1414 = arg0.method1203(arg1, class73.field990, 1, arg2, arg3 ? class417.field5505 : class276.field3599);
        this.field1414.method1131(true, true, 107);
        this.field1420 = arg1 != this.field1414.method1127(-49);
        this.field1431 = arg2 != this.field1414.method1133(28215);
        this.field1425 = !this.field1420 && this.field1414.method1132(30365);
        this.field1430 = !this.field1431 && this.field1414.method1132(30365);
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lgd;II[III)V", line = 825)
    public class105(class696 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1435 = arg0;
        this.field1424 = arg1;
        this.field1436 = arg2;
        this.field1414 = arg0.method1207(false, arg4, arg1, (byte) -19, arg3, arg2, arg5);
        this.field1414.method1131(true, true, 119);
        this.field1420 = this.field1414.method1127(70) != arg1;
        this.field1431 = arg2 != this.field1414.method1133(28215);
        this.field1425 = !this.field1420 && this.field1414.method1132(30365);
        this.field1430 = !this.field1431 && this.field1414.method1132(30365);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILha;Luaa;I)V", line = 233)
    public static final void method619(int arg0, int arg1, class570 arg2, class391 arg3, int arg4) {
        field1427++;
        byte var5 = 63;
        byte var6 = 7;
        int var7 = 63;
        if (arg0 >= -99) {
            return;
        }
        while (var7 >= 0) {
            int var8 = var7 & 0x3F << 10 | var6 << 7 & 0x380 | var5 & 0x7F;
            class385.method2206(1708, true, false);
            int var9 = class594.field7542[var8];
            class497.method2760(true, true, false);
            arg2.method921(arg1, arg4 + ((63 - var7) * arg3.field5031 >> 6), arg3.field5117, (arg3.field5031 >> 6) + 1, var9, 0);
            var7--;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()I", line = 262)
    public final int method620() {
        field1428++;
        return this.field1424;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILaa;II)V", line = 271)
    public final void method621(int arg0, int arg1, class596 arg2, int arg3, int arg4) {
        field1417++;
        class218 var6 = (class218) arg2;
        int var7 = this.field1412 + arg1;
        int var8 = this.field1423 + arg0;
        class471 var9 = var6.field2968;
        this.field1414.method774((byte) -110, class166.field2196);
        this.field1435.method3746(false);
        this.field1435.method3756(10, this.field1414);
        this.field1435.method3750(false, 1);
        this.field1435.method3740(1, 121);
        class588 var10 = this.field1435.method3783(42);
        var10.method3158(11663, (float) this.field1436, 0.0F, (float) this.field1424);
        var10.method450(var8, var7, 0);
        this.field1435.method3761(0);
        class588 var11 = this.field1435.method3763(1);
        var11.method3158(11663, this.field1414.method1129(-120, (float) this.field1436), 1.0F, this.field1414.method1125(true, (float) this.field1424));
        this.field1435.method3744(115, class627.field7959);
        this.field1435.method3712(-14720, 1);
        this.field1435.method3756(10, var9);
        this.field1435.method3759(false, class174.field2285, class137.field1820);
        this.field1435.method3736(class13.field134, 0, (byte) -88);
        class588 var12 = this.field1435.method3763(1);
        var12.method3158(11663, var9.method1129(-127, (float) this.field1436), 1.0F, var9.method1125(true, (float) this.field1424));
        var12.method3164(0.0F, var9.method1125(true, (float) (var8 - arg3)), var9.method1129(-124, (float) (var7 - arg4)), 1);
        this.field1435.method3744(99, class627.field7959);
        this.field1435.method3731((byte) 121);
        this.field1435.method3754(false);
        this.field1435.method3736(class171.field2262, 0, (byte) -88);
        this.field1435.method3759(false, class137.field1820, class137.field1820);
        this.field1435.method3756(10, null);
        this.field1435.method3712(-14720, 0);
        this.field1435.method3754(false);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIII)V", line = 319)
    public final void method622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1429++;
        int[] var7 = this.field1435.method968(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class77.method473(var7[var8], -16777216);
            }
            this.method613(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()I", line = 342)
    public final int method623() {
        field1415++;
        return this.field1424 + this.field1423 + this.field1416;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 358)
    public static final void method624(int arg0) {
        if (class552.field6986 == null) {
            class552.field6986 = class4.method13(92);
            class93.field1291 = class552.field6986[0];
            class45.field503 = class502.method2786(arg0 - 7114);
        }
        field1418++;
        if (class601.field7648 == null) {
            class317.method1854(2);
        }
        class4 var1 = class93.field1291;
        int var2 = class342.method1982(100);
        if (arg0 != 0) {
            return;
        }
        if (class93.field1291 == var1) {
            class451.field5894 = class93.field1291.field24.method3589(class496.field6338, -22395);
            if (class93.field1291.field28) {
                class413.field5470 = (class93.field1291.field20 - class93.field1291.field26) * var2 / 100 + class93.field1291.field26;
            }
            if (class93.field1291.field21) {
                class451.field5894 = class451.field5894 + class413.field5470 + "%";
            }
        } else if (class93.field1291 == class4.field50) {
            class601.field7648 = null;
            class26.method113((byte) 95, 3);
        } else {
            class451.field5894 = var1.field25.method3589(class496.field6338, arg0 ^ 0xFFFFA885);
            class413.field5470 = var1.field20;
            if (class93.field1291.field21) {
                class451.field5894 = class451.field5894 + var1.field20 + "%";
            }
            if (class93.field1291.field28 || var1.field28) {
                class45.field503 = class502.method2786(-7114);
            }
        }
        if (class601.field7648 == null) {
            return;
        }
        class601.field7648.method1326(class45.field503, class93.field1291, 0, class413.field5470, class451.field5894);
        if (class377.field4619 == null) {
            return;
        }
        for (int var3 = class100.field1334 + 1; var3 < class377.field4619.length; var3++) {
            if (class377.field4619[var3].method487((byte) -87) >= 100 && var3 - 1 == class100.field1334 && class332.field4052 >= 1 && class601.field7648.method1329(255)) {
                try {
                    class377.field4619[var3].method479(21324);
                } catch (Exception var4) {
                    class377.field4619 = null;
                    return;
                }
                class601.field7648.method1324(255, class377.field4619[var3]);
                class100.field1334++;
                if (class100.field1334 >= (class377.field4619.length - 1) && class377.field4619.length > 1) {
                    class100.field1334 = class732.field9589.method2894((byte) -53) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIIIIII)V", line = 457)
    public final void method625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1411++;
        class588 var8 = this.field1435.method3783(70);
        class588 var9 = this.field1435.method3763(1);
        this.field1414.method774((byte) -123, class166.field2196);
        this.field1435.method3746(false);
        this.field1435.method3756(10, this.field1414);
        this.field1435.method3750(false, arg6);
        this.field1435.method3740(arg4, 53);
        this.field1435.method3736(class324.field4001, 1, (byte) -88);
        this.field1435.method3718(1, class324.field4001, 1);
        this.field1435.method3771(arg5, -9445);
        boolean var10 = this.field1430 && this.field1412 == 0 && this.field1438 == 0;
        boolean var11 = this.field1425 && this.field1423 == 0 && this.field1416 == 0;
        if ((var11 & var10)) {
            var9.method3158(11663, this.field1414.method1129(-118, (float) arg3), 1.0F, this.field1414.method1125(true, (float) arg2));
            var8.method3158(11663, (float) arg3, 0.0F, (float) arg2);
            var8.method450(arg0, arg1, 0);
            this.field1435.method3744(122, class627.field7959);
            this.field1435.method3761(0);
            this.field1435.method3731((byte) 119);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method628();
            var9.method3158(11663, this.field1414.method1129(-118, (float) this.field1436), 1.0F, this.field1414.method1125(true, (float) arg2));
            this.field1435.method3744(59, class627.field7959);
            int var14 = arg1 + this.field1412;
            int var15 = this.field1436 + var14;
            while (var12 >= var15) {
                var8.method3158(11663, (float) this.field1436, 0.0F, (float) arg2);
                var8.method450(arg0, var14, 0);
                this.field1435.method3761(0);
                var15 += var13;
                this.field1435.method3731((byte) 90);
                var14 += var13;
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method3158(11663, this.field1414.method1129(-127, (float) var16), 1.0F, this.field1414.method1125(true, (float) arg2));
                this.field1435.method3744(113, class627.field7959);
                var8.method3158(11663, (float) var16, 0.0F, (float) arg2);
                var8.method450(arg0, var14, 0);
                this.field1435.method3761(0);
                this.field1435.method3731((byte) 87);
            }
        } else if (var10) {
            int var17 = arg0 + arg2;
            int var18 = this.method623();
            var9.method3158(11663, this.field1414.method1129(-123, (float) arg3), 1.0F, this.field1414.method1125(true, (float) this.field1424));
            this.field1435.method3744(120, class627.field7959);
            int var19 = this.field1423 + arg0;
            int var20 = this.field1424 + var19;
            while (var17 >= var20) {
                var8.method3158(11663, (float) arg3, 0.0F, (float) this.field1424);
                var8.method450(var19, arg1, 0);
                this.field1435.method3761(0);
                var20 += var18;
                var19 += var18;
                this.field1435.method3731((byte) 79);
            }
            if (var17 > var19) {
                int var21 = var17 - var19;
                var9.method3158(11663, this.field1414.method1129(-123, (float) arg3), 1.0F, this.field1414.method1125(true, (float) var21));
                this.field1435.method3744(83, class627.field7959);
                var8.method3158(11663, (float) arg3, 0.0F, (float) var21);
                var8.method450(var19, arg1, 0);
                this.field1435.method3761(0);
                this.field1435.method3731((byte) 84);
            }
        } else {
            int var22 = arg1 + arg3;
            int var23 = arg0 + arg2;
            int var24 = this.method623();
            int var25 = this.method628();
            int var26 = this.field1412 + arg1;
            for (int var27 = this.field1436 + var26; var27 <= var22; var27 += var25) {
                var9.method3158(11663, this.field1414.method1129(-120, (float) this.field1436), 1.0F, this.field1414.method1125(true, (float) this.field1424));
                this.field1435.method3744(84, class627.field7959);
                int var32 = this.field1423 + arg0;
                int var33 = this.field1424 + var32;
                while (var33 <= var23) {
                    var8.method3158(11663, (float) this.field1436, 0.0F, (float) this.field1424);
                    var8.method450(var32, var26, 0);
                    this.field1435.method3761(0);
                    this.field1435.method3731((byte) 79);
                    var33 += var24;
                    var32 += var24;
                }
                if (var23 > var32) {
                    int var34 = var23 - var32;
                    var9.method3158(11663, this.field1414.method1129(-128, (float) this.field1436), 1.0F, this.field1414.method1125(true, (float) var34));
                    this.field1435.method3744(99, class627.field7959);
                    var8.method3158(11663, (float) this.field1436, 0.0F, (float) var34);
                    var8.method450(var32, var26, 0);
                    this.field1435.method3761(0);
                    this.field1435.method3731((byte) 81);
                }
                var26 += var25;
            }
            if (var26 < var22) {
                int var28 = var22 - var26;
                var9.method3158(11663, this.field1414.method1129(-126, (float) var28), 1.0F, this.field1414.method1125(true, (float) this.field1424));
                this.field1435.method3744(78, class627.field7959);
                int var29 = this.field1423 + arg0;
                int var30 = this.field1424 + var29;
                while (var30 <= var23) {
                    var8.method3158(11663, (float) var28, 0.0F, (float) this.field1424);
                    var8.method450(var29, var26, 0);
                    this.field1435.method3761(0);
                    this.field1435.method3731((byte) 90);
                    var30 += var24;
                    var29 += var24;
                }
                if (var23 > var29) {
                    int var31 = var23 - var29;
                    var9.method3158(11663, this.field1414.method1129(-127, (float) var28), 1.0F, this.field1414.method1125(true, (float) var31));
                    this.field1435.method3744(66, class627.field7959);
                    var8.method3158(11663, (float) var28, 0.0F, (float) var31);
                    var8.method450(var29, var26, 0);
                    this.field1435.method3761(0);
                    this.field1435.method3731((byte) 84);
                }
            }
        }
        this.field1435.method3754(false);
        this.field1435.method3736(class13.field134, 1, (byte) -88);
        this.field1435.method3718(1, class13.field134, 1);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)V", line = 672)
    public final void method626(int arg0, int arg1, int arg2, int arg3) {
        field1432++;
        this.field1423 = arg0;
        this.field1412 = arg1;
        this.field1416 = arg2;
        this.field1438 = arg3;
        this.field1426 = this.field1423 != 0 || this.field1412 != 0 || this.field1416 != 0 || this.field1438 != 0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V", line = 688)
    public final void method627(int arg0, int arg1, int arg2) {
        field1422++;
        int[] var4 = this.field1435.method968(arg0, arg1, this.field1424, this.field1436);
        int[] var5 = new int[this.field1436 * this.field1424];
        this.field1414.method1135(var5, 0, 0, 0, this.field1436, 116, this.field1424);
        if (arg2 == 0) {
            for (int var6 = 0; var6 < this.field1436; var6++) {
                int var7 = this.field1424 * var6;
                for (int var8 = 0; var8 < this.field1424; var8++) {
                    var5[var7 + var8] = class77.method473(class249.method1625(1442775040, var4[var7 + var8]) << 8, class249.method1625(var5[var7 + var8], 16777215));
                }
            }
        } else if (arg2 == 1) {
            for (int var9 = 0; var9 < this.field1436; var9++) {
                int var10 = this.field1424 * var9;
                for (int var11 = 0; var11 < this.field1424; var11++) {
                    var5[var10 + var11] = class77.method473(class249.method1625(-16728979, var4[var10 + var11] << 16), class249.method1625(var5[var10 + var11], 16777215));
                }
            }
        } else if (arg2 == 2) {
            for (int var15 = 0; var15 < this.field1436; var15++) {
                int var16 = this.field1424 * var15;
                for (int var17 = 0; var17 < this.field1424; var17++) {
                    var5[var16 + var17] = class77.method473(class249.method1625(-1536657921, var4[var16 + var17]) << 24, class249.method1625(var5[var16 + var17], 16777215));
                }
            }
        } else if (arg2 == 3) {
            for (int var12 = 0; var12 < this.field1436; var12++) {
                int var13 = this.field1424 * var12;
                for (int var14 = 0; var14 < this.field1424; var14++) {
                    var5[var13 + var14] = class77.method473(class249.method1625(16777215, var5[var13 + var14]), var4[var13 + var14] == 0 ? 0 : -16777216);
                }
            }
        }
        this.method613(0, 0, this.field1424, this.field1436, var5, 0, this.field1424);
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()I", line = 799)
    public final int method628() {
        field1409++;
        return this.field1436 + this.field1412 + this.field1438;
    }
}
