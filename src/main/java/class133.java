import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class133 extends class665 implements class121 {

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "C")
    public char field1961;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public int field1965;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "J")
    public long field1967;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
    public final int method920(byte arg0) {
        field1966++;
        if (arg0 >= -112) {
            this.method920((byte) -27);
        }
        return this.field1965;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)I")
    public final int method921(byte arg0) {
        field1964++;
        if (arg0 != 117) {
            this.field1965 = -29;
        }
        return this.field1971;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)I")
    public final int method919(int arg0) {
        field1970++;
        if (arg0 != -13589) {
            this.field1971 = 119;
        }
        return this.field1969;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II[BIII)Z")
    public static final boolean method980(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field1960++;
        boolean var6 = true;
        if (arg5 != -2) {
            method981(null, -25, -22, -108, -110, (byte) -27, -5);
        }
        class695 var7 = new class695(arg2);
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method3822(arg5 ^ 0xFFFF8001);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class550 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method3815(-32768);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method3826(false);
                                    }
                                    int var12 = var7.method3815(arg5 - 32766);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = (var10 & 0xFE2) >> 6;
                                    var15 = var7.method3826(false) >> 2;
                                    var16 = var14 + arg1;
                                    var17 = arg4 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (var16 >= (arg0 - 1));
                    } while (arg3 - 1 <= var17);
                    var18 = class101.field1572.method2617((byte) -121, var8);
                } while (var15 == 22 && !class287.field4270.field3714 && var18.field7746 == 0 && var18.field7806 != 1 && !var18.field7748);
                var11 = true;
                if (!var18.method3118((byte) -70)) {
                    var6 = false;
                    class572.field8055++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)J")
    public final long method922(int arg0) {
        field1962++;
        return arg0 <= 102 ? -127L : this.field1967;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lr;IIIIBI)Lda;")
    public static final class55 method981(class166 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1968++;
        long var7 = (long) arg3;
        class55 var9 = (class55) class485.field6902.method2287(1, var7);
        short var10 = 2055;
        if (var9 == null) {
            class461 var11 = class24.method284(arg3, (byte) 50, 0, class81.field1362);
            if (var11 == null) {
                return null;
            }
            if (var11.field6623 < 13) {
                var11.method2712(24787, 2);
            }
            var9 = arg0.method171(var11, var10, class677.field9581, 64, 768);
            class485.field6902.method2291(var9, var7, 1);
        }
        class55 var12 = var9.method532((byte) 2, var10, true);
        if (arg4 != 0) {
            var12.method540(arg4);
        }
        if (arg6 != 0) {
            var12.method522(arg6);
        }
        if (arg1 != 0) {
            var12.method494(arg1);
        }
        if (arg5 == 13) {
            if (arg2 != 0) {
                var12.method548(0, arg2, 0);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)C")
    public final char method923(int arg0) {
        if (arg0 != 8348) {
            this.method920((byte) -96);
        }
        field1963++;
        return this.field1961;
    }
}
