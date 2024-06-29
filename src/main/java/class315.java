import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class315 {

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Z")
    public boolean field5125 = false;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lcc;")
    public class276 field5121 = null;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public int field5128 = -1;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
    public boolean field5123 = false;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "[S")
    public short[] field5119;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[S")
    public short[] field5120;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "[S")
    public short[] field5134;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "[S")
    public short[] field5127;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[S")
    public short[] field5124;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "[B")
    public byte[] field5126;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[B")
    private static byte[] field5122 = new byte[500];

    @OriginalMember(owner = "client!n", name = "l", descriptor = "[S")
    private static short[] field5130 = new short[500];

    @OriginalMember(owner = "client!n", name = "k", descriptor = "[S")
    private static short[] field5129 = new short[500];

    @OriginalMember(owner = "client!n", name = "m", descriptor = "[S")
    private static short[] field5131 = new short[500];

    @OriginalMember(owner = "client!n", name = "n", descriptor = "[S")
    private static short[] field5132 = new short[500];

    @OriginalMember(owner = "client!n", name = "o", descriptor = "[S")
    private static short[] field5133 = new short[500];

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 5)
    public static void method2274() {
        field5129 = null;
        field5131 = null;
        field5130 = null;
        field5133 = null;
        field5132 = null;
        field5122 = null;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "([BLcc;)V", line = 60)
    public class315(byte[] arg0, class276 arg1) {
        this.field5121 = arg1;
        class146 var3 = new class146(arg0);
        class146 var4 = new class146(arg0);
        var3.field2435 = 2;
        int var5 = var3.method1005((byte) 122);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2435 = var3.field2435 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field5121.field4500[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method1005((byte) 122);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field5129[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field5131[var6] = var12;
                } else {
                    field5131[var6] = (short) var4.method1033(true);
                }
                if ((var11 & 0x2) == 0) {
                    field5130[var6] = var12;
                } else {
                    field5130[var6] = (short) var4.method1033(true);
                }
                if ((var11 & 0x4) == 0) {
                    field5133[var6] = var12;
                } else {
                    field5133[var6] = (short) var4.method1033(true);
                }
                field5122[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field5131[var6] = (short) (((field5131[var6] & 0xFF) << 3) + (field5131[var6] >> 8 & 0x7));
                    field5130[var6] = (short) (((field5130[var6] & 0xFF) << 3) + (field5130[var6] >> 8 & 0x7));
                    field5133[var6] = (short) (((field5133[var6] & 0xFF) << 3) + (field5133[var6] >> 8 & 0x7));
                }
                field5132[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field5132[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field5123 = true;
                } else if (var10 == 7) {
                    this.field5125 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2435) {
            throw new RuntimeException();
        }
        this.field5128 = var6;
        this.field5119 = new short[var6];
        this.field5120 = new short[var6];
        this.field5134 = new short[var6];
        this.field5127 = new short[var6];
        this.field5124 = new short[var6];
        this.field5126 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field5119[var13] = field5129[var13];
            this.field5120[var13] = field5131[var13];
            this.field5134[var13] = field5130[var13];
            this.field5127[var13] = field5133[var13];
            this.field5124[var13] = field5132[var13];
            this.field5126[var13] = field5122[var13];
        }
    }
}
