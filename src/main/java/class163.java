import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class163 {

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "Z")
    public boolean field2021 = false;

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "I")
    public int field2035 = 0;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "Z")
    public boolean field2027 = false;

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "Z")
    public boolean field2029 = false;

    @OriginalMember(owner = "client!eea", name = "q", descriptor = "Lsfa;")
    public class174 field2037 = null;

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "[S")
    public short[] field2031;

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "[S")
    public short[] field2032;

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "[S")
    public short[] field2023;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "[S")
    public short[] field2026;

    @OriginalMember(owner = "client!eea", name = "p", descriptor = "[S")
    public short[] field2036;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "[B")
    public byte[] field2022;

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "[S")
    private static short[] field2024 = new short[500];

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "[S")
    private static short[] field2025 = new short[500];

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "[S")
    private static short[] field2030 = new short[500];

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "[S")
    private static short[] field2033 = new short[500];

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "[B")
    private static byte[] field2028 = new byte[500];

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "[S")
    private static short[] field2034 = new short[500];

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "()V")
    public static void method1149() {
        field2033 = null;
        field2034 = null;
        field2030 = null;
        field2025 = null;
        field2024 = null;
        field2028 = null;
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "([BLsfa;)V")
    public class163(byte[] arg0, class174 arg1) {
        this.field2037 = arg1;
        try {
            class418 var3 = new class418(arg0);
            class418 var4 = new class418(arg0);
            var3.method2396(-122);
            var3.field5367 += 2;
            int var5 = var3.method2396(-117);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5367 = var3.field5367 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field2037.field2179[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2396(118);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field2033[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field2034[var6] = var12;
                    } else {
                        field2034[var6] = (short) var4.method2369(255);
                    }
                    if ((var11 & 0x2) == 0) {
                        field2030[var6] = var12;
                    } else {
                        field2030[var6] = (short) var4.method2369(255);
                    }
                    if ((var11 & 0x4) == 0) {
                        field2025[var6] = var12;
                    } else {
                        field2025[var6] = (short) var4.method2369(255);
                    }
                    field2028[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field2034[var6] = (short) (field2034[var6] << 2 & 0x3FFF);
                        field2030[var6] = (short) (field2030[var6] << 2 & 0x3FFF);
                        field2025[var6] = (short) (field2025[var6] << 2 & 0x3FFF);
                    }
                    field2024[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field2024[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field2029 = true;
                    } else if (var10 == 7) {
                        this.field2021 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field2027 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5367) {
                throw new RuntimeException();
            }
            this.field2035 = var6;
            this.field2031 = new short[var6];
            this.field2032 = new short[var6];
            this.field2023 = new short[var6];
            this.field2026 = new short[var6];
            this.field2036 = new short[var6];
            this.field2022 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field2031[var13] = field2033[var13];
                this.field2032[var13] = field2034[var13];
                this.field2023[var13] = field2030[var13];
                this.field2026[var13] = field2025[var13];
                this.field2036[var13] = field2024[var13];
                this.field2022[var13] = field2028[var13];
            }
        } catch (Exception var14) {
            this.field2035 = 0;
            this.field2029 = false;
            this.field2021 = false;
        }
    }
}
