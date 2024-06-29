import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class450 extends class19 {

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public int field6355;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public int field6358;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public int field6361;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public int field6364;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "J")
    public long field6359;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)I")
    public final int method145(int arg0) {
        field6356++;
        if (arg0 < 50) {
            this.field6364 = 69;
        }
        return this.field6361;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)V")
    public static final void method2686(int arg0, int arg1) {
        field6357++;
        class594 var2 = class692.method3869(arg1, (byte) 105, 3);
        if (arg0 > 108) {
            var2.method3383(-16058);
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)I")
    public final int method146(int arg0) {
        field6365++;
        int var2 = 49 / ((-arg0 - 61) / 40);
        return this.field6358;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)I")
    public final int method143(byte arg0) {
        field6360++;
        if (arg0 > -126) {
            this.field6364 = 25;
        }
        return this.field6364;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)J")
    public final long method147(byte arg0) {
        if (arg0 > -79) {
            return 102L;
        } else {
            field6362++;
            return this.field6359;
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)I")
    public final int method150(int arg0) {
        if (arg0 != 0) {
            this.field6364 = 66;
        }
        field6363++;
        return this.field6355;
    }
}
