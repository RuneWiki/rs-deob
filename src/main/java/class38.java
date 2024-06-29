import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class38 {

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lpi;")
    private class203 field584 = new class203();

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lr;")
    private class250 field587 = new class250();

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    private int field588;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    private int field591;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Led;")
    private class49 field586;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lmh;")
    private static class62 field579 = class201.method1405(true, "Discard");

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lmh;")
    public static class62 field585 = class201.method1405(true, "Spieler");

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lmh;")
    public static class62 field578 = field579;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lud;")
    public static class52 field580 = new class52();

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Lmh;")
    private static class62 field598 = class201.method1405(true, "Allocating memory");

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lmh;")
    public static class62 field596 = field598;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lud;")
    public static class52 field595 = new class52();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Lsg;")
    public static class191 field599;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lke;")
    public static class214 field594;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "[I")
    public static int[] field582;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 17)
    public static void method256(int arg0) {
        field580 = null;
        field579 = null;
        field582 = null;
        field594 = null;
        field596 = null;
        field598 = null;
        field595 = null;
        field599 = null;
        int var1 = -93 / ((arg0 + 56) / 42);
        field585 = null;
        field578 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLpi;J)V", line = 45)
    public final void method257(boolean arg0, class203 arg1, long arg2) {
        if (arg0) {
            field596 = (class62) null;
        }
        field590++;
        if (this.field591 == 0) {
            class203 var5 = this.field587.method1740((byte) -118);
            var5.method1444((byte) 89);
            var5.method1421(67);
            if (this.field584 == var5) {
                class203 var6 = this.field587.method1740((byte) -105);
                var6.method1444((byte) 89);
                var6.method1421(76);
            }
        } else {
            this.field591--;
        }
        this.field586.method309(arg1, arg2, 1);
        this.field587.method1737(arg1, 125);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 75)
    public final void method258(int arg0) {
        field581++;
        this.field587.method1735(-3739);
        this.field586.method315(arg0 ^ arg0);
        this.field584 = new class203();
        this.field591 = this.field588;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)Lai;", line = 86)
    public final class206 method259(int arg0) {
        field592++;
        int var2 = -4 % ((-arg0 - 17) / 62);
        return this.field586.method317(-108);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(I)V", line = 185)
    public class38(int arg0) {
        this.field588 = arg0;
        this.field591 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field586 = new class49(var2);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILmh;Lmh;IILmh;)V", line = 119)
    public static final void method260(int arg0, class62 arg1, class62 arg2, int arg3, int arg4, class62 arg5) {
        field577++;
        for (int var6 = 99; var6 > 0; var6--) {
            class219.field3777[var6] = class219.field3777[var6 - 1];
            class7.field84[var6] = class7.field84[var6 - 1];
            class201.field3411[var6] = class201.field3411[var6 - 1];
            class209.field3536[var6] = class209.field3536[var6 - 1];
            class17.field172[var6] = class17.field172[var6 - 1];
        }
        class78.field1310 = class105.field1716;
        class219.field3777[0] = arg0;
        class17.field172[0] = arg3;
        class274.field4642++;
        class7.field84[0] = arg2;
        class201.field3411[0] = arg1;
        if (arg4 == -1) {
            class209.field3536[0] = arg5;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)Lai;", line = 160)
    public final class206 method261(byte arg0) {
        field583++;
        return arg0 == 2 ? this.field586.method314(arg0 - 39) : (class206) null;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V", line = 202)
    public static final void method262(int arg0) {
        if (arg0 != -32244) {
            return;
        }
        field593++;
        for (int var1 = 0; var1 < class294.field5010; var1++) {
            int var2 = class21.field224[var1];
            class153 var3 = class5.field50[var2];
            int var4 = class75.field1223.method702(-1);
            if ((var4 & 0x1) != 0) {
                var4 += class75.field1223.method702(arg0 ^ 0x7DF3) << 8;
            }
            class186.method1303(var2, var3, (byte) -43, var4);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IJ)Lpi;", line = 231)
    public final class203 method263(int arg0, long arg1) {
        if (arg0 != 2013) {
            field597 = 98;
        }
        class203 var4 = (class203) this.field586.method311((byte) 114, arg1);
        if (var4 != null) {
            this.field587.method1737(var4, arg0 - 1893);
        }
        field589++;
        return var4;
    }
}
