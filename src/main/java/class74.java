import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class74 extends class467 {

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "[Z")
    public static boolean[] field991 = new boolean[8];

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field996 = 0;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field993 = 0;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Lud;")
    public static class63 field999;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static void method489(boolean arg0) {
        field999 = null;
        field991 = null;
        if (!arg0) {
            field1000 = 110;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)B")
    public static final byte method490(int arg0, int arg1, byte arg2) {
        field995++;
        if (arg0 == 9) {
            if (arg2 != -3) {
                method492(-117);
            }
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)V")
    public static final void method491(boolean arg0) {
        field997++;
        if (arg0) {
            class295.field4368.method1522((byte) -30);
            class466.field6795 = null;
            class30.field464 = 1;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static final void method492(int arg0) {
        field994++;
        class497 var1 = null;
        try {
            class125 var2 = class419.field6254.method2813("2", (byte) 111);
            int var3 = -57 % ((84 - arg0) / 35);
            while (var2.field1791 == 0) {
                class106.method710(1L, (byte) 6);
            }
            if (var2.field1791 == 1) {
                var1 = (class497) var2.field1793;
                class91 var4 = new class91(class523.field7737 * 6 + 3);
                var4.method625(1, false);
                var4.method600(class523.field7737, -12891);
                for (int var5 = 0; var5 < class129.field1815.length; var5++) {
                    if (class397.field6038[var5]) {
                        var4.method600(var5, -12891);
                        var4.method615(28010, class129.field1815[var5]);
                    }
                }
                var1.method2962(false, var4.field1292, var4.field1277, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2961((byte) -27);
            }
        } catch (Exception var6) {
        }
        class213.field2980 = class264.method1698(true);
        class292.field4351 = false;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class74() {
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V")
    public class74(int arg0) {
        this.field998 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)Ljava/lang/String;")
    public static final String method493(int arg0) {
        int var1 = 6 / ((arg0 - 7) / 61);
        field992++;
        String var2 = "www";
        if (field999 == class26.field424) {
            var2 = "www-wtrc";
        } else if (field999 == class372.field5712) {
            var2 = "www-wtqa";
        } else if (field999 == class217.field3010) {
            var2 = "www-wtwip";
        }
        String var3 = "";
        if (class165.field2407 != null) {
            var3 = "/p=" + class165.field2407;
        }
        return "http://" + var2 + "." + class393.field5983.field5125 + ".com/l=" + class288.field4292 + "/a=" + class97.field1409 + var3 + "/";
    }
}
