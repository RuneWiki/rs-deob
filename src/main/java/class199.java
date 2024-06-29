import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class199 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public int field2825 = 0;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "[I")
    public static int[] field2828 = new int[32];

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field2835 = new String[100];

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Lbc;")
    public static class282 field2832;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method1278(int arg0) {
        field2832 = null;
        field2828 = null;
        if (arg0 > 55) {
            field2835 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZLqi;)V")
    private final void method1279(int arg0, boolean arg1, class216 arg2) {
        field2830++;
        if (arg1) {
            method1278(113);
        }
        if (arg0 == 5) {
            this.field2825 = arg2.method1380(true);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public static final void method1280(byte arg0) {
        field2838++;
        int var1 = class30.field369;
        int var2 = class45.field539;
        if (arg0 < 110) {
            method1281(-10);
        }
        int var3 = class98.field1311 - class84.field1166 - var1;
        int var4 = class35.field404 - client.field4437 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class48.field553 != null) {
                var5 = class48.field553;
            } else if (class202.field2858 == null) {
                var5 = class115.field1592.field664;
            } else {
                var5 = class202.field2858;
            }
            int var6 = 0;
            int var7 = 0;
            if (class202.field2858 == var5) {
                Insets var8 = class202.field2858.getInsets();
                var7 = var8.left;
                var6 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var6, var1, class35.field404);
            }
            if (var2 > 0) {
                var9.fillRect(var7, var6, class98.field1311, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class98.field1311 + var7 - var3, var6, var3, class35.field404);
            }
            if (var4 > 0) {
                var9.fillRect(var7, class35.field404 + var6 - var4, class98.field1311, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static final void method1281(int arg0) {
        if (class261.field3800 < 0) {
            class261.field3800 = 0;
            class274.field4103 = -1;
            class294.field4647 = -1;
        }
        if (class261.field3800 > client.field4446) {
            class261.field3800 = client.field4446;
            class294.field4647 = -1;
            class274.field4103 = -1;
        }
        if (arg0 != -1) {
            method1280((byte) -56);
        }
        field2834++;
        if (class271.field3963 < 0) {
            class271.field3963 = 0;
            class274.field4103 = -1;
            class294.field4647 = -1;
        }
        if (class271.field3963 > class133.field1940) {
            class274.field4103 = -1;
            class271.field3963 = class133.field1940;
            class294.field4647 = -1;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B[BII)Z")
    public static final boolean method1282(byte arg0, byte[] arg1, int arg2, int arg3) {
        class216 var4 = new class216(arg1);
        boolean var5 = true;
        field2827++;
        int var6 = -1;
        int var7 = 19 % ((arg0 + 19) / 38);
        label54: while (true) {
            int var8 = var4.method1381((byte) 111);
            if (var8 == 0) {
                return var5;
            }
            var6 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var4.method1378((byte) -125);
                    if (var12 == 0) {
                        continue label54;
                    }
                    var9 += var12 - 1;
                    int var13 = (var9 & 0xFED) >> 6;
                    int var14 = var9 & 0x3F;
                    int var15 = arg3 + var13;
                    int var16 = var4.method1407(113) >> 2;
                    int var17 = arg2 + var14;
                    if (var15 > 0 && var17 > 0 && var15 < 103 && var17 < 103) {
                        class273 var18 = class164.method1081(0, var6);
                        if (var16 != 22 || class149.field2169 || var18.field4050 != 0 || var18.field4016 == 1 || var18.field4021) {
                            var10 = true;
                            if (!var18.method1752(127)) {
                                class121.field1722++;
                                var5 = false;
                            }
                        }
                    }
                }
                int var11 = var4.method1378((byte) -119);
                if (var11 == 0) {
                    break;
                }
                var4.method1407(127);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILqi;)V")
    public final void method1283(int arg0, class216 arg1) {
        field2824++;
        while (true) {
            int var3 = arg1.method1407(114);
            if (var3 == 0) {
                if (arg0 >= -10) {
                    field2833 = 36;
                    return;
                } else {
                    return;
                }
            }
            this.method1279(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public static final void method1284(int arg0) {
        if (arg0 > -71) {
            field2828 = null;
        }
        class260.field3786.method67((byte) -123);
        field2836++;
    }
}
