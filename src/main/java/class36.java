import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class36 extends class107 {

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public int field549 = 0;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public int field557 = -1;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "Ldf;")
    private static class51 field550 = class46.method233("Examine", 100);

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field542 = 0;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "Ldf;")
    public static class51 field545 = field550;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Ldf;")
    private static class51 field546 = class46.method233("Attack", 100);

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "Ldf;")
    public static class51 field555 = field546;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "Lhc;")
    public static class212 field556 = new class212(16);

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "Ldf;")
    public static class51 field560 = class46.method233("<col=ffffff>", 100);

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "Ldf;")
    public static class51 field562 = class46.method233("", 100);

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    public static int field563 = 0;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "Llb;")
    public static class121 field561;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "[Lcg;")
    public static class156[] field559;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIB)I")
    public static final int method184(int arg0, int arg1, byte arg2) {
        field554++;
        if (arg2 != -7) {
            field542 = 108;
        }
        class136 var3 = (class136) class7.field77.method1453((long) arg0, arg2 + 8);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field2256.length) {
            return var3.field2256[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public static void method185(int arg0) {
        field561 = null;
        field546 = null;
        field562 = null;
        field556 = null;
        field545 = null;
        field559 = null;
        field550 = null;
        field560 = null;
        field555 = null;
        if (arg0 != -14989) {
            field563 = -104;
        }
    }
}
