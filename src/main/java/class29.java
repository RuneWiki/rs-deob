import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class29 extends class154 {

    @OriginalMember(owner = "client!sh", name = "ab", descriptor = "[I")
    public static int[] field418 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!sh", name = "ib", descriptor = "Leg;")
    private static class37 field426 = class174.method1167("Connection lost)3", 111);

    @OriginalMember(owner = "client!sh", name = "hb", descriptor = "Leg;")
    private static class37 field425 = class174.method1167("scroll:", 101);

    @OriginalMember(owner = "client!sh", name = "bb", descriptor = "Leg;")
    public static class37 field419 = field426;

    @OriginalMember(owner = "client!sh", name = "fb", descriptor = "Leg;")
    public static class37 field423 = field425;

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "Leg;")
    public static class37 field416 = field425;

    @OriginalMember(owner = "client!sh", name = "lb", descriptor = "Leg;")
    public static class37 field429 = class174.method1167(")1 ", 102);

    @OriginalMember(owner = "client!sh", name = "gb", descriptor = "Leg;")
    public static class37 field424 = class174.method1167("blinken1:", -111);

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!sh", name = "cb", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!sh", name = "db", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!sh", name = "eb", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!sh", name = "jb", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!sh", name = "kb", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!sh", name = "mb", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!sh", name = "nb", descriptor = "Ljl;")
    public static class101 field431;

    @OriginalMember(owner = "client!sh", name = "Z", descriptor = "[Lbe;")
    public static class17[] field417;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)V")
    public static void method165(int arg0) {
        field425 = null;
        if (arg0 == 1) {
            field423 = null;
            field416 = null;
            field429 = null;
            field424 = null;
            field417 = null;
            field419 = null;
            field431 = null;
            field418 = null;
            field426 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field415;
        if (arg1 != 1075962732) {
            method169(71);
        }
        int[] var3 = super.field2574.method206(arg0, arg1 ^ 1075954836);
        if (super.field2574.field536) {
            int[][] var4 = this.method1054(arg1 ^ 1075962732, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; ~var8 > ~class227.field3898; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(III)I")
    public static final int method166(int arg0, int arg1, int arg2) {
        ++field421;
        int var3 = class150.method1028((byte) 93, arg1 + -1, arg2 + -1) - -class150.method1028((byte) 120, arg1 - -1, arg2 - 1) - (-class150.method1028((byte) 107, arg1 + -1, arg2 + 1) + -class150.method1028((byte) 35, arg1 + 1, arg2 + 1));
        int var4 = class150.method1028((byte) 98, arg1 + -1, arg2) + class150.method1028((byte) 119, arg1 + 1, arg2) + class150.method1028((byte) 69, arg1, arg2 + -1) + class150.method1028((byte) 108, arg1, arg2 + 1);
        int var5 = class150.method1028((byte) 45, arg1, arg2);
        if (arg0 < 126) {
            method165(-95);
        }
        return var3 / 16 + (var4 / 8 - -(var5 / 4));
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class29() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILpe;)Leg;")
    public static final class37 method167(int arg0, int arg1, class237 arg2) {
        ++field420;
        if (!class152.method1035(client.method787(arg2), false, arg1) && arg2.field4227 == null) {
            return null;
        } else if (arg2.field4076 != null && arg1 < arg2.field4076.length && arg2.field4076[arg1] != null && arg2.field4076[arg1].method255(arg0 + 253).method222((byte) 85) != 0) {
            if (arg0 != -410) {
                method166(-59, -6, -42);
            }
            return arg2.field4076[arg1];
        } else {
            return class126.field2117 ? class156.method1061((byte) -63, new class37[] { class51.field802, class163.method1096(arg1, (byte) -35) }) : null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)Lvc;")
    public static final class118 method168(int arg0, int arg1) {
        class118 var2 = (class118) class105.field1626.method344((byte) 14, (long) arg1);
        ++field427;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class200.field3400.method666(arg1, arg0, (byte) -51);
            class118 var4 = new class118();
            if (var3 != null) {
                var4.method844(arg0 ^ -128, new class187(var3));
            }
            class105.field1626.method341((byte) 16, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)[Lrk;")
    public static final class14[] method169(int arg0) {
        ++field430;
        class14[] var1 = new class14[class5.field91];
        if (arg0 > -44) {
            field429 = null;
        }
        for (int var2 = 0; var2 < class5.field91; ++var2) {
            var1[var2] = new class14(class257.field4567, class126.field2118, class249.field4476[var2], class158.field2636[var2], class224.field3852[var2], class125.field2101[var2], class170.field2848[var2], class262.field4617);
        }
        class5.method33(24094);
        return var1;
    }
}
