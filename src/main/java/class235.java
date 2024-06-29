import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class235 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lqk;")
    public static class207 field4336 = null;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Z")
    public static boolean field4342 = false;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lqk;")
    private static class207 field4339 = class24.method212(255, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lqk;")
    public static class207 field4340 = field4339;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lqk;")
    public static class207 field4346 = class24.method212(255, "Chargement de la liste des serveurs");

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lqk;")
    public static class207 field4348 = class24.method212(255, "Attaquer");

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZILpk;ILpk;)Lrg;")
    public static final class226 method1677(boolean arg0, int arg1, class99 arg2, int arg3, class99 arg4) {
        field4347++;
        if (arg0) {
            return null;
        } else if (class78.method594(arg3, arg4, -94, arg1)) {
            return class256.method1778(arg2.method705(arg3, arg1, -1), arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
    public abstract void method81(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Ldc;")
    public class235 method1509(int arg0, int arg1, int arg2) {
        field4343++;
        return this;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(JIIIIILqk;)V")
    public static final void method1678(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class207 arg6) {
        field4337++;
        class149 var8 = new class149(128);
        var8.method1041(true, 10);
        var8.method1083(false, (int) (Math.random() * 99999.0D));
        var8.method1083(false, 529);
        var8.method1048((byte) 122, arg0);
        var8.method1068((int) (Math.random() * 9.9999999E7D), arg4 - 99999891);
        var8.method1040(true, arg6);
        var8.method1068((int) (Math.random() * 9.9999999E7D), 116);
        var8.method1083(false, class156.field2737);
        var8.method1041(true, arg5);
        var8.method1041(true, arg3);
        var8.method1068((int) (Math.random() * 9.9999999E7D), 127);
        var8.method1083(false, arg1);
        var8.method1083(false, arg2);
        var8.method1068((int) ((double) arg4 * Math.random()), 122);
        var8.method1071(class183.field3253, class80.field1462, 0);
        class261.field4645.field2593 = 0;
        class261.field4645.method1041(true, 81);
        class261.field4645.method1041(true, var8.field2593);
        class261.field4645.method1039((byte) 117, 0, var8.field2593, var8.field2568);
        class242.field4411 = 1;
        class55.field1022 = 0;
        class216.field3848 = 0;
        class25.field521 = -3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static final void method1679(int arg0) {
        if (arg0 != 99999999) {
            method1679(-44);
        }
        class65.field1165.method1382(31346);
        field4341++;
        class115.field1993.method1382(31346);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIIJILe;)V")
    public abstract void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()I")
    public abstract int method80();

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method1680(int arg0) {
        int var1 = 118 / ((-arg0 - 56) / 57);
        field4339 = null;
        field4346 = null;
        field4348 = null;
        field4336 = null;
        field4340 = null;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public static final void method1681(int arg0) {
        field4345++;
        if (class95.field1690 == null || class207.field3689 == null) {
            class207.field3689 = new int[256];
            class95.field1690 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var3 = (double) var1 / 255.0D * 6.283185307179586D;
                class95.field1690[var1] = (int) (Math.sin(var3) * 4096.0D);
                class207.field3689[var1] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        int var2 = 74 / ((arg0 + 63) / 59);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()Z")
    public boolean method1506() {
        field4344++;
        return false;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ldc;IIIZ)V")
    public void method1489(class235 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4338++;
    }
}
