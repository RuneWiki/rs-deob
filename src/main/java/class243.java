import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class243 {

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public int field3440 = 128;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public int field3437 = 128;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public int field3445;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public int field3436;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public int field3442;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "Lea;")
    public static class474 field3446 = new class474("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "Z")
    public static boolean field3448 = false;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lqp;IIFIF[BBFIIIFF)V", line = 3)
    public static final void method1619(class573 arg0, int arg1, int arg2, float arg3, int arg4, float arg5, byte[] arg6, byte arg7, float arg8, int arg9, int arg10, int arg11, float arg12, float arg13) {
        field3438++;
        int var14 = arg4 * arg11;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg2; var16++) {
            arg0.method1263(arg3 * 127.0F, arg4, arg9, true, arg11, arg13 / (float) arg4, arg5 / (float) arg11, arg8 / (float) arg9, arg10, var15, 0);
            int var19 = arg1;
            for (int var20 = 0; var20 < var14; var20++) {
                arg6[var19] = (byte) ((int) ((float) arg6[var19] + var15[var20]));
                var19++;
            }
            arg5 *= 2.0F;
            arg13 *= 2.0F;
            arg8 *= 2.0F;
            arg3 *= arg12;
        }
        int var17 = arg1;
        for (int var18 = 0; var18 < var14; var18++) {
            arg6[var17] -= -127;
            var17++;
        }
        if (arg7 > -119) {
            method1620(98);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 55)
    public static final void method1620(int arg0) {
        if (arg0 != 17569) {
            method1621(84, (byte) -61);
        }
        class84.field958 = class438.method2730(true, 98, 35, 4, 0.4F, 8, 8, 2048);
        field3439++;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)[B", line = 66)
    public static final byte[] method1621(int arg0, byte arg1) {
        field3441++;
        class140 var2 = (class140) class260.field3704.method2415((long) arg0, false);
        if (arg1 > -98) {
            return null;
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class107.method659(var4, false, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class140(var3);
            class260.field3704.method2411((long) arg0, var2, false);
        }
        return var2.field1729;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLao;)V", line = 117)
    public final void method1622(byte arg0, class243 arg1) {
        this.field3440 = arg1.field3440;
        this.field3437 = arg1.field3437;
        this.field3436 = arg1.field3436;
        int var3 = 29 % ((-arg0 - 19) / 51);
        this.field3445 = arg1.field3445;
        this.field3442 = arg1.field3442;
        field3443++;
        this.field3447 = arg1.field3447;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)Lao;", line = 133)
    public final class243 method1623(byte arg0) {
        field3444++;
        if (arg0 != -62) {
            method1619(null, -61, 105, 0.4718703F, 112, -0.820912F, null, (byte) 47, -1.4754417F, 68, -29, 48, 2.2973616F, -0.008973221F);
        }
        return new class243(this.field3447, this.field3440, this.field3437, this.field3445, this.field3436, this.field3442);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 148)
    public static void method1624(int arg0) {
        field3446 = null;
        if (arg0 != 128) {
            method1624(-40);
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(I)V", line = 177)
    public class243(int arg0) {
        this.field3447 = arg0;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(IIIIII)V", line = 184)
    private class243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3447 = arg0;
        this.field3445 = arg3;
        this.field3437 = arg2;
        this.field3436 = arg4;
        this.field3440 = arg1;
        this.field3442 = arg5;
    }
}
