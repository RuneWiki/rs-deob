import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class380 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Ljp;")
    private class236 field5190 = new class236(64);

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Lpc;")
    private class473 field5201;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field5197 = -50;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[[I")
    public static int[][] field5194;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
    public static final void method2251(int arg0, int[] arg1, Object[] arg2) {
        field5195++;
        class439.method2537(arg2, 124, 0, arg1.length - 1, arg1);
        if (arg0 > -83) {
            method2252(53, 77);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
    public static final void method2252(int arg0, int arg1) {
        field5199++;
        if (class309.field4061 == arg1) {
            return;
        }
        class12.field251 = class289.field3782 = class12.field245[arg1];
        class247.method1498(-122);
        int var2 = -60 % ((-arg0 - 30) / 53);
        class74.field1116 = new int[class12.field251][class289.field3782];
        class168.field2437 = new int[4][class12.field251 >> 3][class289.field3782 >> 3];
        class349.field4711 = new int[class12.field251][class289.field3782];
        for (int var3 = 0; var3 < 4; var3++) {
            class120.field1754[var3] = class507.method2896((byte) -33, class12.field251, class289.field3782);
        }
        class99.field1482 = new byte[4][class12.field251][class289.field3782];
        class114.method782(class12.field251, 4, class289.field3782, (byte) 107);
        class99.method707(class289.field3782 >> 3, class12.field251 >> 3, 56, class370.field4984);
        class309.field4061 = arg1;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V")
    public static final void method2253(int arg0, int arg1) {
        class409 var2 = class497.field6886[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class409 var4 = class497.field6886[var3][arg0][arg1] = class497.field6886[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field5608--;
                for (class165 var5 = var4.field5630; var5 != null; var5 = var5.field2400) {
                    class37 var6 = var5.field2402;
                    if (var6.field581 == arg0 && var6.field587 == arg1) {
                        var6.field573--;
                    }
                }
            }
        }
        if (class497.field6886[0][arg0][arg1] == null) {
            class497.field6886[0][arg0][arg1] = new class409(0, arg0, arg1);
            class497.field6886[0][arg0][arg1].field5620 = 1;
        }
        class497.field6886[0][arg0][arg1].field5612 = var2;
        class497.field6886[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method2254(int arg0) {
        int var1 = -17 % ((arg0 + 29) / 57);
        field5194 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V")
    public final void method2255(int arg0, boolean arg1) {
        field5191++;
        class236 var3 = this.field5190;
        synchronized (this.field5190) {
            if (arg1) {
                this.field5190.method1461(-5, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method2256(int arg0, boolean arg1, Object arg2) {
        field5198++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class312.method1809(var3, 0) : var3;
        } else {
            if (arg0 != 4) {
                method2253(-5, 4);
            }
            if (!arg2 instanceof class299) {
                throw new IllegalArgumentException();
            }
            class299 var4 = (class299) arg2;
            return var4.method747((byte) 55);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public final void method2257(byte arg0) {
        field5192++;
        class236 var2 = this.field5190;
        synchronized (this.field5190) {
            if (arg0 != -117) {
                method2252(-118, 51);
            }
            this.field5190.method1458((byte) -113);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)Lco;")
    public final class76 method2258(byte arg0, int arg1) {
        field5193++;
        class236 var3 = this.field5190;
        class76 var4;
        synchronized (this.field5190) {
            var4 = (class76) this.field5190.method1456((long) arg1, 124);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5201.method2708(class255.method1535(arg1, 66), class465.method2646(arg1, 32896), (byte) 54);
        class76 var6 = new class76();
        if (var5 != null) {
            var6.method486(new class379(var5), 0);
        }
        int var7 = 26 / ((arg0 - 77) / 36);
        class236 var8 = this.field5190;
        synchronized (this.field5190) {
            this.field5190.method1462(var6, (long) arg1, -25);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    public final void method2259(byte arg0) {
        class236 var2 = this.field5190;
        synchronized (this.field5190) {
            this.field5190.method1459(19088);
        }
        field5202++;
        if (arg0 < 21) {
            this.field5190 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)V")
    public final void method2260(int arg0, byte arg1) {
        field5196++;
        if (arg1 < 40) {
            return;
        }
        class236 var3 = this.field5190;
        synchronized (this.field5190) {
            this.field5190.method1458((byte) 59);
            this.field5190 = new class236(arg0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lrb;ILpc;)V")
    public class380(class234 arg0, int arg1, class473 arg2) {
        this.field5201 = arg2;
        if (this.field5201 != null) {
            int var4 = this.field5201.method2724(0) - 1;
            this.field5201.method2710(var4, (byte) -112);
        }
    }
}
