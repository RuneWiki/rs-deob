import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class125 {

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public int field2211 = -1;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Z")
    public boolean field2220 = false;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lnd;")
    public class230 field2219 = null;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[S")
    public short[] field2214;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[S")
    public short[] field2212;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[S")
    public short[] field2218;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[S")
    public short[] field2209;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "[S")
    public short[] field2221;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "[S")
    private static short[] field2210 = new short[500];

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[S")
    private static short[] field2215 = new short[500];

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[S")
    private static short[] field2213 = new short[500];

    @OriginalMember(owner = "client!le", name = "i", descriptor = "[S")
    private static short[] field2217 = new short[500];

    @OriginalMember(owner = "client!le", name = "h", descriptor = "[S")
    private static short[] field2216 = new short[500];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V", line = 23)
    public static void method865() {
        field2215 = null;
        field2210 = null;
        field2217 = null;
        field2216 = null;
        field2213 = null;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "([BLnd;)V", line = 53)
    public class125(byte[] arg0, class230 arg1) {
        this.field2219 = arg1;
        class41 var3 = new class41(arg0);
        class41 var4 = new class41(arg0);
        var3.field738 = 2;
        int var5 = var3.method357(false);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field738 = var3.field738 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field2219.field3938[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method357(false);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field2215[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2210[var6] = var12;
                } else {
                    field2210[var6] = (short) var4.method364(-49152);
                }
                if ((var11 & 0x2) == 0) {
                    field2217[var6] = var12;
                } else {
                    field2217[var6] = (short) var4.method364(-49152);
                }
                if ((var11 & 0x4) == 0) {
                    field2216[var6] = var12;
                } else {
                    field2216[var6] = (short) var4.method364(-49152);
                }
                if (var10 == 2) {
                    field2210[var6] = (short) (((field2210[var6] & 0xFF) << 3) + (field2210[var6] >> 8 & 0x7));
                    field2217[var6] = (short) (((field2217[var6] & 0xFF) << 3) + (field2217[var6] >> 8 & 0x7));
                    field2216[var6] = (short) (((field2216[var6] & 0xFF) << 3) + (field2216[var6] >> 8 & 0x7));
                }
                field2213[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field2213[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field2220 = true;
                } else if (var10 == 7) {
                }
                var6++;
            }
        }
        if (arg0.length != var4.field738) {
            throw new RuntimeException();
        }
        this.field2211 = var6;
        this.field2214 = new short[var6];
        this.field2212 = new short[var6];
        this.field2218 = new short[var6];
        this.field2209 = new short[var6];
        this.field2221 = new short[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field2214[var13] = field2215[var13];
            this.field2212[var13] = field2210[var13];
            this.field2218[var13] = field2217[var13];
            this.field2209[var13] = field2216[var13];
            this.field2221[var13] = field2213[var13];
        }
    }
}
