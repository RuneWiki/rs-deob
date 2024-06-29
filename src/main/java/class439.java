import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class439 {

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "Z")
    public boolean field5862 = false;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
    public int field5857 = 0;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "Z")
    public boolean field5865 = false;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "Lkw;")
    public class209 field5867 = null;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "Z")
    public boolean field5855 = false;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "[S")
    public short[] field5871;

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "[S")
    public short[] field5863;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "[S")
    public short[] field5859;

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "[S")
    public short[] field5864;

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "[S")
    public short[] field5861;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "[B")
    public byte[] field5868;

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "[S")
    private static short[] field5860 = new short[500];

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "[S")
    private static short[] field5856 = new short[500];

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "[S")
    private static short[] field5866 = new short[500];

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "[S")
    private static short[] field5869 = new short[500];

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "[B")
    private static byte[] field5858 = new byte[500];

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "[S")
    private static short[] field5870 = new short[500];

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "()V", line = 5)
    public static void method2556() {
        field5869 = null;
        field5870 = null;
        field5866 = null;
        field5856 = null;
        field5860 = null;
        field5858 = null;
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "([BLkw;)V", line = 64)
    public class439(byte[] arg0, class209 arg1) {
        this.field5867 = arg1;
        try {
            class148 var3 = new class148(arg0);
            class148 var4 = new class148(arg0);
            var3.field2177 = 2;
            int var5 = var3.method1032((byte) -33);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2177 = var3.field2177 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field5867.field3099[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1032((byte) -33);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field5869[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field5870[var6] = var12;
                    } else {
                        field5870[var6] = (short) var4.method1067((byte) -118);
                    }
                    if ((var11 & 0x2) == 0) {
                        field5866[var6] = var12;
                    } else {
                        field5866[var6] = (short) var4.method1067((byte) -118);
                    }
                    if ((var11 & 0x4) == 0) {
                        field5856[var6] = var12;
                    } else {
                        field5856[var6] = (short) var4.method1067((byte) -118);
                    }
                    field5858[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field5870[var6] = (short) (((field5870[var6] & 0xFF) << 3) + (field5870[var6] >> 8 & 0x7));
                        field5866[var6] = (short) (((field5866[var6] & 0xFF) << 3) + (field5866[var6] >> 8 & 0x7));
                        field5856[var6] = (short) (((field5856[var6] & 0xFF) << 3) + (field5856[var6] >> 8 & 0x7));
                        field5870[var6] = (short) (field5870[var6] << 3);
                        field5866[var6] = (short) (field5866[var6] << 3);
                        field5856[var6] = (short) (field5856[var6] << 3);
                    }
                    field5860[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field5860[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field5855 = true;
                    } else if (var10 == 7) {
                        this.field5862 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field5865 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2177) {
                throw new RuntimeException();
            }
            this.field5857 = var6;
            this.field5871 = new short[var6];
            this.field5863 = new short[var6];
            this.field5859 = new short[var6];
            this.field5864 = new short[var6];
            this.field5861 = new short[var6];
            this.field5868 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field5871[var13] = field5869[var13];
                this.field5863[var13] = field5870[var13];
                this.field5859[var13] = field5866[var13];
                this.field5864[var13] = field5856[var13];
                this.field5861[var13] = field5860[var13];
                this.field5868[var13] = field5858[var13];
            }
        } catch (Exception var14) {
            this.field5857 = 0;
            this.field5855 = false;
            this.field5862 = false;
        }
    }
}
