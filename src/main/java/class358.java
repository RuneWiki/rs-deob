import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class358 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public int field4930 = 0;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Z")
    public boolean field4938 = false;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Z")
    public boolean field4939 = false;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "Lak;")
    public class221 field4944 = null;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[S")
    public short[] field4937;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "[S")
    public short[] field4943;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[S")
    public short[] field4932;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "[S")
    public short[] field4936;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "[S")
    public short[] field4942;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[B")
    public byte[] field4929;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[B")
    private static byte[] field4931 = new byte[500];

    @OriginalMember(owner = "client!og", name = "g", descriptor = "[S")
    private static short[] field4935 = new short[500];

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[S")
    private static short[] field4934 = new short[500];

    @OriginalMember(owner = "client!og", name = "l", descriptor = "[S")
    private static short[] field4940 = new short[500];

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[S")
    private static short[] field4933 = new short[500];

    @OriginalMember(owner = "client!og", name = "m", descriptor = "[S")
    private static short[] field4941 = new short[500];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
    public static void method2213() {
        field4940 = null;
        field4933 = null;
        field4941 = null;
        field4934 = null;
        field4935 = null;
        field4931 = null;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "([BLak;)V")
    public class358(byte[] arg0, class221 arg1) {
        this.field4944 = arg1;
        try {
            class366 var3 = new class366(arg0);
            class366 var4 = new class366(arg0);
            var3.field5048 = 2;
            int var5 = var3.method2306((byte) 24);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5048 = var3.field5048 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field4944.field3096[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2306((byte) 119);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field4940[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field4933[var6] = var12;
                    } else {
                        field4933[var6] = (short) var4.method2294(-26949);
                    }
                    if ((var11 & 0x2) == 0) {
                        field4941[var6] = var12;
                    } else {
                        field4941[var6] = (short) var4.method2294(-26949);
                    }
                    if ((var11 & 0x4) == 0) {
                        field4934[var6] = var12;
                    } else {
                        field4934[var6] = (short) var4.method2294(-26949);
                    }
                    field4931[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field4933[var6] = (short) (((field4933[var6] & 0xFF) << 3) + (field4933[var6] >> 8 & 0x7));
                        field4941[var6] = (short) (((field4941[var6] & 0xFF) << 3) + (field4941[var6] >> 8 & 0x7));
                        field4934[var6] = (short) (((field4934[var6] & 0xFF) << 3) + (field4934[var6] >> 8 & 0x7));
                        field4933[var6] = (short) (field4933[var6] << 3);
                        field4941[var6] = (short) (field4941[var6] << 3);
                        field4934[var6] = (short) (field4934[var6] << 3);
                    }
                    field4935[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field4935[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field4938 = true;
                    } else if (var10 == 7) {
                        this.field4939 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5048) {
                throw new RuntimeException();
            }
            this.field4930 = var6;
            this.field4937 = new short[var6];
            this.field4943 = new short[var6];
            this.field4932 = new short[var6];
            this.field4936 = new short[var6];
            this.field4942 = new short[var6];
            this.field4929 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field4937[var13] = field4940[var13];
                this.field4943[var13] = field4933[var13];
                this.field4932[var13] = field4941[var13];
                this.field4936[var13] = field4934[var13];
                this.field4942[var13] = field4935[var13];
                this.field4929[var13] = field4931[var13];
            }
        } catch (Exception var14) {
            this.field4930 = 0;
            this.field4938 = false;
            this.field4939 = false;
        }
    }
}
