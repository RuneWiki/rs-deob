import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class148 {

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public int field2200;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field2194 = 0;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBI)V")
    public static final void method1003(int arg0, byte arg1, int arg2) {
        field2193++;
        class181 var3 = class95.method652(12, (byte) 34, arg2);
        var3.method1285((byte) 64);
        var3.field2847 = arg0;
        if (arg1 != 52) {
            field2204 = 35;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLpl;)V")
    public static final void method1004(byte arg0, class183 arg1) {
        long var2 = 0L;
        field2198++;
        if (arg1.field2879 == 0) {
            var2 = class78.method531(arg1.field2878, arg1.field2870, arg1.field2877);
        }
        if (arg1.field2879 == 1) {
            var2 = class211.method1460(arg1.field2878, arg1.field2870, arg1.field2877);
        }
        int var4 = -1;
        if (arg1.field2879 == 2) {
            var2 = class55.method362(arg1.field2878, arg1.field2870, arg1.field2877);
        }
        if (arg1.field2879 == 3) {
            var2 = class33.method173(arg1.field2878, arg1.field2870, arg1.field2877);
        }
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = ((int) var2 & 0x3CFBD8) >> 20;
            var5 = ((int) var2 & 0x7F2A4) >> 14;
        }
        arg1.field2885 = var6;
        arg1.field2881 = var5;
        if (arg0 != 3) {
            field2202 = -40;
        }
        arg1.field2873 = var4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lvl;Lvl;I)V")
    public static final void method1005(class73 arg0, class73 arg1, int arg2) {
        class41.field497 = arg1;
        field2197++;
        class71.field1043 = arg0;
        if (arg2 != -9247) {
            method1006(56);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static final void method1006(int arg0) {
        class166.field2560.method1511((byte) 107);
        if (arg0 != -4) {
            field2202 = -126;
        }
        field2196++;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class148() {
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lej;)V")
    public class148(class148 arg0) {
        this.field2201 = arg0.field2201;
        this.field2200 = arg0.field2200;
        this.field2195 = arg0.field2195;
        this.field2199 = arg0.field2199;
    }
}
