import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class102 extends class425 {

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    public int field1292 = -1;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    public int field1291 = 0;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public static int field1283 = 0;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "[I")
    public static int[] field1290 = new int[13];

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public int field1287;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public int field1288;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLbr;)V", line = 13)
    public static final void method594(boolean arg0, class223 arg1) {
        field1297++;
        int var2 = arg1.field3281;
        if (var2 == 327) {
            arg1.field3237 = 150;
            arg1.field3331 = (int) (Math.sin((double) class34.field434 / 40.0D) * 256.0D) & 0x3FFF;
            arg1.field3338 = 5;
            arg1.field3305 = -1;
        } else if (var2 == 328) {
            if (class181.field2555.field1790 == null) {
                arg1.field3305 = 0;
                arg1.field3260 = 0;
            } else {
                arg1.field3237 = 150;
                arg1.field3331 = (int) (Math.sin((double) class34.field434 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3305 = 2047;
                arg1.field3338 = 5;
                arg1.field3260 = class276.method1872((byte) 12, class181.field2555.field1790);
                arg1.field3267 = 0;
                arg1.field3199 = class181.field2555.field4537;
                arg1.field3276 = class181.field2555.field4520;
                arg1.field3292 = class181.field2555.field4519;
            }
        } else if (!arg0) {
            method596(true, true, (class253) null, true);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 64)
    public static void method595(int arg0) {
        if (arg0 != 16383) {
            method596(true, true, (class253) null, true);
        }
        field1290 = null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZZLks;Z)V", line = 82)
    public static final void method596(boolean arg0, boolean arg1, class253 arg2, boolean arg3) {
        field1295++;
        int var4 = arg2.field3746;
        int var5 = (int) arg2.field6070;
        arg2.method2660((byte) 127);
        if (arg0) {
            class248.method1729(91, var4);
        }
        class220.method1548(0, var4);
        class223 var6 = class438.method2732(var5, 0);
        if (var6 != null) {
            class245.method1701(var6, (byte) -94);
        }
        class323.method2140(126);
        if (!arg3 && class265.field3898 != -1) {
            class23.method122(1, -27431, class265.field3898);
        }
        class410 var7 = new class410(class318.field4662);
        if (!arg1) {
            method596(true, true, (class253) null, true);
        }
        for (class253 var8 = (class253) var7.method2598(12584); var8 != null; var8 = (class253) var7.method2595((byte) 67)) {
            if (!var8.method2662((byte) 116)) {
                var8 = (class253) var7.method2598(12584);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field3748 == 3) {
                int var9 = (int) var8.field6070;
                if ((var9 >>> 16) == var4) {
                    method596(true, true, var8, arg3);
                }
            }
        }
    }
}
