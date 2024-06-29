import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class62 {

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "B")
    public byte field750;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "S")
    public short field754;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "S")
    public short field741;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "S")
    public short field742;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "Z")
    public boolean field752;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "B")
    public byte field753;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "Lwia;")
    public static class791 field746;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method411(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field748++;
        int var6 = class527.method3176(arg1, class407.field5535, class734.field10153, -2);
        if (arg5) {
            return;
        }
        int var7 = class527.method3176(arg0, class407.field5535, class734.field10153, -2);
        int var8 = class527.method3176(arg4, class463.field6533, class618.field8645, -2);
        int var9 = class527.method3176(arg2, class463.field6533, class618.field8645, -2);
        for (int var10 = var6; var10 <= var7; var10++) {
            class434.method2601(class746.field10330[var10], var8, arg3, (byte) -62, var9);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lmea;II)I")
    public static final int method412(class451 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method413(-14);
        }
        field747++;
        if (!client.method2046(arg0).method276(arg1, arg2 + 1) && arg0.field6300 == null) {
            return -1;
        } else if (arg0.field6215 == null || arg1 >= arg0.field6215.length) {
            return -1;
        } else {
            return arg0.field6215[arg1];
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
    public static final void method413(int arg0) {
        field745++;
        for (class360 var1 = (class360) class306.field4398.method2172(-127); var1 != null; var1 = (class360) class306.field4398.method2172(arg0 - 16255)) {
            class717.method4023(arg0 - 16451, var1);
        }
        int var2;
        int var3;
        if (class21.field353.field10086.method1642(arg0 - 16450) == 1) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class481.field6761;
            var2 = class481.field6761;
        }
        client.method2031();
        for (int var4 = var2; var4 <= var3; var4++) {
            client.method2032();
            client.method2040(var4);
            client.method2051(var4);
        }
        client.method2036();
        client.method2053();
        if (arg0 != 16337) {
            method412(null, -123, 55);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZI)V")
    public static final void method414(boolean arg0, int arg1) {
        field749++;
        if (!arg0) {
            field743 = 126;
        }
        class313 var2 = class312.method1998((long) arg1, 11, -1);
        var2.method2006(107);
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
    public static void method415(int arg0) {
        field746 = null;
        if (arg0 != -1) {
            method412(null, -54, -20);
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field751 = arg0;
        this.field750 = (byte) arg8;
        this.field754 = (short) arg4;
        this.field741 = (short) arg6;
        this.field742 = (short) arg5;
        this.field752 = arg9;
        this.field744 = arg10;
        this.field753 = (byte) arg7;
    }
}
