import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class235 extends class141 {

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public int field4099;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public int field4096;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field4091 = 0;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Lhi;")
    public static class82 field4095 = class95.method664((byte) -112, "<br>");

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Lhi;")
    public static class82 field4093 = class95.method664((byte) -80, "(U0a )2 via: ");

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "[F")
    public static float[] field4094 = new float[4];

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 12)
    public static void method1669(int arg0) {
        field4093 = null;
        field4095 = null;
        field4094 = null;
        int var1 = 31 / ((arg0 + 15) / 49);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V", line = 36)
    public static final void method1670(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class105.field1860; var3++) {
            class305 var4 = class286.method1984(var3, arg2 - 14440);
            if (var4 != null) {
                int var5 = var4.field5173;
                if (var5 >= 0 && !class102.field1821.method625(70, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field5174 >= 0) {
                    int var6 = var4.field5174;
                    int var7 = (var6 & 0x7F) + arg0;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (var6 + arg1 & 0xFC00) + ((var6 & 0x380) + var7);
                    var9 = class102.field1805[class316.method2167(-3, var8, 96)];
                } else if (var5 >= 0) {
                    var9 = class102.field1805[class316.method2167(-3, class102.field1821.method627(var5, -123), 96)];
                } else if (var4.field5168 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field5168;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 + arg1 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class102.field1805[class316.method2167(-3, var12, 96)];
                }
                class53.field848[var3 + 1] = var9;
            }
        }
        if (arg2 != 19709) {
            field4091 = 95;
        }
        field4100++;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)Z", line = 123)
    public final boolean method1671(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method1670(-121, -86, -121);
        }
        field4097++;
        return arg0 >= this.field4096 && this.field4098 >= arg0 && arg1 >= this.field4099 && this.field4092 >= arg1;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIII)V", line = 140)
    public class235(int arg0, int arg1, int arg2, int arg3) {
        this.field4098 = arg2;
        this.field4099 = arg1;
        this.field4096 = arg0;
        this.field4092 = arg3;
    }
}
