import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class class352 {

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method2254(int arg0, byte arg1) {
        field5233++;
        if (arg1 != 15) {
            method2254(-99, (byte) 116);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I", line = 27)
    public static final int method2255(int arg0, String arg1, String arg2, int arg3) {
        field5234++;
        int var4 = arg2.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || (var7 - var9) < var5) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if (var7 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg2.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class287.method1931(var22, 113);
            var9 = class287.method1931(var24, 115);
            char var26 = class147.method1049(var22, arg0 ^ 0xFFFFFF19, arg3);
            char var27 = class147.method1049(var24, -231, arg3);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class256.method1808(var28, (byte) -121, arg3) - class256.method1808(var29, (byte) -93, arg3);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg2.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class256.method1808(var20, (byte) -52, arg3) - class256.method1808(var21, (byte) -55, arg3);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = arg0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class256.method1808(var14, (byte) -93, arg3) - class256.method1808(var15, (byte) -99, arg3);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lza;III)Z")
    public abstract boolean method109(class299 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILza;)V")
    public abstract void method98(int arg0, class299 arg1);

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)V")
    public abstract void method108(int arg0);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lza;IIILps;IZ)V")
    public abstract void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)Z")
    public abstract boolean method107(byte arg0);

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(ILza;)Lhp;")
    public abstract class293 method110(int arg0, class299 arg1);
}
