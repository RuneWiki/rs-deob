import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class111 extends class180 {

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    private final int field1955;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    private final int field1948;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    private final int field1949;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    private final int field1947;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Ljf;")
    public static class229 field1954 = class212.method1457((byte) 57, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lni;")
    public static class24 field1951 = new class24(64);

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field1957 = 0;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "Ljf;")
    private static class229 field1958 = class212.method1457((byte) 102, "yellow:");

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "Z")
    public static boolean field1956 = false;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field1960 = 0;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "Ljf;")
    public static class229 field1959 = field1958;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "Ljf;")
    public static class229 field1961 = field1958;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 14)
    public static void method785(int arg0) {
        if (arg0 != 64) {
            return;
        }
        field1951 = null;
        field1954 = null;
        field1959 = null;
        field1958 = null;
        field1961 = null;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(III)V", line = 33)
    public final void method786(int arg0, int arg1, int arg2) {
        field1953++;
        int var4 = this.field1955 * arg2 >> 12;
        int var5 = this.field1949 * arg0 >> 12;
        if (arg1 <= 71) {
            field1960 = -51;
        }
        int var6 = this.field1948 * arg0 >> 12;
        int var7 = this.field1947 * arg2 >> 12;
        class220.method1518(0, var5, var6, this.field3121, var7, var4);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V", line = 53)
    public final void method787(int arg0, int arg1, int arg2) {
        int var4 = this.field1948 * arg2 >> 12;
        int var5 = this.field1947 * arg1 >> 12;
        field1945++;
        int var6 = this.field1949 * arg2 >> 12;
        int var7 = this.field1955 * arg1 >> 12;
        class232.method1670(var5, this.field3121, this.field3115, this.field3122, var7, 0, var6, var4);
        int var8 = 45 / ((-arg0 - 20) / 52);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(IIIIIII)V", line = 79)
    public class111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1955 = arg2;
        this.field1948 = arg1;
        this.field1949 = arg3;
        this.field1947 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(III)V", line = 94)
    public static final void method788(int arg0, int arg1, int arg2) {
        field1952++;
        int var3 = arg0--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class319.field5403[arg0];
        int var5 = class185.field3224[arg0];
        if (arg1 == 0) {
            class151.field2609++;
            class84.field1608.method1397(80, 0);
            class84.field1608.method140(var3 + var3 + 3, (byte) 75);
        }
        if (arg1 == 1) {
            class298.field5085++;
            class84.field1608.method1397(62, 0);
            class84.field1608.method140(var3 + var3 + 14 + 3, (byte) 75);
        }
        if (arg1 == 2) {
            class246.field4368++;
            class84.field1608.method1397(165, 0);
            class84.field1608.method140(var3 + var3 + 3, (byte) 75);
        }
        class84.field1608.method133((byte) 112, class258.field4503 + var5);
        class84.field1608.method133((byte) -109, class213.field3649 + var4);
        class84.field1608.method117(class84.field1613[82] ? 1 : 0, 30830);
        class23.field418 = class185.field3224[0];
        class73.field1395 = class319.field5403[0];
        int var6 = 54 / ((-arg2 - 32) / 42);
        for (int var7 = 1; var7 < var3; var7++) {
            arg0--;
            class84.field1608.method92(255, class185.field3224[arg0] - var5);
            class84.field1608.method140(class319.field5403[arg0] - var4, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)V", line = 157)
    public final void method789(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            field1946++;
        }
    }
}
