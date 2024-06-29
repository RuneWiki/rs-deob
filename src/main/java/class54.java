import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class54 extends class378 implements Runnable {

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
    private boolean field792 = true;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public int field799 = -1;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Lli;")
    private class247 field796;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field795 = 0;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public static int field790 = -1;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "Ljava/lang/String;")
    public static String field800 = "white:";

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "[J")
    public static long[] field798 = new long[32];

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!hk", name = "run", descriptor = "()V")
    public final void run() {
        field787++;
        while (this.field792) {
            this.field796.method1539(116, this);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public final void method362(int arg0) {
        if (arg0 == 0) {
            this.field792 = false;
            field786++;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBI)V")
    public static final void method363(int arg0, byte arg1, int arg2) {
        field791++;
        class399 var3 = class269.method1655(15, 0, arg1 ^ 0xFFFFFFEA);
        var3.method2583((byte) 71);
        if (arg1 != 114) {
            method363(-122, (byte) -116, -103);
        }
        var3.field5842 = arg0;
        var3.field5829 = arg2;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
    public static void method364(int arg0) {
        if (arg0 != 0) {
            method364(-101);
        }
        field800 = null;
        field798 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
    public static final int method365(int arg0, int arg1) {
        return class270.field3683 == null ? 0 : class270.field3683[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
    public final void method366(byte arg0) {
        int var2 = 48 / ((23 - arg0) / 35);
        (new Thread(this, "a")).start();
        field797++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIIIII)V")
    public static final void method367(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field793++;
        int var8 = arg4 + 1;
        class73.method486(arg1, class84.field1286[arg4], arg2, 62, arg3);
        if (!arg0) {
            return;
        }
        int var9 = arg5 - 1;
        class73.method486(arg1, class84.field1286[arg5], arg2, 118, arg3);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class84.field1286[var6];
            var7[arg1] = var7[arg3] = arg2;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lsb;")
    public static final class160 method368(int arg0, byte arg1) {
        if (arg1 <= 94) {
            return null;
        }
        field801++;
        class160 var2 = (class160) class282.field3866.method1246((byte) -37, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class448.field6473.method1920(arg0, false, 1);
        class160 var4 = new class160();
        var4.field2261 = arg0;
        if (var3 != null) {
            var4.method1066((byte) -23, new class371(var3));
        }
        var4.method1063(106);
        if (var4.field2252 == 2 && class426.field6116.method1412((byte) -54, (long) arg0) == null) {
            class426.field6116.method1419((long) arg0, 20, new class23(class244.field3371));
            class450.field6526[class244.field3371++] = var4;
        }
        class282.field3866.method1247((long) arg0, (byte) -83, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLaa;Lrg;)V")
    public static final void method369(byte arg0, class281 arg1, class383 arg2) {
        field788++;
        client.method1101(0, arg1, 0, arg2, 71);
        if (arg0 < 22) {
            method368(-17, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
    public static final void method370(int arg0) {
        field794++;
        if (class230.field3086) {
            return;
        }
        class361.method2325(false, class383.field5456);
        if (arg0 == 27348) {
            if (class77.field1200 != null) {
                class361.method2325(false, class77.field1200);
            }
            class230.field3086 = true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lli;)V")
    public class54(class247 arg0) {
        this.field796 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lcm;ZZI)V")
    public static final void method371(class432 arg0, boolean arg1, boolean arg2, int arg3) {
        field802++;
        int var4 = arg0.field6217;
        int var5 = (int) arg0.field5363;
        arg0.method2459(198);
        if (arg2) {
            class192.method1272(var4, 126);
        }
        class127.method849(var4, arg3 - 11392);
        if (arg3 != 0) {
            return;
        }
        class383 var6 = class290.method1869((byte) 121, var5);
        if (var6 != null) {
            class86.method596(14459, var6);
        }
        class336.method2094(-79);
        if (!arg1 && class230.field3089 != -1) {
            class184.method1212(arg3 + 123, 1, class230.field3089);
        }
        class191 var7 = new class191(class271.field3700);
        for (class432 var8 = (class432) var7.method1264((byte) -56); var8 != null; var8 = (class432) var7.method1265(~arg3)) {
            if (!var8.method2460(arg3 ^ 0x58)) {
                var8 = (class432) var7.method1264((byte) -56);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field6219 == 3) {
                int var9 = (int) var8.field5363;
                if (var9 >>> 16 == var4) {
                    method371(var8, arg1, true, 0);
                }
            }
        }
    }
}
