import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class196 extends class240 {

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    private int field3336 = 585;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "Ldh;")
    public static class159 field3339 = new class159(16);

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "Lcd;")
    public static class64 field3345 = class44.method335((byte) 71, "sch-Utteln:");

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "Lcd;")
    private static class64 field3347 = class44.method335((byte) 71, " is already on your ignore list)3");

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "Lcd;")
    public static class64 field3346 = field3347;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "I")
    public static int field3348 = 0;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 12)
    public class196() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I", line = 19)
    public final int[] method12(int arg0, int arg1) {
        int[] var3 = this.field4094.method179(arg1, true);
        field3342++;
        if (arg0 != 64) {
            field3346 = (class64) null;
        }
        if (this.field4094.field344) {
            int var4 = class268.field4615[arg1];
            for (int var5 = 0; var5 < class169.field2936; var5++) {
                int var6 = class74.field1408[var5];
                if (this.field3336 < var6 && var6 < 4096 - this.field3336 && var4 > (2048 - this.field3336) && this.field3336 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3336);
                    var3[var5] = 4096 - var10;
                } else if (var6 > 2048 - this.field3336 && var6 < this.field3336 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field3336;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field3336);
                } else if (var4 < this.field3336 || (4096 - this.field3336) < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field3336;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field3336);
                } else if (var6 >= this.field3336 && var6 <= 4096 - this.field3336) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field3336);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V", line = 100)
    public static void method1374(int arg0) {
        field3339 = null;
        if (arg0 < 77) {
            method1376(-29, -104);
        }
        field3345 = null;
        field3346 = null;
        field3347 = null;
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(B)V", line = 119)
    public static final void method1375(byte arg0) {
        field3344++;
        class258.field4463.method1730(99);
        if (arg0 > -21) {
            method1375((byte) -98);
        }
        class238.field4072 = 1;
        class124.field2242 = null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)V", line = 141)
    public static final void method1376(int arg0, int arg1) {
        if (arg0 == 128) {
            field3340++;
            class299 var2 = class158.method1135(arg1, arg0 ^ 0x9B, 4);
            var2.method2093((byte) -104);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(BI)V", line = 155)
    public static final void method1377(byte arg0, int arg1) {
        field3337++;
        if (arg0 != -70) {
            method1374(-85);
        }
        short var2 = 256;
        if (var2 < arg1) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class314.field5324 += arg1 * 128;
        if (class85.field1579.length < class314.field5324) {
            int var3 = (int) (Math.random() * 12.0D);
            class314.field5324 -= class85.field1579.length;
            class201.method1410(false, class182.field3129[var3]);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class198.field3386[var4 + var5] - (class85.field1579[class314.field5324 + var4 & class85.field1579.length - 1] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class198.field3386[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class198.field3386[var10 + var11] = 255;
                } else {
                    class198.field3386[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg1; var13++) {
            class185.field3171[var13] = class185.field3171[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class185.field3171[var14] = (int) (Math.sin((double) class117.field2140 / 14.0D) * 16.0D + Math.sin((double) class117.field2140 / 15.0D) * 14.0D + Math.sin((double) class117.field2140 / 16.0D) * 12.0D);
            class117.field2140++;
        }
        class222.field3791 += arg1;
        int var15 = ((class29.field482 & 0x1) + arg1) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class222.field3791; var16++) {
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (int) (Math.random() * 124.0D) + 2;
            class198.field3386[(var17 << 7) + var18] = 192;
        }
        class222.field3791 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += class198.field3386[var15 + var22 + var21];
                }
                if (-var15 - (1 - var22) >= 0) {
                    var20 -= class198.field3386[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    class268.field4628[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > var15 + var25) {
                    var24 += class268.field4628[var23 + var26 + (var15 * 128)];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class268.field4628[var23 + var26 - (var15 * 128) - 128];
                }
                if (var25 >= 0) {
                    class198.field3386[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lfd;I)I", line = 332)
    public static final int method1378(class232 arg0, int arg1) {
        field3341++;
        if (arg1 != 128) {
            method1374(-91);
        }
        class6 var2 = arg0.field3911;
        if (var2.field144 != null) {
            var2 = var2.method66(arg1 - 128);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field168;
        if (arg0.field1901 == arg0.field1896) {
            var3 = var2.field139;
        } else if (arg0.field1896 == arg0.field1883) {
            var3 = var2.field147;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILkh;)V", line = 365)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg0 != 2) {
            this.method16(-88, -74, (class13) null);
        }
        if (arg1 == 0) {
            this.field3336 = arg2.method112((byte) 92);
        }
        field3338++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIII)V", line = 391)
    public static final void method1379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3343++;
        if (arg1 == arg3) {
            class162.method1165(arg2, (byte) 104, arg4, arg5, arg3);
            return;
        }
        if (arg5 - arg3 >= class290.field4976 && class153.field2714 >= arg3 + arg5 && arg2 - arg1 >= class180.field3098 && (arg1 + arg2) <= class201.field3444) {
            class292.method2017(arg4, arg3, arg5, arg2, (byte) -50, arg1);
        } else {
            class134.method958(arg3, arg1, arg4, false, arg5, arg2);
        }
        if (arg0 < 70) {
            method1379(75, 103, -10, -94, -58, -61);
        }
    }
}
