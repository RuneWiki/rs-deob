import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class23 {

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lmb;")
    private static class132 field324 = class166.method1092("Ok", 118);

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lmb;")
    public static class132 field329 = class166.method1092("scrollbar", 115);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lmb;")
    private static class132 field320 = class166.method1092("Error connecting to server)3", 114);

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field323 = 0;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Lmb;")
    public static class132 field322 = field320;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "[I")
    public static int[] field328 = new int[] { 2, 2, 4, 2, 1, 8, 4 };

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Lmb;")
    public static class132 field330 = field324;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "[I")
    public static int[] field321;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static void method150(byte arg0) {
        field329 = null;
        field321 = null;
        field330 = null;
        field322 = null;
        field324 = null;
        field328 = null;
        if (arg0 != 0) {
            field320 = null;
        }
        field320 = null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static final void method151(byte arg0) {
        if (arg0 > -102) {
            return;
        }
        for (class77 var1 = (class77) class90.field1585.method119(true); var1 != null; var1 = (class77) class90.field1585.method125((byte) -109)) {
            if (var1.field1308 != null) {
                class36.field586.method1268(var1.field1308);
                var1.field1308 = null;
            }
            if (var1.field1310 != null) {
                class36.field586.method1268(var1.field1310);
                var1.field1310 = null;
            }
        }
        class90.field1585.method130(12040);
        field326++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)Laa;")
    public static final class2 method152(boolean arg0, int arg1) {
        class2 var2 = (class2) class130.field2409.method777(-1, (long) arg1);
        field325++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class150.field2744.method1079(1, 111, arg1);
        class2 var4 = new class2();
        if (var3 != null) {
            var4.method4(13791, arg1, new class112(var3));
        }
        class130.field2409.method774((long) arg1, var4, 0);
        if (!arg0) {
            field324 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[IZII)V")
    public static final void method153(int arg0, int[] arg1, boolean arg2, int arg3, int arg4) {
        arg3--;
        if (!arg2) {
            return;
        }
        int var8 = arg4 - 1;
        int var5 = var8 - 7;
        while (arg3 < var5) {
            int var6 = arg3 + 1;
            arg1[var6] = arg0;
            int var7 = var6 + 1;
            arg1[var7] = arg0;
            int var9 = var7 + 1;
            arg1[var9] = arg0;
            int var10 = var9 + 1;
            arg1[var10] = arg0;
            int var11 = var10 + 1;
            arg1[var11] = arg0;
            int var12 = var11 + 1;
            arg1[var12] = arg0;
            int var13 = var12 + 1;
            arg1[var13] = arg0;
            arg3 = var13 + 1;
            arg1[arg3] = arg0;
        }
        field327++;
        while (var8 > arg3) {
            arg3++;
            arg1[arg3] = arg0;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
    public static final void method154() {
        for (int var0 = 0; var0 < class231.field4167; var0++) {
            for (int var5 = 0; var5 < class225.field4079; var5++) {
                for (int var6 = 0; var6 < class14.field193; var6++) {
                    class101.field1900[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class136.field2552; var1++) {
            for (int var4 = 0; var4 < class136.field2562[var1]; var4++) {
                class136.field2555[var1][var4] = null;
            }
            class136.field2562[var1] = 0;
        }
        for (int var2 = 0; var2 < class148.field2724; var2++) {
            class216.field3944[var2] = null;
        }
        class148.field2724 = 0;
        for (int var3 = 0; var3 < class70.field1165.length; var3++) {
            class70.field1165[var3] = null;
        }
    }
}
