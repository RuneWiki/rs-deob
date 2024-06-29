import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class99 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public int field1222 = -1;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Ljm;")
    public static class167 field1232 = new class167("", 17);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public int field1221;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lam;")
    public static final class296 method653(int arg0, int arg1) {
        field1233++;
        class363 var2 = class47.field615;
        class296 var3;
        synchronized (class47.field615) {
            var3 = (class296) class47.field615.method2310((byte) -128, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class130.field1733.method715(class100.method661(68, arg0), (byte) 101, class239.method1608(arg0, 218943466));
        class296 var5 = new class296();
        if (var4 != null) {
            var5.method1968(new class256(var4), (byte) 113);
        }
        class363 var6 = class47.field615;
        synchronized (class47.field615) {
            class47.field615.method2299(true, var5, (long) arg0);
            if (arg1 >= -110) {
                field1232 = null;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)Lkg;")
    public static final class223 method654(int arg0, int arg1, int arg2) {
        field1236++;
        class223 var3 = class432.method2655((byte) -124, arg1);
        if (arg0 == arg2) {
            return var3;
        } else if (var3 == null || var3.field3340 == null || arg2 >= var3.field3340.length) {
            return null;
        } else {
            return var3.field3340[arg2];
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method655(int arg0) {
        if (arg0 <= 97) {
            method655(72);
        }
        class22.field311 = null;
        class83.field1022 = null;
        class148.field2016 = null;
        class104.field1387 = null;
        class386.field5644 = null;
        field1220++;
        class429.field6239 = null;
        class336.field4966 = null;
        class452.field6676 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII)I")
    public static final int method656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg5;
            arg5 = var7;
        }
        int var8 = arg0 & 0x3;
        field1227++;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg6;
        } else {
            if (arg3 < 99) {
                method657(-4, -71, false);
            }
            return var8 == 2 ? 7 - (arg4 - 1) - arg2 : -arg6 + 1 + -arg5 + 7;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZ)I")
    public static final int method657(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1232 = null;
        }
        field1229++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static void method658(int arg0) {
        field1232 = null;
        int var1 = -87 % ((arg0 - 51) / 47);
    }
}
