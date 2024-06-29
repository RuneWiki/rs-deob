import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class11 {

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "[I")
    public static int[] field116 = new int[5];

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lch;")
    public static class158 field115;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lwf;")
    public static class67 field113;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 45)
    public static void method67(int arg0) {
        field113 = null;
        field116 = null;
        field115 = null;
        if (arg0 != -4654) {
            field113 = (class67) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILc;BIII)V", line = 70)
    public static final void method68(int arg0, class337 arg1, byte arg2, int arg3, int arg4, int arg5) {
        field119++;
        if (arg1.field5380 == -1 && arg1.field5385 == null) {
            return;
        }
        int var6 = 0;
        if (arg1.field5376 < arg0) {
            var6 += arg0 - arg1.field5376;
        } else if (arg1.field5374 > arg0) {
            var6 += arg1.field5374 - arg0;
        }
        int var7 = class213.field3240 * arg1.field5400 >> 8;
        if (arg1.field5399 < arg5) {
            var6 += arg5 - arg1.field5399;
        } else if (arg1.field5375 > arg5) {
            var6 += arg1.field5375 - arg5;
        }
        if (arg1.field5377 == 0 || var6 - 64 > arg1.field5377 || class213.field3240 == 0 || arg1.field5394 != arg3) {
            if (arg1.field5386 != null) {
                class20.field239.method2339(arg1.field5386);
                arg1.field5386 = null;
            }
            if (arg1.field5392 != null) {
                class20.field239.method2339(arg1.field5392);
                arg1.field5392 = null;
            }
            return;
        }
        var6 -= 64;
        if (arg2 != 52) {
            method68(99, (class337) null, (byte) 100, -9, 80, 29);
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg1.field5377 - var6) * var7 / arg1.field5377;
        if (arg1.field5386 != null) {
            arg1.field5386.method2517(var8);
        } else if (arg1.field5380 >= 0) {
            class284 var9 = class284.method2050(class69.field856, arg1.field5380, 0);
            if (var9 != null) {
                class37 var10 = var9.method2051().method240(class55.field662);
                class359 var11 = class359.method2507(var10, 100, var8);
                var11.method2500(-1);
                class20.field239.method2335(var11);
                arg1.field5386 = var11;
            }
        }
        if (arg1.field5392 != null) {
            arg1.field5392.method2517(var8);
            if (!arg1.field5392.method1293((byte) 26)) {
                arg1.field5392 = null;
            }
        } else if (arg1.field5385 != null && (arg1.field5395 -= arg4) <= 0) {
            int var12 = (int) ((double) arg1.field5385.length * Math.random());
            class284 var13 = class284.method2050(class69.field856, arg1.field5385[var12], 0);
            if (var13 != null) {
                class37 var14 = var13.method2051().method240(class55.field662);
                class359 var15 = class359.method2507(var14, 100, var8);
                var15.method2500(0);
                class20.field239.method2335(var15);
                arg1.field5395 = (int) ((double) (arg1.field5387 - arg1.field5381) * Math.random()) + arg1.field5381;
                arg1.field5392 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V", line = 216)
    public static final void method69(int arg0, int arg1, int arg2) {
        if (arg2 == 8) {
            arg2 = 4;
        }
        field117++;
        if (arg2 == 4 && !class76.field993) {
            arg2 = 2;
            arg1 = 2;
        }
        if (class31.field362 != arg2) {
            if (class128.field1875) {
                return;
            }
            if (class31.field362 != 0) {
                class10.field94[class31.field362].method147();
            }
            if (arg2 != 0) {
                class97 var3 = class10.field94[arg2];
                var3.method152();
                var3.method150(arg1);
            }
            class31.field362 = arg2;
            class222.field3360 = arg1;
        } else if (arg2 != 0 && class222.field3360 != arg1) {
            class10.field94[arg2].method150(arg1);
            class222.field3360 = arg1;
        }
        if (arg0 >= -94) {
            method68(-110, (class337) null, (byte) 94, -114, 37, 125);
        }
    }
}
