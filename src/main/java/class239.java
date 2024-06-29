import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class239 {

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public int field4169;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field4170;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public int field4168;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field4167 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field4165 = -1;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lsf;")
    public static class108 field4171 = class140.method973(255, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 4)
    public static void method1657(byte arg0) {
        if (arg0 < 92) {
            method1658(49, 80, 92, 22, -40);
        }
        field4171 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V", line = 27)
    public static final void method1658(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -16733) {
            field4171 = (class108) null;
        }
        class117 var5 = (class117) class98.field1620.method1676((long) arg1, (byte) -69);
        if (var5 == null) {
            var5 = new class117();
            class98.field1620.method1681(1, var5, (long) arg1);
        }
        if (arg0 >= var5.field2028.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field2028.length; var8++) {
                var6[var8] = var5.field2028[var8];
                var7[var8] = var5.field2036[var8];
            }
            for (int var9 = var5.field2028.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2028 = var6;
            var5.field2036 = var7;
        }
        var5.field2028[arg0] = arg3;
        var5.field2036[arg0] = arg4;
        field4172++;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V", line = 89)
    public class239(int arg0, int arg1, int arg2) {
        this.field4169 = arg2;
        this.field4170 = arg0;
        this.field4168 = arg1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZII)V")
    public abstract void method1420(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
    public abstract void method1419(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)V")
    public abstract void method1417(int arg0, int arg1, int arg2);
}
