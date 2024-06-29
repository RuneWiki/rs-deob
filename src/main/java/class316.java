import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class316 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "J")
    public static long field5484 = 0L;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Lwm;")
    public static class152 field5490 = class157.method1048(")2", 110);

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Loe;")
    public static class127 field5488;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Lrd;")
    public static class171 field5485;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Ljava/awt/Font;")
    public static Font field5494;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[Ldc;")
    public static class109[] field5492;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()V", line = 5)
    public static final void method2207() {
        for (int var0 = 0; var0 < class213.field3474; var0++) {
            class248 var1 = class237.field3881[var0];
            class6.method31(var1);
            class237.field3881[var0] = null;
        }
        class213.field3474 = 0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILwm;I)V", line = 24)
    public static final void method2208(int arg0, class152 arg1, int arg2) {
        field5491++;
        class303 var3 = class90.method589(false, arg2, 2);
        int var4 = 96 / ((-arg0 - 20) / 59);
        var3.method2117((byte) 114);
        var3.field5215 = arg1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 39)
    public static final void method2209(byte arg0) {
        field5487++;
        int var1 = 0;
        if (arg0 > -4) {
            field5484 = -102L;
        }
        while (var1 < class238.field3912) {
            int var2 = class235.field3851[var1];
            class12 var3 = class22.field380[var2];
            int var4 = class73.field1058.method2011(-29);
            if ((var4 & 0x8) != 0) {
                var4 += class73.field1058.method2011(-122) << 8;
            }
            class125.method794(var4, var2, (byte) -40, var3);
            var1++;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIB)V", line = 67)
    public static final void method2210(int arg0, int arg1, byte arg2) {
        if (class6.field93 != 0 && arg0 != -1) {
            class116.method766(0, class112.field1589, arg0, false, 0, class6.field93);
            class111.field1571 = true;
        }
        if (arg2 != 83) {
            field5484 = 73L;
        }
        field5489++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 95)
    public static final void method2211(int arg0) {
        class152.field2425.method1613(-22696);
        field5486++;
        if (arg0 != 0) {
            field5488 = (class127) null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZIB)I", line = 107)
    public static final int method2212(int arg0, boolean arg1, int arg2, byte arg3) {
        field5493++;
        class123 var4 = (class123) class225.field3655.method1586((long) arg0, -121);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        int var6 = 0;
        if (arg3 != 24) {
            method2210(-101, -49, (byte) 77);
        }
        while (var4.field1730.length > var6) {
            if (var4.field1730[var6] >= 0 && var4.field1730[var6] < class176.field2841) {
                class312 var7 = class189.method1253((byte) 101, var4.field1730[var6]);
                if (var7.field5411 != null) {
                    class114 var8 = (class114) var7.field5411.method1586((long) arg2, -60);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field1729[var6] * var8.field1616;
                        } else {
                            var5 += var8.field1616;
                        }
                    }
                }
            }
            var6++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V", line = 168)
    public static void method2213(boolean arg0) {
        if (arg0) {
            method2211(-113);
        }
        field5494 = null;
        field5492 = null;
        field5485 = null;
        field5490 = null;
        field5488 = null;
    }
}
