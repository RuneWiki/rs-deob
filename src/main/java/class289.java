import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class289 extends class254 {

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field4004 = 0;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lwj;")
    public static class270 field4003 = new class270(96, 8);

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public int field4002;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lij;")
    public class291 field4005;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "Lbf;")
    public static class373 field4013;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "[Lii;")
    public class387[] field4009;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "[[S")
    public static short[][] field4010;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    public static void method1721(int arg0) {
        if (arg0 != 1736) {
            field4013 = null;
        }
        field4013 = null;
        field4010 = null;
        field4003 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lvc;II)Z")
    public static final boolean method1722(class207 arg0, int arg1, int arg2) {
        field4011++;
        int var3 = arg0.method1282(-26364, 2);
        if (var3 == 0) {
            if (arg0.method1282(arg1 - 58766, 1) != 0) {
                method1722(arg0, arg1, arg2);
            }
            int var4 = arg0.method1282(-26364, 6);
            int var5 = arg0.method1282(-26364, 6);
            boolean var6 = arg0.method1282(-26364, 1) == 1;
            if (var6) {
                class421.field6159[class292.field4039++] = arg2;
            }
            if (class12.field182[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class186 var7 = class455.field6688[arg2];
            class438 var8 = class12.field182[arg2] = new class438();
            var8.field1035 = arg2;
            if (class149.field2152[arg2] != null) {
                var8.method2580(class149.field2152[arg2], -1);
            }
            var8.method612((byte) -120, var7.field2705);
            var8.field1069 = var7.field2699;
            int var9 = var7.field2697;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FC6FE) >> 14;
            int var12 = var9 & 0xFF;
            var8.field6413 = var7.field2701;
            var8.field1121[0] = class413.field6033[arg2];
            var8.field1738 = (byte) var10;
            var8.method2586((var11 << 6) + var4 - class510.field7566, -12186, (var12 << 6) + var5 - class14.field204);
            var8.field6409 = false;
            class455.field6688[arg2] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method1282(-26364, 2);
            int var14 = class455.field6688[arg2].field2697;
            class455.field6688[arg2].field2697 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method1282(-26364, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class455.field6688[arg2].field2697;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FE254) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class455.field6688[arg2].field2697 = (var20 << 14) + (var19 << 28) + var21;
            return false;
        } else {
            if (arg1 != 32402) {
                field4014 = -98;
            }
            int var22 = arg0.method1282(-26364, 18);
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFF3B) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class455.field6688[arg2].field2697;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class455.field6688[arg2].field2697 = (var27 << 28) - (-(var28 << 14) - var29);
            return false;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIBZ)V")
    public static final void method1723(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        int var5 = -91 % ((78 - arg3) / 48);
        field4012++;
        if (class152.field2332 == 0) {
            class96.method706(-4701, false);
        } else {
            class276.field3777 = class152.field2332;
            class455.method2675(117, 0);
        }
        class492.field7175 = arg4;
        class98.field1476 = arg1;
        class127.field1885 = arg2;
        class350.method2084(arg0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLya;II)Z")
    public final boolean method1724(byte arg0, class38 arg1, int arg2, int arg3) {
        field4007++;
        if (arg0 != 95) {
            return true;
        }
        if (this.field4009 != null) {
            for (int var5 = 0; var5 < this.field4009.length; var5++) {
                if (this.field4009[var5].method2282(arg3, arg2) && this.field4005.method500(true, arg2, arg1, arg3)) {
                    return true;
                }
            }
        }
        return false;
    }
}
