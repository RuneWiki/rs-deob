import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class43 {

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "Z")
    public static boolean field510 = false;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "J")
    public long field505;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "Lpn;")
    public class43 field507;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "Lpn;")
    public class43 field508;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static final void method261(int arg0) {
        class72.method435(127, 5);
        field509++;
        class176.method1107(5, (byte) -71);
        class89.method558(0, 5);
        class293.method1871((byte) 33, 5);
        class30.method188(5, 37);
        class221.method1343(arg0 ^ 0xFFFF9E56, 5);
        class66.method379(-2, 5);
        class187.method1157(5, 64);
        class427.method2609(-128, 5);
        class134.method872(5, (byte) 72);
        class208.method1274(arg0, true);
        class170.method1083(0, 5);
        class17.method102(5, arg0 - 5);
        class401.method2496(arg0 ^ 0x4, 5);
        class122.method806(arg0 - 4, 5);
        class23.method144(5, 2);
        class437.method2672(5, (byte) -5);
        class141.method909(5, arg0 ^ 0x5D4F);
        class437.method2674(5, 114);
        class337.method2158(5, 1);
        class27.method172(50, 25);
        class399.method2468(arg0 - 125, 5);
        class150.method962(5, -2);
        class18.field209.method2286(5, (byte) 36);
        class320.field4295.method2286(5, (byte) 36);
        class382.field5232.method2286(5, (byte) 36);
        class241.field3162.method2286(5, (byte) 36);
        class93.field1101.method2286(5, (byte) 36);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z")
    public final boolean method262(byte arg0) {
        if (arg0 <= 29) {
            return true;
        } else {
            field504++;
            return this.field507 != null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
    public final void method263(boolean arg0) {
        if (arg0) {
            field513 = 18;
        }
        field511++;
        if (this.field507 != null) {
            this.field507.field508 = this.field508;
            this.field508.field507 = this.field507;
            this.field508 = null;
            this.field507 = null;
        }
    }

    static {
        new class72((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
    }
}
