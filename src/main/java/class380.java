import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class380 {

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public static int field5751 = 104;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5749 = "purple:";

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Z", line = 6)
    public static final boolean method2419(int arg0, int arg1) {
        if (arg0 != 4) {
            method2419(-73, 97);
        }
        field5748++;
        class231 var2 = class63.method408(arg1, (byte) 100);
        if (var2 == null) {
            return false;
        } else if (class279.field4460 == 3) {
            String var3 = "";
            if (class141.field2184 != 0) {
                var3 = ":" + (var2.field3849 + 7000);
            }
            String var4 = "";
            if (class341.field5264 != null) {
                var4 = "/p=" + class341.field5264;
            }
            String var5 = "http://" + var2.field3847 + var3 + "/l=" + class205.field3298 + "/a=" + class173.field2882 + var4 + "/j" + (class115.field1599 ? "1" : "0") + ",o" + (class199.field3216 ? "1" : "0") + ",a2";
            try {
                class97.field1359.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class155.field2434 = var2.field3849;
            class430.field6323 = var2.field3847;
            if (class141.field2184 != 0) {
                class196.field3170 = class155.field2434 + 50000;
                class422.field6235 = class155.field2434 + 40000;
                class299.field4756 = class422.field6235;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 53)
    public static final void method2420(int arg0) {
        class349.method2278(1);
        field5752++;
        if (arg0 != -26) {
            method2422(true);
        }
        class142.field2253 = null;
        class318.field4974 = null;
        class296.field4710 = null;
        class136.field2139 = null;
        class349.field5385 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lap;Z)V", line = 85)
    public static final void method2421(class279 arg0, boolean arg1) {
        class394.field5905 = 3;
        field5750++;
        class449.method2794((byte) 116, true);
        class86.field1103 = 0;
        class299.field4755 = 2;
        class418.field6198 = 0;
        class343.field5286 = 0;
        class311.field4905 = true;
        class137.field2145 = 1;
        class145.field2283 = 127;
        class417.field6163 = 0;
        class220.field3627 = true;
        class341.field5267 = true;
        class183.field2984 = true;
        class256.field4149 = true;
        class216.field3514 = true;
        class377.field5695 = true;
        class213.field3427 = 127;
        class234.field3903 = true;
        class241.field3987 = true;
        class349.field5410 = true;
        class232.field3867 = 255;
        if (class27.field314 < 96) {
            class331.method2196(0, 0);
        } else {
            class331.method2196(0, 2);
        }
        class150.field2338 = true;
        class301.field4772 = arg1;
        class395.field5923 = true;
        class452.field6579 = 2;
        class317.field4970 = 2;
        class183.field2996 = class452.field6587 == 1 ? 2 : 4;
        class386.field5835 = 0;
        class392.field5887 = false;
        class13.field183 = 0;
        class99.field1381 = false;
        class335 var2 = null;
        try {
            class26 var3 = arg0.method1887((byte) -40);
            while (var3.field304 == 0) {
                class84.method517((byte) 123, 1L);
            }
            if (var3.field304 == 1) {
                var2 = (class335) var3.field305;
                byte[] var4 = new byte[(int) var2.method2212((byte) -56)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2213((byte) 66, var5, var4, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class89.method535(-111, new class186(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2210((byte) 96);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)V", line = 171)
    public static void method2422(boolean arg0) {
        if (!arg0) {
            method2419(99, 68);
        }
        field5749 = null;
    }
}
