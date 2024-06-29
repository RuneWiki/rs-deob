import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class439 {

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
    private int field6189 = -1;

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "Z")
    private boolean field6190 = true;

    @OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
    private int field6196;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    private int field6182;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
    private int field6184;

    @OriginalMember(owner = "client!iea", name = "m", descriptor = "[Lce;")
    private class279[] field6192;

    @OriginalMember(owner = "client!iea", name = "o", descriptor = "I")
    private int field6194;

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "[Lce;")
    private class279[] field6191;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "Lce;")
    private class279 field6185;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "[I")
    public static int[] field6181 = new int[32];

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    private int field6183;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!iea", name = "n", descriptor = "I")
    private int field6193;

    @OriginalMember(owner = "client!iea", name = "p", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!iea", name = "r", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "Lxa;")
    private class461 field6180;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZLjava/awt/Frame;Ltt;)V", line = 4)
    public static final void method2516(boolean arg0, Frame arg1, class79 arg2) {
        while (true) {
            class260 var3 = arg2.method615(arg1, 27237);
            while (var3.field3702 == 0) {
                class419.method2390(89, 10L);
            }
            if (var3.field3702 == 1) {
                field6195++;
                arg1.setVisible(arg0);
                arg1.dispose();
                return;
            }
            class419.method2390(32, 100L);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIIIIIILoa;B)V", line = 27)
    public final void method2517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class638 arg8, byte arg9) {
        int var11 = arg7 + arg6 & 0x3FFF;
        if (arg9 < 33) {
            this.field6183 = 35;
        }
        field6188++;
        if (this.field6196 == -1) {
            arg8.method472(arg4, arg0, arg5, arg1, arg3, 0);
        } else {
            class269 var12 = class570.field7665.method588(-26679, this.field6196);
            if (this.field6180 == null && class570.field7665.method590(this.field6196, (byte) -50)) {
                int[] var13 = var12.field3813 ? class570.field7665.method582(this.field6193, this.field6193, 23117, false, this.field6196, 0.7F) : class570.field7665.method586(this.field6196, this.field6193, 0.7F, this.field6193, false, 102);
                this.field6180 = arg8.method452(var13, 0, this.field6193, this.field6193, this.field6193);
            }
            if (var12.field3813) {
                arg8.method472(arg4, arg0, arg5, arg1, arg3, 0);
            }
            if (this.field6180 != null) {
                int var14 = var12.field3813 ? 1 : 0;
                int var15 = arg1 * arg2 / -4096;
                int var16;
                for (var16 = arg1 * var11 / 4096 + (arg5 - arg1) / 2; var16 > arg1; var16 -= arg1) {
                }
                while (var16 < 0) {
                    var16 += arg1;
                }
                while (arg1 < var15) {
                    var15 -= arg1;
                }
                while (var15 < 0) {
                    var15 += arg1;
                }
                for (int var17 = var16 - arg1; var17 < arg5; var17 += arg1) {
                    for (int var18 = var15 - arg1; var18 < arg1; var18 += arg1) {
                        this.field6180.method35(arg4 + var17, arg0 + var18, arg1, arg1, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field6183 - 1; var19 >= 0; var19--) {
            this.field6191[var19].method1697(arg8, arg4, arg0, arg5, arg1, arg2, var11);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V", line = 115)
    public static void method2518(byte arg0) {
        field6181 = null;
        int var1 = -90 % ((arg0 - 75) / 51);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Loa;II)Z", line = 127)
    public final boolean method2519(class638 arg0, int arg1, int arg2) {
        if (this.field6189 != arg2) {
            this.field6189 = arg2;
            int var4 = class694.method3810(arg2, arg1 + 71828323);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field6193 != var4) {
                this.field6193 = var4;
                this.field6180 = null;
            }
            if (this.field6192 != null) {
                this.field6183 = 0;
                int[] var5 = new int[this.field6192.length];
                for (int var6 = 0; var6 < this.field6192.length; var6++) {
                    class279 var7 = this.field6192[var6];
                    if (var7.method1693(this.field6184, this.field6194, this.field6182, this.field6189)) {
                        var5[this.field6183] = var7.field3906;
                        this.field6191[this.field6183++] = var7;
                    }
                }
                class572.method3148(10796, this.field6191, var5, 0, this.field6183 - 1);
            }
            this.field6190 = true;
        }
        field6197++;
        boolean var8 = false;
        if (arg1 != 1) {
            method2516(true, null, null);
        }
        if (this.field6190) {
            this.field6190 = false;
            for (int var9 = this.field6183 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field6191[var9].method1695(arg0, this.field6185);
                var8 |= var10;
                this.field6190 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V", line = 205)
    public final void method2520(int arg0) {
        if (this.field6192 != null) {
            for (int var2 = 0; var2 < this.field6192.length; var2++) {
                this.field6192[var2].method1696();
            }
        }
        field6187++;
        this.field6180 = null;
        if (arg0 != 2542) {
            this.field6191 = null;
        }
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(I[Lce;IIII)V", line = 269)
    public class439(int arg0, class279[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6196 = arg0;
        this.field6182 = arg5;
        this.field6184 = arg3;
        this.field6192 = arg1;
        this.field6194 = arg4;
        if (arg1 == null) {
            this.field6191 = null;
            this.field6185 = null;
        } else {
            this.field6191 = new class279[arg1.length];
            this.field6185 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Ljava/lang/String;IC)I", line = 239)
    public static final int method2521(String arg0, int arg1, char arg2) {
        field6186++;
        int var3 = 0;
        int var4 = arg0.length();
        int var5 = 0;
        if (arg1 > -123) {
            return -122;
        }
        while (var5 < var4) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
            var5++;
        }
        return var3;
    }
}
