import java.awt.Color;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class18 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lbg;")
    private class317 field290 = null;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    private int field296 = 65000;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Lbg;")
    private class317 field294 = null;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field292 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Lno;")
    public static class5 field301;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field302;

    static {
        new class84("", 76);
        field301 = new class5(0, 0);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[B", line = 3)
    public final byte[] method154(int arg0, int arg1) {
        field289++;
        class317 var3 = this.field290;
        synchronized (this.field290) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field294.method1912(301)) {
                    return null;
                }
                this.field294.method1907(24675, (long) (arg1 * 6));
                this.field294.method1913(arg0 - 167740603, 6, class267.field3717, 0);
                int var5 = ((class267.field3717[1] & 0xFF) << 8) + (class267.field3717[0] & 0xFF << 16) + (class267.field3717[2] & 0xFF);
                int var6 = ((class267.field3717[3] & 0xFF) << 16) - (-(class267.field3717[4] & 0xFF << 8) - (class267.field3717[5] & 0xFF));
                if (var5 < 0 || this.field296 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field290.method1912(301) / 520L) {
                    byte[] var9 = new byte[var5];
                    if (arg0 != 167754640) {
                        field299 = 94;
                    }
                    int var10 = 0;
                    int var11 = 0;
                    label74: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field290.method1907(24675, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field290.method1913(14037, var13 + 8, class267.field3717, 0);
                        int var14 = ((class267.field3717[0] & 0xFF) << 8) + (class267.field3717[1] & 0xFF);
                        int var15 = ((class267.field3717[2] & 0xFF) << 8) + (class267.field3717[3] & 0xFF);
                        int var16 = (class267.field3717[4] & 0xFF << 16) + (class267.field3717[6] & 0xFF) + (class267.field3717[5] & 0xFF << 8);
                        int var17 = class267.field3717[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field300 == var17) {
                            if (var16 >= 0 && (this.field290.method1912(301) / 520L) >= ((long) var16)) {
                                var6 = var16;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label74;
                                    }
                                    var9[var10++] = class267.field3717[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZILjava/lang/String;I)Z", line = 92)
    public static final boolean method155(boolean arg0, int arg1, String arg2, int arg3) {
        field297++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg3 <= 112) {
            field299 = 22;
        }
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg1) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)I", line = 168)
    public static final int method156(byte arg0) {
        field298++;
        if (class90.field1344 == null) {
            int var1 = -68 / ((arg0 + 17) / 59);
            return class244.field3453 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "toString", descriptor = "()Ljava/lang/String;", line = 182)
    public final String toString() {
        field293++;
        return "Cache:" + this.field300;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(ILbg;Lbg;I)V", line = 603)
    public class18(int arg0, class317 arg1, class317 arg2, int arg3) {
        this.field290 = arg1;
        this.field294 = arg2;
        this.field296 = arg3;
        this.field300 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V", line = 198)
    public static final void method157() {
        class227.field3211 = 0;
        label191: for (int var0 = 0; var0 < class173.field2560; var0++) {
            class490 var1 = class376.field5316[var0];
            if (class307.field4202 != null) {
                for (int var2 = 0; var2 < class307.field4202.length; var2++) {
                    if (class307.field4202[var2] != -1000000 && (var1.field6913 <= class307.field4202[var2] || var1.field6915 <= class307.field4202[var2]) && (var1.field6920 <= class229.field3242[var2] || var1.field6907 <= class229.field3242[var2]) && (var1.field6920 >= class129.field1822[var2] || var1.field6907 >= class129.field1822[var2]) && (var1.field6919 <= class35.field570[var2] || var1.field6903 <= class35.field570[var2]) && (var1.field6919 >= class343.field4706[var2] || var1.field6903 >= class343.field4706[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field6925 == 1) {
                int var3 = var1.field6927 + class125.field1713 - class381.field5398;
                if (var3 >= 0 && var3 <= class125.field1713 + class125.field1713) {
                    int var4 = var1.field6904 + class125.field1713 - class8.field171;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field6911 + class125.field1713 - class8.field171;
                    if (var5 > class125.field1713 + class125.field1713) {
                        var5 = class125.field1713 + class125.field1713;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class435.field5973[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class117.field1648 - var1.field6920;
                        if (var7 > class372.field5270) {
                            var1.field6914 = 1;
                        } else {
                            if (var7 >= -class372.field5270) {
                                continue;
                            }
                            var1.field6914 = 2;
                            var7 = -var7;
                        }
                        var1.field6923 = (var1.field6919 - class211.field2979 << 8) / var7;
                        var1.field6909 = (var1.field6903 - class211.field2979 << 8) / var7;
                        var1.field6916 = (var1.field6913 - class471.field6587 << 8) / var7;
                        var1.field6917 = (var1.field6915 - class471.field6587 << 8) / var7;
                        class215.field3048[class227.field3211++] = var1;
                    }
                }
            } else if (var1.field6925 == 2) {
                int var8 = var1.field6904 + class125.field1713 - class8.field171;
                if (var8 >= 0 && var8 <= class125.field1713 + class125.field1713) {
                    int var9 = var1.field6927 + class125.field1713 - class381.field5398;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field6906 + class125.field1713 - class381.field5398;
                    if (var10 > class125.field1713 + class125.field1713) {
                        var10 = class125.field1713 + class125.field1713;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class435.field5973[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class211.field2979 - var1.field6919;
                        if (var12 > class372.field5270) {
                            var1.field6914 = 3;
                        } else {
                            if (var12 >= -class372.field5270) {
                                continue;
                            }
                            var1.field6914 = 4;
                            var12 = -var12;
                        }
                        var1.field6922 = (var1.field6920 - class117.field1648 << 8) / var12;
                        var1.field6910 = (var1.field6907 - class117.field1648 << 8) / var12;
                        var1.field6916 = (var1.field6913 - class471.field6587 << 8) / var12;
                        var1.field6917 = (var1.field6915 - class471.field6587 << 8) / var12;
                        class215.field3048[class227.field3211++] = var1;
                    }
                }
            } else if (var1.field6925 == 4) {
                int var13 = var1.field6913 - class471.field6587;
                if (var13 > class372.field5280) {
                    int var14 = var1.field6904 + class125.field1713 - class8.field171;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field6911 + class125.field1713 - class8.field171;
                    if (var15 > class125.field1713 + class125.field1713) {
                        var15 = class125.field1713 + class125.field1713;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field6927 + class125.field1713 - class381.field5398;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field6906 + class125.field1713 - class381.field5398;
                        if (var17 > class125.field1713 + class125.field1713) {
                            var17 = class125.field1713 + class125.field1713;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class435.field5973[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field6914 = 5;
                            var1.field6922 = (var1.field6920 - class117.field1648 << 8) / var13;
                            var1.field6910 = (var1.field6907 - class117.field1648 << 8) / var13;
                            var1.field6923 = (var1.field6919 - class211.field2979 << 8) / var13;
                            var1.field6909 = (var1.field6903 - class211.field2979 << 8) / var13;
                            class215.field3048[class227.field3211++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V", line = 423)
    public static void method158(boolean arg0) {
        if (!arg0) {
            method155(false, -116, (String) null, -125);
        }
        field292 = null;
        field301 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([BZIII)Z", line = 436)
    private final boolean method159(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field295++;
        class317 var6 = this.field290;
        synchronized (this.field290) {
            try {
                int var7;
                if (arg1) {
                    if ((long) (arg3 * 6 + 6) > this.field294.method1912(301)) {
                        return false;
                    }
                    this.field294.method1907(24675, (long) (arg3 * 6));
                    this.field294.method1913(14037, 6, class267.field3717, 0);
                    var7 = ((class267.field3717[3] & 0xFF) << 16) + ((class267.field3717[4] & 0xFF) << 8) + (class267.field3717[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field290.method1912(301) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field290.method1912(301) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class267.field3717[3] = (byte) (var7 >> 16);
                class267.field3717[0] = (byte) (arg2 >> 16);
                class267.field3717[4] = (byte) (var7 >> 8);
                class267.field3717[5] = (byte) var7;
                class267.field3717[1] = (byte) (arg2 >> 8);
                class267.field3717[2] = (byte) arg2;
                this.field294.method1907(24675, (long) (arg3 * 6));
                this.field294.method1916((byte) 118, 6, class267.field3717, 0);
                int var10 = 0;
                int var11 = 0;
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label110: {
                            this.field290.method1907(24675, (long) (var7 * 520));
                            try {
                                this.field290.method1913(14037, 8, class267.field3717, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class267.field3717[0] & 0xFF << 8) + (class267.field3717[1] & 0xFF);
                            int var14 = ((class267.field3717[2] & 0xFF) << 8) + (class267.field3717[3] & 0xFF);
                            var12 = (class267.field3717[6] & 0xFF) + (((class267.field3717[4] & 0xFF) << 16) + (class267.field3717[5] & 0xFF << 8));
                            int var15 = class267.field3717[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field300 == var15) {
                                if (var12 >= 0 && (this.field290.method1912(301) / 520L) >= ((long) var12)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field290.method1912(301) + 519L) / 520L);
                        arg1 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class267.field3717[2] = (byte) (var11 >> 8);
                    class267.field3717[3] = (byte) var11;
                    class267.field3717[1] = (byte) arg3;
                    class267.field3717[0] = (byte) (arg3 >> 8);
                    class267.field3717[5] = (byte) (var12 >> 8);
                    class267.field3717[7] = (byte) this.field300;
                    class267.field3717[6] = (byte) var12;
                    class267.field3717[4] = (byte) (var12 >> 16);
                    this.field290.method1907(24675, (long) (var7 * 520));
                    this.field290.method1916((byte) 110, 8, class267.field3717, 0);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field290.method1916((byte) 116, var18, arg0, var10);
                    var7 = var12;
                    var11++;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                if (arg4 <= 48) {
                    method158(false);
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[BI)Z", line = 577)
    public final boolean method160(int arg0, int arg1, byte[] arg2, int arg3) {
        field291++;
        class317 var5 = this.field290;
        synchronized (this.field290) {
            if (arg3 < 0 || arg3 > this.field296) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method159(arg2, true, arg3, arg0, 114);
            if (!var6) {
                var6 = this.method159(arg2, false, arg3, arg0, 98);
            }
            return arg1 <= 114 ? true : var6;
        }
    }
}
