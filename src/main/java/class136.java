import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class136 implements class561 {

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lsl;")
    private class427 field2413 = new class427(128);

    @OriginalMember(owner = "client!d", name = "i", descriptor = "[I")
    public int[] field2410 = new int[class107.field1851.field3722];

    @OriginalMember(owner = "client!d", name = "k", descriptor = "[I")
    private int[] field2412 = new int[class107.field1851.field3722];

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lqfa;")
    public static class85 field2404 = new class85(5, 3);

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field2417 = -50;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "F")
    public static float field2420;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "J")
    public static long field2409;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lom;")
    public static class344 field2418;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)I")
    public final int method1115(int arg0, byte arg1) {
        field2414++;
        if (arg1 != 14) {
            return 18;
        }
        class326 var3 = class661.field9519.method625(3, arg0);
        int var4 = var3.field4771;
        int var5 = var3.field4775;
        int var6 = var3.field4774;
        int var7 = class346.field5163[var6 - var5];
        return var7 & this.field2410[var4] >> var5;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static final void method1116(int arg0) {
        class339.field5053 = null;
        class461.field6571 = -1;
        field2416++;
        if (arg0 > -47) {
            field2420 = -0.22313781F;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static final void method1117(byte arg0) {
        field2408++;
        if (arg0 != 63) {
            field2417 = -61;
        }
        if (class370.field5489 != null && class335.field5011 != null) {
            return;
        }
        class370.field5489 = new int[256];
        class335.field5011 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class370.field5489[var1] = (int) (Math.sin(var2) * 4096.0D);
            class335.field5011[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BII)V")
    public final void method1118(byte arg0, int arg1, int arg2) {
        field2419++;
        class326 var4 = class661.field9519.method625(3, arg1);
        int var5 = var4.field4771;
        int var6 = var4.field4775;
        int var7 = var4.field4774;
        if (arg0 >= -4) {
            field2418 = null;
        }
        int var8 = class346.field5163[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1121(this.field2410[var5] & ~var9 | var9 & arg2 << var6, var5, 112);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lfa;IILjava/awt/Canvas;Lom;)Lr;")
    public static final class167 method1119(class214 arg0, int arg1, int arg2, Canvas arg3, class344 arg4) {
        field2406++;
        if (!class479.method2909((byte) 109)) {
            throw new RuntimeException("");
        } else if (class251.method1681("jaggl", arg2 ^ 0x146)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, arg2, 8, 24, 0, arg1);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class475 var8 = new class475(var5, arg3, var6, arg0, arg4, arg1);
            var8.method3255((byte) 116);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
    public final void method1120(int arg0, int arg1, int arg2) {
        if (arg1 < 10) {
            method1119(null, 119, 123, null, null);
        }
        this.field2412[arg2] = arg0;
        field2415++;
        class311 var4 = (class311) this.field2413.method2596((long) arg2, 53);
        if (var4 == null) {
            class311 var5 = new class311(4611686018427387905L);
            this.field2413.method2598(var5, (long) arg2, (byte) 8);
        } else if (var4.field4631 != 4611686018427387905L) {
            var4.field4631 = class525.method3074((byte) -101) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
    public final void method1121(int arg0, int arg1, int arg2) {
        this.field2410[arg1] = arg0;
        int var4 = 29 % ((38 - arg2) / 38);
        field2402++;
        class311 var5 = (class311) this.field2413.method2596((long) arg1, 95);
        if (var5 == null) {
            class311 var6 = new class311(class525.method3074((byte) -101) + 500L);
            this.field2413.method2598(var6, (long) arg1, (byte) 8);
        } else {
            var5.field4631 = class525.method3074((byte) -101) + 500L;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)I")
    public final int method1122(boolean arg0, int arg1) {
        if (arg0) {
            field2404 = null;
        }
        field2407++;
        return this.field2410[arg1];
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public final void method1123(int arg0) {
        if (arg0 != -3451) {
            this.field2413 = null;
        }
        for (int var2 = 0; var2 < class107.field1851.field3722; var2++) {
            class87 var3 = class107.field1851.method1667(var2, (byte) 81);
            if (var3 != null && var3.field1632 == 0) {
                this.field2412[var2] = 0;
                this.field2410[var2] = 0;
            }
        }
        field2411++;
        this.field2413 = new class427(128);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public static void method1124(int arg0) {
        if (arg0 <= 75) {
            method1117((byte) 90);
        }
        field2404 = null;
        field2418 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZB)I")
    public final int method1125(boolean arg0, byte arg1) {
        field2405++;
        long var3 = class525.method3074((byte) -101);
        class311 var5 = arg0 ? (class311) this.field2413.method2597((byte) 34) : (class311) this.field2413.method2594((byte) -122);
        if (arg1 < 45) {
            return 50;
        }
        while (var5 != null) {
            if ((var5.field4631 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field4631 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field6132;
                    this.field2410[var6] = this.field2412[var6];
                    var5.method2588(300);
                    return var6;
                }
                var5.method2588(300);
            }
            var5 = (class311) this.field2413.method2594((byte) -122);
        }
        return -1;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(III)V")
    public final void method1126(int arg0, int arg1, int arg2) {
        field2403++;
        class326 var4 = class661.field9519.method625(arg1 ^ 0xFFFFFEFC, arg2);
        int var5 = var4.field4771;
        int var6 = var4.field4775;
        if (arg1 != -257) {
            field2420 = -1.0106618F;
        }
        int var7 = var4.field4774;
        int var8 = class346.field5163[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1120(this.field2412[var5] & ~var9 | arg0 << var6 & var9, 24, var5);
    }
}
