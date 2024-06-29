import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class223 extends class28 {

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
    public static int field3982 = 0;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "Lvf;")
    public static class265 field3988 = class87.method582(-46, " est d-Bj-9 dans votre liste d(Wamis)3");

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public int field3985;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    private int field3986;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "Lvf;")
    public class265 field3980;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)Lvf;")
    public static final class265 method1513(int arg0) {
        class265 var1 = class4.field66;
        class265 var2 = class30.field762;
        field3983++;
        if (~class264.field4601 != arg0) {
            var2 = class49.field1047;
        }
        if (class163.field2963 != null) {
            var1 = class148.method1022(10, new class265[] { class169.field3054, class163.field2963 });
        }
        return class148.method1022(arg0 ^ 0xFFFFFFF5, new class265[] { class120.field2128, var2, class130.field2345, class241.method1609(true, class44.field971), class27.field717, class241.method1609(true, class23.field675), var1, class141.field2624 });
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lng;B)V")
    public final void method1514(class135 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method920((byte) 59);
            if (var3 == 0) {
                if (arg1 <= 126) {
                    method1513(-105);
                }
                field3987++;
                return;
            }
            this.method1518((byte) -75, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V")
    public static void method1515(int arg0) {
        field3988 = null;
        if (arg0 < 17) {
            field3978 = -49;
        }
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)Z")
    public final boolean method1516(int arg0) {
        field3989++;
        if (arg0 >= -45) {
            method1515(-30);
        }
        return this.field3986 == 115;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1517(Throwable arg0, int arg1) throws IOException {
        field3977++;
        String var3;
        if (arg0 instanceof class51) {
            class51 var2 = (class51) arg0;
            var3 = var2.field1076 + " | ";
            arg0 = var2.field1067;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg1 != 1) {
            return null;
        }
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLng;I)V")
    private final void method1518(byte arg0, class135 arg1, int arg2) {
        if (arg0 >= -12) {
            method1515(125);
        }
        field3981++;
        if (arg2 == 1) {
            this.field3986 = arg1.method920((byte) 112);
        } else if (arg2 == 2) {
            this.field3985 = arg1.method949(3933);
        } else if (arg2 == 5) {
            this.field3980 = arg1.method942(false);
        }
    }

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)V")
    public static final void method1519(int arg0) {
        if (arg0 != -2) {
            return;
        }
        if (class94.field1673 != null) {
            class190 var1 = class94.field1673;
            synchronized (class94.field1673) {
                class94.field1673 = null;
            }
        }
        field3979++;
    }
}
