import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class318 {

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    private int field4994 = 0;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "Lbu;")
    private class407 field4996;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "Z")
    public static boolean field5000 = false;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "Lvv;")
    public static class313 field4999 = new class313(19, 5);

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "Ljp;")
    private class276 field4991;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
    public static void method2015(int arg0) {
        if (arg0 == 0) {
            field4999 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)Ljp;")
    public final class276 method2016(int arg0) {
        field4997++;
        if (arg0 < this.field4994 && this.field4996.field6170[this.field4994 - 1] != this.field4991) {
            class276 var2 = this.field4991;
            this.field4991 = var2.field4535;
            return var2;
        }
        while (this.field4996.field6176 > this.field4994) {
            class276 var3 = this.field4996.field6170[this.field4994++].field4535;
            if (this.field4996.field6170[this.field4994 - 1] != var3) {
                this.field4991 = var3.field4535;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
    public static final void method2017(boolean arg0) {
        field4993++;
        class364.field5666 = new class162(class151.field2420.method1954(class300.field4813, -30366), "", class102.field1688, 1006, -1, 0L, 0, 0, true, arg0);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lqs;Lqs;BLza;)V")
    public static final void method2018(class496 arg0, class496 arg1, byte arg2, class491 arg3) {
        if (arg2 <= 108) {
            field4998 = -20;
        }
        field4995++;
        class66.field978 = class216.method1495(0, arg1, class191.field2972, (byte) -33);
        class151.field2423 = arg3.method892(class66.field978, class523.method3090(arg0, class191.field2972, 0), true);
        class136.field2303 = class216.method1495(0, arg1, class471.field6994, (byte) -92);
        class531.field7796 = arg3.method892(class136.field2303, class523.method3090(arg0, class471.field6994, 0), true);
        class84.field1467 = class216.method1495(0, arg1, class54.field874, (byte) -84);
        class127.field2188 = arg3.method892(class84.field1467, class523.method3090(arg0, class54.field874, 0), true);
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)Ljp;")
    public final class276 method2019(int arg0) {
        if (arg0 != 21388) {
            field5000 = false;
        }
        this.field4994 = 0;
        field5001++;
        return this.method2016(0);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
    public static final void method2020(byte arg0) {
        if (arg0 == 65) {
            field4992++;
            class480.field7080 = 0;
            class108.field1934.method2543(arg0 + 7590);
            class387.field5967 = false;
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lbu;)V")
    public class318(class407 arg0) {
        this.field4996 = arg0;
    }
}
