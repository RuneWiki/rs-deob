import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class112 extends class228 {

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    private int field2019 = 0;

    @OriginalMember(owner = "client!sk", name = "bb", descriptor = "I")
    private int field2027 = 4096;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "Loa;")
    public static class99 field2018 = class221.method1463(2844, "scrollen:");

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "I")
    public static int field2023 = 0;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "Loe;")
    public static class143 field2020 = new class143(5000);

    @OriginalMember(owner = "client!sk", name = "cb", descriptor = "I")
    public static int field2028 = 1;

    @OriginalMember(owner = "client!sk", name = "db", descriptor = "[I")
    public static int[] field2029 = new int[100];

    @OriginalMember(owner = "client!sk", name = "eb", descriptor = "Loa;")
    public static class99 field2030 = class221.method1463(2844, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!sk", name = "ab", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "[[[I")
    public static int[][][] field2025;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        ++field2021;
        if (arg2 != -7618) {
            field2026 = -32;
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field2027 = arg1.method1740((byte) 76);
            }
        } else {
            this.field2019 = arg1.method1740((byte) 73);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field2024;
        int[] var3 = super.field3952.method1262(arg0, arg1 + 7495);
        if (super.field3952.field3276) {
            int[] var4 = this.method1500(arg0, 0, (byte) 118);
            for (int var5 = 0; ~class234.field4046 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field2019 && this.field2027 >= var6 ? 4096 : 0;
            }
        }
        if (arg1 != -3) {
            this.method18(110, (class261) null, 104);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class112() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "(B)V")
    public static void method770(byte arg0) {
        field2030 = null;
        field2020 = null;
        if (arg0 >= 12) {
            field2025 = null;
            field2018 = null;
            field2029 = null;
        }
    }
}
