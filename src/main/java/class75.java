import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class75 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field1166 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field1164 = -1;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1170 = "Loading config - ";

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Lwd;")
    public static class23 field1169;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
    public static final int method592(int arg0, int arg1, String arg2, String arg3) {
        int var4 = arg2.length();
        field1167++;
        int var5 = 0;
        int var6 = arg3.length();
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var5 - var8) < var4 || var6 > (var7 - var9)) {
            if (var5 - var8 >= var4) {
                return -1;
            }
            if (var7 - var9 >= var6) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg2.charAt(var5++);
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
            var8 = class45.method385((byte) -125, var22);
            var9 = class45.method385((byte) -105, var24);
            char var26 = class88.method673(339, arg1, var22);
            char var27 = class88.method673(339, arg1, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class196.method1398(arg0 ^ 0x6BB3, var28, arg1) - class196.method1398(44, var29, arg1);
                }
            }
        }
        int var10 = Math.min(var4, var6);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var6 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg2.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class196.method1398(-53, var20, arg1) - class196.method1398(-88, var21, arg1);
                }
            }
        }
        int var12 = var4 - var6;
        if (var12 != 0) {
            return var12;
        }
        if (arg0 != -27644) {
            field1168 = 69;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class196.method1398(-75, var14, arg1) - class196.method1398(93, var15, arg1);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static void method593(byte arg0) {
        if (arg0 != -13) {
            method593((byte) -42);
        }
        field1169 = null;
        field1170 = null;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public static final void method594(byte arg0) {
        field1165++;
        boolean var1 = false;
        if (arg0 != -125) {
            return;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class14.field174 - 1); var2++) {
                if (class86.field1282[var2] < 1000 && class86.field1282[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class148.field2196[var2];
                    class148.field2196[var2] = class148.field2196[var2 + 1];
                    class148.field2196[var2 + 1] = var3;
                    String var4 = class68.field1082[var2];
                    class68.field1082[var2] = class68.field1082[var2 + 1];
                    class68.field1082[var2 + 1] = var4;
                    int var5 = class49.field803[var2];
                    class49.field803[var2] = class49.field803[var2 + 1];
                    class49.field803[var2 + 1] = var5;
                    int var6 = class240.field3812[var2];
                    class240.field3812[var2] = class240.field3812[var2 + 1];
                    class240.field3812[var2 + 1] = var6;
                    int var7 = class166.field2518[var2];
                    class166.field2518[var2] = class166.field2518[var2 + 1];
                    class166.field2518[var2 + 1] = var7;
                    short var8 = class86.field1282[var2];
                    class86.field1282[var2] = class86.field1282[var2 + 1];
                    class86.field1282[var2 + 1] = var8;
                    long var9 = class266.field4210[var2];
                    class266.field4210[var2] = class266.field4210[var2 + 1];
                    class266.field4210[var2 + 1] = var9;
                }
            }
        }
    }
}
