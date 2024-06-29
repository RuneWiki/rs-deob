import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class309 {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field4885 = 1;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "[I")
    public static int[] field4890 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field4886 = 0;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public static int field4894 = 0;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "B")
    public static byte field4892;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "[I")
    public static int[] field4887;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "[S")
    public static short[] field4888;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)Lgn;", line = 5)
    public static final class6 method2183(int arg0, int arg1) {
        class6 var2 = (class6) class304.field4842.method2288((long) arg1, (byte) 99);
        field4891++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class11.field253.method967(16, arg1, 65280);
        class6 var4 = new class6();
        if (var3 != null) {
            var4.method96(-40, new class1(var3));
        }
        class304.field4842.method2281(arg0, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)V", line = 31)
    public static final void method2184(int arg0, byte arg1) {
        field4895++;
        if (arg1 != 57) {
            field4887 = (int[]) null;
        }
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class139.field2256 += arg0 * 128;
        if (class12.field268.length < class139.field2256) {
            class139.field2256 -= class12.field268.length;
            int var3 = (int) (Math.random() * 12.0D);
            class84.method669(class172.field2767[var3], false);
        }
        int var4 = 0;
        int var5 = (var2 - arg0) * 128;
        int var6 = arg0 * 128;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = class214.field3343[var4 + var6] - class12.field268[class139.field2256 + var4 & class12.field268.length + -1] * arg0 / 6;
            if (var8 < 0) {
                var8 = 0;
            }
            class214.field3343[var4++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class214.field3343[var11 + var10] = 255;
                } else {
                    class214.field3343[var11 + var10] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg0; var13++) {
            class4.field112[var13] = class4.field112[arg0 + var13];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class4.field112[var14] = (int) (Math.sin((double) class259.field3840 / 14.0D) * 16.0D + Math.sin((double) class259.field3840 / 15.0D) * 14.0D + Math.sin((double) class259.field3840 / 16.0D) * 12.0D);
            class259.field3840++;
        }
        class303.field4838 += arg0;
        int var15 = ((class307.field4869 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class303.field4838; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class214.field3343[(var18 << 7) + var17] = 192;
        }
        class303.field4838 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var21 += class214.field3343[var22 - (-var15 - var20)];
                }
                if ((var22 - var15 - 1) >= 0) {
                    var21 -= class214.field3343[var20 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class137.field2233[var20 + var22] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if ((var15 + var25) < var2) {
                    var24 += class137.field2233[var15 * 128 + var23 + var26];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class137.field2233[var23 + var26 - ((var15 + 1) * 128)];
                }
                if (var25 >= 0) {
                    class214.field3343[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)I", line = 216)
    public static final int method2185(int arg0, int arg1, int arg2) {
        field4893++;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        if (arg1 != 0) {
            field4890 = (int[]) null;
        }
        return (var5 & 0x7FC1BBC) >> 19;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)Z", line = 240)
    public static final boolean method2186(int arg0, int arg1) {
        field4884++;
        if (class135.field2158[arg1]) {
            return true;
        }
        if (arg0 != 26080) {
            method2186(127, 30);
        }
        if (!class251.field3702.method965(arg1, 125)) {
            return false;
        }
        int var2 = class251.field3702.method962((byte) -119, arg1);
        if (var2 == 0) {
            class135.field2158[arg1] = true;
            return true;
        }
        if (class110.field1789[arg1] == null) {
            class110.field1789[arg1] = new class266[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class110.field1789[arg1][var3] == null) {
                byte[] var4 = class251.field3702.method967(arg1, var3, 65280);
                if (var4 != null) {
                    class266 var5 = class110.field1789[arg1][var3] = new class266();
                    var5.field4088 = (arg1 << 16) + var3;
                    if (var4[0] == -1) {
                        var5.method1839(new class1(var4), arg0 - 26195);
                    } else {
                        var5.method1845(new class1(var4), (byte) -28);
                    }
                }
            }
        }
        class135.field2158[arg1] = true;
        return true;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 303)
    public static void method2187(int arg0) {
        field4890 = null;
        field4887 = null;
        if (arg0 != 128) {
            field4887 = (int[]) null;
        }
        field4888 = null;
    }
}
