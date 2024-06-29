import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class15 {

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Luv;")
    public class21 field236 = null;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Z")
    public boolean field234 = false;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Z")
    public boolean field248 = false;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Z")
    public boolean field235 = false;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public int field249 = 0;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "[S")
    public short[] field244;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[S")
    public short[] field238;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "[S")
    public short[] field242;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[S")
    public short[] field239;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[S")
    public short[] field245;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "[B")
    public byte[] field243;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[S")
    private static short[] field233 = new short[500];

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[S")
    private static short[] field237 = new short[500];

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[S")
    private static short[] field241 = new short[500];

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "[S")
    private static short[] field240 = new short[500];

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "[S")
    private static short[] field247 = new short[500];

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "[B")
    private static byte[] field246 = new byte[500];

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V", line = 18)
    public static void method192() {
        field241 = null;
        field240 = null;
        field247 = null;
        field233 = null;
        field237 = null;
        field246 = null;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([BLuv;)V", line = 65)
    public class15(byte[] arg0, class21 arg1) {
        this.field236 = arg1;
        try {
            class465 var3 = new class465(arg0);
            class465 var4 = new class465(arg0);
            var3.method2705(-65);
            var3.field6710 += 2;
            int var5 = var3.method2705(-83);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field6710 = var3.field6710 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field236.field280[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2705(-30);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field241[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field240[var6] = var12;
                    } else {
                        field240[var6] = (short) var4.method2718((byte) 113);
                    }
                    if ((var11 & 0x2) == 0) {
                        field247[var6] = var12;
                    } else {
                        field247[var6] = (short) var4.method2718((byte) 120);
                    }
                    if ((var11 & 0x4) == 0) {
                        field233[var6] = var12;
                    } else {
                        field233[var6] = (short) var4.method2718((byte) 119);
                    }
                    field246[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field240[var6] = (short) (field240[var6] << 2 & 0x3FFF);
                        field247[var6] = (short) (field247[var6] << 2 & 0x3FFF);
                        field233[var6] = (short) (field233[var6] << 2 & 0x3FFF);
                    }
                    field237[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field237[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field235 = true;
                    } else if (var10 == 7) {
                        this.field234 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field248 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field6710) {
                throw new RuntimeException();
            }
            this.field249 = var6;
            this.field244 = new short[var6];
            this.field238 = new short[var6];
            this.field242 = new short[var6];
            this.field239 = new short[var6];
            this.field245 = new short[var6];
            this.field243 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field244[var13] = field241[var13];
                this.field238[var13] = field240[var13];
                this.field242[var13] = field247[var13];
                this.field239[var13] = field233[var13];
                this.field245[var13] = field237[var13];
                this.field243[var13] = field246[var13];
            }
        } catch (Exception var14) {
            this.field249 = 0;
            this.field235 = false;
            this.field234 = false;
        }
    }
}
