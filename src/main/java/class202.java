import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class202 {

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Z")
    public boolean field3209 = false;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Z")
    public boolean field3208 = false;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public int field3217 = -1;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Lke;")
    public class112 field3219 = null;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "[S")
    public short[] field3210;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "[S")
    public short[] field3216;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "[S")
    public short[] field3218;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "[S")
    public short[] field3212;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "[S")
    public short[] field3213;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "[B")
    public byte[] field3215;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "[S")
    private static short[] field3207 = new short[500];

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "[B")
    private static byte[] field3206 = new byte[500];

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "[S")
    private static short[] field3211 = new short[500];

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[S")
    private static short[] field3205 = new short[500];

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "[S")
    private static short[] field3214 = new short[500];

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[S")
    private static short[] field3204 = new short[500];

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()V", line = 11)
    public static void method1461() {
        field3207 = null;
        field3211 = null;
        field3205 = null;
        field3214 = null;
        field3204 = null;
        field3206 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "([BLke;)V", line = 57)
    public class202(byte[] arg0, class112 arg1) {
        this.field3219 = arg1;
        class35 var3 = new class35(arg0);
        class35 var4 = new class35(arg0);
        var3.field455 = 2;
        int var5 = var3.method273(65280);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field455 = var3.field455 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field3219.field1768[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method273(65280);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field3207[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3211[var6] = var12;
                } else {
                    field3211[var6] = (short) var4.method292(255);
                }
                if ((var11 & 0x2) == 0) {
                    field3205[var6] = var12;
                } else {
                    field3205[var6] = (short) var4.method292(255);
                }
                if ((var11 & 0x4) == 0) {
                    field3214[var6] = var12;
                } else {
                    field3214[var6] = (short) var4.method292(255);
                }
                field3206[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field3211[var6] = (short) (((field3211[var6] & 0xFF) << 3) + (field3211[var6] >> 8 & 0x7));
                    field3205[var6] = (short) (((field3205[var6] & 0xFF) << 3) + (field3205[var6] >> 8 & 0x7));
                    field3214[var6] = (short) (((field3214[var6] & 0xFF) << 3) + (field3214[var6] >> 8 & 0x7));
                }
                field3204[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field3204[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field3209 = true;
                } else if (var10 == 7) {
                    this.field3208 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field455) {
            throw new RuntimeException();
        }
        this.field3217 = var6;
        this.field3210 = new short[var6];
        this.field3216 = new short[var6];
        this.field3218 = new short[var6];
        this.field3212 = new short[var6];
        this.field3213 = new short[var6];
        this.field3215 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field3210[var13] = field3207[var13];
            this.field3216[var13] = field3211[var13];
            this.field3218[var13] = field3205[var13];
            this.field3212[var13] = field3214[var13];
            this.field3213[var13] = field3204[var13];
            this.field3215[var13] = field3206[var13];
        }
    }
}
