import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 {

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field14 = -1;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lgb;")
    public static class149 field2 = new class149();

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "[I")
    public static int[] field15 = new int[50];

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Z")
    public static boolean field16 = true;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Ljava/lang/String;")
    public static String field17 = "Drop";

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)La;")
    public final class49 method1(int arg0) {
        field12++;
        class49 var2 = (class49) class13.field228.method1780((long) this.field7, (byte) -127);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 8) {
            field2 = null;
        }
        class49 var3 = class288.method1943(0, class222.field3470, (byte) -88, this.field7);
        if (var3 != null) {
            class13.field228.method1784(var3, false, (long) this.field7);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILag;I)I")
    public static final int method2(int arg0, class188 arg1, int arg2) {
        field3++;
        if (arg1.field2929 == null || arg0 >= arg1.field2929.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field2929[arg0];
            int var4 = 48 % ((32 - arg2) / 53);
            int var5 = 0;
            int var6 = 0;
            byte var7 = 0;
            while (true) {
                int var8 = 0;
                byte var9 = 0;
                int var10 = var3[var6++];
                if (var10 == 0) {
                    return var5;
                }
                if (var10 == 1) {
                    var8 = class216.field3335[var3[var6++]];
                }
                if (var10 == 15) {
                    var9 = 1;
                }
                if (var10 == 16) {
                    var9 = 2;
                }
                if (var10 == 17) {
                    var9 = 3;
                }
                if (var10 == 2) {
                    var8 = class77.field1285[var3[var6++]];
                }
                if (var10 == 3) {
                    var8 = class250.field3846[var3[var6++]];
                }
                if (var10 == 4) {
                    int var11 = var3[var6++] << 16;
                    int var12 = var11 + var3[var6++];
                    class188 var13 = class5.method57((byte) -113, var12);
                    int var14 = var3[var6++];
                    if (var14 != -1 && (!class32.method260(var14, true).field1917 || class249.field3844)) {
                        for (int var15 = 0; var15 < var13.field2944.length; var15++) {
                            if (var14 + 1 == var13.field2944[var15]) {
                                var8 += var13.field2897[var15];
                            }
                        }
                    }
                }
                if (var10 == 5) {
                    var8 = class30.field482[var3[var6++]];
                }
                if (var10 == 6) {
                    var8 = class214.field3300[class77.field1285[var3[var6++]] - 1];
                }
                if (var10 == 7) {
                    var8 = class30.field482[var3[var6++]] * 100 / 46875;
                }
                if (var10 == 8) {
                    var8 = class261.field4058.field428;
                }
                if (var10 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class53.field831[var16]) {
                            var8 += class77.field1285[var16];
                        }
                    }
                }
                if (var10 == 10) {
                    int var17 = var3[var6++] << 16;
                    int var18 = var17 + var3[var6++];
                    class188 var19 = class5.method57((byte) -108, var18);
                    int var20 = var3[var6++];
                    if (var20 != -1 && (!class32.method260(var20, true).field1917 || class249.field3844)) {
                        for (int var21 = 0; var21 < var19.field2944.length; var21++) {
                            if ((var20 + 1) == var19.field2944[var21]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var10 == 11) {
                    var8 = class158.field2434;
                }
                if (var10 == 12) {
                    var8 = class143.field2197;
                }
                if (var10 == 13) {
                    int var22 = class30.field482[var3[var6++]];
                    int var23 = var3[var6++];
                    var8 = (0x1 << var23 & var22) == 0 ? 0 : 1;
                }
                if (var10 == 14) {
                    int var24 = var3[var6++];
                    var8 = class42.method357(var24, 3754);
                }
                if (var10 == 18) {
                    var8 = (class261.field4058.field4176 >> 7) + class118.field1828;
                }
                if (var10 == 19) {
                    var8 = (class261.field4058.field4123 >> 7) + class129.field2008;
                }
                if (var10 == 20) {
                    var8 = var3[var6++];
                }
                if (var9 == 0) {
                    if (var7 == 0) {
                        var5 += var8;
                    }
                    if (var7 == 1) {
                        var5 -= var8;
                    }
                    if (var7 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var7 == 3) {
                        var5 *= var8;
                    }
                    var7 = 0;
                } else {
                    var7 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILf;)V")
    public final void method3(int arg0, int arg1, class37 arg2) {
        while (true) {
            int var4 = arg2.method333((byte) -59);
            if (var4 == 0) {
                if (arg0 != 0) {
                    method8((byte) 80);
                }
                field11++;
                return;
            }
            this.method7(var4, arg2, arg1, false);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)I")
    public static final int method4(int arg0, int arg1, int arg2) {
        field9++;
        if (arg0 != 1) {
            method2(-49, (class188) null, -22);
        }
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method5(boolean arg0, Component arg1) {
        if (!arg0) {
            method4(-48, 35, -29);
        }
        field4++;
        arg1.removeMouseListener(class276.field4349);
        arg1.removeMouseMotionListener(class276.field4349);
        arg1.removeFocusListener(class276.field4349);
        class217.field3396 = 0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(CZ)B")
    public static final byte method6(char arg0, boolean arg1) {
        field6++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        if (arg1) {
            method5(false, (Component) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILf;IZ)V")
    private final void method7(int arg0, class37 arg1, int arg2, boolean arg3) {
        if (arg0 == 1) {
            this.field7 = arg1.method293(-2);
        } else if (arg0 == 2) {
            this.field1 = arg1.method333((byte) -59);
            this.field5 = arg1.method333((byte) -59);
        }
        field13++;
        if (arg3) {
            this.field5 = -126;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field2 = null;
        if (arg0 != -110) {
            method6((char) 65524, true);
        }
        field15 = null;
        field17 = null;
    }
}
