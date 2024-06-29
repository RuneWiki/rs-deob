import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class225 {

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public int field3833;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lmb;")
    public static class96 field3820 = class243.method1708(")1", (byte) 99);

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "J")
    public static long field3826 = 0L;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Lmb;")
    public static class96 field3829 = class243.method1708("hint_mapmarkers", (byte) 117);

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lff;")
    public static class3 field3821;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[[S")
    public static short[][] field3825;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method1533(int arg0) {
        field3821 = null;
        field3829 = null;
        field3820 = null;
        if (arg0 != 0) {
            method1533(27);
        }
        field3825 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Z")
    public static final boolean method1534(int arg0, int arg1) {
        field3828++;
        if (class154.field2715[arg1]) {
            return true;
        } else if (class108.field2009.method36(true, arg1)) {
            int var2 = class108.field2009.method37(arg1, (byte) -61);
            if (~var2 == arg0) {
                class154.field2715[arg1] = true;
                return true;
            }
            if (class100.field1704[arg1] == null) {
                class100.field1704[arg1] = new class107[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class100.field1704[arg1][var3] == null) {
                    byte[] var4 = class108.field2009.method23(var3, 103, arg1);
                    if (var4 != null) {
                        class100.field1704[arg1][var3] = new class107();
                        class100.field1704[arg1][var3].field1896 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class100.field1704[arg1][var3].method799(new class239(var4), 1);
                        } else {
                            class100.field1704[arg1][var3].method805(7, new class239(var4));
                        }
                    }
                }
            }
            class154.field2715[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)Lmb;")
    public static final class96 method1535(boolean arg0, int arg1) {
        field3823++;
        if (!arg0) {
            field3830 = 45;
        }
        class96 var2 = class31.method205(arg1, (byte) -78);
        for (int var3 = var2.method707(-16) - 3; var3 > 0; var3 -= 3) {
            var2 = class36.method289(-5615, new class96[] { var2.method716(var3, (byte) -13, 0), field3820, var2.method710(127, var3) });
        }
        if (var2.method707(-98) > 9) {
            return class36.method289(-5615, new class96[] { class56.field981, var2.method716(var2.method707(-36) - 8, (byte) -13, 0), class272.field4735, class235.field4030, var2, class237.field4083 });
        } else if (var2.method707(-36) > 6) {
            return class36.method289(-5615, new class96[] { class76.field1309, var2.method716(var2.method707(-21) - 4, (byte) -13, 0), class170.field2979, class235.field4030, var2, class237.field4083 });
        } else {
            return class36.method289(-5615, new class96[] { class138.field2473, var2, class198.field3455 });
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class225() {
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lcf;)V")
    public class225(class225 arg0) {
        this.field3824 = arg0.field3824;
        this.field3833 = arg0.field3833;
        this.field3827 = arg0.field3827;
        this.field3822 = arg0.field3822;
    }
}
