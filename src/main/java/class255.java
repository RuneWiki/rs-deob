import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class255 extends class224 {

    @OriginalMember(owner = "client!r", name = "T", descriptor = "Lok;")
    public static class41 field4094 = class137.method956(" loggt sich aus)3", 45);

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field4096 = 0;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "B")
    public byte field4097;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "Llb;")
    public class112 field4093;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "Ltb;")
    public static class199 field4092;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "Ljava/awt/Image;")
    public static Image field4099;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)[B", line = 4)
    public final byte[] method1266(boolean arg0) {
        field4098++;
        if (arg0) {
            field4099 = (Image) null;
        }
        if (this.field3590 || this.field4093.field1640 < this.field4093.field1607.length - this.field4097) {
            throw new RuntimeException();
        }
        return this.field4093.field1607;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)I", line = 22)
    public final int method1264(byte arg0) {
        field4095++;
        if (this.field4093 == null) {
            return 0;
        } else {
            if (arg0 >= -65) {
                field4096 = 114;
            }
            return this.field4093.field1640 * 100 / (this.field4093.field1607.length - this.field4097);
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)Z", line = 49)
    public static final boolean method1812(int arg0) {
        field4091++;
        if (arg0 != 0) {
            method1812(122);
        }
        if (class111.field1579) {
            try {
                return !(Boolean) class213.field3433.method297(class138.field2065.field3390, -24900);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I", line = 77)
    public static int method1813(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V", line = 88)
    public static void method1814(boolean arg0) {
        field4092 = null;
        field4099 = null;
        field4094 = null;
        if (arg0) {
            method1812(62);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZBLok;)V", line = 115)
    public static final void method1815(boolean arg0, byte arg1, class41 arg2) {
        field4100++;
        short[] var3 = new short[16];
        class41 var4 = arg2.method294(1);
        int var5 = 0;
        if (arg1 >= -69) {
            method1815(true, (byte) -45, (class41) null);
        }
        for (int var6 = 0; var6 < class213.field3435; var6++) {
            class138 var7 = class130.method918(var6, -55);
            if ((!arg0 || var7.field2091) && var7.field2078 == -1 && var7.field2097 == -1 && var7.field2095 == 0 && var7.field2120.method294(1).method305(-91, var4) != -1) {
                if (var5 >= 250) {
                    class195.field3147 = -1;
                    class206.field3337 = null;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var5++] = (short) var6;
            }
        }
        class206.field3337 = var3;
        class195.field3147 = var5;
        class41[] var10 = new class41[class195.field3147];
        class30.field440 = 0;
        for (int var11 = 0; var11 < class195.field3147; var11++) {
            var10[var11] = class130.method918(var3[var11], -71).field2120;
        }
        class240.method1720(var10, class206.field3337, 0);
    }
}
