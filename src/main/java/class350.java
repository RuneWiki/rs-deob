import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class350 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[Lho;")
    public class158[] field5106 = null;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Lkga;")
    public class569 field5108 = null;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lkga;")
    public class569 field5111 = null;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lkga;")
    public class569 field5114 = null;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "[Lho;")
    public class158[] field5109 = null;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Z")
    public boolean field5113;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZILjava/lang/String;I)I")
    public static final int method2209(boolean arg0, int arg1, String arg2, int arg3) {
        field5107++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (arg3 != -123) {
            method2209(true, 31, null, -89);
        }
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
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
            if (var11 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
    public static final int method2210(int arg0) {
        field5112++;
        if (arg0 <= 32) {
            method2212(19, true, null);
        }
        if ((double) class436.field6217 == 3.0D) {
            return 37;
        } else if ((double) class436.field6217 == 4.0D) {
            return 50;
        } else if ((double) class436.field6217 == 6.0D) {
            return 75;
        } else if ((double) class436.field6217 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2211(int arg0, int arg1, int arg2, int arg3) {
        field5105++;
        class241.field3463.method1968(arg2, arg1, arg0, class296.field4463);
        int var4 = class296.field4463[2];
        if (var4 < 50) {
            return false;
        }
        class296.field4463[1] = class296.field4463[1] * class684.field9711 / var4 + class519.field7408;
        class296.field4463[2] = var4;
        if (arg3 > -98) {
            return true;
        } else {
            class296.field4463[0] = class296.field4463[0] * class421.field5955 / var4 + class709.field9997;
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZLjfa;)Z")
    public static final boolean method2212(int arg0, boolean arg1, class302 arg2) {
        class241.field3463.method1968(arg2.field4532[arg0], arg2.field4526[arg0], arg2.field4537[arg0], class296.field4463);
        field5110++;
        int var3 = class296.field4463[2];
        if (var3 < 50) {
            return false;
        }
        arg2.field4524[arg0] = (short) (class296.field4463[0] * class421.field5955 / var3 + class709.field9997);
        if (arg1) {
            return false;
        } else {
            arg2.field4531[arg0] = (short) (class296.field4463[1] * class684.field9711 / var3 + class519.field7408);
            arg2.field4533[arg0] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lkv;)V")
    public class350(class280 arg0) {
        this.field5113 = arg0.field4249;
        class219.method1514(arg0, (byte) -101);
        if (this.field5113) {
            byte[] var6 = class650.method3723(false, (byte) 85, class609.field8601);
            this.field5108 = new class569(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class650.method3723(false, (byte) 102, class724.field10156);
            this.field5111 = new class569(arg0, 6410, 128, 128, 16, var7, 6410);
            class327 var8 = arg0.field4168;
            if (var8.method2118((byte) 110)) {
                byte[] var9 = class650.method3723(false, (byte) 111, class367.field5286);
                this.field5114 = new class569(arg0, 6408, 128, 128, 16);
                class569 var10 = new class569(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method2120(1, 2.0F, var10, this.field5114)) {
                    this.field5114.method3462(-31064);
                } else {
                    this.field5114.method3465(false);
                    this.field5114 = null;
                }
                var10.method3465(false);
            }
        } else {
            this.field5109 = new class158[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class298.method1991(class609.field8601, 32768, -18784, var2 * 128 * 256);
                this.field5109[var2] = new class158(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field5106 = new class158[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class298.method1991(class724.field10156, 32768, -18784, var3 * 256 * 128);
                this.field5106[var3] = new class158(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
