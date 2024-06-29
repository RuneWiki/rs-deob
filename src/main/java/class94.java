import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class94 extends class59 {

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    private int field1592 = 4096;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    private int field1586 = 0;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "[Lph;")
    public static class229[] field1579 = new class229[500];

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "[Z")
    public static boolean[] field1583 = new boolean[112];

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "[S")
    public static short[] field1584 = new short[256];

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "Lph;")
    private static class229 field1588 = class266.method1858("shake:", 0);

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Lph;")
    public static class229 field1580 = field1588;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "Lph;")
    public static class229 field1585 = field1588;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "Lph;")
    private static class229 field1595 = class266.method1858("Attack", 0);

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
    public static int field1596 = 0;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "Lph;")
    public static class229 field1591 = field1595;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "(I)V", line = 15)
    public static void method700(int arg0) {
        field1580 = null;
        field1591 = null;
        int var1 = -32 / ((2 - arg0) / 48);
        field1584 = null;
        field1595 = null;
        field1588 = null;
        field1579 = null;
        field1585 = null;
        field1583 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lrd;Z)I", line = 35)
    public static final int method701(class217 arg0, boolean arg1) {
        if (arg1) {
            method702((byte) -92, (class92) null);
        }
        field1581++;
        class313 var2 = arg0.field3559;
        if (var2.field5262 != null) {
            var2 = var2.method2118(0);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field5327;
        if (arg0.field5153 == arg0.field5115) {
            var3 = var2.field5322;
        } else if (arg0.field5115 == arg0.field5101) {
            var3 = var2.field5299;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 65)
    public class94() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BILhb;)V", line = 74)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field1587++;
        if (arg0 != 115) {
            return;
        }
        if (arg1 == 0) {
            this.field1586 = arg2.method1161(true);
        } else if (arg1 == 1) {
            this.field1592 = arg2.method1161(true);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)[I", line = 121)
    public final int[] method63(boolean arg0, int arg1) {
        field1590++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int[] var4 = this.method394(arg1, 0, (byte) -55);
            for (int var5 = 0; var5 < class293.field4789; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field1586 <= var6 && var6 <= this.field1592 ? 4096 : 0;
            }
        }
        if (!arg0) {
            field1584 = (short[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLwe;)V", line = 168)
    public static final void method702(byte arg0, class92 arg1) {
        class270 var2 = null;
        try {
            if (arg0 > -33) {
                method701((class217) null, true);
            }
            class247 var3 = arg1.method681(false, "runescape");
            while (var3.field4125 == 0) {
                class288.method1976((byte) 88, 1L);
            }
            if (var3.field4125 == 1) {
                var2 = (class270) var3.field4123;
                class164 var4 = class177.method1274((byte) 117);
                var2.method1880(0, var4.field2668, (byte) 52, var4.field2670);
            }
        } catch (Exception var8) {
        }
        field1589++;
        try {
            if (var2 != null) {
                var2.method1879(-9784);
            }
        } catch (Exception var7) {
        }
    }
}
