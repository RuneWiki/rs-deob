import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class448 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public int field6529 = 0;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Z")
    public boolean field6528 = false;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Z")
    public boolean field6536 = false;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Z")
    public boolean field6541 = false;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lds;")
    public class12 field6542 = null;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[S")
    public short[] field6537;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[S")
    public short[] field6530;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[S")
    public short[] field6539;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[S")
    public short[] field6535;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[S")
    public short[] field6526;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "[B")
    public byte[] field6538;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "[S")
    private static short[] field6527 = new short[500];

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "[S")
    private static short[] field6532 = new short[500];

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[S")
    private static short[] field6534 = new short[500];

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[S")
    private static short[] field6531 = new short[500];

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "[S")
    private static short[] field6533 = new short[500];

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "[B")
    private static byte[] field6540 = new byte[500];

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()V")
    public static void method2616() {
        field6527 = null;
        field6533 = null;
        field6532 = null;
        field6534 = null;
        field6531 = null;
        field6540 = null;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "([BLds;)V")
    public class448(byte[] arg0, class12 arg1) {
        this.field6542 = arg1;
        try {
            class156 var3 = new class156(arg0);
            class156 var4 = new class156(arg0);
            var3.field2018 = 2;
            int var5 = var3.method941((byte) 124);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2018 = var3.field2018 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field6542.field192[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method941((byte) 127);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field6527[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field6533[var6] = var12;
                    } else {
                        field6533[var6] = (short) var4.method979((byte) 126);
                    }
                    if ((var11 & 0x2) == 0) {
                        field6532[var6] = var12;
                    } else {
                        field6532[var6] = (short) var4.method979((byte) 126);
                    }
                    if ((var11 & 0x4) == 0) {
                        field6534[var6] = var12;
                    } else {
                        field6534[var6] = (short) var4.method979((byte) 126);
                    }
                    field6540[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field6533[var6] = (short) (((field6533[var6] & 0xFF) << 3) + (field6533[var6] >> 8 & 0x7));
                        field6532[var6] = (short) (((field6532[var6] & 0xFF) << 3) + (field6532[var6] >> 8 & 0x7));
                        field6534[var6] = (short) (((field6534[var6] & 0xFF) << 3) + (field6534[var6] >> 8 & 0x7));
                        field6533[var6] = (short) (field6533[var6] << 3);
                        field6532[var6] = (short) (field6532[var6] << 3);
                        field6534[var6] = (short) (field6534[var6] << 3);
                    }
                    field6531[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field6531[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field6541 = true;
                    } else if (var10 == 7) {
                        this.field6536 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field6528 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2018) {
                throw new RuntimeException();
            }
            this.field6529 = var6;
            this.field6537 = new short[var6];
            this.field6530 = new short[var6];
            this.field6539 = new short[var6];
            this.field6535 = new short[var6];
            this.field6526 = new short[var6];
            this.field6538 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field6537[var13] = field6527[var13];
                this.field6530[var13] = field6533[var13];
                this.field6539[var13] = field6532[var13];
                this.field6535[var13] = field6534[var13];
                this.field6526[var13] = field6531[var13];
                this.field6538[var13] = field6540[var13];
            }
        } catch (Exception var14) {
            this.field6529 = 0;
            this.field6541 = false;
            this.field6536 = false;
        }
    }
}
