import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class167 {

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Z")
    public boolean field2692 = false;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Z")
    public boolean field2691 = false;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Luja;")
    public class38 field2687 = null;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Z")
    public boolean field2696 = false;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public int field2701 = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "[S")
    public short[] field2686;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "[S")
    public short[] field2690;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "[S")
    public short[] field2689;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "[S")
    public short[] field2698;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[S")
    public short[] field2693;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "[B")
    public byte[] field2688;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[S")
    private static short[] field2694 = new short[500];

    @OriginalMember(owner = "client!g", name = "j", descriptor = "[S")
    private static short[] field2695 = new short[500];

    @OriginalMember(owner = "client!g", name = "l", descriptor = "[S")
    private static short[] field2697 = new short[500];

    @OriginalMember(owner = "client!g", name = "o", descriptor = "[S")
    private static short[] field2700 = new short[500];

    @OriginalMember(owner = "client!g", name = "n", descriptor = "[S")
    private static short[] field2699 = new short[500];

    @OriginalMember(owner = "client!g", name = "q", descriptor = "[B")
    private static byte[] field2702 = new byte[500];

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()V", line = 7)
    public static void method1298() {
        field2695 = null;
        field2700 = null;
        field2699 = null;
        field2697 = null;
        field2694 = null;
        field2702 = null;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "([BLuja;)V", line = 62)
    public class167(byte[] arg0, class38 arg1) {
        this.field2687 = arg1;
        try {
            class93 var3 = new class93(arg0);
            class93 var4 = new class93(arg0);
            var3.method793((byte) 27);
            var3.field1442 += 2;
            int var5 = var3.method793((byte) 80);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field1442 = var3.field1442 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field2687.field643[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method793((byte) 10);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field2695[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field2700[var6] = var12;
                    } else {
                        field2700[var6] = (short) var4.method742((byte) -13);
                    }
                    if ((var11 & 0x2) == 0) {
                        field2699[var6] = var12;
                    } else {
                        field2699[var6] = (short) var4.method742((byte) -13);
                    }
                    if ((var11 & 0x4) == 0) {
                        field2697[var6] = var12;
                    } else {
                        field2697[var6] = (short) var4.method742((byte) -13);
                    }
                    field2702[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field2700[var6] = (short) (field2700[var6] << 2 & 0x3FFF);
                        field2699[var6] = (short) (field2699[var6] << 2 & 0x3FFF);
                        field2697[var6] = (short) (field2697[var6] << 2 & 0x3FFF);
                    }
                    field2694[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field2694[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field2696 = true;
                    } else if (var10 == 7) {
                        this.field2691 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field2692 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field1442) {
                throw new RuntimeException();
            }
            this.field2701 = var6;
            this.field2686 = new short[var6];
            this.field2690 = new short[var6];
            this.field2689 = new short[var6];
            this.field2698 = new short[var6];
            this.field2693 = new short[var6];
            this.field2688 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field2686[var13] = field2695[var13];
                this.field2690[var13] = field2700[var13];
                this.field2689[var13] = field2699[var13];
                this.field2698[var13] = field2697[var13];
                this.field2693[var13] = field2694[var13];
                this.field2688[var13] = field2702[var13];
            }
        } catch (Exception var14) {
            this.field2701 = 0;
            this.field2696 = false;
            this.field2691 = false;
        }
    }
}
