import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class164 implements class198 {

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field3140 = 0;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Li;")
    public static class88 field3143 = class208.method1425(105, "<img=1>");

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Li;")
    public static class88 field3145 = class208.method1425(105, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Li;")
    public static class88 field3137 = class208.method1425(105, ")2");

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[[[B")
    public static byte[][][] field3144;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIJI)Li;")
    public final class88 method1128(int[] arg0, int arg1, long arg2, int arg3) {
        field3141++;
        if (arg1 == 0) {
            class47 var6 = class167.method1150(arg0[0], arg3 ^ 0xFFFFFF8E);
            return var6.method360((int) arg2, (byte) -81);
        } else if (arg1 == 1 || arg1 == 10) {
            class149 var7 = class71.method472((int) arg2, (byte) -111);
            return var7.field2894;
        } else if (arg1 == 6 || arg1 == 7) {
            return class167.method1150(arg0[0], -115).method360((int) arg2, (byte) -64);
        } else if (arg3 == 0) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method1129(byte arg0) {
        field3137 = null;
        field3144 = null;
        int var1 = 58 / ((arg0 + 24) / 54);
        field3143 = null;
        field3145 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZB)V")
    public static final void method1130(boolean arg0, byte arg1) {
        field3142++;
        if (class240.field4458.field4138 >> 7 == class116.field2104 && class240.field4458.field4123 >> 7 == class140.field2596) {
            class116.field2104 = 0;
        }
        int var2 = class55.field1027;
        if (arg0) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg1 <= 109) {
            field3138 = 87;
        }
        while (var2 > var3) {
            class44 var4;
            long var5;
            if (arg0) {
                var5 = 8791798054912L;
                var4 = class240.field4458;
            } else {
                var4 = class244.field4493[class174.field3430[var3]];
                var5 = (long) class174.field3430[var3] << 32;
            }
            if (var4 != null && var4.method287(-1)) {
                int var7 = var4.field4138 >> 7;
                var4.field743 = false;
                if ((class245.field4499 && class55.field1027 > 50 || class55.field1027 > 200) && !arg0 && var4.field4108 == var4.field4107) {
                    var4.field743 = true;
                }
                int var8 = var4.field4123 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field758 == null || class117.field2115 < var4.field755 || class117.field2115 >= var4.field762) {
                        label94: {
                            if ((var4.field4138 & 0x7F) == 64 && (var4.field4123 & 0x7F) == 64) {
                                if (class152.field2950[var7][var8] == class210.field3992) {
                                    break label94;
                                }
                                class152.field2950[var7][var8] = class210.field3992;
                            }
                            var4.field4099 = class239.method1586(var4.field4138, var4.field4123, 2, class149.field2909);
                            class126.method861(class149.field2909, var4.field4138, var4.field4123, var4.field4099, 60, var4, var4.field4087, var5, var4.field4095);
                        }
                    } else {
                        var4.field743 = false;
                        var4.field4099 = class239.method1586(var4.field4138, var4.field4123, 2, class149.field2909);
                        class126.method857(class149.field2909, var4.field4138, var4.field4123, var4.field4099, var4, var4.field4087, var5, var4.field764, var4.field741, var4.field744, var4.field745);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Lrh;")
    public static final class193 method1131(int arg0) {
        field3146++;
        class193 var1 = new class193(class15.field229, class129.field2426, class247.field4530[0], class135.field2512[0], class102.field1853[arg0], class67.field1218[0], class116.field2106[0], class27.field456);
        class239.method1580(108);
        return var1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLi;)Z")
    public static final boolean method1132(byte arg0, class88 arg1) {
        field3139++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 < 59) {
            method1131(-1);
        }
        while (var2 < class67.field1221) {
            if (arg1.method624(class146.field2743[var2], (byte) 83)) {
                return true;
            }
            var2++;
        }
        return false;
    }
}
