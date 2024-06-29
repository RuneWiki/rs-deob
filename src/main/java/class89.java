import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class89 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    private int field1071 = 0;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    private int field1074 = 4;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    private int field1078 = 4;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public int field1082 = 4;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "[S")
    private short[] field1083 = new short[512];

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    private int field1085 = 4;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Leba;")
    public static class550 field1080 = new class550(44, 3);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "Lga;")
    public static class332 field1084;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "[S")
    private short[] field1072;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBI)V")
    public final void method481(int arg0, int arg1, byte arg2, int arg3) {
        field1077++;
        if (arg2 > -82) {
            return;
        }
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method482(false);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field1082; var14++) {
                        int var15 = this.field1072[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = this.field1074 * var15 >> 12;
                        int var19 = var8[var11] * var15 >> 12;
                        int var20 = this.field1078 * var15 >> 12;
                        int var21 = this.field1085 * var15 >> 12;
                        int var22 = this.field1085 * var19;
                        int var23 = this.field1074 * var17;
                        int var24 = this.field1078 * var16;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34;
                        if (var21 <= var32) {
                            var34 = 0;
                        } else {
                            var34 = var32 & 0xFF;
                        }
                        int var35;
                        if (var26 < var18) {
                            var35 = var26 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36;
                        if (var29 < var20) {
                            var36 = var29 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var22 & 0xFFF;
                        int var38 = var31 & 0xFF;
                        int var39 = var24 & 0xFFF;
                        int var40 = var37 - 4096;
                        int var41 = class170.field2426[var33];
                        int var42 = class170.field2426[var37];
                        int var43 = class170.field2426[var39];
                        int var44 = var33 - 4096;
                        int var45 = var39 - 4096;
                        short var46 = this.field1083[var38];
                        short var47 = this.field1083[var34];
                        short var48 = this.field1083[var36 + var47];
                        short var49 = this.field1083[var36 + var46];
                        short var50 = this.field1083[var30 + var46];
                        short var51 = this.field1083[var30 + var47];
                        int var52 = class35.method206(var37, this.field1083[var28 + var50], var33, var39, (byte) -61);
                        int var53 = class35.method206(var37, this.field1083[var35 + var50], var44, var39, (byte) -61);
                        int var54 = var52 + ((var53 - var52) * var41 >> 12);
                        int var55 = class35.method206(var37, this.field1083[var28 + var49], var33, var45, (byte) -61);
                        int var56 = class35.method206(var37, this.field1083[var35 + var49], var44, var45, (byte) -61);
                        int var57 = ((var56 - var55) * var41 >> 12) + var55;
                        int var58 = ((var57 - var54) * var43 >> 12) + var54;
                        int var59 = class35.method206(var40, this.field1083[var28 + var51], var33, var39, (byte) -61);
                        int var60 = class35.method206(var40, this.field1083[var35 + var51], var44, var39, (byte) -61);
                        int var61 = ((var60 - var59) * var41 >> 12) + var59;
                        int var62 = class35.method206(var40, this.field1083[var28 + var48], var33, var45, (byte) -61);
                        int var63 = class35.method206(var40, this.field1083[var35 + var48], var44, var45, (byte) -61);
                        int var64 = ((var63 - var62) * var41 >> 12) + var62;
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method483(((var65 - var58) * var42 >> 12) + var58, var14, 26676);
                    }
                    this.method485(102);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public abstract void method482(boolean arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    public abstract void method483(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method484(byte arg0) {
        field1084 = null;
        if (arg0 != -20) {
            field1084 = null;
        }
        field1080 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public abstract void method485(int arg0);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    private final void method486(int arg0) {
        if (arg0 < 17) {
            return;
        }
        field1079++;
        Random var2 = new Random((long) this.field1071);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field1083[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class584.method3227(false, var5, var2);
            short var7 = this.field1083[var6];
            this.field1083[var6] = this.field1083[var5];
            this.field1083[var5] = this.field1083[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
    private final void method487(int arg0) {
        field1076++;
        this.field1072 = new short[this.field1082];
        for (int var2 = arg0; var2 < this.field1082; var2++) {
            this.field1072[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lr;I)V")
    public static final void method488(class562 arg0, int arg1) {
        field1075++;
        if (class169.field2419.method2503(-98) == 0 || arg1 >= -68) {
            return;
        }
        if (class618.field8566 == 0) {
            for (class227 var2 = (class227) class169.field2419.method2506(68); var2 != null; var2 = (class227) class169.field2419.method2505(-124)) {
                class87.field1058.method1401(var2.field2947, var2.field2944, var2.field2952 ? class408.field5369.field7810 : null, arg0, false, false, var2.field2951, (byte) 107, var2.field2949, var2.field2950, arg0, class399.field5300);
                var2.method242(true);
            }
            class398.method2275(-1);
            return;
        }
        if (class548.field7502 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class548.field7502 = class562.method3128(0, -21939, var3, class329.field4418, 0, class315.field4225);
            class523.field7235 = class548.field7502.method1130(class538.method3027(class392.field5247, 0, class208.field2785, 0), class92.method512(class390.field5228, class392.field5247, 0), true);
        }
        for (class227 var4 = (class227) class169.field2419.method2506(68); var4 != null; var4 = (class227) class169.field2419.method2505(-119)) {
            class87.field1058.method1401(var4.field2947, var4.field2944, var4.field2952 ? class408.field5369.field7810 : null, arg0, false, false, var4.field2951, (byte) 109, var4.field2949, var4.field2950, class548.field7502, class523.field7235);
            var4.method242(true);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIII)V")
    public class89(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1082 = arg1;
        this.field1071 = arg0;
        this.field1085 = arg4;
        this.field1078 = arg3;
        this.field1074 = arg2;
        this.method487(0);
        this.method486(114);
    }
}
