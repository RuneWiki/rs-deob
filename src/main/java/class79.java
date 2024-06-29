import java.awt.Rectangle;
import java.io.EOFException;
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class79 {

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "Lhp;")
    private class346 field1087 = null;

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
    private int field1094 = 65000;

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "Lhp;")
    private class346 field1093 = null;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    public static int field1086 = 0;

    @OriginalMember(owner = "client!naa", name = "l", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1085 = Calendar.getInstance();

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1090 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!naa", name = "m", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!naa", name = "n", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V", line = 4)
    public static void method632(int arg0) {
        field1085 = null;
        field1090 = null;
        if (arg0 != 5) {
            field1086 = 36;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BI)[B", line = 20)
    public final byte[] method633(byte arg0, int arg1) {
        field1097++;
        class346 var3 = this.field1087;
        synchronized (this.field1087) {
            try {
                if (this.field1093.method2204((byte) 29) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field1093.method2203(-5442, (long) (arg1 * 6));
                this.field1093.method2202(6, 0, class582.field7909, false);
                if (arg0 != 28) {
                    method632(-110);
                }
                int var5 = ((class582.field7909[0] & 0xFF) << 16) + (((class582.field7909[1] & 0xFF) << 8) + (class582.field7909[2] & 0xFF));
                int var6 = (class582.field7909[4] & 0xFF << 8) + (class582.field7909[3] & 0xFF << 16) + (class582.field7909[5] & 0xFF);
                if (var5 < 0 || this.field1094 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field1087.method2204((byte) 29) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1087.method2203(-5442, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1087.method2202(var13 + 8, 0, class582.field7909, false);
                        int var14 = (class582.field7909[0] & 0xFF << 8) + (class582.field7909[1] & 0xFF);
                        int var15 = ((class582.field7909[2] & 0xFF) << 8) + (class582.field7909[3] & 0xFF);
                        int var16 = (class582.field7909[6] & 0xFF) + ((class582.field7909[4] & 0xFF << 16) + ((class582.field7909[5] & 0xFF) << 8));
                        int var17 = class582.field7909[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field1088 == var17) {
                            if (var16 >= 0 && (this.field1087.method2204((byte) 29) / 520L) >= ((long) var16)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class582.field7909[var20 + 8];
                                }
                                var6 = var16;
                                var11++;
                                continue;
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

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIBII)V", line = 106)
    public static final void method634(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class689.field9209; var5++) {
            Rectangle var6 = class561.field7691[var5];
            if (var6.x + var6.width > arg0 && arg0 + arg3 > var6.x && var6.y + var6.height > arg4 && var6.y < arg1 + arg4) {
                class600.field8182[var5] = true;
            }
        }
        if (arg2 != -81) {
            method634(49, -115, (byte) 21, -43, -47);
        }
        field1089++;
        class199.method1300(arg4, arg0 + arg3, 8963, arg0, arg1 + arg4);
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(ILhp;Lhp;I)V", line = 356)
    public class79(int arg0, class346 arg1, class346 arg2, int arg3) {
        this.field1088 = arg0;
        this.field1087 = arg1;
        this.field1093 = arg2;
        this.field1094 = arg3;
    }

    @OriginalMember(owner = "client!naa", name = "toString", descriptor = "()Ljava/lang/String;", line = 141)
    public final String toString() {
        field1092++;
        return "Cache:" + this.field1088;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IBIILtha;)V", line = 150)
    public static final void method635(int arg0, byte arg1, int arg2, int arg3, class309 arg4) {
        field1095++;
        if (arg1 != -39) {
            return;
        }
        long var5 = (long) (arg3 << 28 | arg0 << 14 | arg2);
        class769 var7 = (class769) class523.field7265.method1248(arg1 + 124, var5);
        if (var7 == null) {
            class769 var8 = new class769();
            class523.field7265.method1247(4070, var5, var8);
            var8.field10592.method689(arg4, 127);
            return;
        }
        class369 var9 = class16.field156.method2121(arg4.field4380, arg1 + 25967);
        int var10 = var9.field5376;
        if (var9.field5367 == 1) {
            var10 = (arg4.field4386 + 1) * var10;
        }
        for (class309 var11 = (class309) var7.field10592.method679((byte) -86); var11 != null; var11 = (class309) var7.field10592.method681(-77)) {
            class369 var12 = class16.field156.method2121(var11.field4380, 25928);
            int var13 = var12.field5376;
            if (var12.field5367 == 1) {
                var13 = (var11.field4386 + 1) * var13;
            }
            if (var10 > var13) {
                class503.method2940(115, arg4, var11);
                return;
            }
        }
        var7.field10592.method689(arg4, -107);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "([BIIZ)Z", line = 202)
    public final boolean method636(byte[] arg0, int arg1, int arg2, boolean arg3) {
        field1091++;
        class346 var5 = this.field1087;
        synchronized (this.field1087) {
            if (arg2 < 0 || arg2 > this.field1094) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method637(arg2, arg0, (byte) 31, arg1, arg3);
            if (!var6) {
                var6 = this.method637(arg2, arg0, (byte) 31, arg1, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I[BBIZ)Z", line = 230)
    private final boolean method637(int arg0, byte[] arg1, byte arg2, int arg3, boolean arg4) {
        field1098++;
        class346 var6 = this.field1087;
        synchronized (this.field1087) {
            try {
                int var7;
                if (arg4) {
                    if (this.field1093.method2204((byte) 29) < ((long) (arg3 * 6 + 6))) {
                        return false;
                    }
                    this.field1093.method2203(-5442, (long) (arg3 * 6));
                    this.field1093.method2202(6, 0, class582.field7909, false);
                    var7 = (class582.field7909[4] & 0xFF << 8) + (class582.field7909[3] & 0xFF << 16) + (class582.field7909[5] & 0xFF);
                    if (var7 <= 0 || (this.field1087.method2204((byte) 29) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1087.method2204((byte) 29) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class582.field7909[3] = (byte) (var7 >> 16);
                class582.field7909[1] = (byte) (arg0 >> 8);
                class582.field7909[0] = (byte) (arg0 >> 16);
                class582.field7909[4] = (byte) (var7 >> 8);
                if (arg2 != 31) {
                    return false;
                }
                class582.field7909[2] = (byte) arg0;
                class582.field7909[5] = (byte) var7;
                this.field1093.method2203(-5442, (long) (arg3 * 6));
                this.field1093.method2196(class582.field7909, (byte) 106, 6, 0);
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg0) {
                    int var13 = 0;
                    if (arg4) {
                        label110: {
                            this.field1087.method2203(arg2 - 5473, (long) (var7 * 520));
                            try {
                                this.field1087.method2202(8, 0, class582.field7909, false);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = (class582.field7909[0] & 0xFF << 8) + (class582.field7909[1] & 0xFF);
                            var13 = ((class582.field7909[4] & 0xFF) << 16) + (class582.field7909[6] & 0xFF) + ((class582.field7909[5] & 0xFF) << 8);
                            int var15 = (class582.field7909[2] & 0xFF << 8) + (class582.field7909[3] & 0xFF);
                            int var16 = class582.field7909[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field1088 == var16) {
                                if (var13 >= 0 && (this.field1087.method2204((byte) 29) / 520L) >= ((long) var13)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field1087.method2204((byte) 29) + 519L) / 520L);
                        arg4 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class582.field7909[1] = (byte) arg3;
                    class582.field7909[2] = (byte) (var12 >> 8);
                    class582.field7909[3] = (byte) var12;
                    class582.field7909[0] = (byte) (arg3 >> 8);
                    if (arg0 - var11 <= 512) {
                        var13 = 0;
                    }
                    class582.field7909[6] = (byte) var13;
                    class582.field7909[5] = (byte) (var13 >> 8);
                    class582.field7909[7] = (byte) this.field1088;
                    class582.field7909[4] = (byte) (var13 >> 16);
                    this.field1087.method2203(arg2 - 5473, (long) (var7 * 520));
                    this.field1087.method2196(class582.field7909, (byte) 115, 8, 0);
                    int var19 = arg0 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field1087.method2196(arg1, (byte) -100, var19, var11);
                    var12++;
                    var11 += var19;
                    var7 = var13;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZZ)Z", line = 375)
    public static boolean method638(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
