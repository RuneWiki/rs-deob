import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class408 extends class618 implements class532 {

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "B")
    private byte field5513;

    @OriginalMember(owner = "client!ks", name = "T", descriptor = "S")
    private short field5523;

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "B")
    private byte field5516;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "Z")
    private boolean field5509;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "Z")
    private boolean field5496;

    @OriginalMember(owner = "client!ks", name = "S", descriptor = "Z")
    private boolean field5522;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "Z")
    private boolean field5510;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "Lw;")
    private class276 field5504;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "Lba;")
    private class358 field5512;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "[I")
    public static int[] field5507 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
    public static int field5515 = 0;

    @OriginalMember(owner = "client!ks", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field5520 = new String[8];

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!ks", name = "N", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!ks", name = "P", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!ks", name = "R", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!ks", name = "U", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!ks", name = "V", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "Ldd;")
    private class660 field5506;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method150(byte arg0) {
        ++field5497;
        if (arg0 >= -34) {
            method2344(-12);
        }
        return this.field5510;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Loa;BI)Lba;", line = 15)
    public final class358 method137(class651 arg0, byte arg1, int arg2) {
        ++field5518;
        if (arg1 != -47) {
            this.field5516 = 67;
        }
        return this.method2343(arg0, (byte) -33, arg2);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILoa;ILni;ZZI)V", line = 26)
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        if (arg3 instanceof class408) {
            class408 var8 = (class408) arg3;
            if (this.field5512 != null && var8.field5512 != null) {
                this.field5512.method1923(var8.field5512, arg0, arg2, arg6, arg4);
            }
        }
        if (arg5) {
            ++field5511;
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(Z)I", line = 47)
    public final int method152(boolean arg0) {
        ++field5519;
        return !arg0 ? 19 : this.field5513;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Loa;I)V", line = 59)
    public final void method138(class651 arg0, int arg1) {
        ++field5499;
        Object var3 = null;
        class276 var5;
        if (this.field5504 == null && this.field5510) {
            class392 var4 = this.method2342(arg0, 262144, true, true);
            var5 = var4 == null ? null : var4.field5170;
        } else {
            var5 = this.field5504;
            this.field5504 = null;
        }
        if (var5 != null) {
            class232.method1447(var5, this.field5516, super.field8203, super.field8197, (boolean[]) null);
        }
        if (arg1 != 2215) {
            this.field5523 = -108;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Loa;Z)V", line = 86)
    public final void method147(class651 arg0, boolean arg1) {
        ++field5517;
        if (!arg1) {
            field5507 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V", line = 97)
    public final void method144(boolean arg0) {
        if (arg0) {
            this.field5516 = 35;
        }
        ++field5524;
        if (this.field5512 != null) {
            this.field5512.method1913();
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V", line = 112)
    public static void method2341(int arg0) {
        field5520 = null;
        field5507 = null;
        if (arg0 != -12025) {
            field5515 = -113;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILoa;)Ldd;", line = 127)
    public final class660 method143(int arg0, class651 arg1) {
        if (arg0 != 31358) {
            return null;
        } else {
            if (this.field5506 == null) {
                this.field5506 = class516.method2881(super.field8198, true, this.method2343(arg1, (byte) -78, 0), super.field8203, super.field8197);
            }
            ++field5500;
            return this.field5506;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BILoa;I)Z", line = 142)
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        ++field5495;
        class358 var5 = this.method2343(arg2, (byte) -124, 131072);
        int var6 = -93 / ((-26 - arg0) / 38);
        if (var5 != null) {
            class397 var7 = arg2.method455();
            var7.method576(super.field8203, super.field8198, super.field8197);
            return var5.method1931(arg3, arg1, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLoa;)Lpe;", line = 162)
    public final class571 method145(byte arg0, class651 arg1) {
        ++field5525;
        if (this.field5512 == null) {
            return null;
        } else {
            class397 var3 = arg1.method455();
            var3.method576(super.field8203, super.field8198, super.field8197);
            if (arg0 != 124) {
                this.method2342((class651) null, 75, true, true);
            }
            class571 var4 = null;
            if (this.field5496) {
                var4 = class157.method1100((byte) -104, 1);
            }
            this.field5512.method1947(var3, var4 == null ? null : var4.field7581[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Loa;Lbd;IIIIZIZ)V", line = 187)
    public class408(class651 arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field895, arg1.field904, arg1.field850);
        this.field5513 = (byte) arg7;
        this.field5523 = (short) arg1.field824;
        this.field5516 = (byte) arg2;
        super.field8197 = arg5;
        this.field5509 = arg6;
        this.field5496 = arg1.field816 != 0 && !arg6;
        super.field8203 = arg3;
        this.field5522 = arg8;
        this.field5510 = arg0.method404() && arg1.field877 && !this.field5509 && ~class344.field4718.method2329(108, class571.field7587) != -1;
        int var10 = 2048;
        if (this.field5522) {
            var10 |= 65536;
        }
        class392 var11 = this.method2342(arg0, var10, true, this.field5510);
        if (var11 != null) {
            this.field5504 = var11.field5170;
            this.field5512 = var11.field5169;
            if (this.field5522) {
                this.field5512 = this.field5512.method1519((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z", line = 225)
    public final boolean method139(int arg0) {
        if (arg0 != 2) {
            this.field5522 = false;
        }
        ++field5521;
        return this.field5522;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)I", line = 240)
    public final int method151(byte arg0) {
        ++field5502;
        if (arg0 != 78) {
            this.field5513 = -127;
        }
        return 22;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)I", line = 258)
    public final int method146(boolean arg0) {
        if (arg0) {
            this.method149((byte) -122, 47, (class651) null, 26);
        }
        ++field5505;
        return this.field5523 & 65535;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Loa;B)V", line = 270)
    public final void method148(class651 arg0, byte arg1) {
        ++field5514;
        if (arg1 != 70) {
            this.field5523 = 111;
        }
        Object var3 = null;
        class276 var5;
        if (this.field5504 == null && this.field5510) {
            class392 var4 = this.method2342(arg0, 262144, true, true);
            var5 = var4 == null ? null : var4.field5170;
        } else {
            var5 = this.field5504;
            this.field5504 = null;
        }
        if (var5 != null) {
            class486.method2723(var5, this.field5516, super.field8203, super.field8197, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(B)V", line = 298)
    public final void method142(byte arg0) {
        if (arg0 != -77) {
            field5515 = 75;
        }
        ++field5503;
        this.field5522 = false;
        if (this.field5512 != null) {
            this.field5512.method1899(this.field5512.method1945() & -65537);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Loa;IZZ)Lun;", line = 313)
    private final class392 method2342(class651 arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            field5515 = -49;
        }
        ++field5498;
        class58 var5 = class470.field6288.method1258(65535 & this.field5523, (byte) -124);
        class139 var6;
        class139 var7;
        if (this.field5509) {
            var6 = class467.field6283[this.field5516];
            var7 = class684.field9625[0];
        } else {
            var6 = class684.field9625[this.field5516];
            if (this.field5516 >= 3) {
                var7 = null;
            } else {
                var7 = class684.field9625[this.field5516 + 1];
            }
        }
        return var5.method472(var7, super.field8203, super.field8197, arg1, super.field8198, arg0, (byte) -124, arg3, 22, var6, this.field5513);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Loa;BI)Lba;", line = 343)
    private final class358 method2343(class651 arg0, byte arg1, int arg2) {
        ++field5501;
        if (this.field5512 != null && arg0.method376(this.field5512.method1945(), arg2) == 0) {
            return this.field5512;
        } else {
            if (arg1 >= -16) {
                this.method148((class651) null, (byte) 24);
            }
            class392 var4 = this.method2342(arg0, arg2, true, false);
            return var4 == null ? null : var4.field5169;
        }
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V", line = 372)
    public static final void method2344(int arg0) {
        ++field5508;
        class488 var1 = null;
        try {
            class192 var2 = class688.field9669.method2892("3", true, false);
            if (arg0 != 26133) {
                return;
            }
            while (var2.field2816 == 0) {
                class486.method2722(0, 1L);
            }
            if (var2.field2816 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class488) var2.field2820;
            byte[] var3 = new byte[(int) var1.method2732(97)];
            if (~var3.length != -1) {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2726(var3.length - var4, var4, (byte) -116, var3);
                    if (~var5 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class335 var6 = new class335(var3);
                int var7 = var6.method2034(255);
                if (~var7 < -121) {
                    throw new RuntimeException("Bad length");
                }
                var6.field4619 = var7 - -1;
                if (!var6.method2043((byte) -90)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field4619 = 1;
                int var8 = var6.method2034(255);
                if (~var8 < -4) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class225.field3174 = var6.method1981(-11907);
                class373.field5045 = var6.method1981(-11907);
                if (var8 < 1) {
                    class295.field4174 = class88.field1330;
                } else {
                    class295.field4174 = var6.method2001((byte) -83);
                }
                if (var8 < 2) {
                    class407.field5490 = class440.field6041;
                } else {
                    class407.field5490 = var6.method2016((byte) -60);
                }
                if (~var8 <= -4) {
                    if (~var6.method2034(255) != -2) {
                        class373.field5037 = null;
                    } else {
                        class373.field5037 = var6.method1981(-11907);
                    }
                } else {
                    class373.field5037 = class592.field7827;
                }
            } else {
                class225.field3174 = "";
                class373.field5045 = "";
            }
        } catch (Exception var10) {
            class373.field5045 = "";
            class225.field3174 = "";
        }
        try {
            if (var1 != null) {
                var1.method2729((byte) -89);
            }
        } catch (Exception var9) {
        }
    }
}
