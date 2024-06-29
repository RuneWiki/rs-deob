import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class201 implements class244 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "[I")
    public static int[] field3222 = new int[4];

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field3227 = 0;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field3224 = 0;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "[[I")
    public static int[][] field3233 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "[I")
    public static int[] field3225 = new int[14];

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field3232 = 0;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Lol;")
    public static class156 field3229;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 10)
    public static final void method1392(int arg0, int arg1) {
        int var2 = -123 / ((arg1 - 67) / 53);
        field3220++;
        class435.field6410.method337(arg0, (byte) -110);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Lne;", line = 23)
    public static final class172 method1393(int arg0, int arg1, int arg2) {
        field3219++;
        class172 var3 = class196.method1375(arg0, (byte) -56);
        if (arg1 == -1) {
            return var3;
        } else {
            if (arg2 >= -101) {
                method1393(82, -5, -105);
            }
            return var3 == null || var3.field2866 == null || var3.field2866.length <= arg1 ? null : var3.field2866[arg1];
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V", line = 48)
    public static final void method1394(int arg0, String[] arg1, int arg2, short[] arg3, int arg4) {
        if (arg2 != 1) {
            field3229 = null;
        }
        if (arg0 > arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method1394(var6 - 1, arg1, 1, arg3, arg4);
            method1394(arg0, arg1, 1, arg3, var6 + 1);
        }
        field3231++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([IZIJ)Ljava/lang/String;", line = 103)
    public final String method1395(int[] arg0, boolean arg1, int arg2, long arg3) {
        field3223++;
        if (arg2 == 0) {
            class378 var6 = class145.method1049(74, arg0[0]);
            return var6.method2403((byte) 80, (int) arg3);
        } else if (arg2 == 1 || arg2 == 10) {
            class97 var7 = class155.method1092(!arg1, (int) arg3);
            return var7.field1370;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class145.method1049(101, arg0[0]).method2403((byte) 114, (int) arg3);
        } else {
            if (arg1) {
                method1393(-51, -14, -84);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 134)
    public static void method1396(int arg0) {
        field3225 = null;
        field3233 = null;
        field3222 = null;
        field3229 = null;
        int var1 = 57 % ((-arg0 - 61) / 32);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lne;I)V", line = 146)
    public static final void method1397(class172 arg0, int arg1) {
        field3221++;
        int var2 = arg0.field2831;
        if (arg1 != -1) {
            field3229 = null;
        }
        if (var2 == 324) {
            if (class216.field3521 == -1) {
                class216.field3521 = arg0.field2789;
                class205.field3302 = arg0.field2745;
            }
            if (class8.field104.field3343) {
                arg0.field2789 = class216.field3521;
            } else {
                arg0.field2789 = class205.field3302;
            }
        } else if (var2 == 325) {
            if (class216.field3521 == -1) {
                class216.field3521 = arg0.field2789;
                class205.field3302 = arg0.field2745;
            }
            if (class8.field104.field3343) {
                arg0.field2789 = class205.field3302;
            } else {
                arg0.field2789 = class216.field3521;
            }
        } else if (var2 == 327) {
            arg0.field2771 = 150;
            arg0.field2818 = (int) (Math.sin((double) class183.field2987 / 40.0D) * 256.0D) & 0x3FFF;
            arg0.field2779 = 5;
            arg0.field2794 = -1;
        } else if (var2 == 328) {
            if (class261.field4201.field3588 == null) {
                arg0.field2794 = 0;
                arg0.field2843 = 0;
            } else {
                arg0.field2771 = 150;
                arg0.field2818 = (int) (Math.sin((double) class183.field2987 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2779 = 5;
                arg0.field2794 = 2047;
                arg0.field2843 = class11.method106(class261.field4201.field3588, arg1 ^ 0x28FF);
                arg0.field2754 = class261.field4201.field1875;
                arg0.field2738 = class261.field4201.field1883;
                arg0.field2840 = class261.field4201.field1851;
                arg0.field2839 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLjg;)Ljava/lang/String;", line = 222)
    public static final String method1398(byte arg0, class186 arg1) {
        field3228++;
        return arg0 == 110 ? class125.method924(arg1, 32767, false) : null;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)V", line = 247)
    public static final void method1399(int arg0, int arg1) {
        class196.field3184 = -1;
        class144.field2270 = arg1;
        field3230++;
        int var2 = 30 / ((arg0 + 20) / 59);
        class196.field3184 = -1;
        class270.method1829(0);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ln;I)V", line = 261)
    public static final void method1400(class13 arg0, int arg1) {
        field3226++;
        arg0.field186 = null;
        if (arg1 != 27439) {
            method1396(-97);
        }
        if (class374.field5642 < 20) {
            class391.field5873.method2442(arg0, (byte) 110);
            class374.field5642++;
        }
    }
}
