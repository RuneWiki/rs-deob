import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class134 {

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "Z")
    public boolean field2019 = false;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "Z")
    public boolean field2029 = false;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    public int field2032 = 0;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "Z")
    public boolean field2034 = false;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "Lhe;")
    public class390 field2035 = null;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "[S")
    public short[] field2033;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "[S")
    public short[] field2028;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "[S")
    public short[] field2024;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "[S")
    public short[] field2025;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "[S")
    public short[] field2023;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "[B")
    public byte[] field2021;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "[S")
    private static short[] field2022 = new short[500];

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "[S")
    private static short[] field2030 = new short[500];

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "[S")
    private static short[] field2020 = new short[500];

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "[S")
    private static short[] field2031 = new short[500];

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "[S")
    private static short[] field2027 = new short[500];

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "[B")
    private static byte[] field2026 = new byte[500];

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "()V")
    public static void method990() {
        field2027 = null;
        field2030 = null;
        field2020 = null;
        field2031 = null;
        field2022 = null;
        field2026 = null;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "([BLhe;)V")
    public class134(byte[] arg0, class390 arg1) {
        this.field2035 = arg1;
        try {
            class494 var3 = new class494(arg0);
            class494 var4 = new class494(arg0);
            var3.method2964((byte) 43);
            var3.field7042 += 2;
            int var5 = var3.method2964((byte) 108);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field7042 = var3.field7042 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field2035.field5380[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2964((byte) 82);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field2027[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field2030[var6] = var12;
                    } else {
                        field2030[var6] = (short) var4.method2979((byte) 120);
                    }
                    if ((var11 & 0x2) == 0) {
                        field2020[var6] = var12;
                    } else {
                        field2020[var6] = (short) var4.method2979((byte) -51);
                    }
                    if ((var11 & 0x4) == 0) {
                        field2031[var6] = var12;
                    } else {
                        field2031[var6] = (short) var4.method2979((byte) -61);
                    }
                    field2026[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field2030[var6] = (short) (field2030[var6] << 2 & 0x3FFF);
                        field2020[var6] = (short) (field2020[var6] << 2 & 0x3FFF);
                        field2031[var6] = (short) (field2031[var6] << 2 & 0x3FFF);
                    }
                    field2022[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field2022[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field2019 = true;
                    } else if (var10 == 7) {
                        this.field2029 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field2034 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field7042) {
                throw new RuntimeException();
            }
            this.field2032 = var6;
            this.field2033 = new short[var6];
            this.field2028 = new short[var6];
            this.field2024 = new short[var6];
            this.field2025 = new short[var6];
            this.field2023 = new short[var6];
            this.field2021 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field2033[var13] = field2027[var13];
                this.field2028[var13] = field2030[var13];
                this.field2024[var13] = field2020[var13];
                this.field2025[var13] = field2031[var13];
                this.field2023[var13] = field2022[var13];
                this.field2021[var13] = field2026[var13];
            }
        } catch (Exception var14) {
            this.field2032 = 0;
            this.field2019 = false;
            this.field2029 = false;
        }
    }
}
