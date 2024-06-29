import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class165 {

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    private int field2448;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "B")
    public byte field2459;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lng;")
    public class165 field2453;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public int field2449;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)Lng;")
    public final class165 method1154(int arg0, int arg1, int arg2, int arg3) {
        field2451++;
        if (arg1 != -15) {
            this.field2464 = -67;
        }
        return new class165(this.field2448, arg0, arg3, arg2, this.field2459);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Ldc;")
    public final class16 method1155(int arg0) {
        if (arg0 != -15) {
            this.field2459 = -74;
        }
        field2450++;
        return class411.method2464(-54, this.field2448);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)I")
    public static final int method1156(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2457++;
        int var5 = arg0 & 0xF;
        int var6 = var5 >= 8 ? arg2 : arg4;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg4 : arg3) : arg2;
        if (arg1 != -1) {
            method1156(112, 36, -114, 69, -25);
        }
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IIIIB)V")
    public class165(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field2454 = arg3;
        this.field2448 = arg0;
        this.field2459 = arg4;
        this.field2452 = arg2;
        this.field2456 = arg1;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lng;I)V")
    public class165(class165 arg0, int arg1) {
        this.field2453 = arg0;
        this.field2452 = this.field2453.field2452 + arg1;
        this.field2448 = this.field2453.field2448;
        this.field2456 = this.field2453.field2456 + arg1;
        this.field2454 = this.field2453.field2454 + arg1;
        this.field2459 = this.field2453.field2459;
    }

    static {
        new class347("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        new class347("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
    }
}
