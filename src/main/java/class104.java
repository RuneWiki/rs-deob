import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class104 {

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field1649 = 16777215;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Lgf;")
    public static class180 field1645 = new class180("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Lhh;")
    public static class84 field1648;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V", line = 3)
    public static void method789(int arg0) {
        field1648 = null;
        if (arg0 != 7083) {
            method790((byte) -110, 104, null);
        }
        field1645 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BILjava/util/Random;)I", line = 17)
    public static final int method790(byte arg0, int arg1, Random arg2) {
        field1646++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class390.method2453(arg0 - 2718, arg1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            if (arg0 != 90) {
                field1648 = null;
            }
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class387.method2437(var4, -69, arg1);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lak;B)I", line = 47)
    public static final int method791(class231 arg0, byte arg1) {
        if (arg1 >= -114) {
            field1645 = null;
        }
        field1647++;
        String var2 = class96.method766((byte) 114, arg0);
        int[] var3 = null;
        if (class219.method1455(arg0.field3368, -99)) {
            var3 = class8.field111.method3077(-126, (int) arg0.field3371).field2556;
        } else if (arg0.field3365 != -1) {
            var3 = class8.field111.method3077(-126, arg0.field3365).field2556;
        } else if (class32.method259(arg0.field3368, (byte) -42)) {
            class13 var6 = class132.field2030[(int) arg0.field3371];
            if (var6 != null) {
                class148 var7 = var6.field210;
                if (var7.field2193 != null) {
                    var7 = var7.method1059((byte) -51, class526.field7733);
                }
                if (var7 != null) {
                    var3 = var7.field2194;
                }
            }
        } else if (class358.method2308((byte) -17, arg0.field3368)) {
            Object var4 = null;
            class510 var5;
            if (arg0.field3368 == 1001) {
                var5 = class246.field3567.method609(118, (int) arg0.field3371);
            } else {
                var5 = class246.field3567.method609(112, (int) (arg0.field3371 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field7497 != null) {
                var5 = var5.method3027(class526.field7733, -12889);
            }
            if (var5 != null) {
                var3 = var5.field7488;
            }
        }
        if (var3 != null) {
            var2 = var2 + class168.method1193(var3, (byte) -57);
        }
        int var8 = class476.field6998.method100(126, class444.field6515, var2);
        if (arg0.field3363) {
            var8 += class507.field7414.method137() + 4;
        }
        return var8;
    }
}
