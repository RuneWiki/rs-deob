import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class410 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Z")
    public boolean field5632 = false;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Z")
    public boolean field5636 = false;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Z")
    public boolean field5639 = false;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public int field5646 = 0;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lqs;")
    public class426 field5642 = null;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "[S")
    public short[] field5643;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "[S")
    public short[] field5640;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "[S")
    public short[] field5645;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[S")
    public short[] field5635;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "[S")
    public short[] field5647;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[B")
    public byte[] field5637;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[S")
    private static short[] field5631 = new short[500];

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[S")
    private static short[] field5633 = new short[500];

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "[B")
    private static byte[] field5634 = new byte[500];

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "[S")
    private static short[] field5641 = new short[500];

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "[S")
    private static short[] field5644 = new short[500];

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[S")
    private static short[] field5638 = new short[500];

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
    public static void method2373() {
        field5633 = null;
        field5644 = null;
        field5638 = null;
        field5641 = null;
        field5631 = null;
        field5634 = null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([BLqs;)V")
    public class410(byte[] arg0, class426 arg1) {
        this.field5642 = arg1;
        try {
            class379 var3 = new class379(arg0);
            class379 var4 = new class379(arg0);
            var3.field5173 = 2;
            int var5 = var3.method2238(255);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5173 = var3.field5173 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field5642.field5825[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2238(255);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field5633[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field5644[var6] = var12;
                    } else {
                        field5644[var6] = (short) var4.method2184((byte) -128);
                    }
                    if ((var11 & 0x2) == 0) {
                        field5638[var6] = var12;
                    } else {
                        field5638[var6] = (short) var4.method2184((byte) -128);
                    }
                    if ((var11 & 0x4) == 0) {
                        field5641[var6] = var12;
                    } else {
                        field5641[var6] = (short) var4.method2184((byte) -128);
                    }
                    field5634[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field5644[var6] = (short) (((field5644[var6] & 0xFF) << 3) + (field5644[var6] >> 8 & 0x7));
                        field5638[var6] = (short) (((field5638[var6] & 0xFF) << 3) + (field5638[var6] >> 8 & 0x7));
                        field5641[var6] = (short) (((field5641[var6] & 0xFF) << 3) + (field5641[var6] >> 8 & 0x7));
                        field5644[var6] = (short) (field5644[var6] << 3);
                        field5638[var6] = (short) (field5638[var6] << 3);
                        field5641[var6] = (short) (field5641[var6] << 3);
                    }
                    field5631[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field5631[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field5632 = true;
                    } else if (var10 == 7) {
                        this.field5636 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field5639 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5173) {
                throw new RuntimeException();
            }
            this.field5646 = var6;
            this.field5643 = new short[var6];
            this.field5640 = new short[var6];
            this.field5645 = new short[var6];
            this.field5635 = new short[var6];
            this.field5647 = new short[var6];
            this.field5637 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field5643[var13] = field5633[var13];
                this.field5640[var13] = field5644[var13];
                this.field5645[var13] = field5638[var13];
                this.field5635[var13] = field5641[var13];
                this.field5647[var13] = field5631[var13];
                this.field5637[var13] = field5634[var13];
            }
        } catch (Exception var14) {
            this.field5646 = 0;
            this.field5632 = false;
            this.field5636 = false;
        }
    }
}
