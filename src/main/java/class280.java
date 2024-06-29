import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class280 extends class128 {

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4452 = "Please remove ";

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "Z")
    public static boolean field4453 = false;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "Ljava/lang/String;")
    public String field4455;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "[C")
    public char[] field4444;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "[C")
    public char[] field4447;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "[I")
    public int[] field4439;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "[I")
    public int[] field4451;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lbj;Z)V")
    public final void method1813(class215 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1374((byte) -60);
            if (var3 == 0) {
                field4440++;
                if (arg1) {
                    this.method1818((char) 65500, 56);
                    return;
                }
                return;
            }
            this.method1819(var3, arg0, (byte) -60);
        }
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
    public static void method1814(int arg0) {
        field4452 = null;
        if (arg0 != 2) {
            field4454 = -22;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)Lwk;")
    public static final class195 method1815(int arg0, int arg1) {
        field4445++;
        int var2 = -61 / ((35 - arg1) / 41);
        class195 var3 = (class195) class47.field683.method950((long) arg0, (byte) -45);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class76.field1067.method2050(126, class279.method1810((byte) -105, arg0), class305.method2047(arg0, (byte) -121));
        class195 var5 = new class195();
        var5.field2987 = arg0;
        if (var4 != null) {
            var5.method1240(new class215(var4), 43);
        }
        var5.method1230(false);
        class47.field683.method942((long) arg0, (byte) 93, var5);
        return var5;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILnh;I)Lta;")
    public static final class203 method1816(int arg0, int arg1, class305 arg2, int arg3) {
        if (arg3 == 0) {
            field4450++;
            return class131.method832(arg1, arg0, -122, arg2) ? class255.method1665(arg3 ^ 0x2C62) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IC)I")
    public final int method1817(int arg0, char arg1) {
        field4443++;
        if (this.field4451 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field4451.length; var3++) {
            if (this.field4444[var3] == arg1) {
                return this.field4451[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(CI)I")
    public final int method1818(char arg0, int arg1) {
        field4441++;
        if (this.field4439 == null) {
            return -1;
        }
        int var3 = 106 / ((arg1 + 11) / 58);
        for (int var4 = 0; var4 < this.field4439.length; var4++) {
            if (this.field4447[var4] == arg0) {
                return this.field4439[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILbj;B)V")
    private final void method1819(int arg0, class215 arg1, byte arg2) {
        field4442++;
        if (arg0 == 1) {
            this.field4455 = arg1.method1376(-43);
        } else if (arg0 == 2) {
            int var7 = arg1.method1374((byte) -60);
            this.field4444 = new char[var7];
            this.field4451 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4451[var8] = arg1.method1379(-126);
                byte var9 = arg1.method1350((byte) -90);
                this.field4444[var8] = var9 == 0 ? 0 : class126.method814(-404579261, var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1374((byte) -60);
            this.field4439 = new int[var4];
            this.field4447 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4439[var5] = arg1.method1379(-98);
                byte var6 = arg1.method1350((byte) 121);
                this.field4447[var5] = var6 == 0 ? 0 : class126.method814(-404579261, var6);
            }
        }
        if (arg2 > -11) {
            method1815(-90, 114);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lnh;I)V")
    public static final void method1820(class305 arg0, int arg1) {
        field4448++;
        if (class147.field2020) {
            return;
        }
        class266.method1725();
        int var2 = -7 % ((arg1 + 21) / 51);
        class207.field3083 = class57.method356(class4.field28, arg0, (byte) -92);
        int var3 = class174.field2460;
        int var4 = var3 * 956 / 503;
        class207.field3083.method685((class218.field3386 - var4) / 2, 0, var4, var3);
        class179.field2711 = class102.method656(arg0, (byte) -107, class91.field1320);
        class179.field2711.method487(class218.field3386 / 2 - class179.field2711.field4566 / 2, 18);
        class147.field2020 = true;
    }

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "(I)V")
    public final void method1821(int arg0) {
        if (this.field4439 != null) {
            for (int var2 = 0; var2 < this.field4439.length; var2++) {
                this.field4439[var2] = class161.method1003(this.field4439[var2], 32768);
            }
        }
        field4449++;
        if (this.field4451 != null) {
            for (int var3 = 0; var3 < this.field4451.length; var3++) {
                this.field4451[var3] = class161.method1003(this.field4451[var3], 32768);
            }
        }
        if (arg0 <= 115) {
            this.method1813((class215) null, true);
        }
    }
}
