import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class125 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1857 = 0;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Z")
    public static boolean field1865 = false;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Llf;")
    public static class211 field1858 = new class211(500);

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Ldl;")
    public static class123 field1866;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1862++;
        int var7 = class34.method273(class189.field2984, arg4, false, class110.field1669);
        int var8 = class34.method273(class189.field2984, arg2, false, class110.field1669);
        int var9 = class34.method273(class96.field1484, arg6, false, class51.field710);
        if (arg1 != -18143) {
            return;
        }
        int var10 = class34.method273(class96.field1484, arg0, false, class51.field710);
        int var11 = class34.method273(class189.field2984, arg4 + arg5, false, class110.field1669);
        int var12 = class34.method273(class189.field2984, arg2 - arg5, false, class110.field1669);
        for (int var13 = var7; var13 < var11; var13++) {
            class8.method52(var9, class106.field1637[var13], var10, arg3, true);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class8.method52(var9, class106.field1637[var14], var10, arg3, true);
        }
        int var15 = class34.method273(class96.field1484, arg6 + arg5, false, class51.field710);
        int var16 = class34.method273(class96.field1484, arg0 - arg5, false, class51.field710);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class106.field1637[var17];
            class8.method52(var9, var18, var15, arg3, true);
            class8.method52(var16, var18, var10, arg3, true);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLlj;)Ljc;")
    public static final class239 method848(byte arg0, class25 arg1) {
        int var2 = 51 / ((-arg0 - 77) / 39);
        field1863++;
        return new class239(arg1.method226(255), arg1.method226(255), arg1.method226(255), arg1.method226(255), arg1.method215((byte) 109), arg1.method215((byte) 120), arg1.method201(255));
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method849(int arg0) {
        field1866 = null;
        field1858 = null;
        if (arg0 > -103) {
            field1857 = -17;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
    public static final void method850(int arg0, int arg1, int arg2) {
        if (arg1 >= -17) {
            method851(81, 123);
        }
        for (int var3 = 0; var3 < class204.field3191; var3++) {
            class185 var4 = class222.method1510(-6822, var3);
            if (var4 != null) {
                int var5 = var4.field2898;
                if (var5 >= 0 && !class171.field2689.method261(var5, -49)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field2905 >= 0) {
                    int var10 = var4.field2905;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 & 0x380) + (var10 + arg0 & 0xFC00) + var11;
                    var6 = class171.field2676[class261.method1793(var12, 102, 96)];
                } else if (var5 >= 0) {
                    var6 = class171.field2676[class261.method1793(class171.field2689.method259((byte) 34, var5), 110, 96)];
                } else if (var4.field2902 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field2902;
                    int var8 = (var7 & 0x7F) + arg2;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg0 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class171.field2676[class261.method1793(var9, 73, 96)];
                }
                class1.field13[var3 + 1] = var6;
            }
        }
        field1864++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method851(int arg0, int arg1) {
        field1859++;
        if (arg1 == 100 && class111.field1686 > 0) {
            byte[] var2 = class115.field1703[--class111.field1686];
            class115.field1703[class111.field1686] = null;
            return var2;
        } else if (arg1 == 5000 && class67.field941 > 0) {
            byte[] var3 = class168.field2607[--class67.field941];
            class168.field2607[class67.field941] = null;
            return var3;
        } else {
            if (arg0 > -49) {
                field1858 = null;
            }
            if (arg1 == 30000 && class173.field2715 > 0) {
                byte[] var4 = class46.field584[--class173.field2715];
                class46.field584[class173.field2715] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method852(byte arg0) {
        field1860++;
        if (arg0 != 52) {
            field1866 = null;
        }
        String var1;
        if (class66.field921 == 1 && class245.field3920 < 2) {
            var1 = class218.field3547 + class223.field3604 + class53.field736 + " ->";
        } else if (class45.field572 && class245.field3920 < 2) {
            var1 = class30.field399 + class223.field3604 + class155.field2307 + " ->";
        } else if (class129.field1890 && class123.field1844[81] && class245.field3920 > 2) {
            var1 = class102.method674(-19736, class245.field3920 - 2);
        } else {
            var1 = class102.method674(-19736, class245.field3920 - 1);
        }
        if (class245.field3920 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class245.field3920 - 2) + class198.field3110;
        }
        return var1;
    }
}
