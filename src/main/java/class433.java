import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class433 {

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field5892 = -1;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "[Lq;")
    public static class270[] field5893 = new class270[6];

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field5890 = 0;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5898 = null;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "Lbi;")
    public static class309 field5896;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
    public static final void method2553(int arg0, int arg1) {
        field5891++;
        class106 var2 = class250.method1400(2, -12, arg0);
        if (arg1 != -528142201) {
            method2556(-70);
        }
        var2.method659(arg1 + 528142082);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
    public static void method2554(byte arg0) {
        if (arg0 != 29) {
            method2557(-14, (class32) null);
        }
        field5898 = null;
        field5896 = null;
        field5893 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public static final void method2555(int arg0) {
        field5895++;
        class314.field4163 = 0;
        if (arg0 != -528142201) {
            field5890 = -67;
        }
        int var1 = (class233.field3103.field6501 >> 7) + class162.field2260;
        int var2 = (class233.field3103.field6507 >> 7) + class266.field3511;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class314.field4163 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class314.field4163 = 1;
        }
        if (class314.field4163 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class314.field4163 = 0;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public static final void method2556(int arg0) {
        field5897++;
        class123.field1805++;
        class491.method2861(class173.field2374, 1);
        class203.field2751.method228(arg0, arg0 ^ 0x20);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILbt;)Lgr;")
    public static final class274 method2557(int arg0, class32 arg1) {
        field5894++;
        int var2 = -127 / ((-arg0 - 48) / 43);
        class274 var3 = new class274();
        var3.field3626 = arg1.method215((byte) 115);
        var3.field3627 = class455.method2674((byte) 83, var3.field3626);
        return var3;
    }
}
