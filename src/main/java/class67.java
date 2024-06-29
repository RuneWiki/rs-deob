import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class67 {

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Le;")
    public static class191 field1162 = class54.method368("mapflag", 2047);

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Le;")
    public static class191 field1167 = class54.method368("Hierhin gehen", 2047);

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Le;")
    public static class191 field1170 = class54.method368(" weitere Optionen", 2047);

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field1171 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Leg;")
    public static class33 field1163;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
    public abstract void method441(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method442(int arg0) {
        field1163 = null;
        if (arg0 == 0) {
            field1170 = null;
            field1167 = null;
            field1162 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBI)V")
    public abstract void method443(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(III)Lcj;")
    public static final class257 method444(int arg0, int arg1, int arg2) {
        class199 var3 = class201.field3608[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class257 var4 = var3.field3556;
            var3.field3556 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)Lab;")
    public static final class248 method445(byte arg0, int arg1) {
        field1169++;
        class248 var2 = (class248) class262.field4634.method991((long) arg1, -25858);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class51.field935.method826((byte) 35, class258.method1779((byte) -123, arg1), class138.method919((byte) 126, arg1));
        class248 var4 = new class248();
        if (arg0 != -61) {
            method445((byte) 91, -121);
        }
        if (var3 != null) {
            var4.method1732(false, new class225(var3));
        }
        var4.method1733((byte) 57);
        class262.field4634.method987(var4, (long) arg1, arg0 ^ 0x9B9);
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIB)V")
    public abstract void method446(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Z")
    public static final boolean method447(int arg0, int arg1) {
        field1166++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else if (arg0 >= 129 && arg0 <= 159) {
            return false;
        } else {
            if (arg1 < 116) {
                method444(-23, -99, -63);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(III)V")
    public class67(int arg0, int arg1, int arg2) {
        this.field1172 = arg0;
        this.field1165 = arg1;
        this.field1161 = arg2;
    }
}
