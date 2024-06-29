import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class138 extends Exception {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Z", line = 9)
    public static final boolean method971(byte arg0) {
        field1792++;
        try {
            if (class420.field5909 == 2) {
                if (class729.field10197 == null) {
                    class729.field10197 = class716.method4045(class368.field5295, class341.field5056, class664.field9319);
                    if (class729.field10197 == null) {
                        return false;
                    }
                }
                if (class285.field4369 == null) {
                    class285.field4369 = new class522(class633.field8937, class221.field3148);
                }
                class110 var1 = class76.field1020;
                if (class733.field10242 != null) {
                    var1 = class733.field10242;
                }
                if (var1.method763(class285.field4369, 22050, class729.field10197, (byte) -79, class513.field7329)) {
                    class76.field1020 = var1;
                    class76.field1020.method733(false);
                    if (class101.field1279 <= 0) {
                        class420.field5909 = 0;
                        class76.field1020.method757(144, class246.field3513);
                        for (int var2 = 0; var2 < class668.field9395.length; var2++) {
                            class76.field1020.method760(var2, 16556, class668.field9395[var2]);
                            class668.field9395[var2] = 255;
                        }
                    } else {
                        class420.field5909 = 3;
                        class76.field1020.method757(144, class101.field1279 > class246.field3513 ? class246.field3513 : class101.field1279);
                        for (int var3 = 0; var3 < class668.field9395.length; var3++) {
                            class76.field1020.method760(var3, 16556, class668.field9395[var3]);
                            class668.field9395[var3] = 255;
                        }
                    }
                    if (class733.field10242 == null) {
                        if (class628.field8869 > 0L) {
                            class76.field1020.method751((byte) -114, class729.field10197, true, class628.field8869, class611.field8622);
                        } else {
                            class76.field1020.method770(-128, class611.field8622, class729.field10197);
                        }
                    }
                    if (class298.field4491 != null) {
                        class298.field4491.method1649(-119, class76.field1020);
                    }
                    class628.field8869 = 0L;
                    class285.field4369 = null;
                    class729.field10197 = null;
                    class733.field10242 = null;
                    class368.field5295 = null;
                    return true;
                }
            }
            if (arg0 < 33) {
                method971((byte) 41);
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class76.field1020.method759(84);
            class729.field10197 = null;
            class420.field5909 = 0;
            class285.field4369 = null;
            class368.field5295 = null;
            class733.field10242 = null;
        }
        return false;
    }
}
