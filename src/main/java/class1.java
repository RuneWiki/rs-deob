import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class1 extends class332 {

    @OriginalMember(owner = "client!oba", name = "F", descriptor = "[C")
    private static char[] field4 = new char[64];

    @OriginalMember(owner = "client!oba", name = "I", descriptor = "Lae;")
    public static class40 field7;

    @OriginalMember(owner = "client!oba", name = "J", descriptor = "Lwea;")
    public static class259 field8;

    @OriginalMember(owner = "client!oba", name = "K", descriptor = "Lpk;")
    public static class104 field9;

    @OriginalMember(owner = "client!oba", name = "B", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!oba", name = "D", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!oba", name = "E", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!oba", name = "G", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!oba", name = "H", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(IIIIIF)V")
    public class1(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IF)V")
    public final void method1(int arg0, float arg1) {
        super.field4239 = arg1;
        ++field6;
        if (arg0 != 0) {
            method3((String) null, (String) null, 70, -89, (String) null, 84, (String) null);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIBI)V")
    public final void method2(int arg0, int arg1, byte arg2, int arg3) {
        ++field1;
        if (arg2 >= -18) {
            field7 = null;
        }
        super.field4247 = arg0;
        super.field4236 = arg1;
        super.field4235 = arg3;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;)V")
    public static final void method3(String arg0, String arg1, int arg2, int arg3, String arg4, int arg5, String arg6) {
        class587.method3232(arg0, arg1, arg2, arg5, arg3, arg4, (String) null, (byte) 127, arg6);
        ++field2;
    }

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "(I)V")
    public static void method4(int arg0) {
        field7 = null;
        field8 = null;
        if (arg0 > 100) {
            field4 = null;
            field9 = null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIZIII)V")
    public static final void method5(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field5;
        if (class655.field9229 != null && (~arg5 != -4 || ~class301.field3698.field6642 != ~arg4 || ~class301.field3698.field6625 != ~arg1)) {
            class645.method3604(class655.field9229, class590.field8289, false);
            class655.field9229 = null;
        }
        if (arg3 != -101) {
            method3((String) null, (String) null, -127, -10, (String) null, 64, (String) null);
        }
        if (~arg5 == -4 && class655.field9229 == null) {
            class655.field9229 = class533.method2890(0, (byte) 7, arg1, 0, class590.field8289, arg4);
            if (class655.field9229 != null) {
                class301.field3698.field6625 = arg1;
                class301.field3698.field6642 = arg4;
                class301.field3698.method138(class590.field8289, (byte) 80);
            }
        }
        if (~arg5 == -4 && class655.field9229 == null) {
            method5(arg0, -1, true, -101, -1, class301.field3698.field6616);
        } else {
            Container var6;
            if (class655.field9229 != null) {
                class95.field1307 = arg4;
                var6 = class655.field9229;
                class366.field4659 = arg1;
            } else if (class582.field8140 == null) {
                if (class422.field5308 == null) {
                    var6 = class678.field9508;
                } else {
                    var6 = class422.field5308;
                }
                class95.field1307 = var6.getSize().width;
                class366.field4659 = var6.getSize().height;
            } else {
                Insets var7 = class582.field8140.getInsets();
                class95.field1307 = class582.field8140.getSize().width + -var7.left + -var7.right;
                int var10001 = -var7.top;
                class366.field4659 = class582.field8140.getSize().height + var10001 + -var7.bottom;
                var6 = class582.field8140;
            }
            if (arg5 != 1) {
                class50.method316((byte) -10);
            } else {
                class523.field7111 = class593.field8327;
                class267.field3382 = 0;
                class193.field2426 = (-class593.field8327 + class95.field1307) / 2;
                class244.field3022 = class316.field4060;
            }
            if (class591.field8310 != field9) {
                boolean var10000;
                if (~class523.field7111 > -1025 && ~class244.field3022 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (arg2) {
                class545.method2943(4);
            } else {
                class500.field6585.setSize(class523.field7111, class244.field3022);
                class32.field452.method1068(class500.field6585);
                if (class582.field8140 == var6) {
                    Insets var8 = class582.field8140.getInsets();
                    class500.field6585.setLocation(var8.left - -class193.field2426, class267.field3382 + var8.top);
                } else {
                    class500.field6585.setLocation(class193.field2426, class267.field3382);
                }
            }
            if (arg5 >= 2) {
                class195.field2454 = true;
            } else {
                class195.field2454 = false;
            }
            if (~class316.field4063 != 0) {
                class635.method3557(true, (byte) 105);
            }
            if (class446.field5686 != null && class669.method3760(class504.field6675, (byte) -62)) {
                class76.method454(true);
            }
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class413.field5168[var9] = true;
            }
            class317.field4067 = true;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(FIIFBIFI)[F")
    public static final float[] method6(float arg0, int arg1, int arg2, float arg3, byte arg4, int arg5, float arg6, int arg7) {
        ++field3;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
        var8[8] = var10;
        var8[6] = -var11;
        var8[1] = 0.0F;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        var8[2] = var11;
        var8[0] = var10;
        var8[7] = 0.0F;
        var8[3] = 0.0F;
        float var12 = -var10 + 1.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (-(var15 * var15) + 1.0F)));
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 + arg5 * arg5));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg2) / var19;
                var16 = (float) arg5 / var19;
            }
            var13[8] = var16 * var16 * var17 + var15;
            var13[7] = -var14 * var18;
            var13[6] = var14 * var16 * var17;
            var13[3] = -var16 * var18;
            var13[4] = var15;
            var13[5] = var14 * var18;
            var13[0] = var14 * var14 * var17 + var15;
            var13[1] = var16 * var18;
            var13[2] = var14 * var16 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[7] *= arg0;
        var9[4] *= arg6;
        if (arg4 != -72) {
            return null;
        } else {
            var9[6] *= arg0;
            var9[1] *= arg3;
            var9[0] *= arg3;
            var9[8] *= arg0;
            var9[5] *= arg6;
            var9[3] *= arg6;
            var9[2] *= arg3;
            return var9;
        }
    }

    static {
        for (int var0 = 0; ~var0 > -27; ++var0) {
            field4[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field4[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; ~var2 > -63; ++var2) {
            field4[var2] = (char) (var2 + -52 + 48);
        }
        field4[63] = '-';
        field4[62] = '*';
        field7 = new class40();
        field8 = new class259(6, 1);
        field9 = new class104("LIVE", 0);
    }
}
