import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class52 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Lcf;")
    public static class93 field848 = class147.method1066("http:)4)4", -48);

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field853 = -1;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "Lcf;")
    public static class93 field858 = class147.method1066("::fpson", -48);

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "J")
    public static long field859 = 0L;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILee;)Lcf;")
    public static final class93 method285(int arg0, class280 arg1) {
        if (arg0 != 32767) {
            method286((byte) -1, (class280) null);
        }
        field851++;
        return class212.method1499(arg1, 32767, 0);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLee;)V")
    public static final void method286(byte arg0, class280 arg1) {
        byte[] var2 = new byte[24];
        if (arg0 < 11) {
            return;
        }
        field856++;
        if (class30.field444 != null) {
            try {
                class30.field444.method1671(0L, 4441);
                class30.field444.method1673(var2, 125);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1870(0, var2, 24, -101);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IJ)V")
    public static final void method287(int arg0, long arg1) {
        class285.field5105.field5027 = 0;
        class285.field5105.method1916(250, 76);
        class285.field5105.method1882(arg1, (byte) -126);
        field852++;
        class266.field4738 = 0;
        class208.field3735 = 0;
        class68.field1235 = -3;
        if (arg0 != -18227) {
            method285(-105, (class280) null);
        }
        class283.field5078 = 1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method288(int arg0) {
        field848 = null;
        field858 = null;
        if (arg0 != -7155) {
            field849 = 120;
        }
    }
}
