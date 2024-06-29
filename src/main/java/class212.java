import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public abstract class class212 {

    @OriginalMember(owner = "client!su", name = "c", descriptor = "Ldh;")
    public class322 field3004;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public int field3006;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "Lmu;")
    public static class303 field3003 = new class303(108, 5);

    @OriginalMember(owner = "client!su", name = "k", descriptor = "[B")
    public static byte[] field3012 = new byte[520];

    @OriginalMember(owner = "client!su", name = "j", descriptor = "Lmu;")
    public static class303 field3011 = new class303(7, 3);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "Lmu;")
    public static class303 field3013;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "Lpg;")
    public static class730 field3015;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "Lin;")
    public static class91 field3014;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)[Lsk;")
    public static final class623[] method1453(int arg0) {
        if (arg0 > -110) {
            method1456(97);
        }
        field3009++;
        return new class623[] { class523.field7255, class270.field3806, class138.field2302 };
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)I")
    public abstract int method422(int arg0);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ILin;ILin;)V")
    public static final void method1454(int arg0, class91 arg1, int arg2, class91 arg3) {
        class47.field996 = arg3;
        field3008++;
        if (arg0 != 7) {
            field3014 = null;
        }
        class290.field4057 = arg1;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
    public abstract void method419(int arg0, int arg1);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ZI)V")
    public static final void method1455(boolean arg0, int arg1) {
        class615.method3485(class582.field7968, -1, class184.field2784, arg0, class467.field6559);
        if (arg1 == 520) {
            field3005++;
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(II)I")
    public abstract int method417(int arg0, int arg1);

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(I)V")
    public static void method1456(int arg0) {
        field3013 = null;
        field3011 = null;
        field3014 = null;
        field3003 = null;
        field3012 = null;
        field3015 = null;
        if (arg0 < 13) {
            method1453(-99);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V")
    public abstract void method418(boolean arg0);

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Ldh;)V")
    public class212(class322 arg0) {
        this.field3004 = arg0;
        this.field3006 = this.method422(20014);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIII)V")
    public static final void method1457(int arg0, int arg1, int arg2, int arg3) {
        class607.field8331 = new byte[arg3][arg2][arg1];
        if (arg0 != 19278) {
            method1457(35, 126, -83, 85);
        }
        field3002++;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(ILdh;)V")
    public class212(int arg0, class322 arg1) {
        this.field3004 = arg1;
        this.field3006 = arg0;
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(II)V")
    public final void method1458(int arg0, int arg1) {
        if (arg1 < 3) {
            this.method419(12, 42);
        }
        field3007++;
        if (this.method417(3, arg0) != 3) {
            this.method419(124, arg0);
        }
    }
}
