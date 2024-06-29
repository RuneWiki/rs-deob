import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class393 {

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lpn;")
    private class446 field5625 = new class446();

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lkn;")
    public static class442 field5628 = new class442("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field5633 = 0;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "J")
    public static long field5635;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Lsg;")
    public static class226 field5637;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "Lpn;")
    private class446 field5638;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Lpn;")
    public final class446 method2476(int arg0) {
        field5636++;
        if (arg0 != 1) {
            method2485(124, 44, -99, (class294) null, 69, -41);
        }
        class446 var2 = this.field5638;
        if (this.field5625 == var2) {
            this.field5638 = null;
            return null;
        } else {
            this.field5638 = var2.field6254;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static void method2477(byte arg0) {
        int var1 = 106 % ((arg0 - 3) / 60);
        field5637 = null;
        field5628 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lpn;Z)V")
    public final void method2478(class446 arg0, boolean arg1) {
        field5632++;
        if (arg1) {
            return;
        }
        if (arg0.field6251 != null) {
            arg0.method2783((byte) -122);
        }
        arg0.field6254 = this.field5625;
        arg0.field6251 = this.field5625.field6251;
        arg0.field6251.field6254 = arg0;
        arg0.field6254.field6251 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZIZIFIII)[I")
    public static final int[] method2479(boolean arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5, int arg6, int arg7) {
        field5627++;
        int[] var8 = new int[arg1];
        class263 var9 = new class263();
        var9.field3667 = arg3;
        var9.field3671 = (int) (arg4 * 4096.0F);
        var9.field3672 = arg2;
        var9.field3676 = arg7;
        var9.field3660 = arg6;
        var9.field3668 = arg5;
        var9.method33(79);
        class390.method2468(arg1, 1, -101);
        if (!arg0) {
            method2488(-85, 89, (class268) null, -60, true, -23, (byte) 15);
        }
        var9.method1722(0, 3, var8);
        return var8;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)I")
    public static final int method2480(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg0 != -16535) {
            field5628 = null;
        }
        field5626++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Lpn;")
    public final class446 method2481(byte arg0) {
        field5634++;
        if (arg0 != -78) {
            return null;
        }
        class446 var2 = this.field5625.field6254;
        if (this.field5625 == var2) {
            return null;
        } else {
            var2.method2783((byte) -122);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Lpn;")
    public final class446 method2482(int arg0) {
        field5629++;
        if (arg0 >= -20) {
            this.method2481((byte) -89);
        }
        class446 var2 = this.field5625.field6254;
        if (this.field5625 == var2) {
            this.field5638 = null;
            return null;
        } else {
            this.field5638 = var2.field6254;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method2483(String arg0, int arg1, int arg2) {
        class46.field648.method1178(63, 221);
        field5623++;
        field5620++;
        class46.field648.method173(class273.method1782((byte) 25, arg0) + arg2, arg2 ^ 0xFE);
        class46.field648.method201(arg1, 3);
        class46.field648.method160(arg0, false);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lwh;")
    public static final class80 method2484(int arg0, int arg1) {
        field5630++;
        class131 var2 = class406.field5774;
        class80 var3;
        synchronized (class406.field5774) {
            var3 = (class80) class406.field5774.method904(false, (long) arg0);
        }
        int var4 = -34 / ((3 - arg1) / 50);
        if (var3 != null) {
            return var3;
        }
        byte[] var5 = class297.field4157.method1745(class76.method561(255, arg0), (byte) -127, class331.method2135(98, arg0));
        class80 var6 = new class80();
        var6.field1135 = arg0;
        if (var5 != null) {
            var6.method574(new class11(var5), 0);
        }
        class131 var7 = class406.field5774;
        synchronized (class406.field5774) {
            class406.field5774.method902((long) arg0, (byte) 112, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILko;II)Ljava/awt/Frame;")
    public static final Frame method2485(int arg0, int arg1, int arg2, class294 arg3, int arg4, int arg5) {
        field5631++;
        if (!arg3.method1903((byte) 120)) {
            return null;
        }
        if (arg1 == 0) {
            class2[] var6 = client.method1092((byte) 74, arg3);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field22 == arg2 && var6[var8].field20 == arg4 && (arg0 == 0 || var6[var8].field23 == arg0) && (!var7 || var6[var8].field26 > arg1)) {
                    arg1 = var6[var8].field26;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class283 var9 = arg3.method1908(arg0, arg1, 2, arg2, arg4);
        if (arg5 != 10) {
            field5637 = null;
        }
        while (var9.field3998 == 0) {
            class349.method2219(10L, arg5 ^ 0xFFFFFFD6);
        }
        Frame var10 = (Frame) var9.field3999;
        if (var10 == null) {
            return null;
        } else if (var9.field3998 == 2) {
            class92.method655(var10, (byte) 43, arg3);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class393() {
        this.field5625.field6254 = this.field5625;
        this.field5625.field6251 = this.field5625;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public final void method2486(int arg0) {
        field5624++;
        if (arg0 != 221) {
            this.method2478((class446) null, false);
        }
        while (true) {
            class446 var2 = this.field5625.field6254;
            if (this.field5625 == var2) {
                this.field5638 = null;
                return;
            }
            var2.method2783((byte) -122);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)I")
    public static int method2487(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILnq;IZIB)V")
    public static final void method2488(int arg0, int arg1, class268 arg2, int arg3, boolean arg4, int arg5, byte arg6) {
        if (arg6 < 50) {
            method2485(76, -88, 102, (class294) null, -73, -80);
        }
        class106.field1473 = arg1;
        class290.field4063 = arg3;
        class347.field4737 = 1;
        class388.field5578 = arg4;
        class247.field3487 = arg5;
        class113.field1636 = arg0;
        class130.field1832 = arg2;
        field5621++;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)I")
    public final int method2489(int arg0) {
        field5622++;
        int var2 = arg0;
        class446 var3 = this.field5625.field6254;
        while (this.field5625 != var3) {
            var3 = var3.field6254;
            var2++;
        }
        return var2;
    }
}
