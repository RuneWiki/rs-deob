import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class115 {

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2349 = 0;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Leh;")
    public static class47 field2350 = class195.method1282((byte) -4, ":");

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[I")
    public static int[] field2347 = new int[4000];

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method905(int arg0) {
        class206.field4058.method993(1);
        class55.field1055.method993(1);
        field2351++;
        class155.field3040.method993(1);
        if (arg0 != 2047) {
            field2350 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
    public static final void method906(int arg0, int arg1) {
        if (~arg1 == arg0 && !class72.field1545) {
            class191.method1255(arg0 + 26061);
        } else if (arg1 != -1 && (class107.field2235 != arg1 || !class96.method768((byte) -4)) && class146.field2855 != 0 && !class72.field1545) {
            class177.method1181(2, 0, arg1, class189.field3667, false, class146.field2855, 1);
        }
        class107.field2235 = arg1;
        field2352++;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static void method907(int arg0) {
        field2347 = null;
        field2350 = null;
        if (arg0 > -98) {
            method907(-25);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLgf;)V")
    public static final void method908(byte arg0, class61 arg1) {
        if (arg0 != 96) {
            method905(120);
        }
        field2348++;
        int var2 = arg1.field1225;
        if (var2 == 324) {
            if (class110.field2284 == -1) {
                class116.field2365 = arg1.field1286;
                class110.field2284 = arg1.field1287;
            }
            if (class205.field4038.field3489) {
                arg1.field1287 = class110.field2284;
            } else {
                arg1.field1287 = class116.field2365;
            }
        } else if (var2 == 325) {
            if (class110.field2284 == -1) {
                class110.field2284 = arg1.field1287;
                class116.field2365 = arg1.field1286;
            }
            if (class205.field4038.field3489) {
                arg1.field1287 = class116.field2365;
            } else {
                arg1.field1287 = class110.field2284;
            }
        } else if (var2 == 327) {
            arg1.field1220 = 150;
            arg1.field1283 = (int) (Math.sin((double) class18.field362 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1259 = 5;
            arg1.field1184 = -1;
        } else if (var2 == 328) {
            if (class123.field2489.field598 == null) {
                arg1.field1184 = 0;
            } else {
                arg1.field1220 = 150;
                arg1.field1283 = (int) (Math.sin((double) class18.field362 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field1259 = 5;
                arg1.field1184 = ((int) class123.field2489.field598.method399(120) << 11) + 2047;
                arg1.field1314 = class123.field2489.field3323;
                arg1.field1201 = class123.field2489.field3306;
            }
        }
    }
}
