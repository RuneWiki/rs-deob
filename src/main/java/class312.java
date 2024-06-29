import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class312 extends class251 {

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
    private int field4690;

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "I")
    public static int field4695 = -1;

    @OriginalMember(owner = "client!cq", name = "E", descriptor = "Lbg;")
    public static class310 field4700 = new class310(78, 3);

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!cq", name = "B", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!cq", name = "C", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!cq", name = "F", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!cq", name = "G", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "[Lua;")
    public class453[] field4693;

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "[[B")
    private byte[][] field4696;

    @OriginalMember(owner = "client!cq", name = "D", descriptor = "[[I")
    public static int[][] field4699;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZI)Z")
    public final boolean method1863(boolean arg0, int arg1) {
        if (arg0) {
            this.field4696 = null;
        }
        field4692++;
        return this.field4693[arg1].field6966;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    public static final void method1864(byte arg0) {
        field4691++;
        for (int var1 = 0; var1 < class451.field6951; var1++) {
            int var2 = class158.field2489[var1];
            class249 var3 = class195.field3085[var2];
            int var4 = class491.field7457.method257((byte) 68);
            if ((var4 & 0x80) != 0) {
                var4 += class491.field7457.method257((byte) 80) << 8;
            }
            if ((var4 & 0x2000) != 0) {
                var3.field2182 = class491.field7457.method223((byte) -126);
                var3.field2200 = class491.field7457.method245(-88);
                var3.field2224 = class491.field7457.method223((byte) -126);
                var3.field2221 = class491.field7457.method245(-118);
                var3.field2144 = class491.field7457.method247((byte) 0) + class369.field5424;
                var3.field2160 = class491.field7457.method254((byte) -110) + class369.field5424;
                var3.field2181 = class491.field7457.method277(true);
                var3.field2224 += var3.field2232[0];
                var3.field2182 += var3.field2232[0];
                var3.field2200 += var3.field2239[0];
                var3.field2230 = 0;
                var3.field2231 = 1;
                var3.field2221 += var3.field2239[0];
            }
            if ((var4 & 0x20) != 0) {
                int var5 = class491.field7457.method236(true);
                int var6 = class491.field7457.method232((byte) 115);
                var3.method890((byte) -62, var6, class369.field5424, var5);
                var3.field2217 = class369.field5424 + 300;
                var3.field2175 = class491.field7457.method277(true);
            }
            if ((var4 & 0x8) != 0) {
                int var7 = class491.field7457.method236(true);
                int var8 = class491.field7457.method257((byte) 44);
                var3.method890((byte) 96, var8, class369.field5424, var7);
            }
            if ((var4 & 0x10) != 0) {
                int var9 = class491.field7457.method243(122);
                int var10 = class491.field7457.method255((byte) 96);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var11 = class491.field7457.method277(true);
                var3.method903(var11, var10, false, var9, true);
            }
            if ((var4 & 0x1000) != 0) {
                int var12 = class491.field7457.method272(arg0 - 168);
                int var13 = class491.field7457.method275((byte) -128);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var14 = class491.field7457.method257((byte) 60);
                var3.method903(var14, var13, true, var12, true);
            }
            if ((var4 & 0x40) != 0) {
                var3.field2203 = class491.field7457.method239(true);
                var3.field2184 = 100;
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field3819.method1474((byte) 108)) {
                    class164.method1041(false, var3);
                }
                var3.method1507((byte) -86, class433.field6358.method2688(class491.field7457.method272(127), -8333));
                var3.method893(arg0 ^ 0x58, var3.field3819.field3707);
                var3.field2136 = var3.field3819.field3720 << 3;
                if (var3.field3819.method1474((byte) 30)) {
                    class72.method538(null, var3.field2232[0], var3, 0, var3.field3217, var3.field2239[0], true, null);
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field2138 = class491.field7457.method262(-2);
                var3.field2220 = class491.field7457.method223((byte) -78);
                var3.field2219 = class491.field7457.method250(true);
                var3.field2214 = (byte) class491.field7457.method277(true);
                var3.field2198 = class369.field5424 + class491.field7457.method247((byte) 0);
                var3.field2213 = class369.field5424 + class491.field7457.method243(arg0 - 176);
            }
            if ((var4 & 0x800) != 0) {
                int var15 = class491.field7457.method243(118);
                var3.field2140 = class491.field7457.method232((byte) 104);
                var3.field2183 = class491.field7457.method256(true);
                var3.field2209 = (var15 & 0x8000) != 0;
                var3.field2171 = var15 & 0x7FFF;
                var3.field2147 = class369.field5424 + var3.field2171 + var3.field2140;
            }
            if ((var4 & 0x2) != 0) {
                int var16 = class491.field7457.method254((byte) -50);
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var17 = class491.field7457.method257((byte) 46);
                class345.method2113(var16, 0, var3, var17);
            }
            if ((var4 & 0x400) != 0) {
                var3.field3815 = class491.field7457.method243(-124);
                var3.field3816 = class491.field7457.method243(arg0 + 36);
            }
            if ((var4 & 0x1) != 0) {
                var3.field2148 = class491.field7457.method247((byte) 0);
                if (var3.field2148 == 65535) {
                    var3.field2148 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                int var18 = class491.field7457.method256(true);
                int[] var19 = new int[var18];
                int[] var20 = new int[var18];
                int[] var21 = new int[var18];
                for (int var22 = 0; var22 < var18; var22++) {
                    int var23 = class491.field7457.method247((byte) 0);
                    if (var23 == 65535) {
                        var23 = -1;
                    }
                    var19[var22] = var23;
                    var20[var22] = class491.field7457.method256(true);
                    var21[var22] = class491.field7457.method247((byte) 0);
                }
                class347.method2118(var20, -25354, var21, var3, var19);
            }
        }
        if (arg0 != 88) {
            field4697 = 83;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Z")
    public final boolean method1865(int arg0, int arg1) {
        field4701++;
        if (arg0 > -20) {
            this.method1867(113, 111);
        }
        return this.field4693[arg1].field6960;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(I)V")
    public class312(int arg0) {
        this.field4690 = arg0;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)V")
    public static final void method1866(int arg0, int arg1) {
        if (arg1 > -26) {
            field4700 = null;
        }
        field4698++;
        class218.field3357 = arg0;
        class57.field973.method1761(-108);
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(II)Z")
    public final boolean method1867(int arg0, int arg1) {
        field4694++;
        int var3 = -102 / ((arg1 - 44) / 44);
        return this.field4693[arg0].field6970;
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(B)Z")
    public final boolean method1868(byte arg0) {
        field4689++;
        if (this.field4693 != null) {
            return true;
        }
        if (this.field4696 == null) {
            if (!class58.field1002.method2737(1, this.field4690)) {
                return false;
            }
            int[] var2 = class58.field1002.method2730(0, this.field4690);
            this.field4696 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field4696[var3] = class58.field1002.method2715(var2[var3], this.field4690, false);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field4696.length; var5++) {
            byte[] var15 = this.field4696[var5];
            int var16 = var15[1] & 0xFF | (var15[0] & 0xFF) << 8;
            var4 &= class23.field284.method2729(var16, -9055);
        }
        if (!var4) {
            return false;
        }
        class4 var6 = new class4();
        int var7 = class58.field1002.method2726((byte) 113, this.field4690);
        this.field4693 = new class453[var7];
        int[] var8 = class58.field1002.method2730(0, this.field4690);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var11 = this.field4696[var9];
            int var12 = var11[1] & 0xFF | (var11[0] & 0xFF) << 8;
            class424 var13 = null;
            for (class424 var14 = (class424) var6.method8((byte) -98); var14 != null; var14 = (class424) var6.method17((byte) 116)) {
                if (var14.field6083 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class424(var12, class23.field284.method2734(var12, (byte) 78));
                var6.method4(1, var13);
            }
            this.field4693[var8[var9]] = new class453(var11, var13);
        }
        this.field4696 = null;
        int var10 = 64 / ((arg0 - 14) / 57);
        return true;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(Z)V")
    public static void method1869(boolean arg0) {
        if (arg0) {
            field4700 = null;
            field4699 = null;
        }
    }
}
