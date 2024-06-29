import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class class502 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public int field7214 = 2;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public int field7218 = 127;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Z")
    public boolean field7216 = true;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public int field7217 = 0;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public int field7234 = 0;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "Z")
    public boolean field7238 = true;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public int field7230 = 2;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Z")
    public boolean field7227 = true;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Z")
    public boolean field7226 = false;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public int field7243 = 2;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "Z")
    public boolean field7242 = true;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public int field7223 = 0;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Z")
    public boolean field7215 = true;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "Z")
    public boolean field7245 = true;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "Z")
    public boolean field7246 = true;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public int field7219 = 1;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public int field7231 = 0;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Z")
    public boolean field7224 = true;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "Z")
    public boolean field7228 = false;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Z")
    public boolean field7220 = true;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public int field7247 = 2;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "Z")
    public boolean field7241 = true;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public int field7235 = 0;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public int field7248 = 0;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public int field7249 = 255;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
    public int field7251 = 127;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "Z")
    public boolean field7250 = true;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "Z")
    public boolean field7252 = false;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
    public int field7253 = 3;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Z")
    public boolean field7237 = true;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public int field7254 = 0;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Z")
    public boolean field7221;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "Z")
    public boolean field7239;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "Z")
    public boolean field7240;

    static {
        new class234("Use", "Benutzen", "Utiliser", "Usar");
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBI)V", line = 3)
    public final void method2982(int arg0, byte arg1, int arg2) {
        if (arg0 == 1 || arg0 == 3) {
            this.field7247 = arg2;
        } else {
            this.field7254 = arg2;
        }
        field7229++;
        int var4 = -88 % ((arg1 + 64) / 50);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZI)V", line = 25)
    public final void method2983(int arg0, boolean arg1, int arg2) {
        field7233++;
        int var4 = -8 % ((arg0 - 24) / 41);
        if (arg2 == 1 || arg2 == 3) {
            this.field7221 = arg1;
        } else {
            this.field7240 = arg1;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[JI[II)V", line = 44)
    public static final void method2984(int arg0, long[] arg1, int arg2, int[] arg3, int arg4) {
        field7236++;
        if (arg0 < arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg4; var11++) {
                if (arg1[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg4] = arg3[var6];
            arg3[var6] = var9;
            method2984(arg0, arg1, 2, arg3, var6 - 1);
            method2984(var6 + 1, arg1, 2, arg3, arg4);
        }
        if (arg2 != 2) {
            field7225 = -107;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V", line = 103)
    public static final void method2985(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7222++;
        class211 var5 = class452.method2749(10, 19, arg2);
        var5.method1463(0);
        if (arg0 >= -81) {
            field7225 = 47;
        }
        var5.field3441 = arg1;
        var5.field3446 = arg4;
        var5.field3440 = arg3;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I", line = 142)
    public final int method2986(int arg0, int arg1) {
        field7232++;
        if (arg0 != 28721) {
            this.method2983(-5, false, -104);
        }
        return arg1 == 1 || arg1 == 3 ? this.field7247 : this.field7254;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)Z", line = 223)
    public final boolean method2987(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field7244++;
            return arg1 == 1 || arg1 == 3 ? this.field7221 : this.field7240;
        }
    }
}
