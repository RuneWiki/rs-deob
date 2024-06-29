import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class272 extends class134 {

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field4554 = 0;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field4552 = 100;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "Ljava/lang/String;")
    public static String field4551 = "Please remove ";

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "C")
    public static char field4542;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public int field4533;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public int field4538;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public int field4540;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public int field4541;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public int field4544;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public int field4550;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public int field4556;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public int field4558;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public int field4559;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    public int field4560;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    public int field4561;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "Lee;")
    public class116 field4547;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "Lti;")
    public class178 field4557;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Lhh;")
    public class200 field4532;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Lhg;")
    public static class207 field4543;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "Lva;")
    public static class239 field4546;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "Lmj;")
    public class59 field4539;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "[Lol;")
    public static class80[] field4534;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BZLjc;)V")
    public static final void method1917(byte arg0, boolean arg1, class278 arg2) {
        int var3 = arg2.field4622;
        if (arg0 != 74) {
            field4543 = null;
        }
        int var4 = (int) arg2.field2213;
        arg2.method993(32);
        if (arg1) {
            class220.method1565(var3, true);
        }
        field4545++;
        class295.method2037((byte) 84, var3);
        class207 var5 = class222.method1574(arg0 + 43, var4);
        if (var5 != null) {
            class206.method1441(0, var5);
        }
        int var6 = class287.field4747;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class290.method2012(class195.field3154[var7], (byte) 127)) {
                class215.method1529(var7, 1);
            }
        }
        if (class287.field4747 == 1) {
            class259.field4360 = false;
            class244.method1748(class263.field4398, (byte) -93, class275.field4604, class58.field1020, class213.field3596);
        } else {
            class244.method1748(class263.field4398, (byte) -93, class275.field4604, class58.field1020, class213.field3596);
            int var8 = class183.field2930.method1229(class90.field1497);
            for (int var9 = 0; var9 < class287.field4747; var9++) {
                int var10 = class183.field2930.method1229(class123.method933(var9, true));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class275.field4604 = var8 + 8;
            class263.field4398 = class287.field4747 * 15 + (class67.field1133 ? 26 : 22);
        }
        if (class243.field4082 != -1) {
            class179.method1305((byte) 69, class243.field4082, 1);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public final void method1918(byte arg0) {
        field4555++;
        this.field4539 = null;
        int var2 = 53 % ((-arg0 - 88) / 38);
        this.field4532 = null;
        this.field4557 = null;
        this.field4547 = null;
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
    public static void method1919(int arg0) {
        field4546 = null;
        if (arg0 != -29326) {
            field4531 = 87;
        }
        field4534 = null;
        field4543 = null;
        field4551 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIILhg;I)V")
    public static final void method1920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class207 arg6, int arg7) {
        if (arg2 != -15545) {
            field4534 = null;
        }
        int var8 = arg5 * arg5 + arg7 * arg7;
        field4535++;
        if (arg0 < var8) {
            return;
        }
        int var9 = Math.min(arg6.field3484 / 2, arg6.field3481 / 2);
        if ((var9 * var9) >= var8) {
            class29.method186(arg4, -123, arg5, arg6, class152.field2539[arg1], arg7, arg3);
            return;
        }
        int var10;
        if (class169.field2739 == 4) {
            var10 = (int) class265.field4432 & 0x7FF;
        } else {
            var10 = (int) class265.field4432 + class314.field5060 & 0x7FF;
        }
        var9 -= 10;
        int var11 = class128.field2133[var10];
        int var12 = class128.field2130[var10];
        if (class169.field2739 != 4) {
            var11 = var11 * 256 / (class286.field4738 + 256);
            var12 = var12 * 256 / (class286.field4738 + 256);
        }
        int var13 = arg7 * var12 - (arg5 * var11) >> 16;
        int var14 = arg5 * var12 + arg7 * var11 >> 16;
        double var15 = Math.atan2((double) var14, (double) var13);
        int var17 = (int) (Math.sin(var15) * (double) var9);
        int var18 = (int) ((double) var9 * Math.cos(var15));
        ((class92) class226.field3839[arg1]).method649(arg6.field3484 / 2 + arg4 + var17 - 10, arg6.field3481 / 2 + (arg3 - (var18 - -10)), 20, 20, 15, 15, var15, 256);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lqj;Laj;ZILaj;)V")
    public static final void method1921(class164 arg0, class151 arg1, boolean arg2, int arg3, class151 arg4) {
        field4527++;
        class81.field1351 = arg2;
        if (arg3 > -46) {
            method1922(-4);
        }
        class20.field361 = arg1;
        class86.field1428 = arg4;
        int var5 = class20.field361.method1155((byte) -123) - 1;
        class241.field4062 = var5 * 256 + class20.field361.method1132(16777215, var5);
        class271.field4514 = new String[] { null, null, class286.field4734, null, null };
        class179.field2865 = arg0;
        class217.field3661 = new String[] { null, null, null, null, class279.field4645 };
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V")
    public static final void method1922(int arg0) {
        class263.field4388.method94(34);
        field4528++;
        class123.field2056.method94(34);
        class261.field4377.method94(34);
        if (arg0 != 141) {
            method1921((class164) null, (class151) null, false, 72, (class151) null);
        }
    }
}
