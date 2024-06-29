import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class231 extends class182 {

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    private int field3784 = 4096;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3787 = "Unable to find ";

    @OriginalMember(owner = "client!o", name = "P", descriptor = "[F")
    public static float[] field3791 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!o", name = "O", descriptor = "[I")
    public static int[] field3790 = new int[5];

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field3795 = 0;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Lid;")
    public static class287 field3793;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)Lka;", line = 8)
    public static final class211 method1612(int arg0) {
        class211 var1 = new class211(class91.field1617, class12.field368, class321.field5218[arg0], class232.field3804[0], class9.field284[0], class76.field1367[0], class309.field5053[0], class323.field5225);
        class213.method1470(false);
        field3785++;
        return var1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Loe;IB)V", line = 18)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field3784 = arg0.method989(127);
        }
        if (arg2 != 60) {
            method1612(85);
        }
        field3788++;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 87)
    public class231() {
        super(1, true);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V", line = 39)
    public static final void method1613(byte arg0) {
        field3794++;
        int var1 = 0;
        int[] var2 = new int[class108.field1989];
        for (int var3 = 0; var3 < class108.field1989; var3++) {
            class11 var4 = class296.method2124(0, var3);
            if (var4.field351 >= 0 || var4.field320 >= 0) {
                var2[var1++] = var3;
            }
        }
        if (arg0 > -98) {
            method1615((String) null, (String) null, -128, (String) null);
        }
        class25.field644 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            class25.field644[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILqc;IIIII)V", line = 78)
    public static final void method1614(int arg0, class6 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3789++;
        class223.method1563(arg1.field199, arg5, arg2, arg6, arg0, arg4, arg1.field213, arg3, -13663);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[I", line = 107)
    public final int[] method125(int arg0, int arg1) {
        field3786++;
        int[] var3 = this.field3166.method775(arg1, 124);
        if (this.field3166.field1903) {
            int[] var4 = this.method1292(arg1 - 1 & class194.field3266, 0, -116);
            int[] var5 = this.method1292(arg1, 0, arg0 - 126);
            int[] var6 = this.method1292(class194.field3266 & arg1 + 1, 0, -97);
            for (int var7 = 0; var7 < class26.field672; var7++) {
                int var8 = (var5[class53.field1056 & var7 + 1] - var5[class53.field1056 & var7 - 1]) * this.field3784;
                int var9 = var8 >> 12;
                int var10 = (var6[var7] - var4[var7]) * this.field3784;
                int var11 = var10 >> 12;
                int var12 = var9 * var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        if (arg0 != 2) {
            field3791 = (float[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 156)
    public static final String method1615(String arg0, String arg1, int arg2, String arg3) {
        field3792++;
        for (int var4 = arg1.indexOf(arg3); var4 != -1; var4 = arg1.indexOf(arg3, arg0.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg0 + arg1.substring(var4 + arg3.length());
        }
        int var5 = 49 / ((arg2 + 15) / 48);
        return arg1;
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V", line = 174)
    public static void method1616(int arg0) {
        field3793 = null;
        if (arg0 != 0) {
            method1616(102);
        }
        field3791 = null;
        field3787 = null;
        field3790 = null;
    }
}
