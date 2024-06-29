import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class176 extends class396 {

    @OriginalMember(owner = "client!db", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field2445 = new String[100];

    @OriginalMember(owner = "client!db", name = "y", descriptor = "C")
    private char field2447;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public int field2451;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "Ldm;")
    public static class32 field2450;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Ljava/lang/String;")
    public String field2442;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "[Lkh;")
    public static class11[] field2449;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lbk;IB)V")
    private final void method1159(class211 arg0, int arg1, byte arg2) {
        if (arg2 > -25) {
            this.field2451 = 64;
        }
        if (arg1 == 1) {
            this.field2447 = class392.method2501(21802, arg0.method1373((byte) 30));
        } else if (arg1 == 2) {
            this.field2451 = arg0.method1336((byte) -49);
        } else if (arg1 == 5) {
            this.field2442 = arg0.method1350(95);
        }
        field2441++;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)Z")
    public final boolean method1160(int arg0) {
        if (arg0 > -53) {
            method1163((byte) -12);
        }
        field2444++;
        return this.field2447 == 's';
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1161(String arg0, int arg1) {
        field2446++;
        System.out.println("Error: " + class428.method2665(arg0, (byte) 109, "\n", "%0a"));
        int var2 = -49 / ((-arg1 - 33) / 51);
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static void method1162(int arg0) {
        field2445 = null;
        field2450 = null;
        if (arg0 == -3) {
            field2449 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
    public static final void method1163(byte arg0) {
        field2448++;
        int var1 = 0;
        if (arg0 != 111) {
            return;
        }
        if (class216.field2943) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class372.method2332(var1, (byte) -126);
        class190.method1218(var1, (byte) -7);
        class412.method2583(false, var1);
        class306.method1917((byte) -114, var1);
        class377.method2369(-121, var1);
        class26.method157(var1, 8225);
        class402.method2548(arg0 - 32880, var1);
        class172.method1140(var1, -111);
        class34.method198(var1, (byte) 78);
        if (class105.field1191 == 10) {
            class266.method1695(28, (byte) -120);
        } else if (class105.field1191 == 30) {
            class266.method1695(25, (byte) 16);
            return;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lbk;B)V")
    public final void method1164(class211 arg0, byte arg1) {
        if (arg1 != 45) {
            return;
        }
        field2443++;
        while (true) {
            int var3 = arg0.method1342((byte) -128);
            if (var3 == 0) {
                return;
            }
            this.method1159(arg0, var3, (byte) -41);
        }
    }
}
