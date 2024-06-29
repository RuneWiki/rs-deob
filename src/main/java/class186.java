import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public abstract class class186 extends class205 {

    @OriginalMember(owner = "client!lia", name = "w", descriptor = "Leq;")
    public class137 field3113;

    @OriginalMember(owner = "client!lia", name = "v", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!lia", name = "t", descriptor = "Leda;")
    public static class14 field3110 = new class14(10);

    @OriginalMember(owner = "client!lia", name = "z", descriptor = "Ltm;")
    public static class334 field3116 = new class334(86, 1);

    @OriginalMember(owner = "client!lia", name = "y", descriptor = "F")
    public static float field3115;

    @OriginalMember(owner = "client!lia", name = "u", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!lia", name = "x", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!lia", name = "A", descriptor = "Z")
    public static boolean field3117;

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)V")
    public static void method1418(int arg0) {
        field3110 = null;
        field3116 = null;
        if (arg0 != 0) {
            method1419(100, 30, 101);
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(III)Z")
    public static final boolean method1419(int arg0, int arg1, int arg2) {
        field3111++;
        if (arg1 != 458752) {
            field3110 = null;
        }
        return (arg0 & 0x70000) != 0 | class629.method3565(arg2, (byte) 54, arg0) || class461.method2827(0, arg0, arg2);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1420(byte arg0);

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILha;)V")
    public static final void method1421(int arg0, class544 arg1) {
        field3114++;
        class519.field7510 = new class484[class440.field6416.length];
        if (arg0 <= 82) {
            return;
        }
        for (int var2 = 0; var2 < class440.field6416.length; var2++) {
            int var3 = class440.field6416[var2];
            class54 var4 = class273.method1796(-86, class411.field6065, var3);
            class400 var5 = arg1.method424(var4, class726.method4016(class549.field7836, var3), true);
            class519.field7510[var2] = new class484(var5, var4);
        }
    }

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "(I)Z")
    public abstract boolean method1422(int arg0);

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Leq;I)V")
    public class186(class137 arg0, int arg1) {
        this.field3113 = arg0;
        this.field3112 = arg1;
    }
}
