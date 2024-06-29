import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class471 {

    @OriginalMember(owner = "client!it", name = "i", descriptor = "Z")
    public boolean field6631 = false;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public int field6627 = 0;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "Z")
    public boolean field6637 = false;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "Lsm;")
    public class61 field6625 = null;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "[S")
    public short[] field6638;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "[S")
    public short[] field6626;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "[S")
    public short[] field6633;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "[S")
    public short[] field6629;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "[S")
    public short[] field6636;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "[B")
    public byte[] field6635;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "[S")
    private static short[] field6624 = new short[500];

    @OriginalMember(owner = "client!it", name = "a", descriptor = "[S")
    private static short[] field6623 = new short[500];

    @OriginalMember(owner = "client!it", name = "h", descriptor = "[B")
    private static byte[] field6630 = new byte[500];

    @OriginalMember(owner = "client!it", name = "l", descriptor = "[S")
    private static short[] field6634 = new short[500];

    @OriginalMember(owner = "client!it", name = "f", descriptor = "[S")
    private static short[] field6628 = new short[500];

    @OriginalMember(owner = "client!it", name = "j", descriptor = "[S")
    private static short[] field6632 = new short[500];

    @OriginalMember(owner = "client!it", name = "a", descriptor = "()V", line = 24)
    public static void method2796() {
        field6634 = null;
        field6628 = null;
        field6623 = null;
        field6632 = null;
        field6624 = null;
        field6630 = null;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "([BLsm;)V", line = 61)
    public class471(byte[] arg0, class61 arg1) {
        this.field6625 = arg1;
        try {
            class161 var3 = new class161(arg0);
            class161 var4 = new class161(arg0);
            var3.field2298 = 2;
            int var5 = var3.method1172((byte) -21);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2298 = var3.field2298 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field6625.field884[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1172((byte) 49);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field6634[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field6628[var6] = var12;
                    } else {
                        field6628[var6] = (short) var4.method1164(-118);
                    }
                    if ((var11 & 0x2) == 0) {
                        field6623[var6] = var12;
                    } else {
                        field6623[var6] = (short) var4.method1164(106);
                    }
                    if ((var11 & 0x4) == 0) {
                        field6632[var6] = var12;
                    } else {
                        field6632[var6] = (short) var4.method1164(92);
                    }
                    field6630[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field6628[var6] = (short) (((field6628[var6] & 0xFF) << 3) + (field6628[var6] >> 8 & 0x7));
                        field6623[var6] = (short) (((field6623[var6] & 0xFF) << 3) + (field6623[var6] >> 8 & 0x7));
                        field6632[var6] = (short) (((field6632[var6] & 0xFF) << 3) + (field6632[var6] >> 8 & 0x7));
                        field6628[var6] = (short) (field6628[var6] << 3);
                        field6623[var6] = (short) (field6623[var6] << 3);
                        field6632[var6] = (short) (field6632[var6] << 3);
                    }
                    field6624[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field6624[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field6631 = true;
                    } else if (var10 == 7) {
                        this.field6637 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2298) {
                throw new RuntimeException();
            }
            this.field6627 = var6;
            this.field6638 = new short[var6];
            this.field6626 = new short[var6];
            this.field6633 = new short[var6];
            this.field6629 = new short[var6];
            this.field6636 = new short[var6];
            this.field6635 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field6638[var13] = field6634[var13];
                this.field6626[var13] = field6628[var13];
                this.field6633[var13] = field6623[var13];
                this.field6629[var13] = field6632[var13];
                this.field6636[var13] = field6624[var13];
                this.field6635[var13] = field6630[var13];
            }
        } catch (Exception var14) {
            this.field6627 = 0;
            this.field6631 = false;
            this.field6637 = false;
        }
    }
}
