import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class54 extends class23 {

    @OriginalMember(owner = "client!wf", name = "fb", descriptor = "I")
    private int field1045 = 585;

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "Lqd;")
    private static class40 field1039 = class147.method1106("Ok", (byte) -61);

    @OriginalMember(owner = "client!wf", name = "bb", descriptor = "[Lqd;")
    public static class40[] field1041 = new class40[8];

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "Lqd;")
    private static class40 field1040 = class147.method1106("Mon", (byte) -61);

    @OriginalMember(owner = "client!wf", name = "jb", descriptor = "Lqd;")
    private static class40 field1049 = class147.method1106("Sun", (byte) -107);

    @OriginalMember(owner = "client!wf", name = "lb", descriptor = "Lqd;")
    public static class40 field1051 = class147.method1106("blinken3:", (byte) -61);

    @OriginalMember(owner = "client!wf", name = "db", descriptor = "Lqd;")
    private static class40 field1043 = class147.method1106("Unable to find ", (byte) -86);

    @OriginalMember(owner = "client!wf", name = "mb", descriptor = "Lqd;")
    private static class40 field1052 = class147.method1106("0", (byte) -96);

    @OriginalMember(owner = "client!wf", name = "nb", descriptor = "[I")
    public static int[] field1053 = new int[2];

    @OriginalMember(owner = "client!wf", name = "gb", descriptor = "Lqd;")
    private static class40 field1046 = class147.method1106("Thu", (byte) -71);

    @OriginalMember(owner = "client!wf", name = "qb", descriptor = "Lqd;")
    private static class40 field1056 = class147.method1106("Select", (byte) -97);

    @OriginalMember(owner = "client!wf", name = "cb", descriptor = "Lqd;")
    public static class40 field1042 = class147.method1106("null", (byte) -67);

    @OriginalMember(owner = "client!wf", name = "eb", descriptor = "Lqd;")
    public static class40 field1044 = field1043;

    @OriginalMember(owner = "client!wf", name = "kb", descriptor = "Lqd;")
    public static class40 field1050 = field1056;

    @OriginalMember(owner = "client!wf", name = "tb", descriptor = "Lqd;")
    private static class40 field1059 = class147.method1106("Sat", (byte) -45);

    @OriginalMember(owner = "client!wf", name = "xb", descriptor = "Lqd;")
    private static class40 field1063 = class147.method1106("Wed", (byte) -74);

    @OriginalMember(owner = "client!wf", name = "sb", descriptor = "Lqd;")
    private static class40 field1058 = class147.method1106("Fri", (byte) -68);

    @OriginalMember(owner = "client!wf", name = "wb", descriptor = "I")
    public static int field1062 = 0;

    @OriginalMember(owner = "client!wf", name = "yb", descriptor = "Lqd;")
    public static class40 field1064 = field1039;

    @OriginalMember(owner = "client!wf", name = "vb", descriptor = "Lqd;")
    private static class40 field1061 = class147.method1106("Tue", (byte) -128);

    @OriginalMember(owner = "client!wf", name = "hb", descriptor = "[Lqd;")
    public static class40[] field1047 = new class40[] { field1049, field1040, field1061, field1063, field1046, field1058, field1059 };

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!wf", name = "ib", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!wf", name = "ob", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!wf", name = "pb", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!wf", name = "rb", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!wf", name = "ub", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILsd;)V", line = 13)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg0 == 0) {
            this.field1045 = arg2.method197(-1);
        }
        field1038++;
        if (arg1 != 0) {
            method465(-39);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(BI)Z", line = 34)
    public static final boolean method464(byte arg0, int arg1) {
        class291 var2 = class78.method579(arg1, true);
        if (arg0 < 103) {
            method466(-121, (float[]) null);
        }
        field1054++;
        if (var2 == null) {
            return false;
        } else if (class107.field1884 == 1 || class107.field1884 == 2 || class188.field3049 == 2) {
            byte[] var3 = var2.field4867.method360(-20563);
            class195.field3145 = new String(var3, 0, var3.length);
            class81.field1426 = var2.field4866;
            if (class188.field3049 != 0) {
                class233.field3843 = class81.field1426 + 50000;
                class20.field340 = class81.field1426 + 40000;
                class23.field398 = class20.field340;
            }
            return true;
        } else {
            class40 var4 = class7.field98;
            if (class188.field3049 != 0) {
                var4 = class153.method1192(new class40[] { class108.field1895, class276.method1927((byte) -120, var2.field4866 + 7000) }, (byte) 2);
            }
            class40 var5 = class7.field98;
            if (class46.field895 != null) {
                var5 = class153.method1192(new class40[] { class296.field4953, class46.field895 }, (byte) -61);
            }
            class40 var6 = class153.method1192(new class40[] { class180.field2943, var2.field4867, var4, class142.field2388, class276.method1927((byte) -78, class248.field4106), class261.field4385, class276.method1927((byte) -107, class162.field2691), var5, class122.field2124, class315.field5319 ? class306.field5128 : field1052, class65.field1206, class301.field5052 ? class306.field5128 : field1052, class268.field4467, class10.field161 ? class306.field5128 : field1052 }, (byte) 122);
            try {
                class312.field5265.getAppletContext().showDocument(var6.method325(0), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V", line = 89)
    public static void method465(int arg0) {
        field1047 = null;
        field1042 = null;
        field1050 = null;
        field1051 = null;
        field1061 = null;
        field1043 = null;
        field1040 = null;
        field1052 = null;
        field1039 = null;
        field1049 = null;
        field1058 = null;
        field1064 = null;
        field1041 = null;
        field1059 = null;
        field1056 = null;
        field1053 = null;
        field1063 = null;
        field1044 = null;
        if (arg0 != 1) {
            method465(65);
        }
        field1046 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[F)[F", line = 130)
    public static final float[] method466(int arg0, float[] arg1) {
        field1057++;
        if (arg0 != 12771) {
            return (float[]) null;
        } else if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            class234.method1622(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 158)
    public class54() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V", line = 174)
    public static final void method467(boolean arg0) {
        class95.field1715.method1458((byte) -31);
        field1060++;
        int var1 = class95.field1715.method1466(-5582, 1);
        if (!arg0 || var1 == 0) {
            return;
        }
        int var2 = class95.field1715.method1466(-5582, 2);
        if (var2 == 0) {
            class301.field5048[class87.field1555++] = 2047;
        } else if (var2 == 1) {
            int var3 = class95.field1715.method1466(-5582, 3);
            class255.field4233.method665(false, 7, var3);
            int var4 = class95.field1715.method1466(-5582, 1);
            if (var4 == 1) {
                class301.field5048[class87.field1555++] = 2047;
            }
        } else if (var2 == 2) {
            int var9 = class95.field1715.method1466(-5582, 3);
            class255.field4233.method665(true, 7, var9);
            int var10 = class95.field1715.method1466(-5582, 3);
            class255.field4233.method665(true, 7, var10);
            int var11 = class95.field1715.method1466(-5582, 1);
            if (var11 == 1) {
                class301.field5048[class87.field1555++] = 2047;
            }
        } else if (var2 == 3) {
            int var5 = class95.field1715.method1466(-5582, 7);
            int var6 = class95.field1715.method1466(-5582, 1);
            int var7 = class95.field1715.method1466(-5582, 1);
            if (var7 == 1) {
                class301.field5048[class87.field1555++] = 2047;
            }
            class160.field2671 = class95.field1715.method1466(-5582, 2);
            int var8 = class95.field1715.method1466(-5582, 7);
            class255.field4233.method1811(0, var5, var6 == 1, var8);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)[I", line = 264)
    public final int[] method32(byte arg0, int arg1) {
        if (arg0 != -94) {
            method466(3, (float[]) null);
        }
        int[] var3 = this.field403.method724((byte) -121, arg1);
        if (this.field403.field1760) {
            int var4 = class150.field2509[arg1];
            for (int var5 = 0; var5 < class52.field1007; var5++) {
                int var6 = class315.field5345[var5];
                if (this.field1045 < var6 && 4096 - this.field1045 > var6 && var4 > (2048 - this.field1045) && var4 < (this.field1045 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1045);
                    var3[var5] = 4096 - var10;
                } else if (var6 > (2048 - this.field1045) && (this.field1045 + 2048) > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1045;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1045);
                } else if (this.field1045 > var4 || (4096 - this.field1045) < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field1045;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1045);
                } else if (var6 >= this.field1045 && (4096 - this.field1045) >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field1045);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        field1048++;
        return var3;
    }
}
