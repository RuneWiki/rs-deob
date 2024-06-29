import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class108 {

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "Lng;")
    private class226 field1550 = new class226(64);

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "Lic;")
    private class491 field1558;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Lri;")
    public static class73 field1549 = new class73(23, 7);

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field1559 = 0;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "Lri;")
    public static class73 field1556 = new class73(14, 1);

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "Lri;")
    public static class73 field1560 = new class73(73, 6);

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "[[[Lfl;")
    public static class518[][][] field1553;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)Lpi;")
    public final class343 method665(int arg0, int arg1) {
        field1551++;
        if (arg0 != 14) {
            return null;
        }
        class226 var3 = this.field1550;
        class343 var4;
        synchronized (this.field1550) {
            var4 = (class343) this.field1550.method1536((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1558.method2945(35, arg1, true);
        class343 var6 = new class343();
        if (var5 != null) {
            var6.method2102(true, new class209(var5));
        }
        var6.method2100((byte) -117);
        class226 var7 = this.field1550;
        synchronized (this.field1550) {
            this.field1550.method1542(var6, (byte) 112, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method666(byte arg0, int arg1) {
        field1555++;
        String var2 = Integer.toString(arg1);
        int var3 = 36 / ((17 - arg0) / 59);
        for (int var4 = var2.length() - 3; var4 > 0; var4 -= 3) {
            var2 = var2.substring(0, var4) + "," + var2.substring(var4);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class184.field2740.method2838(false, class143.field2137) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class214.field3116.method2838(false, class143.field2137) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
    public final void method667(byte arg0) {
        class226 var2 = this.field1550;
        synchronized (this.field1550) {
            if (arg0 >= -91) {
                this.method668(58);
            }
            this.field1550.method1540(0);
        }
        field1554++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public final void method668(int arg0) {
        field1557++;
        if (arg0 == -11556) {
            class226 var2 = this.field1550;
            synchronized (this.field1550) {
                this.field1550.method1539(-71);
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V")
    public final void method669(boolean arg0, int arg1) {
        class226 var3 = this.field1550;
        synchronized (this.field1550) {
            this.field1550.method1534(0, arg1);
        }
        if (arg0) {
            this.method665(45, 74);
        }
        field1552++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
    public static void method670(boolean arg0) {
        field1560 = null;
        field1549 = null;
        field1556 = null;
        field1553 = null;
        if (!arg0) {
            method666((byte) 87, -29);
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lai;ILic;)V")
    public class108(class423 arg0, int arg1, class491 arg2) {
        this.field1558 = arg2;
        if (this.field1558 != null) {
            this.field1558.method2942(false, 35);
        }
    }
}
