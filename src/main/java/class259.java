import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class259 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lc;")
    public static class125 field4539 = new class125();

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field4559 = 0;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field4562 = 0;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "Lr;")
    public static class66 field4564 = class93.method641(43, ":chalreq:");

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public int field4538;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public int field4540;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public int field4541;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public int field4542;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public int field4543;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public int field4544;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public int field4545;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public int field4546;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public int field4547;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public int field4551;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public int field4555;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public int field4556;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public int field4558;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public int field4561;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "Lcj;")
    public static class28 field4563;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public static final void method1767(boolean arg0) {
        field4550++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class95.method651(true, class110.field2124, var3, var2, var1, (byte) 95)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (!arg0) {
            method1768(true, (class66) null, (class66) null, (class66) null, 106);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZLr;Lr;Lr;I)V")
    public static final void method1768(boolean arg0, class66 arg1, class66 arg2, class66 arg3, int arg4) {
        if (arg0) {
            field4539 = null;
        }
        field4554++;
        class171.method1165(arg3, -19596, arg1, -1, arg4, arg2);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILha;)Lr;")
    public static final class66 method1769(int arg0, class63 arg1) {
        field4557++;
        if (arg0 == class45.method328(118, client.method592(arg1))) {
            return null;
        } else if (arg1.field1207 == null || arg1.field1207.method455(true).method460((byte) -125) == 0) {
            return class102.field1999 ? class11.field127 : null;
        } else {
            return arg1.field1207;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIZIII)V")
    public static final void method1770(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class149.method1015(-1, arg0);
        int var7 = arg0 - arg1;
        int var8 = 0;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = -arg0;
        int var10 = arg0;
        field4553++;
        int var11 = var7;
        int var12 = -var7;
        int var13 = -1;
        int[] var14 = class15.field183[arg6];
        int var15 = -1;
        int var16 = arg2 - var7;
        class194.method1266(arg2 - arg0, (byte) -17, arg5, var14, var16);
        int var17 = arg2 + var7;
        class194.method1266(var16, (byte) -17, arg4, var14, var17);
        class194.method1266(var17, (byte) -17, arg5, var14, arg0 + arg2);
        if (!arg3) {
            field4560 = -97;
        }
        while (var8 < var10) {
            var13 += 2;
            var15 += 2;
            var9 += var13;
            var12 += var15;
            if (var12 >= 0 && var11 >= 1) {
                class25.field323[var11] = var8;
                var11--;
                var12 -= var11 << 1;
            }
            var8++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var7 <= var10) {
                    int[] var18 = class15.field183[arg6 + var10];
                    int[] var19 = class15.field183[arg6 - var10];
                    int var20 = arg2 + var8;
                    int var21 = arg2 - var8;
                    class194.method1266(var21, (byte) -17, arg5, var18, var20);
                    class194.method1266(var21, (byte) -17, arg5, var19, var20);
                } else {
                    int var22 = class25.field323[var10];
                    int[] var23 = class15.field183[arg6 + var10];
                    int var24 = arg2 - var8;
                    int[] var25 = class15.field183[arg6 - var10];
                    int var26 = arg2 + var22;
                    int var27 = arg2 + var8;
                    int var28 = arg2 - var22;
                    class194.method1266(var24, (byte) -17, arg5, var23, var28);
                    class194.method1266(var28, (byte) -17, arg4, var23, var26);
                    class194.method1266(var26, (byte) -17, arg5, var23, var27);
                    class194.method1266(var24, (byte) -17, arg5, var25, var28);
                    class194.method1266(var28, (byte) -17, arg4, var25, var26);
                    class194.method1266(var26, (byte) -17, arg5, var25, var27);
                }
            }
            int[] var29 = class15.field183[arg6 - var8];
            int[] var30 = class15.field183[arg6 + var8];
            int var31 = arg2 + var10;
            int var32 = arg2 - var10;
            if (var8 >= var7) {
                class194.method1266(var32, (byte) -17, arg5, var30, var31);
                class194.method1266(var32, (byte) -17, arg5, var29, var31);
            } else {
                int var33 = var11 < var8 ? class25.field323[var8] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class194.method1266(var32, (byte) -17, arg5, var30, var35);
                class194.method1266(var35, (byte) -17, arg4, var30, var34);
                class194.method1266(var34, (byte) -17, arg5, var30, var31);
                class194.method1266(var32, (byte) -17, arg5, var29, var35);
                class194.method1266(var35, (byte) -17, arg4, var29, var34);
                class194.method1266(var34, (byte) -17, arg5, var29, var31);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method1771(byte arg0) {
        field4564 = null;
        field4563 = null;
        field4539 = null;
        if (arg0 != -9) {
            field4564 = null;
        }
    }
}
