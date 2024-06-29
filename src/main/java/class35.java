import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class35 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Z")
    public boolean field601 = false;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lnf;")
    public static class162 field606 = new class162(64);

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Lgg;")
    public static class201 field615;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Lef;")
    public static class227 field612;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lef;")
    public static class227 field613;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "[[Z")
    public static boolean[][] field617;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
    public static final void method330(int arg0, int arg1) {
        field603++;
        if (arg1 == -1 || !class48.method401(111, arg1)) {
            return;
        }
        if (arg0 >= -90) {
            field606 = null;
        }
        class222[] var2 = class8.field144[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class222 var4 = var2[var3];
            if (var4.field3505 != null) {
                class26 var5 = new class26();
                var5.field453 = var4;
                var5.field450 = var4.field3505;
                class184.method1318(false, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)[Lej;")
    public static final class51[] method331(int arg0) {
        field608++;
        class51[] var1 = new class51[class174.field2682];
        for (int var2 = 0; var2 < class174.field2682; var2++) {
            int var3 = class170.field2583[var2] * class104.field1621[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class301.field4847[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class102.field1585[class118.method863(255, var5[var6])];
            }
            var1[var2] = new class51(class214.field3278, class234.field3705, class196.field3069[var2], class125.field1877[var2], class104.field1621[var2], class170.field2583[var2], var4);
        }
        class30.method254(2);
        if (arg0 <= 40) {
            field612 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILha;I)V")
    public final void method332(int arg0, class31 arg1, int arg2) {
        if (arg2 != 9396) {
            return;
        }
        while (true) {
            int var4 = arg1.method265(-100);
            if (var4 == 0) {
                field605++;
                return;
            }
            this.method336(arg0, (byte) 122, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZZI)Llg;")
    public final class13 method333(boolean arg0, boolean arg1, int arg2) {
        field609++;
        class13 var4 = (class13) class46.field769.method1173((long) (arg2 << 16 | this.field611 | (arg1 ? 262144 : 0)), arg0);
        if (var4 != null) {
            return var4;
        }
        class260.field4121.method697(-5, this.field611);
        class13 var5 = class39.method349(0, -117, class260.field4121, this.field611);
        if (var5 != null) {
            var5.method105(class284.field4474, class155.field2317, class134.field2015);
            var5.field158 = var5.field157;
            var5.field151 = var5.field154;
            if (arg1) {
                var5.method101();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method108();
            }
            class46.field769.method1167((byte) -31, var5, (long) ((arg1 ? 262144 : 0) | arg2 << 16 | this.field611));
        }
        return var5;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static void method334(int arg0) {
        field606 = null;
        field613 = null;
        field615 = null;
        field612 = null;
        if (arg0 < 87) {
            field616 = 119;
        }
        field617 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBI)I")
    public static final int method335(int arg0, byte arg1, int arg2) {
        field604++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (arg1 != 15) {
                field613 = null;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBLha;I)V")
    private final void method336(int arg0, byte arg1, class31 arg2, int arg3) {
        if (arg3 == 1) {
            this.field611 = arg2.method260((byte) -67);
        } else if (arg3 == 2) {
            this.field607 = arg2.method304((byte) 84);
        } else if (arg3 == 3) {
            this.field601 = true;
        } else if (arg3 == 4) {
            this.field611 = -1;
        }
        field602++;
        if (arg1 != 122) {
            field615 = null;
        }
    }
}
