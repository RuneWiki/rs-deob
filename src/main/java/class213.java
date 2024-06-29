import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class213 {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lmb;")
    public static class96 field3669 = class243.method1708("Lade Sprites )2 ", (byte) 92);

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field3672 = 0;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "Lmb;")
    private static class96 field3678 = class243.method1708("Drop", (byte) 126);

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lw;")
    public static class107 field3673 = null;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lmb;")
    public static class96 field3675 = field3678;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Luc;")
    public static class11 field3667 = new class11(64);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Ltf;")
    public static class106 field3668;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Lff;")
    public static class3 field3676;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method1478(int arg0) {
        field3669 = null;
        field3676 = null;
        field3667 = null;
        field3668 = null;
        if (arg0 != -3574) {
            field3675 = null;
        }
        field3673 = null;
        field3675 = null;
        field3678 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static final void method1479(boolean arg0) {
        if (arg0) {
            field3671++;
            if (class203.field3517 == 5) {
                class203.field3517 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
    public static final void method1480(int arg0, int arg1, int arg2, int arg3) {
        field3670++;
        if (arg2 != -5) {
            method1482(false);
        }
        class96 var4 = class36.method289(-5615, new class96[] { class211.field3629, class31.method205(arg3, (byte) -78), class225.field3820, class31.method205(arg0 >> 6, (byte) -78), class225.field3820, class31.method205(arg1 >> 6, (byte) -78), class225.field3820, class31.method205(arg0 & 0x3F, (byte) -78), class225.field3820, class31.method205(arg1 & 0x3F, (byte) -78) });
        var4.method686(true);
        class265.method1826((byte) -87, var4);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lff;I)V")
    public static final void method1481(class3 arg0, int arg1) {
        class181.field3152 = arg0;
        int var2 = -44 % ((-arg1 - 23) / 53);
        field3666++;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
    public static final void method1482(boolean arg0) {
        class194.method1352();
        if (!arg0) {
            method1479(true);
        }
        field3677++;
        for (int var1 = 0; var1 < 4; var1++) {
            class62.field1064[var1].method1429(-110);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLw;)Lw;")
    public static final class107 method1483(byte arg0, class107 arg1) {
        field3674++;
        if (arg1.field1827 != -1) {
            return class55.method408(arg1.field1827, arg0 ^ 0xF10675C6);
        }
        int var2 = arg1.field1896 >>> 16;
        if (arg0 != -10) {
            return null;
        }
        class151 var3 = new class151(class34.field606);
        for (class168 var4 = (class168) var3.method1106(-126); var4 != null; var4 = (class168) var3.method1109(85)) {
            if (var4.field2961 == var2) {
                return class55.method408((int) var4.field4304, 251234864);
            }
        }
        return null;
    }
}
