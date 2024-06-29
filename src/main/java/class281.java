import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class281 {

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Lak;")
    public static class234 field4277 = new class234("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "[I")
    public static int[] field4279 = new int[16384];

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "[I")
    public static int[] field4278 = new int[16384];

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "Lob;")
    public static class521 field4280;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "B")
    public byte field4258;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "B")
    public byte field4261;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "B")
    public byte field4265;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "B")
    public byte field4269;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "B")
    public byte field4271;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "B")
    public byte field4273;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "B")
    public byte field4276;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public int field4266;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "Ljava/awt/Frame;")
    public static Frame field4281;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "S")
    public short field4263;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Z")
    public boolean field4256;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Z")
    public boolean field4257;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Z")
    public boolean field4259;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Z")
    public boolean field4260;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Z")
    public boolean field4262;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Z")
    public boolean field4267;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "Z")
    public boolean field4272;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Z")
    public boolean field4274;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Z")
    public boolean field4275;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1829(int arg0) {
        field4278 = null;
        field4279 = null;
        field4281 = null;
        field4280 = null;
        field4277 = null;
        if (arg0 != 32768) {
            field4281 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Z")
    public static final boolean method1830(int arg0, int arg1, int arg2) {
        if (arg1 != -16385) {
            field4281 = null;
        }
        field4270++;
        return (class266.method1773(arg0, (byte) -127, arg2) | class446.method2738(34, arg2, arg0) | class261.method1745(arg2, 20319, arg0)) & class334.method2112(arg1 ^ 0xFFFFFF69, arg2, arg0);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)Z")
    public static final boolean method1831(int arg0, int arg1, int arg2) {
        field4268++;
        if (arg2 != 18794) {
            field4279 = null;
        }
        return (arg0 & 0x800) != 0;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4278[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field4279[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        new class234("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field4282 = -2;
        field4280 = new class521(72, 4);
    }
}
