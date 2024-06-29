import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class292 extends class297 {

    @OriginalMember(owner = "client!ba", name = "Mb", descriptor = "I")
    public int field4845 = 0;

    @OriginalMember(owner = "client!ba", name = "Vb", descriptor = "I")
    public int field4854 = -1;

    @OriginalMember(owner = "client!ba", name = "Rb", descriptor = "I")
    public int field4850 = 0;

    @OriginalMember(owner = "client!ba", name = "Zb", descriptor = "I")
    public int field4858 = 0;

    @OriginalMember(owner = "client!ba", name = "dc", descriptor = "I")
    public int field4862 = 0;

    @OriginalMember(owner = "client!ba", name = "bc", descriptor = "I")
    public int field4860 = -1;

    @OriginalMember(owner = "client!ba", name = "Sb", descriptor = "I")
    public int field4851 = -1;

    @OriginalMember(owner = "client!ba", name = "gc", descriptor = "I")
    public int field4865 = -1;

    @OriginalMember(owner = "client!ba", name = "Gb", descriptor = "Z")
    public boolean field4839 = false;

    @OriginalMember(owner = "client!ba", name = "Ob", descriptor = "I")
    public int field4847 = -1;

    @OriginalMember(owner = "client!ba", name = "lc", descriptor = "S")
    private short field4870 = 0;

    @OriginalMember(owner = "client!ba", name = "mc", descriptor = "I")
    public int field4871 = 0;

    @OriginalMember(owner = "client!ba", name = "ec", descriptor = "S")
    private short field4863 = 0;

    @OriginalMember(owner = "client!ba", name = "oc", descriptor = "I")
    public int field4873 = 0;

    @OriginalMember(owner = "client!ba", name = "Wb", descriptor = "Lml;")
    public static class134 field4855 = null;

    @OriginalMember(owner = "client!ba", name = "Lb", descriptor = "Lck;")
    public static class119 field4844 = class298.method1987((byte) 102, ")1j");

    @OriginalMember(owner = "client!ba", name = "Yb", descriptor = "[Lch;")
    public static class229[] field4857 = new class229[4];

    @OriginalMember(owner = "client!ba", name = "nc", descriptor = "Lck;")
    public static class119 field4872 = class298.method1987((byte) 108, "<col=ffffff>");

    @OriginalMember(owner = "client!ba", name = "Fb", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!ba", name = "Hb", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ba", name = "Ib", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ba", name = "Jb", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ba", name = "Kb", descriptor = "I")
    private int field4843;

    @OriginalMember(owner = "client!ba", name = "Nb", descriptor = "I")
    private int field4846;

    @OriginalMember(owner = "client!ba", name = "Tb", descriptor = "I")
    public int field4852;

    @OriginalMember(owner = "client!ba", name = "Ub", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!ba", name = "Xb", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!ba", name = "ac", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!ba", name = "fc", descriptor = "I")
    public int field4864;

    @OriginalMember(owner = "client!ba", name = "hc", descriptor = "I")
    public int field4866;

    @OriginalMember(owner = "client!ba", name = "ic", descriptor = "I")
    private int field4867;

    @OriginalMember(owner = "client!ba", name = "jc", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ba", name = "kc", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!ba", name = "cc", descriptor = "Lck;")
    public class119 field4861;

    @OriginalMember(owner = "client!ba", name = "Pb", descriptor = "Lnj;")
    public class260 field4848;

    @OriginalMember(owner = "client!ba", name = "Qb", descriptor = "Lec;")
    public class28 field4849;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V", line = 4)
    public static void method1943(boolean arg0) {
        field4855 = null;
        if (arg0) {
            field4838 = 78;
        }
        field4844 = null;
        field4872 = null;
        field4857 = null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Z", line = 66)
    public final boolean method1038(byte arg0) {
        field4840++;
        if (arg0 > -91) {
            return false;
        } else {
            return this.field4848 != null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIIJ)V", line = 86)
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4842++;
        if (this.field4848 == null) {
            return;
        }
        class56 var11 = this.field4993 != -1 && this.field4941 == 0 ? class276.method1818(-20682, this.field4993) : null;
        class56 var12 = this.field4948 == -1 || this.field4839 || this.field4976 == this.field4948 && var11 != null ? null : class276.method1818(-20682, this.field4948);
        class28 var13 = this.field4848.method1663(var11, var12, this.field4951, this.field4959, 3);
        if (var13 == null) {
            return;
        }
        this.field4971 = var13.method214();
        if (class224.field3598) {
            class28 var14 = class244.method1588(0, var13, this.field4981, (byte) 122, 160, var12 == null ? this.field4959 : this.field4951, this.field5001, 240, this.field4991, var12 == null ? var11 : var12, arg0, this.field4949, 1, 0);
            float var15 = class264.method1737();
            float var16 = class264.method1724();
            class264.method1725();
            class264.method1734(var15, var16 - 150.0F);
            var14.method202(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            class264.method1739();
            class264.method1734(var15, var16);
        }
        if (class124.field1917 == this) {
            for (int var17 = field4857.length - 1; var17 >= 0; var17--) {
                class229 var18 = field4857[var17];
                if (var18 != null && var18.field3709 != -1) {
                    if (var18.field3708 == 1 && var18.field3718 >= 0 && class70.field1103.length > var18.field3718) {
                        class163 var19 = class70.field1103[var18.field3718];
                        if (var19 != null) {
                            int var20 = var19.field4949 / 32 - (class124.field1917.field4949 / 32);
                            int var21 = var19.field4991 / 32 - class124.field1917.field4991 / 32;
                            this.method1946(arg4, var18.field3709, (byte) -121, arg7, arg2, arg6, var13, var21, arg5, var20, arg1, arg3, arg0);
                        }
                    }
                    if (var18.field3708 == 2) {
                        int var22 = (var18.field3713 - class30.field421) * 4 + 2 - (class124.field1917.field4949 / 32);
                        int var23 = (var18.field3703 - class189.field2995) * 4 + 2 - class124.field1917.field4991 / 32;
                        this.method1946(arg4, var18.field3709, (byte) -121, arg7, arg2, arg6, var13, var23, arg5, var22, arg1, arg3, arg0);
                    }
                    if (var18.field3708 == 10 && var18.field3718 >= 0 && var18.field3718 < class23.field346.length) {
                        class292 var24 = class23.field346[var18.field3718];
                        if (var24 != null) {
                            int var25 = var24.field4949 / 32 - (class124.field1917.field4949 / 32);
                            int var26 = var24.field4991 / 32 - (class124.field1917.field4991 / 32);
                            this.method1946(arg4, var18.field3709, (byte) -121, arg7, arg2, arg6, var13, var26, arg5, var25, arg1, arg3, arg0);
                        }
                    }
                }
            }
        }
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        if (this.field4870 != 0 && this.field4863 != 0) {
            short var30 = this.field4870;
            int var31 = class284.field4699[arg0];
            int var32 = class284.field4698[arg0];
            short var33 = this.field4863;
            int var34 = -var30 / 2;
            int var35 = -var33 / 2;
            int var36 = var31 * var34 + var32 * var35 >> 16;
            int var37 = var31 * var35 - (var32 * var34) >> 16;
            int var38 = var30 / 2;
            int var39 = class207.method1304(class10.field189, (byte) 82, this.field4949 + var36, this.field4991 - -var37);
            int var40 = -var33 / 2;
            int var41 = var31 * var38 + var32 * var40 >> 16;
            int var42 = var31 * var40 - (var32 * var38) >> 16;
            int var43 = class207.method1304(class10.field189, (byte) 125, this.field4949 + var41, this.field4991 - -var42);
            int var44 = -var30 / 2;
            int var45 = var33 / 2;
            int var46 = var32 * var45 + (var31 * var44) >> 16;
            int var47 = var30 / 2;
            int var48 = var33 / 2;
            int var49 = var31 * var45 - (var32 * var44) >> 16;
            int var50 = var31 * var47 + var32 * var48 >> 16;
            int var51 = var31 * var48 - (var32 * var47) >> 16;
            int var52 = var43 <= var39 ? var43 : var39;
            int var53 = class207.method1304(class10.field189, (byte) 107, this.field4949 + var46, this.field4991 - -var49);
            int var54 = class207.method1304(class10.field189, (byte) 108, this.field4949 + var50, this.field4991 + var51);
            int var55 = var53 < var54 ? var53 : var54;
            int var56 = var39 >= var53 ? var53 : var39;
            int var57 = var39 + var54;
            var29 = (int) (Math.atan2((double) (var52 - var55), (double) var33) * 325.95D) & 0x7FF;
            int var58 = var54 > var43 ? var43 : var54;
            if (var57 > (var43 + var53)) {
                var57 = var43 + var53;
            }
            if (var29 != 0) {
                var13.method221(var29);
            }
            var28 = (int) (Math.atan2((double) (var56 - var58), (double) var30) * 325.95D) & 0x7FF;
            if (var28 != 0) {
                var13.method203(var28);
            }
            var27 = (var57 >> 1) - this.field4981;
            if (var27 != 0) {
                var13.method223(0, var27, 0);
            }
        }
        class28 var59 = null;
        if (!this.field4839 && this.field4962 != -1 && this.field4965 != -1) {
            class240 var60 = class234.method1511(98, this.field4962);
            var59 = var60.method1564(this.field4965, (byte) -74);
            if (var59 != null) {
                var59.method223(0, -this.field4995, 0);
                if (var60.field3839) {
                    if (var29 != 0) {
                        var59.method221(var29);
                    }
                    if (var28 != 0) {
                        var59.method203(var28);
                    }
                    if (var27 != 0) {
                        var59.method223(0, var27, 0);
                    }
                }
            }
        }
        class28 var61 = null;
        if (!this.field4839 && this.field4849 != null) {
            if (class1.field15 >= this.field4845) {
                this.field4849 = null;
            }
            if (class1.field15 >= this.field4862 && this.field4845 > class1.field15) {
                var61 = this.field4849;
                var61.method223(this.field4867 - this.field4949, -this.field4981 + this.field4846, this.field4843 - this.field4991);
                if (this.field4946 == 512) {
                    var61.method220();
                } else if (this.field4946 == 1024) {
                    var61.method207();
                } else if (this.field4946 == 1536) {
                    var61.method216();
                }
            }
        }
        var13.field412 = true;
        var13.method202(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var59 != null) {
            var59.field412 = true;
            var59.method202(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
        if (var61 == null) {
            return;
        }
        if (this.field4946 == 512) {
            var61.method216();
        } else if (this.field4946 == 1024) {
            var61.method207();
        } else if (this.field4946 == 1536) {
            var61.method220();
        }
        var61.method223(this.field4949 - this.field4867, this.field4981 - this.field4846, this.field4991 - this.field4843);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBI)V", line = 359)
    public static final void method1944(int arg0, byte arg1, int arg2) {
        field4856++;
        class106.field1641[arg2] = arg0;
        class164 var3 = (class164) class23.field356.method1329((byte) 90, (long) arg2);
        if (var3 == null) {
            class164 var4 = new class164(class110.method707((byte) 120) + 500L);
            class23.field356.method1326((long) arg2, (byte) -101, var4);
        } else {
            var3.field2581 = class110.method707((byte) 90) + 500L;
        }
        int var5 = -91 / ((arg1 - 65) / 40);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()I", line = 380)
    public final int method214() {
        field4853++;
        return this.field4971;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILfj;)V", line = 425)
    public final void method1945(int arg0, class3 arg1) {
        field4859++;
        arg1.field44 = 0;
        int var3 = arg1.method64((byte) -109);
        if ((var3 & 0x2) == 2) {
            this.field4870 = (short) (arg1.method64((byte) 15) << 2);
            this.field4863 = (short) (arg1.method64((byte) -106) << 2);
        } else {
            this.field4863 = 0;
            this.field4870 = 0;
        }
        this.field4956 = (var3 >> 3) + 1;
        int var4 = var3 & 0x1;
        this.field4847 = arg1.method24(false);
        this.field4854 = arg1.method24(false);
        boolean var5 = (var3 & 0x4) != 0;
        this.field4850 = 0;
        int var6 = -1;
        int[] var7 = new int[12];
        for (int var8 = 0; var8 < 12; var8++) {
            int var9 = arg1.method64((byte) -93);
            if (var9 == 0) {
                var7[var8] = 0;
            } else {
                int var10 = arg1.method64((byte) 91);
                int var11 = (var9 << 8) + var10;
                if (var8 == 0 && var11 == 65535) {
                    var6 = arg1.method63((byte) 1);
                    break;
                }
                if (var11 < 32768) {
                    var7[var8] = class156.method998(Integer.MIN_VALUE, var11 - 256);
                } else {
                    int var12 = class5.field128[var11 - 32768];
                    var7[var8] = class156.method998(var12, 1073741824);
                    int var13 = class205.method1296((byte) -102, var12).field4219;
                    if (var13 != 0) {
                        this.field4850 = var13;
                    }
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; var15++) {
            int var16 = arg1.method64((byte) -124);
            if (var16 < 0 || var16 >= class42.field634[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field4976 = arg1.method63((byte) 1);
        if (this.field4976 == 65535) {
            this.field4976 = -1;
        }
        this.field4999 = arg1.method63((byte) 1);
        if (this.field4999 == 65535) {
            this.field4999 = -1;
        }
        this.field4943 = this.field4999;
        this.field4982 = arg1.method63((byte) 1);
        if (this.field4982 == 65535) {
            this.field4982 = -1;
        }
        this.field4964 = arg1.method63((byte) 1);
        if (this.field4964 == 65535) {
            this.field4964 = -1;
        }
        this.field4953 = arg1.method63((byte) 1);
        if (this.field4953 == 65535) {
            this.field4953 = -1;
        }
        this.field4945 = arg1.method63((byte) 1);
        if (this.field4945 == 65535) {
            this.field4945 = -1;
        }
        this.field4958 = arg1.method63((byte) 1);
        if (this.field4958 == 65535) {
            this.field4958 = -1;
        }
        this.field4861 = class147.method963((byte) 0, arg1.method43(-126)).method785(114);
        this.field4858 = arg1.method64((byte) -116);
        if (var5) {
            this.field4873 = arg1.method63((byte) 1);
        } else {
            this.field4873 = 0;
        }
        int var17 = this.field4871;
        this.field4871 = arg1.method64((byte) 25);
        if (this.field4871 == 0) {
            class129.method858(87, this);
        } else {
            int var18 = this.field4860;
            int var19 = this.field4851;
            int var20 = this.field4865;
            this.field4865 = arg1.method63((byte) 1);
            this.field4860 = arg1.method63((byte) 1);
            this.field4851 = arg1.method63((byte) 1);
            if (this.field4871 != var17 || this.field4865 != var20 || this.field4860 != var18 || this.field4851 != var19) {
                class27.method197(this, false);
            }
        }
        if (this.field4848 == null) {
            this.field4848 = new class260();
        }
        this.field4848.method1668(var4 == 1, var7, var14, arg0 ^ 0x7CA8, var6);
        if (arg0 != 31908) {
            this.field4867 = 73;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIBIIILec;IIIIII)V", line = 595)
    private final void method1946(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class28 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int var14 = arg7 * arg7 + arg9 * arg9;
        field4841++;
        if (var14 < 16 || var14 > 360000) {
            return;
        }
        int var15 = (int) (Math.atan2((double) arg9, (double) arg7) * 325.949D) & 0x7FF;
        class28 var16 = class246.method1604(this.field4949, 11372, var15, this.field4981, arg6, arg1, this.field4991);
        if (arg2 != -121) {
            this.method1038((byte) 103);
        }
        if (var16 == null) {
            return;
        }
        float var17 = class264.method1737();
        float var18 = class264.method1724();
        class264.method1725();
        class264.method1734(var17, var18 - 150.0F);
        var16.method202(0, arg10, arg4, arg11, arg0, arg8, arg5, arg3, -1L);
        class264.method1739();
        class264.method1734(var17, var18);
    }
}
