import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class227 extends class64 {

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "J")
    public long field3984;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "Lid;")
    private static class149 field3975 = class60.method382("M", (byte) 97);

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "[Lid;")
    public static class149[] field3973 = new class149[100];

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Lid;")
    public static class149 field3974 = class60.method382("brillant3:", (byte) 27);

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "Lid;")
    public static class149 field3981 = class60.method382("<)4col>", (byte) 116);

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "Lid;")
    public static class149 field3980 = field3975;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "Lid;")
    public static class149 field3985 = field3975;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "Lid;")
    public static class149 field3983 = class60.method382("classement ", (byte) 63);

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field3986 = 3353893;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZIZI)V")
    public static final void method1521(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        class99.field1749 = 0L;
        field3977++;
        int var5 = class79.method600(107);
        if (arg2 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (class29.field433.startsWith("mac") && arg2 > 0) {
            arg3 = true;
        }
        boolean var6 = false;
        if (arg2 > 0 != var5 > 0) {
            var6 = true;
        }
        if (arg3 && arg2 > 0) {
            var6 = true;
        }
        if (arg1) {
            class19.method108(arg2, 34, arg0, var5, var6, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)V")
    public static final void method1522(int arg0, boolean arg1) {
        class124.field2189.method1289(arg0, 103);
        class98.field1743.method1289(arg0, 80);
        if (!arg1) {
            class127.field2234.method1289(arg0, 106);
            field3978++;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
    public static void method1523(byte arg0) {
        if (arg0 < 11) {
            return;
        }
        field3983 = null;
        field3981 = null;
        field3980 = null;
        field3974 = null;
        field3975 = null;
        field3985 = null;
        field3973 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class253.method1749(arg3, false);
        field3982++;
        int var7 = 0;
        if (arg2 < 1) {
            field3986 = -78;
        }
        int var8 = arg3 - arg0;
        int var9 = -arg3;
        int var10 = arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var11 = var8;
        int var12 = -var8;
        if (arg6 >= class224.field3940 && class94.field1655 >= arg6) {
            int[] var13 = class15.field220[arg6];
            int var14 = class47.method303(arg4 - arg3, class192.field3449, class257.field4496, 65535);
            int var15 = class47.method303(arg3 + arg4, class192.field3449, class257.field4496, 65535);
            int var16 = class47.method303(arg4 - var8, class192.field3449, class257.field4496, 65535);
            int var17 = class47.method303(arg4 + var8, class192.field3449, class257.field4496, 65535);
            class141.method987(2, var14, var13, var16, arg1);
            class141.method987(2, var16, var13, var17, arg5);
            class141.method987(2, var17, var13, var15, arg1);
        }
        int var18 = -1;
        int var19 = -1;
        while (var10 > var7) {
            var19 += 2;
            var18 += 2;
            var9 += var18;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class73.field1267[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                int var20 = arg6 - var10;
                var9 -= var10 << 1;
                int var21 = arg6 + var10;
                if (var21 >= class224.field3940 && class94.field1655 >= var20) {
                    if (var10 < var8) {
                        int var22 = class73.field1267[var10];
                        int var23 = class47.method303(arg4 + var7, class192.field3449, class257.field4496, 65535);
                        int var24 = class47.method303(arg4 - var7, class192.field3449, class257.field4496, 65535);
                        int var25 = class47.method303(arg4 + var22, class192.field3449, class257.field4496, 65535);
                        int var26 = class47.method303(arg4 - var22, class192.field3449, class257.field4496, 65535);
                        if (var21 <= class94.field1655) {
                            int[] var27 = class15.field220[var21];
                            class141.method987(2, var24, var27, var26, arg1);
                            class141.method987(2, var26, var27, var25, arg5);
                            class141.method987(2, var25, var27, var23, arg1);
                        }
                        if (var20 >= class224.field3940) {
                            int[] var28 = class15.field220[var20];
                            class141.method987(2, var24, var28, var26, arg1);
                            class141.method987(2, var26, var28, var25, arg5);
                            class141.method987(2, var25, var28, var23, arg1);
                        }
                    } else {
                        int var29 = class47.method303(arg4 + var7, class192.field3449, class257.field4496, 65535);
                        int var30 = class47.method303(arg4 - var7, class192.field3449, class257.field4496, 65535);
                        if (class94.field1655 >= var21) {
                            class141.method987(2, var30, class15.field220[var21], var29, arg1);
                        }
                        if (class224.field3940 <= var20) {
                            class141.method987(2, var30, class15.field220[var20], var29, arg1);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (var32 >= class224.field3940 && class94.field1655 >= var31) {
                int var33 = arg4 + var10;
                int var34 = arg4 - var10;
                if (class257.field4496 <= var33 && var34 <= class192.field3449) {
                    int var35 = class47.method303(var33, class192.field3449, class257.field4496, 65535);
                    int var36 = class47.method303(var34, class192.field3449, class257.field4496, 65535);
                    if (var8 > var7) {
                        int var37 = var7 <= var11 ? var11 : class73.field1267[var7];
                        int var38 = class47.method303(arg4 + var37, class192.field3449, class257.field4496, 65535);
                        int var39 = class47.method303(arg4 - var37, class192.field3449, class257.field4496, 65535);
                        if (var32 <= class94.field1655) {
                            int[] var40 = class15.field220[var32];
                            class141.method987(2, var36, var40, var39, arg1);
                            class141.method987(2, var39, var40, var38, arg5);
                            class141.method987(2, var38, var40, var35, arg1);
                        }
                        if (class224.field3940 <= var31) {
                            int[] var41 = class15.field220[var31];
                            class141.method987(2, var36, var41, var39, arg1);
                            class141.method987(2, var39, var41, var38, arg5);
                            class141.method987(2, var38, var41, var35, arg1);
                        }
                    } else {
                        if (var32 <= class94.field1655) {
                            class141.method987(2, var36, class15.field220[var32], var35, arg1);
                        }
                        if (var31 >= class224.field3940) {
                            class141.method987(2, var36, class15.field220[var31], var35, arg1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class227() {
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(J)V")
    public class227(long arg0) {
        this.field3984 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JIIBZ)Lid;")
    public static final class149 method1525(long arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        class149 var6 = class167.method1215((byte) -108, 0);
        if (arg0 < 0L) {
            arg0 = -arg0;
            var6.method1066(-63, class96.field1696);
        }
        class149 var7 = class103.field1809;
        class149 var8 = class155.field2837;
        field3976++;
        if (arg1 == 1) {
            var8 = class103.field1809;
            var7 = class155.field2837;
        }
        if (arg3 <= 91) {
            field3980 = null;
        }
        if (arg1 == 2) {
            var7 = class155.field2837;
            var8 = class45.field685;
        }
        if (arg1 == 3) {
            var8 = class103.field1809;
            var7 = class155.field2837;
        }
        class149 var9 = class167.method1215((byte) -97, 0);
        for (int var10 = 0; var10 < arg2; var10++) {
            var9.method1066(-63, class211.method1434((int) (arg0 % 10L), true));
            arg0 /= 10L;
        }
        int var11 = 0;
        class149 var12;
        if (arg0 == 0L) {
            var12 = class13.field174;
        } else {
            class149 var13 = class167.method1215((byte) -104, 0);
            var12 = var13;
            while (arg0 > 0L) {
                if (arg4 && var11 != 0 && var11 % 3 == 0) {
                    var13.method1066(-63, var8);
                }
                var13.method1066(-63, class211.method1434((int) (arg0 % 10L), true));
                arg0 /= 10L;
                var11++;
            }
        }
        if (var9.method1053((byte) -124) > 0) {
            var9.method1066(-63, var7);
        }
        return class237.method1603(new class149[] { var6, var12.method1017((byte) 92), var9.method1017((byte) 92) }, -124);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZI)I")
    public static final int method1526(int arg0, int arg1, boolean arg2, int arg3) {
        field3979++;
        int var4 = arg0 - 1 & arg1;
        int var5 = arg1 / arg0;
        int var6 = arg3 / arg0;
        int var7 = arg0 - 1 & arg3;
        int var8 = class84.method625(var6, true, var5);
        int var9 = class84.method625(var6, true, var5 + 1);
        int var10 = class84.method625(var6 + 1, arg2, var5);
        int var11 = class84.method625(var6 + 1, arg2, var5 + 1);
        int var12 = class183.method1271(arg0, var9, var8, var4, (byte) 120);
        int var13 = class183.method1271(arg0, var11, var10, var4, (byte) 117);
        return class183.method1271(arg0, var13, var12, var7, (byte) 116);
    }
}
