import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class161 extends class71 {

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "[J")
    public static long[] field2908 = new long[256];

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "[J")
    public static long[] field2913;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "[Lni;")
    private class24[] field2915;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "[Lgf;")
    public static class8[] field2911;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[Lud;II)Lud;", line = 4)
    public static final class279 method1272(int arg0, class279[] arg1, int arg2, int arg3) {
        field2914++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg1[arg2 + var5] == null) {
                arg1[arg2 + var5] = class244.field4331;
            }
            var4 += arg1[arg2 + var5].field4967;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg0 <= 32) {
            field2911 = (class8[]) null;
        }
        for (int var8 = 0; var8 < arg3; var8++) {
            class279 var9 = arg1[arg2 + var8];
            class25.method219(var9.field4935, 0, var6, var7, var9.field4967);
            var7 += var9.field4967;
        }
        class279 var10 = new class279();
        var10.field4967 = var4;
        var10.field4935 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V", line = 51)
    public static void method1273(int arg0) {
        field2913 = null;
        if (arg0 != 0) {
            method1273(-99);
        }
        field2911 = null;
        field2908 = null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IB)[I", line = 63)
    public final int[] method199(int arg0, byte arg1) {
        field2917++;
        if (arg1 > -69) {
            return (int[]) null;
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            this.method1274(this.field1390.method550((byte) 45), 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([[II)V", line = 86)
    private final void method1274(int[][] arg0, int arg1) {
        field2910++;
        int var3 = class215.field3787;
        int var4 = class324.field5667;
        class201.method1491(arg0, (byte) -119);
        class16.method146(arg1, class309.field5478, 0, -35, class262.field4688);
        if (this.field2915 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field2915.length; var5++) {
            class24 var6 = this.field2915[var5];
            int var7 = var6.field609;
            int var8 = var6.field614;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method217(var4, 13217, var3);
                }
            } else if (var8 >= 0) {
                var6.method214(var3, true, var4);
            } else {
                var6.method216(-116, var4, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[[I", line = 141)
    public final int[][] method86(int arg0, int arg1) {
        int var3 = -22 / ((arg1 + 70) / 54);
        field2912++;
        int[][] var4 = this.field1400.method1746((byte) -114, arg0);
        if (this.field1400.field4363) {
            int var5 = class215.field3787;
            int var6 = class324.field5667;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = this.field1400.method1747(1);
            this.method1274(var7, 0);
            for (int var9 = 0; var9 < class324.field5667; var9++) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[2];
                int[] var14 = var11[1];
                for (int var15 = 0; var15 < class215.field3787; var15++) {
                    int var16 = var10[var15];
                    var13[var15] = class52.method442(var16 << 4, 4080);
                    var14[var15] = class52.method442(65280, var16) >> 4;
                    var12[var15] = class52.method442(4080, var16 >> 12);
                }
            }
        }
        return var4;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2908[var0] = var1;
        }
        field2913 = new long[1000];
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 206)
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZLvh;)V", line = 210)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field2909++;
        if (!arg1) {
            field2913 = (long[]) null;
        }
        if (arg0 == 0) {
            this.field2915 = new class24[arg2.method483(-113)];
            for (int var4 = 0; var4 < this.field2915.length; var4++) {
                int var5 = arg2.method483(-113);
                if (var5 == 0) {
                    this.field2915[var4] = class163.method1283(arg2, -1305124212);
                } else if (var5 == 1) {
                    this.field2915[var4] = class290.method2072((byte) -78, arg2);
                } else if (var5 == 2) {
                    this.field2915[var4] = class67.method593(arg2, -1051915848);
                } else if (var5 == 3) {
                    this.field2915[var4] = class223.method1638((byte) 115, arg2);
                }
            }
        } else if (arg0 == 1) {
            this.field1389 = arg2.method483(-121) == 1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I", line = 315)
    public static final int method1275(KeyEvent arg0, byte arg1) {
        field2906++;
        int var2 = arg0.getKeyChar();
        int var3 = 95 / ((-arg1 - 49) / 32);
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)I", line = 347)
    public static final int method1276(int arg0, int arg1) {
        if (arg1 != -3420) {
            method1272(34, (class279[]) null, 33, 69);
        }
        field2907++;
        return arg0 >>> 8;
    }
}
