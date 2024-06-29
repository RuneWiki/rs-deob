import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class63 extends class134 {

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Ljava/lang/String;")
    public String field993;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Ljava/lang/String;")
    public static String field995 = "Drop";

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "[I")
    public static int[] field994 = new int[50];

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field997 = 0;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field996 = 0;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "Lub;")
    public static class92 field998;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "[Lel;")
    public static class213[] field991;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([II)[I")
    public static final int[] method505(int[] arg0, int arg1) {
        if (arg1 != 15) {
            method507(1);
        }
        field992++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class81.method637(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public static final void method506(boolean arg0) {
        int var1 = class237.field3737;
        field989++;
        int var2 = class259.field4109;
        int var3 = class209.field3233;
        int var4 = 6116423;
        int var5 = class272.field4345;
        class66.method532(var1, var2, var5, var3, var4);
        class66.method532(var1 + 1, var2 + 1, var5 - 2, 16, 0);
        class66.method533(var1 + 1, var2 - -18, var5 - 2, var3 + -19, 0);
        class73.field1118.method1810(class164.field2480, var1 + 3, var2 - -14, var4, -1);
        if (!arg0) {
            field991 = null;
        }
        int var6 = class157.field2340;
        int var7 = class171.field2587;
        for (int var8 = 0; var8 < class14.field174; var8++) {
            int var9 = (class14.field174 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var7 > var1 && var1 + var5 > var7 && var6 > (var9 - 13) && (var9 + 3) > var6) {
                var10 = 16776960;
            }
            class73.field1118.method1810(class151.method1097(true, var8), var1 + 3, var9, var10, 0);
        }
        class159.method1140(class209.field3233, class237.field3737, -26514, class272.field4345, class259.field4109);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public static void method507(int arg0) {
        field998 = null;
        field995 = null;
        if (arg0 != 14145) {
            method506(false);
        }
        field991 = null;
        field994 = null;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class63() {
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class63(String arg0) {
        this.field993 = arg0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILub;)V")
    public static final void method508(int arg0, class92 arg1) {
        class134.field2005 = arg1.method717(104, "runes");
        field990++;
        if (arg0 > -59) {
            method505((int[]) null, -46);
        }
    }
}
