import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class68 {

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lrf;")
    public static class163 field1429 = class53.method392(48, "headicons_hint");

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Lrf;")
    public static class163 field1426 = class53.method392(71, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Lrf;")
    private static class163 field1428 = class53.method392(92, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field1425 = 0;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Lrf;")
    public static class163 field1427 = field1428;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Lu;")
    public static class184 field1430;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lu;")
    public static class184 field1431;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)I")
    public static final int method483(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg2 >= -116) {
            field1424 = -26;
        }
        field1433++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static final void method484(int arg0) {
        class141.field2896.method326(104, 211);
        if (arg0 != -1379) {
            field1431 = null;
        }
        field1432++;
        class141.field2896.method373((byte) -52, 0L);
        class138.field2846++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI[Lig;)V")
    public static final void method485(boolean arg0, int arg1, class84[] arg2) {
        int var3 = 0;
        if (!arg0) {
            return;
        }
        while (var3 < arg2.length) {
            class84 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field1755 == 0) {
                    if (var4.field1804 != null) {
                        method485(true, arg1, var4.field1804);
                    }
                    class87 var5 = (class87) class138.field2847.method465((long) var4.field1782, (byte) -30);
                    if (var5 != null) {
                        class31.method208(arg1, var5.field1903, (byte) -127);
                    }
                }
                if (arg1 == 0 && var4.field1731 != null) {
                    class118 var6 = new class118();
                    var6.field2500 = var4;
                    var6.field2502 = var4.field1731;
                    class64.method458((byte) -104, var6);
                }
                if (arg1 == 1 && var4.field1819 != null) {
                    label67: {
                        if (var4.field1758 >= 0) {
                            class84 var7 = class138.method907(var4.field1782, !arg0);
                            if (var7 == null || var7.field1804 == null || var4.field1758 >= var7.field1804.length || var7.field1804[var4.field1758] != var4) {
                                break label67;
                            }
                        }
                        class118 var8 = new class118();
                        var8.field2502 = var4.field1819;
                        var8.field2500 = var4;
                        class64.method458((byte) -80, var8);
                    }
                }
            }
            var3++;
        }
        field1423++;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static void method486(int arg0) {
        field1430 = null;
        field1431 = null;
        if (arg0 == -26458) {
            field1429 = null;
            field1426 = null;
            field1428 = null;
            field1427 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(IIII)V")
    public static final void method487(int arg0, int arg1, int arg2, int arg3) {
        class111 var4 = class97.field2054[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class122 var5 = var4.field2346;
        if (var5 != null) {
            var5.field2569 = var5.field2569 * arg3 / 16;
            var5.field2568 = var5.field2568 * arg3 / 16;
        }
    }
}
