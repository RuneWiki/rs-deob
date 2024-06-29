import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class272 {

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lbo;")
    public class28 field3898 = new class28();

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lvh;")
    public static class125 field3897 = new class125(62, 11);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1712(int arg0) {
        if (arg0 != -11062) {
            field3897 = null;
        }
        field3897 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static final void method1713(byte arg0) {
        if (class313.field4341 != null) {
            class313.field4341.method1055(-109);
        }
        field3900++;
        if (arg0 != 13) {
            field3897 = null;
        }
        if (class183.field2894 != null) {
            class183.field2894.method1055(-89);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
    public static final void method1714(byte arg0) {
        field3896++;
        class355 var1 = null;
        try {
            class614 var2 = class653.field9220.method3949("2", 0, true);
            while (var2.field8787 == 0) {
                class564.method3300((byte) 121, 1L);
            }
            if (var2.field8787 == 1) {
                var1 = (class355) var2.field8785;
                byte[] var3 = new byte[(int) var1.method2144(-64)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2146(var3.length - var4, -1, var3, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class278.method1729(new class465(var3), -122);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg0 < 38) {
                field3897 = null;
            }
            if (var1 != null) {
                var1.method2152(false);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z")
    public static final boolean method1715(int arg0, int arg1) {
        field3899++;
        if (arg0 == 0) {
            return arg1 == 10 || arg1 == 11 || arg1 == 12;
        } else {
            return true;
        }
    }
}
