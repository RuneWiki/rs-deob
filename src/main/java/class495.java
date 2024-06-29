import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public abstract class class495 extends class86 {

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "Lrl;")
    public class487 field7537;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "Lgn;")
    public static class475 field7542 = new class475(48, 8);

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public static int field7547 = -1;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "Z")
    public boolean field7546;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)I", line = 5)
    public final int method2970(int arg0) {
        field7540++;
        if (arg0 >= -42) {
            this.method1913(76, null, -99, null);
        }
        return 1;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)V", line = 21)
    public static void method2971(boolean arg0) {
        field7542 = null;
        if (!arg0) {
            field7547 = -52;
        }
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)Z", line = 31)
    public final boolean method2972(int arg0) {
        if (arg0 != 10370) {
            field7547 = 57;
        }
        field7543++;
        return false;
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(B)Z", line = 46)
    public final boolean method2973(byte arg0) {
        if (arg0 != -85) {
            this.field7537 = null;
        }
        field7539++;
        return this.field7546;
    }

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "(I)I", line = 58)
    public int method1906(int arg0) {
        field7541++;
        return arg0 == 2048 ? 0 : -115;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZJILjava/lang/String;IIILjava/lang/String;IZI)V", line = 75)
    public static final void method2974(boolean arg0, long arg1, int arg2, String arg3, int arg4, int arg5, int arg6, String arg7, int arg8, boolean arg9, int arg10) {
        field7538++;
        if (!class174.field2387 && class383.field5696 < 500) {
            int var12 = arg4 == arg10 ? class450.field6553 : arg10;
            class262 var13 = new class262(arg3, arg7, var12, arg2, arg6, arg1, arg5, arg8, arg0, arg9);
            class230.field3220.method2086((byte) -126, var13);
            class383.field5696++;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)Lpj;", line = 93)
    public static final class94 method2975(int arg0, int arg1) {
        field7545++;
        class94[] var2 = class311.method1863(89);
        if (arg0 > -107) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class94 var4 = var2[var3];
            if (var4.field1264 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIBII)V", line = 119)
    public static final void method2976(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = 30 % ((arg2 - 20) / 55);
        field7544++;
        class338 var6 = class380.method2294((byte) 120, arg3, 8);
        var6.method2052((byte) -62);
        var6.field4926 = arg1;
        var6.field4924 = arg0;
        var6.field4930 = arg4;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lrl;)V", line = 138)
    public class495(class487 arg0) {
        this.field7537 = arg0;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V")
    public abstract void method1908(int arg0, int arg1);

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)Z")
    public abstract boolean method1905(int arg0);

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V")
    public abstract void method1911(int arg0);

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILud;ILud;)V")
    public abstract void method1913(int arg0, class26 arg1, int arg2, class26 arg3);

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZII)V")
    public abstract void method1909(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)Z")
    public abstract boolean method1904(int arg0);
}
