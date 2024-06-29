import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class422 extends class187 {

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static int field6196 = 0;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public int field6198;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "Lcn;")
    public class14 field6197;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "[B")
    public byte[] field6199;

    static {
        new class179("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field6205 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZII)I", line = 5)
    public static final int method2631(boolean arg0, int arg1, int arg2) {
        ++field6202;
        if (arg0) {
            return 0;
        } else {
            class100 var3 = class48.method323(Integer.MIN_VALUE, arg0, arg1);
            if (var3 == null) {
                return class195.field3052.method2024((byte) 39, arg1).field4431;
            } else {
                int var4 = arg2;
                for (int var5 = 0; ~var5 > ~var3.field1532.length; ++var5) {
                    if (var3.field1532[var5] == -1) {
                        ++var4;
                    }
                }
                return var4 + (class195.field3052.method2024((byte) 91, arg1).field4431 - var3.field1532.length);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)I", line = 37)
    public final int method842(int arg0) {
        ++field6200;
        if (arg0 != 8030) {
            method2632(88, (byte) 72, (String) null);
        }
        return super.field2870 ? 0 : 100;
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)[B", line = 60)
    public final byte[] method841(int arg0) {
        ++field6195;
        if (arg0 != 9267) {
            return null;
        } else if (super.field2870) {
            throw new RuntimeException();
        } else {
            return this.field6199;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IBLjava/lang/String;)V", line = 82)
    public static final void method2632(int arg0, byte arg1, String arg2) {
        ++field6204;
        class188 var3 = class10.method48((byte) 76, 3, arg0);
        var3.method1308(false);
        var3.field2881 = arg2;
        if (arg1 != -50) {
            field6201 = -1;
        }
    }
}
