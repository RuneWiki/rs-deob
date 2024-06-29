import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class87 extends class25 {

    @OriginalMember(owner = "client!dg", name = "kc", descriptor = "I")
    public static int field1317 = 0;

    @OriginalMember(owner = "client!dg", name = "ic", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!dg", name = "jc", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!dg", name = "lc", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!dg", name = "mc", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!dg", name = "nc", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!dg", name = "pc", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!dg", name = "sc", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!dg", name = "tc", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!dg", name = "uc", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!dg", name = "vc", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!dg", name = "wc", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!dg", name = "qc", descriptor = "Lsk;")
    public class189 field1323;

    @OriginalMember(owner = "client!dg", name = "rc", descriptor = "Ljk;")
    public static class297 field1324;

    @OriginalMember(owner = "client!dg", name = "oc", descriptor = "[I")
    public static int[] field1321;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)I")
    public final int method172(byte arg0) {
        ++field1315;
        if (~class246.field3836 != -1 && this.field1323.field2829 != null) {
            class189 var2 = this.field1323.method1257(-32207);
            if (var2 != null && var2.field2846 != -1) {
                return var2.field2846;
            }
        }
        if (arg0 != -89) {
            this.method32(-49, -46, -113, -71, -111);
        }
        return super.field436;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)Z")
    public final boolean method173(byte arg0) {
        ++field1327;
        if (arg0 != 109) {
            return true;
        } else {
            return this.field1323 != null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1316;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
    public static final void method661(byte arg0) {
        ++field1326;
        while (class173.field2543.method1542(arg0 ^ 17, class45.field784) >= 11) {
            int var1 = class173.field2543.method1544(-45, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class166.field2438[var1] == null) {
                class166.field2438[var1] = new class224();
                var2 = true;
                if (class85.field1302[var1] != null) {
                    class166.field2438[var1].method1527(class85.field1302[var1], (byte) 45);
                }
            }
            class205.field3068[class266.field4155++] = var1;
            class224 var3 = class166.field2438[var1];
            var3.field486 = class120.field1794;
            int var4 = class67.field1099[class173.field2543.method1544(106, 3)];
            if (var2) {
                var3.field484 = var3.field471 = var4;
            }
            int var5 = class173.field2543.method1544(-112, 1);
            if (~var5 == -2) {
                class148.field2149[class165.field2426++] = var1;
            }
            int var6 = class173.field2543.method1544(-17, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class173.field2543.method1544(arg0 + -134, 1);
            int var8 = class173.field2543.method1544(125, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1528(var7 == 1, class185.field2687.field493[0] - -var8, class185.field2687.field449[0] + var6, 79);
        }
        class173.field2543.method1538((byte) 116);
        if (arg0 != 25) {
            field1321 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public static void method662(boolean arg0) {
        if (arg0) {
            field1321 = null;
            field1324 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V")
    public static final void method663(int arg0, int arg1) {
        ++field1320;
        class105 var2 = class9.method72(8, -1, arg1);
        if (arg0 != 15) {
            method662(true);
        }
        var2.method764((byte) -119);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljk;B)Ljk;")
    public static final class297 method664(class297 arg0, byte arg1) {
        ++field1322;
        class297 var2 = client.method329(arg0);
        if (var2 == null) {
            var2 = arg0.field4664;
        }
        if (arg1 <= 76) {
            method661((byte) 93);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIJILaa;)V")
    public final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class31 arg10) {
        ++field1328;
        if (this.field1323 != null) {
            class220 var13 = super.field483 != -1 && super.field475 == 0 ? class108.method781(super.field483, -1) : null;
            class220 var14 = super.field399 == -1 || super.field399 == this.method165((byte) -91).field1651 && var13 != null ? null : class108.method781(super.field399, -1);
            class2 var15 = this.field1323.method1262(super.field453, super.field405, super.field485, var13, (byte) 57, super.field422, super.field456, var14, super.field437, super.field412);
            if (var15 != null) {
                super.field414 = var15.method19();
                class189 var16 = this.field1323;
                if (var16.field2829 != null) {
                    var16 = var16.method1257(-32207);
                }
                if (class134.field1967 && var16.field2848) {
                    class2 var17 = class62.method514(super.field425, this.field1323.field2860, var15, this.field1323.field2813, this.field1323.field2839, this.field1323.field2812, super.field398, arg0, var14 != null ? var14 : var13, this.field1323.field2840, super.field455, var14 != null ? super.field405 : super.field412, super.field411, 125);
                    var17.method22(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field421);
                }
                this.method175(20219, var15);
                this.method166(arg0, var15, (byte) -22);
                class2 var18 = null;
                if (super.field491 != -1 && ~super.field488 != 0) {
                    class104 var19 = class296.method1957(super.field491, true);
                    var18 = var19.method757(super.field460, super.field488, (byte) -102, super.field459);
                    if (var18 != null) {
                        var18.method39(0, -super.field415, 0);
                        if (var19.field1525) {
                            if (class63.field1061 != 0) {
                                var18.method24(class63.field1061);
                            }
                            if (~class131.field1930 != -1) {
                                var18.method10(class131.field1930);
                            }
                            if (~class283.field4332 != -1) {
                                var18.method39(0, class283.field4332, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class263) var15).method1790(var18);
                }
                if (this.field1323.field2813 == 1) {
                    var15.field35 = true;
                }
                var15.method22(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field421);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1325;
        if (this.field1323 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lsk;B)V")
    public final void method665(class189 arg0, byte arg1) {
        this.field1323 = arg0;
        if (super.field421 != null) {
            super.field421.method213();
        }
        ++field1329;
        if (arg1 >= -46) {
            field1317 = -41;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()I")
    public final int method19() {
        ++field1319;
        return super.field414;
    }
}
