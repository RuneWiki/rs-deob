import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class67 extends RuntimeException {

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "Ljava/lang/String;")
    public String field1009;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1011;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "Z")
    public static boolean field1012 = false;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "Lsi;")
    public static class321 field1013 = null;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILjava/lang/String;Lbd;)Lid;", line = 5)
    public static final class242 method585(int arg0, int arg1, String arg2, class304 arg3) {
        if (arg0 > -44) {
            field1013 = null;
        }
        field1008++;
        if (arg1 == 0) {
            return arg3.method1965(arg2, (byte) 23);
        } else if (arg1 == 1) {
            try {
                class117.method935(arg3.field4117, new Object[] { (new URL(arg3.field4117.getCodeBase(), arg2)).toString() }, "openjs", 26643);
                class242 var4 = new class242();
                var4.field3345 = 1;
                return var4;
            } catch (Throwable var10) {
                class242 var5 = new class242();
                var5.field3345 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                arg3.field4117.getAppletContext().showDocument(new URL(arg3.field4117.getCodeBase(), arg2), "_blank");
                class242 var6 = new class242();
                var6.field3345 = 1;
                return var6;
            } catch (Exception var11) {
                class242 var7 = new class242();
                var7.field3345 = 2;
                return var7;
            }
        } else if (arg1 == 3) {
            try {
                class117.method936("loggedout", true, arg3.field4117);
            } catch (Throwable var13) {
            }
            try {
                arg3.field4117.getAppletContext().showDocument(new URL(arg3.field4117.getCodeBase(), arg2), "_top");
                class242 var8 = new class242();
                var8.field3345 = 1;
                return var8;
            } catch (Exception var12) {
                class242 var9 = new class242();
                var9.field3345 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)V", line = 82)
    public static final void method586(int arg0, boolean arg1) {
        if (arg0 == 37) {
            class99.field1420 = 3.0F;
        } else if (arg0 == 50) {
            class99.field1420 = 4.0F;
        } else if (arg0 == 75) {
            class99.field1420 = 6.0F;
        } else if (arg0 == 100) {
            class99.field1420 = 8.0F;
        } else if (arg0 == 200) {
            class99.field1420 = 16.0F;
        }
        class39.field605 = -1;
        field1014++;
        if (arg1) {
            method588((String) null, 83, -63, (String) null, false, (String) null);
        }
        class39.field605 = -1;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)I", line = 118)
    public static final int method587(byte arg0, int arg1) {
        field1010++;
        return arg0 == -36 ? arg1 >>> 8 : 111;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 131)
    public class67(Throwable arg0, String arg1) {
        this.field1009 = arg1;
        this.field1011 = arg0;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;ZLjava/lang/String;)V", line = 142)
    public static final void method588(String arg0, int arg1, int arg2, String arg3, boolean arg4, String arg5) {
        if (!arg4) {
            field1013 = null;
        }
        class323.method2056(31437, arg3, arg5, arg2, arg0, arg1, (String) null, -1);
        field1007++;
    }
}
