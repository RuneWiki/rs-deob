import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class203 extends class206 {

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "Lmh;")
    public static class62 field3427 = class201.method1405(true, "M");

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "Lmh;")
    public static class62 field3422 = class201.method1405(true, "Cache:");

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "[Z")
    public static boolean[] field3430 = new boolean[200];

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "Lmh;")
    public static class62 field3433 = class201.method1405(true, "Sprites geladen)3");

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "J")
    public long field3426;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "Lpi;")
    public class203 field3425;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "Lpi;")
    public class203 field3431;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "Lhi;")
    public static class26 field3429;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "[Lfd;")
    public static class61[] field3423;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 4)
    public static final void method1419(int arg0) {
        field3432++;
        if (!class106.field1728) {
            return;
        }
        if (arg0 <= 106) {
            method1422((byte) -5);
        }
        class191 var1 = class52.method331((byte) -101, class153.field2410, class206.field3490);
        if (var1 != null && var1.field3212 != null) {
            class161 var2 = new class161();
            var2.field2598 = var1.field3212;
            var2.field2597 = var1;
            class262.method1818(var2, 43);
        }
        class106.field1728 = false;
        class250.method1744(var1, (byte) -54);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)I", line = 46)
    public static final int method1420(int arg0, int arg1, int arg2) {
        if (arg0 != 200) {
            field3427 = (class62) null;
        }
        int var3 = arg2 >>> 31;
        field3424++;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V", line = 59)
    public final void method1421(int arg0) {
        field3421++;
        if (this.field3431 == null) {
            return;
        }
        this.field3431.field3425 = this.field3425;
        this.field3425.field3431 = this.field3431;
        this.field3425 = null;
        this.field3431 = null;
        int var2 = -106 % ((-arg0 - 35) / 39);
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(B)V", line = 84)
    public static void method1422(byte arg0) {
        field3422 = null;
        field3429 = null;
        field3423 = null;
        if (arg0 != -86) {
            field3427 = (class62) null;
        }
        field3433 = null;
        field3427 = null;
        field3430 = null;
    }
}
