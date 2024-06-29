import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class80 extends class217 {

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public int field1454 = 0;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Z")
    public boolean field1452 = true;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public int field1450 = 0;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public int field1448 = 12800;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public int field1463 = -1;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    public int field1464 = 12800;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "Llc;")
    public class143 field1461;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "Llc;")
    public class143 field1453;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "Lli;")
    public class191 field1462;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "Llc;")
    public static class143 field1459 = class66.method374("(U", -1);

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Llc;")
    public static class143 field1456 = class66.method374(" de votre liste noire)3", -1);

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "Llc;")
    public static class143 field1458 = class66.method374("null", -1);

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIB)Z")
    public final boolean method450(int arg0, int arg1, byte arg2) {
        field1460++;
        if (arg0 < this.field1464 || this.field1450 < arg0 || this.field1448 > arg1 || this.field1454 < arg1) {
            return false;
        } else if (arg2 <= 92) {
            return true;
        } else {
            for (class184 var4 = (class184) this.field1462.method1294(false); var4 != null; var4 = (class184) this.field1462.method1292((byte) 97)) {
                if (var4.method1201(arg1, 88, arg0)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
    public final void method451(int arg0) {
        this.field1448 = 12800;
        this.field1454 = 0;
        this.field1464 = arg0;
        this.field1450 = 0;
        for (class184 var2 = (class184) this.field1462.method1294(false); var2 != null; var2 = (class184) this.field1462.method1292((byte) 59)) {
            if (var2.field3345 < this.field1448) {
                this.field1448 = var2.field3345;
            }
            if (var2.field3330 > this.field1454) {
                this.field1454 = var2.field3330;
            }
            if (var2.field3343 < this.field1464) {
                this.field1464 = var2.field3343;
            }
            if (this.field1450 < var2.field3347) {
                this.field1450 = var2.field3347;
            }
        }
        field1451++;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
    public static final void method452(int arg0) {
        class190.field3442.method823(true);
        class117.field2086.method823(true);
        if (arg0 != 0) {
            field1456 = null;
        }
        field1445++;
        class184.field3331.method823(true);
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
    public static void method453(int arg0) {
        field1459 = null;
        field1458 = null;
        field1456 = null;
        if (arg0 != -7646) {
            field1449 = -32;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Llc;Llc;IIIZ)V")
    public class80(class143 arg0, class143 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1461 = arg1;
        this.field1453 = arg0;
        this.field1463 = arg4;
        this.field1447 = arg2;
        this.field1452 = arg5;
        this.field1457 = arg3;
        this.field1462 = new class191();
    }
}
