import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class249 extends class449 {

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII)V")
    public static final void method1707(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class480.field6800 = arg4;
        class333.field4632 = arg0;
        class312.field4421 = arg1;
        class104.field1468 = arg3;
        if (arg2 != 0) {
            field3595 = -24;
        }
        field3596++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([IILgf;[I[I)V")
    public static final void method1708(int[] arg0, int arg1, class39 arg2, int[] arg3, int[] arg4) {
        for (int var5 = arg1; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg2.field5734.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field5734[var9] = null;
                    } else {
                        class303 var10 = class386.field5289.method1856(arg1 ^ 0x49, var6);
                        int var11 = var10.field4289;
                        class305 var12 = arg2.field5734[var9];
                        if (var12 != null) {
                            if (var12.field4333 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field5734[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4335 = 0;
                                    var12.field4331 = 0;
                                    var12.field4332 = 0;
                                    var12.field4330 = var8;
                                    var12.field4334 = 1;
                                    class178.method1275(0, class262.field3781 == arg2, false, arg2.field4531, arg2.field4537, var10, arg2.field4530);
                                } else if (var11 == 2) {
                                    var12.field4331 = 0;
                                }
                            } else if (var10.field4307 >= class386.field5289.method1856(arg1 ^ 0x1D, var12.field4333).field4307) {
                                var12 = arg2.field5734[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class305 var13 = arg2.field5734[var9] = new class305();
                            var13.field4334 = 1;
                            var13.field4330 = var8;
                            var13.field4335 = 0;
                            var13.field4332 = 0;
                            var13.field4331 = 0;
                            var13.field4333 = var6;
                            class178.method1275(0, class262.field3781 == arg2, false, arg2.field4531, arg2.field4537, var10, arg2.field4530);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field3592++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V")
    public static final void method1709(int arg0, byte arg1) {
        field3594++;
        class12.field87 = arg0;
        class336 var2 = class279.field4010;
        synchronized (class279.field4010) {
            class279.field4010.method2109(-1);
            if (arg1 != -95) {
                method1708((int[]) null, -60, (class39) null, (int[]) null, (int[]) null);
            }
        }
    }
}
