import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class343 extends class97 {

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public int field5130 = -1;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public int field5133 = 0;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public static int field5138 = 0;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Lwl;")
    public static class452 field5126 = new class452(17, -1);

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "[[Z")
    public static boolean[][] field5139 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public int field5124;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public int field5125;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public int field5127;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public int field5129;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public int field5131;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public int field5132;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public int field5134;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public int field5135;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public int field5136;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public int field5137;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lwo;")
    public static final class289 method2094(int arg0, int arg1) {
        field5128++;
        class241 var2 = class306.field4617;
        class289 var3;
        synchronized (class306.field4617) {
            var3 = (class289) class306.field4617.method1491((long) arg0, 0);
            if (arg1 != 26057) {
                field5139 = null;
            }
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class168.field2412.method823(3, -20334, arg0);
        class289 var5 = new class289();
        if (var4 != null) {
            var5.method1786(new class385(var4), 111);
        }
        class241 var6 = class306.field4617;
        synchronized (class306.field4617) {
            class306.field4617.method1488(128, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    public static void method2095(byte arg0) {
        if (arg0 != -70) {
            field5139 = null;
        }
        field5126 = null;
        field5139 = null;
    }
}
