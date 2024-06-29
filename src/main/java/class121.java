import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class121 extends class774 {

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field1610;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIIIIIIIZ)V")
    public static final void method854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        if (arg11) {
            field1612 = -114;
        }
        field1607++;
        if (!class718.method4015(arg10, 99)) {
            return;
        }
        if (class558.field7840[arg10] == null) {
            client.method787(class609.field8594[arg10], -1, arg1, arg4, arg3, arg5, arg0, arg8, arg7, arg2, arg6, arg9);
        } else {
            client.method787(class558.field7840[arg10], -1, arg1, arg4, arg3, arg5, arg0, arg8, arg7, arg2, arg6, arg9);
        }
    }

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "(I)Z")
    public final boolean method855(int arg0) {
        field1608++;
        return arg0 != -16309;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)V")
    public static final void method856(int arg0, int arg1, int arg2, int arg3) {
        class472 var4 = class59.field688[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class770 var5 = var4.field6542;
        class770 var6 = var4.field6541;
        if (var5 != null) {
            var5.field10593 = (short) (var5.field10593 * arg3 / (0x10 << class732.field10110 - 7));
            var5.field10592 = (short) (var5.field10592 * arg3 / (0x10 << class732.field10110 - 7));
        }
        if (var6 != null) {
            var6.field10593 = (short) (var6.field10593 * arg3 / (0x10 << class732.field10110 - 7));
            var6.field10592 = (short) (var6.field10592 * arg3 / (0x10 << class732.field10110 - 7));
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class121(Object arg0, int arg1) {
        super(arg1);
        this.field1610 = arg0;
    }

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method857(int arg0) {
        if (arg0 == -5446) {
            field1611++;
            return this.field1610;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFIF)I")
    public static final int method858(float arg0, float arg1, int arg2, float arg3) {
        field1609++;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        if (arg2 != 3) {
            method858(-1.3468314F, 0.5397667F, -22, 1.3960323F);
        }
        float var5 = arg3 < 0.0F ? -arg3 : arg3;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var4 < var5 && var5 > var6) {
            return arg3 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var5 < var6) {
            return (arg0 > 0.0F) ? 2 : 3;
        } else if ((arg1 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }
}
