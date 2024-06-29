import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class475 {

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Z")
    public boolean field6632 = false;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Z")
    public boolean field6630 = false;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Lraa;")
    public class607 field6635 = null;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Z")
    public boolean field6640 = false;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public int field6627 = 0;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "[S")
    public short[] field6631;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "[S")
    public short[] field6641;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "[S")
    public short[] field6638;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "[S")
    public short[] field6636;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "[S")
    public short[] field6629;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "[B")
    public byte[] field6633;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "[S")
    private static short[] field6628 = new short[500];

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "[S")
    private static short[] field6634 = new short[500];

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "[B")
    private static byte[] field6637 = new byte[500];

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "[S")
    private static short[] field6639 = new short[500];

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "[S")
    private static short[] field6643 = new short[500];

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "[S")
    private static short[] field6642 = new short[500];

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "([BLraa;)V", line = 45)
    public class475(byte[] arg0, class607 arg1) {
        this.field6635 = arg1;
        try {
            class215 var3 = new class215(arg0);
            class215 var4 = new class215(arg0);
            var3.method1535(255);
            var3.field3109 += 2;
            int var5 = var3.method1535(255);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3109 = var3.field3109 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field6635.field8326[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1535(255);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field6642[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field6628[var6] = var12;
                    } else {
                        field6628[var6] = (short) var4.method1510((byte) 77);
                    }
                    if ((var11 & 0x2) == 0) {
                        field6634[var6] = var12;
                    } else {
                        field6634[var6] = (short) var4.method1510((byte) 77);
                    }
                    if ((var11 & 0x4) == 0) {
                        field6643[var6] = var12;
                    } else {
                        field6643[var6] = (short) var4.method1510((byte) 77);
                    }
                    field6637[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field6628[var6] = (short) (field6628[var6] << 2 & 0x3FFF);
                        field6634[var6] = (short) (field6634[var6] << 2 & 0x3FFF);
                        field6643[var6] = (short) (field6643[var6] << 2 & 0x3FFF);
                    }
                    field6639[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field6639[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field6640 = true;
                    } else if (var10 == 7) {
                        this.field6632 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field6630 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3109) {
                throw new RuntimeException();
            }
            this.field6627 = var6;
            this.field6631 = new short[var6];
            this.field6641 = new short[var6];
            this.field6638 = new short[var6];
            this.field6636 = new short[var6];
            this.field6629 = new short[var6];
            this.field6633 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field6631[var13] = field6642[var13];
                this.field6641[var13] = field6628[var13];
                this.field6638[var13] = field6634[var13];
                this.field6636[var13] = field6643[var13];
                this.field6629[var13] = field6639[var13];
                this.field6633[var13] = field6637[var13];
            }
        } catch (Exception var14) {
            this.field6627 = 0;
            this.field6640 = false;
            this.field6632 = false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()V", line = 187)
    public static void method2793() {
        field6642 = null;
        field6628 = null;
        field6634 = null;
        field6643 = null;
        field6639 = null;
        field6637 = null;
    }
}
