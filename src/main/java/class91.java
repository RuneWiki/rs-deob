import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class91 extends class103 {

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "[B")
    public byte[] field1543;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "Lda;")
    public static class275 field1540 = class255.method1672(123, ")2");

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Lfd;")
    public static class229 field1542 = null;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "Lwi;")
    public static class90 field1548 = new class90();

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "Lda;")
    public static class275 field1551 = class255.method1672(119, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public static int field1550 = 0;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "Lqb;")
    public static class83 field1549 = new class83();

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "Llb;")
    public static class274 field1545;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "[I")
    public static int[] field1552;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public static void method655(byte arg0) {
        field1542 = null;
        field1545 = null;
        field1551 = null;
        if (arg0 != 124) {
            method655((byte) 40);
        }
        field1549 = null;
        field1548 = null;
        field1540 = null;
        field1552 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILuh;)V")
    public static final void method656(int arg0, class186 arg1) {
        if (arg1.field3178 != null) {
            arg1.field3178.field1107 = 0;
        }
        field1544++;
        arg1.field3177 = false;
        if (arg0 == 23893) {
            for (class186 var2 = arg1.method414(); var2 != null; var2 = arg1.method408()) {
                method656(23893, var2);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "([B)V")
    public class91(byte[] arg0) {
        this.field1543 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    public static final void method657(byte arg0) {
        field1547++;
        class184.field3154 = 0;
        class26.field424 = 0;
        class89.method649(119);
        class250.method1643(0);
        client.method628(arg0 - 43);
        int var1 = 0;
        if (arg0 != 93) {
            return;
        }
        while (class26.field424 > var1) {
            int var3 = class38.field633[var1];
            if (class35.field576 != class31.field478[var3].field1739) {
                if (class31.field478[var3].field2873.method142(-1)) {
                    class145.method1039(0, class31.field478[var3]);
                }
                class31.field478[var3].field2873 = null;
                class31.field478[var3] = null;
            }
            var1++;
        }
        if (class59.field1000 != class196.field3351.field1392) {
            throw new RuntimeException("gnp1 pos:" + class196.field3351.field1392 + " psize:" + class59.field1000);
        }
        for (int var2 = 0; var2 < class181.field3118; var2++) {
            if (class31.field478[class228.field3851[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class181.field3118);
            }
        }
    }
}
