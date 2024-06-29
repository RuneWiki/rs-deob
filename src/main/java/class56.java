import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class class56 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Z")
    public static boolean field744 = true;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field743 = new String[200];

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Z")
    public static boolean field746 = false;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field753 = 0;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field752 = null;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "J")
    public static long field750 = 0L;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "[I")
    public int[] field757;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 3)
    public static final void method364(int arg0) {
        if (arg0 != 8) {
            method364(98);
        }
        if (class452.field6482 != null) {
            class452.field6482.method1831((byte) 110);
            class452.field6482 = null;
            class97.field1239 = null;
        }
        field751++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(JB)V", line = 35)
    public static final void method366(long arg0, byte arg1) {
        int var3 = 94 / ((arg1 + 7) / 55);
        field747++;
        int var4 = class302.field4402;
        int var5 = class165.field2348;
        if (class323.field4712 != var4) {
            int var6 = var4 - class323.field4712;
            int var7 = (int) ((long) var6 * arg0 / 320L);
            if (var6 <= 0) {
                if (var7 == 0) {
                    var7 = -1;
                } else if (var7 < var6) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = 1;
            } else if (var7 > var6) {
                var7 = var6;
            }
            class323.field4712 += var7;
        }
        if (class431.field6168 != var5) {
            int var8 = var5 - class431.field6168;
            int var9 = (int) ((long) var8 * arg0 / 320L);
            if (var8 <= 0) {
                if (var9 == 0) {
                    var9 = -1;
                } else if (var8 > var9) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (var8 < var9) {
                var9 = var8;
            }
            class431.field6168 += var9;
        }
        if (!class24.field304) {
            class241.field3553 += (float) arg0 * class198.field2835 / 40.0F * 8.0F;
            class358.field5176 += (float) arg0 * class353.field5128 / 40.0F * 8.0F;
        }
        class190.method1365(0);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 134)
    public static void method369(byte arg0) {
        field752 = null;
        field743 = null;
        if (arg0 < 99) {
            field752 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)V", line = 145)
    public static final void method370(int arg0, byte arg1) {
        class370.field5263 = new int[arg0];
        class147.field2189 = new int[arg0];
        class59.field794 = new int[arg0];
        int var2 = 71 % ((-arg1 - 21) / 52);
        class327.field4744 = new int[arg0];
        class357.field5168 = new int[arg0];
        field754++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public abstract void method365(Canvas arg0, boolean arg1);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public abstract void method367(boolean arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method368(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);
}
