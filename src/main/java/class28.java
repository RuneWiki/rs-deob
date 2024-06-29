import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class28 extends class43 {

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "Ljava/lang/String;")
    public String field319;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field318 = 0;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field321 = new String[100];

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Lhq;")
    public static class365 field313 = new class365(20);

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "Lwo;")
    public static class285 field322;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "[I")
    public static int[] field316;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Z")
    public static final boolean method173(int arg0) {
        if (arg0 != -1) {
            method175(-104, 112);
        }
        field311++;
        return class94.field1105 != 0 || class427.field5842 >= 2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V")
    public static final void method174(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class432.field5904 == 1) {
            class270.field3502[client.field6058 / 100].method2659(class338.field4611 - 8, class215.field2654 + -8);
        }
        field317++;
        if (class432.field5904 == 2) {
            class270.field3502[client.field6058 / 100 + 4].method2659(class338.field4611 - 8, class215.field2654 + -8);
        }
        class150.method961(-13206);
        if (arg3 < 52) {
            method178(78, (class285) null);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
    public static final void method175(int arg0, int arg1) {
        class161.field1867 = arg1;
        field312++;
        class365 var2 = class20.field219;
        synchronized (class20.field219) {
            class20.field219.method2298(0);
        }
        class365 var3 = class263.field3379;
        synchronized (class263.field3379) {
            class263.field3379.method2298(arg0);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    public static void method176(int arg0) {
        if (arg0 >= -57) {
            method176(98);
        }
        field321 = null;
        field313 = null;
        field316 = null;
        field322 = null;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
    public static final void method177(int arg0) {
        if (class267.field3454 != null) {
            class386.field5275.method1843(64);
            class431.method2627();
            class281.method1773((byte) -122);
            class126.method814((byte) 0);
            class451.method2789((byte) -91);
            class303.method1927((byte) 116);
            if (class451.field6298 != null) {
                class451.field6298.method453(40);
            }
            class31.method191(false);
            class290.method1846(-127);
            class35.method226((byte) 81);
            class102.method615(-117, false);
            class383.method2387(arg0 ^ 0xFFFF94DD);
            for (int var1 = 0; var1 < 2048; var1++) {
                class131 var5 = class212.field2584[var1];
                if (var5 != null) {
                    var5.field2487 = null;
                    for (int var6 = 0; var6 < var5.field2483.length; var6++) {
                        var5.field2483[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class220.field2726.length; var2++) {
                class298 var3 = class220.field2726[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2483.length; var4++) {
                        var3.field2483[var4] = null;
                    }
                }
            }
            class267.field3454.method745(arg0 + 27508);
            class267.field3454 = null;
        }
        field314++;
        if (arg0 != -27506) {
            method173(-11);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class28() {
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILwo;)V")
    public static final void method178(int arg0, class285 arg1) {
        field320++;
        class364.field4950 = arg1;
        class341.field4650 = class364.field4950.method1821(101, arg0);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class28(String arg0) {
        this.field319 = arg0;
    }
}
