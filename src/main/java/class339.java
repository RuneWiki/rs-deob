import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class339 {

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    private int field4987 = -1;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "Z")
    private boolean field4992 = true;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    private int field4998;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    private int field4995;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[Lls;")
    private class306[] field4983;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    private int field4988;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    private int field4991;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "[Lls;")
    private class306[] field4999;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lls;")
    private class306 field4985;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "Z")
    public static boolean field5001;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "Z")
    public static boolean field5005;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    private int field4986;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    private int field4994;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "Lae;")
    private class285 field5000;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "Li;")
    public static class86 field5003;

    static {
        new class409("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field5002 = 0;
        field5001 = false;
        field5005 = false;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIZIIILfp;)V", line = 3)
    public final void method2186(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, class9 arg9) {
        field5006++;
        int var11 = arg6 + arg2 & 0x3FFF;
        if (this.field4998 == -1) {
            arg9.method164(arg8, arg7, arg0, arg1, arg4, 0);
        } else {
            class17 var12 = class343.field5051.method468((byte) -37, this.field4998);
            if (this.field5000 == null && class343.field5051.method463(this.field4998, -26564)) {
                int[] var13 = var12.field262 ? class343.field5051.method464(this.field4986, false, this.field4986, this.field4998, 4260, 0.7F) : class343.field5051.method461(this.field4998, false, this.field4986, this.field4986, 0.7F, (byte) -96);
                this.field5000 = arg9.method98(var13, 0, this.field4986, this.field4986, this.field4986);
            }
            if (!var12.field262) {
                arg9.method164(arg8, arg7, arg0, arg1, arg4, 0);
            }
            if (this.field5000 != null) {
                int var14 = var12.field262 ? 0 : 1;
                int var15 = arg1 * arg3 / -4096;
                int var16;
                for (var16 = arg1 * var11 / 4096 + (arg0 - arg1) / 2; var16 > arg1; var16 -= arg1) {
                }
                while (var16 < 0) {
                    var16 += arg1;
                }
                while (var15 > arg1) {
                    var15 -= arg1;
                }
                while (var15 < 0) {
                    var15 += arg1;
                }
                for (int var17 = var16 - arg1; var17 < arg0; var17 += arg1) {
                    for (int var18 = var15 - arg1; var18 < arg1; var18 += arg1) {
                        this.field5000.method929(arg8 + var17, arg7 + var18, arg1, arg1, 0, 0, var14);
                    }
                }
            }
        }
        if (arg5) {
            for (int var19 = this.field4994 - 1; var19 >= 0; var19--) {
                this.field4999[var19].method2041(arg9, arg8, arg7, arg0, arg1, arg3, var11);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;III)V", line = 79)
    public static final void method2187(String arg0, String arg1, int arg2, String arg3, String arg4, int arg5, int arg6, int arg7) {
        field4982++;
        for (int var8 = 99; var8 > 0; var8--) {
            class256.field3785[var8] = class256.field3785[var8 - 1];
            class343.field5052[var8] = class343.field5052[var8 - 1];
            class146.field1981[var8] = class146.field1981[var8 - 1];
            class332.field4932[var8] = class332.field4932[var8 - 1];
            class455.field6732[var8] = class455.field6732[var8 - 1];
            class303.field4439[var8] = class303.field4439[var8 - 1];
            class234.field3513[var8] = class234.field3513[var8 - 1];
        }
        class256.field3785[0] = arg5;
        class146.field1981[0] = arg0;
        class343.field5052[0] = arg6;
        class332.field4932[0] = arg4;
        class455.field6732[0] = arg3;
        class303.field4439[0] = arg1;
        class302.field4421 = class26.field384;
        if (arg2 != 31967) {
            method2192((String) null, -51);
        }
        class234.field3513[0] = arg7;
        class9.field124++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 116)
    public static void method2188(byte arg0) {
        field5003 = null;
        if (arg0 > -79) {
            method2191((byte) -102);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V", line = 130)
    public static final void method2189(int arg0, int arg1) {
        class363 var2 = class47.field615;
        synchronized (class47.field615) {
            class47.field615.method2313(120);
            class47.field615 = new class363(arg0);
        }
        field4996++;
        if (arg1 > -20) {
            method2192((String) null, -33);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIZILct;I)V", line = 147)
    public static final void method2190(int arg0, int arg1, boolean arg2, int arg3, class104 arg4, int arg5) {
        if (arg1 != 0) {
            return;
        }
        field4997++;
        class82.field1008 = 1;
        class182.field2563 = 10000;
        class67.field897 = arg5;
        class286.field4209 = arg4;
        class71.field928 = arg0;
        class316.field4628 = arg3;
        class169.field2214 = arg2;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V", line = 170)
    public static final void method2191(byte arg0) {
        if (arg0 != -35) {
            field5005 = false;
        }
        field4993++;
        class363 var1 = class227.field3408;
        synchronized (class227.field3408) {
            class227.field3408.method2307(arg0 - 85);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 185)
    public static final void method2192(String arg0, int arg1) {
        field4984++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class17.method223(0, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class373.field5450; var3++) {
            String var4 = class271.field4015[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class17.method223(arg1 ^ 0x1, var4);
            if (var5 != null && var5.equals(var2)) {
                class373.field5450--;
                for (int var6 = var3; var6 < class373.field5450; var6++) {
                    class271.field4015[var6] = class271.field4015[var6 + 1];
                    class419.field6077[var6] = class419.field6077[var6 + 1];
                    class57.field699[var6] = class57.field699[var6 + 1];
                    class455.field6733[var6] = class455.field6733[var6 + 1];
                    class454.field6705[var6] = class454.field6705[var6 + 1];
                    class53.field665[var6] = class53.field665[var6 + 1];
                }
                class34.field487 = class26.field384;
                class77.field978++;
                class257.method1773((byte) -10, class157.field2115);
                class159.field2132.method1727(-128, class248.method1646(arg0, (byte) -44));
                class159.field2132.method1712(arg0, 101);
                break;
            }
        }
        if (arg1 != 1) {
            method2187((String) null, (String) null, 127, (String) null, (String) null, 113, 12, 33);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILfp;I)Z", line = 250)
    public final boolean method2193(int arg0, class9 arg1, int arg2) {
        if (arg2 != -1) {
            this.method2193(125, (class9) null, 38);
        }
        field4990++;
        if (this.field4987 != arg0) {
            this.field4987 = arg0;
            int var4 = class289.method1938((byte) 46, arg0);
            if (var4 > arg0) {
                var4 = class164.method1087(arg0, -52);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field4986 != var4) {
                this.field4986 = var4;
                this.field5000 = null;
            }
            if (this.field4983 != null) {
                this.field4994 = 0;
                int[] var5 = new int[this.field4983.length];
                for (int var6 = 0; var6 < this.field4983.length; var6++) {
                    class306 var7 = this.field4983[var6];
                    if (var7.method2048(this.field4991, this.field4988, this.field4995, this.field4987)) {
                        var5[this.field4994] = var7.field4515;
                        this.field4999[this.field4994++] = var7;
                    }
                }
                class322.method2112(var5, this.field4999, 0, -31706, this.field4994 - 1);
            }
            this.field4992 = true;
        }
        boolean var8 = false;
        if (this.field4992) {
            this.field4992 = false;
            for (int var9 = this.field4994 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field4999[var9].method2040(arg1, this.field4985);
                this.field4992 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I[Lls;IIII)V", line = 372)
    public class339(int arg0, class306[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4998 = arg0;
        this.field4995 = arg5;
        this.field4983 = arg1;
        this.field4988 = arg4;
        this.field4991 = arg3;
        if (arg1 == null) {
            this.field4999 = null;
            this.field4985 = null;
        } else {
            this.field4999 = new class306[arg1.length];
            this.field4985 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 349)
    public final void method2194(int arg0) {
        field4989++;
        if (arg0 < 15) {
            field5002 = -78;
        }
        if (this.field4983 != null) {
            for (int var2 = 0; var2 < this.field4983.length; var2++) {
                this.field4983[var2].method2039();
            }
        }
        this.field5000 = null;
    }
}
