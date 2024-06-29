import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class184 extends class232 {

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "[I")
    public static int[] field3130 = new int[50];

    @OriginalMember(owner = "client!af", name = "S", descriptor = "Lhi;")
    public static class82 field3132 = class95.method664((byte) -120, "(U (X");

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field3129 = 0;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "Lhi;")
    public static class82 field3136 = class95.method664((byte) -32, "overlay");

    @OriginalMember(owner = "client!af", name = "X", descriptor = "Lhi;")
    public static class82 field3137 = class95.method664((byte) -105, "");

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "Lum;")
    public static class222 field3134;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "(I)V", line = 9)
    public static final void method1274(int arg0) {
        field3135++;
        for (int var1 = 0; var1 < class21.field282; var1++) {
            int var10002 = class105.field1862[var1]--;
            if (class105.field1862[var1] >= -10) {
                class96 var2 = class238.field4141[var1];
                if (var2 == null) {
                    var2 = class96.method668(class286.field4822, field3130[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class105.field1862[var1] += var2.method670();
                    class238.field4141[var1] = var2;
                }
                if (class105.field1862[var1] < 0) {
                    int var3;
                    if (class56.field897[var1] == 0) {
                        var3 = class134.field2321;
                    } else {
                        int var4 = class56.field897[var1] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - class168.field2932.field1685;
                        int var6 = (class56.field897[var1] & 0xFF) * 128;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var7 = (class56.field897[var1] & 0xFFFB) >> 8;
                        int var8 = var7 * 128 + 64 - class168.field2932.field1689;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var5 + var8 - 128;
                        if (var9 > var6) {
                            class105.field1862[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var3 = (var6 - var9) * class138.field2373 / var6;
                    }
                    if (var3 > 0) {
                        class154 var10 = var2.method669().method1108(class64.field992);
                        class239 var11 = class239.method1723(var10, 100, var3);
                        var11.method1711(class22.field310[var1] - 1);
                        class219.field3803.method876(var11);
                    }
                    class105.field1862[var1] = -100;
                }
            } else {
                class21.field282--;
                for (int var12 = var1; var12 < class21.field282; var12++) {
                    field3130[var12] = field3130[var12 + 1];
                    class238.field4141[var12] = class238.field4141[var12 + 1];
                    class22.field310[var12] = class22.field310[var12 + 1];
                    class105.field1862[var12] = class105.field1862[var12 + 1];
                    class56.field897[var12] = class56.field897[var12 + 1];
                }
                var1--;
            }
        }
        if (class66.field1027 && !class79.method493(false)) {
            if (class284.field4771 != 0 && class35.field569 != -1) {
                class87.method614(class284.field4771, false, 0, class35.field569, (byte) -27, class33.field484);
            }
            class66.field1027 = false;
        } else if (class284.field4771 != 0 && class35.field569 != -1 && !class79.method493(false)) {
            class61.field957.method1504(124, -1);
            class61.field957.method1065(arg0 ^ 0xAA86851, class35.field569);
            class35.field569 = -1;
            class171.field2954++;
        }
        if (arg0 != 1) {
            method1275(-86);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IB)[I", line = 153)
    public final int[] method80(int arg0, byte arg1) {
        int[] var3 = this.field4008.method131((byte) -78, arg0);
        field3133++;
        int var4 = 71 % ((-arg1 - 31) / 55);
        if (this.field4008.field256) {
            class190.method1321(var3, 0, class54.field858, class273.field4607[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 198)
    public class184() {
        super(0, true);
    }

    @OriginalMember(owner = "client!af", name = "j", descriptor = "(I)V", line = 202)
    public static void method1275(int arg0) {
        field3130 = null;
        field3132 = null;
        field3136 = null;
        field3134 = null;
        if (arg0 == 28576) {
            field3137 = null;
        }
    }
}
