import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class272 extends class206 {

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "J")
    public long field4696;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "[Lwa;")
    public static class75[] field4692 = new class75[500];

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field4693 = -1;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lwa;")
    private static class75 field4695 = class66.method560("Players", false);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lwa;")
    public static class75 field4694 = field4695;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field4699 = 0;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    public static int field4701 = 0;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[Lje;")
    public static class68[] field4698;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "[[[B")
    public static byte[][][] field4690;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V", line = 7)
    public static void method1940(int arg0) {
        field4698 = null;
        field4690 = (byte[][][]) null;
        field4692 = null;
        field4694 = null;
        if (arg0 == 1376312589) {
            field4695 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)I", line = 25)
    public static final int method1941(int arg0) {
        if (arg0 >= -109) {
            return -30;
        }
        field4700++;
        if ((double) class7.field102 == 3.0D) {
            return 37;
        } else if ((double) class7.field102 == 4.0D) {
            return 50;
        } else if ((double) class7.field102 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)V", line = 58)
    public static final void method1942(int arg0, int arg1, int arg2) {
        field4697++;
        if (class126.field2188 < 2 && class13.field176 == 0 && !class161.field2738 || arg1 >= -33) {
            return;
        }
        class75 var3;
        if (class13.field176 == 1 && class126.field2188 < 2) {
            var3 = class66.method562((byte) -28, new class75[] { class244.field4110, class10.field128, class237.field3994, class64.field1116 });
        } else if (class161.field2738 && class126.field2188 < 2) {
            var3 = class66.method562((byte) 125, new class75[] { class197.field3307, class10.field128, class215.field3673, class64.field1116 });
        } else {
            var3 = class147.method1134(class126.field2188 - 1, (byte) -90);
        }
        if (class126.field2188 > 2) {
            var3 = class66.method562((byte) -112, new class75[] { var3, class238.field4011, class67.method565(87, class126.field2188 - 2), class219.field3741 });
        }
        int var4 = class3.field28.method785(var3, arg2 + 4, arg0 + 15, 16777215, 0, class26.field342, class149.field2566);
        class177.method1306(arg0, var4 + class3.field28.method779(var3), arg2 + 4, 15, (byte) -106);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIB)I", line = 114)
    public static final int method1943(int arg0, int arg1, byte arg2) {
        if (arg2 < 78) {
            method1940(-40);
        }
        field4691++;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 134)
    public class272() {
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(J)V", line = 136)
    public class272(long arg0) {
        this.field4696 = arg0;
    }
}
