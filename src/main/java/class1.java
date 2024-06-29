import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 {

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "[F")
    public float[] field17 = new float[4];

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Z")
    public boolean field15 = false;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Z")
    public boolean field18;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Z")
    public boolean field3;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "[S")
    public short[] field2;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Z")
    public static boolean field13 = true;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "Lkl;")
    public static class68 field26 = null;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "[I")
    public static int[] field16 = new int[200];

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "F")
    public float field27;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "F")
    public float field30;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    private int field20;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    private int field22;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    private int field23;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    private int field25;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "Lfn;")
    public class299 field24;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)V", line = 8)
    public static final void method1(int arg0, byte arg1) {
        if (class18.field327 == 0) {
            class29.field561.method2231(arg0, -82);
        } else {
            class204.field3340 = arg0;
        }
        field12++;
        if (arg1 != -117) {
            method3((String) null, (byte) 37, -70);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 28)
    private final void method2(byte arg0) {
        field8++;
        if (arg0 > -55) {
            this.field20 = 82;
        }
        int var2 = this.field21;
        if (var2 == 2) {
            this.field22 = 1;
            this.field20 = 2048;
            this.field23 = 0;
            this.field25 = 2048;
        } else if (var2 == 3) {
            this.field23 = 0;
            this.field20 = 2048;
            this.field25 = 4096;
            this.field22 = 1;
        } else if (var2 == 4) {
            this.field23 = 0;
            this.field20 = 2048;
            this.field22 = 4;
            this.field25 = 2048;
        } else if (var2 == 5) {
            this.field22 = 4;
            this.field23 = 0;
            this.field25 = 8192;
            this.field20 = 2048;
        } else if (var2 == 12) {
            this.field22 = 2;
            this.field25 = 2048;
            this.field23 = 0;
            this.field20 = 2048;
        } else if (var2 == 13) {
            this.field20 = 2048;
            this.field23 = 0;
            this.field22 = 2;
            this.field25 = 8192;
        } else if (var2 == 10) {
            this.field22 = 3;
            this.field25 = 2048;
            this.field20 = 512;
            this.field23 = 1536;
        } else if (var2 == 11) {
            this.field20 = 512;
            this.field22 = 3;
            this.field25 = 4096;
            this.field23 = 1536;
        } else if (var2 == 6) {
            this.field25 = 2048;
            this.field20 = 768;
            this.field23 = 1280;
            this.field22 = 3;
        } else if (var2 == 7) {
            this.field22 = 3;
            this.field23 = 1280;
            this.field25 = 4096;
            this.field20 = 768;
        } else if (var2 == 8) {
            this.field25 = 2048;
            this.field20 = 1024;
            this.field23 = 1024;
            this.field22 = 3;
        } else if (var2 == 9) {
            this.field23 = 1024;
            this.field22 = 3;
            this.field20 = 1024;
            this.field25 = 4096;
        } else if (var2 == 14) {
            this.field25 = 2048;
            this.field22 = 1;
            this.field23 = 1280;
            this.field20 = 768;
        } else if (var2 == 15) {
            this.field22 = 1;
            this.field20 = 512;
            this.field25 = 4096;
            this.field23 = 1536;
        } else if (var2 == 16) {
            this.field23 = 1792;
            this.field25 = 8192;
            this.field20 = 256;
            this.field22 = 1;
        } else {
            this.field20 = 2048;
            this.field22 = 0;
            this.field25 = 2048;
            this.field23 = 0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/String;BI)I", line = 228)
    public static final int method3(String arg0, byte arg1, int arg2) {
        if (arg1 < 16) {
            field13 = true;
        }
        field19++;
        return class34.method272(arg2, (byte) 106, arg0, true);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 242)
    private final void method4(int arg0) {
        int var2 = (this.field9 << 7) + arg0;
        this.field30 = 1.0F / (float) (var2 * var2);
        field10++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIBI)V", line = 258)
    public final void method5(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.field25 = arg0;
        field1++;
        this.field23 = arg4;
        this.field20 = arg1;
        this.field22 = arg2;
        int var6 = -3 % ((arg3 + 12) / 32);
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 390)
    protected class1() {
        if (class337.field5237 == null) {
            class99.method656(-17937);
        }
        this.method2((byte) -126);
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lag;)V", line = 404)
    public class1(class202 arg0) {
        if (class337.field5237 == null) {
            class99.method656(-17937);
        }
        this.field28 = arg0.method1317((byte) -99);
        this.field18 = (this.field28 & 0x8) != 0;
        this.field3 = (this.field28 & 0x10) != 0;
        this.field28 &= 0x7;
        this.field5 = arg0.method1315(14289);
        this.field11 = arg0.method1315(14289);
        this.field29 = arg0.method1315(14289);
        this.field9 = arg0.method1317((byte) -100);
        this.method4(64);
        this.field2 = new short[this.field9 * 2 + 1];
        for (int var2 = 0; var2 < this.field2.length; var2++) {
            this.field2[var2] = (short) arg0.method1315(14289);
        }
        this.field6 = class284.field4387[arg0.method1315(14289)];
        int var3 = arg0.method1317((byte) -123);
        this.field21 = var3 & 0x1F;
        this.field7 = (var3 & 0xE0) << 3;
        if (this.field21 != 31) {
            this.method2((byte) -97);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BZI)V", line = 290)
    public final void method6(byte arg0, boolean arg1, int arg2) {
        int var4 = this.field7 + (this.field25 * arg2 / 50) & 0x7FF;
        field4++;
        int var5 = this.field22;
        int var6;
        if (var5 == 1) {
            var6 = (class284.field4395[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class337.field5237[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg1) {
            var6 = 2048;
        }
        if (arg0 != 59) {
            this.field21 = -56;
        }
        this.field27 = (float) ((this.field20 * var6 >> 11) + this.field23) / 2048.0F;
        float var7 = this.field27 / 255.0F;
        this.field17[1] = var7 * (float) (class61.method475(65361, this.field6) >> 8);
        this.field17[2] = var7 * (float) class61.method475(this.field6, 255);
        this.field17[0] = var7 * (float) class61.method475(this.field6 >> 16, 255);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V", line = 369)
    public static void method7(byte arg0) {
        if (arg0 == 40) {
            field16 = null;
            field26 = null;
        }
    }
}
