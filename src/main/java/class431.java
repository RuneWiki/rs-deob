import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class431 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[I")
    public static int[] field6383 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "J")
    public long field6388;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Llm;")
    public static class348 field6391;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Lul;")
    public static class406 field6387;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lcf;")
    public class431 field6384;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lcf;")
    public class431 field6389;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method2674(int arg0) {
        field6385++;
        if (this.field6389 == null) {
            return false;
        } else {
            if (arg0 != 26931) {
                this.method2677(20);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 29)
    public static void method2675(int arg0) {
        field6391 = null;
        field6383 = null;
        if (arg0 != 3352) {
            field6383 = null;
        }
        field6387 = null;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)Z", line = 44)
    public static final boolean method2676(int arg0) {
        field6386++;
        if (arg0 < 20) {
            field6387 = null;
        }
        return class382.field5752 > 0;
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V", line = 56)
    public final void method2677(int arg0) {
        field6390++;
        if (this.field6389 == null) {
            return;
        }
        if (arg0 != -22491) {
            method2675(82);
        }
        this.field6389.field6384 = this.field6384;
        this.field6384.field6389 = this.field6389;
        this.field6389 = null;
        this.field6384 = null;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)I", line = 74)
    public static final int method2678(int arg0) {
        if (arg0 != 2) {
            return 83;
        }
        field6382++;
        if (class116.field1752 == null) {
            if (!class307.field4631 && class382.field5752 > 0) {
                if (class34.field392 && class101.field1456.method1045(81, (byte) -80) && class382.field5752 > 2) {
                    return ((class295) class456.field6644.field2077.field6389.field6389).field4500;
                }
                return ((class295) class456.field6644.field2077.field6389).field4500;
            }
            int var1 = class184.field2800.method542(false);
            int var2 = class184.field2800.method543(true);
            int var3 = class521.field7630;
            int var4 = class397.field5941;
            int var5 = class498.field7158;
            if (var3 < var1 && var1 < (var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; var7 < class382.field5752; var7++) {
                    if (class432.field6402) {
                        int var11 = (class382.field5752 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > var11 - 13 && var2 <= (var11 + 3)) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class382.field5752 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > (var12 - 13) && var2 <= (var12 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class249 var9 = new class249(class456.field6644);
                    for (class295 var10 = (class295) var9.method1679(87); var10 != null; var10 = (class295) var9.method1682((byte) -106)) {
                        if (var8++ == var6) {
                            return var10.field4500;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
