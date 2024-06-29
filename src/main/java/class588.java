import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class588 extends class56 {

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "Z")
    public static boolean field8001 = false;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "Lpn;")
    public static class776 field8006 = new class776("LIVE", 0);

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "D")
    public static double field8008;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field7999;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field8004;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field8005;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "Ljava/lang/String;")
    public static String field8007;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "[I")
    public static int[] field8002;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BILes;)V", line = 5)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg0 >= -44) {
            field8007 = null;
        }
        ++field8000;
        if (~arg1 == -1) {
            super.field762 = arg2.method2396((byte) 25) == 1;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)[[I", line = 20)
    public final int[][] method187(byte arg0, int arg1) {
        ++field8003;
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (arg0 < 35) {
            this.method145(-17, 43);
        }
        if (super.field759.field341) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class642.field8759; ++var7) {
                this.method3375(arg1, -124, var7);
                int[][] var8 = this.method495(69, class299.field3578, 0);
                var4[var7] = var8[0][class113.field1424];
                var5[var7] = var8[1][class113.field1424];
                var6[var7] = var8[2][class113.field1424];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILwk;)V", line = 61)
    public static final void method3373(int arg0, class154 arg1) {
        arg1.field1918 = null;
        ++field8005;
        if (arg0 < 44) {
            method3374(21);
        }
        if (~class349.field4358 > -21) {
            class415.field5433.method2444(11586, arg1);
            ++class349.field4358;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 79)
    public class588() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V", line = 87)
    public static void method3374(int arg0) {
        if (arg0 >= 1) {
            field8007 = null;
            field8006 = null;
            field8002 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[I", line = 99)
    public final int[] method145(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method3375(16, -71, 24);
        }
        ++field7999;
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            for (int var4 = 0; var4 < class642.field8759; ++var4) {
                this.method3375(arg1, -78, var4);
                int[] var5 = this.method492(0, class299.field3578, (byte) 64);
                var3[var4] = var5[class113.field1424];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(III)V", line = 135)
    private final void method3375(int arg0, int arg1, int arg2) {
        ++field8004;
        int var4 = class648.field8837[arg2];
        int var5 = class349.field4354[arg0];
        if (arg1 <= -56) {
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class113.field1424 = arg2;
                class299.field3578 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class299.field3578 = arg2;
                class113.field1424 = arg0;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class299.field3578 = arg2;
                class113.field1424 = class642.field8759 - arg0;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class113.field1424 = arg2;
                class299.field3578 = -arg0 + class784.field10832;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class113.field1424 = class642.field8759 - arg2;
                class299.field3578 = class784.field10832 - arg0;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class113.field1424 = -arg0 + class642.field8759;
                class299.field3578 = class784.field10832 - arg2;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class113.field1424 = arg0;
                class299.field3578 = -arg2 + class784.field10832;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class299.field3578 = arg0;
                class113.field1424 = -arg2 + class642.field8759;
            }
            class299.field3578 &= class75.field1037;
            class113.field1424 &= class446.field5990;
        }
    }
}
