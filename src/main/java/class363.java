import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class363 {

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field5510 = 0;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "Lct;")
    public static class285 field5507 = new class285(39, 7);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "[I")
    public static int[] field5508;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public static final void method2234(int arg0) {
        field5509++;
        int var1 = class2.field42 * 128 + 64;
        int var2 = class77.field1089 * 128 + 64;
        int var3 = class25.method219(arg0 ^ 0x2E59EE7, class486.field6836, var2, var1) - class88.field1243;
        if (class310.field4693 >= 100) {
            class68.field920 = class2.field42 * 128 + 64;
            class200.field3027 = class77.field1089 * 128 + 64;
            class344.field5191 = class25.method219(48602855, class486.field6836, class200.field3027, class68.field920) - class88.field1243;
        } else {
            if (var1 > class68.field920) {
                class68.field920 += (var1 - class68.field920) * class310.field4693 / 1000 + class486.field6835;
                if (class68.field920 > var1) {
                    class68.field920 = var1;
                }
            }
            if (class68.field920 > var1) {
                class68.field920 -= (class68.field920 - var1) * class310.field4693 / 1000 + class486.field6835;
                if (var1 > class68.field920) {
                    class68.field920 = var1;
                }
            }
            if (var3 > class344.field5191) {
                class344.field5191 += (var3 - class344.field5191) * class310.field4693 / 1000 + class486.field6835;
                if (class344.field5191 > var3) {
                    class344.field5191 = var3;
                }
            }
            if (class200.field3027 < var2) {
                class200.field3027 += class486.field6835 + ((var2 - class200.field3027) * class310.field4693 / 1000);
                if (var2 < class200.field3027) {
                    class200.field3027 = var2;
                }
            }
            if (class344.field5191 > var3) {
                class344.field5191 -= (class344.field5191 - var3) * class310.field4693 / 1000 + class486.field6835;
                if (class344.field5191 < var3) {
                    class344.field5191 = var3;
                }
            }
            if (var2 < class200.field3027) {
                class200.field3027 -= (class200.field3027 - var2) * class310.field4693 / 1000 + class486.field6835;
                if (var2 > class200.field3027) {
                    class200.field3027 = var2;
                }
            }
        }
        int var4 = class251.field3622 * 128 + 64;
        int var5 = class306.field4562 * 128 + 64;
        int var6 = class25.method219(48602855, class486.field6836, var4, var5) - class15.field210;
        int var7 = var5 - class68.field920;
        int var8 = var6 - class344.field5191;
        int var9 = var4 - class200.field3027;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class283.field4287 < var11) {
            class283.field4287 += (var11 - class283.field4287 >> 3) * class88.field1246 / 1000 + class358.field5438 << 3;
            if (var11 < class283.field4287) {
                class283.field4287 = var11;
            }
        }
        if (var11 < class283.field4287) {
            class283.field4287 -= class358.field5438 + ((class283.field4287 - var11 >> 3) * class88.field1246 / 1000) << 3;
            if (var11 > class283.field4287) {
                class283.field4287 = var11;
            }
        }
        int var13 = var12 - class433.field6156;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (arg0 < var14) {
            class433.field6156 += class88.field1246 * var14 / 1000 + class358.field5438 << 3;
            class433.field6156 &= 0x3FFF;
        }
        if (var14 < 0) {
            class433.field6156 -= -var14 * class88.field1246 / 1000 + class358.field5438 << 3;
            class433.field6156 &= 0x3FFF;
        }
        int var15 = var12 - class433.field6156;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class433.field6156 = var12;
        }
        class32.field425 = 0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
    public static void method2235(byte arg0) {
        if (arg0 != 91) {
            method2235((byte) 52);
        }
        field5508 = null;
        field5507 = null;
    }
}
