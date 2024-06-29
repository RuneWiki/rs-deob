import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class261 {

    @OriginalMember(owner = "client!es", name = "j", descriptor = "Los;")
    public static class309 field3980;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "J")
    public long field3977;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "Les;")
    public class261 field3972;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "Les;")
    public class261 field3976;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "[I")
    public static int[] field3979;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)V")
    public static final void method1673(boolean arg0, int arg1) {
        class322.field4925 = new int[arg1];
        class403.field6086 = new int[arg1];
        if (arg0) {
            field3979 = null;
        }
        class50.field1008 = new int[arg1];
        class321.field4904 = new int[arg1];
        field3974++;
        class464.field6884 = new int[arg1];
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
    public static final void method1674(int arg0, int arg1) {
        field3975++;
        if (~class491.field7200 == arg0) {
            class470.field6983.method650(arg0 + 16, arg1);
        } else {
            class503.field7350 = arg1;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
    public static void method1675(byte arg0) {
        int var1 = -100 % ((arg0 - 29) / 44);
        field3979 = null;
        field3980 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
    public final void method1676(boolean arg0) {
        field3978++;
        if (this.field3976 == null) {
            return;
        }
        this.field3976.field3972 = this.field3972;
        if (!arg0) {
            this.method1676(false);
        }
        this.field3972.field3976 = this.field3976;
        this.field3976 = null;
        this.field3972 = null;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)Z")
    public final boolean method1677(int arg0) {
        field3971++;
        if (arg0 == -1) {
            return this.field3976 != null;
        } else {
            return true;
        }
    }

    static {
        new class309("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field3980 = new class309(" more options", " weitere Optionen", " autres options", " mais opções");
    }
}
