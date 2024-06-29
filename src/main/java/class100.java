import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class100 extends class266 {

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public int field1493 = 12800;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public int field1485 = -1;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public int field1490 = 12800;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "Z")
    public boolean field1498 = true;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public int field1503 = 0;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public int field1504 = 0;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "Lma;")
    public class5 field1486;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "Lma;")
    public class5 field1500;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Lel;")
    public class218 field1489;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static volatile int field1488 = 0;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field1484 = 0;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field1494 = 0;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field1499 = 0;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "Lma;")
    public static class5 field1497 = class12.method119("scrollbar", (byte) 85);

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V", line = 8)
    public static void method637(int arg0) {
        field1497 = null;
        if (arg0 != 0) {
            method639(-46);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)Z", line = 31)
    public final boolean method638(byte arg0, int arg1, int arg2) {
        field1502++;
        if (arg2 < this.field1493 || arg2 > this.field1504 || arg1 < this.field1490 || this.field1503 < arg1) {
            return false;
        }
        for (class230 var4 = (class230) this.field1489.method1475(14); var4 != null; var4 = (class230) this.field1489.method1486(38)) {
            if (var4.method1639(arg2, arg1, 128)) {
                return true;
            }
        }
        if (arg0 > -124) {
            method639(68);
        }
        return false;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lma;Lma;IIIZ)V", line = 207)
    public class100(class5 arg0, class5 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1496 = arg3;
        this.field1492 = arg2;
        this.field1486 = arg0;
        this.field1485 = arg4;
        this.field1498 = arg5;
        this.field1500 = arg1;
        this.field1489 = new class218();
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V", line = 72)
    public static final void method639(int arg0) {
        field1501++;
        for (int var1 = -1; var1 < class175.field2675; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class118.field1785[var1];
            }
            class91 var3 = class267.field4593[var2];
            if (var3 != null && var3.field193 > 0) {
                var3.field193--;
                if (var3.field193 == 0) {
                    var3.field204 = null;
                }
            }
        }
        int var4 = 0;
        if (arg0 >= -51) {
            field1497 = (class5) null;
        }
        while (var4 < class129.field1940) {
            int var5 = class73.field1153[var4];
            class177 var6 = class119.field1804[var5];
            if (var6 != null && var6.field193 > 0) {
                var6.field193--;
                if (var6.field193 == 0) {
                    var6.field204 = null;
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V", line = 129)
    public final void method640(byte arg0) {
        field1491++;
        this.field1490 = 12800;
        this.field1493 = 12800;
        this.field1503 = 0;
        if (arg0 >= -81) {
            return;
        }
        this.field1504 = 0;
        for (class230 var2 = (class230) this.field1489.method1475(14); var2 != null; var2 = (class230) this.field1489.method1486(38)) {
            if (var2.field3820 > this.field1503) {
                this.field1503 = var2.field3820;
            }
            if (this.field1504 < var2.field3809) {
                this.field1504 = var2.field3809;
            }
            if (var2.field3815 < this.field1490) {
                this.field1490 = var2.field3815;
            }
            if (this.field1493 > var2.field3814) {
                this.field1493 = var2.field3814;
            }
        }
    }
}
