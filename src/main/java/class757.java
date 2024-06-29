import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class757 {

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    private int field10530 = -1;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Z")
    private boolean field10538 = false;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "[Ljava/lang/String;")
    private String[] field10539 = new String[0];

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    private int field10542;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lwk;")
    public static class431 field10537 = new class431();

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lwg;")
    public static class613 field10544 = new class613();

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field10528;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field10529;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field10531;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field10532;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field10533;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field10534;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field10535;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field10536;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Ltd;")
    public static class515 field10543;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V")
    private final void method4202(int arg0, byte arg1) {
        if (arg1 != -102) {
            field10543 = null;
        }
        field10535++;
        String[] var3 = new String[this.method4203(-29151, arg0)];
        class85.method680(this.field10539, 0, var3, 0, this.field10539.length);
        this.field10539 = var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I")
    private final int method4203(int arg0, int arg1) {
        field10536++;
        if (arg0 != -29151) {
            this.field10539 = null;
        }
        int var3 = this.field10539.length;
        while (arg1 >= var3) {
            if (!this.field10538) {
                var3 += this.field10542;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field10542 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILkw;)Lof;")
    public static final class9 method4204(int arg0, int arg1, int arg2, int arg3, class346 arg4) {
        field10529++;
        if (arg1 < 16) {
            method4210((byte) -120);
        }
        if (!arg4.field5021 && (!class211.method1496(0, arg3) || !class211.method1496(0, arg2))) {
            return arg4.field5035 ? new class9(arg4, 34037, arg0, arg3, arg2) : new class9(arg4, arg0, arg3, arg2, class68.method609(arg3, (byte) 107), class68.method609(arg2, (byte) 76));
        } else {
            return new class9(arg4, 3553, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lo;I)V")
    public static final void method4205(class175 arg0, int arg1) {
        if (arg1 <= 43) {
            return;
        }
        arg0.field2458 = null;
        field10540++;
        if (class695.field9826 < 20) {
            class391.field5643.method1521(arg0, -24256);
            class695.field9826++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)[Ljava/lang/String;")
    public final String[] method4206(boolean arg0) {
        field10534++;
        String[] var2 = new String[this.field10530 + 1];
        if (arg0) {
            this.field10530 = -23;
        }
        class85.method680(this.field10539, 0, var2, 0, this.field10530 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIIII)V")
    public static final void method4207(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field10541++;
        float var5 = (float) class664.field9509 / (float) class664.field9508;
        if (arg0 != -6) {
            method4208(-22);
        }
        int var6 = arg3;
        int var7 = arg2;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg4 - (arg2 - var7) / 2;
        int var9 = arg1 - (arg3 - var6) / 2;
        class120.field1639 = -1;
        class78.field1135 = class664.field9509 - (class664.field9509 * var8 / var7);
        class709.field9963 = -1;
        class488.field7039 = class664.field9508 * var9 / var6;
        class91.method710(false);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
    public static final int method4208(int arg0) {
        field10532++;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class345.field4749.field4087 && !class345.field4749.field4100) {
            if (class300.field4089.startsWith("win")) {
                var2 = true;
                var3 = true;
            } else {
                var2 = true;
            }
            var1 = true;
        }
        if (class466.field6631) {
            var2 = false;
        }
        if (class458.field6512) {
            var1 = false;
        }
        if (class374.field5415) {
            var3 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class100.method753(true);
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = arg0;
        if (var1) {
            try {
                var4 = class472.method2842(1000, 2, 500);
            } catch (Exception var15) {
            }
        }
        if (var3) {
            try {
                var6 = class472.method2842(1000, 3, 500);
                if (class243.field3580.field7975.method3775(false) == 3) {
                    class729 var7 = class211.field3164.method1229();
                    long var8 = var7.field10235 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field10230;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class472.method2842(1000, 1, 500);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class100.method753(true);
        }
        int var11 = (int) ((float) var5 * 1.1F);
        int var12 = (int) ((float) var6 * 1.1F);
        if (var12 < var4 && var4 > var11) {
            return class228.method1585(-125, var4);
        } else if (var11 >= var12) {
            return class731.method4073(arg0 - 12, var11, 1);
        } else {
            return class731.method4073(-7, var12, 3);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILjava/lang/String;)V")
    private final void method4209(byte arg0, int arg1, String arg2) {
        if (arg0 >= -126) {
            this.field10539 = null;
        }
        field10533++;
        if (this.field10530 < arg1) {
            this.field10530 = arg1;
        }
        if (this.field10539.length <= arg1) {
            this.method4202(arg1, (byte) -102);
        }
        this.field10539[arg1] = arg2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static void method4210(byte arg0) {
        field10537 = null;
        field10544 = null;
        if (arg0 > 44) {
            field10543 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10531++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field10530; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field10539[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method4211(byte arg0, String arg1) {
        if (arg0 != 32) {
            this.method4202(-93, (byte) -67);
        }
        field10528++;
        this.method4209((byte) -127, this.field10530 + 1, arg1);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IZ)V")
    public class757(int arg0, boolean arg1) {
        this.field10538 = arg1;
        this.field10542 = arg0;
    }
}
