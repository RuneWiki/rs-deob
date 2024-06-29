import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class180 extends class86 {

    @OriginalMember(owner = "client!cp", name = "F", descriptor = "Lil;")
    public class439 field2564;

    @OriginalMember(owner = "client!cp", name = "E", descriptor = "Lmb;")
    public class285 field2563;

    @OriginalMember(owner = "client!cp", name = "B", descriptor = "Lhh;")
    public static class125 field2560 = null;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "[B")
    public static byte[] field2569;

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2572;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
    public int field2559;

    @OriginalMember(owner = "client!cp", name = "C", descriptor = "I")
    public int field2561;

    @OriginalMember(owner = "client!cp", name = "D", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!cp", name = "H", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    public int field2567;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "Lwk;")
    public static class171 field2571;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)Lqi;")
    public static final class466 method1291(boolean arg0) {
        if (arg0) {
            field2572 = null;
        }
        field2568++;
        try {
            return new class297();
        } catch (Throwable var2) {
            try {
                return (class466) Class.forName("oi").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class68();
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1292(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2565++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg2 - arg6;
        int var12 = arg7 - arg6;
        int var13 = arg2 * arg2;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        if (arg0 > -14) {
            field2569 = null;
        }
        int var38 = (var12 - 1) * var29;
        if (class410.field6176 <= arg1 && class158.field2302 >= arg1) {
            int[] var39 = class23.field356[arg1];
            int var40 = class278.method1758(class443.field6591, class396.field6021, arg3 - arg2, 77);
            int var41 = class278.method1758(class443.field6591, class396.field6021, arg2 + arg3, 98);
            int var42 = class278.method1758(class443.field6591, class396.field6021, arg3 - var11, -85);
            int var43 = class278.method1758(class443.field6591, class396.field6021, arg3 + var11, -121);
            class271.method1736(var42, arg5, var40, -11, var39);
            class271.method1736(var43, arg4, var42, -11, var39);
            class271.method1736(var41, arg5, var43, -11, var39);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var45 = arg1 - var9;
            int var46 = arg1 + var9;
            if (var46 >= class410.field6176 && class158.field2302 >= var45) {
                int var47 = class278.method1758(class443.field6591, class396.field6021, arg3 + var8, -93);
                int var48 = class278.method1758(class443.field6591, class396.field6021, arg3 - var8, 127);
                if (var44) {
                    int var49 = class278.method1758(class443.field6591, class396.field6021, arg3 + var10, -93);
                    int var50 = class278.method1758(class443.field6591, class396.field6021, arg3 - var10, -80);
                    if (var45 >= class410.field6176) {
                        int[] var51 = class23.field356[var45];
                        class271.method1736(var50, arg5, var48, -11, var51);
                        class271.method1736(var49, arg4, var50, -11, var51);
                        class271.method1736(var47, arg5, var49, -11, var51);
                    }
                    if (var46 <= class158.field2302) {
                        int[] var52 = class23.field356[var46];
                        class271.method1736(var50, arg5, var48, -11, var52);
                        class271.method1736(var49, arg4, var50, -11, var52);
                        class271.method1736(var47, arg5, var49, -11, var52);
                    }
                } else {
                    if (var45 >= class410.field6176) {
                        class271.method1736(var47, arg5, var48, -11, class23.field356[var45]);
                    }
                    if (class158.field2302 >= var46) {
                        class271.method1736(var47, arg5, var48, -11, class23.field356[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(B)V")
    public final void method1293(byte arg0) {
        field2566++;
        this.field2561 = this.field2564.field6545;
        this.field2559 = this.field2564.field6537;
        this.field2558 = this.field2564.field6541;
        if (this.field2564.field6548 != null) {
            this.field2564.field6548.method188(this.field2563.field4234, this.field2563.field4242, this.field2563.field4247, class204.field2874);
        }
        this.field2562 = class204.field2874[2];
        if (arg0 != -106) {
            method1294(74);
        }
        this.field2567 = class204.field2874[0];
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V")
    public static void method1294(int arg0) {
        if (arg0 <= 110) {
            field2572 = null;
        }
        field2560 = null;
        field2572 = null;
        field2571 = null;
        field2569 = null;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lil;Lli;)V")
    public class180(class439 arg0, class134 arg1) {
        this.field2564 = arg0;
        this.field2563 = this.field2564.method2656(-4549);
        this.method1293((byte) -106);
    }

    static {
        int var0 = 0;
        field2569 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2569[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field2572 = null;
    }
}
