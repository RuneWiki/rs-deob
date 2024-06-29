import java.io.File;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class528 {

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "Lae;")
    private class283 field7253;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    private int field7247;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "[[I")
    private int[][] field7251;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "[Z")
    private boolean[] field7250;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Ljava/lang/String;")
    public static String field7246;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7252;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BI)[I")
    public final int[] method3133(byte arg0, int arg1) {
        field7254++;
        if (arg1 < 0 || arg1 >= this.field7251.length) {
            return this.field7247 == -1 ? new int[0] : new int[] { this.field7247 };
        } else if (this.field7250[arg1] && this.field7251[arg1].length > 1) {
            int var3 = this.field7247 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field7251[arg1].length];
            class335.method2124(this.field7251[arg1], 0, var5, 0, var5.length);
            if (arg0 >= -84) {
                method3134((byte) 82, -31, 56);
            }
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class427.method2573(var4, var5.length - var3, -127) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field7251[arg1];
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BII)Z")
    public static final boolean method3134(byte arg0, int arg1, int arg2) {
        if (arg0 > -49) {
            return true;
        } else {
            field7249++;
            return (arg1 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
    public static void method3135(int arg0) {
        field7246 = null;
        if (arg0 != 0) {
            method3134((byte) 25, 118, -2);
        }
        field7252 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)Leu;")
    public final class199 method3136(int arg0, int arg1) {
        field7255++;
        byte[] var3 = this.field7253.method1849(arg0, (byte) 61, arg1);
        class199 var4 = new class199();
        var4.method1289(-93, new class511(var3));
        return var4;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIII)V")
    public static final void method3137(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class120.field1598 != null) {
            class120.field1598[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class57.field668 != null) {
            class57.field668[arg0][arg1] = (short) arg3;
        }
        if (class516.field7086 != null) {
            class516.field7086[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Ljk;ILae;)V")
    public class528(class788 arg0, int arg1, class283 arg2) {
        this.field7253 = arg2;
        this.field7253.method1867(1, (byte) 49);
        class511 var4 = new class511(this.field7253.method1849(0, (byte) 127, 0));
        int var5 = var4.method3013(82);
        if (var5 > 3) {
            this.field7247 = -1;
            this.field7251 = new int[0][];
            this.field7250 = new boolean[0];
        } else {
            int var6 = var4.method3013(-5);
            class475[] var7 = class572.method3360(0);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method3013(42);
                    if (var7[var9].field6588 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method3013(-2);
                int var12 = var4.method3013(-105);
                if (var5 > 2) {
                    this.field7247 = var4.method3034(1);
                } else {
                    this.field7247 = -1;
                }
                this.field7251 = new int[var12 + 1][];
                this.field7250 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method3013(61);
                    this.field7250[var15] = var4.method3013(-118) == 1;
                    int var16 = var4.method3002(-1);
                    if (this.field7247 == -1) {
                        this.field7251[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field7251[var15][var17] = var4.method3002(-1);
                        }
                    } else {
                        this.field7251[var15] = new int[var16 + 1];
                        this.field7251[var15][0] = this.field7247;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field7251[var15][var18 + 1] = var4.method3002(-1);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field7251[var14] == null) {
                        if (this.field7247 == -1) {
                            this.field7251[var14] = new int[0];
                        } else {
                            this.field7251[var14] = new int[] { this.field7247 };
                        }
                    }
                }
            } else {
                this.field7250 = new boolean[0];
                this.field7251 = new int[0][];
                this.field7247 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)Z")
    public final boolean method3138(int arg0) {
        if (arg0 == 0) {
            field7248++;
            return this.field7247 != -1;
        } else {
            return false;
        }
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field7246 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field7252 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }
}
