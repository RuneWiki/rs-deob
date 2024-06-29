import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class250 {

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Z")
    public boolean field3316 = false;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public int field3318 = 0;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Ljv;")
    public class79 field3317 = null;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Z")
    public boolean field3330 = false;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Z")
    public boolean field3331 = false;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "[S")
    public short[] field3323;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "[S")
    public short[] field3324;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[S")
    public short[] field3322;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "[S")
    public short[] field3326;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "[S")
    public short[] field3329;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "[B")
    public byte[] field3328;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[S")
    private static short[] field3321 = new short[500];

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[S")
    private static short[] field3319 = new short[500];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[S")
    private static short[] field3315 = new short[500];

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[B")
    private static byte[] field3320 = new byte[500];

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[S")
    private static short[] field3325 = new short[500];

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[S")
    private static short[] field3327 = new short[500];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
    public static void method1586() {
        field3325 = null;
        field3315 = null;
        field3319 = null;
        field3327 = null;
        field3321 = null;
        field3320 = null;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([BLjv;)V")
    public class250(byte[] arg0, class79 arg1) {
        this.field3317 = arg1;
        try {
            class675 var3 = new class675(arg0);
            class675 var4 = new class675(arg0);
            var3.method3750((byte) 35);
            var3.field9146 += 2;
            int var5 = var3.method3750((byte) 35);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field9146 = var3.field9146 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field3317.field1007[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method3750((byte) 35);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field3325[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field3315[var6] = var12;
                    } else {
                        field3315[var6] = (short) var4.method3730(-5929);
                    }
                    if ((var11 & 0x2) == 0) {
                        field3319[var6] = var12;
                    } else {
                        field3319[var6] = (short) var4.method3730(-5929);
                    }
                    if ((var11 & 0x4) == 0) {
                        field3327[var6] = var12;
                    } else {
                        field3327[var6] = (short) var4.method3730(-5929);
                    }
                    field3320[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field3315[var6] = (short) (field3315[var6] << 2 & 0x3FFF);
                        field3319[var6] = (short) (field3319[var6] << 2 & 0x3FFF);
                        field3327[var6] = (short) (field3327[var6] << 2 & 0x3FFF);
                    }
                    field3321[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field3321[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field3316 = true;
                    } else if (var10 == 7) {
                        this.field3330 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field3331 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field9146) {
                throw new RuntimeException();
            }
            this.field3318 = var6;
            this.field3323 = new short[var6];
            this.field3324 = new short[var6];
            this.field3322 = new short[var6];
            this.field3326 = new short[var6];
            this.field3329 = new short[var6];
            this.field3328 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field3323[var13] = field3325[var13];
                this.field3324[var13] = field3315[var13];
                this.field3322[var13] = field3319[var13];
                this.field3326[var13] = field3327[var13];
                this.field3329[var13] = field3321[var13];
                this.field3328[var13] = field3320[var13];
            }
        } catch (Exception var14) {
            this.field3318 = 0;
            this.field3316 = false;
            this.field3330 = false;
        }
    }
}
