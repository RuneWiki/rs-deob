import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class81 extends class78 {

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "Leh;")
    public static class169 field1222;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "Lja;")
    public static class64 field1217;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "Ljava/awt/Frame;")
    public static Frame field1219;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjava/lang/String;Lob;)Ljava/lang/String;", line = 8)
    public static final String method586(byte arg0, String arg1, class292 arg2) {
        if (arg1.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg1.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class178.field2790 != null) {
                                                            if (class178.field2790.field391 == null) {
                                                                var9 = class319.method2192(0, class178.field2790.field386);
                                                            } else {
                                                                var9 = (String) class178.field2790.field391;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class280.method1998(115, class178.method1320(arg2, 4, (byte) -81)) + arg1.substring(var7 + 2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class280.method1998(115, class178.method1320(arg2, 3, (byte) -81)) + arg1.substring(var6 + 2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class280.method1998(115, class178.method1320(arg2, 2, (byte) -81)) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class280.method1998(116, class178.method1320(arg2, 1, (byte) -81)) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class280.method1998(122, class178.method1320(arg2, 0, (byte) -81)) + arg1.substring(var3 + 2);
            }
        }
        field1221++;
        return arg0 == 94 ? arg1 : (String) null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lja;ILja;)V", line = 98)
    public static final void method587(class64 arg0, int arg1, class64 arg2) {
        if (arg1 == 0) {
            class128.field2041 = arg2;
            class14.field257 = arg0;
            field1223++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V", line = 111)
    public static void method588(int arg0) {
        field1222 = null;
        field1219 = null;
        if (arg0 == -1) {
            field1217 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Z")
    public abstract boolean method585(byte arg0);

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method589(int arg0);
}
