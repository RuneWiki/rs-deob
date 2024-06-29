import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class86 extends class353 {

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Lefa;")
    public static class322 field1336 = new class322(64);

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field1344 = -1;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Lau;")
    public static class692 field1341 = new class692(4);

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILqda;I)V", line = 5)
    public final void method484(int arg0, class689 arg1, int arg2) {
        ++field1345;
        super.field5242.method3011(arg0 ^ -7944, arg1);
        super.field5242.method3037(arg2, true);
        if (arg0 != 8056) {
            method488((byte) -79, (String) null);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IZ)V", line = 21)
    public final void method485(int arg0, boolean arg1) {
        if (arg0 < 1) {
            field1341 = null;
        }
        ++field1342;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZI)V", line = 33)
    public final void method486(int arg0, boolean arg1, int arg2) {
        ++field1339;
        if (arg1) {
            field1336 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lew;ZILjava/lang/String;Z)V", line = 46)
    public static final void method487(class226 arg0, boolean arg1, int arg2, String arg3, boolean arg4) {
        ++field1338;
        if (arg2 != 2) {
            field1341 = null;
        }
        if (!arg1) {
            class578.method3322(arg3, 3, arg0, -25640);
        } else {
            if (class226.field2996.startsWith("win") && arg0.field3004) {
                String var5 = null;
                if (class551.field8116 != null) {
                    var5 = class551.field8116.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class254 var6 = class578.method3322(arg3, 0, arg0, -25640);
                    class283.field3776 = arg0;
                    class118.field1761 = arg3;
                    class551.field8117 = var6;
                    return;
                }
            }
            if (class226.field2996.startsWith("mac")) {
                String var7 = null;
                if (class551.field8116 != null) {
                    var7 = class551.field8116.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg4) {
                    class578.method3322(arg3, 1, arg0, arg2 ^ -25638);
                    return;
                }
            }
            class578.method3322(arg3, 2, arg0, -25640);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 114)
    public static final boolean method488(byte arg0, String arg1) {
        if (arg0 <= 113) {
            field1341 = null;
        }
        ++field1343;
        return class264.method1582(10, true, 0, arg1);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V", line = 129)
    public static void method489(byte arg0) {
        if (arg0 < 49) {
            method492(67, 9, (byte) -76, (byte[]) null);
        }
        field1336 = null;
        field1341 = null;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V", line = 140)
    public final void method490(int arg0) {
        super.field5242.method3057(arg0 + 2144900367, false);
        ++field1337;
        if (arg0 != -2144900407) {
            field1344 = 37;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V", line = 151)
    public final void method491(int arg0, boolean arg1) {
        ++field1335;
        super.field5242.method3057(-22, true);
        if (arg0 >= -121) {
            field1344 = 107;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lum;)V", line = 163)
    public class86(class528 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB[B)[B", line = 166)
    public static final byte[] method492(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 != 18) {
            method488((byte) -108, (String) null);
        }
        ++field1340;
        byte[] var4;
        if (arg1 <= 0) {
            var4 = arg3;
        } else {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; ++var5) {
                var4[var5] = arg3[arg1 + var5];
            }
        }
        class27 var6 = new class27();
        var6.method172((byte) -96);
        var6.method174(var4, (long) (arg0 * 8), false);
        byte[] var7 = new byte[64];
        var6.method177(0, false, var7);
        return var7;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Z", line = 203)
    public final boolean method493(byte arg0) {
        if (arg0 >= -20) {
            return true;
        } else {
            ++field1346;
            return true;
        }
    }
}
