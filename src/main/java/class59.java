import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class59 extends class275 {

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "J")
    public static long field848 = 0L;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field851 = -1;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field849 = 0;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field858 = 0;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Lqj;")
    public static class238 field857;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lro;")
    public static class249 field853;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Luc;")
    public class59 field859;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Luc;")
    public class59 field860;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 6)
    public static final void method396(int arg0) {
        field854++;
        class24 var1 = class51.field755;
        synchronized (class51.field755) {
            class51.field755.method204((byte) 56);
        }
        if (arg0 != 5) {
            field849 = -123;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 32)
    public static final void method397(int arg0) {
        field855++;
        class58.method393(5, -558);
        class372.method2461(5, (byte) -74);
        class361.method2374(5, -102);
        class421.method2710(5, 9);
        class132.method895(false, 5);
        class75.method463(40, 5);
        class444.method2797(5, (byte) 50);
        class355.method2327(5, (byte) -60);
        class373.method2472((byte) -1, 5);
        class432.method2744(5, (byte) 10);
        class50.method343(5, 32);
        class292.method1874(-12425, 5);
        if (arg0 < 20) {
            field851 = 109;
        }
        class97.method635(5, false);
        class442.method2792(1311157154, 5);
        class19.method152((byte) 34, 5);
        class269.method1733(5, 0);
        class437.method2763(true, 5);
        class381.method2510(5, 48);
        class329.method2023(106, 5);
        class191.method1189(5, (byte) 103);
        class278.method1777(50, -8);
        class390.method2547(5, (byte) 30);
        class332.method2205(7000, 5);
        class169.field2232.method215(0, 5);
        class26.field475.method215(0, 5);
        class142.field1869.method215(0, 5);
        class93.field1274.method215(0, 5);
        class365.field5353.method215(0, 5);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I", line = 71)
    public static final int method398(int arg0, int arg1) {
        field850++;
        if (arg1 < 0) {
            return 0;
        }
        class363 var2 = (class363) class157.field2069.method954(-64, (long) arg1);
        if (var2 == null) {
            return class261.method1641(5, arg1).field3454;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field5302.length; var4++) {
            if (var2.field5302[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class261.method1641(arg0, arg1).field3454 - var2.field5302.length);
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V", line = 104)
    public static void method399(int arg0) {
        int var1 = -10 / ((61 - arg0) / 50);
        field857 = null;
        field853 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILil;)Ljo;", line = 116)
    public static final class219 method400(int arg0, class265 arg1) {
        if (arg0 < 36) {
            return null;
        } else {
            field852++;
            return new class219(arg1.method1698(1625554944), arg1.method1698(1625554944), arg1.method1698(1625554944), arg1.method1698(1625554944), arg1.method1691(false), arg1.method1691(false), arg1.method1697(-115));
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V", line = 132)
    public final void method401(int arg0) {
        field856++;
        if (this.field860 == null) {
            return;
        }
        this.field860.field859 = this.field859;
        this.field859.field860 = this.field860;
        if (arg0 != 5) {
            field853 = null;
        }
        this.field859 = null;
        this.field860 = null;
    }
}
