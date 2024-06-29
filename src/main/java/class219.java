import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class219 extends class365 {

    @OriginalMember(owner = "client!js", name = "E", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!js", name = "F", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!js", name = "G", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!js", name = "H", descriptor = "Lgb;")
    public static class145 field2968;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "[B")
    private byte[] field2970;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I", line = 3)
    public static int method1381(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!js", name = "f", descriptor = "(I)V", line = 10)
    public static void method1382(int arg0) {
        if (arg0 != -4571) {
            field2968 = null;
        }
        field2968 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljk;I)Ljk;", line = 28)
    public static final class450 method1383(class450 arg0, int arg1) {
        field2967++;
        if (arg1 != 2) {
            method1383(null, 3);
        }
        class450 var2 = client.method1261(arg0);
        if (var2 == null) {
            var2 = arg0.field6616;
        }
        return var2;
    }

    @OriginalMember(owner = "client!js", name = "g", descriptor = "(I)V", line = 45)
    public static final void method1384(int arg0) {
        field2966++;
        if (class92.field1097) {
            return;
        }
        class36.method194(class484.field7131, true);
        int var1 = 37 % ((43 - arg0) / 61);
        if (class95.field1140 != null) {
            class36.method194(class95.field1140, true);
        }
        class92.field1097 = true;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BII)V", line = 67)
    public final void method1385(byte arg0, int arg1, int arg2) {
        field2965++;
        int var4 = arg1 * 2;
        byte var5 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field2970[var10001] = var5;
        if (arg2 != 18936) {
            method1384(-57);
        }
        this.field2970[var6] = var5;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V", line = 85)
    public class219() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BIII)[B", line = 89)
    public final byte[] method1386(byte arg0, int arg1, int arg2, int arg3) {
        this.field2970 = new byte[arg1 * arg3 * arg2 * 2];
        if (arg0 > -87) {
            this.field2970 = null;
        }
        field2969++;
        this.method3026(arg2, arg1, arg3, -74);
        return this.field2970;
    }
}
