import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class295 extends class225 {

    @OriginalMember(owner = "client!or", name = "y", descriptor = "J")
    public static long field4227 = -1L;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "[I")
    public static int[] field4231 = new int[4096];

    @OriginalMember(owner = "client!or", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field4233 = new String[100];

    @OriginalMember(owner = "client!or", name = "x", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!or", name = "L", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!or", name = "N", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!or", name = "O", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "Llm;")
    public static class347 field4228;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "Ljava/lang/String;")
    public String field4234;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "[C")
    public char[] field4225;

    @OriginalMember(owner = "client!or", name = "K", descriptor = "[C")
    public char[] field4237;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "[I")
    public int[] field4232;

    @OriginalMember(owner = "client!or", name = "J", descriptor = "[I")
    public int[] field4236;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(I)V")
    public static void method2014(int arg0) {
        field4233 = null;
        field4228 = null;
        field4231 = null;
        int var1 = 86 % ((94 - arg0) / 32);
    }

    @OriginalMember(owner = "client!or", name = "f", descriptor = "(I)V")
    public final void method2015(int arg0) {
        if (this.field4236 != null) {
            for (int var2 = 0; var2 < this.field4236.length; var2++) {
                this.field4236[var2] = class351.method2313(this.field4236[var2], 32768);
            }
        }
        if (arg0 < 10) {
            field4228 = null;
        }
        field4226++;
        if (this.field4232 != null) {
            for (int var3 = 0; var3 < this.field4232.length; var3++) {
                this.field4232[var3] = class351.method2313(this.field4232[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lnj;IB)V")
    private final void method2016(class228 arg0, int arg1, byte arg2) {
        field4235++;
        if (arg2 >= -126) {
            return;
        }
        if (arg1 == 1) {
            this.field4234 = arg0.method1329(991328496);
        } else if (arg1 == 2) {
            int var4 = arg0.method1348(-89);
            this.field4232 = new int[var4];
            this.field4237 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4232[var5] = arg0.method1343(255);
                byte var6 = arg0.method1349(3);
                this.field4237[var5] = var6 == 0 ? 0 : class27.method189(-24769, var6);
            }
            return;
        } else if (arg1 == 3) {
            int var7 = arg0.method1348(-118);
            this.field4225 = new char[var7];
            this.field4236 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4236[var8] = arg0.method1343(255);
                byte var9 = arg0.method1349(3);
                this.field4225[var8] = var9 == 0 ? 0 : class27.method189(-24769, var9);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ln;III)V")
    public static final void method2017(class25 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field4290 == arg1 && arg1 != -1) {
            class12 var4 = class33.method221((byte) 102, arg1);
            int var5 = var4.field193;
            if (var5 == 1) {
                arg0.field4300 = 0;
                arg0.field4332 = arg3;
                arg0.field4270 = 0;
                arg0.field4291 = 0;
                arg0.field4305 = 1;
                class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, 9757, arg0.field4300, var4);
            }
            if (var5 == 2) {
                arg0.field4270 = 0;
            }
        } else if (arg1 == -1 || arg0.field4290 == -1 || class33.method221((byte) 102, arg1).field190 >= class33.method221((byte) 102, arg0.field4290).field190) {
            arg0.field4300 = 0;
            arg0.field4290 = arg1;
            arg0.field4291 = 0;
            arg0.field4305 = 1;
            arg0.field4332 = arg3;
            arg0.field4270 = 0;
            arg0.field4365 = arg0.field4369;
            if (arg0.field4290 != -1) {
                class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, 9757, arg0.field4300, class33.method221((byte) 102, arg0.field4290));
            }
        }
        field4239++;
        if (arg2 != 32768) {
            method2014(-72);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(CZ)I")
    public final int method2018(char arg0, boolean arg1) {
        field4238++;
        if (this.field4232 == null) {
            return -1;
        }
        int var3 = 0;
        if (!arg1) {
            this.method2015(-73);
        }
        while (var3 < this.field4232.length) {
            if (this.field4237[var3] == arg0) {
                return this.field4232[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lnj;I)V")
    public final void method2019(class228 arg0, int arg1) {
        field4230++;
        if (arg1 != -26440) {
            field4227 = -15L;
        }
        while (true) {
            int var3 = arg0.method1348(-116);
            if (var3 == 0) {
                return;
            }
            this.method2016(arg0, var3, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(CI)I")
    public final int method2020(char arg0, int arg1) {
        field4240++;
        if (arg1 != 21517) {
            return -21;
        } else if (this.field4236 == null) {
            return -1;
        } else {
            for (int var3 = 0; var3 < this.field4236.length; var3++) {
                if (this.field4225[var3] == arg0) {
                    return this.field4236[var3];
                }
            }
            return -1;
        }
    }
}
