import java.awt.Canvas;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class110 implements class612 {

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "Lica;")
    private class205 field1394 = new class205(128);

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "[I")
    public int[] field1405 = new int[class239.field3501.field9178];

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "[I")
    private int[] field1398 = new int[class239.field3501.field9178];

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "Lfo;")
    public static class22 field1396 = new class22(14, 7);

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field1399 = new Hashtable();

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "[F")
    public static float[] field1404 = new float[4];

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field1406 = 0;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1401;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V", line = 7)
    public final void method651(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1391++;
        for (int var2 = 0; var2 < class239.field3501.field9178; var2++) {
            class106 var3 = class239.field3501.method3654(var2, -8109);
            if (var3 != null && var3.field1331 == 0) {
                this.field1398[var2] = 0;
                this.field1405[var2] = 0;
            }
        }
        this.field1394 = new class205(128);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IBI)V", line = 35)
    public final void method652(int arg0, byte arg1, int arg2) {
        field1397++;
        class576 var4 = class23.field200.method2975(arg0, arg1 ^ 0xFFFFFFCB);
        int var5 = var4.field8503;
        int var6 = var4.field8504;
        int var7 = var4.field8501;
        int var8 = class383.field5599[var7 - var6];
        if (arg1 != -128) {
            return;
        }
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method656(var5, var9 & arg2 << var6 | this.field1405[var5] & ~var9, true);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(II)I", line = 63)
    public final int method653(int arg0, int arg1) {
        field1389++;
        class576 var3 = class23.field200.method2975(arg0, 83);
        int var4 = var3.field8503;
        int var5 = var3.field8504;
        if (arg1 == -11730) {
            int var6 = var3.field8501;
            int var7 = class383.field5599[var6 - var5];
            return var7 & this.field1405[var4] >> var5;
        } else {
            return 120;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)I", line = 89)
    public final int method654(int arg0, int arg1) {
        field1392++;
        if (arg0 < 70) {
            field1404 = null;
        }
        return this.field1405[arg1];
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)V", line = 101)
    public final void method655(int arg0, int arg1, int arg2) {
        this.field1398[arg2] = arg0;
        if (arg1 >= -82) {
            field1404 = null;
        }
        field1395++;
        class242 var4 = (class242) this.field1394.method1333((long) arg2, false);
        if (var4 == null) {
            class242 var5 = new class242(4611686018427387905L);
            this.field1394.method1341(var5, (byte) -125, (long) arg2);
        } else if (var4.field3549 != 4611686018427387905L) {
            var4.field3549 = class450.method2719((byte) 126) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIZ)V", line = 128)
    public final void method656(int arg0, int arg1, boolean arg2) {
        field1390++;
        this.field1405[arg0] = arg1;
        if (!arg2) {
            this.method654(-28, -86);
        }
        class242 var4 = (class242) this.field1394.method1333((long) arg0, !arg2);
        if (var4 == null) {
            class242 var5 = new class242(class450.method2719((byte) 126) + 500L);
            this.field1394.method1341(var5, (byte) 43, (long) arg0);
        } else {
            var4.field3549 = class450.method2719((byte) -97) + 500L;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZ)I", line = 156)
    public final int method657(int arg0, boolean arg1) {
        field1403++;
        long var3 = class450.method2719((byte) 127);
        class242 var5 = arg1 ? (class242) this.field1394.method1331(-1925) : (class242) this.field1394.method1340((byte) 60);
        if (arg0 <= 30) {
            return 83;
        }
        while (var5 != null) {
            if ((var5.field3549 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field3549 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field7465;
                    this.field1405[var6] = this.field1398[var6];
                    var5.method2997(1);
                    return var6;
                }
                var5.method2997(1);
            }
            var5 = (class242) this.field1394.method1340((byte) -110);
        }
        return -1;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(III)V", line = 205)
    public final void method658(int arg0, int arg1, int arg2) {
        field1393++;
        class576 var4 = class23.field200.method2975(arg0, arg2 ^ 0x7F);
        int var5 = var4.field8503;
        int var6 = var4.field8504;
        int var7 = var4.field8501;
        int var8 = class383.field5599[var7 - var6];
        if (~arg1 > arg2 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method655(var9 & arg1 << var6 | ~var9 & this.field1398[var5], arg2 - 84, var5);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V", line = 231)
    public static void method659(byte arg0) {
        field1396 = null;
        field1399 = null;
        int var1 = -21 % ((-arg0 - 67) / 32);
        field1401 = null;
        field1404 = null;
    }
}
