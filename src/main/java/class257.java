import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class257 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public int field4155;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public int field4158;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public int field4161;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Z")
    public final boolean method1727(byte arg0) {
        field4160++;
        int var2 = -30 % ((arg0 - 26) / 33);
        return (this.field4161 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z")
    public final boolean method1728(int arg0) {
        if (arg0 != -32729) {
            method1729((class211) null, -107);
        }
        field4153++;
        return (this.field4161 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lag;I)Ljava/lang/String;")
    public static final String method1729(class211 arg0, int arg1) {
        int var2 = -126 % ((8 - arg1) / 58);
        field4154++;
        if (client.method2015(arg0).method1529(124) == 0) {
            return null;
        } else if (arg0.field3386 == null || arg0.field3386.trim().length() == 0) {
            return class176.field2877 ? "Hidden-use" : null;
        } else {
            return arg0.field3386;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Z")
    public final boolean method1730(boolean arg0) {
        field4152++;
        if (arg0) {
            return (this.field4161 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V")
    public static final void method1731(boolean arg0) {
        class117.method834(client.field4857, (byte) -57);
        field4156++;
        class280.field4484++;
        if (class2.field34 && class121.field1926) {
            int var1 = class269.field4344;
            int var2 = var1 - class151.field2371;
            if (class66.field1107 > var2) {
                var2 = class66.field1107;
            }
            int var3 = class77.field1281;
            if (!arg0) {
                method1729((class211) null, 8);
            }
            if (var2 + client.field4857.field3430 > class66.field1107 + class277.field4446.field3430) {
                var2 = class66.field1107 + class277.field4446.field3430 - client.field4857.field3430;
            }
            int var4 = var2 - class59.field970;
            int var5 = client.field4857.field3467;
            int var6 = var3 - class272.field4371;
            if (var6 < class243.field3864) {
                var6 = class243.field3864;
            }
            int var7 = var2 + class277.field4446.field3392 - class66.field1107;
            if ((class243.field3864 + class277.field4446.field3394) < (client.field4857.field3394 + var6)) {
                var6 = class243.field3864 + class277.field4446.field3394 - client.field4857.field3394;
            }
            int var8 = class277.field4446.field3369 + var6 - class243.field3864;
            int var9 = var6 - class265.field4271;
            if (class280.field4484 > client.field4857.field3326 && (var5 < var4 || var4 < (-var5) || var9 > var5 || (-var5) > var9)) {
                class182.field2999 = true;
            }
            if (client.field4857.field3370 != null && class182.field2999) {
                class126 var10 = new class126();
                var10.field1987 = var8;
                var10.field1999 = var7;
                var10.field1989 = client.field4857.field3370;
                var10.field2000 = client.field4857;
                class137.method960(200000, var10);
            }
            if (class163.field2642 == 0) {
                if (class182.field2999) {
                    if (client.field4857.field3455 != null) {
                        class126 var11 = new class126();
                        var11.field1981 = class13.field146;
                        var11.field1999 = var7;
                        var11.field1987 = var8;
                        var11.field2000 = client.field4857;
                        var11.field1989 = client.field4857.field3455;
                        class137.method960(200000, var11);
                    }
                    if (class13.field146 != null && client.method2029(client.field4857) != null) {
                        class145.field2288++;
                        class314.field5061.method828(118, 235);
                        class314.field5061.method1122(client.field4857.field3413, 1162032584);
                        class314.field5061.method1125(client.field4857.field3375, 255);
                        class314.field5061.method1111((byte) -102, class13.field146.field3375);
                        class314.field5061.method1122(class13.field146.field3413, 1162032584);
                    }
                } else if ((class2.field21 == 1 || class33.method219(false, class83.field1384 - 1)) && class83.field1384 > 2) {
                    class14.method65(-119);
                } else if (class83.field1384 > 0) {
                    class180.method1312((byte) -117);
                }
                client.field4857 = null;
            }
        } else if (class280.field4484 > 1) {
            client.field4857 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Z")
    public final boolean method1732(int arg0) {
        field4157++;
        if (arg0 == 4) {
            return (this.field4161 & 0x4) != 0;
        } else {
            return true;
        }
    }
}
