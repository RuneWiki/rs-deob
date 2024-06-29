import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class93 {

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Z")
    public boolean field1695 = false;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public int field1688 = 0;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Z")
    public boolean field1691 = false;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Lcs;")
    public class314 field1702 = null;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Z")
    public boolean field1689 = false;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "[S")
    public short[] field1696;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[S")
    public short[] field1698;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "[S")
    public short[] field1703;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[S")
    public short[] field1692;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "[S")
    public short[] field1697;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "[B")
    public byte[] field1694;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "[S")
    private static short[] field1693 = new short[500];

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[S")
    private static short[] field1690 = new short[500];

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "[S")
    private static short[] field1700 = new short[500];

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "[S")
    private static short[] field1699 = new short[500];

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "[B")
    private static byte[] field1701 = new byte[500];

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "[S")
    private static short[] field1704 = new short[500];

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()V")
    public static void method890() {
        field1700 = null;
        field1704 = null;
        field1693 = null;
        field1690 = null;
        field1699 = null;
        field1701 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([BLcs;)V")
    public class93(byte[] arg0, class314 arg1) {
        this.field1702 = arg1;
        try {
            class61 var3 = new class61(arg0);
            class61 var4 = new class61(arg0);
            var3.method732(-559537960);
            var3.field1393 += 2;
            int var5 = var3.method732(-559537960);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field1393 = var3.field1393 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1702.field4639[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method732(-559537960);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1700[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1704[var6] = var12;
                    } else {
                        field1704[var6] = (short) var4.method699(-49152);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1693[var6] = var12;
                    } else {
                        field1693[var6] = (short) var4.method699(-49152);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1690[var6] = var12;
                    } else {
                        field1690[var6] = (short) var4.method699(-49152);
                    }
                    field1701[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field1704[var6] = (short) (field1704[var6] << 2 & 0x3FFF);
                        field1693[var6] = (short) (field1693[var6] << 2 & 0x3FFF);
                        field1690[var6] = (short) (field1690[var6] << 2 & 0x3FFF);
                    }
                    field1699[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1699[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1691 = true;
                    } else if (var10 == 7) {
                        this.field1695 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field1689 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field1393) {
                throw new RuntimeException();
            }
            this.field1688 = var6;
            this.field1696 = new short[var6];
            this.field1698 = new short[var6];
            this.field1703 = new short[var6];
            this.field1692 = new short[var6];
            this.field1697 = new short[var6];
            this.field1694 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1696[var13] = field1700[var13];
                this.field1698[var13] = field1704[var13];
                this.field1703[var13] = field1693[var13];
                this.field1692[var13] = field1690[var13];
                this.field1697[var13] = field1699[var13];
                this.field1694[var13] = field1701[var13];
            }
        } catch (Exception var14) {
            this.field1688 = 0;
            this.field1691 = false;
            this.field1695 = false;
        }
    }
}
