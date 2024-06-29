import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class235 {

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field3866 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lve;")
    public static class255 field3864 = class87.method607(125, ")1");

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lve;")
    public static class255 field3870 = class87.method607(43, "_labels");

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lve;")
    public static class255 field3868 = class87.method607(110, "(U0a )2 via: ");

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field3871 = 0;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field3873 = 1;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Ltj;")
    public static class169 field3867;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Lrg;")
    public static class88 field3869;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1625(byte arg0) {
        field3865++;
        if (class85.method592((byte) 76) != 2) {
            return;
        }
        byte var1 = (byte) (class93.field1600 - 4 & 0xFF);
        int var2 = class93.field1600 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class96.field1664[var3][var2][var4] = var1;
            }
        }
        if (client.field4039 == 3 || arg0 >= -59) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class29.field450[var5] = -1000000;
            class185.field2990[var5] = 1000000;
            class143.field2378[var5] = 0;
            class82.field1324[var5] = 1000000;
            class307.field5224[var5] = 0;
        }
        if (class3.field50 != 1) {
            int var16 = class113.method861((byte) -113, class221.field3723, class256.field4373, client.field4039);
            if ((var16 - class153.field2599) < 800 && (class166.field2800[client.field4039][class221.field3723 >> 7][class256.field4373 >> 7] & 0x4) != 0) {
                class221.method1553(false, class118.field1984, class221.field3723 >> 7, -126, class256.field4373 >> 7, 1);
            }
            return;
        }
        if ((class166.field2800[client.field4039][class276.field4742.field5130 >> 7][class276.field4742.field5173 >> 7] & 0x4) != 0) {
            class221.method1553(false, class118.field1984, class276.field4742.field5130 >> 7, -125, class276.field4742.field5173 >> 7, 0);
        }
        if (class260.field4409 >= 310) {
            return;
        }
        int var6 = class256.field4373 >> 7;
        int var7 = class221.field3723 >> 7;
        int var8 = class276.field4742.field5130 >> 7;
        int var9 = class276.field4742.field5173 >> 7;
        int var10;
        if (var7 < var8) {
            var10 = var8 - var7;
        } else {
            var10 = var7 - var8;
        }
        int var11;
        if (var9 > var6) {
            var11 = var9 - var6;
        } else {
            var11 = var6 - var9;
        }
        if (var10 <= var11) {
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var6 != var9) {
                if (var6 < var9) {
                    var6++;
                } else if (var6 > var9) {
                    var6--;
                }
                if ((class166.field2800[client.field4039][var7][var6] & 0x4) != 0) {
                    class221.method1553(false, class118.field1984, var7, -128, var6, 1);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var7 < var8) {
                        var7++;
                    } else if (var8 < var7) {
                        var7--;
                    }
                    if ((class166.field2800[client.field4039][var7][var6] & 0x4) != 0) {
                        class221.method1553(false, class118.field1984, var7, -117, var6, 1);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var11 * 65536 / var10;
        int var13 = 32768;
        while (var7 != var8) {
            if (var8 > var7) {
                var7++;
            } else if (var7 > var8) {
                var7--;
            }
            if ((class166.field2800[client.field4039][var7][var6] & 0x4) != 0) {
                class221.method1553(false, class118.field1984, var7, -127, var6, 1);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                var13 -= 65536;
                if (var9 > var6) {
                    var6++;
                } else if (var9 < var6) {
                    var6--;
                }
                if ((class166.field2800[client.field4039][var7][var6] & 0x4) != 0) {
                    class221.method1553(false, class118.field1984, var7, -120, var6, 1);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 196)
    public static void method1626(byte arg0) {
        field3868 = null;
        field3864 = null;
        field3867 = null;
        field3870 = null;
        int var1 = -116 / ((-arg0 - 76) / 37);
        field3869 = null;
    }
}
