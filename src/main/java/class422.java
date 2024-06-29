import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class422 implements class376 {

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public int field6041;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field6046 = -50;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lsh;")
    public static class472 field6042 = new class472(81, 8);

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
    public static int[] field6043;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "[I")
    public static int[] field6047;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 4)
    public static void method2490(int arg0) {
        int var1 = -127 % ((arg0 + 22) / 59);
        field6043 = null;
        field6047 = null;
        field6042 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)V", line = 17)
    public static final void method2491(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            field6042 = null;
        }
        field6045++;
        String var4 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        class380.method2324(true, var4, false);
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 43)
    public class422(String arg0, int arg1) {
        this.field6041 = arg1;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I", line = 54)
    public static final int method2492(String arg0, int arg1, int arg2, String arg3) {
        field6044++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        if (arg1 != -1) {
            method2492((String) null, -36, 50, (String) null);
        }
        char var9 = 0;
        while (var6 - var8 < var4 || var5 > (var7 - var9)) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
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
            var8 = class45.method327(-104, var22);
            var9 = class45.method327(-109, var24);
            char var26 = class466.method2737(arg2, true, var22);
            char var27 = class466.method2737(arg2, true, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class105.method784((byte) 80, arg2, var28) - class105.method784((byte) -90, arg2, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
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
                    return class105.method784((byte) -63, arg2, var20) - class105.method784((byte) 68, arg2, var21);
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
                return class105.method784((byte) 87, arg2, var14) - class105.method784((byte) 99, arg2, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!sl", name = "toString", descriptor = "()Ljava/lang/String;", line = 179)
    public final String toString() {
        field6040++;
        throw new IllegalStateException();
    }
}
