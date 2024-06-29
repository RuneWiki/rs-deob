import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class502 extends class417 {

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field7116;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public int field7114;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field7113 = 0;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Lee;")
    public static class582 field7115 = new class582();

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[I")
    public static int[] field7119 = new int[1000];

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
    public static final int method2990(String arg0, int arg1, String arg2, int arg3) {
        field7118++;
        int var4 = arg2.length();
        int var5 = arg0.length();
        if (arg3 != 5168) {
            field7119 = null;
        }
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var5 > (var7 - var9)) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if (var5 <= var7 - var9) {
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
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class410.method2410(var22, -105);
            var9 = class410.method2410(var24, -109);
            char var26 = class329.method1997(var22, arg1, (byte) 111);
            char var27 = class329.method1997(var24, arg1, (byte) 113);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class453.method2757(var28, (byte) -34, arg1) - class453.method2757(var29, (byte) -34, arg1);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var5 - (var11 + 1);
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg2.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class453.method2757(var20, (byte) -34, arg1) - class453.method2757(var21, (byte) -34, arg1);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class453.method2757(var14, (byte) -34, arg1) - class453.method2757(var15, (byte) -34, arg1);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method2991(int arg0) {
        int var1 = -83 / ((67 - arg0) / 47);
        field7115 = null;
        field7119 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lgw;B)V")
    public static final void method2992(class148 arg0, byte arg1) {
        for (int var2 = 0; var2 < class18.field172; var2++) {
            int var4 = arg0.method1055(1957696096);
            int var5 = arg0.method1045(true);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class61.field769[var4] != null) {
                class61.field769[var4].field5525 = var5;
            }
        }
        field7117++;
        int var3 = 25 % ((-arg1 - 61) / 46);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(II)V")
    public class502(int arg0, int arg1) {
        this.field7116 = arg0;
        this.field7114 = arg1;
    }
}
