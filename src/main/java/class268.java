import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class268 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[I")
    public static int[] field4282 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static final void method1820(int arg0) {
        class10.field138 = 0;
        class271.field4313 = -1;
        class79.field1142 = 0;
        class245.field3920 = 0;
        class95.field1470 = -1;
        class215.field3510 = 0;
        class262.field4233 = -1;
        class286.field4542 = false;
        class100.field1565 = -1;
        class13.field165.field349 = 0;
        class108.field1659 = 0;
        class179.field2793 = 0;
        field4284++;
        class235.field3766.field349 = 0;
        for (int var1 = 0; var1 < class153.field2277.length; var1++) {
            if (class153.field2277[var1] != null) {
                class153.field2277[var1].field1281 = -1;
            }
        }
        for (int var2 = 0; var2 < class100.field1566.length; var2++) {
            if (class100.field1566[var2] != null) {
                class100.field1566[var2].field1281 = -1;
            }
        }
        class264.method1806((byte) 91);
        class278.field4414 = arg0;
        class245.method1650(30, (byte) -99);
        for (int var3 = 0; var3 < 100; var3++) {
            class110.field1675[var3] = true;
        }
        class79.method545(120);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljh;)V")
    public static final void method1821(class284 arg0) {
        for (int var1 = arg0.field4494; var1 <= arg0.field4504; var1++) {
            for (int var2 = arg0.field4498; var2 <= arg0.field4510; var2++) {
                class49 var3 = class90.field1382[arg0.field4505][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field639; var4++) {
                        if (var3.field643[var4] == arg0) {
                            var3.field639--;
                            for (int var5 = var4; var5 < var3.field639; var5++) {
                                var3.field643[var5] = var3.field643[var5 + 1];
                                var3.field645[var5] = var3.field645[var5 + 1];
                            }
                            var3.field643[var3.field639] = null;
                            break;
                        }
                    }
                    var3.field650 = 0;
                    for (int var6 = 0; var6 < var3.field639; var6++) {
                        var3.field650 |= var3.field645[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1822(int arg0, String arg1) {
        field4280++;
        return arg0 <= 124 ? -54 : arg1.length() + 1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lai;I)Lai;")
    public abstract class86 method603(class86 arg0, int arg1);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V")
    public static final void method1823(int arg0, boolean arg1) {
        class158.field2435 = arg0;
        field4283++;
        if (!arg1) {
            field4282 = null;
        }
        class94.field1463 = -1;
        class94.field1463 = -1;
        class17.method117(13);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(ILjava/lang/String;)V")
    public static final void method1824(int arg0, String arg1) {
        field4281++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg0 < 111) {
            field4282 = null;
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method1825(int arg0) {
        if (arg0 != 1) {
            method1821((class284) null);
        }
        field4282 = null;
    }
}
