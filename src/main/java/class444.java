import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class444 extends class227 {

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "Lao;")
    public static class191 field6460 = new class191(79, 12);

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "J")
    public static volatile long field6462 = 0L;

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
    public static int field6461 = 0;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "Lho;")
    public static class103 field6463;

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "Lwq;")
    public static class115 field6464;

    @OriginalMember(owner = "client!oo", name = "N", descriptor = "[I")
    public static int[] field6465;

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "[Lcc;")
    public static class516[] field6466;

    @OriginalMember(owner = "client!oo", name = "G", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
    public class444() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        field6458++;
        return arg0 == 15811 ? class4.field37 : null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)I")
    public static final int method2745(byte arg0, String arg1, String arg2, int arg3) {
        field6459++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        if (arg0 != -41) {
            method2745((byte) -4, null, null, -26);
        }
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var5 > (var7 - var9)) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if (var5 <= var7 - var9) {
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
            var8 = class64.method382(var22, (byte) -81);
            var9 = class64.method382(var24, (byte) -103);
            char var26 = class155.method928(var22, arg0 ^ 0xFFFFFFBB, arg3);
            char var27 = class155.method928(var24, 76, arg3);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class41.method239((byte) -20, var28, arg3) - class41.method239((byte) -43, var29, arg3);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class41.method239((byte) -71, var20, arg3) - class41.method239((byte) -65, var21, arg3);
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
                return class41.method239((byte) -85, var14, arg3) - class41.method239((byte) -37, var15, arg3);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(Z)V")
    public static void method2746(boolean arg0) {
        field6460 = null;
        field6463 = null;
        field6464 = null;
        if (!arg0) {
            method2746(true);
        }
        field6465 = null;
        field6466 = null;
    }

    static {
        new class242("", 73);
        field6463 = new class103(24, -1);
        field6464 = new class115(11, 16);
        field6465 = new int[14];
        field6466 = new class516[14];
    }
}
