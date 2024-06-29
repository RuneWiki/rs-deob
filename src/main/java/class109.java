import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class109 {

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "[I")
    public static int[] field2039 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "[I")
    public static int[] field2038 = new int[500];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public int field2029;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public int field2032;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public int field2036;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public int field2041;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public int field2044;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public int field2047;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public int field2048;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    public int field2049;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lo;")
    public static class152 field2030;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "Lqi;")
    public static class183 field2045;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII)V")
    public static final void method711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -23480) {
            field2025 = -45;
        }
        field2043++;
        if (arg1 > class70.field1403 || arg4 < class168.field3037) {
            return;
        }
        boolean var6;
        if (class235.field4336 > arg2) {
            var6 = false;
            arg2 = class235.field4336;
        } else if (arg2 <= class40.field869) {
            var6 = true;
        } else {
            var6 = false;
            arg2 = class40.field869;
        }
        boolean var7;
        if (class235.field4336 > arg3) {
            arg3 = class235.field4336;
            var7 = false;
        } else if (class40.field869 >= arg3) {
            var7 = true;
        } else {
            var7 = false;
            arg3 = class40.field869;
        }
        if (arg1 < class168.field3037) {
            arg1 = class168.field3037;
        } else {
            class23.method161(arg3, -1, arg0, arg2, class14.field331[arg1++]);
        }
        if (arg4 <= class70.field1403) {
            class23.method161(arg3, -1, arg0, arg2, class14.field331[arg4--]);
        } else {
            arg4 = class70.field1403;
        }
        if (var6 && var7) {
            for (int var8 = arg1; var8 <= arg4; var8++) {
                int[] var9 = class14.field331[var8];
                var9[arg2] = var9[arg3] = arg0;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg1; var10 <= arg4; var10++) {
                class14.field331[var10][arg2] = arg0;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg1; var11 <= arg4; var11++) {
                class14.field331[var11][arg3] = arg0;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public static final void method712(boolean arg0) {
        class217 var1 = class232.field4266;
        synchronized (class232.field4266) {
            class40.field868 = class6.field85;
            class196.field3635++;
            class4.field61 = class190.field3532;
            class139.field2559 = class52.field1133;
            class70.field1405 = class201.field3721;
            class68.field1361 = class222.field4099;
            class175.field3141 = class167.field3009;
            class56.field1230 = class199.field3703;
            class201.field3721 = 0;
            if (!arg0) {
                method713(-84);
            }
        }
        field2034++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method713(int arg0) {
        field2038 = null;
        field2030 = null;
        field2039 = null;
        if (arg0 == 0) {
            field2045 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static final void method714(int arg0) {
        field2046++;
        try {
            if (arg0 != -26569) {
                method712(true);
            }
            if (class107.field2000 == 1) {
                int var1 = class237.field4378.method663(-1721516666);
                if (var1 > 0 && class237.field4378.method644((byte) 51)) {
                    int var2 = var1 - class157.field2848;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class237.field4378.method668(var2, (byte) -48);
                } else {
                    class237.field4378.method652(-1);
                    class237.field4378.method650(true);
                    class13.field325 = null;
                    class9.field266 = null;
                    if (class159.field2894 == null) {
                        class107.field2000 = 0;
                    } else {
                        class107.field2000 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class237.field4378.method652(-1);
            class13.field325 = null;
            class9.field266 = null;
            class159.field2894 = null;
            class107.field2000 = 0;
        }
    }
}
