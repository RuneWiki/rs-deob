import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class class447 extends class203 {

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "S")
    public short field6261;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "B")
    public byte field6267;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "B")
    public byte field6263;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public int field6266;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "S")
    public short field6258;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
    public int field6270;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "S")
    public short field6272;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "S")
    public short field6264;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "Z")
    public boolean field6274;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public int field6262;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "Lwd;")
    public static class149 field6259 = new class149();

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "I")
    public static int field6277 = 0;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "Laq;")
    public static class90 field6276 = new class90();

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public int field6268;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "[Lsg;")
    public static class226[] field6273;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "[[S")
    public static short[][] field6275;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)V")
    public void method1800(int arg0) {
        if (arg0 != -102123737) {
            this.method915((byte) -92);
        }
        field6271++;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)I")
    public static final int method2785(int arg0, int arg1) {
        if (arg1 != -31941) {
            method2786(-57);
        }
        field6260++;
        return arg0 == 16711935 ? -1 : class438.method2755(arg0, -32430);
    }

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(B)I")
    public abstract int method915(byte arg0);

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6261 = (short) arg4;
        this.field6267 = (byte) arg0;
        this.field6263 = arg9;
        this.field6266 = (short) arg3;
        this.field6258 = (short) arg6;
        this.field6270 = (short) arg2;
        this.field6272 = (short) arg5;
        this.field6264 = (short) arg7;
        this.field6274 = arg8;
        this.field6262 = (short) arg1;
    }

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "(I)V")
    public static void method2786(int arg0) {
        field6259 = null;
        field6276 = null;
        if (arg0 > -71) {
            field6259 = null;
        }
        field6273 = null;
        field6275 = null;
    }
}
