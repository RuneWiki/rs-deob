import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class132 {

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "[I")
    public static int[] field1932;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "[I")
    public static int[] field1928;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "[I")
    public static int[] field1929;

    static {
        new class466("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field1932 = new int[] { 1, 2, 4, 8 };
        field1931 = 0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 5)
    public static void method902(int arg0) {
        field1929 = null;
        field1932 = null;
        field1928 = null;
        if (arg0 != 0) {
            method902(119);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lmg;Lya;B)V", line = 21)
    public static final void method904(class101 arg0, class38 arg1, byte arg2) {
        field1930++;
        class4[] var3 = class4.method24(arg0, class317.field4338, 0);
        class441.field6532 = new class16[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class441.field6532[var4] = arg1.method265(var3[var4], true);
        }
        class4[] var5 = class4.method24(arg0, class129.field1914, 0);
        class64.field807 = new class16[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class64.field807[var6] = arg1.method265(var5[var6], true);
        }
        class4[] var7 = class4.method24(arg0, class231.field3268, 0);
        class278.field3807 = new class16[var7.length];
        if (arg2 >= -126) {
            field1931 = 105;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class278.field3807[var8] = arg1.method265(var7[var8], true);
        }
        class4[] var9 = class4.method24(arg0, class211.field2942, 0);
        class372.field5448 = new class16[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class372.field5448[var10] = arg1.method265(var9[var10], true);
        }
        class4[] var11 = class4.method24(arg0, class261.field3631, 0);
        class183.field2681 = new class16[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class183.field2681[var12] = arg1.method265(var11[var12], true);
        }
        class4[] var13 = class4.method24(arg0, class175.field2598, 0);
        class528.field7802 = new class16[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class528.field7802[var14] = arg1.method265(var13[var14], true);
        }
        class4[] var15 = class4.method24(arg0, class147.field2125, 0);
        class50.field602 = new class16[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class50.field602[var16] = arg1.method265(var15[var16], true);
        }
        class4[] var17 = class4.method24(arg0, class514.field7608, 0);
        class526.field7788 = new class16[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class526.field7788[var18] = arg1.method265(var17[var18], true);
        }
        class4[] var19 = class4.method24(arg0, class267.field3682, 0);
        class30.field403 = new class16[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class30.field403[var20] = arg1.method265(var19[var20], true);
        }
        class4[] var21 = class4.method24(arg0, class388.field5651, 0);
        class157.field2386 = new class16[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class157.field2386[var22] = arg1.method265(var21[var22], true);
        }
        class4[] var23 = class4.method24(arg0, class202.field2847, 0);
        class474.field6928 = new class16[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class474.field6928[var24] = arg1.method265(var23[var24], true);
        }
        class4[] var25 = class4.method24(arg0, class433.field6348, 0);
        class134.field1947 = new class16[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class134.field1947[var26] = arg1.method265(var25[var26], true);
        }
        class400.field5878 = arg1.method265(class4.method22(arg0, class314.field4264, 0), true);
        class511.field7573 = arg1.method265(class4.method22(arg0, class325.field4414, 0), true);
        class4[] var27 = class4.method24(arg0, class17.field231, 0);
        class345.field4954 = new class16[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class345.field4954[var28] = arg1.method265(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 155)
    public static final String method906(byte arg0, Throwable arg1) throws IOException {
        field1927++;
        if (arg0 != 112) {
            field1929 = null;
        }
        String var2;
        if ((arg1 instanceof class306)) {
            class306 var3 = (class306) arg1;
            var2 = var3.field4172 + " | ";
            arg1 = var3.field4171;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Z")
    public abstract boolean method901(int arg0, int arg1);

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
    public abstract void method903(int arg0);

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Lkg;")
    public abstract class178 method905(int arg0);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public abstract void method907(byte arg0);
}
