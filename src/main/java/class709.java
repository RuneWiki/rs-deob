import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class709 extends class4 {

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field9896 = 2;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Z")
    public static boolean field9894 = false;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field9893;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Ldc;")
    public static class63 field9895;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 3)
    public static void method3990(byte arg0) {
        if (arg0 != 0) {
            method3990((byte) 93);
        }
        field9895 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 14)
    public static final void method3991(int arg0) {
        field9897++;
        if (arg0 != -2) {
            field9894 = false;
        }
        if (!class61.field875) {
            class244.field3622 += (-24.0F - class244.field3622) / 2.0F;
            class61.field875 = true;
            class397.field5710 = true;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILdc;Lrp;B)V", line = 31)
    public static final void method3992(int arg0, class63 arg1, class135 arg2, byte arg3) {
        field9893++;
        class217 var4 = new class217();
        var4.field2835 = arg1.method505((byte) -119);
        var4.field2834 = arg1.method457(-14532);
        var4.field2830 = new class246[var4.field2835];
        var4.field2836 = new class246[var4.field2835];
        var4.field2837 = new byte[var4.field2835][][];
        var4.field2827 = new int[var4.field2835];
        var4.field2833 = new int[var4.field2835];
        var4.field2828 = new int[var4.field2835];
        for (int var5 = 0; var5 < var4.field2835; var5++) {
            try {
                int var6 = arg1.method505((byte) -119);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method479((byte) -96);
                    String var8 = arg1.method479((byte) -69);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method457(-14532);
                    }
                    var4.field2828[var5] = var6;
                    var4.field2833[var5] = var9;
                    var4.field2836[var5] = arg2.method858(var8, class692.method3914((byte) 63, var7), -10027);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method479((byte) -108);
                    String var11 = arg1.method479((byte) -5);
                    int var12 = arg1.method505((byte) -119);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method479((byte) -21);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method457(arg3 ^ 0xFFFFC73B);
                            var15[var16] = new byte[var17];
                            arg1.method449(0, var17, var15[var16], (byte) -127);
                        }
                    }
                    var4.field2828[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class692.method3914((byte) 122, var13[var19]);
                    }
                    var4.field2830[var5] = arg2.method864(var11, var18, class692.method3914((byte) 66, var10), 21410);
                    var4.field2837[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2827[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2827[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2827[var5] = -3;
            } catch (Exception var23) {
                var4.field2827[var5] = -4;
            } catch (Throwable var24) {
                var4.field2827[var5] = -5;
            }
        }
        class593.field8040.method3610(9289, var4);
        if (arg3 != 7) {
            field9895 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Luq;III)V", line = 144)
    public static final void method3993(class318 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class61.field877) {
            class262 var4 = class137.field1948[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3844 != null && var4.field3844.method642((byte) 2)) {
                arg0.method648((byte) -88, class441.field6132, true, 0, var4.field3844, 0, class368.field5213);
            }
        }
        if (arg3 < class61.field877) {
            class262 var5 = class137.field1948[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3844 != null && var5.field3844.method642((byte) 2)) {
                arg0.method648((byte) -95, class441.field6132, true, 0, var5.field3844, class368.field5213, 0);
            }
        }
        if (arg2 < class61.field877 && arg3 < class713.field9959) {
            class262 var6 = class137.field1948[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3844 != null && var6.field3844.method642((byte) 2)) {
                arg0.method648((byte) -86, class441.field6132, true, 0, var6.field3844, class368.field5213, class368.field5213);
            }
        }
        if (arg2 < class61.field877 && arg3 > 0) {
            class262 var7 = class137.field1948[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3844 != null && var7.field3844.method642((byte) 2)) {
                arg0.method648((byte) -102, class441.field6132, true, 0, var7.field3844, -class368.field5213, class368.field5213);
            }
        }
    }
}
