import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class394 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public int field5759 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
    public boolean field5756 = false;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lhq;")
    public class88 field5761 = null;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Z")
    public boolean field5765 = false;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "[S")
    public short[] field5762;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[S")
    public short[] field5760;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[S")
    public short[] field5764;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "[S")
    public short[] field5766;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[S")
    public short[] field5769;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "[B")
    public byte[] field5757;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "[S")
    private static short[] field5763 = new short[500];

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[B")
    private static byte[] field5758 = new byte[500];

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[S")
    private static short[] field5767 = new short[500];

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "[S")
    private static short[] field5770 = new short[500];

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "[S")
    private static short[] field5771 = new short[500];

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "[S")
    private static short[] field5768 = new short[500];

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()V")
    public static void method2517() {
        field5763 = null;
        field5768 = null;
        field5767 = null;
        field5771 = null;
        field5770 = null;
        field5758 = null;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "([BLhq;)V")
    public class394(byte[] arg0, class88 arg1) {
        this.field5761 = arg1;
        try {
            class211 var3 = new class211(arg0);
            class211 var4 = new class211(arg0);
            var3.field2888 = 2;
            int var5 = var3.method1342((byte) -126);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2888 = var3.field2888 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field5761.field983[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1342((byte) -128);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field5763[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field5768[var6] = var12;
                    } else {
                        field5768[var6] = (short) var4.method1364(74);
                    }
                    if ((var11 & 0x2) == 0) {
                        field5767[var6] = var12;
                    } else {
                        field5767[var6] = (short) var4.method1364(70);
                    }
                    if ((var11 & 0x4) == 0) {
                        field5771[var6] = var12;
                    } else {
                        field5771[var6] = (short) var4.method1364(67);
                    }
                    field5758[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field5768[var6] = (short) (((field5768[var6] & 0xFF) << 3) + (field5768[var6] >> 8 & 0x7));
                        field5767[var6] = (short) (((field5767[var6] & 0xFF) << 3) + (field5767[var6] >> 8 & 0x7));
                        field5771[var6] = (short) (((field5771[var6] & 0xFF) << 3) + (field5771[var6] >> 8 & 0x7));
                        field5768[var6] = (short) (field5768[var6] << 3);
                        field5767[var6] = (short) (field5767[var6] << 3);
                        field5771[var6] = (short) (field5771[var6] << 3);
                    }
                    field5770[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field5770[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field5765 = true;
                    } else if (var10 == 7) {
                        this.field5756 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2888) {
                throw new RuntimeException();
            }
            this.field5759 = var6;
            this.field5762 = new short[var6];
            this.field5760 = new short[var6];
            this.field5764 = new short[var6];
            this.field5766 = new short[var6];
            this.field5769 = new short[var6];
            this.field5757 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field5762[var13] = field5763[var13];
                this.field5760[var13] = field5768[var13];
                this.field5764[var13] = field5767[var13];
                this.field5766[var13] = field5771[var13];
                this.field5769[var13] = field5770[var13];
                this.field5757[var13] = field5758[var13];
            }
        } catch (Exception var14) {
            this.field5759 = 0;
            this.field5765 = false;
            this.field5756 = false;
        }
    }
}
