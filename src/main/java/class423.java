import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class423 {

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field5892 = 0;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Z")
    public boolean field5885 = false;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Z")
    public boolean field5890 = false;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lmf;")
    public class154 field5900 = null;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Z")
    public boolean field5901 = false;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "[S")
    public short[] field5897;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[S")
    public short[] field5887;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[S")
    public short[] field5891;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[S")
    public short[] field5886;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "[S")
    public short[] field5898;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[B")
    public byte[] field5895;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[B")
    private static byte[] field5888 = new byte[500];

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[S")
    private static short[] field5889 = new short[500];

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[S")
    private static short[] field5894 = new short[500];

    @OriginalMember(owner = "client!we", name = "i", descriptor = "[S")
    private static short[] field5893 = new short[500];

    @OriginalMember(owner = "client!we", name = "l", descriptor = "[S")
    private static short[] field5896 = new short[500];

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[S")
    private static short[] field5899 = new short[500];

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
    public static void method2444() {
        field5899 = null;
        field5894 = null;
        field5896 = null;
        field5893 = null;
        field5889 = null;
        field5888 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([BLmf;)V")
    public class423(byte[] arg0, class154 arg1) {
        this.field5900 = arg1;
        try {
            class138 var3 = new class138(arg0);
            class138 var4 = new class138(arg0);
            var3.method957((byte) -98);
            var3.field1745 += 2;
            int var5 = var3.method957((byte) -126);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field1745 = var3.field1745 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field5900.field1911[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method957((byte) -62);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field5899[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field5894[var6] = var12;
                    } else {
                        field5894[var6] = (short) var4.method931(-109);
                    }
                    if ((var11 & 0x2) == 0) {
                        field5896[var6] = var12;
                    } else {
                        field5896[var6] = (short) var4.method931(-115);
                    }
                    if ((var11 & 0x4) == 0) {
                        field5893[var6] = var12;
                    } else {
                        field5893[var6] = (short) var4.method931(-113);
                    }
                    field5888[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field5894[var6] = (short) (field5894[var6] << 2 & 0x3FFF);
                        field5896[var6] = (short) (field5896[var6] << 2 & 0x3FFF);
                        field5893[var6] = (short) (field5893[var6] << 2 & 0x3FFF);
                    }
                    field5889[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field5889[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field5885 = true;
                    } else if (var10 == 7) {
                        this.field5901 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field5890 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field1745) {
                throw new RuntimeException();
            }
            this.field5892 = var6;
            this.field5897 = new short[var6];
            this.field5887 = new short[var6];
            this.field5891 = new short[var6];
            this.field5886 = new short[var6];
            this.field5898 = new short[var6];
            this.field5895 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field5897[var13] = field5899[var13];
                this.field5887[var13] = field5894[var13];
                this.field5891[var13] = field5896[var13];
                this.field5886[var13] = field5893[var13];
                this.field5898[var13] = field5889[var13];
                this.field5895[var13] = field5888[var13];
            }
        } catch (Exception var14) {
            this.field5892 = 0;
            this.field5885 = false;
            this.field5901 = false;
        }
    }
}
