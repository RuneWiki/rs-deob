import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class class272 extends class73 {

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "[Lnd;")
    public class272[] field4824;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "Z")
    public boolean field4832;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field4820 = 0;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public int field4831;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lt;")
    public class215 field4818;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Lud;")
    public class240 field4819;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[[[B")
    public static byte[][][] field4825;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
    public int[] method35(int arg0, int arg1) {
        field4826++;
        if (arg1 != 4421) {
            this.field4824 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I")
    public int method1122(int arg0) {
        field4834++;
        if (arg0 >= -46) {
            this.method34((class118) null, (byte) 86, -65);
        }
        return -1;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public void method231(int arg0) {
        field4833++;
        if (this.field4832) {
            this.field4819.method1624(0);
            this.field4819 = null;
        } else {
            this.field4818.method1513(1);
            this.field4818 = null;
        }
        if (arg0 != -4) {
            this.field4832 = false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)[[I")
    public final int[][] method1860(int arg0, int arg1, int arg2) {
        field4836++;
        if (arg1 != 3) {
            this.field4819 = null;
        }
        if (this.field4824[arg2].field4832) {
            int[] var4 = this.field4824[arg2].method35(arg0, 4421);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4824[arg2].method32(arg0, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IB)I")
    public static final int method1861(int arg0, byte arg1) {
        field4817++;
        if (arg1 >= -122) {
            field4820 = 85;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(IB)[[I")
    public int[][] method32(int arg0, byte arg1) {
        field4835++;
        int var3 = 0 % ((arg1 + 60) / 45);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method1862(byte arg0) {
        field4825 = null;
        if (arg0 > -79) {
            field4825 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)I")
    public int method236(int arg0) {
        if (arg0 != -1) {
            this.method35(115, 80);
        }
        field4827++;
        return -1;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
    public static final void method1863(int arg0, int arg1, int arg2) {
        class87.field1702 = true;
        class262.field4644 = arg0;
        class47.field782 = arg1;
        class176.field3220 = arg2;
        class93.field1777 = -1;
        class254.field4506 = -1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILp;)V")
    public static final void method1864(int arg0, class82 arg1) {
        field4822++;
        class82 var2 = class117.method814((byte) -75, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class148.field2796;
            var4 = class204.field3738;
        } else {
            var3 = var2.field1498;
            var4 = var2.field1505;
        }
        if (arg0 != -6938) {
            method1862((byte) -52);
        }
        class119.method885(var4, (byte) 5, arg1, var3, false);
        class119.method881(var3, var4, arg1, (byte) -106);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lhi;I)V")
    public static final void method1865(class250 arg0, int arg1) {
        class242.field4334 = class33.method205(arg0, class205.field3768, -117);
        field4829++;
        class27.field454 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class58.field1028[var2] & 0xFF0000) >> 16);
            int var5 = (class58.field1028[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            int var7 = (class58.field1028[var2 + 1] & 0xFF00) >> 8;
            float var8 = (float) ((class58.field1028[var2] & 0xFF00) >> 8);
            float var9 = (float) (class58.field1028[var2] & 0xFF);
            float var10 = ((float) var7 - var8) / 64.0F;
            int var11 = class58.field1028[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var9) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class27.field454[var2 * 64 + var13] = class21.method150(class21.method150((int) var8 << 8, (int) var4 << 16), (int) var9);
                var8 += var10;
                var4 += var6;
                var9 += var12;
            }
        }
        if (arg1 != 32768) {
            return;
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class27.field454[var3] = class58.field1028[3];
        }
        class179.field3292 = new int[32768];
        class52.field852 = new int[32768];
        class224.method1554(arg1 - 29768, (class34) null);
        class60.field1085 = new int[32768];
        class32.field534 = new int[32768];
        class19.field302 = new class101(128, 254);
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
    public void method113(int arg0) {
        field4830++;
        if (arg0 != 0) {
            this.field4819 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)[I")
    public final int[] method1866(int arg0, int arg1, int arg2) {
        if (arg2 <= 72) {
            this.field4819 = null;
        }
        field4816++;
        return this.field4824[arg1].field4832 ? this.field4824[arg1].method35(arg0, 4421) : this.field4824[arg1].method32(arg0, (byte) -127)[0];
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IZ)V")
    public class272(int arg0, boolean arg1) {
        this.field4824 = new class272[arg0];
        this.field4832 = arg1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljd;BI)V")
    public void method34(class118 arg0, byte arg1, int arg2) {
        field4828++;
        int var4 = 39 / ((-arg1 - 21) / 55);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZI)V")
    public final void method1867(int arg0, boolean arg1, int arg2) {
        field4823++;
        int var4 = this.field4831 == 255 ? arg2 : this.field4831;
        if (arg1) {
            this.field4832 = false;
        }
        if (this.field4832) {
            this.field4819 = new class240(var4, arg2, arg0);
        } else {
            this.field4818 = new class215(var4, arg2, arg0);
        }
    }
}
