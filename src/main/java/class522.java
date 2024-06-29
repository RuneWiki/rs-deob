import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class522 {

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field7683 = -1;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lla;")
    public static class319 field7680 = new class319(65, 8);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 9)
    public static final int method3099(String arg0, int arg1) {
        field7679++;
        for (int var2 = arg1; var2 < class365.field5595.length; var2++) {
            if (class365.field5595[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "([[BILqq;)V", line = 26)
    public static final void method3100(byte[][] arg0, int arg1, class337 arg2) {
        if (arg1 != -12834) {
            return;
        }
        for (int var3 = 0; var3 < arg2.field3653; var3++) {
            class523.method3104((byte) -1);
            for (int var4 = 0; var4 < (class398.field6071 >> 3); var4++) {
                for (int var5 = 0; var5 < class528.field7734 >> 3; var5++) {
                    int var6 = class156.field2033[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x30BC411) >> 24;
                        if (!arg2.field3647 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = (var6 & 0xFFD002) >> 14;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class510.field7490.length; var12++) {
                                if (class510.field7490[var12] == var11 && arg0[var12] != null) {
                                    arg2.method2182(class400.field6090, var4 * 8, var5 * 8, class9.field174, (var9 & 0x7) * 8, (var10 & 0x7) * 8, var3, var7, arg0[var12], -6037, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field7682++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 98)
    public static void method3101(int arg0) {
        if (arg0 == 7) {
            field7680 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lkw;IIIII)V", line = 109)
    public static final void method3102(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field2247 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class411.field6251[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class189 var13 = class514.field7556[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field2247; var14++) {
                            if (arg0.field2245[var14] == var13.field2518) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field2245[arg0.field2247++] = var13.field2518;
                        if (arg0.field2247 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field2247; var15 < 4; var15++) {
            arg0.field2245[var15] = null;
        }
    }
}
