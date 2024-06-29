import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class64 extends class272 {

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field852;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "Ljava/lang/String;")
    public static String field849;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "Ljava/lang/String;")
    public String field857;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIII)I")
    public static final int method430(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field848++;
        int var5 = arg4 & 0xF;
        int var6 = var5 < 8 ? arg2 : arg3;
        if (arg1 != 17841) {
            method431((class364) null);
        }
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg0) : arg3;
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lwm;)V")
    public static final void method431(class364 arg0) {
        for (int var1 = class466.field6459; var1 < class142.field2056; var1++) {
            for (int var2 = 0; var2 < class143.field2058; var2++) {
                for (int var3 = 0; var3 < class91.field1344; var3++) {
                    class491 var4 = class289.field3897[var1][var2][var3];
                    if (var4 != null) {
                        class327 var5 = var4.field6864;
                        class327 var6 = var4.field6847;
                        if (var5 != null && var5.method17(7)) {
                            class408.method2455(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method17(7)) {
                                class408.method2455(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method2(0, 0, 0, arg0, false, var5, true);
                                var6.method8(-84);
                            }
                            var5.method8(-75);
                        }
                        for (class309 var7 = var4.field6845; var7 != null; var7 = var7.field4084) {
                            class471 var9 = var7.field4091;
                            if (var9 != null && var9.method17(7)) {
                                class408.method2455(arg0, var9, var1, var2, var3, var9.field6505 + 1 - var9.field6500, var9.field6497 - var9.field6491 + 1);
                                var9.method8(-119);
                            }
                        }
                        class354 var8 = var4.field6842;
                        if (var8 != null && var8.method17(7)) {
                            class246.method1379(arg0, var8, var1, var2, var3);
                            var8.method8(-79);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIZIII)V")
    public static final void method432(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field850++;
        class409[] var7 = class88.field1295;
        int var8 = 0;
        if (!arg3) {
            return;
        }
        while (var8 < var7.length) {
            class409 var9 = var7[var8];
            if (var9 != null && var9.field5598 == 2) {
                class377.method2316(arg5, var9.field5602, arg4 >> 1, (var9.field5612 - class266.field3511 << 7) + var9.field5599, var9.field5609 * 2, arg1 >> 1, (var9.field5595 - class162.field2260 << 7) + var9.field5593, arg0, -74);
                if (class168.field2324[0] > -1 && (class70.field968 % 20) < 10) {
                    class191.field2597[var9.field5611].method836(arg2 + class168.field2324[0] - 12, class168.field2324[1] + arg6 - 28);
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
    public static void method433(int arg0) {
        field852 = null;
        field849 = null;
        if (arg0 > -116) {
            field852 = null;
        }
    }

    static {
        new class206("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field852 = new String[100];
        field849 = null;
    }
}
