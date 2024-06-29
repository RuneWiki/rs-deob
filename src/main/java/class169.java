import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class169 extends class183 {

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "Ldj;")
    public class44 field2923;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Ldj;")
    private static class44 field2919 = class89.method650(255, "Malformed login packet)3");

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "Ldj;")
    public static class44 field2920 = field2919;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Lih;")
    public static class95 field2914 = new class95(5);

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "[J")
    public static long[] field2925 = new long[100];

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field2924 = -1;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Lrg;")
    public static class187 field2916;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZBLve;ILve;)Lwh;")
    public static final class238 method1076(boolean arg0, byte arg1, class225 arg2, int arg3, class225 arg4) {
        if (arg1 > -121) {
            method1078(true);
        }
        field2918++;
        boolean var5 = true;
        int[] var6 = arg4.method1481(arg3, -21860);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method1462(var6[var7], 57, arg3);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg0) {
                    var10 = arg2.method1462(var9, 83, 0);
                } else {
                    var10 = arg2.method1462(0, 33, var9);
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
            return new class238(arg4, arg2, arg3, arg0);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public static void method1077(int arg0) {
        field2920 = null;
        if (arg0 == 0) {
            field2916 = null;
            field2919 = null;
            field2914 = null;
            field2925 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public static final void method1078(boolean arg0) {
        field2915++;
        for (class132 var1 = (class132) class210.field3754.method1189(0); var1 != null; var1 = (class132) class210.field3754.method1192((byte) -93)) {
            if (var1.field2361 == -1) {
                var1.field2366 = 0;
                class62.method465(false, var1);
            } else {
                var1.method1148(-13215);
            }
        }
        if (!arg0) {
            field2924 = 60;
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
    public static final void method1079(int arg0) {
        field2922++;
        if (arg0 != -14186) {
            method1079(-8);
        }
        if (class53.field946 > 0) {
            class37.method256((byte) 44);
        } else {
            class62.method467(40, (byte) 57);
            class29.field524 = class101.field1844;
            class101.field1844 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class169() {
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ldj;)V")
    public class169(class44 arg0) {
        this.field2923 = arg0;
    }
}
