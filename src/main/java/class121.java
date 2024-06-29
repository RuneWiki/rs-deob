import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class121 extends class270 {

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "Lnk;")
    public static class326 field2124 = new class326(81, 8);

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "Lvv;")
    public static class313 field2130 = new class313(74, 6);

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "[I")
    public static int[] field2133 = new int[1000];

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!cr", name = "M", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "Ljava/lang/String;")
    public String field2125;

    @OriginalMember(owner = "client!cr", name = "B", descriptor = "[C")
    public char[] field2121;

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "[C")
    public char[] field2131;

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "[I")
    public int[] field2123;

    @OriginalMember(owner = "client!cr", name = "J", descriptor = "[I")
    public int[] field2129;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(II)Z", line = 5)
    public static final boolean method950(int arg0, int arg1) {
        field2120++;
        int var2 = 94 / ((arg0 + 73) / 39);
        return arg1 == 2 || arg1 == 4 || arg1 == 5;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILia;)V", line = 15)
    public final void method951(int arg0, class23 arg1) {
        field2118++;
        while (true) {
            int var3 = arg1.method126((byte) -83);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    this.field2123 = null;
                    return;
                }
            }
            this.method953(var3, arg1, false);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILec;)V", line = 37)
    public static final void method952(int arg0, int arg1, int arg2, class68 arg3) {
        field2122++;
        if (arg3 == null) {
            return;
        }
        int var4 = -46 % ((11 - arg0) / 53);
        if (arg3.field1153 != null) {
            class483 var5 = new class483();
            var5.field7101 = arg3.field1153;
            var5.field7100 = arg3;
            class521.method3073(var5);
        }
        class421.field6365 = arg3.field1062;
        class75.field1309 = arg3.field1152;
        class508.field7386 = true;
        class313.field4934 = arg1;
        class345.field5413 = arg3.field1059;
        class102.field1688 = arg3.field1087;
        class251.field4297 = arg2;
        class208.field3282 = arg3.field1067;
        class396.method2476(arg3, 1);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILia;Z)V", line = 70)
    private final void method953(int arg0, class23 arg1, boolean arg2) {
        field2119++;
        if (arg0 == 1) {
            this.field2125 = arg1.method156((byte) -78);
        } else if (arg0 == 2) {
            int var7 = arg1.method126((byte) -117);
            this.field2129 = new int[var7];
            this.field2131 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2129[var8] = arg1.method132(36);
                byte var9 = arg1.method167(-2);
                this.field2131[var8] = var9 == 0 ? 0 : class260.method1745(var9, 255);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method126((byte) -91);
            this.field2121 = new char[var4];
            this.field2123 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2123[var5] = arg1.method132(25);
                byte var6 = arg1.method167(-2);
                this.field2121[var5] = var6 == 0 ? 0 : class260.method1745(var6, 255);
            }
        }
        if (arg2) {
            method952(-71, -110, -106, null);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lou;Z)I", line = 145)
    public static final int method954(class197 arg0, boolean arg1) {
        field2127++;
        if (arg0.field3135 == 0) {
            return 0;
        }
        if (arg0.field3065 != -1) {
            class197 var2 = null;
            if (arg0.field3065 < 32768) {
                class505 var3 = (class505) class147.field2396.method2516((long) arg0.field3065, -1);
                if (var3 != null) {
                    var2 = var3.field7355;
                }
            } else if (arg0.field3065 >= 32768) {
                var2 = class435.field6489[arg0.field3065 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field4716 - var2.field4716;
                int var5 = arg0.field4714 - var2.field4714;
                if (var4 != 0 || var5 != 0) {
                    arg0.method1304((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, false);
                }
            }
        }
        if (arg0 instanceof class166) {
            class166 var6 = (class166) arg0;
            if (var6.field2618 != -1 && (var6.field3153 == 0 || var6.field3155 > 0)) {
                var6.method1304(var6.field2618, !arg1);
                var6.field2618 = -1;
            }
        } else if (arg0 instanceof class265) {
            class265 var7 = (class265) arg0;
            if (var7.field4434 != -1 && (var7.field3153 == 0 || var7.field3155 > 0)) {
                int var8 = var7.field4716 - ((var7.field4434 - class16.field181 - class16.field181) * 64);
                int var9 = var7.field4714 - ((var7.field4449 - class455.field6794 - class455.field6794) * 64);
                if (var8 != 0 || var9 != 0) {
                    var7.method1304((int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF, !arg1);
                }
                var7.field4434 = -1;
            }
        }
        if (!arg1) {
            method950(-107, -117);
        }
        return arg0.method1312((byte) 0);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 228)
    public final void method955(int arg0) {
        if (this.field2123 != null) {
            for (int var2 = 0; var2 < this.field2123.length; var2++) {
                this.field2123[var2] = class338.method2141(this.field2123[var2], 32768);
            }
        }
        field2126++;
        if (arg0 > -46) {
            this.method957((char) 65430, -56);
        }
        if (this.field2129 != null) {
            for (int var3 = 0; var3 < this.field2129.length; var3++) {
                this.field2129[var3] = class338.method2141(this.field2129[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(B)V", line = 257)
    public static void method956(byte arg0) {
        if (arg0 == 17) {
            field2133 = null;
            field2124 = null;
            field2130 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(CI)I", line = 272)
    public final int method957(char arg0, int arg1) {
        field2132++;
        if (this.field2123 == null) {
            return -1;
        }
        int var3 = -61 / ((arg1 + 13) / 50);
        for (int var4 = 0; var4 < this.field2123.length; var4++) {
            if (this.field2121[var4] == arg0) {
                return this.field2123[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IC)I", line = 297)
    public final int method958(int arg0, char arg1) {
        field2128++;
        if (this.field2129 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2129.length; var3++) {
            if (this.field2131[var3] == arg1) {
                return this.field2129[var3];
            }
        }
        if (arg0 != -1) {
            this.field2129 = null;
        }
        return -1;
    }
}
