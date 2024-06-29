import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class16 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lih;")
    public static class295 field170;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
    public static final void method108(int arg0, int arg1, int arg2) {
        field168++;
        if (class309.method2092(91923, arg1)) {
            int var3 = 62 % ((-arg0 - 5) / 51);
            class74.method553(0, arg2, class134.field2195[arg1]);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static final void method109(int arg0) {
        field169++;
        class258.field3968.method1420((byte) 109);
        if (arg0 != 0) {
            method109(-110);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static void method110(int arg0) {
        if (arg0 != 0) {
            method111(-112, (class270) null, (byte) 67);
        }
        field170 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILlc;B)Lu;")
    public static final class33 method111(int arg0, class270 arg1, byte arg2) {
        field173++;
        if (arg2 > -43) {
            return null;
        } else {
            byte[] var3 = arg1.method1886(arg0, false);
            return var3 == null ? null : new class33(var3);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method112(Component arg0, int arg1);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field172++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = 2048 - arg6 & 0x7FF;
        int var10 = (class91.field1458 - class66.field1025) * var8 / 100 + class66.field1025;
        int var11 = arg3 * var10 >> 8;
        int var12 = 2048 - arg5 & 0x7FF;
        int var13 = arg7;
        int var14 = 0;
        int var15 = var11;
        if (var9 != 0) {
            int var16 = class244.field3590[var9];
            var14 = -var11 * var16 >> 16;
            int var17 = class244.field3592[var9];
            var15 = var11 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class244.field3590[var12];
            int var19 = class244.field3592[var12];
            var13 = var15 * var18 >> 16;
            var15 = var15 * var19 >> 16;
        }
        class93.field1533 = arg0 - var13;
        class115.field1906 = arg6;
        class226.field3324 = arg1 - var14;
        class260.field4024 = arg4 - var15;
        class268.field4303 = arg5;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)I")
    public abstract int method114(boolean arg0);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method115(Component arg0, byte arg1);
}
