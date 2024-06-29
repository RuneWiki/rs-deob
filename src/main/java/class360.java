import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public abstract class class360 extends class103 {

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public int field5109;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
    public int field5111;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "S")
    public short field5107;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "Z")
    public boolean field5115;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "S")
    public short field5119;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public int field5108;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "B")
    public byte field5116;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "S")
    public short field5117;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "S")
    public short field5113;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "B")
    public byte field5110;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Lco;")
    public static class268 field5106 = new class268(new byte[5000]);

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "Lfea;")
    public static class47 field5112 = new class47();

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "Lbv;")
    public static class567 field5118 = new class567(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
    public int field5114;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)V", line = 3)
    public static void method2174(byte arg0) {
        field5106 = null;
        int var1 = -63 % ((arg0 + 13) / 54);
        field5112 = null;
        field5118 = null;
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(B)V", line = 31)
    public void method788(byte arg0) {
        if (arg0 < 77) {
            method2174((byte) 58);
        }
        field5105++;
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 51)
    public class360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field5109 = arg3;
        this.field5111 = arg2;
        this.field5107 = (short) arg7;
        this.field5115 = arg8;
        this.field5119 = (short) arg5;
        this.field5108 = arg1;
        this.field5116 = (byte) arg0;
        this.field5117 = (short) arg4;
        this.field5113 = (short) arg6;
        this.field5110 = arg9;
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)I")
    public abstract int method1175(boolean arg0);
}
