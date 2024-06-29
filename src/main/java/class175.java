import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class175 extends class53 {

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "Z")
    public static boolean field2934 = true;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "[Lfa;")
    public static class186[] field2940 = new class186[27];

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "Lwa;")
    public static class75 field2944 = class66.method560("Ladevorgang )2 bitte warten Sie)3", false);

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "Lwa;")
    public static class75 field2943 = class66.method560("p11_full", false);

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "Lwa;")
    public static class75 field2941 = class66.method560("<col=80ff00>", false);

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "Lwa;")
    private static class75 field2952 = class66.method560("Members object", false);

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "Lwa;")
    public static class75 field2936 = field2952;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "Lre;")
    public static class262 field2935;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "Ljava/awt/Font;")
    public static Font field2937;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "[Lue;")
    private class14[] field2946;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "[Lwa;")
    public static class75[] field2949;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B[[I)V", line = 7)
    private final void method1288(byte arg0, int[][] arg1) {
        field2948++;
        int var3 = class269.field4644;
        int var4 = class303.field5189;
        class203.method1502(arg1, (byte) -126);
        client.method1739(class157.field2697, (byte) -126, 0, class3.field31, 0);
        if (arg0 < 121 || this.field2946 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field2946.length; var5++) {
            class14 var6 = this.field2946[var5];
            int var7 = var6.field184;
            int var8 = var6.field183;
            if (var7 >= 0) {
                if (var8 >= 0) {
                    var6.method8(100, var4, var3);
                } else {
                    var6.method13(var3, var4, 122);
                }
            } else if (var8 >= 0) {
                var6.method4(var4, false, var3);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[[I", line = 63)
    public final int[][] method66(int arg0, int arg1) {
        field2938++;
        int[][] var3 = this.field882.method874(false, arg0);
        int var4 = -95 / ((arg1 - 76) / 42);
        if (this.field882.field1935) {
            int var5 = class269.field4644;
            int var6 = class303.field5189;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = this.field882.method876(-33);
            this.method1288((byte) 125, var7);
            for (int var9 = 0; var9 < class303.field5189; var9++) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; var15 < class269.field4644; var15++) {
                    int var16 = var10[var15];
                    var14[var15] = class235.method1710(255, var16) << 4;
                    var13[var15] = class235.method1710(var16 >> 4, 4080);
                    var12[var15] = class235.method1710(16711680, var16) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZI)V", line = 123)
    public static final void method1289(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1291(126);
        }
        for (int var3 = 0; var3 < class2.field21; var3++) {
            class87 var4 = class282.method1999(-3, var3);
            if (var4 != null) {
                int var5 = var4.field1428;
                if (var5 >= 0 && !class21.field279.method1069(var5, (byte) 76)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field1442 >= 0) {
                    int var6 = var4.field1442;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class21.field290[class245.method1773(var8, 2, 96)];
                } else if (var5 >= 0) {
                    var9 = class21.field290[class245.method1773(class21.field279.method1078(var5, (byte) 105), 2, 96)];
                } else if (var4.field1436 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field1436;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 + arg0 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class21.field290[class245.method1773(var12, 2, 96)];
                }
                class82.field1375[var3 + 1] = var9;
            }
        }
        field2933++;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 195)
    public class175() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B[I)[I", line = 205)
    public static final int[] method1290(byte arg0, int[] arg1) {
        field2945++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 >= -35) {
            method1290((byte) 93, (int[]) null);
        }
        int[] var2 = new int[arg1.length];
        class231.method1689(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V", line = 223)
    public static void method1291(int arg0) {
        field2936 = null;
        field2935 = null;
        field2937 = null;
        field2941 = null;
        field2943 = null;
        field2940 = null;
        field2952 = null;
        field2949 = null;
        field2944 = null;
        int var1 = 38 % ((8 - arg0) / 44);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)I", line = 242)
    public static final int method1292(int arg0, byte arg1) {
        field2951++;
        int var2 = 48 / ((-arg1 - 46) / 35);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lwa;Z)V", line = 266)
    public static final void method1293(class75 arg0, boolean arg1) {
        field2942++;
        int var2 = class301.method2068(arg1, arg0);
        if (var2 == -1) {
            return;
        }
        class104.field1774 = class283.field4876.field2341[var2] - class82.field1374;
        int var3 = (int) ((float) field2935.field4531 / class205.field3468) + class104.field1774;
        class167.field2813 = class215.field3668 + class130.field2252 - class283.field4876.field2352[var2] - 1;
        int var4 = class104.field1774 - ((int) ((float) field2935.field4531 / class205.field3468));
        int var5 = class167.field2813 - (int) ((float) field2935.field4517 / class205.field3468);
        if (var4 < 0) {
            class104.field1774 = (int) ((float) field2935.field4531 / class205.field3468);
        }
        if (class39.field589 < var3) {
            class104.field1774 = class39.field589 - ((int) ((float) field2935.field4531 / class205.field3468));
        }
        int var6 = (int) ((float) field2935.field4517 / class205.field3468) + class167.field2813;
        if (var5 < 0) {
            class167.field2813 = (int) ((float) field2935.field4517 / class205.field3468);
        }
        if (arg1) {
            field2949 = (class75[]) null;
        }
        if (class215.field3668 < var6) {
            class167.field2813 = class215.field3668 - ((int) ((float) field2935.field4517 / class205.field3468));
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[I", line = 326)
    public final int[] method59(int arg0, int arg1) {
        field2950++;
        if (arg0 != -15196) {
            return (int[]) null;
        }
        int[] var3 = this.field878.method1603(arg1, (byte) 109);
        if (this.field878.field3749) {
            this.method1288((byte) 125, this.field878.method1602((byte) 105));
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILja;Z)V", line = 356)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field2947++;
        if (arg0 == 0) {
            this.field2946 = new class14[arg1.method501(0)];
            for (int var4 = 0; var4 < this.field2946.length; var4++) {
                int var5 = arg1.method501(0);
                if (var5 == 0) {
                    this.field2946[var4] = class110.method860(22759, arg1);
                } else if (var5 == 1) {
                    this.field2946[var4] = class286.method2017(-1, arg1);
                } else if (var5 == 2) {
                    this.field2946[var4] = class250.method1798(arg1, 0);
                } else if (var5 == 3) {
                    this.field2946[var4] = class72.method600(arg1, -1172989273);
                }
            }
        } else if (arg0 == 1) {
            this.field880 = arg1.method501(0) == 1;
        }
        if (!arg2) {
            field2936 = (class75) null;
        }
    }
}
