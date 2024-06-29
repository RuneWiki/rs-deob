import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class458 extends class45 implements Runnable {

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public int field6786 = -1;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Z")
    private boolean field6791 = true;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Lmo;")
    private class240 field6787;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Ljg;")
    public static class241 field6784 = new class241(4);

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Lpf;")
    public static class425 field6790 = new class425(63, 8);

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field6793 = new String[100];

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "J")
    public static long field6794 = -1L;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Liq;")
    public static class134 field6792;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "Lgo;")
    public static class272 field6795;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method2838(int arg0) {
        field6793 = null;
        field6792 = null;
        if (arg0 != 63) {
            method2844((long[]) null, (byte) -111, (Object[]) null);
        }
        field6795 = null;
        field6784 = null;
        field6790 = null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public final void method2839(int arg0) {
        if (arg0 == 1) {
            this.field6791 = false;
            field6788++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ldr;Lla;III)V")
    public static final void method2840(class261 arg0, class269 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class275.field4206) {
            class13 var5 = class277.field4216[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field166 != null && var5.field166.method112(true)) {
                arg1.method117(true, 0, var5.field166, class26.field337, 0, 0, arg0);
            }
        }
        if (arg4 < class275.field4206) {
            class13 var6 = class277.field4216[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field166 != null && var6.field166.method112(true)) {
                arg1.method117(true, 0, var6.field166, 0, 0, class26.field337, arg0);
            }
        }
        if (arg3 < class275.field4206 && arg4 < class265.field4044) {
            class13 var7 = class277.field4216[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field166 != null && var7.field166.method112(true)) {
                arg1.method117(true, 0, var7.field166, class26.field337, 0, class26.field337, arg0);
            }
        }
        if (arg3 < class275.field4206 && arg4 > 0) {
            class13 var8 = class277.field4216[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field166 != null && var8.field166.method112(true)) {
                arg1.method117(true, 0, var8.field166, class26.field337, 0, -class26.field337, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static final void method2841(byte arg0) {
        int var1 = -120 % ((-arg0 - 13) / 51);
        if (class196.field2965 != null) {
            class47.field577.method2121((byte) 63);
            class375.method2250();
            class314.method1922(0);
            class453.method2818(-1);
            class38.method221(-114);
            class128.method760(11074);
            if (class31.field396 != null) {
                class31.field396.method770(2);
            }
            class103.method651(103);
            class196.method1170(61);
            class426.method2625((byte) -106);
            class302.method1860(-112, false);
            class15.method85(113);
            for (int var2 = 0; var2 < 2048; var2++) {
                class169 var6 = class140.field1883[var2];
                if (var6 != null) {
                    var6.field2016 = null;
                    for (int var7 = 0; var7 < var6.field2017.length; var7++) {
                        var6.field2017[var7] = null;
                    }
                }
            }
            for (int var3 = 0; var3 < class170.field2626.length; var3++) {
                class155 var4 = class170.field2626[var3];
                if (var4 != null) {
                    for (int var5 = 0; var5 < var4.field2017.length; var5++) {
                        var4.field2017[var5] = null;
                    }
                }
            }
            class196.field2965.method1617((byte) -37);
            class196.field2965 = null;
        }
        field6785++;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    public static final void method2842(byte arg0) {
        field6781++;
        int var1 = -81 % ((74 - arg0) / 48);
        class241 var2 = class80.field1055;
        synchronized (class80.field1055) {
            class80.field1055.method1485(-22032);
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
    public final void method2843(byte arg0) {
        if (arg0 != -91) {
            field6795 = null;
        }
        (new Thread(this, "a")).start();
        field6789++;
    }

    @OriginalMember(owner = "client!nd", name = "run", descriptor = "()V")
    public final void run() {
        field6780++;
        while (this.field6791) {
            this.field6787.method1466((byte) 101, this);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([JB[Ljava/lang/Object;)V")
    public static final void method2844(long[] arg0, byte arg1, Object[] arg2) {
        class1.method17(arg0.length - 1, arg0, arg2, 0, 110);
        if (arg1 > -58) {
            method2842((byte) -57);
        }
        field6783++;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lmo;)V")
    public class458(class240 arg0) {
        this.field6787 = arg0;
    }
}
