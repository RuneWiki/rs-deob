import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 {

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lhe;")
    public static class54 field1814 = class6.method58("scrollbar", false);

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lhe;")
    public static class54 field1811 = class6.method58("Standort", false);

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1812 = 0;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILnc;I)Lhe;")
    public static final class54 method566(int arg0, class93 arg1, int arg2) {
        field1813++;
        if (!class86.method692(75, arg2, class105.method810(arg1, -22389)) && arg1.field2246 == null) {
            return null;
        }
        if (arg0 != -10706) {
            method568(59);
        }
        if (arg1.field2348 == null || arg1.field2348.length <= arg2 || arg1.field2348[arg2] == null || arg1.field2348[arg2].method394(126).method404(-106) == 0) {
            return class31.field804 ? class143.method1105(new class54[] { class49.field1175, class147.method1117(-67, arg2) }, arg0 + 9864) : null;
        } else {
            return arg1.field2348[arg2];
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
    public static final void method567(boolean arg0, int arg1) {
        field1810++;
        int var2 = 0;
        if (arg1 != 12981) {
            return;
        }
        while (var2 < class158.field3598) {
            class120 var3 = class111.field2679[class58.field1480[var2]];
            int var4 = (class58.field1480[var2] << 14) + 536870912;
            if (var3 != null && var3.method183(-19456) && var3.field2788.field287 == arg0 && var3.field2788.method79((byte) -43)) {
                int var5 = var3.field971 >> 7;
                int var6 = var3.field974 >> 7;
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    label79: {
                        if (var3.field948 == 1 && (var3.field974 & 0x7F) == 64 && (var3.field971 & 0x7F) == 64) {
                            if (class150.field3397[var6][var5] == class80.field1951) {
                                break label79;
                            }
                            class150.field3397[var6][var5] = class80.field1951;
                        }
                        if (!var3.field2788.field296) {
                            var4 += Integer.MIN_VALUE;
                        }
                        class74.field1831.method1049(class157.field3573, var3.field974, var3.field971, class134.method1007(var3.field974 + (var3.field948 - 1) * 64, var3.field971 - -(var3.field948 * 64) - 64, true, class157.field3573), var3.field948 * 64 + 60 - 64, var3, var3.field923, var4, var3.field994);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method568(int arg0) {
        if (arg0 != -19752) {
            field1811 = null;
        }
        class112.field2696.method992(0);
        class27.field715.method992(0);
        field1815++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lfd;")
    public static final class40 method569(int arg0, int arg1) {
        class40 var2 = (class40) class19.field569.method991((long) arg0, true);
        field1817++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -10834) {
            method567(true, -41);
        }
        byte[] var3 = class14.field399.method266(8, (byte) 115, arg0);
        class40 var4 = new class40();
        if (var3 != null) {
            var4.method302(new class83(var3), false);
        }
        class19.field569.method990(true, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static void method570(int arg0) {
        if (arg0 != 60) {
            method566(-88, null, -27);
        }
        field1814 = null;
        field1811 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)Lmb;")
    public static final class85 method571(int arg0, int arg1) {
        class85 var2 = (class85) class79.field1944.method991((long) arg1, true);
        if (arg0 != 536870912) {
            field1812 = -97;
        }
        field1816++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class94.field2384.method266(5, (byte) 107, arg1);
        class85 var4 = new class85();
        if (var3 != null) {
            var4.method687(new class83(var3), arg0 - 536870799);
        }
        class79.field1944.method990(true, (long) arg1, var4);
        return var4;
    }
}
