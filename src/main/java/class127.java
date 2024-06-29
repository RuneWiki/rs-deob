import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class127 {

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "Z")
    public boolean field1675 = false;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "Lbn;")
    public static class160 field1683;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field1684;

    static {
        new class409("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field1683 = new class160(27, 2);
        field1685 = 0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)Z", line = 6)
    public final boolean method852(byte arg0) {
        if (arg0 >= -121) {
            this.field1676 = 7;
        }
        field1677++;
        return class136.field1865.method708(this.field1676, (byte) -121);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZBLfp;)Lae;", line = 18)
    public final class285 method853(int arg0, boolean arg1, byte arg2, class9 arg3) {
        field1678++;
        int var5 = 31 / ((35 - arg2) / 34);
        long var6 = (long) (arg0 << 16 | this.field1676 | (arg1 ? 262144 : 0) | arg3.field120 << 19);
        class285 var8 = (class285) class347.field5110.method2310((byte) -128, var6);
        if (var8 != null) {
            return var8;
        } else if (class136.field1865.method708(this.field1676, (byte) -120)) {
            class144 var9 = class144.method991(class136.field1865, this.field1676, 0);
            if (var9 != null) {
                var9.field1954 = var9.field1951 = var9.field1959 = var9.field1957 = 0;
                if (arg1) {
                    var9.method997();
                }
                for (int var10 = 0; var10 < arg0; var10++) {
                    var9.method990();
                }
            }
            class285 var11 = arg3.method100(var9, true);
            if (var11 != null) {
                class347.field5110.method2299(true, var11, var6);
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V", line = 63)
    public static void method854(boolean arg0) {
        field1683 = null;
        if (!arg0) {
            method856((byte) 25);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILat;I)V", line = 86)
    public final void method855(int arg0, class256 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1738((byte) 65);
            if (var4 == 0) {
                field1679++;
                if (arg0 < 56) {
                    method856((byte) 85);
                    return;
                }
                return;
            }
            this.method857(12, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V", line = 106)
    public static final void method856(byte arg0) {
        field1680++;
        class314 var1 = (class314) class343.field5049.method2026(100);
        if (arg0 <= 35) {
            field1685 = -11;
        }
        while (var1 != null) {
            var1.method2075();
            var1 = (class314) class343.field5049.method2022(10);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILat;I)V", line = 131)
    private final void method857(int arg0, int arg1, class256 arg2, int arg3) {
        if (arg1 == 1) {
            this.field1676 = arg2.method1767(1930493576);
        } else if (arg1 == 2) {
            this.field1681 = arg2.method1725((byte) 0);
        } else if (arg1 == 3) {
            this.field1675 = true;
        } else if (arg1 == 4) {
            this.field1676 = -1;
        }
        field1682++;
        int var5 = -128 % ((arg0 - 77) / 39);
    }
}
