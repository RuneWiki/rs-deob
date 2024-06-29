import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class465 extends class238 {

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
    public int field6500;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public int field6502;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6503;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI[I[II)V")
    public static final void method2727(byte arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg4 < arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var8;
            for (int var9 = arg4; var9 < arg1; var9++) {
                if (arg3[var9] < (var9 & 0x1) + var7) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var8;
            method2727((byte) 68, var6 - 1, arg2, arg3, arg4);
            method2727((byte) 68, arg1, arg2, arg3, var6 + 1);
        }
        if (arg0 == 68) {
            field6498++;
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(B)V")
    public static void method2728(byte arg0) {
        if (arg0 != -114) {
            field6503 = null;
        }
        field6503 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public static final void method2729(int arg0) {
        field6501++;
        if (arg0 != 385715408) {
            method2729(51);
        }
        for (class273 var1 = (class273) class387.field5504.method2843(1123227612); var1 != null; var1 = (class273) class387.field5504.method2842(1673506446)) {
            class428 var2 = var1.field3971;
            if (var2.field5997) {
                var1.method1510((byte) -13);
                var2.method2517(-44);
            } else if (class353.field5090 >= var2.field6002) {
                var2.method2518(class332.field4840, 0);
                if (var2.field5997) {
                    var1.method1510((byte) -13);
                } else {
                    class271.method1659(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZILvp;)Lhd;")
    public static final class482 method2730(int arg0, boolean arg1, int arg2, class112 arg3) {
        field6499++;
        int var4 = arg3.field1423 | arg0 << 8;
        class482 var5 = (class482) class204.field3042.method1524(false, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class480.field6733.method1228(class480.field6733.method1252((byte) 103, var4), 47);
        if (var6 == null) {
            int var8 = arg3.field1423 | arg2 + 65536 << 8;
            class482 var9 = (class482) class204.field3042.method1524(false, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class480.field6733.method1228(class480.field6733.method1252((byte) 103, var8), 127);
            if (var10 == null) {
                int var12 = arg3.field1423 | 0xFFFF00;
                if (!arg1) {
                    return null;
                }
                class482 var13 = (class482) class204.field3042.method1524(false, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class480.field6733.method1228(class480.field6733.method1252((byte) 103, var12), 24);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class482 var15 = class286.method1790(false, var14);
                    var15.field6783 = arg3;
                    class204.field3042.method1522((long) var12 << 16, false, var15);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class482 var11 = class286.method1790(!arg1, var10);
                var11.field6783 = arg3;
                class204.field3042.method1522((long) var8 << 16, !arg1, var11);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class482 var7 = class286.method1790(false, var6);
            var7.field6783 = arg3;
            class204.field3042.method1522((long) var4 << 16, false, var7);
            return var7;
        }
    }
}
