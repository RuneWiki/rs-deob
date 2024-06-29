import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class22 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "[S")
    public static short[] field240 = new short[256];

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Z")
    public static boolean field247 = true;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "[C")
    public static char[] field248 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)Lfi;")
    public static final class229 method154(int arg0, boolean arg1) {
        field241++;
        if (arg1) {
            method155(92);
        }
        return class243.field3576 && class51.field702 <= arg0 && class12.field142 >= arg0 ? class248.field3738[arg0 - class51.field702] : null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static final void method155(int arg0) {
        field246++;
        if (class46.field628 == null) {
            return;
        }
        if (class89.field1439 < 10) {
            if (!class46.field617.method1877(class46.field628.field3554, (byte) -115)) {
                class89.field1439 = class147.field2361.method1865(class46.field628.field3554, (byte) 89) / 10;
                return;
            }
            class215.method1498(-5);
            class89.field1439 = 10;
        }
        if (class89.field1439 == 10) {
            int[] var1 = new int[3];
            class46.field621 = class46.field628.field3544 >> 6 << 6;
            class46.field623 = class46.field628.field3557 >> 6 << 6;
            class46.field619 = (class46.field628.field3564 >> 6 << 6) + 64 - class46.field623;
            class46.field620 = (class46.field628.field3561 >> 6 << 6) + 64 - class46.field621;
            int var2 = -1;
            int var3 = -1;
            if (class46.field628.method1656((byte) -123, (class213.field3139.field3753 >> 7) + class149.field2390, class37.field474, (class213.field3139.field3660 >> 7) + class163.field2520, var1)) {
                var3 = class46.field621 + class46.field620 - var1[2] - 1;
                var2 = var1[1] - class46.field623;
            }
            if (!class195.field2864 && var2 >= 0 && class46.field619 > var2 && var3 >= 0 && class46.field620 > var3) {
                int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
                int var5 = var2 + (int) (Math.random() * 10.0D) - 5;
                class30.field319 = var5;
                class121.field1989 = var4;
            } else if (class55.field815 == -1 || class248.field3697 == -1) {
                class46.field628.method1652(6, var1, class46.field628.field3553 & 0x3FFF, (class46.field628.field3553 & 0xFFFF868) >> 14);
                class121.field1989 = class46.field620 - (var1[2] - class46.field621) - 1;
                class30.field319 = var1[1] - class46.field623;
            } else {
                class46.field628.method1652(6, var1, class248.field3697, class55.field815);
                class195.field2864 = false;
                class248.field3697 = -1;
                class55.field815 = -1;
                if (var1 != null) {
                    class30.field319 = var1[1] - class46.field623;
                    class121.field1989 = class46.field621 + class46.field620 - var1[2] - 1;
                }
            }
            if (class46.field628.field3550 == 37) {
                class46.field629 = 3.0F;
                class46.field627 = 3.0F;
            } else if (class46.field628.field3550 == 50) {
                class46.field629 = 4.0F;
                class46.field627 = 4.0F;
            } else if (class46.field628.field3550 == 75) {
                class46.field629 = 6.0F;
                class46.field627 = 6.0F;
            } else if (class46.field628.field3550 == 100) {
                class46.field629 = 8.0F;
                class46.field627 = 8.0F;
            } else if (class46.field628.field3550 == 200) {
                class46.field629 = 16.0F;
                class46.field627 = 16.0F;
            } else {
                class46.field629 = 8.0F;
                class46.field627 = 8.0F;
            }
            class82.method619(-1);
            class46.field644 = new int[class191.field2830 + 1];
            int var6 = class46.field620 >> 6;
            int var7 = class46.field619 >> 6;
            class46.field643 = new byte[var7][var6][];
            class46.field631 = new int[var7][var6][];
            class46.field632 = new byte[var7][var6][];
            class46.field636 = new byte[var7][var6][];
            class46.field639 = new int[var7][var6][];
            class46.field637 = new byte[var7][var6][];
            class46.field635 = new byte[var7][var6][];
            class101.field1715 = new class2();
            class221.field3225 = new class104();
            int var8 = class240.field3516 >> 1;
            int var9 = class23.field249 >> 2 << 10;
            class46.method278(var9, var8);
            class294.method1997((byte) 122, 1024, 256);
            class243.method1663(256, (byte) 67);
            class89.field1439 = 20;
        } else if (class89.field1439 == 20) {
            class81.method606((byte) -73, new class53(class46.field617.method1881(class46.field628.field3554, 0, "underlay")));
            class89.field1439 = 30;
            class73.method545(true, 30);
            class53.method372((byte) -121);
        } else if (class89.field1439 == 30) {
            class46.method285(new class53(class46.field617.method1881(class46.field628.field3554, 0, "overlay")));
            class89.field1439 = 40;
            class53.method372((byte) -125);
        } else if (class89.field1439 == 40) {
            class46.method277(new class53(class46.field617.method1881(class46.field628.field3554, 0, "overlay2")));
            class89.field1439 = 50;
            class53.method372((byte) -77);
        } else if (class89.field1439 == 50) {
            class46.method284(new class53(class46.field617.method1881(class46.field628.field3554, 0, "loc")), class255.field3857);
            class89.field1439 = 60;
            class73.method545(true, 30);
            class53.method372((byte) -6);
        } else if (class89.field1439 == 60) {
            if (class46.field617.method1869((byte) -77, class46.field628.field3554 + "_labels")) {
                if (!class46.field617.method1877(class46.field628.field3554 + "_labels", (byte) -105)) {
                    return;
                }
                class46.field626 = class232.method1607(class46.field628.field3554 + "_labels", class46.field617, class255.field3857, (byte) -88);
            } else {
                class46.field626 = new class13(0);
            }
            class46.method279();
            class89.field1439 = 70;
            class53.method372((byte) -119);
        } else if (class89.field1439 == 70) {
            class303.field4908 = new class157(11, true, class12.field136);
            class89.field1439 = 73;
            class73.method545(true, 30);
            class53.method372((byte) -106);
        } else if (class89.field1439 == 73) {
            class190.field2816 = new class157(12, true, class12.field136);
            class89.field1439 = 76;
            class73.method545(true, 30);
            class53.method372((byte) -110);
        } else if (class89.field1439 == 76) {
            class231.field3396 = new class157(14, true, class12.field136);
            class89.field1439 = 79;
            class73.method545(true, 30);
            class53.method372((byte) -64);
        } else if (class89.field1439 == 79) {
            class260.field4029 = new class157(17, true, class12.field136);
            class89.field1439 = 82;
            class73.method545(true, 30);
            class53.method372((byte) -107);
        } else if (class89.field1439 == 82) {
            class155.field2414 = new class157(19, true, class12.field136);
            class89.field1439 = 85;
            class73.method545(true, 30);
            class53.method372((byte) -9);
        } else if (class89.field1439 == 85) {
            class13.field154 = new class157(22, true, class12.field136);
            class89.field1439 = 88;
            class73.method545(true, 30);
            class53.method372((byte) -31);
        } else if (class89.field1439 == 88) {
            class172.field2601 = new class157(26, true, class12.field136);
            class89.field1439 = 91;
            class73.method545(true, 30);
            class53.method372((byte) -52);
        } else {
            class220.field3214 = new class157(30, true, class12.field136);
            class89.field1439 = 100;
            class73.method545(true, 30);
            class53.method372((byte) -95);
            int var10 = 7 % ((68 - arg0) / 56);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    public static void method156(int arg0) {
        field240 = null;
        if (arg0 != -18131) {
            method155(81);
        }
        field248 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIB)I")
    public static final int method157(int arg0, int arg1, byte arg2) {
        field243++;
        int var3 = 108 % ((63 - arg2) / 32);
        int var4 = 0;
        while (arg1 > 0) {
            arg1--;
            var4 = var4 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var4;
    }
}
