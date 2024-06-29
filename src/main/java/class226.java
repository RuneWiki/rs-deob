import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class226 extends class55 {

    @OriginalMember(owner = "client!f", name = "F", descriptor = "Z")
    public boolean field3181 = true;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field3174 = 0;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field3191 = 0;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field3193 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "Lbd;")
    public static class81 field3186;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "[I")
    private int[] field3178;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "[I")
    public int[] field3180;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "[Ljava/lang/String;")
    private String[] field3183;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "[[I")
    private int[][] field3188;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILqi;I)V")
    private final void method1458(int arg0, class216 arg1, int arg2) {
        if (arg2 != -1) {
            this.field3178 = null;
        }
        field3175++;
        if (arg0 == 1) {
            this.field3183 = class39.method244(true, arg1.method1352((byte) -76), '<');
        } else if (arg0 == 2) {
            int var8 = arg1.method1407(118);
            this.field3180 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3180[var9] = arg1.method1380(true);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1407(112);
            this.field3178 = new int[var4];
            this.field3188 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1380(true);
                this.field3178[var5] = var6;
                this.field3188[var5] = new int[class149.field2165[var6]];
                for (int var7 = 0; var7 < class149.field2165[var6]; var7++) {
                    this.field3188[var5][var7] = arg1.method1380(true);
                }
            }
        } else if (arg0 == 4) {
            this.field3181 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
    public final int method1459(int arg0, int arg1) {
        field3173++;
        if (this.field3178 == null || arg0 < 0 || arg0 > this.field3178.length) {
            return -1;
        } else {
            int var3 = 93 % ((12 - arg1) / 63);
            return this.field3178[arg0];
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLqi;)Ljava/lang/String;")
    public final String method1460(byte arg0, class216 arg1) {
        field3179++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field3178 != null) {
            for (int var4 = 0; var4 < this.field3178.length; var4++) {
                var3.append(this.field3183[var4]);
                var3.append(class59.method362(this.field3188[var4], arg0 + 6322, this.field3178[var4], arg1.method1409(0, class290.field4584[this.field3178[var4]])));
            }
        }
        if (arg0 == 111) {
            var3.append(this.field3183[this.field3183.length - 1]);
            return var3.toString();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)I")
    public static final int method1461(byte arg0, int arg1) {
        field3177++;
        if (arg0 != -31) {
            method1461((byte) 21, 52);
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)I")
    public final int method1462(byte arg0) {
        field3182++;
        int var2 = 99 % ((21 - arg0) / 56);
        return this.field3178 == null ? 0 : this.field3178.length;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZI)I")
    public final int method1463(int arg0, boolean arg1, int arg2) {
        field3189++;
        if (this.field3178 == null || arg0 < 0 || this.field3178.length < arg0) {
            return -1;
        } else {
            if (arg1) {
                this.field3188 = null;
            }
            return this.field3188[arg0] == null || arg2 < 0 || this.field3188[arg0].length < arg2 ? -1 : this.field3188[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lqi;I[I)V")
    public final void method1464(class216 arg0, int arg1, int[] arg2) {
        field3187++;
        if (this.field3178 == null) {
            return;
        }
        int var4 = 0;
        if (arg1 != -1) {
            method1466(-44);
        }
        while (this.field3178.length > var4) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class134.field1962[this.method1459(var4, 91)];
            if (var5 > 0) {
                arg0.method1406(var5, (long) arg2[var4], false);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    public final void method1465(int arg0) {
        if (this.field3180 != null) {
            for (int var2 = 0; var2 < this.field3180.length; var2++) {
                this.field3180[var2] = class220.method1432(this.field3180[var2], 32768);
            }
        }
        if (arg0 > 24) {
            field3184++;
        }
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    public static void method1466(int arg0) {
        field3186 = null;
        int var1 = 49 % ((-arg0 - 61) / 61);
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)[Lck;")
    public static final class1[] method1467(byte arg0) {
        field3194++;
        class1[] var1 = new class1[class133.field1921];
        int var2 = 0;
        if (arg0 != -7) {
            method1461((byte) 19, 11);
        }
        while (var2 < class133.field1921) {
            var1[var2] = new class43(class238.field3435, class118.field1660, class233.field3367[var2], class273.field4041[var2], class296.field4677[var2], class91.field1236[var2], class277.field4210[var2], class165.field2367);
            var2++;
        }
        class294.method1965(true);
        return var1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILqi;)V")
    public final void method1468(int arg0, class216 arg1) {
        int var3 = 115 % ((-arg0 - 54) / 62);
        while (true) {
            int var4 = arg1.method1407(125);
            if (var4 == 0) {
                field3190++;
                return;
            }
            this.method1458(var4, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)Ljava/lang/String;")
    public final String method1469(boolean arg0) {
        if (arg0) {
            this.method1458(-39, (class216) null, 8);
        }
        field3185++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3183 == null) {
            return "";
        }
        var2.append(this.field3183[0]);
        for (int var3 = 1; var3 < this.field3183.length; var3++) {
            var2.append("...");
            var2.append(this.field3183[var3]);
        }
        return var2.toString();
    }
}
