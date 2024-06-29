import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class479 extends class429 {

    @OriginalMember(owner = "client!rca", name = "u", descriptor = "I")
    private int field6733;

    @OriginalMember(owner = "client!rca", name = "w", descriptor = "I")
    private int field6735;

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
    private int field6724;

    @OriginalMember(owner = "client!rca", name = "x", descriptor = "I")
    private int field6736;

    @OriginalMember(owner = "client!rca", name = "m", descriptor = "Llf;")
    private class250 field6725;

    @OriginalMember(owner = "client!rca", name = "s", descriptor = "I")
    private int field6731;

    @OriginalMember(owner = "client!rca", name = "k", descriptor = "I")
    private int field6723;

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
    public static int field6726 = 0;

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!rca", name = "p", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!rca", name = "q", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!rca", name = "r", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!rca", name = "v", descriptor = "Liv;")
    private class107 field6734;

    @OriginalMember(owner = "client!rca", name = "t", descriptor = "Lff;")
    public static class9 field6732;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)Liv;", line = 7)
    public final class107 method1(int arg0) {
        field6727++;
        if (this.field6734 == null) {
            class113.field1539[2] = this.field6723;
            class113.field1539[1] = this.field6724;
            class161 var2 = this.field6725.field913;
            class113.field1539[3] = this.field6736;
            class113.field1539[5] = this.field6733;
            class113.field1539[4] = this.field6731;
            class113.field1539[0] = this.field6735;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1112(arg0 ^ 0x1035, class113.field1539[var5])) {
                    return null;
                }
                class577 var7 = var2.method1114(class113.field1539[var5], -70);
                int var8 = var7.field7853 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field7874 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class365.field5268[var6] = var2.method1113(-78, var4, var4, false, class113.field1539[var6], 1.0F);
            }
            this.field6734 = new class107(this.field6725, 6407, var4, var3 != 0, class365.field5268);
        }
        if (arg0 != 25155) {
            field6728 = -27;
        }
        return this.field6734;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)Z", line = 78)
    public static final boolean method2828(int arg0, int arg1, int arg2) {
        int var3 = -98 / ((37 - arg1) / 44);
        field6722++;
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(B)V", line = 90)
    public static void method2829(byte arg0) {
        field6732 = null;
        if (arg0 != 13) {
            method2828(59, 66, -48);
        }
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Llf;IIIIII)V", line = 102)
    public class479(class250 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6733 = arg6;
        this.field6735 = arg1;
        this.field6724 = arg2;
        this.field6736 = arg4;
        this.field6725 = arg0;
        this.field6731 = arg5;
        this.field6723 = arg3;
    }
}
