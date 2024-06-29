import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class40 {

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "[[I")
    private int[][] field612;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Z")
    public static boolean field605 = false;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Z")
    public static boolean field608 = false;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
    public static int[] field606;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIII)V", line = 17)
    public static final void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 <= 29) {
            field608 = true;
        }
        field615++;
        if (class186.method1226(arg4, 0)) {
            class176.field2690 = null;
            class67.method474(arg1, arg0, arg7, arg2, -1, arg3, arg5, 1, arg6, class256.field4376[arg4]);
            if (class176.field2690 != null) {
                class67.method474(arg1, class49.field773, arg7, arg2, -1412584499, class15.field272, arg5, 1, arg6, class176.field2690);
                class176.field2690 = null;
            }
        } else if (arg7 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class296.field4975[var9] = true;
            }
        } else {
            class296.field4975[arg7] = true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BI)[B", line = 61)
    public final byte[] method284(byte[] arg0, int arg1) {
        field613++;
        if (arg1 != 6) {
            return (byte[]) null;
        }
        if (this.field612 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field611 / (long) this.field607) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var8 = this.field612[var6];
                byte var9 = arg0[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var8[var10] * var9;
                }
                int var11 = this.field611 + var6;
                int var12 = var11 / this.field607;
                var5 += var12;
                var6 = var11 - this.field607 * var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 <= 127) {
                    arg0[var13] = (byte) var14;
                } else {
                    arg0[var13] = 127;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)I", line = 132)
    public final int method285(byte arg0, int arg1) {
        field609++;
        if (arg0 < 79) {
            field608 = false;
        }
        if (this.field612 != null) {
            arg1 = (int) ((long) this.field611 * (long) arg1 / (long) this.field607) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)I", line = 147)
    public final int method286(boolean arg0, int arg1) {
        field610++;
        if (this.field612 != null) {
            arg1 = (int) ((long) this.field611 * (long) arg1 / (long) this.field607);
        }
        return arg0 ? 2 : arg1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)V", line = 161)
    public static final void method287(int arg0, boolean arg1) {
        field614++;
        class177.method1155((byte) 96);
        if (class5.field58 != 30 && class5.field58 != 25) {
            return;
        }
        class175.field2680++;
        if (class175.field2680 < 50 && !arg1) {
            return;
        }
        class175.field2680 = arg0;
        if (!class74.field1169 && class47.field725 != null) {
            client.field1745++;
            class147.field2127.method1389((byte) 97, 209);
            try {
                class47.field725.method1185(arg0 ^ 0xFFFFA9EC, class147.field2127.field3610, class147.field2127.field3617, 0);
                class147.field2127.field3610 = 0;
            } catch (IOException var3) {
                class74.field1169 = true;
            }
        }
        class177.method1155((byte) 96);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 194)
    public static void method288(int arg0) {
        if (arg0 == -1245136446) {
            field606 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(II)V", line = 212)
    public class40(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class232.method1650(arg1, arg0, (byte) 101);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field612 = new int[var5][14];
            this.field611 = var4;
            this.field607 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field612[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
