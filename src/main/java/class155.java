import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class155 extends class4 {

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    private int field2015 = 4096;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "[I")
    public static int[] field2011 = new int[3];

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "Lwg;")
    public static class58 field2008 = new class58(8);

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "[I")
    public static int[] field2017 = new int[8];

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "Lvt;")
    public static class344 field2016 = new class344("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)Z")
    public static final boolean method836(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class483.field6746; ++var3) {
            class276 var4 = class257.field3200[var3];
            if (var4.field3597 == 1) {
                int var5 = var4.field3593 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3608 * var5 >> 8) + var4.field3603;
                    int var7 = (var4.field3599 * var5 >> 8) + var4.field3595;
                    int var8 = (var4.field3601 * var5 >> 8) + var4.field3606;
                    int var9 = (var4.field3605 * var5 >> 8) + var4.field3609;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3597 == 2) {
                int var10 = arg0 - var4.field3593;
                if (var10 > 0) {
                    int var11 = (var4.field3608 * var10 >> 8) + var4.field3603;
                    int var12 = (var4.field3599 * var10 >> 8) + var4.field3595;
                    int var13 = (var4.field3601 * var10 >> 8) + var4.field3606;
                    int var14 = (var4.field3605 * var10 >> 8) + var4.field3609;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3597 == 3) {
                int var15 = var4.field3603 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3598 * var15 >> 8) + var4.field3593;
                    int var17 = (var4.field3594 * var15 >> 8) + var4.field3604;
                    int var18 = (var4.field3601 * var15 >> 8) + var4.field3606;
                    int var19 = (var4.field3605 * var15 >> 8) + var4.field3609;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3597 == 4) {
                int var20 = arg2 - var4.field3603;
                if (var20 > 0) {
                    int var21 = (var4.field3598 * var20 >> 8) + var4.field3593;
                    int var22 = (var4.field3594 * var20 >> 8) + var4.field3604;
                    int var23 = (var4.field3601 * var20 >> 8) + var4.field3606;
                    int var24 = (var4.field3605 * var20 >> 8) + var4.field3609;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3597 == 5) {
                int var25 = arg1 - var4.field3606;
                if (var25 > 0) {
                    int var26 = (var4.field3598 * var25 >> 8) + var4.field3593;
                    int var27 = (var4.field3594 * var25 >> 8) + var4.field3604;
                    int var28 = (var4.field3608 * var25 >> 8) + var4.field3603;
                    int var29 = (var4.field3599 * var25 >> 8) + var4.field3595;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
    public class155() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(III)Z")
    public static final boolean method837(int arg0, int arg1, int arg2) {
        if (arg0 != 8) {
            method836(94, 6, -67);
        }
        ++field2013;
        return (32 & arg2) != 0;
    }

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "(I)V")
    public static void method838(int arg0) {
        if (arg0 <= 100) {
            field2012 = -61;
        }
        field2017 = null;
        field2011 = null;
        field2016 = null;
        field2008 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field2010;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (arg0 != 10) {
            field2011 = null;
        }
        if (super.field31.field5127) {
            int[] var4 = this.method20(0, -21986, arg1 + -1 & class376.field5248);
            int[] var5 = this.method20(0, -21986, arg1);
            int[] var6 = this.method20(0, arg0 ^ -21996, class376.field5248 & arg1 - -1);
            for (int var7 = 0; ~var7 > ~class132.field1627; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field2015;
                int var9 = (var5[var7 + 1 & class150.field1971] + -var5[class150.field1971 & var7 + -1]) * this.field2015;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 - (-var13 + -4096)) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIII)Lrn;")
    public static final class307 method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2009;
        if (arg6 > -14) {
            method838(-110);
        }
        long var7 = (long) arg3 * 97549L ^ (long) arg5 * 67481L ^ (long) arg4 * 475427L ^ (long) arg0 * 986053L ^ (long) arg1 * 32147369L ^ (long) arg2 * 76724863L;
        class307 var9 = (class307) field2008.method323(var7, -19814);
        if (var9 != null) {
            return var9;
        } else {
            class307 var10 = class453.field6425.method922(arg5, arg3, arg4, arg0, arg1, arg2);
            field2008.method316(var7, (byte) -109, var10);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 > -89) {
            field2012 = 36;
        }
        if (~arg2 == -1) {
            this.field2015 = arg1.method3090(-126);
        }
        ++field2014;
    }
}
