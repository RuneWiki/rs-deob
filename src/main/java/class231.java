import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class231 {

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "J")
    public static long field3917 = 0L;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[I")
    public static int[] field3914 = new int[25];

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "[I")
    public static int[] field3924 = new int[256];

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lag;")
    public class231 field3922;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lag;")
    public class231 field3923;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Laj;I)Z")
    public static final boolean method1661(class151 arg0, int arg1) {
        field3919++;
        if (arg0.method1118((byte) 98, class31.field519)) {
            return true;
        } else {
            if (arg1 != 256) {
                field3917 = -99L;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
    public static final void method1662(int arg0, int arg1) {
        field3916++;
        class253.field4282 = -1;
        class253.field4282 = arg1;
        class219.field3701 = arg0;
        class245.method1753(12627);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public final void method1663(int arg0) {
        field3921++;
        if (this.field3923 == null) {
            return;
        }
        this.field3923.field3922 = this.field3922;
        this.field3922.field3923 = this.field3923;
        if (arg0 <= -58) {
            this.field3922 = null;
            this.field3923 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static final void method1664(int arg0) {
        field3918++;
        class268.field4456 = 0;
        class289.field4761 = 0;
        if (arg0 <= 42) {
            return;
        }
        class5.method40((byte) 104);
        class168.method1260(-57);
        class152.method1163(false);
        for (int var1 = 0; var1 < class268.field4456; var1++) {
            int var3 = class185.field2968[var1];
            if (class275.field4598 != class57.field1002[var3].field749) {
                if (class57.field1002[var3].field4960.method341(true)) {
                    class115.method882(class57.field1002[var3], (byte) -91);
                }
                class57.field1002[var3].method2078(93, (class54) null);
                class57.field1002[var3] = null;
            }
        }
        if (class150.field2480 != class136.field2239.field4160) {
            throw new RuntimeException("gnp1 pos:" + class136.field2239.field4160 + " psize:" + class150.field2480);
        }
        for (int var2 = 0; var2 < class303.field4932; var2++) {
            if (class57.field1002[class186.field2972[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class303.field4932);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V")
    public static void method1665(int arg0) {
        field3914 = null;
        field3924 = null;
        if (arg0 >= -108) {
            method1664(-119);
        }
    }
}
