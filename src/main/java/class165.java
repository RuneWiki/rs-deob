import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class165 {

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lid;")
    public static class149 field3072 = class60.method382(" loggt sich ein)3", (byte) 43);

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lid;")
    public static class149 field3074 = class60.method382("null", (byte) 79);

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lid;")
    public static class149 field3071 = class60.method382("tremblement:", (byte) 126);

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field3076 = 0;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field3073 = 0;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field3068 = 0;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field3075 = 0;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lm;")
    public static final class116 method1208(int arg0, int arg1) {
        field3070++;
        class116 var2 = (class116) class94.field1658.method800(261775, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class162.field3003.method1562(-809612665, 0, arg0);
        if (var3 == null) {
            return null;
        }
        class116 var4 = new class116();
        class74 var5 = new class74(var3);
        var5.field1340 = var5.field1321.length - 2;
        int var6 = var5.method485(-2386);
        int var7 = var5.field1321.length - var6 - 2 - 12;
        var5.field1340 = var7;
        int var8 = var5.method498((byte) 127);
        var4.field1977 = var5.method485(-2386);
        var4.field1981 = var5.method485(-2386);
        var4.field1983 = var5.method485(-2386);
        var4.field1990 = var5.method485(-2386);
        int var9 = var5.method489((byte) 105);
        if (var9 > 0) {
            var4.field1986 = new class85[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method485(-2386);
                class85 var12 = new class85(class5.method30(113, var11));
                var4.field1986[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method498((byte) 126);
                    int var14 = var5.method498((byte) 125);
                    var12.method638((byte) -89, new class143(var14), (long) var13);
                }
            }
        }
        int var15 = 0;
        var5.field1340 = 0;
        var4.field1982 = var5.method527(110);
        var4.field1976 = new int[var8];
        var4.field1974 = new class149[var8];
        var4.field1978 = new int[var8];
        if (arg1 > -94) {
            return null;
        }
        while (var7 > var5.field1340) {
            int var16 = var5.method485(-2386);
            if (var16 == 3) {
                var4.field1974[var15] = var5.method529(-1);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field1978[var15] = var5.method489((byte) 111);
            } else {
                var4.field1978[var15] = var5.method498((byte) 126);
            }
            var4.field1976[var15++] = var16;
        }
        class94.field1658.method802((long) arg0, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method1209(int arg0) {
        field3071 = null;
        if (arg0 != -25229) {
            field3071 = null;
        }
        field3072 = null;
        field3074 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)J")
    public static final long method1210(int arg0, int arg1, int arg2) {
        class231 var3 = class261.field4664[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field4047; var4++) {
            class23 var5 = var3.field4061[var4];
            if ((var5.field338 >> 29 & 0x3L) == 2L && var5.field318 == arg1 && var5.field330 == arg2) {
                return var5.field338;
            }
        }
        return 0L;
    }
}
