import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class102 extends OutputStream {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Leg;")
    public static class37 field1597 = class174.method1167("Lade Konfiguration )2 ", -119);

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Leg;")
    public static class37 field1602 = class174.method1167("Benutzeroberfl-=che geladen)3", 96);

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "[[I")
    public static int[][] field1603 = new int[104][104];

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Leg;")
    public static class37 field1605 = class174.method1167(")4j", -91);

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field1608 = 0;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZ)V")
    public static final void method683(int arg0, boolean arg1) {
        field1598++;
        if (class232.field4011 == arg0) {
            return;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (class232.field4011 == 0) {
            class201.method1393(-1);
        }
        if (arg1) {
            method689(107, -106);
        }
        if (arg0 == 40) {
            class24.method147(arg1);
        }
        if (arg0 != 40 && class279.field4928 != null) {
            class279.field4928.method419((byte) -66);
            class279.field4928 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class115.field1960 = 1;
            class52.field814 = 0;
            class288.field5088 = 1;
            class171.field2881 = 0;
            class137.field2353 = 0;
            client.method781(true, (byte) -75);
        }
        if (arg0 == 25 || arg0 == 10) {
            class181.method1197(17820);
        }
        if (arg0 == 5) {
            class105.method704(class124.field2086, 0);
        } else {
            class184.method1230((byte) -123);
        }
        boolean var3 = class232.field4011 == 5 || class232.field4011 == 10 || class232.field4011 == 28;
        if (var2 != var3) {
            if (var2) {
                class137.field2344 = class1.field3;
                if (class252.field4507 == 0) {
                    class92.method607(2, 41);
                } else {
                    class239.method1637(class92.field1449, 255, class1.field3, 2, 71, 0, false);
                }
                class151.field2532.method814(false, false);
            } else {
                class92.method607(2, 41);
                class151.field2532.method814(false, true);
            }
        }
        class232.field4011 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[Leg;[S)V")
    public static final void method684(int arg0, class37[] arg1, short[] arg2) {
        if (arg0 != 6388) {
            method689(-105, -108);
        }
        field1606++;
        class99.method640(arg1.length - 1, arg2, 11, 0, arg1);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)Ldf;")
    public static final class152 method685(byte arg0, int arg1) {
        field1600++;
        class152 var2 = (class152) class239.field4249.method344((byte) 14, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class93.field1470.method666(arg1, 26, (byte) -51);
        class152 var4 = new class152();
        if (var3 != null) {
            var4.method1039(new class187(var3), (byte) -20);
        }
        int var5 = 102 % ((-arg0 - 12) / 60);
        class239.field4249.method341((byte) 16, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILeg;BLeg;ILeg;)V")
    public static final void method686(int arg0, class37 arg1, byte arg2, class37 arg3, int arg4, class37 arg5) {
        field1610++;
        if (arg2 != 51) {
            return;
        }
        for (int var6 = 99; var6 > 0; var6--) {
            class146.field2486[var6] = class146.field2486[var6 - 1];
            class84.field1320[var6] = class84.field1320[var6 - 1];
            class143.field2435[var6] = class143.field2435[var6 - 1];
            class36.field523[var6] = class36.field523[var6 - 1];
            class39.field626[var6] = class39.field626[var6 - 1];
        }
        class146.field2486[0] = arg4;
        class84.field1320[0] = arg1;
        class198.field3362++;
        class236.field4059 = class221.field3804;
        class143.field2435[0] = arg5;
        class39.field626[0] = arg0;
        class36.field523[0] = arg3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method687(byte arg0) {
        field1605 = null;
        field1597 = null;
        if (arg0 > -25) {
            method689(-35, -29);
        }
        field1603 = null;
        field1602 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Z")
    public static final boolean method688(int arg0, int arg1) {
        field1604++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class264.field4642[arg1];
        if (~var2 <= arg0) {
            var2 -= 2000;
        }
        return var2 == 1002;
    }

    @OriginalMember(owner = "client!kg", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1609++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)V")
    public static final void method689(int arg0, int arg1) {
        class171.field2879 = 50;
        if (arg1 == 24530) {
            field1601++;
            class187.field3193 = arg0;
        }
    }
}
