import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class578 {

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public int field7908 = 0;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "Z")
    public boolean field7906 = false;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "Lms;")
    public class108 field7910 = null;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "Z")
    public boolean field7907 = false;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "Z")
    public boolean field7903 = false;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "[S")
    public short[] field7900;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "[S")
    public short[] field7905;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "[S")
    public short[] field7899;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "[S")
    public short[] field7912;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "[S")
    public short[] field7909;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "[B")
    public byte[] field7915;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "[B")
    private static byte[] field7901 = new byte[500];

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "[S")
    private static short[] field7904 = new short[500];

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "[S")
    private static short[] field7902 = new short[500];

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "[S")
    private static short[] field7913 = new short[500];

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "[S")
    private static short[] field7911 = new short[500];

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "[S")
    private static short[] field7914 = new short[500];

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "([BLms;)V", line = 65)
    public class578(byte[] arg0, class108 arg1) {
        this.field7910 = arg1;
        try {
            class157 var3 = new class157(arg0);
            class157 var4 = new class157(arg0);
            var3.method930(255);
            var3.field2219 += 2;
            int var5 = var3.method930(255);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2219 = var3.field2219 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field7910.field1279[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method930(255);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field7914[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field7902[var6] = var12;
                    } else {
                        field7902[var6] = (short) var4.method971(16);
                    }
                    if ((var11 & 0x2) == 0) {
                        field7904[var6] = var12;
                    } else {
                        field7904[var6] = (short) var4.method971(16);
                    }
                    if ((var11 & 0x4) == 0) {
                        field7913[var6] = var12;
                    } else {
                        field7913[var6] = (short) var4.method971(16);
                    }
                    field7901[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field7902[var6] = (short) (field7902[var6] << 2 & 0x3FFF);
                        field7904[var6] = (short) (field7904[var6] << 2 & 0x3FFF);
                        field7913[var6] = (short) (field7913[var6] << 2 & 0x3FFF);
                    }
                    field7911[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field7911[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field7906 = true;
                    } else if (var10 == 7) {
                        this.field7907 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field7903 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2219) {
                throw new RuntimeException();
            }
            this.field7908 = var6;
            this.field7900 = new short[var6];
            this.field7905 = new short[var6];
            this.field7899 = new short[var6];
            this.field7912 = new short[var6];
            this.field7909 = new short[var6];
            this.field7915 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field7900[var13] = field7914[var13];
                this.field7905[var13] = field7902[var13];
                this.field7899[var13] = field7904[var13];
                this.field7912[var13] = field7913[var13];
                this.field7909[var13] = field7911[var13];
                this.field7915[var13] = field7901[var13];
            }
        } catch (Exception var14) {
            this.field7908 = 0;
            this.field7906 = false;
            this.field7907 = false;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "()V", line = 35)
    public static void method3193() {
        field7914 = null;
        field7902 = null;
        field7904 = null;
        field7913 = null;
        field7911 = null;
        field7901 = null;
    }
}
