import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class18 {

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lpfa;")
    public class311 field220 = null;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "Z")
    public boolean field219 = false;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Z")
    public boolean field212 = false;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public int field224 = 0;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "Z")
    public boolean field218 = false;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "[S")
    public short[] field213;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "[S")
    public short[] field211;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "[S")
    public short[] field209;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "[S")
    public short[] field223;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "[S")
    public short[] field210;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "[B")
    public byte[] field221;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "[S")
    private static short[] field208 = new short[500];

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "[S")
    private static short[] field214 = new short[500];

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "[S")
    private static short[] field215 = new short[500];

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "[S")
    private static short[] field216 = new short[500];

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[B")
    private static byte[] field222 = new byte[500];

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "[S")
    private static short[] field217 = new short[500];

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "([BLpfa;)V", line = 65)
    public class18(byte[] arg0, class311 arg1) {
        this.field220 = arg1;
        try {
            class163 var3 = new class163(arg0);
            class163 var4 = new class163(arg0);
            var3.method1455((byte) 62);
            var3.field2201 += 2;
            int var5 = var3.method1455((byte) 62);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2201 = var3.field2201 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field220.field4931[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1455((byte) 62);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field217[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field214[var6] = var12;
                    } else {
                        field214[var6] = (short) var4.method1407((byte) -42);
                    }
                    if ((var11 & 0x2) == 0) {
                        field215[var6] = var12;
                    } else {
                        field215[var6] = (short) var4.method1407((byte) -42);
                    }
                    if ((var11 & 0x4) == 0) {
                        field208[var6] = var12;
                    } else {
                        field208[var6] = (short) var4.method1407((byte) -42);
                    }
                    field222[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field214[var6] = (short) (field214[var6] << 2 & 0x3FFF);
                        field215[var6] = (short) (field215[var6] << 2 & 0x3FFF);
                        field208[var6] = (short) (field208[var6] << 2 & 0x3FFF);
                    }
                    field216[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field216[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field212 = true;
                    } else if (var10 == 7) {
                        this.field219 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field218 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2201) {
                throw new RuntimeException();
            }
            this.field224 = var6;
            this.field213 = new short[var6];
            this.field211 = new short[var6];
            this.field209 = new short[var6];
            this.field223 = new short[var6];
            this.field210 = new short[var6];
            this.field221 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field213[var13] = field217[var13];
                this.field211[var13] = field214[var13];
                this.field209[var13] = field215[var13];
                this.field223[var13] = field208[var13];
                this.field210[var13] = field216[var13];
                this.field221[var13] = field222[var13];
            }
        } catch (Exception var14) {
            this.field224 = 0;
            this.field212 = false;
            this.field219 = false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "()V", line = 43)
    public static void method127() {
        field217 = null;
        field214 = null;
        field215 = null;
        field208 = null;
        field216 = null;
        field222 = null;
    }
}
