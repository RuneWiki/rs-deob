import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class314 {

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "[C")
    public static char[] field4579 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field4591 = 0;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Lpp;")
    public static class464 field4585 = new class464(59, -1);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public int field4572;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public int field4573;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public int field4574;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public int field4575;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public int field4580;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public int field4582;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public int field4583;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public int field4584;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public int field4586;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public int field4587;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public int field4589;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public int field4590;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public int field4592;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public int field4594;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method1941(int arg0) {
        field4579 = null;
        field4585 = null;
        if (arg0 != 65536) {
            method1943(96, 76, null, null, null);
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public static final void method1942(int arg0) {
        field4577++;
        if (class202.field2854.method2639(class646.field9388, (byte) 120) != 2) {
            return;
        }
        byte var1 = (byte) (class79.field1432 - 4 & 0xFF);
        int var2 = class79.field1432 % class146.field2247;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var17 = 0; var17 < class66.field990; var17++) {
                class338.field4854[var3][var2][var17] = var1;
            }
        }
        if (class545.field7583 == 3) {
            return;
        }
        int var4 = 119 % ((-arg0 - 42) / 44);
        for (int var5 = 0; var5 < 2; var5++) {
            class493.field6923[var5] = -1000000;
            class612.field8693[var5] = 1000000;
            class321.field4652[var5] = 0;
            class443.field6475[var5] = 1000000;
            class78.field1414[var5] = 0;
        }
        if (class377.field5547 != 1) {
            int var16 = class355.method2160(class545.field7584, class216.field3274, class545.field7583, (byte) 103);
            if (var16 - class448.field6535 >= 800 || (class104.field1755[class545.field7583][class545.field7584 >> 7][class216.field3274 >> 7] & 0x4) == 0) {
                return;
            }
            class602.method3428(false, class545.field7584 >> 7, false, class216.field3274 >> 7, class277.field4051, 1);
            return;
        }
        if ((class104.field1755[class545.field7583][class644.field9367.field5108 >> 7][class644.field9367.field5109 >> 7] & 0x4) != 0) {
            class602.method3428(false, class644.field9367.field5108 >> 7, false, class644.field9367.field5109 >> 7, class277.field4051, 0);
        }
        if (class217.field3284 >= 2560) {
            return;
        }
        int var6 = class545.field7584 >> 7;
        int var7 = class216.field3274 >> 7;
        int var8 = class644.field9367.field5108 >> 7;
        int var9 = class644.field9367.field5109 >> 7;
        int var10;
        if (var6 < var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        int var11;
        if (var7 < var9) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if ((var10 != 0 || var11 != 0) && var10 > -class146.field2247 && class146.field2247 > var10 && var11 > (-class66.field990) && class66.field990 > var11) {
            if (var11 >= var10) {
                int var12 = var10 * 65536 / var11;
                int var13 = 32768;
                while (var7 != var9) {
                    if (var9 > var7) {
                        var7++;
                    } else if (var9 < var7) {
                        var7--;
                    }
                    if ((class104.field1755[class545.field7583][var6][var7] & 0x4) != 0) {
                        class602.method3428(false, var6, false, var7, class277.field4051, 1);
                        return;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var8 > var6) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        if ((class104.field1755[class545.field7583][var6][var7] & 0x4) != 0) {
                            class602.method3428(false, var6, false, var7, class277.field4051, 1);
                            return;
                        }
                    }
                }
                return;
            }
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class104.field1755[class545.field7583][var6][var7] & 0x4) != 0) {
                    class602.method3428(false, var6, false, var7, class277.field4051, 1);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var7 < var9) {
                        var7++;
                    } else if (var9 < var7) {
                        var7--;
                    }
                    var15 -= 65536;
                    if ((class104.field1755[class545.field7583][var6][var7] & 0x4) != 0) {
                        class602.method3428(false, var6, false, var7, class277.field4051, 1);
                        return;
                    }
                }
            }
            return;
        }
        class593.method3390("RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class382.field5687 + "," + class597.field8500, null, 0);
        return;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILgp;Ln;Ljava/awt/Canvas;)Lqa;")
    public static final class167 method1943(int arg0, int arg1, class561 arg2, class472 arg3, Canvas arg4) {
        field4576++;
        if (arg1 != -22960) {
            field4591 = 109;
        }
        if (!class408.method2476(arg1 ^ 0x59D1)) {
            throw new RuntimeException("");
        } else if (class8.method31(false, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg4, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class125 var8 = new class125(var5, arg4, var6, arg3, arg2, arg0);
            var8.method3586(0);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }
}
