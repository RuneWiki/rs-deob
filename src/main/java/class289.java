import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class class289 {

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    private int field4604 = 4;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public int field4605 = 4;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "[S")
    private short[] field4611 = new short[512];

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    private int field4603 = 4;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    private int field4619 = 0;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    private int field4617 = 4;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "Lnb;")
    public static class341 field4612 = new class341(64);

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "Lhn;")
    public static class39 field4608;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "[S")
    private short[] field4614;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1964(int arg0) {
        field4610++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class293.field4708 - 1; var2++) {
                if (class276.field4401[var2] < 1000 && class276.field4401[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class241.field3944[var2];
                    class241.field3944[var2] = class241.field3944[var2 + 1];
                    class241.field3944[var2 + 1] = var3;
                    String var4 = class166.field2909[var2];
                    class166.field2909[var2] = class166.field2909[var2 + 1];
                    class166.field2909[var2 + 1] = var4;
                    int var5 = class161.field2863[var2];
                    class161.field2863[var2] = class161.field2863[var2 + 1];
                    class161.field2863[var2 + 1] = var5;
                    int var6 = class70.field1135[var2];
                    class70.field1135[var2] = class70.field1135[var2 + 1];
                    class70.field1135[var2 + 1] = var6;
                    int var7 = class221.field3691[var2];
                    class221.field3691[var2] = class221.field3691[var2 + 1];
                    class221.field3691[var2 + 1] = var7;
                    short var8 = class276.field4401[var2];
                    class276.field4401[var2] = class276.field4401[var2 + 1];
                    class276.field4401[var2 + 1] = var8;
                    long var9 = class110.field1868[var2];
                    class110.field1868[var2] = class110.field1868[var2 + 1];
                    class110.field1868[var2 + 1] = var9;
                }
            }
        }
        if (arg0 != 1) {
            field4612 = (class341) null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V", line = 62)
    private final void method1965(boolean arg0) {
        field4607++;
        Random var2 = new Random((long) this.field4619);
        int var3 = 0;
        if (arg0) {
            method1973(true);
        }
        while (var3 < 255) {
            this.field4611[var3] = (short) var3;
            var3++;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class129.method1075(var5, 19192, var2);
            short var7 = this.field4611[var6];
            this.field4611[var6] = this.field4611[var5];
            this.field4611[var5] = this.field4611[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(IIIII)V", line = 437)
    public class289(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4605 = arg1;
        this.field4617 = arg2;
        this.field4619 = arg0;
        this.field4603 = arg4;
        this.field4604 = arg3;
        this.method1966((byte) 46);
        this.method1965(false);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V", line = 117)
    private final void method1966(byte arg0) {
        field4609++;
        this.field4614 = new short[this.field4605];
        for (int var2 = 0; var2 < this.field4605; var2++) {
            this.field4614[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 46) {
            this.field4617 = 90;
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V", line = 137)
    public static void method1967(byte arg0) {
        if (arg0 > -45) {
            method1967((byte) 102);
        }
        field4612 = null;
        field4608 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lcg;II)[Lta;", line = 149)
    public static final class217[] method1968(class49 arg0, int arg1, int arg2) {
        field4613++;
        if (arg2 != 0) {
            method1970((byte) -66);
        }
        return class160.method1276((byte) -28, arg1, arg0) ? class265.method1824(9192) : null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)I", line = 173)
    public static int method1969(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(B)V", line = 182)
    public static final void method1970(byte arg0) {
        field4616++;
        for (int var1 = 0; var1 < 5; var1++) {
            class104.field1745[var1] = false;
        }
        if (arg0 != 40) {
            field4612 = (class341) null;
        }
        class303.field4789 = 0;
        class277.field4402 = -1;
        class286.field4550 = 0;
        class213.field3586 = -1;
        class191.field3194 = 5;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)V", line = 211)
    public final void method1971(int arg0, int arg1, int arg2, int arg3) {
        field4615++;
        if (arg3 != 23471) {
            this.method1971(22, 100, -46, 43);
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg2; var7++) {
            var5[var7] = (var7 << 12) / arg2;
        }
        for (int var8 = 0; var8 < arg1; var8++) {
            var6[var8] = (var8 << 12) / arg1;
        }
        int[] var9 = new int[arg0];
        for (int var10 = 0; var10 < arg0; var10++) {
            var9[var10] = (var10 << 12) / arg0;
        }
        this.method1237(-25048);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field4605; var14++) {
                        int var15 = this.field4614[var14] << 12;
                        int var16 = var9[var11] * var15 >> 12;
                        int var17 = this.field4604 * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = this.field4604 * var18;
                        int var20 = var19 >> 12;
                        int var21 = this.field4603 * var15 >> 12;
                        int var22 = var20 + 1;
                        int var23 = this.field4617 * var15 >> 12;
                        int var24 = var20 & 0xFF;
                        int var25 = var5[var13] * var15 >> 12;
                        int var26;
                        if (var22 < var17) {
                            var26 = var22 & 0xFF;
                        } else {
                            var26 = 0;
                        }
                        int var27 = this.field4617 * var25;
                        int var28 = var19 & 0xFFF;
                        int var29 = class331.field5275[var28];
                        int var30 = var27 >> 12;
                        int var31 = var27 & 0xFFF;
                        int var32 = var30 + 1;
                        int var33 = var28 - 4096;
                        int var34 = class331.field5275[var31];
                        int var35 = var31 - 4096;
                        int var36;
                        if (var32 < var23) {
                            var36 = var32 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var30 & 0xFF;
                        int var38 = this.field4603 * var16;
                        int var39 = var38 >> 12;
                        int var40 = var39 + 1;
                        int var41 = var39 & 0xFF;
                        short var42 = this.field4611[var41];
                        short var43 = this.field4611[var26 + var42];
                        int var44 = var38 & 0xFFF;
                        short var45 = this.field4611[var24 + var42];
                        int var46 = class331.field5275[var44];
                        int var47 = var44 - 4096;
                        int var48;
                        if (var40 < var21) {
                            var48 = var40 & 0xFF;
                        } else {
                            var48 = 0;
                        }
                        short var49 = this.field4611[var48];
                        short var50 = this.field4611[var24 + var49];
                        short var51 = this.field4611[var26 + var49];
                        int var52 = class135.method1111(var44, (byte) 21, this.field4611[var37 + var45], var28, var31);
                        int var53 = class135.method1111(var44, (byte) 4, this.field4611[var36 + var45], var28, var35);
                        int var54 = ((var53 - var52) * var34 >> 12) + var52;
                        int var55 = class135.method1111(var44, (byte) 29, this.field4611[var37 + var43], var33, var31);
                        int var56 = class135.method1111(var44, (byte) 11, this.field4611[var36 + var43], var33, var35);
                        int var57 = var55 + ((var56 - var55) * var34 >> 12);
                        int var58 = ((var57 - var54) * var29 >> 12) + var54;
                        int var59 = class135.method1111(var47, (byte) 54, this.field4611[var37 + var50], var28, var31);
                        int var60 = class135.method1111(var47, (byte) -97, this.field4611[var36 + var50], var28, var35);
                        int var61 = ((var60 - var59) * var34 >> 12) + var59;
                        int var62 = class135.method1111(var47, (byte) 43, this.field4611[var37 + var51], var33, var31);
                        int var63 = class135.method1111(var47, (byte) -115, this.field4611[var36 + var51], var33, var35);
                        int var64 = ((var63 - var62) * var34 >> 12) + var62;
                        int var65 = ((var64 - var61) * var29 >> 12) + var61;
                        this.method1236(255, var14, ((var65 - var58) * var46 >> 12) + var58);
                    }
                    this.method1234(1740188684);
                }
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIII)V", line = 378)
    public static final void method1972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 + arg2;
        int var8 = arg4 - arg2;
        int var9 = arg2 + arg5;
        for (int var10 = arg6; var10 < var7; var10++) {
            class317.method2184(arg0, (byte) 96, class64.field1007[var10], arg1, arg5);
        }
        int var11 = -45 / ((arg3 - 82) / 32);
        for (int var12 = arg4; var12 > var8; var12--) {
            class317.method2184(arg0, (byte) 83, class64.field1007[var12], arg1, arg5);
        }
        int var13 = arg0 - arg2;
        for (int var14 = var7; var14 <= var8; var14++) {
            int[] var15 = class64.field1007[var14];
            class317.method2184(var9, (byte) 104, var15, arg1, arg5);
            class317.method2184(arg0, (byte) -25, var15, arg1, var13);
        }
        field4606++;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)I", line = 420)
    public static final int method1973(boolean arg0) {
        if (arg0) {
            return -44;
        } else {
            field4618++;
            return 6;
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
    public abstract void method1237(int arg0);

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
    public abstract void method1234(int arg0);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)V")
    public abstract void method1236(int arg0, int arg1, int arg2);
}
