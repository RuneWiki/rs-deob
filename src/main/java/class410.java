import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class410 implements class653 {

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public int field5985;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "Lut;")
    public class109 field5989;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public int field5987;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public int field5975;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    public int field5990;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public int field5973;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "Ljava/lang/String;")
    public String field5984;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public int field5980;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "Lgi;")
    public class630 field5988;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public int field5974;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
    public int field5983;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public int field5982;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public int field5976;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IFIIIIIII[F)V", line = 4)
    public static final void method2476(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float[] arg9) {
        field5978++;
        int var10 = arg8 - arg5;
        int var11 = arg2 - arg0;
        int var12 = arg4 - arg6;
        float var13 = arg9[2] * (float) var12 + arg9[1] * (float) var10 + arg9[0] * (float) var11;
        float var14 = arg9[arg7] * (float) var12 + arg9[3] * (float) var11 + arg9[4] * (float) var10;
        float var15 = arg9[8] * (float) var12 + arg9[7] * (float) var10 + arg9[6] * (float) var11;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg1 + 0.5F;
        if (arg3 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg3 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg3 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class254.field3899 = var18;
        class473.field6757 = var17;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V", line = 58)
    public static final void method2477(byte arg0) {
        field5977++;
        if (arg0 != -111) {
            return;
        }
        class356 var1 = (class356) class691.field9713.method472((byte) -74);
        boolean var2 = class648.field9107 != null || class83.field1375 > 0;
        if (var2) {
            class683.field9630 = 1;
        }
        if (class671.field9479 && class603.field8514.method1364(true, 81) && class340.field5002 > 2) {
            if (var2) {
                class75.field1309 = (class279) class663.field9367.field716.field9384.field9384;
            } else {
                class224.method1481((class279) class663.field9367.field716.field9384.field9384, var1.method1032((byte) 15), var1.method1031((byte) -45), false);
            }
        } else if (var2) {
            class75.field1309 = (class279) class663.field9367.field716.field9384;
        } else {
            class224.method1481((class279) class663.field9367.field716.field9384, var1.method1032((byte) 15), var1.method1031((byte) 92), false);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)V", line = 95)
    public static final void method2478(byte arg0, int arg1) {
        if (!class287.field4270.field3698) {
            arg1 = -1;
        }
        if (arg0 != 90) {
            method2479(-51, -44, 61);
        }
        field5986++;
        if (class23.field319 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class428 var2 = class287.field4278.method1330(arg1, 72);
            class113 var3 = var2.method2563(arg0 - 24780);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class368.field5267.method28(new Point(var2.field6285, var2.field6286), var3.method874(), 17, class31.field486, var3.method887(), var3.method873());
                class23.field319 = arg1;
            }
        }
        if (arg1 == -1 && class23.field319 != -1) {
            class368.field5267.method28(new Point(), -1, 17, class31.field486, null, -1);
            class23.field319 = -1;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)I", line = 135)
    public static final int method2479(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            field5979++;
            return arg0 == 1 || arg0 == 3 ? class418.field6101[arg2 & 0x3] : class574.field8074[arg2 & 0x3];
        } else {
            return 122;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)Lrw;", line = 153)
    public final class703 method351(byte arg0) {
        if (arg0 < 73) {
            this.field5989 = null;
        }
        field5981++;
        return class224.field3156;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ljava/lang/String;Lut;Lgi;IIIIIIIIII)V", line = 170)
    public class410(String arg0, class109 arg1, class630 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field5985 = arg8;
        this.field5989 = arg1;
        this.field5987 = arg11;
        this.field5975 = arg7;
        this.field5990 = arg4;
        this.field5973 = arg5;
        this.field5984 = arg0;
        this.field5980 = arg12;
        this.field5988 = arg2;
        this.field5974 = arg9;
        this.field5983 = arg3;
        this.field5982 = arg6;
        this.field5976 = arg10;
    }
}
