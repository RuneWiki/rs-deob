import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class118 {

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field1813 = -1;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "Lqf;")
    public class64 field1810;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "Lkk;")
    public class77 field1809;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1002(byte arg0) {
        class244.field3803.method1630((byte) 35);
        int var1 = class244.field3803.method1632(14538, 8);
        if (class6.field80 > var1) {
            for (int var2 = var1; var2 < class6.field80; var2++) {
                class318.field4903[class130.field2176++] = class126.field2114[var2];
            }
        }
        field1811++;
        if (class6.field80 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class6.field80 = 0;
        int var3 = 0;
        if (arg0 <= 37) {
            return;
        }
        while (var1 > var3) {
            int var4 = class126.field2114[var3];
            class244 var5 = class110.field1683[var4];
            int var6 = class244.field3803.method1632(14538, 1);
            if (var6 == 0) {
                class126.field2114[class6.field80++] = var4;
                var5.field1385 = class360.field5718;
            } else {
                int var7 = class244.field3803.method1632(14538, 2);
                if (var7 == 0) {
                    class126.field2114[class6.field80++] = var4;
                    var5.field1385 = class360.field5718;
                    class326.field5010[class120.field1861++] = var4;
                } else if (var7 == 1) {
                    class126.field2114[class6.field80++] = var4;
                    var5.field1385 = class360.field5718;
                    int var12 = class244.field3803.method1632(14538, 3);
                    var5.method818(var12, (byte) -119, 1);
                    int var13 = class244.field3803.method1632(14538, 1);
                    if (var13 == 1) {
                        class326.field5010[class120.field1861++] = var4;
                    }
                } else if (var7 == 2) {
                    class126.field2114[class6.field80++] = var4;
                    var5.field1385 = class360.field5718;
                    if (class244.field3803.method1632(14538, 1) == 1) {
                        int var9 = class244.field3803.method1632(14538, 3);
                        var5.method818(var9, (byte) -101, 2);
                        int var10 = class244.field3803.method1632(14538, 3);
                        var5.method818(var10, (byte) -13, 2);
                    } else {
                        int var8 = class244.field3803.method1632(14538, 3);
                        var5.method818(var8, (byte) -41, 0);
                    }
                    int var11 = class244.field3803.method1632(14538, 1);
                    if (var11 == 1) {
                        class326.field5010[class120.field1861++] = var4;
                    }
                } else if (var7 == 3) {
                    class318.field4903[class130.field2176++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIBIII)V", line = 125)
    public static final void method1003(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        int var8 = arg7 - 334;
        if (arg4 > -119) {
            field1813 = 117;
        }
        field1815++;
        int var9 = 2048 - arg2 & 0x7FF;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var10 = (class23.field360 - class231.field3602) * var8 / 100 + class231.field3602;
        int var11 = 2048 - arg6 & 0x7FF;
        int var12 = 0;
        int var13 = arg1 * var10 >> 8;
        int var14 = 0;
        int var15 = var13;
        if (var9 != 0) {
            int var16 = class107.field1605[var9];
            int var17 = class107.field1604[var9];
            var14 = -var13 * var17 >> 16;
            var15 = var13 * var16 >> 16;
        }
        if (var11 != 0) {
            int var18 = class107.field1604[var11];
            var12 = var15 * var18 >> 16;
            int var19 = class107.field1605[var11];
            var15 = var15 * var19 >> 16;
        }
        class151.field2465 = arg0 - var12;
        class10.field143 = arg3 - var15;
        class15.field248 = arg6;
        class191.field3005 = arg2;
        class64.field975 = arg5 - var14;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BII)V", line = 184)
    public static final void method1004(byte arg0, int arg1, int arg2) {
        class191.field3006 = arg1 - class351.field5592;
        class36.field544 = class351.field5598 + class351.field5593 - arg2 - 1;
        int var3 = -40 % ((40 - arg0) / 57);
        field1812++;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lrg;B)Z", line = 196)
    public static final boolean method1005(class342 arg0, byte arg1) {
        int var2 = -60 / ((arg1 - 50) / 40);
        field1814++;
        if (arg0.field5427 == 205) {
            class186.field2932 = 250;
            return true;
        } else {
            return false;
        }
    }
}
