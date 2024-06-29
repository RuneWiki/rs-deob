import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class451 {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "F")
    public float field6634 = 1.0F;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "F")
    public float field6657 = 0.25F;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "F")
    public float field6656 = 1.0F;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public int field6654;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public int field6649;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "F")
    public float field6632;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public int field6639;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "F")
    public float field6640;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public int field6636;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Ltc;")
    public class396 field6644;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public int field6633;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "F")
    public float field6643;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public int field6642;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field6645 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lsf;")
    public static class398 field6638 = new class398();

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "[B")
    public static byte[] field6651 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "Lwl;")
    public static class452 field6655 = new class452(54, -2);

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "[I")
    public static int[] field6659 = new int[4096];

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "Liq;")
    public static class134 field6658;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "Ljava/awt/Font;")
    public static Font field6647;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "Z")
    public static boolean field6650;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)Ltb;")
    public static final class290 method2774(int arg0, byte arg1) {
        if (arg1 != -58) {
            field6645 = null;
        }
        field6635++;
        if (arg0 == 0) {
            if ((double) class223.field3388 == 3.0D) {
                return class103.field1402;
            }
            if ((double) class223.field3388 == 4.0D) {
                return class227.field3432;
            }
            if ((double) class223.field3388 == 6.0D) {
                return class167.field2393;
            }
            if ((double) class223.field3388 >= 8.0D) {
                return class416.field6179;
            }
        } else if (arg0 == 1) {
            if ((double) class223.field3388 == 3.0D) {
                return class167.field2393;
            }
            if ((double) class223.field3388 == 4.0D) {
                return class416.field6179;
            }
            if ((double) class223.field3388 == 6.0D) {
                return class177.field2684;
            }
            if ((double) class223.field3388 >= 8.0D) {
                return class146.field2028;
            }
        } else if (arg0 == 2) {
            if ((double) class223.field3388 == 3.0D) {
                return class177.field2684;
            }
            if ((double) class223.field3388 == 4.0D) {
                return class146.field2028;
            }
            if ((double) class223.field3388 == 6.0D) {
                return class347.field5189;
            }
            if ((double) class223.field3388 >= 8.0D) {
                return class82.field1105;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILiq;I)Ljp;")
    public static final class49 method2775(int arg0, int arg1, class134 arg2, int arg3) {
        field6646++;
        if (arg3 != 18325) {
            method2778('d', -53);
        }
        byte[] var4 = arg2.method823(arg1, -20334, arg0);
        return var4 == null ? null : new class49(var4);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLef;)V")
    public final void method2776(byte arg0, class385 arg1) {
        this.field6634 = (float) (arg1.method2343(255) * 8) / 255.0F;
        field6653++;
        this.field6657 = (float) (arg1.method2343(255) * 8) / 255.0F;
        this.field6656 = (float) (arg1.method2343(255) * 8) / 255.0F;
        if (arg0 <= 31) {
            method2779(-5);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method2777(int arg0) {
        field6638 = null;
        field6647 = null;
        field6658 = null;
        field6651 = null;
        field6655 = null;
        int var1 = 121 / ((76 - arg0) / 36);
        field6659 = null;
        field6645 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(CI)C")
    public static final char method2778(char arg0, int arg1) {
        field6637++;
        if (arg1 == -11076) {
            return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
        } else {
            return (char) 65463;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static final void method2779(int arg0) {
        if (arg0 >= 63) {
            field6648++;
            class38.field462.method1482((byte) 73);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILps;)I")
    public static final int method2780(int arg0, class306 arg1) {
        field6631++;
        if (arg0 != 2) {
            return 90;
        }
        String var2 = class324.method1991(arg1, arg0 - 3);
        int[] var3 = null;
        if (class68.method466(23, arg1.field4616)) {
            var3 = class186.field2796.method1106(50, (int) arg1.field4626).field2357;
        } else if (class55.method316(125, arg1.field4616)) {
            class155 var6 = class170.field2626[(int) arg1.field4626];
            if (var6 != null) {
                class271 var7 = var6.field2137;
                if (var7.field4100 != null) {
                    var7 = var7.method1684(arg0 + 4);
                }
                if (var7 != null) {
                    var3 = var7.field4130;
                }
            }
        } else if (class238.method1429(arg1.field4616, -102)) {
            Object var4 = null;
            class85 var5;
            if (arg1.field4616 == 1002) {
                var5 = class411.method2575(0, (int) arg1.field4626);
            } else {
                var5 = class411.method2575(0, (int) (arg1.field4626 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field1133 != null) {
                var5 = var5.method542(6796);
            }
            if (var5 != null) {
                var3 = var5.field1177;
            }
        }
        if (var3 != null) {
            var2 = var2 + class106.method661((byte) -114, var3);
        }
        int var8 = class188.field2828.method1692(var2, class304.field4590, (byte) -55);
        if (arg1.field4622) {
            var8 += class153.field2101.method1227() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLtg;)Z")
    public final boolean method2781(boolean arg0, class451 arg1) {
        field6641++;
        if (!arg0) {
            method2774(14, (byte) 120);
        }
        return this.field6654 == arg1.field6654 && this.field6632 == arg1.field6632 && this.field6640 == arg1.field6640 && this.field6643 == arg1.field6643 && this.field6657 == arg1.field6657 && this.field6634 == arg1.field6634 && this.field6656 == arg1.field6656 && this.field6633 == arg1.field6633 && this.field6642 == arg1.field6642 && this.field6644 == arg1.field6644;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class451() {
        this.field6654 = class162.field2253;
        this.field6649 = -60;
        this.field6632 = 1.1523438F;
        this.field6639 = -50;
        this.field6640 = 0.69921875F;
        this.field6636 = -50;
        this.field6644 = class57.field763;
        this.field6633 = class426.field6270;
        this.field6643 = 1.2F;
        this.field6642 = 0;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lef;)V")
    public class451(class385 arg0) {
        int var2 = arg0.method2343(255);
        if (field6650 && class375.field5461.method342() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field6654 = class162.field2253;
            } else {
                this.field6654 = arg0.method2354(255);
            }
            if ((var2 & 0x2) == 0) {
                this.field6632 = 1.1523438F;
            } else {
                this.field6632 = (float) arg0.method2323(-127) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field6640 = 0.69921875F;
            } else {
                this.field6640 = (float) arg0.method2323(-10) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field6643 = 1.2F;
            } else {
                this.field6643 = (float) arg0.method2323(-95) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2354(255);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2323(-117);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2323(-41);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2323(-105);
            }
            this.field6643 = 1.2F;
            this.field6654 = class162.field2253;
            this.field6632 = 1.1523438F;
            this.field6640 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field6649 = -60;
            this.field6639 = -50;
            this.field6636 = -50;
        } else {
            this.field6639 = arg0.method2327((byte) -116);
            this.field6649 = arg0.method2327((byte) -116);
            this.field6636 = arg0.method2327((byte) -116);
        }
        if ((var2 & 0x20) == 0) {
            this.field6633 = class426.field6270;
        } else {
            this.field6633 = arg0.method2354(255);
        }
        if ((var2 & 0x40) == 0) {
            this.field6642 = 0;
        } else {
            this.field6642 = arg0.method2323(-114);
        }
        if ((var2 & 0x80) == 0) {
            this.field6644 = class57.field763;
        } else {
            this.field6644 = class312.method1908(arg0.method2323(-63), arg0.method2323(-95), (byte) -83, arg0.method2323(-101), arg0.method2323(-29), arg0.method2323(-72), arg0.method2323(-5));
        }
    }

    static {
        new class151("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }
}
