import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class76 extends class115 {

    @OriginalMember(owner = "client!kd", name = "kb", descriptor = "Lna;")
    private static class26 field1145 = class69.method505("Allocating memory", (byte) -118);

    @OriginalMember(owner = "client!kd", name = "mb", descriptor = "[Lcl;")
    public static class132[] field1147 = new class132[14];

    @OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
    public static int field1152 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!kd", name = "ob", descriptor = "I")
    public static int field1149 = 0;

    @OriginalMember(owner = "client!kd", name = "yb", descriptor = "S")
    public static short field1159 = 32767;

    @OriginalMember(owner = "client!kd", name = "tb", descriptor = "Lna;")
    public static class26 field1154 = class69.method505("Connect-B au serveur de mise -9 jour", (byte) -120);

    @OriginalMember(owner = "client!kd", name = "Bb", descriptor = "I")
    public static int field1162 = -1;

    @OriginalMember(owner = "client!kd", name = "sb", descriptor = "[I")
    public static int[] field1153 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!kd", name = "zb", descriptor = "I")
    public static int field1160 = 0;

    @OriginalMember(owner = "client!kd", name = "Ab", descriptor = "Lna;")
    public static class26 field1161 = field1145;

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!kd", name = "nb", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!kd", name = "qb", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!kd", name = "ub", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!kd", name = "vb", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!kd", name = "wb", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!kd", name = "xb", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!kd", name = "Cb", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)[[I", line = 30)
    public final int[][] method3(int arg0, int arg1) {
        field1156++;
        int[][] var3 = this.field4719.method2182((byte) -119, arg1);
        if (this.field4719.field5381 && this.method801(-128)) {
            int[] var4 = var3[0];
            int var5 = arg1 % this.field1811 * this.field1811;
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class101.field1632; var8++) {
                int var9 = this.field1812[var8 % this.field1808 + var5];
                var7[var8] = class4.method23(255, var9) << 4;
                var6[var8] = class4.method23(var9 >> 4, 4080);
                var4[var8] = class4.method23(16711680, var9) >> 12;
            }
        }
        if (arg0 != -1) {
            field1160 = -119;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIII)V", line = 86)
    public static final void method543(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field1158++;
        int var5 = 116 / ((24 - arg2) / 63);
        arg1--;
        int var12 = arg3 - 1;
        int var6 = var12 - 7;
        while (var6 > arg1) {
            int var7 = arg1 + 1;
            arg0[var7] = arg4;
            int var8 = var7 + 1;
            arg0[var8] = arg4;
            int var9 = var8 + 1;
            arg0[var9] = arg4;
            int var10 = var9 + 1;
            arg0[var10] = arg4;
            int var11 = var10 + 1;
            arg0[var11] = arg4;
            int var13 = var11 + 1;
            arg0[var13] = arg4;
            int var14 = var13 + 1;
            arg0[var14] = arg4;
            arg1 = var14 + 1;
            arg0[arg1] = arg4;
        }
        while (var12 > arg1) {
            arg1++;
            arg0[arg1] = arg4;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 126)
    public static final void method544(String arg0, byte arg1) {
        if (arg1 != 38) {
            field1153 = (int[]) null;
        }
        field1148++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([[F[[II[[FI[ILfj;BLgi;[[FI)V", line = 149)
    public static final void method545(float[][] arg0, int[][] arg1, int arg2, float[][] arg3, int arg4, int[] arg5, class238 arg6, byte arg7, class215 arg8, float[][] arg9, int arg10) {
        int[] var11 = new int[arg5.length / 2];
        field1157++;
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg5[var12 + var12];
            int var14 = arg5[var12 + var12 + 1];
            if (arg10 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg10 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg10 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg3[arg2][arg4];
                var18 = arg9[arg2][arg4];
                var19 = arg0[arg2][arg4];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg0[arg2 + 1][arg4];
                var18 = arg9[arg2 + 1][arg4];
                var17 = arg3[arg2 + 1][arg4];
            } else if (var13 == 128 && var14 == 128) {
                var17 = arg3[arg2 + 1][arg4 + 1];
                var18 = arg9[arg2 + 1][arg4 + 1];
                var19 = arg0[arg2 + 1][arg4 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg0[arg2][arg4 + 1];
                var17 = arg3[arg2][arg4 + 1];
                var18 = arg9[arg2][arg4 + 1];
            } else {
                float var20 = arg9[arg2][arg4];
                float var21 = arg0[arg2][arg4];
                float var22 = (float) var13 / 128.0F;
                float var23 = arg3[arg2][arg4];
                float var24 = (arg3[arg2 + 1][arg4] - var23) * var22 + var23;
                float var25 = (arg0[arg2 + 1][arg4] - var21) * var22 + var21;
                float var26 = (arg9[arg2 + 1][arg4] - var20) * var22 + var20;
                float var27 = arg9[arg2][arg4 + 1];
                float var28 = (arg9[arg2 + 1][arg4 + 1] - var27) * var22 + var27;
                float var29 = arg3[arg2][arg4 + 1];
                float var30 = (float) var14 / 128.0F;
                var18 = (var28 - var26) * var30 + var26;
                float var31 = arg0[arg2][arg4 + 1];
                float var32 = (arg0[arg2 + 1][arg4 + 1] - var31) * var22 + var31;
                float var33 = (arg3[arg2 + 1][arg4 + 1] - var29) * var22 + var29;
                var17 = (var33 - var24) * var30 + var24;
                var19 = (var32 - var25) * var30 + var25;
            }
            int var34 = (arg2 << 7) + var13;
            int var35 = (arg4 << 7) + var14;
            int var36 = class323.method2246(var13, (byte) -53, arg4, arg1, arg2, var14);
            var11[var12] = arg6.method1588(arg8, var34, var36, var35, var18, var17, var19);
        }
        arg6.method1592(var11);
        int var37 = 105 % ((-arg7 - 20) / 54);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZLjava/awt/Component;)Lvk;", line = 269)
    public static final class170 method546(int arg0, int arg1, boolean arg2, Component arg3) {
        if (!arg2) {
            return (class170) null;
        }
        field1151++;
        try {
            Class var4 = Class.forName("ti");
            class170 var5 = (class170) var4.getDeclaredConstructor().newInstance();
            var5.method1031(arg0, false, arg1, arg3);
            return var5;
        } catch (Throwable var8) {
            class151 var7 = new class151();
            var7.method1031(arg0, false, arg1, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILve;)[Lqf;", line = 292)
    public static final class148[] method547(int arg0, int arg1, int arg2, class266 arg3) {
        field1146++;
        if (arg0 != -1) {
            method546(-95, 48, true, (Component) null);
        }
        return class196.method1317(arg3, arg1, arg2, -30901) ? class316.method2192(arg0 ^ 0x4) : null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 321)
    public static void method548(boolean arg0) {
        field1145 = null;
        field1154 = null;
        field1161 = null;
        field1153 = null;
        field1147 = null;
        if (arg0) {
            method543((int[]) null, -113, 119, -92, 70);
        }
    }
}
