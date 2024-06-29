import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class179 extends class212 {

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    private int field3128 = 0;

    @OriginalMember(owner = "client!uh", name = "cb", descriptor = "I")
    private int field3135 = 20;

    @OriginalMember(owner = "client!uh", name = "db", descriptor = "I")
    private int field3136 = 1365;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    private int field3129 = 0;

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "I")
    public static int field3133 = 0;

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "[Ldg;")
    public static class90[] field3134 = new class90[256];

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!uh", name = "eb", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!uh", name = "fb", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(III)I")
    public static final int method1190(int arg0, int arg1, int arg2) {
        ++field3137;
        long var3 = (long) ((arg2 << 16) + arg0);
        if (arg1 != -554) {
            method1192(42, (class181) null);
        }
        return class38.field593 != null && ~class38.field593.field606 == ~var3 ? class143.field2318.field3933 * 99 / (class143.field2318.field3977.length - class38.field593.field4060) + 1 : 0;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class179() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V")
    public static void method1191(int arg0) {
        if (arg0 <= 95) {
            field3134 = null;
        }
        field3134 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILsc;)V")
    public static final void method1192(int arg0, class181 arg1) {
        class4.field78 = arg1;
        ++field3132;
        if (class224.field3870.field2285 != null) {
            try {
                class181 var2 = class69.field1109.method1214(class224.field3870.field2285, -11964);
                class181 var3 = class79.field1284.method1214(class224.field3870.field2285, -11964);
                class181 var4 = class175.method1164(new class181[] { var2, class261.field4552, arg1, class33.field537, var3 }, (byte) 127);
                class181 var5;
                if (~arg1.method1226(-458531486) == -1) {
                    var5 = class175.method1164(new class181[] { var4, class73.field1162 }, (byte) 123);
                } else {
                    var5 = class175.method1164(new class181[] { var4, class217.field3735, class63.method447(102, 94608000000L + class213.method1414(-9292)), class68.field1093, class222.method1471(94608000L, (byte) -111) }, (byte) 126);
                }
                class175.method1164(new class181[] { class135.field2209, var5, class21.field374 }, (byte) 127).method1219(class224.field3870.field2285, (byte) 112);
            } catch (Throwable var6) {
            }
            if (arg0 < 118) {
                method1193((class11) null, 11);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            this.field3129 = -2;
        }
        ++field3138;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 == 3) {
                        this.field3129 = arg0.method1535(2);
                    }
                } else {
                    this.field3128 = arg0.method1535(2);
                }
            } else {
                this.field3135 = arg0.method1535(2);
            }
        } else {
            this.field3136 = arg0.method1535(~arg2);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Ljb;I)Z")
    public static final boolean method1193(class11 arg0, int arg1) {
        int var2 = -44 / ((-22 - arg1) / 58);
        ++field3130;
        return arg0.method94(class246.field4292, (byte) 115);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLjb;)V")
    public static final void method1194(byte arg0, class11 arg1) {
        ++field3131;
        if (arg0 < 53) {
            method1194((byte) -85, (class11) null);
        }
        class159.field2728 = arg1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field3127;
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            for (int var4 = 0; var4 < class26.field452; ++var4) {
                int var5 = (class253.field4416[var4] << 12) / this.field3136 + this.field3128;
                int var6 = (class176.field3090[arg0] << 12) / this.field3136 + this.field3129;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5 * var5 >> 12;
                int var10 = var5;
                int var11 = var6;
                int var12 = 0;
                int var13 = var6 * var6 >> 12;
                while (var9 + var13 < 16384 && ~var12 > ~this.field3135) {
                    ++var12;
                    var8 = (var8 * var10 >> 12) * 2 - -var11;
                    var10 = -var13 + var9 + var7;
                    var13 = var8 * var8 >> 12;
                    var9 = var10 * var10 >> 12;
                }
                var3[var4] = ~(this.field3135 + -1) >= ~var12 ? 0 : (var12 << 12) / this.field3135;
            }
        }
        if (arg1 <= 25) {
            this.method24(2, (byte) 112);
        }
        return var3;
    }
}
