import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class68 extends class187 {

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field1278 = 0;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "Leq;")
    public static class213 field1280 = new class213(16);

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "Lnw;")
    public class586 field1273;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "[B")
    public byte[] field1276;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)Z")
    public static final boolean method676(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field1274;
            return class124.field2129;
        }
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(B)V")
    public static void method677(byte arg0) {
        field1280 = null;
        if (arg0 != -24) {
            method679(-70, (class362) null, (class362) null);
        }
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)I")
    public final int method678(int arg0) {
        ++field1275;
        if (arg0 != 16) {
            this.field1273 = null;
        }
        return super.field2808 ? 0 : 100;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILeh;Leh;)V")
    public static final void method679(int arg0, class362 arg1, class362 arg2) {
        if (arg1.field5208 != null) {
            arg1.method2314((byte) 27);
        }
        int var3 = -109 % ((6 - arg0) / 43);
        ++field1277;
        arg1.field5208 = arg2.field5208;
        arg1.field5207 = arg2;
        arg1.field5208.field5207 = arg1;
        arg1.field5207.field5208 = arg1;
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)[B")
    public final byte[] method680(int arg0) {
        ++field1279;
        if (arg0 != 16) {
            this.method680(8);
        }
        if (super.field2808) {
            throw new RuntimeException();
        } else {
            return this.field1276;
        }
    }
}
