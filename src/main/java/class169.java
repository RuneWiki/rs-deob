import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class169 extends class496 {

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "I")
    private int field2290;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "Z")
    private boolean field2284;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    private int field2279;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    private int field2277;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    private int field2282;

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
    private int field2293;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
    private int field2288;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    private int field2278;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "Z")
    private boolean field2287;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "Z")
    public static boolean field2291 = false;

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "[I")
    public static int[] field2294 = new int[1];

    @OriginalMember(owner = "client!rt", name = "B", descriptor = "Z")
    public static boolean field2296 = false;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "Lqu;")
    public static class364 field2280 = new class364(31, 7);

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!rt", name = "x", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[Lvt;Los;)Ldca;")
    public static final class501 method1072(int arg0, class346[] arg1, class468 arg2) {
        field2285++;
        int var3 = 0;
        if (arg0 != 1951) {
            field2294 = null;
        }
        while (var3 < arg1.length) {
            if (arg1[var3] == null || arg1[var3].field5035 <= 0L) {
                return null;
            }
            var3++;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field5035);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class278.field4133, 0);
        if (class278.field4133[0] == 0) {
            if (class278.field4133[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class278.field4133, 1);
            if (class278.field4133[1] > 1) {
                byte[] var7 = new byte[class278.field4133[1]];
                OpenGL.glGetInfoLogARB(var4, class278.field4133[1], class278.field4133, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class278.field4133[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field5035);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class501(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLps;)V")
    public final void method1073(byte arg0, class428 arg1) {
        field2283++;
        arg1.method2563(-13021, 2);
        arg1.method2563(-13021, this.field2290);
        arg1.method2563(-13021, this.field2284 ? 1 : 0);
        arg1.method2563(-13021, this.field2279);
        int var3 = -14 / ((-arg0 - 73) / 47);
        arg1.method2563(-13021, this.field2277);
        arg1.method2563(-13021, this.field2282);
        arg1.method2563(-13021, this.field2278);
        arg1.method2563(-13021, this.field2287 ? 1 : 0);
        arg1.method2608(this.field2288, (byte) 95);
        arg1.method2563(-13021, this.field2293);
        arg1.method2569(-111, this.field2286);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V")
    public static void method1074(boolean arg0) {
        field2280 = null;
        field2294 = null;
        if (!arg0) {
            field2280 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZILha;ILwca;ILpa;)V")
    public static final void method1075(int arg0, boolean arg1, int arg2, class116 arg3, int arg4, class311 arg5, int arg6, class594 arg7) {
        field2281++;
        if (arg3 == null) {
            return;
        }
        int var8;
        if (class287.field4232 == 4) {
            var8 = (int) class591.field8752 & 0x3FFF;
        } else {
            var8 = (int) class591.field8752 + class225.field3322 & 0x3FFF;
        }
        int var9 = Math.max(arg5.field4543 / 2, arg5.field4620 / 2) + 10;
        int var10 = arg0 * arg0 + arg4 * arg4;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class14.field129[var8];
        int var12 = class14.field130[var8];
        if (class287.field4232 != 4) {
            var12 = var12 * 256 / (class99.field1254 + 256);
            var11 = var11 * 256 / (class99.field1254 + 256);
        }
        if (arg1) {
            int var13 = arg0 * var11 + arg4 * var12 >> 15;
            int var14 = arg0 * var12 - (arg4 * var11) >> 15;
            arg3.method236(arg5.field4543 / 2 + (arg2 + var13 - arg3.method722() / 2), arg6 - (-(arg5.field4620 / 2) + var14) + -(arg3.method714() / 2), arg7, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1076(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2295++;
        if ((class237.field3473[0][arg0][arg2] & 0x2) != 0) {
            return true;
        } else if ((class237.field3473[arg1][arg0][arg2] & 0x10) != 0) {
            return false;
        } else if (class194.method1251(arg3 + 46391, arg1, arg2, arg0) == arg4) {
            return true;
        } else if (arg3 == -15708) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(ZLuf;)V")
    public class169(boolean arg0, class353 arg1) {
        if (arg0) {
            if (class353.field5142.startsWith("win")) {
                this.field2290 = 1;
            } else if (class353.field5142.startsWith("mac")) {
                this.field2290 = 2;
            } else if (class353.field5142.startsWith("linux")) {
                this.field2290 = 3;
            } else {
                this.field2290 = 4;
            }
            if (class353.field5125.startsWith("amd64") || class353.field5125.startsWith("x86_64")) {
                this.field2284 = true;
            } else {
                this.field2284 = false;
            }
            if (class353.field5127.toLowerCase().indexOf("sun") != -1) {
                this.field2279 = 1;
            } else if (class353.field5127.toLowerCase().indexOf("microsoft") != -1) {
                this.field2279 = 2;
            } else if (class353.field5127.toLowerCase().indexOf("apple") == -1) {
                this.field2279 = 4;
            } else {
                this.field2279 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class353.field5138.length()) {
                    char var5 = class353.field5138.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var15) {
            }
            this.field2277 = var4;
            int var6 = 0;
            int var7 = class353.field5138.indexOf(46, 2) + 1;
            try {
                while (class353.field5138.length() > var7) {
                    char var8 = class353.field5138.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7++;
                    var6 = var6 * 10 + var8 - 48;
                }
            } catch (Exception var14) {
            }
            this.field2282 = var6;
            int var9 = class353.field5138.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class353.field5138.length() > var9) {
                    char var11 = class353.field5138.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 - (48 - var11);
                    var9++;
                }
            } catch (Exception var13) {
            }
            if (this.field2277 <= 3) {
                this.field2293 = 0;
            } else {
                this.field2293 = class56.field692;
            }
            this.field2288 = class223.field3276;
            this.field2278 = var10;
            if (class353.field5140 == 3) {
                this.field2287 = true;
            } else {
                this.field2287 = false;
            }
            try {
                this.field2286 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field2286 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)I")
    public static final int method1077(int arg0, int arg1) {
        field2292++;
        if (arg1 < 77) {
            field2296 = true;
        }
        return arg0 & 0xFF;
    }
}
