import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class421 extends class235 {

    @OriginalMember(owner = "client!of", name = "G", descriptor = "Ljava/lang/String;")
    private String field6272 = "null";

    @OriginalMember(owner = "client!of", name = "F", descriptor = "C")
    public char field6271;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "C")
    public char field6279;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "I")
    private int field6283;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "Lsf;")
    private class143 field6267;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "Lsf;")
    public class143 field6282;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILil;I)V")
    private final void method2704(int arg0, class265 arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        if (arg0 == 1) {
            this.field6271 = class24.method211(52, arg1.method1708((byte) 127));
        } else if (arg0 == 2) {
            this.field6279 = class24.method211(44, arg1.method1708((byte) 127));
        } else if (arg0 == 3) {
            this.field6272 = arg1.method1712(false);
        } else if (arg0 == 4) {
            this.field6283 = arg1.method1666(arg2 - 2);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1685(8104);
            this.field6282 = new class143(class8.method64(1388313616, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1666(-2);
                class393 var7;
                if (arg0 == 5) {
                    var7 = new class442(arg1.method1712(false));
                } else {
                    var7 = new class231(arg1.method1666(-2));
                }
                this.field6282.method956(false, (long) var6, var7);
            }
        }
        field6280++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method2705(byte arg0, String arg1) {
        field6270++;
        if (this.field6282 == null) {
            return false;
        }
        if (this.field6267 == null) {
            this.method2706((byte) -99);
        }
        for (class54 var3 = (class54) this.field6267.method954(84, class122.method844(arg0 ^ 0x67, arg1)); var3 != null; var3 = (class54) this.field6267.method949(-1)) {
            if (var3.field804.equals(arg1)) {
                return true;
            }
        }
        if (arg0 != -104) {
            this.field6283 = 20;
        }
        return false;
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
    private final void method2706(byte arg0) {
        this.field6267 = new class143(this.field6282.method958(arg0 + 179));
        field6276++;
        for (class442 var2 = (class442) this.field6282.method953(0); var2 != null; var2 = (class442) this.field6282.method951(0)) {
            class54 var3 = new class54(var2.field6451, (int) var2.field5903);
            this.field6267.method956(false, class122.method844(-1, var2.field6451), var3);
        }
        if (arg0 != -99) {
            this.field6282 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
    public static final void method2707(int arg0) {
        field6269++;
        if (class404.field6020 == -1) {
            return;
        }
        if (arg0 < 33) {
            method2707(-35);
        }
        int var1 = class34.field555;
        int var2 = class316.field4522;
        if (class84.field1173 != 0) {
            var2 = class420.field6256;
            var1 = class242.field3390;
        }
        class205.method1300(0, -121, 0, 0, 0, class274.field4034, var2, class345.field5120, var1, class404.field6020);
        if (class204.field2952 != null) {
            class15.method103(var2, 62, var1);
        }
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
    private final void method2708(int arg0) {
        this.field6267 = new class143(this.field6282.method958(arg0 - 46));
        field6275++;
        if (arg0 == 4) {
            for (class231 var2 = (class231) this.field6282.method953(0); var2 != null; var2 = (class231) this.field6282.method951(0)) {
                class231 var3 = new class231((int) var2.field5903);
                this.field6267.method956(false, (long) var2.field3258, var3);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)Z")
    public final boolean method2709(int arg0, byte arg1) {
        field6274++;
        if (this.field6282 == null) {
            return false;
        }
        if (this.field6267 == null) {
            this.method2708(4);
        }
        class231 var3 = (class231) this.field6267.method954(70, (long) arg0);
        if (arg1 != 29) {
            this.field6271 = 'R';
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
    public static final void method2710(int arg0, int arg1) {
        field6273++;
        class24 var2 = class249.field3592;
        synchronized (class249.field3592) {
            class249.field3592.method215(0, arg0);
        }
        class24 var3 = class86.field1204;
        synchronized (class86.field1204) {
            class86.field1204.method215(0, arg0);
        }
        class24 var4 = class197.field2819;
        synchronized (class197.field2819) {
            class197.field2819.method215(0, arg0);
        }
        class24 var5 = class295.field4257;
        synchronized (class295.field4257) {
            class295.field4257.method215(0, arg0);
            int var6 = -92 % ((arg1 - 64) / 55);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method2711(byte arg0, int arg1) {
        field6266++;
        if (arg0 != -49) {
            this.method2708(98);
        }
        if (this.field6282 == null) {
            return this.field6272;
        } else {
            class442 var3 = (class442) this.field6282.method954(arg0 - 4, (long) arg1);
            return var3 == null ? this.field6272 : var3.field6451;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILpp;)V")
    public static final void method2712(int arg0, int arg1, class262 arg2) {
        if (arg0 != 0) {
            method2710(49, 112);
        }
        if (class16.field185) {
            class16.field185 = false;
            arg1 = 0;
        }
        field6268++;
        if (class161.field2109 != null && class161.field2109.method1643(arg2, (byte) -7)) {
            return;
        }
        class161.field2109 = arg2;
        class275.field4037 = class55.method375(-3913);
        class439.field6431 = arg1;
        class263.field3835 = arg1;
        if (class263.field3835 == 0) {
            class344.method2265(0);
            return;
        }
        class171.field2253 = class274.field4031;
        class94.field1288 = class425.field6313;
        class411.field6156 = class297.field4273;
        class404.field6008 = class203.field2939;
        class249.field3627 = class41.field643;
        class390.field5849 = class273.field4010;
        class108.field1488 = class246.field3429;
        class371.field5516 = class199.field2838;
        class137.field1813 = class381.field5713;
        class154.field2017 = class336.field4960;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lil;I)V")
    public final void method2713(class265 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1697(104);
            if (var3 == 0) {
                if (arg1 != -11607) {
                    method2710(-112, -14);
                }
                field6281++;
                return;
            }
            this.method2704(var3, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(BI)Ldl;")
    public static final class200 method2714(byte arg0, int arg1) {
        field6278++;
        class24 var2 = class258.field3761;
        class200 var3;
        synchronized (class258.field3761) {
            var3 = (class200) class258.field3761.method209(120, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class411.field6155.method1472(arg1, 3, 0);
        class200 var5 = new class200();
        if (arg0 >= -63) {
            return null;
        }
        if (var4 != null) {
            var5.method1253(new class265(var4), false);
        }
        class24 var6 = class258.field3761;
        synchronized (class258.field3761) {
            class258.field3761.method202(true, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(II)I")
    public final int method2715(int arg0, int arg1) {
        if (arg1 <= 59) {
            this.field6272 = null;
        }
        field6277++;
        if (this.field6282 == null) {
            return this.field6283;
        } else {
            class231 var3 = (class231) this.field6282.method954(105, (long) arg0);
            return var3 == null ? this.field6283 : var3.field3258;
        }
    }
}
