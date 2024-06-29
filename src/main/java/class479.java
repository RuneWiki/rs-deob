import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class479 extends class617 {

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    private int field6897;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "[Lgf;")
    public class523[] field6901;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "[[B")
    private byte[][] field6894;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)Z", line = 3)
    public final boolean method2755(int arg0, int arg1) {
        if (arg0 > -63) {
            this.method2755(9, 34);
        }
        field6898++;
        return this.field6901[arg1].field7417;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)Z", line = 18)
    public final boolean method2756(int arg0, byte arg1) {
        field6900++;
        return arg1 >= -41 ? true : this.field6901[arg0].field7405;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V", line = 31)
    public static final void method2757(byte arg0) {
        if (arg0 != -118) {
            return;
        }
        class169.field1887 = null;
        class674.field9378 = null;
        class587.field8315 = null;
        class430.field6107 = null;
        class262.field3268 = null;
        class699.field9807 = null;
        class8.field88 = null;
        field6899++;
        class128.field1438 = null;
        class563.field8047 = null;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(II)Z", line = 51)
    public final boolean method2758(int arg0, int arg1) {
        if (arg1 != 7527) {
            method2761(125, -23, -59);
        }
        field6895++;
        return this.field6901[arg0].field7413;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[B)V", line = 63)
    public static final void method2759(int arg0, byte[] arg1) {
        field6892++;
        if (arg0 <= 0) {
            return;
        }
        class115 var2 = new class115(arg1);
        while (true) {
            int var3;
            label49: do {
                while (true) {
                    while (true) {
                        var3 = var2.method620((byte) 1);
                        if (var3 == 0) {
                            return;
                        }
                        if (var3 == 1) {
                            int[] var8 = class361.field4842 = new int[6];
                            var8[0] = var2.method643((byte) -77);
                            var8[1] = var2.method643((byte) -77);
                            var8[2] = var2.method643((byte) -77);
                            var8[3] = var2.method643((byte) -77);
                            var8[4] = var2.method643((byte) -77);
                            var8[5] = var2.method643((byte) -77);
                        } else {
                            if (var3 != 4) {
                                continue label49;
                            }
                            int var6 = var2.method620((byte) -127);
                            class236.field2942 = new int[var6];
                            for (int var7 = 0; var7 < var6; var7++) {
                                class236.field2942[var7] = var2.method643((byte) -77);
                                if (class236.field2942[var7] == 65535) {
                                    class236.field2942[var7] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var3 != 5);
            int var4 = var2.method620((byte) -126);
            class665.field9295 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                class665.field9295[var5] = var2.method643((byte) -77);
                if (class665.field9295[var5] == 65535) {
                    class665.field9295[var5] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Z", line = 139)
    public final boolean method2760(int arg0) {
        field6896++;
        if (this.field6901 != null) {
            return true;
        }
        if (this.field6894 == null) {
            class701 var2 = class503.field7255;
            synchronized (class503.field7255) {
                if (!class503.field7255.method3882(59, this.field6897)) {
                    return false;
                }
                int[] var4 = class503.field7255.method3852(-120, this.field6897);
                this.field6894 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field6894[var5] = class503.field7255.method3854((byte) 67, this.field6897, var4[var5]);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field6894.length; var7++) {
            byte[] var8 = this.field6894[var7];
            class115 var9 = new class115(var8);
            var9.field1218 = 1;
            int var10 = var9.method643((byte) -77);
            class701 var11 = class140.field1551;
            synchronized (class140.field1551) {
                var6 &= class140.field1551.method3849(var10, false);
            }
        }
        if (!var6) {
            return false;
        }
        class616 var12 = new class616();
        class701 var13 = class503.field7255;
        int[] var15;
        synchronized (class503.field7255) {
            int var14 = class503.field7255.method3883(this.field6897, arg0 ^ arg0);
            this.field6901 = new class523[var14];
            var15 = class503.field7255.method3852(-11, this.field6897);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field6894[var16];
            class115 var18 = new class115(var17);
            var18.field1218 = 1;
            int var19 = var18.method643((byte) -77);
            class416 var20 = null;
            for (class416 var21 = (class416) var12.method3434((byte) 2); var21 != null; var21 = (class416) var12.method3430(true)) {
                if (var21.field5581 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class701 var22 = class140.field1551;
                synchronized (class140.field1551) {
                    var20 = new class416(var19, class140.field1551.method3859((byte) 115, var19));
                }
                var12.method3425(var20, false);
            }
            this.field6901[var15[var16]] = new class523(var17, var20);
        }
        this.field6894 = null;
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)I", line = 246)
    public static final int method2761(int arg0, int arg1, int arg2) {
        field6893++;
        int var3 = arg0 >> 31 & arg1 + arg2;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I)V", line = 256)
    public class479(int arg0) {
        this.field6897 = arg0;
    }
}
