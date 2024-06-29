import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class19 {

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field342 = -1;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "J")
    public static long field341;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Z", line = 6)
    public static final boolean method127(int arg0) {
        int var1 = 78 % ((-arg0 - 42) / 38);
        field344++;
        return class249.field3893 ? true : class250.field3925;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I", line = 20)
    public static final int method128(int arg0) {
        if (arg0 == -1) {
            field340++;
            return class31.field569;
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Lsc;", line = 34)
    public class19 method17(int arg0, int arg1, int arg2) {
        field337++;
        return this;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()Z", line = 44)
    public boolean method34() {
        field339++;
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Lbf;", line = 53)
    public static final class328 method129(byte arg0, int arg1) {
        field336++;
        if (arg0 > -127) {
            field341 = 46L;
        }
        return (class328) class50.field1013.method303((long) arg1, (byte) 110);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lsc;IIIZ)V", line = 64)
    public void method38(class19 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field338++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lec;", line = 83)
    public static final class44 method130(int arg0, int arg1) {
        field335++;
        class44 var2 = (class44) class342.field5311.method1881(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class79.field1553.method2036(class277.method1863(arg0, arg1 ^ 0x5E27FB40), class329.method2281(arg0, true), (byte) 55);
        class44 var4 = new class44();
        var4.field895 = arg0;
        if (var3 != null) {
            var4.method331(new class202(var3), 0);
        }
        var4.method332((byte) -105);
        class342.field5311.method1880(var4, (long) arg0, 124);
        if (arg1 != -5881) {
            field342 = 56;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()I")
    public abstract int method39();

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
    public abstract void method35(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIIJILgl;)V")
    public abstract void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class275 arg10);
}
