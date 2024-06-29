import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class278 extends class337 {

    @OriginalMember(owner = "client!lfa", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field3616 = new String[100];

    @OriginalMember(owner = "client!lfa", name = "p", descriptor = "[Lmr;")
    public static class637[] field3615 = new class637[128];

    @OriginalMember(owner = "client!lfa", name = "m", descriptor = "Lgp;")
    public static class576 field3612 = new class576(3, 2);

    @OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!lfa", name = "n", descriptor = "I")
    public int field3613;

    @OriginalMember(owner = "client!lfa", name = "o", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!lfa", name = "r", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!lfa", name = "s", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!lfa", name = "t", descriptor = "J")
    public static long field3619;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lfa", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field3620;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
    public static void method1708(int arg0) {
        if (arg0 == 0) {
            field3612 = null;
            field3616 = null;
            field3615 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lbaa;B)V")
    public static final void method1709(class136 arg0, byte arg1) {
        field3611++;
        if (class28.field252 == null || arg1 >= -5) {
            return;
        }
        class274 var2 = null;
        if (arg0.field1809 == 0) {
            var2 = (class274) class127.method741(arg0.field1806, arg0.field1800, arg0.field1799);
        }
        if (arg0.field1809 == 1) {
            var2 = (class274) class14.method60(arg0.field1806, arg0.field1800, arg0.field1799);
        }
        if (arg0.field1809 == 2) {
            var2 = (class274) class238.method1571(arg0.field1806, arg0.field1800, arg0.field1799, field3620 == null ? (field3620 = method1712("aia")) : field3620);
        }
        if (arg0.field1809 == 3) {
            var2 = (class274) class740.method4019(arg0.field1806, arg0.field1800, arg0.field1799);
        }
        if (var2 == null) {
            arg0.field1795 = 0;
            arg0.field1793 = 0;
            arg0.field1807 = -1;
        } else {
            arg0.field1807 = var2.method1010(-6546);
            arg0.field1793 = var2.method1007(true);
            arg0.field1795 = var2.method1013((byte) 25);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZI)V")
    public static final void method1710(boolean arg0, int arg1) {
        field3614++;
        if (!class683.method3667(arg1, -46)) {
            return;
        }
        if (!arg0) {
            field3615 = null;
        }
        class391[] var2 = class647.field8259[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class391 var4 = var2[var3];
            if (var4 != null) {
                var4.field5113 = 0;
                var4.field5029 = 1;
                var4.field5142 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZIIZ)V")
    public static final void method1711(boolean arg0, int arg1, int arg2, boolean arg3) {
        field3618++;
        if (class479.field6198.method2616((long) arg1, (byte) 23) == null) {
            if (class560.field7119) {
                class720 var4 = new class720(arg1, new class784(4096, class740.field10032, arg1), arg2, arg3);
                var4.field9464.method588(class206.field2833[class496.field6338], (byte) 66);
                class479.field6198.method2619(var4, (long) arg1, -1);
            } else {
                class405.method2360((byte) 117, arg3, arg1);
            }
        }
        if (!arg0) {
            method1708(50);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1712(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
