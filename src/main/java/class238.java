import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public abstract class class238 implements class317 {

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "Z")
    private boolean field2975 = false;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public int field2973;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
    private int field2983;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "Lmh;")
    public class537 field2988;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "Z")
    private boolean field2981;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "[I")
    public static int[] field2987 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)I", line = 8)
    private final int method1348(byte arg0) {
        field2986++;
        if (arg0 < 83) {
            return -7;
        } else {
            int var2 = this.field2988.method3128(this.field2990, (byte) 10) * this.field2983;
            return this.field2981 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)Z", line = 23)
    public final boolean method1349(int arg0) {
        field2979++;
        if (arg0 != 9987) {
            return true;
        } else if (this.field2988.field7872) {
            int var2 = this.method1348((byte) 94);
            this.field2988.method3083((byte) 94, this);
            OpenGL.glGenerateMipmapEXT(this.field2973);
            this.field2981 = true;
            this.method1356(9987);
            this.method1351(var2, -85);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lmw;IIIII)V", line = 52)
    public static final void method1350(class416 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2991++;
        if (arg0.field5401 == -1 && arg0.field5413 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class565.field8299.field2177 * arg0.field5407 >> 8;
        if (arg5 > arg0.field5403) {
            var6 += arg5 - arg0.field5403;
        } else if (arg0.field5408 > arg5) {
            var6 += arg0.field5408 - arg5;
        }
        if (arg4 > -112) {
            field2985 = -128;
        }
        if (arg0.field5405 < arg2) {
            var6 += arg2 - arg0.field5405;
        } else if (arg0.field5406 > arg2) {
            var6 += arg0.field5406 - arg2;
        }
        if (arg0.field5420 == 0 || (var6 - 64) > arg0.field5420 || class565.field8299.field2177 == 0 || arg0.field5402 != arg1) {
            if (arg0.field5417 != null) {
                class534.field7500.method803(arg0.field5417);
                arg0.field5417 = null;
            }
            if (arg0.field5404 != null) {
                class534.field7500.method803(arg0.field5404);
                arg0.field5404 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg0.field5420 - var6) * var7 / arg0.field5420;
        if (arg0.field5417 != null) {
            arg0.field5417.method2182(var8);
        } else if (arg0.field5401 >= 0) {
            class26 var9 = class26.method159(class173.field2110, arg0.field5401, 0);
            if (var9 != null) {
                class123 var10 = var9.method158().method708(class80.field957);
                class375 var11 = class375.method2181(var10, 100, var8);
                var11.method2175(-1);
                class534.field7500.method810(var11);
                arg0.field5417 = var11;
            }
        }
        if (arg0.field5404 != null) {
            arg0.field5404.method2182(var8);
            if (!arg0.field5404.method3189(-9613)) {
                arg0.field5404 = null;
            }
        } else if (arg0.field5413 != null && (arg0.field5415 -= arg3) <= 0) {
            int var12 = (int) ((double) arg0.field5413.length * Math.random());
            class26 var13 = class26.method159(class173.field2110, arg0.field5413[var12], 0);
            if (var13 != null) {
                class123 var14 = var13.method158().method708(class80.field957);
                class375 var15 = class375.method2181(var14, 100, var8);
                var15.method2175(0);
                class534.field7500.method810(var15);
                arg0.field5415 = (int) ((double) (arg0.field5416 - arg0.field5398) * Math.random()) + arg0.field5398;
                arg0.field5404 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)V", line = 183)
    private final void method1351(int arg0, int arg1) {
        if (arg1 <= -83) {
            field2980++;
            this.field2988.field7746 -= arg0;
            this.field2988.field7746 += this.method1348((byte) 113);
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V", line = 196)
    public final void method1352(int arg0) {
        if (arg0 >= -40) {
            field2987 = null;
        }
        field2984++;
        if (this.field2992 > 0) {
            this.field2988.method3104(this.method1348((byte) 107), -102, this.field2992);
            this.field2992 = 0;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZ)V", line = 215)
    public final void method1353(int arg0, boolean arg1) {
        if (arg0 <= 84) {
            return;
        }
        field2974++;
        if (this.field2981 != arg1) {
            int var3 = this.method1348((byte) 105);
            this.field2981 = true;
            this.method1356(9987);
            this.method1351(var3, -84);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z)V", line = 237)
    public static void method1354(boolean arg0) {
        if (!arg0) {
            field2985 = -89;
        }
        field2987 = null;
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)I", line = 247)
    public final int method1355(int arg0) {
        field2989++;
        if (arg0 != 10240) {
            this.method1351(34, -128);
        }
        return this.field2992;
    }

    @OriginalMember(owner = "client!uu", name = "finalize", descriptor = "()V", line = 260)
    protected final void finalize() throws Throwable {
        this.method1352(-127);
        field2978++;
        super.finalize();
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lmh;IIIZ)V", line = 327)
    public class238(class537 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2973 = arg1;
        this.field2983 = arg3;
        this.field2988 = arg0;
        this.field2981 = arg4;
        this.field2990 = arg2;
        OpenGL.glGenTextures(1, class130.field1592, 0);
        this.field2992 = class130.field1592[0];
        this.method1351(0, -121);
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)V", line = 273)
    private final void method1356(int arg0) {
        field2976++;
        if (arg0 != 9987) {
            this.method1351(-126, -24);
        }
        this.field2988.method3083((byte) 121, this);
        if (this.field2975) {
            OpenGL.glTexParameteri(this.field2973, 10241, this.field2981 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2973, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2973, 10241, this.field2981 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2973, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljj;Z)V", line = 301)
    public static final void method1357(class99 arg0, boolean arg1) {
        field2977++;
        if (!class473.field6634) {
            arg0.method3187(arg1);
            class199.field2397--;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BZ)V", line = 313)
    public final void method1358(byte arg0, boolean arg1) {
        int var3 = -4 % ((arg0 - 32) / 63);
        field2982++;
        if (this.field2975 != arg1) {
            this.field2975 = arg1;
            this.method1356(9987);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
    public abstract void method112(byte arg0);
}
