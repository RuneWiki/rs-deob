import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public abstract class class573 extends class425 {

    @OriginalMember(owner = "client!mfa", name = "D", descriptor = "Z")
    public boolean field8334;

    @OriginalMember(owner = "client!mfa", name = "t", descriptor = "[Lmfa;")
    public class573[] field8324;

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "[S")
    private static short[] field8317 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "[S")
    private static short[] field8316 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!mfa", name = "o", descriptor = "[S")
    private static short[] field8319 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!mfa", name = "y", descriptor = "[S")
    private static short[] field8329 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!mfa", name = "C", descriptor = "[[S")
    public static short[][] field8333 = new short[][] { field8319, field8316, field8317, field8329 };

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "Lsb;")
    public static class266 field8314 = new class266(36, 7);

    @OriginalMember(owner = "client!mfa", name = "H", descriptor = "Lqfa;")
    public static class85 field8338 = new class85(71, 1);

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
    public int field8315;

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!mfa", name = "r", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!mfa", name = "u", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!mfa", name = "v", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!mfa", name = "w", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!mfa", name = "x", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!mfa", name = "z", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!mfa", name = "A", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!mfa", name = "B", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!mfa", name = "E", descriptor = "I")
    public static int field8335;

    @OriginalMember(owner = "client!mfa", name = "F", descriptor = "I")
    public static int field8336;

    @OriginalMember(owner = "client!mfa", name = "G", descriptor = "I")
    public static int field8337;

    @OriginalMember(owner = "client!mfa", name = "p", descriptor = "Lida;")
    public class216 field8320;

    @OriginalMember(owner = "client!mfa", name = "q", descriptor = "Let;")
    public class552 field8321;

    @OriginalMember(owner = "client!mfa", name = "s", descriptor = "Ljava/lang/Object;")
    public static Object field8323;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lqh;II)V")
    public void method443(class61 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.field8334 = false;
        }
        field8327++;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)I")
    public int method672(byte arg0) {
        if (arg0 <= 125) {
            method3295((byte) -23);
        }
        field8328++;
        return -1;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V")
    public void method617(int arg0) {
        field8322++;
        if (arg0 != 4095) {
            this.field8334 = false;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "(I)V")
    public void method671(int arg0) {
        if (arg0 != -10208) {
            this.field8321 = null;
        }
        field8318++;
        if (this.field8334) {
            this.field8321.method3161(true);
            this.field8321 = null;
        } else {
            this.field8320.method1506((byte) 65);
            this.field8320 = null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(III)[I")
    public final int[] method3292(int arg0, int arg1, int arg2) {
        field8326++;
        if (arg1 != 0) {
            this.field8321 = null;
        }
        return this.field8324[arg0].field8334 ? this.field8324[arg0].method619(arg2, 1) : this.field8324[arg0].method442(arg1 - 117, arg2)[0];
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(III)[[I")
    public final int[][] method3293(int arg0, int arg1, int arg2) {
        field8337++;
        int var4 = 103 % ((arg1 - 83) / 42);
        if (this.field8324[arg0].field8334) {
            int[] var5 = this.field8324[arg0].method619(arg2, 1);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field8324[arg0].method442(-125, arg2);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)[I")
    public int[] method619(int arg0, int arg1) {
        field8325++;
        if (arg1 != 1) {
            this.method617(-103);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(II)I")
    public static final int method3294(int arg0, int arg1) {
        if (arg1 != -3) {
            method3295((byte) -104);
        }
        field8335++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xC3) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)V")
    public static void method3295(byte arg0) {
        int var1 = -26 / ((arg0 - 68) / 51);
        field8314 = null;
        field8319 = null;
        field8317 = null;
        field8333 = null;
        field8323 = null;
        field8316 = null;
        field8329 = null;
        field8338 = null;
    }

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "(I)I")
    public int method793(int arg0) {
        if (arg0 == 967) {
            field8336++;
            return -1;
        } else {
            return -98;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IBI)V")
    public void method790(int arg0, byte arg1, int arg2) {
        field8332++;
        int var4 = this.field8315 == 255 ? arg0 : this.field8315;
        int var5 = -78 / ((69 - arg1) / 40);
        if (this.field8334) {
            this.field8321 = new class552(var4, arg0, arg2);
        } else {
            this.field8320 = new class216(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "(I)V")
    public static final void method3296(int arg0) {
        field8330++;
        class263 var1 = null;
        try {
            class456 var2 = class604.field8775.method402("2", true, (byte) -127);
            while (var2.field6502 == 0) {
                class185.method1354(1L, 10);
            }
            if (~var2.field6502 == arg0) {
                var1 = (class263) var2.field6499;
                byte[] var3 = new byte[(int) var1.method1721(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1728(var3, var4, (byte) -65, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class91.method882(new class61(var3), arg0 - 121);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1726((byte) -128);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(IZ)V")
    public class573(int arg0, boolean arg1) {
        this.field8334 = arg1;
        this.field8324 = new class573[arg0];
    }

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(II)[[I")
    public int[][] method442(int arg0, int arg1) {
        field8331++;
        if (arg0 < -116) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }
}
