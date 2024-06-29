import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class10 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lgn;")
    public static class526 field93 = new class526(9, 7);

    @OriginalMember(owner = "client!de", name = "c", descriptor = "F")
    public static float field94;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 5)
    public static final void method43(int arg0, boolean arg1, String arg2) {
        field95++;
        class506 var3 = class14.method185(-1304589728, arg0, 2);
        if (!arg1) {
            field94 = -1.0398443F;
        }
        var3.method2992(0);
        var3.field7444 = arg2;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 21)
    public static final String method45(long arg0, byte arg1) {
        field92++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        }
        if (arg1 <= 76) {
            method45(91L, (byte) -105);
        }
        if ((arg0 % 37L) == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = arg0;
        while (var4 != 0L) {
            var4 /= 37L;
            var3++;
        }
        StringBuffer var6 = new StringBuffer(var3);
        while (arg0 != 0L) {
            long var7 = arg0;
            arg0 /= 37L;
            var6.append(class373.field5643[(int) (var7 - (arg0 * 37L))]);
        }
        return var6.reverse().toString();
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V", line = 67)
    public static void method50(boolean arg0) {
        if (arg0) {
            method43(-51, false, null);
        }
        field93 = null;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Z", line = 86)
    public final boolean method52(int arg0) {
        field96++;
        if (arg0 <= 8) {
            return false;
        } else {
            return this.method48(false) || this.method49(118) || this.method47(302);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)I")
    public abstract int method44(byte arg0);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public abstract void method46(byte arg0);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Z")
    public abstract boolean method47(int arg0);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)Z")
    public abstract boolean method48(boolean arg0);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Z")
    public abstract boolean method49(int arg0);

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)Lkn;")
    public abstract class376 method51(byte arg0);

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public abstract void method53(int arg0);

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)I")
    public abstract int method54(int arg0);
}
