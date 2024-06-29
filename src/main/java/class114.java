import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class114 extends class199 {

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "Lfh;")
    public static class140 field1473;

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V", line = 6)
    public class114(int arg0) {
        super(0, true);
        this.field1476 = 4096;
        this.field1476 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 15)
    public class114() {
        this(4096);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLfd;I)V", line = 22)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        field1474++;
        if (arg2 == 0) {
            this.field1476 = (arg1.method2096((byte) -122) << 12) / 255;
        }
        if (arg0 != -43) {
            this.method190(69, 27);
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(B)V", line = 56)
    public static void method840(byte arg0) {
        field1473 = null;
        if (arg0 > -78) {
            field1473 = (class140) null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZB)C", line = 67)
    public static final char method841(boolean arg0, byte arg1) {
        field1475++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (arg0) {
            method841(false, (byte) 36);
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class131.field1785[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[I", line = 97)
    public final int[] method190(int arg0, int arg1) {
        field1478++;
        if (arg0 != -1735) {
            this.field1476 = 67;
        }
        int[] var3 = this.field2802.method2502(arg1, 117);
        if (this.field2802.field5637) {
            class87.method630(var3, 0, class95.field1235, this.field1476);
        }
        return var3;
    }
}
