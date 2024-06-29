import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class432 {

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "B")
    private byte field6200;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public int field6199;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public int field6193;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field6192;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public int field6190;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Loe;")
    public static class183 field6196 = new class183();

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field6201 = -1;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field6204 = -1;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "[[B")
    public static byte[][] field6202;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method2593(int arg0) {
        field6202 = null;
        int var1 = 73 / ((arg0 + 7) / 33);
        field6196 = null;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)I")
    public final int method2594(int arg0) {
        if (arg0 != 0) {
            this.method2594(-87);
        }
        field6195++;
        return this.field6200 & 0x7;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)I")
    public final int method2595(int arg0) {
        if (arg0 != 32238) {
            this.field6194 = 6;
        }
        field6191++;
        return (this.field6200 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z[B)Z")
    public static final boolean method2596(boolean arg0, byte[] arg1) {
        field6197++;
        if (!arg0) {
            field6203 = -25;
        }
        class389 var2 = new class389(arg1);
        int var3 = var2.method2229(255);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method2229(255) == 1;
        if (var4) {
            class589.method3418((byte) -54, var2);
        }
        class592.method3435(95, var2);
        return true;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V")
    public static final void method2597(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6198++;
        if (arg2 != 8) {
            method2593(40);
        }
        if (arg0 != 8 && arg0 != 16) {
            class433 var5 = class281.field3808[arg4][arg1][arg3];
            if (var5 != null) {
                if (arg0 == 1) {
                    var5.field6215 = 0;
                } else if (arg0 == 2) {
                    var5.field6208 = 0;
                }
            }
            class188.method1165((byte) 40);
            return;
        }
        for (int var6 = 0; var6 < class133.field1693; var6++) {
            class568 var7 = class683.field9755[var6];
            if (var7.field8305 == arg0 && var7.field8312 == arg1 && var7.field8311 == arg3 || var7.field8299 == arg1 && var7.field8311 == arg3) {
                if (class133.field1693 != var6) {
                    class252.method1540(class683.field9755, var6 + 1, class683.field9755, var6, class683.field9755.length - (var6 + 1));
                }
                class133.field1693--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class432() {
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lun;)V")
    public class432(class389 arg0) {
        this.field6200 = arg0.method2249((byte) -70);
        this.field6194 = arg0.method2260(-76);
        this.field6199 = arg0.method2255(255);
        this.field6193 = arg0.method2255(255);
        this.field6192 = arg0.method2255(255);
        this.field6190 = arg0.method2255(255);
    }
}
