import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class33 extends Canvas {

    @OriginalMember(owner = "mapview!ra", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field474;

    @OriginalMember(owner = "mapview!ra", name = "e", descriptor = "Lia;")
    public static class15 field475 = class28.method196("Next page", false);

    @OriginalMember(owner = "mapview!ra", name = "f", descriptor = "Z")
    public static boolean field476 = true;

    @OriginalMember(owner = "mapview!ra", name = "h", descriptor = "Lia;")
    public static class15 field478 = class28.method196("floorcol)3dat", false);

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "J")
    public static volatile long field473 = 0L;

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "Ll;")
    public static class20 field472;

    @OriginalMember(owner = "mapview!ra", name = "g", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field477;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "[I")
    public static int[] field471;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(IIIZ)Lia;", line = 13)
    public static final class15 method227(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 1;
        for (int var5 = arg2 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        int var8 = 69 % ((11 - arg0) / 36);
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = arg2 % arg1;
            arg2 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var9 - 1] = (byte) (var10 + 48);
        }
        class15 var11 = new class15();
        var11.field148 = var7;
        var11.field142 = var6;
        return var11;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(ZILjava/awt/Component;I)Lq;", line = 77)
    public static final class30 method228(boolean arg0, int arg1, Component arg2, int arg3) {
        try {
            Class var4 = Class.forName("aa");
            if (!arg0) {
                method228(true, -83, null, -18);
            }
            class30 var5 = (class30) var4.getDeclaredConstructor().newInstance();
            var5.method22(arg3, arg1, 16003, arg2);
            return var5;
        } catch (Throwable var8) {
            class4 var7 = new class4();
            var7.method22(arg3, arg1, 16003, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(Z)V", line = 101)
    public static final void method229(boolean arg0) {
        if (arg0 && class12.field105 != null) {
            class36 var1 = class12.field105;
            synchronized (class12.field105) {
                class12.field105 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 121)
    public final void update(Graphics arg0) {
        this.field474.update(arg0);
    }

    @OriginalMember(owner = "mapview!ra", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 129)
    public class33(Component arg0) {
        this.field474 = arg0;
    }

    @OriginalMember(owner = "mapview!ra", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 151)
    public final void paint(Graphics arg0) {
        this.field474.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(B)V", line = 165)
    public static void method230(byte arg0) {
        field475 = null;
        field472 = null;
        if (arg0 > -61) {
            method230((byte) -89);
        }
        field478 = null;
        field471 = null;
        field477 = null;
    }
}
