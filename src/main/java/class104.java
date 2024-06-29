import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class104 {

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
    public static int[] field2011 = new int[25];

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Lcc;")
    private static class209 field2013 = class95.method669(99, " is already on your ignore list)3");

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Lcc;")
    public static class209 field2007 = field2013;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Lcc;")
    public static class209 field2016 = class95.method669(112, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field2017 = 0;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lpb;")
    public class126 field2012;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Log;")
    public static class220 field2006;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Lsj;")
    public static class49 field2008;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method708(int arg0) {
        field2016 = null;
        field2013 = null;
        field2011 = null;
        if (arg0 == -1421) {
            field2006 = null;
            field2007 = null;
            field2008 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)Z")
    public static final boolean method709(int arg0, boolean arg1) {
        if (arg1) {
            method710(-108, 34, (class49) null, (class49) null, true);
        }
        field2010++;
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILsj;Lsj;Z)Laj;")
    public static final class47 method710(int arg0, int arg1, class49 arg2, class49 arg3, boolean arg4) {
        field2014++;
        boolean var5 = true;
        if (arg0 != -10240) {
            method708(66);
        }
        int[] var6 = arg2.method357((byte) -53, arg1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method361(24, var6[var7], arg1);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg4) {
                    var10 = arg3.method361(arg0 + 10283, var9, 0);
                } else {
                    var10 = arg3.method361(79, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class47(arg2, arg3, arg1, arg4);
        } catch (Exception var11) {
            return null;
        }
    }
}
