import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class296 extends class107 {

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    private int field4821 = 3216;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    private int field4826 = 3216;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    private int field4832 = 4096;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "[I")
    private int[] field4831 = new int[3];

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public static int field4825 = 500;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public static int field4834 = 0;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "Z")
    public static boolean field4835 = true;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "Li;")
    public static class58 field4830 = new class58(16);

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field4842 = "shake:";

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "Lw;")
    public static class152 field4829;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "[[[Lnb;")
    public static class223[][][] field4827;

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class296() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILfj;)Lnf;")
    public static final class166 method2028(int arg0, int arg1, class274 arg2) {
        ++field4837;
        class166 var3 = new class166(arg1, arg2.method1855(87), arg2.method1855(98), arg2.method1833((byte) -104), arg2.method1833((byte) -104), arg2.method1849(255) == 1, arg2.method1849(arg0));
        int var4 = arg2.method1849(arg0);
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            var3.field2743.method1554(arg0 + 5002, new class76(arg2.method1849(arg0), arg2.method1849(255), arg2.method1837(252), arg2.method1837(252), arg2.method1837(252), arg2.method1837(arg0 + -3), arg2.method1837(252), arg2.method1837(252), arg2.method1837(arg0 ^ 3), arg2.method1837(252)));
        }
        var3.method1178((byte) -56);
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        ++field4822;
        this.method2030(-26343);
        if (arg0 != 35) {
            this.method195(93, (class274) null, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field4836;
        int var3 = -89 / ((-34 - arg0) / 49);
        int[] var4 = super.field1661.method894(-118, arg1);
        if (super.field1661.field2115) {
            int var5 = class211.field3363 * this.field4832 >> 12;
            int[] var6 = this.method756(0, class107.field1677 & arg1 + -1, -29053);
            int[] var7 = this.method756(0, arg1, -29053);
            int[] var8 = this.method756(0, class107.field1677 & arg1 + 1, -29053);
            for (int var9 = 0; class24.field443 > var9; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                int var11 = var10 >> 4;
                int var12 = (var7[var9 + -1 & class128.field2053] + -var7[var9 + 1 & class128.field2053]) * var5 >> 12;
                int var13 = var12 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < -256) {
                    var13 = 255;
                }
                int var14 = class121.field1914[var13 - -((var11 + 1) * var11 >> 1)] & 255;
                int var15 = var14 * 4096 >> 8;
                int var16 = var10 * var14 >> 8;
                int var17 = this.field4831[1] * var16 >> 12;
                int var18 = var12 * var14 >> 8;
                int var19 = this.field4831[0] * var18 >> 12;
                int var20 = this.field4831[2] * var15 >> 12;
                var4[var9] = var19 + var20 - -var17;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
    public static final void method2029(int arg0) {
        ++field4833;
        class111.method776(class218.field3430, (byte) 25);
        ++class269.field4347;
        if (class254.field4202 && class113.field1732) {
            int var1 = class287.field4640;
            int var2 = class55.field797;
            int var3 = var1 - class100.field1573;
            int var4 = var2 - class64.field1035;
            if (arg0 >= -99) {
                method2028(-81, -112, (class274) null);
            }
            int var5 = class218.field3430.field4001;
            if (~var3 > ~class129.field2061) {
                var3 = class129.field2061;
            }
            if (class218.field3430.field4016 + var3 > class129.field2061 + class263.field4304.field4016) {
                var3 = class129.field2061 + class263.field4304.field4016 + -class218.field3430.field4016;
            }
            int var6 = -class129.field2061 + var3 + class263.field4304.field3944;
            if (~class15.field298 < ~var4) {
                var4 = class15.field298;
            }
            if (class15.field298 - -class263.field4304.field4057 < class218.field3430.field4057 + var4) {
                var4 = class15.field298 - -class263.field4304.field4057 + -class218.field3430.field4057;
            }
            int var7 = -class140.field2261 + var4;
            int var8 = -class45.field672 + var3;
            if (~class218.field3430.field3945 > ~class269.field4347 && (~var8 < ~var5 || var8 < -var5 || var5 < var7 || var7 < -var5)) {
                class300.field4918 = true;
            }
            int var9 = var4 - (-class263.field4304.field3953 + class15.field298);
            if (class218.field3430.field3908 != null && class300.field4918) {
                class78 var10 = new class78();
                var10.field1251 = class218.field3430;
                var10.field1252 = var9;
                var10.field1263 = var6;
                var10.field1265 = class218.field3430.field3908;
                class139.method959((byte) 109, var10);
            }
            if (class90.field1400 == 0) {
                if (class300.field4918) {
                    if (class218.field3430.field3942 != null) {
                        class78 var11 = new class78();
                        var11.field1263 = var6;
                        var11.field1251 = class218.field3430;
                        var11.field1252 = var9;
                        var11.field1264 = class124.field1973;
                        var11.field1265 = class218.field3430.field3942;
                        class139.method959((byte) 100, var11);
                    }
                    if (class124.field1973 != null && client.method1124(class218.field3430) != null) {
                        ++class164.field2717;
                        class311.field5027.method2081(false, 217);
                        class311.field5027.method1828(class124.field1973.field3968, 0);
                        class311.field5027.method1824(class124.field1973.field4019, 28357);
                        class311.field5027.method1869(class218.field3430.field3968, false);
                        class311.field5027.method1844(-1, class218.field3430.field4019);
                    }
                } else if ((class298.field4867 == 1 || class206.method1424((byte) 74, class291.field4776 + -1)) && class291.field4776 > 2) {
                    class118.method809(true);
                } else if (class291.field4776 > 0) {
                    class110.method770(false);
                }
                class218.field3430 = null;
            }
        } else {
            if (class269.field4347 > 1) {
                class218.field3430 = null;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V")
    private final void method2030(int arg0) {
        ++field4823;
        double var2 = Math.cos((double) ((float) this.field4826 / 4096.0F));
        this.field4831[0] = (int) (Math.sin((double) ((float) this.field4821 / 4096.0F)) * var2 * 4096.0D);
        this.field4831[1] = (int) (Math.cos((double) ((float) this.field4821 / 4096.0F)) * var2 * 4096.0D);
        this.field4831[2] = (int) (4096.0D * Math.sin((double) ((float) this.field4826 / 4096.0F)));
        int var4 = this.field4831[0] * this.field4831[0] >> 12;
        if (arg0 != -26343) {
            this.field4832 = -45;
        }
        int var5 = this.field4831[2] * this.field4831[2] >> 12;
        int var6 = this.field4831[1] * this.field4831[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field4831[2] = (this.field4831[2] << 12) / var7;
            this.field4831[0] = (this.field4831[0] << 12) / var7;
            this.field4831[1] = (this.field4831[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILrg;IIIII)V")
    public static final void method2031(int arg0, int arg1, class248 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class178.field2952) {
            class261.field4261 = 32;
        } else {
            class261.field4261 = 0;
        }
        ++field4828;
        class178.field2952 = false;
        if (arg4 != -256) {
            method2028(-32, 111, (class274) null);
        }
        if (~class90.field1400 != -1) {
            if (~arg5 <= ~arg6 && arg5 < arg6 + 16 && arg7 <= arg3 && ~(arg7 + 16) < ~arg3) {
                arg2.field3953 -= 4;
                class111.method776(arg2, (byte) 25);
            } else if (arg5 >= arg6 && arg6 + 16 > arg5 && arg7 + -16 - -arg1 <= arg3 && ~arg3 > ~(arg1 + arg7)) {
                arg2.field3953 += 4;
                class111.method776(arg2, (byte) 25);
            } else if (arg5 >= -class261.field4261 + arg6 && arg5 < 16 - -class261.field4261 + arg6 && arg3 >= arg7 + 16 && ~(arg7 - (-arg1 - -16)) < ~arg3) {
                int var8 = (arg1 + -32) * arg1 / arg0;
                if (~var8 > -9) {
                    var8 = 8;
                }
                int var9 = -arg7 + arg3 - 16 + -(var8 / 2);
                int var10 = -var8 + -32 + arg1;
                arg2.field3953 = (arg0 - arg1) * var9 / var10;
                class111.method776(arg2, (byte) 25);
                class178.field2952 = true;
            }
        }
        if (class17.field309 != 0) {
            int var11 = arg2.field4016;
            if (arg5 >= -var11 + arg6 && arg7 <= arg3 && arg6 + 16 > arg5 && arg3 <= arg1 + arg7) {
                arg2.field3953 += class17.field309 * 45;
                class111.method776(arg2, (byte) 25);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(B)V")
    public static void method2032(byte arg0) {
        field4830 = null;
        field4827 = null;
        field4842 = null;
        if (arg0 == -27) {
            field4829 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lvk;I)V")
    public static final void method2033(class37 arg0, int arg1) {
        if (arg0.field581 != null) {
            arg0.field581.field3294 = 0;
        }
        arg0.field579 = false;
        ++field4843;
        for (class37 var2 = arg0.method266(); var2 != null; var2 = arg0.method269()) {
            method2033(var2, arg1);
        }
        if (arg1 != 0) {
            field4829 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(B)V")
    public static final void method2034(byte arg0) {
        ++field4839;
        class242.field3801.method1876((byte) 127);
        int var1 = 7 % ((-75 - arg0) / 49);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field4838;
        if (arg2 == 28) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        this.field4826 = arg1.method1837(252);
                    }
                } else {
                    this.field4821 = arg1.method1837(arg2 + 224);
                }
            } else {
                this.field4832 = arg1.method1837(252);
            }
        }
    }
}
