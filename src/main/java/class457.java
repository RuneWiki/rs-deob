import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class457 extends class55 {

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "[J")
    public static long[] field6740 = new long[100];

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
    public static int field6743 = 0;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "Lio;")
    public static class439 field6746 = new class439(7, 2);

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public int field6738;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public int field6739;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "I")
    public int field6745;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    public int field6747;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "Lvd;")
    public static class39 field6748;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "Lns;")
    public class405 field6737;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "Lge;")
    public static class711 field6741;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "Ljava/awt/Image;")
    public static Image field6742;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "[Lpga;")
    public static class536[] field6749;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
    public static final int method2796(String arg0, int arg1, int arg2, String arg3) {
        field6744++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var5 > var7 - var9) {
            if (var4 <= (var6 - var8)) {
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
            var8 = class703.method3999(var22, (byte) 100);
            var9 = class703.method3999(var24, (byte) 18);
            char var26 = class729.method4117(arg1, var22, 125);
            char var27 = class729.method4117(arg1, var24, 66);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class370.method2275(true, var28, arg1) - class370.method2275(true, var29, arg1);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class370.method2275(true, var20, arg1) - class370.method2275(true, var21, arg1);
                }
            }
        }
        int var12 = var4 - var5;
        if (~var12 != arg2) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class370.method2275(true, var14, arg1) - class370.method2275(true, var15, arg1);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public static void method2797(int arg0) {
        if (arg0 != 0) {
            field6743 = -31;
        }
        field6748 = null;
        field6746 = null;
        field6740 = null;
        field6742 = null;
        field6741 = null;
        field6749 = null;
    }
}
