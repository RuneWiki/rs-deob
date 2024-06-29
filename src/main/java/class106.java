import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class106 extends class21 {

    @OriginalMember(owner = "client!de", name = "y", descriptor = "[I")
    public static int[] field2003 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Lhj;")
    public static class69 field1999 = class181.method1318("blaugr-Un:", (byte) -125);

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Lhj;")
    public static class69 field1997 = class181.method1318("Cache:", (byte) -122);

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Ltc;")
    public static class173 field1998;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Lvc;")
    public static class185 field2000;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "Log;")
    public static class210 field2002;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lnc;")
    public static class83 field1994;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public static void method799(byte arg0) {
        field1994 = null;
        field1999 = null;
        field1998 = null;
        if (arg0 <= 59) {
            method800(118, (byte) 86, -125, -87, 8);
        }
        field2003 = null;
        field2000 = null;
        field2002 = null;
        field1997 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIII)V")
    public static final void method800(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class135 var5 = class8.method38((byte) 103, 8, arg2);
        var5.method1011((byte) 122);
        field1995++;
        var5.field2539 = arg0;
        var5.field2534 = arg3;
        if (arg1 == -74) {
            var5.field2535 = arg4;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public static final void method801(int arg0) {
        int var1 = 35 % ((arg0 - 37) / 44);
        for (int var2 = 0; var2 < class229.field4200; var2++) {
            int var10002 = class59.field1077[var2]--;
            if (class59.field1077[var2] >= -10) {
                class67 var4 = class83.field1592[var2];
                if (var4 == null) {
                    var4 = class67.method430(class69.field1339, class124.field2309[var2], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class59.field1077[var2] += var4.method429();
                    class83.field1592[var2] = var4;
                }
                if (class59.field1077[var2] < 0) {
                    int var11;
                    if (class114.field2191[var2] == 0) {
                        var11 = class91.field1726;
                    } else {
                        int var5 = (class114.field2191[var2] & 0xFF) * 128;
                        int var6 = class114.field2191[var2] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class156.field2904.field3985;
                        int var8 = class114.field2191[var2] >> 8 & 0xFF;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var9 = var8 * 128 + 64 - class156.field2904.field4005;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var5 < var10) {
                            class59.field1077[var2] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var11 = (var5 - var10) * class11.field105 / var5;
                    }
                    if (var11 > 0) {
                        class174 var12 = var4.method431().method1271(class263.field4689);
                        class137 var13 = class137.method1038(var12, 100, var11);
                        var13.method1062(class220.field3956[var2] - 1);
                        class54.field959.method1787(var13);
                    }
                    class59.field1077[var2] = -100;
                }
            } else {
                class229.field4200--;
                for (int var3 = var2; var3 < class229.field4200; var3++) {
                    class124.field2309[var3] = class124.field2309[var3 + 1];
                    class83.field1592[var3] = class83.field1592[var3 + 1];
                    class220.field3956[var3] = class220.field3956[var3 + 1];
                    class59.field1077[var3] = class59.field1077[var3 + 1];
                    class114.field2191[var3] = class114.field2191[var3 + 1];
                }
                var2--;
            }
        }
        if (class119.field2251 && !class28.method162(true)) {
            if (class81.field1554 != 0 && class231.field4229 != -1) {
                class83.method616(false, class91.field1723, (byte) 27, class231.field4229, 0, class81.field1554);
            }
            class119.field2251 = false;
        } else if (class81.field1554 != 0 && class231.field4229 != -1 && !class28.method162(true)) {
            class48.field692.method301(190, -104);
            class48.field692.method908(false, class231.field4229);
            class204.field3668++;
            class231.field4229 = -1;
        }
        field2005++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)V")
    public static final void method802(boolean arg0, int arg1) {
        class237.method1672(arg0);
        field2001++;
        class153.method1160(90);
        int var2 = class109.method822(16, arg1).field3965;
        if (var2 == 0) {
            return;
        }
        int var3 = class50.field812[arg1];
        if (var2 == 9) {
            class89.field1700 = var3;
        }
        if (!arg0) {
            method801(54);
        }
        if (var2 == 6) {
            class203.field3662 = var3;
        }
        if (var2 == 5) {
            class33.field461 = var3;
        }
    }
}
