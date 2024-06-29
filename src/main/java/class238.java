import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class238 {

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[I")
    public static int[] field3775 = new int[64];

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lps;")
    public static class82 field3776;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)I", line = 5)
    public static final int method1709(int arg0) {
        field3777++;
        return arg0 == -24461 ? class389.field6017 : -83;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lri;I)V", line = 21)
    public static final void method1712(class97 arg0, int arg1) {
        field3774++;
        if (arg1 <= 90) {
            field3776 = null;
        }
        class229.field3673 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V", line = 35)
    public static void method1714(boolean arg0) {
        if (arg0) {
            field3775 = null;
        }
        field3776 = null;
        field3775 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Lis;", line = 46)
    public static final class464 method1715(byte arg0) {
        field3772++;
        if (arg0 != -40) {
            method1714(true);
        }
        try {
            return new class32();
        } catch (Throwable var2) {
            try {
                return (class464) Class.forName("lv").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class190();
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 74)
    public static final void method1716(byte arg0) {
        if (arg0 != -40) {
            field3776 = null;
        }
        field3773++;
        class623 var1 = (class623) class655.field9149.method3465((byte) 113);
        boolean var2 = class573.field8182 != null || class301.field4696 > 0;
        if (var2) {
            class5.field33 = 1;
        }
        if (class159.field2705 && class83.field1024.method1515(81, -122) && class52.field693 > 2) {
            if (var2) {
                class703.field9896 = (class295) class307.field4831.field8428.field853.field853;
            } else {
                class548.method3312((class295) class307.field4831.field8428.field853.field853, var1.method2600(25), var1.method2596(true), (byte) 118);
            }
        } else if (var2) {
            class703.field9896 = (class295) class307.field4831.field8428.field853;
        } else {
            class548.method3312((class295) class307.field4831.field8428.field853, var1.method2600(25), var1.method2596(true), (byte) 118);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    public abstract int method1710(int arg0, int arg1);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
    public abstract void method1711(boolean arg0, int arg1);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lit;")
    public abstract class599 method1713(int arg0);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZI)[B")
    public abstract byte[] method1717(boolean arg0, int arg1);
}
