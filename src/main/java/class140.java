import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class140 {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
    public static int[] field2308 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "[Lng;")
    public static class73[] field2310;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[Z")
    public static boolean[] field2307;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIB)V")
    public static final void method1036(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2311++;
        class36 var5 = class136.method1013(8, arg1, (byte) -90);
        var5.method224(false);
        var5.field562 = arg0;
        if (arg4 != -11) {
            field2307 = null;
        }
        var5.field560 = arg2;
        var5.field577 = arg3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static final void method1037(int arg0) {
        class183.field2921.method97(101);
        if (arg0 == 12401) {
            field2306++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BC)Z")
    public static final boolean method1038(byte arg0, char arg1) {
        int var2 = 4 % ((-arg0 - 52) / 46);
        field2305++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static void method1039(int arg0) {
        field2310 = null;
        field2308 = null;
        field2307 = null;
        if (arg0 != 16773818) {
            method1037(-88);
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public static final void method1040(int arg0) {
        class206.method1441(arg0 - 78, class162.field2635);
        field2309++;
        class17.field337++;
        if (class3.field102 && class313.field5049) {
            int var1 = class87.field1448;
            int var2 = class96.field1558;
            int var3 = var2 - class73.field1280;
            int var4 = var1 - class205.field3285;
            if (class311.field5005 > var4) {
                var4 = class311.field5005;
            }
            if (var3 < client.field1627) {
                var3 = client.field1627;
            }
            int var5 = class162.field2635.field3479;
            if ((class311.field5005 + class78.field1324.field3481) < (class162.field2635.field3481 + var4)) {
                var4 = class311.field5005 + class78.field1324.field3481 - class162.field2635.field3481;
            }
            int var6 = var4 - class152.field2532;
            if (client.field1627 + class78.field1324.field3484 < class162.field2635.field3484 + var3) {
                var3 = client.field1627 + class78.field1324.field3484 - class162.field2635.field3484;
            }
            if (arg0 != 78) {
                field2307 = null;
            }
            int var7 = var4 + class78.field1324.field3374 - class311.field5005;
            int var8 = var3 - class216.field3651;
            int var9 = var3 + class78.field1324.field3450 - client.field1627;
            if (class17.field337 > class162.field2635.field3498 && (var5 < var8 || var8 < (-var5) || var5 < var6 || var6 < (-var5))) {
                class232.field3936 = true;
            }
            if (class162.field2635.field3400 != null && class232.field3936) {
                class303 var10 = new class303();
                var10.field4931 = class162.field2635;
                var10.field4940 = var9;
                var10.field4944 = var7;
                var10.field4935 = class162.field2635.field3400;
                class269.method1893(arg0 - 3803, var10);
            }
            if (class171.field2763 == 0) {
                if (class232.field3936) {
                    if (class162.field2635.field3441 != null) {
                        class303 var11 = new class303();
                        var11.field4937 = class312.field5023;
                        var11.field4940 = var9;
                        var11.field4944 = var7;
                        var11.field4931 = class162.field2635;
                        var11.field4935 = class162.field2635.field3441;
                        class269.method1893(arg0 ^ 0xFFFFF13D, var11);
                    }
                    if (class312.field5023 != null && client.method726(class162.field2635) != null) {
                        class145.field2391++;
                        class236.field3980.method640((byte) 97, 78);
                        class236.field3980.method1822(class312.field5023.field3369, 554582280);
                        class236.field3980.method1785((byte) -115, class162.field2635.field3405);
                        class236.field3980.method1798(class312.field5023.field3405, 124);
                        class236.field3980.method1778(class162.field2635.field3369, -13989);
                    }
                } else if ((class20.field375 == 1 || class174.method1284(arg0 ^ 0xFEF, class287.field4747 - 1)) && class287.field4747 > 2) {
                    class1.method7(-13055);
                } else if (class287.field4747 > 0) {
                    class6.method45(2);
                }
                class162.field2635 = null;
            }
        } else if (class17.field337 > 1) {
            class162.field2635 = null;
        }
    }
}
