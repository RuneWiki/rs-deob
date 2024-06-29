import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class181 {

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "F")
    public float field2931;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public int field2941;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "F")
    public float field2924;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public int field2938;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "F")
    public float field2928;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Lve;")
    public static class255 field2935 = class87.method607(51, "blinken1:");

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Lve;")
    public static class255 field2929 = class87.method607(100, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static volatile int field2937 = 0;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Lve;")
    public static class255 field2930 = class87.method607(125, "::wm1");

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lrg;")
    public static class88 field2921;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)Ln;", line = 9)
    public static final class271 method1269(int arg0, int arg1) {
        field2926++;
        class271 var2 = (class271) class168.field2819.method558((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class125.field2083.method636(class106.method823(arg1, -1035794329), (byte) 79, class92.method692(true, arg1));
        class271 var4 = new class271();
        if (var3 != null) {
            var4.method1888(new class70(var3), 19115);
        }
        var4.method1886((byte) 55);
        class168.field2819.method555(var4, (long) arg1, 0);
        return arg0 < 69 ? (class271) null : var4;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)Lpe;", line = 36)
    public static final class93 method1270(int arg0) {
        field2932++;
        if (arg0 != 16) {
            method1269(107, -31);
        }
        try {
            return (class93) Class.forName("ai").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIII)V", line = 60)
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2925++;
        int var6 = class198.method1425(class11.field156, false, arg5, class261.field4427);
        int var7 = class198.method1425(class11.field156, false, arg2, class261.field4427);
        int var8 = class198.method1425(class30.field473, false, arg3, class125.field2082);
        int var9 = class198.method1425(class30.field473, false, arg4, class125.field2082);
        for (int var10 = var6; var10 <= var7; var10++) {
            class30.method170(var9, class250.field4213[var10], var8, arg0, -30310);
        }
        if (arg1 != 3) {
            method1274((class47) null, -124, (class289) null);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 88)
    public static void method1272(byte arg0) {
        field2930 = null;
        field2921 = null;
        field2929 = null;
        field2935 = null;
        if (arg0 < 26) {
            method1274((class47) null, 96, (class289) null);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILdd;Ldd;Z)I", line = 112)
    public static final int method1273(int arg0, int arg1, class238 arg2, class238 arg3, boolean arg4) {
        field2936++;
        if (arg0 == 1) {
            int var6 = arg2.field359;
            int var7 = arg3.field359;
            if (!arg4) {
                if (var7 == -1) {
                    var7 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var7;
        } else if (arg0 == 2) {
            return arg2.method1645(0).field4854.method1767(true, arg3.method1645(0).field4854);
        } else if (arg0 == 3) {
            if (arg2.field3948.method1752(true, class121.field2024)) {
                if (arg3.field3948.method1752(true, class121.field2024)) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field3948.method1752(true, class121.field2024)) {
                return arg4 ? 1 : -1;
            } else {
                return arg2.field3948.method1767(true, arg3.field3948);
            }
        } else if (arg0 == 4) {
            return arg2.method132(-128) ? (arg3.method132(-122) ? 0 : 1) : (arg3.method132(-120) ? -1 : 0);
        } else if (arg0 == 5) {
            return arg2.method135(true) ? (arg3.method135(true) ? 0 : 1) : (arg3.method135(true) ? -1 : 0);
        } else if (arg0 == 6) {
            return arg2.method136(74) ? (arg3.method136(127) ? 0 : 1) : (arg3.method136(-127) ? -1 : 0);
        } else if (arg0 == 7) {
            return arg2.method133(0) ? (arg3.method133(0) ? 0 : 1) : (arg3.method133(0) ? -1 : 0);
        } else {
            int var5 = 71 % ((-arg1 - 23) / 44);
            return arg2.field3951 - arg3.field3951;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lff;ILeg;)Ldi;", line = 180)
    public static final class142 method1274(class47 arg0, int arg1, class289 arg2) {
        field2923++;
        long var3 = ((long) arg2.field4976 << 32) + (((long) arg2.field4966 << 56) - (long) (-(arg2.field4963 + 1 << 16) - arg2.field4985));
        if (arg1 != -186798928) {
            method1272((byte) -32);
        }
        class142 var5 = (class142) arg0.method280(var3, 29153);
        if (var5 == null) {
            var5 = new class142(arg2.field4963, (float) arg2.field4985, true, false, arg2.field4976);
            arg0.method284(true, var3, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Z", line = 207)
    public static final boolean method1275(int arg0) {
        field2922++;
        class97 var1 = class60.field917;
        synchronized (class60.field917) {
            if (class34.field541 == class197.field3354) {
                return false;
            }
            if (arg0 != 20936) {
                field2930 = (class255) null;
            }
            class216.field3671 = class289.field4967[class197.field3354];
            class13.field183 = class7.field109[class197.field3354];
            class197.field3354 = class197.field3354 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)V", line = 234)
    public static final void method1276(int arg0, int arg1, int arg2, int arg3) {
        class249 var4 = class118.field1984[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class213 var5 = var4.field4183;
        if (var5 != null) {
            var5.field3636 = var5.field3636 * arg3 / 16;
            var5.field3640 = var5.field3640 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 258)
    public class181() {
        this.field2940 = -50;
        this.field2931 = 1.2F;
        this.field2941 = -50;
        this.field2933 = 0;
        this.field2924 = 1.1523438F;
        this.field2927 = class272.field4691;
        this.field2938 = -60;
        this.field2928 = 0.69921875F;
        this.field2934 = class272.field4689;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lpb;)V", line = 273)
    public class181(class70 arg0) {
        int var2 = arg0.method481(0);
        if ((var2 & 0x1) == 0) {
            this.field2927 = class272.field4691;
        } else {
            this.field2927 = arg0.method469(105);
        }
        if ((var2 & 0x2) == 0) {
            this.field2924 = 1.1523438F;
        } else {
            this.field2924 = (float) arg0.method423(255) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2928 = 0.69921875F;
        } else {
            this.field2928 = (float) arg0.method423(255) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2931 = 1.2F;
        } else {
            this.field2931 = (float) arg0.method423(255) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2941 = -50;
            this.field2938 = -60;
            this.field2940 = -50;
        } else {
            this.field2941 = arg0.method454((byte) 84);
            this.field2938 = arg0.method454((byte) 84);
            this.field2940 = arg0.method454((byte) 84);
        }
        if ((var2 & 0x20) == 0) {
            this.field2934 = class272.field4689;
        } else {
            this.field2934 = arg0.method469(79);
        }
        if ((var2 & 0x40) == 0) {
            this.field2933 = 0;
        } else {
            this.field2933 = arg0.method423(255);
        }
    }
}
