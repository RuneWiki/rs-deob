import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class313 {

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    public static int field4507 = 0;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)V")
    public static final void method2025(int arg0, int arg1) {
        field4509++;
        if (arg1 == -1 || !class451.field6154[arg1]) {
            return;
        }
        class422.field5876.method1071(arg1, (byte) 79);
        class328.field4799[arg1] = null;
        class421.field5864[arg1] = null;
        int var2 = 22 % ((4 - arg0) / 52);
        class451.field6154[arg1] = false;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)Z")
    public static final boolean method2026(int arg0, int arg1, int arg2) {
        field4506++;
        if (arg1 != 3550) {
            method2027(null, 73, 22, null);
        }
        return (class645.field9140[1][arg2][arg0] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
    public static final int method2027(String arg0, int arg1, int arg2, String arg3) {
        field4510++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = (char) arg2;
        while (var6 - var8 < var4 || var5 > (var7 - var9)) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg3.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class613.method3373((byte) -85, var22);
            var9 = class613.method3373((byte) -85, var24);
            char var26 = class84.method474(64, var22, arg1);
            char var27 = class84.method474(arg2 ^ 0x19, var24, arg1);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class210.method1316(arg2 ^ 0x3708, arg1, var28) - class210.method1316(14088, arg1, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg0.charAt(var16);
            char var19 = arg3.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class210.method1316(14088, arg1, var20) - class210.method1316(14088, arg1, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class210.method1316(14088, arg1, var14) - class210.method1316(14088, arg1, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Ljava/net/Socket;II)Ldn;")
    public static final class140 method2028(Socket arg0, int arg1, int arg2) throws IOException {
        if (arg1 == -2593) {
            field4508++;
            return new class257(arg0, arg2);
        } else {
            return null;
        }
    }
}
