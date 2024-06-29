import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class737 {

    @OriginalMember(owner = "client!is", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10502 = new String[] { method5353(method5352("Mf4m")), method5353(method5352("X=v/m")), method5353(method5352("J`vB8")), method5353(method5352("J`vC8")), method5353(method5352("J`v@8")) };

    @OriginalMember(owner = "client!is", name = "f", descriptor = "[[Z")
    public static boolean[][] field10499 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Lui;")
    public static class251 field10497 = new class251(128, 4);

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field10501 = 0;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field10498;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field10500;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Z")
    public static boolean field10496;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIZI)V", line = 5)
    public static final void method5349(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        try {
            field10500++;
            int var5 = 0;
            int var6 = arg1;
            int var7 = -arg1;
            class576.method4282(-7, arg4 - arg1, arg0, class529.field7682[arg2], arg4 + arg1);
            if (!arg3) {
                method5351(-91);
            }
            int var8 = -1;
            while (var6 > var5) {
                var8 += 2;
                var7 += var8;
                var5++;
                if (var7 >= 0) {
                    var6--;
                    var7 -= var6 << 1;
                    int[] var9 = class529.field7682[arg2 + var6];
                    int[] var10 = class529.field7682[arg2 - var6];
                    int var11 = arg4 + var5;
                    int var12 = arg4 - var5;
                    class576.method4282(-7, var12, arg0, var9, var11);
                    class576.method4282(-7, var12, arg0, var10, var11);
                }
                int var13 = arg4 + var6;
                int var14 = arg4 - var6;
                int[] var15 = class529.field7682[arg2 + var5];
                int[] var16 = class529.field7682[arg2 - var5];
                class576.method4282(-7, var14, arg0, var15, var13);
                class576.method4282(-7, var14, arg0, var16, var13);
            }
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field10502[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLvo;)Lvo;", line = 58)
    public static final class782 method5350(byte arg0, class782 arg1) {
        try {
            field10498++;
            if (arg1.field11136 != -1) {
                return class435.method3389(arg1.field11136, (byte) -123);
            }
            int var2 = arg1.field11158 >>> 16;
            if (arg0 < 75) {
                field10496 = false;
            }
            class168 var3 = new class168(class104.field1375);
            for (class509 var4 = (class509) var3.method1413(0); var4 != null; var4 = (class509) var3.method1414(13009)) {
                if (var4.field7472 == var2) {
                    return class435.method3389((int) var4.field8378, (byte) -117);
                }
            }
            return null;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10502[2] + arg0 + ',' + (arg1 == null ? field10502[0] : field10502[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V", line = 93)
    public static void method5351(int arg0) {
        try {
            field10497 = null;
            field10499 = null;
            int var1 = -86 % ((arg0 + 41) / 56);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10502[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5352(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!is", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5353(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
