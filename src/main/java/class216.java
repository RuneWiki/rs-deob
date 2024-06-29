import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class216 {

    @OriginalMember(owner = "client!to", name = "i", descriptor = "Z")
    private boolean field3189 = false;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public int field3184 = 0;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public int field3183 = 0;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field3198 = 0;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "Lqu;")
    public static class364 field3199 = new class364(65, 4);

    @OriginalMember(owner = "client!to", name = "u", descriptor = "J")
    public static long field3201 = 0L;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    private int field3197;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "J")
    public long field3182;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "Lhf;")
    public static class574 field3204;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 8)
    public static void method1391(byte arg0) {
        if (arg0 == -118) {
            field3199 = null;
            field3204 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 21)
    public static final String method1392(long arg0, int arg1) {
        field3193++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            if (arg1 != -13929) {
                field3201 = 53L;
            }
            while (var4 != 0L) {
                var3++;
                var4 /= 37L;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class626.field9175[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V", line = 80)
    public final void method1393(byte arg0) {
        this.field3194 = class14.field130[this.field3197 << 3];
        field3200++;
        if (arg0 != 10) {
            return;
        }
        this.field3195 = (int) Math.sqrt((double) (this.field3191 * this.field3191 + this.field3181 * this.field3181 + (this.field3187 * this.field3187)));
        if (this.field3190 == 0) {
            this.field3190 = 1;
        }
        if (this.field3192 == 0) {
            this.field3182 = 2147483647L;
        } else if (this.field3192 == 1) {
            this.field3182 = (this.field3195 * 8 / this.field3190);
            this.field3182 *= this.field3182;
        } else if (this.field3192 == 2) {
            this.field3182 = (this.field3195 * 8 / this.field3190);
        }
        if (this.field3189) {
            this.field3195 *= -1;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IZLps;)V", line = 117)
    private final void method1394(int arg0, boolean arg1, class428 arg2) {
        if (arg1) {
            this.method1393((byte) 27);
        }
        field3186++;
        if (arg0 == 1) {
            this.field3197 = arg2.method2620(74);
        } else if (arg0 == 2) {
            arg2.method2561((byte) 113);
        } else if (arg0 == 3) {
            this.field3191 = arg2.method2589(-11179);
            this.field3187 = arg2.method2589(-11179);
            this.field3181 = arg2.method2589(-11179);
        } else if (arg0 == 4) {
            this.field3192 = arg2.method2561((byte) -126);
            this.field3190 = arg2.method2589(-11179);
        } else if (arg0 == 6) {
            this.field3202 = arg2.method2561((byte) -63);
        } else if (arg0 == 8) {
            this.field3184 = 1;
            return;
        } else if (arg0 == 9) {
            this.field3183 = 1;
            return;
        } else if (arg0 == 10) {
            this.field3189 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZLps;)V", line = 186)
    public final void method1395(boolean arg0, class428 arg1) {
        if (!arg0) {
            field3203 = 115;
        }
        while (true) {
            int var3 = arg1.method2561((byte) 111);
            if (var3 == 0) {
                field3196++;
                return;
            }
            this.method1394(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 218)
    public static final void method1396(String arg0, byte arg1) {
        System.out.println("Error: " + class4.method19(0, "\n", arg0, "%0a"));
        field3185++;
        if (arg1 != 15) {
            method1396(null, (byte) -69);
        }
    }
}
