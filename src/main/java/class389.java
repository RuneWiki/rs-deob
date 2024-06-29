import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class389 {

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Ljda;")
    private class239 field5662 = new class239(64);

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "Ljda;")
    public class239 field5667 = new class239(50);

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "Ljs;")
    public class351 field5671 = new class351(250);

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "Lwj;")
    private class417 field5672 = new class417();

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public int field5650;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "Laj;")
    public class333 field5663;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "Lvfa;")
    private class701 field5674;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Laj;")
    private class333 field5659;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Z")
    private boolean field5654;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public int field5656;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field5673;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field5675;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "Ltja;")
    public static class288 field5665 = new class288(6, 8);

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "[I")
    public static int[] field5668 = new int[1];

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    public static int field5670 = 1;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "F")
    public static float field5669;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public int field5676;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BIZ)Lg;")
    public static final class166 method2461(byte arg0, int arg1, boolean arg2) {
        int var3 = -14 % ((-arg0 - 53) / 51);
        field5647++;
        long var4 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg1);
        return (class166) class533.field7257.method3953(var4, 14);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
    public static final void method2462(int arg0, int arg1, int arg2) {
        field5649++;
        class16 var3 = class94.method753(1, 13175, (long) arg1);
        var3.method119(arg2 - 55);
        if (arg2 != 0) {
            field5668 = null;
        }
        var3.field237 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static final void method2463(int arg0) {
        field5655++;
        if (arg0 <= 10) {
            return;
        }
        if (class458.field6355 == 9) {
            class300.method1901(5, 2);
        } else if (class458.field6355 == 5 || class458.field6355 == 6) {
            class300.method1901(3, 2);
        } else if (class458.field6355 == 12) {
            class300.method1901(3, 2);
            return;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)V")
    public final void method2464(int arg0, boolean arg1) {
        field5653++;
        class239 var3 = this.field5662;
        synchronized (this.field5662) {
            this.field5662.method1546(arg0, (byte) -8);
        }
        class239 var4 = this.field5667;
        synchronized (this.field5667) {
            this.field5667.method1546(arg0, (byte) -8);
        }
        if (!arg1) {
            this.field5676 = 24;
        }
        class351 var5 = this.field5671;
        synchronized (this.field5671) {
            this.field5671.method2208(-127, arg0);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public final void method2465(byte arg0) {
        field5666++;
        class239 var2 = this.field5662;
        synchronized (this.field5662) {
            this.field5662.method1552(65);
        }
        class239 var3 = this.field5667;
        synchronized (this.field5667) {
            this.field5667.method1552(18);
            if (arg0 != -63) {
                this.method2474(-72, -21, (byte) -123, null, 63, -118, null, 59);
            }
        }
        class351 var4 = this.field5671;
        synchronized (this.field5671) {
            this.field5671.method2216(true);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZB)V")
    public final void method2466(boolean arg0, byte arg1) {
        if (arg1 != -23) {
            this.field5675 = null;
        }
        field5658++;
        if (this.field5654 != arg0) {
            this.field5654 = arg0;
            this.method2468(1);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lvw;")
    public final class322 method2467(int arg0, int arg1) {
        int var3 = 90 / ((74 - arg0) / 46);
        field5652++;
        class239 var4 = this.field5662;
        class322 var5;
        synchronized (this.field5662) {
            var5 = (class322) this.field5662.method1541(-10, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class333 var6 = this.field5659;
        byte[] var7;
        synchronized (this.field5659) {
            var7 = this.field5659.method2095(class364.method2286(arg1, true), class461.method2728(arg1, -7562), 1);
        }
        class322 var8 = new class322();
        var8.field4708 = this;
        var8.field4643 = arg1;
        var8.field4637 = new String[] { null, null, class474.field6547.method2780(108, this.field5650), null, null };
        var8.field4647 = new String[] { null, null, null, null, class474.field6548.method2780(94, this.field5650) };
        if (var7 != null) {
            var8.method2055(83, new class376(var7));
        }
        var8.method2058(-12);
        if (var8.field4639 != -1) {
            var8.method2046(this.method2467(-91, var8.field4639), this.method2467(-64, var8.field4709), (byte) -107);
        }
        if (var8.field4657 != -1) {
            var8.method2053(0, this.method2467(-97, var8.field4693), this.method2467(125, var8.field4657));
        }
        if (var8.field4665 != -1) {
            var8.method2048(this.method2467(121, var8.field4636), -23141, this.method2467(127, var8.field4665));
        }
        if (!this.field5654 && var8.field4632) {
            var8.field4668 = class474.field6544.method2780(96, this.field5650);
            var8.field4647 = this.field5675;
            var8.field4698 = 0;
            var8.field4692 = false;
            var8.field4663 = null;
            var8.field4637 = this.field5673;
            if (var8.field4687 != null) {
                boolean var9 = false;
                for (class101 var10 = var8.field4687.method3960(0); var10 != null; var10 = var8.field4687.method3955((byte) -109)) {
                    class486 var11 = this.field5674.method3905(true, (int) var10.field1409);
                    if (var11.field6724) {
                        var10.method792((byte) -119);
                    } else {
                        var9 = true;
                    }
                }
                if (!var9) {
                    var8.field4687 = null;
                }
            }
        }
        class239 var12 = this.field5662;
        synchronized (this.field5662) {
            this.field5662.method1544(true, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public final void method2468(int arg0) {
        class239 var2 = this.field5662;
        synchronized (this.field5662) {
            this.field5662.method1555((byte) -3);
        }
        field5664++;
        class239 var3 = this.field5667;
        synchronized (this.field5667) {
            this.field5667.method1555((byte) -3);
        }
        class351 var4 = this.field5671;
        synchronized (this.field5671) {
            this.field5671.method2209((byte) 117);
            if (arg0 != 1) {
                this.field5671 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
    public final void method2469(int arg0) {
        class351 var2 = this.field5671;
        synchronized (this.field5671) {
            if (arg0 <= 95) {
                this.method2473(36, (byte) -89);
            }
            this.field5671.method2209((byte) 55);
        }
        field5661++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZLbca;IILda;Lha;ZIILha;I)Lvr;")
    public final class147 method2470(int arg0, boolean arg1, class691 arg2, int arg3, int arg4, class66 arg5, class65 arg6, boolean arg7, int arg8, int arg9, class65 arg10, int arg11) {
        field5660++;
        class147 var13 = this.method2474(arg9, arg8, (byte) 16, arg2, arg4, arg3, arg6, arg0);
        if (var13 != null) {
            return var13;
        } else if (arg11 == -25958) {
            class322 var14 = this.method2467(arg11 + 25837, arg0);
            if (arg3 > 1 && var14.field4672 != null) {
                int var15 = -1;
                for (int var16 = 0; var16 < 10; var16++) {
                    if (var14.field4677[var16] <= arg3 && var14.field4677[var16] != 0) {
                        var15 = var14.field4672[var16];
                    }
                }
                if (var15 != -1) {
                    var14 = this.method2467(122, var15);
                }
            }
            int[] var17 = var14.method2043(arg8, arg1, arg9, arg10, arg6, (byte) -89, arg4, arg3, arg2, arg5);
            if (var17 == null) {
                return null;
            }
            class147 var18;
            if (arg7) {
                var18 = arg10.method499(36, var17, true, 0, 32, 36);
            } else {
                var18 = arg6.method499(36, var17, true, 0, 32, 36);
            }
            if (!arg7) {
                class417 var19 = new class417();
                var19.field5986 = arg4;
                var19.field5991 = arg6.field913;
                var19.field5987 = arg3;
                var19.field5985 = arg8;
                var19.field5988 = arg0;
                var19.field5984 = arg2 != null;
                var19.field5979 = arg9;
                this.field5671.method2213(var18, var19, (byte) -121);
            }
            return var18;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
    public static void method2471(boolean arg0) {
        field5668 = null;
        field5665 = null;
        if (arg0) {
            method2463(-22);
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)V")
    public final void method2472(byte arg0) {
        class239 var2 = this.field5667;
        synchronized (this.field5667) {
            this.field5667.method1555((byte) -3);
        }
        field5657++;
        if (arg0 <= 51) {
            this.method2466(false, (byte) -16);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
    public final void method2473(int arg0, byte arg1) {
        field5651++;
        this.field5676 = arg0;
        class239 var3 = this.field5667;
        synchronized (this.field5667) {
            this.field5667.method1555((byte) -3);
        }
        if (arg1 != 114) {
            this.field5656 = -29;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIBLbca;IILha;I)Lvr;")
    public final class147 method2474(int arg0, int arg1, byte arg2, class691 arg3, int arg4, int arg5, class65 arg6, int arg7) {
        this.field5672.field5986 = arg4;
        this.field5672.field5991 = arg6.field913;
        this.field5672.field5988 = arg7;
        field5648++;
        this.field5672.field5987 = arg5;
        this.field5672.field5979 = arg0;
        if (arg2 == 16) {
            this.field5672.field5985 = arg1;
            this.field5672.field5984 = arg3 != null;
            return (class147) this.field5671.method2211(7, this.field5672);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lgia;IZLvfa;Laj;Laj;)V")
    public class389(class285 arg0, int arg1, boolean arg2, class701 arg3, class333 arg4, class333 arg5) {
        this.field5650 = arg1;
        this.field5663 = arg5;
        this.field5674 = arg3;
        this.field5659 = arg4;
        this.field5654 = arg2;
        if (this.field5659 == null) {
            this.field5656 = 0;
        } else {
            int var7 = this.field5659.method2094((byte) -115) - 1;
            this.field5656 = this.field5659.method2090(var7, false) + var7 * 256;
        }
        this.field5673 = new String[] { null, null, class474.field6547.method2780(116, this.field5650), null, null };
        this.field5675 = new String[] { null, null, null, null, class474.field6548.method2780(107, this.field5650) };
    }
}
