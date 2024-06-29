import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class127 extends Canvas {

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field1711;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "Leh;")
    public static class246 field1708 = new class246(4, -2);

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "Lvl;")
    public static class11 field1710;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILjp;I)V")
    public static final void method835(int arg0, class241 arg1, int arg2) {
        field1709++;
        boolean var3 = arg1.method1520(arg0 - 12496, 1) == 1;
        if (var3) {
            class326.field4758[class8.field131++] = arg2;
        }
        int var4 = arg1.method1520(-12494, arg0);
        class22 var5 = class378.field5355[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field258 = false;
            } else if (class343.field4982 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class357 var6 = class309.field4501[arg2] = new class357();
                var6.field5123 = (var5.field3378[0] + class367.field5241 >> 6) + (var5.field3368[0] + class441.field6171 >> 6 << 14) + (var5.field1904 << 28);
                if (var5.field259 == -1) {
                    var6.field5118 = var5.field3328.method1110(0);
                } else {
                    var6.field5118 = var5.field259;
                }
                var6.field5126 = var5.field276;
                var6.field5120 = var5.field3338;
                if (var5.field264 > 0) {
                    class191.method1218(var5, false);
                }
                class378.field5355[arg2] = null;
                if (arg1.method1520(-12494, 1) != 0) {
                    class343.method2043((byte) 23, arg2, arg1);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method1520(-12494, 3);
            int var8 = var5.field3368[0];
            int var9 = var5.field3378[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field290 = var8;
                var5.field263 = var9;
                var5.field258 = true;
            } else {
                var5.method133((byte) -17, var8, class124.field1684[arg2], var9);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method1520(-12494, 4);
            int var11 = var5.field3368[0];
            int var12 = var5.field3378[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field258 = true;
                var5.field263 = var12;
                var5.field290 = var11;
            } else {
                var5.method133((byte) -17, var11, class124.field1684[arg2], var12);
            }
        } else {
            int var13 = arg1.method1520(arg0 - 12496, 1);
            if (var13 == 0) {
                int var14 = arg1.method1520(-12494, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3F1) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field3368[0] + var16;
                int var19 = var5.field3378[0] + var17;
                if (var3) {
                    var5.field258 = true;
                    var5.field290 = var18;
                    var5.field263 = var19;
                } else {
                    var5.method133((byte) -17, var18, class124.field1684[arg2], var19);
                }
                var5.field1904 = (byte) (var5.field1904 + var15 & 0x3);
                if (class343.field4982 == arg2) {
                    class320.field4627 = var5.field1904;
                }
            } else {
                int var20 = arg1.method1520(arg0 - 12496, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (class441.field6171 + var22 + var5.field3368[0] & 0x3FFF) - class441.field6171;
                int var25 = (var5.field3378[0] + class367.field5241 + var23 & 0x3FFF) - class367.field5241;
                if (var3) {
                    var5.field290 = var24;
                    var5.field263 = var25;
                    var5.field258 = true;
                } else {
                    var5.method133((byte) -17, var24, class124.field1684[arg2], var25);
                }
                var5.field1904 = (byte) (var5.field1904 + var21 & 0x3);
                if (class343.field4982 == arg2) {
                    class320.field4627 = var5.field1904;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1711.update(arg0);
        field1707++;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
    public static void method836(boolean arg0) {
        field1710 = null;
        if (!arg0) {
            method836(false);
        }
        field1708 = null;
    }

    @OriginalMember(owner = "client!vp", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1713++;
        this.field1711.paint(arg0);
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class127(Component arg0) {
        this.field1711 = arg0;
    }
}
