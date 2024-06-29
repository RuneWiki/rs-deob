import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class545 extends class468 {

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    private int field7999;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    private int field8002;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    private int field7998;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    private int field8001;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    private int field7996;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    private int field7995;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "Lnh;")
    private class495 field7993;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "Leda;")
    public static class116 field8000 = new class116(72, -1);

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "Leda;")
    public static class116 field8004 = new class116(31, 8);

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field7997;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "Lrfa;")
    public static class494 field8005;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "Ltj;")
    public static class614 field8003;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "Lhba;")
    private class639 field7994;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)Lhba;")
    public final class639 method2767(int arg0) {
        if (arg0 != 0) {
            this.field7996 = -98;
        }
        field7997++;
        if (this.field7994 == null) {
            class540.field7936[3] = this.field7995;
            class540.field7936[2] = this.field7999;
            class615 var2 = this.field7993.field1459;
            class540.field7936[4] = this.field7996;
            class540.field7936[5] = this.field8001;
            class540.field7936[1] = this.field7998;
            class540.field7936[0] = this.field8002;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2363((byte) -119, class540.field7936[var5])) {
                    return null;
                }
                class377 var7 = var2.method2359(-122, class540.field7936[var5]);
                int var8 = var7.field5222 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field5231 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class563.field8219[var6] = var2.method2360(var4, false, class540.field7936[var6], (byte) 118, 1.0F, var4);
            }
            this.field7994 = this.field7993.method94(var3, class563.field8219, var4, (byte) 5);
        }
        return this.field7994;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
    public static void method3197(byte arg0) {
        field8000 = null;
        field8003 = null;
        field8005 = null;
        int var1 = -84 / ((25 - arg0) / 48);
        field8004 = null;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lnh;IIIIII)V")
    public class545(class495 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7999 = arg3;
        this.field8002 = arg1;
        this.field7998 = arg2;
        this.field8001 = arg6;
        this.field7996 = arg5;
        this.field7995 = arg4;
        this.field7993 = arg0;
    }
}
