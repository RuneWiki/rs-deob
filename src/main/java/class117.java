import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class117 {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field2936 = 0;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2935 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lpd;")
    private static class94 field2940 = class28.method249(-128, "Moderator option: Mute player for 48 hours: <ON>");

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lme;")
    public static class77 field2938 = null;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field2941 = 0;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lpd;")
    public static class94 field2942 = field2940;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Z")
    public static boolean field2939;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 5)
    public static void method884(int arg0) {
        if (arg0 != 1115298848) {
            method885(80);
        }
        field2940 = null;
        field2935 = null;
        field2942 = null;
        field2938 = null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)I", line = 42)
    public static final int method885(int arg0) {
        field2937++;
        int var1 = 3;
        if (class87.field2207 < 310) {
            int var2 = class105.field2615 >> 7;
            int var3 = class80.field2044.field177 >> 7;
            int var4 = class20.field553 >> 7;
            int var5 = class80.field2044.field222 >> 7;
            if ((class108.field2679[class64.field1589][var4][var2] & 0x4) != 0) {
                var1 = class64.field1589;
            }
            int var6;
            if (var5 <= var2) {
                var6 = var2 - var5;
            } else {
                var6 = var5 - var2;
            }
            int var7;
            if (var3 > var4) {
                var7 = var3 - var4;
            } else {
                var7 = var4 - var3;
            }
            if (var7 <= var6) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var2 != var5) {
                    if (var2 < var5) {
                        var2++;
                    } else if (var5 < var2) {
                        var2--;
                    }
                    var9 += var8;
                    if ((class108.field2679[class64.field1589][var4][var2] & 0x4) != 0) {
                        var1 = class64.field1589;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var3 > var4) {
                            var4++;
                        } else if (var3 < var4) {
                            var4--;
                        }
                        if ((class108.field2679[class64.field1589][var4][var2] & 0x4) != 0) {
                            var1 = class64.field1589;
                        }
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var6 * 65536 / var7;
                while (var3 != var4) {
                    var10 += var11;
                    if (var4 < var3) {
                        var4++;
                    } else if (var3 < var4) {
                        var4--;
                    }
                    if ((class108.field2679[class64.field1589][var4][var2] & 0x4) != 0) {
                        var1 = class64.field1589;
                    }
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var2 < var5) {
                            var2++;
                        } else if (var2 > var5) {
                            var2--;
                        }
                        if ((class108.field2679[class64.field1589][var4][var2] & 0x4) != 0) {
                            var1 = class64.field1589;
                        }
                    }
                }
            }
        }
        if (arg0 > -92) {
            return -29;
        } else {
            if ((class108.field2679[class64.field1589][class80.field2044.field177 >> 7][class80.field2044.field222 >> 7] & 0x4) != 0) {
                var1 = class64.field1589;
            }
            return var1;
        }
    }
}
