import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class49 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Z")
    public boolean field664 = true;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    private int field675 = -1;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Lht;")
    private class410 field665;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lac;")
    private class377 field666;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    private int field678;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Lqv;")
    private class308 field673;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "Lnk;")
    private class502 field680;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Lva;")
    private class342 field677;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field667 = -1;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "Ljava/lang/String;")
    public static String field679 = null;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lnk;II)V")
    private final void method304(class502 arg0, int arg1, int arg2) {
        field676++;
        if (arg1 != 0) {
            this.method305((byte) 126);
            this.field665.method2412((byte) 4, this.field673);
            this.field665.method2420(arg2, arg1, arg2 + 109, arg0, 4);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    private final void method305(byte arg0) {
        field682++;
        if (!this.field664) {
            return;
        }
        this.field664 = false;
        byte[] var2 = this.field666.field5298;
        byte[] var3 = class184.field2578;
        int var4 = 0;
        int var5 = -98 % ((84 - arg0) / 42);
        int var6 = this.field666.field5307;
        int var7 = this.field666.field5307 * this.field674 + this.field678;
        for (int var8 = -128; var8 < 0; var8++) {
            var4 = (var4 << 8) - var4;
            for (int var14 = -128; var14 < 0; var14++) {
                if (var2[var7++] != 0) {
                    var4++;
                }
            }
            var7 += var6 - 128;
        }
        if (this.field673 != null && this.field675 == var4) {
            this.field664 = false;
            return;
        }
        this.field675 = var4;
        int var9 = 0;
        int var10 = this.field674 * var6 + this.field678;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var10] == 0) {
                    int var13 = 0;
                    if (var2[var10 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 - var6] != 0) {
                        var13++;
                    }
                    if (var2[var10 + var6] != 0) {
                        var13++;
                    }
                    var3[var9++] = (byte) (var13 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var10++;
            }
            var10 += this.field666.field5307 - 128;
        }
        if (this.field673 == null) {
            this.field673 = new class308(this.field665, 3553, 6406, 128, 128, false, class184.field2578, 6406, false);
            this.field673.method1751(false, false, (byte) 79);
            this.field673.method1132(true, (byte) 62);
        } else {
            this.field673.method1746(class184.field2578, false, 6406, 0, 128, 0, false, 0, 128, 0);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method306(int arg0) {
        field679 = null;
        int var1 = -63 % ((-arg0 - 64) / 51);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lvh;II)Lgv;")
    public static final class56 method307(class240 arg0, int arg1, int arg2) {
        field671++;
        int var3 = -27 / ((39 - arg2) / 52);
        byte[] var4 = arg0.method1388(arg1, (byte) -15);
        return var4 == null ? null : new class56(var4);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        this.method304(this.field680, this.field670, 0);
        field672++;
        if (arg0 != 96) {
            method309(null, -77, 99, -102);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method309(byte[] arg0, int arg1, int arg2, int arg3) {
        field681++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        if (arg3 < 79) {
            method311(null, (byte) -126);
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg0[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class281.field3798[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II[BI)V")
    public final void method310(int arg0, int arg1, byte[] arg2, int arg3) {
        field663++;
        this.field677.method1911(arg2, arg0, 111, arg3 * this.field665.method2386(arg0, -111));
        this.method304(this.field677, arg3, 0);
        if (arg1 != -1) {
            method311(null, (byte) -25);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([BB)[B")
    public static final byte[] method311(byte[] arg0, byte arg1) {
        field668++;
        if (arg1 <= 38) {
            method306(6);
        }
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class416.method2491(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lht;Lac;Ljt;IIIII)V")
    public class49(class410 arg0, class377 arg1, class67 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field674 = arg7;
        this.field665 = arg0;
        this.field666 = arg1;
        this.field678 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field495 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field943[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field670 = var10;
        if (var10 <= 0) {
            this.field673 = null;
        } else {
            class365 var14 = new class365(var10 * 2);
            if (this.field665.field5931) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field495 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field943[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2070(81954016, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field495 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field943[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2115((byte) 87, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field680 = this.field665.method2402(1, var14.field5069, var14.field5073, false, 5123);
            this.field677 = new class342(this.field665, 5123, null, 1);
        }
    }
}
