import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class222 {

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "F")
    public float field3129 = 0.25F;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "F")
    public float field3127 = 1.0F;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "F")
    public float field3138 = 1.0F;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field3125;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "F")
    public float field3134;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "F")
    public float field3137;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "F")
    public float field3144;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lod;")
    public class28 field3140;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "J")
    public static long field3142 = 0L;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Ldh;")
    public static class179 field3146 = new class179(64);

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Ljava/lang/String;")
    public static String field3147 = "";

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Llc;")
    public static class175 field3133;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "[[[B")
    public static byte[][][] field3143;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIII)Ljava/lang/String;", line = 10)
    public static final String method1524(boolean arg0, int arg1, int arg2, int arg3) {
        field3139++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg0 && arg2 >= 0) {
            int var4 = 2;
            if (arg3 != -50) {
                field3143 = (byte[][][]) ((byte[][][]) null);
            }
            int var5 = arg2 / arg1;
            while (var5 != 0) {
                var5 /= arg1;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg1;
                int var9 = var8 - (arg1 * arg2);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 65)
    public static void method1525(byte arg0) {
        field3147 = null;
        field3146 = null;
        field3143 = (byte[][][]) null;
        field3133 = null;
        int var1 = 124 % ((arg0 + 26) / 35);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 83)
    public static final void method1526(int arg0) {
        field3130++;
        if (arg0 != -13529) {
            field3143 = (byte[][][]) ((byte[][][]) null);
        }
        class271.field4262.method1241(125);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V", line = 96)
    public static final void method1527(byte arg0) {
        int var1 = 36 / ((1 - arg0) / 50);
        class296.field4615 = null;
        class167.field2326 = null;
        field3126++;
        class137.field1919 = null;
        class320.field4921 = null;
        class142.field1987 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLp;)V", line = 113)
    public final void method1528(byte arg0, class107 arg1) {
        field3128++;
        this.field3127 = (float) (arg1.method661(arg0 + 77) * 8) / 255.0F;
        this.field3129 = (float) (arg1.method661(arg0 ^ 0x4D) * 8) / 255.0F;
        if (arg0 != -78) {
            method1526(-14);
        }
        this.field3138 = (float) (arg1.method661(-1) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V", line = 141)
    public class222() {
        this.field3145 = -50;
        this.field3135 = class64.field835;
        this.field3131 = class64.field836;
        this.field3125 = -50;
        this.field3141 = -60;
        this.field3134 = 1.2F;
        this.field3132 = 0;
        this.field3137 = 1.1523438F;
        this.field3144 = 0.69921875F;
        if (class91.field1141 != null) {
            this.field3140 = class28.method174(class91.field1141[0], class91.field1141[1], class91.field1141[2], class91.field1141[3], class91.field1141[4], class91.field1141[5]);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lp;)V", line = 163)
    public class222(class107 arg0) {
        int var2 = arg0.method661(-1);
        if ((var2 & 0x1) == 0) {
            this.field3135 = class64.field835;
        } else {
            this.field3135 = arg0.method676(true);
        }
        if ((var2 & 0x2) == 0) {
            this.field3137 = 1.1523438F;
        } else {
            this.field3137 = (float) arg0.method624(14612) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field3144 = 0.69921875F;
        } else {
            this.field3144 = (float) arg0.method624(14612) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field3134 = 1.2F;
        } else {
            this.field3134 = (float) arg0.method624(14612) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3125 = -50;
            this.field3145 = -50;
            this.field3141 = -60;
        } else {
            this.field3125 = arg0.method656(-115);
            this.field3141 = arg0.method656(-122);
            this.field3145 = arg0.method656(-122);
        }
        if ((var2 & 0x20) == 0) {
            this.field3131 = class64.field836;
        } else {
            this.field3131 = arg0.method676(true);
        }
        if ((var2 & 0x40) == 0) {
            this.field3132 = 0;
        } else {
            this.field3132 = arg0.method624(14612);
        }
        if ((var2 & 0x80) != 0) {
            this.field3140 = class28.method174(arg0.method624(14612), arg0.method624(14612), arg0.method624(14612), arg0.method624(14612), arg0.method624(14612), arg0.method624(14612));
        } else if (class91.field1141 != null) {
            this.field3140 = class28.method174(class91.field1141[0], class91.field1141[1], class91.field1141[2], class91.field1141[3], class91.field1141[4], class91.field1141[5]);
        }
    }
}
