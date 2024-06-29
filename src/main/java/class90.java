import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class90 extends class120 {

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "[B")
    public byte[] field2044;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public static int field2035 = 0;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "Lva;")
    private static class121 field2033 = class107.method797("Prepared visibility map", -10983);

    @OriginalMember(owner = "client!p", name = "R", descriptor = "Lva;")
    public static class121 field2036 = field2033;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "[Llb;")
    public static class68[] field2039 = new class68[50];

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field2038 = -1;

    @OriginalMember(owner = "client!p", name = "db", descriptor = "I")
    public static int field2048 = 0;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "Lva;")
    private static class121 field2042 = class107.method797("Click to continue", -10983);

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "[I")
    public static int[] field2045 = new int[2000];

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field2047 = -1;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "Lva;")
    public static class121 field2046 = field2042;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "Lw;")
    public static class125 field2049;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBLme;II)V", line = 12)
    public static final void method611(int arg0, byte arg1, class77 arg2, int arg3, int arg4) {
        field2037++;
        if (class62.field1494 == arg2 || class26.field654 >= 400) {
            return;
        }
        class121 var5;
        if (arg2.field1762 == 0) {
            var5 = class113.method866((byte) -103, new class121[] { arg2.field1766, class47.method338(0, arg2.field1770, class62.field1494.field1770), class84.field1942, class28.field712, class35.method242(arg2.field1770, 10), class64.field1563 });
        } else {
            var5 = class113.method866((byte) -106, new class121[] { arg2.field1766, class84.field1942, class5.field92, class35.method242(arg2.field1762, 10), class64.field1563 });
        }
        if (class114.field2564 == 1) {
            class129.method1005(arg3, arg0, 31, arg4, class113.method866((byte) -124, new class121[] { class121.field2828, class27.field687, class45.field1054, class67.field1599, var5 }), -56);
            class119.field2697++;
        } else if (class22.field573 != 1) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class78.field1800[var6] != null) {
                    short var7 = 0;
                    if (class78.field1800[var6].method940(class45.field1039, (byte) 3)) {
                        if (class62.field1494.field1770 < arg2.field1770) {
                            var7 = 2000;
                        }
                        if (class62.field1494.field1777 != 0 && arg2.field1777 != 0) {
                            if (class62.field1494.field1777 == arg2.field1777) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class67.field1617[var6]) {
                        var7 = 2000;
                    }
                    class13.field243++;
                    int var8 = 0;
                    if (var6 == 0) {
                        var8 = var7 + 52;
                    }
                    if (var6 == 1) {
                        var8 = var7 + 47;
                    }
                    if (var6 == 2) {
                        var8 = var7 + 19;
                    }
                    if (var6 == 3) {
                        var8 = var7 + 5;
                    }
                    if (var6 == 4) {
                        var8 = var7 + 25;
                    }
                    class129.method1005(arg3, arg0, var8, arg4, class113.method866((byte) -48, new class121[] { class78.field1800[var6], class80.field1855, var5 }), -87);
                }
            }
        } else if ((class107.field2426 & 0x8) == 8) {
            class129.method1005(arg3, arg0, 54, arg4, class113.method866((byte) -86, new class121[] { class59.field1407, class67.field1599, var5 }), -50);
            class78.field1832++;
        }
        if (arg1 >= -16) {
            return;
        }
        for (int var9 = 0; var9 < class26.field654; var9++) {
            if (class35.field844[var9] == 13) {
                class21.field564[var9] = class113.method866((byte) -126, new class121[] { class27.field688, class80.field1855, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLhe;Lhe;)V", line = 129)
    public static final void method612(byte arg0, class47 arg1, class47 arg2) {
        class67.field1610 = arg1;
        class1.field2 = arg2;
        field2032++;
        class63.field1535 = class67.field1610.method328(3, false);
        if (arg0 != -59) {
            field2035 = 83;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 147)
    public static final void method613(int arg0) {
        field2034++;
        try {
            if (arg0 != 4) {
                method613(83);
            }
            Graphics var1 = class46.field1079.getGraphics();
            class128.field2946.method196(-5917, 4, 4, var1);
        } catch (Exception var2) {
            class46.field1079.repaint();
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I", line = 170)
    public static int method614(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([B)V", line = 189)
    public class90(byte[] arg0) {
        this.field2044 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Z", line = 199)
    public static final boolean method615(int arg0, int arg1) {
        field2040++;
        if (arg1 != 8159) {
            field2046 = null;
        }
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V", line = 227)
    public static void method616(boolean arg0) {
        field2036 = null;
        field2046 = null;
        field2049 = null;
        field2045 = null;
        if (!arg0) {
            method616(true);
        }
        field2033 = null;
        field2042 = null;
        field2039 = null;
    }
}
