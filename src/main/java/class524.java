import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class524 {

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "F")
    public float field7361 = 1.0F;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "F")
    public float field7370 = 0.25F;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "F")
    public float field7375 = 1.0F;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public int field7363;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "F")
    public float field7371;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public int field7366;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public int field7372;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public int field7357;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public int field7369;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "F")
    public float field7360;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public int field7365;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "F")
    public float field7364;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lsv;")
    public class567 field7374;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lcba;")
    public static class471 field7367 = new class471(57, 6);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
    public static int[] field7358;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILpe;)Z")
    public final boolean method3018(int arg0, class524 arg1) {
        if (arg0 <= 111) {
            method3019(null, false);
        }
        field7355++;
        return this.field7372 == arg1.field7372 && this.field7360 == arg1.field7360 && this.field7364 == arg1.field7364 && this.field7371 == arg1.field7371 && this.field7370 == arg1.field7370 && this.field7375 == arg1.field7375 && this.field7361 == arg1.field7361 && this.field7365 == arg1.field7365 && this.field7363 == arg1.field7363 && this.field7374 == arg1.field7374;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method3019(byte[] arg0, boolean arg1) {
        field7356++;
        int var2 = arg0.length;
        if (arg1) {
            return null;
        } else {
            byte[] var3 = new byte[var2];
            class416.method2498(arg0, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static void method3020(boolean arg0) {
        if (arg0) {
            field7367 = null;
            field7358 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ldaa;I)V")
    public final void method3021(class11 arg0, int arg1) {
        field7359++;
        this.field7375 = (float) (arg0.method110((byte) 69) * 8) / 255.0F;
        this.field7370 = (float) (arg0.method110((byte) 100) * 8) / 255.0F;
        this.field7361 = (float) (arg0.method110((byte) 106) * 8) / 255.0F;
        if (arg1 != -50) {
            this.field7374 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBIIIFFLar;FFF)[B")
    public static final byte[] method3022(int arg0, byte arg1, int arg2, int arg3, int arg4, float arg5, float arg6, class585 arg7, float arg8, float arg9, float arg10) {
        field7373++;
        byte[] var11 = new byte[arg0 * arg2 * arg3];
        if (arg1 >= -86) {
            return null;
        } else {
            class184.method1150(arg10, arg4, -14941, arg5, 0, var11, arg7, arg9, arg6, arg0, arg3, arg8, arg2);
            return var11;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Z")
    public static final boolean method3023(int arg0, int arg1, int arg2) {
        field7368++;
        if (arg2 != 1) {
            field7358 = null;
        }
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7362++;
        int var8 = arg1 + arg2;
        int var9 = arg6 - arg1;
        for (int var10 = arg2; var10 < var8; var10++) {
            class266.method1742(26844, class182.field2580[var10], arg7, arg4, arg3);
        }
        if (arg5 < 45) {
            method3019(null, true);
        }
        int var11 = arg7 - arg1;
        for (int var12 = arg6; var12 > var9; var12--) {
            class266.method1742(26844, class182.field2580[var12], arg7, arg4, arg3);
        }
        int var13 = arg1 + arg3;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class182.field2580[var14];
            class266.method1742(26844, var15, var13, arg4, arg3);
            class266.method1742(26844, var15, var11, arg0, var13);
            class266.method1742(26844, var15, arg7, arg4, var11);
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class524() {
        this.field7363 = 0;
        this.field7371 = 1.2F;
        this.field7366 = -50;
        this.field7372 = class303.field4135;
        this.field7357 = -60;
        this.field7369 = -50;
        this.field7360 = 1.1523438F;
        this.field7365 = class45.field852;
        this.field7364 = 0.69921875F;
        this.field7374 = class1.field10;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Ldaa;)V")
    public class524(class11 arg0) {
        int var2 = arg0.method110((byte) 32);
        if (class491.field6875.method1502(class103.field1570, 1) && class494.field6919.method1313() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field7372 = class303.field4135;
            } else {
                this.field7372 = arg0.method119(-56);
            }
            if ((var2 & 0x2) == 0) {
                this.field7360 = 1.1523438F;
            } else {
                this.field7360 = (float) arg0.method93((byte) 105) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field7364 = 0.69921875F;
            } else {
                this.field7364 = (float) arg0.method93((byte) 72) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field7371 = 1.2F;
            } else {
                this.field7371 = (float) arg0.method93((byte) 78) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method119(-40);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method93((byte) 119);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method93((byte) 124);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method93((byte) 97);
            }
            this.field7371 = 1.2F;
            this.field7360 = 1.1523438F;
            this.field7364 = 0.69921875F;
            this.field7372 = class303.field4135;
        }
        if ((var2 & 0x10) == 0) {
            this.field7357 = -60;
            this.field7369 = -50;
            this.field7366 = -50;
        } else {
            this.field7366 = arg0.method111(-125);
            this.field7357 = arg0.method111(-126);
            this.field7369 = arg0.method111(-128);
        }
        if ((var2 & 0x20) == 0) {
            this.field7365 = class45.field852;
        } else {
            this.field7365 = arg0.method119(-72);
        }
        if ((var2 & 0x40) == 0) {
            this.field7363 = 0;
        } else {
            this.field7363 = arg0.method93((byte) 111);
        }
        if ((var2 & 0x80) == 0) {
            this.field7374 = class1.field10;
        } else {
            int var3 = arg0.method93((byte) 110);
            int var4 = arg0.method93((byte) 114);
            int var5 = arg0.method93((byte) 106);
            int var6 = arg0.method93((byte) 73);
            int var7 = arg0.method93((byte) 102);
            int var8 = arg0.method93((byte) 111);
            this.field7374 = class146.method973(var3, var8, var7, var6, 10556, var4, var5);
        }
    }
}
