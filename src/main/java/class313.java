import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class313 {

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[I")
    public int[] field4705 = new int[256];

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[[I")
    public int[][] field4710 = new int[6][258];

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[I")
    public int[] field4706 = new int[16];

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "[Z")
    public boolean[] field4707 = new boolean[16];

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "[B")
    public byte[] field4713 = new byte[4096];

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "[[B")
    public byte[][] field4718 = new byte[6][258];

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "[I")
    public int[] field4724 = new int[257];

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "[Z")
    public boolean[] field4720 = new boolean[256];

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public int field4733 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[B")
    public byte[] field4703 = new byte[18002];

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "[[I")
    public int[][] field4722 = new int[6][258];

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "[I")
    public int[] field4727 = new int[6];

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "[B")
    public byte[] field4731 = new byte[256];

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "[[I")
    public int[][] field4726 = new int[6][258];

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public int field4729 = 0;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "[B")
    public byte[] field4738 = new byte[18002];

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Loe;")
    public static class127 field4734 = new class127(89, -2);

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field4739 = 1;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    public static int field4740 = -1;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "B")
    public byte field4723;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public int field4709;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public int field4711;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public int field4712;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public int field4715;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public int field4716;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public int field4719;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public int field4721;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public int field4725;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public int field4728;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public int field4732;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public int field4735;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public int field4736;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "[B")
    public byte[] field4704;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[B")
    public byte[] field4708;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 8)
    public static void method1870(int arg0) {
        field4734 = null;
        if (arg0 != 258) {
            method1873(116, (byte) 119, 35);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method1871(int arg0, int arg1, int arg2) {
        if (arg2 < 121) {
            return false;
        } else {
            field4730++;
            return (arg0 & 0x580) != 0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 31)
    public static final void method1872(byte arg0) {
        field4737++;
        if (class123.field2028) {
            return;
        }
        class7.field81 = true;
        if (class463.field7116.field2961) {
            class376.field5483 = ((int) class376.field5483 - 17 & 0xFFFFFFF0);
        } else {
            class219.field3373 += (-12.0F - class219.field3373) / 2.0F;
        }
        if (arg0 != -7) {
            field4740 = 82;
        }
        class123.field2028 = true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI)Z", line = 103)
    public static final boolean method1873(int arg0, byte arg1, int arg2) {
        field4717++;
        if (arg1 != 85) {
            method1873(-39, (byte) 39, -32);
        }
        return (arg0 & 0x22) != 0;
    }
}
