import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class677 {

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "[I")
    public static int[] field9202 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
    public static int field9199 = 0;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field9201 = new CRC32();

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "[[B")
    public static byte[][] field9198;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
    public static void method3639(int arg0) {
        field9198 = null;
        field9201 = null;
        field9202 = null;
        if (arg0 != 5) {
            method3640(-89, 116);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)V")
    public static final void method3640(int arg0, int arg1) {
        class367.method2252((byte) -61);
        field9197++;
        int var2 = class348.field4512.method951(54, arg0).field7041;
        if (var2 == 0) {
            return;
        }
        int var3 = class461.field6637.field3563[arg0];
        if (var2 == 6) {
            class502.field7073 = var3;
        }
        if (var2 == 5) {
            class548.field7734 = var3;
        }
        if (arg1 != 63) {
            method3639(-109);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(III)V")
    public static final void method3641(int arg0, int arg1, int arg2) {
        if (arg2 != 31) {
            field9202 = null;
        }
        field9200++;
        if (class666.method3606(arg2 ^ 0xFFFFFF88, arg1)) {
            class93.method641(arg0, class323.field4125[arg1], (byte) 102);
        }
    }
}
