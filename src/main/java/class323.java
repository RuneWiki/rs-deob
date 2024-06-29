import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class323 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "[Lom;")
    public static class125[] field4894 = new class125[14];

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4899 = "Starting 3d Library";

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "[I")
    public static int[] field4902 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field4898 = 0;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Ltd;")
    public static class283 field4897;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[I")
    public static int[] field4903;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 16)
    public static final void method2266(int arg0) {
        field4895++;
        if (arg0 <= 60) {
            field4903 = (int[]) null;
        }
        class1.field14.method724(0);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 41)
    public static final void method2267(String arg0, int arg1) {
        if (arg1 != -30901) {
            method2270(52);
        }
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field4901++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)Lii;", line = 58)
    public static final class115 method2268(int arg0, byte arg1) {
        field4900++;
        class115 var2 = (class115) class185.field2551.method365((long) arg0, 35);
        int var3 = -91 / ((arg1 + 33) / 60);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class272.field4081.method955(11, arg0, -21853);
        class115 var5 = new class115();
        if (var4 != null) {
            var5.method851(-152, new class316(var4));
        }
        class185.field2551.method369(0, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ltj;Z)V", line = 94)
    public static final void method2269(class258 arg0, boolean arg1) {
        field4904++;
        short var2 = 256;
        for (int var3 = 0; var3 < class47.field577.length; var3++) {
            class47.field577[var3] = 0;
        }
        if (!arg1) {
            method2266(40);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var2 * 128.0D * Math.random());
            class47.field577[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var2 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class317.field4836[var9] = (class47.field577[var9 - 1] + class47.field577[var9 + 1] + class47.field577[var9 + 128] + class47.field577[var9 + -128]) / 4;
                }
            }
            int[] var10 = class47.field577;
            class47.field577 = class317.field4836;
            class317.field4836 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field38; var12++) {
            for (int var13 = 0; var13 < arg0.field28; var13++) {
                if (arg0.field3809[var11++] != 0) {
                    int var14 = var13 + arg0.field40 + 16;
                    int var15 = arg0.field32 + var12 + 16;
                    int var16 = (var15 << 7) + var14;
                    class47.field577[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)I", line = 189)
    public static final int method2270(int arg0) {
        field4896++;
        if (class329.field4964 != null) {
            return 3;
        } else if (class67.field908 && class165.field2261) {
            return 2;
        } else {
            int var1 = 21 / ((arg0 + 59) / 52);
            return class67.field908 && !class165.field2261 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V", line = 209)
    public static void method2271(int arg0) {
        field4903 = null;
        field4899 = null;
        field4897 = null;
        field4902 = null;
        field4894 = null;
        if (arg0 != 284) {
            field4897 = (class283) null;
        }
    }
}
