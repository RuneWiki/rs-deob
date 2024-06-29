import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class13 {

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "B")
    public byte field228;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "B")
    public byte field231;

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "B")
    public byte field232;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "B")
    public byte field234;

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "B")
    public byte field239;

    @OriginalMember(owner = "client!vca", name = "q", descriptor = "B")
    public byte field242;

    @OriginalMember(owner = "client!vca", name = "w", descriptor = "B")
    public byte field248;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!vca", name = "v", descriptor = "S")
    public short field247;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "Z")
    public boolean field230;

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "Z")
    public boolean field233;

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "Z")
    public boolean field235;

    @OriginalMember(owner = "client!vca", name = "m", descriptor = "Z")
    public boolean field238;

    @OriginalMember(owner = "client!vca", name = "p", descriptor = "Z")
    public boolean field241;

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "Z")
    public boolean field243;

    @OriginalMember(owner = "client!vca", name = "s", descriptor = "Z")
    public boolean field244;

    @OriginalMember(owner = "client!vca", name = "t", descriptor = "Z")
    public boolean field245;

    @OriginalMember(owner = "client!vca", name = "u", descriptor = "Z")
    public boolean field246;

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "Z")
    public boolean field249;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V", line = 5)
    public static final void method105(byte arg0) {
        if (arg0 > -25) {
            method106(31, (byte) 107);
        }
        field237++;
        if (class590.field8289.field9151 && class186.field2358.field3685 != -1) {
            class168.method962(class186.field2358.field3685, class186.field2358.field3680, 55);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IB)I", line = 36)
    public static final int method106(int arg0, byte arg1) {
        field229++;
        int var2 = 75 % ((arg1 - 54) / 46);
        return arg0 == 16711935 ? -1 : class32.method215(121, arg0);
    }
}
