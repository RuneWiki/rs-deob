import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class26 {

    @OriginalMember(owner = "client!b", name = "e", descriptor = "[I")
    public static int[] field456 = new int[4096];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[Ltg;")
    public static class107[] field454;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method220(byte arg0) {
        if (arg0 <= 112) {
            method222(-57, (byte) -101);
        }
        field454 = null;
        field456 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Lo;")
    public static final class175 method221(int arg0, int arg1, int arg2) {
        class175 var3 = class52.method394(arg0, false);
        field453++;
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3066 == null || arg2 >= var3.field3066.length) {
            return null;
        } else if (arg1 == -24807) {
            return var3.field3066[arg2];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)Laa;")
    public static final class128 method222(int arg0, byte arg1) {
        class128 var2 = (class128) class65.field1059.method990((byte) 80, (long) arg0);
        field457++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class69.field1104.method89(arg0, 5, 100);
        if (arg1 >= -5) {
            field452 = -51;
        }
        class128 var4 = new class128();
        if (var3 != null) {
            var4.method824(2, new class230(var3));
        }
        class65.field1059.method982(var4, (byte) 60, (long) arg0);
        return var4;
    }
}
