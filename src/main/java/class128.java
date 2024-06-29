import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class128 extends class26 {

    @OriginalMember(owner = "client!jga", name = "Cb", descriptor = "I")
    public static int field1754 = 0;

    @OriginalMember(owner = "client!jga", name = "Ab", descriptor = "Ldj;")
    public static class705 field1752 = null;

    @OriginalMember(owner = "client!jga", name = "Bb", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!jga", name = "Db", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!jga", name = "Eb", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!jga", name = "Fb", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!jga", name = "Gb", descriptor = "Lmj;")
    public static class713 field1758;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(BF)V")
    public final void method820(byte arg0, float arg1) {
        ++field1757;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field279[super.field330++] = (byte) var3;
        super.field279[super.field330++] = (byte) (var3 >> 8);
        super.field279[super.field330++] = (byte) (var3 >> 16);
        super.field279[super.field330++] = (byte) (var3 >> 24);
        if (arg0 <= 74) {
            method823(-105, 53, 79, -127, 67, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(FI)V")
    public final void method821(float arg0, int arg1) {
        ++field1753;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field279[super.field330++] = (byte) (var3 >> 24);
        super.field279[super.field330++] = (byte) (var3 >> 16);
        if (arg1 == 856244488) {
            super.field279[super.field330++] = (byte) (var3 >> 8);
            super.field279[super.field330++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "(B)V")
    public static void method822(byte arg0) {
        if (arg0 == 15) {
            field1758 = null;
        }
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(I)V")
    public class128(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIIIB)V")
    public static final void method823(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field1756;
        int var6 = -arg1 + arg2;
        int var7 = -arg0 + arg4;
        if (~var7 == -1) {
            if (~var6 != -1) {
                class184.method1228(arg1, arg0, arg2, (byte) 113, arg3);
            }
        } else if (~var6 == -1) {
            class271.method1656(arg0, arg4, arg1, (byte) -1, arg3);
        } else if (arg5 == -19) {
            if (~var7 > -1) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg0;
                arg0 = arg1;
                int var10 = arg4;
                arg4 = arg2;
                arg1 = var9;
                arg2 = var10;
            }
            if (~arg4 > ~arg0) {
                int var11 = arg0;
                int var12 = arg1;
                arg0 = arg4;
                arg4 = var11;
                arg1 = arg2;
                arg2 = var12;
            }
            int var13 = arg1;
            int var14 = arg4 - arg0;
            int var15 = -arg1 + arg2;
            int var16 = -(var14 >> 1);
            int var17 = ~arg1 > ~arg2 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var18 = arg0; ~var18 >= ~arg4; ++var18) {
                    class591.field8480[var18][var13] = arg3;
                    var16 += var15;
                    if (~var16 < -1) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg0; arg4 >= var19; ++var19) {
                    var16 += var15;
                    class591.field8480[var13][var19] = arg3;
                    if (~var16 < -1) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }
}
