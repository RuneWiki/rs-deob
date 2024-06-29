import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class47 {

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field839 = 0;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field836 = 0;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Le;")
    public static class191 field837 = class54.method368("Bitte entfernen Sie ", 2047);

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "[Le;")
    public static class191[] field844 = new class191[100];

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field835;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
    public static int[] field842;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Le;Le;II)V")
    public static final void method320(class191 arg0, class191 arg1, int arg2, int arg3) {
        field841++;
        class132.method892(arg3, arg1, (class191) null, 10289, arg0, arg2);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZIIII)V")
    public static final void method321(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field843++;
        int var7 = 0;
        class4.method14(-13974, arg4);
        int var8 = arg4 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -arg4;
        int var10 = arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int[] var14 = class232.field4151[arg6];
        if (!arg2) {
            method321(-107, -104, true, 15, -50, 5, -119);
        }
        int var15 = -1;
        int var16 = arg5 - var8;
        class242.method1700(7, arg3, var16, var14, arg5 - arg4);
        int var17 = arg5 + var8;
        class242.method1700(7, arg0, var17, var14, var16);
        class242.method1700(7, arg3, arg4 + arg5, var14, var17);
        while (var7 < var10) {
            var15 += 2;
            var13 += 2;
            var9 += var13;
            var12 += var15;
            if (var12 >= 0 && var11 >= 1) {
                class137.field2309[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                if (var8 > var10) {
                    int[] var18 = class232.field4151[arg6 - var10];
                    int var19 = class137.field2309[var10];
                    int[] var20 = class232.field4151[arg6 + var10];
                    int var21 = arg5 - var7;
                    int var22 = arg5 + var19;
                    int var23 = arg5 + var7;
                    int var24 = arg5 - var19;
                    class242.method1700(7, arg3, var24, var20, var21);
                    class242.method1700(7, arg0, var22, var20, var24);
                    class242.method1700(7, arg3, var23, var20, var22);
                    class242.method1700(7, arg3, var24, var18, var21);
                    class242.method1700(7, arg0, var22, var18, var24);
                    class242.method1700(7, arg3, var23, var18, var22);
                } else {
                    int[] var25 = class232.field4151[arg6 + var10];
                    int[] var26 = class232.field4151[arg6 - var10];
                    int var27 = arg5 + var7;
                    int var28 = arg5 - var7;
                    class242.method1700(7, arg3, var27, var25, var28);
                    class242.method1700(7, arg3, var27, var26, var28);
                }
                var9 -= var10 << 1;
            }
            int[] var29 = class232.field4151[arg6 + var7];
            int var30 = arg5 + var10;
            int[] var31 = class232.field4151[arg6 - var7];
            int var32 = arg5 - var10;
            if (var8 > var7) {
                int var33 = var7 > var11 ? class137.field2309[var7] : var11;
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class242.method1700(7, arg3, var35, var29, var32);
                class242.method1700(7, arg0, var34, var29, var35);
                class242.method1700(7, arg3, var30, var29, var34);
                class242.method1700(7, arg3, var35, var31, var32);
                class242.method1700(7, arg0, var34, var31, var35);
                class242.method1700(7, arg3, var30, var31, var34);
            } else {
                class242.method1700(7, arg3, var30, var29, var32);
                class242.method1700(7, arg3, var30, var31, var32);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method322(byte arg0) {
        field837 = null;
        if (arg0 > 50) {
            field842 = null;
            field844 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Lud;")
    public static final class14 method323(int arg0, int arg1) {
        field838++;
        class14 var2 = (class14) class137.field2307.method991((long) arg1, -25858);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field705.method826((byte) 35, class158.method1075((byte) 106, arg1), class227.method1625((byte) 120, arg1));
        class14 var4 = new class14();
        if (arg0 != -4453) {
            method323(117, 2);
        }
        var4.field176 = arg1;
        if (var3 != null) {
            var4.method94(2228, new class225(var3));
        }
        class137.field2307.method987(var4, (long) arg1, -2438);
        return var4;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class47() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class206 var7 = new class206();
        var7.field3657 = arg1 / 128;
        var7.field3663 = arg2 / 128;
        var7.field3666 = arg3 / 128;
        var7.field3661 = arg4 / 128;
        var7.field3647 = arg0;
        var7.field3656 = arg1;
        var7.field3667 = arg2;
        var7.field3646 = arg3;
        var7.field3648 = arg4;
        var7.field3673 = arg5;
        var7.field3651 = arg6;
        class99.field1588[class137.field2305++] = var7;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([BILji;)V")
    public final void method325(byte[] arg0, int arg1, class225 arg2) {
        field840++;
        if (arg2.field3995[arg2.field3996] != 31 || arg2.field3995[arg2.field3996 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field835 == null) {
            this.field835 = new Inflater(true);
        }
        try {
            this.field835.setInput(arg2.field3995, arg2.field3996 + arg1, -8 - (arg2.field3996 - arg2.field3995.length + 10));
            this.field835.inflate(arg0);
        } catch (Exception var4) {
            this.field835.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field835.reset();
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(III)V")
    private class47(int arg0, int arg1, int arg2) {
    }
}
