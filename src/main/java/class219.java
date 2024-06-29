import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class219 {

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Z")
    public boolean field3470 = false;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public int field3475 = 0;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public int field3480 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3469 = "Please remove ";

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Le;")
    public static class342 field3474 = new class342(64);

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3477 = 0;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3478 = "Loading - please wait.";

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "[B")
    public static byte[] field3479 = new byte[520];

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3482 = 0;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "[B")
    public static byte[] field3481 = new byte[32896];

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lle;")
    public class231 field3476;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3472;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIZ)Lgh;", line = 8)
    public static final class222 method1458(int arg0, int arg1, int arg2, boolean arg3) {
        field3471++;
        class222 var4 = new class222();
        var4.field3511 = arg1;
        var4.field3514 = arg2;
        class185.field3013.method310((long) arg0, var4, 25357);
        class291.method1955(arg2, 1);
        class68 var5 = class319.method2196(-1351736944, arg0);
        if (var5 != null) {
            class317.method2183((byte) -7, var5);
        }
        if (class317.field4795 != null) {
            class317.method2183((byte) -7, class317.field4795);
            class317.field4795 = null;
        }
        int var6 = class48.field999;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class172.method1088(39, class120.field2088[var7])) {
                class14.method111((byte) -101, var7);
            }
        }
        if (class48.field999 == 1) {
            class290.field4459 = false;
            class25.method204((byte) -114, class343.field5328, class112.field1966, class42.field813, class187.field3033);
        } else {
            class25.method204((byte) 90, class343.field5328, class112.field1966, class42.field813, class187.field3033);
            int var8 = class214.field3428.method2118(class330.field5059);
            for (int var9 = 0; var9 < class48.field999; var9++) {
                int var10 = class214.field3428.method2118(class50.method377(-17414, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class187.field3033 = class48.field999 * 15 + (class267.field4117 ? 26 : 22);
            class42.field813 = var8 + 8;
        }
        if (var5 != null) {
            class218.method1453(false, (byte) -113, var5);
        }
        if (!arg3) {
            return (class222) null;
        }
        class234.method1555((byte) 113, arg2);
        if (class158.field2580 != -1) {
            class127.method839(1, class158.field2580, (byte) -115);
        }
        return var4;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3481[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V", line = 111)
    public static final void method1459(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class164.field2638; var3++) {
            for (int var4 = 0; var4 < class306.field4629; var4++) {
                for (int var5 = 0; var5 < class39.field762; var5++) {
                    class47 var6 = class326.field4975[var3][var4][var5];
                    if (var6 != null) {
                        class41 var7 = var6.field965;
                        if (var7 != null && var7.field796.method34()) {
                            class66.method510(var7.field796, var3, var4, var5, 1, 1);
                            if (var7.field788 != null && var7.field788.method34()) {
                                class66.method510(var7.field788, var3, var4, var5, 1, 1);
                                var7.field796.method38(var7.field788, 0, 0, 0, false);
                                var7.field788 = var7.field788.method17(arg0, arg1, arg2);
                            }
                            var7.field796 = var7.field796.method17(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field969; var8++) {
                            class271 var9 = var6.field974[var8];
                            if (var9 != null && var9.field4182.method34()) {
                                class66.method510(var9.field4182, var3, var4, var5, var9.field4176 + 1 - var9.field4180, var9.field4181 - var9.field4187 + 1);
                                var9.field4182 = var9.field4182.method17(arg0, arg1, arg2);
                            }
                        }
                        class289 var10 = var6.field967;
                        if (var10 != null && var10.field4443.method34()) {
                            class283.method1900(var10.field4443, var3, var4, var5);
                            var10.field4443 = var10.field4443.method17(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 188)
    public static final void method1460(int arg0) {
        if (arg0 <= -17) {
            class69.field1470.method1877(-29702);
            field3473++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 211)
    public static void method1461(byte arg0) {
        if (arg0 != 52) {
            method1461((byte) 47);
        }
        field3481 = null;
        field3478 = null;
        field3469 = null;
        field3479 = null;
        field3474 = null;
    }
}
