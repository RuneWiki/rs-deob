import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class420 extends class640 {

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Z")
    public boolean field6204 = false;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field6213 = new String[] { method3255(method3254("aP\u000e'\f-")), method3255(method3254("aP\u000e&\u000f-")), method3255(method3254("aP\u000e'\u000f-")), method3255(method3254("~\u0018\u000eA0")), method3255(method3254("aP\u000e(\u000f-")), method3255(method3254("kCL\u0003")) };

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Lwia;")
    public static class790 field6202 = new class790(17, 3);

    @OriginalMember(owner = "client!df", name = "v", descriptor = "B")
    public byte field6200;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "B")
    public byte field6205;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public int field6197;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public int field6199;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public int field6201;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public int field6206;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public int field6208;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public int field6211;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Lhe;")
    public static class389 field6209;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "Ldf;")
    public class420 field6207;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Z")
    public boolean field6212;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILha;B)Z")
    public abstract boolean method1091(int arg0, int arg1, class66 arg2, byte arg3);

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(ILha;)Z")
    public abstract boolean method631(int arg0, class66 arg1);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)Z")
    public abstract boolean method1098(boolean arg0);

    @OriginalMember(owner = "client!df", name = "i", descriptor = "(I)V")
    public abstract void method628(int arg0);

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(B)Z")
    public abstract boolean method625(byte arg0);

    @OriginalMember(owner = "client!df", name = "j", descriptor = "(I)I")
    public abstract int method1088(int arg0);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldf;IZIIILha;)V")
    public abstract void method627(class420 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class66 arg6);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([Luf;Z)I")
    public abstract int method630(class471[] arg0, boolean arg1);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
    public static void method3251(byte arg0) {
        try {
            field6202 = null;
            if (arg0 != 59) {
                method3253(-75);
            }
            field6209 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6213[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lha;I)Lcca;")
    public abstract class260 method1086(class66 arg0, int arg1);

    @OriginalMember(owner = "client!df", name = "k", descriptor = "(I)Z")
    public abstract boolean method629(int arg0);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)Z")
    public abstract boolean method1082(byte arg0);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(ILha;)V")
    public abstract void method1081(int arg0, class66 arg1);

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)I")
    public int method2346(int arg0) {
        try {
            if (arg0 != 1) {
                this.method631(37, null);
            }
            field6210++;
            return 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6213[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLha;)Ltf;")
    public abstract class310 method1094(byte arg0, class66 arg1);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([Luf;IIB)I")
    public final int method3252(class471[] arg0, int arg1, int arg2, byte arg3) {
        try {
            field6203++;
            long var5 = class546.field8158[this.field6200][arg1][arg2];
            long var7 = 0L;
            if (arg3 != 73) {
                this.method3252(null, -54, -105, (byte) 125);
            }
            int var9 = 0;
            while (var7 <= 48L) {
                int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
                if (var10 <= 0) {
                    break;
                }
                arg0[var9++] = class96.field1076[var10 - 1].field9313;
                var7 += 16L;
            }
            for (int var11 = var9; var11 < 4; var11++) {
                arg0[var11] = null;
            }
            return var9;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field6213[4] + (arg0 == null ? field6213[5] : field6213[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)I")
    public abstract int method1093(int arg0);

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
    public static final void method3253(int arg0) {
        try {
            if (class197.method1677((byte) -111, class138.field1645) || class212.method1866(4, class138.field1645)) {
                class768.method5538(13, class683.field9899 >> 12, 5000, class271.field4116 >> 12);
            } else {
                int var1 = class225.field3446.field3859[0] >> 3;
                int var2 = class225.field3446.field3863[0] >> 3;
                if (var1 >= 0 && var1 < (class648.field9378 >> 3) && var2 >= 0 && (class659.field9506 >> 3) > var2) {
                    class768.method5538(13, var2, 5000, var1);
                } else {
                    class768.method5538(13, class659.field9506 >> 4, 0, class648.field9378 >> 4);
                }
            }
            field6198++;
            class110.method962(false);
            class107.method940(arg0 ^ 0x4ACBA632);
            class769.method5549(121);
            class724.method5276(27);
            if (arg0 != 1776) {
                field6209 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6213[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3254(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!df", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3255(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 111;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
