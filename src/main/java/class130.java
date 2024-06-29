import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class130 {

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public int field1785 = 0;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lgr;")
    public class297 field1786 = null;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Z")
    public boolean field1790 = false;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Z")
    public boolean field1794 = false;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Z")
    public boolean field1798 = false;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[S")
    public short[] field1795;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[S")
    public short[] field1791;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[S")
    public short[] field1784;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[S")
    public short[] field1782;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "[S")
    public short[] field1796;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[B")
    public byte[] field1793;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "[S")
    private static short[] field1783 = new short[500];

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[S")
    private static short[] field1789 = new short[500];

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "[S")
    private static short[] field1787 = new short[500];

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[S")
    private static short[] field1788 = new short[500];

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "[B")
    private static byte[] field1797 = new byte[500];

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "[S")
    private static short[] field1792 = new short[500];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
    public static void method849() {
        field1789 = null;
        field1783 = null;
        field1788 = null;
        field1792 = null;
        field1787 = null;
        field1797 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BLgr;)V")
    public class130(byte[] arg0, class297 arg1) {
        this.field1786 = arg1;
        try {
            class365 var3 = new class365(arg0);
            class365 var4 = new class365(arg0);
            var3.field5069 = 2;
            int var5 = var3.method2099(255);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5069 = var3.field5069 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1786.field4099[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2099(255);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1789[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1783[var6] = var12;
                    } else {
                        field1783[var6] = (short) var4.method2100(61);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1788[var6] = var12;
                    } else {
                        field1788[var6] = (short) var4.method2100(79);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1792[var6] = var12;
                    } else {
                        field1792[var6] = (short) var4.method2100(26);
                    }
                    field1797[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field1783[var6] = (short) (((field1783[var6] & 0xFF) << 3) + (field1783[var6] >> 8 & 0x7));
                        field1788[var6] = (short) (((field1788[var6] & 0xFF) << 3) + (field1788[var6] >> 8 & 0x7));
                        field1792[var6] = (short) (((field1792[var6] & 0xFF) << 3) + (field1792[var6] >> 8 & 0x7));
                        field1783[var6] = (short) (field1783[var6] << 3);
                        field1788[var6] = (short) (field1788[var6] << 3);
                        field1792[var6] = (short) (field1792[var6] << 3);
                    }
                    field1787[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1787[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1790 = true;
                    } else if (var10 == 7) {
                        this.field1798 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field1794 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5069) {
                throw new RuntimeException();
            }
            this.field1785 = var6;
            this.field1795 = new short[var6];
            this.field1791 = new short[var6];
            this.field1784 = new short[var6];
            this.field1782 = new short[var6];
            this.field1796 = new short[var6];
            this.field1793 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1795[var13] = field1789[var13];
                this.field1791[var13] = field1783[var13];
                this.field1784[var13] = field1788[var13];
                this.field1782[var13] = field1792[var13];
                this.field1796[var13] = field1787[var13];
                this.field1793[var13] = field1797[var13];
            }
        } catch (Exception var14) {
            this.field1785 = 0;
            this.field1790 = false;
            this.field1798 = false;
        }
    }
}
