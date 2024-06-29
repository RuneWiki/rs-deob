import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class215 {

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public int field3727;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Loh;")
    public static class258 field3725 = class153.method1046("(U2", 120);

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Loh;")
    public static class258 field3733 = class153.method1046("Ausw-=hlen", 127);

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lsh;")
    public static class122 field3729 = new class122();

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field3736 = 0;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field3737 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lgb;")
    public static class213 field3730;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 26)
    public static final void method1462(int arg0) {
        class230.method1535();
        class258.field4469 = new class223[7];
        class258.field4469[1] = new class161();
        field3724++;
        if (arg0 > -83) {
            field3737 = -123;
        }
        class258.field4469[2] = new class142();
        class258.field4469[3] = new class53();
        class258.field4469[4] = new class135();
        class258.field4469[5] = new class88();
        class258.field4469[6] = new class126();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLoh;)Lsd;", line = 50)
    public static final class125 method1463(byte arg0, class258 arg1) {
        field3732++;
        int var2 = 56 / ((-arg0 - 19) / 35);
        for (class125 var3 = (class125) class90.field1578.method83(-121); var3 != null; var3 = (class125) class90.field1578.method87((byte) -80)) {
            if (var3.field2228.method1821(-1, arg1)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Lpi;", line = 72)
    public static final class140 method1464(int arg0, int arg1) {
        field3731++;
        if (arg1 != 8215) {
            return (class140) null;
        }
        class140 var2 = (class140) class26.field317.method1159((byte) 123, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class2.field19.method1453(class287.method2024((byte) 63, arg0), (byte) -51, class192.method1296(arg0, 1023));
        class140 var4 = new class140();
        if (var3 != null) {
            var4.method967(new class235(var3), 62);
        }
        class26.field317.method1163(var4, -1, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 105)
    public class215() {
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lle;)V", line = 107)
    public class215(class215 arg0) {
        this.field3734 = arg0.field3734;
        this.field3727 = arg0.field3727;
        this.field3726 = arg0.field3726;
        this.field3735 = arg0.field3735;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 126)
    public static void method1465(byte arg0) {
        field3733 = null;
        field3725 = null;
        if (arg0 != 97) {
            field3733 = (class258) null;
        }
        field3730 = null;
        field3729 = null;
    }
}
