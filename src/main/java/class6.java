import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class6 implements class263 {

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "[I")
    public static int[] field92 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field93 = 255;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field96 = 64;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "[[S")
    public static short[][] field90 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field98 = 0;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lwm;")
    private static class152 field97 = class157.method1048("wave:", 122);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lwm;")
    public static class152 field86 = field97;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Lwm;")
    public static class152 field99 = field97;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Lah;")
    public static class205 field88;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 20)
    public static void method26(int arg0) {
        int var1 = 115 / ((46 - arg0) / 51);
        field97 = null;
        field90 = (short[][]) null;
        field86 = null;
        field88 = null;
        field92 = null;
        field99 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Lwm;", line = 37)
    public static final class152 method27(int arg0, int arg1) {
        field91++;
        if (arg1 >= -23) {
            field92 = (int[]) null;
        }
        return class55.field864[arg0].method1000(0) <= 0 ? class123.field1734[arg0] : class195.method1307(new class152[] { class123.field1734[arg0], class179.field2861, class55.field864[arg0] }, (byte) 29);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([I[I[IILse;)V", line = 61)
    public static final void method28(int[] arg0, int[] arg1, int[] arg2, int arg3, class12 arg4) {
        if (arg3 != -10747) {
            return;
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg0[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg4.field4163.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field4163[var9] = null;
                    } else {
                        class141 var10 = class133.method851(var6, 118);
                        int var11 = var10.field2167;
                        class111 var12 = arg4.field4163[var9];
                        if (var12 != null) {
                            if (var12.field1562 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field4163[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1569 = 1;
                                    var12.field1565 = 0;
                                    var12.field1561 = 0;
                                    var12.field1566 = var8;
                                    var12.field1564 = 0;
                                    class18.method114(arg4.field4162, 0, arg4.field4231, var10, class85.field1176 == arg4, 28972);
                                } else if (var11 == 2) {
                                    var12.field1561 = 0;
                                }
                            } else if (var10.field2152 >= class133.method851(var12.field1562, arg3 ^ 0x2989).field2152) {
                                var12 = arg4.field4163[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class111 var13 = arg4.field4163[var9] = new class111();
                            var13.field1561 = 0;
                            var13.field1562 = var6;
                            var13.field1569 = 1;
                            var13.field1565 = 0;
                            var13.field1564 = 0;
                            var13.field1566 = var8;
                            class18.method114(arg4.field4162, 0, arg4.field4231, var10, class85.field1176 == arg4, 28972);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field94++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(JII[I)Lwm;", line = 168)
    public final class152 method29(long arg0, int arg1, int arg2, int[] arg3) {
        if (arg1 != 7) {
            return (class152) null;
        }
        field87++;
        if (arg2 == 0) {
            class193 var7 = class91.method598(-1, arg3[0]);
            return var7.method1287((byte) -8, (int) arg0);
        } else if (arg2 == 1 || arg2 == 10) {
            class312 var6 = class189.method1253((byte) 64, (int) arg0);
            return var6.field5393;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class91.method598(-1, arg3[0]).method1287((byte) -8, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZILjava/lang/Object;)[B", line = 203)
    public static final byte[] method30(boolean arg0, int arg1, Object arg2) {
        field89++;
        if (arg2 == null) {
            return null;
        }
        if (arg1 != -11797) {
            field98 = 78;
        }
        if ((arg2 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg2);
            return arg0 ? class279.method1900((byte) -109, var4) : var4;
        } else if ((arg2 instanceof class18)) {
            class18 var3 = (class18) arg2;
            return var3.method119(128);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lcc;)V", line = 241)
    public static final void method31(class248 arg0) {
        for (int var1 = arg0.field4157; var1 <= arg0.field4153; var1++) {
            for (int var2 = arg0.field4151; var2 <= arg0.field4150; var2++) {
                class34 var3 = class287.field4857[arg0.field4145][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field579; var4++) {
                        if (var3.field580[var4] == arg0) {
                            var3.field579--;
                            for (int var5 = var4; var5 < var3.field579; var5++) {
                                var3.field580[var5] = var3.field580[var5 + 1];
                                var3.field568[var5] = var3.field568[var5 + 1];
                            }
                            var3.field580[var3.field579] = null;
                            break;
                        }
                    }
                    var3.field556 = 0;
                    for (int var6 = 0; var6 < var3.field579; var6++) {
                        var3.field556 |= var3.field568[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lwm;ZI)V", line = 303)
    public static final void method32(class152 arg0, boolean arg1, int arg2) {
        field95++;
        if (arg2 != 66) {
            field88 = (class205) null;
        }
        int var3 = class305.field5238.method1141(arg0, 250);
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = class305.field5238.method1136(arg0, 250) * 13;
        int var7 = var4 + 6;
        if (class217.field3516) {
            class13.method78(var7 - var4, -var4 + var5, var3 + var4 + var4, var6 - -var4 + var4, 0);
            class13.method68(var7 - var4, -var4 + var5, var3 + var4 + var4, var4 + var6 + var4, 16777215);
        } else {
            class96.method635(var7 - var4, -var4 + var5, var4 + var4 + var3, var6 - -var4 + var4, 0);
            class96.method648(var7 - var4, var5 - var4, var3 + var4 + var4, var4 + var6 + var4, 16777215);
        }
        class305.field5238.method1126(arg0, var7, var5, var3, var6, 16777215, -1, 1, 1, 0);
        class265.method1821(var7 - var4, var4 + var4 + var6, var5 - var4, var3 - -var4 - -var4, (byte) -104);
        if (!arg1) {
            class48.method336(var5, 73, var3, var6, var7);
        } else if (class217.field3516) {
            class217.method1464();
        } else {
            try {
                Graphics var8 = class224.field3648.getGraphics();
                class311.field5322.method121(-129, var8, 0, 0);
            } catch (Exception var10) {
                class224.field3648.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIILv;Lv;IIIIJ)V", line = 363)
    public static final void method33(int arg0, int arg1, int arg2, int arg3, class73 arg4, class73 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class275 var12 = new class275();
        var12.field4717 = arg10;
        var12.field4718 = arg1 * 128 + 64;
        var12.field4706 = arg2 * 128 + 64;
        var12.field4713 = arg3;
        var12.field4707 = arg4;
        var12.field4700 = arg5;
        var12.field4711 = arg6;
        var12.field4719 = arg7;
        var12.field4708 = arg8;
        var12.field4703 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class287.field4857[var13][arg1][arg2] == null) {
                class287.field4857[var13][arg1][arg2] = new class34(var13, arg1, arg2);
            }
        }
        class287.field4857[arg0][arg1][arg2].field554 = var12;
    }
}
