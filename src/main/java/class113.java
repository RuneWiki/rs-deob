import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class class113 implements class716 {

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "Lnd;")
    private class547 field1630;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "Lci;")
    public class452 field1627;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "Lnd;")
    public class547 field1633;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "J")
    private long field1631;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "Lda;")
    private class61 field1626;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)I")
    public static final int method890(int arg0, int arg1) {
        if (arg1 != 2094889633) {
            field1629 = 77;
        }
        field1628++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public void method366(int arg0) {
        field1634++;
        class274 var2 = class335.method1930(this.field1627.field5980, (byte) -72, this.field1630);
        this.field1626 = class386.field4930.method500(var2, class728.method4058(this.field1633, this.field1627.field5980), true);
        if (arg0 != 18295) {
            this.field1630 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZB)V")
    public final void method368(boolean arg0, byte arg1) {
        field1625++;
        int var3 = this.field1627.field5981.method735(0, this.field1627.field5988, class482.field6548) + this.field1627.field5983;
        if (arg1 > -57) {
            return;
        }
        int var4 = this.field1627.field5979.method3397(this.field1627.field5978, class478.field6509, -122) + this.field1627.field5985;
        this.method892(true, var4, arg0, var3);
        this.method891(arg0, (byte) -92, var4, var3);
        String var5 = class14.field273.method1086((byte) 125);
        if (class446.method2525(500) - this.field1631 > 10000L) {
            var5 = var5 + " (" + class14.field273.method1081(-1512726696).method1844(13) + ")";
        }
        this.field1626.method563(this.field1627.field5988 / 2 + var3, -1, -116, this.field1627.field5976, this.field1627.field5987 + var4 + (this.field1627.field5978 / 2) + 4, var5);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZBII)V")
    public abstract void method891(boolean arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZIZI)V")
    public abstract void method892(boolean arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lnd;Lnd;Lci;)V")
    public class113(class547 arg0, class547 arg1, class452 arg2) {
        this.field1630 = arg1;
        this.field1627 = arg2;
        this.field1633 = arg0;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Z")
    public boolean method369(int arg0) {
        if (arg0 != 11107) {
            return false;
        }
        field1624++;
        boolean var2 = true;
        if (!this.field1633.method3154(this.field1627.field5980, (byte) 98)) {
            var2 = false;
        }
        if (!this.field1630.method3154(this.field1627.field5980, (byte) 98)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)I")
    public final int method893(boolean arg0) {
        if (!arg0) {
            field1629 = -68;
        }
        field1635++;
        int var2 = class14.field273.method1080((byte) 42);
        int var3 = var2 * 100;
        if (this.field1632 == var2 && var2 != 0) {
            int var4 = class14.field273.method1083(-28490);
            if (var4 > var2) {
                long var5 = this.field1631 - class14.field273.method1079((byte) 103);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class446.method2525(500) - this.field1631) * 10000L;
                    if (var9 >= var7) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                    }
                }
            }
        } else {
            this.field1632 = var2;
            this.field1631 = class446.method2525(500);
        }
        return var3;
    }
}
