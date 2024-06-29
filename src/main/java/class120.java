import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class120 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    private int field2019 = 0;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    private int field2022 = -1;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Z")
    public static boolean field2018 = false;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "[I")
    public static int[] field2020 = new int[14];

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "F")
    public static float field2027 = 0.0F;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Lwk;")
    public static class157 field2023;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)Lfa;")
    public static final class177 method843(boolean arg0, int arg1) {
        field2029++;
        if (arg0) {
            method845(-53);
        }
        class177 var2 = (class177) class75.field1024.method1839((byte) 85, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class6.field72.method940((byte) 57, arg1, 32);
        class177 var4 = new class177();
        if (var3 != null) {
            var4.method1219((byte) 114, new class264(var3));
        }
        var4.method1228(-102);
        class75.field1024.method1830((long) arg1, -52, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lhi;ZI)V")
    public final void method844(class264 arg0, boolean arg1, int arg2) {
        field2032++;
        if (!arg1) {
            field2031 = -4;
        }
        while (true) {
            int var4 = arg0.method1779(-95);
            if (var4 == 0) {
                return;
            }
            this.method847((byte) 58, arg0, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method845(int arg0) {
        field2023 = null;
        field2020 = null;
        if (arg0 != -1) {
            field2031 = -18;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjj;B)[Ljg;")
    public static final class271[] method846(int arg0, int arg1, class134 arg2, byte arg3) {
        if (arg3 == 29) {
            field2025++;
            return class227.method1499((byte) 127, arg2, arg1, arg0) ? class268.method1815(-125) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLhi;II)V")
    private final void method847(byte arg0, class264 arg1, int arg2, int arg3) {
        field2021++;
        if (arg0 != 58) {
            return;
        }
        if (arg3 == 1) {
            this.field2019 = arg1.method1732(-69);
            this.method848(this.field2019, arg0 + 19022);
        } else if (arg3 == 2) {
            this.field2022 = arg1.method1777(-117);
            if (this.field2022 == 65535) {
                this.field2022 = -1;
                return;
            }
        } else if (arg3 == 3) {
            arg1.method1777(-89);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
    private final void method848(int arg0, int arg1) {
        field2026++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var7) {
            var9 = var7;
        }
        if (var5 < var9) {
            var9 = var5;
        }
        if (arg1 != 19080) {
            return;
        }
        double var11 = var3;
        double var13 = 0.0D;
        if (var7 > var3) {
            var11 = var7;
        }
        if (var5 > var11) {
            var11 = var5;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        if (var17 > 0.5D) {
            this.field2017 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2017 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2017 < 1) {
            this.field2017 = 1;
        }
        this.field2028 = (int) (var15 * 256.0D);
        this.field2030 = (int) (var17 * 256.0D);
        if (this.field2028 < 0) {
            this.field2028 = 0;
        } else if (this.field2028 > 255) {
            this.field2028 = 255;
        }
        double var19 = var13 / 6.0D;
        if (this.field2030 < 0) {
            this.field2030 = 0;
        } else if (this.field2030 > 255) {
            this.field2030 = 255;
        }
        this.field2033 = (int) ((double) this.field2017 * var19);
    }
}
