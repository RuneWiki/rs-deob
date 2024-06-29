import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class107 {

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Lwn;")
    public class264 field1760 = null;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public int field1768 = -1;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Z")
    public boolean field1762 = false;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Z")
    public boolean field1769 = false;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "[S")
    public short[] field1771;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "[S")
    public short[] field1763;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "[S")
    public short[] field1767;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "[S")
    public short[] field1773;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "[S")
    public short[] field1758;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "[B")
    public byte[] field1764;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "[S")
    private static short[] field1766 = new short[500];

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "[B")
    private static byte[] field1761 = new byte[500];

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "[S")
    private static short[] field1770 = new short[500];

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "[S")
    private static short[] field1765 = new short[500];

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "[S")
    private static short[] field1759 = new short[500];

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "[S")
    private static short[] field1772 = new short[500];

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "([BLwn;)V", line = 57)
    public class107(byte[] arg0, class264 arg1) {
        this.field1760 = arg1;
        class227 var3 = new class227(arg0);
        class227 var4 = new class227(arg0);
        var3.field3760 = 2;
        int var5 = var3.method1720((byte) -35);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3760 = var3.field3760 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field1760.field4434[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method1720((byte) -37);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field1759[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field1770[var6] = var12;
                } else {
                    field1770[var6] = (short) var4.method1716((byte) 107);
                }
                if ((var11 & 0x2) == 0) {
                    field1766[var6] = var12;
                } else {
                    field1766[var6] = (short) var4.method1716((byte) 87);
                }
                if ((var11 & 0x4) == 0) {
                    field1765[var6] = var12;
                } else {
                    field1765[var6] = (short) var4.method1716((byte) 92);
                }
                field1761[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field1770[var6] = (short) (((field1770[var6] & 0xFF) << 3) + (field1770[var6] >> 8 & 0x7));
                    field1766[var6] = (short) (((field1766[var6] & 0xFF) << 3) + (field1766[var6] >> 8 & 0x7));
                    field1765[var6] = (short) (((field1765[var6] & 0xFF) << 3) + (field1765[var6] >> 8 & 0x7));
                }
                field1772[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field1772[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field1769 = true;
                } else if (var10 == 7) {
                    this.field1762 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3760) {
            throw new RuntimeException();
        }
        this.field1768 = var6;
        this.field1771 = new short[var6];
        this.field1763 = new short[var6];
        this.field1767 = new short[var6];
        this.field1773 = new short[var6];
        this.field1758 = new short[var6];
        this.field1764 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field1771[var13] = field1759[var13];
            this.field1763[var13] = field1770[var13];
            this.field1767[var13] = field1766[var13];
            this.field1773[var13] = field1765[var13];
            this.field1758[var13] = field1772[var13];
            this.field1764[var13] = field1761[var13];
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()V", line = 13)
    public static void method826() {
        field1759 = null;
        field1770 = null;
        field1766 = null;
        field1765 = null;
        field1772 = null;
        field1761 = null;
    }
}
