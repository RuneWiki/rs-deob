import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class302 extends class364 {

    @OriginalMember(owner = "client!ws", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field4455 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "F")
    public float field4434;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "F")
    public float field4439;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "F")
    public float field4440;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "F")
    public float field4441;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "F")
    public float field4444;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "F")
    public float field4448;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "F")
    public float field4449;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "F")
    public float field4450;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "F")
    public float field4451;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "F")
    public float field4452;

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "F")
    public float field4458;

    @OriginalMember(owner = "client!ws", name = "H", descriptor = "F")
    public float field4462;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!ws", name = "E", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ws", name = "I", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ws", name = "J", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ws", name = "K", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!ws", name = "L", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "Lwh;")
    public static class129 field4447;

    @OriginalMember(owner = "client!ws", name = "P", descriptor = "(I)V")
    public final void method2002(int arg0) {
        field4446++;
        float var2 = class561.field7995[arg0 & 0x3FFF];
        float var3 = class561.field7989[arg0 & 0x3FFF];
        float var4 = this.field4441;
        float var5 = this.field4444;
        float var6 = this.field4462;
        this.field4441 = this.field4451 * var3 + var2 * var4;
        float var7 = this.field4452;
        this.field4451 = this.field4451 * var2 - var3 * var4;
        this.field4444 = this.field4448 * var3 + var2 * var5;
        this.field4462 = this.field4449 * var3 + var2 * var6;
        this.field4448 = this.field4448 * var2 - var3 * var5;
        this.field4449 = this.field4449 * var2 - (var3 * var6);
        this.field4452 = this.field4440 * var3 + var2 * var7;
        this.field4440 = this.field4440 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!ws", name = "R", descriptor = "(III[I)V")
    public final void method2003(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field4450 + (float) arg0 * this.field4434 + (float) arg1 * this.field4458);
        field4445++;
        arg3[0] = (int) ((float) arg2 * this.field4462 + (float) arg0 * this.field4441 + (float) arg1 * this.field4444);
        arg3[2] = (int) ((float) arg2 * this.field4449 + (float) arg0 * this.field4451 + (float) arg1 * this.field4448);
    }

    @OriginalMember(owner = "client!ws", name = "la", descriptor = "(Lq;)V")
    public final void method2004(class364 arg0) {
        field4460++;
        class302 var2 = (class302) arg0;
        this.field4458 = var2.field4458;
        this.field4444 = var2.field4444;
        this.field4441 = var2.field4441;
        this.field4450 = var2.field4450;
        this.field4452 = var2.field4452;
        this.field4462 = var2.field4462;
        this.field4434 = var2.field4434;
        this.field4439 = var2.field4439;
        this.field4449 = var2.field4449;
        this.field4451 = var2.field4451;
        this.field4448 = var2.field4448;
        this.field4440 = var2.field4440;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLq;)V")
    public final void method2005(byte arg0, class364 arg1) {
        field4442++;
        class302 var3 = (class302) arg1;
        this.field4441 = var3.field4441;
        this.field4462 = var3.field4451;
        this.field4444 = var3.field4434;
        this.field4451 = var3.field4462;
        this.field4434 = var3.field4444;
        this.field4450 = var3.field4448;
        this.field4458 = var3.field4458;
        int var4 = -89 / ((arg0 - 59) / 45);
        this.field4449 = var3.field4449;
        this.field4452 = -(this.field4462 * var3.field4440 + this.field4444 * var3.field4439 + this.field4441 * var3.field4452);
        this.field4448 = var3.field4450;
        this.field4439 = -(this.field4450 * var3.field4440 + this.field4458 * var3.field4439 + this.field4434 * var3.field4452);
        this.field4440 = -(this.field4449 * var3.field4440 + this.field4451 * var3.field4452 + this.field4448 * var3.field4439);
    }

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "(III)V")
    public final void method2006(int arg0, int arg1, int arg2) {
        field4433++;
        this.field4440 += arg2;
        this.field4439 += arg1;
        this.field4452 += arg0;
    }

    @OriginalMember(owner = "client!ws", name = "S", descriptor = "(I)V")
    public final void method2007(int arg0) {
        field4438++;
        float var2 = class561.field7995[arg0 & 0x3FFF];
        float var3 = class561.field7989[arg0 & 0x3FFF];
        float var4 = this.field4434;
        float var5 = this.field4458;
        float var6 = this.field4450;
        this.field4434 = var2 * var4 - this.field4451 * var3;
        float var7 = this.field4439;
        this.field4458 = var2 * var5 - this.field4448 * var3;
        this.field4451 = this.field4451 * var2 + var3 * var4;
        this.field4448 = this.field4448 * var2 + var3 * var5;
        this.field4450 = var2 * var6 - this.field4449 * var3;
        this.field4449 = this.field4449 * var2 + var3 * var6;
        this.field4439 = var2 * var7 - this.field4440 * var3;
        this.field4440 = this.field4440 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(FFIBIFI)V")
    public final void method2008(float arg0, float arg1, int arg2, byte arg3, int arg4, float arg5, int arg6) {
        field4443++;
        if (arg2 == 0) {
            this.field4434 = this.field4451 = this.field4444 = this.field4448 = this.field4462 = this.field4450 = 0.0F;
            this.field4449 = 1.0F;
            this.field4441 = arg4;
            this.field4458 = arg6;
        } else {
            float var8 = class561.field7995[arg2 & 0x3FFF];
            float var9 = class561.field7989[arg2 & 0x3FFF];
            this.field4449 = 1.0F;
            this.field4458 = (float) arg6 * var8;
            this.field4451 = this.field4448 = this.field4462 = this.field4450 = 0.0F;
            this.field4444 = (float) arg6 * -var9;
            this.field4434 = (float) arg4 * var9;
            this.field4441 = (float) arg4 * var8;
        }
        this.field4440 = arg5;
        int var10 = 75 / ((arg3 + 43) / 58);
        this.field4452 = arg0;
        this.field4439 = arg1;
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)[F")
    public final float[] method2009(int arg0) {
        class247.field3513[8] = this.field4462;
        class247.field3513[0] = this.field4441;
        class247.field3513[6] = this.field4448;
        field4459++;
        class247.field3513[12] = 0.0F;
        class247.field3513[2] = this.field4451;
        class247.field3513[13] = arg0;
        class247.field3513[10] = this.field4449;
        class247.field3513[4] = this.field4444;
        class247.field3513[1] = this.field4434;
        class247.field3513[5] = this.field4458;
        class247.field3513[9] = this.field4450;
        class247.field3513[14] = 0.0F;
        return class247.field3513;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIZ)I")
    public static final int method2010(int arg0, int arg1, boolean arg2) {
        field4464++;
        if (!arg2) {
            field4455 = null;
        }
        return arg1 == 4 || arg1 == 5 ? class318.field4617[arg0 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!ws", name = "ra", descriptor = "(I)V")
    public final void method2011(int arg0) {
        field4453++;
        this.field4449 = 1.0F;
        this.field4441 = this.field4458 = class561.field7995[arg0 & 0x3FFF];
        this.field4434 = class561.field7989[arg0 & 0x3FFF];
        this.field4444 = -this.field4434;
        this.field4462 = this.field4452 = this.field4450 = this.field4439 = this.field4451 = this.field4448 = this.field4440 = 0.0F;
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(I)Llq;")
    public static final class480 method2012(int arg0) {
        field4456++;
        if (class182.field2258 == null || class538.field7749 == null) {
            return null;
        }
        if (arg0 < 11) {
            field4447 = null;
        }
        for (class480 var1 = (class480) class538.field7749.method575(18032); var1 != null; var1 = (class480) class538.field7749.method575(18032)) {
            class431 var2 = class182.field2242.method1014(var1.field7060, 5187);
            if (var2 != null && var2.field6419 && var2.method2689(true, class182.field2245)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "(I)[F")
    public final float[] method2013(int arg0) {
        class247.field3513[13] = this.field4439;
        class247.field3513[0] = this.field4441;
        class247.field3513[14] = this.field4440;
        class247.field3513[6] = this.field4448;
        class247.field3513[9] = this.field4450;
        field4457++;
        class247.field3513[8] = this.field4462;
        class247.field3513[1] = this.field4434;
        class247.field3513[4] = this.field4444;
        class247.field3513[5] = this.field4458;
        if (arg0 < 29) {
            this.method2002(101);
        }
        class247.field3513[10] = this.field4449;
        class247.field3513[12] = this.field4452;
        class247.field3513[2] = this.field4451;
        return class247.field3513;
    }

    @OriginalMember(owner = "client!ws", name = "GA", descriptor = "(III)V")
    public final void method2014(int arg0, int arg1, int arg2) {
        this.field4434 = this.field4451 = this.field4444 = this.field4448 = this.field4462 = this.field4450 = 0.0F;
        this.field4440 = arg2;
        this.field4452 = arg0;
        this.field4439 = arg1;
        field4437++;
        this.field4441 = this.field4458 = this.field4449 = 1.0F;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
    public static void method2015(byte arg0) {
        field4447 = null;
        field4455 = null;
        if (arg0 <= 119) {
            method2012(-17);
        }
    }

    @OriginalMember(owner = "client!ws", name = "O", descriptor = "([I)V")
    public final void method2016(int[] arg0) {
        field4465++;
        float var2 = (float) arg0[0] - this.field4452;
        float var3 = (float) arg0[1] - this.field4439;
        float var4 = (float) arg0[2] - this.field4440;
        arg0[1] = (int) (this.field4448 * var4 + this.field4458 * var3 + this.field4444 * var2);
        arg0[2] = (int) (this.field4449 * var4 + this.field4462 * var2 + this.field4450 * var3);
        arg0[0] = (int) (this.field4451 * var4 + this.field4441 * var2 + this.field4434 * var3);
    }

    @OriginalMember(owner = "client!ws", name = "XA", descriptor = "(I)V")
    public final void method2017(int arg0) {
        this.field4441 = 1.0F;
        field4463++;
        this.field4458 = this.field4449 = class561.field7995[arg0 & 0x3FFF];
        this.field4448 = class561.field7989[arg0 & 0x3FFF];
        this.field4450 = -this.field4448;
        this.field4444 = this.field4462 = this.field4452 = this.field4434 = this.field4439 = this.field4451 = this.field4440 = 0.0F;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III[I)V")
    public final void method2018(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field4462 + (float) arg0 * this.field4441 + (float) arg1 * this.field4444 + this.field4452);
        arg3[2] = (int) ((float) arg2 * this.field4449 + (float) arg0 * this.field4451 + (float) arg1 * this.field4448 + this.field4440);
        field4435++;
        arg3[1] = (int) ((float) arg2 * this.field4450 + (float) arg0 * this.field4434 + (float) arg1 * this.field4458 + this.field4439);
    }

    @OriginalMember(owner = "client!ws", name = "pa", descriptor = "(IIIIII)V")
    public final void method2019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4461++;
        float var7 = class561.field7995[arg3 & 0x3FFF];
        float var8 = class561.field7989[arg3 & 0x3FFF];
        float var9 = class561.field7995[arg4 & 0x3FFF];
        float var10 = class561.field7989[arg4 & 0x3FFF];
        float var11 = class561.field7995[arg5 & 0x3FFF];
        float var12 = class561.field7989[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4449 = var7 * var9;
        this.field4434 = -var9 * var12 + var10 * var13;
        this.field4462 = -var10 * var11 + var9 * var14;
        this.field4451 = var7 * var10;
        this.field4448 = -var8;
        this.field4458 = var7 * var11;
        this.field4444 = var7 * var12;
        this.field4441 = var9 * var11 + var10 * var14;
        this.field4450 = var9 * var13 + var10 * var12;
        this.field4440 = (float) (-arg0) * this.field4451 - (float) arg1 * this.field4448 - (float) arg2 * this.field4449;
        this.field4439 = (float) (-arg0) * this.field4434 - (float) arg1 * this.field4458 - ((float) arg2 * this.field4450);
        this.field4452 = (float) (-arg0) * this.field4441 - ((float) arg1 * this.field4444) - (float) arg2 * this.field4462;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
    public class302() {
        this.method2021();
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "()Lq;")
    public final class364 method2020() {
        field4454++;
        class302 var1 = new class302();
        var1.field4452 = this.field4452;
        var1.field4444 = this.field4444;
        var1.field4434 = this.field4434;
        var1.field4458 = this.field4458;
        var1.field4448 = this.field4448;
        var1.field4462 = this.field4462;
        var1.field4450 = this.field4450;
        var1.field4449 = this.field4449;
        var1.field4451 = this.field4451;
        var1.field4441 = this.field4441;
        var1.field4440 = this.field4440;
        var1.field4439 = this.field4439;
        return var1;
    }

    @OriginalMember(owner = "client!ws", name = "Y", descriptor = "()V")
    public final void method2021() {
        this.field4441 = this.field4458 = this.field4449 = 1.0F;
        field4436++;
        this.field4434 = this.field4451 = this.field4444 = this.field4448 = this.field4462 = this.field4450 = this.field4452 = this.field4439 = this.field4440 = 0.0F;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZII)V")
    public static final void method2022(boolean arg0, int arg1, int arg2) {
        field4466++;
        if (arg1 == 0) {
            class413.field6264 = class605.method3526(class595.field8694.field6538 * 2, (byte) -63, 0, class206.field2762, class30.field348, class73.field780);
        } else {
            if (arg0) {
                class413.field6264 = class605.method3526(0, (byte) -63, 0, class206.field2762, class30.field348, class73.field780);
                class413.field6264.method344(0);
                class402 var3 = class644.method3663(class227.field3191, 72, 0, class201.field2692);
                class181 var4 = class413.field6264.method329(var3, class372.method2393(class319.field4621, class201.field2692, 0), true);
                class120.method745(true, -107, var4, class151.field1857.method2902(class35.field396, arg2 ^ 0x4606));
                class112.method692(arg2 + 2204);
                class413.field6264.method3522(16384);
            }
            try {
                class413.field6264 = class605.method3526(class595.field8694.field6538 * 2, (byte) -63, arg1, class206.field2762, class30.field348, class73.field780);
                if (class413.field6264.method297()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class35 var6;
                    if (var5) {
                        var6 = class413.field6264.method355(146800640);
                    } else {
                        var6 = class413.field6264.method355(104857600);
                    }
                    class413.field6264.method314(var6);
                }
            } catch (Throwable var8) {
                class413.field6264 = class605.method3526(0, (byte) -63, 0, class206.field2762, class30.field348, class73.field780);
                arg1 = 0;
            }
        }
        class81.field908 = arg1;
        class325.method2112(103);
        if (!class413.field6264.method334()) {
            class629.field9081 = 1;
        }
        class413.field6264.method348(class629.field9081);
        class413.field6264.method345(0);
        class413.field6264.method406(32);
        class495.field7240 = class413.field6264.method337();
        class270.field3782 = class413.field6264.method337();
        if (arg2 != -2221) {
            return;
        }
        class616.method3554(arg2 + 34989);
        class413.field6264.method378(!class595.field8694.field6564);
        if (class413.field6264.method331()) {
            class101.method623(685, class595.field8694.field6523);
        }
        class56.method417(class90.field1032 >> 3, class413.field6264, class30.field349 >> 3, 5);
        class329.method2148((byte) 115);
        class156.field1935 = null;
        class90.field1036 = false;
        class141.field1740 = true;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public final void method2023(int arg0) {
        this.field4458 = 1.0F;
        field4432++;
        this.field4441 = this.field4449 = class561.field7995[arg0 & 0x3FFF];
        this.field4462 = class561.field7989[arg0 & 0x3FFF];
        this.field4451 = -this.field4462;
        this.field4444 = this.field4452 = this.field4434 = this.field4450 = this.field4439 = this.field4448 = this.field4440 = 0.0F;
    }
}
