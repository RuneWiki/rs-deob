import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class202 extends class110 {

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "I")
    private int field3021 = 0;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
    private int field3020 = 0;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
    private int field3025 = 1;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field3016 = 0;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3026 = "Loading textures - ";

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "[Lea;")
    public static class235[] field3029;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lre;I)Lve;", line = 7)
    public static final class211 method1380(class263 arg0, int arg1) {
        field3027++;
        if (arg1 != 99999999) {
            field3016 = 105;
        }
        return new class211(arg0.method1845((byte) -124), arg0.method1845((byte) -124), arg0.method1845((byte) -120), arg0.method1845((byte) -127), arg0.method1824(false), arg0.method1787(false));
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljl;Llm;ZLlm;I)V", line = 22)
    public static final void method1381(class112 arg0, class210 arg1, boolean arg2, class210 arg3, int arg4) {
        if (arg4 != 0) {
            field3016 = -95;
        }
        field3018++;
        class272.field4161 = arg3;
        class225.field3425 = arg2;
        class97.field1448 = arg1;
        int var5 = class272.field4161.method1445(-17371) - 1;
        class304.field4633 = var5 * 256 + class272.field4161.method1464((byte) 126, var5);
        class258.field3900 = new String[] { null, null, class295.field4527, null, null };
        class228.field3472 = arg0;
        class177.field2628 = new String[] { null, null, null, null, class162.field2436 };
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)V", line = 45)
    public static void method1382(int arg0) {
        field3029 = null;
        int var1 = -49 % ((-arg0 - 15) / 57);
        field3026 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BIIII)V", line = 55)
    public static final void method1383(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -34) {
            method1380((class263) null, 69);
        }
        field3028++;
        if (arg3 >= arg4) {
            for (int var5 = arg4; var5 < arg3; var5++) {
                class40.field488[var5][arg1] = arg2;
            }
        } else {
            for (int var6 = arg3; var6 < arg4; var6++) {
                class40.field488[var6][arg1] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)[I", line = 92)
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 1) {
            field3026 = (String) null;
        }
        field3023++;
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int var4 = class177.field2615[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class124.field1936; var6++) {
                int var7 = class249.field3714[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field3020 == 0) {
                    var9 = (var7 - var4) * this.field3025;
                } else {
                    int var10 = var8 * var8 + (var5 * var5) >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3025 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field3021 == 0) {
                    var12 = class22.field285[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field3021 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 170)
    public class202() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)Lub;", line = 175)
    public static final class11 method1384(int arg0, byte arg1) {
        field3017++;
        class11 var2 = (class11) class72.field937.method1674(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class270.field4126.method1441(arg0 & 0x7FFF, (byte) -44, 1);
        } else {
            var3 = class218.field3319.method1441(arg0, (byte) -44, 1);
        }
        class11 var4 = new class11();
        if (var3 != null) {
            var4.method66(new class263(var3), false);
        }
        if (arg1 != 118) {
            method1384(-8, (byte) 68);
        }
        if (arg0 >= 32768) {
            var4.method56(0);
        }
        class72.field937.method1672(-128, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILre;I)V", line = 207)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg2 > -37) {
            return;
        }
        if (arg0 == 0) {
            this.field3020 = arg1.method1787(false);
        } else if (arg0 == 1) {
            this.field3021 = arg1.method1787(false);
        } else if (arg0 == 3) {
            this.field3025 = arg1.method1787(false);
        }
        field3022++;
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V", line = 261)
    public final void method47(int arg0) {
        field3024++;
        if (arg0 != -9) {
            method1381((class112) null, (class210) null, false, (class210) null, 122);
        }
        class314.method2157(arg0 + 63);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V", line = 278)
    public static final void method1385(String arg0, byte arg1, String arg2, int arg3) {
        field3019++;
        class269.field4123 = arg0;
        class74.field966 = arg3;
        class178.field2640 = arg2;
        if (class178.field2640.equals("") || class269.field4123.equals("")) {
            class170.field2555 = 3;
        } else if (class258.field3921 == -1) {
            class170.field2555 = -3;
            class113.field1747 = 0;
            class30.field406 = 0;
            class49.field626 = 1;
            class263 var4 = new class263(128);
            var4.method1813(arg1 ^ 0xFFFFFF8C, 10);
            var4.method1815(arg1 + 43, (int) (Math.random() * 9.9999999E7D));
            var4.method1816(class242.method1638(class178.field2640, -14393), 21054);
            var4.method1815(arg1 + 39, (int) (Math.random() * 9.9999999E7D));
            var4.method1825(class269.field4123, (byte) 117);
            if (arg1 == 62) {
                var4.method1815(96, (int) (Math.random() * 9.9999999E7D));
                var4.method1796(867204152, class96.field1439, class140.field2114);
                class234.field3507.field4025 = 0;
                class234.field3507.method1813(arg1 ^ 0x58, 24);
                class234.field3507.method1813(arg1 - 46, var4.field4025 + 2);
                class234.field3507.method1823(534, (byte) -75);
                class234.field3507.method1814(var4.field4025, -1157288507, var4.field3986, 0);
            }
        } else {
            class132.method971((byte) 48);
        }
    }
}
