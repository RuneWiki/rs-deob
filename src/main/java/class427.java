import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class427 extends class143 {

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "Lvh;")
    public static class125 field6092 = new class125(52, -1);

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "Ldq;")
    public static class516 field6096;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(JI)V")
    public static final void method2511(long arg0, int arg1) {
        field6095++;
        int var3 = class345.field4885 + class103.field1708.field3155;
        int var4 = class208.field3205 + class103.field1708.field3154;
        if (class606.field8728 - var3 < -2000 || class606.field8728 - var3 > 2000 || (class392.field5704 - var4) < -2000 || class392.field5704 - var4 > 2000) {
            class606.field8728 = var3;
            class392.field5704 = var4;
        }
        if (class606.field8728 != var3) {
            int var5 = var3 - class606.field8728;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class606.field8728 += var6;
        }
        if (!class525.field7713.field5977) {
            class636.field9031 += (float) arg0 * class609.field8756 / 6.0F;
            class473.field6790 += (float) arg0 * class677.field9647 / 6.0F;
        }
        if (class392.field5704 != var4) {
            int var7 = var4 - class392.field5704;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class392.field5704 += var8;
        }
        class689.method3882((byte) 86);
        int var9 = -86 / ((arg1 - 17) / 39);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsj;B)V")
    public static final void method2512(class373 arg0, byte arg1) {
        field6093++;
        arg0.method2229((byte) 22);
        int var2 = 0;
        for (int var3 = 0; var3 < class643.field9134; var3++) {
            int var15 = class98.field1458[var3];
            if ((class332.field4622[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class332.field4622[var15] = (byte) class460.method2676(class332.field4622[var15], 2);
                } else {
                    int var16 = arg0.method2231(1, -57);
                    if (var16 == 0) {
                        var2 = class82.method624(arg0, 37);
                        class332.field4622[var15] = (byte) class460.method2676(class332.field4622[var15], 2);
                    } else {
                        class656.method3704(arg0, arg1 ^ 0xFFFFFFF5, var15);
                    }
                }
            }
        }
        arg0.method2228(-112);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        if (arg1 != -6) {
            method2514(null, (byte) 77, -105, 121);
        }
        arg0.method2229((byte) 127);
        for (int var4 = 0; var4 < class643.field9134; var4++) {
            int var13 = class98.field1458[var4];
            if ((class332.field4622[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class332.field4622[var13] = (byte) class460.method2676(class332.field4622[var13], 2);
                    var2--;
                } else {
                    int var14 = arg0.method2231(1, arg1 ^ 0xFFFFFF81);
                    if (var14 == 0) {
                        var2 = class82.method624(arg0, 125);
                        class332.field4622[var13] = (byte) class460.method2676(class332.field4622[var13], 2);
                    } else {
                        class656.method3704(arg0, 15, var13);
                    }
                }
            }
        }
        arg0.method2228(122);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method2229((byte) -107);
        for (int var5 = 0; var5 < class418.field5942; var5++) {
            int var11 = class57.field855[var5];
            if ((class332.field4622[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class332.field4622[var11] = (byte) class460.method2676(class332.field4622[var11], 2);
                    var2--;
                } else {
                    int var12 = arg0.method2231(1, -69);
                    if (var12 == 0) {
                        var2 = class82.method624(arg0, 58);
                        class332.field4622[var11] = (byte) class460.method2676(class332.field4622[var11], 2);
                    } else if (class503.method3002(var11, arg0, 86)) {
                        class332.field4622[var11] = (byte) class460.method2676(class332.field4622[var11], 2);
                    }
                }
            }
        }
        arg0.method2228(-81);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method2229((byte) 123);
        for (int var6 = 0; var6 < class418.field5942; var6++) {
            int var9 = class57.field855[var6];
            if ((class332.field4622[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class332.field4622[var9] = (byte) class460.method2676(class332.field4622[var9], 2);
                } else {
                    int var10 = arg0.method2231(1, 117);
                    if (var10 == 0) {
                        var2 = class82.method624(arg0, 115);
                        class332.field4622[var9] = (byte) class460.method2676(class332.field4622[var9], 2);
                    } else if (class503.method3002(var9, arg0, 76)) {
                        class332.field4622[var9] = (byte) class460.method2676(class332.field4622[var9], 2);
                    }
                }
            }
        }
        arg0.method2228(-44);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class418.field5942 = 0;
        class643.field9134 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class332.field4622[var7] = (byte) (class332.field4622[var7] >> 1);
            class270 var8 = class76.field1186[var7];
            if (var8 == null) {
                class57.field855[class418.field5942++] = var7;
            } else {
                class98.field1458[class643.field9134++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static void method2513(boolean arg0) {
        field6092 = null;
        if (arg0) {
            method2513(false);
        }
        field6096 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/lang/String;BII)Ljava/lang/String;")
    public static final String method2514(String[] arg0, byte arg1, int arg2, int arg3) {
        field6094++;
        if (arg1 != -22) {
            field6092 = null;
        }
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg0[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }
}
