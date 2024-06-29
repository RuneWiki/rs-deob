import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class186 {

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public int field2573 = -1;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "Z")
    public boolean field2574 = false;

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "Z")
    public boolean field2585 = false;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public int field2572 = 5;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "Z")
    public boolean field2578 = false;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
    public int field2582 = -1;

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "I")
    public int field2584 = 2;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    public int field2568 = -1;

    @OriginalMember(owner = "client!hca", name = "t", descriptor = "I")
    public int field2586 = 99;

    @OriginalMember(owner = "client!hca", name = "y", descriptor = "Z")
    public boolean field2591 = false;

    @OriginalMember(owner = "client!hca", name = "u", descriptor = "I")
    public int field2587 = -1;

    @OriginalMember(owner = "client!hca", name = "A", descriptor = "I")
    public int field2593 = -1;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public int field2576;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!hca", name = "v", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!hca", name = "B", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "Ltfa;")
    public class288 field2577;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "Lub;")
    public static class403 field2581;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "[I")
    public int[] field2570;

    @OriginalMember(owner = "client!hca", name = "x", descriptor = "[I")
    private int[] field2590;

    @OriginalMember(owner = "client!hca", name = "C", descriptor = "[I")
    public int[] field2595;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "[Z")
    public boolean[] field2569;

    @OriginalMember(owner = "client!hca", name = "w", descriptor = "[[I")
    public int[][] field2589;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lio;IZ)V")
    private final void method1224(class157 arg0, int arg1, boolean arg2) {
        field2575++;
        if (arg1 == 1) {
            int var4 = arg0.method963(-118);
            this.field2595 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2595[var5] = arg0.method963(-125);
            }
            this.field2570 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2570[var6] = arg0.method963(-121);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2570[var7] = (arg0.method963(-122) << 16) + this.field2570[var7];
            }
        } else if (arg1 == 2) {
            this.field2587 = arg0.method963(-128);
        } else if (arg1 == 3) {
            this.field2569 = new boolean[256];
            int var8 = arg0.method930(255);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2569[arg0.method930(255)] = true;
            }
        } else if (arg1 == 5) {
            this.field2572 = arg0.method930(255);
        } else if (arg1 == 6) {
            this.field2582 = arg0.method963(-128);
        } else if (arg1 == 7) {
            this.field2593 = arg0.method963(-119);
        } else if (arg1 == 8) {
            this.field2586 = arg0.method930(255);
        } else if (arg1 == 9) {
            this.field2568 = arg0.method930(255);
        } else if (arg1 == 10) {
            this.field2573 = arg0.method930(255);
        } else if (arg1 == 11) {
            this.field2584 = arg0.method930(255);
        } else if (arg1 == 12) {
            int var14 = arg0.method930(255);
            this.field2590 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field2590[var15] = arg0.method963(-119);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field2590[var16] += arg0.method963(-127) << 16;
            }
        } else if (arg1 == 13) {
            int var10 = arg0.method963(-127);
            this.field2589 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method930(255);
                if (var12 > 0) {
                    this.field2589[var11] = new int[var12];
                    this.field2589[var11][0] = arg0.method933((byte) 1);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field2589[var11][var13] = arg0.method963(-128);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2591 = true;
        } else if (arg1 == 15) {
            this.field2585 = true;
        } else if (arg1 == 16) {
            this.field2574 = true;
        } else if (arg1 == 18) {
            this.field2578 = true;
        }
        if (arg2) {
            this.field2573 = -51;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)V")
    public final void method1225(boolean arg0) {
        if (this.field2568 == -1) {
            if (this.field2569 == null) {
                this.field2568 = 0;
            } else {
                this.field2568 = 2;
            }
        }
        field2583++;
        if (!arg0 || this.field2573 != -1) {
            return;
        }
        if (this.field2569 == null) {
            this.field2573 = 0;
        } else {
            this.field2573 = 2;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
    public static void method1226(int arg0) {
        if (arg0 == -1) {
            field2581 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILjava/awt/Canvas;)Lfc;")
    public static final class348 method1227(int arg0, Canvas arg1) {
        field2592++;
        try {
            Class var2 = Class.forName("wp");
            if (arg0 < 39) {
                return null;
            } else {
                class348 var3 = (class348) var2.getDeclaredConstructor().newInstance();
                var3.method554((byte) -123, arg1);
                return var3;
            }
        } catch (Throwable var5) {
            class97 var4 = new class97();
            var4.method554((byte) -98, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIIBLda;ZI)Lda;")
    public final class470 method1228(int arg0, int arg1, int arg2, int arg3, byte arg4, class470 arg5, boolean arg6, int arg7) {
        field2588++;
        int var9 = this.field2595[arg3];
        int var10 = this.field2570[arg3];
        class493 var11 = this.field2577.method1704(100, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method649(arg4, arg0, true);
        }
        class493 var13 = null;
        if ((this.field2585 || class654.field9307) && arg7 != -1 && arg7 < this.field2570.length) {
            int var14 = this.field2570[arg7];
            var13 = this.field2577.method1704(100, var14 >> 16);
            arg7 = var14 & 0xFFFF;
        }
        if (this.field2591) {
            arg0 |= 0x200;
        }
        if (var11.method2812(var12, -79)) {
            arg0 |= 0x80;
        }
        if (var11.method2815(-30011, var12)) {
            arg0 |= 0x100;
        }
        if (var11.method2813(var12, false)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2812(arg7, -97)) {
                arg0 |= 0x80;
            }
            if (var13.method2815(-30011, arg7)) {
                arg0 |= 0x100;
            }
            if (var13.method2813(arg7, !arg6)) {
                arg0 |= 0x400;
            }
        }
        int var15 = arg0 | 0x20;
        class470 var16 = arg5.method649(arg4, var15, arg6);
        var16.method2714(this.field2591, -12224, arg1 - 1, var12, arg2, var13, var11, arg7, var9);
        return var16;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILda;IIII)Lda;")
    public final class470 method1229(int arg0, class470 arg1, int arg2, int arg3, int arg4, int arg5) {
        field2594++;
        int var7 = this.field2595[arg2];
        int var8 = this.field2570[arg2];
        class493 var9 = this.field2577.method1704(arg4 ^ 0x763F, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method649((byte) 1, arg0, true);
        }
        class493 var11 = null;
        if ((this.field2585 || class654.field9307) && arg5 != -1 && this.field2570.length > arg5) {
            int var12 = this.field2570[arg5];
            var11 = this.field2577.method1704(100, var12 >> 16);
            arg5 = var12 & 0xFFFF;
        }
        if (arg4 != 30299) {
            this.field2586 = 116;
        }
        class493 var13 = null;
        class493 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2590 != null) {
            if (arg2 < this.field2590.length) {
                var15 = this.field2590[arg2];
                if (var15 != 65535) {
                    var13 = this.field2577.method1704(arg4 ^ 0x763F, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2585 || class654.field9307) && arg5 != -1 && this.field2590.length > arg5) {
                var16 = this.field2590[arg5];
                if (var16 != 65535) {
                    var14 = this.field2577.method1704(100, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2591) {
            arg0 |= 0x200;
        }
        if (var9.method2812(var10, -73)) {
            arg0 |= 0x80;
        }
        if (var9.method2815(-30011, var10)) {
            arg0 |= 0x100;
        }
        if (var9.method2813(var10, false)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2812(var15, arg4 ^ 0xFFFF89F1)) {
                arg0 |= 0x80;
            }
            if (var13.method2815(arg4 ^ 0xFFFFFC9E, var15)) {
                arg0 |= 0x100;
            }
            if (var13.method2813(var15, false)) {
                arg0 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2812(arg5, arg4 - 30379)) {
                arg0 |= 0x80;
            }
            if (var11.method2815(arg4 - 60310, arg5)) {
                arg0 |= 0x100;
            }
            if (var11.method2813(arg5, false)) {
                arg0 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2812(var16, -122)) {
                arg0 |= 0x80;
            }
            if (var14.method2815(-30011, var16)) {
                arg0 |= 0x100;
            }
            if (var14.method2813(var16, false)) {
                arg0 |= 0x400;
            }
        }
        int var17 = arg0 | 0x20;
        class470 var18 = arg1.method649((byte) 1, var17, true);
        var18.method2714(this.field2591, -12224, arg3 - 1, var10, 0, var11, var9, arg5, var7);
        if (var13 != null) {
            var18.method2714(this.field2591, -12224, arg3 - 1, var15, 0, var14, var13, var16, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BII)Z")
    public static final boolean method1230(byte arg0, int arg1, int arg2) {
        field2567++;
        if (arg0 <= 52) {
            return true;
        } else {
            return (arg1 & 0x70000) != 0 | class537.method3020(52, arg2, arg1) || class581.method3204(arg1, arg2, -16711936);
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)Lue;")
    public static final class492 method1231(int arg0) {
        field2571++;
        try {
            return arg0 >= -74 ? null : (class492) Class.forName("jk").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "()V")
    public static final void method1232() {
        class402.method2299(1, class171.field2428);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILio;)V")
    public final void method1233(int arg0, class157 arg1) {
        if (arg0 < 7) {
            this.field2568 = 18;
        }
        while (true) {
            int var3 = arg1.method930(255);
            if (var3 == 0) {
                field2580++;
                return;
            }
            this.method1224(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IBZI)I")
    public final int method1234(int arg0, byte arg1, boolean arg2, int arg3) {
        field2579++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2570[arg0];
        class493 var8 = null;
        if (arg1 > -14) {
            this.method1224(null, -54, true);
        }
        class493 var9 = this.field2577.method1704(100, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2585 || class654.field9307) && arg3 != -1 && arg3 < this.field2570.length) {
            int var11 = this.field2570[arg3];
            var8 = this.field2577.method1704(100, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2591) {
            var5 |= 0x200;
        }
        if (var9.method2812(var10, -55)) {
            var5 |= 0x80;
        }
        if (var9.method2815(-30011, var10)) {
            var5 |= 0x100;
        }
        if (var9.method2813(var10, false)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2812(var6, -71)) {
                var5 |= 0x80;
            }
            if (var8.method2815(-30011, var6)) {
                var5 |= 0x100;
            }
            if (var8.method2813(var6, false)) {
                var5 |= 0x400;
            }
        }
        if (this.field2590 != null && arg2) {
            if (arg0 < this.field2590.length) {
                int var12 = this.field2590[arg0];
                if (var12 != 65535) {
                    class493 var13 = this.field2577.method1704(100, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2812(var14, -123)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2815(-30011, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2813(var14, false)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field2585 || class654.field9307) && arg3 != -1 && arg3 < this.field2590.length) {
                int var15 = this.field2590[arg3];
                if (var15 != 65535) {
                    class493 var16 = this.field2577.method1704(100, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2812(var17, -50)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2815(-30011, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2813(var17, false)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }
}
