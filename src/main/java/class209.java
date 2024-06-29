import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class209 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "J")
    public long field3279 = 0L;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3284 = "Choose Option";

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3294 = new CRC32();

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field3298 = 128;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field3297 = -1;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "F")
    public static float field3282;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public int field3285;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public int field3289;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public int field3292;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lhd;")
    public class161 field3287;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLcm;)V", line = 5)
    public static final void method1580(byte arg0, class304 arg1) {
        if (arg0 >= -58) {
            return;
        }
        field3281++;
        int var2 = -1;
        long var3 = 0L;
        int var5 = 0;
        if (arg1.field4875 == 0) {
            var3 = class252.method1955(arg1.field4876, arg1.field4871, arg1.field4885);
        }
        if (arg1.field4875 == 1) {
            var3 = class64.method555(arg1.field4876, arg1.field4871, arg1.field4885);
        }
        if (arg1.field4875 == 2) {
            var3 = class1.method1(arg1.field4876, arg1.field4871, arg1.field4885);
        }
        int var6 = 0;
        if (arg1.field4875 == 3) {
            var3 = class117.method922(arg1.field4876, arg1.field4871, arg1.field4885);
        }
        if (var3 != 0L) {
            var6 = (int) var3 >> 20 & 0x3;
            var2 = (int) (var3 >>> 32) & Integer.MAX_VALUE;
            var5 = ((int) var3 & 0x7DC49) >> 14;
        }
        arg1.field4883 = var5;
        arg1.field4879 = var6;
        arg1.field4867 = var2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIZII)V", line = 61)
    public static final void method1581(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3296++;
        int var8 = class315.method2235(class273.field4522, arg7, class296.field4758, 112);
        int var9 = class315.method2235(class273.field4522, arg1, class296.field4758, 124);
        int var10 = class315.method2235(class355.field5640, arg2, class74.field1269, 111);
        int var11 = class315.method2235(class355.field5640, arg0, class74.field1269, 114);
        int var12 = class315.method2235(class273.field4522, arg4 + arg7, class296.field4758, 119);
        int var13 = class315.method2235(class273.field4522, arg1 - arg4, class296.field4758, 112);
        for (int var14 = var8; var14 < var12; var14++) {
            class161.method1253(var11, class353.field5599[var14], -1, arg6, var10);
        }
        if (!arg5) {
            field3299 = 34;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class161.method1253(var11, class353.field5599[var15], -1, arg6, var10);
        }
        int var16 = class315.method2235(class355.field5640, arg2 + arg4, class74.field1269, 125);
        int var17 = class315.method2235(class355.field5640, arg0 - arg4, class74.field1269, 120);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class353.field5599[var18];
            class161.method1253(var16, var19, -1, arg6, var10);
            class161.method1253(var17, var19, -1, arg3, var16);
            class161.method1253(var11, var19, -1, arg6, var17);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 120)
    public static void method1582(int arg0) {
        field3294 = null;
        if (arg0 != 0) {
            method1580((byte) -29, (class304) null);
        }
        field3284 = null;
    }
}
