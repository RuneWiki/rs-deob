import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class365 {

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Z")
    public boolean field5222 = false;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Z")
    public boolean field5217 = false;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Lna;")
    public class43 field5227 = null;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field5221 = 0;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Z")
    public boolean field5230 = false;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[S")
    public short[] field5215;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "[S")
    public short[] field5224;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "[S")
    public short[] field5228;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "[S")
    public short[] field5223;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "[S")
    public short[] field5229;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[B")
    public byte[] field5218;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[B")
    private static byte[] field5214 = new byte[500];

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[S")
    private static short[] field5220 = new short[500];

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[S")
    private static short[] field5216 = new short[500];

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[S")
    private static short[] field5219 = new short[500];

    @OriginalMember(owner = "client!df", name = "l", descriptor = "[S")
    private static short[] field5225 = new short[500];

    @OriginalMember(owner = "client!df", name = "m", descriptor = "[S")
    private static short[] field5226 = new short[500];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V", line = 13)
    public static void method2217() {
        field5216 = null;
        field5219 = null;
        field5225 = null;
        field5220 = null;
        field5226 = null;
        field5214 = null;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([BLna;)V", line = 65)
    public class365(byte[] arg0, class43 arg1) {
        this.field5227 = arg1;
        try {
            class695 var3 = new class695(arg0);
            class695 var4 = new class695(arg0);
            var3.method3826(false);
            var3.field9761 += 2;
            int var5 = var3.method3826(false);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field9761 = var3.field9761 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field5227.field695[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method3826(false);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field5216[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field5219[var6] = var12;
                    } else {
                        field5219[var6] = (short) var4.method3828(255);
                    }
                    if ((var11 & 0x2) == 0) {
                        field5225[var6] = var12;
                    } else {
                        field5225[var6] = (short) var4.method3828(255);
                    }
                    if ((var11 & 0x4) == 0) {
                        field5220[var6] = var12;
                    } else {
                        field5220[var6] = (short) var4.method3828(255);
                    }
                    field5214[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field5219[var6] = (short) (field5219[var6] << 2 & 0x3FFF);
                        field5225[var6] = (short) (field5225[var6] << 2 & 0x3FFF);
                        field5220[var6] = (short) (field5220[var6] << 2 & 0x3FFF);
                    }
                    field5226[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field5226[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field5230 = true;
                    } else if (var10 == 7) {
                        this.field5217 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field5222 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field9761) {
                throw new RuntimeException();
            }
            this.field5221 = var6;
            this.field5215 = new short[var6];
            this.field5224 = new short[var6];
            this.field5228 = new short[var6];
            this.field5223 = new short[var6];
            this.field5229 = new short[var6];
            this.field5218 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field5215[var13] = field5216[var13];
                this.field5224[var13] = field5219[var13];
                this.field5228[var13] = field5225[var13];
                this.field5223[var13] = field5220[var13];
                this.field5229[var13] = field5226[var13];
                this.field5218[var13] = field5214[var13];
            }
        } catch (Exception var14) {
            this.field5221 = 0;
            this.field5230 = false;
            this.field5217 = false;
        }
    }
}
