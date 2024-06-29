import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class321 {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field5024 = 0;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field5021 = -1;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static volatile int field5030 = 0;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    private int field5026;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public int field5027;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field5029;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Ltk;")
    public static class266 field5028;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5023;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 5)
    public static void method2260(int arg0) {
        field5028 = null;
        if (arg0 == -1) {
            field5023 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Laj;IB)V", line = 27)
    public final void method2261(class1 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method15((byte) 120);
            if (var4 == 0) {
                if (arg2 != -88) {
                    return;
                }
                field5022++;
                return;
            }
            this.method2265(arg0, arg1, var4, -2);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Leg;", line = 44)
    public final class317 method2262(byte arg0) {
        if (arg0 != 41) {
            return (class317) null;
        }
        field5031++;
        class317 var2 = (class317) class31.field487.method2288((long) this.field5026, (byte) 89);
        if (var2 != null) {
            return var2;
        }
        class317 var3 = class288.method2023(0, this.field5026, (byte) -72, class316.field4984);
        if (var3 != null) {
            class31.field487.method2281(0, (long) this.field5026, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 66)
    public static final void method2263(int arg0) {
        field5033++;
        for (int var1 = 0; var1 < 5; var1++) {
            class41.field637[var1] = false;
        }
        class63.field918 = -1;
        class241.field3610 = 0;
        class294.field4620 = 0;
        field5021 = arg0;
        class73.field1112 = 5;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V", line = 87)
    public static final void method2264(int arg0, String arg1, String arg2, byte arg3) {
        field5025++;
        if (arg3 >= -126) {
            field5030 = 83;
        }
        class3.field99 = arg0;
        class314.field4949 = arg2;
        class106.field1736 = arg1;
        if (class314.field4949.equals("") || class106.field1736.equals("")) {
            class133.field2117 = 3;
        } else if (class1.field72 == -1) {
            class155.field2526 = 0;
            class77.field1211 = 0;
            class133.field2117 = -3;
            class64.field931 = 1;
            class1 var4 = new class1(128);
            var4.method21(104, 10);
            var4.method11((int) (Math.random() * 9.9999999E7D), 31932);
            var4.method59(class106.method851(class314.field4949, -44), false);
            var4.method11((int) (Math.random() * 9.9999999E7D), 31932);
            var4.method12(class106.field1736, (byte) -47);
            var4.method11((int) (Math.random() * 9.9999999E7D), 31932);
            var4.method24(class308.field4877, -101, class232.field3540);
            class209.field3305.field48 = 0;
            class209.field3305.method21(-106, 24);
            class209.field3305.method21(65, var4.field48 + 2);
            class209.field3305.method14(-246866616, 544);
            class209.field3305.method61(var4.field48, var4.field34, 0, -2131480434);
        } else {
            class272.method1938(77);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Laj;III)V", line = 139)
    private final void method2265(class1 arg0, int arg1, int arg2, int arg3) {
        if (~arg2 == arg3) {
            this.field5026 = arg0.method56(19612);
        } else if (arg2 == 2) {
            this.field5029 = arg0.method15((byte) -85);
            this.field5027 = arg0.method15((byte) 82);
        }
        field5032++;
    }
}
