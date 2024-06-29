import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class236 {

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[Ljava/lang/Object;")
    public Object[] field3433 = new Object[5000];

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public int field3429 = 0;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[B")
    public byte[] field3432 = new byte[5000];

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public volatile int field3430 = 0;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "[F")
    public float[] field3437 = new float[5000];

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public volatile int field3443 = 0;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public int field3435 = 0;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lvo;")
    public static class32 field3439 = new class32("", 16);

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "[I")
    public static int[] field3441 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "[I")
    public static int[] field3440 = new int[2048];

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "Z")
    public static boolean field3442 = false;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "[I")
    public static int[] field3434;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public abstract void method1446(byte arg0);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZLjp;)I")
    public static final int method1447(boolean arg0, class241 arg1) {
        if (arg0) {
            return 76;
        }
        field3431++;
        int var2 = arg1.method1520(-12494, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method1520(-12494, 5);
        } else if (var2 == 2) {
            var3 = arg1.method1520(-12494, 8);
        } else {
            var3 = arg1.method1520(-12494, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lhm;III)V")
    public static final void method1448(class150 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1004) {
            field3434 = null;
        }
        if (class427.field6024) {
            class412 var9 = class319.field4621 == -1 ? null : class454.field6365.method1995(12, class319.field4621);
            if (client.method1291(arg0).method2882(-78) && (class180.field2579 & 0x20) != 0 && (var9 == null || arg0.method942(class319.field4621, 37, var9.field5823) != var9.field5823)) {
                class509.method3042(0L, class380.field5366, 6, class431.field6089 + " -> " + arg0.field2075, arg0.field2105, class474.field6601, false, arg0.field2134, 10, true, arg0.field2089);
                class332.field4826++;
            }
        } else {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class63.method506(true, var4, arg0);
                if (var8 != null) {
                    class509.method3042((long) (var4 + 1), var8, 6, arg0.field2075, arg0.field2105, class183.method1147(var4, arg0, 3), false, arg0.field2134, 1004, true, arg0.field2089);
                    class87.field1081++;
                }
            }
            String var5 = class189.method1204(false, arg0);
            if (var5 != null) {
                class509.method3042(0L, var5, arg3 ^ 0x3EA, arg0.field2075, arg0.field2105, arg0.field2069, false, arg0.field2134, 11, true, arg0.field2089);
                class472.field6576++;
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class63.method506(true, var6, arg0);
                if (var7 != null) {
                    class509.method3042((long) (var6 + 1), var7, 6, arg0.field2075, arg0.field2105, class183.method1147(var6, arg0, 3), false, arg0.field2134, 20, true, arg0.field2089);
                    class87.field1081++;
                }
            }
            if (client.method1291(arg0).method2883(-74)) {
                if (arg0.field2038 == null) {
                    class509.method3042(0L, class335.field4849.method3116(class149.field1979, (byte) 98), 6, "", arg0.field2105, -1, false, arg0.field2134, 51, true, arg0.field2089);
                } else {
                    class509.method3042(0L, arg0.field2038, 6, "", arg0.field2105, -1, false, arg0.field2134, 51, true, arg0.field2089);
                }
                class176.field2527++;
            }
        }
        field3428++;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public abstract void method1449(byte arg0);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLrb;)V")
    public abstract void method1450(byte arg0, class239 arg1);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZILya;FI)V")
    public abstract void method1451(boolean arg0, int arg1, class38 arg2, float arg3, int arg4);

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V")
    public static void method1452(byte arg0) {
        field3434 = null;
        field3440 = null;
        int var1 = 58 % ((-arg0 - 47) / 63);
        field3439 = null;
        field3441 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)I")
    public static final int method1453(int arg0, byte arg1) {
        if (arg1 == -94) {
            field3438++;
            return arg0 >>> 7;
        } else {
            return -108;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V")
    public abstract void method1454(byte arg0, int arg1);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILrb;)V")
    public abstract void method1455(int arg0, class239 arg1);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
    public abstract void method1456(int arg0, int arg1);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(ILrb;)V")
    public abstract void method1457(int arg0, class239 arg1);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IFIFF)F")
    public static final float method1458(int arg0, float arg1, int arg2, float arg3, float arg4) {
        field3436++;
        float[] var5 = class530.field7765[arg2];
        if (arg0 != -30830) {
            method1452((byte) 7);
        }
        return var5[2] * arg1 + var5[1] * arg4 + var5[0] * arg3;
    }
}
