import jaclib.memory.Buffer;
import jaclib.memory.Source;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class676 extends class262 implements class438 {

    @OriginalMember(owner = "client!og", name = "F", descriptor = "Lfja;")
    public static class783 field9421 = new class783(94, 6);

    @OriginalMember(owner = "client!og", name = "C", descriptor = "B")
    private byte field9418;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public static int field9423;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field9427;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "Lpt;")
    public static class558 field9431;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "[Lvc;")
    public static class337[] field9430;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)Z")
    public static final boolean method3811(int arg0) {
        ++field9426;
        if (class740.field10206) {
            try {
                class729.method4044(class286.field3936, 26693, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 <= 41) {
            field9421 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBIII)V")
    public static final void method3812(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field9416;
        float var5 = (float) class64.field911 / (float) class64.field901;
        if (arg1 > -12) {
            field9430 = null;
        }
        int var6 = arg4;
        int var7 = arg0;
        if (!(var5 < 1.0F)) {
            var6 = (int) ((float) arg0 / var5);
        } else {
            var7 = (int) ((float) arg4 * var5);
        }
        int var8 = arg3 - (-var7 + arg0) / 2;
        int var9 = arg2 - (-var6 + arg4) / 2;
        class499.field6826 = -1;
        class210.field3141 = -1;
        class211.field3161 = -(class64.field911 * var8 / var7) + class64.field911;
        class215.field3194 = class64.field901 * var9 / var6;
        class538.method3044(-93);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method1739(boolean arg0, int arg1) {
        if (arg1 < 37) {
            this.method1738(-57, (Source) null, 16, 44);
        }
        ++field9420;
        return super.method1711(super.field3680.field1587, (byte) -96, arg0);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public final void method1543(int arg0) {
        ++field9425;
        super.method1543(arg0);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
    public static final void method3813(boolean arg0) {
        ++field9423;
        if (arg0) {
            for (int var1 = 0; class610.field8520 > var1; ++var1) {
                int var2 = class744.field10273[var1];
                class755 var3 = (class755) class664.field9216.method337((long) var2, 1);
                if (var3 != null) {
                    class666 var4 = var3.field10414;
                    class451.method2612(87, var4.field9253.field8076, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)Z")
    public final boolean method1736(byte arg0, int arg1, int arg2) {
        ++field9424;
        this.field9418 = (byte) arg2;
        if (arg0 <= 74) {
            field9431 = null;
        }
        super.method1546(arg1, -13659);
        return true;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)V")
    public static final void method3814(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9428;
        int var6 = -arg4 + arg1;
        int var7 = -arg3 + arg2;
        if (var7 != 0) {
            if (~var6 == -1) {
                class480.method2747(arg0, arg3, arg4, arg2, (byte) 126);
            } else {
                if (~var7 > -1) {
                    var7 = -var7;
                }
                if (var6 < 0) {
                    var6 = -var6;
                }
                boolean var8 = ~var7 > ~var6;
                if (var8) {
                    int var9 = arg3;
                    arg3 = arg4;
                    int var10 = arg2;
                    arg4 = var9;
                    arg2 = arg1;
                    arg1 = var10;
                }
                int var11 = 4 / ((-70 - arg5) / 53);
                if (~arg3 < ~arg2) {
                    int var12 = arg3;
                    int var13 = arg4;
                    arg3 = arg2;
                    arg4 = arg1;
                    arg2 = var12;
                    arg1 = var13;
                }
                int var14 = arg4;
                int var15 = -arg3 + arg2;
                int var16 = arg1 - arg4;
                int var17 = -(var15 >> 1);
                int var18 = arg1 > arg4 ? 1 : -1;
                if (~var16 > -1) {
                    var16 = -var16;
                }
                if (var8) {
                    for (int var19 = arg3; var19 <= arg2; ++var19) {
                        var17 += var16;
                        class298.field4105[var19][var14] = arg0;
                        if (var17 > 0) {
                            var17 -= var15;
                            var14 += var18;
                        }
                    }
                } else {
                    for (int var20 = arg3; arg2 >= var20; ++var20) {
                        var17 += var16;
                        class298.field4105[var14][var20] = arg0;
                        if (~var17 < -1) {
                            var17 -= var15;
                            var14 += var18;
                        }
                    }
                }
            }
        } else {
            if (var6 != 0) {
                class281.method1815(arg4, arg3, arg1, arg0, 57);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Loia;Z)V")
    public class676(class97 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Z")
    public final boolean method1737(byte arg0) {
        ++field9429;
        if (arg0 >= -68) {
            this.field9418 = 83;
        }
        return super.method1716(super.field3680.field1587, (byte) -113);
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)I")
    public final int method3815(int arg0) {
        if (arg0 != 32606) {
            field9421 = null;
        }
        ++field9422;
        return this.field9418;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V")
    public static void method3816(byte arg0) {
        field9431 = null;
        field9430 = null;
        if (arg0 != 51) {
            method3817(121);
        }
        field9421 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    public final boolean method1738(int arg0, Source arg1, int arg2, int arg3) {
        ++field9427;
        this.field9418 = (byte) arg2;
        if (arg0 != 21990) {
            return true;
        } else {
            super.method1713(arg3, arg1, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)I")
    public static final int method3817(int arg0) {
        ++field9419;
        class66 var1 = class95.field1472;
        boolean var2 = false;
        if (~class111.field1911.field6725.method3784((byte) 91) != -1) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class407.method2427(0, (class662) null, (class162) null, 0, 0, var3);
        }
        long var4 = class197.method1423(1);
        for (int var6 = 0; var6 < 10000; ++var6) {
            var1.method556(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        if (arg0 != 10000) {
            field9421 = null;
        }
        int var7 = (int) (-var4 + class197.method1423(arg0 ^ 10001));
        var1.method472(arg0 ^ 17228, 100, 0, 100, -16777216, 0);
        if (var2) {
            var1.method594(0);
        }
        return var7;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)I")
    public final int method1638(byte arg0) {
        int var2 = -117 / ((14 - arg0) / 43);
        ++field9417;
        return super.method1638((byte) -35);
    }
}
