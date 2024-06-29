import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class417 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public int field6326;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "S")
    public short field6330;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "B")
    public byte field6325;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "S")
    public short field6332;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "S")
    public short field6336;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Z")
    public boolean field6324;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "B")
    public byte field6333;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lqu;")
    public static class219 field6331 = new class219(7, -1);

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Lo;")
    public static class139 field6327;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)Lgk;")
    public final class417 method2664(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 111) {
            field6331 = null;
        }
        field6328++;
        return new class417(arg2, arg3, arg4, arg1, this.field6330, this.field6332, this.field6336, this.field6325, this.field6333, this.field6324);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method2665(int arg0) {
        field6329++;
        if (class446.field6918 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class390.field5937.length; var2++) {
                if (class390.field5937[var2].startsWith("--> ")) {
                    var1++;
                    if (class446.field6918 == var1) {
                        class55.field827 = class390.field5937[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class55.field827 = "";
        }
        if (arg0 != -1) {
            field6331 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static void method2666(byte arg0) {
        if (arg0 != 87) {
            method2665(92);
        }
        field6327 = null;
        field6331 = null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field6326 = arg0;
        this.field6330 = (short) arg4;
        this.field6325 = (byte) arg7;
        this.field6332 = (short) arg5;
        this.field6336 = (short) arg6;
        this.field6324 = arg9;
        this.field6333 = (byte) arg8;
    }
}
