import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class36 extends class196 {

    @OriginalMember(owner = "client!df", name = "J", descriptor = "Z")
    public boolean field565 = false;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "[I")
    private int[] field573 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public int field567 = -1;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "[S")
    public static short[] field555 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!df", name = "F", descriptor = "[I")
    public static int[] field561 = new int[500];

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Lai;")
    public static class10 field557 = class44.method278("bevor Sie den Vorgang wiederholen)3", 105);

    @OriginalMember(owner = "client!df", name = "P", descriptor = "Lai;")
    public static class10 field571 = class44.method278("Fallen lassen", 99);

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field577 = 128;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "Lai;")
    public static class10 field566 = class44.method278("null", -115);

    @OriginalMember(owner = "client!df", name = "W", descriptor = "Lai;")
    private static class10 field578 = class44.method278("Examine", 99);

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "Lai;")
    public static class10 field580 = field578;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field570 = -1;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Lka;")
    public static class92 field560;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "[I")
    private int[] field563;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "[S")
    private short[] field556;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "[S")
    private short[] field558;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "[S")
    private short[] field568;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "[S")
    private short[] field569;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILme;)V")
    public final void method239(int arg0, class114 arg1) {
        field559++;
        if (arg0 != 24775) {
            method245((byte) -69);
        }
        while (true) {
            int var3 = arg1.method767(true);
            if (var3 == 0) {
                return;
            }
            this.method242(var3, arg1, 29976);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)V")
    public static final void method240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class62.method409(arg4, arg3, arg0 + arg4, arg2 + arg3);
        field579++;
        class113.method745();
        class119.field2292++;
        class192.method1218(true, false);
        class97.method641((byte) 97, true);
        class192.method1218(false, false);
        class97.method641((byte) 97, false);
        class179.method1155((byte) 111);
        class7.method21((byte) -99);
        if (!class128.field2435) {
            int var5 = field577;
            if (var5 < class82.field1428 / 256) {
                var5 = class82.field1428 / 256;
            }
            if (class130.field2474[4] && class128.field2428[4] + 128 > var5) {
                var5 = class128.field2428[4] + 128;
            }
            int var6 = class171.field3316 + class152.field2917 & 0x7FF;
            class155.method1053(class145.method1003((byte) -106, class145.field2767.field1100, class145.field2767.field1097, class42.field687) - 50, var5 * 3 + 600, -851895856, var5, class78.field1367, var6, class114.field2171);
        }
        int var7;
        if (class128.field2435) {
            var7 = class18.method125(800);
        } else {
            var7 = class2.method5(4);
        }
        int var8 = class14.field226;
        int var9 = class119.field2294;
        int var10 = class207.field4044;
        int var11 = class120.field2306;
        int var12 = class34.field520;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class130.field2474[var13]) {
                int var16 = (int) ((double) -class19.field278[var13] + Math.random() * (double) (class19.field278[var13] * 2 + 1) + Math.sin((double) class7.field86[var13] / 100.0D * (double) class78.field1361[var13]) * (double) class128.field2428[var13]);
                if (var13 == 3) {
                    class207.field4044 = class207.field4044 + var16 & 0x7FF;
                }
                if (var13 == 4) {
                    class120.field2306 += var16;
                    if (class120.field2306 < 128) {
                        class120.field2306 = 128;
                    }
                    if (class120.field2306 > 383) {
                        class120.field2306 = 383;
                    }
                }
                if (var13 == 2) {
                    class34.field520 += var16;
                }
                if (var13 == 0) {
                    class119.field2294 += var16;
                }
                if (var13 == 1) {
                    class14.field226 += var16;
                }
            }
        }
        int var14 = class79.field1389;
        int var15 = class89.field1559;
        if (arg4 <= var14 && arg0 + arg4 > var14 && var15 >= arg3 && var15 < arg3 + arg2) {
            class164.field3133 = 0;
            class164.field3146 = class89.field1559 - arg3;
            class164.field3145 = true;
            class164.field3138 = class79.field1389 - arg4;
        } else {
            class164.field3133 = 0;
            class164.field3145 = false;
        }
        class67.method441(-1);
        class62.method412(arg4, arg3, arg0, arg2, 0);
        class67.method441(-1);
        field560.method578(class119.field2294, class14.field226, class34.field520, class120.field2306, class207.field4044, var7);
        class67.method441(-1);
        field560.method570();
        class34.method233(arg3, false, arg4, arg0, arg2);
        class104.method676(arg3, arg4, 2);
        ((class117) class113.field2122).method834(true, class145.field2769);
        if (arg1 != 2047) {
            return;
        }
        class64.method420(arg2, arg4, (byte) -128, arg0, arg3);
        class120.field2306 = var11;
        class14.field226 = var8;
        class34.field520 = var12;
        class119.field2294 = var9;
        class207.field4044 = var10;
        if (class131.field2485 && class68.method443((byte) 3, false, true) == 0) {
            class131.field2485 = false;
        }
        if (class131.field2485) {
            class62.method412(arg4, arg3, arg0, arg2, 0);
            class68.method444(-118, false, class130.field2460);
        }
        if (!class131.field2485 && !class180.field3415 && var14 >= arg4 && var14 < arg0 + arg4 && arg3 <= var15 && var15 < arg2 + arg3) {
            class28.method178((byte) -124, var14, arg3, arg4, var15);
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Z)Lmc;")
    public final class112 method241(boolean arg0) {
        field564++;
        class112[] var2 = new class112[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field573[var4] != -1) {
                var2[var3++] = class112.method729(class162.field3114, this.field573[var4], 0);
            }
        }
        class112 var5 = new class112(var2, var3);
        if (arg0) {
            return null;
        }
        if (this.field556 != null) {
            for (int var6 = 0; var6 < this.field556.length; var6++) {
                var5.method736(this.field556[var6], this.field568[var6]);
            }
        }
        if (this.field558 != null) {
            for (int var7 = 0; var7 < this.field558.length; var7++) {
                var5.method740(this.field558[var7], this.field569[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILme;I)V")
    private final void method242(int arg0, class114 arg1, int arg2) {
        if (arg2 != 29976) {
            this.method241(true);
        }
        field574++;
        if (arg0 == 1) {
            this.field567 = arg1.method767(true);
        } else if (arg0 == 2) {
            int var8 = arg1.method767(true);
            this.field563 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field563[var9] = arg1.method762((byte) 122);
            }
        } else if (arg0 == 3) {
            this.field565 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method767(true);
            this.field568 = new short[var6];
            this.field556 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field556[var7] = (short) arg1.method762((byte) 116);
                this.field568[var7] = (short) arg1.method762((byte) 89);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method767(true);
            this.field569 = new short[var4];
            this.field558 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field558[var5] = (short) arg1.method762((byte) 72);
                this.field569[var5] = (short) arg1.method762((byte) 84);
            }
            return;
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field573[arg0 - 60] = arg1.method762((byte) 78);
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)Z")
    public final boolean method243(byte arg0) {
        field562++;
        if (this.field563 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 82 % ((arg0 + 8) / 40);
        for (int var4 = 0; var4 < this.field563.length; var4++) {
            if (!class162.field3114.method150(0, this.field563[var4], -61)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Lmc;")
    public final class112 method244(int arg0) {
        field576++;
        if (this.field563 == null) {
            return null;
        }
        class112[] var2 = new class112[this.field563.length];
        for (int var3 = arg0; var3 < this.field563.length; var3++) {
            var2[var3] = class112.method729(class162.field3114, this.field563[var3], 0);
        }
        class112 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class112(var2, var2.length);
        }
        if (this.field556 != null) {
            for (int var5 = 0; var5 < this.field556.length; var5++) {
                var4.method736(this.field556[var5], this.field568[var5]);
            }
        }
        if (this.field558 != null) {
            for (int var6 = 0; var6 < this.field558.length; var6++) {
                var4.method740(this.field558[var6], this.field569[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
    public static void method245(byte arg0) {
        field561 = null;
        field580 = null;
        field571 = null;
        field560 = null;
        field566 = null;
        if (arg0 == 0) {
            field555 = null;
            field557 = null;
            field578 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)Z")
    public final boolean method246(int arg0) {
        field572++;
        boolean var2 = true;
        if (arg0 != -30173) {
            field580 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field573[var3] != -1 && !class162.field3114.method150(0, this.field573[var3], -116)) {
                var2 = false;
            }
        }
        return var2;
    }
}
