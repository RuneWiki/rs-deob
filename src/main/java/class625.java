import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class625 extends class379 {

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Z")
    public boolean field8570 = false;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public int field8567 = -1;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public int field8568;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public int field8569;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public int field8572;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public int field8574;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public int field8576;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lbt;")
    public static class48 field8577;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Z")
    public static boolean field8573;

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V", line = 239)
    public class625(int arg0) {
        this.field8567 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)[Lps;", line = 15)
    public static final class105[] method3549(byte arg0) {
        field8575++;
        return arg0 < 86 ? null : new class105[] { class595.field8082, class301.field3601, class700.field9521 };
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BB)C", line = 26)
    public static final char method3550(byte arg0, byte arg1) {
        if (arg1 != 117) {
            return '*';
        }
        field8571++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class88.field1183[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()V", line = 56)
    public static final void method3551() {
        if (class172.field2057 != null) {
            for (int var0 = 0; var0 < class172.field2057.length; var0++) {
                for (int var1 = 0; var1 < class307.field3799; var1++) {
                    for (int var2 = 0; var2 < class250.field2938; var2++) {
                        if (class172.field2057[var0][var1][var2] != null) {
                            class172.field2057[var0][var1][var2].method4112((byte) -75);
                        }
                        class172.field2057[var0][var1][var2] = null;
                    }
                }
            }
        }
        class172.field2057 = null;
        class707.field9933 = null;
        if (class50.field707 != null) {
            for (int var3 = 0; var3 < class50.field707.length; var3++) {
                for (int var4 = 0; var4 < class307.field3799; var4++) {
                    for (int var5 = 0; var5 < class250.field2938; var5++) {
                        if (class50.field707[var3][var4][var5] != null) {
                            class50.field707[var3][var4][var5].method4112((byte) -75);
                        }
                        class50.field707[var3][var4][var5] = null;
                    }
                }
            }
        }
        class50.field707 = null;
        class704.field9910 = null;
        class107.field1351 = null;
        class621.field8523 = null;
        class308.field3820 = null;
        class152.field1896 = null;
        class467.field6533 = null;
        class617.field8308 = null;
        class207.field2459 = null;
        class546.method3216(-78);
        if (class620.field8391 != null) {
            for (int var6 = 0; var6 < class521.field7397; var6++) {
                class620.field8391[var6] = null;
            }
            class521.field7397 = 0;
        }
        class653.field9015 = null;
        class119.field1509 = null;
        class454.field6399 = null;
        if (class430.field5671 != null) {
            for (int var7 = 0; var7 < class430.field5671.length; var7++) {
                class430.field5671[var7] = null;
            }
            class446.field6000 = 0;
        }
        if (class642.field8765 != null) {
            for (int var8 = 0; var8 < class642.field8765.length; var8++) {
                class642.field8765[var8] = null;
            }
            class116.field1480 = 0;
        }
        if (class331.field4094 != null) {
            for (int var9 = 0; var9 < class784.field10818; var9++) {
                class331.field4094[var9] = null;
            }
            for (int var10 = 0; var10 < class368.field4569; var10++) {
                for (int var11 = 0; var11 < class307.field3799; var11++) {
                    for (int var12 = 0; var12 < class250.field2938; var12++) {
                        class425.field5640[var10][var11][var12] = 0L;
                    }
                }
            }
            class784.field10818 = 0;
        }
        class27.method261(72);
        class613.field8242 = class613.field8240;
        class613.field8242.method2935(-113);
        class406.field5335 = null;
        class68.field940 = null;
        class316.field3876 = null;
        if (class747.field10373 != null) {
            class260.method1552();
            class6.field80.method609(1);
            class6.field80.method605(0);
        }
        if (class468.field6545 != null) {
            class468.field6545 = null;
        }
        class6.field80 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 230)
    public static void method3552(int arg0) {
        field8577 = null;
        if (arg0 != -30049) {
            method3550((byte) -69, (byte) 25);
        }
    }
}
