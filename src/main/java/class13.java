import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class13 {

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field245 = 0;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Lgj;")
    public static class226 field246 = new class226(5);

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lsb;")
    public static class98 field251 = class47.method368("T", 0);

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field252 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[Lqh;")
    public static class24[] field250;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static void method111(int arg0) {
        field246 = null;
        if (arg0 >= -79) {
            method111(-44);
        }
        field250 = null;
        field252 = null;
        field251 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)I")
    public static final int method112(int arg0, int arg1, int arg2, int arg3) {
        field248++;
        int var4 = 127 / ((arg2 + 49) / 43);
        if (arg1 > 243) {
            arg0 >>= 0x4;
        } else if (arg1 > 217) {
            arg0 >>= 0x3;
        } else if (arg1 > 192) {
            arg0 >>= 0x2;
        } else if (arg1 > 179) {
            arg0 >>= 0x1;
        }
        return (arg1 >> 1) + (arg0 >> 5 << 7) + (arg3 >> 2 << 10);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static final void method113(byte arg0) {
        if (arg0 < 26) {
            return;
        }
        if (class71.field1129 != null) {
            class106 var1 = class71.field1129;
            synchronized (class71.field1129) {
                class71.field1129 = null;
            }
        }
        field247++;
    }
}
