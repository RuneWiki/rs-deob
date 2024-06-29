import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public abstract class class70 {

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "Lfc;")
    public static class262 field759 = new class262(32);

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "Lea;")
    public static class547 field764 = new class547(47, -1);

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method519(byte arg0) {
        field762++;
        if (arg0 != 22) {
            this.method524((byte) 46);
        }
        return this.method520((byte) 121) || this.method524((byte) -19) || this.method526(1);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(III)Lpfa;", line = 18)
    public static final class298 method523(int arg0, int arg1, int arg2) {
        if (arg0 != 2742) {
            method525(85);
        }
        field760++;
        class298 var3 = new class298();
        var3.field4003 = -1;
        var3.field3999 = -1;
        var3.field4006 = arg1 + 6;
        var3.field4007 = arg2 + 5 + 1;
        var3.field3994 = new int[var3.field4007][var3.field4006];
        var3.method1788((byte) -99);
        return var3;
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)V", line = 41)
    public static void method525(int arg0) {
        field764 = null;
        field759 = null;
        if (arg0 != -1) {
            field764 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)V", line = 54)
    public static final void method527(boolean arg0) {
        field761++;
        int var1 = 0;
        if (class11.field68 != null) {
            var1 = class11.field68.field5501.method2405((byte) 127);
        }
        if (arg0) {
            method525(6);
        }
        if (var1 == 2) {
            int var4 = class496.field6749 <= 800 ? class496.field6749 : 800;
            class294.field3959 = (class496.field6749 - var4) / 2;
            int var5 = class305.field4136 > 600 ? 600 : class305.field4136;
            class546.field7710 = var4;
            class56.field575 = 0;
            class512.field6932 = var5;
        } else if (var1 == 1) {
            int var2 = class496.field6749 > 1024 ? 1024 : class496.field6749;
            class546.field7710 = var2;
            int var3 = class305.field4136 <= 768 ? class305.field4136 : 768;
            class294.field3959 = (class496.field6749 - var2) / 2;
            class56.field575 = 0;
            class512.field6932 = var3;
        } else {
            class546.field7710 = class496.field6749;
            class512.field6932 = class305.field4136;
            class56.field575 = 0;
            class294.field3959 = 0;
        }
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)Z")
    public abstract boolean method520(byte arg0);

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(B)I")
    public abstract int method521(byte arg0);

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)Lhfa;")
    public abstract class314 method522(int arg0);

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "(B)Z")
    public abstract boolean method524(byte arg0);

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(I)Z")
    public abstract boolean method526(int arg0);

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)I")
    public abstract int method528(int arg0);

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "(I)V")
    public abstract void method529(int arg0);

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "(B)V")
    public abstract void method530(byte arg0);
}
