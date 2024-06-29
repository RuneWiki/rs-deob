import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class298 extends class293 {

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "Z")
    public static boolean field4758 = false;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4761 = "Examine";

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "B")
    public byte field4757;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "Lim;")
    public class170 field4754;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method2004(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4759;
        class231 var7 = class282.method1942(arg1, arg6, (byte) -122);
        if (var7 != null && var7.field3656 != null) {
            class122 var8 = new class122();
            var8.field1752 = var7;
            var8.field1755 = var7.field3656;
            class122.method795(var8, -116);
        }
        class288.field4653 = arg4;
        class78.field1181 = arg2;
        class304.field4829 = arg6;
        class71.field1034 = arg1;
        if (arg0) {
            field4758 = false;
        }
        class63.field911 = true;
        class122.field1757 = arg3;
        class111.field1613 = arg5;
        class247.method1761(var7, (byte) -106);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V")
    public static final void method2005(int arg0, int arg1) {
        class181.field2855 = arg0;
        class99.field1490 = 3;
        int var2 = -63 / ((-16 - arg1) / 43);
        ++field4756;
        class19.field255 = -1;
        class124.field1785 = 100;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([I[ILuk;B[I)V")
    public static final void method2006(int[] arg0, int[] arg1, class86 arg2, byte arg3, int[] arg4) {
        if (arg3 == -68) {
            ++field4760;
            for (int var5 = 0; ~arg1.length < ~var5; ++var5) {
                int var6 = arg1[var5];
                int var7 = arg4[var5];
                int var8 = arg0[var5];
                int var9 = 0;
                while (var7 != 0 && ~arg2.field3951.length < ~var9) {
                    if ((var7 & 1) != 0) {
                        if (var6 != -1) {
                            class57 var10 = class174.method1241(arg3 ^ -104, var6);
                            int var11 = var10.field839;
                            class282 var12 = arg2.field3951[var9];
                            if (var12 != null) {
                                if (var12.field4586 == var6) {
                                    if (var11 == 0) {
                                        var12 = arg2.field3951[var9] = null;
                                    } else if (var11 != 1) {
                                        if (~var11 == -3) {
                                            var12.field4594 = 0;
                                        }
                                    } else {
                                        var12.field4589 = 0;
                                        var12.field4584 = 1;
                                        var12.field4588 = 0;
                                        var12.field4594 = 0;
                                        var12.field4585 = var8;
                                        class173.method1240(arg2.field3915, arg2.field3920, -9160, false, var10, 0);
                                    }
                                } else if (~var10.field833 <= ~class174.method1241(arg3 ^ -24, var12.field4586).field833) {
                                    var12 = arg2.field3951[var9] = null;
                                }
                            }
                            if (var12 == null) {
                                class282 var13 = arg2.field3951[var9] = new class282();
                                var13.field4588 = 0;
                                var13.field4584 = 1;
                                var13.field4585 = var8;
                                var13.field4594 = 0;
                                var13.field4586 = var6;
                                var13.field4589 = 0;
                                class173.method1240(arg2.field3915, arg2.field3920, -9160, false, var10, 0);
                            }
                        } else {
                            arg2.field3951[var9] = null;
                        }
                    }
                    ++var9;
                    var7 >>>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)[B")
    public final byte[] method738(int arg0) {
        if (arg0 > -3) {
            method2005(-54, -125);
        }
        ++field4752;
        if (!super.field4700 && this.field4754.field2650.length + -this.field4757 <= this.field4754.field2676) {
            return this.field4754.field2650;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)V")
    public static final void method2007(int arg0, int arg1) {
        class164.field2542.method1514(arg1, (byte) -55);
        class231.field3624.method1514(arg1, (byte) -55);
        class36.field438.method1514(arg1, (byte) -55);
        ++field4755;
        if (arg0 != 0) {
            field4758 = false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lvl;I)V")
    public static final void method2008(class73 arg0, int arg1) {
        class66.field981 = arg0;
        ++field4751;
        class181.field2859 = class66.field981.method481(2688, arg1);
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)I")
    public final int method742(byte arg0) {
        ++field4753;
        if (arg0 != -72) {
            method2007(-119, -89);
        }
        return this.field4754 == null ? 0 : this.field4754.field2676 * 100 / (this.field4754.field2650.length - this.field4757);
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)V")
    public static void method2009(byte arg0) {
        field4761 = null;
        if (arg0 != -88) {
            method2005(93, 108);
        }
    }
}
