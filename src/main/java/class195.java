import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class195 {

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Lpca;")
    private class714 field2599 = new class714(64);

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lfp;")
    private class323 field2594;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Z")
    public static boolean field2596 = false;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "D")
    public static double field2595;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field2601;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 3)
    public static void method1201(int arg0) {
        field2601 = null;
        if (arg0 >= -127) {
            field2595 = 1.7567499720467357D;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V", line = 13)
    public final void method1202(int arg0, int arg1) {
        class714 var3 = this.field2599;
        synchronized (this.field2599) {
            if (arg0 != 2341) {
                return;
            }
            this.field2599.method4016(arg1, (byte) -73);
        }
        field2593++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)Lcj;", line = 26)
    public final class692 method1203(int arg0, byte arg1) {
        field2604++;
        if (arg1 <= 67) {
            this.method1204(true);
        }
        class714 var3 = this.field2599;
        class692 var4;
        synchronized (this.field2599) {
            var4 = (class692) this.field2599.method4022((long) arg0, (byte) -64);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field2594;
        byte[] var6;
        synchronized (this.field2594) {
            var6 = this.field2594.method2100(arg0, (byte) 112, 35);
        }
        class692 var7 = new class692();
        if (var6 != null) {
            var7.method3890(new class675(var6), 125);
        }
        var7.method3891(-16661);
        class714 var8 = this.field2599;
        synchronized (this.field2599) {
            this.field2599.method4018((byte) 125, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V", line = 65)
    public final void method1204(boolean arg0) {
        if (arg0) {
            field2596 = false;
        }
        class714 var2 = this.field2599;
        synchronized (this.field2599) {
            this.field2599.method4024(0);
        }
        field2600++;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Lem;", line = 87)
    public static final class223 method1205(int arg0) {
        field2602++;
        int var1 = -122 / ((48 - arg0) / 36);
        return class165.field2262;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V", line = 101)
    public final void method1206(int arg0) {
        if (arg0 != 35) {
            method1207((byte) -108, 109, -15, 75, -49, -68, 30);
        }
        field2597++;
        class714 var2 = this.field2599;
        synchronized (this.field2599) {
            this.field2599.method4023((byte) 62);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lsaa;ILfp;)V", line = 136)
    public class195(class326 arg0, int arg1, class323 arg2) {
        this.field2594 = arg2;
        if (this.field2594 != null) {
            this.field2594.method2084(35, 0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BIIIIII)Lmf;", line = 117)
    public static final class418 method1207(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 > -74) {
            field2595 = -0.54414779682267D;
        }
        field2598++;
        long var7 = (long) arg4 * 76724863L ^ (long) arg3 * 32147369L ^ (long) arg2 * 986053L ^ (long) arg1 * 475427L ^ (long) arg5 * 67481L ^ (long) arg6 * 97549L;
        class418 var9 = (class418) class377.field5286.method4022(var7, (byte) -62);
        if (var9 == null) {
            class418 var10 = class452.field6394.method448(arg5, arg6, arg1, arg2, arg3, arg4);
            class377.field5286.method4018((byte) 127, var10, var7);
            return var10;
        } else {
            return var9;
        }
    }
}
