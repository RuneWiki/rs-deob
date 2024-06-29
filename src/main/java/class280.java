import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class280 extends class152 {

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "Z")
    private boolean field4651 = true;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
    private int field4652 = 4096;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "Lbb;")
    public static class134 field4649 = new class134(new byte[5000]);

    @OriginalMember(owner = "client!bl", name = "db", descriptor = "[I")
    public static int[] field4658 = new int[50];

    @OriginalMember(owner = "client!bl", name = "bb", descriptor = "Lml;")
    public static class160 field4656 = new class160(200);

    @OriginalMember(owner = "client!bl", name = "fb", descriptor = "Z")
    public static boolean field4660 = true;

    @OriginalMember(owner = "client!bl", name = "gb", descriptor = "Lce;")
    public static class126 field4661 = class206.method1445(-7923, "<img=1>");

    @OriginalMember(owner = "client!bl", name = "ib", descriptor = "Lce;")
    public static class126 field4663 = class206.method1445(-7923, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!bl", name = "hb", descriptor = "I")
    public static int field4662 = 0;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!bl", name = "ab", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!bl", name = "cb", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!bl", name = "eb", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!bl", name = "Z", descriptor = "Lcc;")
    public static class313 field4654;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "[Lie;")
    public static class2[] field4647;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(II)V", line = 4)
    public static final void method1872(int arg0, int arg1) {
        field4646++;
        if (field4662 == arg1) {
            return;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg0 > -59) {
            return;
        }
        if (field4662 == 0) {
            class231.method1570(1);
        }
        if (arg1 == 40) {
            class8.method46(true);
        }
        if (arg1 != 40 && class143.field2605 != null) {
            class143.field2605.method1941((byte) -67);
            class143.field2605 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class249.field4176 = 1;
            class267.field4529 = 0;
            class41.field660 = 0;
            class244.field4130 = 0;
            class15.field209 = 1;
            class322.method2236(true, 0);
        }
        if (arg1 == 25 || arg1 == 10) {
            class159.method1167((byte) -16);
        }
        if (arg1 == 5) {
            class294.method1958(83, class127.field2170);
        } else {
            class257.method1742(0);
        }
        boolean var3 = field4662 == 5 || field4662 == 10 || field4662 == 28;
        if (var2 != var3) {
            if (var2) {
                class200.field3412 = class238.field4014;
                if (class159.field2866 == 0) {
                    class212.method1477((byte) -111, 2);
                } else {
                    class39.method243(class238.field4014, 2, class4.field28, 0, false, 255, -108);
                }
                class200.field3405.method456(-50, false);
            } else {
                class212.method1477((byte) -111, 2);
                class200.field3405.method456(-53, true);
            }
        }
        if (class56.field846 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class56.method358();
        }
        field4662 = arg1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lo;Lo;I)V", line = 84)
    public static final void method1873(class15 arg0, class15 arg1, int arg2) {
        field4653++;
        if (arg0.field203 != null) {
            arg0.method85(101);
        }
        if (arg2 != -1897617972) {
            method1876((byte) -121);
        }
        arg0.field203 = arg1;
        arg0.field205 = arg1.field205;
        arg0.field203.field205 = arg0;
        arg0.field205.field203 = arg0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILbb;)V", line = 105)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            this.field4651 = true;
        }
        field4648++;
        if (arg1 == 0) {
            this.field4652 = arg2.method942(true);
        } else if (arg1 == 1) {
            this.field4651 = arg2.method948(-128) == 1;
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(II)[[I", line = 142)
    public final int[][] method26(int arg0, int arg1) {
        field4650++;
        int[][] var3 = this.field2775.method319(122, arg1);
        if (this.field2775.field775) {
            int[] var4 = this.method1132(class314.field5378 & arg1 - 1, -72, 0);
            int[] var5 = this.method1132(arg1, -110, 0);
            int[] var6 = this.method1132(arg1 + 1 & class314.field5378, 79, 0);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class244.field4133; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field4652;
                int var12 = (var5[class321.field5490 & var10 + 1] - var5[var10 - 1 & class321.field5490]) * this.field4652;
                int var13 = var12 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var11 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var14 - (-var16 - 4096)) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var12 / var17;
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                }
                if (this.field4651) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var10] = var20;
                var7[var10] = var18;
                var9[var10] = var19;
            }
        }
        if (arg0 != 0) {
            method1875(-62);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V", line = 221)
    public class280() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIZ)Lce;", line = 231)
    public static final class126 method1874(byte arg0, int arg1, boolean arg2) {
        field4659++;
        if (arg0 != 43) {
            method1872(99, -109);
        }
        return class27.method127(arg2, (byte) -126, 10, arg1);
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V", line = 242)
    public static void method1875(int arg0) {
        field4649 = null;
        field4654 = null;
        field4661 = null;
        field4656 = null;
        field4658 = null;
        if (arg0 < -40) {
            field4647 = null;
            field4663 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(B)V", line = 263)
    public static final void method1876(byte arg0) {
        field4657++;
        int var1 = -51 % ((-arg0 - 68) / 55);
        field4656.method1185(1);
        class168.field2997.method1185(1);
        class278.field4632.method1185(1);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(BII)I", line = 276)
    public static final int method1877(byte arg0, int arg1, int arg2) {
        if (arg0 != 77) {
            field4660 = true;
        }
        class192 var3 = (class192) class95.field1496.method1631(false, (long) arg2);
        field4655++;
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && var3.field3281.length > arg1) {
            return var3.field3281[arg1];
        } else {
            return -1;
        }
    }
}
