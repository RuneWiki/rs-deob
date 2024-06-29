import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class5 extends class93 {

    @OriginalMember(owner = "client!sn", name = "S", descriptor = "Ljava/lang/Object;")
    private Object field49;

    @OriginalMember(owner = "client!sn", name = "X", descriptor = "Ltl;")
    public static class222 field54 = new class222(200);

    @OriginalMember(owner = "client!sn", name = "bb", descriptor = "[S")
    public static short[] field58 = new short[256];

    @OriginalMember(owner = "client!sn", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field56 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!sn", name = "cb", descriptor = "I")
    public static int field59 = 0;

    @OriginalMember(owner = "client!sn", name = "P", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!sn", name = "Q", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!sn", name = "R", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!sn", name = "T", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!sn", name = "V", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!sn", name = "W", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!sn", name = "Y", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!sn", name = "U", descriptor = "Lkb;")
    public static class39 field51;

    @OriginalMember(owner = "client!sn", name = "ab", descriptor = "Lkb;")
    public static class39 field57;

    @OriginalMember(owner = "client!sn", name = "db", descriptor = "[Ljava/lang/String;")
    public static String[] field60;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(B)Ljava/lang/Object;", line = 13)
    public final Object method20(byte arg0) {
        if (arg0 >= -106) {
            method21((byte) -128);
        }
        field50++;
        return this.field49;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class5(Object arg0) {
        this.field49 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "(B)V", line = 34)
    public static void method21(byte arg0) {
        field51 = null;
        field58 = null;
        field56 = null;
        field60 = null;
        field54 = null;
        if (arg0 <= 76) {
            method26(-15, -114, -38);
        }
        field57 = null;
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(B)Z", line = 51)
    public final boolean method22(byte arg0) {
        field52++;
        int var2 = 96 % ((10 - arg0) / 57);
        return false;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V", line = 61)
    public static final void method23(boolean arg0) {
        field47++;
        if (!class151.field2321) {
            return;
        }
        class151.field2321 = false;
        class8.field95 = null;
        class74.field976 = null;
        if (!arg0) {
            method26(-78, -116, 28);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILba;)V", line = 80)
    public static final void method24(int arg0, class178 arg1) {
        if (arg0 != 0) {
            return;
        }
        arg1.field2884 = false;
        field55++;
        if (arg1.field2885 != null) {
            arg1.field2885.field3343 = 0;
        }
        for (class178 var2 = arg1.method281(); var2 != null; var2 = arg1.method287()) {
            method24(0, var2);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)I", line = 104)
    public static final int method25(int arg0, int arg1, int arg2) {
        int var3 = arg0 + (arg1 * 57);
        field53++;
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        if (arg2 != 0) {
            method24(-10, (class178) null);
        }
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(III)V", line = 120)
    public static final void method26(int arg0, int arg1, int arg2) {
        class312.field4862 = (float) arg1;
        class329.field5112 = (float) arg2;
        if (class282.field4461 == 2) {
            class185.field2971 = arg1;
            class281.field4425 = arg2;
        }
        field48++;
        class340.method2344(-64);
        client.field4231 = true;
        if (arg0 != 14808) {
            method23(false);
        }
    }
}
