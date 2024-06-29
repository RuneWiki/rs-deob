import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class447 {

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Z")
    public boolean field6650 = false;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Lng;")
    private class226 field6649 = new class226(64);

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "Lng;")
    public class226 field6671 = new class226(500);

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "Lng;")
    public class226 field6672 = new class226(30);

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "Lng;")
    public class226 field6673 = new class226(50);

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Lic;")
    private class491 field6655;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Z")
    public boolean field6653;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "Lic;")
    public class491 field6668;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Llt;")
    public static class475 field6652 = new class475("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field6663 = 0;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "Z")
    public static boolean field6665 = false;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "Lwa;")
    public static class433 field6664 = new class433(16);

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "J")
    public static long field6670 = 0L;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public int field6674;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Lne;")
    public static class207 field6662;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "Lia;")
    public static class414 field6667;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)V")
    public final void method2684(boolean arg0, int arg1) {
        field6656++;
        if (arg0 != this.field6653) {
            this.field6653 = arg0;
            if (arg1 == -29125) {
                this.method2694(arg1 + 29123);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lie;")
    public static final class6 method2685(int arg0) {
        if (arg0 > -100) {
            method2687(-113);
        }
        field6648++;
        try {
            return (class6) Class.forName("he").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)Lkn;")
    public final class519 method2686(int arg0, byte arg1) {
        field6666++;
        class226 var3 = this.field6649;
        class519 var4;
        synchronized (this.field6649) {
            var4 = (class519) this.field6649.method1536((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6655.method2945(class459.method2747(2, arg0), class253.method1699((byte) -97, arg0), true);
        class519 var6 = new class519();
        var6.field7580 = arg0;
        var6.field7600 = this;
        if (var5 != null) {
            var6.method3068((byte) -119, new class209(var5));
        }
        var6.method3058(0);
        if (var6.field7582) {
            var6.field7656 = 0;
            var6.field7586 = false;
        }
        if (!this.field6653 && var6.field7604) {
            var6.field7612 = null;
            var6.field7650 = null;
        }
        class226 var7 = this.field6649;
        synchronized (this.field6649) {
            this.field6649.method1542(var6, (byte) 112, (long) arg0);
        }
        return arg1 < 84 ? null : var6;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public static void method2687(int arg0) {
        field6667 = null;
        field6664 = null;
        field6652 = null;
        field6662 = null;
        if (arg0 != 16) {
            field6665 = false;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BZ)V")
    public final void method2688(byte arg0, boolean arg1) {
        field6658++;
        if (arg1 == this.field6650) {
            return;
        }
        this.field6650 = arg1;
        this.method2694(-2);
        if (arg0 < 56) {
            this.method2690(-3, true);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIB)I")
    public static final int method2689(int arg0, int arg1, int arg2, byte arg3) {
        field6669++;
        if (class482.field7062 < 100) {
            return -2;
        }
        int var4 = 98 % ((19 - arg3) / 60);
        int var5 = -2;
        int var6 = Integer.MAX_VALUE;
        int var7 = arg2 - class460.field6818;
        int var8 = arg1 - class460.field6825;
        for (class355 var9 = (class355) class460.field6814.method816(103); var9 != null; var9 = (class355) class460.field6814.method812(89)) {
            if (var9.field5459 == arg0) {
                int var10 = var9.field5465;
                int var11 = var9.field5458;
                int var12 = class460.field6825 + var11 | class460.field6818 + var10 << 14;
                int var13 = (var8 - var11) * (var8 - var11) + (var7 - var10) * (var7 - var10);
                if (var5 < 0 || var6 > var13) {
                    var6 = var13;
                    var5 = var12;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V")
    public final void method2690(int arg0, boolean arg1) {
        this.field6674 = arg0;
        field6661++;
        if (!arg1) {
            return;
        }
        class226 var3 = this.field6671;
        synchronized (this.field6671) {
            this.field6671.method1540(0);
        }
        class226 var4 = this.field6672;
        synchronized (this.field6672) {
            this.field6672.method1540(0);
        }
        class226 var5 = this.field6673;
        synchronized (this.field6673) {
            this.field6673.method1540(0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
    public final void method2691(int arg0, int arg1) {
        class226 var3 = this.field6649;
        synchronized (this.field6649) {
            this.field6649.method1534(0, arg1);
        }
        field6654++;
        class226 var4 = this.field6671;
        synchronized (this.field6671) {
            this.field6671.method1534(0, arg1);
        }
        class226 var5 = this.field6672;
        synchronized (this.field6672) {
            this.field6672.method1534(0, arg1);
        }
        class226 var6 = this.field6673;
        synchronized (this.field6673) {
            this.field6673.method1534(0, arg1);
            int var7 = 0 % ((arg0 + 44) / 51);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    public final void method2692(int arg0) {
        class226 var2 = this.field6649;
        synchronized (this.field6649) {
            this.field6649.method1539(-91);
        }
        field6660++;
        class226 var3 = this.field6671;
        synchronized (this.field6671) {
            this.field6671.method1539(-96);
        }
        class226 var4 = this.field6672;
        synchronized (this.field6672) {
            this.field6672.method1539(-93);
            if (arg0 <= 88) {
                method2693(49, -34, -91, -62, 115);
            }
        }
        class226 var5 = this.field6673;
        synchronized (this.field6673) {
            this.field6673.method1539(-79);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)V")
    public static final void method2693(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if ((arg3 - arg1) >= class494.field7297 && arg1 + arg3 <= class445.field6629 && class37.field393 <= arg4 - arg1 && (arg1 + arg4) <= class509.field7436) {
            class321.method1991(arg4, arg1, arg3, arg0, (byte) -36);
        } else {
            class27.method166(arg1, arg4, arg3, (byte) 11, arg0);
        }
        field6651++;
        if (arg2 != 0) {
            method2693(23, -127, 4, -76, -128);
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
    public final void method2694(int arg0) {
        class226 var2 = this.field6649;
        synchronized (this.field6649) {
            this.field6649.method1540(0);
        }
        if (arg0 != -2) {
            this.method2691(-85, 82);
        }
        field6659++;
        class226 var3 = this.field6671;
        synchronized (this.field6671) {
            this.field6671.method1540(0);
        }
        class226 var4 = this.field6672;
        synchronized (this.field6672) {
            this.field6672.method1540(0);
        }
        class226 var5 = this.field6673;
        synchronized (this.field6673) {
            this.field6673.method1540(0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IZ)V")
    public final void method2695(int arg0, boolean arg1) {
        this.field6649 = new class226(arg0);
        field6657++;
        if (arg1) {
            this.method2686(6, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lai;IZLic;Lic;)V")
    public class447(class423 arg0, int arg1, boolean arg2, class491 arg3, class491 arg4) {
        this.field6655 = arg3;
        this.field6653 = arg2;
        this.field6668 = arg4;
        if (this.field6655 != null) {
            int var6 = this.field6655.method2943((byte) -33) - 1;
            this.field6655.method2942(false, var6);
        }
    }
}
