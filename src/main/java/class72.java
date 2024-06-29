import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class72 {

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "Z")
    public static boolean field1090 = false;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "Lmq;")
    public static class472 field1088 = new class472(4);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lwd;Z)[Lpc;")
    public static final class621[] method635(class248 arg0, boolean arg1) {
        field1093++;
        if (!arg0.method1516((byte) 122)) {
            return new class621[0];
        }
        class477 var2 = arg0.method1523(-15448);
        while (var2.field6693 == 0) {
            class151.method974((byte) -102, 10L);
        }
        if (var2.field6693 == 2) {
            return new class621[0];
        }
        if (arg1) {
            field1090 = true;
        }
        int[] var3 = (int[]) var2.field6695;
        class621[] var4 = new class621[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class621 var6 = new class621();
            var4[var5] = var6;
            var6.field8891 = var3[var5 << 2];
            var6.field8894 = var3[(var5 << 2) + 1];
            var6.field8896 = var3[(var5 << 2) + 2];
            var6.field8901 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljn;I)V")
    public static final void method636(class668 arg0, int arg1) {
        if (arg1 != -11694) {
            field1088 = null;
        }
        field1092++;
        class215.field2734 = arg0;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(CZLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method637(char arg0, boolean arg1, String arg2) {
        field1087++;
        int var3 = class191.method1176(arg2, arg0, 104);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        if (arg1) {
            method639(false, 79, 64);
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg0; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!gv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1086++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)Z")
    public final boolean method638(byte arg0) {
        field1091++;
        if (arg0 > -93) {
            this.toString();
        }
        return class475.field6651 == this | class207.field2532 == this;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZII)I")
    public static final int method639(boolean arg0, int arg1, int arg2) {
        field1089++;
        if (!arg0) {
            field1088 = null;
        }
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
    public static void method640(boolean arg0) {
        if (!arg0) {
            method637('\f', true, null);
        }
        field1088 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(FBZIIIIII)[[I")
    public static final int[][] method641(float arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1085++;
        int[][] var9 = new int[arg7][arg6];
        class263 var10 = new class263();
        var10.field3621 = arg5;
        var10.field3616 = arg4;
        var10.field3611 = (int) (arg0 * 4096.0F);
        var10.field3612 = arg3;
        if (arg1 >= -18) {
            return null;
        }
        var10.field3628 = arg2;
        var10.method358(45);
        class415.method2490(arg6, (byte) 33, arg7);
        for (int var11 = 0; var11 < arg7; var11++) {
            var10.method1600(true, var9[var11], var11);
        }
        return var9;
    }
}
