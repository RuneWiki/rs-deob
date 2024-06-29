import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class26 extends class17 {

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    public static int field398 = 0;

    @OriginalMember(owner = "client!od", name = "jb", descriptor = "[I")
    public static int[] field405 = new int[4096];

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "Z")
    public static boolean field397 = true;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "Z")
    public static boolean field401 = false;

    @OriginalMember(owner = "client!od", name = "nb", descriptor = "[I")
    public static int[] field409 = new int[1000];

    @OriginalMember(owner = "client!od", name = "db", descriptor = "[I")
    public static int[] field399 = new int[100];

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!od", name = "ib", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!od", name = "lb", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!od", name = "mb", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!od", name = "ob", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!od", name = "kb", descriptor = "[Lne;")
    private class239[] field406;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)I", line = 5)
    public static final int method170(int arg0) {
        field396++;
        if (arg0 != 28538) {
            field397 = false;
        }
        return 2;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 25)
    public class26() {
        super(0, true);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)[[I", line = 36)
    public final int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            field399 = (int[]) null;
        }
        int[][] var3 = this.field224.method2081(arg1, -86);
        field408++;
        if (this.field224.field5106) {
            int var4 = class289.field5059;
            int var5 = class116.field2008;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = this.field224.method2088(-9796);
            this.method171(-95, var6);
            for (int var8 = 0; var8 < class289.field5059; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class116.field2008; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class162.method1118(255, var15) << 4;
                    var12[var14] = class162.method1118(var15, 65280) >> 4;
                    var11[var14] = class162.method1118(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(II)[I", line = 99)
    public final int[] method120(int arg0, int arg1) {
        int[] var3 = this.field217.method1698(-17, arg1);
        if (arg0 >= -95) {
            return (int[]) null;
        }
        field410++;
        if (this.field217.field4295) {
            this.method171(-112, this.field217.method1695(0));
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I[[I)V", line = 126)
    private final void method171(int arg0, int[][] arg1) {
        int var3 = 7 % ((-arg0 - 35) / 52);
        int var4 = class116.field2008;
        field404++;
        int var5 = class289.field5059;
        class109.method795(arg1, 79);
        class63.method436(0, class249.field4327, class219.field3899, 4672, 0);
        if (this.field406 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field406.length; var6++) {
            class239 var7 = this.field406[var6];
            int var8 = var7.field4168;
            int var9 = var7.field4170;
            if (var9 < 0) {
                if (var8 >= 0) {
                    var7.method1419(var4, -1, var5);
                }
            } else if (var8 < 0) {
                var7.method1417(var5, -1, var4);
            } else {
                var7.method1420(true, var4, var5);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLrm;I)V", line = 173)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg2 == 0) {
            this.field406 = new class239[arg1.method1731(true)];
            for (int var4 = 0; var4 < this.field406.length; var4++) {
                int var5 = arg1.method1731(true);
                if (var5 == 0) {
                    this.field406[var4] = class22.method149(arg1, 0);
                } else if (var5 == 1) {
                    this.field406[var4] = class313.method2184(arg1, 32044);
                } else if (var5 == 2) {
                    this.field406[var4] = class68.method457(arg1, 104);
                } else if (var5 == 3) {
                    this.field406[var4] = class229.method1537(arg1, 90);
                }
            }
        } else if (arg2 == 1) {
            this.field225 = arg1.method1731(true) == 1;
        }
        if (arg0 != -114) {
            method172(-103);
        }
        field400++;
    }

    @OriginalMember(owner = "client!od", name = "i", descriptor = "(I)V", line = 245)
    public static void method172(int arg0) {
        field405 = null;
        field409 = null;
        field399 = null;
        if (arg0 != 1000) {
            method173(false);
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(Z)Z", line = 276)
    public static final boolean method173(boolean arg0) {
        field403++;
        if (class19.field281) {
            try {
                return !(Boolean) class325.field5538.method752(30488, class289.field5052.field2441);
            } catch (Throwable var2) {
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([Lsf;B)[Lsf;", line = 317)
    public static final class108[] method174(class108[] arg0, byte arg1) {
        class108[] var2 = new class108[5];
        int var3 = 0;
        if (arg1 < 99) {
            field409 = (int[]) null;
        }
        while (var3 < 5) {
            var2[var3] = class117.method833(new class108[] { class79.method518(false, var3), class184.field3385 }, false);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class117.method833(new class108[] { var2[var3], arg0[var3] }, false);
            }
            var3++;
        }
        field402++;
        return var2;
    }
}
