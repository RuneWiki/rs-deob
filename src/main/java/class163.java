import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class163 {

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "Lof;")
    private class328 field2365 = new class328(64);

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "Lmn;")
    public class162 field2361;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Lmn;")
    private class162 field2357;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "S")
    public static short field2364 = 32767;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1026(byte arg0, String arg1) {
        field2358++;
        if (arg1.equals("")) {
            return;
        }
        class397.field5994++;
        class81.method578((byte) 66, class228.field3793);
        class170.field2488.method1479((byte) -109, class147.method896(arg1, (byte) -99));
        class170.field2488.method1458(arg1, (byte) 78);
        if (arg0 != 40) {
            field2364 = 121;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BI)V")
    public final void method1027(byte arg0, int arg1) {
        class328 var3 = this.field2365;
        synchronized (this.field2365) {
            this.field2365.method2202(0, arg1);
            int var4 = -95 % ((-arg0 - 38) / 37);
        }
        field2360++;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(BI)Ljo;")
    public final class261 method1028(byte arg0, int arg1) {
        field2363++;
        class328 var3 = this.field2365;
        class261 var4;
        synchronized (this.field2365) {
            var4 = (class261) this.field2365.method2191((byte) -73, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field2357;
        byte[] var6;
        synchronized (this.field2357) {
            var6 = this.field2357.method1004(3, false, arg1);
        }
        class261 var7 = new class261();
        var7.field4212 = this;
        if (var6 != null) {
            var7.method1777((byte) 81, new class208(var6));
        }
        class328 var8 = this.field2365;
        synchronized (this.field2365) {
            if (arg0 < 88) {
                this.field2365 = null;
            }
            this.field2365.method2188(-128, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLpb;I)I")
    public static final int method1029(byte arg0, class2 arg1, int arg2) {
        field2359++;
        if (arg0 <= 6) {
            method1029((byte) -71, null, 105);
        }
        return -1;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIILmn;)Lpo;")
    public static final class258 method1030(int arg0, int arg1, int arg2, class162 arg3) {
        field2362++;
        class208 var4 = new class208(arg3.method1004(arg0, false, arg2));
        class258 var5 = new class258(arg2, var4.method1448(65535), var4.method1448(arg1 + 65535), var4.method1436((byte) 89), var4.method1436((byte) 125), var4.method1445(arg1 + 57) == 1, var4.method1445(73), var4.method1445(-88));
        int var6 = var4.method1445(27);
        for (int var7 = arg1; var7 < var6; var7++) {
            var5.field4167.method2124(new class189(var4.method1445(-114), var4.method1455(-3387), var4.method1455(arg1 ^ 0xFFFFF2C5), var4.method1455(arg1 ^ 0xFFFFF2C5), var4.method1455(arg1 - 3387), var4.method1455(-3387), var4.method1455(-3387), var4.method1455(-3387), var4.method1455(-3387)), (byte) 106);
        }
        var5.method1760(-1);
        return var5;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Z")
    public static final boolean method1031(int arg0, int arg1) {
        field2366++;
        if (arg1 != 11) {
            field2367 = -106;
        }
        return arg0 == 9 || arg0 == 10 || arg0 == 11;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
    public final void method1032(boolean arg0) {
        class328 var2 = this.field2365;
        synchronized (this.field2365) {
            this.field2365.method2189(arg0);
        }
        field2368++;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)V")
    public final void method1033(boolean arg0) {
        class328 var2 = this.field2365;
        synchronized (this.field2365) {
            this.field2365.method2187(-1);
            if (!arg0) {
                method1031(-94, -96);
            }
        }
        field2369++;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lpr;ILmn;Lmn;)V")
    public class163(class236 arg0, int arg1, class162 arg2, class162 arg3) {
        this.field2361 = arg3;
        this.field2357 = arg2;
        this.field2357.method1008(3, (byte) -21);
    }
}
