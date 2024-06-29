import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class101 extends class271 {

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    private final int field1730;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    private final int field1728;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    private final int field1722;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    private final int field1732;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field1729 = 0;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Lmb;")
    public static class96 field1731 = class243.method1708(" loggt sich aus)3", (byte) 115);

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static void method765(int arg0) {
        field1731 = null;
        if (arg0 != -4952) {
            method765(-34);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IIIIIII)V")
    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1730 = arg1;
        this.field1728 = arg3;
        this.field1722 = arg0;
        this.field1732 = arg2;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)V")
    public final void method766(int arg0, byte arg1, int arg2) {
        ++field1726;
        int var4 = this.field1722 * arg0 >> 12;
        int var5 = this.field1732 * arg0 >> 12;
        int var6 = this.field1728 * arg2 >> 12;
        int var7 = this.field1730 * arg2 >> 12;
        class170.method1217(var4, var6, -87, var5, var7, super.field4718);
        int var8 = 50 / ((54 - arg1) / 59);
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(III)J")
    public static final long method767(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field3282; ++var4) {
                class70 var5 = var3.field3274[var4];
                if ((var5.field1197 >> 29 & 3L) == 2L && var5.field1208 == arg1 && var5.field1204 == arg2) {
                    return var5.field1197;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(III)V")
    public final void method768(int arg0, int arg1, int arg2) {
        ++field1723;
        if (arg0 != 3298) {
            method767(-30, -113, 118);
        }
        int var4 = this.field1722 * arg2 >> 12;
        int var5 = this.field1732 * arg2 >> 12;
        int var6 = this.field1730 * arg1 >> 12;
        int var7 = this.field1728 * arg1 >> 12;
        class83.method583(var5, var4, var6, (byte) 106, super.field4718, super.field4713, super.field4714, var7);
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(III)V")
    public final void method769(int arg0, int arg1, int arg2) {
        if (arg1 != 100) {
            method767(-73, 25, -113);
        }
        ++field1724;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)Z")
    public static final boolean method770(boolean arg0, int arg1) {
        ++field1727;
        if (arg0) {
            field1729 = -120;
        }
        return ~(1 & arg1 >> 31) != -1;
    }
}
