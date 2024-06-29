import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class174 {

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Lar;")
    public class47 field2485 = new class47();

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "Z")
    public boolean field2488 = false;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public int field2487;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public int field2489;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "Lh;")
    public static class429 field2483;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lea;B)V", line = 7)
    public static final void method1234(class58 arg0, byte arg1) {
        field2482++;
        if (class53.field678) {
            class72.method570((byte) 70, arg0);
        } else {
            class276.method1743(-108, arg0);
        }
        if (arg1 != -123) {
            field2481 = -23;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLjava/lang/String;I)I", line = 23)
    public static final int method1235(byte arg0, String arg1, int arg2) {
        field2486++;
        return arg0 == 100 ? class144.method1044(true, arg1, arg2, (byte) 107) : 46;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 35)
    public static final int method1236(boolean arg0, String arg1) {
        field2480++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        if (!arg0) {
            method1237(53);
        }
        while (class353.field4751 > var2) {
            if (arg1.equalsIgnoreCase(class196.field2851[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 64)
    public static void method1237(int arg0) {
        field2483 = null;
        if (arg0 != 1) {
            method1239(44, (class223) null, 116, 33);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V", line = 76)
    public static final void method1238(int arg0) {
        field2490++;
        class271.method1721(class354.field4765, (long) class246.field3467, (byte) -86);
        if (class350.field4712 != -1) {
            class155.method1133(80, class350.field4712);
        }
        for (int var1 = 0; var1 < class58.field751; var1++) {
            if (class363.field4998[var1]) {
                class53.field680[var1] = true;
            }
            class160.field2276[var1] = class363.field4998[var1];
            class363.field4998[var1] = false;
        }
        class251.field3507 = class246.field3467;
        if (class354.field4765.method166()) {
            class18.field241 = true;
        }
        if (class350.field4712 != -1) {
            class58.field751 = 0;
            class130.method978((byte) -105);
        }
        class354.field4765.method204();
        class31.method285(class430.field6019, -1);
        if (arg0 != 23269) {
            method1239(-83, (class223) null, -43, 34);
        }
        class54.field694 = 0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILiq;II)J", line = 128)
    public static final long method1239(int arg0, class223 arg1, int arg2, int arg3) {
        field2479++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class447 var10 = class133.method996((byte) -19, arg1.method711(true));
        int var11 = 24 % ((arg3 + 63) / 56);
        long var12 = (long) (arg0 | 0x40000000 | arg2 << 7 | arg1.method695(898) << 14 | arg1.method709(30030) << 20);
        if (var10.field6297 == 0) {
            var12 |= var8;
        }
        if (var10.field6308 == 1) {
            var12 |= var4;
        }
        if (var10.field6306) {
            var12 |= var6;
        }
        return var12 | (long) arg1.method711(true) << 32;
    }
}
