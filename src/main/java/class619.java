import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class619 extends class701 implements class614 {

    @OriginalMember(owner = "client!gba", name = "L", descriptor = "Z")
    private boolean field8639 = false;

    @OriginalMember(owner = "client!gba", name = "T", descriptor = "Lkh;")
    public class15 field8647;

    @OriginalMember(owner = "client!gba", name = "I", descriptor = "Z")
    private boolean field8636;

    @OriginalMember(owner = "client!gba", name = "B", descriptor = "[I")
    public static int[] field8630 = new int[500];

    @OriginalMember(owner = "client!gba", name = "J", descriptor = "I")
    public static int field8637 = 0;

    @OriginalMember(owner = "client!gba", name = "A", descriptor = "I")
    public static int field8629 = 0;

    @OriginalMember(owner = "client!gba", name = "ab", descriptor = "[I")
    public static int[] field8654 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!gba", name = "S", descriptor = "F")
    public static float field8646;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!gba", name = "C", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!gba", name = "D", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!gba", name = "E", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!gba", name = "F", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!gba", name = "H", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!gba", name = "K", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!gba", name = "M", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!gba", name = "N", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!gba", name = "O", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!gba", name = "P", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!gba", name = "Q", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!gba", name = "U", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!gba", name = "W", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!gba", name = "X", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!gba", name = "Y", descriptor = "I")
    public static int field8652;

    @OriginalMember(owner = "client!gba", name = "Z", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!gba", name = "bb", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!gba", name = "cb", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!gba", name = "db", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!gba", name = "R", descriptor = "Lpu;")
    public static class522 field8645;

    @OriginalMember(owner = "client!gba", name = "V", descriptor = "Lnu;")
    private class548 field8649;

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lr;Let;IIIIIZII)V", line = 6)
    public class619(class166 arg0, class550 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field7775);
        this.field8647 = new class15(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field8636 = ~arg1.field7746 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "(I)V", line = 16)
    public static final void method3444(int arg0) {
        ++field8634;
        class52.field1041.method2587(121);
        class483.field6869.method1994(-4097);
        int var1 = -65 % ((66 - arg0) / 34);
        class145.field2120.method1854((byte) 119);
        class101.field1572.method2616(4182);
        class393.field5824.method364(true);
        class41.field682.method2222(-108);
        class188.field2708.method2138((byte) -125);
        class86.field1411.method1474((byte) 40);
        class31.field493.method586(-1);
        class692.field9733.method3141(29636);
        class339.field4991.method649(false);
        class27.field401.method3061(false);
        class255.field3916.method808(36);
        class325.field4802.method871(19650);
        class329.field4869.method3550(122);
        class226.field3182.method3131(0);
        class177.field2526.method2470((byte) -87);
        class472.field6748.method1809(64);
        class287.field4278.method1332(true);
        class61.field1165.method2959(false);
        class566.method3225(512);
        class588.method3323(-28827);
        class642.method3575((byte) -85);
        class351.method2157(false);
        class344.method2137((byte) -127);
        class197.field2805.method2279(0);
        class524.field7402.method2279(0);
        class591.field8282.method2279(0);
        class657.field9227.method2279(0);
        class220.field3091.method2279(0);
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(ILr;)Lnu;", line = 56)
    public final class548 method1183(int arg0, class166 arg1) {
        ++field8655;
        if (arg0 != 6433) {
            field8629 = 125;
        }
        return this.field8649;
    }

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "(I)Z", line = 70)
    public final boolean method951(int arg0) {
        if (arg0 > -26) {
            this.method1173((class166) null, true);
        }
        ++field8635;
        return false;
    }

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "(I)V", line = 81)
    public static void method3445(int arg0) {
        field8630 = null;
        field8654 = null;
        field8645 = null;
        if (arg0 < 43) {
            field8646 = 0.62116027F;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)I", line = 93)
    public final int method1171(byte arg0) {
        if (arg0 < 39) {
            this.field8639 = true;
        }
        ++field8657;
        return this.field8647.method89(-59);
    }

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "(I)Z", line = 104)
    public final boolean method1184(int arg0) {
        int var2 = 50 % ((-1 - arg0) / 59);
        ++field8651;
        return this.field8639;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lr;I)V", line = 116)
    public final void method1172(class166 arg0, int arg1) {
        this.field8647.method88((byte) -55, arg0);
        if (arg1 < 26) {
            field8654 = null;
        }
        ++field8642;
    }

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "(I)Z", line = 130)
    public final boolean method1181(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field8628;
            return false;
        }
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)I", line = 142)
    public final int method1186(int arg0) {
        if (arg0 != -9960) {
            this.method1185(125, 48, (class166) null, -37);
        }
        ++field8632;
        return this.field8647.field140;
    }

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "(I)Z", line = 153)
    public final boolean method1180(int arg0) {
        if (arg0 <= 100) {
            this.method1177(7, (class166) null);
        }
        ++field8643;
        return this.field8647.method81((byte) -121);
    }

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "(I)V", line = 164)
    public final void method947(int arg0) {
        ++field8656;
        int var2 = 100 % ((arg0 - -44) / 42);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)I", line = 175)
    public final int method1179(boolean arg0) {
        ++field8648;
        if (!arg0) {
            this.method1180(14);
        }
        return this.field8647.field148;
    }

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "(I)I", line = 187)
    public final int method1182(int arg0) {
        ++field8644;
        if (arg0 != -32768) {
            method3444(110);
        }
        return this.field8647.method84(true);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILr;)V", line = 200)
    public final void method1177(int arg0, class166 arg1) {
        ++field8638;
        if (arg0 == 0) {
            class55 var3 = this.field8647.method87((byte) -97, true, arg1, 262144, true, super.field3029, super.field3024);
            if (var3 != null) {
                int var4 = super.field3024 >> 9;
                int var5 = super.field3029 >> 9;
                class391 var6 = arg1.method130();
                var6.method252(super.field3024, super.field3018, super.field3029);
                this.field8647.method79(var3, var5, var4, var6, false, var4, var5, -1, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V", line = 227)
    public final void method1174(int arg0) {
        ++field8640;
        if (arg0 != -24082) {
            field8645 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILr;I)Z", line = 237)
    public final boolean method1185(int arg0, int arg1, class166 arg2, int arg3) {
        ++field8631;
        class55 var5 = this.field8647.method87((byte) -97, false, arg2, 131072, false, super.field3029, super.field3024);
        if (var5 == null) {
            return false;
        } else {
            class391 var6 = arg2.method130();
            var6.method252(super.field3024, super.field3018, super.field3029);
            if (arg0 != -26798) {
                return false;
            } else {
                return !class676.field9574 ? var5.method529(arg3, arg1, var6, false) : var5.method492(arg3, arg1, var6, false, class341.field5008);
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lr;Z)V", line = 268)
    public final void method1176(class166 arg0, boolean arg1) {
        ++field8633;
        this.field8647.method91((byte) -116, arg0);
        if (arg1) {
            field8630 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(Lr;Z)Lkq;", line = 283)
    public final class549 method1173(class166 arg0, boolean arg1) {
        ++field8641;
        class55 var3 = this.field8647.method87((byte) -97, false, arg0, 2048, true, super.field3029, super.field3024);
        if (var3 == null) {
            return null;
        } else {
            class391 var4 = arg0.method130();
            var4.method252(super.field3024, super.field3018, super.field3029);
            class549 var5 = null;
            if (this.field8636) {
                var5 = class26.method321(1, 0);
            }
            int var6 = super.field3024 >> 9;
            int var7 = super.field3029 >> 9;
            this.field8647.method79(var3, var7, var6, var4, arg1, var6, var7, -1, arg0);
            if (class676.field9574) {
                var3.method495(var4, var5 != null ? var5.field7711[0] : null, class341.field5008, 0);
            } else {
                var3.method513(var4, var5 != null ? var5.field7711[0] : null, 0);
            }
            if (this.field8647.field134 != null) {
                class499 var8 = this.field8647.field134.method339();
                if (!class676.field9574) {
                    arg0.method156(var8);
                } else {
                    arg0.method165(var8, class341.field5008);
                }
            }
            this.field8639 = var3.method545() || this.field8647.field134 != null;
            if (this.field8649 == null) {
                this.field8649 = class149.method1060(super.field3029, super.field3024, var3, false, super.field3018);
            } else {
                class525.method3017(var3, -118, this.field8649, super.field3018, super.field3029, super.field3024);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)I", line = 339)
    public final int method1175(int arg0) {
        ++field8653;
        if (arg0 != 24563) {
            field8637 = -121;
        }
        return this.field8647.field151;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZLr;Lrga;IIZ)V", line = 350)
    public final void method953(int arg0, boolean arg1, class166 arg2, class215 arg3, int arg4, int arg5, boolean arg6) {
        ++field8650;
        if (arg6) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)Z", line = 368)
    public static final boolean method3446(int arg0, int arg1) {
        ++field8652;
        if (arg1 != 2) {
            field8654 = null;
        }
        return ~arg0 == -1;
    }
}
