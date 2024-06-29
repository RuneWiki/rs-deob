import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class287 {

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public int field58 = 0;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field53 = 20;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "Z")
    public static boolean field57 = false;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field56 = 0;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "Lmh;")
    public static class128 field61 = class22.method156(127, "_labels");

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "F")
    public static float field64;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "F")
    public static float field66;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public int field46;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public int field48;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "Lld;")
    public class115 field51;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lcf;")
    public class123 field42;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "Lfi;")
    public class251 field47;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "Lfi;")
    public class251 field52;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lcg;")
    public class38 field41;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "Z")
    public boolean field45;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "Z")
    public static boolean field71;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "[I")
    public int[] field62;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "[Lmh;")
    public static class128[] field43;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "[Ltd;")
    public static class230[] field60;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 6)
    public final void method16(int arg0) {
        field39++;
        int var2 = this.field46;
        if (this.field41 != null) {
            class38 var5 = this.field41.method258(114);
            if (var5 == null) {
                this.field48 = 0;
                this.field44 = 0;
                this.field70 = 0;
                this.field62 = null;
                this.field46 = -1;
            } else {
                this.field44 = var5.field788;
                this.field46 = var5.field774;
                this.field70 = var5.field756 * 128;
                this.field48 = var5.field779;
                this.field62 = var5.field781;
            }
        } else if (this.field51 != null) {
            int var3 = class32.method233(this.field51, -110);
            if (var2 != var3) {
                this.field46 = var3;
                class208 var4 = this.field51.field1934;
                if (var4.field3655 != null) {
                    var4 = var4.method1429((byte) -96);
                }
                if (var4 == null) {
                    this.field70 = 0;
                } else {
                    this.field70 = var4.field3675 * 128;
                }
            }
        } else if (this.field42 != null) {
            this.field46 = class7.method45(this.field42, -114);
            this.field70 = this.field42.field2068 * 128;
        }
        if (arg0 != 26972) {
            method18(true);
        }
        if (this.field46 != var2 && this.field52 != null) {
            class188.field3260.method393(this.field52);
            this.field52 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BZ)V", line = 82)
    public static final void method17(byte arg0, boolean arg1) {
        field69++;
        class17.field496 = arg1;
        class30.field662 = !class117.method702(true);
        if (arg0 != 59) {
            method20(118);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)Lfb;", line = 124)
    public static final class55 method18(boolean arg0) {
        int var1 = class178.field3128[0] * class125.field2106[0];
        field50++;
        int[] var2 = new int[var1];
        byte[] var3 = class157.field2690[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class205.field3614[class238.method1622(255, var3[var4])];
        }
        class55 var5;
        if (class247.field4247) {
            var5 = new class40(class72.field1327, class132.field2294, class151.field2607[0], class266.field4603[0], class125.field2106[0], class178.field3128[0], var2);
        } else {
            var5 = new class231(class72.field1327, class132.field2294, class151.field2607[0], class266.field4603[0], class125.field2106[0], class178.field3128[0], var2);
        }
        class15.method113(80);
        if (!arg0) {
            method18(false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V", line = 153)
    public static final void method19(int arg0, byte arg1) {
        field68++;
        if (arg1 == 69) {
            class229 var2 = class241.method1638(2, 125, arg0);
            var2.method1566((byte) -3);
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 175)
    public static void method20(int arg0) {
        if (arg0 != 0) {
            method22(false);
        }
        field43 = null;
        field60 = null;
        field61 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIILbg;ZII)V", line = 188)
    public static final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, class194 arg5, boolean arg6, int arg7, int arg8) {
        field54++;
        if (arg3 != -105) {
            field71 = true;
        }
        if (arg8 < 0 || arg8 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var11 = arg5.method1325(arg3 + 7732);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg5.method1325(7627);
                    break;
                }
                if (var11 <= 49) {
                    arg5.method1325(7627);
                }
            }
            return;
        }
        if (!arg6) {
            class301.field5117[arg1][arg8][arg0] = 0;
        }
        while (true) {
            int var9 = arg5.method1325(arg3 ^ 0xFFFFE25C);
            if (var9 == 0) {
                if (arg6) {
                    class250.field4334[0][arg8][arg0] = class267.field4626[0][arg8][arg0];
                } else if (arg1 == 0) {
                    class250.field4334[0][arg8][arg0] = -class315.method2177((byte) 112, arg4 + arg8 + 932731, arg7 + 556238 - -arg0) * 8;
                } else {
                    class250.field4334[arg1][arg8][arg0] = class250.field4334[arg1 - 1][arg8][arg0] - 240;
                }
                break;
            }
            if (var9 == 1) {
                int var10 = arg5.method1325(7627);
                if (arg6) {
                    class250.field4334[0][arg8][arg0] = class267.field4626[0][arg8][arg0] + (var10 * 8);
                } else {
                    if (var10 == 1) {
                        var10 = 0;
                    }
                    if (arg1 == 0) {
                        class250.field4334[0][arg8][arg0] = -var10 * 8;
                    } else {
                        class250.field4334[arg1][arg8][arg0] = class250.field4334[arg1 - 1][arg8][arg0] - (var10 * 8);
                    }
                }
                break;
            }
            if (var9 <= 49) {
                class157.field2694[arg1][arg8][arg0] = arg5.method1326((byte) 95);
                class121.field2048[arg1][arg8][arg0] = (byte) ((var9 - 2) / 4);
                class9.field205[arg1][arg8][arg0] = (byte) class238.method1622(3, arg2 + var9 - 2);
            } else if (var9 > 81) {
                class22.field553[arg1][arg8][arg0] = (byte) (var9 - 81);
            } else if (!arg6) {
                class301.field5117[arg1][arg8][arg0] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(Z)V", line = 302)
    public static final void method22(boolean arg0) {
        class79.field1432.method1832((byte) 33);
        if (arg0) {
            field53 = 65;
        }
        field49++;
        class163.field2798.method1832((byte) 49);
        class115.field1926.method1832((byte) 88);
        class275.field4765.method1832((byte) 68);
    }
}
