import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class285 extends class170 {

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "Lqk;")
    public static class207 field5001 = class24.method212(255, "::mm");

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "Lqk;")
    private static class207 field5005 = class24.method212(255, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "Lqk;")
    public static class207 field4999 = field5005;

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "[I")
    public static int[] field5004 = new int[50];

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!pf", name = "eb", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!pf", name = "fb", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!pf", name = "gb", descriptor = "Lpk;")
    public static class99 field5008;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "[I")
    public static int[] field4998;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
    public static final int method1935(int arg0, int arg1) {
        ++field5003;
        int var2 = 75 / ((arg1 - 69) / 39);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field5006;
        int[] var3 = super.field3001.method1538(105, arg1);
        if (super.field3001.field3835) {
            class274.method1862(var3, 0, class88.field1595, class282.field4964[arg1]);
        }
        if (arg0 != -30) {
            method1939(true, 58);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILpk;ZZII)V")
    public static final void method1936(int arg0, int arg1, class99 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        ++field5002;
        class88.field1597 = arg2;
        class221.field4065 = 1;
        class138.field2386 = arg5;
        class288.field5147 = arg0;
        class78.field1417 = arg3;
        class165.field2924 = arg1;
        if (arg4) {
            field5008 = null;
        }
        class92.field1636 = arg6;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZII)Lta;")
    public static final class254 method1937(boolean arg0, int arg1, int arg2) {
        ++field5007;
        if (arg0) {
            field5005 = null;
        }
        for (class254 var3 = (class254) class157.field2786.method922((byte) 37); var3 != null; var3 = (class254) class157.field2786.method928(-52)) {
            if (var3.field4547 && var3.method1767(arg2, arg1, -1)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class285() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "(I)V")
    public static void method1938(int arg0) {
        field5001 = null;
        field5005 = null;
        field4999 = null;
        field5004 = null;
        field4998 = null;
        field5008 = null;
        if (arg0 != -1042) {
            method1936(-81, 81, (class99) null, false, false, -8, 36);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)Lqk;")
    public static final class207 method1939(boolean arg0, int arg1) {
        ++field5000;
        if (~arg1 < -1 && arg1 <= 255) {
            class207 var2 = new class207();
            var2.field3652 = new byte[1];
            if (!arg0) {
                return null;
            } else {
                var2.field3663 = 1;
                var2.field3652[0] = (byte) arg1;
                return var2;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
