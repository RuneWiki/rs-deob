import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class6 {

    @OriginalMember(owner = "client!to", name = "g", descriptor = "Ljq;")
    public class299 field91 = new class299();

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "Ljq;")
    private class299 field92;

    static {
        new class349("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 3)
    public final void method23(byte arg0) {
        field88++;
        if (arg0 != -45) {
            return;
        }
        while (true) {
            class299 var2 = this.field91.field4339;
            if (this.field91 == var2) {
                this.field92 = null;
                return;
            }
            var2.method2017(false);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)Ljq;", line = 26)
    public final class299 method24(int arg0) {
        field86++;
        if (arg0 != -4544) {
            return null;
        }
        class299 var2 = this.field91.field4339;
        if (this.field91 == var2) {
            this.field92 = null;
            return null;
        } else {
            this.field92 = var2.field4339;
            return var2;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V", line = 52)
    public static final void method25(int arg0, int arg1) {
        class74 var2 = class385.field5449[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class74 var4 = class385.field5449[var3][arg0][arg1] = class385.field5449[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field958--;
                for (class353 var5 = var4.field970; var5 != null; var5 = var5.field5127) {
                    class306 var6 = var5.field5125;
                    if (var6.field4465 == arg0 && var6.field4462 == arg1) {
                        var6.field4464--;
                    }
                }
            }
        }
        if (class385.field5449[0][arg0][arg1] == null) {
            class385.field5449[0][arg0][arg1] = new class74(0, arg0, arg1);
            class385.field5449[0][arg0][arg1].field961 = 1;
        }
        class385.field5449[0][arg0][arg1].field963 = var2;
        class385.field5449[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lfa;I)I", line = 95)
    public static final int method26(class128 arg0, int arg1) {
        field87++;
        int var2 = arg0.field1781;
        if (arg1 != 9251) {
            method30(112, -83L);
        }
        class3 var3 = arg0.method2093(arg1 ^ 0xA6B36242);
        if (arg0.field4513) {
            var2 = arg0.field1789;
        } else if (arg0.field4537 == var3.field23 || arg0.field4537 == var3.field31 || arg0.field4537 == var3.field33 || arg0.field4537 == var3.field51) {
            var2 = arg0.field1808;
        } else if (arg0.field4537 == var3.field59 || arg0.field4537 == var3.field44 || arg0.field4537 == var3.field18 || arg0.field4537 == var3.field66) {
            var2 = arg0.field1794;
        }
        return var2;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Ljq;", line = 125)
    public final class299 method27(int arg0) {
        field95++;
        class299 var2 = this.field92;
        if (this.field91 == var2) {
            this.field92 = null;
            return null;
        }
        if (arg0 != 35) {
            method25(-36, -126);
        }
        this.field92 = var2.field4339;
        return var2;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V", line = 203)
    public class6() {
        this.field91.field4336 = this.field91;
        this.field91.field4339 = this.field91;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjq;)V", line = 149)
    public final void method28(int arg0, class299 arg1) {
        field94++;
        if (arg1.field4336 != null) {
            arg1.method2017(false);
        }
        arg1.field4336 = this.field91.field4336;
        arg1.field4339 = this.field91;
        arg1.field4336.field4339 = arg1;
        arg1.field4339.field4336 = arg1;
        if (arg0 != -27706) {
            field90 = 48;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "([IBI)V", line = 169)
    public static final void method29(int[] arg0, byte arg1, int arg2) {
        field93++;
        int var3 = -71 % ((-arg1 - 51) / 60);
        for (int var4 = 31; var4 > 0; var4--) {
            int var5 = var4 * 36;
            for (int var6 = 35; var6 > 0; var6--) {
                if (arg0[var5 + var6] == 0 && arg0[var6 - (1 - var5) - 36] != 0) {
                    arg0[var5 + var6] = arg2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IJ)V", line = 212)
    public static final void method30(int arg0, long arg1) {
        class407.field5761.field1880 = 0;
        field89++;
        if (arg0 > -114) {
            method26((class128) null, -46);
        }
        class407.field5761.method831(21, (byte) 127);
        class407.field5761.method832((byte) -61, arg1);
        class103.field1332 = 0;
        class44.field599 = -3;
        class415.field5926 = 1;
        class429.field6100 = 0;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BZ)V", line = 230)
    public static final void method31(byte arg0, boolean arg1) {
        class127.method769(0);
        field85++;
        if (class423.field6041 != 30 && class423.field6041 != 25) {
            return;
        }
        class338.field4892++;
        if (class338.field4892 < 50 && !arg1) {
            return;
        }
        class338.field4892 = 0;
        if (!class265.field3895 && class199.field2847 != null) {
            class128.field1803++;
            class407.field5761.method2048(2040, 156);
            try {
                class199.field2847.method1091(false, class407.field5761.field1851, class407.field5761.field1880, 0);
                class407.field5761.field1880 = 0;
            } catch (IOException var2) {
                class265.field3895 = true;
            }
        }
        class127.method769(0);
        if (arg0 <= 23) {
            method30(-115, 61L);
        }
    }
}
