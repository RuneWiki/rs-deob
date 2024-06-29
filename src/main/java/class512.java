import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class512 extends Canvas {

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field7611;

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "I")
    public static int field7620 = 0;

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "Lis;")
    public static class101 field7616 = null;

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7622 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "I")
    public static int field7623 = 13156520;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "[I")
    public static int[] field7613;

    @OriginalMember(owner = "client!lea", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void update(Graphics arg0) {
        this.field7611.update(arg0);
        field7615++;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILrca;)Z", line = 11)
    public static final boolean method3045(int arg0, class30 arg1) {
        field7619++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field410) {
            return false;
        } else if (!arg1.method274(true, class161.field2611)) {
            return false;
        } else if (class318.field4387.method2818(-22803, (long) arg1.field412) != null) {
            return false;
        } else if (class187.field2933.method2818(-22803, (long) arg1.field444) == null) {
            if (arg0 != 17366) {
                field7620 = -92;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IB)Z", line = 41)
    public static final boolean method3046(int arg0, byte arg1) {
        if (arg0 != -128) {
            return true;
        }
        field7618++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class516.field7644[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/lang/String;ZLvo;B)Lbs;", line = 68)
    public static final class149 method3047(String arg0, boolean arg1, class345 arg2, byte arg3) {
        field7617++;
        int var4 = arg2.method2083(2, arg0);
        if (var4 == -1) {
            return new class149(0);
        }
        int[] var5 = arg2.method2093(var4, false);
        if (arg3 != 39) {
            field7620 = 18;
        }
        class149 var6 = new class149(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field2512 > var7) {
                class465 var9 = new class465(arg2.method2081(-127, var5[var8++], var4));
                int var10 = var9.method2691((byte) -67);
                int var11 = var9.method2755((byte) -98);
                int var12 = var9.method2705(-113);
                if (!arg1 && var12 == 1) {
                    var6.field2512--;
                } else {
                    var6.field2514[var7] = var10;
                    var6.field2509[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I[S[Ljava/lang/String;)V", line = 114)
    public static final void method3048(int arg0, short[] arg1, String[] arg2) {
        if (arg0 != -2) {
            method3047(null, true, null, (byte) -29);
        }
        class314.method1896(arg2.length - 1, arg1, false, arg2, 0);
        field7621++;
    }

    @OriginalMember(owner = "client!lea", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 126)
    public final void paint(Graphics arg0) {
        field7614++;
        this.field7611.paint(arg0);
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 148)
    public class512(Component arg0) {
        this.field7611 = arg0;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V", line = 156)
    public static void method3049(int arg0) {
        field7616 = null;
        field7622 = null;
        field7613 = null;
        if (arg0 >= -25) {
            field7620 = -120;
        }
    }
}
