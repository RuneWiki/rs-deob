import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class class674 {

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "[I")
    public static int[] field9522 = new int[14];

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field9521 = 0;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "Ljda;")
    public static class207 field9525;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public static void method3823(int arg0) {
        field9525 = null;
        if (arg0 == -377029181) {
            field9522 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBLmw;)Z")
    public static final boolean method3824(int arg0, byte arg1, class455 arg2) {
        field9523++;
        int var3 = arg2.method2592((byte) 50, 2);
        if (var3 == 0) {
            if (arg2.method2592((byte) 70, 1) != 0) {
                method3824(arg0, (byte) -64, arg2);
            }
            int var4 = arg2.method2592((byte) 102, 6);
            int var5 = arg2.method2592((byte) -89, 6);
            boolean var6 = arg2.method2592((byte) -102, 1) == 1;
            if (var6) {
                class494.field6740[class356.field4729++] = arg0;
            }
            if (class671.field9407[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class671 var7 = class320.field4382[arg0];
            class677 var8 = class671.field9407[arg0] = new class677();
            var8.field1697 = arg0;
            if (class437.field6082[arg0] != null) {
                var8.method3856(class437.field6082[arg0], (byte) 85);
            }
            var8.method894((byte) 118, true, var7.field9412);
            var8.field1701 = var7.field9411;
            int var9 = var7.field9413;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FFC92) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class498.field6774;
            int var14 = (var12 << 6) + var5 - class613.field8555;
            var8.field9660 = var7.field9414;
            var8.field1803[0] = class78.field1188[arg0];
            var8.field4053 = var8.field4050 = (byte) var10;
            if (class467.method2640(var13, var14, (byte) 109)) {
                var8.field4050++;
            }
            var8.method3855(var13, var14, -101);
            var8.field9692 = false;
            class320.field4382[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg2.method2592((byte) 42, 2);
            int var16 = class320.field4382[arg0].field9413;
            class320.field4382[arg0].field9413 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg2.method2592((byte) -107, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class320.field4382[arg0].field9413;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FC783) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var22--;
                var23++;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var22++;
                var23++;
            }
            class320.field4382[arg0].field9413 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg2.method2592((byte) -89, 18);
            int var25 = var24 >> 16;
            int var26 = (var24 & 0xFFF8) >> 8;
            int var27 = var24 & 0xFF;
            int var28 = -77 % ((arg1 - 2) / 36);
            int var29 = class320.field4382[arg0].field9413;
            int var30 = (var29 >> 28) + var25 & 0x3;
            int var31 = (var29 >> 14) + var26 & 0xFF;
            int var32 = var27 + var29 & 0xFF;
            class320.field4382[arg0].field9413 = (var30 << 28) + (var31 << 14) + var32;
            return false;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9524++;
        if (arg3 != 8 && arg3 != 16) {
            class390 var7 = class295.field4051[arg1][arg2][arg4];
            if (var7 == null) {
                var7 = new class390(arg1);
            }
            if (arg3 == 1) {
                var7.field5528 = (short) arg0;
                var7.field5527 = (short) arg5;
            } else if (arg3 == 2) {
                var7.field5535 = (short) arg5;
                var7.field5526 = (short) arg0;
            }
            if (class12.field122) {
                class54.method410(-1);
            }
        } else if (arg3 == 8) {
            int var14 = arg2 << class588.field8259;
            int var15 = class631.field8750 + var14;
            int var16 = arg4 << class588.field8259;
            int var17 = class631.field8750 + var16;
            int var18 = class497.field6766[arg1].method332(arg4, 1, arg2);
            int var19 = class497.field6766[arg1].method332(arg4 + 1, 1, arg2 + 1);
            class184.field2659[class111.field1542++] = new class209(arg3, arg1, var14, var15, var15, var14, var18, var19, var19 - arg5, -arg5 + var18, var16, var17, var17, var16);
        } else {
            int var8 = (arg2 << class588.field8259) + class631.field8750;
            int var9 = var8 - class631.field8750;
            int var10 = arg4 << class588.field8259;
            int var11 = class631.field8750 + var10;
            int var12 = class497.field6766[arg1].method332(arg4, 1, arg2 + 1);
            int var13 = class497.field6766[arg1].method332(arg4 + 1, 1, arg2);
            class184.field2659[class111.field1542++] = new class209(arg3, arg1, var8, var9, var9, var8, var12, var13, var13 - arg5, -arg5 + var12, var10, var11, var11, var10);
        }
        if (arg6 != -3) {
            method3824(4, (byte) -72, null);
        }
    }
}
