import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class574 {

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lsf;")
    public class520 field8134 = null;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Z")
    public boolean field8136 = false;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Z")
    public boolean field8142 = false;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public int field8146 = 0;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Z")
    public boolean field8145 = false;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[S")
    public short[] field8131;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "[S")
    public short[] field8139;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[S")
    public short[] field8140;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[S")
    public short[] field8132;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[S")
    public short[] field8137;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[B")
    public byte[] field8130;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "[S")
    private static short[] field8138 = new short[500];

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "[B")
    private static byte[] field8143 = new byte[500];

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[S")
    private static short[] field8133 = new short[500];

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "[S")
    private static short[] field8141 = new short[500];

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[S")
    private static short[] field8135 = new short[500];

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "[S")
    private static short[] field8144 = new short[500];

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([BLsf;)V", line = 62)
    public class574(byte[] arg0, class520 arg1) {
        this.field8134 = arg1;
        try {
            class35 var3 = new class35(arg0);
            class35 var4 = new class35(arg0);
            var3.method273(255);
            var3.field469 += 2;
            int var5 = var3.method273(255);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field469 = var3.field469 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field8134.field7379[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method273(255);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field8133[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field8135[var6] = var12;
                    } else {
                        field8135[var6] = (short) var4.method270(true);
                    }
                    if ((var11 & 0x2) == 0) {
                        field8144[var6] = var12;
                    } else {
                        field8144[var6] = (short) var4.method270(true);
                    }
                    if ((var11 & 0x4) == 0) {
                        field8138[var6] = var12;
                    } else {
                        field8138[var6] = (short) var4.method270(true);
                    }
                    field8143[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field8135[var6] = (short) (field8135[var6] << 2 & 0x3FFF);
                        field8144[var6] = (short) (field8144[var6] << 2 & 0x3FFF);
                        field8138[var6] = (short) (field8138[var6] << 2 & 0x3FFF);
                    }
                    field8141[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field8141[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field8142 = true;
                    } else if (var10 == 7) {
                        this.field8145 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field8136 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field469) {
                throw new RuntimeException();
            }
            this.field8146 = var6;
            this.field8131 = new short[var6];
            this.field8139 = new short[var6];
            this.field8140 = new short[var6];
            this.field8132 = new short[var6];
            this.field8137 = new short[var6];
            this.field8130 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field8131[var13] = field8133[var13];
                this.field8139[var13] = field8135[var13];
                this.field8140[var13] = field8144[var13];
                this.field8132[var13] = field8138[var13];
                this.field8137[var13] = field8141[var13];
                this.field8130[var13] = field8143[var13];
            }
        } catch (Exception var14) {
            this.field8146 = 0;
            this.field8142 = false;
            this.field8145 = false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()V", line = 15)
    public static void method3335() {
        field8133 = null;
        field8135 = null;
        field8144 = null;
        field8138 = null;
        field8141 = null;
        field8143 = null;
    }
}
