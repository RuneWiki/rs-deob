import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class90 extends class251 {

    @OriginalMember(owner = "client!oia", name = "q", descriptor = "I")
    public static int field1248 = 0;

    @OriginalMember(owner = "client!oia", name = "m", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!oia", name = "n", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!oia", name = "o", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!oia", name = "p", descriptor = "Lhu;")
    public static class134 field1247;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(II[Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method731(int arg0, int arg1, String[] arg2, boolean arg3) {
        field1244++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg2[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg1;
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            if (!arg3) {
                return null;
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "(I)V")
    public static void method732(int arg0) {
        if (arg0 >= -107) {
            field1245 = 88;
        }
        field1247 = null;
    }

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "(I)V")
    public static final void method733(int arg0) {
        field1246++;
        if (arg0 != -3930) {
            return;
        }
        for (class375 var1 = (class375) class297.field3910.method1156(0); var1 != null; var1 = (class375) class297.field3910.method1158(22706)) {
            if (var1.field4806) {
                var1.field4806 = false;
            } else {
                class386.method2194(var1.field4808, 125);
            }
        }
    }
}
