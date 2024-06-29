import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class65 {

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lre;")
    public class42 field986 = null;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Z")
    public boolean field981 = false;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public int field988 = -1;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Z")
    public boolean field993 = false;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "[S")
    public short[] field985;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "[S")
    public short[] field992;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "[S")
    public short[] field990;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "[S")
    public short[] field989;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "[S")
    public short[] field991;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[B")
    public byte[] field979;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[S")
    private static short[] field984 = new short[500];

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[B")
    private static byte[] field982 = new byte[500];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "[S")
    private static short[] field980 = new short[500];

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "[S")
    private static short[] field987 = new short[500];

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "[S")
    private static short[] field983 = new short[500];

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "[S")
    private static short[] field994 = new short[500];

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "([BLre;)V", line = 60)
    public class65(byte[] arg0, class42 arg1) {
        this.field986 = arg1;
        class303 var3 = new class303(arg0);
        class303 var4 = new class303(arg0);
        var3.field4679 = 2;
        int var5 = var3.method2043((byte) -118);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4679 = var3.field4679 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field986.field595[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method2043((byte) -125);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field984[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field994[var6] = var12;
                } else {
                    field994[var6] = (short) var4.method2035(-49152);
                }
                if ((var11 & 0x2) == 0) {
                    field987[var6] = var12;
                } else {
                    field987[var6] = (short) var4.method2035(-49152);
                }
                if ((var11 & 0x4) == 0) {
                    field980[var6] = var12;
                } else {
                    field980[var6] = (short) var4.method2035(-49152);
                }
                field982[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field994[var6] = (short) (((field994[var6] & 0xFF) << 3) + (field994[var6] >> 8 & 0x7));
                    field987[var6] = (short) (((field987[var6] & 0xFF) << 3) + (field987[var6] >> 8 & 0x7));
                    field980[var6] = (short) (((field980[var6] & 0xFF) << 3) + (field980[var6] >> 8 & 0x7));
                }
                field983[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field983[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field993 = true;
                } else if (var10 == 7) {
                    this.field981 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field4679) {
            throw new RuntimeException();
        }
        this.field988 = var6;
        this.field985 = new short[var6];
        this.field992 = new short[var6];
        this.field990 = new short[var6];
        this.field989 = new short[var6];
        this.field991 = new short[var6];
        this.field979 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field985[var13] = field984[var13];
            this.field992[var13] = field994[var13];
            this.field990[var13] = field987[var13];
            this.field989[var13] = field980[var13];
            this.field991[var13] = field983[var13];
            this.field979[var13] = field982[var13];
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()V", line = 49)
    public static void method464() {
        field984 = null;
        field994 = null;
        field987 = null;
        field980 = null;
        field983 = null;
        field982 = null;
    }
}
