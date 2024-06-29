import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class242 {

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "Lwea;")
    public static class90 field3548 = new class90();

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "[Lei;")
    public static class508[] field3547;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I", line = 8)
    public static final int method1563(int arg0, String arg1, String arg2, int arg3) {
        field3551++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        if (arg0 != 1) {
            field3550 = -9;
        }
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var7 - var9 < var5) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class498.method2979(var22, 198);
            var9 = class498.method2979(var24, 198);
            char var26 = class440.method2570(-14280, arg3, var22);
            char var27 = class440.method2570(-14280, arg3, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class539.method3173(-28216, arg3, var28) - class539.method3173(-28216, arg3, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - (var11 + 1);
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg1.charAt(var16);
            char var19 = arg2.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class539.method3173(-28216, arg3, var20) - class539.method3173(-28216, arg3, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class539.method3173(arg0 - 28217, arg3, var14) - class539.method3173(-28216, arg3, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(CI)Z", line = 132)
    public static final boolean method1564(char arg0, int arg1) {
        field3552++;
        if (arg1 != 1) {
            method1563(-111, null, null, -47);
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I[SB)[S", line = 147)
    public static final short[] method1565(int arg0, short[] arg1, byte arg2) {
        field3549++;
        short[] var3 = new short[arg0];
        if (arg2 != -114) {
            method1565(67, null, (byte) 100);
        }
        class553.method3241(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V", line = 166)
    public static void method1566(byte arg0) {
        if (arg0 != 95) {
            method1566((byte) 11);
        }
        field3547 = null;
        field3548 = null;
    }
}
