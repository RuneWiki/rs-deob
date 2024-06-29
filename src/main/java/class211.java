import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class211 {

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lr;")
    private class178 field3698 = new class178();

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lea;")
    private class46 field3710 = new class46();

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    private int field3708;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    private int field3707;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Lwh;")
    private class236 field3709;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Loc;")
    public static class151 field3702 = class137.method873(2, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "[I")
    public static int[] field3696 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "[[[I")
    public static int[][][] field3706 = new int[4][13][13];

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1313(byte arg0, byte[] arg1) {
        if (arg0 != 118) {
            field3696 = null;
        }
        field3695++;
        class229 var2 = new class229(arg1);
        int var3 = var2.method1475(255);
        int var4 = var2.method1437(425528536);
        if (var4 < 0 || class59.field1182 != 0 && class59.field1182 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1456(0, (byte) 71, var4, var7);
            return var7;
        } else {
            int var5 = var2.method1437(425528536);
            if (var5 < 0 || class59.field1182 != 0 && class59.field1182 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class17.method138(var6, var5, arg1, var4, 9);
            } else {
                class37.field776.method1298(var2, var6, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IJ)V")
    public final void method1314(int arg0, long arg1) {
        if (arg0 >= -94) {
            field3696 = null;
        }
        field3691++;
        class178 var4 = (class178) this.field3709.method1538(arg1, (byte) 127);
        if (var4 != null) {
            var4.method636(102);
            var4.method1129((byte) -2);
            this.field3707++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Z")
    public static final boolean method1315(int arg0, int arg1) {
        if (arg1 != 17346) {
            method1319(-118, true);
        }
        field3697++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1316(int arg0) {
        if (arg0 != 0) {
            field3692 = 29;
        }
        field3696 = null;
        field3702 = null;
        field3706 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public final void method1317(byte arg0) {
        field3699++;
        int var2 = 17 % ((-arg0 - 63) / 57);
        while (true) {
            class178 var3 = this.field3710.method328(false);
            if (var3 == null) {
                this.field3707 = this.field3708;
                return;
            }
            var3.method636(108);
            var3.method1129((byte) -2);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BJ)Lr;")
    public final class178 method1318(byte arg0, long arg1) {
        field3700++;
        class178 var4 = (class178) this.field3709.method1538(arg1, (byte) 127);
        if (arg0 >= -29) {
            this.method1322((byte) 59);
        }
        if (var4 != null) {
            this.field3710.method330(86, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
    public static final void method1319(int arg0, boolean arg1) {
        class169.field3083 = 50;
        field3703++;
        if (arg1) {
            field3706 = null;
        }
        class42.field866 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)Lji;")
    public final class106 method1320(int arg0) {
        if (arg0 != 0) {
            method1313((byte) 100, null);
        }
        field3694++;
        return this.field3709.method1535(0);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public static final void method1321(byte arg0) {
        if (arg0 != 110) {
            return;
        }
        field3693++;
        while (true) {
            class218 var1 = class144.field2600;
            class220 var2;
            synchronized (class144.field2600) {
                var2 = (class220) class169.field3088.method1355(-12348);
            }
            if (var2 == null) {
                return;
            }
            var2.field3819.method914(var2.field3821, arg0 - 11, (int) var2.field1881, var2.field3822, false);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Lji;")
    public final class106 method1322(byte arg0) {
        if (arg0 <= 26) {
            method1321((byte) 82);
        }
        field3705++;
        return this.field3709.method1534(20912);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
    public static final void method1323(int arg0, int arg1, int arg2, int arg3) {
        if (class7.field104 != 0 && arg2 != 0 && class182.field3299 < 50 && arg1 != -1) {
            class128.field2305[class182.field3299] = arg1;
            class120.field2168[class182.field3299] = arg2;
            class155.field2800[class182.field3299] = arg3;
            class141.field2561[class182.field3299] = null;
            class57.field1154[class182.field3299] = 0;
            class182.field3299++;
        }
        field3701++;
        if (arg0 != 24597) {
            field3706 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lr;IJ)V")
    public final void method1324(class178 arg0, int arg1, long arg2) {
        field3704++;
        if (this.field3707 == 0) {
            class178 var5 = this.field3710.method328(false);
            var5.method636(110);
            var5.method1129((byte) -2);
            if (this.field3698 == var5) {
                class178 var6 = this.field3710.method328(false);
                var6.method636(arg1 - 18310);
                var6.method1129((byte) -2);
            }
        } else {
            this.field3707--;
        }
        if (arg1 == 18373) {
            this.field3709.method1536((byte) 125, arg0, arg2);
            this.field3710.method330(121, arg0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
    public class211(int arg0) {
        this.field3708 = arg0;
        this.field3707 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3709 = new class236(var2);
    }
}
