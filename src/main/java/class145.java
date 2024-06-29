import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class class145 {

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "[I")
    public static int[] field2603 = new int[2500];

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Llc;")
    private static class143 field2609 = class66.method374("Drop", -1);

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Llc;")
    public static class143 field2611 = field2609;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public int field2608;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field2601;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "[I")
    public int[] field2606;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILi;)I")
    public static final int method921(int arg0, class187 arg1) {
        class85 var2 = arg1.field3384;
        field2607++;
        if (var2.field1538 != null) {
            var2 = var2.method489(-23677);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 != -1) {
            field2611 = null;
        }
        int var3 = var2.field1524;
        if (arg1.field4137 == arg1.field4133) {
            var3 = var2.field1546;
        } else if (arg1.field4171 == arg1.field4133) {
            var3 = var2.field1534;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method321(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILh;)V")
    public static final void method922(int arg0, class190 arg1) {
        if (arg0 > -100) {
            return;
        }
        field2600++;
        while (true) {
            while (arg1.field3465.length > arg1.field3487) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1265(120) == 1) {
                    var3 = arg1.method1265(121);
                    var4 = arg1.method1265(115);
                    var2 = true;
                }
                int var5 = arg1.method1265(114);
                int var6 = arg1.method1265(124);
                int var7 = class236.field4298 + class25.field426 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class245.field4412;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < class169.field3009 && class25.field426 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg1.method1234(false);
                                if (var13 != 0) {
                                    if (class10.field201[var9][var10] == null) {
                                        class10.field201[var9][var10] = new byte[4096];
                                    }
                                    class10.field201[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1234(false);
                                    if (class35.field612[var9][var10] == null) {
                                        class35.field612[var9][var10] = new byte[4096];
                                    }
                                    class35.field612[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1234(false);
                        if (var16 != 0) {
                            arg1.field3487++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public final void method923(byte arg0) {
        field2605++;
        int var2 = 84 % ((arg0 - 46) / 55);
        class260.method1733(this.field2606, this.field2608, this.field2604);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lgf;I)I")
    public static final int method924(class7 arg0, int arg1) {
        field2610++;
        int var2 = arg1;
        if (arg0.method40(class65.field1216, -113)) {
            var2 = arg1 + 1;
        }
        if (arg0.method40(class76.field1412, arg1 - 116)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZB)V")
    public static final void method925(boolean arg0, byte arg1) {
        field2599++;
        if (class229.field4195.field4178 >> 7 == class177.field3170 && (class229.field4195.field4108 >> 7) == class123.field2154) {
            class177.field3170 = 0;
        }
        int var2 = class107.field1889;
        if (arg0) {
            var2 = 1;
        }
        int var3 = -118 / ((-arg1 - 62) / 57);
        for (int var4 = 0; var4 < var2; var4++) {
            long var5;
            class32 var7;
            if (arg0) {
                var5 = 8791798054912L;
                var7 = class229.field4195;
            } else {
                var7 = class6.field97[class30.field467[var4]];
                var5 = (long) class30.field467[var4] << 32;
            }
            if (var7 != null && var7.method217(false)) {
                var7.field552 = false;
                int var8 = var7.field4178 >> 7;
                if ((class240.field4333 && class107.field1889 > 200 || class107.field1889 > 50) && !arg0 && var7.field4137 == var7.field4133) {
                    var7.field552 = true;
                }
                int var9 = var7.field4108 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var7.field517 == null || var7.field509 > class146.field2635 || class146.field2635 >= var7.field531) {
                        if (var7.method218((byte) -49) == 1 && (var7.field4178 & 0x7F) == 64 && (var7.field4108 & 0x7F) == 64) {
                            if (class68.field1306[var8][var9] == class141.field2460) {
                                continue;
                            }
                            class68.field1306[var8][var9] = class141.field2460;
                        }
                        var7.field4127 = class20.method140(var7.field4178, 98, var7.field4108, class170.field3044);
                        class185.method1208(class170.field3044, var7.field4178, var7.field4108, var7.field4127, (var7.method218((byte) 57) - 1) * 64 + 60, var7, var7.field4183, var5, var7.field4123);
                    } else {
                        var7.field552 = false;
                        var7.field4127 = class20.method140(var7.field4178, 122, var7.field4108, class170.field3044);
                        class261.method1740(class170.field3044, var7.field4178, var7.field4108, var7.field4127, var7, var7.field4183, var5, var7.field529, var7.field537, var7.field535, var7.field511);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method323(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method322(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    public static void method926(byte arg0) {
        if (arg0 <= 38) {
            field2611 = null;
        }
        field2609 = null;
        field2611 = null;
        field2603 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILlc;)V")
    public static final void method927(int arg0, class143 arg1) {
        field2602++;
        for (class80 var2 = (class80) class268.field4799.method1294(false); var2 != null; var2 = (class80) class268.field4799.method1292((byte) 67)) {
            if (var2.field1453.method876((byte) -122, arg1)) {
                class135.field2364 = var2;
                return;
            }
        }
        if (arg0 <= 68) {
            field2609 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    protected class145() {
    }
}
