import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class199 {

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "B")
    private byte field2816;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public int field2810;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public int field2814;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field2812 = 104;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "[I")
    public static int[] field2821 = new int[256];

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "Lfa;")
    public static class209 field2809;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "Lpu;")
    public static class522 field2813;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2821[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I", line = 3)
    public final int method1326(boolean arg0) {
        if (arg0) {
            return 26;
        } else {
            field2811++;
            return this.field2816 & 0x7;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)I", line = 23)
    public final int method1327(byte arg0) {
        field2807++;
        if (arg0 == 81) {
            return (this.field2816 & 0x8) == 8 ? 1 : 0;
        } else {
            return 92;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V", line = 45)
    public static void method1328(int arg0) {
        field2809 = null;
        field2821 = null;
        int var1 = -72 % ((arg0 + 6) / 61);
        field2813 = null;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "()V", line = 56)
    public class199() {
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lmo;)V", line = 62)
    public class199(class695 arg0) {
        this.field2816 = arg0.method3827((byte) -73);
        this.field2810 = arg0.method3847((byte) 118);
        this.field2818 = arg0.method3880(8);
        this.field2819 = arg0.method3880(8);
        this.field2814 = arg0.method3880(8);
        this.field2817 = arg0.method3880(8);
    }
}
