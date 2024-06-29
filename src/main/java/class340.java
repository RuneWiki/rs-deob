import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class340 {

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public int field4997 = -1;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Z")
    public boolean field4992 = true;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    private int field5006 = 0;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public int field5004 = 128;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
    public static int[] field4993 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public int field4996;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public int field4998;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public int field4999;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public int field5001;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lqj;")
    public static class238 field5003;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "[[B")
    public static byte[][] field5008;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIILil;)V")
    private final void method2246(int arg0, int arg1, int arg2, class265 arg3) {
        if (arg1 == 1) {
            this.field5006 = arg3.method1691(false);
            this.method2249(127, this.field5006);
        } else if (arg1 == 2) {
            this.field4997 = arg3.method1685(8104);
            if (this.field4997 == 65535) {
                this.field4997 = -1;
            }
        } else if (arg1 == 3) {
            this.field5004 = arg3.method1685(8104);
        } else if (arg1 == 4) {
            this.field4992 = false;
        }
        field5007++;
        if (arg2 != 2) {
            this.field4992 = true;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2247(int arg0, int arg1) {
        field4994++;
        int var2 = -101 % ((20 - arg0) / 38);
        return arg1 < 999999999 ? Integer.toString(arg1) : "*";
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lil;IZ)V")
    public final void method2248(class265 arg0, int arg1, boolean arg2) {
        while (true) {
            int var4 = arg0.method1697(69);
            if (var4 == 0) {
                field5002++;
                if (!arg2) {
                    this.field4999 = 52;
                    return;
                }
                return;
            }
            this.method2246(arg1, var4, 2, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
    private final void method2249(int arg0, int arg1) {
        field5000++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF8F) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        if (arg0 != 127) {
            this.method2248((class265) null, 68, true);
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field4998 = (int) (var15 * 256.0D);
        this.field4999 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (var17 > 0.5D) {
            this.field5001 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5001 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4999 < 0) {
            this.field4999 = 0;
        } else if (this.field4999 > 255) {
            this.field4999 = 255;
        }
        if (this.field4998 < 0) {
            this.field4998 = 0;
        } else if (this.field4998 > 255) {
            this.field4998 = 255;
        }
        if (this.field5001 < 1) {
            this.field5001 = 1;
        }
        this.field4996 = (int) ((double) this.field5001 * var19);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILud;)V")
    public static final void method2250(int arg0, class2 arg1) {
        field5005++;
        class357.field5234 = 3;
        class437.method2772(true, -73);
        class369.field5483 = 0;
        class261.field3804 = true;
        class161.field2103 = true;
        class264.field3845 = 1;
        class23.field409 = 127;
        class413.field6165 = true;
        class358.field5243 = 127;
        class176.field2300 = 2;
        class258.field3768 = true;
        class284.field4158 = 0;
        class273.field4024 = true;
        class101.field1366 = true;
        class158.field2076 = true;
        class449.field6561 = true;
        class417.field6217 = true;
        class401.field5968 = 0;
        class451.field6576 = true;
        class407.field6101 = 255;
        class292.field4222 = 0;
        if (class160.field2099 >= 96) {
            class313.method1956(2, arg0 - 2);
        } else {
            class313.method1956(0, 0);
        }
        class161.field2107 = 2;
        class200.field2869 = true;
        class248.field3460 = false;
        class445.field6478 = 0;
        class363.field5313 = true;
        class189.field2559 = 0;
        class215.field3082 = arg0;
        class396.field5947 = false;
        class329.field4714 = false;
        class377 var2 = null;
        try {
            class296 var3 = arg1.method28(-1);
            while (var3.field4259 == 0) {
                class404.method2628(-31, 1L);
            }
            if (var3.field4259 == 1) {
                var2 = (class377) var3.field4262;
                byte[] var4 = new byte[(int) var2.method2498(arg0 ^ 0xFFFFFF9E)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2497(var4.length - var5, var4, var5, 0);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class17.method116(new class265(var4), (byte) -104);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2499(1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method2251(byte arg0) {
        field5008 = null;
        field4993 = null;
        field5003 = null;
        if (arg0 != 39) {
            method2252(-75, -104, -11, -2, -31);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
    public static final void method2252(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 7787) {
            return;
        }
        field4995++;
        if (class203.field2942 <= arg1 && class297.field4268 >= arg1) {
            int var5 = class143.method950(-15543, class50.field695, class180.field2375, arg4);
            int var6 = class143.method950(arg0 - 23330, class50.field695, class180.field2375, arg2);
            class191.method1186(var6, arg1, var5, arg3, false);
        }
    }
}
