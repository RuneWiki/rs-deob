import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class41 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "B")
    public byte field318;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "B")
    public byte field324;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "S")
    public short field320;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Z")
    public boolean field319;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "S")
    public short field322;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "S")
    public short field317;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[I")
    public static int[] field323 = new int[120];

    @OriginalMember(owner = "client!na", name = "n", descriptor = "[I")
    public static int[] field330;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Ljs;")
    public static class275 field328;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Ldn;")
    public static class438 field327;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field331;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field323[var1] = var0 / 4;
        }
        field330 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
        field328 = new class275(2, 4, 4, 0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method217(boolean arg0) {
        field329++;
        if (class24.field172 == null) {
            class467 var1 = new class467();
            byte[] var2 = var1.method2723(128, 4096, 128, 16);
            class24.field172 = class256.method1444((byte) 96, false, var2);
        }
        if (arg0) {
            field323 = null;
        }
        if (class557.field8215 == null) {
            class410 var3 = new class410();
            byte[] var4 = var3.method2347(0, 128, 128, 16);
            class557.field8215 = class256.method1444((byte) 70, false, var4);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ID)V", line = 37)
    public static final void method218(int arg0, double arg1) {
        field326++;
        if (class282.field3707 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class281.field3698[var3] = var4 > 255 ? 255 : var4;
            }
            class282.field3707 = arg1;
        }
        if (arg0 < 87) {
            method220(21);
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 72)
    public class41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field318 = (byte) arg8;
        this.field324 = (byte) arg7;
        this.field321 = arg0;
        this.field320 = (short) arg5;
        this.field319 = arg9;
        this.field322 = (short) arg4;
        this.field317 = (short) arg6;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BIIII)Lna;", line = 92)
    public final class41 method219(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 43) {
            return null;
        } else {
            field325++;
            return new class41(arg1, arg2, arg4, arg3, this.field322, this.field320, this.field317, this.field324, this.field318, this.field319);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 103)
    public static void method220(int arg0) {
        field331 = null;
        if (arg0 != 12547) {
            method220(-86);
        }
        field323 = null;
        field330 = null;
        field328 = null;
        field327 = null;
    }
}
