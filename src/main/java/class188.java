import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class188 extends class210 {

    @OriginalMember(owner = "client!u", name = "y", descriptor = "Ljd;")
    private static class92 field3556 = class202.method1325((byte) 90, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!u", name = "C", descriptor = "Ljd;")
    public static class92 field3560 = field3556;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "Ljd;")
    public static class92 field3570 = class202.method1325((byte) 90, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!u", name = "I", descriptor = "J")
    public static volatile long field3566 = 0L;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "Ljd;")
    public static class92 field3578 = class202.method1325((byte) 90, "<col=ff7000>");

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public int field3549;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public int field3552;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public int field3554;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public int field3577;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Lmh;")
    public class124 field3555;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "Lof;")
    public class140 field3568;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "Lvf;")
    public class203 field3574;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Lha;")
    public class71 field3551;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[La;")
    public static class1[] field3547;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public static void method1209(int arg0) {
        field3556 = null;
        field3578 = null;
        field3547 = null;
        field3560 = null;
        if (arg0 != 3) {
            method1212(-74, -63);
        }
        field3570 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Z")
    public static final boolean method1210(int arg0, int arg1) {
        field3567++;
        if (class155.field3089[arg1]) {
            return true;
        } else if (class190.field3673.method898(arg1, (byte) -89)) {
            int var2 = class190.field3673.method886(122, arg1);
            if (var2 == 0) {
                class155.field3089[arg1] = true;
                return true;
            }
            if (class60.field1256[arg1] == null) {
                class60.field1256[arg1] = new class1[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class60.field1256[arg1][var3] == null) {
                    byte[] var4 = class190.field3673.method899((byte) 87, arg1, var3);
                    if (var4 != null) {
                        class60.field1256[arg1][var3] = new class1();
                        class60.field1256[arg1][var3].field100 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class60.field1256[arg1][var3].method9(new class70(var4), 3);
                        } else {
                            class60.field1256[arg1][var3].method3(1, new class70(var4));
                        }
                    }
                }
            }
            if (arg0 != -18040) {
                field3566 = 102L;
            }
            class155.field3089[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lrd;I)V")
    public static final void method1211(class165 arg0, int arg1) {
        field3548++;
        if (class74.field1559 == 1) {
            short var2 = 280;
            if (var2 <= class31.field705 && class31.field705 <= var2 + 14 && class81.field1645 >= 4 && class81.field1645 <= 18) {
                class73.method513((byte) -78, 0, 0);
                return;
            }
            if (var2 + 15 <= class31.field705 && class31.field705 <= var2 + 80 && class81.field1645 >= 4 && class81.field1645 <= 18) {
                class73.method513((byte) -103, 0, 1);
                return;
            }
            short var3 = 390;
            if (class31.field705 >= var3 && var3 + 14 >= class31.field705 && class81.field1645 >= 4 && class81.field1645 <= 18) {
                class73.method513((byte) -79, 1, 0);
                return;
            }
            if (class31.field705 >= var3 + 15 && class31.field705 <= var3 + 80 && class81.field1645 >= 4 && class81.field1645 <= 18) {
                class73.method513((byte) -116, 1, 1);
                return;
            }
            short var4 = 500;
            if (var4 <= class31.field705 && class31.field705 <= var4 + 14 && class81.field1645 >= 4 && class81.field1645 <= 18) {
                class73.method513((byte) 112, 2, 0);
                return;
            }
            if (class31.field705 >= var4 + 15 && var4 + 80 >= class31.field705 && class81.field1645 >= 4 && class81.field1645 <= 18) {
                class73.method513((byte) 114, 2, 1);
                return;
            }
            short var5 = 610;
            if (var5 <= class31.field705 && class31.field705 <= var5 + 14 && class81.field1645 >= 4 && class81.field1645 <= 18) {
                class73.method513((byte) 88, 3, 0);
                return;
            }
            if (var5 + 15 <= class31.field705 && class31.field705 <= var5 + 80 && class81.field1645 >= 4 && class81.field1645 <= 18) {
                class73.method513((byte) -81, 3, 1);
                return;
            }
            if (class31.field705 >= 708 && class81.field1645 >= 4 && class31.field705 <= 758 && class81.field1645 <= 20) {
                class59.field1230 = false;
                class21.field512.method1092(0, 0);
                class129.field2599.method1092(382, 0);
                class94.field1900.method1145(382 - class94.field1900.field3354 / 2, 18);
                return;
            }
            if (class81.field1632 != -1) {
                class32 var6 = class148.field2942[class81.field1632];
                if (class103.field2127 == var6.field720) {
                    byte[] var7 = class77.method529(-3, new class92[] { var6.field719, class33.field736 }).method623((byte) 99);
                    class64.field1307 = new String(var7, 0, var7.length);
                    class77.field1606 = var6.field730;
                    if (class98.field1996 != 0) {
                        class162.field3178 = 443;
                        class98.field1996 = 0;
                        class135.field2708 = 43594;
                        class102.field2097 = 43594;
                    }
                    class59.field1230 = false;
                    class21.field512.method1092(0, 0);
                    class129.field2599.method1092(382, 0);
                    class94.field1900.method1145(382 - class94.field1900.field3354 / 2, 18);
                    return;
                }
                class92 var8 = class77.method529(-3, new class92[] { class162.field3181, var6.field719, class33.field736, class3.field190, class79.field1610, class142.method938(class115.field2339 ? 1 : 0, false), class131.field2626, class142.method938(class158.field3137, false), class170.field3326, class142.method938(class42.field927, false) });
                try {
                    arg0.getAppletContext().showDocument(var8.method639((byte) 108), "_self");
                } catch (Exception var9) {
                }
            }
        }
        if (arg1 <= 21) {
            field3571 = 1;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)V")
    public static final void method1212(int arg0, int arg1) {
        field3576++;
        if (method1210(-18040, arg0)) {
            class49.method300(class60.field1256[arg0], (byte) -89, -1);
            int var2 = 46 / ((-arg1 - 4) / 57);
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
    public final void method1213(int arg0) {
        this.field3574 = null;
        this.field3555 = null;
        this.field3568 = null;
        this.field3551 = null;
        if (arg0 != 0) {
            this.field3577 = -95;
        }
        field3557++;
    }
}
