import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class61 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field853 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lgf;")
    public static class126 field852;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
    public static final int method376(String arg0, int arg1, int arg2, String arg3) {
        int var4 = arg3.length();
        field851++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = arg0.length();
        char var8 = 0;
        char var9 = 0;
        while (var4 > var5 - var8 || var7 > (var6 - var9)) {
            if (var5 - var8 >= var4) {
                return -1;
            }
            if (var6 - var9 >= var7) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var5++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var6++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class69.method434(69, var22);
            var9 = class69.method434(69, var24);
            char var26 = class287.method1932((byte) -8, arg2, var22);
            char var27 = class287.method1932((byte) -95, arg2, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class85.method531(var28, 1620420900, arg2) - class85.method531(var29, 1620420900, arg2);
                }
            }
        }
        int var10 = Math.min(var4, var7);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var7 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg3.charAt(var16);
            char var19 = arg0.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class85.method531(var20, 1620420900, arg2) - class85.method531(var21, 1620420900, arg2);
                }
            }
        }
        int var12 = var4 - var7;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class85.method531(var14, 1620420900, arg2) - class85.method531(var15, 1620420900, arg2);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method377(int arg0) {
        if (arg0 != -1662) {
            method378(true);
        }
        field852 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    public static final void method378(boolean arg0) {
        if (arg0) {
            method376((String) null, -46, -23, (String) null);
        }
        field854++;
        for (class215 var1 = (class215) class41.field607.method990(-103); var1 != null; var1 = (class215) class41.field607.method993(-78)) {
            if (var1.field3239 == -1) {
                var1.field3244 = 0;
                class232.method1534(var1, (byte) -74);
            } else {
                var1.method1115(-122);
            }
        }
    }
}
