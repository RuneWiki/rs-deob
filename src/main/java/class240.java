import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class240 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lig;")
    public static final class219 method1554(int arg0, int arg1) {
        field3480++;
        class219 var2 = (class219) class169.field2411.method1896((long) arg0, (byte) 125);
        if (arg1 != 0) {
            return null;
        } else if (var2 == null) {
            byte[] var3;
            if (arg0 < 32768) {
                var3 = class452.field6420.method2691(arg0, 0, 0);
            } else {
                var3 = class1.field18.method2691(arg0 & 0x7FFF, 0, 0);
            }
            class219 var4 = new class219();
            if (var3 != null) {
                var4.method1443(true, new class446(var3));
            }
            if (arg0 >= 32768) {
                var4.method1446(true);
            }
            class169.field2411.method1898((long) arg0, var4, (byte) 6);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Lpa;")
    public static final class456 method1555(int arg0, int arg1) {
        field3482++;
        if (arg0 == 0) {
            return new class295();
        } else if (arg0 == 1) {
            return new class23();
        } else if (arg0 == 2) {
            return new class395();
        } else if (arg0 == 3) {
            return new class428();
        } else if (arg0 == 4) {
            return new class119();
        } else if (arg0 == 5) {
            return new class28();
        } else if (arg0 == 6) {
            return new class137();
        } else if (arg0 == 7) {
            return new class163();
        } else if (arg0 == 8) {
            return new class269();
        } else if (arg0 == 9) {
            return new class314();
        } else if (arg0 == 10) {
            return new class483();
        } else if (arg0 == 11) {
            return new class225();
        } else if (arg0 == 12) {
            return new class384();
        } else if (arg0 == 13) {
            return new class324();
        } else if (arg0 == 14) {
            return new class52();
        } else if (arg0 == 15) {
            return new class183();
        } else if (arg0 == 16) {
            return new class103();
        } else if (arg0 == 17) {
            return new class469();
        } else if (arg0 == 18) {
            return new class386();
        } else if (arg0 == 19) {
            return new class410();
        } else if (arg0 == 20) {
            return new class299();
        } else if (arg0 == 21) {
            return new class443();
        } else if (arg0 == 22) {
            return new class65();
        } else if (arg0 == 23) {
            return new class485();
        } else if (arg0 == 24) {
            return new class4();
        } else if (arg0 == 25) {
            return new class141();
        } else if (arg0 == 26) {
            return new class210();
        } else if (arg0 == 27) {
            return new class138();
        } else if (arg0 == 28) {
            return new class454();
        } else if (arg0 == 29) {
            return new class142();
        } else if (arg0 == 30) {
            return new class78();
        } else if (arg0 == 31) {
            return new class424();
        } else if (arg0 == 32) {
            return new class492();
        } else if (arg0 == 33) {
            return new class331();
        } else if (arg0 == 34) {
            return new class105();
        } else if (arg0 == 35) {
            return new class238();
        } else if (arg0 == 36) {
            return new class72();
        } else if (arg0 == 37) {
            return new class253();
        } else if (arg0 == 38) {
            return new class318();
        } else if (arg0 == 39) {
            return new class346();
        } else if (arg1 == 1220) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(II)V")
    public class240(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!j", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3481++;
        throw new IllegalStateException();
    }
}
