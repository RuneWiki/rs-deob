import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class202 extends class478 {

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    private int field2849;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    private int field2854;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    private int field2853;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    private int field2850;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Z")
    public static boolean field2847 = true;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "F")
    public static float field2857;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIZII)Ljba;", line = 4)
    public static final class363 method1338(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field2856;
        if (!arg4) {
            field2847 = false;
        }
        long var7 = (long) arg1 * 986053L ^ (long) arg6 * 67481L ^ (long) arg5 * 97549L ^ (long) arg2 * 475427L ^ (long) arg0 * 32147369L ^ (long) arg3 * 76724863L;
        class363 var9 = (class363) class78.field1342.method2287(1, var7);
        if (var9 != null) {
            return var9;
        } else {
            class363 var10 = class512.field7202.method117(arg6, arg5, arg2, arg1, arg0, arg3);
            class78.field1342.method2291(var10, var7, 1);
            return var10;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V", line = 26)
    public final void method1339(int arg0, int arg1, int arg2) {
        ++field2846;
        int var4 = this.field2854 * arg0 >> 12;
        if (arg1 != 0) {
            this.method1340(-24, -24, 103);
        }
        int var5 = this.field2853 * arg0 >> 12;
        int var6 = this.field2850 * arg2 >> 12;
        int var7 = this.field2849 * arg2 >> 12;
        class336.method2115(var6, super.field6795, var4, super.field6794, var7, super.field6796, var5, (byte) -39);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V", line = 45)
    public final void method1340(int arg0, int arg1, int arg2) {
        ++field2851;
        if (arg1 != 0) {
            method1341(98);
        }
        int var4 = this.field2854 * arg2 >> 12;
        int var5 = this.field2853 * arg2 >> 12;
        int var6 = this.field2850 * arg0 >> 12;
        int var7 = this.field2849 * arg0 >> 12;
        class689.method3795(var4, super.field6794, var5, super.field6795, -9101, var6, var7);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I", line = 65)
    public static final int method1341(int arg0) {
        ++field2852;
        class382 var1 = class341.field5007;
        synchronized (class341.field5007) {
            if (arg0 != 775699148) {
                method1341(-25);
            }
            return class341.field5007.method2284(true);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIII)V", line = 89)
    public class202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2849 = arg3;
        this.field2854 = arg0;
        this.field2853 = arg2;
        this.field2850 = arg1;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Ljava/lang/String;", line = 102)
    public static final String method1342(int arg0) {
        ++field2848;
        String var1 = "www";
        if (arg0 < 12) {
            method1338(-96, -6, -2, -40, true, 57, -76);
        }
        if (class379.field5372 == class261.field3970) {
            var1 = "www-wtrc";
        } else if (class379.field5372 == class331.field4889) {
            var1 = "www-wtqa";
        } else if (class667.field9412 == class379.field5372) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class31.field483 != null) {
            var2 = "/p=" + class31.field483;
        }
        return "http://" + var1 + "." + class586.field8208.field9737 + ".com/l=" + class512.field7203 + "/a=" + class40.field657 + var2 + "/";
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)V", line = 138)
    public final void method1343(int arg0, byte arg1, int arg2) {
        ++field2855;
        int var4 = this.field2854 * arg2 >> 12;
        int var5 = this.field2853 * arg2 >> 12;
        int var6 = this.field2850 * arg0 >> 12;
        if (arg1 != 56) {
            this.method1343(-10, (byte) 87, 68);
        }
        int var7 = this.field2849 * arg0 >> 12;
        class630.method3513(0, var4, var7, super.field6796, var5, var6);
    }
}
