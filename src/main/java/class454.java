import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class454 extends class529 {

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field7025;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public int field7033;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "[B")
    public static byte[] field7024 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field7026 = -1;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[F")
    public static float[] field7027 = new float[4];

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lci;")
    public static class489 field7029;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method2855(int arg0) {
        field7029 = null;
        field7027 = null;
        if (arg0 == 1) {
            field7024 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZII)V")
    public static final void method2856(boolean arg0, int arg1, int arg2) {
        if (class276.field4375 != arg1) {
            class476.field7271 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class476.field7271[var3] = (var3 << 12) / arg1;
            }
            class249.field4047 = arg1 * 32;
            class276.field4375 = arg1;
            class538.field7882 = arg1 - 1;
        }
        field7031++;
        if (!arg0) {
            field7026 = -23;
        }
        if (class249.field4051 == arg2) {
            return;
        }
        if (class276.field4375 == arg2) {
            class521.field7716 = class476.field7271;
        } else {
            class521.field7716 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class521.field7716[var4] = (var4 << 12) / arg2;
            }
        }
        class335.field5237 = arg2 - 1;
        class249.field4051 = arg2;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Lff;")
    public static final class214 method2857(int arg0) {
        if (arg0 != -14005) {
            return null;
        }
        field7032++;
        class214 var1 = (class214) class165.field2383.method2620((byte) -11);
        if (var1 == null) {
            return new class214();
        } else {
            class213.field3642--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(II)V")
    public class454(int arg0, int arg1) {
        this.field7025 = arg1;
        this.field7033 = arg0;
    }
}
