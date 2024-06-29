import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public abstract class class46 {

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "Lvh;")
    public static class84 field710;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Ljf;")
    public static class483 field707;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public static final void method469(byte arg0) {
        field708++;
        class89.method745(74, false);
        if (class55.field815 >= 0 && class55.field815 != 0) {
            class136.method1006(class55.field815, -41);
            class55.field815 = -1;
        }
        if (arg0 >= -60) {
            method469((byte) 85);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)J")
    public abstract long method470(int arg0);

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I")
    public abstract int method471(int arg0);

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)I")
    public abstract int method472(byte arg0);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIII)I")
    public static final int method473(int arg0, int arg1, int arg2, int arg3) {
        field706++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        }
        int var5 = 39 / ((-arg3 - 14) / 61);
        if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
    public static void method474(boolean arg0) {
        field707 = null;
        field710 = null;
        if (arg0) {
            field710 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)Z")
    public abstract boolean method475(int arg0);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)I")
    public static final int method476(int arg0, int arg1) {
        return class486.field6872 == null ? 0 : class486.field6872[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)C")
    public abstract char method477(int arg0);

    static {
        new class151("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field711 = 0;
        field710 = new class84(5000);
    }
}
