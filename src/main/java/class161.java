import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class161 extends class439 {

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "[B")
    public byte[] field2435;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "[I")
    public static int[] field2439 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Lnd;")
    public static class380 field2437;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I", line = 5)
    public static final int method1166(String arg0, String arg1, int arg2, int arg3) {
        field2438++;
        int var4 = arg0.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var7 - var9 < var5) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var5 <= var7 - var9) {
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
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class224.method1485(var22, (byte) -82);
            var9 = class224.method1485(var24, (byte) -96);
            char var26 = class6.method46(arg2, var22, (byte) -122);
            char var27 = class6.method46(arg2, var24, (byte) -121);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class494.method2946(arg2, 241, var28) - class494.method2946(arg2, 241, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var17 = var4 - (var11 + 1);
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class494.method2946(arg2, 241, var20) - class494.method2946(arg2, 241, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        if (arg3 > -85) {
            field2437 = null;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class494.method2946(arg2, 241, var14) - class494.method2946(arg2, 241, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V", line = 128)
    public static void method1167(int arg0) {
        field2437 = null;
        if (arg0 != -20439) {
            field2439 = null;
        }
        field2439 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)I", line = 139)
    public static final int method1168(boolean arg0) {
        if (arg0) {
            method1166(null, null, -65, -19);
        }
        field2436++;
        if (class13.field221 == null) {
            if (!class314.field4487 && class106.field1669 > 0) {
                if (class76.field1245 && class351.field5334.method1767(81, (byte) 5) && class106.field1669 > 2) {
                    return ((class231) class246.field3563.field5279.field6396.field6396).field3369;
                }
                return ((class231) class246.field3563.field5279.field6396).field3369;
            }
            int var1 = class481.field7063.method713(118);
            int var2 = class481.field7063.method712(-31039);
            int var3 = class529.field7806;
            int var4 = class103.field1641;
            int var5 = class365.field5484;
            if (var3 < var1 && var3 + var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class106.field1669; var7++) {
                    if (class207.field2981) {
                        int var12 = (class106.field1669 - var7 - 1) * 16 + var4 + 33;
                        if (var12 - 13 < var2 && var2 <= (var12 + 3)) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class106.field1669 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > (var11 - 13) && var2 <= (var11 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class490 var9 = new class490(class246.field3563);
                    for (class231 var10 = (class231) var9.method2932(86); var10 != null; var10 = (class231) var9.method2931((byte) -60)) {
                        if (var6 == (var8++)) {
                            return var10.field3369;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([B)V", line = 231)
    public class161(byte[] arg0) {
        this.field2435 = arg0;
    }
}
