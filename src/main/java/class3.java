import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class3 {

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "Luf;")
    private class380 field11 = new class380(64);

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "Lga;")
    private class332 field13;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "Leba;")
    public static class550 field14 = new class550(49, -2);

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "[F")
    public static float[] field18 = new float[4];

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "Lga;")
    public static class332 field8;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field9;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method12(boolean arg0) {
        field12++;
        class204[] var1 = class538.field7389;
        synchronized (class538.field7389) {
            for (int var2 = 0; var2 < class538.field7389.length; var2++) {
                class538.field7389[var2] = new class204();
                class421.field5525[var2] = 0;
            }
            if (arg0) {
                method15(36, 103, (byte) 94, -87, -76);
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V", line = 29)
    public final void method13(int arg0, int arg1) {
        class380 var3 = this.field11;
        synchronized (this.field11) {
            if (arg1 != -23313) {
                return;
            }
            this.field11.method2179(false, arg0);
        }
        field17++;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(II)Lwu;", line = 42)
    public final class541 method14(int arg0, int arg1) {
        field16++;
        class380 var3 = this.field11;
        class541 var4;
        synchronized (this.field11) {
            var4 = (class541) this.field11.method2176(-125, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 >= -100) {
            return null;
        } else {
            class332 var5 = this.field13;
            byte[] var6;
            synchronized (this.field13) {
                var6 = this.field13.method1938(arg0, 31, -17);
            }
            class541 var7 = new class541();
            if (var6 != null) {
                var7.method3039(-68, new class157(var6));
            }
            class380 var8 = this.field11;
            synchronized (this.field11) {
                this.field11.method2174(var7, (long) arg0, (byte) 11);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIBII)V", line = 78)
    public static final void method15(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 86) {
            return;
        }
        field7++;
        class256 var5 = class592.method3279((byte) -61, 10, arg4);
        var5.method1549(-32042);
        var5.field3354 = arg1;
        var5.field3358 = arg0;
        var5.field3359 = arg3;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V", line = 95)
    public final void method16(byte arg0) {
        field19++;
        class380 var2 = this.field11;
        synchronized (this.field11) {
            if (arg0 == -34) {
                this.field11.method2172(-15112);
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILfca;ZZ)V", line = 111)
    public static final void method17(int arg0, class137 arg1, boolean arg2, boolean arg3) {
        field10++;
        int var4 = arg1.field1870;
        int var5 = (int) arg1.field545;
        arg1.method242(true);
        if (arg2) {
            class190.method1254(var4, false);
        }
        class258.method1556(arg0 ^ 0x9918F7A1, var4);
        class423 var6 = class592.method3271(var5, (byte) -100);
        if (var6 != null) {
            class552.method3091(var6, arg0 + 1718307482);
        }
        class402.method2298((byte) -127);
        if (!arg3 && class164.field2349 != -1) {
            class367.method2131(class164.field2349, 1, -1156546040);
        }
        class110 var7 = new class110(class152.field2079);
        if (arg0 != -1718294864) {
            method17(41, null, false, false);
        }
        for (class137 var8 = (class137) var7.method596(arg0 ^ 0x9994E6C0); var8 != null; var8 = (class137) var7.method601((byte) 39)) {
            if (!var8.method241(true)) {
                var8 = (class137) var7.method596(arg0 ^ 0x666B1914);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field1872 == 3) {
                int var9 = (int) var8.field545;
                if ((var9 >>> 16) == var4) {
                    method17(arg0, var8, true, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V", line = 172)
    public static void method18(byte arg0) {
        field9 = null;
        field8 = null;
        field18 = null;
        if (arg0 != 77) {
            field14 = null;
        }
        field14 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V", line = 186)
    public final void method19(int arg0) {
        class380 var2 = this.field11;
        synchronized (this.field11) {
            this.field11.method2168((byte) -121);
        }
        if (arg0 != -1718294864) {
            method15(116, -109, (byte) 29, -72, 2);
        }
        field15++;
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lnq;ILga;)V", line = 205)
    public class3(class650 arg0, int arg1, class332 arg2) {
        this.field13 = arg2;
        this.field13.method1939(0, 31);
    }
}
