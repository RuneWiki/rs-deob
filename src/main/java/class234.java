import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class234 {

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    private int field4224 = -1;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    private int field4238 = 0;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field4223 = 10;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljd;")
    public static class86 field4222 = class122.method868("l", true);

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljd;")
    public static class86 field4221 = class122.method868("Sprites geladen)3", true);

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "[I")
    public static int[] field4239 = new int[2];

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field4228 = 1;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static volatile int field4234 = 0;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "[I")
    public static int[] field4231 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public int field4226;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public int field4227;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public int field4240;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Ljd;")
    public static class86 field4235;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
    private final void method1618(int arg0, int arg1) {
        field4236++;
        double var3 = (double) (arg1 & arg0 >> 8) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF0025) >> 16) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var5;
        if (var3 < var5) {
            var9 = var3;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = 0.0D;
        double var13 = var5;
        if (var5 < var3) {
            var13 = var3;
        }
        if (var13 < var7) {
            var13 = var7;
        }
        double var15 = (var9 + var13) / 2.0D;
        double var17 = 0.0D;
        this.field4226 = (int) (var15 * 256.0D);
        if (this.field4226 < 0) {
            this.field4226 = 0;
        } else if (this.field4226 > 255) {
            this.field4226 = 255;
        }
        if (var9 != var13) {
            if (var5 == var13) {
                var11 = (var3 - var7) / (var13 - var9);
            } else if (var3 == var13) {
                var11 = (var7 - var5) / (var13 - var9) + 2.0D;
            } else if (var7 == var13) {
                var11 = (var5 - var3) / (var13 - var9) + 4.0D;
            }
            if (var15 < 0.5D) {
                var17 = (var13 - var9) / (var9 + var13);
            }
            if (var15 >= 0.5D) {
                var17 = (var13 - var9) / (2.0D - var13 - var9);
            }
        }
        this.field4227 = (int) (var17 * 256.0D);
        double var19 = var11 / 6.0D;
        if (this.field4227 < 0) {
            this.field4227 = 0;
        } else if (this.field4227 > 255) {
            this.field4227 = 255;
        }
        if ((var15 > 0.5D)) {
            this.field4240 = (int) ((1.0D - var15) * var17 * 512.0D);
        } else {
            this.field4240 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4240 < 1) {
            this.field4240 = 1;
        }
        this.field4225 = (int) ((double) this.field4240 * var19);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZILqk;I)V")
    private final void method1619(boolean arg0, int arg1, class200 arg2, int arg3) {
        if (arg3 == 1) {
            this.field4238 = arg2.method1405(-3);
            this.method1618(this.field4238, 255);
        } else if (arg3 == 2) {
            this.field4224 = arg2.method1410(-77);
            if (this.field4224 == 65535) {
                this.field4224 = -1;
            }
        } else if (arg3 == 3) {
            arg2.method1410(-105);
        }
        if (!arg0) {
            this.field4224 = -86;
        }
        field4233++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Z")
    public static final boolean method1620(int arg0, int arg1) {
        if (arg0 == 255) {
            field4230++;
            return (arg1 & 0x75601DEA) >> 30 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
    public static final void method1621(int arg0, int arg1, int arg2) {
        field4237++;
        class257 var3 = class238.field4284[class180.field3244][arg0][arg1];
        if (var3 == null) {
            class258.method1743(class180.field3244, arg0, arg1);
            return;
        }
        class126 var4 = null;
        class126 var5 = (class126) var3.method1737((byte) 74);
        int var6 = -99999999;
        while (var5 != null) {
            class69 var13 = class272.method1853(0, var5.field2433.field2660);
            int var14 = var13.field1358;
            if (var13.field1390 == 1) {
                var14 = (var5.field2433.field2657 + 1) * var14;
            }
            if (var6 < var14) {
                var6 = var14;
                var4 = var5;
            }
            var5 = (class126) var3.method1740(-8843);
        }
        if (var4 == null) {
            class258.method1743(class180.field3244, arg0, arg1);
            return;
        }
        class140 var7 = null;
        var3.method1738(var4, (byte) -95);
        class126 var8 = (class126) var3.method1737((byte) 74);
        class140 var9 = null;
        while (var8 != null) {
            class140 var12 = var8.field2433;
            if (var4.field2433.field2660 != var12.field2660) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field2660 != var12.field2660 && var9 == null) {
                    var9 = var12;
                }
            }
            var8 = (class126) var3.method1740(-8843);
        }
        long var10 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class135.method968(class180.field3244, arg0, arg1, class30.method198(31482, arg0 * 128 + 64, arg1 * 128 + arg2, class180.field3244), var4.field2433, var10, var7, var9);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static void method1622(byte arg0) {
        field4222 = null;
        if (arg0 > -35) {
            field4235 = null;
        }
        field4239 = null;
        field4221 = null;
        field4231 = null;
        field4235 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
    public static final void method1623(boolean arg0, int arg1) {
        field4229++;
        if (!arg0) {
            class161 var2 = class204.method1456(true, 7, arg1);
            var2.method1173(!arg0);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lqk;IZ)V")
    public final void method1624(class200 arg0, int arg1, boolean arg2) {
        while (true) {
            int var4 = arg0.method1408((byte) -20);
            if (var4 == 0) {
                if (arg2) {
                    this.field4225 = 78;
                }
                field4232++;
                return;
            }
            this.method1619(true, arg1, arg0, var4);
        }
    }
}
