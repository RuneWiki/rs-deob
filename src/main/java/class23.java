import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 extends class124 {

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
    private int field559 = 0;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Lpe;")
    public static class109 field538 = class141.method1120("Ausw-=hlen", 0);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field540 = -1;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "Lpe;")
    private static class109 field539 = class141.method1120("You are standing in a members)2only area)3", 0);

    @OriginalMember(owner = "client!da", name = "U", descriptor = "Lpe;")
    public static class109 field547 = class141.method1120("Der Anmelde)2Server ist offline)3", 0);

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field541 = 0;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "[[I")
    public static int[][] field558 = new int[104][104];

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "Lpe;")
    public static class109 field554 = class141.method1120(":assist:", 0);

    @OriginalMember(owner = "client!da", name = "T", descriptor = "Lpe;")
    public static class109 field546 = field539;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "Lpe;")
    public static class109 field560 = class141.method1120("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", 0);

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "[S")
    public static short[] field543 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "Lpe;")
    public static class109 field561 = class141.method1120(" zuerst von Ihrer Freunde)2Liste(Q", 0);

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "I")
    public static int field562 = 0;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lpe;ZB)V")
    public static final void method216(class109 arg0, boolean arg1, byte arg2) {
        field550++;
        byte var3 = 4;
        int var4 = class151.field3319.method541(arg0, 250);
        int var5 = var3 + 6;
        int var6 = class151.field3319.method555(arg0, 250) * 13;
        int var7 = var3 + 6;
        class140.method1118(var5 - var3, var7 - var3, var3 + var3 + var4, var3 + var6 - -var3, 0);
        class140.method1115(var5 - var3, var7 - var3, var3 + var4 + var3, var6 - -var3 + var3, 16777215);
        if (arg2 != -35) {
            method216(null, false, (byte) -12);
        }
        class151.field3319.method564(arg0, var5, var7, var4, var6, 16777215, -1, 1, 1, 0);
        class8.method76(var3 + var6 + var3, var4 - -var3 + var3, (byte) 105, var5 - var3, var7 - var3);
        if (!arg1) {
            class138.method1091(var7, var5, var4, var6, arg2 ^ 0x76);
            return;
        }
        try {
            Graphics var8 = class137.field2980.getGraphics();
            class75.field1510.method73(var8, 67, 0, 0);
        } catch (Exception var9) {
            class137.field2980.repaint();
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(B)V")
    public final void method217(byte arg0) {
        this.method220((byte) -90, this.field559);
        if (arg0 < 20) {
            method221(-128, -24);
        }
        field548++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILbe;)V")
    public final void method218(byte arg0, int arg1, class13 arg2) {
        while (true) {
            int var4 = arg2.method142(27467);
            if (var4 == 0) {
                field545++;
                if (arg0 != 102) {
                    method223(-65, (byte) 92);
                    return;
                }
                return;
            }
            this.method224((byte) -33, arg1, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
    public static final void method219(byte arg0) {
        field557++;
        class120.field2652.method92((byte) 104);
        class139.field3016.method92((byte) 118);
        if (arg0 < 100) {
            method216(null, false, (byte) 47);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
    private final void method220(byte arg0, int arg1) {
        field555++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (var9 < var3) {
            var7 = var9;
        }
        if (var7 > var5) {
            var7 = var5;
        }
        double var11 = var3;
        double var13 = 0.0D;
        if (arg0 != -90) {
            field539 = null;
        }
        if (var9 > var3) {
            var11 = var9;
        }
        if (var11 < var5) {
            var11 = var5;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var7) / (var7 + var11);
            }
            if (var3 == var11) {
                var15 = (var9 - var5) / (-var7 + var11);
            } else if (var9 == var11) {
                var15 = (var5 - var3) / (-var7 + var11) + 2.0D;
            } else if (var5 == var11) {
                var15 = (var3 - var9) / (var11 - var7) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        this.field556 = (int) (var17 * 256.0D);
        if (this.field556 < 0) {
            this.field556 = 0;
        } else if (this.field556 > 255) {
            this.field556 = 255;
        }
        if (var17 > 0.5D) {
            this.field542 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field542 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field542 < 1) {
            this.field542 = 1;
        }
        double var19 = var15 / 6.0D;
        this.field549 = (int) ((double) this.field542 * var19);
        this.field553 = (int) (var13 * 256.0D);
        if (this.field553 < 0) {
            this.field553 = 0;
        } else if (this.field553 > 255) {
            this.field553 = 255;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)Z")
    public static final boolean method221(int arg0, int arg1) {
        field552++;
        if (arg1 < 0) {
            return false;
        } else if (arg0 == 2000) {
            int var2 = class149.field3285[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1003;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(B)V")
    public static void method222(byte arg0) {
        field539 = null;
        field543 = null;
        if (arg0 <= 73) {
            field561 = null;
        }
        field546 = null;
        field554 = null;
        field558 = null;
        field547 = null;
        field538 = null;
        field560 = null;
        field561 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)Lpe;")
    public static final class109 method223(int arg0, byte arg1) {
        field544++;
        class109 var2 = class143.method1132(arg0, 107);
        for (int var3 = var2.method898((byte) 125) - 3; var3 > 0; var3 -= 3) {
            var2 = class44.method405(new class109[] { var2.method872(var3, -20, 0), class78.field1638, var2.method897(false, var3) }, (byte) -74);
        }
        if (var2.method898((byte) 126) > 9) {
            return class44.method405(new class109[] { class9.field228, var2.method872(var2.method898((byte) 126) - 8, -124, 0), class114.field2521, class42.field895, var2, class123.field2725 }, (byte) -74);
        } else if (arg1 == 48) {
            return var2.method898((byte) 127) > 6 ? class44.method405(new class109[] { class133.field2893, var2.method872(var2.method898((byte) 124) - 4, 23, 0), class137.field2993, class42.field895, var2, class123.field2725 }, (byte) -74) : class44.method405(new class109[] { class101.field2132, var2, class93.field1999 }, (byte) -74);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIILbe;)V")
    private final void method224(byte arg0, int arg1, int arg2, class13 arg3) {
        field551++;
        if (arg2 == 1) {
            this.field559 = arg3.method149(true);
        }
        if (arg0 >= -2) {
            field547 = null;
        }
    }
}
