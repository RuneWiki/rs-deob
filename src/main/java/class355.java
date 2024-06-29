import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class355 {

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "B")
    public byte field4654;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public int field4644;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "Ljava/lang/String;")
    public String field4645;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "Ljava/lang/String;")
    public String field4647;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "Ljava/lang/String;")
    public String field4648;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4650;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "Ljava/lang/String;")
    public String field4651;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZILet;)V")
    public static final void method1996(int arg0, boolean arg1, int arg2, class509 arg3) {
        class129.field1591 = arg0;
        class260.field3358 = arg3;
        class612.field8881 = arg2;
        field4649++;
        if (arg1) {
            method1998((byte) 16);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZBZ)V")
    public static final void method1997(boolean arg0, byte arg1, boolean arg2) {
        field4646++;
        if (arg0) {
            class376.field5014++;
            class173.method968((byte) -76);
        }
        if (arg1 >= -44) {
            method1999(109);
        }
        if (arg2) {
            class450.field6237++;
            class371.method2078(true);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)[Lsn;")
    public static final class536[] method1998(byte arg0) {
        int var1 = 84 / ((arg0 + 58) / 62);
        field4643++;
        if (class319.field4065 == null) {
            class536[] var2 = class486.method2823(0, class74.field873);
            class536[] var3 = new class536[var2.length];
            int var4 = 0;
            label63: for (int var5 = 0; var5 < var2.length; var5++) {
                class536 var9 = var2[var5];
                if ((var9.field7522 <= 0 || var9.field7522 >= 24) && var9.field7519 >= 800 && var9.field7514 >= 600 && (class252.field3258 >= 96 || class529.field7429 != 0 || var9.field7519 <= 1024 && var9.field7514 <= 768)) {
                    for (int var10 = 0; var10 < var4; var10++) {
                        class536 var11 = var3[var10];
                        if (var9.field7519 == var11.field7519 && var9.field7514 == var11.field7514) {
                            if (var11.field7522 < var9.field7522) {
                                var3[var10] = var9;
                            }
                            continue label63;
                        }
                    }
                    var3[var4] = var9;
                    var4++;
                }
            }
            class319.field4065 = new class536[var4];
            class345.method1929(var3, 0, class319.field4065, 0, var4);
            int[] var6 = new int[class319.field4065.length];
            for (int var7 = 0; var7 < class319.field4065.length; var7++) {
                class536 var8 = class319.field4065[var7];
                var6[var7] = var8.field7519 * var8.field7514;
            }
            class461.method2685(var6, 0, class319.field4065);
        }
        return class319.field4065;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V")
    public static void method1999(int arg0) {
        field4650 = null;
        if (arg0 != 113) {
            field4650 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)Z")
    public static final boolean method2000(boolean arg0) {
        field4652++;
        if (arg0) {
            method1998((byte) -79);
        }
        return class279.field3666;
    }
}
