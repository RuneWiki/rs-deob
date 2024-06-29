import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class705 extends class224 {

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field9873;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "Lmp;")
    private class758 field9877;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "Ljava/awt/Font;")
    public static Font field9872;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "[[[Z")
    public static boolean[][][] field9867;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILud;)V", line = 3)
    private final void method3948(int arg0, int arg1, class35 arg2) {
        if (arg1 >= -113) {
            field9872 = null;
        }
        field9874++;
        if (arg0 != 249) {
            return;
        }
        int var4 = arg2.method273(255);
        if (this.field9877 == null) {
            int var5 = class613.method3530(false, var4);
            this.field9877 = new class758(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method273(255) == 1;
            int var8 = arg2.method239(-72);
            class626 var9;
            if (var7) {
                var9 = new class589(arg2.method272(2));
            } else {
                var9 = new class528(arg2.method234((byte) -121));
            }
            this.field9877.method4211(var9, (byte) 24, (long) var8);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V", line = 49)
    public static final void method3949(byte arg0) {
        class154.field2309.method538(class483.field6841);
        int var1 = 83 / ((-arg0 - 25) / 55);
        field9873++;
        class154.field2309.method545(class169.field2483, class230.field3279, class522.field7399, class393.field5508);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 63)
    public final String method3950(int arg0, String arg1, int arg2) {
        field9866++;
        if (arg0 != 7) {
            field9872 = null;
        }
        if (this.field9877 == null) {
            return arg1;
        } else {
            class589 var4 = (class589) this.field9877.method4203(true, (long) arg2);
            return var4 == null ? arg1 : var4.field8279;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIB)I", line = 87)
    public final int method3951(int arg0, int arg1, byte arg2) {
        field9869++;
        int var4 = 25 % ((59 - arg2) / 34);
        if (this.field9877 == null) {
            return arg0;
        } else {
            class528 var5 = (class528) this.field9877.method4203(true, (long) arg1);
            return var5 == null ? arg0 : var5.field7502;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)I", line = 106)
    public static final int method3952(int arg0, boolean arg1) {
        field9871++;
        int var2 = class435.field6079;
        if (var2 == 0) {
            return arg1 ? 0 : class591.field8302;
        } else if (var2 == 1) {
            return class591.field8302;
        } else if (var2 == 2) {
            return 0;
        } else if (arg0 == 255) {
            return 0;
        } else {
            return -121;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 151)
    public static void method3953(int arg0) {
        field9872 = null;
        if (arg0 != 14742) {
            method3956((byte) -48, -109);
        }
        field9867 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lud;B)V", line = 163)
    public final void method3954(class35 arg0, byte arg1) {
        if (arg1 <= 112) {
            return;
        }
        while (true) {
            int var3 = arg0.method273(255);
            if (var3 == 0) {
                field9876++;
                return;
            }
            this.method3948(var3, -114, arg0);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lwq;[[BI)V", line = 188)
    public static final void method3955(class166 arg0, byte[][] arg1, int arg2) {
        field9875++;
        int var3 = 123 / ((-arg2 - 77) / 44);
        for (int var4 = 0; var4 < arg0.field4329; var4++) {
            class565.method3297(25);
            for (int var5 = 0; var5 < (class174.field2540 >> 3); var5++) {
                for (int var6 = 0; var6 < class716.field9999 >> 3; var6++) {
                    int var7 = class247.field3464[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0.field4309 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFCAD3) >> 14;
                            int var11 = (var7 & 0x3FFE) >> 3;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class412.field5705.length; var13++) {
                                if (class412.field5705[var13] == var12 && arg1[var13] != null) {
                                    arg0.method1239((var10 & 0x7) * 8, (var11 & 0x7) * 8, arg1[var13], var5 * 8, var9, var4, class359.field5046, -1, class630.field9041, var8, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)I", line = 258)
    public static final int method3956(byte arg0, int arg1) {
        if (arg0 < 85) {
            method3955(null, null, 36);
        }
        field9868++;
        return arg1 & 0xFF;
    }
}
