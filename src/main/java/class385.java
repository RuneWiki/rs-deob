import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class385 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public int field5723 = 0;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Z")
    public boolean field5727 = false;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Z")
    public boolean field5736 = false;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lsg;")
    public class393 field5729 = null;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Z")
    public boolean field5735 = false;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[S")
    public short[] field5728;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "[S")
    public short[] field5738;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "[S")
    public short[] field5726;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[S")
    public short[] field5724;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "[S")
    public short[] field5733;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "[B")
    public byte[] field5734;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "[S")
    private static short[] field5725 = new short[500];

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "[S")
    private static short[] field5730 = new short[500];

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "[B")
    private static byte[] field5732 = new byte[500];

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "[S")
    private static short[] field5731 = new short[500];

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[S")
    private static short[] field5722 = new short[500];

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "[S")
    private static short[] field5737 = new short[500];

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([BLsg;)V", line = 65)
    public class385(byte[] arg0, class393 arg1) {
        this.field5729 = arg1;
        try {
            class268 var3 = new class268(arg0);
            class268 var4 = new class268(arg0);
            var3.field3913 = 2;
            int var5 = var3.method1738(255);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3913 = var3.field3913 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field5729.field5889[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1738(255);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field5737[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field5730[var6] = var12;
                    } else {
                        field5730[var6] = (short) var4.method1708(49152);
                    }
                    if ((var11 & 0x2) == 0) {
                        field5731[var6] = var12;
                    } else {
                        field5731[var6] = (short) var4.method1708(49152);
                    }
                    if ((var11 & 0x4) == 0) {
                        field5725[var6] = var12;
                    } else {
                        field5725[var6] = (short) var4.method1708(49152);
                    }
                    field5732[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field5730[var6] = (short) (((field5730[var6] & 0xFF) << 3) + (field5730[var6] >> 8 & 0x7));
                        field5731[var6] = (short) (((field5731[var6] & 0xFF) << 3) + (field5731[var6] >> 8 & 0x7));
                        field5725[var6] = (short) (((field5725[var6] & 0xFF) << 3) + (field5725[var6] >> 8 & 0x7));
                        field5730[var6] = (short) (field5730[var6] << 3);
                        field5731[var6] = (short) (field5731[var6] << 3);
                        field5725[var6] = (short) (field5725[var6] << 3);
                    }
                    field5722[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field5722[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field5736 = true;
                    } else if (var10 == 7) {
                        this.field5735 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field5727 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3913) {
                throw new RuntimeException();
            }
            this.field5723 = var6;
            this.field5728 = new short[var6];
            this.field5738 = new short[var6];
            this.field5726 = new short[var6];
            this.field5724 = new short[var6];
            this.field5733 = new short[var6];
            this.field5734 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field5728[var13] = field5737[var13];
                this.field5738[var13] = field5730[var13];
                this.field5726[var13] = field5731[var13];
                this.field5724[var13] = field5725[var13];
                this.field5733[var13] = field5722[var13];
                this.field5734[var13] = field5732[var13];
            }
        } catch (Exception var14) {
            this.field5723 = 0;
            this.field5736 = false;
            this.field5735 = false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V", line = 40)
    public static void method2340() {
        field5737 = null;
        field5730 = null;
        field5731 = null;
        field5725 = null;
        field5722 = null;
        field5732 = null;
    }
}
