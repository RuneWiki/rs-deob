import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class118 {

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public int field1849 = 2048;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public int field1850 = 2048;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "I")
    public int field1855 = 0;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public int field1856 = 0;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "[[[J")
    public static long[][][] field1853;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIZI)V", line = 7)
    public static final void method868(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            method868(-121, 35, false, 14);
        }
        field1852++;
        class314 var4 = class177.method1213(!arg2, 9, arg3);
        var4.method1808(-7412);
        var4.field4253 = arg1;
        var4.field4259 = arg0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IILsv;)V", line = 24)
    private final void method869(int arg0, int arg1, class319 arg2) {
        field1854++;
        if (arg0 != 0) {
            this.method869(-62, -109, null);
        }
        if (arg1 == 1) {
            this.field1855 = arg2.method1869(-109);
        } else if (arg1 == 2) {
            this.field1849 = arg2.method1844(-110);
        } else if (arg1 == 3) {
            this.field1850 = arg2.method1844(-113);
            return;
        } else if (arg1 == 4) {
            this.field1856 = arg2.method1847(arg0 ^ 0x73);
            return;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IILdk;ZIII)V", line = 52)
    public static final void method870(int arg0, int arg1, class421 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class390.field5635 = arg4;
        field1851++;
        class87.field1418 = 1;
        class428.field6223 = arg6;
        if (arg0 != -10960) {
            return;
        }
        class135.field2056 = arg2;
        class320.field4400 = arg5;
        class238.field3287 = arg3;
        class100.field1594 = class443.field6380.method1039((byte) 119) / arg1;
        if (class100.field1594 < 1) {
            class100.field1594 = 1;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 77)
    public static final void method871(int arg0) {
        field1846++;
        class17.field275.field4360 = 0;
        class399.field5722 = 0;
        class508.field7414.field4360 = 0;
        class530.field7804 = null;
        class72.field1037 = null;
        class40.field601 = null;
        class104.field1705 = 0;
        class322.field4426 = null;
        class104.field1710 = 0;
        class486.method2878(73);
        class512.method3035(192);
        for (int var1 = 0; var1 < 2048; var1++) {
            class45.field642[var1] = null;
        }
        class81.field1158 = null;
        for (int var2 = 0; var2 < class534.field7854; var2++) {
            class209 var4 = class496.field7261[var2].field4455;
            if (var4 != null) {
                var4.field202 = -1;
            }
        }
        class434.method2576(13334);
        class247.field3363 = 1;
        class63.method421(9, true);
        if (arg0 != -27897) {
            field1853 = null;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            class428.field6214[var3] = true;
        }
        class326.method1935(-30620);
        class214.field3050 = null;
        class292.field3954 = 0L;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BLsv;)V", line = 139)
    public final void method872(byte arg0, class319 arg1) {
        while (true) {
            int var3 = arg1.method1869(arg0 + 10);
            if (var3 == 0) {
                field1847++;
                if (arg0 != -104) {
                    field1848 = -70;
                    return;
                }
                return;
            }
            this.method869(0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V", line = 162)
    public static void method873(int arg0) {
        field1853 = null;
        if (arg0 != 0) {
            field1853 = null;
        }
    }
}
