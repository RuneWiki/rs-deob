import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class class247 extends class77 {

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "Lbo;")
    public static class16 field3654 = new class16();

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3655 = null;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field3661 = new String[8];

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "Lth;")
    public static class57 field3658 = new class57(64);

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "Z")
    public static boolean field3664 = true;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "[[Lnk;")
    public static class224[][] field3663;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lqm;II)V", line = 10)
    public static final void method1812(class228 arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            method1813((byte) -98, -25);
        }
        class349 var3 = (class349) class50.field746.method1405((long) arg1, false);
        field3660++;
        if (var3 == null) {
            return;
        }
        if (var3.field5405 != null) {
            class179.field2576.method1397(var3.field5405);
            var3.field5405 = null;
        }
        var3.method876(8);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)V", line = 39)
    public static final void method1813(byte arg0, int arg1) {
        if (arg0 < 103) {
            method1815(68);
        }
        field3656++;
        class172.field2478.method464(3398, arg1);
        class209.field3048.method464(3398, arg1);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V", line = 52)
    public static final void method1814(String arg0, int arg1, String arg2, int arg3, int arg4, String arg5) {
        class142.method1026((String) null, arg5, arg2, arg1, arg4, arg3, (byte) 30, arg0);
        field3657++;
    }

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)V", line = 60)
    public static final void method1815(int arg0) {
        if (class255.field3805 != null) {
            class36 var1 = class255.field3805;
            synchronized (class255.field3805) {
                class255.field3805 = null;
            }
        }
        if (arg0 != 2047) {
            field3664 = false;
        }
        field3662++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIILjava/lang/String;ILkc;ILqf;IZ)V", line = 87)
    public static final void method1816(int arg0, int arg1, int arg2, String arg3, int arg4, class29 arg5, int arg6, class359 arg7, int arg8, boolean arg9) {
        field3659++;
        int var10;
        if (class86.field1208 == 4) {
            var10 = (int) class36.field535 & 0x7FF;
        } else {
            var10 = (int) class36.field535 + class298.field4460 & 0x7FF;
        }
        int var11 = Math.max(arg7.field5506 / 2, arg7.field5560 / 2) + 10;
        int var12 = arg0 * arg0 + arg6 * arg6;
        if ((var11 * var11) < var12) {
            return;
        }
        int var13 = class345.field5339[var10];
        int var14 = class345.field5343[var10];
        if (class86.field1208 != 4) {
            var14 = var14 * 256 / (class281.field4271 + 256);
            var13 = var13 * 256 / (class281.field4271 + 256);
        }
        int var15 = arg0 * var14 - (arg6 * var13) >> 16;
        int var16 = arg0 * var13 + arg6 * var14 >> 16;
        int var17 = arg5.method185(arg3, 100);
        int var18 = var16 - var17 / 2;
        int var19 = arg5.method187(arg3, 100, 0);
        if (!arg9) {
            field3661 = (String[]) null;
        }
        if (var18 < (-arg7.field5506) || arg7.field5506 < var18 || -arg7.field5560 > var15 || var15 > arg7.field5560) {
            return;
        }
        if (class141.field2031) {
            class205.method1502((class325) arg7.method2493(124, false));
        } else {
            class44.method323(arg7.field5570, arg7.field5591);
        }
        arg5.method205(arg3, var18 + arg4 + (arg7.field5506 / 2), -var15 - arg2 + arg7.field5560 / 2 + -var19 + arg8, var17, 50, arg1, 0, 256, 1, 0, 0);
        if (class141.field2031) {
            class205.method1494();
        } else {
            class44.method330();
        }
    }

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "(I)V", line = 146)
    public static void method1817(int arg0) {
        field3655 = null;
        field3654 = null;
        field3658 = null;
        if (arg0 == -29023) {
            field3661 = null;
            field3663 = (class224[][]) null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method716(int arg0);

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)Z")
    public abstract boolean method715(byte arg0);
}
