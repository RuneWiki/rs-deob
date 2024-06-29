import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class517 {

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public int field7455 = -1;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public int field7457 = -1;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field7451 = -1;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "J")
    public static long field7453 = -1L;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
    public int[] field7449;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBIJZ)Ljava/lang/String;")
    public static final String method3140(int arg0, byte arg1, int arg2, long arg3, boolean arg4) {
        field7448++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            arg3 = -arg3;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 != -110) {
            method3143(-80, 119, -40);
        }
        if (arg0 > 0) {
            for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public static final void method3141(int arg0, int arg1) {
        int var2 = 112 % ((-arg0 - 26) / 52);
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        field7459++;
        class332.field4511 = arg1;
        class726.field10206 = new class27[class79.field1138[class332.field4511] + 1];
        class174.field2450 = 0;
        class680.field9676 = 0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lsl;B)V")
    public final void method3142(class479 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2886(true);
            if (var3 == 0) {
                int var4 = 37 / ((39 - arg1) / 56);
                field7450++;
                return;
            }
            this.method3145(arg0, -118, var3);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
    public static final void method3143(int arg0, int arg1, int arg2) {
        class375 var3 = class565.field8185[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class502.method3061(var3.field5428);
        class502.method3061(var3.field5424);
        if (var3.field5428 != null) {
            var3.field5428 = null;
        }
        if (var3.field5424 != null) {
            var3.field5424 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
    public static final void method3144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -110) {
            field7447 = -11;
        }
        for (int var5 = 0; var5 < class727.field10212; var5++) {
            Rectangle var6 = class39.field673[var5];
            if (arg4 < (var6.x + var6.width) && var6.x < arg4 + arg3 && arg0 < var6.y + var6.height && var6.y < (arg0 + arg2)) {
                class108.field1545[var5] = true;
            }
        }
        field7456++;
        class545.method3277(arg4, arg0, arg4 + arg3, -46, arg0 + arg2);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lsl;II)V")
    private final void method3145(class479 arg0, int arg1, int arg2) {
        field7452++;
        if (arg1 >= -9) {
            return;
        }
        if (arg2 == 1) {
            this.field7455 = arg0.method2882(-1);
        } else if (arg2 == 2) {
            this.field7449 = new int[arg0.method2886(true)];
            for (int var4 = 0; var4 < this.field7449.length; var4++) {
                this.field7449[var4] = arg0.method2882(-1);
            }
        } else if (arg2 == 3) {
            this.field7457 = arg0.method2886(true);
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILsl;)Lcw;")
    public static final class21 method3146(int arg0, class479 arg1) {
        field7458++;
        class21 var2 = new class21();
        int var3 = 48 / ((arg0 + 65) / 57);
        var2.field195 = arg1.method2882(-1);
        var2.field197 = class492.field7082.method2779(var2.field195, 122);
        return var2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method3147(String arg0, byte arg1) {
        field7454++;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        if (arg1 != -20) {
            method3144(71, -55, 89, 62, 125);
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var2 <= (var3 - 2) || class391.method2392((byte) 40, arg0.charAt(var3 - 2)) == -1) {
            var4 -= 2;
        } else if (var3 - 1 >= var2 || class391.method2392((byte) 40, arg0.charAt(var3 - 1)) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class277.method1791(23158, var5, arg0, 0);
        return var5;
    }
}
