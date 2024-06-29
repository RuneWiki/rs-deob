import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class255 extends class217 {

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Ljava/lang/String;")
    public String field3809;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field3805 = 0;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field3812 = 0;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field3804 = 0;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Z")
    public static boolean field3813 = false;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static volatile int field3815 = 0;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3816;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "[I")
    public static int[] field3808;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "[Lob;")
    public static class292[] field3810;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 5)
    public static void method1780(int arg0) {
        if (arg0 > -116) {
            method1781((byte) -45, (class26) null);
        }
        field3808 = null;
        field3810 = null;
        field3816 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLna;)[Lqd;", line = 17)
    public static final class44[] method1781(byte arg0, class26 arg1) {
        field3803++;
        if (!arg1.method176(-5)) {
            return new class44[0];
        }
        class233 var2 = arg1.method165(14);
        while (var2.field3585 == 0) {
            class97.method768(10L, 76);
        }
        if (var2.field3585 == 2) {
            return new class44[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field3590);
        class44[] var4 = new class44[var3.length >> 2];
        int var5 = 0;
        if (arg0 > -46) {
            field3815 = -84;
        }
        while (var4.length > var5) {
            class44 var6 = new class44();
            var4[var5] = var6;
            var6.field691 = var3[var5 << 2];
            var6.field686 = var3[(var5 << 2) + 1];
            var6.field689 = var3[(var5 << 2) + 2];
            var6.field685 = var3[(var5 << 2) + 3];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lhb;I)V", line = 71)
    public static final void method1782(class35 arg0, int arg1) {
        field3807++;
        while (true) {
            while (arg0.field437.length > arg0.field455) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method273(65280) == 1) {
                    var2 = true;
                    var4 = arg0.method273(65280);
                    var3 = arg0.method273(65280);
                }
                int var5 = arg0.method273(65280);
                int var6 = arg0.method273(65280);
                int var7 = var5 * 64 - class69.field1018;
                int var8 = class318.field4932 + class193.field3089 - var6 * 64 - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class87.field1280 > var7 + 63 && class193.field3089 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var4 * 8 && var11 < var4 * 8 + 8 && var3 * 8 <= var12 && var12 < (var3 * 8 + 8)) {
                                byte var13 = arg0.method242((byte) -93);
                                if (var13 != 0) {
                                    if (class207.field3268[var9][var10] == null) {
                                        class207.field3268[var9][var10] = new byte[4096];
                                    }
                                    class207.field3268[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method242((byte) -93);
                                    if (class176.field2612[var9][var10] == null) {
                                        class176.field2612[var9][var10] = new byte[4096];
                                    }
                                    class176.field2612[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method242((byte) -93);
                        if (var16 != 0) {
                            arg0.field455++;
                        }
                    }
                }
            }
            int var17 = -41 / ((arg1 + 38) / 40);
            return;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V", line = 167)
    public class255() {
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 179)
    public class255(String arg0) {
        this.field3809 = arg0;
    }
}
