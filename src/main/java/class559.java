import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class559 {

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public int field8229;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Z")
    public boolean field8234;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public int field8231;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public int field8228;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "B")
    public byte field8232;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public int field8225;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "S")
    public short field8227;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "S")
    public short field8226;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public int field8237;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "B")
    public byte field8224;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "S")
    public short field8233;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Lcea;")
    public static class180 field8235 = new class180("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Lvj;")
    public static class373 field8236 = new class373(67, -1);

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Ldn;")
    public static class438 field8238;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method3270(byte arg0) {
        field8236 = null;
        field8238 = null;
        if (arg0 <= 44) {
            method3270((byte) 99);
        }
        field8235 = null;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field8229 = arg1;
        this.field8234 = arg10;
        this.field8231 = arg2;
        this.field8228 = arg3;
        this.field8232 = (byte) arg8;
        this.field8225 = arg0;
        this.field8227 = (short) arg6;
        this.field8226 = (short) arg5;
        this.field8237 = arg11;
        this.field8224 = (byte) arg7;
        this.field8233 = (short) arg4;
    }
}
