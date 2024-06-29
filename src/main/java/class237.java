import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class237 {

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Lek;")
    private class295 field3378 = new class295();

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    private int field3374;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    private int field3366;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lva;")
    private class288 field3376;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "[I")
    public static int[] field3380 = new int[2];

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
    public static int[] field3367 = new int[2];

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "Liq;")
    public static class362 field3384 = new class362("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "Z")
    public static boolean field3388 = false;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    public static int field3389 = 0;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "F")
    public static float field3368;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public final void method1618(int arg0) {
        this.field3378.method1948((byte) 82);
        field3387++;
        this.field3376.method1887(-104);
        if (arg0 != 0) {
            this.method1631(104L, (byte) -49);
        }
        this.field3366 = this.field3374;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1619(byte arg0) {
        int var2 = 33 / ((-arg0 - 23) / 37);
        field3385++;
        class367 var3 = (class367) this.field3376.method1890(-1);
        while (var3 != null) {
            Object var4 = var3.method935(true);
            if (var4 != null) {
                return var4;
            }
            class367 var5 = var3;
            var3 = (class367) this.field3376.method1890(-1);
            var5.method2594((byte) -22);
            var5.method2133(-31493);
            this.field3366++;
        }
        return null;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)I")
    public final int method1620(byte arg0) {
        field3365++;
        if (arg0 <= 4) {
            field3367 = null;
        }
        return this.field3374;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1621(byte arg0) {
        field3382++;
        if (arg0 <= 47) {
            return null;
        }
        class367 var2 = (class367) this.field3376.method1884(0);
        while (var2 != null) {
            Object var3 = var2.method935(true);
            if (var3 != null) {
                return var3;
            }
            class367 var4 = var2;
            var2 = (class367) this.field3376.method1890(-1);
            var4.method2594((byte) -22);
            var4.method2133(-31493);
            this.field3366++;
        }
        return null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLjava/lang/Object;J)V")
    public final void method1622(byte arg0, Object arg1, long arg2) {
        if (arg0 != 13) {
            field3367 = null;
        }
        field3372++;
        this.method1631(arg2, (byte) 117);
        if (this.field3366 == 0) {
            class367 var5 = (class367) this.field3378.method1946(4);
            var5.method2594((byte) -22);
            var5.method2133(-31493);
        } else {
            this.field3366--;
        }
        class218 var6 = new class218(arg1);
        this.field3376.method1886(var6, arg2, arg0 ^ 0xC);
        this.field3378.method1950(74, var6);
        var6.field4685 = 0L;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)I")
    public static final int method1623(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            method1632((byte) -38);
        }
        field3383++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)I")
    public final int method1624(int arg0) {
        if (arg0 >= -116) {
            this.method1629(103, 38);
        }
        field3375++;
        return this.field3366;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method1625(long arg0, int arg1) {
        field3373++;
        if (arg1 != 0) {
            method1632((byte) 9);
        }
        class367 var4 = (class367) this.field3376.method1888(arg0, (byte) -30);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method935(true);
        if (var5 == null) {
            var4.method2594((byte) -22);
            var4.method2133(-31493);
            this.field3366++;
            return null;
        }
        if (var4.method934((byte) -40)) {
            class218 var6 = new class218(var5);
            this.field3376.method1886(var6, var4.field5855, 1);
            this.field3378.method1950(103, var6);
            var6.field4685 = 0L;
            var4.method2594((byte) -22);
            var4.method2133(-31493);
        } else {
            this.field3378.method1950(-122, var4);
            var4.field4685 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V")
    public final void method1626(byte arg0) {
        field3386++;
        if (arg0 != 106) {
            method1623(-34, 58, 82);
        }
        for (class367 var2 = (class367) this.field3378.method1949(true); var2 != null; var2 = (class367) this.field3378.method1945((byte) -4)) {
            if (var2.method934((byte) -40)) {
                var2.method2594((byte) -22);
                var2.method2133(-31493);
                this.field3366++;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    public static void method1627(int arg0) {
        if (arg0 < 72) {
            field3389 = -105;
        }
        field3380 = null;
        field3367 = null;
        field3384 = null;
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(B)I")
    public final int method1628(byte arg0) {
        field3370++;
        int var2 = 0;
        if (arg0 < 9) {
            this.field3378 = null;
        }
        for (class367 var3 = (class367) this.field3378.method1949(true); var3 != null; var3 = (class367) this.field3378.method1945((byte) 83)) {
            if (!var3.method934((byte) -40)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(I)V")
    public class237(int arg0) {
        this.field3374 = arg0;
        this.field3366 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3376 = new class288(var2);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
    public final void method1629(int arg0, int arg1) {
        field3377++;
        if (arg1 < 37 || class129.field1569 == null) {
            return;
        }
        for (class367 var3 = (class367) this.field3378.method1949(true); var3 != null; var3 = (class367) this.field3378.method1945((byte) -121)) {
            if (var3.method934((byte) -40)) {
                if (var3.method935(true) == null) {
                    var3.method2594((byte) -22);
                    var3.method2133(-31493);
                    this.field3366++;
                }
            } else if (((long) arg0) < (++var3.field4685)) {
                class367 var4 = class129.field1569.method574(var3, (byte) -30);
                this.field3376.method1886(var4, var3.field5855, 1);
                class211.method1431(var4, false, var3);
                var3.method2594((byte) -22);
                var3.method2133(-31493);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)Lof;")
    public static final class370 method1630(int arg0, int arg1) {
        field3381++;
        class237 var2 = class222.field3111;
        class370 var3;
        synchronized (class222.field3111) {
            var3 = (class370) class222.field3111.method1625((long) arg0, arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class356.field5016.method2431((byte) 113, 16, arg0);
        class370 var5 = new class370();
        if (var4 != null) {
            var5.method2361(new class236(var4), (byte) 97);
        }
        class237 var6 = class222.field3111;
        synchronized (class222.field3111) {
            class222.field3111.method1622((byte) 13, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(JB)V")
    private final void method1631(long arg0, byte arg1) {
        if (arg1 != 117) {
            field3384 = null;
        }
        field3371++;
        class367 var4 = (class367) this.field3376.method1888(arg0, (byte) -30);
        if (var4 != null) {
            var4.method2594((byte) -22);
            var4.method2133(-31493);
            this.field3366++;
        }
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(B)V")
    public static final void method1632(byte arg0) {
        field3369++;
        if (class255.field3680 != null) {
            return;
        }
        int var1 = class323.field4601;
        int var2 = class338.field4800;
        int var3 = class410.field5896 - class330.field4671 - var1;
        if (arg0 <= 40) {
            return;
        }
        int var4 = class282.field3988 - class105.field1259 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class272.field3857 == null) {
                var5 = class14.field185.field2685;
            } else {
                var5 = class272.field3857;
            }
            int var6 = 0;
            int var7 = 0;
            if (class272.field3857 == var5) {
                Insets var8 = class272.field3857.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class282.field3988);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class410.field5896, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class410.field5896 + var6 - var3, var7, var3, class282.field3988);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class282.field3988 - var4, class410.field5896, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }
}
