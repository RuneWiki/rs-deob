import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class124 {

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Z")
    public boolean field1679 = false;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "Lwo;")
    public class231 field1687 = null;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public int field1693 = 0;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "Z")
    public boolean field1683 = false;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "Z")
    public boolean field1689 = false;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "[S")
    public short[] field1686;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "[S")
    public short[] field1677;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "[S")
    public short[] field1692;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "[S")
    public short[] field1691;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "[S")
    public short[] field1682;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "[B")
    public byte[] field1685;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "[S")
    private static short[] field1684 = new short[500];

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "[B")
    private static byte[] field1678 = new byte[500];

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "[S")
    private static short[] field1681 = new short[500];

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "[S")
    private static short[] field1690 = new short[500];

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "[S")
    private static short[] field1688 = new short[500];

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "[S")
    private static short[] field1680 = new short[500];

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()V")
    public static void method777() {
        field1681 = null;
        field1684 = null;
        field1688 = null;
        field1680 = null;
        field1690 = null;
        field1678 = null;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "([BLwo;)V")
    public class124(byte[] arg0, class231 arg1) {
        this.field1687 = arg1;
        try {
            class208 var3 = new class208(arg0);
            class208 var4 = new class208(arg0);
            var3.field3162 = 2;
            int var5 = var3.method1445(-122);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3162 = var3.field3162 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1687.field3820[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1445(43);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1681[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1684[var6] = var12;
                    } else {
                        field1684[var6] = (short) var4.method1441(-489);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1688[var6] = var12;
                    } else {
                        field1688[var6] = (short) var4.method1441(-489);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1680[var6] = var12;
                    } else {
                        field1680[var6] = (short) var4.method1441(-489);
                    }
                    field1678[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field1684[var6] = (short) (((field1684[var6] & 0xFF) << 3) + (field1684[var6] >> 8 & 0x7));
                        field1688[var6] = (short) (((field1688[var6] & 0xFF) << 3) + (field1688[var6] >> 8 & 0x7));
                        field1680[var6] = (short) (((field1680[var6] & 0xFF) << 3) + (field1680[var6] >> 8 & 0x7));
                        field1684[var6] = (short) (field1684[var6] << 3);
                        field1688[var6] = (short) (field1688[var6] << 3);
                        field1680[var6] = (short) (field1680[var6] << 3);
                    }
                    field1690[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1690[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1689 = true;
                    } else if (var10 == 7) {
                        this.field1679 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field1683 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3162) {
                throw new RuntimeException();
            }
            this.field1693 = var6;
            this.field1686 = new short[var6];
            this.field1677 = new short[var6];
            this.field1692 = new short[var6];
            this.field1691 = new short[var6];
            this.field1682 = new short[var6];
            this.field1685 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1686[var13] = field1681[var13];
                this.field1677[var13] = field1684[var13];
                this.field1692[var13] = field1688[var13];
                this.field1691[var13] = field1680[var13];
                this.field1682[var13] = field1690[var13];
                this.field1685[var13] = field1678[var13];
            }
        } catch (Exception var14) {
            this.field1693 = 0;
            this.field1689 = false;
            this.field1679 = false;
        }
    }
}
