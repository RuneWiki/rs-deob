import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class186 extends class171 {

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public static int field3326 = 2;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "Lha;")
    private static class46 field3333 = class271.method1828("cyan:", -46);

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "Lha;")
    public static class46 field3335 = field3333;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "Lha;")
    public static class46 field3334 = field3333;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "[I")
    public static int[] field3336 = new int[100];

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "Lpi;")
    public static class181 field3318;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "[I")
    public int[] field3319;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "[I")
    private int[] field3321;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "[Lha;")
    private class46[] field3337;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "[[I")
    private int[][] field3324;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(BI)I")
    public final int method1343(byte arg0, int arg1) {
        field3328++;
        int var3 = -90 % ((-arg0 - 25) / 56);
        return this.field3321 == null || arg1 < 0 || this.field3321.length < arg1 ? -1 : this.field3321[arg1];
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1344(String arg0, boolean arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg1) {
            System.exit(1);
            field3313++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)I")
    public final int method1345(byte arg0, int arg1, int arg2) {
        field3316++;
        if (this.field3321 == null || arg1 < 0 || arg1 > this.field3321.length) {
            return -1;
        } else if (this.field3324[arg1] == null || arg2 < 0 || arg2 > this.field3324[arg1].length) {
            return -1;
        } else {
            if (arg0 < 25) {
                this.field3321 = null;
            }
            return this.field3324[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)I")
    public final int method1346(byte arg0) {
        if (arg0 != 105) {
            method1344((String) null, true);
        }
        field3331++;
        return this.field3321 == null ? 0 : this.field3321.length;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(B)V")
    public static void method1347(byte arg0) {
        if (arg0 >= -43) {
            field3326 = -43;
        }
        field3333 = null;
        field3318 = null;
        field3334 = null;
        field3336 = null;
        field3335 = null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I")
    public static final int method1348(int arg0, int arg1) {
        if (arg0 != 0) {
            method1344((String) null, false);
        }
        field3323++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZILwe;)V")
    private final void method1349(boolean arg0, int arg1, class75 arg2) {
        if (arg1 == 1) {
            this.field3337 = arg2.method577(0).method334((byte) 111, 60);
        } else if (arg1 == 2) {
            int var4 = arg2.method558(1);
            this.field3319 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3319[var5] = arg2.method545((byte) -60);
            }
        } else if (arg1 == 3) {
            int var6 = arg2.method558(1);
            this.field3324 = new int[var6][];
            this.field3321 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method545((byte) -79);
                this.field3321[var7] = var8;
                this.field3324[var7] = new int[class238.field4236[var8]];
                for (int var9 = 0; var9 < class238.field4236[var8]; var9++) {
                    this.field3324[var7][var9] = arg2.method545((byte) -65);
                }
            }
        }
        if (arg0) {
            this.method1349(true, 34, (class75) null);
        }
        field3315++;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)I")
    public static final int method1350(int arg0, int arg1) {
        if (arg0 != 1023) {
            method1347((byte) 59);
        }
        field3322++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method1351(byte arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        field3317++;
        if (arg0 != 5) {
            method1353(29);
        }
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
    public final void method1352(byte arg0) {
        if (arg0 != 83) {
            return;
        }
        if (this.field3319 != null) {
            for (int var2 = 0; var2 < this.field3319.length; var2++) {
                this.field3319[var2] = class235.method1595(this.field3319[var2], 32768);
            }
        }
        field3329++;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
    public static final void method1353(int arg0) {
        for (int var1 = 0; var1 < class51.field888; var1++) {
            int var2 = class33.field612[var1];
            class26 var3 = class2.field29[var2];
            if (var3 != null) {
                class156.method1155(-48, var3.field511.field1440, var3);
            }
        }
        field3327++;
        if (arg0 != 13897) {
            method1350(58, -15);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([ILwe;I)V")
    public final void method1354(int[] arg0, class75 arg1, int arg2) {
        field3325++;
        if (this.field3321 == null) {
            return;
        }
        for (int var4 = arg2; var4 < this.field3321.length; var4++) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = class218.field3856[this.method1343((byte) 72, var4)];
            if (var5 > 0) {
                arg1.method560(var5, -25865, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILwe;)V")
    public final void method1355(int arg0, class75 arg1) {
        while (true) {
            int var3 = arg1.method558(1);
            if (var3 == 0) {
                field3314++;
                if (arg0 >= -127) {
                    this.field3319 = null;
                    return;
                }
                return;
            }
            this.method1349(false, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)Lha;")
    public final class46 method1356(int arg0) {
        field3332++;
        if (arg0 != 3569) {
            return null;
        }
        class46 var2 = class181.method1305(25127, 80);
        if (this.field3337 == null) {
            return class264.field4584;
        }
        var2.method348(this.field3337[0], arg0 ^ 0xFFFFF268);
        for (int var3 = 1; var3 < this.field3337.length; var3++) {
            var2.method348(class250.field4421, -87);
            var2.method348(this.field3337[var3], -58);
        }
        return var2.method343(111);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLwe;)Lha;")
    public final class46 method1357(boolean arg0, class75 arg1) {
        field3320++;
        class46 var3 = class181.method1305(25127, 80);
        if (this.field3321 != null) {
            for (int var4 = 0; var4 < this.field3321.length; var4++) {
                var3.method348(this.field3337[var4], -20);
                var3.method348(class127.method983(arg1.method574(false, class196.field3509[this.field3321[var4]]), this.field3324[var4], 121, this.field3321[var4]), -28);
            }
        }
        if (!arg0) {
            this.field3337 = null;
        }
        var3.method348(this.field3337[this.field3337.length - 1], -97);
        return var3.method343(91);
    }
}
