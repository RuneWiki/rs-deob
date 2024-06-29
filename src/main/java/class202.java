import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class202 extends class182 {

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "[I")
    public static int[] field3932 = new int[2048];

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "Lsg;")
    public static class169 field3944 = class165.method1060("Mem:", 1536);

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "J")
    public static volatile long field3963 = 0L;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "Lsa;")
    public static class163 field3948 = new class163(8);

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lsg;")
    public static class169 field3964 = class165.method1060("<col=00ffff>", 1536);

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "Lsg;")
    private static class169 field3965 = class165.method1060("Location", 1536);

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "Lsg;")
    public static class169 field3966 = field3965;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "B")
    public static byte field3954;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public int field3934;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public int field3947;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public int field3949;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public int field3950;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public int field3951;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public int field3953;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public int field3957;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public int field3960;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public int field3961;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "Lm;")
    public class108 field3956;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "Ldb;")
    public class31 field3945;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Ljb;")
    public class83 field3935;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Ljd;")
    public class85 field3940;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "Lke;")
    public static class95 field3942;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "[I")
    public static int[] field3938;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static void method1316(boolean arg0) {
        field3948 = null;
        field3932 = null;
        field3965 = null;
        field3966 = null;
        field3964 = null;
        field3938 = null;
        field3944 = null;
        field3942 = null;
        if (!arg0) {
            method1317((byte) -7);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static final void method1317(byte arg0) {
        field3952++;
        for (int var1 = 0; var1 < class199.field3895; var1++) {
            int var2 = class6.field120[var1];
            class196 var3 = class65.field1213[var2];
            int var4 = class85.field1559.method819((byte) 22);
            if ((var4 & 0x20) != 0) {
                var4 += class85.field1559.method819((byte) 22) << 8;
            }
            class201.method1311(var2, 125, var4, var3);
        }
        if (arg0 != 93) {
            method1316(false);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
    public static final void method1318(boolean arg0) {
        if (arg0) {
            class73.field1359.method1205(arg0);
            field3941++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public final void method1319(int arg0) {
        this.field3940 = null;
        field3958++;
        if (arg0 != -15406) {
            method1317((byte) -110);
        }
        this.field3956 = null;
        this.field3945 = null;
        this.field3935 = null;
    }
}
