import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class28 extends class11 {

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public int field450 = 0;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "Z")
    public boolean field458 = true;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public int field463 = -1;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public int field467 = 0;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public int field461 = 12800;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public int field464 = -1;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public int field462 = 12800;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Ljava/lang/String;")
    public String field460;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Ljava/lang/String;")
    public String field465;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "Lgj;")
    public class593 field457;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "[I")
    public static int[] field452 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Ldb;")
    public static class298 field455 = new class298(59, 0);

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 211)
    public class28(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field456 = arg3;
        this.field460 = arg1;
        this.field458 = arg5;
        this.field465 = arg2;
        this.field466 = arg0;
        this.field464 = arg4;
        this.field463 = arg6;
        if (this.field463 == 255) {
            this.field463 = 0;
        }
        this.field457 = new class593();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Z", line = 10)
    public final boolean method239(int arg0, int arg1, int arg2) {
        field453++;
        if (arg0 != 12800) {
            return false;
        }
        for (class531 var4 = (class531) this.field457.method3257(-91); var4 != null; var4 = (class531) this.field457.method3263((byte) -84)) {
            if (var4.method2962(arg2, arg1, -26516)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 34)
    public final void method240(int arg0) {
        field454++;
        this.field461 = 12800;
        this.field467 = arg0;
        this.field450 = 0;
        this.field462 = 12800;
        for (class531 var2 = (class531) this.field457.method3257(-126); var2 != null; var2 = (class531) this.field457.method3263((byte) -88)) {
            if (this.field467 < var2.field7081) {
                this.field467 = var2.field7081;
            }
            if (var2.field7070 < this.field462) {
                this.field462 = var2.field7070;
            }
            if (this.field450 < var2.field7077) {
                this.field450 = var2.field7077;
            }
            if (var2.field7072 < this.field461) {
                this.field461 = var2.field7072;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([IBII)Z", line = 79)
    public final boolean method241(int[] arg0, byte arg1, int arg2, int arg3) {
        field459++;
        class531 var5 = (class531) this.field457.method3257(-5);
        if (arg1 < 98) {
            return true;
        }
        while (var5 != null) {
            if (var5.method2964(50, arg2, arg3)) {
                var5.method2965(arg2, (byte) 125, arg3, arg0);
                return true;
            }
            var5 = (class531) this.field457.method3263((byte) -104);
        }
        return false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([Ljava/lang/Object;[JB)V", line = 104)
    public static final void method242(Object[] arg0, long[] arg1, byte arg2) {
        class688.method3825(arg0, 0, arg1, false, arg1.length - 1);
        field469++;
        int var3 = -125 / ((arg2 - 9) / 50);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III[I)Z", line = 127)
    public final boolean method243(int arg0, int arg1, int arg2, int[] arg3) {
        field468++;
        class531 var5 = (class531) this.field457.method3257(-46);
        if (arg0 < 20) {
            this.method240(-25);
        }
        while (var5 != null) {
            if (var5.method2962(arg1, arg2, -26516)) {
                var5.method2961(arg2, 6, arg1, arg3);
                return true;
            }
            var5 = (class531) this.field457.method3263((byte) -95);
        }
        return false;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V", line = 161)
    public static void method244(boolean arg0) {
        field455 = null;
        if (arg0) {
            field455 = null;
        }
        field452 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III[II)Z", line = 172)
    public final boolean method245(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        int var6 = -69 / ((64 - arg0) / 37);
        field451++;
        for (class531 var7 = (class531) this.field457.method3257(-125); var7 != null; var7 = (class531) this.field457.method3263((byte) -74)) {
            if (var7.method2960(arg2, arg1, 1, arg4)) {
                var7.method2961(arg2, 6, arg4, arg3);
                return true;
            }
        }
        return false;
    }
}
