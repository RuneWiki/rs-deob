import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class314 {

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field5536 = 0;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lfl;")
    public static class222 field5534 = new class222(5000);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "J")
    public long field5539;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lhg;")
    public static class170 field5537;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Lsi;")
    public class314 field5535;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Lsi;")
    public class314 field5538;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 22)
    public final void method2221(boolean arg0) {
        field5541++;
        if (this.field5535 == null) {
            return;
        }
        this.field5535.field5538 = this.field5538;
        if (!arg0) {
            method2222((byte) -62, (class149) null);
        }
        this.field5538.field5535 = this.field5535;
        this.field5535 = null;
        this.field5538 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLok;)V", line = 47)
    public static final void method2222(byte arg0, class149 arg1) {
        if (arg0 != -106) {
            field5537 = (class170) null;
        }
        class221.field3902 = arg1;
        field5533++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZZ)V", line = 59)
    public static final void method2223(boolean arg0, boolean arg1) {
        field5532++;
        if (arg1) {
            field5534 = (class222) null;
        }
        byte[][] var2;
        byte var3;
        if (class97.field1824 && arg0) {
            var2 = class297.field5280;
            var3 = 1;
        } else {
            var2 = class7.field147;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class35.method309((byte) 52);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class41.field872[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFE591) >> 14;
                            int var11 = (var7 & 0x3FFC) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class77.field1493.length; var13++) {
                                if (class77.field1493[var13] == var12 && var2[var13] != null) {
                                    class11.method83(var4, var2[var13], 6, (var10 & 0x7) * 8, var8, arg0, var5 * 8, var6 * 8, (var11 & 0x7) * 8, var9, class90.field1702);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Z", line = 155)
    public final boolean method2224(byte arg0) {
        field5540++;
        if (this.field5535 == null) {
            return false;
        } else {
            if (arg0 != -23) {
                field5536 = 70;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V", line = 173)
    public static void method2225(byte arg0) {
        field5534 = null;
        field5537 = null;
        if (arg0 != 22) {
            field5537 = (class170) null;
        }
    }
}
