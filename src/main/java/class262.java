import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class262 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lcc;")
    public static class263 field3960 = null;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Z")
    public static boolean field3964 = false;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field3962 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3956 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3958 = 0;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lbh;")
    public static class288 field3959;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 32)
    public static void method1881(byte arg0) {
        field3959 = null;
        field3960 = null;
        int var1 = -99 / ((-arg0 - 27) / 61);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BJ)V", line = 43)
    public static final void method1882(byte arg0, long arg1) {
        try {
            if (arg0 > -38) {
                field3956 = 67;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        field3971++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V", line = 95)
    public static final void method1883(int arg0, boolean arg1) {
        field3968++;
        if (arg1 != class227.field3242) {
            class227.field3242 = arg1;
            if (arg0 == 25654) {
                class312.method2189(0);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(CZ)Z", line = 111)
    public static final boolean method1884(char arg0, boolean arg1) {
        field3970++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class128.field1750;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return !arg1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 148)
    public static final void method1885(int arg0) {
        field3966++;
        if (class113.field1607 == -1 || class96.field1245 == -1) {
            return;
        }
        int var1 = ((class149.field2068 - class100.field1315) * class321.field4924 >> 16) + class100.field1315;
        class321.field4924 += var1;
        if (class321.field4924 < 65535) {
            class277.field4318 = false;
            class342.field5297 = false;
        } else {
            class321.field4924 = 65535;
            if (class277.field4318) {
                class342.field5297 = false;
            } else {
                class342.field5297 = true;
            }
            class277.field4318 = true;
        }
        float[] var2 = new float[3];
        float var3 = (float) class321.field4924 / 65535.0F;
        int var4 = class247.field3743 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class147.field2045[class113.field1607][var4][var5];
            int var7 = class147.field2045[class113.field1607][var4][var5] * 3;
            int var8 = class147.field2045[class113.field1607][var4 + 1][var5] * 3;
            int var9 = (-class147.field2045[class113.field1607][var4 + 3][var5] - (-class147.field2045[class113.field1607][var4 + 2][var5] - class147.field2045[class113.field1607][var4 + 2][var5])) * 3;
            int var10 = var8 - var7;
            int var11 = var7 + var9 - (var8 * 2);
            int var12 = class147.field2045[class113.field1607][var4 + 2][var5] + var8 - var9 - var6;
            var2[var5] = (((float) var12 * var3 + (float) var11) * var3 + (float) var10) * var3 + (float) var6;
        }
        class130.field1792 = (int) var2[0] - class142.field1992 * 128;
        class301.field4704 = (int) var2[1] * -1;
        class109.field1506 = (int) var2[2] - (class118.field1668 * 128);
        float[] var13 = new float[3];
        int var14 = -47 % ((77 - arg0) / 42);
        int var15 = class180.field2608 * 2;
        for (int var16 = 0; var16 < 3; var16++) {
            int var17 = class147.field2045[class96.field1245][var15][var16] * 3;
            int var18 = class147.field2045[class96.field1245][var15 + 1][var16] * 3;
            int var19 = class147.field2045[class96.field1245][var15][var16];
            int var20 = (class147.field2045[class96.field1245][var15 + 2][var16] + class147.field2045[class96.field1245][var15 + 2][var16] - class147.field2045[class96.field1245][var15 + 3][var16]) * 3;
            int var21 = var18 - var17;
            int var22 = var17 + var20 - (var18 * 2);
            int var23 = class147.field2045[class96.field1245][var15 + 2][var16] + var18 - var19 - var20;
            var13[var16] = (((float) var23 * var3 + (float) var22) * var3 + (float) var21) * var3 + (float) var19;
        }
        float var24 = (var13[1] - var2[1]) * -1.0F;
        float var25 = var13[0] - var2[0];
        float var26 = var13[2] - var2[2];
        double var27 = Math.sqrt((double) (var25 * var25 + var26 * var26));
        class283.field4438 = (float) Math.atan2((double) var24, var27);
        class198.field2828 = -((float) Math.atan2((double) var25, (double) var26));
        class30.field380 = (int) ((double) class283.field4438 * 325.949D) & 0x7FF;
        class323.field4975 = (int) ((double) class198.field2828 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V", line = 264)
    public static final void method1886(int arg0, int arg1, int arg2) {
        if (arg0 == 8) {
            arg0 = 4;
        }
        if (arg1 != 3) {
            method1886(-35, 15, -66);
        }
        if (arg0 == 4 && !class172.field2481) {
            arg2 = 2;
            arg0 = 2;
        }
        field3969++;
        if (class270.field4254 != arg0) {
            if (class211.field2978) {
                return;
            }
            if (class270.field4254 != 0) {
                class275.field4286[class270.field4254].method15();
            }
            if (arg0 != 0) {
                class70 var3 = class275.field4286[arg0];
                var3.method17();
                var3.method14(arg2);
            }
            class270.field4254 = arg0;
            class163.field2250 = arg2;
        } else if (arg0 != 0 && class163.field2250 != arg2) {
            class275.field4286[arg0].method14(arg2);
            class163.field2250 = arg2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(IZ)V", line = 313)
    public static final void method1887(int arg0, boolean arg1) {
        if (!arg1) {
            class97.field1267.method1236(-495037017, arg0);
            field3967++;
            class183.field2640.method1236(-495037017, arg0);
        }
    }
}
