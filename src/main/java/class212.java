import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class212 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Ljd;")
    public class416 field3219 = null;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Z")
    public boolean field3218 = false;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "Z")
    public boolean field3228 = false;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public int field3233 = 0;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "Z")
    public boolean field3234 = false;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "[S")
    public short[] field3232;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "[S")
    public short[] field3230;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "[S")
    public short[] field3231;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "[S")
    public short[] field3225;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "[S")
    public short[] field3224;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "[B")
    public byte[] field3226;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "[S")
    private static short[] field3220 = new short[500];

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "[S")
    private static short[] field3222 = new short[500];

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "[B")
    private static byte[] field3223 = new byte[500];

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "[S")
    private static short[] field3221 = new short[500];

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "[S")
    private static short[] field3229 = new short[500];

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "[S")
    private static short[] field3227 = new short[500];

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "()V", line = 12)
    public static void method1464() {
        field3222 = null;
        field3229 = null;
        field3220 = null;
        field3221 = null;
        field3227 = null;
        field3223 = null;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "([BLjd;)V", line = 65)
    public class212(byte[] arg0, class416 arg1) {
        this.field3219 = arg1;
        try {
            class194 var3 = new class194(arg0);
            class194 var4 = new class194(arg0);
            var3.field2982 = 2;
            int var5 = var3.method1337((byte) 118);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2982 = var3.field2982 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field3219.field6118[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1337((byte) 104);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field3222[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field3229[var6] = var12;
                    } else {
                        field3229[var6] = (short) var4.method1374(false);
                    }
                    if ((var11 & 0x2) == 0) {
                        field3220[var6] = var12;
                    } else {
                        field3220[var6] = (short) var4.method1374(false);
                    }
                    if ((var11 & 0x4) == 0) {
                        field3221[var6] = var12;
                    } else {
                        field3221[var6] = (short) var4.method1374(false);
                    }
                    field3223[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field3229[var6] = (short) (((field3229[var6] & 0xFF) << 3) + (field3229[var6] >> 8 & 0x7));
                        field3220[var6] = (short) (((field3220[var6] & 0xFF) << 3) + (field3220[var6] >> 8 & 0x7));
                        field3221[var6] = (short) (((field3221[var6] & 0xFF) << 3) + (field3221[var6] >> 8 & 0x7));
                        field3229[var6] = (short) (field3229[var6] << 3);
                        field3220[var6] = (short) (field3220[var6] << 3);
                        field3221[var6] = (short) (field3221[var6] << 3);
                    }
                    field3227[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field3227[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field3228 = true;
                    } else if (var10 == 7) {
                        this.field3234 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field3218 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2982) {
                throw new RuntimeException();
            }
            this.field3233 = var6;
            this.field3232 = new short[var6];
            this.field3230 = new short[var6];
            this.field3231 = new short[var6];
            this.field3225 = new short[var6];
            this.field3224 = new short[var6];
            this.field3226 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field3232[var13] = field3222[var13];
                this.field3230[var13] = field3229[var13];
                this.field3231[var13] = field3220[var13];
                this.field3225[var13] = field3221[var13];
                this.field3224[var13] = field3227[var13];
                this.field3226[var13] = field3223[var13];
            }
        } catch (Exception var14) {
            this.field3233 = 0;
            this.field3228 = false;
            this.field3234 = false;
        }
    }
}
