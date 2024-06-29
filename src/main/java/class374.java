import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class374 extends class369 {

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 5)
    public static final String method2280(String arg0, boolean arg1) {
        ++field5383;
        int var2 = arg0.length();
        int var3 = 0;
        if (!arg1) {
            field5382 = 62;
        }
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            char var8 = arg0.charAt(var4);
            if (~var8 == -61 || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; ~var6 > ~var2; ++var6) {
            char var7 = arg0.charAt(var6);
            if (~var7 == -61) {
                var5.append("<lt>");
            } else if (var7 != '>') {
                var5.append(var7);
            } else {
                var5.append("<gt>");
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIIIF)V", line = 59)
    public class374(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V", line = 64)
    public static final void method2281(int arg0) {
        ++field5387;
        class316.field4697.method2990((byte) -72);
        class425.field6026.method2990((byte) -63);
        int var1 = 44 % ((46 - arg0) / 55);
        class248.field3697.method2990((byte) -60);
        class260.field3847.method2990((byte) -68);
        class316.field4701.method2990((byte) -117);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIII)V", line = 80)
    public final void method1507(byte arg0, int arg1, int arg2, int arg3) {
        super.field5332 = arg1;
        super.field5323 = arg2;
        ++field5386;
        super.field5321 = arg3;
        int var5 = -34 % ((arg0 - 24) / 54);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)V", line = 94)
    public static final void method2282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5385;
        int var6 = -arg0 + arg2;
        int var7 = -arg4 + arg1;
        if (~var7 == -1) {
            if (~var6 != -1) {
                class190.method1295(arg3, arg0, 78, arg4, arg2);
            }
        } else if (var6 == 0) {
            class221.method1505(arg4, arg1, arg0, (byte) 73, arg3);
        } else {
            if (~var7 > -1) {
                var7 = -var7;
            }
            if (~var6 > -1) {
                var6 = -var6;
            }
            boolean var8 = ~var6 < ~var7;
            if (var8) {
                int var9 = arg4;
                arg4 = arg0;
                int var10 = arg1;
                arg0 = var9;
                arg1 = arg2;
                arg2 = var10;
            }
            if (arg1 < arg4) {
                int var11 = arg4;
                arg4 = arg1;
                int var12 = arg0;
                arg0 = arg2;
                arg1 = var11;
                arg2 = var12;
            }
            int var13 = arg0;
            int var14 = -arg4 + arg1;
            int var15 = arg2 - arg0;
            int var16 = -(var14 >> 1);
            if (var15 < arg5) {
                var15 = -var15;
            }
            int var17 = arg0 < arg2 ? 1 : -1;
            if (var8) {
                for (int var18 = arg4; arg1 >= var18; ++var18) {
                    class271.field4078[var18][var13] = arg3;
                    var16 += var15;
                    if (~var16 < -1) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg4; ~arg1 <= ~var19; ++var19) {
                    var16 += var15;
                    class271.field4078[var13][var19] = arg3;
                    if (~var16 < -1) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BF)V", line = 208)
    public final void method1509(byte arg0, float arg1) {
        ++field5384;
        super.field5331 = arg1;
        if (arg0 != -88) {
            method2281(110);
        }
    }
}
