import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class173 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lmb;")
    public static class96 field3023 = class243.method1708("Abbrechen", (byte) 125);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[[[I")
    public static int[][][] field3022;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method1232(int arg0, byte arg1) {
        field3020++;
        if (arg0 == 100 && class153.field2700 > 0) {
            byte[] var2 = class167.field2945[--class153.field2700];
            class167.field2945[class153.field2700] = null;
            return var2;
        } else if (arg0 == 5000 && class224.field3812 > 0) {
            byte[] var3 = class82.field1382[--class224.field3812];
            class82.field1382[class224.field3812] = null;
            return var3;
        } else if (arg1 != 14) {
            return null;
        } else if (arg0 == 30000 && class233.field3998 > 0) {
            byte[] var4 = class23.field404[--class233.field3998];
            class23.field404[class233.field3998] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method1233(byte arg0) {
        field3023 = null;
        int var1 = 123 / ((arg0 - 54) / 63);
        field3022 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lff;ZLff;I)V")
    public static final void method1234(class3 arg0, boolean arg1, class3 arg2, int arg3) {
        class214.field3685 = arg2;
        if (arg3 >= 63) {
            field3021++;
            class177.field3072 = arg1;
            class220.field3762 = arg0;
        }
    }
}
