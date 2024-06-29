import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class180 extends class7 {

    @OriginalMember(owner = "client!js", name = "E", descriptor = "Z")
    public boolean field2941 = true;

    @OriginalMember(owner = "client!js", name = "A", descriptor = "Lbn;")
    public static class256 field2937 = new class256(16);

    @OriginalMember(owner = "client!js", name = "L", descriptor = "Lal;")
    public static class52 field2947 = new class52(64);

    @OriginalMember(owner = "client!js", name = "w", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!js", name = "x", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!js", name = "y", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!js", name = "B", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!js", name = "C", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!js", name = "F", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!js", name = "H", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!js", name = "M", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!js", name = "O", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "Lmo;")
    public static class447 field2946;

    @OriginalMember(owner = "client!js", name = "v", descriptor = "[I")
    private int[] field2932;

    @OriginalMember(owner = "client!js", name = "N", descriptor = "[I")
    public int[] field2949;

    @OriginalMember(owner = "client!js", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field2940;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "[[I")
    private int[][] field2944;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([IBLjg;)V", line = 3)
    public final void method1231(int[] arg0, byte arg1, class186 arg2) {
        field2934++;
        if (this.field2932 == null) {
            return;
        }
        for (int var4 = 0; this.field2932.length > var4 && var4 < arg0.length; var4++) {
            int var5 = class287.field4605[this.method1238(var4, -1)];
            if (var5 > 0) {
                arg2.method1316(var5, -1467906640, (long) arg0[var4]);
            }
        }
        int var6 = 111 / ((-arg1 - 32) / 42);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BLjg;)V", line = 34)
    public final void method1232(byte arg0, class186 arg1) {
        while (true) {
            int var3 = arg1.method1322(false);
            if (var3 == 0) {
                field2939++;
                if (arg0 != 91) {
                    this.field2949 = null;
                    return;
                }
                return;
            }
            this.method1234(-3, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III)I", line = 54)
    public final int method1233(int arg0, int arg1, int arg2) {
        field2948++;
        if (this.field2932 == null || arg0 < 0 || arg0 > this.field2932.length) {
            return -1;
        } else {
            int var4 = -1 / ((-arg2 - 45) / 63);
            return this.field2944[arg0] == null || arg1 < 0 || arg1 > this.field2944[arg0].length ? -1 : this.field2944[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjg;I)V", line = 70)
    private final void method1234(int arg0, class186 arg1, int arg2) {
        field2936++;
        if (arg2 == 1) {
            this.field2940 = class63.method410(arg1.method1270(arg0 ^ 0x26F3), '<', -1);
        } else if (arg2 == 2) {
            int var4 = arg1.method1322(false);
            this.field2949 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2949[var5] = arg1.method1272((byte) -78);
            }
        } else if (arg2 == 3) {
            int var6 = arg1.method1322(false);
            this.field2932 = new int[var6];
            this.field2944 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1272((byte) -79);
                this.field2932[var7] = var8;
                this.field2944[var7] = new int[class285.field4578[var8]];
                for (int var9 = 0; var9 < class285.field4578[var8]; var9++) {
                    this.field2944[var7][var9] = arg1.method1272((byte) -45);
                }
            }
        } else if (arg2 == 4) {
            this.field2941 = false;
        }
        if (arg0 != -3) {
            this.field2941 = true;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)Lll;", line = 136)
    public static final class203 method1235(int arg0, int arg1) {
        field2933++;
        class203 var2 = (class203) class369.field5611.method331((byte) 69, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class37.field470.method2771(1, arg1, 3);
        class203 var4 = new class203();
        var4.field3270 = arg1;
        if (var3 != null) {
            var4.method1444((byte) -75, new class186(var3));
        }
        var4.method1442(-1);
        if (arg0 != -30827) {
            field2947 = null;
        }
        if (var4.field3258 == 2 && class203.field3267.method1770(-880, (long) arg1) == null) {
            class203.field3267.method1766((long) arg1, new class160(class222.field3694), 59);
            class412.field6105[class222.field3694++] = var4;
        }
        class369.field5611.method341(61, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILmo;)V", line = 175)
    public static final void method1236(int arg0, class447 arg1) {
        class381.field5766 = arg1;
        field2943++;
        class430.field6322 = class381.field5766.method2758(arg0, arg0 ^ 0x38D4);
    }

    @OriginalMember(owner = "client!js", name = "f", descriptor = "(I)V", line = 193)
    public static void method1237(int arg0) {
        field2937 = null;
        field2947 = null;
        if (arg0 != 0) {
            method1236(16, (class447) null);
        }
        field2946 = null;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(II)I", line = 208)
    public final int method1238(int arg0, int arg1) {
        field2935++;
        if (arg1 != -1) {
            this.method1241((byte) 13);
        }
        return this.field2932 == null || arg0 < 0 || this.field2932.length < arg0 ? -1 : this.field2932[arg0];
    }

    @OriginalMember(owner = "client!js", name = "g", descriptor = "(I)Ljava/lang/String;", line = 226)
    public final String method1239(int arg0) {
        field2942++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2940 == null) {
            return "";
        }
        var2.append(this.field2940[arg0]);
        for (int var3 = 1; var3 < this.field2940.length; var3++) {
            var2.append("...");
            var2.append(this.field2940[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(B)V", line = 252)
    public final void method1240(byte arg0) {
        if (this.field2949 != null) {
            for (int var2 = 0; var2 < this.field2949.length; var2++) {
                this.field2949[var2] = class35.method227(this.field2949[var2], 32768);
            }
        }
        field2938++;
        if (arg0 < 12) {
            this.method1238(30, -43);
        }
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(B)I", line = 280)
    public final int method1241(byte arg0) {
        field2950++;
        if (this.field2932 == null) {
            return 0;
        } else if (arg0 < 17) {
            return 87;
        } else {
            return this.field2932.length;
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(BLjg;)Ljava/lang/String;", line = 308)
    public final String method1242(byte arg0, class186 arg1) {
        int var3 = -100 % ((-arg0 - 48) / 33);
        field2945++;
        StringBuffer var4 = new StringBuffer(80);
        if (this.field2932 != null) {
            for (int var5 = 0; var5 < this.field2932.length; var5++) {
                var4.append(this.field2940[var5]);
                var4.append(class125.method920(this.field2944[var5], this.field2932[var5], arg1.method1310((byte) -93, class1.field4[this.field2932[var5]]), (byte) -44));
            }
        }
        var4.append(this.field2940[this.field2940.length - 1]);
        return var4.toString();
    }
}
