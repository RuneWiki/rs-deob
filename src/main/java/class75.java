import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class75 {

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "[I")
    public int[] field1121;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "[I")
    public int[] field1117;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public static int field1120 = -60;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "Lfi;")
    public static class166 field1119 = new class166();

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "Lil;")
    public static class265 field1122 = new class265();

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "Lik;")
    public static class410 field1123 = new class410(32);

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "[I")
    public static int[] field1124 = new int[13];

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1118++;
        if ((arg2 - arg5) >= class433.field6144 && (arg2 + arg5) <= class69.field1047 && class39.field595 <= arg0 - arg5 && arg0 + arg5 <= class134.field1917) {
            class88.method783(arg6, (byte) 109, arg3, arg0, arg1, arg5, arg2);
        } else {
            class74.method645(arg6, arg0, arg1, arg3, arg5, 8741, arg2);
        }
        if (arg4 != -26812) {
            method650(68);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)Z")
    public static final boolean method648(boolean arg0) {
        for (int var1 = class213.field2966; var1 < class388.field5464; var1++) {
            class224[][] var2 = class118.field1653[var1];
            for (int var3 = -class303.field4107; var3 <= 0; var3++) {
                int var4 = class134.field1914 + var3;
                int var5 = class134.field1914 - var3;
                if (var4 >= class283.field3780 || var5 < class176.field2603) {
                    for (int var6 = -class303.field4107; var6 <= 0; var6++) {
                        int var7 = class31.field516 + var6;
                        int var8 = class31.field516 - var6;
                        if (var4 >= class283.field3780) {
                            if (var7 >= class277.field3733) {
                                class224 var9 = var2[var4][var7];
                                if (var9 != null && var9.field3111) {
                                    class166.field2449 = arg0;
                                    class277.field3731.method1019(0, var9);
                                    class277.field3731.method1028((byte) 82);
                                }
                            }
                            if (var8 < class338.field4620) {
                                class224 var10 = var2[var4][var8];
                                if (var10 != null && var10.field3111) {
                                    class166.field2449 = arg0;
                                    class277.field3731.method1019(0, var10);
                                    class277.field3731.method1028((byte) 120);
                                }
                            }
                        }
                        if (var5 < class176.field2603) {
                            if (var7 >= class277.field3733) {
                                class224 var11 = var2[var5][var7];
                                if (var11 != null && var11.field3111) {
                                    class166.field2449 = arg0;
                                    class277.field3731.method1019(0, var11);
                                    class277.field3731.method1028((byte) 22);
                                }
                            }
                            if (var8 < class338.field4620) {
                                class224 var12 = var2[var5][var8];
                                if (var12 != null && var12.field3111) {
                                    class166.field2449 = arg0;
                                    class277.field3731.method1019(0, var12);
                                    class277.field3731.method1028((byte) 111);
                                }
                            }
                        }
                        if (class419.field5873 == 0) {
                            if (class362.field4994) {
                                class277.field3731.method1027(2, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    public static final void method649(int arg0) {
        class166.field2464 = 0;
        field1115++;
        class298.field4018 = 0;
        class312.method1992(0);
        class408.method2529(1);
        class163.method1220(false);
        for (int var1 = arg0; var1 < class298.field4018; var1++) {
            int var3 = class26.field461[var1];
            if (class414.field5793 != class298.field4012[var3].field4937) {
                if (class298.field4012[var3].field1784.method80((byte) -128)) {
                    class322.method2043(0, class298.field4012[var3]);
                }
                class298.field4012[var3].method993((class15) null, 128);
                class298.field4012[var3] = null;
            }
        }
        if (class213.field2961 != class417.field5851.field3938) {
            throw new RuntimeException("gnp1 pos:" + class417.field5851.field3938 + " psize:" + class213.field2961);
        }
        for (int var2 = 0; var2 < class221.field3055; var2++) {
            if (class298.field4012[class209.field2891[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class221.field3055);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
    public static void method650(int arg0) {
        if (arg0 == 0) {
            field1123 = null;
            field1119 = null;
            field1124 = null;
            field1122 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(I)V")
    public class75(int arg0) {
        this.field1116 = arg0;
        this.field1121 = new int[this.field1116];
        this.field1117 = new int[this.field1116];
    }
}
