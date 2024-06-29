import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class336 {

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "[I")
    public static int[] field5229 = new int[500];

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public int field5224;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Lch;")
    public static class208 field5228;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Lve;")
    public class223 field5233;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "[I")
    public int[] field5226;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "[Lrj;")
    public static class269[] field5232;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 9)
    public static final String method2344(int arg0, long arg1) {
        if (arg0 != 23827) {
            method2347(99, 22);
        }
        field5231++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class318.field4922[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 63)
    public static final void method2345(boolean arg0) {
        field5230++;
        if (!arg0) {
            return;
        }
        if (!class110.method841((byte) 88) && class265.field4112 != class170.field2749) {
            class214.method1534(false, class265.field4112, class234.field3559, false, (byte) -103, class39.field575.field4744[0], class305.field4773, class39.field575.field4676[0]);
        } else if (class277.field4307 != class265.field4112 && class59.method417((byte) 30, class265.field4112)) {
            class277.field4307 = class265.field4112;
            class60.method420((byte) -116);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 87)
    public static void method2346(int arg0) {
        field5228 = null;
        field5229 = null;
        if (arg0 != 0) {
            method2344(-64, 61L);
        }
        field5232 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V", line = 110)
    public static final void method2347(int arg0, int arg1) {
        field5225++;
        if (arg1 != 17839) {
            field5229 = (int[]) null;
        }
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class242.method1678((byte) -128);
        } else if (arg0 == 2) {
            class333.method2334(arg1 ^ 0xF46);
        } else if (arg0 == 3) {
            class98.method739((byte) 88);
        } else {
            throw new RuntimeException();
        }
    }
}
