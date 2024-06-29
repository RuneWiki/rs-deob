import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class8 {

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public int field83 = -1;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field75 = 0;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field86 = -1;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field80 = -1;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public int field84;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Ltc;")
    public static class396 field91;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Lgh;")
    public static class51 field92;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lwn;I)I")
    public static final int method62(class155 arg0, int arg1) {
        field77++;
        if (arg1 != -1) {
            return 52;
        }
        class271 var2 = arg0.field2137;
        if (var2.field4100 != null) {
            var2 = var2.method1684(6);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4125;
        class433 var4 = arg0.method902(26647);
        if (arg0.field1933) {
            var3 = var2.field4099;
        } else if (arg0.field1936 == var4.field6357 || arg0.field1936 == var4.field6358 || arg0.field1936 == var4.field6369 || arg0.field1936 == var4.field6361) {
            var3 = var2.field4117;
        } else if (arg0.field1936 == var4.field6367 || arg0.field1936 == var4.field6386 || arg0.field1936 == var4.field6384 || arg0.field1936 == var4.field6353) {
            var3 = var2.field4126;
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZI)V")
    public static final void method63(int arg0, boolean arg1, int arg2) {
        if (arg2 <= 20) {
            return;
        }
        field82++;
        class148 var3 = class432.method2655((byte) 108, arg1, arg0);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field2045.length; var4++) {
                var3.field2045[var4] = -1;
                var3.field2049[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method64(int arg0) {
        if (arg0 < 75) {
            field92 = null;
        }
        field91 = null;
        field92 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Lsg;")
    public static final class284 method65(int arg0, int arg1) {
        field81++;
        if (arg0 != -1) {
            method65(90, 51);
        }
        class284 var2 = (class284) class302.field4570.method1491((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class169.field2434.method823(30, arg0 ^ 0x4F6D, arg1);
        class284 var4 = new class284();
        if (var3 != null) {
            var4.method1747(arg1, 12865, new class385(var3));
        }
        class302.field4570.method1488(arg0 ^ 0xFFFFFF7F, (long) arg1, var4);
        return var4;
    }
}
