import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class304 extends class257 {

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "F")
    public static float field4593;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    public int field4585;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!io", name = "R", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "Leo;")
    public class196 field4586;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "Lul;")
    public static class406 field4590;

    @OriginalMember(owner = "client!io", name = "S", descriptor = "Lsk;")
    public static class442 field4595;

    @OriginalMember(owner = "client!io", name = "O", descriptor = "[B")
    public byte[] field4591;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)I")
    public final int method1717(byte arg0) {
        if (arg0 != -105) {
            method1951(58, 6, 95);
        }
        ++field4587;
        return super.field3927 ? 0 : 100;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
    public static final void method1950(byte arg0) {
        if (arg0 != 117) {
            field4593 = 1.752588F;
        }
        for (int var1 = 0; class476.field6873.length > var1; ++var1) {
            for (int var2 = 0; class476.field6873[0].length > var2; ++var2) {
                for (int var3 = 0; ~var3 > ~class476.field6873[0][0].length; ++var3) {
                    class476.field6873[var1][var2][var3] = 0;
                }
            }
        }
        ++field4594;
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(III)Z")
    public static final boolean method1951(int arg0, int arg1, int arg2) {
        if (arg0 != 10212) {
            field4595 = null;
        }
        ++field4588;
        return class265.method1768(arg1, (byte) -79, arg2) || class57.method518(true, arg2, arg1);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)[B")
    public final byte[] method1718(boolean arg0) {
        ++field4592;
        if (!arg0) {
            this.method1717((byte) -14);
        }
        if (super.field3927) {
            throw new RuntimeException();
        } else {
            return this.field4591;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lnb;")
    public static final class199 method1952(Component arg0, boolean arg1, byte arg2) {
        if (arg2 != 0) {
            field4595 = null;
        }
        ++field4589;
        return new class61(arg0, arg1);
    }

    @OriginalMember(owner = "client!io", name = "j", descriptor = "(I)V")
    public static void method1953(int arg0) {
        field4590 = null;
        field4595 = null;
        if (arg0 != 0) {
            method1950((byte) 125);
        }
    }

    static {
        new class234("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field4593 = 1.0F;
    }
}
