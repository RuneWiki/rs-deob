import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class77 {

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public int field891 = 0;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field892 = new String[] { method689(method688("N\f\u0011ii")), method689(method688("N\f\u0011ni")), method689(method688("FJ\u0011\u0003<")), method689(method688("S\u0011SA")), method689(method688("N\f\u0011oi")), method689(method688("N\f\u0011li")) };

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field886 = new BigInteger(method689(method688("\fT\u000f\u001dp")), 16);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[Lks;")
    public static class462[] field889 = new class462[128];

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 3)
    public static final void method684(int arg0) {
        try {
            field888++;
            int[] var1 = new int[class540.field7920.field9873];
            int var2 = 0;
            for (int var3 = 0; var3 < class540.field7920.field9873; var3++) {
                class530 var4 = class540.field7920.method5000(var3, (byte) 74);
                if (var4.field7749 >= 0 || var4.field7722 >= 0) {
                    var1[var2++] = var3;
                }
            }
            class319.field5048 = new int[var2];
            for (int var5 = arg0; var5 < var2; var5++) {
                class319.field5048[var5] = var1[var5];
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field892[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lib;B)V", line = 39)
    public final void method685(class163 arg0, byte arg1) {
        try {
            int var3 = -125 / ((21 - arg1) / 40);
            while (true) {
                int var4 = arg0.method1455((byte) 62);
                if (var4 == 0) {
                    field887++;
                    return;
                }
                this.method686(-79, var4, arg0);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field892[4] + (arg0 == null ? field892[3] : field892[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILib;)V", line = 66)
    private final void method686(int arg0, int arg1, class163 arg2) {
        try {
            if (arg1 == 5) {
                this.field891 = arg2.method1445((byte) 111);
            }
            if (arg0 > -43) {
                field886 = null;
            }
            field890++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field892[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field892[3] : field892[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V", line = 84)
    public static void method687(int arg0) {
        try {
            if (arg0 < 119) {
                field889 = null;
            }
            field886 = null;
            field889 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field892[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method688(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method689(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 45;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
