import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class353 extends class331 {

    @OriginalMember(owner = "client!dha", name = "p", descriptor = "Lmq;")
    public static class78 field4725 = new class78(66, 7);

    @OriginalMember(owner = "client!dha", name = "t", descriptor = "Lvv;")
    public static class442 field4729 = new class442();

    @OriginalMember(owner = "client!dha", name = "m", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!dha", name = "n", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!dha", name = "o", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!dha", name = "q", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!dha", name = "r", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!dha", name = "s", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!dha", name = "u", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!dha", name = "v", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIIIIBI)V", line = 5)
    public static final void method2100(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (class223.field2944.field600.method3601((byte) -126) != 0 && arg1 != 0 && ~class111.field1370 > -51 && ~arg0 != 0) {
            class552.field7756[class111.field1370++] = new class310((byte) 1, arg0, arg1, arg2, arg3, arg4, arg6, (class410) null);
        }
        int var7 = -73 % ((21 - arg5) / 39);
        ++field4723;
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)V", line = 24)
    public static void method2101(int arg0) {
        field4725 = null;
        if (arg0 != 0) {
            method2100(104, 65, -37, -87, -128, (byte) -118, -97);
        }
        field4729 = null;
    }

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "(II)V", line = 35)
    public final void method227(int arg0, int arg1) {
        if (arg0 <= 113) {
            this.method224(-63);
        }
        ++field4727;
        super.field4202 = arg1;
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(ILts;)V", line = 46)
    public class353(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "(B)I", line = 49)
    public final int method2102(byte arg0) {
        if (arg0 >= -119) {
            field4729 = null;
        }
        ++field4726;
        return super.field4202;
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(II)I", line = 60)
    public final int method222(int arg0, int arg1) {
        ++field4731;
        if (arg1 != 1) {
            field4725 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "(II)I", line = 72)
    public static final int method2103(int arg0, int arg1) {
        if (arg0 <= 27) {
            method2101(-19);
        }
        int var7 = arg1 - 1;
        ++field4724;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lts;)V", line = 89)
    public class353(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIILkha;ZLnl;B)V", line = 92)
    public static final void method2104(int arg0, int arg1, int arg2, class687 arg3, boolean arg4, class681 arg5, byte arg6) {
        ++field4728;
        class454.method2665(arg3, false, arg0, arg4, arg1, arg2);
        if (arg6 != 84) {
            field4725 = null;
        }
        class55.field799 = arg5;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)V", line = 109)
    public final void method224(int arg0) {
        if (arg0 == -1959) {
            if (~super.field4202 > -1 || super.field4202 > 4) {
                super.field4202 = this.method226((byte) 13);
            }
            ++field4722;
        }
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(B)I", line = 124)
    public final int method226(byte arg0) {
        ++field4730;
        if (arg0 != 13) {
            field4729 = null;
        }
        return 0;
    }
}
