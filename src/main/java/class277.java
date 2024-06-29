import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class277 {

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public int field4225 = -1;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Z")
    public boolean field4222 = false;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Lei;")
    public class70 field4212 = null;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Z")
    public boolean field4211 = false;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "[S")
    public short[] field4215;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "[S")
    public short[] field4219;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "[S")
    public short[] field4217;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "[S")
    public short[] field4226;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "[S")
    public short[] field4220;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "[B")
    public byte[] field4221;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "[S")
    private static short[] field4214 = new short[500];

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "[S")
    private static short[] field4224 = new short[500];

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "[S")
    private static short[] field4216 = new short[500];

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "[B")
    private static byte[] field4218 = new byte[500];

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "[S")
    private static short[] field4213 = new short[500];

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "[S")
    private static short[] field4223 = new short[500];

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "()V", line = 4)
    public static void method1937() {
        field4216 = null;
        field4214 = null;
        field4223 = null;
        field4213 = null;
        field4224 = null;
        field4218 = null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "([BLei;)V", line = 57)
    public class277(byte[] arg0, class70 arg1) {
        this.field4212 = arg1;
        class263 var3 = new class263(arg0);
        class263 var4 = new class263(arg0);
        var3.field4025 = 2;
        int var5 = var3.method1787(false);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4025 = var3.field4025 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field4212.field930[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method1787(false);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field4216[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field4214[var6] = var12;
                } else {
                    field4214[var6] = (short) var4.method1789(-49152);
                }
                if ((var11 & 0x2) == 0) {
                    field4223[var6] = var12;
                } else {
                    field4223[var6] = (short) var4.method1789(-49152);
                }
                if ((var11 & 0x4) == 0) {
                    field4213[var6] = var12;
                } else {
                    field4213[var6] = (short) var4.method1789(-49152);
                }
                field4218[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field4214[var6] = (short) (((field4214[var6] & 0xFF) << 3) + (field4214[var6] >> 8 & 0x7));
                    field4223[var6] = (short) (((field4223[var6] & 0xFF) << 3) + (field4223[var6] >> 8 & 0x7));
                    field4213[var6] = (short) (((field4213[var6] & 0xFF) << 3) + (field4213[var6] >> 8 & 0x7));
                }
                field4224[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field4224[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field4222 = true;
                } else if (var10 == 7) {
                    this.field4211 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field4025) {
            throw new RuntimeException();
        }
        this.field4225 = var6;
        this.field4215 = new short[var6];
        this.field4219 = new short[var6];
        this.field4217 = new short[var6];
        this.field4226 = new short[var6];
        this.field4220 = new short[var6];
        this.field4221 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field4215[var13] = field4216[var13];
            this.field4219[var13] = field4214[var13];
            this.field4217[var13] = field4223[var13];
            this.field4226[var13] = field4213[var13];
            this.field4220[var13] = field4224[var13];
            this.field4221[var13] = field4218[var13];
        }
    }
}
