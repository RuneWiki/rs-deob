import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class322 extends class376 {

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "J")
    public long field4417;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "[[B")
    public static byte[][] field4418;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BII)I", line = 4)
    public static final int method2034(byte arg0, int arg1, int arg2) {
        if (arg0 != -6) {
            field4418 = null;
        }
        field4419++;
        return arg2 == 4 || arg2 == 5 ? class299.field4144[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILqj;)V", line = 21)
    public static final void method2035(int arg0, class296 arg1) {
        if (arg0 == 5) {
            field4421++;
            class448.field6473 = arg1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 33)
    public static final int method2036(String arg0, int arg1) {
        field4420++;
        int var2 = -96 / ((arg1 - 3) / 45);
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLeb;)Lfm;", line = 46)
    public static final class436 method2037(byte arg0, class371 arg1) {
        field4422++;
        arg1.method2429(0);
        if (arg0 <= 1) {
            field4418 = null;
        }
        int var2 = arg1.method2429(0);
        class436 var3 = class34.method255(var2, -115);
        var3.field6261 = arg1.method2429(0);
        int var4 = arg1.method2429(0);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method2429(0);
            var3.method18(34, var6, arg1);
        }
        var3.method44(-14);
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 86)
    public static void method2038(int arg0) {
        if (arg0 != 3) {
            method2037((byte) 36, (class371) null);
        }
        field4418 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 95)
    public class322() {
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(J)V", line = 97)
    public class322(long arg0) {
        this.field4417 = arg0;
    }
}
