import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class253 {

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "Lvj;")
    public static class373 field3267 = new class373(11, -2);

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "[Lse;")
    public static class213[] field3272 = new class213[32];

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "Z")
    public boolean field3268;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V", line = 5)
    public static void method1433(int arg0) {
        field3272 = null;
        if (arg0 != 255) {
            field3267 = null;
        }
        field3267 = null;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V", line = 16)
    public static final void method1434(byte arg0) {
        if (arg0 != -75) {
            field3272 = null;
        }
        field3264++;
        if (class260.field3361 != -1) {
            class318.method1762(false, arg0 ^ 0xFFFFFFB5, class260.field3361, -1, -1);
            class260.field3361 = -1;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)I", line = 35)
    public static final int method1435(int arg0, int arg1) {
        field3271++;
        if (arg1 != -1) {
            method1435(-3, -124);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Los;Z)V", line = 52)
    public static final void method1436(class374 arg0, boolean arg1) {
        field3273++;
        if (!arg1) {
            method1436(null, true);
        }
        for (int var2 = 0; var2 < class415.field5392; var2++) {
            int var3 = arg0.method2122(false);
            int var4 = arg0.method2136(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class341.field4400[var3] != null) {
                class341.field4400[var3].field134 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)V", line = 81)
    public static final void method1437(int arg0) {
        field3266++;
        if (class16.field124 >= 0) {
            long var1 = class190.method1030(false);
            class16.field124 = (int) ((long) class16.field124 - (var1 - class489.field6827));
            if (class16.field124 <= 0) {
                class78.field914 = class538.field7884.field3962;
                class16.field124 = -1;
                class357.field4693 = class538.field7884.field3948;
                class98.field1199 = class538.field7884.field3953;
                class202.field2428 = class538.field7884.field3955;
                class196.field2377 = class538.field7884.field3946;
                class433.field5866 = class538.field7884.field3958;
                class639.field9197 = class538.field7884.field3961;
                class314.field4010 = class538.field7884.field3950;
                class229.field2840 = class538.field7884.field3943;
                class34.field272 = class538.field7884.field3944;
            } else {
                int var3 = (class16.field124 << 8) / class588.field8537;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class98.field1199 = ((class427.field5497 & 0xFF00FF) * var3 + ((class538.field7884.field3953 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class427.field5497 & 0xFF00) * var3 + (class538.field7884.field3953 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class202.field2428 = (class538.field7884.field3955 - class62.field622) * var6 + class62.field622;
                class229.field2840 = (class538.field7884.field3943 - class280.field3680) * var6 + class280.field3680;
                class433.field5866 = (class538.field7884.field3958 - class437.field6021) * var6 + class437.field6021;
                class357.field4693 = ((class314.field4012 & 0xFF00) * var3 + (class538.field7884.field3948 & 0xFF00) * var4 & 0xFF0000) + ((class314.field4012 & 0xFF00FF) * var3 + (class538.field7884.field3948 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class196.field2377 = (class538.field7884.field3946 - class117.field1474) * var6 + class117.field1474;
                class314.field4010 = class386.field5084 * var3 + (class538.field7884.field3950 * var4) >> 8;
                class34.field272 = (class538.field7884.field3944 - class261.field3369) * var6 + class261.field3369;
                class639.field9197 = (class538.field7884.field3961 - class268.field3499) * var6 + class268.field3499;
                if (class307.field3912 != class538.field7884.field3962) {
                    class78.field914 = class512.field7236.method1162(class307.field3912, class538.field7884.field3962, var6, class78.field914);
                }
            }
            class489.field6827 = var1;
        }
        int var7 = 28 % ((arg0 - 21) / 54);
    }
}
