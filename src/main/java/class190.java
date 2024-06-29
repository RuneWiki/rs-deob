import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class190 {

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2622 = "Loaded sprites";

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "[Luj;")
    public static class209[] field2621;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIIBI)V", line = 9)
    public static final void method1329(int[] arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2619++;
        arg4--;
        if (arg3 >= -75) {
            return;
        }
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var11 = var10 + 1;
            arg0[var11] = arg2;
            int var12 = var11 + 1;
            arg0[var12] = arg2;
            int var13 = var12 + 1;
            arg0[var13] = arg2;
            arg4 = var13 + 1;
            arg0[arg4] = arg2;
        }
        while (var6 > arg4) {
            arg4++;
            arg0[arg4] = arg2;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Lbc;", line = 41)
    public static final class4 method1330(byte arg0) {
        class4 var1;
        if (class67.field908) {
            var1 = new class2(class154.field2136, class194.field2674, class209.field3002[0], class274.field4115[0], class323.field4903[0], class288.field4281[0], class209.field3012[0], class235.field3331);
        } else {
            var1 = new class258(class154.field2136, class194.field2674, class209.field3002[0], class274.field4115[0], class323.field4903[0], class288.field4281[0], class209.field3012[0], class235.field3331);
        }
        if (arg0 >= -52) {
            field2622 = (String) null;
        }
        field2623++;
        class236.method1624(101);
        return var1;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V", line = 58)
    public static void method1331(byte arg0) {
        field2622 = null;
        if (arg0 != -77) {
            field2622 = (String) null;
        }
        field2621 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 76)
    public static final int method1332(String arg0, byte arg1) {
        int var2 = -78 % ((arg1 + 40) / 60);
        field2618++;
        return class126.method911((byte) 21, 10, true, arg0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Lj;", line = 86)
    public static final class7 method1333(int arg0, int arg1, int arg2) {
        class202 var3 = class142.field1940[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2873;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)I", line = 94)
    public static int method1334(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
