import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class671 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Z")
    public boolean field9436 = false;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Ljda;")
    private class239 field9446 = new class239(64);

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Ljda;")
    public class239 field9450 = new class239(500);

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "Ljda;")
    public class239 field9451 = new class239(30);

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "Ljda;")
    public class239 field9453 = new class239(50);

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Laj;")
    public class333 field9441;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Laj;")
    private class333 field9442;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Z")
    public boolean field9445;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field9443 = -1;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field9452 = 0;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "[I")
    public static int[] field9449 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field9437;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public int field9454;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[[[B")
    public static byte[][][] field9438;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)V")
    public final void method3729(byte arg0, int arg1) {
        field9440++;
        class239 var3 = this.field9446;
        synchronized (this.field9446) {
            this.field9446.method1546(arg1, (byte) -8);
        }
        class239 var4 = this.field9450;
        synchronized (this.field9450) {
            this.field9450.method1546(arg1, (byte) -8);
            if (arg0 != -43) {
                this.field9450 = null;
            }
        }
        class239 var5 = this.field9451;
        synchronized (this.field9451) {
            this.field9451.method1546(arg1, (byte) -8);
        }
        class239 var6 = this.field9453;
        synchronized (this.field9453) {
            this.field9453.method1546(arg1, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    public final void method3730(int arg0, int arg1) {
        field9447++;
        this.field9454 = arg1;
        class239 var3 = this.field9450;
        synchronized (this.field9450) {
            this.field9450.method1555((byte) -3);
        }
        if (arg0 != 8) {
            field9443 = 121;
        }
        class239 var4 = this.field9451;
        synchronized (this.field9451) {
            this.field9451.method1555((byte) -3);
        }
        class239 var5 = this.field9453;
        synchronized (this.field9453) {
            this.field9453.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public final void method3731(byte arg0) {
        if (arg0 < 50) {
            this.method3729((byte) -94, -61);
        }
        class239 var2 = this.field9446;
        synchronized (this.field9446) {
            this.field9446.method1555((byte) -3);
        }
        field9435++;
        class239 var3 = this.field9450;
        synchronized (this.field9450) {
            this.field9450.method1555((byte) -3);
        }
        class239 var4 = this.field9451;
        synchronized (this.field9451) {
            this.field9451.method1555((byte) -3);
        }
        class239 var5 = this.field9453;
        synchronized (this.field9453) {
            this.field9453.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(BI)Lpu;")
    public final class589 method3732(byte arg0, int arg1) {
        field9437++;
        class239 var3 = this.field9446;
        class589 var4;
        synchronized (this.field9446) {
            var4 = (class589) this.field9446.method1541(-10, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 < 21) {
            this.method3730(-21, 28);
        }
        class333 var5 = this.field9442;
        byte[] var6;
        synchronized (this.field9442) {
            var6 = this.field9442.method2095(class226.method1492(-7636, arg1), class2.method3(arg1, -531999640), 1);
        }
        class589 var7 = new class589();
        var7.field7874 = this;
        var7.field7856 = arg1;
        if (var6 != null) {
            var7.method3287(0, new class376(var6));
        }
        var7.method3283((byte) 79);
        if (!this.field9445 && var7.field7895) {
            var7.field7850 = null;
            var7.field7901 = null;
        }
        if (var7.field7852) {
            var7.field7887 = false;
            var7.field7866 = 0;
        }
        class239 var8 = this.field9446;
        synchronized (this.field9446) {
            this.field9446.method1544(true, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V")
    public final void method3733(int arg0, boolean arg1) {
        field9448++;
        if (this.field9436 != arg1) {
            this.field9436 = arg1;
            if (arg0 == 11) {
                this.method3731((byte) 80);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method3734(int arg0) {
        field9449 = null;
        if (arg0 == 4) {
            field9438 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
    public final void method3735(int arg0, int arg1) {
        field9434++;
        this.field9446 = new class239(arg1);
        if (arg0 != 11) {
            this.field9436 = false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
    public final void method3736(byte arg0) {
        class239 var2 = this.field9446;
        synchronized (this.field9446) {
            this.field9446.method1552(arg0 ^ 0xFFFFFF8C);
        }
        field9444++;
        class239 var3 = this.field9450;
        synchronized (this.field9450) {
            this.field9450.method1552(88);
        }
        class239 var4 = this.field9451;
        synchronized (this.field9451) {
            this.field9451.method1552(-124);
        }
        class239 var5 = this.field9453;
        synchronized (this.field9453) {
            this.field9453.method1552(52);
            if (arg0 != -46) {
                field9443 = 32;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(IZ)V")
    public final void method3737(int arg0, boolean arg1) {
        if (arg0 <= 69) {
            this.method3733(-51, true);
        }
        field9439++;
        if (this.field9445 != arg1) {
            this.field9445 = arg1;
            this.method3731((byte) 111);
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lgia;IZLaj;Laj;)V")
    public class671(class285 arg0, int arg1, boolean arg2, class333 arg3, class333 arg4) {
        this.field9441 = arg4;
        this.field9442 = arg3;
        this.field9445 = arg2;
        if (this.field9442 != null) {
            int var6 = this.field9442.method2094((byte) -115) - 1;
            this.field9442.method2090(var6, false);
        }
    }
}
