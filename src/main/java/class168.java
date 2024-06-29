import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class168 extends class386 {

    @OriginalMember(owner = "client!ffa", name = "F", descriptor = "Z")
    public static boolean field2052 = false;

    @OriginalMember(owner = "client!ffa", name = "I", descriptor = "I")
    public static int field2055 = 1400;

    @OriginalMember(owner = "client!ffa", name = "H", descriptor = "I")
    public static int field2054 = -1;

    @OriginalMember(owner = "client!ffa", name = "C", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ffa", name = "D", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ffa", name = "E", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!ffa", name = "G", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field2049;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = -68 % ((arg1 - 13) / 40);
        if (super.field5140.field3482) {
            class252.method1539(var3, 0, class599.field8643, class562.field8114[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Z)V")
    public static final void method1058(boolean arg0) {
        class472 var1 = class228.field2961;
        synchronized (class228.field2961) {
            class228.field2961.method2776(arg0);
        }
        ++field2053;
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(III)Ldn;")
    public static final class480 method1059(int arg0, int arg1, int arg2) {
        class433 var3 = class281.field3808[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6212;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZILjn;)Ltea;")
    public static final class217 method1060(boolean arg0, int arg1, class668 arg2) {
        ++field2051;
        if (arg0) {
            method1060(true, 20, (class668) null);
        }
        byte[] var3 = arg2.method3811(118, arg1);
        return var3 == null ? null : new class217(var3);
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V")
    public class168() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BZ)V")
    public static final void method1061(byte arg0, boolean arg1) {
        if (class489.field6835 != null) {
            class489.field6835.method1853((byte) 11);
            class489.field6835 = null;
        }
        ++field2050;
        class690.field9842 = 0;
        class354.method2000(0);
        class37.method422();
        for (int var2 = 0; ~var2 > -5; ++var2) {
            class349.field4642[var2].method2138((byte) -96);
        }
        class112.method801((byte) 81, false);
        System.gc();
        class242.method1475(-1, 2);
        class621.field8895 = false;
        class584.field8487 = -1;
        class331.method1920(-1);
        class422.method2548(false, true);
        class36.field689 = 0;
        class53.field865 = 0;
        class227.field2933 = 0;
        if (arg0 > 22) {
            class88.field1239 = 0;
            class389.field5225 = 0;
            class532.field7778 = 0;
            for (int var3 = 0; ~var3 > ~class631.field9068.length; ++var3) {
                class631.field9068[var3] = null;
            }
            class651.method3666((byte) -69);
            for (int var4 = 0; var4 < 2048; ++var4) {
                class184.field2252[var4] = null;
            }
            class99.field1332 = 0;
            class522.field7662.method3674((byte) -72);
            class59.field928 = 0;
            class475.field6655.method3674((byte) -26);
            class473.method2783(false);
            class697.field9869 = 0;
            class410.field5804.method3191(false);
            class515.method3052(false);
            class129.method879(0);
            class517.field7568 = 0L;
            class582.field8481 = null;
            if (arg1) {
                class245.method1487(12, -21316);
            } else {
                class245.method1487(3, -21316);
                try {
                    class140.method923(class627.field8991, (byte) -115, "loggedout");
                } catch (Throwable var5) {
                }
            }
        }
    }
}
