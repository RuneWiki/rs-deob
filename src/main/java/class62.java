import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class62 extends class232 {

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    private int field966;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Lhn;")
    public static class317 field964 = new class317(64);

    @OriginalMember(owner = "client!d", name = "X", descriptor = "Lhi;")
    public static class82 field972 = class95.method664((byte) -59, " GMT");

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "[Lhi;")
    public static class82[] field973 = new class82[100];

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field970 = 0;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "[I")
    public static int[] field969 = new int[1000];

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "Lum;")
    public static class222 field976;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "Lme;")
    public static class75 field977;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILhi;Lhi;ILhi;I)V", line = 14)
    public static final void method403(int arg0, class82 arg1, class82 arg2, int arg3, class82 arg4, int arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class87.field1560[var6] = class87.field1560[var6 - 1];
            class247.field4278[var6] = class247.field4278[var6 - 1];
            field973[var6] = field973[var6 - 1];
            class237.field4126[var6] = class237.field4126[var6 - 1];
            class191.field3203[var6] = class191.field3203[var6 - 1];
        }
        class138.field2369 = class157.field2726;
        field968++;
        class247.field4278[0] = arg1;
        field973[arg0] = arg4;
        class237.field4126[0] = arg2;
        class87.field1560[0] = arg3;
        class191.field3203[0] = arg5;
        class314.field5416++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V", line = 53)
    public static void method404(boolean arg0) {
        field976 = null;
        if (arg0) {
            method405((byte) -114);
        }
        field973 = null;
        field964 = null;
        field969 = null;
        field977 = null;
        field972 = null;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V", line = 67)
    public class62() {
        this(4096);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)[Lql;", line = 74)
    public static final class324[] method405(byte arg0) {
        field971++;
        if (class66.field1034 == null) {
            class324[] var1 = class105.method723(class55.field881, (byte) -127);
            int var2 = 0;
            class324[] var3 = new class324[var1.length];
            label59: for (int var4 = 0; var4 < var1.length; var4++) {
                class324 var5 = var1[var4];
                if ((var5.field5573 <= 0 || var5.field5573 >= 24) && var5.field5563 >= 800 && var5.field5562 >= 600) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        class324 var7 = var3[var6];
                        if (var5.field5563 == var7.field5563 && var5.field5562 == var7.field5562) {
                            if (var5.field5573 > var7.field5573) {
                                var3[var6] = var5;
                            }
                            continue label59;
                        }
                    }
                    var3[var2] = var5;
                    var2++;
                }
            }
            class66.field1034 = new class324[var2];
            class190.method1324(var3, 0, class66.field1034, 0, var2);
            int[] var8 = new int[class66.field1034.length];
            for (int var9 = 0; var9 < class66.field1034.length; var9++) {
                class324 var10 = class66.field1034[var9];
                var8[var9] = var10.field5563 * var10.field5562;
            }
            class234.method1663(var8, false, class66.field1034);
        }
        if (arg0 != -15) {
            field972 = (class82) null;
        }
        return class66.field1034;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IB)[I", line = 153)
    public final int[] method80(int arg0, byte arg1) {
        field965++;
        int var3 = -99 % ((-arg1 - 31) / 55);
        int[] var4 = this.field4008.method131((byte) -107, arg0);
        if (this.field4008.field256) {
            class190.method1321(var4, 0, class54.field858, this.field966);
        }
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V", line = 203)
    private class62(int arg0) {
        super(0, true);
        this.field966 = 4096;
        this.field966 = arg0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IBLbc;)V", line = 218)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field966 = (arg2.method1082(arg1 - 82) << 12) / 255;
        }
        if (arg1 == -19) {
            field975++;
        }
    }
}
