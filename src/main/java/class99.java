import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class99 {

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public int field1161 = 0;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Z")
    public boolean field1162 = false;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Luf;")
    public class250 field1165 = null;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Z")
    public boolean field1167 = false;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[S")
    public short[] field1171;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[S")
    public short[] field1163;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "[S")
    public short[] field1170;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[S")
    public short[] field1166;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "[S")
    public short[] field1168;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[B")
    public byte[] field1157;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[S")
    private static short[] field1156 = new short[500];

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[B")
    private static byte[] field1159 = new byte[500];

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[S")
    private static short[] field1164 = new short[500];

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "[S")
    private static short[] field1158 = new short[500];

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[S")
    private static short[] field1169 = new short[500];

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[S")
    private static short[] field1160 = new short[500];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
    public static void method606() {
        field1160 = null;
        field1169 = null;
        field1158 = null;
        field1164 = null;
        field1156 = null;
        field1159 = null;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([BLuf;)V")
    public class99(byte[] arg0, class250 arg1) {
        this.field1165 = arg1;
        try {
            class242 var3 = new class242(arg0);
            class242 var4 = new class242(arg0);
            var3.field3211 = 2;
            int var5 = var3.method1563(-128);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3211 = var3.field3211 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1165.field3285[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1563(-128);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1160[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1169[var6] = var12;
                    } else {
                        field1169[var6] = (short) var4.method1553(false);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1158[var6] = var12;
                    } else {
                        field1158[var6] = (short) var4.method1553(false);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1164[var6] = var12;
                    } else {
                        field1164[var6] = (short) var4.method1553(false);
                    }
                    field1159[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field1169[var6] = (short) (((field1169[var6] & 0xFF) << 3) + (field1169[var6] >> 8 & 0x7));
                        field1158[var6] = (short) (((field1158[var6] & 0xFF) << 3) + (field1158[var6] >> 8 & 0x7));
                        field1164[var6] = (short) (((field1164[var6] & 0xFF) << 3) + (field1164[var6] >> 8 & 0x7));
                        field1169[var6] = (short) (field1169[var6] << 3);
                        field1158[var6] = (short) (field1158[var6] << 3);
                        field1164[var6] = (short) (field1164[var6] << 3);
                    }
                    field1156[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1156[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1162 = true;
                    } else if (var10 == 7) {
                        this.field1167 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3211) {
                throw new RuntimeException();
            }
            this.field1161 = var6;
            this.field1171 = new short[var6];
            this.field1163 = new short[var6];
            this.field1170 = new short[var6];
            this.field1166 = new short[var6];
            this.field1168 = new short[var6];
            this.field1157 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1171[var13] = field1160[var13];
                this.field1163[var13] = field1169[var13];
                this.field1170[var13] = field1158[var13];
                this.field1166[var13] = field1164[var13];
                this.field1168[var13] = field1156[var13];
                this.field1157[var13] = field1159[var13];
            }
        } catch (Exception var14) {
            this.field1161 = 0;
            this.field1162 = false;
            this.field1167 = false;
        }
    }
}
