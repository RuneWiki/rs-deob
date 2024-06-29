import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class161 {

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public int field2090 = 0;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "Lii;")
    public class393 field2096 = null;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "Z")
    public boolean field2097 = false;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "Z")
    public boolean field2103 = false;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "Z")
    public boolean field2105 = false;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "[S")
    public short[] field2092;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "[S")
    public short[] field2098;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "[S")
    public short[] field2104;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "[S")
    public short[] field2100;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "[S")
    public short[] field2101;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "[B")
    public byte[] field2095;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "[S")
    private static short[] field2093 = new short[500];

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "[S")
    private static short[] field2091 = new short[500];

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "[B")
    private static byte[] field2094 = new byte[500];

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "[S")
    private static short[] field2099 = new short[500];

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "[S")
    private static short[] field2102 = new short[500];

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "[S")
    private static short[] field2106 = new short[500];

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "()V")
    public static void method1040() {
        field2102 = null;
        field2099 = null;
        field2091 = null;
        field2106 = null;
        field2093 = null;
        field2094 = null;
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "([BLii;)V")
    public class161(byte[] arg0, class393 arg1) {
        this.field2096 = arg1;
        try {
            class164 var3 = new class164(arg0);
            class164 var4 = new class164(arg0);
            var3.field2185 = 2;
            int var5 = var3.method1087(false);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2185 = var3.field2185 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field2096.field6011[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1087(false);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field2102[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field2099[var6] = var12;
                    } else {
                        field2099[var6] = (short) var4.method1083(116);
                    }
                    if ((var11 & 0x2) == 0) {
                        field2091[var6] = var12;
                    } else {
                        field2091[var6] = (short) var4.method1083(98);
                    }
                    if ((var11 & 0x4) == 0) {
                        field2106[var6] = var12;
                    } else {
                        field2106[var6] = (short) var4.method1083(121);
                    }
                    field2094[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field2099[var6] = (short) (((field2099[var6] & 0xFF) << 3) + (field2099[var6] >> 8 & 0x7));
                        field2091[var6] = (short) (((field2091[var6] & 0xFF) << 3) + (field2091[var6] >> 8 & 0x7));
                        field2106[var6] = (short) (((field2106[var6] & 0xFF) << 3) + (field2106[var6] >> 8 & 0x7));
                        field2099[var6] = (short) (field2099[var6] << 3);
                        field2091[var6] = (short) (field2091[var6] << 3);
                        field2106[var6] = (short) (field2106[var6] << 3);
                    }
                    field2093[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field2093[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field2105 = true;
                    } else if (var10 == 7) {
                        this.field2103 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field2097 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2185) {
                throw new RuntimeException();
            }
            this.field2090 = var6;
            this.field2092 = new short[var6];
            this.field2098 = new short[var6];
            this.field2104 = new short[var6];
            this.field2100 = new short[var6];
            this.field2101 = new short[var6];
            this.field2095 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field2092[var13] = field2102[var13];
                this.field2098[var13] = field2099[var13];
                this.field2104[var13] = field2091[var13];
                this.field2100[var13] = field2106[var13];
                this.field2101[var13] = field2093[var13];
                this.field2095[var13] = field2094[var13];
            }
        } catch (Exception var14) {
            this.field2090 = 0;
            this.field2105 = false;
            this.field2103 = false;
        }
    }
}
