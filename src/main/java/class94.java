import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class94 {

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Led;")
    public class307 field1170 = null;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Z")
    public boolean field1169 = false;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Z")
    public boolean field1175 = false;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public int field1178 = 0;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[S")
    public short[] field1167;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[S")
    public short[] field1176;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[S")
    public short[] field1173;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[S")
    public short[] field1171;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[S")
    public short[] field1166;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[B")
    public byte[] field1177;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[S")
    private static short[] field1164 = new short[500];

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "[S")
    private static short[] field1165 = new short[500];

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[S")
    private static short[] field1168 = new short[500];

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "[B")
    private static byte[] field1174 = new byte[500];

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[S")
    private static short[] field1172 = new short[500];

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "[S")
    private static short[] field1179 = new short[500];

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BLed;)V")
    public class94(byte[] arg0, class307 arg1) {
        this.field1170 = arg1;
        try {
            class256 var3 = new class256(arg0);
            class256 var4 = new class256(arg0);
            var3.field3762 = 2;
            int var5 = var3.method1738((byte) 84);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3762 = var3.field3762 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1170.field4526[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1738((byte) 82);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1164[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1168[var6] = var12;
                    } else {
                        field1168[var6] = (short) var4.method1716(-9657);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1172[var6] = var12;
                    } else {
                        field1172[var6] = (short) var4.method1716(-9657);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1165[var6] = var12;
                    } else {
                        field1165[var6] = (short) var4.method1716(-9657);
                    }
                    field1174[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field1168[var6] = (short) (((field1168[var6] & 0xFF) << 3) + (field1168[var6] >> 8 & 0x7));
                        field1172[var6] = (short) (((field1172[var6] & 0xFF) << 3) + (field1172[var6] >> 8 & 0x7));
                        field1165[var6] = (short) (((field1165[var6] & 0xFF) << 3) + (field1165[var6] >> 8 & 0x7));
                        field1168[var6] = (short) (field1168[var6] << 3);
                        field1172[var6] = (short) (field1172[var6] << 3);
                        field1165[var6] = (short) (field1165[var6] << 3);
                    }
                    field1179[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1179[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1169 = true;
                    } else if (var10 == 7) {
                        this.field1175 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3762) {
                throw new RuntimeException();
            }
            this.field1178 = var6;
            this.field1167 = new short[var6];
            this.field1176 = new short[var6];
            this.field1173 = new short[var6];
            this.field1171 = new short[var6];
            this.field1166 = new short[var6];
            this.field1177 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1167[var13] = field1164[var13];
                this.field1176[var13] = field1168[var13];
                this.field1173[var13] = field1172[var13];
                this.field1171[var13] = field1165[var13];
                this.field1166[var13] = field1179[var13];
                this.field1177[var13] = field1174[var13];
            }
        } catch (Exception var14) {
            this.field1178 = 0;
            this.field1169 = false;
            this.field1175 = false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
    public static void method637() {
        field1164 = null;
        field1168 = null;
        field1172 = null;
        field1165 = null;
        field1179 = null;
        field1174 = null;
    }
}
