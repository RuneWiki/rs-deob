import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class247 {

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Ltl;")
    private class400 field3589 = new class400(64);

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Ltl;")
    private class400 field3592 = new class400(100);

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "Lui;")
    private class451 field3588;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lct;")
    public static class285 field3583 = new class285(0, -1);

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Lct;")
    public static class285 field3586 = new class285(18, 8);

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field3590 = new String[5];

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "Lo;")
    public static class332 field3593 = new class332("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Lwo;")
    public static class303 field3591;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method1579(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -2472) {
            field3586 = null;
        }
        for (int var5 = 0; var5 < class267.field3959; var5++) {
            Rectangle var6 = class398.field5826[var5];
            if (arg3 < (var6.x + var6.width) && var6.x < arg1 + arg3 && var6.y + var6.height > arg0 && arg0 + arg4 > var6.y) {
                class103.field1442[var5] = true;
            }
        }
        field3582++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Lun;", line = 30)
    public final class110 method1580(int arg0, int arg1) {
        field3579++;
        class400 var3 = this.field3592;
        class110 var4;
        synchronized (this.field3592) {
            var4 = (class110) this.field3592.method2393(arg0 ^ 0xFFFFFF89, (long) arg1);
            if (var4 == null) {
                var4 = new class110(arg1);
                this.field3592.method2395(arg0 ^ 0x1, var4, (long) arg1);
            }
        }
        synchronized (var4) {
            if (arg0 != 1) {
                this.method1580(-53, 123);
            }
            return var4.method804((byte) 104) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 57)
    public static void method1581(byte arg0) {
        field3590 = null;
        field3586 = null;
        field3583 = null;
        field3593 = null;
        if (arg0 < 81) {
            method1579(-7, 112, -62, -2, -42);
        }
        field3591 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 71)
    public final void method1582(int arg0) {
        if (arg0 != -19254) {
            return;
        }
        class400 var2 = this.field3589;
        synchronized (this.field3589) {
            this.field3589.method2401((byte) -68);
        }
        field3580++;
        class400 var3 = this.field3592;
        synchronized (this.field3592) {
            this.field3592.method2401((byte) -96);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)Z", line = 89)
    public static final boolean method1583(int arg0, int arg1, int arg2) {
        int var3 = class157.field2193[arg0][arg1][arg2];
        if (-class382.field5657 == var3) {
            return false;
        } else if (class382.field5657 == var3) {
            return true;
        } else {
            int var4 = arg1 << class426.field6091;
            int var5 = arg2 << class426.field6091;
            if (class92.method710(var4 + 1, class479.field6745[arg0].method199(arg1, arg2), var5 + 1) && class92.method710(class75.field1055 + var4 - 1, class479.field6745[arg0].method199(arg1 + 1, arg2), var5 + 1) && class92.method710(class75.field1055 + var4 - 1, class479.field6745[arg0].method199(arg1 + 1, arg2 + 1), class75.field1055 + var5 - 1) && class92.method710(var4 + 1, class479.field6745[arg0].method199(arg1, arg2 + 1), class75.field1055 + var5 - 1)) {
                class157.field2193[arg0][arg1][arg2] = class382.field5657;
                return true;
            } else {
                class157.field2193[arg0][arg1][arg2] = -class382.field5657;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V", line = 114)
    public final void method1584(int arg0, int arg1) {
        field3585++;
        class400 var3 = this.field3589;
        synchronized (this.field3589) {
            this.field3589.method2389(false, arg1);
        }
        class400 var4 = this.field3592;
        synchronized (this.field3592) {
            this.field3592.method2389(false, arg1);
            if (arg0 != 1) {
                field3590 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIII)V", line = 134)
    public static final void method1585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3581++;
        int var8 = class352.method2172(arg2, class296.field4443, class176.field2503, 0);
        int var9 = class352.method2172(arg5, class296.field4443, class176.field2503, 0);
        int var10 = class352.method2172(arg7, class119.field1643, class293.field4420, 0);
        int var11 = class352.method2172(arg3, class119.field1643, class293.field4420, 0);
        int var12 = class352.method2172(arg2 + arg6, class296.field4443, class176.field2503, 0);
        int var13 = class352.method2172(arg5 - arg6, class296.field4443, class176.field2503, 0);
        if (arg0 > -108) {
            method1583(-122, -127, -6);
        }
        for (int var14 = var8; var14 < var12; var14++) {
            class345.method2125(false, class49.field723[var14], var10, var11, arg1);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class345.method2125(false, class49.field723[var15], var10, var11, arg1);
        }
        int var16 = class352.method2172(arg6 + arg7, class119.field1643, class293.field4420, 0);
        int var17 = class352.method2172(arg3 - arg6, class119.field1643, class293.field4420, 0);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class49.field723[var18];
            class345.method2125(false, var19, var10, var16, arg1);
            class345.method2125(false, var19, var16, var17, arg4);
            class345.method2125(false, var19, var17, var11, arg1);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)Lpp;", line = 190)
    public final class356 method1586(int arg0, byte arg1) {
        if (arg1 != 36) {
            return null;
        }
        field3584++;
        class400 var3 = this.field3589;
        class356 var4;
        synchronized (this.field3589) {
            var4 = (class356) this.field3589.method2393(-118, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3588.method2691(class136.method957((byte) -39, arg0), class187.method1288(arg0, (byte) 51), 0);
        class356 var6 = new class356();
        var6.field5411 = this;
        var6.field5416 = arg0;
        if (var5 != null) {
            var6.method2190((byte) 53, new class446(var5));
        }
        var6.method2198(arg1 ^ 0x24);
        class400 var7 = this.field3589;
        synchronized (this.field3589) {
            this.field3589.method2395(arg1 ^ 0x24, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V", line = 223)
    public final void method1587(boolean arg0) {
        field3587++;
        class400 var2 = this.field3589;
        synchronized (this.field3589) {
            if (arg0) {
                return;
            }
            this.field3589.method2388(-115);
        }
        class400 var3 = this.field3592;
        synchronized (this.field3592) {
            this.field3592.method2388(126);
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lgp;ILui;Lui;Lui;)V", line = 262)
    public class247(class430 arg0, int arg1, class451 arg2, class451 arg3, class451 arg4) {
        this.field3588 = arg2;
        if (this.field3588 != null) {
            int var6 = this.field3588.method2675(false) - 1;
            this.field3588.method2662(var6, (byte) -7);
        }
        class156.method1066((byte) -89, arg4, arg3);
    }
}
