import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 {

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    private int field161 = 0;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    private int field162 = -1;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
    public static int[] field150 = new int[1000];

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lqk;")
    public static class207 field159 = class24.method212(255, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lqk;")
    private static class207 field163 = class24.method212(255, "Loading config )2 ");

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Lqk;")
    public static class207 field153 = field163;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lqk;")
    public static class207 field152 = class24.method212(255, "; Max)2Age=");

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lqk;")
    public static class207 field164 = class24.method212(255, "overlay");

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lv;II)V")
    public final void method61(class149 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1045((byte) -106);
            if (var4 == 0) {
                if (arg2 != -1) {
                    field150 = null;
                }
                field158++;
                return;
            }
            this.method64(arg1, arg2 + 4, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
    private final void method62(int arg0, int arg1) {
        double var3 = (double) ((arg1 & 0xFFC6) >> 8) / 256.0D;
        field154++;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = 0.0D;
        if (arg0 != -256) {
            field163 = null;
        }
        double var11 = var5;
        double var13 = 0.0D;
        double var15 = var5;
        if (var3 > var5) {
            var15 = var3;
        }
        if (var7 > var15) {
            var15 = var7;
        }
        if (var3 < var5) {
            var11 = var3;
        }
        if (var11 > var7) {
            var11 = var7;
        }
        double var17 = (var11 + var15) / 2.0D;
        if (var11 != var15) {
            if (var17 < 0.5D) {
                var13 = (var15 - var11) / (var11 + var15);
            }
            if (var5 == var15) {
                var9 = (var3 - var7) / (var15 - var11);
            } else if (var3 == var15) {
                var9 = (var7 - var5) / (var15 - var11) + 2.0D;
            } else if (var7 == var15) {
                var9 = (var5 - var3) / (var15 - var11) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var11) / (2.0D - var15 - var11);
            }
        }
        this.field160 = (int) (var13 * 256.0D);
        double var19 = var9 / 6.0D;
        this.field157 = (int) (var17 * 256.0D);
        if (this.field157 < 0) {
            this.field157 = 0;
        } else if (this.field157 > 255) {
            this.field157 = 255;
        }
        if (var17 > 0.5D) {
            this.field156 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field156 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field160 < 0) {
            this.field160 = 0;
        } else if (this.field160 > 255) {
            this.field160 = 255;
        }
        if (this.field156 < 1) {
            this.field156 = 1;
        }
        this.field151 = (int) ((double) this.field156 * var19);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method63(int arg0) {
        field150 = null;
        field152 = null;
        field163 = null;
        if (arg0 <= -63) {
            field153 = null;
            field164 = null;
            field159 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIILv;)V")
    private final void method64(int arg0, int arg1, int arg2, class149 arg3) {
        if (arg2 == 1) {
            this.field161 = arg3.method1065((byte) 101);
            this.method62(-256, this.field161);
        } else if (arg2 == 2) {
            this.field162 = arg3.method1050(arg1 + 1272006565);
            if (this.field162 == 65535) {
                this.field162 = -1;
            }
        } else if (arg2 == 3) {
            arg3.method1050(arg1 ^ 0x4BD147AB);
        }
        if (arg1 != 3) {
            this.field160 = -7;
        }
        field165++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIIILfk;)V")
    public static final void method65(byte arg0, int arg1, int arg2, int arg3, class14 arg4) {
        field155++;
        if (class202.field3565 == arg4 || class268.field4751 >= 400) {
            return;
        }
        class207 var11;
        if (arg4.field200 == 0) {
            boolean var5 = true;
            if (class202.field3565.field203 != -1 && arg4.field203 != -1) {
                int var6 = class202.field3565.field203 < arg4.field203 ? class202.field3565.field203 : arg4.field203;
                int var7 = arg4.field224 < class202.field3565.field224 ? class202.field3565.field224 : arg4.field224;
                int var8 = class202.field3565.field224 - arg4.field224;
                int var9 = var7 * 10 / 100 + var6 + 5;
                if (var8 < 0) {
                    var8 = -var8;
                }
                if (var9 < var8) {
                    var5 = false;
                }
            }
            class207 var10 = class171.field3035 == 1 ? class171.field3030 : class20.field331;
            if (arg4.field205 > arg4.field224) {
                var11 = class105.method757(false, new class207[] { arg4.method92(false), var5 ? class75.method541(class202.field3565.field224, arg4.field224, -9) : class232.field4256, class150.field2633, var10, class262.method1815(arg4.field224, (byte) -126), class4.field65, class262.method1815(arg4.field205 - arg4.field224, (byte) -105), class270.field4776 });
            } else {
                var11 = class105.method757(false, new class207[] { arg4.method92(false), var5 ? class75.method541(class202.field3565.field224, arg4.field224, -9) : class232.field4256, class150.field2633, var10, class262.method1815(arg4.field224, (byte) 23), class270.field4776 });
            }
        } else {
            var11 = class105.method757(false, new class207[] { arg4.method92(false), class150.field2633, class128.field2232, class262.method1815(arg4.field200, (byte) -119), class270.field4776 });
        }
        if (class34.field680 == 1) {
            class156.method1143((short) 24, arg3, (long) arg1, class60.field1093, arg2, -28775, class156.field2744, class105.method757(false, new class207[] { class235.field4336, class92.field1630, var11 }));
            class65.field1152++;
        } else if (!class4.field71) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class40.field808[var12] != null) {
                    class2.field34++;
                    short var13 = 0;
                    if (class171.field3035 == 0 && class40.field808[var12].method1462(class275.field4829, true)) {
                        if (class202.field3565.field224 < arg4.field224) {
                            var13 = 2000;
                        }
                        if (class202.field3565.field208 != 0 && arg4.field208 != 0) {
                            if (class202.field3565.field208 == arg4.field208) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class183.field3251[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class234.field4324[var12];
                    short var16 = (short) (var13 + var15);
                    class156.method1143(var16, arg3, (long) arg1, class108.field1919[var12], arg2, -28775, class40.field808[var12], class105.method757(false, new class207[] { class232.field4256, var11 }));
                }
            }
        } else if ((class60.field1096 & 0x8) != 0) {
            class156.method1143((short) 32, arg3, (long) arg1, class127.field2218, arg2, -28775, class49.field969, class105.method757(false, new class207[] { class243.field4422, class92.field1630, var11 }));
            class185.field3277++;
        }
        int var17 = 0;
        if (arg0 <= 57) {
            return;
        }
        while (class268.field4751 > var17) {
            if (class82.field1494[var17] == 29) {
                class12.field167[var17] = class105.method757(false, new class207[] { class232.field4256, var11 });
                return;
            }
            var17++;
        }
    }
}
