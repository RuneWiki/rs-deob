import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class6 {

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Lsg;")
    public class122 field87 = null;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Z")
    public boolean field86 = false;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public int field97 = -1;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Z")
    public boolean field98 = false;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "[S")
    public short[] field91;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "[S")
    public short[] field92;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "[S")
    public short[] field93;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[S")
    public short[] field84;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[S")
    public short[] field90;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "[B")
    public byte[] field88;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "[S")
    private static short[] field83 = new short[500];

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "[S")
    private static short[] field89 = new short[500];

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "[S")
    private static short[] field85 = new short[500];

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "[S")
    private static short[] field94 = new short[500];

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "[B")
    private static byte[] field96 = new byte[500];

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "[S")
    private static short[] field95 = new short[500];

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()V", line = 34)
    public static void method32() {
        field89 = null;
        field94 = null;
        field95 = null;
        field83 = null;
        field85 = null;
        field96 = null;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "([BLsg;)V", line = 60)
    public class6(byte[] arg0, class122 arg1) {
        this.field87 = arg1;
        class44 var3 = new class44(arg0);
        class44 var4 = new class44(arg0);
        var3.field586 = 2;
        int var5 = var3.method286((byte) -68);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field586 = var3.field586 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field87.field1914[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method286((byte) -83);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field89[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field94[var6] = var12;
                } else {
                    field94[var6] = (short) var4.method245(29828);
                }
                if ((var11 & 0x2) == 0) {
                    field95[var6] = var12;
                } else {
                    field95[var6] = (short) var4.method245(29828);
                }
                if ((var11 & 0x4) == 0) {
                    field83[var6] = var12;
                } else {
                    field83[var6] = (short) var4.method245(29828);
                }
                field96[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field94[var6] = (short) (((field94[var6] & 0xFF) << 3) + (field94[var6] >> 8 & 0x7));
                    field95[var6] = (short) (((field95[var6] & 0xFF) << 3) + (field95[var6] >> 8 & 0x7));
                    field83[var6] = (short) (((field83[var6] & 0xFF) << 3) + (field83[var6] >> 8 & 0x7));
                }
                field85[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field85[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field98 = true;
                } else if (var10 == 7) {
                    this.field86 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field586) {
            throw new RuntimeException();
        }
        this.field97 = var6;
        this.field91 = new short[var6];
        this.field92 = new short[var6];
        this.field93 = new short[var6];
        this.field84 = new short[var6];
        this.field90 = new short[var6];
        this.field88 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field91[var13] = field89[var13];
            this.field92[var13] = field94[var13];
            this.field93[var13] = field95[var13];
            this.field84[var13] = field83[var13];
            this.field90[var13] = field85[var13];
            this.field88[var13] = field96[var13];
        }
    }
}
