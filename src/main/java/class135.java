import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class135 extends class86 {

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    private int field2250 = 0;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "I")
    private int field2252 = 4096;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "Lcn;")
    public static class37 field2251 = new class37(8);

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field2255 = 5063219;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "I")
    public static int field2261 = -2;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "[I")
    public static int[] field2254;

    @OriginalMember(owner = "client!om", name = "S", descriptor = "[I")
    public static int[] field2257;

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V", line = 3)
    public class135() {
        super(1, true);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V", line = 10)
    public static final void method1140(byte arg0) {
        field2249++;
        for (class285 var1 = (class285) class363.field5747.method2244((byte) -128); var1 != null; var1 = (class285) class363.field5747.method2241(arg0 + 63)) {
            if (var1.field4417 == -1) {
                var1.field4431 = 0;
                class89.method803(var1, arg0 ^ 0x3F);
            } else {
                var1.method1357(947647010);
            }
        }
        if (arg0 != -64) {
            method1140((byte) 18);
        }
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V", line = 35)
    public static void method1141(int arg0) {
        field2251 = null;
        field2254 = null;
        int var1 = 80 % ((arg0 + 69) / 49);
        field2257 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZLug;)V", line = 52)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field2253++;
        if (arg0 == 0) {
            this.field2250 = arg2.method314((byte) 47);
        } else if (arg0 == 1) {
            this.field2252 = arg2.method314((byte) 62);
        }
        if (arg1) {
            this.method157(-111, true, (class25) null);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)[I", line = 96)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 < 7) {
            this.field2250 = -113;
        }
        field2260++;
        int[] var3 = this.field1225.method1914(arg0, 89);
        if (this.field1225.field3995) {
            int[] var4 = this.method774(0, arg0, 0);
            for (int var5 = 0; var5 < class93.field1424; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field2250 <= var6 && var6 <= this.field2252 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(III)I", line = 134)
    public static final int method1142(int arg0, int arg1, int arg2) {
        class133 var3 = (class133) class81.field1169.method370((byte) -120, (long) arg1);
        field2258++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else if (arg0 == 1) {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2227.length; var5++) {
                if (var3.field2231[var5] == arg2) {
                    var4 += var3.field2227[var5];
                }
            }
            return var4;
        } else {
            return 96;
        }
    }
}
