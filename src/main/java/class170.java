import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class170 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "F")
    public float field2613 = 1.0F;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "F")
    public float field2614 = 1.0F;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "F")
    public float field2632 = 0.25F;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public int field2630;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public int field2622;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "F")
    public float field2628;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "F")
    public float field2629;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Ldn;")
    public class483 field2625;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "F")
    public float field2620;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Ljw;")
    public static class520 field2615 = new class520(512);

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field2631 = 0;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 5)
    public static void method1156(byte arg0) {
        if (arg0 != -9) {
            field2615 = null;
        }
        field2615 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(CB)C", line = 17)
    public static final char method1157(char arg0, byte arg1) {
        if (arg1 != -64) {
            field2631 = 87;
        }
        field2619++;
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 508)
    public class170() {
        this.field2617 = class335.field4639;
        this.field2616 = 0;
        this.field2630 = class16.field243;
        this.field2626 = -50;
        this.field2622 = -50;
        this.field2628 = 0.69921875F;
        this.field2629 = 1.2F;
        this.field2625 = class515.field6884;
        this.field2620 = 1.1523438F;
        this.field2623 = -60;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Leh;)V", line = 524)
    public class170(class335 arg0) {
        int var2 = arg0.method2034(255);
        if (class344.field4718.method2330(-20622, class571.field7587) && class251.field3460.method454() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field2617 = class335.field4639;
            } else {
                this.field2617 = arg0.method2045(-98);
            }
            if ((var2 & 0x2) == 0) {
                this.field2620 = 1.1523438F;
            } else {
                this.field2620 = (float) arg0.method2001((byte) -83) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field2628 = 0.69921875F;
            } else {
                this.field2628 = (float) arg0.method2001((byte) -83) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field2629 = 1.2F;
            } else {
                this.field2629 = (float) arg0.method2001((byte) -83) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2045(-98);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2001((byte) -83);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2001((byte) -83);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2001((byte) -83);
            }
            this.field2617 = class335.field4639;
            this.field2629 = 1.2F;
            this.field2620 = 1.1523438F;
            this.field2628 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2623 = -60;
            this.field2626 = -50;
            this.field2622 = -50;
        } else {
            this.field2622 = arg0.method2022(-29089);
            this.field2623 = arg0.method2022(-29089);
            this.field2626 = arg0.method2022(-29089);
        }
        if ((var2 & 0x20) == 0) {
            this.field2630 = class16.field243;
        } else {
            this.field2630 = arg0.method2045(-98);
        }
        if ((var2 & 0x40) == 0) {
            this.field2616 = 0;
        } else {
            this.field2616 = arg0.method2001((byte) -83);
        }
        if ((var2 & 0x80) == 0) {
            this.field2625 = class515.field6884;
        } else {
            int var3 = arg0.method2001((byte) -83);
            int var4 = arg0.method2001((byte) -83);
            int var5 = arg0.method2001((byte) -83);
            int var6 = arg0.method2001((byte) -83);
            int var7 = arg0.method2001((byte) -83);
            int var8 = arg0.method2001((byte) -83);
            this.field2625 = class210.method1345(var8, var7, var4, var6, var5, var3, 0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 424)
    public static final String method1158(byte arg0, long arg1) {
        field2624++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0 >= -4) {
                return null;
            }
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class59.field912[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILeh;)V", line = 478)
    public final void method1159(int arg0, class335 arg1) {
        field2627++;
        this.field2613 = (float) (arg1.method2034(255) * 8) / 255.0F;
        this.field2632 = (float) (arg1.method2034(255) * 8) / 255.0F;
        if (arg0 > -86) {
            method1156((byte) 75);
        }
        this.field2614 = (float) (arg1.method2034(255) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILr;)Z", line = 491)
    public final boolean method1160(int arg0, class170 arg1) {
        if (arg0 != 245) {
            field2615 = null;
        }
        field2618++;
        return this.field2617 == arg1.field2617 && this.field2620 == arg1.field2620 && this.field2628 == arg1.field2628 && this.field2629 == arg1.field2629 && this.field2632 == arg1.field2632 && this.field2613 == arg1.field2613 && this.field2614 == arg1.field2614 && this.field2630 == arg1.field2630 && this.field2616 == arg1.field2616 && this.field2625 == arg1.field2625;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Z", line = 621)
    public static final boolean method1161(int arg0) {
        field2621++;
        try {
            if (class71.field1059 == 2) {
                if (class70.field1058 == null) {
                    class70.field1058 = class302.method1833(class704.field9906, class369.field4989, class462.field6257);
                    if (class70.field1058 == null) {
                        return false;
                    }
                }
                if (class117.field1991 == null) {
                    class117.field1991 = new class375(class5.field80, class563.field7467);
                }
                if (class568.field7553.method1709(class70.field1058, 22050, class374.field5048, (byte) 107, class117.field1991)) {
                    class568.field7553.method1719((byte) 121);
                    class568.field7553.method1717((byte) -22, class254.field3517);
                    class568.field7553.method1735(class70.field1058, class344.field4715, true);
                    class71.field1059 = 0;
                    class70.field1058 = null;
                    class117.field1991 = null;
                    class704.field9906 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class568.field7553.method1737(true);
            class704.field9906 = null;
            class117.field1991 = null;
            class71.field1059 = 0;
            class70.field1058 = null;
        }
        return arg0 <= 6;
    }
}
