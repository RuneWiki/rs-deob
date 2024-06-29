import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class114 extends class259 {

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    private int field2254 = 0;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    private int field2256 = 4096;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "Lsg;")
    public static class30 field2255 = class167.method1221((byte) 33, "Ausw-=hlen");

    @OriginalMember(owner = "client!ch", name = "fb", descriptor = "I")
    public static int field2266 = 0;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lsg;B)Z")
    public static final boolean method886(class30 arg0, byte arg1) {
        ++field2264;
        if (arg0 == null) {
            return false;
        } else if (arg1 != -107) {
            return false;
        } else {
            for (int var2 = 0; ~var2 > ~class117.field2307; ++var2) {
                if (arg0.method285(class204.field3661[var2], arg1 + 107)) {
                    return true;
                }
            }
            return arg0.method285(class247.field4394.field2349, 0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
    public static void method887(byte arg0) {
        if (arg0 > -54) {
            method890(-39, -126, 105);
        }
        field2255 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field2253;
        if (arg1) {
            method889((class151) null, 97, true, 97);
        }
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int[] var4 = this.method1799(0, arg0, 111);
            for (int var5 = 0; var5 < class223.field3999; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field2254 <= var6 && this.field2256 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)[Lpj;")
    public static final class152[] method888(byte arg0) {
        ++field2263;
        class152[] var1 = new class152[class23.field435];
        int var2 = 0;
        if (arg0 > -89) {
            field2257 = 55;
        }
        while (~class23.field435 < ~var2) {
            int var3 = class62.field1329[var2] * class2.field33[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class222.field3992[var2];
            for (int var6 = 0; var6 < var3; ++var6) {
                var4[var6] = class191.field3475[class68.method612(var5[var6], 255)];
            }
            var1[var2] = new class152(class190.field3464, class273.field4774, class142.field2752[var2], class37.field895[var2], class62.field1329[var2], class2.field33[var2], var4);
            ++var2;
        }
        class175.method1285((byte) 53);
        return var1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lmc;IZI)Lpj;")
    public static final class152 method889(class151 arg0, int arg1, boolean arg2, int arg3) {
        ++field2262;
        if (!class224.method1608(arg3, arg1, arg0, 0)) {
            return null;
        } else {
            if (arg2) {
                field2255 = null;
            }
            return class121.method924(arg2);
        }
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(III)I")
    public static final int method890(int arg0, int arg1, int arg2) {
        ++field2260;
        int var3 = arg2 >>> 31;
        return arg0 != -1394 ? 12 : (arg2 + var3) / arg1 + -var3;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class114() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            this.field2254 = 68;
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field2256 = arg2.method65((byte) 120);
            }
        } else {
            this.field2254 = arg2.method65((byte) 123);
        }
        ++field2261;
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)V")
    public static final void method891(int arg0) {
        ++field2258;
        if (class175.field3258) {
            class31 var1 = class122.method931(class125.field2445, (byte) 127, class210.field3772);
            if (var1 != null && var1.field711 != null) {
                class183 var2 = new class183();
                var2.field3369 = var1;
                var2.field3363 = var1.field711;
                class104.method835(var2, (byte) 41);
            }
            class175.field3258 = false;
            if (arg0 != 5919) {
                field2266 = 37;
            }
            class254.method1771(var1, arg0 ^ 5911);
        }
    }
}
