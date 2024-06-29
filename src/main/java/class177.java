import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class177 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field3219 = 0;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field3218 = 0;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field3221 = 0;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lhj;")
    public static class69 field3229 = class181.method1318(")2", (byte) -124);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Ltk;")
    public static class50 field3223;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()I")
    public abstract int method211();

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Led;IIIZ)V")
    public void method522(class177 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3228++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method1279(int arg0) {
        if (arg0 != -13462) {
            field3220 = -62;
        }
        field3229 = null;
        field3223 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BJIZ)Lhj;")
    public static final class69 method1280(byte arg0, long arg1, int arg2, boolean arg3) {
        field3230++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        long var5 = arg1 / (long) arg2;
        if (arg0 <= 115) {
            return null;
        }
        int var7 = 1;
        while (var5 != 0L) {
            var7++;
            var5 /= (long) arg2;
        }
        int var8 = var7;
        if (arg1 < 0L || arg3) {
            var8 = var7 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg1 < 0L) {
            var9[0] = 45;
        } else if (arg3) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var7; var10++) {
            int var12 = (int) (arg1 % (long) arg2);
            if (var12 < 0) {
                var12 = -var12;
            }
            arg1 /= (long) arg2;
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class69 var11 = new class69();
        var11.field1331 = var8;
        var11.field1351 = var9;
        return var11;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Led;")
    public class177 method517(int arg0, int arg1, int arg2) {
        field3226++;
        return this;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "()Z")
    public boolean method512() {
        field3227++;
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method1281(KeyEvent arg0, int arg1) {
        field3217++;
        int var2 = arg0.getKeyChar();
        if (~var2 == arg1) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
    public void method693(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 128) {
            method1279(-36);
        }
        field3225++;
    }
}
