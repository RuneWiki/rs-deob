import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class368 extends class305 {

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "[I")
    public static int[] field5296 = new int[128];

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "Lmia;")
    public static class63 field5298;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        ++field5297;
        if (~super.field4320 > -1 && super.field4320 > 127) {
            super.field4320 = this.method305((byte) 68);
        }
        if (arg0 >= -40) {
            field5296 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZ)V")
    public static final void method2266(int arg0, boolean arg1) {
        class111.field1551.method772(class502.field7152.method504());
        if (arg0 == 90) {
            ++field5294;
            int[] var2 = class502.field7152.method434();
            class582.field8295 = var2[1];
            class347.field5020 = var2[0];
            class110.field1547 = var2[2];
            class115.field1592 = var2[3];
            if (arg1) {
                class502.field7152.method500(class489.field6993, class289.field4126, class186.field2846, class642.field9013);
                class331.method2094(0, class659.field9225);
            } else {
                class502.field7152.method500(class80.field1130, class246.field3578, class371.field5330, class92.field1280);
                class331.method2094(0, class108.field1507);
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            this.method308((byte) -10);
        }
        ++field5291;
        return 127;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
    public static void method2267(boolean arg0) {
        if (!arg0) {
            method2266(0, true);
        }
        field5298 = null;
        field5296 = null;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lhb;)V")
    public class368(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)I")
    public final int method2268(int arg0) {
        if (arg0 != 17503) {
            field5298 = null;
        }
        ++field5293;
        return super.field4320;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        if (arg0 != 31401) {
            return -18;
        } else {
            ++field5295;
            return 1;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(ILhb;)V")
    public class368(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        super.field4320 = arg1;
        if (arg0 != -27751) {
            this.method2268(106);
        }
        ++field5292;
    }

    static {
        for (int var0 = 0; ~field5296.length < ~var0; ++var0) {
            field5296[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; ++var1) {
            field5296[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; ++var2) {
            field5296[var2] = var2 - 71;
        }
        for (int var3 = 48; ~var3 >= -58; ++var3) {
            field5296[var3] = var3 + -48 - -52;
        }
        field5296[45] = field5296[47] = 63;
        field5296[42] = field5296[43] = 62;
        field5298 = new class63(73, 11);
    }
}
