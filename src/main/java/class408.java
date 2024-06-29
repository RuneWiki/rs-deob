import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class408 extends class396 {

    @OriginalMember(owner = "client!uo", name = "Cb", descriptor = "Lao;")
    public static class191 field5851 = new class191(83, 8);

    @OriginalMember(owner = "client!uo", name = "Gb", descriptor = "I")
    public static int field5855 = 0;

    @OriginalMember(owner = "client!uo", name = "Ib", descriptor = "Lao;")
    public static class191 field5857 = new class191(30, 12);

    @OriginalMember(owner = "client!uo", name = "Jb", descriptor = "Lwq;")
    public static class115 field5858 = new class115(14, 15);

    @OriginalMember(owner = "client!uo", name = "Fb", descriptor = "F")
    public static float field5854;

    @OriginalMember(owner = "client!uo", name = "U", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!uo", name = "Db", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!uo", name = "Eb", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!uo", name = "Hb", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!uo", name = "Kb", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIJI)V")
    public static final void method2496(int arg0, int arg1, long arg2, int arg3) {
        ++field5856;
        int var5 = 31 & (int) arg2 >> 14;
        if (arg0 != 2) {
            field5851 = null;
        }
        int var6 = (3392708 & (int) arg2) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 != 10 && ~var5 != -12 && var5 != 22) {
            class139.method861(true, var5, 0, arg3, var6, 0, -123, 0, arg1);
        } else {
            class70 var8 = class123.field1593.method2920(var7, 19219);
            int var9;
            int var10;
            if (~var6 != -1 && var6 != 2) {
                var9 = var8.field857;
                var10 = var8.field865;
            } else {
                var9 = var8.field865;
                var10 = var8.field857;
            }
            int var11 = var8.field866;
            if (~var6 != -1) {
                var11 = (15 & var11 << var6) - -(var11 >> 4 - var6);
            }
            class139.method861(true, 0, var9, arg3, 0, var10, -116, var11, arg1);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BF)V")
    public final void method2497(byte arg0, float arg1) {
        ++field5850;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field5761[super.field5729++] = (byte) var3;
        super.field5761[super.field5729++] = (byte) (var3 >> 8);
        super.field5761[super.field5729++] = (byte) (var3 >> 16);
        int var4 = 53 % ((74 - arg0) / 41);
        super.field5761[super.field5729++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IF)V")
    public final void method2498(int arg0, float arg1) {
        ++field5859;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field5761[super.field5729++] = (byte) (var3 >> 24);
        super.field5761[super.field5729++] = (byte) (var3 >> 16);
        if (arg0 == -123) {
            super.field5761[super.field5729++] = (byte) (var3 >> 8);
            super.field5761[super.field5729++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "(B)V")
    public static final void method2499(byte arg0) {
        ++field5852;
        if (class199.field2650 < 1024.0F) {
            class199.field2650 = 1024.0F;
        }
        if (class199.field2650 > 3072.0F) {
            class199.field2650 = 3072.0F;
        }
        while (class143.field1907 >= 16384.0F) {
            class143.field1907 -= 16384.0F;
        }
        while (class143.field1907 < 0.0F) {
            class143.field1907 += 16384.0F;
        }
        int var1 = class412.field5886 >> 7;
        int var2 = class492.field7214 >> 7;
        if (arg0 < 95) {
            method2501((String) null, 52);
        }
        int var3 = class470.method2868(-118, class210.field2808, class412.field5886, class492.field7214);
        int var4 = 0;
        if (~var1 < -4 && ~var2 < -4 && ~var1 > ~(class308.field4128 - 4) && ~var2 > ~(class426.field6200 + -4)) {
            for (int var5 = var1 + -4; var1 + 4 >= var5; ++var5) {
                for (int var6 = var2 + -4; var2 + 4 >= var6; ++var6) {
                    int var7 = class210.field2808;
                    if (~var7 > -4 && class381.method2330(false, var6, var5)) {
                        ++var7;
                    }
                    int var8 = 0;
                    if (class442.field6426.field596 != null && class442.field6426.field596[var7] != null) {
                        var8 = (class442.field6426.field596[var7][var5][var6] & 255) * 8;
                    }
                    int var9 = var3 - -var8 - class152.field1993[var7].method217(var5, var6);
                    if (~var4 > ~var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (~var10 < -786433) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class14.field151 < var10) {
            class14.field151 += (-class14.field151 + var10) / 24;
        } else if (~var10 > ~class14.field151) {
            class14.field151 += (-class14.field151 + var10) / 80;
        }
    }

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "(I)V")
    public static void method2500(int arg0) {
        field5858 = null;
        field5857 = null;
        field5851 = null;
        int var1 = 75 % ((19 - arg0) / 55);
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(I)V")
    public class408(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(Ljava/lang/String;I)J")
    public static final long method2501(String arg0, int arg1) {
        if (arg1 != 57) {
            return -107L;
        } else {
            ++field5853;
            long var2 = 0L;
            int var4 = arg0.length();
            for (int var5 = 0; ~var5 > ~var4; ++var5) {
                var2 *= 37L;
                char var6 = arg0.charAt(var5);
                if (var6 >= 'A' && ~var6 >= -91) {
                    var2 += (long) (var6 + -64);
                } else if (~var6 <= -98 && ~var6 >= -123) {
                    var2 += (long) (var6 + -97 + 1);
                } else if (var6 >= '0' && var6 <= '9') {
                    var2 += (long) (27 - (-var6 + 48));
                }
                if (~var2 <= -177917621779460414L) {
                    break;
                }
            }
            while (~(var2 % 37L) == -1L && ~var2 != -1L) {
                var2 /= 37L;
            }
            return var2;
        }
    }
}
