import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class184 {

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field2752 = 2;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "[Z")
    public static boolean[] field2755 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[I")
    public static int[] field2748 = new int[25];

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field2746 = 0;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lhb;")
    public static class318 field2757 = new class318(30);

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2760 = null;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field2761 = 100;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lfa;")
    public static class95 field2758;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
    public static int[] field2754;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIIII)V", line = 8)
    public static final void method1268(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2750++;
        if (arg3 >= class185.field2769 && class166.field2494 >= arg3) {
            int var5 = class222.method1553(field2761, (byte) -31, arg4, class157.field2357);
            int var6 = class222.method1553(field2761, (byte) -61, arg1, class157.field2357);
            class211.method1468(arg2, var5, arg3, var6, -125);
        }
        if (arg0 < 47) {
            method1270(-125);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIZII)V", line = 27)
    public static final void method1269(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field2753++;
        if (arg2 < arg0) {
            int var7 = arg2;
            int var8 = (arg0 + arg2) / 2;
            class178 var9 = class250.field3729[var8];
            class250.field3729[var8] = class250.field3729[arg0];
            class250.field3729[arg0] = var9;
            for (int var10 = arg2; var10 < arg0; var10++) {
                if (class180.method1248((byte) 101, class250.field3729[var10], arg4, arg6, arg5, arg1, var9) <= 0) {
                    class178 var11 = class250.field3729[var10];
                    class250.field3729[var10] = class250.field3729[var7];
                    class250.field3729[var7++] = var11;
                }
            }
            class250.field3729[arg0] = class250.field3729[var7];
            class250.field3729[var7] = var9;
            method1269(var7 - 1, arg1, arg2, arg3 ^ 0x0, arg4, arg5, arg6);
            method1269(arg0, arg1, var7 + 1, arg3, arg4, arg5, arg6);
        }
        if (arg3 != -21266) {
            method1271(64);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 72)
    public static void method1270(int arg0) {
        field2755 = null;
        field2754 = null;
        field2760 = null;
        if (arg0 == 1) {
            field2757 = null;
            field2758 = null;
            field2748 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 88)
    public static final void method1271(int arg0) {
        class207.field3137.method25((byte) 7);
        field2751++;
        int var1 = class207.field3137.method24((byte) -122, 8);
        if (class172.field2577 > var1) {
            for (int var2 = var1; var2 < class172.field2577; var2++) {
                class88.field1311[class287.field4332++] = class56.field711[var2];
            }
        }
        if (var1 > class172.field2577) {
            throw new RuntimeException("gnpov1");
        }
        class172.field2577 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class56.field711[var3];
            class69 var5 = class187.field2788[var4];
            int var6 = class207.field3137.method24((byte) -122, 1);
            if (var6 == 0) {
                class56.field711[class172.field2577++] = var4;
                var5.field1498 = class304.field4641;
            } else {
                int var7 = class207.field3137.method24((byte) -122, 2);
                if (var7 == 0) {
                    class56.field711[class172.field2577++] = var4;
                    var5.field1498 = class304.field4641;
                    class278.field4234[class230.field3476++] = var4;
                } else if (var7 == 1) {
                    class56.field711[class172.field2577++] = var4;
                    var5.field1498 = class304.field4641;
                    int var8 = class207.field3137.method24((byte) -122, 3);
                    var5.method693(1, arg0 ^ 0xFFFFFFFD, var8);
                    int var9 = class207.field3137.method24((byte) -122, 1);
                    if (var9 == 1) {
                        class278.field4234[class230.field3476++] = var4;
                    }
                } else if (var7 == 2) {
                    class56.field711[class172.field2577++] = var4;
                    var5.field1498 = class304.field4641;
                    if (class207.field3137.method24((byte) -122, 1) == 1) {
                        int var11 = class207.field3137.method24((byte) -122, 3);
                        var5.method693(2, -4, var11);
                        int var12 = class207.field3137.method24((byte) -122, 3);
                        var5.method693(2, -4, var12);
                    } else {
                        int var10 = class207.field3137.method24((byte) -122, 3);
                        var5.method693(0, -4, var10);
                    }
                    int var13 = class207.field3137.method24((byte) -122, 1);
                    if (var13 == 1) {
                        class278.field4234[class230.field3476++] = var4;
                    }
                } else if (var7 == 3) {
                    class88.field1311[class287.field4332++] = var4;
                }
            }
        }
        if (arg0 != 1) {
            method1272(22, -93);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V", line = 221)
    public static final void method1272(int arg0, int arg1) {
        field2749++;
        if (arg1 == 0) {
            class56.field704.method2174(arg1 ^ 0xFFFFCEA6, arg0);
        }
    }
}
