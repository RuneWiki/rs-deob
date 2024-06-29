import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class680 {

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "Lob;")
    public class4 field9462 = new class4();

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "[I")
    public static int[] field9460 = new int[4];

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "Lgp;")
    public static class553 field9454 = new class553("game3", 2);

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public static int field9453;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public static int field9458;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public static int field9461;

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "Lob;")
    private class4 field9463;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "[[S")
    public static short[][] field9452;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILob;)V", line = 6)
    public final void method3827(int arg0, class4 arg1) {
        field9451++;
        if (arg1.field35 != null) {
            arg1.method21(98);
        }
        arg1.field33 = this.field9462;
        arg1.field35 = this.field9462.field35;
        arg1.field35.field33 = arg1;
        int var3 = 126 % ((arg0 - 18) / 35);
        arg1.field33.field35 = arg1;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)Lob;", line = 26)
    public final class4 method3828(int arg0) {
        field9456++;
        if (arg0 < 86) {
            return null;
        }
        class4 var2 = this.field9462.field33;
        if (this.field9462 == var2) {
            this.field9463 = null;
            return null;
        } else {
            this.field9463 = var2.field33;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Lob;", line = 47)
    public final class4 method3829(int arg0) {
        field9455++;
        if (arg0 != -29202) {
            return null;
        }
        class4 var2 = this.field9463;
        if (this.field9462 == var2) {
            this.field9463 = null;
            return null;
        } else {
            this.field9463 = var2.field33;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(CI)I", line = 68)
    public static final int method3830(char arg0, int arg1) {
        field9459++;
        if (arg0 >= '\u0000' && class509.field7058.length > arg0) {
            return class509.field7058[arg0];
        } else {
            if (arg1 > -81) {
                field9454 = null;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)I", line = 88)
    public final int method3831(int arg0) {
        field9453++;
        if (arg0 != -29578) {
            this.method3828(-108);
        }
        int var2 = 0;
        class4 var3 = this.field9462.field33;
        while (this.field9462 != var3) {
            var3 = var3.field33;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)V", line = 111)
    public static void method3832(int arg0) {
        if (arg0 <= 58) {
            method3836(true, false);
        }
        field9460 = null;
        field9454 = null;
        field9452 = null;
    }

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "(I)V", line = 123)
    public final void method3833(int arg0) {
        field9461++;
        if (arg0 != 20975) {
            return;
        }
        while (true) {
            class4 var2 = this.field9462.field33;
            if (this.field9462 == var2) {
                this.field9463 = null;
                return;
            }
            var2.method21(arg0 ^ 0x5195);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)Lob;", line = 146)
    public final class4 method3834(byte arg0) {
        if (arg0 <= 75) {
            field9452 = null;
        }
        field9450++;
        class4 var2 = this.field9462.field33;
        if (this.field9462 == var2) {
            return null;
        } else {
            var2.method21(116);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V", line = 165)
    public static final void method3835(byte arg0) {
        field9458++;
        if (class178.field2452 != null) {
            return;
        }
        int var1 = class555.field7740;
        if (arg0 != -73) {
            field9454 = null;
        }
        int var2 = class320.field4452;
        int var3 = class374.field5260 - class118.field1561 - var1;
        int var4 = class648.field8690 - var2 - class553.field7716;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class553.field7717 != null) {
                var5 = class553.field7717;
            } else if (class320.field4445 == null) {
                var5 = class109.field1462;
            } else {
                var5 = class320.field4445;
            }
            int var6 = 0;
            int var7 = 0;
            if (class553.field7717 == var5) {
                Insets var8 = class553.field7717.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class648.field8690);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class374.field5260, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class374.field5260 - var3, var7, var3, class648.field8690);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class648.field8690 - var4, class374.field5260, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZZ)V", line = 239)
    public static final void method3836(boolean arg0, boolean arg1) {
        field9457++;
        for (class457 var2 = (class457) class303.field4285.method3618(-41); var2 != null; var2 = (class457) class303.field4285.method3619(0)) {
            if (var2.field6340 != null) {
                class483.field6739.method361(var2.field6340);
                var2.field6340 = null;
            }
            if (var2.field6350 != null) {
                class483.field6739.method361(var2.field6350);
                var2.field6350 = null;
            }
            var2.method549(6410);
        }
        if (arg1) {
            field9454 = null;
        }
        if (!arg0) {
            return;
        }
        for (class457 var3 = (class457) class649.field8701.method3618(-121); var3 != null; var3 = (class457) class649.field8701.method3619(0)) {
            if (var3.field6340 != null) {
                class483.field6739.method361(var3.field6340);
                var3.field6340 = null;
            }
            var3.method549(6410);
        }
        for (class457 var4 = (class457) class516.field7206.method821((byte) 122); var4 != null; var4 = (class457) class516.field7206.method818(73)) {
            if (var4.field6340 != null) {
                class483.field6739.method361(var4.field6340);
                var4.field6340 = null;
            }
            var4.method549(6410);
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V", line = 317)
    public class680() {
        this.field9462.field35 = this.field9462;
        this.field9462.field33 = this.field9462;
    }
}
