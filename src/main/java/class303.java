import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class303 extends class333 {

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "[I")
    public static int[] field4461 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "Lpg;")
    public static class492 field4458 = new class492(90, -1);

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "C")
    public char field4465;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    public int field4462;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "J")
    public long field4467;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "Llo;")
    public class303 field4460;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "Z")
    public boolean field4453;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)I")
    public static final int method1942(int arg0, int arg1) {
        if (arg1 >= -19) {
            method1942(-117, 48);
        }
        field4457++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(B)V")
    public static void method1943(byte arg0) {
        field4458 = null;
        if (arg0 != -57) {
            field4458 = null;
        }
        field4461 = null;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)Z")
    public final boolean method1944(int arg0) {
        field4459++;
        return arg0 == 4 ? this.field4453 : false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)C")
    public final char method1945(byte arg0) {
        if (arg0 < 124) {
            this.method1945((byte) -71);
        }
        field4466++;
        return this.field4465;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I")
    public final int method1946(int arg0) {
        field4463++;
        return arg0 == 4 ? this.field4456 : 124;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)I")
    public final int method1947(byte arg0) {
        if (arg0 == -106) {
            field4464++;
            return this.field4462;
        } else {
            return -33;
        }
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)J")
    public final long method1948(int arg0) {
        field4454++;
        if (arg0 > -38) {
            field4468 = -80;
        }
        return this.field4467;
    }
}
