import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class216 {

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
    public int field3099 = 0;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public int field3098 = 0;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
    public int field3106 = 2048;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public int field3101 = 2048;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "[I")
    public static int[] field3095 = new int[8];

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
    public static int field3102 = 4;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    public static int field3104 = 1;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V", line = 6)
    public static void method1497(int arg0) {
        field3095 = null;
        if (arg0 != 19267) {
            field3095 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BI)V", line = 20)
    public static final void method1498(byte arg0, int arg1) {
        field3103++;
        if (arg0 <= 60) {
            method1502(-46, false, null);
        }
        class678 var2 = class630.method3597(29636, 12, (long) arg1);
        var2.method3836((byte) -33);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIB)V", line = 34)
    public static final void method1499(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3097++;
        class678 var5 = class630.method3597(29636, 18, (long) arg2 | (long) arg1 << 32);
        var5.method3834((byte) 84);
        if (arg4 <= 49) {
            field3095 = null;
        }
        var5.field9639 = arg0;
        var5.field9649 = arg3;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILrv;)V", line = 57)
    public final void method1500(int arg0, class120 arg1) {
        field3105++;
        while (true) {
            int var3 = arg1.method842(2384);
            if (var3 == 0) {
                int var4 = -70 / ((arg0 - 34) / 61);
                return;
            }
            this.method1501(var3, (byte) -82, arg1);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IBLrv;)V", line = 84)
    private final void method1501(int arg0, byte arg1, class120 arg2) {
        field3100++;
        if (arg0 == 1) {
            this.field3099 = arg2.method842(2384);
        } else if (arg0 == 2) {
            this.field3101 = arg2.method898((byte) -101);
        } else if (arg0 == 3) {
            this.field3106 = arg2.method898((byte) -86);
        } else if (arg0 == 4) {
            this.field3098 = arg2.method838(true);
        }
        int var4 = 44 / ((56 - arg1) / 54);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IZLiw;)Z", line = 112)
    public static final boolean method1502(int arg0, boolean arg1, class331 arg2) {
        field3096++;
        int var3 = arg2.method2138(2, (byte) -105);
        if (var3 == 0) {
            if (arg2.method2138(1, (byte) -105) != 0) {
                method1502(arg0, true, arg2);
            }
            int var4 = arg2.method2138(6, (byte) -105);
            int var5 = arg2.method2138(6, (byte) -105);
            boolean var6 = arg2.method2138(1, (byte) -105) == 1;
            if (var6) {
                class762.field10498[class486.field6883++] = arg0;
            }
            if (class581.field8250[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class711 var7 = class359.field5218[arg0];
            class559 var8 = class581.field8250[arg0] = new class559();
            var8.field6361 = arg0;
            if (class698.field9864[arg0] != null) {
                var8.method3248(true, class698.field9864[arg0]);
            }
            var8.method2700(117, true, var7.field10008);
            var8.field6343 = var7.field10009;
            int var9 = var7.field10002;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FE801) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class103.field1295;
            int var14 = (var12 << 6) + var5 - class175.field2496;
            var8.field7950 = var7.field10006;
            var8.field7948 = var7.field10003;
            var8.field6446[0] = class89.field1152[arg0];
            var8.field7710 = var8.field7711 = (byte) var10;
            if (class627.method3593(var13, (byte) 85, var14)) {
                var8.field7711++;
            }
            var8.method3246(var13, 92160000, var14);
            var8.field7943 = false;
            class359.field5218[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg2.method2138(2, (byte) -105);
            int var16 = class359.field5218[arg0].field10002;
            class359.field5218[arg0].field10002 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg2.method2138(5, (byte) -105);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class359.field5218[arg0].field10002;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FEBDA) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var22--;
                var23--;
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
                var23++;
                var22++;
            }
            class359.field5218[arg0].field10002 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg2.method2138(18, (byte) -105);
            int var25 = var24 >> 16;
            int var26 = (var24 & 0xFF0B) >> 8;
            int var27 = var24 & 0xFF;
            int var28 = class359.field5218[arg0].field10002;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            if (!arg1) {
                field3104 = -93;
            }
            int var31 = var27 + var28 & 0xFF;
            class359.field5218[arg0].field10002 = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }
}
