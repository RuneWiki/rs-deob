import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class175 {

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "B")
    public byte field2163;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "S")
    public short field2158;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "Z")
    public boolean field2157;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "S")
    public short field2165;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "B")
    public byte field2161;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "S")
    public short field2162;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "Lhq;")
    public static class142 field2159 = new class142("WTRC", 1);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public static void method1101(int arg0) {
        if (arg0 != 8) {
            field2160 = -90;
        }
        field2159 = null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZI)V")
    public static final void method1102(boolean arg0, int arg1) {
        if (arg0) {
            if (class127.field1619 != -1) {
                class185.method1151(class127.field1619, 256);
            }
            for (class21 var2 = (class21) class113.field1442.method3669((byte) 28); var2 != null; var2 = (class21) class113.field1442.method3676((byte) -12)) {
                if (!var2.method3047(32)) {
                    var2 = (class21) class113.field1442.method3669((byte) 28);
                    if (var2 == null) {
                        break;
                    }
                }
                class658.method3727(false, 7070, true, var2);
            }
            class127.field1619 = -1;
            class113.field1442 = new class652(8);
            class687.method3888(1003);
            class127.field1619 = class264.field3636;
            class161.method1019((byte) 107, false);
            class100.method747(false);
            class545.method3198(class127.field1619);
        }
        field2166++;
        if (arg1 != -1) {
            field2159 = null;
        }
        class189.field2305 = true;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method1103(byte arg0, int arg1, String arg2) {
        class301.method1786("", arg2, "", "", -1, arg1, 0);
        field2155++;
        if (arg0 != 38) {
            method1101(100);
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field2163 = (byte) arg7;
        this.field2156 = arg10;
        this.field2158 = (short) arg4;
        this.field2157 = arg9;
        this.field2165 = (short) arg5;
        this.field2161 = (byte) arg8;
        this.field2164 = arg0;
        this.field2162 = (short) arg6;
    }
}
