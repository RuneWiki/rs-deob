import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class23 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lgg;")
    public static class63 field529 = class116.method911(43, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lgg;")
    public static class63 field532 = class116.method911(43, " <col=ffff00>");

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lgg;")
    private static class63 field536 = class116.method911(43, "This world is full)3");

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lgg;")
    public static class63 field534 = field536;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lch;")
    public static class29 field535 = new class29(64);

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field538 = 0;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lgg;")
    private static class63 field541 = class116.method911(43, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lgg;")
    public static class63 field540 = field541;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field537 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "[Z")
    public static boolean[] field542 = new boolean[8];

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field543 = -1;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "[[Lff;")
    public static class54[][] field539;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljc;B)V")
    public static final void method229(class85 arg0, byte arg1) {
        field530++;
        class56.field1481 = arg0;
        if (arg1 != -83) {
            method230(-35, 23, 116);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)I")
    public static final int method230(int arg0, int arg1, int arg2) {
        field531++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & arg0) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method231(byte arg0) {
        field539 = null;
        field532 = null;
        field535 = null;
        field542 = null;
        field537 = null;
        field541 = null;
        field536 = null;
        field534 = null;
        if (arg0 == 127) {
            field529 = null;
            field540 = null;
        }
    }
}
