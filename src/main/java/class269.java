import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class269 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field4716 = 3;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field4717 = 0;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field4723 = 0;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Lik;")
    public static class262 field4722;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLqj;)V", line = 7)
    public static final void method1944(byte arg0, class256 arg1) {
        field4721++;
        if (class116.field2000 == arg1.field4503 || arg1.field4492 == -1 || arg1.field4521 != 0 || arg1.field4473 + 1 > class149.method1063(arg1.field4492, -18767).field4764[arg1.field4453]) {
            int var2 = class116.field2000 - arg1.field4519;
            int var3 = arg1.field4503 - arg1.field4519;
            int var4 = arg1.field4507 * 128 + arg1.method363((byte) 73) * 64;
            int var5 = arg1.field4485 * 128 + (arg1.method363((byte) -46) * 64);
            int var6 = arg1.field4463 * 128 + (arg1.method363((byte) 86) * 64);
            int var7 = arg1.field4474 * 128 + (arg1.method363((byte) -61) * 64);
            arg1.field4452 = ((var3 - var2) * var4 + (var2 * var6)) / var3;
            arg1.field4457 = ((var3 - var2) * var5 + var2 * var7) / var3;
        }
        arg1.field4515 = 0;
        if (arg1.field4478 == 0) {
            arg1.field4486 = 1024;
        }
        if (arg1.field4478 == 1) {
            arg1.field4486 = 1536;
        }
        if (arg0 <= 125) {
            method1945(true);
        }
        if (arg1.field4478 == 2) {
            arg1.field4486 = 0;
        }
        if (arg1.field4478 == 3) {
            arg1.field4486 = 512;
        }
        arg1.field4518 = arg1.field4486;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V", line = 62)
    public static void method1945(boolean arg0) {
        if (arg0) {
            field4716 = -5;
        }
        field4722 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Lhb;", line = 112)
    public static final class36 method1946(int arg0, int arg1, int arg2) {
        class74 var3 = class99.field1759[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class36 var4 = var3.field1140;
            var3.field1140 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 124)
    public static final void method1947(byte arg0) {
        class95.field1516 = (byte[][][]) null;
        class195.field3528 = null;
        class149.field2719 = (int[][][]) null;
        field4720++;
        if (arg0 != -68) {
            field4717 = 58;
        }
        class182.field3357 = (byte[][][]) null;
        class34.field459 = null;
        class327.field5586 = (byte[][][]) null;
        class90.field1417 = null;
        class265.field4670 = (byte[][][]) null;
        class216.field3840 = (byte[][][]) null;
        class24.field365 = null;
        class93.field1481 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([Ljava/lang/Object;[II)V", line = 152)
    public static final void method1948(Object[] arg0, int[] arg1, int arg2) {
        if (arg2 != -219) {
            method1947((byte) -59);
        }
        class15.method101(arg1, arg0, arg2 + 220, arg1.length + -1, 0);
        field4718++;
    }
}
