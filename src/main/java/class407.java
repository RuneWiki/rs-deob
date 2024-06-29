import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class407 implements class749 {

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Lni;")
    private class522 field5743;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lfc;")
    public static class262 field5741 = new class262(5);

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Z")
    public static boolean field5745 = false;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 4)
    public static final void method2349(int arg0) {
        field5744++;
        class395.field5617.method408(class403.field5689, class681.field9487, class300.field4058);
        if (arg0 != -19004) {
            field5745 = true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 17)
    public static void method2350(int arg0) {
        field5741 = null;
        if (arg0 != 0) {
            field5741 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lfl;ILjava/lang/Object;)V", line = 27)
    public static final void method2351(class739 arg0, int arg1, Object arg2) {
        field5739++;
        if (arg0.field10306 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field10306.peekEvent() != null; var3++) {
            class267.method1599(0, 1L);
        }
        try {
            if (arg1 == 31668 && arg2 != null) {
                arg0.field10306.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lbi;I)V", line = 56)
    public static final void method2352(class481 arg0, int arg1) {
        field5738++;
        arg0.method2701(0);
        int var2 = 0;
        for (int var3 = 0; var3 < class427.field6032; var3++) {
            int var15 = class619.field8682[var3];
            if ((class391.field5547[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class391.field5547[var15] = (byte) class344.method2020(class391.field5547[var15], 2);
                } else {
                    int var16 = arg0.method2702((byte) -106, 1);
                    if (var16 == 0) {
                        var2 = class335.method1992(arg1 + 1, arg0);
                        class391.field5547[var15] = (byte) class344.method2020(class391.field5547[var15], 2);
                    } else {
                        class12.method44(var15, 12, arg0);
                    }
                }
            }
        }
        arg0.method2699((byte) 120);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method2701(0);
        for (int var4 = 0; var4 < class427.field6032; var4++) {
            int var13 = class619.field8682[var4];
            if ((class391.field5547[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class391.field5547[var13] = (byte) class344.method2020(class391.field5547[var13], 2);
                    var2--;
                } else {
                    int var14 = arg0.method2702((byte) -29, 1);
                    if (var14 == 0) {
                        var2 = class335.method1992(0, arg0);
                        class391.field5547[var13] = (byte) class344.method2020(class391.field5547[var13], 2);
                    } else {
                        class12.method44(var13, arg1 + 13, arg0);
                    }
                }
            }
        }
        arg0.method2699((byte) 120);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method2701(0);
        for (int var5 = 0; var5 < class147.field1898; var5++) {
            int var11 = class430.field6059[var5];
            if ((class391.field5547[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class391.field5547[var11] = (byte) class344.method2020(class391.field5547[var11], 2);
                    var2--;
                } else {
                    int var12 = arg0.method2702((byte) -106, 1);
                    if (var12 == 0) {
                        var2 = class335.method1992(0, arg0);
                        class391.field5547[var11] = (byte) class344.method2020(class391.field5547[var11], 2);
                    } else if (class363.method2076(-2, var11, arg0)) {
                        class391.field5547[var11] = (byte) class344.method2020(class391.field5547[var11], 2);
                    }
                }
            }
        }
        arg0.method2699((byte) 120);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method2701(0);
        for (int var6 = 0; var6 < class147.field1898; var6++) {
            int var9 = class430.field6059[var6];
            if ((class391.field5547[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class391.field5547[var9] = (byte) class344.method2020(class391.field5547[var9], 2);
                    var2--;
                } else {
                    int var10 = arg0.method2702((byte) -57, 1);
                    if (var10 == 0) {
                        var2 = class335.method1992(~arg1, arg0);
                        class391.field5547[var9] = (byte) class344.method2020(class391.field5547[var9], 2);
                    } else if (class363.method2076(arg1 - 1, var9, arg0)) {
                        class391.field5547[var9] = (byte) class344.method2020(class391.field5547[var9], 2);
                    }
                }
            }
        }
        arg0.method2699((byte) 120);
        if (~var2 != arg1) {
            throw new RuntimeException("nsn3");
        }
        class147.field1898 = 0;
        class427.field6032 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class391.field5547[var7] = (byte) (class391.field5547[var7] >> 1);
            class83 var8 = class361.field4793[var7];
            if (var8 == null) {
                class430.field6059[class147.field1898++] = var7;
            } else {
                class619.field8682[class427.field6032++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Lmk;", line = 256)
    public final class56 method307(int arg0) {
        if (arg0 != 15763) {
            method2349(61);
        }
        field5737++;
        return class56.field569;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLjava/lang/String;I)I", line = 268)
    public static final int method2353(int arg0, boolean arg1, String arg2, int arg3) {
        field5740++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        if (arg3 != -21972) {
            method2353(-69, true, null, 22);
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
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
                throw new NumberFormatException();
            }
            if (arg0 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I", line = 351)
    public final int method304(byte arg0) {
        if (arg0 <= 126) {
            this.field5743 = null;
        }
        field5742++;
        return this.field5743.method2870((byte) 78) ? 100 : this.field5743.method2902((byte) -114);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lni;)V", line = 370)
    public class407(class522 arg0) {
        this.field5743 = arg0;
    }
}
