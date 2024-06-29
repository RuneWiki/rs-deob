import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class232 extends class170 {

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field4055 = 0;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "Lsc;")
    public static class181 field4056 = class149.method967(255, "<img=1>");

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field4062 = 0;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "[S")
    public static short[] field4065 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "Lsc;")
    private static class181 field4064 = class149.method967(255, "Please wait)3)3)3");

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field4059 = -1;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "Lsc;")
    public static class181 field4057 = field4064;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "B")
    public byte field4060;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public int field4061;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "Ldg;")
    public class90 field4066;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1601(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class238.field4129 * 128) {
            arg0 = class238.field4129 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class2.field47 * 128) {
            arg2 = class2.field47 * 128 - 1;
        }
        class217.field3728 = class72.field1150[arg3];
        class80.field1289 = class72.field1145[arg3];
        class234.field4084 = class72.field1150[arg4];
        class157.field2636 = class72.field1145[arg4];
        class146.field2391 = arg0;
        class264.field4601 = arg1;
        class45.field699 = arg2;
        class73.field1165 = arg0 / 128;
        class114.field1855 = arg2 / 128;
        class19.field335 = class73.field1165 - class189.field3340;
        if (class19.field335 < 0) {
            class19.field335 = 0;
        }
        class76.field1234 = class114.field1855 - class189.field3340;
        if (class76.field1234 < 0) {
            class76.field1234 = 0;
        }
        class152.field2535 = class73.field1165 + class189.field3340;
        if (class152.field2535 > class238.field4129) {
            class152.field2535 = class238.field4129;
        }
        class5.field96 = class189.field3340 + class114.field1855;
        if (class5.field96 > class2.field47) {
            class5.field96 = class2.field47;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class189.field3340 + class189.field3340 + 2; var16++) {
            for (int var19 = 0; var19 < class189.field3340 + class189.field3340 + 2; var19++) {
                int var20 = (var16 - class189.field3340 << 7) - (class146.field2391 & 0x7F);
                int var21 = (var19 - class189.field3340 << 7) - (class45.field699 & 0x7F);
                int var22 = class73.field1165 + var16 - class189.field3340;
                int var23 = class114.field1855 + var19 - class189.field3340;
                if (var22 >= 0 && var23 >= 0 && var22 < class238.field4129 && var23 < class2.field47) {
                    int var24;
                    if (class253.field4418 == null) {
                        var24 = class21.field379[0][var22][var23] + 128 - class264.field4601;
                    } else {
                        var24 = class253.field4418[0][var22][var23] + 128 - class264.field4601;
                    }
                    int var25 = class21.field379[3][var22][var23] - class264.field4601 - 1000;
                    class131.field2172[var16][var19] = class75.method525(var20, var25, var24, var21, var15);
                } else {
                    class131.field2172[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class189.field3340 + class189.field3340 + 1; var17++) {
            for (int var18 = 0; var18 < class189.field3340 + class189.field3340 + 1; var18++) {
                class184.field3272[var17][var18] = class131.field2172[var17][var18] || class131.field2172[var17 + 1][var18] || class131.field2172[var17][var18 + 1] || class131.field2172[var17 + 1][var18 + 1];
            }
        }
        class88.field1401 = arg6;
        class202.field3479 = arg7;
        class145.field2389 = arg8;
        class185.field3290 = arg9;
        class126.field2099 = arg10;
        class99.method664();
        class143.method924(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Lsc;")
    public static final class181 method1602(int arg0, byte arg1) {
        field4058++;
        class181 var2 = new class181();
        var2.field3166 = new byte[arg0];
        if (arg1 != 61) {
            method1605(true);
        }
        var2.field3155 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
    public static final void method1603(int arg0) {
        int var1 = class182.field3207;
        field4063++;
        int var2 = class140.field2261;
        if (arg0 != -17957) {
            method1606(-56, (byte) -56, -87, -121);
        }
        int var3 = class165.field2799 - class143.field2321 - var1;
        int var4 = class213.field3675 - class41.field620 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (client.field2692 != null) {
                var5 = client.field2692;
            } else if (class43.field677 == null) {
                var5 = class224.field3870.field2285;
            } else {
                var5 = class43.field677;
            }
            int var6 = 0;
            int var7 = 0;
            if (class43.field677 == var5) {
                Insets var8 = class43.field677.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class213.field3675);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class165.field2799, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class165.field2799 - var3, var7, var3, class213.field3675);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class213.field3675 - var4, class165.field2799, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)I")
    public static final int method1604(int arg0, int arg1) {
        field4053++;
        if (arg1 != 0) {
            field4065 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V")
    public static void method1605(boolean arg0) {
        field4057 = null;
        if (arg0) {
            field4059 = -15;
        }
        field4056 = null;
        field4064 = null;
        field4065 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBII)I")
    public static final int method1606(int arg0, byte arg1, int arg2, int arg3) {
        field4051++;
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3 & 0x7F;
        int var7 = arg0;
        if (arg0 < 3 && (class70.field1129[1][var4][var5] & 0x2) == 2) {
            var7 = arg0 + 1;
        }
        int var8 = arg2 & 0x7F;
        if (arg1 > -14) {
            return 54;
        } else {
            int var9 = (128 - var6) * class31.field505[var7][var4][var5 + 1] + (class31.field505[var7][var4 + 1][var5 + 1] * var6) >> 7;
            int var10 = (128 - var6) * class31.field505[var7][var4][var5] + (class31.field505[var7][var4 + 1][var5] * var6) >> 7;
            return (128 - var8) * var10 + var8 * var9 >> 7;
        }
    }
}
