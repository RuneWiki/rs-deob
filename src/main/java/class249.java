import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class249 {

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Lue;")
    public static class91 field3768 = new class91(5000);

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3771 = "skill: ";

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public int field3773;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Lfa;")
    public class92 field3770;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "[I")
    public static int[] field3766;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "[I")
    public int[] field3769;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[Llf;")
    public static class94[] field3764;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)Lhf;")
    public static final class159 method1716(byte arg0) {
        field3772++;
        if (arg0 > -40) {
            return null;
        } else if (class46.field625 == null) {
            return null;
        } else {
            for (class159 var1 = (class159) class221.field3225.method815(7); var1 != null; var1 = (class159) class221.field3225.method815(7)) {
                class66 var2 = class206.method1458(var1.field2466, 22464);
                if (var2 != null && var2.field1013 && var2.method491(0)) {
                    return var1;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method1717(int arg0) {
        field3766 = null;
        field3768 = null;
        if (arg0 != -1) {
            field3766 = null;
        }
        field3771 = null;
        field3764 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZIIII)V")
    public static final void method1718(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3763++;
        int var5 = 0;
        int var6 = -arg2;
        int var7 = arg2;
        int var8 = -1;
        int var9 = class289.method1972(class264.field4230, (byte) 122, arg4 + arg2, class273.field4418);
        if (arg0) {
            field3765 = -11;
        }
        int var10 = class289.method1972(class264.field4230, (byte) 122, arg4 - arg2, class273.field4418);
        class89.method669(class104.field1795[arg3], arg1, var9, var10, (byte) -128);
        while (var5 < var7) {
            var8 += 2;
            var6 += var8;
            if (var6 > 0) {
                var7--;
                int var11 = arg3 - var7;
                int var12 = arg3 + var7;
                if (class73.field1156 <= var12 && class59.field859 >= var11) {
                    int var13 = class289.method1972(class264.field4230, (byte) 122, arg4 + var5, class273.field4418);
                    int var14 = class289.method1972(class264.field4230, (byte) 122, arg4 - var5, class273.field4418);
                    if (var12 <= class59.field859) {
                        class89.method669(class104.field1795[var12], arg1, var13, var14, (byte) -126);
                    }
                    if (var11 >= class73.field1156) {
                        class89.method669(class104.field1795[var11], arg1, var13, var14, (byte) -126);
                    }
                }
                var6 -= var7 << 1;
            }
            var5++;
            int var15 = arg3 + var5;
            int var16 = arg3 - var5;
            if (class73.field1156 <= var15 && var16 <= class59.field859) {
                int var17 = class289.method1972(class264.field4230, (byte) 122, arg4 + var7, class273.field4418);
                int var18 = class289.method1972(class264.field4230, (byte) 122, arg4 - var7, class273.field4418);
                if (var15 <= class59.field859) {
                    class89.method669(class104.field1795[var15], arg1, var17, var18, (byte) -123);
                }
                if (var16 >= class73.field1156) {
                    class89.method669(class104.field1795[var16], arg1, var17, var18, (byte) -125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Luj;Luj;I)V")
    public static final void method1719(class155 arg0, class155 arg1, int arg2) {
        field3762++;
        if (arg0.field2424 != null) {
            arg0.method1135(false);
        }
        arg0.field2420 = arg1.field2420;
        arg0.field2424 = arg1;
        if (arg2 == 0) {
            arg0.field2424.field2420 = arg0;
            arg0.field2420.field2424 = arg0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1720(boolean arg0, String arg1) {
        field3767++;
        if (class62.field939 == null || arg0) {
            return;
        }
        int var2 = 0;
        long var3 = class143.method1064((byte) -90, arg1);
        if (var3 == 0L) {
            return;
        }
        while (class62.field939.length > var2 && class62.field939[var2].field4008 != var3) {
            var2++;
        }
        if (var2 < class62.field939.length && class62.field939[var2] != null) {
            class144.field2338.method683(true, 75);
            class221.field3216++;
            class144.field2338.method382(902642416, class62.field939[var2].field4008);
        }
    }
}
