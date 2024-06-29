import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class74 extends class275 {

    @OriginalMember(owner = "client!is", name = "x", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!is", name = "z", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!is", name = "B", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!is", name = "C", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!is", name = "y", descriptor = "Lbh;")
    public class307 field1109;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "[B")
    public byte[] field1111;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)[B")
    public final byte[] method539(int arg0) {
        if (arg0 < 22) {
            this.field1111 = null;
        }
        ++field1108;
        if (super.field4368) {
            throw new RuntimeException();
        } else {
            return this.field1111;
        }
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)I")
    public final int method540(int arg0) {
        ++field1110;
        if (super.field4368) {
            return 0;
        } else {
            return arg0 >= -12 ? 100 : 100;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIBII)V")
    public static final void method541(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field1112;
        int var6 = arg5 - arg4;
        int var7 = -arg0 + arg1;
        if (~var7 == -1) {
            if (~var6 != -1) {
                class510.method3085(arg4, arg5, arg0, true, arg2);
            }
        } else if (var6 == 0) {
            class213.method1584(arg0, arg2, -55, arg1, arg4);
        } else if (arg3 <= -34) {
            if (~var7 > -1) {
                var7 = -var7;
            }
            if (~var6 > -1) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg0;
                arg0 = arg4;
                int var10 = arg1;
                arg1 = arg5;
                arg4 = var9;
                arg5 = var10;
            }
            if (~arg0 < ~arg1) {
                int var11 = arg0;
                arg0 = arg1;
                int var12 = arg4;
                arg4 = arg5;
                arg1 = var11;
                arg5 = var12;
            }
            int var13 = arg4;
            int var14 = -arg0 + arg1;
            int var15 = -arg4 + arg5;
            int var16 = -(var14 >> 1);
            if (~var15 > -1) {
                var15 = -var15;
            }
            int var17 = arg5 <= arg4 ? -1 : 1;
            if (!var8) {
                for (int var18 = arg0; ~var18 >= ~arg1; ++var18) {
                    var16 += var15;
                    class103.field1521[var13][var18] = arg2;
                    if (~var16 < -1) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg1; ++var19) {
                    var16 += var15;
                    class103.field1521[var19][var13] = arg2;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }
}
