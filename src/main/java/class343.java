import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class343 {

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "[B")
    public byte[] field5133 = new byte[256];

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "[I")
    public int[] field5149 = new int[257];

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public int field5136 = 0;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "[B")
    public byte[] field5139 = new byte[4096];

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "[I")
    public int[] field5145 = new int[256];

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "[Z")
    public boolean[] field5140 = new boolean[16];

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "[Z")
    public boolean[] field5153 = new boolean[256];

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "[[I")
    public int[][] field5144 = new int[6][258];

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "[[I")
    public int[][] field5159 = new int[6][258];

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "[B")
    public byte[] field5154 = new byte[18002];

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "[B")
    public byte[] field5141 = new byte[18002];

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    public int field5164 = 0;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "[[B")
    public byte[][] field5148 = new byte[6][258];

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "[I")
    public int[] field5163 = new int[16];

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "[I")
    public int[] field5155 = new int[6];

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "[[I")
    public int[][] field5135 = new int[6][258];

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field5158 = 0;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "B")
    public byte field5167;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "F")
    public static float field5137;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public int field5130;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public int field5131;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public int field5132;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public int field5138;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public int field5146;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public int field5147;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public int field5152;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public int field5156;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public int field5160;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public int field5161;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public int field5166;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "[B")
    public byte[] field5134;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "[B")
    public byte[] field5162;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZZ)V", line = 32)
    public static final void method2361(boolean arg0, boolean arg1) {
        field5157++;
        class15.method98(-113);
        if (class148.field2051 != 30 && class148.field2051 != 25) {
            return;
        }
        class122.field1657++;
        if (class122.field1657 < 50 && !arg1) {
            return;
        }
        class122.field1657 = 0;
        if (!class185.field2559 && class39.field442 != null) {
            class312.field4709++;
            class90.field1264.method2238(242, (byte) -128);
            try {
                class39.field442.method1575(class90.field1264.field4777, 0, 5000, class90.field1264.field4798);
                class90.field1264.field4777 = 0;
            } catch (IOException var3) {
                class185.field2559 = true;
            }
        }
        if (!arg0) {
            class15.method98(-99);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V", line = 76)
    public static final void method2362(byte arg0) {
        field5142++;
        if (class92.field1271) {
            return;
        }
        class92.field1271 = true;
        class125.field1711 = true;
        if (class98.field1340) {
            class89.field1257 = (float) ((int) class89.field1257 + 191 & 0xFFFFFF80);
        } else {
            class312.field4717 += (24.0F - class312.field4717) / 2.0F;
        }
        if (arg0 < 69) {
            field5158 = 57;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)Z", line = 139)
    public static final boolean method2363(int arg0, int arg1, int arg2) {
        int var3 = class96.field1302[arg0][arg1][arg2];
        if (-class24.field300 == var3) {
            return false;
        } else if (class24.field300 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class143.method1030(var4 + 1, class333.field5020[arg0][arg1][arg2], var5 + 1) && class143.method1030(var4 + 128 - 1, class333.field5020[arg0][arg1 + 1][arg2], var5 + 1) && class143.method1030(var4 + 128 - 1, class333.field5020[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class143.method1030(var4 + 1, class333.field5020[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class96.field1302[arg0][arg1][arg2] = class24.field300;
                return true;
            } else {
                class96.field1302[arg0][arg1][arg2] = -class24.field300;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)Z", line = 166)
    public static final boolean method2364(byte arg0, int arg1) {
        if (arg0 == 64) {
            field5143++;
            return (-arg1 & arg1) == arg1;
        } else {
            return false;
        }
    }
}
