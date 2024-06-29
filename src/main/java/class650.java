import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class650 implements class285 {

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "Lsba;")
    private class200 field9118 = new class200(128);

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "[I")
    private int[] field9117 = new int[class566.field8134.field7473];

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "[I")
    public int[] field9116 = new int[class566.field8134.field7473];

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Ljava/lang/String;")
    public static String field9102 = "";

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Lhga;")
    public static class158 field9103 = new class158(7, -1);

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Z")
    public static final boolean method3744(int arg0, int arg1) {
        if (arg0 != -13) {
            method3753(45, null, true, null, 96, null);
        }
        field9109++;
        return arg1 == 10 || arg1 == 11 || arg1 == 12;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method3745(int arg0) {
        field9103 = null;
        field9102 = null;
        if (arg0 != -27312) {
            method3754(93, 42, -78, true, -61);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIB)V")
    public final void method3746(int arg0, int arg1, byte arg2) {
        field9119++;
        class507 var4 = class585.field8317.method721(arg0, (byte) 94);
        int var5 = var4.field7398;
        int var6 = var4.field7395;
        if (arg2 != -30) {
            this.field9118 = null;
        }
        int var7 = var4.field7399;
        int var8 = class286.field4547[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method3749(arg1 << var6 & var9 | ~var9 & this.field9116[var5], 0, var5);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
    public final void method3747(int arg0, int arg1, int arg2) {
        field9107++;
        if (arg2 != 0) {
            field9102 = null;
        }
        this.field9117[arg0] = arg1;
        class573 var4 = (class573) this.field9118.method1558((long) arg0, (byte) -93);
        if (var4 == null) {
            class573 var5 = new class573(4611686018427387905L);
            this.field9118.method1564((long) arg0, var5, (byte) 103);
        } else if (var4.field8181 != 4611686018427387905L) {
            var4.field8181 = class112.method1033(-11752) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)I")
    public final int method2031(byte arg0, int arg1) {
        field9108++;
        class507 var3 = class585.field8317.method721(arg1, (byte) -82);
        int var4 = var3.field7398;
        int var5 = var3.field7395;
        int var6 = var3.field7399;
        int var7 = -110 / ((arg0 + 25) / 63);
        int var8 = class286.field4547[var6 - var5];
        return var8 & this.field9116[var4] >> var5;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public final void method3748(byte arg0) {
        if (arg0 >= -15) {
            method3754(-17, -53, 109, false, 31);
        }
        for (int var2 = 0; var2 < class566.field8134.field7473; var2++) {
            class400 var3 = class566.field8134.method3114(var2, 0);
            if (var3 != null && var3.field6179 == 0) {
                this.field9117[var2] = 0;
                this.field9116[var2] = 0;
            }
        }
        field9113++;
        this.field9118 = new class200(128);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V")
    public final void method3749(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field9117 = null;
        }
        field9110++;
        this.field9116[arg2] = arg0;
        class573 var4 = (class573) this.field9118.method1558((long) arg2, (byte) -93);
        if (var4 == null) {
            class573 var5 = new class573(class112.method1033(-11752) + 500L);
            this.field9118.method1564((long) arg2, var5, (byte) 78);
        } else {
            var4.field8181 = class112.method1033(-11752) + 500L;
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(III)V")
    public final void method3750(int arg0, int arg1, int arg2) {
        if (arg1 <= 52) {
            this.field9117 = null;
        }
        field9105++;
        class507 var4 = class585.field8317.method721(arg0, (byte) -93);
        int var5 = var4.field7398;
        int var6 = var4.field7395;
        int var7 = var4.field7399;
        int var8 = class286.field4547[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method3747(var5, this.field9117[var5] & ~var9 | arg2 << var6 & var9, 0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BZ)I")
    public final int method3751(byte arg0, boolean arg1) {
        if (arg0 < 0) {
            this.method3747(-49, 12, -39);
        }
        field9115++;
        long var3 = class112.method1033(-11752);
        for (class573 var5 = arg1 ? (class573) this.field9118.method1556(107) : (class573) this.field9118.method1559(114); var5 != null; var5 = (class573) this.field9118.method1559(104)) {
            if ((var5.field8181 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field8181 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field844;
                    this.field9116[var6] = this.field9117[var6];
                    var5.method707((byte) -73);
                    return var6;
                }
                var5.method707((byte) -35);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)I")
    public final int method2032(byte arg0, int arg1) {
        field9104++;
        int var3 = 93 % ((arg0 - 55) / 60);
        return this.field9116[arg1];
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;")
    public static final String method3752(byte arg0, String arg1, String arg2, char arg3) {
        field9112++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg1.indexOf(arg3, var8);
                if (var8 < 0) {
                    break;
                }
                var8++;
                var6 += var7;
            }
        }
        if (arg0 != 118) {
            field9102 = null;
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg1.indexOf(arg3, var10);
            if (var11 < 0) {
                var9.append(arg1.substring(var10));
                return var9.toString();
            }
            var9.append(arg1.substring(var10, var11));
            var9.append(arg2);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[IZLrr;I[I)Lue;")
    public static final class213 method3753(int arg0, int[] arg1, boolean arg2, class332 arg3, int arg4, int[] arg5) {
        if (!arg2) {
            field9102 = null;
        }
        field9114++;
        if (!arg3.method164(class134.field2197, class203.field3311, 95)) {
            int[] var10 = new int[arg0 * arg4];
            for (int var11 = 0; var11 < arg4; var11++) {
                int var12 = arg0 * var11 + arg5[var11];
                for (int var13 = 0; var13 < arg1[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class213(arg3, arg0, arg4, var10);
        }
        byte[] var6 = new byte[arg0 * arg4];
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg0 * var7 + arg5[var7];
            for (int var9 = 0; var9 < arg1[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class213(arg3, arg0, arg4, var6);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIZI)V")
    public static final void method3754(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            return;
        }
        field9111++;
        if (arg1 != 8 && arg1 != 16) {
            class252 var5 = class454.field6818[arg2][arg4][arg0];
            if (var5 != null) {
                if (arg1 == 1) {
                    var5.field4032 = 0;
                } else if (arg1 == 2) {
                    var5.field4020 = 0;
                }
            }
            client.method1939(-65);
            return;
        }
        for (int var6 = 0; var6 < class102.field1684; var6++) {
            class686 var7 = class678.field9535[var6];
            if (var7.field9618 == arg1 && var7.field9620 == arg4 && var7.field9611 == arg0 || var7.field9615 == arg4 && var7.field9611 == arg0) {
                if (class102.field1684 != var6) {
                    class398.method2564(class678.field9535, var6 + 1, class678.field9535, var6, class678.field9535.length - var6 - 1);
                }
                class102.field1684--;
                return;
            }
        }
    }
}
