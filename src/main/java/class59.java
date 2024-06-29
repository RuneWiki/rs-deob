import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class59 extends class23 {

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "[I")
    public static int[] field1129 = new int[50];

    @OriginalMember(owner = "client!bk", name = "gb", descriptor = "[S")
    public static short[] field1137 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!bk", name = "fb", descriptor = "I")
    public static int field1136 = 0;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "Lqd;")
    public static class40 field1130 = class147.method1106("::replacecanvas", (byte) -127);

    @OriginalMember(owner = "client!bk", name = "jb", descriptor = "[[Lfl;")
    public static class217[][] field1140 = new class217[13][13];

    @OriginalMember(owner = "client!bk", name = "ab", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!bk", name = "bb", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!bk", name = "cb", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!bk", name = "db", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!bk", name = "eb", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!bk", name = "hb", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!bk", name = "ib", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!bk", name = "kb", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!bk", name = "lb", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILsd;)V", line = 8)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg1 == 0) {
            field1135++;
            if (arg0 == 0) {
                this.field415 = arg2.method226(255) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V", line = 23)
    public static final void method498(byte arg0) {
        field1138++;
        int var1 = -10 / ((arg0 + 3) / 48);
        class181.field2945.method1349(true);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)[[I", line = 48)
    public final int[][] method17(int arg0, int arg1) {
        field1134++;
        int[][] var3 = this.field417.method1251(arg1, 120);
        if (arg0 <= 30) {
            this.method17(98, -46);
        }
        if (this.field417.field2751) {
            int[] var4 = var3[2];
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            for (int var7 = 0; var7 < class52.field1007; var7++) {
                this.method501((byte) -125, var7, arg1);
                int[][] var8 = this.method173(0, class242.field3998, (byte) -123);
                var6[var7] = var8[0][class317.field5369];
                var5[var7] = var8[1][class317.field5369];
                var4[var7] = var8[2][class317.field5369];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V", line = 87)
    public static void method499(byte arg0) {
        field1140 = (class217[][]) null;
        if (arg0 >= -86) {
            field1137 = (short[]) null;
        }
        field1129 = null;
        field1130 = null;
        field1137 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 105)
    public static final Class method500(int arg0, String arg1) throws ClassNotFoundException {
        field1132++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg0 != -21269) {
                field1130 = (class40) null;
            }
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)[I", line = 144)
    public final int[] method32(byte arg0, int arg1) {
        field1133++;
        if (arg0 != -94) {
            field1140 = (class217[][]) ((class217[][]) null);
        }
        int[] var3 = this.field403.method724((byte) -72, arg1);
        if (this.field403.field1760) {
            for (int var4 = 0; var4 < class52.field1007; var4++) {
                this.method501((byte) 71, var4, arg1);
                int[] var5 = this.method174(0, 0, class242.field3998);
                var3[var4] = var5[class317.field5369];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BII)V", line = 178)
    private final void method501(byte arg0, int arg1, int arg2) {
        field1131++;
        int var4 = -16 % ((arg0 + 53) / 43);
        int var5 = class150.field2509[arg2];
        int var6 = class315.field5345[arg1];
        float var7 = (float) Math.atan2((double) (var6 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var7 && -2.356194490192345D >= (double) var7) {
            class317.field5369 = arg1;
            class242.field3998 = arg2;
        } else if ((double) var7 <= -1.5707963267948966D && (double) var7 >= -2.356194490192345D) {
            class242.field3998 = arg1;
            class317.field5369 = arg2;
        } else if (-0.7853981633974483D >= (double) var7 && (double) var7 >= -1.5707963267948966D) {
            class317.field5369 = class52.field1007 - arg2;
            class242.field3998 = arg1;
        } else if (var7 <= 0.0F && (double) var7 >= -0.7853981633974483D) {
            class317.field5369 = arg1;
            class242.field3998 = class271.field4497 - arg2;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class242.field3998 = class271.field4497 - arg2;
            class317.field5369 = class52.field1007 - arg1;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class317.field5369 = class52.field1007 - arg2;
            class242.field3998 = class271.field4497 - arg1;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class317.field5369 = arg2;
            class242.field3998 = class271.field4497 - arg1;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class317.field5369 = class52.field1007 - arg1;
            class242.field3998 = arg2;
        }
        class242.field3998 &= class212.field3384;
        class317.field5369 &= class6.field92;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILsd;)V", line = 256)
    public static final void method502(int arg0, class26 arg1) {
        field1141++;
        int var2 = arg1.method195((byte) 120);
        class91.field1646 = new class256[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class91.field1646[var3] = new class256();
            class91.field1646[var3].field4271 = arg1.method195((byte) 120);
            class91.field1646[var3].field4263 = arg1.method242(-15);
        }
        if (arg0 != 28333) {
            field1139 = 91;
        }
        class270.field4486 = arg1.method195((byte) 120);
        class166.field2752 = arg1.method195((byte) 120);
        class168.field2760 = arg1.method195((byte) 120);
        class159.field2661 = new class291[class166.field2752 + 1 - class270.field4486];
        for (int var4 = 0; var4 < class168.field2760; var4++) {
            int var5 = arg1.method195((byte) 120);
            class291 var6 = class159.field2661[var5] = new class291();
            var6.field685 = arg1.method226(255);
            var6.field684 = arg1.method203(-22066);
            var6.field4866 = class270.field4486 + var5;
            var6.field4864 = arg1.method242(9);
            var6.field4867 = arg1.method242(arg0 ^ 0x6EA2);
        }
        class62.field1181 = arg1.method203(-22066);
        class1.field12 = true;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V", line = 302)
    public class59() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lqd;I)V", line = 312)
    public static final void method503(class40 arg0, int arg1) {
        field1142++;
        class46.field895 = arg0;
        if (class275.field4573.field1876 == null) {
            return;
        }
        try {
            class40 var2 = class199.field3192.method374(71, class275.field4573.field1876);
            class40 var3 = class290.field4848.method374(-110, class275.field4573.field1876);
            class40 var4 = class153.method1192(new class40[] { var2, class253.field4193, arg0, class222.field3686, var3 }, (byte) -39);
            class40 var5;
            if (arg0.method350(true) == 0) {
                var5 = class153.method1192(new class40[] { var4, class290.field4861 }, (byte) 125);
            } else {
                var5 = class153.method1192(new class40[] { var4, class50.field962, class212.method1489(class69.method535(true) + 94608000000L, (byte) -114), class239.field3963, class86.method664(-104, 94608000L) }, (byte) 126);
            }
            class153.method1192(new class40[] { class44.field841, var5, class286.field4817 }, (byte) 123).method351((byte) -78, class275.field4573.field1876);
            int var6 = -113 % ((67 - arg1) / 35);
        } catch (Throwable var8) {
        }
    }
}
