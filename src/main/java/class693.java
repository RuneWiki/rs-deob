import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public abstract class class693 extends class182 {

    @OriginalMember(owner = "client!rda", name = "t", descriptor = "Z")
    public boolean field9980 = false;

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9988 = new String[] { method5037(method5036("\u0015L:1")), method5037(method5036("\t]7s\n:\u0011")), method5037(method5036("\u0000\u0017xs>")), method5037(method5036("\t]7s\u000b:\u0011")), method5037(method5036("\t]7s\u0005:\u0011")), method5037(method5036("\t]7s\u0004:\u0011")), method5037(method5036("\t]7s\t:\u0011")) };

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "I")
    public static int field9977 = 0;

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "B")
    public byte field9974;

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "B")
    public byte field9975;

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "I")
    public int field9970;

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
    public int field9972;

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "I")
    public int field9973;

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "I")
    public static int field9976;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
    public static int field9982;

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "I")
    public int field9983;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public int field9984;

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "I")
    public int field9985;

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "I")
    public static int field9986;

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "Lkaa;")
    public static class49 field9978;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "Lrda;")
    public class693 field9987;

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "Z")
    public boolean field9971;

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "[I")
    public static int[] field9979;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(I)Z")
    public abstract boolean method53(int arg0);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method5032(int arg0, int arg1, byte[] arg2) {
        try {
            field9981++;
            int var3 = 86 % ((arg1 + 30) / 45);
            byte[] var4 = new byte[arg0];
            class405.method3259(arg2, 0, var4, 0, arg0);
            return var4;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9988[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9988[0] : field9988[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(B)I")
    public abstract int method54(byte arg0);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLha;)V")
    public abstract void method40(byte arg0, class63 arg1);

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(ILha;)Z")
    public abstract boolean method1738(int arg0, class63 arg1);

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "(I)Z")
    public abstract boolean method45(int arg0);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZBIZI)V")
    public static final void method5033(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        try {
            class136.method1270(arg4, arg3, class696.field10027.length - 1, 0, (byte) -95, arg2, arg0);
            if (arg1 <= 53) {
                field9977 = 84;
            }
            field9982++;
            class620.field8959 = null;
            class747.field11031 = 0;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9988[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z[Lih;II)I")
    public final int method5034(boolean arg0, class731[] arg1, int arg2, int arg3) {
        try {
            field9986++;
            long var5 = class328.field5375[this.field9975][arg2][arg3];
            long var7 = 0L;
            int var9 = 0;
            while (var7 <= 48L) {
                int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
                if (var10 <= 0) {
                    break;
                }
                arg1[var9++] = class782.field11417[var10 - 1].field8782;
                var7 += 16L;
            }
            for (int var11 = var9; var11 < 4; var11++) {
                arg1[var11] = null;
            }
            if (!arg0) {
                this.method41((byte) 117);
            }
            return var9;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field9988[6] + arg0 + ',' + (arg1 == null ? field9988[0] : field9988[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)I")
    public abstract int method43(int arg0);

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "(I)V")
    public static void method5035(int arg0) {
        try {
            field9979 = null;
            field9978 = null;
            if (arg0 != 16) {
                field9977 = -26;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9988[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "([Lih;Z)I")
    public abstract int method1739(class731[] arg0, boolean arg1);

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(Lha;B)Lrga;")
    public abstract class250 method47(class63 arg0, byte arg1);

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)V")
    public abstract void method50(byte arg0);

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)Z")
    public abstract boolean method1737(int arg0);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIILha;)Z")
    public abstract boolean method46(int arg0, int arg1, int arg2, class63 arg3);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZILha;ILrda;II)V")
    public abstract void method48(boolean arg0, int arg1, class63 arg2, int arg3, class693 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lha;B)Lkv;")
    public abstract class281 method52(class63 arg0, byte arg1);

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "(B)Z")
    public abstract boolean method41(byte arg0);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)I")
    public int method3375(boolean arg0) {
        try {
            if (arg0) {
                this.method54((byte) -87);
            }
            field9976++;
            return 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9988[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5036(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5037(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 57;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 93;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
