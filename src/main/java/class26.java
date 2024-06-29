import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class26 {

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "Lgw;")
    private class690 field333 = new class690(64);

    @OriginalMember(owner = "client!aaa", name = "q", descriptor = "Lgw;")
    public class690 field338 = new class690(50);

    @OriginalMember(owner = "client!aaa", name = "s", descriptor = "Lgw;")
    public class690 field340 = new class690(5);

    @OriginalMember(owner = "client!aaa", name = "p", descriptor = "Lgp;")
    public class553 field337;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "Luu;")
    public class237 field335;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "Z")
    public boolean field322;

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "Luu;")
    private class237 field334;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!aaa", name = "r", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!aaa", name = "t", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V", line = 3)
    public final void method144(int arg0) {
        class690 var2 = this.field338;
        synchronized (this.field338) {
            this.field338.method3906(-128);
            if (arg0 != 1) {
                method154(26, -72, -41L);
            }
        }
        field326++;
        class690 var3 = this.field340;
        synchronized (this.field340) {
            this.field340.method3906(-118);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V", line = 19)
    public final void method145(byte arg0) {
        field332++;
        class690 var2 = this.field333;
        synchronized (this.field333) {
            this.field333.method3902(0);
            if (arg0 != -70) {
                this.method145((byte) -103);
            }
        }
        class690 var3 = this.field338;
        synchronized (this.field338) {
            this.field338.method3902(0);
        }
        class690 var4 = this.field340;
        synchronized (this.field340) {
            this.field340.method3902(0);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)Lsk;", line = 43)
    public final class123 method146(int arg0, int arg1) {
        if (arg0 != 2) {
            this.method145((byte) -25);
        }
        field328++;
        class690 var3 = this.field333;
        class123 var4;
        synchronized (this.field333) {
            var4 = (class123) this.field333.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field334;
        byte[] var6;
        synchronized (this.field334) {
            var6 = this.field334.method1572(class728.method4061((byte) -91, arg1), 0, class618.method3493(arg1, (byte) -12));
        }
        class123 var7 = new class123();
        var7.field1669 = this;
        var7.field1662 = arg1;
        if (var6 != null) {
            var7.method762(-1, new class63(var6));
        }
        var7.method769(true);
        class690 var8 = this.field333;
        synchronized (this.field333) {
            this.field333.method3899(105, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIII)I", line = 80)
    public static final int method147(int arg0, int arg1, int arg2, int arg3) {
        field336++;
        int var4 = arg0 / arg3;
        int var5 = arg3 - 1 & arg0;
        if (arg1 > -94) {
            method151(-47);
        }
        int var6 = arg2 / arg3;
        int var7 = arg3 - 1 & arg2;
        int var8 = class726.method4052(var6, var4, Integer.MAX_VALUE);
        int var9 = class726.method4052(var6, var4 + 1, Integer.MAX_VALUE);
        int var10 = class726.method4052(var6 + 1, var4, Integer.MAX_VALUE);
        int var11 = class726.method4052(var6 + 1, var4 + 1, Integer.MAX_VALUE);
        int var12 = class121.method750(var8, var5, (byte) -67, var9, arg3);
        int var13 = class121.method750(var10, var5, (byte) -67, var11, arg3);
        return class121.method750(var12, var7, (byte) -67, var13, arg3);
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V", line = 112)
    public final void method148(int arg0) {
        field329++;
        class690 var2 = this.field333;
        synchronized (this.field333) {
            this.field333.method3906(-114);
            if (arg0 != 1) {
                this.field337 = null;
            }
        }
        class690 var3 = this.field338;
        synchronized (this.field338) {
            this.field338.method3906(-95);
        }
        class690 var4 = this.field340;
        synchronized (this.field340) {
            this.field340.method3906(-115);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZZ)V", line = 132)
    public final void method149(boolean arg0, boolean arg1) {
        field339++;
        if (this.field322 == arg1) {
            return;
        }
        if (arg0) {
            this.field333 = null;
        }
        this.field322 = arg1;
        this.method148(1);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I[B)[B", line = 147)
    public static final byte[] method150(int arg0, byte[] arg1) {
        field323++;
        class63 var2 = new class63(arg1);
        int var3 = var2.method505((byte) -119);
        int var4 = var2.method457(arg0 - 14531);
        if (arg0 < ~var4 || class464.field6465 != 0 && var4 > class464.field6465) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method449(0, var4, var8, (byte) -120);
            return var8;
        } else {
            int var5 = var2.method457(-14532);
            if (var5 < 0 || !(class464.field6465 == 0 || var5 <= class464.field6465)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class16.method70(var6, var5, arg1, var4, 9);
            } else {
                class698 var7 = class29.field355;
                synchronized (class29.field355) {
                    class29.field355.method3946(var6, arg0 ^ 0xFFFFFF83, var2);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)I", line = 207)
    public static final int method151(int arg0) {
        field327++;
        if ((double) class461.field6392 == 3.0D) {
            return 37;
        } else if ((double) class461.field6392 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 64) {
                field325 = -56;
            }
            if ((double) class461.field6392 == 6.0D) {
                return 75;
            } else if ((double) class461.field6392 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BI)V", line = 233)
    public final void method152(byte arg0, int arg1) {
        class690 var3 = this.field333;
        synchronized (this.field333) {
            if (arg0 != -3) {
                this.method144(86);
            }
            this.field333.method3896(1, arg1);
        }
        field330++;
        class690 var4 = this.field338;
        synchronized (this.field338) {
            this.field338.method3896(arg0 ^ 0xFFFFFFFC, arg1);
        }
        class690 var5 = this.field340;
        synchronized (this.field340) {
            this.field340.method3896(arg0 + 4, arg1);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IB)V", line = 253)
    public final void method153(int arg0, byte arg1) {
        this.field341 = arg0;
        field331++;
        if (arg1 != 80) {
            field325 = -72;
        }
        class690 var3 = this.field338;
        synchronized (this.field338) {
            this.field338.method3906(-116);
        }
        class690 var4 = this.field340;
        synchronized (this.field340) {
            this.field340.method3906(-123);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lgp;IZLuu;Luu;)V", line = 304)
    public class26(class553 arg0, int arg1, boolean arg2, class237 arg3, class237 arg4) {
        this.field337 = arg0;
        this.field335 = arg4;
        this.field322 = arg2;
        this.field334 = arg3;
        if (this.field334 != null) {
            int var6 = this.field334.method1584((byte) 127) - 1;
            this.field334.method1597(var6, 0);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIJ)Ljava/lang/String;", line = 279)
    public static final String method154(int arg0, int arg1, long arg2) {
        field324++;
        class569.method3335(25856, arg2);
        int var4 = class614.field8252.get(5);
        int var5 = class614.field8252.get(2);
        int var6 = class614.field8252.get(1);
        if (arg1 == 3) {
            return class643.method3592(arg2, -26589, arg1);
        } else if (arg0 < 6) {
            return null;
        } else {
            return Integer.toString(var4 / 10) + var4 % 10 + "-" + class696.field9693[arg1][var5] + "-" + var6;
        }
    }
}
