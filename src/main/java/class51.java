import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class51 extends class440 {

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public static final void method575(byte arg0) {
        ++field1034;
        int var1 = class467.field6718 * 512 + 256;
        int var2 = class318.field4691 * 512 + 256;
        int var3 = class674.method3748(var1, class58.field1112, 69, var2) - class597.field8435;
        if (~class555.field7858 > -101) {
            if (~var1 < ~class131.field1928) {
                class131.field1928 += (var1 - class131.field1928) * class555.field7858 / 1000 + class338.field4983;
                if (class131.field1928 > var1) {
                    class131.field1928 = var1;
                }
            }
            if (~var3 < ~class568.field7998) {
                class568.field7998 += (var3 - class568.field7998) * class555.field7858 / 1000 + class338.field4983;
                if (var3 < class568.field7998) {
                    class568.field7998 = var3;
                }
            }
            if (var1 < class131.field1928) {
                class131.field1928 -= (-var1 + class131.field1928) * class555.field7858 / 1000 + class338.field4983;
                if (~class131.field1928 > ~var1) {
                    class131.field1928 = var1;
                }
            }
            if (class413.field6011 < var2) {
                class413.field6011 += class338.field4983 - -((-class413.field6011 + var2) * class555.field7858 / 1000);
                if (var2 < class413.field6011) {
                    class413.field6011 = var2;
                }
            }
            if (~var3 > ~class568.field7998) {
                class568.field7998 -= (-var3 + class568.field7998) * class555.field7858 / 1000 + class338.field4983;
                if (~class568.field7998 > ~var3) {
                    class568.field7998 = var3;
                }
            }
            if (class413.field6011 > var2) {
                class413.field6011 -= (class413.field6011 - var2) * class555.field7858 / 1000 + class338.field4983;
                if (~var2 < ~class413.field6011) {
                    class413.field6011 = var2;
                }
            }
        } else {
            class131.field1928 = class467.field6718 * 512 + 256;
            class413.field6011 = class318.field4691 * 512 - -256;
            class568.field7998 = class674.method3748(class131.field1928, class58.field1112, 83, class413.field6011) + -class597.field8435;
        }
        int var4 = class503.field7116 * 512 - -256;
        int var5 = class174.field2481 * 512 - -256;
        if (arg0 == 16) {
            int var6 = class674.method3748(var4, class58.field1112, 112, var5) + -class129.field1910;
            int var7 = -class131.field1928 + var4;
            int var8 = var6 - class568.field7998;
            int var9 = -class413.field6011 + var5;
            int var10 = (int) Math.sqrt((double) (var7 * var7 - -(var9 * var9)));
            int var11 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var10));
            if (var11 < 1024) {
                var11 = 1024;
            }
            int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 16383;
            if (var11 > 3072) {
                var11 = 3072;
            }
            if (~class544.field7662 > ~var11) {
                class544.field7662 += (-class544.field7662 + var11 >> 3) * class429.field6294 / 1000 + class270.field4055 << 3;
                if (~var11 > ~class544.field7662) {
                    class544.field7662 = var11;
                }
            }
            if (~class544.field7662 < ~var11) {
                class544.field7662 -= (-var11 + class544.field7662 >> 3) * class429.field6294 / 1000 + class270.field4055 << 3;
                if (~var11 < ~class544.field7662) {
                    class544.field7662 = var11;
                }
            }
            int var13 = -class637.field9001 + var12;
            if (var13 > 8192) {
                var13 -= 16384;
            }
            if (var13 < -8192) {
                var13 += 16384;
            }
            int var14 = var13 >> 3;
            if (var14 > 0) {
                class637.field9001 += class429.field6294 * var14 / 1000 + class270.field4055 << 3;
                class637.field9001 &= 16383;
            }
            if (var14 < 0) {
                class637.field9001 -= -var14 * class429.field6294 / 1000 + class270.field4055 << 3;
                class637.field9001 &= 16383;
            }
            int var15 = -class637.field9001 + var12;
            if (var15 > 8192) {
                var15 -= 16384;
            }
            if (var15 < -8192) {
                var15 += 16384;
            }
            if (~var15 > -1 && ~var14 < -1 || ~var15 < -1 && var14 < 0) {
                class637.field9001 = var12;
            }
            class300.field4472 = 0;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIFIII[FIF)V")
    public static final void method576(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9, float arg10) {
        int var11 = arg6 - arg7;
        int var12 = arg1 - arg0;
        ++field1036;
        int var13 = arg9 - arg5;
        float var14 = arg8[2] * (float) var12 + arg8[0] * (float) var11 + arg8[1] * (float) var13;
        float var15 = arg8[arg2] * (float) var12 + arg8[3] * (float) var11 + arg8[4] * (float) var13;
        float var16 = arg8[8] * (float) var12 + arg8[7] * (float) var13 + arg8[6] * (float) var11;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg4 != 1.0F) {
            var17 = arg4 * var17;
        }
        float var18 = var15 + 0.5F + arg10;
        if (arg3 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg3 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg3 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class202.field2857 = var18;
        class366.field5234 = var17;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method577(Throwable arg0, int arg1) throws IOException {
        if (arg1 <= 75) {
            return null;
        } else {
            ++field1035;
            String var3;
            if (arg0 instanceof class102) {
                class102 var2 = (class102) arg0;
                var3 = var2.field1603 + " | ";
                arg0 = var2.field1608;
            } else {
                var3 = "";
            }
            StringWriter var4 = new StringWriter();
            PrintWriter var5 = new PrintWriter(var4);
            arg0.printStackTrace(var5);
            var5.close();
            String var6 = var4.toString();
            BufferedReader var7 = new BufferedReader(new StringReader(var6));
            String var8 = var7.readLine();
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                String var12;
                if (var10 != -1) {
                    var12 = var9.substring(0, var10);
                } else {
                    var12 = var9;
                }
                String var13 = var12.trim();
                String var14 = var13.substring(1 + var13.lastIndexOf(32));
                String var15 = var14.substring(1 + var14.lastIndexOf(9));
                String var16 = var3 + var15;
                if (~var10 != 0 && ~var11 != 0) {
                    int var17 = var9.indexOf(".java:", var10);
                    if (~var17 <= -1) {
                        var16 = var16 + var9.substring(var17 + 5, var11);
                    }
                }
                var3 = var16 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field1038;
        int var3 = 17 / ((-56 - arg0) / 41);
        int[] var4 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            class476.method2790(var4, 0, class549.field7715, class418.field6099[arg1]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class51() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIZZBI)V")
    public static final void method578(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, byte arg5, int arg6) {
        ++field1037;
        if (arg5 != -46) {
            method578(79, 14, 45, false, true, (byte) 34, -45);
        }
        if (arg1 < arg6) {
            int var7 = (arg1 - -arg6) / 2;
            int var8 = arg1;
            class178 var9 = class439.field6407[var7];
            class439.field6407[var7] = class439.field6407[arg6];
            class439.field6407[arg6] = var9;
            for (int var10 = arg1; arg6 > var10; ++var10) {
                if (~class271.method1791((byte) 125, arg0, arg4, var9, arg3, arg2, class439.field6407[var10]) >= -1) {
                    class178 var11 = class439.field6407[var10];
                    class439.field6407[var10] = class439.field6407[var8];
                    class439.field6407[var8++] = var11;
                }
            }
            class439.field6407[arg6] = class439.field6407[var8];
            class439.field6407[var8] = var9;
            method578(arg0, arg1, arg2, arg3, arg4, (byte) -46, var8 + -1);
            method578(arg0, var8 - -1, arg2, arg3, arg4, (byte) -46, arg6);
        }
    }
}
