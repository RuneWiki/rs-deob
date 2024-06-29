import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class231 extends class141 {

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
    public static int[] field3979 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "[I")
    public static int[] field3981 = new int[1000];

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field3980 = 0;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field3983 = 0;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Lum;")
    public static class222 field3984;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Luh;", line = 7)
    public static final class67 method1637(int arg0) {
        field3978++;
        if (class126.field2221 >= class189.field3187.length) {
            return arg0 > -42 ? (class67) null : null;
        } else {
            return class189.field3187[class126.field2221++];
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 23)
    public static void method1638(byte arg0) {
        if (arg0 == 126) {
            field3979 = null;
            field3981 = null;
            field3984 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)Z", line = 38)
    public static final boolean method1639(int arg0, int arg1) {
        field3982++;
        if (arg0 != 2) {
            field3979 = (int[]) null;
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V", line = 53)
    public static final void method1640(byte arg0) {
        class138.method937(class194.field3290, 16);
        field3987++;
        class20.field260++;
        if (class36.field573 && class325.field5575) {
            int var1 = class202.field3471;
            int var2 = class211.field3702;
            int var3 = var1 - class4.field35;
            int var4 = var2 - class21.field289;
            if (class316.field5433 > var4) {
                var4 = class316.field5433;
            }
            if (class164.field2877 > var3) {
                var3 = class164.field2877;
            }
            if (class194.field3290.field1205 + var3 > class164.field2877 - -class237.field4109.field1205) {
                var3 = class164.field2877 + class237.field4109.field1205 - class194.field3290.field1205;
            }
            if ((class194.field3290.field1216 + var4) > (class316.field5433 + class237.field4109.field1216)) {
                var4 = class316.field5433 + class237.field4109.field1216 - class194.field3290.field1216;
            }
            if (arg0 <= 44) {
                method1639(-30, 103);
            }
            int var5 = var4 - class262.field4488;
            int var6 = var3 - class257.field4423;
            int var7 = class194.field3290.field1237;
            int var8 = var3 + class237.field4109.field1188 - class164.field2877;
            if (class20.field260 > class194.field3290.field1142 && (var7 < var5 || var5 < (-var7) || var7 < var6 || (-var7) > var6)) {
                class52.field845 = true;
            }
            int var9 = class237.field4109.field1146 + var4 - class316.field5433;
            if (class194.field3290.field1252 != null && class52.field845) {
                class331 var10 = new class331();
                var10.field5635 = class194.field3290.field1252;
                var10.field5648 = var9;
                var10.field5649 = class194.field3290;
                var10.field5638 = var8;
                class15.method92(var10, -93);
            }
            if (class272.field4579 == 0) {
                if (class52.field845) {
                    if (class194.field3290.field1194 != null) {
                        class331 var11 = new class331();
                        var11.field5646 = class166.field2911;
                        var11.field5635 = class194.field3290.field1194;
                        var11.field5648 = var9;
                        var11.field5638 = var8;
                        var11.field5649 = class194.field3290;
                        class15.method92(var11, -90);
                    }
                    if (class166.field2911 != null && client.method868(class194.field3290) != null) {
                        class61.field957.method1504(61, -1);
                        class61.field957.method1046(class166.field2911.field1172, -43);
                        class61.field957.method1102((byte) -122, class194.field3290.field1238);
                        class61.field957.method1099(class194.field3290.field1172, true);
                        class314.field5411++;
                        class61.field957.method1070(class166.field2911.field1238, (byte) 35);
                    }
                } else if ((class245.field4256 == 1 || class24.method157((byte) -121, class309.field5262 - 1)) && class309.field5262 > 2) {
                    class250.method1795(5);
                } else if (class309.field5262 > 0) {
                    class144.method980(-3);
                }
                class194.field3290 = null;
            }
        } else if (class20.field260 > 1) {
            class194.field3290 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V", line = 185)
    public class231(int arg0, int arg1) {
        this.field3977 = arg0;
        this.field3986 = arg1;
    }
}
