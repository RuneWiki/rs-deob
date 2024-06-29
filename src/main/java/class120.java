import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class120 {

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "Lwi;")
    public class215 field1678 = null;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "Z")
    public boolean field1684 = false;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public int field1680 = 0;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "Z")
    public boolean field1686 = false;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "[S")
    public short[] field1683;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "[S")
    public short[] field1676;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "[S")
    public short[] field1677;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "[S")
    public short[] field1687;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "[S")
    public short[] field1675;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "[B")
    public byte[] field1674;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "[B")
    private static byte[] field1681 = new byte[500];

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "[S")
    private static short[] field1682 = new short[500];

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "[S")
    private static short[] field1679 = new short[500];

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "[S")
    private static short[] field1685 = new short[500];

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "[S")
    private static short[] field1689 = new short[500];

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "[S")
    private static short[] field1688 = new short[500];

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "()V", line = 16)
    public static void method951() {
        field1685 = null;
        field1689 = null;
        field1682 = null;
        field1688 = null;
        field1679 = null;
        field1681 = null;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([BLwi;)V", line = 61)
    public class120(byte[] arg0, class215 arg1) {
        this.field1678 = arg1;
        try {
            class289 var3 = new class289(arg0);
            class289 var4 = new class289(arg0);
            var3.field3938 = 2;
            int var5 = var3.method1861((byte) -72);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3938 = var3.field3938 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1678.field2981[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1861((byte) -72);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1685[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1689[var6] = var12;
                    } else {
                        field1689[var6] = (short) var4.method1841(true);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1682[var6] = var12;
                    } else {
                        field1682[var6] = (short) var4.method1841(true);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1688[var6] = var12;
                    } else {
                        field1688[var6] = (short) var4.method1841(true);
                    }
                    field1681[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field1689[var6] = (short) (((field1689[var6] & 0xFF) << 3) + (field1689[var6] >> 8 & 0x7));
                        field1682[var6] = (short) (((field1682[var6] & 0xFF) << 3) + (field1682[var6] >> 8 & 0x7));
                        field1688[var6] = (short) (((field1688[var6] & 0xFF) << 3) + (field1688[var6] >> 8 & 0x7));
                        field1689[var6] = (short) (field1689[var6] << 3);
                        field1682[var6] = (short) (field1682[var6] << 3);
                        field1688[var6] = (short) (field1688[var6] << 3);
                    }
                    field1679[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1679[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1686 = true;
                    } else if (var10 == 7) {
                        this.field1684 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3938) {
                throw new RuntimeException();
            }
            this.field1680 = var6;
            this.field1683 = new short[var6];
            this.field1676 = new short[var6];
            this.field1677 = new short[var6];
            this.field1687 = new short[var6];
            this.field1675 = new short[var6];
            this.field1674 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1683[var13] = field1685[var13];
                this.field1676[var13] = field1689[var13];
                this.field1677[var13] = field1682[var13];
                this.field1687[var13] = field1688[var13];
                this.field1675[var13] = field1679[var13];
                this.field1674[var13] = field1681[var13];
            }
        } catch (Exception var14) {
            this.field1680 = 0;
            this.field1686 = false;
            this.field1684 = false;
        }
    }
}
