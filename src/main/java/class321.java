import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class321 extends class242 {

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "[Ljf;")
    public static class229[] field5426 = new class229[200];

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "Ljf;")
    public static class229 field5430 = class212.method1457((byte) 111, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public int field5432;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public int field5434;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "Ljava/awt/Font;")
    public static Font field5433;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "[[I")
    public static int[][] field5435;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "[[Lkc;")
    public static class37[][] field5431;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)Ltb;", line = 6)
    public static final class222 method2160(int arg0) {
        field5425++;
        if (arg0 == 25589) {
            class23.field419 = 0;
            return class10.method57((byte) 59);
        } else {
            return (class222) null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(JI)V", line = 25)
    public static final void method2161(long arg0, int arg1) {
        field5428++;
        if (arg1 != -1) {
            field5435 = (int[][]) ((int[][]) null);
        }
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class113.field2044; var3++) {
            if (class31.field536[var3] == arg0) {
                class282.field4827++;
                class113.field2044--;
                for (int var4 = var3; var4 < class113.field2044; var4++) {
                    class74.field1403[var4] = class74.field1403[var4 + 1];
                    class12.field145[var4] = class12.field145[var4 + 1];
                    field5426[var4] = field5426[var4 + 1];
                    class31.field536[var4] = class31.field536[var4 + 1];
                    class240.field4231[var4] = class240.field4231[var4 + 1];
                    class48.field873[var4] = class48.field873[var4 + 1];
                }
                class258.field4491 = class6.field70;
                class84.field1608.method1397(48, 0);
                class84.field1608.method118(arg0, (byte) -128);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILqg;IIIIB)V", line = 72)
    public static final void method2162(int arg0, class244 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field5429++;
        long var7 = 0L;
        if (arg2 == 0) {
            var7 = class104.method701(arg5, arg3, arg4);
        } else if (arg2 == 1) {
            var7 = class31.method263(arg5, arg3, arg4);
        } else if (arg2 == 2) {
            var7 = class122.method864(arg5, arg3, arg4);
        } else if (arg2 == 3) {
            var7 = class124.method880(arg5, arg3, arg4);
        }
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -118 / ((48 - arg6) / 47);
        boolean var12 = true;
        int var13 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        int var14 = (int) var7 >> 14 & 0x1F;
        int var15 = (int) var7 >> 20 & 0x3;
        class83 var16 = class271.method1909(-21, var13);
        if (var16.method602(-22802)) {
            class142.method991(arg4, 106, arg3, arg5, var16);
        }
        if (var7 == 0L) {
            return;
        }
        class174 var17 = null;
        class174 var18 = null;
        if (arg2 == 0) {
            class167 var22 = class212.method1456(arg5, arg3, arg4);
            if (var22 != null) {
                var17 = var22.field2874;
                var18 = var22.field2865;
            }
            if (var16.field1551 != 0) {
                arg1.method1769(1, arg3, var14, var16.field1592, var15, arg4);
            }
        } else if (arg2 == 1) {
            class232 var21 = class31.method262(arg5, arg3, arg4);
            if (var21 != null) {
                var18 = var21.field4016;
                var17 = var21.field4028;
            }
        } else if (arg2 == 2) {
            class104 var20 = class22.method207(arg5, arg3, arg4);
            if (var20 != null) {
                var18 = var20.field1806;
            }
            if (var16.field1551 != 0 && (var16.field1528 + arg3) < 104 && var16.field1528 + arg4 < 104 && (var16.field1572 + arg3) < 104 && (arg4 + var16.field1572) < 104) {
                arg1.method1765(var16.field1572, var16.field1592, arg3, arg4, var16.field1528, var15, 3);
            }
        } else if (arg2 == 3) {
            class143 var19 = class44.method373(arg5, arg3, arg4);
            if (var19 != null) {
                var18 = var19.field2480;
            }
            if (var16.field1551 == 1) {
                arg1.method1775(arg3, -2251, arg4);
            }
        }
        if (!class108.field1900 || !var16.field1537) {
            return;
        }
        if (var14 == 2) {
            if ((var18 instanceof class20)) {
                ((class20) var18).method197(1);
            } else {
                class83.method599(var15 + 4, (byte) 61, 0, arg0, arg4, var14, arg3, var16, 0);
            }
            if ((var17 instanceof class20)) {
                ((class20) var17).method197(1);
            } else {
                class83.method599(var15 + 1 & 0x3, (byte) 61, 0, arg0, arg4, var14, arg3, var16, 0);
            }
        } else if (var14 == 5) {
            if ((var18 instanceof class20)) {
                ((class20) var18).method197(1);
            } else {
                class83.method599(var15, (byte) 61, class147.field2553[var15] * 8, arg0, arg4, 4, arg3, var16, class257.field4483[var15] * 8);
            }
        } else if (var14 == 6) {
            if (var18 instanceof class20) {
                ((class20) var18).method197(1);
            } else {
                class83.method599(var15 + 4, (byte) 61, class180.field3125[var15] * 8, arg0, arg4, 4, arg3, var16, class213.field3646[var15] * 8);
            }
        } else if (var14 == 7) {
            if (var18 instanceof class20) {
                ((class20) var18).method197(1);
            } else {
                class83.method599((var15 + 2 & 0x3) + 4, (byte) 61, 0, arg0, arg4, 4, arg3, var16, 0);
            }
        } else if (var14 == 8) {
            if ((var18 instanceof class20)) {
                ((class20) var18).method197(1);
            } else {
                class83.method599(var15 + 4, (byte) 61, class180.field3125[var15] * 8, arg0, arg4, 4, arg3, var16, class213.field3646[var15] * 8);
            }
            if (var17 instanceof class20) {
                ((class20) var17).method197(1);
            } else {
                class83.method599((var15 + 2 & 0x3) + 4, (byte) 61, class180.field3125[var15] * 8, arg0, arg4, 4, arg3, var16, class213.field3646[var15] * 8);
            }
        } else if (var14 == 11) {
            if (var18 instanceof class20) {
                ((class20) var18).method197(1);
            } else {
                class83.method599(var15 + 4, (byte) 61, 0, arg0, arg4, 10, arg3, var16, 0);
            }
        } else if (var18 instanceof class20) {
            ((class20) var18).method197(1);
        } else {
            class83.method599(var15, (byte) 61, 0, arg0, arg4, var14, arg3, var16, 0);
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V", line = 266)
    public static void method2163(int arg0) {
        field5433 = null;
        field5430 = null;
        if (arg0 != 19218) {
            method2162(-1, (class244) null, -22, -49, -11, -2, (byte) -25);
        }
        field5435 = (int[][]) null;
        field5431 = (class37[][]) null;
        field5426 = null;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)V", line = 297)
    public static final void method2164(byte arg0) {
        class150.field2590.method226((byte) -116);
        int var1 = -60 % ((arg0 - 34) / 52);
        field5427++;
        client.field4463.method226((byte) -106);
    }
}
