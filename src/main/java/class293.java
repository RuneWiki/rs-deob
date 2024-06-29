import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class293 {

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3857 = new String[100];

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "J")
    public static long field3858 = -1L;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field3859 = -2;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method1871(byte arg0, int arg1) {
        class365 var2 = class219.field2706;
        synchronized (class219.field2706) {
            class219.field2706.method2286(arg1, (byte) 36);
        }
        field3862++;
        class365 var3 = class106.field1272;
        synchronized (class106.field1272) {
            class106.field1272.method2286(arg1, (byte) 36);
        }
        class365 var4 = class363.field4932;
        synchronized (class363.field4932) {
            int var5 = -24 / ((-arg0 - 64) / 44);
            class363.field4932.method2286(arg1, (byte) 36);
        }
        class365 var6 = class395.field5376;
        synchronized (class395.field5376) {
            class395.field5376.method2286(arg1, (byte) 36);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 25)
    public static void method1872(int arg0) {
        field3857 = null;
        if (arg0 != 20173) {
            field3858 = -128L;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)V", line = 36)
    public static final void method1873(int arg0, int arg1) {
        class372.field5048 = -1;
        class369.field5026 = null;
        class264.field3385 = -1;
        field3860++;
        class97.field1144 = 0;
        class139.field1590 = arg0;
        class272.field3509 = arg1;
        class137.field1554 = false;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIBI)I", line = 61)
    public static final int method1874(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3861++;
        if (arg3 == -75) {
            int var5 = arg0 & 0xF;
            int var6 = var5 >= 8 ? arg2 : arg4;
            int var7 = var5 < 4 ? arg2 : (var5 == 12 || var5 == 14 ? arg4 : arg1);
            return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
        } else {
            return 35;
        }
    }
}
