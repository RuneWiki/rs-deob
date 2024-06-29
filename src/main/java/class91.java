import java.awt.Image;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class91 extends class110 {

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    private int field1348 = 0;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    private int field1346 = 2048;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "I")
    private int field1361 = 10;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1357 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
    public static int field1360 = 0;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "F")
    public static float field1358;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "Ljava/awt/Image;")
    public static Image field1364;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "[I")
    private int[] field1354;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "[I")
    private int[] field1356;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIZI)V", line = 9)
    public static final void method638(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class205.field3089 = arg3;
        if (arg4) {
            return;
        }
        class168.field2519 = arg0;
        class327.field4918 = arg2;
        class9.field83 = arg1;
        field1355++;
        class43.field528 = arg5;
        if (class205.field3089 >= 100) {
            int var6 = class168.field2519 * 128 + 64;
            int var7 = class327.field4918 * 128 + 64;
            int var8 = class74.method473(var7, var6, 64, class180.field2697) - class9.field83;
            int var9 = var6 - class302.field4612;
            int var10 = var7 - class203.field3052;
            int var11 = var8 - class287.field4338;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class160.field2392 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class84.field1249 = (int) (Math.atan2((double) var9, (double) var10) * -325.949D) & 0x7FF;
            if (class160.field2392 < 128) {
                class160.field2392 = 128;
            }
            if (class160.field2392 > 383) {
                class160.field2392 = 383;
            }
        }
        class56.field710 = 2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZB)I", line = 56)
    public static final int method639(int arg0, int arg1, boolean arg2, byte arg3) {
        field1363++;
        class223 var4 = (class223) class295.field4520.method1320((long) arg1, 13002);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg3 != 65) {
            return -26;
        }
        for (int var6 = 0; var6 < var4.field3398.length; var6++) {
            if (var4.field3398[var6] >= 0 && var4.field3398[var6] < class304.field4633) {
                class253 var7 = class325.method2219(var4.field3398[var6], -9379);
                if (var7.field3782 != null) {
                    class261 var8 = (class261) var7.field3782.method1320((long) arg0, 13002);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field3395[var6] * var8.field3954;
                        } else {
                            var5 += var8.field3954;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLf;I)I", line = 108)
    public static final int method640(byte arg0, class329 arg1, int arg2) {
        field1362++;
        int var3 = 66 % ((arg0 + 26) / 59);
        if (!client.method902(arg1).method137(arg2, 104) && arg1.field4978 == null) {
            return -1;
        } else if (arg1.field4972 == null || arg2 >= arg1.field4972.length) {
            return -1;
        } else {
            return arg1.field4972[arg2];
        }
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V", line = 123)
    private final void method641(int arg0) {
        field1352++;
        this.field1354 = new int[this.field1361 - arg0];
        int var2 = 0;
        this.field1356 = new int[this.field1361 + 1];
        int var3 = 4096 / this.field1361;
        int var4 = this.field1346 * var3 >> 12;
        for (int var5 = 0; var5 < this.field1361; var5++) {
            this.field1356[var5] = var2;
            this.field1354[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1356[this.field1361] = 4096;
        this.field1354[this.field1361] = this.field1354[0] + 4096;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIB)I", line = 157)
    public static final int method642(int arg0, int arg1, byte arg2) {
        field1353++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            if (arg2 != 122) {
                method642(46, 115, (byte) 88);
            }
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILre;I)V", line = 191)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg2 > -37) {
            this.method44(48, (class263) null, -82);
        }
        if (arg0 == 0) {
            this.field1361 = arg1.method1787(false);
        } else if (arg0 == 1) {
            this.field1346 = arg1.method1830((byte) -77);
        } else if (arg0 == 2) {
            this.field1348 = arg1.method1787(false);
        }
        field1359++;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V", line = 235)
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Llm;BII)Lle;", line = 239)
    public static final class127 method643(class210 arg0, byte arg1, int arg2, int arg3) {
        field1351++;
        if (class249.method1680(arg3, arg0, arg2, (byte) -96)) {
            if (arg1 != -64) {
                field1364 = (Image) null;
            }
            return class320.method2198((byte) 119);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V", line = 262)
    public final void method47(int arg0) {
        this.method641(-1);
        field1350++;
        if (arg0 != -9) {
            method639(-44, 0, false, (byte) 61);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[I", line = 279)
    public final int[] method46(int arg0, int arg1) {
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (arg0 != 1) {
            this.field1348 = -66;
        }
        field1347++;
        if (this.field1695.field875) {
            int var4 = class177.field2615[arg1];
            if (this.field1348 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field1361; var6++) {
                    if (this.field1356[var6] <= var4 && this.field1356[var6 + 1] > var4) {
                        if (this.field1354[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class85.method592(var3, 0, class124.field1936, var5);
            } else {
                for (int var7 = 0; var7 < class124.field1936; var7++) {
                    int var8 = 0;
                    int var9 = class249.field3714[var7];
                    int var10 = this.field1348;
                    if (var10 == 1) {
                        var8 = var9;
                    } else if (var10 == 2) {
                        var8 = (var4 + var9 - 4096 >> 1) + 2048;
                    } else if (var10 == 3) {
                        var8 = (var9 - var4 >> 1) + 2048;
                    }
                    short var11 = 0;
                    for (int var12 = 0; var12 < this.field1361; var12++) {
                        if (this.field1356[var12] <= var8 && this.field1356[var12 + 1] > var8) {
                            if (this.field1354[var12] > var8) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var11;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V", line = 387)
    public static void method644(boolean arg0) {
        field1357 = null;
        if (arg0) {
            method644(true);
        }
        field1364 = null;
    }
}
