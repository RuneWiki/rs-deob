import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class class288 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public int field4559;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field4569;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public int field4567;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field4568 = 0;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field4565 = 0;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[Lqd;")
    public static class3[] field4562 = new class3[14];

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "[I")
    public static int[] field4570;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
    public abstract void method106(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIILji;Lji;IIJ)V")
    public static final void method1926(int arg0, int arg1, int arg2, int arg3, class43 arg4, class43 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class7 var10 = new class7();
        var10.field159 = arg8;
        var10.field150 = arg1 * 128 + 64;
        var10.field158 = arg2 * 128 + 64;
        var10.field153 = arg3;
        var10.field149 = arg4;
        var10.field156 = arg5;
        var10.field157 = arg6;
        var10.field162 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class269.field4298[var11][arg1][arg2] == null) {
                class269.field4298[var11][arg1][arg2] = new class6(var11, arg1, arg2);
            }
        }
        class269.field4298[arg0][arg1][arg2].field147 = var10;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1927(int arg0, int arg1, int arg2, int arg3) {
        if (class268.method1805(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class162.method1104(var4 + 1, class66.field1107[arg0][arg1][arg2] + arg3, var5 + 1) && class162.method1104(var4 + 128 - 1, class66.field1107[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class162.method1104(var4 + 128 - 1, class66.field1107[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class162.method1104(var4 + 1, class66.field1107[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
    public abstract void method104(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static final void method1928(int arg0) {
        class160.method1077(class106.field1754, -1);
        field4566++;
        int var1 = (class219.field3375 >> 10) + (class46.field656 >> 3);
        int var2 = (class293.field4624 >> 10) + (class260.field4162 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 18;
        if (arg0 >= -105) {
            return;
        }
        class230.field3653 = new int[var5];
        class143.field2195 = new int[var5][4];
        class292.field4592 = new int[var5];
        byte var6 = 8;
        class228.field3519 = new int[var5];
        class240.field3893 = new int[var5];
        class90.field1573 = new byte[var5][];
        class200.field3139 = new int[var5];
        class249.field4024 = new byte[var5][];
        class161.field2528 = new int[var5];
        class15.field233 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                int var11 = (var8 << 8) + var10;
                class230.field3653[var7] = var11;
                class292.field4592[var7] = class17.field252.method1603(-105, "m" + var8 + "_" + var10);
                class240.field3893[var7] = class17.field252.method1603(-122, "l" + var8 + "_" + var10);
                class200.field3139[var7] = class17.field252.method1603(-125, "n" + var8 + "_" + var10);
                class161.field2528[var7] = class17.field252.method1603(-114, "um" + var8 + "_" + var10);
                class228.field3519[var7] = class17.field252.method1603(-123, "ul" + var8 + "_" + var10);
                if (class200.field3139[var7] == -1) {
                    class292.field4592[var7] = -1;
                    class240.field3893[var7] = -1;
                    class161.field2528[var7] = -1;
                    class228.field3519[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class200.field3139.length; var9++) {
            class200.field3139[var9] = -1;
            class292.field4592[var9] = -1;
            class240.field3893[var9] = -1;
            class161.field2528[var9] = -1;
            class228.field3519[var9] = -1;
        }
        class30.method238(var1, var6, var2, false, true, -1592, var3, var4);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static void method1929(int arg0) {
        if (arg0 == 1) {
            field4562 = null;
            field4570 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lhc;Lta;BLhc;)V")
    public static final void method1930(class235 arg0, class262 arg1, byte arg2, class235 arg3) {
        if (arg2 <= 124) {
            method1926(48, -66, 95, 113, (class43) null, (class43) null, -46, 123, -92L);
        }
        class4.field30 = arg3;
        class26.field345 = arg0;
        field4571++;
        class227.field3460 = arg1;
        if (class26.field345 != null) {
            class275.field4387 = class26.field345.method1616(1, -12772);
        }
        if (class4.field30 != null) {
            class283.field4478 = class4.field30.method1616(1, -12772);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
    public static final int method1931(int arg0, int arg1) {
        if (arg1 == 255) {
            field4561++;
            return arg0 & 0xFF;
        } else {
            return -9;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)V")
    public abstract void method105(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1932(String arg0, byte arg1) {
        field4564++;
        class84.field1416 = arg0;
        if (class179.field2788.field479 == null) {
            return;
        }
        if (arg1 != 101) {
            method1931(106, 75);
        }
        try {
            String var2 = class179.field2788.field479.getParameter("cookieprefix");
            String var3 = class179.field2788.field479.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class237.method1628(class134.method924(false) + 94608000000L, true) + "; Max-Age=" + 94608000L;
            }
            class215.method1452("document.cookie=\"" + var5 + "\"", class179.field2788.field479, (byte) -12);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(III)V")
    public class288(int arg0, int arg1, int arg2) {
        this.field4559 = arg0;
        this.field4569 = arg2;
        this.field4567 = arg1;
    }
}
