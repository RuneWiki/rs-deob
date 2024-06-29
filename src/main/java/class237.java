import java.awt.Canvas;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class237 {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field3989 = 0;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lwa;")
    public static class75 field3994 = null;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lwa;")
    private static class75 field3990 = class66.method560(" is already on your ignore list)3", false);

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lwa;")
    public static class75 field3988 = field3990;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lmc;")
    public static class170 field3992 = new class170();

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3991;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 10)
    public static void method1717(int arg0) {
        if (arg0 != -10056) {
            method1718(-127, -48, 105, 59, (class171) null, -37, -121L, 103, 119, -63, -5);
        }
        field3994 = null;
        field3988 = null;
        field3991 = null;
        field3990 = null;
        field3992 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIILpj;IJIIII)Z", line = 51)
    public static final boolean method1718(int arg0, int arg1, int arg2, int arg3, class171 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class246.method1776(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)J", line = 60)
    public static final long method1719(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field4086; var4++) {
            class285 var5 = var3.field4083[var4];
            if ((var5.field4914 >> 29 & 0x3L) == 2L && var5.field4907 == arg1 && var5.field4895 == arg2) {
                return var5.field4914;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(III)J", line = 82)
    public static final long method1720(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        return var3 == null || var3.field4096 == null ? 0L : var3.field4096.field3967;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lce;", line = 90)
    public static final class233 method1721(int arg0, int arg1) {
        field3986++;
        class233 var2 = (class233) class66.field1145.method1193((long) arg0, -81);
        int var3 = 95 % ((-arg1 - 31) / 43);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class111.field1899.method1911(class90.method713(arg0, (byte) -115), class214.method1580(false, arg0), -60);
        class233 var5 = new class233();
        if (var4 != null) {
            var5.method1705(new class60(var4), 0);
        }
        class66.field1145.method1194(var5, (long) arg0, false);
        return var5;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 129)
    public static final void method1722(byte arg0) {
        if (arg0 < 8) {
            method1719(47, -105, -35);
        }
        field3987++;
        class191.field3183 = new class170();
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLre;Lwa;)Lwa;", line = 140)
    public static final class75 method1723(byte arg0, class262 arg1, class75 arg2) {
        field3993++;
        if (arg2.method657((byte) -37, class226.field3816) == -1) {
            return arg0 >= -9 ? (class75) null : arg2;
        }
        while (true) {
            int var3 = arg2.method657((byte) -108, class140.field2423);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method657((byte) -104, class276.field4751);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method657((byte) -29, class299.field5109);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method657((byte) -79, class288.field4950);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method657((byte) -119, class250.field4206);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method657((byte) -117, class34.field502);
                                                    if (var8 == -1) {
                                                        return arg0 >= -9 ? (class75) null : arg2;
                                                    }
                                                    class75 var9 = class121.field2037;
                                                    if (class75.field1306 != null) {
                                                        var9 = class168.method1245((byte) 124, class75.field1306.field1326);
                                                        try {
                                                            if (class75.field1306.field1329 != null) {
                                                                byte[] var10 = ((String) class75.field1306.field1329).getBytes("ISO-8859-1");
                                                                var9 = class191.method1442(var10.length, (byte) 45, 0, var10);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg2 = class66.method562((byte) -111, new class75[] { arg2.method661(81, 0, var8), var9, arg2.method650(0, var8 + 4) });
                                                }
                                            }
                                            arg2 = class66.method562((byte) -37, new class75[] { arg2.method661(121, 0, var7), class67.method567(class99.method757(0, arg1, 4), (byte) -93), arg2.method650(0, var7 + 2) });
                                        }
                                    }
                                    arg2 = class66.method562((byte) -123, new class75[] { arg2.method661(120, 0, var6), class67.method567(class99.method757(0, arg1, 3), (byte) -54), arg2.method650(0, var6 + 2) });
                                }
                            }
                            arg2 = class66.method562((byte) -15, new class75[] { arg2.method661(85, 0, var5), class67.method567(class99.method757(0, arg1, 2), (byte) -110), arg2.method650(0, var5 + 2) });
                        }
                    }
                    arg2 = class66.method562((byte) 122, new class75[] { arg2.method661(125, 0, var4), class67.method567(class99.method757(0, arg1, 1), (byte) -65), arg2.method650(0, var4 + 2) });
                }
            }
            arg2 = class66.method562((byte) -56, new class75[] { arg2.method661(119, 0, var3), class67.method567(class99.method757(0, arg1, 0), (byte) -127), arg2.method650(0, var3 + 2) });
        }
    }
}
