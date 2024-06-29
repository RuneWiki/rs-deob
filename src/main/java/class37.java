import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class37 {

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "Lhj;")
    public static class596 field553 = new class596(91, 9);

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "Llja;")
    public static class744 field554 = new class744(70, 2);

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field555 = -1;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "Lr;")
    public class196 field550;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "Liha;")
    public static class32 field548;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "Lka;")
    public class498 field549;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wv", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field556;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method327(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILha;)V", line = 6)
    public static final void method323(int arg0, class66 arg1) {
        field551++;
        int var2 = 0;
        int var3 = 0;
        if (class769.field10572) {
            var2 = class793.method4373((byte) 109);
            var3 = class719.method4070((byte) 106);
        }
        int var4 = -10660793;
        if (arg0 != -256) {
            method325((byte) 69, 87, 102);
        }
        class48.method449(class119.field1505, var4, class553.field7697, arg1, class705.field9916 + var2, -18, class676.field9279 + var3, -16777216);
        class452.field6380.method655(class705.field9916 + var2 + 3, class637.field8699.method3584(class770.field10592, true), class676.field9279 + var3 + 14, var4, -1, 62);
        int var5 = var2 + class738.field10291.method109(125);
        int var6 = class738.field10291.method117(true) + var3;
        if (class304.field3626) {
            int var7 = 0;
            for (class581 var8 = (class581) class365.field4542.method1003((byte) 53); var8 != null; var8 = (class581) class365.field4542.method1004(true)) {
                int var12 = var7 * 16 + class676.field9279 + var3 + 31;
                var7++;
                if (var8.field7927 == 1) {
                    class521.method3130(var5, class676.field9279 + var3, var6, arg1, -1, class553.field7697, (class75) var8.field7925.field1703.field1903, class119.field1505, (byte) -94, var12, class705.field9916 + var2, -256);
                } else {
                    class186.method1240(arg1, class119.field1505, var12, class676.field9279 + var3, var5, -256, var8, var6, -13, class705.field9916 + var2, class553.field7697, -1);
                }
            }
            if (class288.field3466 != null) {
                class48.method449(class189.field2275, var4, class711.field9978, arg1, class743.field10352, -18, class656.field9045, -16777216);
                int var9 = 0;
                class452.field6380.method655(class743.field10352 + 3, class288.field3466.field7922, class656.field9045 + 14, var4, -1, 62);
                for (class75 var10 = (class75) class288.field3466.field7925.method1003((byte) 53); var10 != null; var10 = (class75) class288.field3466.field7925.method1004(true)) {
                    int var11 = var9 * 16 + class656.field9045 + 31;
                    var9++;
                    class521.method3130(var5, class656.field9045, var6, arg1, -1, class711.field9978, var10, class189.field2275, (byte) -88, var11, class743.field10352, -256);
                }
                class377.method2210(false, class743.field10352, class189.field2275, class656.field9045, class711.field9978);
            }
        } else {
            int var13 = 0;
            for (class75 var14 = (class75) class5.field52.method2725(37); var14 != null; var14 = (class75) class5.field52.method2726(arg0 + 139)) {
                int var15 = (class245.field2894 - var13 - 1) * 16 + class676.field9279 + var3 + 31;
                class521.method3130(var5, class676.field9279 + var3, var6, arg1, -1, class553.field7697, var14, class119.field1505, (byte) -104, var15, class705.field9916 + var2, -256);
                var13++;
            }
        }
        class377.method2210(false, class705.field9916 + var2, class119.field1505, class676.field9279 + var3, class553.field7697);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V", line = 95)
    public static void method324(boolean arg0) {
        field553 = null;
        if (!arg0) {
            method323(-13, null);
        }
        field548 = null;
        field554 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BII)Z", line = 108)
    public static final boolean method325(byte arg0, int arg1, int arg2) {
        if (arg0 > -61) {
            field554 = null;
        }
        field552++;
        return class74.method692(0, arg2, arg1) & (class226.method1386(arg2, arg1, true) | (arg2 & 0x2000) != 0 | class366.method2133(arg2, arg1, 117));
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 124)
    public static final boolean method326(byte arg0, String arg1) {
        field547++;
        if (arg0 <= 101) {
            field554 = null;
        }
        return class546.method3214((byte) 44, arg1, field556 == null ? (field556 = method327("jh")) : field556);
    }
}
