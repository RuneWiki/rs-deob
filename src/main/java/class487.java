import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class487 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLr;)V", line = 7)
    public static final void method2795(byte arg0, class562 arg1) {
        field6747++;
        if (class218.field2857) {
            class379.method2165(-23299, arg1);
        } else {
            class35.method205(arg1, (byte) 44);
        }
        if (arg0 == 31) {
            ;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(JJ)J", line = 32)
    public static long method2796(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([SZ)[S", line = 48)
    public static final short[] method2797(short[] arg0, boolean arg1) {
        field6748++;
        if (arg0 == null) {
            return null;
        }
        short[] var2 = new short[arg0.length];
        if (arg1) {
            method2798(98, null, -81, 106, -55, 45, 92, 99, 46, -1.1693312F);
        }
        class2.method11(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[FIIIIIIIF)V", line = 67)
    public static final void method2798(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9) {
        int var10 = arg3 - arg2;
        int var11 = arg5 - arg8;
        field6750++;
        int var12 = arg4 - arg6;
        float var13 = arg1[2] * (float) var11 + arg1[1] * (float) var10 + arg1[0] * (float) var12;
        float var14 = arg1[5] * (float) var11 + arg1[4] * (float) var10 + arg1[3] * (float) var12;
        float var15 = arg1[8] * (float) var11 + arg1[7] * (float) var10 + arg1[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg0 != 11999) {
            return;
        }
        float var18 = arg9 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg7 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg7 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class113.field1448 = var17;
        class242.field3192 = var18;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Z", line = 120)
    public static final boolean method2799(byte arg0) {
        field6749++;
        if (arg0 < 8) {
            return false;
        } else if (class574.field7844 == 0) {
            return class16.field217.method293(-119);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!q", name = "J", descriptor = "(I)V")
    public abstract void method354(int arg0);

    @OriginalMember(owner = "client!q", name = "AA", descriptor = "(I)V")
    public abstract void method348(int arg0);

    @OriginalMember(owner = "client!q", name = "w", descriptor = "(I)V")
    public abstract void method364(int arg0);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method352();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method363(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "na", descriptor = "(IIIIII)V")
    public abstract void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "(I)V")
    public abstract void method349(int arg0);

    @OriginalMember(owner = "client!q", name = "M", descriptor = "(Lq;)V")
    public abstract void method344(class487 arg0);

    @OriginalMember(owner = "client!q", name = "wa", descriptor = "(III[I)V")
    public abstract void method358(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "U", descriptor = "(III)V")
    public abstract void method356(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "([I)V")
    public abstract void method365(int[] arg0);

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(I)V")
    public abstract void method361(int arg0);

    @OriginalMember(owner = "client!q", name = "o", descriptor = "(I)V")
    public abstract void method357(int arg0);

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(III)V")
    public abstract void method359(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class487 method345();
}
