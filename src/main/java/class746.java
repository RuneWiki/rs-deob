import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class746 extends class91 implements class722 {

    @OriginalMember(owner = "client!oq", name = "L", descriptor = "Z")
    private boolean field10248 = false;

    @OriginalMember(owner = "client!oq", name = "cb", descriptor = "Ldj;")
    public class708 field10265;

    @OriginalMember(owner = "client!oq", name = "M", descriptor = "Z")
    private boolean field10249;

    @OriginalMember(owner = "client!oq", name = "U", descriptor = "[I")
    public static int[] field10257 = new int[3];

    @OriginalMember(owner = "client!oq", name = "R", descriptor = "I")
    public static int field10254 = 0;

    @OriginalMember(owner = "client!oq", name = "ab", descriptor = "Lkr;")
    public static class602 field10263 = new class602(91, 7);

    @OriginalMember(owner = "client!oq", name = "H", descriptor = "I")
    public static int field10244;

    @OriginalMember(owner = "client!oq", name = "I", descriptor = "I")
    public static int field10245;

    @OriginalMember(owner = "client!oq", name = "J", descriptor = "I")
    public static int field10246;

    @OriginalMember(owner = "client!oq", name = "K", descriptor = "I")
    public static int field10247;

    @OriginalMember(owner = "client!oq", name = "P", descriptor = "I")
    public static int field10252;

    @OriginalMember(owner = "client!oq", name = "Q", descriptor = "I")
    public static int field10253;

    @OriginalMember(owner = "client!oq", name = "S", descriptor = "I")
    public static int field10255;

    @OriginalMember(owner = "client!oq", name = "T", descriptor = "I")
    public static int field10256;

    @OriginalMember(owner = "client!oq", name = "V", descriptor = "I")
    public static int field10258;

    @OriginalMember(owner = "client!oq", name = "W", descriptor = "I")
    public static int field10259;

    @OriginalMember(owner = "client!oq", name = "X", descriptor = "I")
    public static int field10260;

    @OriginalMember(owner = "client!oq", name = "Y", descriptor = "I")
    public static int field10261;

    @OriginalMember(owner = "client!oq", name = "Z", descriptor = "I")
    public static int field10262;

    @OriginalMember(owner = "client!oq", name = "bb", descriptor = "I")
    public static int field10264;

    @OriginalMember(owner = "client!oq", name = "db", descriptor = "I")
    public static int field10266;

    @OriginalMember(owner = "client!oq", name = "eb", descriptor = "I")
    public static int field10267;

    @OriginalMember(owner = "client!oq", name = "fb", descriptor = "I")
    public static int field10268;

    @OriginalMember(owner = "client!oq", name = "gb", descriptor = "I")
    public static int field10269;

    @OriginalMember(owner = "client!oq", name = "hb", descriptor = "I")
    public static int field10270;

    @OriginalMember(owner = "client!oq", name = "ib", descriptor = "I")
    public static int field10271;

    @OriginalMember(owner = "client!oq", name = "jb", descriptor = "I")
    public static int field10272;

    @OriginalMember(owner = "client!oq", name = "kb", descriptor = "I")
    public static int field10273;

    @OriginalMember(owner = "client!oq", name = "N", descriptor = "Lln;")
    public static class476 field10250;

    @OriginalMember(owner = "client!oq", name = "O", descriptor = "Liha;")
    private class613 field10251;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "(I)Z", line = 4)
    public final boolean method783(int arg0) {
        ++field10246;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "(I)I", line = 17)
    public final int method790(int arg0) {
        if (arg0 != -11692) {
            return -64;
        } else {
            ++field10259;
            return this.field10265.method3983(-64);
        }
    }

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "(I)Z", line = 28)
    public final boolean method785(int arg0) {
        ++field10256;
        if (arg0 >= -117) {
            this.field10249 = true;
        }
        return this.field10248;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)I", line = 45)
    public final int method782(byte arg0) {
        int var2 = -92 / ((-5 - arg0) / 54);
        ++field10261;
        return this.field10265.field9863;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)I", line = 56)
    public final int method784(int arg0) {
        if (arg0 != -4532) {
            field10263 = null;
        }
        ++field10260;
        return this.field10265.field9879;
    }

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)Z", line = 70)
    public final boolean method781(int arg0) {
        if (arg0 >= -86) {
            field10250 = null;
        }
        ++field10268;
        return this.field10265.method3977((byte) -80);
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lha;Lts;IIIIIZIII)V", line = 262)
    public class746(class548 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class383.method2405(arg8, -116, arg9));
        this.field10265 = new class708(arg0, arg1, arg8, arg9, super.field4408, arg3, this, arg7, arg10);
        this.field10249 = ~arg1.field2948 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lha;I)Lua;", line = 87)
    public final class3 method660(class548 arg0, int arg1) {
        ++field10244;
        class284 var3 = this.field10265.method3988(true, false, -119, arg0, 2048);
        if (var3 == null) {
            return null;
        } else {
            class744 var4 = arg0.method1404();
            if (arg1 != -1) {
                field10263 = null;
            }
            var4.method905(super.field4410, super.field4413, super.field4418);
            class3 var5 = class682.method3841(1, this.field10249, 28389);
            int var6 = super.field4410 >> 9;
            int var7 = super.field4418 >> 9;
            this.field10265.method3980(var4, var7, var6, var3, var7, arg0, true, var6, -20837);
            if (!class301.field4261) {
                var3.method1686(var4, var5.field18[0], 0);
            } else {
                var3.method1682(var4, var5.field18[0], class3.field30, 0);
            }
            if (this.field10265.field9885 != null) {
                class100 var8 = this.field10265.field9885.method3895();
                if (class301.field4261) {
                    arg0.method1479(var8, class3.field30);
                } else {
                    arg0.method1413(var8);
                }
            }
            this.field10248 = var3.method1673() || this.field10265.field9885 != null;
            if (this.field10251 != null) {
                class507.method3047(super.field4410, super.field4418, -99, var3, super.field4413, this.field10251);
            } else {
                this.field10251 = class491.method2980(super.field4418, 117, super.field4413, var3, super.field4410);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lha;B)V", line = 138)
    public final void method792(class548 arg0, byte arg1) {
        if (arg1 >= -105) {
            field10250 = null;
        }
        ++field10272;
        this.field10265.method3985(-5923, arg0);
    }

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "(I)V", line = 150)
    public final void method641(int arg0) {
        if (arg0 > 91) {
            ++field10269;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V", line = 161)
    public final void method795(int arg0) {
        ++field10258;
        if (arg0 < 31) {
            field10257 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)I", line = 173)
    public final int method794(int arg0) {
        ++field10253;
        if (arg0 < 92) {
            this.field10249 = true;
        }
        return this.field10265.field9889;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLha;ZILuq;II)V", line = 189)
    public final void method648(byte arg0, class548 arg1, boolean arg2, int arg3, class318 arg4, int arg5, int arg6) {
        if (arg0 > -8) {
            field10263 = null;
        }
        ++field10264;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(Lha;B)Liha;", line = 201)
    public final class613 method653(class548 arg0, byte arg1) {
        if (arg1 != 13) {
            return null;
        } else {
            ++field10266;
            return this.field10251;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lkea;I)V", line = 214)
    public final void method4151(class77 arg0, int arg1) {
        int var3 = -51 / ((-61 - arg1) / 63);
        this.field10265.method3989(-31939, arg0);
        ++field10255;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILha;IB)Z", line = 230)
    public final boolean method644(int arg0, class548 arg1, int arg2, byte arg3) {
        ++field10247;
        class284 var5 = this.field10265.method3988(false, false, -127, arg1, 131072);
        if (var5 == null) {
            return false;
        } else {
            if (arg3 >= -58) {
                this.method785(-32);
            }
            class744 var6 = arg1.method1404();
            var6.method905(super.field4410, super.field4413, super.field4418);
            return class301.field4261 ? var5.method1653(arg0, arg2, var6, false, 0, class3.field30) : var5.method1669(arg0, arg2, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(B)I", line = 251)
    public final int method793(byte arg0) {
        if (arg0 != -86) {
            method4153((byte) 47);
        }
        ++field10267;
        return this.field10265.method3979(10);
    }

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "(I)V", line = 272)
    public static final void method4152(int arg0) {
        ++field10273;
        if (arg0 > 34) {
            for (class457 var1 = (class457) class303.field4285.method3618(-98); var1 != null; var1 = (class457) class303.field4285.method3619(0)) {
                if (var1.field6334) {
                    var1.method2793((byte) -88);
                }
            }
            for (class457 var2 = (class457) class649.field8701.method3618(84); var2 != null; var2 = (class457) class649.field8701.method3619(0)) {
                if (var2.field6334) {
                    var2.method2793((byte) 107);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lha;Z)V", line = 304)
    public final void method786(class548 arg0, boolean arg1) {
        if (!arg1) {
            this.method784(54);
        }
        ++field10252;
        this.field10265.method3978(arg0, -384);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZLha;)V", line = 315)
    public final void method659(boolean arg0, class548 arg1) {
        if (arg0) {
            this.method790(-45);
        }
        ++field10245;
        class284 var3 = this.field10265.method3988(true, true, -103, arg1, 262144);
        if (var3 != null) {
            int var4 = super.field4410 >> 9;
            int var5 = super.field4418 >> 9;
            class744 var6 = arg1.method1404();
            var6.method905(super.field4410, super.field4413, super.field4418);
            this.field10265.method3980(var6, var5, var4, var3, var5, arg1, false, var4, -20837);
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)Z", line = 342)
    public final boolean method642(byte arg0) {
        if (arg0 != 2) {
            this.method784(-105);
        }
        ++field10262;
        return false;
    }

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "(B)V", line = 353)
    public static final void method4153(byte arg0) {
        if (class206.field2703 >= 0) {
            long var1 = class97.method664((byte) -50);
            class206.field2703 = (int) ((long) class206.field2703 - (-class211.field2788 + var1));
            if (~class206.field2703 < -1) {
                int var3 = (class206.field2703 << 8) / class508.field7057;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                class66.field1025 = (16711680 & (class22.field267 & 65280) * var3 - -((65280 & class341.field4820.field1600) * var4)) + (-16711936 & (16711935 & class22.field267) * var3 + (class341.field4820.field1600 & 16711935) * var4) >>> 8;
                float var6 = -var5 + 1.0F;
                class612.field8224 = (-class258.field3734 + class341.field4820.field1590) * var6 + class258.field3734;
                class316.field4379 = (-class625.field8416 + class341.field4820.field1603) * var6 + class625.field8416;
                class707.field9850 = (class341.field4820.field1591 - class299.field4238) * var6 + class299.field4238;
                class243.field3616 = (class341.field4820.field1588 - class158.field2214) * var6 + class158.field2214;
                class523.field7273 = (-16711936 & (16711935 & class625.field8411) * var3 - -((class341.field4820.field1589 & 16711935) * var4)) - -(16711680 & (class625.field8411 & 65280) * var3 - -((65280 & class341.field4820.field1589) * var4)) >>> 8;
                class605.field8176 = class416.field5890 * var3 + class341.field4820.field1592 * var4 >> 8;
                class156.field2196 = (class341.field4820.field1596 - class453.field6271) * var6 + class453.field6271;
                class196.field2634 = (-class581.field7954 + class341.field4820.field1586) * var6 + class581.field7954;
                if (class385.field5532 != class341.field4820.field1594) {
                    class416.field5889 = class453.field6283.method260(class385.field5532, class341.field4820.field1594, var6, class416.field5889);
                }
            } else {
                class316.field4379 = class341.field4820.field1603;
                class156.field2196 = class341.field4820.field1596;
                class206.field2703 = -1;
                class605.field8176 = class341.field4820.field1592;
                class523.field7273 = class341.field4820.field1589;
                class243.field3616 = class341.field4820.field1588;
                class612.field8224 = class341.field4820.field1590;
                class416.field5889 = class341.field4820.field1594;
                class196.field2634 = class341.field4820.field1586;
                class707.field9850 = class341.field4820.field1591;
                class66.field1025 = class341.field4820.field1600;
            }
            class211.field2788 = var1;
        }
        ++field10271;
        if (arg0 < 101) {
            field10263 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "(B)V", line = 414)
    public static void method4154(byte arg0) {
        field10250 = null;
        if (arg0 >= -116) {
            field10254 = -65;
        }
        field10257 = null;
        field10263 = null;
    }
}
