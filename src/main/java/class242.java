import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class242 {

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    private int field3630 = -1;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "Z")
    public boolean field3633 = true;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    private int field3629;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "Ldg;")
    private class290 field3631;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    private int field3635;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "Lbt;")
    private class33 field3627;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    private int field3634;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Lvn;")
    private class209 field3618;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "Lnr;")
    private class41 field3632;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Luk;")
    private class176 field3624;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lqt;")
    public static class459 field3622 = new class459(3, 5);

    @OriginalMember(owner = "client!km", name = "s", descriptor = "Lqt;")
    public static class459 field3636 = new class459(9, -1);

    @OriginalMember(owner = "client!km", name = "t", descriptor = "[I")
    public static int[] field3637 = new int[8];

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field3628;

    // $FF: synthetic field
    @OriginalMember(owner = "client!km", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field3638;

    // $FF: synthetic method
    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1600(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1593(int arg0, int arg1) {
        class19.field211 = arg1;
        class133.field2069 = false;
        field3621++;
        class92.field1478 = 1;
        class431.field6188 = -1;
        int var2 = 9 / ((37 - arg0) / 59);
        class18.field201 = -1;
        class479.field6987 = null;
        class414.field5863 = 0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 24)
    public static void method1594(int arg0) {
        if (arg0 != -24512) {
            field3625 = 28;
        }
        field3636 = null;
        field3622 = null;
        field3637 = null;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 37)
    public static final void method1595(int arg0) {
        field3623++;
        try {
            Method var1 = (field3638 == null ? (field3638 = method1600("java.lang.Runtime")) : field3638).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class290.field4316 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILvn;I)V", line = 68)
    private final void method1596(int arg0, class209 arg1, int arg2) {
        field3620++;
        if (arg0 != 0) {
            this.method1598(31857);
            this.field3627.method285(false, this.field3624);
            this.field3627.method266(4, (byte) 49, arg2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II[BI)V", line = 82)
    public final void method1597(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 < 85) {
            field3637 = null;
        }
        this.field3632.method412(arg2, arg3, 23432, this.field3627.method320(arg3, 4474) * arg1);
        field3628++;
        this.method1596(arg1, this.field3632, 0);
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V", line = 102)
    private final void method1598(int arg0) {
        field3626++;
        if (!this.field3633) {
            return;
        }
        this.field3633 = false;
        byte[] var2 = this.field3631.field4295;
        byte[] var3 = this.field3627.field763;
        int var4 = 0;
        if (arg0 != 31857) {
            field3622 = null;
        }
        int var5 = this.field3631.field4299;
        int var6 = this.field3629 + (this.field3631.field4299 * this.field3635);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3624 != null && this.field3630 == var4) {
            this.field3633 = false;
            return;
        }
        this.field3630 = var4;
        int var8 = this.field3635 * var5 + this.field3629;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field3631.field4299 - 128;
        }
        if (this.field3624 == null) {
            this.field3624 = new class176(this.field3627, 3553, 6406, 128, 128, false, this.field3627.field763, 6406, false);
            this.field3624.method1226(false, false, (byte) -66);
            this.field3624.method879(true, (byte) 98);
        } else {
            this.field3624.method1232(-8733, 0, 128, 6406, 0, 0, 0, false, 128, this.field3627.field763);
        }
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V", line = 209)
    public final void method1599(int arg0) {
        this.method1596(this.field3634, this.field3618, arg0 ^ arg0);
        field3619++;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lbt;Ldg;Lgu;IIIII)V", line = 233)
    public class242(class33 arg0, class290 arg1, class417 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3629 = arg6;
        this.field3631 = arg1;
        this.field3635 = arg7;
        this.field3627 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field347 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field5902[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field3634 = var10;
        if (var10 <= 0) {
            this.field3624 = null;
        } else {
            class519 var14 = new class519(var10 * 2);
            if (this.field3627.field713) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field347 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field5902[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method3016(var23[var24] & 0xFFFF, -90);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field347 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field5902[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method3062(var18[var19] & 0xFFFF, (byte) -53);
                            }
                        }
                    }
                }
            }
            this.field3618 = this.field3627.method271(false, false, var14.field7545, 5123, var14.field7558);
            this.field3632 = new class41(this.field3627, 5123, null, 1);
        }
    }
}
