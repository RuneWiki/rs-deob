import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class453 extends class584 {

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Z")
    public static boolean field6278 = false;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field6279 = 0;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public static int field6281 = 0;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Loa;")
    public static class635 field6284;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(ZI)V")
    public final void method180(boolean arg0, int arg1) {
        ++field6282;
        if (arg1 != -1) {
            field6281 = -93;
        }
        super.field8309.method2694(true, arg1 ^ -124);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILld;B)V")
    public final void method185(int arg0, class155 arg1, byte arg2) {
        if (arg2 < 17) {
            this.method180(true, -54);
        }
        super.field8309.method2696(-2, arg1);
        ++field6286;
        super.field8309.method2725(arg0, -31628);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI[F)[F")
    public static final float[] method2577(byte arg0, int arg1, float[] arg2) {
        ++field6289;
        if (arg0 < 99) {
            method2579(-99);
        }
        float[] var3 = new float[arg1];
        class652.method3678(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZZ)V")
    public final void method177(boolean arg0, boolean arg1) {
        ++field6290;
        if (!arg1) {
            field6278 = true;
        }
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V")
    public static void method2578(int arg0) {
        field6284 = null;
        int var1 = 67 % ((arg0 - 32) / 47);
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)Z")
    public final boolean method178(byte arg0) {
        ++field6283;
        if (arg0 >= -6) {
            method2577((byte) -107, -120, (float[]) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lfo;)V")
    public class453(class473 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)I")
    public static final int method2579(int arg0) {
        ++field6288;
        class635 var1 = field6284;
        boolean var2 = false;
        if (class150.field1711 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class635.method3555(arg0 ^ -55, (class303) null, 0, var3, (class486) null, 0);
            var2 = true;
        }
        long var4 = class641.method3604(false);
        for (int var6 = 0; ~var6 > -10001; ++var6) {
            var1.method300(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class641.method3604(false) + -var4);
        var1.method3552(arg0, 100, arg0 ^ 99, -16777216, 0, 0);
        if (var2) {
            var1.method3548(false);
        }
        return var7;
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V")
    public final void method174(int arg0) {
        ++field6285;
        int var2 = 117 % ((arg0 - 86) / 40);
        super.field8309.method2694(false, 122);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
    public final void method175(int arg0, int arg1, int arg2) {
        if (arg2 <= 116) {
            field6279 = -22;
        }
        ++field6287;
    }
}
