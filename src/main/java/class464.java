import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class464 {

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    private int field6696;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "[Lwf;")
    private class89[] field6698;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "Z")
    public static boolean field6695 = false;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "J")
    private long field6690;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "Lwf;")
    private class89 field6693;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(JLwf;B)V")
    public final void method2795(long arg0, class89 arg1, byte arg2) {
        if (arg2 > -52) {
            return;
        }
        field6697++;
        if (arg1.field1094 != null) {
            arg1.method701(120);
        }
        class89 var5 = this.field6698[(int) (arg0 & (long) (this.field6696 - 1))];
        arg1.field1099 = var5;
        arg1.field1094 = var5.field1094;
        arg1.field1094.field1099 = arg1;
        arg1.field1099.field1094 = arg1;
        arg1.field1098 = arg0;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)Lwf;")
    public final class89 method2796(int arg0) {
        field6691++;
        if (this.field6693 == null) {
            return null;
        }
        class89 var2 = this.field6698[(int) (this.field6690 & (long) (this.field6696 - 1))];
        while (this.field6693 != var2) {
            if (this.field6693.field1098 == this.field6690) {
                class89 var3 = this.field6693;
                this.field6693 = this.field6693.field1099;
                return var3;
            }
            this.field6693 = this.field6693.field1099;
        }
        this.field6693 = null;
        if (arg0 <= 58) {
            this.method2795(-113L, null, (byte) 102);
        }
        return null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILhd;)V")
    public static final void method2797(int arg0, class523 arg1) {
        field6692++;
        if (!class211.field2717) {
            return;
        }
        class100.field1214++;
        if (arg1.field7667 != null) {
            class523 var2 = class202.method1268(class21.field309, class322.field4090, 0);
            if (var2 != null) {
                class170 var3 = new class170();
                var3.field2180 = var2;
                var3.field2179 = arg1;
                var3.field2178 = arg1.field7667;
                class239.method1444(var3);
            }
        }
        class282.method1669(class1.field1, false);
        class40.field511.method2777(arg1.field7723, -11);
        class40.field511.method2785(class322.field4090, 15103);
        class40.field511.method2759((byte) -125, class470.field6816);
        class40.field511.method2747(class21.field309, arg0 ^ 0x454);
        if (arg0 != 0) {
            method2799(65, 53, 60, 85, 74, 67, 34, (byte) -98);
        }
        class40.field511.method2785(arg1.field7567, arg0 + 15103);
        class40.field511.method2748(arg1.field7562, arg0 ^ 0x1F50);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IJ)Lwf;")
    public final class89 method2798(int arg0, long arg1) {
        field6694++;
        this.field6690 = arg1;
        class89 var4 = this.field6698[(int) ((long) (this.field6696 + arg0) & arg1)];
        for (this.field6693 = var4.field1099; this.field6693 != var4; this.field6693 = this.field6693.field1099) {
            if (this.field6693.field1098 == arg1) {
                class89 var5 = this.field6693;
                this.field6693 = this.field6693.field1099;
                return var5;
            }
        }
        this.field6693 = null;
        return null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method2799(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field6699++;
        int var8 = class33.method242(arg4, class533.field7845, class289.field3694, (byte) -128);
        int var9 = class33.method242(arg0, class533.field7845, class289.field3694, (byte) -128);
        int var10 = class33.method242(arg2, class147.field1870, class237.field3019, (byte) -128);
        int var11 = class33.method242(arg1, class147.field1870, class237.field3019, (byte) -128);
        int var12 = class33.method242(arg4 + arg6, class533.field7845, class289.field3694, (byte) -128);
        int var13 = class33.method242(arg0 - arg6, class533.field7845, class289.field3694, (byte) -128);
        for (int var14 = var8; var14 < var12; var14++) {
            class184.method1160(class387.field5088[var14], -7, arg3, var11, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class184.method1160(class387.field5088[var15], -7, arg3, var11, var10);
        }
        int var16 = class33.method242(arg2 + arg6, class147.field1870, class237.field3019, (byte) -128);
        int var17 = class33.method242(arg1 - arg6, class147.field1870, class237.field3019, (byte) -128);
        if (arg7 >= -31) {
            method2797(-105, null);
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class387.field5088[var18];
            class184.method1160(var19, -7, arg3, var16, var10);
            class184.method1160(var19, -7, arg5, var17, var16);
            class184.method1160(var19, -7, arg3, var11, var17);
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(I)V")
    public class464(int arg0) {
        this.field6696 = arg0;
        this.field6698 = new class89[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class89 var3 = this.field6698[var2] = new class89();
            var3.field1099 = var3;
            var3.field1094 = var3;
        }
    }
}
