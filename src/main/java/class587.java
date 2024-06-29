import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class587 extends class288 {

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
    public int field7782;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
    public int field7788;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "Llj;")
    public static class570 field7784 = new class570(0, 2, 2, 1);

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    public static int field7786 = -1;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Los;")
    public final class412 method193(byte arg0) {
        if (arg0 >= -21) {
            field7786 = 41;
        }
        field7780++;
        return class137.field2224;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIILdd;Lba;)V")
    public static final void method3229(int arg0, int arg1, int arg2, int arg3, class660 arg4, class358 arg5) {
        if (arg1 != 2) {
            method3232(42);
        }
        field7777++;
        if (arg5 != null) {
            arg4.method3699(arg5.method1934(), arg5.method1936(), arg5.method1952(), arg5.method1940(), (byte) -81, arg2, arg3, arg0, arg5.method1939(), arg5.method1951(), arg5.method1935());
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B[BI)[B")
    public static final byte[] method3230(byte arg0, byte[] arg1, int arg2) {
        field7785++;
        byte[] var3 = new byte[arg2];
        class83.method686(arg1, 0, var3, 0, arg2);
        if (arg0 < 112) {
            method3231(false, -107);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)I")
    public static final int method3231(boolean arg0, int arg1) {
        field7779++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (!arg0) {
            field7784 = null;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lrt;Lcp;IIIIIIIII)V")
    public class587(class212 arg0, class679 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7782 = arg9;
        this.field7788 = arg10;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public static final void method3232(int arg0) {
        field7778++;
        if (arg0 != -1) {
            return;
        }
        class148.method1065(64, false);
        if (class25.field427 >= 0 && class25.field427 != 0) {
            class405.method2326(class25.field427, -113);
            class25.field427 = -1;
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
    public static final void method3233(int arg0) {
        field7781++;
        if (arg0 != -18117) {
            return;
        }
        for (class135 var1 = (class135) class94.field1444.method3257(-124); var1 != null; var1 = (class135) class94.field1444.method3263((byte) -81)) {
            if (var1.field2205 == -1) {
                var1.field2202 = 0;
                if (var1.field2195 >= 0 && var1.field2198 >= 0 && var1.field2195 < class34.field530 && class34.field531 > var1.field2198) {
                    class125.method966(var1, 0);
                }
            } else {
                var1.method2797(58);
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V")
    public static void method3234(int arg0) {
        if (arg0 > -24) {
            field7784 = null;
        }
        field7784 = null;
    }
}
