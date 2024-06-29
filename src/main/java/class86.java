import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class86 extends class311 {

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Z")
    public static boolean field1206 = true;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field1211 = 0;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIILde;ILvg;II)V", line = 4)
    public static final void method686(int arg0, int arg1, int arg2, int arg3, class165 arg4, int arg5, class108 arg6, int arg7, int arg8) {
        field1212++;
        int var9 = arg7 * arg7 + (arg2 * arg2);
        if (arg0 < var9) {
            return;
        }
        if (arg1 <= 113) {
            field1206 = false;
        }
        int var10 = Math.min(arg6.field1568 / 2, arg6.field1577 / 2);
        if (var9 <= var10 * var10) {
            class4.method20(arg6, (byte) -39, arg7, arg2, class253.field3517[arg5], arg4, arg8, arg3);
            return;
        }
        var10 -= 10;
        int var11;
        if (class26.field337 == 4) {
            var11 = (int) class332.field4483 & 0x3FFF;
        } else {
            var11 = (int) class332.field4483 + class19.field249 & 0x3FFF;
        }
        int var12 = class136.field2021[var11];
        int var13 = class136.field2020[var11];
        if (class26.field337 != 4) {
            var12 = var12 * 256 / (class129.field1950 + 256);
            var13 = var13 * 256 / (class129.field1950 + 256);
        }
        int var14 = arg2 * var12 + (arg7 * var13) >> 15;
        int var15 = arg2 * var13 - (arg7 * var12) >> 15;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var10 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var10);
        class21.field269[arg5].method630((float) arg6.field1568 / 2.0F + (float) arg8 + (float) var18, (float) arg6.field1577 / 2.0F + (float) arg3 - (float) var19, 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V", line = 56)
    public static final void method687(byte arg0) {
        field1209++;
        for (class328 var1 = (class328) class159.field2268.method1173(0); var1 != null; var1 = (class328) class159.field2268.method1165(true)) {
            if (var1.field4455) {
                var1.method2000(false);
            }
        }
        if (arg0 != 105) {
            field1210 = 6;
        }
        for (class328 var2 = (class328) class39.field520.method1173(0); var2 != null; var2 = (class328) class39.field520.method1165(true)) {
            if (var2.field4455) {
                var2.method2000(false);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([[II)V", line = 97)
    public static final void method688(int[][] arg0, int arg1) {
        field1207++;
        if (arg1 != 2) {
            field1206 = false;
        }
        class83.field1157 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(II)V", line = 111)
    public class86(int arg0, int arg1) {
        this.field1204 = arg1;
        this.field1205 = arg0;
    }
}
