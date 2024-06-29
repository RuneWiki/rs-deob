import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class299 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public int field4593 = -1;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public int field4595 = -1;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Z")
    public boolean field4598 = true;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public int field4601 = 1190717;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public int field4597 = 128;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public int field4606 = 16;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public int field4608 = 8;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "Z")
    public boolean field4613 = true;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public int field4611 = 0;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Z")
    public boolean field4603 = false;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Lec;")
    public static class99 field4604 = new class99(4);

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "Ljd;")
    public static class95 field4596;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "[[B")
    public static byte[][] field4605;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V", line = 11)
    public static final void method2057(int arg0, int arg1) {
        class298.field4586.method741(arg0, (byte) -100);
        if (arg1 >= -120) {
            method2057(120, -110);
        }
        field4602++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lwm;ZI)V", line = 38)
    public final void method2058(class254 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method2058((class254) null, false, -77);
        }
        while (true) {
            int var4 = arg0.method1774((byte) 84);
            if (var4 == 0) {
                field4614++;
                return;
            }
            this.method2062(9, arg2, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 63)
    public static void method2059(int arg0) {
        int var1 = 67 / ((arg0 + 60) / 44);
        field4604 = null;
        field4605 = (byte[][]) null;
        field4596 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BIIII)V", line = 83)
    public static final void method2060(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -108) {
            field4604 = (class99) null;
        }
        for (int var5 = 0; var5 < class184.field2913; var5++) {
            if ((class41.field602[var5] + class174.field2803[var5]) > arg1 && class41.field602[var5] < (arg1 + arg3) && arg2 < (class97.field1400[var5] + class120.field1850[var5]) && class120.field1850[var5] < arg2 + arg4) {
                class331.field5117[var5] = true;
            }
        }
        field4599++;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 107)
    public static final void method2061(int arg0) {
        if (arg0 != 0) {
            field4610 = -118;
        }
        field4609++;
        if (class219.field3350 > 0) {
            class37.method284(0);
        } else {
            class270.field4219 = class1.field20;
            class1.field20 = null;
            class101.method758(124, 40);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILwm;)V", line = 144)
    private final void method2062(int arg0, int arg1, int arg2, class254 arg3) {
        field4600++;
        if (arg0 != 9) {
            this.field4606 = 116;
        }
        if (arg2 == 1) {
            this.field4611 = class292.method2013(arg3.method1758((byte) 69), 65535);
        } else if (arg2 == 2) {
            this.field4593 = arg3.method1774((byte) -118);
        } else if (arg2 == 3) {
            this.field4593 = arg3.method1755(false);
            if (this.field4593 == 65535) {
                this.field4593 = -1;
            }
        } else if (arg2 == 5) {
            this.field4613 = false;
        } else if (arg2 == 7) {
            this.field4595 = class292.method2013(arg3.method1758((byte) 117), arg0 ^ 0xFFF6);
        } else if (arg2 == 8) {
            class303.field4645 = arg1;
        } else if (arg2 == 9) {
            this.field4597 = arg3.method1755(false);
        } else if (arg2 == 10) {
            this.field4598 = false;
        } else if (arg2 == 11) {
            this.field4608 = arg3.method1774((byte) -104);
        } else if (arg2 == 12) {
            this.field4603 = true;
        } else if (arg2 == 13) {
            this.field4601 = arg3.method1758((byte) 58);
        } else if (arg2 == 14) {
            this.field4606 = arg3.method1774((byte) 13);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I", line = 216)
    public static final int method2063(String arg0, int arg1, String arg2, int arg3) {
        field4594++;
        int var4 = arg2.length();
        int var5 = arg0.length();
        char var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char var9 = 0;
        while (var7 - var6 < var4 || var8 - var9 < var5) {
            if (var4 <= (var7 - var6)) {
                return -1;
            }
            if (var5 <= var8 - var9) {
                return 1;
            }
            char var22;
            if (var6 == '\u0000') {
                var22 = arg2.charAt(var7++);
            } else {
                var22 = var6;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var8++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var6 = class298.method2055(-14300, var22);
            var9 = class298.method2055(arg1 ^ 0x37DB, var24);
            char var26 = class71.method506(arg3, var22, 192);
            char var27 = class71.method506(arg3, var24, 192);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class192.method1410(arg3, false, var28) - class192.method1410(arg3, false, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg3 == 2) {
                var12 = var5 - var11 - 1;
                var13 = var4 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg2.charAt(var13);
            char var15 = arg0.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class192.method1410(arg3, false, var16) - class192.method1410(arg3, false, var17);
                }
            }
        }
        int var18 = var4 - var5;
        if (~var18 != arg1) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg2.charAt(var19);
            char var21 = arg0.charAt(var19);
            if (var20 != var21) {
                return class192.method1410(arg3, false, var20) - class192.method1410(arg3, false, var21);
            }
        }
        return 0;
    }
}
