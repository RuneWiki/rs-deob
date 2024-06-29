import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class414 {

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Z")
    public static boolean field5947 = true;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field5950 = 0;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field5948 = -1;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)Lwg;")
    public static final class244 method2636(int arg0, int arg1) {
        field5949++;
        class237 var2 = class141.field1742;
        class244 var3;
        synchronized (class141.field1742) {
            var3 = (class244) class141.field1742.method1625((long) arg0, arg1 - 31392);
            if (arg1 != 31392) {
                method2640((byte) 87);
            }
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class240.field3416.method2431((byte) 126, class141.method861((byte) 112, arg0), class158.method1011(arg0, arg1 - 28158));
        class244 var5 = new class244();
        if (var4 != null) {
            var5.method1660(-27744, new class236(var4));
        }
        class237 var6 = class141.field1742;
        synchronized (class141.field1742) {
            class141.field1742.method1622((byte) 13, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5943++;
        class184 var7 = class341.method2186(arg5, (byte) 21, arg1);
        if (var7 == null) {
            return;
        }
        if (var7.field2671 != null) {
            class272 var8 = new class272();
            var8.field3848 = var7.field2671;
            var8.field3851 = var7;
            class201.method1332(var8);
        }
        class4.field52 = arg4;
        class5.field81 = var7.field2635;
        class408.field5883 = arg5;
        class22.field279 = arg3;
        if (arg2 != 29286) {
            field5948 = 120;
        }
        class188.field2714 = arg1;
        class297.field4161 = arg6;
        class279.field3951 = true;
        class347.field4901 = arg0;
        class186.method1277(var7, (byte) 72);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIIIII)V")
    public static final void method2638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class258.field3694 = arg3;
        class400.field5724 = arg1;
        if (arg5 != 0) {
            return;
        }
        class88.field1077 = arg2;
        field5944++;
        class1.field4 = arg4;
        class233.field3273 = arg6;
        class365.field5186 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static final void method2639(int arg0) {
        field5945++;
        class176.field2399 = 0;
        class141.field1738 = 0;
        class138.method850(-128);
        class85.method466(arg0 ^ 0x2E77);
        if (arg0 != 11813) {
            field5947 = true;
        }
        class291.method1928(-43);
        for (int var1 = 0; var1 < class141.field1738; var1++) {
            int var3 = class183.field2507[var1];
            if (class189.field2726 != class167.field2335[var3].field5625) {
                if (class167.field2335[var3].field912.method833(89)) {
                    class217.method1453(111, class167.field2335[var3]);
                }
                class167.field2335[var3].method431((class135) null, arg0 - 11702);
                class167.field2335[var3] = null;
            }
        }
        if (class55.field658 != class359.field5120.field3320) {
            throw new RuntimeException("gnp1 pos:" + class359.field5120.field3320 + " psize:" + class55.field658);
        }
        for (int var2 = 0; var2 < class102.field1250; var2++) {
            if (class167.field2335[class86.field981[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class102.field1250);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static final void method2640(byte arg0) {
        class346.field4890 = -3;
        if (arg0 >= -29) {
            field5948 = -120;
        }
        class176.field2396 = 1;
        class311.field4397 = 0;
        field5946++;
        class40.field463 = 0;
        class89.field1088 = 0;
        class324.field4610 = false;
        class229.field3246 = -1;
    }
}
