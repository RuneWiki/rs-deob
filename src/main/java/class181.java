import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class181 extends class397 {

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "[I")
    public static int[] field2589 = new int[13];

    @OriginalMember(owner = "client!bq", name = "S", descriptor = "I")
    public static int field2594 = 0;

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!bq", name = "R", descriptor = "Lhe;")
    public static class239 field2593;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "Lhr;")
    public static class348 field2587;

    @OriginalMember(owner = "client!bq", name = "P", descriptor = "[[Lts;")
    public static class356[][] field2591;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B[Lqg;)V", line = 14)
    public static final void method1148(byte arg0, class307[] arg1) {
        ++field2592;
        class251.field3612 = arg1.length;
        class93.field1255 = new class307[class251.field3612 - -10];
        class9.field143 = new int[class251.field3612 + 10];
        class268.method1642(arg1, 0, class93.field1255, 0, class251.field3612);
        for (int var2 = 0; var2 < class251.field3612; ++var2) {
            class9.field143[var2] = class93.field1255[var2].method94();
        }
        int var3 = class251.field3612;
        if (arg0 <= -86) {
            while (var3 < class93.field1255.length) {
                class9.field143[var3] = 12;
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(Z)V", line = 42)
    public static final void method1149(boolean arg0) {
        if (arg0) {
            class358.field5312 = class239.field3347;
            class311.field4527 = class178.field2562;
        } else {
            class358.field5312 = class363.field5460;
            class311.field4527 = class459.field6685;
        }
        class399.field5881 = class358.field5312.length;
    }

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "(B)V", line = 56)
    public static void method1150(byte arg0) {
        field2587 = null;
        field2589 = null;
        field2591 = null;
        int var1 = -53 % ((arg0 - 62) / 42);
        field2593 = null;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V", line = 68)
    public class181() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(II)[I", line = 71)
    public final int[] method31(int arg0, int arg1) {
        ++field2590;
        int[] var3 = super.field5854.method465(arg1, 126);
        if (arg0 != -780833076) {
            field2593 = null;
        }
        if (super.field5854.field991) {
            int[][] var4 = this.method2377(arg1, -99, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class164.field2152 > var8; ++var8) {
                var3[var8] = (var6[var8] - -var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }
}
