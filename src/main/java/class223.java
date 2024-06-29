import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class223 {

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Le;")
    private class177 field3474;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Llj;")
    private class25 field3471;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lkm;")
    private class54 field3469;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[B")
    public static byte[] field3466 = new byte[32896];

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Z")
    public static boolean field3481;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Z")
    public static boolean field3483;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lbj;")
    private class215 field3467;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "[Lne;")
    private class83[] field3465;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static final void method1463(int arg0) {
        field3484++;
        class98.field1425.method948((byte) 58);
        if (arg0 > -125) {
            method1467(-28, 49);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)Z")
    public final boolean method1464(byte arg0) {
        field3476++;
        if (this.field3467 != null) {
            return true;
        }
        if (this.field3469 == null) {
            if (this.field3474.method1122((byte) 121)) {
                return false;
            }
            this.field3469 = this.field3474.method1121(-29, 255, true, (byte) 0, 255);
        }
        if (this.field3469.field1712) {
            return false;
        } else {
            this.field3467 = new class215(this.field3469.method345(94));
            this.field3465 = new class83[(this.field3467.field3287.length - 5) / 8];
            return arg0 == -51;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lki;Lki;IB)Lne;")
    public final class83 method1465(class142 arg0, class142 arg1, int arg2, byte arg3) {
        field3475++;
        int var5 = 71 / ((-arg3 - 75) / 43);
        return this.method1471(arg2, true, arg0, arg1, 100);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)I")
    public static final int method1466(int arg0) {
        if (arg0 != 6) {
            method1468(112);
        }
        field3479++;
        return 6;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
    public static final void method1467(int arg0, int arg1) {
        field3468++;
        class39 var2 = class149.method935(-109, arg0, 14);
        if (arg1 <= -9) {
            var2.method268((byte) -19);
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Le;Llj;)V")
    public class223(class177 arg0, class25 arg1) {
        this.field3474 = arg0;
        this.field3471 = arg1;
        if (!this.field3474.method1122((byte) -115)) {
            this.field3469 = this.field3474.method1121(12, 255, true, (byte) 0, 255);
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public static final void method1468(int arg0) {
        field3478++;
        if (class183.field2772) {
            return;
        }
        class183.field2772 = true;
        class115.field1653 = true;
        if (class78.field1085) {
            class123.field1743 = (float) ((int) class123.field1743 + 191 & 0xFFFFFF80);
        } else {
            class228.field3571 += (24.0F - class228.field3571) / 2.0F;
        }
        if (arg0 != -9922) {
            field3477 = -90;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
    public static void method1469(byte arg0) {
        if (arg0 >= 27) {
            field3466 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1470(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            method1470(true, 121, 75, -47, 100, 113);
        }
        field3472++;
        if (class261.field4204 <= arg3 && arg4 <= class18.field310 && arg2 >= class271.field4322 && arg1 <= class311.field5001) {
            class92.method598(arg2, arg5, arg3, arg4, arg1, 26981);
        } else {
            class150.method947(arg2, arg3, arg4, arg5, arg1, true);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZLki;Lki;I)Lne;")
    private final class83 method1471(int arg0, boolean arg1, class142 arg2, class142 arg3, int arg4) {
        field3473++;
        if (this.field3467 == null) {
            throw new RuntimeException();
        }
        this.field3467.field3280 = arg0 * 8 + 5;
        if (this.field3467.field3280 >= this.field3467.field3287.length) {
            throw new RuntimeException();
        } else if (this.field3465[arg0] == null) {
            int var6 = this.field3467.method1383((byte) 33);
            if (arg4 < 15) {
                return null;
            } else {
                int var7 = this.field3467.method1383((byte) 56);
                class83 var8 = new class83(arg0, arg2, arg3, this.field3474, this.field3471, var6, var7, arg1);
                this.field3465[arg0] = var8;
                return var8;
            }
        } else {
            return this.field3465[arg0];
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public final void method1472(boolean arg0) {
        field3482++;
        if (arg0 || this.field3465 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3465.length; var2++) {
            if (this.field3465[var2] != null) {
                this.field3465[var2].method533(-128);
            }
        }
        for (int var3 = 0; var3 < this.field3465.length; var3++) {
            if (this.field3465[var3] != null) {
                this.field3465[var3].method544(124);
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3466[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
        field3481 = false;
        field3483 = false;
        field3480 = 0;
    }
}
