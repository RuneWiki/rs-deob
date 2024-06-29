import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class226 extends class39 {

    @OriginalMember(owner = "client!kv", name = "H", descriptor = "Lcba;")
    public static class471 field3235 = new class471(35, -1);

    @OriginalMember(owner = "client!kv", name = "M", descriptor = "D")
    public static double field3240;

    @OriginalMember(owner = "client!kv", name = "L", descriptor = "[Lnv;")
    public static class353[] field3239;

    @OriginalMember(owner = "client!kv", name = "O", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!kv", name = "F", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!kv", name = "G", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!kv", name = "J", descriptor = "I")
    public int field3237;

    @OriginalMember(owner = "client!kv", name = "K", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!kv", name = "E", descriptor = "Loba;")
    public class219 field3232;

    @OriginalMember(owner = "client!kv", name = "N", descriptor = "Lan;")
    public static class21 field3241;

    @OriginalMember(owner = "client!kv", name = "D", descriptor = "[B")
    public byte[] field3231;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
    public static void method1445(byte arg0) {
        field3239 = null;
        field3235 = null;
        int var1 = -1 / ((47 - arg0) / 54);
        field3241 = null;
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(I)[B")
    public final byte[] method410(int arg0) {
        ++field3234;
        if (arg0 != 14) {
            this.method411(35);
        }
        if (super.field792) {
            throw new RuntimeException();
        } else {
            return this.field3231;
        }
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(I)I")
    public final int method411(int arg0) {
        ++field3236;
        if (arg0 < 84) {
            field3235 = null;
        }
        return super.field792 ? 0 : 100;
    }

    static {
        new class104("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field3240 = -1.0D;
        field3239 = new class353[14];
        field3242 = 1;
    }
}
