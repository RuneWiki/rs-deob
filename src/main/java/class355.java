import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class355 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "[I")
    public static int[] field5446 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field5447 = 0;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "[B")
    public static byte[] field5451 = new byte[520];

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field5452 = 0;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Lph;")
    public static class361 field5448;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(JJ)J", line = 4)
    public static long method2467(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 12)
    public static final void method2468(int arg0) {
        field5450++;
        for (class98 var1 = (class98) class288.field4360.method1406(arg0 ^ arg0); var1 != null; var1 = (class98) class288.field4360.method1404(-121)) {
            int var2 = var1.field1393;
            if (class256.method1887(var2, -1)) {
                boolean var3 = true;
                class359[] var4 = class119.field1677[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field5500;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1656;
                    class359 var7 = class231.method1719(var6, arg0 + 124);
                    if (var7 != null) {
                        class83.method676(var7, (byte) 62);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V", line = 77)
    public static void method2469(boolean arg0) {
        field5448 = null;
        if (arg0) {
            field5448 = (class361) null;
        }
        field5446 = null;
        field5451 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 92)
    public static final void method2470(byte arg0, String arg1, boolean arg2) {
        field5449++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class99.field1425.method185(arg1, 250);
        int var7 = class99.field1425.method207(arg1, 250) * 13;
        if (class141.field2031) {
            class205.method1499(var4 - var3, -var3 + var5, var3 + var3 + var6, var3 + var3 + var7, 0);
            class205.method1487(var4 - var3, -var3 + var5, var3 + var6 + var3, var7 - -var3 + var3, 16777215);
        } else {
            class44.method317(var4 - var3, -var3 + var5, var3 + var3 + var6, var3 + var3 + var7, 0);
            class44.method316(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        }
        class99.field1425.method192(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        if (arg0 >= -2) {
            method2468(-21);
        }
        class230.method1716(var5 - var3, var4 - var3, var3 + var3 + var6, 2, var3 + var7 + var3);
        if (!arg2) {
            class135.method965(-105, var6, var7, var5, var4);
        } else if (class141.field2031) {
            class141.method984();
        } else {
            try {
                Graphics var8 = class306.field4585.getGraphics();
                class356.field5460.method221(0, 0, -118, var8);
            } catch (Exception var10) {
                class306.field4585.repaint();
            }
        }
    }
}
