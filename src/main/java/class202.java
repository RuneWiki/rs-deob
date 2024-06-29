import java.awt.Frame;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class202 extends class70 {

    @OriginalMember(owner = "client!im", name = "p", descriptor = "Ljava/lang/String;")
    public String field3389;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public static int field3390 = 0;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field3388 = 0;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Ljava/awt/Frame;")
    public static Frame field3384;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V", line = 12)
    public static void method1382(int arg0) {
        if (arg0 != 0) {
            field3384 = (Frame) null;
        }
        field3384 = null;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 20)
    public class202() {
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 22)
    public class202(String arg0) {
        this.field3389 = arg0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BILg;)I", line = 35)
    public static final int method1383(byte arg0, int arg1, class181 arg2) {
        field3385++;
        if (arg2.field3093 == null || arg2.field3093.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg2.field3093[arg1];
            int var4 = 0;
            if (arg0 < 101) {
                field3388 = -46;
            }
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 1) {
                    var9 = class128.field2231[var3[var5++]];
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 2) {
                    var9 = class75.field1364[var3[var5++]];
                }
                if (var7 == 3) {
                    var9 = class208.field3474[var3[var5++]];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class181 var12 = class224.method1564(-107, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class296.method2124(0, var13).field359 || class235.field3852)) {
                        for (int var14 = 0; var14 < var12.field2983.length; var14++) {
                            if (var13 + 1 == var12.field2983[var14]) {
                                var9 += var12.field2989[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class334.field5322[var3[var5++]];
                }
                if (var7 == 6) {
                    var9 = class26.field671[class75.field1364[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class334.field5322[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class96.field1750.field1776;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class86.field1485[var15]) {
                            var9 += class75.field1364[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class181 var18 = class224.method1564(-116, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class296.method2124(0, var19).field359 || class235.field3852)) {
                        for (int var20 = 0; var20 < var18.field2983.length; var20++) {
                            if ((var19 + 1) == var18.field2983[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class14.field408;
                }
                if (var7 == 12) {
                    var9 = class78.field1381;
                }
                if (var7 == 13) {
                    int var21 = class334.field5322[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = class252.method1779(-6741, var23);
                }
                if (var7 == 18) {
                    var9 = (class96.field1750.field199 >> 7) + class272.field4426;
                }
                if (var7 == 19) {
                    var9 = (class96.field1750.field213 >> 7) + class21.field543;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var9;
                    }
                    if (var6 == 1) {
                        var4 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var6 == 3) {
                        var4 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)V", line = 244)
    public static final void method1384(byte arg0, int arg1) {
        field3387++;
        if (!class115.field2080) {
            arg1 = -1;
        }
        if (class1.field7 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class215 var2 = class18.method174(arg1, 2);
            class288 var3 = var2.method1497(0);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class59.field1164.method1125(var3.field1355, class209.field3489, var3.method1298(), new Point(var2.field3585, var2.field3586), 17, var3.field1359);
                class1.field7 = arg1;
            }
        }
        if (arg1 == -1 && class1.field7 != -1) {
            class59.field1164.method1125(-1, class209.field3489, (int[]) null, new Point(), 17, -1);
            class1.field7 = -1;
        }
        int var4 = -95 / ((arg0 + 82) / 40);
    }
}
