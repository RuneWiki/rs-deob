import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class36 {

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "J")
    public long field502 = 0L;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Lsf;")
    public static class108 field511 = class140.method973(255, "p11_full");

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lsf;")
    public static class108 field506 = class140.method973(255, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lof;")
    public static class242 field494 = new class242(16);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "Lpg;")
    public static class205 field509;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Lma;")
    public class290 field510;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "Lma;")
    public class290 field513;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "[I")
    public static int[] field504;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "[[Lcl;")
    public static class133[][] field499;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lhn;", line = 8)
    public static final class34 method248(int arg0, int arg1) {
        field493++;
        class34 var2 = (class34) class322.field5506.method466((long) arg0, arg1 + 4395);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -4394) {
            byte[] var3;
            if (arg0 >= 32768) {
                var3 = class215.field3810.method1868(12236, 1, arg0 & 0x7FFF);
            } else {
                var3 = class315.field5423.method1868(12236, 1, arg0);
            }
            class34 var4 = new class34();
            if (var3 != null) {
                var4.method231(0, new class249(var3));
            }
            if (arg0 >= 32768) {
                var4.method230(105);
            }
            class322.field5506.method468((long) arg0, (byte) -117, var4);
            return var4;
        } else {
            return (class34) null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)Z", line = 43)
    public static final boolean method249(int arg0, int arg1) {
        field505++;
        if (arg1 == 32768) {
            return (arg0 & -arg0) == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([J[IIIB)V", line = 62)
    public static final void method250(long[] arg0, int[] arg1, int arg2, int arg3, byte arg4) {
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            long var6 = arg0[var5];
            arg0[var5] = arg0[arg3];
            int var8 = arg2;
            arg0[arg3] = var6;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var9;
            for (int var10 = arg2; var10 < arg3; var10++) {
                if ((long) (var10 & 0x1) + var6 > arg0[var10]) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var8];
                    arg0[var8] = var11;
                    int var13 = arg1[var10];
                    arg1[var10] = arg1[var8];
                    arg1[var8++] = var13;
                }
            }
            arg0[arg3] = arg0[var8];
            arg0[var8] = var6;
            arg1[arg3] = arg1[var8];
            arg1[var8] = var9;
            method250(arg0, arg1, arg2, var8 - 1, (byte) -102);
            method250(arg0, arg1, var8 + 1, arg3, (byte) 77);
        }
        field508++;
        int var14 = -64 % ((arg4 + 35) / 47);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)Z", line = 120)
    public static final boolean method251(int arg0) {
        if (arg0 != 32767) {
            field504 = (int[]) null;
        }
        field500++;
        try {
            if (class305.field5312 == 2) {
                if (class320.field5480 == null) {
                    class320.field5480 = class112.method804(class1.field23, class271.field4738, class331.field5655);
                    if (class320.field5480 == null) {
                        return false;
                    }
                }
                if (class212.field3780 == null) {
                    class212.field3780 = new class115(class299.field5214, class248.field4303);
                }
                if (class324.field5531.method1193(true, 22050, class58.field862, class320.field5480, class212.field3780)) {
                    class324.field5531.method1209(false);
                    class324.field5531.method1182(true, class269.field4724);
                    class324.field5531.method1184(false, class220.field3913, class320.field5480);
                    class320.field5480 = null;
                    class212.field3780 = null;
                    class305.field5312 = 0;
                    class1.field23 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class324.field5531.method1214(arg0 ^ 0x7FFF);
            class1.field23 = null;
            class320.field5480 = null;
            class212.field3780 = null;
            class305.field5312 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 171)
    public static final void method252(byte arg0) {
        class10.field127.method639(-127);
        class177.field3226.method639(-121);
        field512++;
        if (arg0 >= -34) {
            method250((long[]) null, (int[]) null, -27, 58, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 184)
    public static void method253(int arg0) {
        field511 = null;
        field506 = null;
        field509 = null;
        field504 = null;
        field494 = null;
        if (arg0 != -2967) {
            method253(29);
        }
        field499 = (class133[][]) null;
    }
}
