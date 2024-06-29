import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class649 {

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public int field8855 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Z")
    public boolean field8844 = false;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Z")
    public boolean field8853 = false;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Z")
    public boolean field8857 = false;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Lov;")
    public class201 field8859 = null;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[S")
    public short[] field8850;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[S")
    public short[] field8846;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[S")
    public short[] field8845;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "[S")
    public short[] field8849;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "[S")
    public short[] field8854;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "[B")
    public byte[] field8851;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[S")
    private static short[] field8847 = new short[500];

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[S")
    private static short[] field8848 = new short[500];

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[S")
    private static short[] field8852 = new short[500];

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[S")
    private static short[] field8858 = new short[500];

    @OriginalMember(owner = "client!of", name = "m", descriptor = "[B")
    private static byte[] field8856 = new byte[500];

    @OriginalMember(owner = "client!of", name = "q", descriptor = "[S")
    private static short[] field8860 = new short[500];

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "([BLov;)V", line = 54)
    public class649(byte[] arg0, class201 arg1) {
        this.field8859 = arg1;
        try {
            class403 var3 = new class403(arg0);
            class403 var4 = new class403(arg0);
            var3.method2396((byte) 43);
            var3.field5262 += 2;
            int var5 = var3.method2396((byte) -99);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5262 = var3.field5262 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field8859.field2413[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2396((byte) -91);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field8852[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field8858[var6] = var12;
                    } else {
                        field8858[var6] = (short) var4.method2373(0);
                    }
                    if ((var11 & 0x2) == 0) {
                        field8860[var6] = var12;
                    } else {
                        field8860[var6] = (short) var4.method2373(0);
                    }
                    if ((var11 & 0x4) == 0) {
                        field8848[var6] = var12;
                    } else {
                        field8848[var6] = (short) var4.method2373(0);
                    }
                    field8856[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field8858[var6] = (short) (field8858[var6] << 2 & 0x3FFF);
                        field8860[var6] = (short) (field8860[var6] << 2 & 0x3FFF);
                        field8848[var6] = (short) (field8848[var6] << 2 & 0x3FFF);
                    }
                    field8847[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field8847[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field8853 = true;
                    } else if (var10 == 7) {
                        this.field8844 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field8857 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5262) {
                throw new RuntimeException();
            }
            this.field8855 = var6;
            this.field8850 = new short[var6];
            this.field8846 = new short[var6];
            this.field8845 = new short[var6];
            this.field8849 = new short[var6];
            this.field8854 = new short[var6];
            this.field8851 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field8850[var13] = field8852[var13];
                this.field8846[var13] = field8858[var13];
                this.field8845[var13] = field8860[var13];
                this.field8849[var13] = field8848[var13];
                this.field8854[var13] = field8847[var13];
                this.field8851[var13] = field8856[var13];
            }
        } catch (Exception var14) {
            this.field8855 = 0;
            this.field8853 = false;
            this.field8844 = false;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V", line = 184)
    public static void method3658() {
        field8852 = null;
        field8858 = null;
        field8860 = null;
        field8848 = null;
        field8847 = null;
        field8856 = null;
    }
}
