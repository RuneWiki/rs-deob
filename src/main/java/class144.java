import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class144 extends class447 {

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "Z")
    public boolean field2078 = true;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "Lng;")
    public static class190 field2088 = new class190(8);

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2093 = "Loaded textures";

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "[[I")
    public static int[][] field2095 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    public static int field2096 = 0;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "[I")
    public int[] field2085;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "[I")
    private int[] field2089;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field2079;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "[[I")
    private int[][] field2081;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Leb;I)V", line = 3)
    public final void method980(class371 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2429(arg1 + 1);
            if (var3 == 0) {
                if (arg1 != -1) {
                    field2093 = null;
                }
                field2082++;
                return;
            }
            this.method981(arg0, var3, (byte) 69);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Leb;IB)V", line = 25)
    private final void method981(class371 arg0, int arg1, byte arg2) {
        field2084++;
        if (arg1 == 1) {
            this.field2079 = class65.method449((byte) -83, arg0.method2422(-1), '<');
        } else if (arg1 == 2) {
            int var8 = arg0.method2429(0);
            this.field2085 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2085[var9] = arg0.method2403((byte) 52);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method2429(0);
            this.field2089 = new int[var4];
            this.field2081 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method2403((byte) 53);
                this.field2089[var5] = var6;
                this.field2081[var5] = new int[class70.field1090[var6]];
                for (int var7 = 0; var7 < class70.field1090[var6]; var7++) {
                    this.field2081[var5][var7] = arg0.method2403((byte) 115);
                }
            }
        } else if (arg1 == 4) {
            this.field2078 = false;
        }
        if (arg2 <= 48) {
            this.field2079 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLeb;)Ljava/lang/String;", line = 90)
    public final String method982(byte arg0, class371 arg1) {
        field2091++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg0 <= 26) {
            field2096 = -85;
        }
        if (this.field2089 != null) {
            for (int var4 = 0; var4 < this.field2089.length; var4++) {
                var3.append(this.field2079[var4]);
                var3.append(class156.method1051(7608, this.field2089[var4], this.field2081[var4], arg1.method2395(class204.field2768[this.field2089[var4]], (byte) 100)));
            }
        }
        var3.append(this.field2079[this.field2079.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILqj;Lqj;)V", line = 119)
    public static final void method983(int arg0, class296 arg1, class296 arg2) {
        class262.field3582 = arg1;
        class278.field3753 = arg2;
        if (arg0 != 12) {
            field2093 = null;
        }
        field2083++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)I", line = 133)
    public final int method984(byte arg0, int arg1) {
        if (arg0 == -119) {
            field2080++;
            return this.field2089 == null || arg1 < 0 || arg1 > this.field2089.length ? -1 : this.field2089[arg1];
        } else {
            return 67;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)I", line = 147)
    public final int method985(int arg0, int arg1, int arg2) {
        if (arg2 != -20015) {
            this.method988(true);
        }
        field2077++;
        if (this.field2089 == null || arg1 < 0 || arg1 > this.field2089.length) {
            return -1;
        } else if (this.field2081[arg1] == null || arg0 < 0 || arg0 > this.field2081[arg1].length) {
            return -1;
        } else {
            return this.field2081[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(B)V", line = 175)
    public static final void method986(byte arg0) {
        class32.field500 = null;
        class197.field2730 = null;
        class369.field5183 = null;
        class71.field1099 = null;
        class140.field1992 = null;
        field2086++;
        class403.field5875 = null;
        class220.field2899 = null;
        class157.field2230 = null;
        class312.field4258 = null;
        class276.field3746 = null;
        class261.field3571 = null;
        class382.field5408 = null;
        class154.field2183 = null;
        if (arg0 == 14) {
            class216.field2867 = null;
            class11.field150 = null;
            class401.field5855 = null;
            class129.field1805 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Leb;[II)V", line = 204)
    public final void method987(class371 arg0, int[] arg1, int arg2) {
        field2076++;
        if (this.field2089 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2089.length && var4 < arg1.length; var4++) {
            int var5 = class30.field470[this.method984((byte) -119, var4)];
            if (var5 > 0) {
                arg0.method2417((byte) 77, (long) arg1[var4], var5);
            }
        }
        if (arg2 != 64) {
            method989(22);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 238)
    public final String method988(boolean arg0) {
        field2090++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2079 == null) {
            return "";
        }
        var2.append(this.field2079[0]);
        if (!arg0) {
            field2095 = null;
        }
        for (int var3 = 1; var3 < this.field2079.length; var3++) {
            var2.append("...");
            var2.append(this.field2079[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V", line = 267)
    public static final void method989(int arg0) {
        class190 var1 = class233.field3157;
        synchronized (class233.field3157) {
            class233.field3157.method1249(1);
        }
        field2092++;
        class190 var2 = class260.field3555;
        synchronized (class260.field3555) {
            class260.field3555.method1249(1);
            if (arg0 >= -89) {
                method986((byte) -36);
            }
        }
        class190 var3 = class184.field2576;
        synchronized (class184.field2576) {
            class184.field2576.method1249(1);
        }
        class190 var4 = class326.field4447;
        synchronized (class326.field4447) {
            class326.field4447.method1249(1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(B)V", line = 289)
    public static void method990(byte arg0) {
        if (arg0 <= 29) {
            method989(85);
        }
        field2088 = null;
        field2095 = null;
        field2093 = null;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V", line = 301)
    public final void method991(int arg0) {
        if (this.field2085 != null) {
            for (int var2 = 0; var2 < this.field2085.length; var2++) {
                this.field2085[var2] = class311.method1970(this.field2085[var2], 32768);
            }
        }
        if (arg0 != 0) {
            this.method984((byte) 85, -51);
        }
        field2094++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V", line = 321)
    public static final void method992(int arg0, int arg1) {
        class1 var2 = class371.field5260;
        synchronized (class371.field5260) {
            if (arg1 < 15) {
                method992(-2, 40);
            }
            class14.field171 = arg0;
        }
        field2075++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljk;IIII)V", line = 338)
    public static final void method993(class378 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class169.method1141(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class386.field5629) {
            class169.method1141(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class169.method1141(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class371.field5311) {
            class169.method1141(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class371.field5311) {
            class169.method1141(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class386.field5629 && arg4 <= class371.field5311) {
            class169.method1141(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class169.method1141(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class386.field5629 && arg4 > 0) {
            class169.method1141(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(B)I", line = 391)
    public final int method994(byte arg0) {
        field2087++;
        if (arg0 >= -60) {
            method983(-1, (class296) null, (class296) null);
        }
        return this.field2089 == null ? 0 : this.field2089.length;
    }
}
