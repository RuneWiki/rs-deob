import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class331 {

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Z")
    public boolean field5163 = false;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public int field5165 = -1;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Llj;")
    public class276 field5171 = null;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Z")
    public boolean field5161 = false;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "[S")
    public short[] field5162;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[S")
    public short[] field5169;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[S")
    public short[] field5158;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "[S")
    public short[] field5156;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "[S")
    public short[] field5167;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "[B")
    public byte[] field5168;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "[S")
    private static short[] field5160 = new short[500];

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "[S")
    private static short[] field5164 = new short[500];

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[S")
    private static short[] field5159 = new short[500];

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[S")
    private static short[] field5157 = new short[500];

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "[S")
    private static short[] field5166 = new short[500];

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "[B")
    private static byte[] field5170 = new byte[500];

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "([BLlj;)V", line = 60)
    public class331(byte[] arg0, class276 arg1) {
        this.field5171 = arg1;
        class6 var3 = new class6(arg0);
        class6 var4 = new class6(arg0);
        var3.field111 = 2;
        int var5 = var3.method58(-288140008);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field111 = var3.field111 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field5171.field4263[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method58(-288140008);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field5159[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field5164[var6] = var12;
                } else {
                    field5164[var6] = (short) var4.method50(-16777216);
                }
                if ((var11 & 0x2) == 0) {
                    field5166[var6] = var12;
                } else {
                    field5166[var6] = (short) var4.method50(-16777216);
                }
                if ((var11 & 0x4) == 0) {
                    field5157[var6] = var12;
                } else {
                    field5157[var6] = (short) var4.method50(-16777216);
                }
                field5170[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field5164[var6] = (short) (((field5164[var6] & 0xFF) << 3) + (field5164[var6] >> 8 & 0x7));
                    field5166[var6] = (short) (((field5166[var6] & 0xFF) << 3) + (field5166[var6] >> 8 & 0x7));
                    field5157[var6] = (short) (((field5157[var6] & 0xFF) << 3) + (field5157[var6] >> 8 & 0x7));
                }
                field5160[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field5160[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field5161 = true;
                } else if (var10 == 7) {
                    this.field5163 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field111) {
            throw new RuntimeException();
        }
        this.field5165 = var6;
        this.field5162 = new short[var6];
        this.field5169 = new short[var6];
        this.field5158 = new short[var6];
        this.field5156 = new short[var6];
        this.field5167 = new short[var6];
        this.field5168 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field5162[var13] = field5159[var13];
            this.field5169[var13] = field5164[var13];
            this.field5158[var13] = field5166[var13];
            this.field5156[var13] = field5157[var13];
            this.field5167[var13] = field5160[var13];
            this.field5168[var13] = field5170[var13];
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()V", line = 27)
    public static void method2309() {
        field5159 = null;
        field5164 = null;
        field5166 = null;
        field5157 = null;
        field5160 = null;
        field5170 = null;
    }
}
