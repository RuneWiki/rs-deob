import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class23 extends class252 {

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "Lnj;")
    public class150 field433;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field431 = 0;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Lkk;")
    public static final class254 method186(byte arg0, int arg1) {
        field434++;
        class254 var2 = (class254) class63.field1010.method1879(8887, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class247.field3885.method1156(32, arg1, (byte) -16);
        int var4 = 64 / ((30 - arg0) / 45);
        class254 var5 = new class254();
        if (var3 != null) {
            var5.method1721(new class274(var3), 0);
        }
        var5.method1719((byte) -37);
        class63.field1010.method1883((long) arg1, -66, var5);
        return var5;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
    public static final void method187(byte arg0) {
        if (arg0 != -44) {
            method188((class62) null, 30, -117);
        }
        for (int var1 = 0; var1 < class162.field2647; var1++) {
            int var10002 = class199.field3193[var1]--;
            if (class199.field3193[var1] >= -10) {
                class279 var3 = class4.field98[var1];
                if (var3 == null) {
                    var3 = class279.method1900(class53.field772, class233.field3647[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class199.field3193[var1] += var3.method1899();
                    class4.field98[var1] = var3;
                }
                if (class199.field3193[var1] < 0) {
                    int var10;
                    if (class12.field229[var1] == 0) {
                        var10 = class188.field3085[var1] * class129.field2066 >> 8;
                    } else {
                        int var4 = (class12.field229[var1] & 0xFF) * 128;
                        int var5 = class12.field229[var1] >> 16 & 0xFF;
                        int var6 = (class12.field229[var1] & 0xFF98) >> 8;
                        int var7 = var6 * 128 + 64 - class217.field3408.field929;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 * 128 + 64 - class217.field3408.field994;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 + var8 - 128;
                        if (var4 < var9) {
                            class199.field3193[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class66.field1067 * class188.field3085[var1] / var4 >> 8;
                    }
                    if (var10 > 0) {
                        class126 var11 = var3.method1901().method867(class197.field3171);
                        class222 var12 = class222.method1532(var11, 100, var10);
                        var12.method1521(class68.field1087[var1] - 1);
                        class89.field1397.method1353(var12);
                    }
                    class199.field3193[var1] = -100;
                }
            } else {
                class162.field2647--;
                for (int var2 = var1; var2 < class162.field2647; var2++) {
                    class233.field3647[var2] = class233.field3647[var2 + 1];
                    class4.field98[var2] = class4.field98[var2 + 1];
                    class68.field1087[var2] = class68.field1087[var2 + 1];
                    class199.field3193[var2] = class199.field3193[var2 + 1];
                    class12.field229[var2] = class12.field229[var2 + 1];
                    class188.field3085[var2] = class188.field3085[var2 + 1];
                }
                var1--;
            }
        }
        field432++;
        if (class85.field1355 && !class88.method613((byte) -87)) {
            if (class44.field654 != 0 && class215.field3393 != -1) {
                class251.method1707(-28138, false, class215.field3393, class44.field654, class203.field3290, 0);
            }
            class85.field1355 = false;
        } else if (class44.field654 != 0 && class215.field3393 != -1 && !class88.method613((byte) -87)) {
            class311.field5027.method2081(false, 247);
            class311.field5027.method1831(class215.field3393, arg0 + 119690484);
            class215.field3393 = -1;
            class271.field4360++;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lvb;II)V")
    public static final void method188(class62 arg0, int arg1, int arg2) {
        field429++;
        if (class274.field4472 < arg0.field912) {
            class298.method2045(arg0, 75);
        } else if (class274.field4472 <= arg0.field967) {
            class271.method1800(arg0, (byte) -110);
        } else {
            class242.method1643(-18047, arg0);
        }
        if (arg0.field994 < 128 || arg0.field929 < 128 || arg0.field994 >= 13184 || arg0.field929 >= 13184) {
            arg0.field995 = -1;
            arg0.field967 = 0;
            arg0.field900 = -1;
            arg0.field912 = 0;
            arg0.field994 = arg0.field965[0] * 128 + (arg0.method101(false) * 64);
            arg0.field929 = arg0.field956[0] * 128 + (arg0.method101(false) * 64);
            arg0.method404((byte) -78);
        }
        if (arg2 != 24866) {
            field431 = -15;
        }
        if (class217.field3408 == arg0 && (arg0.field994 < 1536 || arg0.field929 < 1536 || arg0.field994 >= 11776 || arg0.field929 >= 11776)) {
            arg0.field967 = 0;
            arg0.field995 = -1;
            arg0.field900 = -1;
            arg0.field912 = 0;
            arg0.field994 = arg0.field965[0] * 128 + arg0.method101(false) * 64;
            arg0.field929 = arg0.field956[0] * 128 + (arg0.method101(false) * 64);
            arg0.method404((byte) -78);
        }
        class121.method834(64, arg0);
        class34.method256(-61, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lnj;)V")
    public class23(class150 arg0) {
        this.field433 = arg0;
    }
}
