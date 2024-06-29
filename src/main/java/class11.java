import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class11 extends class235 {

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    public static int field121 = 0;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "Le;")
    public static class191 field119 = class54.method368("Spieler kann nicht gefunden werden: ", 2047);

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
    public static int field124 = 1;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
    public static int field128 = -1;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "Le;")
    public static class191 field129 = class54.method368("Mem:", 2047);

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "B")
    public byte field126;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "Lji;")
    public class225 field120;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(DB)V")
    public static final void method75(double arg0, byte arg1) {
        if (class43.field750 != arg0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class53.field967[var3] = var4 > 255 ? 255 : var4;
            }
            class43.field750 = arg0;
        }
        if (arg1 > 1) {
            ++field122;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Le;")
    public static final class191 method76(byte arg0, int arg1) {
        ++field127;
        if (~arg1 < -1 && ~arg1 >= -256) {
            class191 var2 = new class191();
            var2.field3392 = new byte[1];
            var2.field3392[0] = (byte) arg1;
            var2.field3379 = 1;
            return arg0 != -41 ? null : var2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)[B")
    public final byte[] method77(int arg0) {
        ++field132;
        if (arg0 != -15219) {
            return null;
        } else if (!super.field4183 && this.field120.field3996 >= this.field120.field3995.length - this.field126) {
            return this.field120.field3995;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Leg;I)Leg;")
    public static final class33 method78(class33 arg0, int arg1) {
        class33 var2 = client.method673(arg0);
        if (arg1 != -20936) {
            return null;
        } else {
            if (var2 == null) {
                var2 = arg0.field509;
            }
            ++field131;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public static final void method79(int arg0, int arg1, int arg2) {
        ++field125;
        int[] var3 = new int[4];
        var3[0] = arg2;
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg1;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (class121.field1965[var6] != arg2) {
                var3[var5] = class121.field1965[var6];
                var4[var5] = class267.field4722[var6];
                ++var5;
            }
        }
        if (arg0 >= -46) {
            method79(42, 75, -119);
        }
        class267.field4722 = var4;
        class121.field1965 = var3;
        class232.method1642(class261.field4612, true, class261.field4612.length + -1, 0);
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)I")
    public final int method80(int arg0) {
        ++field123;
        if (this.field120 == null) {
            return 0;
        } else {
            if (arg0 <= 29) {
                field128 = 73;
            }
            return this.field120.field3996 * 100 / (this.field120.field3995.length + -this.field126);
        }
    }

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "(I)V")
    public static void method81(int arg0) {
        field119 = null;
        field129 = null;
        if (arg0 != -21334) {
            field119 = null;
        }
    }
}
