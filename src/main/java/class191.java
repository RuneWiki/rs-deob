import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class191 {

    @OriginalMember(owner = "client!op", name = "g", descriptor = "[I")
    public static int[] field2300 = new int[2];

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    private int field2301;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public int field2305;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "Laq;")
    public class162 field2304;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "Ltw;")
    public static class204 field2297;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1063(int arg0) {
        if (arg0 != 0) {
            field2297 = null;
        }
        field2298++;
        return class83.field1156 || class736.field10279 == null ? "" : class736.field10279.field2952;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIII)Loi;")
    public static final class74 method1064(int arg0, int arg1, int arg2, int arg3) {
        field2295++;
        class624 var4 = class77.field947[arg0][arg1][arg2];
        if (arg3 <= 42) {
            method1067(-69);
        }
        if (var4 == null) {
            return null;
        }
        class74 var5 = null;
        int var6 = -1;
        for (class603 var7 = var4.field8729; var7 != null; var7 = var7.field8413) {
            class752 var8 = var7.field8410;
            if (var8 instanceof class74) {
                class74 var9 = (class74) var8;
                int var10 = var9.method543(0) * 256 + 252 - 256;
                int var11 = var9.field2170 - var10 >> 9;
                int var12 = var9.field2165 - var10 >> 9;
                int var13 = var9.field2170 + var10 >> 9;
                int var14 = var9.field2165 + var10 >> 9;
                if (arg1 >= var11 && arg2 >= var12 && arg1 <= var13 && arg2 <= var14) {
                    int var15 = (var14 + 1 - arg2) * (var13 + 1 - arg1);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
    public static final void method1065(int arg0, int arg1) {
        if (class449.field6284 == null || class449.field6284.length < arg1) {
            class449.field6284 = new int[arg1];
        }
        if (arg0 != 256) {
            method1065(-98, 95);
        }
        field2303++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)Ltw;")
    public final synchronized class204 method1066(byte arg0) {
        if (arg0 != 126) {
            field2306 = -116;
        }
        field2299++;
        class204 var2 = (class204) this.field2304.field2044.method1571(-126, (long) this.field2301);
        if (var2 != null) {
            return var2;
        }
        class204 var3 = class204.method1129(this.field2304.field2042, this.field2301, 0);
        if (var3 != null) {
            this.field2304.field2044.method1574((long) this.field2301, var3, (byte) -80);
        }
        return var3;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public static void method1067(int arg0) {
        field2297 = null;
        if (arg0 <= 0) {
            method1068(16);
        }
        field2300 = null;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
    public static final void method1068(int arg0) {
        if (arg0 != 2) {
            field2306 = -105;
        }
        field2296++;
        class237.method1429(11, false);
        class180.method1027(true);
        System.gc();
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILji;I)V")
    private final void method1069(int arg0, class611 arg1, int arg2) {
        field2307++;
        if (arg0 == 1) {
            this.field2301 = arg1.method3402((byte) 127);
        } else if (arg0 == 2) {
            this.field2305 = arg1.method3428((byte) 84);
            this.field2302 = arg1.method3428((byte) -109);
        }
        int var4 = 59 % ((arg2 + 55) / 48);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLji;)V")
    public final void method1070(boolean arg0, class611 arg1) {
        if (!arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method3428((byte) -119);
            if (var3 == 0) {
                field2294++;
                return;
            }
            this.method1069(var3, arg1, -127);
        }
    }
}
