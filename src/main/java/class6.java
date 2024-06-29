import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class6 extends class279 {

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    private int field76 = 4096;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    private int field68 = 0;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "Ltl;")
    public static class59 field64 = class85.method639(" GMT", 9588);

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "Ltl;")
    private static class59 field67 = class85.method639("Loaded world list data", 9588);

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "Ltl;")
    public static class59 field66 = class85.method639("Clientscript error in: ", 9588);

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "Ltl;")
    public static class59 field71 = class85.method639(")1o", 9588);

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "[Z")
    public static boolean[] field65 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "Ltl;")
    public static class59 field77 = field67;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "Ltl;")
    private static class59 field79 = class85.method639("white:", 9588);

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "Ltl;")
    public static class59 field63 = field79;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "Ltl;")
    public static class59 field61 = field79;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)[I", line = 7)
    public final int[] method44(boolean arg0, int arg1) {
        field69++;
        if (arg0) {
            field66 = (class59) null;
        }
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            int[] var4 = this.method1960(-128, arg1, 0);
            for (int var5 = 0; var5 < class56.field835; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field68 && this.field76 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 39)
    public class6() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)I", line = 44)
    public static final int method45(int arg0, byte arg1) {
        if (arg1 <= 74) {
            return -104;
        } else {
            field75++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILtl;ILtl;)V", line = 56)
    public static final void method46(int arg0, class59 arg1, int arg2, class59 arg3) {
        class275.field4734 = arg1;
        class170.field2730 = arg0;
        class275.field4744 = arg3;
        field70++;
        if (class275.field4744.method453(class275.field4742, (byte) -71) || class275.field4734.method453(class275.field4742, (byte) -106)) {
            class276.field4753 = 3;
        } else if (class46.field754 == -1) {
            int var4 = -32 % ((arg2 + 51) / 40);
            class223.field3613 = 1;
            class276.field4753 = -3;
            class223.field3626 = 0;
            class170 var5 = new class170(128);
            var5.method1219(10, true);
            var5.method1237(true, (int) (Math.random() * 99999.0D));
            var5.method1237(true, 519);
            var5.method1206(class275.field4744.method488((byte) 83), false);
            var5.method1213(-1, (int) (Math.random() * 9.9999999E7D));
            var5.method1236((byte) 48, class275.field4734);
            var5.method1213(-1, (int) (Math.random() * 9.9999999E7D));
            var5.method1216(class185.field3105, class221.field3579, 102);
            class234.field3888.field2787 = 0;
            class234.field3888.method1219(136, true);
            class234.field3888.method1219(var5.field2787, true);
            class234.field3888.method1203(0, (byte) -127, var5.field2787, var5.field2758);
        } else {
            class235.method1654((byte) 79);
        }
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V", line = 98)
    public static final void method47(int arg0) {
        field74++;
        if (arg0 >= -122) {
            field63 = (class59) null;
        }
        if (class238.field3978 == 10 && class55.field815) {
            class286.method1996(30143, 28);
        }
        if (class238.field3978 == 30) {
            class286.method1996(30143, 25);
        }
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V", line = 115)
    public static void method48(int arg0) {
        field65 = null;
        if (arg0 <= 74) {
            method49((byte) 5, 23);
        }
        field79 = null;
        field61 = null;
        field63 = null;
        field66 = null;
        field67 = null;
        field77 = null;
        field64 = null;
        field71 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V", line = 155)
    public static final void method49(byte arg0, int arg1) {
        if (class213.field3500 == null) {
            class213.field3500 = new byte[4][104][104];
        }
        if (arg1 != 4) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class213.field3500[var2][var3][var4] = arg0;
                }
            }
        }
        field73++;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(IB)V", line = 214)
    public static final void method50(int arg0, byte arg1) {
        field72++;
        class213 var2 = class262.field4365;
        synchronized (class262.field4365) {
            if (arg1 < -72) {
                class37.field550 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILs;)V", line = 235)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field68 = arg2.method1214(-18254);
        } else if (arg1 == 1) {
            this.field76 = arg2.method1214(-18254);
        }
        if (arg0 > -125) {
            method49((byte) -88, 108);
        }
        field78++;
    }
}
