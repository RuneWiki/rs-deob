import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lkk;")
    public static class239 field231 = new class239(0, 0);

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field235 = 0;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field236 = 0;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field234 = 0;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[[B")
    public static byte[][] field233;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method155(int arg0) {
        if (arg0 >= -68) {
            field231 = null;
        }
        field233 = null;
        field231 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lai;ILjava/lang/String;)I")
    public static final int method156(class88 arg0, int arg1, String arg2) {
        field232++;
        int var3 = arg0.field1535;
        byte[] var4 = class53.method399(-125, arg2);
        arg0.method672(var4.length, (byte) 87);
        arg0.field1535 += class227.field3462.method574(var4, -1, var4.length, arg0.field1535, arg0.field1471, arg1);
        return arg0.field1535 - var3;
    }
}
