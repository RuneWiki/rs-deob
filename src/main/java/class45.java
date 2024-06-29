import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class45 extends class112 {

    @OriginalMember(owner = "client!dja", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field597;

    @OriginalMember(owner = "client!dja", name = "N", descriptor = "I")
    public static int field598 = 0;

    @OriginalMember(owner = "client!dja", name = "J", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!dja", name = "K", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!dja", name = "L", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!dja", name = "O", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method339(byte arg0) {
        if (arg0 != -94) {
            method342(true);
        }
        field596++;
        return this.field597;
    }

    @OriginalMember(owner = "client!dja", name = "h", descriptor = "(I)Z")
    public final boolean method340(int arg0) {
        field595++;
        return arg0 != -32365;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "([IIILea;)V")
    public static final void method341(int[] arg0, int arg1, int arg2, class21 arg3) {
        if (arg1 != -1) {
            return;
        }
        field594++;
        if (arg3.field4088 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg3.field4088.length; var5++) {
                if (arg3.field4088[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg3.field4064 != -1) {
                class98 var6 = class168.field2552.method3287(arg1 + 115, arg3.field4064);
                int var7 = var6.field1392;
                if (var7 == 1) {
                    arg3.field4124 = arg2;
                    arg3.field4132 = 0;
                    arg3.field4080 = 1;
                    arg3.field4114 = 0;
                    arg3.field4086 = 0;
                    if (!arg3.field4120) {
                        class324.method1958(var6, (byte) 42, arg3, arg3.field4114);
                    }
                }
                if (var7 == 2) {
                    arg3.field4086 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg3.field4088 == null || arg3.field4088[var9] == -1 || class168.field2552.method3287(arg1 ^ 0xFFFFFF82, arg0[var9]).field1407 >= class168.field2552.method3287(88, arg3.field4088[var9]).field1407) {
                arg3.field4124 = arg2;
                arg3.field4088 = arg0;
                break;
            }
        }
        if (var8) {
            arg3.field4124 = arg2;
            arg3.field4088 = arg0;
        }
    }

    @OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Lqj;Ljava/lang/Object;I)V")
    public class45(class572 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field597 = arg1;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(Z)I")
    public static final int method342(boolean arg0) {
        field599++;
        if (arg0) {
            return -108;
        } else if (class388.field5420 == 1) {
            return class743.field10329;
        } else {
            return 0;
        }
    }
}
