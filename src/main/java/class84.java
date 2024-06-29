import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class84 extends class209 {

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "[B")
    public byte[] field1261;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public static int field1259 = 0;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "Ljava/lang/String;")
    public static String field1260 = "Starting 3d Library";

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field1262 = new String[8];

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "Lnf;")
    public static class162 field1257 = new class162(500);

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZILfh;I)V")
    public static final void method646(boolean arg0, int arg1, class136 arg2, int arg3) {
        field1256++;
        if (arg2.field4727 == arg1 && arg1 != -1) {
            class103 var4 = class250.method1700(arg1, -72);
            int var5 = var4.field1604;
            if (var5 == 1) {
                arg2.field4701 = arg3;
                arg2.field4720 = 0;
                arg2.field4705 = 0;
                arg2.field4699 = 1;
                arg2.field4765 = 0;
                class136.method1004(arg2.field4725, arg2.field4765, arg2.field4709, var4, 255, class263.field4168 == arg2);
            }
            if (var5 == 2) {
                arg2.field4720 = 0;
            }
        } else if (arg1 == -1 || arg2.field4727 == -1 || class250.method1700(arg1, -15).field1589 >= class250.method1700(arg2.field4727, -50).field1589) {
            arg2.field4765 = 0;
            arg2.field4700 = arg2.field4743;
            arg2.field4727 = arg1;
            arg2.field4699 = 1;
            arg2.field4720 = 0;
            arg2.field4701 = arg3;
            arg2.field4705 = 0;
            if (arg2.field4727 != -1) {
                class136.method1004(arg2.field4725, arg2.field4765, arg2.field4709, class250.method1700(arg2.field4727, -27), 255, class263.field4168 == arg2);
            }
        }
        if (arg0) {
            method647(113);
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
    public static void method647(int arg0) {
        field1260 = null;
        if (arg0 == 0) {
            field1257 = null;
            field1262 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "([B)V")
    public class84(byte[] arg0) {
        this.field1261 = arg0;
    }
}
