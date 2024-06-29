import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class284 extends class215 {

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field4163 = 0;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "Leh;")
    public static class246 field4164 = new class246(5, -2);

    @OriginalMember(owner = "client!we", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4166 = null;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;)I", line = 5)
    public static final int method1759(int arg0, String arg1) {
        field4161++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 > '߿') {
                var3 += 3;
            } else {
                var3 += 2;
            }
        }
        if (arg0 < 124) {
            method1761(33, null, -105, null, null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 44)
    public static void method1760(int arg0) {
        field4166 = null;
        field4164 = null;
        if (arg0 != 1399668615) {
            field4166 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILl;ILnt;Ljava/awt/Canvas;)Lza;", line = 57)
    public static final class290 method1761(int arg0, class16 arg1, int arg2, class151 arg3, Canvas arg4) {
        field4165++;
        if (arg0 != -2) {
            field4163 = 20;
        }
        return new class199(arg2, arg4, arg1, arg3);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V", line = 72)
    public static final void method1762(byte arg0) {
        field4162++;
        if (class4.field81.method1786(-95, class405.field5737) != 2) {
            return;
        }
        byte var1 = (byte) (class402.field5649 - 4 & 0xFF);
        int var2 = 78 % ((88 - arg0) / 34);
        int var3 = class402.field5649 % class43.field494;
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var17 = 0; var17 < class500.field7068; var17++) {
                class453.field6348[var4][var3][var17] = var1;
            }
        }
        if (class320.field4627 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class405.field5736[var5] = -1000000;
            class14.field188[var5] = 1000000;
            class427.field6022[var5] = 0;
            class63.field792[var5] = 1000000;
            class542.field7924[var5] = 0;
        }
        if (class504.field7461 != 1) {
            int var16 = class488.method2817(class478.field6654, true, class515.field7596, class320.field4627);
            if (var16 - class51.field619 >= 800 || (class368.field5253[class320.field4627][class478.field6654 >> 7][class515.field7596 >> 7] & 0x4) == 0) {
                return;
            }
            class235.method1441(false, class515.field7596 >> 7, 1, class478.field6654 >> 7, class268.field3910, (byte) 121);
            return;
        }
        if ((class368.field5253[class320.field4627][class246.field3587.field1896 >> 7][class246.field3587.field1899 >> 7] & 0x4) != 0) {
            class235.method1441(false, class246.field3587.field1899 >> 7, 0, class246.field3587.field1896 >> 7, class268.field3910, (byte) 127);
        }
        if (class41.field450 >= 2560) {
            return;
        }
        int var6 = class478.field6654 >> 7;
        int var7 = class515.field7596 >> 7;
        int var8 = class246.field3587.field1896 >> 7;
        int var9 = class246.field3587.field1899 >> 7;
        int var10;
        if (var6 >= var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var7 >= var9) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        if ((var10 != 0 || var11 != 0) && -class43.field494 < var10 && var10 < class43.field494 && -class500.field7068 < var11 && class500.field7068 > var11) {
            if (var11 < var10) {
                int var12 = var11 * 65536 / var10;
                int var13 = 32768;
                while (var6 != var8) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class368.field5253[class320.field4627][var6][var7] & 0x4) != 0) {
                        class235.method1441(false, var7, 1, var6, class268.field3910, (byte) 117);
                        return;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var9 > var7) {
                            var7++;
                        } else if (var9 < var7) {
                            var7--;
                        }
                        if ((class368.field5253[class320.field4627][var6][var7] & 0x4) != 0) {
                            class235.method1441(false, var7, 1, var6, class268.field3910, (byte) 115);
                            return;
                        }
                    }
                }
                return;
            }
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var7 != var9) {
                if (var9 > var7) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class368.field5253[class320.field4627][var6][var7] & 0x4) != 0) {
                    class235.method1441(false, var7, 1, var6, class268.field3910, (byte) 119);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class368.field5253[class320.field4627][var6][var7] & 0x4) != 0) {
                        class235.method1441(false, var7, 1, var6, class268.field3910, (byte) 120);
                        return;
                    }
                }
            }
            return;
        }
        class406.method2409(3896, null, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class441.field6171 + "," + class367.field5241);
        return;
    }
}
