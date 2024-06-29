import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class305 implements class613 {

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lkk;")
    private class188 field4280 = new class188(128);

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "[I")
    public int[] field4275 = new int[class472.field6696.field9991];

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "[I")
    private int[] field4285 = new int[class472.field6696.field9991];

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)I")
    public final int method1990(int arg0, int arg1) {
        field4276++;
        class728 var3 = class130.field1568.method175(arg0, (byte) -121);
        int var4 = var3.field10185;
        if (arg1 == 26951) {
            int var5 = var3.field10179;
            int var6 = var3.field10186;
            int var7 = class699.field9639[var6 - var5];
            return this.field4275[var4] >> var5 & var7;
        } else {
            return -112;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIZ)V")
    public final void method1991(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        field4273++;
        this.field4285[arg1] = arg0;
        class100 var4 = (class100) this.field4280.method1180((byte) 26, (long) arg1);
        if (var4 == null) {
            class100 var5 = new class100(4611686018427387905L);
            this.field4280.method1179((long) arg1, var5, (byte) -26);
        } else if (var4.field1194 != 4611686018427387905L) {
            var4.field1194 = class479.method2864((byte) -62) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
    public final int method1992(int arg0, int arg1) {
        field4283++;
        return arg0 == -1 ? this.field4275[arg1] : 21;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
    public static final void method1993(int arg0, int arg1, int arg2) {
        field4281++;
        class592 var3 = class682.method3825(-652872096, 12, arg0);
        var3.method3351(0);
        var3.field8337 = arg1;
        if (arg2 >= 116) {
            ;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIB)V")
    public final void method1994(int arg0, int arg1, byte arg2) {
        field4277++;
        class728 var4 = class130.field1568.method175(arg0, (byte) -110);
        int var5 = var4.field10185;
        int var6 = var4.field10179;
        if (arg2 > -37) {
            return;
        }
        int var7 = var4.field10186;
        int var8 = class699.field9639[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1998(var5, this.field4275[var5] & ~var9 | arg1 << var6 & var9, (byte) -117);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public final void method1995(byte arg0) {
        if (arg0 <= 26) {
            this.method1991(-40, 12, false);
        }
        for (int var2 = 0; var2 < class472.field6696.field9991; var2++) {
            class44 var3 = class472.field6696.method4042(var2, (byte) 124);
            if (var3 != null && var3.field539 == 0) {
                this.field4285[var2] = 0;
                this.field4275[var2] = 0;
            }
        }
        field4279++;
        this.field4280 = new class188(128);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BII)V")
    public final void method1996(byte arg0, int arg1, int arg2) {
        field4284++;
        class728 var4 = class130.field1568.method175(arg2, (byte) -7);
        int var5 = var4.field10185;
        int var6 = var4.field10179;
        int var7 = var4.field10186;
        int var8 = class699.field9639[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = 84 / ((-arg0 - 24) / 35);
        int var10 = var8 << var6;
        this.method1991(arg1 << var6 & var10 | ~var10 & this.field4285[var5], var5, false);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)I")
    public final int method1997(boolean arg0, int arg1) {
        field4272++;
        int var3 = -90 % ((arg1 - 8) / 62);
        long var4 = class479.method2864((byte) -92);
        for (class100 var6 = arg0 ? (class100) this.field4280.method1176(24490) : (class100) this.field4280.method1178((byte) 71); var6 != null; var6 = (class100) this.field4280.method1178((byte) 71)) {
            if (var4 > (var6.field1194 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var6.field1194 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var6.field2546;
                    this.field4275[var7] = this.field4285[var7];
                    var6.method1185(-118);
                    return var7;
                }
                var6.method1185(-92);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIB)V")
    public final void method1998(int arg0, int arg1, byte arg2) {
        this.field4275[arg0] = arg1;
        field4274++;
        class100 var4 = (class100) this.field4280.method1180((byte) 26, (long) arg0);
        if (arg2 > -78) {
            this.method1998(-106, 52, (byte) 12);
        }
        if (var4 == null) {
            class100 var5 = new class100(class479.method2864((byte) -110) + 500L);
            this.field4280.method1179((long) arg0, var5, (byte) -26);
        } else {
            var4.field1194 = class479.method2864((byte) -104) + 500L;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static final void method1999(int arg0) {
        if (arg0 != -26159) {
            return;
        }
        field4278++;
        if (class268.field3831 == null) {
            return;
        }
        if (class589.field8295) {
            class70.method574(true);
        }
        class471.field6690.method2781(92);
        class505.method2993();
        class636.method3534(arg0 + 42757);
        class299.method1944((byte) -126);
        class652.method3590(0);
        class419.method2571(arg0 + 26175);
        if (class745.field10351 != null) {
            class745.field10351.method3583(0);
        }
        class563.method3240((byte) 124);
        class184.method1167((byte) -73);
        class270.method1766(1339);
        class655.method3603(0);
        class673.method3679((byte) 113, false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class280 var5 = class309.field4311[var1];
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.field8010.length; var6++) {
                    var5.field8010[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class438.field6239; var2++) {
            class468 var3 = class30.field399[var2].field10289;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field8010.length; var4++) {
                    var3.field8010[var4] = null;
                }
            }
        }
        class631.field8724 = null;
        class542.field7576 = null;
        class268.field3831.method474(arg0 ^ 0xFFFF99D0);
        class268.field3831 = null;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(II)V")
    public static final void method2000(int arg0, int arg1) {
        field4282++;
        if (arg0 == 128 && class739.field10281 == null || arg1 > class739.field10281.length) {
            class739.field10281 = new int[arg1];
        }
    }
}
