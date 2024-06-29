import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class203 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field3116 = 0;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3115 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3114;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "[[[I")
    public static int[][][] field3111;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1466(int arg0) {
        field3113++;
        if (class192.field2995 != null || arg0 <= 110 || class296.field4572 != null) {
            return;
        }
        int var1 = class305.field4751;
        if (!class330.field5089) {
            if (var1 == 1 && class32.field393 > 0) {
                short var2 = class118.field1843[class32.field393 - 1];
                if (var2 == 57 || var2 == 18 || var2 == 33 || var2 == 49 || var2 == 7 || var2 == 40 || var2 == 4 || var2 == 2 || var2 == 30 || var2 == 23 || var2 == 47 || var2 == 1003) {
                    int var3 = class25.field290[class32.field393 - 1];
                    int var4 = class323.field4993[class32.field393 - 1];
                    class161 var5 = class331.method2308((byte) 98, var4);
                    class4 var6 = client.method1012(var5);
                    if (var6.method28(false) || var6.method25(-1)) {
                        class8.field118 = false;
                        class61.field819 = 0;
                        if (class192.field2995 != null) {
                            class254.method1776(4, class192.field2995);
                        }
                        class192.field2995 = class331.method2308((byte) 87, var4);
                        class10.field144 = class47.field640;
                        class262.field4027 = class109.field1643;
                        class59.field788 = var3;
                        class254.method1776(4, class192.field2995);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class3.field35 == 1 && class32.field393 > 2 || class100.method756(-28475, class32.field393 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class32.field393 > 0 || class5.field65 == 1) {
                class147.method1112(false);
            }
            if (var1 == 1 && class32.field393 > 0 || class5.field65 == 2) {
                class114.method877(-128);
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class108.field1622;
            int var8 = class290.field4468;
            if ((class61.field821 - 10) > var8 || class61.field821 + class183.field2901 + 10 < var8 || var7 < (class205.field3145 - 10) || (class205.field3145 + class139.field2095 + 10) < var7) {
                class330.field5089 = false;
                class278.method1927(class139.field2095, class61.field821, (byte) -90, class205.field3145, class183.field2901);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class61.field821;
        int var10 = class205.field3145;
        int var11 = class183.field2901;
        int var12 = class109.field1643;
        int var13 = -1;
        int var14 = class47.field640;
        for (int var15 = 0; var15 < class32.field393; var15++) {
            if (class264.field4093) {
                int var16 = (class32.field393 - (var15 + 1)) * 15 + var10 + 33;
                if (var9 < var12 && var9 + var11 > var12 && (var16 - 13) < var14 && (var16 + 3) > var14) {
                    var13 = var15;
                }
            } else {
                int var17 = var10 + ((-var15 + class32.field393 + -1) * 15) + 31;
                if (var9 < var12 && var12 < (var9 + var11) && var14 > (var17 - 13) && (var17 + 3) > var14) {
                    var13 = var15;
                }
            }
        }
        if (var13 != -1) {
            class36.method277(-31421, var13);
        }
        class330.field5089 = false;
        class278.method1927(class139.field2095, class61.field821, (byte) -90, class205.field3145, class183.field2901);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 153)
    public static void method1467(byte arg0) {
        field3111 = (int[][][]) null;
        field3114 = null;
        field3115 = null;
        if (arg0 != 12) {
            method1469(6, 69);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 167)
    public static final void method1468(int arg0) {
        field3117++;
        if (class8.field120) {
            return;
        }
        if (arg0 != 10) {
            field3114 = (String) null;
        }
        class16.field207 = true;
        class8.field120 = true;
        if (class152.field2305) {
            class243.field3695 = (float) ((int) class243.field3695 - 65 & 0xFFFFFF80);
        } else {
            class101.field1459 += (-24.0F - class101.field1459) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V", line = 193)
    public static final void method1469(int arg0, int arg1) {
        class188 var2 = class147.method1111(-24, arg0, 5);
        field3112++;
        if (arg1 != 18) {
            method1466(-20);
        }
        var2.method1393((byte) -103);
    }
}
