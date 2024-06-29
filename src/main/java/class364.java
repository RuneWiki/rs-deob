import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class364 {

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "[J")
    public static long[] field5266 = new long[32];

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "Lke;")
    public static class622 field5261 = new class622(106, -2);

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
    public int field5263;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
    private int field5268;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "I")
    public int field5269;

    @OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "Luu;")
    public class299 field5262;

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "Lclient;")
    public static client field5270;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2271(int arg0) {
        field5267++;
        if (arg0 != 1) {
            field5270 = null;
        }
        if (class237.field3423 == 5) {
            class237.field3423 = 6;
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)V", line = 22)
    public static void method2272(int arg0) {
        field5270 = null;
        field5266 = null;
        if (arg0 == 9549) {
            field5261 = null;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)Lre;", line = 35)
    public final synchronized class625 method2273(byte arg0) {
        field5271++;
        class625 var2 = (class625) this.field5262.field4505.method2373((long) this.field5268, 103);
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 3) {
            field5261 = null;
        }
        class625 var3 = class625.method3580(this.field5262.field4499, this.field5268, 0);
        if (var3 != null) {
            this.field5262.field4505.method2362(var3, 0, (long) this.field5268);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IBLrv;)V", line = 58)
    private final void method2274(int arg0, byte arg1, class120 arg2) {
        if (arg0 == 1) {
            this.field5268 = arg2.method898((byte) -94);
        } else if (arg0 == 2) {
            this.field5269 = arg2.method842(2384);
            this.field5263 = arg2.method842(2384);
        }
        field5264++;
        if (arg1 >= -40) {
            this.method2274(127, (byte) 86, null);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(BIII)V", line = 83)
    public static final void method2275(byte arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1004) {
            class353.method2226(class82.field1091, arg3, arg2);
        } else if (arg1 == 1008) {
            class353.method2226(class394.field5582, arg3, arg2);
        } else if (arg1 == 1003) {
            class353.method2226(class153.field2266, arg3, arg2);
        } else if (arg1 == 1006) {
            class353.method2226(class310.field4612, arg3, arg2);
        } else if (arg1 == 1011) {
            class353.method2226(class632.field8931, arg3, arg2);
        }
        if (arg0 < 87) {
            field5261 = null;
        }
        field5259++;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lcb;BII)Lhm;", line = 112)
    public static final class229 method2276(class544 arg0, byte arg1, int arg2, int arg3) {
        field5260++;
        byte[] var4 = arg0.method3150(arg3, -78, arg2);
        if (arg1 != -46) {
            method2272(-1);
        }
        return var4 == null ? null : new class229(var4);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(BLrv;)V", line = 129)
    public final void method2277(byte arg0, class120 arg1) {
        if (arg0 < 19) {
            this.field5268 = 66;
        }
        field5258++;
        while (true) {
            int var3 = arg1.method842(2384);
            if (var3 == 0) {
                return;
            }
            this.method2274(var3, (byte) -93, arg1);
        }
    }
}
