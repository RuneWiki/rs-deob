import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public abstract class class230 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "Lrc;")
    public static class108 field3381 = new class108(44, 8);

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public abstract void method1616(int arg0);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)I")
    public abstract int method1617(boolean arg0);

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(Z)Z")
    public abstract boolean method1618(boolean arg0);

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)Z")
    public abstract boolean method1619(int arg0);

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)Z")
    public final boolean method1620(int arg0) {
        field3383++;
        if (arg0 != 44) {
            this.method1625((byte) -94);
        }
        return this.method1618(true) || this.method1619(arg0) || this.method1624(arg0);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lvh;II)V")
    public static final void method1621(class84 arg0, int arg1, int arg2) {
        if (arg1 != 17875) {
            method1621((class84) null, -107, -95);
        }
        class469.field6606 = false;
        class163.field2372 = 0;
        field3382++;
        class25.method174(true, arg0);
        class18.method126((byte) 126, arg0);
        if (class469.field6606) {
            System.out.println("---endgpp---");
        }
        if (arg0.field2298 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg0.field2298 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(Z)Ljm;")
    public abstract class271 method1622(boolean arg0);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BILae;I)V")
    public static final void method1623(byte arg0, int arg1, class172 arg2, int arg3) {
        if (arg0 >= 78) {
            class296.field4175 = arg1;
            class361.field4979 = arg3;
            class151.field2082 = arg2;
            field3384++;
        }
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)Z")
    public abstract boolean method1624(int arg0);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)I")
    public abstract int method1625(byte arg0);

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(Z)V")
    public abstract void method1626(boolean arg0);

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
    public static void method1627(int arg0) {
        field3381 = null;
        if (arg0 > -37) {
            field3381 = null;
        }
    }

    static {
        new class151(" days.", " Tage.", " jours.", " dias.");
    }
}
