import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class244 {

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lwe;")
    public static class147 field4348 = new class147(200);

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Le;")
    public static class191 field4352 = class54.method368("overlay2", 2047);

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Le;")
    public static class191 field4351 = class54.method368("Angreifen", 2047);

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Le;")
    public static class191 field4354 = class54.method368("Verbindung mit Update)2Server)3)3)3", 2047);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1706(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field4349++;
        class4.method14(-13974, arg6);
        int var7 = 0;
        int var8 = arg6 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = -var8;
        int var12 = -1;
        if (class242.field4314 <= arg4 && class99.field1584 >= arg4) {
            int[] var13 = class232.field4151[arg4];
            int var14 = class213.method1459(arg3 - arg6, (byte) -25, class37.field678, class207.field3680);
            int var15 = class213.method1459(arg3 + arg6, (byte) -27, class37.field678, class207.field3680);
            int var16 = class213.method1459(arg3 - var8, (byte) -50, class37.field678, class207.field3680);
            int var17 = class213.method1459(arg3 + var8, (byte) -109, class37.field678, class207.field3680);
            class242.method1700(7, arg1, var16, var13, var14);
            class242.method1700(7, arg0, var17, var13, var16);
            class242.method1700(7, arg1, var15, var13, var17);
        }
        int var18 = var8;
        if (arg5 >= -52) {
            return;
        }
        int var19 = -1;
        while (var9 > var7) {
            var19 += 2;
            var12 += 2;
            var11 += var19;
            if (var11 >= 0 && var18 >= 1) {
                var18--;
                class137.field2309[var18] = var7;
                var11 -= var18 << 1;
            }
            var7++;
            var10 += var12;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg4 + var9;
                int var21 = arg4 - var9;
                if (var20 >= class242.field4314 && class99.field1584 >= var21) {
                    if (var8 > var9) {
                        int var22 = class137.field2309[var9];
                        int var23 = class213.method1459(arg3 + var7, (byte) -110, class37.field678, class207.field3680);
                        int var24 = class213.method1459(arg3 - var7, (byte) -48, class37.field678, class207.field3680);
                        int var25 = class213.method1459(arg3 + var22, (byte) -93, class37.field678, class207.field3680);
                        int var26 = class213.method1459(arg3 - var22, (byte) -10, class37.field678, class207.field3680);
                        if (class99.field1584 >= var20) {
                            int[] var27 = class232.field4151[var20];
                            class242.method1700(7, arg1, var26, var27, var24);
                            class242.method1700(7, arg0, var25, var27, var26);
                            class242.method1700(7, arg1, var23, var27, var25);
                        }
                        if (var21 >= class242.field4314) {
                            int[] var28 = class232.field4151[var21];
                            class242.method1700(7, arg1, var26, var28, var24);
                            class242.method1700(7, arg0, var25, var28, var26);
                            class242.method1700(7, arg1, var23, var28, var25);
                        }
                    } else {
                        int var29 = class213.method1459(arg3 + var7, (byte) -123, class37.field678, class207.field3680);
                        int var30 = class213.method1459(arg3 - var7, (byte) -89, class37.field678, class207.field3680);
                        if (class99.field1584 >= var20) {
                            class242.method1700(7, arg1, var29, class232.field4151[var20], var30);
                        }
                        if (class242.field4314 <= var21) {
                            class242.method1700(7, arg1, var29, class232.field4151[var21], var30);
                        }
                    }
                }
            }
            int var31 = arg4 - var7;
            int var32 = arg4 + var7;
            if (var32 >= class242.field4314 && var31 <= class99.field1584) {
                int var33 = arg3 - var9;
                int var34 = arg3 + var9;
                if (class37.field678 <= var34 && class207.field3680 >= var33) {
                    int var35 = class213.method1459(var34, (byte) -106, class37.field678, class207.field3680);
                    int var36 = class213.method1459(var33, (byte) -107, class37.field678, class207.field3680);
                    if (var8 <= var7) {
                        if (class99.field1584 >= var32) {
                            class242.method1700(7, arg1, var35, class232.field4151[var32], var36);
                        }
                        if (var31 >= class242.field4314) {
                            class242.method1700(7, arg1, var35, class232.field4151[var31], var36);
                        }
                    } else {
                        int var37 = var7 > var18 ? class137.field2309[var7] : var18;
                        int var38 = class213.method1459(arg3 + var37, (byte) -21, class37.field678, class207.field3680);
                        int var39 = class213.method1459(arg3 - var37, (byte) -51, class37.field678, class207.field3680);
                        if (var32 <= class99.field1584) {
                            int[] var40 = class232.field4151[var32];
                            class242.method1700(7, arg1, var39, var40, var36);
                            class242.method1700(7, arg0, var38, var40, var39);
                            class242.method1700(7, arg1, var35, var40, var38);
                        }
                        if (class242.field4314 <= var31) {
                            int[] var41 = class232.field4151[var31];
                            class242.method1700(7, arg1, var39, var41, var36);
                            class242.method1700(7, arg0, var38, var41, var39);
                            class242.method1700(7, arg1, var35, var41, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method1707(int arg0) {
        field4348 = null;
        field4354 = null;
        if (arg0 != 5483) {
            method1707(120);
        }
        field4351 = null;
        field4352 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static final void method1708(byte arg0) {
        field4350++;
        class137.field2307.method985(0);
        class248.field4397.method985(0);
        if (arg0 >= -64) {
            field4352 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
    public static final void method1709(int arg0, int arg1, int arg2) {
        field4347++;
        if (arg1 != 0) {
            method1707(97);
        }
        if (class127.method858(arg0, -126)) {
            class93.method568((byte) -94, arg2, class242.field4325[arg0]);
        }
    }
}
