import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class438 extends class228 {

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
    private int field6254 = 0;

    @OriginalMember(owner = "client!nr", name = "Y", descriptor = "Z")
    public boolean field6270 = false;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "I")
    private int field6256 = -1;

    @OriginalMember(owner = "client!nr", name = "cb", descriptor = "I")
    private int field6274 = -32768;

    @OriginalMember(owner = "client!nr", name = "db", descriptor = "I")
    private int field6275 = 0;

    @OriginalMember(owner = "client!nr", name = "T", descriptor = "I")
    public int field6265;

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "I")
    private int field6257;

    @OriginalMember(owner = "client!nr", name = "O", descriptor = "Lqi;")
    private class209 field6260;

    @OriginalMember(owner = "client!nr", name = "W", descriptor = "Lik;")
    public static class410 field6268 = new class410(64);

    @OriginalMember(owner = "client!nr", name = "gb", descriptor = "[S")
    public static short[] field6278 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!nr", name = "hb", descriptor = "[I")
    public static int[] field6279 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!nr", name = "M", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!nr", name = "N", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!nr", name = "P", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!nr", name = "Q", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!nr", name = "R", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!nr", name = "U", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!nr", name = "V", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!nr", name = "X", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!nr", name = "Z", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!nr", name = "ab", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!nr", name = "bb", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!nr", name = "eb", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!nr", name = "fb", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!nr", name = "ib", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!nr", name = "S", descriptor = "Lha;")
    private class48 field6264;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "[I")
    public static int[] field6251;

    @OriginalMember(owner = "client!nr", name = "jb", descriptor = "[[[B")
    public static byte[][][] field6281;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)V", line = 3)
    public final void method2716(int arg0, byte arg1) {
        if (arg1 != -105) {
            this.field6275 = 34;
        }
        ++field6263;
        if (!this.field6270) {
            this.field6254 += arg0;
            while (~this.field6254 < ~this.field6260.field2894[this.field6275]) {
                this.field6254 -= this.field6260.field2894[this.field6275];
                ++this.field6275;
                if (this.field6275 >= this.field6260.field2915.length) {
                    this.field6270 = true;
                    break;
                }
            }
            if (!this.field6270) {
                class232.method1547(13238, this.field6260, super.field3167, false, this.field6275, super.field3176);
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIB)V", line = 34)
    public static final void method2717(int arg0, int arg1, byte arg2) {
        class44.field709 = -class99.field1436 + arg1;
        if (arg2 != 94) {
            method2720((byte) 101);
        }
        class39.field605 = -class99.field1438 + arg0;
        ++field6252;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lkk;BIII)V", line = 46)
    public static final void method2718(class372 arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field6273;
        if (arg1 >= 11) {
            for (class417 var5 = (class417) class329.field4465.method1240((byte) -81); var5 != null; var5 = (class417) class329.field4465.method1245(1)) {
                if (var5.field5831 == arg2 && arg3 * 128 == var5.field5850 && ~(arg4 * 128) == ~var5.field5854 && ~var5.field5835.field5157 == ~arg0.field5157) {
                    if (var5.field5836 != null) {
                        class315.field4277.method1431(var5.field5836);
                        var5.field5836 = null;
                    }
                    if (var5.field5847 != null) {
                        class315.field4277.method1431(var5.field5847);
                        var5.field5847 = null;
                    }
                    var5.method2367(5);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIIII)V", line = 87)
    public static final void method2719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class416.method2577(arg4, 7, arg2, arg5, arg7, arg3, 0, arg0, arg1);
        ++field6267;
        if (arg6 != 8741) {
            field6279 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V", line = 100)
    public static void method2720(byte arg0) {
        field6251 = null;
        field6279 = null;
        field6281 = null;
        field6268 = null;
        field6278 = null;
        int var1 = 117 % ((-68 - arg0) / 55);
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(B)V", line = 113)
    public final void method535(byte arg0) {
        ++field6276;
        if (arg0 <= 110) {
            this.method581(73, (class391) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILpe;B)Lsj;", line = 124)
    private final class73 method2721(int arg0, class391 arg1, byte arg2) {
        ++field6271;
        class282 var4 = class71.method613(this.field6257, (byte) -82);
        if (arg2 > -58) {
            return null;
        } else {
            return !this.field6270 ? var4.method1780(true, this.field6275, this.field6256, arg1, this.field6254, arg0) : var4.method1780(true, -1, -1, arg1, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 137)
    public class438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field6265 = arg2 - -arg1;
        this.field6257 = arg0;
        int var12 = class71.method613(this.field6257, (byte) -88).field3765;
        if (var12 == -1) {
            this.field6270 = true;
        } else {
            this.field6270 = false;
            this.field6260 = class288.method1819(var12, (byte) 105);
        }
        if (~this.field6265 == ~arg2) {
            class232.method1547(13238, this.field6260, super.field3167, false, this.field6275, super.field3176);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLsj;Lpe;)V", line = 161)
    private final void method2722(byte arg0, class73 arg1, class391 arg2) {
        ++field6253;
        int var4 = -91 / ((arg0 - 5) / 43);
        class227[] var5 = arg1.method447();
        class276[] var6 = arg1.method472();
        if ((this.field6264 == null || this.field6264.field816) && (var5 != null || var6 != null)) {
            this.field6264 = new class48(class414.field5793);
        }
        if (this.field6264 != null) {
            this.field6264.method482(arg2, (long) class414.field5793, var5, var6, false);
            this.field6264.method493(super.field3170, super.field3172, super.field3162, super.field3161, super.field3178);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILpe;)V", line = 188)
    public final void method581(int arg0, class391 arg1) {
        ++field6269;
        class73 var3 = this.method2721(arg0, arg1, (byte) -64);
        if (var3 != null) {
            this.method2722((byte) 115, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 205)
    public static final String method2723(Throwable arg0, int arg1) throws IOException {
        ++field6280;
        String var2;
        if (!(arg0 instanceof class67)) {
            var2 = "";
        } else {
            class67 var3 = (class67) arg0;
            var2 = var3.field1009 + " | ";
            arg0 = var3.field1011;
        }
        StringWriter var4 = new StringWriter();
        if (arg1 != -1) {
            return null;
        } else {
            PrintWriter var5 = new PrintWriter(var4);
            arg0.printStackTrace(var5);
            var5.close();
            String var6 = var4.toString();
            BufferedReader var7 = new BufferedReader(new StringReader(var6));
            String var8 = var7.readLine();
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                String var12;
                if (var10 == -1) {
                    var12 = var9;
                } else {
                    var12 = var9.substring(0, var10);
                }
                String var13 = var12.trim();
                String var14 = var13.substring(var13.lastIndexOf(32) + 1);
                String var15 = var14.substring(1 + var14.lastIndexOf(9));
                String var16 = var2 + var15;
                if (~var10 != 0 && var11 != -1) {
                    int var17 = var9.indexOf(".java:", var10);
                    if (var17 >= 0) {
                        var16 = var16 + var9.substring(var17 - -5, var11);
                    }
                }
                var2 = var16 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 280)
    public static final void method2724(int arg0) {
        class284.field3808.method2533(0);
        ++field6277;
        if (arg0 != -1) {
            method2718((class372) null, (byte) -57, -33, -82, -95);
        }
        class13.field98.method2533(arg0 + 1);
        class249.field3410.method2533(0);
        class121.field1700.method2533(0);
        class198.field2827.method2533(0);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZILhh;Lpe;III)V", line = 296)
    public final void method532(boolean arg0, int arg1, class184 arg2, class391 arg3, int arg4, int arg5, int arg6) {
        ++field6259;
        int var8 = 21 / ((76 - arg1) / 38);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nr", name = "finalize", descriptor = "()V", line = 310)
    protected final void finalize() {
        if (this.field6264 != null) {
            this.field6264.method486();
        }
        ++field6258;
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)Z", line = 320)
    public final boolean method537(int arg0) {
        if (arg0 > -48) {
            return true;
        } else {
            ++field6266;
            return false;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IILpe;I)Z", line = 331)
    public final boolean method583(int arg0, int arg1, class391 arg2, int arg3) {
        ++field6262;
        return arg3 != 65536;
    }

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "(I)I", line = 345)
    public final int method579(int arg0) {
        if (arg0 != 0) {
            this.method2722((byte) 100, (class73) null, (class391) null);
        }
        ++field6255;
        return this.field6274;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V", line = 363)
    public final void method2725(byte arg0) {
        if (arg0 != -42) {
            method2718((class372) null, (byte) -44, 115, -23, -4);
        }
        ++field6272;
        if (this.field6264 != null) {
            this.field6264.method486();
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lpe;B)Lca;", line = 385)
    public final class415 method572(class391 arg0, byte arg1) {
        ++field6261;
        if (arg1 > -45) {
            field6278 = null;
        }
        class73 var3 = this.method2721(1024, arg0, (byte) -113);
        if (var3 == null) {
            return null;
        } else {
            class156 var4 = arg0.method226();
            var4.method308(super.field3176, super.field3168, super.field3167);
            if (this.field6264 == null) {
                var3.method478(var4, (class197) null, 0);
            } else {
                class374 var5 = this.field6264.method489();
                arg0.method166(var3, var5, var4, (class197) null, 0);
            }
            this.field6274 = var3.method420();
            this.method2722((byte) -44, var3, arg0);
            return null;
        }
    }
}
