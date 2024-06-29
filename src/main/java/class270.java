import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class270 {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field4397 = 0;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "[I")
    public static int[] field4401 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field4402 = 0;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public int field4398;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public int field4399;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public int field4400;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Lua;")
    public static class83 field4405;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "[I")
    public static int[] field4396;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lim;I)V")
    public final void method1880(class170 arg0, int arg1) {
        if (arg1 != 0) {
            this.method1882((byte) 18, (class170) null, -106);
        }
        while (true) {
            int var3 = arg0.method1218(arg1 ^ 0x55);
            if (var3 == 0) {
                field4403++;
                return;
            }
            this.method1882((byte) 119, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static final void method1881(int arg0) {
        field4404++;
        if (class169.field2608 != null || class142.field2079 != null || class92.field1371 > 0) {
            return;
        }
        if (arg0 != -25653) {
            method1881(92);
        }
        int var1 = class235.field3796;
        if (!class311.field4995) {
            if (var1 == 1 && class173.field2721 > 0) {
                short var13 = class192.field3056[class173.field2721 - 1];
                if (var13 == 25 || var13 == 2 || var13 == 37 || var13 == 59 || var13 == 20 || var13 == 48 || var13 == 41 || var13 == 33 || var13 == 26 || var13 == 32 || var13 == 57 || var13 == 1011) {
                    int var14 = class92.field1378[class173.field2721 - 1];
                    int var15 = class180.field2830[class173.field2721 - 1];
                    class231 var16 = class201.method1398(var15, 0);
                    class29 var17 = client.method1698(var16);
                    if (var17.method149(13828096) || var17.method161(arg0 ^ 0x641C)) {
                        class205.field3213 = 0;
                        class33.field391 = false;
                        if (class169.field2608 != null) {
                            class247.method1761(class169.field2608, (byte) -117);
                        }
                        class169.field2608 = class201.method1398(var15, 0);
                        class148.field2194 = class171.field2686;
                        class191.field3031 = var14;
                        class276.field4473 = class223.field3493;
                        class247.method1761(class169.field2608, (byte) -125);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class10.field153 == 1 && class173.field2721 > 2 || class10.method62(class173.field2721 - 1, true))) {
                var1 = 2;
            }
            if (var1 == 2 && class173.field2721 > 0 || class150.field2210 == 1) {
                class300.method2017(arg0 + 25710);
            }
            if ((var1 != 1 || class173.field2721 <= 0) && class150.field2210 != 2) {
                return;
            }
            class171.method1223(arg0 + 25650);
            return;
        }
        if (var1 != 1) {
            int var2 = class50.field633;
            int var3 = class71.field1042;
            if (class45.field548 - 10 > var2 || var2 > (class89.field1332 + class45.field548 + 10) || var3 < class206.field3229 - 10 || var3 > (class206.field3229 + class249.field4040 + 10)) {
                class311.field4995 = false;
                class277.method1912(class89.field1332, arg0 ^ 0x1C80, class45.field548, class206.field3229, class249.field4040);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class45.field548;
        int var5 = class89.field1332;
        int var6 = class171.field2686;
        int var7 = class206.field3229;
        int var8 = class223.field3493;
        int var9 = -1;
        for (int var10 = 0; var10 < class173.field2721; var10++) {
            if (class298.field4758) {
                int var11 = (class173.field2721 - var10 - 1) * 15 + var7 + 33;
                if (var4 < var6 && var6 < var4 + var5 && var8 > var11 - 13 && var8 < var11 + 3) {
                    var9 = var10;
                }
            } else {
                int var12 = (class173.field2721 - var10 - 1) * 15 + (var7 + 31);
                if (var6 > var4 && var6 < (var4 + var5) && var8 > (var12 - 13) && (var12 + 3) > var8) {
                    var9 = var10;
                }
            }
        }
        if (var9 != -1) {
            class66.method436(2, var9);
        }
        class311.field4995 = false;
        class277.method1912(class89.field1332, arg0 ^ 0x1C80, class45.field548, class206.field3229, class249.field4040);
        return;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLim;I)V")
    private final void method1882(byte arg0, class170 arg1, int arg2) {
        if (arg0 != 119) {
            return;
        }
        field4406++;
        if (arg2 == 1) {
            this.field4398 = arg1.method1186((byte) -124);
            this.field4400 = arg1.method1218(101);
            this.field4399 = arg1.method1218(-77);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static void method1883(boolean arg0) {
        field4396 = null;
        field4405 = null;
        field4401 = null;
        if (arg0) {
            field4405 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)I")
    public static final int method1884(int arg0, int arg1) {
        field4395++;
        if (arg0 >= -29) {
            method1883(true);
        }
        return arg1 & 0x7F;
    }
}
