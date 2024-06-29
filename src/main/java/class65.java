import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class65 extends class67 {

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "Li;")
    private static class88 field1178 = class208.method1425(105, "Please reload this page)3");

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field1182 = 0;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "Li;")
    private static class88 field1181 = class208.method1425(105, "Examine");

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field1183 = 255;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "Li;")
    public static class88 field1174 = field1181;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "Li;")
    public static class88 field1186 = field1178;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field1185 = 0;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "Lnb;")
    public static class144 field1176;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "Lq;")
    public static class174 field1177;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lhj;B)V")
    public static final void method453(class87 arg0, byte arg1) {
        field1184++;
        if (class36.field625 == 1) {
            short var2 = 280;
            if (var2 <= class226.field4241 && class226.field4241 <= var2 + 14 && class172.field3341 >= 4 && class172.field3341 <= 18) {
                class90.method657(0, 0, -8902);
                return;
            }
            if (var2 + 15 <= class226.field4241 && class226.field4241 <= var2 + 80 && class172.field3341 >= 4 && class172.field3341 <= 18) {
                class90.method657(0, 1, -8902);
                return;
            }
            short var3 = 390;
            if (class226.field4241 >= var3 && var3 + 14 >= class226.field4241 && class172.field3341 >= 4 && class172.field3341 <= 18) {
                class90.method657(1, 0, -8902);
                return;
            }
            if (var3 + 15 <= class226.field4241 && var3 + 80 >= class226.field4241 && class172.field3341 >= 4 && class172.field3341 <= 18) {
                class90.method657(1, 1, -8902);
                return;
            }
            short var4 = 500;
            if (class226.field4241 >= var4 && class226.field4241 <= var4 + 14 && class172.field3341 >= 4 && class172.field3341 <= 18) {
                class90.method657(2, 0, -8902);
                return;
            }
            if (var4 + 15 <= class226.field4241 && class226.field4241 <= var4 + 80 && class172.field3341 >= 4 && class172.field3341 <= 18) {
                class90.method657(2, 1, -8902);
                return;
            }
            short var5 = 610;
            if (class226.field4241 >= var5 && var5 + 14 >= class226.field4241 && class172.field3341 >= 4 && class172.field3341 <= 18) {
                class90.method657(3, 0, -8902);
                return;
            }
            if (var5 + 15 <= class226.field4241 && class226.field4241 <= var5 + 80 && class172.field3341 >= 4 && class172.field3341 <= 18) {
                class90.method657(3, 1, -8902);
                return;
            }
            if (class226.field4241 >= 700 && class172.field3341 >= 4 && class226.field4241 <= 758 && class172.field3341 <= 20) {
                class209.field3961 = false;
                class221.method1495(35);
                return;
            }
            if (class87.field1581 != -1) {
                class70 var6 = class202.field3847[class87.field1581];
                if (class67.field1215 == var6.field1257) {
                    byte[] var7 = class166.method1142(new class88[] { var6.field1262, class206.field3924 }, -3).method613(-114);
                    class95.field1761 = new String(var7, 0, var7.length);
                    class28.field470 = var6.field1261;
                    if (class115.field2073 != 0) {
                        class49.field911 = 443;
                        class115.field2073 = 0;
                        class168.field3248 = 43594;
                        class220.field4158 = 43594;
                    }
                    class209.field3961 = false;
                    class221.method1495(35);
                    return;
                }
                class88 var8 = class166.method1142(new class88[] { class95.field1772, var6.field1262, class159.field3078, class170.method1214(class126.field2350, -80), class4.field63, class170.method1214(class245.field4499 ? 1 : 0, -116), class2.field21, class170.method1214(class143.field2659, -102), class74.field1351, class170.method1214(class70.field1281, -89) }, -3);
                try {
                    arg0.getAppletContext().showDocument(var8.method606(true), "_self");
                } catch (Exception var10) {
                }
            }
        }
        int var9 = -105 / ((51 - arg1) / 36);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public static void method454(int arg0) {
        field1174 = null;
        field1177 = null;
        field1181 = null;
        field1186 = null;
        int var1 = -4 % ((19 - arg0) / 58);
        field1178 = null;
        field1176 = null;
    }
}
