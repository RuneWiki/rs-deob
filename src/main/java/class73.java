import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class73 {

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1180 = "green:";

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lpj;")
    public static class284 field1187 = new class284();

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field1190 = 0;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "[B")
    public static byte[] field1192 = new byte[520];

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Lkk;")
    public static class106 field1191 = new class106();

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "[I")
    public static int[] field1189;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static final void method581(int arg0) {
        field1183++;
        if (class211.field3177 != null || class223.field3464 != null) {
            return;
        }
        int var1 = class295.field4482;
        if (class66.field1093) {
            if (var1 != 1) {
                int var7 = class12.field172;
                int var8 = class105.field1542;
                if ((class229.field3561 - 10) > var7 || class229.field3561 + class19.field333 + 10 < var7 || class67.field1116 - 10 > var8 || var8 > class67.field1116 - (-class106.field1561 - 10)) {
                    class66.field1093 = false;
                    class210.method1386(class229.field3561, class67.field1116, class106.field1561, (byte) 115, class19.field333);
                }
            }
            if (var1 == 1) {
                int var9 = class67.field1116;
                int var10 = class19.field333;
                int var11 = class229.field3561;
                int var12 = class87.field1317;
                int var13 = class157.field2303;
                int var14 = -1;
                for (int var15 = 0; var15 < class51.field826; var15++) {
                    if (class197.field2979) {
                        int var17 = (class51.field826 - var15 - 1) * 15 + (var9 + 33);
                        if (var13 > var11 && var10 + var11 > var13 && var12 > var17 - 13 && var12 < var17 + 3) {
                            var14 = var15;
                        }
                    } else {
                        int var16 = (class51.field826 - var15 - 1) * 15 + var9 + 31;
                        if (var13 > var11 && (var10 + var11) > var13 && var12 > var16 - 13 && (var16 + 3) > var12) {
                            var14 = var15;
                        }
                    }
                }
                if (var14 != -1) {
                    class198.method1325((byte) 10, var14);
                }
                class66.field1093 = false;
                class210.method1386(class229.field3561, class67.field1116, class106.field1561, (byte) 64, class19.field333);
            }
        } else {
            if (var1 == 1 && class51.field826 > 0) {
                short var2 = class265.field4147[class51.field826 - 1];
                if (var2 == 13 || var2 == 6 || var2 == 35 || var2 == 36 || var2 == 50 || var2 == 59 || var2 == 40 || var2 == 2 || var2 == 10 || var2 == 26 || var2 == 21 || var2 == 1006) {
                    int var3 = class260.field4000[class51.field826 - 1];
                    int var4 = class8.field96[class51.field826 - 1];
                    class297 var5 = class151.method1023(-30464, var4);
                    class296 var6 = client.method333(var5);
                    if (var6.method1951((byte) -121) || var6.method1955(93)) {
                        class248.field3849 = 0;
                        class11.field166 = false;
                        if (class211.field3177 != null) {
                            class297.method1979((byte) -97, class211.field3177);
                        }
                        class211.field3177 = class151.method1023(-30464, var4);
                        class172.field2525 = var3;
                        class253.field3902 = class157.field2303;
                        class259.field3970 = class87.field1317;
                        class297.method1979((byte) -84, class211.field3177);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class205.field3078 == 1 && class51.field826 > 2 || class181.method1188(class51.field826 - 1, 127))) {
                var1 = 2;
            }
            if (var1 == 2 && class51.field826 > 0 || class85.field1305 == 1) {
                class296.method1966(116);
            }
            if (var1 == 1 && class51.field826 > 0 || class85.field1305 == 2) {
                class287.method1905(0);
            }
        }
        if (arg0 < 100) {
            method586(115);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static void method582(int arg0) {
        int var1 = -107 / ((-arg0 - 24) / 57);
        field1189 = null;
        field1192 = null;
        field1180 = null;
        field1187 = null;
        field1191 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public static final void method583(int arg0, int arg1) {
        class159.field2317.method938(arg1, (byte) -123);
        class197.field2976.method938(arg1, (byte) -123);
        field1184++;
        if (arg0 != -1) {
            method582(4);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
    public abstract void method584(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method585(int arg0, byte arg1, int arg2) {
        field1186++;
        int var3 = arg0 - arg2;
        if (arg1 >= -75) {
            field1187 = null;
        }
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)[Ljd;")
    public static final class227[] method586(int arg0) {
        if (arg0 <= 54) {
            return null;
        }
        field1185++;
        class227[] var1 = new class227[class246.field3823];
        for (int var2 = 0; var2 < class246.field3823; var2++) {
            var1[var2] = new class46(client.field729, class126.field1857, class135.field1973[var2], class5.field69[var2], class27.field525[var2], class173.field2530[var2], class209.field3125[var2], class15.field221);
        }
        class293.method1936(-55);
        return var1;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V")
    public abstract void method587(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)V")
    public abstract void method588(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(III)V")
    public class73(int arg0, int arg1, int arg2) {
        this.field1188 = arg2;
        this.field1181 = arg0;
        this.field1182 = arg1;
    }
}
