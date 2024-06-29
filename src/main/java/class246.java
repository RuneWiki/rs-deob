import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class246 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lsf;")
    public static class108 field4260 = class140.method973(255, "name_icons");

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[S")
    public static short[] field4263 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "F")
    public static float field4261;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lik;")
    public static class262 field4262;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[I")
    public static int[] field4264;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V", line = 14)
    public static final void method1689(int arg0, int arg1) {
        field4267++;
        class286.field5011 = 50;
        int var2 = -90 % ((34 - arg1) / 32);
        class145.field2620 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 25)
    public static void method1690(int arg0) {
        field4263 = null;
        field4262 = null;
        if (arg0 != -21791) {
            field4261 = 0.17377368F;
        }
        field4264 = null;
        field4260 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIILke;)Lke;", line = 48)
    public static final class113 method1691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class113 arg6) {
        field4266++;
        long var7 = (long) arg4;
        class113 var9 = (class113) class145.field2619.method642(var7, (byte) -88);
        if (var9 == null) {
            class230 var10 = class230.method1556(class13.field150, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1555(64, 768, -50, -10, -50);
            class145.field2619.method643((byte) -49, var7, var9);
        }
        int var11 = arg6.method292();
        int var12 = arg6.method282();
        int var13 = arg6.method289();
        if (arg3 != -14431) {
            field4260 = (class108) null;
        }
        int var14 = arg6.method314();
        class113 var15 = var9.method288(true, true);
        if (arg2 != 0) {
            var15.method306(arg2);
        }
        if (class231.field4051) {
            class148 var16 = (class148) var15;
            if (arg1 != class45.method321(121, arg5 + var13, arg0 + var11, class295.field5159) || class45.method321(-57, arg5 + var14, arg0 + var12, class295.field5159) != arg1) {
                for (int var17 = 0; var17 < var16.field2671; var17++) {
                    var16.field2692[var17] += class45.method321(113, var16.field2674[var17] + arg5, var16.field2679[var17] + arg0, class295.field5159) - arg1;
                }
                var16.field2686.field4891 = false;
                var16.field2667.field4429 = false;
            }
        } else {
            class44 var18 = (class44) var15;
            if (class45.method321(-114, arg5 + var13, arg0 + var11, class295.field5159) != arg1 || class45.method321(119, arg5 + var14, arg0 - -var12, class295.field5159) != arg1) {
                for (int var19 = 0; var19 < var18.field583; var19++) {
                    var18.field574[var19] += class45.method321(-116, var18.field599[var19] + arg5, var18.field586[var19] + arg0, class295.field5159) - arg1;
                }
                var18.field572 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 131)
    public static final void method1692(byte arg0) {
        if (arg0 <= -102) {
            field4268++;
            class215.field3811.method639(-84);
        }
    }
}
