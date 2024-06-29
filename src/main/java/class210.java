import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class210 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Ljd;")
    private static class92 field4066 = class202.method1325((byte) 90, "Please enter your username)3");

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Ljd;")
    public static class92 field4068 = class202.method1325((byte) 90, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Ljd;")
    public static class92 field4074 = class202.method1325((byte) 90, " GMT");

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Ljd;")
    public static class92 field4069 = field4066;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field4075 = 1;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Ljd;")
    public static class92 field4072 = class202.method1325((byte) 90, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "J")
    public long field4079;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lsb;")
    public static class172 field4073;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lwd;")
    public class210 field4071;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Lwd;")
    public class210 field4078;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static final void method1366(int arg0) {
        class195.field3810 = arg0;
        for (int var1 = 0; var1 < class64.field1310; var1++) {
            for (int var2 = 0; var2 < class93.field1872; var2++) {
                if (class31.field698[arg0][var1][var2] == null) {
                    class31.field698[arg0][var1][var2] = new class43(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method1367(byte arg0) {
        field4074 = null;
        field4066 = null;
        field4069 = null;
        field4073 = null;
        field4068 = null;
        int var1 = -4 / ((-arg0 - 44) / 36);
        field4072 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static final void method1368(int arg0) {
        if (arg0 != 32) {
            field4069 = null;
        }
        for (int var1 = 0; var1 < class96.field1928; var1++) {
            int var2 = class39.field893[var1];
            class129 var3 = class107.field2187[var2];
            if (var3 != null) {
                class49.method301(var3, (byte) -127, var3.field2592.field1963);
            }
        }
        field4076++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public static final void method1369(byte arg0) {
        class29.field637 = new class33(32);
        field4067++;
        if (arg0 > -95) {
            field4073 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
    public final void method1370(int arg0) {
        field4070++;
        if (this.field4071 == null) {
            return;
        }
        this.field4071.field4078 = this.field4078;
        this.field4078.field4071 = this.field4071;
        this.field4071 = null;
        this.field4078 = null;
        int var2 = 99 / ((arg0 - 75) / 43);
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)Z")
    public final boolean method1371(byte arg0) {
        if (arg0 > -60) {
            field4073 = null;
        }
        field4065++;
        return this.field4071 != null;
    }
}
