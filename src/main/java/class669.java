import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class669 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Lpo;")
    public class517 field9612 = null;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Z")
    public boolean field9615 = false;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "Z")
    public boolean field9621 = false;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "Z")
    public boolean field9618 = false;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public int field9620 = 0;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "[S")
    public short[] field9622;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "[S")
    public short[] field9613;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "[S")
    public short[] field9626;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "[S")
    public short[] field9627;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "[S")
    public short[] field9619;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "[B")
    public byte[] field9614;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "[S")
    private static short[] field9617 = new short[500];

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "[B")
    private static byte[] field9623 = new byte[500];

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "[S")
    private static short[] field9616 = new short[500];

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "[S")
    private static short[] field9624 = new short[500];

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "[S")
    private static short[] field9611 = new short[500];

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "[S")
    private static short[] field9625 = new short[500];

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "([BLpo;)V", line = 65)
    public class669(byte[] arg0, class517 arg1) {
        this.field9612 = arg1;
        try {
            class389 var3 = new class389(arg0);
            class389 var4 = new class389(arg0);
            var3.method2229(255);
            var3.field5195 += 2;
            int var5 = var3.method2229(255);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5195 = var3.field5195 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field9612.field7564[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2229(255);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field9611[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field9616[var6] = var12;
                    } else {
                        field9616[var6] = (short) var4.method2228(0);
                    }
                    if ((var11 & 0x2) == 0) {
                        field9617[var6] = var12;
                    } else {
                        field9617[var6] = (short) var4.method2228(0);
                    }
                    if ((var11 & 0x4) == 0) {
                        field9624[var6] = var12;
                    } else {
                        field9624[var6] = (short) var4.method2228(0);
                    }
                    field9623[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field9616[var6] = (short) (field9616[var6] << 2 & 0x3FFF);
                        field9617[var6] = (short) (field9617[var6] << 2 & 0x3FFF);
                        field9624[var6] = (short) (field9624[var6] << 2 & 0x3FFF);
                    }
                    field9625[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field9625[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field9618 = true;
                    } else if (var10 == 7) {
                        this.field9615 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field9621 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5195) {
                throw new RuntimeException();
            }
            this.field9620 = var6;
            this.field9622 = new short[var6];
            this.field9613 = new short[var6];
            this.field9626 = new short[var6];
            this.field9627 = new short[var6];
            this.field9619 = new short[var6];
            this.field9614 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field9622[var13] = field9611[var13];
                this.field9613[var13] = field9616[var13];
                this.field9626[var13] = field9617[var13];
                this.field9627[var13] = field9624[var13];
                this.field9619[var13] = field9625[var13];
                this.field9614[var13] = field9623[var13];
            }
        } catch (Exception var14) {
            this.field9620 = 0;
            this.field9618 = false;
            this.field9615 = false;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "()V", line = 43)
    public static void method3814() {
        field9611 = null;
        field9616 = null;
        field9617 = null;
        field9624 = null;
        field9625 = null;
        field9623 = null;
    }
}
