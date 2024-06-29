import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class319 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public int field4966 = -1;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Z")
    public boolean field4962 = true;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public int field4968 = 1190717;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public int field4973 = 8;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Z")
    public boolean field4969 = false;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Z")
    public boolean field4975 = true;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public int field4977 = 0;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public int field4979 = -1;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public int field4978 = 16;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public int field4976 = 128;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Z")
    public static boolean field4965 = false;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Z")
    public static boolean field4971 = true;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "[Lld;")
    public static class121[] field4964 = new class121[2048];

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field4972 = -1;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field4980 = 1;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Llb;")
    public static class211 field4974;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 5)
    public static void method2184(int arg0) {
        field4964 = null;
        if (arg0 != 20736) {
            field4972 = -94;
        }
        field4974 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lhb;III)V", line = 29)
    private final void method2185(class35 arg0, int arg1, int arg2, int arg3) {
        field4970++;
        if (arg1 == 1) {
            this.field4977 = class57.method518(arg2 ^ 0x463B, arg0.method269(false));
        } else if (arg1 == 2) {
            this.field4966 = arg0.method273(65280);
        } else if (arg1 == 3) {
            this.field4966 = arg0.method300(arg2 ^ 0x5319EB56);
            if (this.field4966 == 65535) {
                this.field4966 = -1;
            }
        } else if (arg1 == 5) {
            this.field4975 = false;
        } else if (arg1 == 7) {
            this.field4979 = class57.method518(126, arg0.method269(false));
        } else if (arg1 == 8) {
            class208.field3286 = arg3;
        } else if (arg1 == 9) {
            this.field4976 = arg0.method300(arg2 - 1394173622);
        } else if (arg1 == 10) {
            this.field4962 = false;
        } else if (arg1 == 11) {
            this.field4973 = arg0.method273(arg2 ^ 0xFFFF46A6);
        } else if (arg1 == 12) {
            this.field4969 = true;
        } else if (arg1 == 13) {
            this.field4968 = arg0.method269(false);
        } else if (arg1 == 14) {
            this.field4978 = arg0.method273(65280);
        }
        if (arg2 != -18010) {
            this.field4975 = true;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lhb;BI)V", line = 102)
    public final void method2186(class35 arg0, byte arg1, int arg2) {
        if (arg1 <= 72) {
            method2187(-91, -115, -123, 126);
        }
        while (true) {
            int var4 = arg0.method273(65280);
            if (var4 == 0) {
                field4967++;
                return;
            }
            this.method2185(arg0, var4, -18010, arg2);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIII)V", line = 165)
    public static final void method2187(int arg0, int arg1, int arg2, int arg3) {
        field4963++;
        class147 var4 = class92.method731(-29125, arg3, arg0);
        var4.method1095(74);
        var4.field2240 = arg2;
        var4.field2249 = arg1;
    }
}
