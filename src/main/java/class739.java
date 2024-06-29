import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class739 {

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public int field10005;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Z")
    public boolean field10003;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "Z")
    public boolean field10010;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "[S")
    public short[] field9997;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public int field10000;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    private int field10007;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field9996 = 0;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field10001;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field10002;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field10004;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    private int field10008;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    private int field10009;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field10011;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    private int field10012;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field9995;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    private int field9998;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field9999;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Lgu;")
    public class757 field10006;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZBI)V")
    public final void method4011(boolean arg0, byte arg1, int arg2) {
        field10004++;
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field9998 * arg2 / 50 + this.field10007 & 0x7FF;
            int var6 = this.field10009;
            if (var6 == 1) {
                var4 = (class541.field6805[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class205.field2830[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field10006.method10((float) ((this.field10012 * var4 >> 11) + this.field10008) / 2048.0F, 10);
        if (arg1 != -54) {
            this.method4014(83, -27, -113, null, 77, 40, -110);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    private final void method4012(byte arg0) {
        field10011++;
        int var2 = -29 % ((arg0 - 16) / 61);
        int var3 = this.field10000;
        if (var3 == 2) {
            this.field10009 = 1;
            this.field10008 = 0;
            this.field9998 = 2048;
            this.field10012 = 2048;
        } else if (var3 == 3) {
            this.field10012 = 2048;
            this.field10009 = 1;
            this.field10008 = 0;
            this.field9998 = 4096;
        } else if (var3 == 4) {
            this.field9998 = 2048;
            this.field10009 = 4;
            this.field10012 = 2048;
            this.field10008 = 0;
        } else if (var3 == 5) {
            this.field10009 = 4;
            this.field10012 = 2048;
            this.field10008 = 0;
            this.field9998 = 8192;
        } else if (var3 == 12) {
            this.field10008 = 0;
            this.field10012 = 2048;
            this.field10009 = 2;
            this.field9998 = 2048;
        } else if (var3 == 13) {
            this.field10008 = 0;
            this.field9998 = 8192;
            this.field10009 = 2;
            this.field10012 = 2048;
        } else if (var3 == 10) {
            this.field9998 = 2048;
            this.field10008 = 1536;
            this.field10012 = 512;
            this.field10009 = 3;
        } else if (var3 == 11) {
            this.field9998 = 4096;
            this.field10009 = 3;
            this.field10008 = 1536;
            this.field10012 = 512;
        } else if (var3 == 6) {
            this.field10008 = 1280;
            this.field10012 = 768;
            this.field10009 = 3;
            this.field9998 = 2048;
        } else if (var3 == 7) {
            this.field10008 = 1280;
            this.field10012 = 768;
            this.field10009 = 3;
            this.field9998 = 4096;
        } else if (var3 == 8) {
            this.field10008 = 1024;
            this.field10009 = 3;
            this.field10012 = 1024;
            this.field9998 = 2048;
        } else if (var3 == 9) {
            this.field10012 = 1024;
            this.field9998 = 4096;
            this.field10009 = 3;
            this.field10008 = 1024;
        } else if (var3 == 14) {
            this.field10012 = 768;
            this.field9998 = 2048;
            this.field10009 = 1;
            this.field10008 = 1280;
        } else if (var3 == 15) {
            this.field10008 = 1536;
            this.field10012 = 512;
            this.field10009 = 1;
            this.field9998 = 4096;
        } else if (var3 == 16) {
            this.field9998 = 8192;
            this.field10008 = 1792;
            this.field10012 = 256;
            this.field10009 = 1;
        } else {
            this.field10012 = 2048;
            this.field10008 = 0;
            this.field9998 = 2048;
            this.field10009 = 0;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
    public final void method4013(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10009 = arg4;
        this.field9998 = arg3;
        field9999++;
        int var6 = 107 % ((arg2 - 45) / 43);
        this.field10012 = arg1;
        this.field10008 = arg0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIILha;III)V")
    private final void method4014(int arg0, int arg1, int arg2, class570 arg3, int arg4, int arg5, int arg6) {
        this.field10006 = arg3.method913(arg6, arg0, arg4, arg1, arg5, 1.0F);
        field10002++;
        if (arg2 != 12462) {
            this.field10003 = false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method4015(String arg0, byte arg1) {
        field10001++;
        if (class377.field4615.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class377.field4615.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class377.field4615.startsWith("mac")) {
            return "lib" + arg0 + ".dylib";
        } else {
            int var2 = 64 / (-arg1 / 59);
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    protected class739() {
        if (class205.field2830 == null) {
            class182.method1225(-10374);
        }
        this.method4012((byte) 79);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lha;Lmc;I)V")
    public class739(class570 arg0, class234 arg1, int arg2) {
        if (class205.field2830 == null) {
            class182.method1225(-10374);
        }
        this.field10005 = arg1.method1509(true);
        this.field10003 = (this.field10005 & 0x8) != 0;
        this.field10010 = (this.field10005 & 0x10) != 0;
        this.field10005 &= 0x7;
        int var4 = arg1.method1553((byte) 37) << arg2;
        int var5 = arg1.method1553((byte) -3) << arg2;
        int var6 = arg1.method1553((byte) 82) << arg2;
        int var7 = arg1.method1509(true);
        int var8 = var7 * 2 + 1;
        this.field9997 = new short[var8];
        for (int var9 = 0; var9 < this.field9997.length; var9++) {
            short var13 = (short) arg1.method1553((byte) 7);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field9997[var9] = (short) class77.method473(var15, var14 << 8);
        }
        int var10 = (var7 << class88.field1221) + class686.field8834;
        int var11 = class594.field7542 == null ? class558.field7098[class645.method3487(123, arg1.method1553((byte) 61)) & 0xFFFF] : class594.field7542[arg1.method1553((byte) -109)];
        int var12 = arg1.method1509(true);
        this.field10000 = var12 & 0x1F;
        this.field10007 = var12 & 0xE0 << 3;
        if (this.field10000 != 31) {
            this.method4012((byte) 87);
        }
        this.method4014(var6, var10, 12462, arg0, var5, var11, var4);
    }
}
