import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class307 extends class305 implements class218 {

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "Lug;")
    public class305 field4584;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field4567 = -1;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field4572 = -1;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "Lo;")
    public static class332 field4588;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "Lsh;")
    public static class472 field4589;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    public static int field4587;

    static {
        new class332("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field4588 = new class332("K", "T", "K", "K");
        field4589 = new class472(29, 12);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)Z", line = 5)
    public final boolean method254(boolean arg0) {
        field4566++;
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ltq;I)V", line = 22)
    public final void method258(class63 arg0, int arg1) {
        field4568++;
        if (arg1 != -22360) {
            field4577 = 29;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Z", line = 33)
    public final boolean method253(int arg0) {
        field4582++;
        return arg0 >= -9;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)I", line = 45)
    public final int method257(boolean arg0) {
        field4576++;
        return arg0 ? -58 : 0;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Ltq;I)Lcj;", line = 57)
    public final class123 method252(class63 arg0, int arg1) {
        if (arg1 != 2) {
            this.field4584 = null;
        }
        field4578++;
        return null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V", line = 68)
    public final void method247(boolean arg0) {
        field4579++;
        if (arg0) {
            field4567 = 54;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIIIIIIILug;)V", line = 78)
    public class307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class305 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class332.method2037(arg0, arg1, (byte) 114));
        this.field4584 = arg10;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLtq;)V", line = 87)
    public final void method256(byte arg0, class63 arg1) {
        field4569++;
        if (arg0 != 82) {
            this.method252((class63) null, -109);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 97)
    public static final int method1910(String arg0, int arg1) {
        if (arg1 != -1) {
            return -100;
        }
        field4575++;
        for (int var2 = 0; var2 < class408.field5923.length; var2++) {
            if (class408.field5923[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)I", line = 120)
    public final int method899(int arg0) {
        field4583++;
        if (arg0 != 0) {
            field4567 = 45;
        }
        return 0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)I", line = 137)
    public final int method250(byte arg0) {
        int var2 = -90 % ((arg0 + 49) / 60);
        field4570++;
        return 0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ltq;III)Z", line = 147)
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        field4580++;
        int var5 = 25 % ((-arg2 - 59) / 58);
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lgu;Ltq;Llk;B)V", line = 158)
    public static final void method1911(class94 arg0, class63 arg1, class290 arg2, byte arg3) {
        field4587++;
        class319 var4 = arg0.method721(0, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method798();
        if (var5 < var4.method796()) {
            var5 = var4.method796();
        }
        byte var6 = 10;
        int var7 = arg2.field4402;
        if (arg3 != -61) {
            field4577 = 48;
        }
        int var8 = arg2.field4400;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field1333 != null) {
            var9 = class29.field401.method4(arg0.field1333, 1, (class319[]) null, class247.field3590, (int[]) null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class247.field3590[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class5.field88.method1551(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class5.field88.method1549() * var9 + (class5.field88.method1548() / 2);
        }
        int var15 = arg2.field4402 + (var5 / 2);
        if (var7 < class189.field2910 + var5) {
            var15 = var5 / 2 + var10 / 2 + var6 + class189.field2910 + 5;
            var7 = class189.field2910;
        } else if ((class189.field2915 - var5) < var7) {
            var15 = class189.field2915 - (var10 / 2) - (var5 / 2 - -var6 + 5);
            var7 = class189.field2915 - var5;
        }
        int var16 = arg2.field4400;
        if ((class189.field2909 + var5) > var8) {
            var8 = class189.field2909;
            var16 = class189.field2909 + var6 + (var5 / 2);
        } else if (var8 > (class189.field2904 - var5)) {
            var16 = class189.field2904 - var5 / 2 - var6 - var11;
            var8 = class189.field2904 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg2.field4402), (double) (var8 - arg2.field4400)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method1961((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field1333 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var21 = class5.field88.method1549() * var9 + var16 + 3;
            var20 = var18 + var10 + 10;
            if (arg0.field1305 != 0) {
                arg1.method530(var21 - var16, arg0.field1305, var16, (byte) 108, var18, var20 - var18);
            }
            if (arg0.field1302 != 0) {
                arg1.method584((byte) 125, var20 - var18, -var16 + var21, var18, arg0.field1302, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class247.field3590[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class5.field88.method1553(arg1, var23, var15, var16, arg0.field1335, true);
                var16 += class5.field88.method1549();
            }
        }
        if (arg0.field1293 == -1 && arg0.field1333 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class154 var25 = new class154(arg2);
        var25.field2143 = var18;
        var25.field2146 = var7 - var24;
        var25.field2150 = var8 - var24;
        var25.field2147 = var7 + var24;
        var25.field2152 = var21;
        var25.field2149 = var8 + var24;
        var25.field2145 = var19;
        var25.field2148 = var20;
        class314.field4720.method2453((byte) -116, var25);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILtq;)V", line = 307)
    public final void method260(int arg0, class63 arg1) {
        if (arg0 != 0) {
            method1911((class94) null, (class63) null, (class290) null, (byte) -33);
        }
        field4585++;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V", line = 317)
    public static void method1912(byte arg0) {
        if (arg0 != -44) {
            field4588 = null;
        }
        field4589 = null;
        field4588 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BILtq;)Lns;", line = 339)
    public final class57 method255(byte arg0, int arg1, class63 arg2) {
        if (arg0 < 108) {
            field4588 = null;
        }
        field4571++;
        return null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)I", line = 350)
    public final int method244(byte arg0) {
        if (arg0 >= -8) {
            method1910((String) null, 78);
        }
        field4574++;
        return 0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BZLtq;Lhm;III)V", line = 362)
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        if (arg0 >= -41) {
            this.method254(true);
        }
        field4586++;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 372)
    public final void method249(int arg0) {
        if (arg0 < 56) {
            method1910((String) null, -118);
        }
        field4573++;
    }
}
