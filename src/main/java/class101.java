import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class101 extends class431 {

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public int field1449 = 0;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "Lob;")
    public static class521 field1444 = new class521(48, 3);

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "Lwq;")
    public class116 field1446;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "Lqb;")
    public static class152 field1456;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "Lcl;")
    public class177 field1455;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Lmf;")
    public static class291 field1434;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "Lfi;")
    public class392 field1443;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "Lfi;")
    public class392 field1454;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "Ljt;")
    public class69 field1447;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Z")
    public boolean field1439;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "[I")
    public int[] field1448;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 5)
    public static void method808(int arg0) {
        if (arg0 == 0) {
            field1456 = null;
            field1434 = null;
            field1444 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V", line = 19)
    public final void method809(int arg0) {
        field1437++;
        int var2 = this.field1436;
        if (arg0 <= 1) {
            this.method809(101);
        }
        if (this.field1447 != null) {
            class69 var3 = this.field1447.method604((byte) -15, class195.field3271);
            if (var3 == null) {
                this.field1436 = -1;
                this.field1438 = 0;
                this.field1441 = 0;
                this.field1445 = 0;
                this.field1457 = 0;
                this.field1448 = null;
            } else {
                this.field1436 = var3.field892;
                this.field1438 = var3.field909 << 7;
                this.field1448 = var3.field904;
                this.field1457 = var3.field939;
                this.field1445 = var3.field891;
                this.field1441 = var3.field889;
            }
        } else if (this.field1446 != null) {
            int var4 = class202.method1416(this.field1446, -1);
            if (var2 != var4) {
                this.field1436 = var4;
                class37 var5 = this.field1446.field1763;
                if (var5.field499 != null) {
                    var5 = var5.method256(126, class195.field3271);
                }
                if (var5 == null) {
                    this.field1441 = this.field1438 = 0;
                } else {
                    this.field1438 = var5.field450 << 7;
                    this.field1441 = var5.field466;
                }
            }
        } else if (this.field1455 != null) {
            this.field1436 = class289.method1864(this.field1455, true);
            this.field1441 = this.field1455.field2674;
            this.field1438 = this.field1455.field2641 << 7;
        }
        if (this.field1436 != var2 && this.field1443 != null) {
            class359.field5328.method385(this.field1443);
            this.field1443 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Z", line = 120)
    public static final boolean method810(int arg0, int arg1, int arg2) {
        field1435++;
        if (arg2 < 65) {
            method810(-47, 69, 5);
        }
        return class215.method1488(arg0, arg1, 0) || class262.method1748(arg1, (byte) 127, arg0);
    }
}
