import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public abstract class class202 extends class651 {

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "Z")
    public boolean field2973 = false;

    @OriginalMember(owner = "client!rfa", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field2985 = new String[] { method1738(method1737("p\u0015\u001aq\u001cC[")), method1738(method1737("p\u0015\u001aq\fC[")), method1738(method1737("l\u0006\u00173")), method1738(method1737("y]Uq ")), method1738(method1737("p\u0015\u001aq\rC[")), method1738(method1737("p\u0015\u001aq\u000fC[")), method1738(method1737("p\u0015\u001aq\u0012C[")), method1738(method1737("\" A\u007f")) };

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
    public static int field2983 = 0;

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "B")
    public byte field2971;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "B")
    public byte field2981;

    @OriginalMember(owner = "client!rfa", name = "A", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!rfa", name = "u", descriptor = "I")
    public int field2969;

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!rfa", name = "y", descriptor = "I")
    public int field2974;

    @OriginalMember(owner = "client!rfa", name = "v", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!rfa", name = "x", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!rfa", name = "t", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "I")
    public int field2982;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "Lrfa;")
    public class202 field2977;

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "Lam;")
    public static class57 field2972;

    @OriginalMember(owner = "client!rfa", name = "w", descriptor = "Z")
    public boolean field2976;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II[Lta;I)I", line = 4)
    public final int method1732(int arg0, int arg1, class330[] arg2, int arg3) {
        try {
            field2967++;
            long var5 = class502.field7334[this.field2981][arg0][arg1];
            long var7 = 0L;
            int var9 = 0;
            while (var7 <= 48L) {
                int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
                if (var10 <= 0) {
                    break;
                }
                var7 += 16L;
                arg2[var9++] = class678.field9526[var10 - 1].field5573;
            }
            for (int var11 = var9; var11 < 4; var11++) {
                arg2[var11] = null;
            }
            if (arg3 != 16) {
                this.field2969 = -103;
            }
            return var9;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field2985[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field2985[2] : field2985[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V", line = 48)
    public static void method1733(byte arg0) {
        try {
            field2972 = null;
            if (arg0 != 98) {
                field2979 = -59;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2985[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "(I)I", line = 60)
    public int method1734(int arg0) {
        try {
            field2978++;
            if (arg0 != 13720) {
                this.field2981 = -123;
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2985[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 85)
    public static final int method1735(int arg0, String arg1, int arg2) {
        try {
            field2968++;
            int var3 = 38 % ((arg2 + 77) / 44);
            return class564.method4218(true, arg0, (byte) -102, arg1);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2985[5] + arg0 + ',' + (arg1 == null ? field2985[2] : field2985[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)Lue;", line = 104)
    public static final class90 method1736(int arg0, int arg1) {
        try {
            field2980++;
            class90 var2 = (class90) class752.field10732.method2730(true, (long) arg1);
            if (var2 != null) {
                return var2;
            }
            byte[] var3 = class788.field11371.method512(0, arg1, (byte) -61);
            if (var3 == null || var3.length <= 1) {
                return null;
            }
            class90 var4;
            try {
                var4 = class43.method476(-1001, var3);
            } catch (Exception var7) {
                throw new RuntimeException(var7.getMessage() + field2985[7] + arg1);
            }
            if (arg0 <= 65) {
                return null;
            } else {
                class752.field10732.method2734((long) arg1, -1, var4);
                return var4;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2985[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lha;I)V")
    public abstract void method586(class18 arg0, int arg1);

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(ZLha;)Lrs;")
    public abstract class297 method573(boolean arg0, class18 arg1);

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)Z")
    public abstract boolean method43(byte arg0);

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "(I)Z")
    public abstract boolean method46(int arg0);

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IBILrfa;ZILha;)V")
    public abstract void method40(int arg0, byte arg1, int arg2, class202 arg3, boolean arg4, int arg5, class18 arg6);

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "(B)V")
    public abstract void method44(byte arg0);

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "(Z)Z")
    public abstract boolean method579(boolean arg0);

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "(Z)Z")
    public abstract boolean method582(boolean arg0);

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(B)I")
    public abstract int method578(byte arg0);

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(Z)I")
    public abstract int method575(boolean arg0);

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B[Lta;)I")
    public abstract int method41(byte arg0, class330[] arg1);

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lha;B)Lsba;")
    public abstract class311 method587(class18 arg0, byte arg1);

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(Lha;B)Z")
    public abstract boolean method45(class18 arg0, byte arg1);

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lha;III)Z")
    public abstract boolean method580(class18 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1737(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1738(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 95;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
