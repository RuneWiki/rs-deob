import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class445 {

    @OriginalMember(owner = "client!ika", name = "c", descriptor = "Lke;")
    public static class622 field6326 = new class622(97, 6);

    @OriginalMember(owner = "client!ika", name = "e", descriptor = "Lke;")
    public static class622 field6328 = new class622(118, 6);

    @OriginalMember(owner = "client!ika", name = "g", descriptor = "I")
    public static int field6330 = 0;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!ika", name = "d", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!ika", name = "f", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(II)V", line = 4)
    public static final void method2678(int arg0, int arg1) {
        field6327++;
        int var2 = -84 % ((60 - arg1) / 59);
        class678 var3 = class630.method3597(29636, 1, (long) arg0);
        var3.method3836((byte) -100);
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(B)V", line = 19)
    public static void method2679(byte arg0) {
        field6326 = null;
        field6328 = null;
        if (arg0 >= -71) {
            field6330 = 57;
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)I", line = 30)
    public static final int method2680(int arg0) {
        if (arg0 < 54) {
            return 113;
        } else {
            field6325++;
            return class637.field8962++;
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(I[Ljava/lang/String;IZ)Ljava/lang/String;", line = 44)
    public static final String method2681(int arg0, String[] arg1, int arg2, boolean arg3) {
        field6324++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg1[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg2;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            if (!arg3) {
                field6329 = -128;
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }
}
