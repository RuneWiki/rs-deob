import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class252 {

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4280 = 0;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "[[[B")
    public static byte[][][] field4282 = new byte[4][104][104];

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field4284 = 1;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1711(int arg0) {
        class306.field5242++;
        class228.field3831.method621(98, 8);
        for (class159 var1 = (class159) class58.field805.method1607(arg0); var1 != null; var1 = (class159) class58.field805.method1604((byte) 127)) {
            if (var1.field2602 == 0) {
                class25.method173(true, arg0 + 1, var1);
            }
        }
        field4281++;
        if (class69.field1034 != null) {
            class272.method1834(class69.field1034, arg0 ^ 0x0);
            class69.field1034 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lek;Lek;Lek;ILek;)V", line = 36)
    public static final void method1712(class172 arg0, class172 arg1, class172 arg2, int arg3, class172 arg4) {
        if (arg3 != 1) {
            method1712((class172) null, (class172) null, (class172) null, 48, (class172) null);
        }
        class262.field4465 = arg4;
        class199.field3412 = arg1;
        class259.field4410 = arg2;
        field4277++;
        class282.field4775 = arg0;
        class122.field2036 = new class69[class259.field4410.method1117(-1)][];
        class229.field3911 = new boolean[class259.field4410.method1117(arg3 - 2)];
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 88)
    public static void method1713(boolean arg0) {
        field4282 = (byte[][][]) null;
        if (arg0) {
            method1712((class172) null, (class172) null, (class172) null, 56, (class172) null);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILja;)I", line = 99)
    public static final int method1714(int arg0, class60 arg1) {
        field4275++;
        class129 var2 = arg1.field822;
        if (var2.field2193 != null) {
            var2 = var2.method806((byte) -126);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 != 0) {
            method1716(-90, -67, (class283) null, 83, (class283) null, (class283) null);
        }
        int var3 = var2.field2183;
        if (arg1.field1219 == arg1.field1203) {
            var3 = var2.field2149;
        } else if (arg1.field1219 == arg1.field1187) {
            var3 = var2.field2176;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)V", line = 131)
    public static final void method1715(boolean arg0, int arg1) {
        class72 var2 = class25.method174(arg1, (byte) -67, 4);
        if (arg0) {
            method1716(112, -84, (class283) null, -19, (class283) null, (class283) null);
        }
        field4278++;
        var2.method479(-5);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILbe;ILbe;Lbe;)V", line = 143)
    public static final void method1716(int arg0, int arg1, class283 arg2, int arg3, class283 arg4, class283 arg5) {
        field4276++;
        for (int var6 = 99; var6 > 0; var6--) {
            class184.field3168[var6] = class184.field3168[var6 - 1];
            class90.field1528[var6] = class90.field1528[var6 - 1];
            class157.field2575[var6] = class157.field2575[var6 - 1];
            class296.field5014[var6] = class296.field5014[var6 - 1];
            class301.field5086[var6] = class301.field5086[var6 - 1];
        }
        class269.field4549++;
        if (arg3 < 15) {
            return;
        }
        class24.field361 = field4284;
        class184.field3168[0] = arg1;
        class301.field5086[0] = arg0;
        class90.field1528[0] = arg5;
        class157.field2575[0] = arg4;
        class296.field5014[0] = arg2;
    }
}
