import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class86 {

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Z")
    public boolean field1153;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Z")
    public boolean field1168;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "[S")
    public short[] field1160;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    private int field1165;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "[I")
    public static int[] field1164;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    private int field1152;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    private int field1163;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Lve;")
    public class182 field1155;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    private final void method542(byte arg0) {
        if (arg0 != 7) {
            this.field1162 = -31;
        }
        int var2 = this.field1154;
        if (var2 == 2) {
            this.field1152 = 2048;
            this.field1162 = 1;
            this.field1161 = 0;
            this.field1163 = 2048;
        } else if (var2 == 3) {
            this.field1152 = 2048;
            this.field1161 = 0;
            this.field1163 = 4096;
            this.field1162 = 1;
        } else if (var2 == 4) {
            this.field1163 = 2048;
            this.field1162 = 4;
            this.field1152 = 2048;
            this.field1161 = 0;
        } else if (var2 == 5) {
            this.field1152 = 2048;
            this.field1162 = 4;
            this.field1161 = 0;
            this.field1163 = 8192;
        } else if (var2 == 12) {
            this.field1162 = 2;
            this.field1163 = 2048;
            this.field1152 = 2048;
            this.field1161 = 0;
        } else if (var2 == 13) {
            this.field1162 = 2;
            this.field1161 = 0;
            this.field1152 = 2048;
            this.field1163 = 8192;
        } else if (var2 == 10) {
            this.field1161 = 1536;
            this.field1152 = 512;
            this.field1162 = 3;
            this.field1163 = 2048;
        } else if (var2 == 11) {
            this.field1161 = 1536;
            this.field1163 = 4096;
            this.field1162 = 3;
            this.field1152 = 512;
        } else if (var2 == 6) {
            this.field1161 = 1280;
            this.field1162 = 3;
            this.field1163 = 2048;
            this.field1152 = 768;
        } else if (var2 == 7) {
            this.field1152 = 768;
            this.field1161 = 1280;
            this.field1162 = 3;
            this.field1163 = 4096;
        } else if (var2 == 8) {
            this.field1152 = 1024;
            this.field1161 = 1024;
            this.field1163 = 2048;
            this.field1162 = 3;
        } else if (var2 == 9) {
            this.field1162 = 3;
            this.field1161 = 1024;
            this.field1163 = 4096;
            this.field1152 = 1024;
        } else if (var2 == 14) {
            this.field1163 = 2048;
            this.field1162 = 1;
            this.field1161 = 1280;
            this.field1152 = 768;
        } else if (var2 == 15) {
            this.field1161 = 1536;
            this.field1162 = 1;
            this.field1152 = 512;
            this.field1163 = 4096;
        } else if (var2 == 16) {
            this.field1162 = 1;
            this.field1161 = 1792;
            this.field1152 = 256;
            this.field1163 = 8192;
        } else {
            this.field1152 = 2048;
            this.field1162 = 0;
            this.field1163 = 2048;
            this.field1161 = 0;
        }
        field1156++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZI)V")
    public final void method543(int arg0, boolean arg1, int arg2) {
        field1166++;
        if (arg2 <= 28) {
            this.field1160 = null;
        }
        int var6;
        if (arg1) {
            var6 = 2048;
        } else {
            int var4 = this.field1165 + (this.field1163 * arg0 / 50) & 0x7FF;
            int var5 = this.field1162;
            if (var5 == 1) {
                var6 = (class21.field385[var4 << 3] >> 5) + 1024;
            } else if (var5 == 3) {
                var6 = class355.field4566[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field1155.method1196((byte) 66, (float) ((this.field1152 * var6 >> 11) + this.field1161) / 2048.0F);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
    public static void method544(byte arg0) {
        if (arg0 <= -60) {
            field1164 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)V")
    public static final void method545(byte arg0, int arg1) {
        field1159++;
        class11 var2 = class286.field3657;
        synchronized (class286.field3657) {
            class286.field3657.method80(-56, arg1);
            int var3 = -46 / ((-arg0 - 21) / 57);
        }
        class11 var4 = class324.field4156;
        synchronized (class324.field4156) {
            class324.field4156.method80(-95, arg1);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lqa;IBIIII)V")
    private final void method546(class129 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field1157++;
        this.field1155 = arg0.method870(arg4, arg5, arg1, arg3, arg6, 1.0F);
        if (arg2 != -110) {
            method545((byte) 45, 114);
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    protected class86() {
        if (class355.field4566 == null) {
            class91.method629(false);
        }
        this.method542((byte) 7);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lqa;Lbt;I)V")
    public class86(class129 arg0, class88 arg1, int arg2) {
        if (class355.field4566 == null) {
            class91.method629(false);
        }
        this.field1158 = arg1.method617(2);
        this.field1153 = (this.field1158 & 0x8) != 0;
        this.field1168 = (this.field1158 & 0x10) != 0;
        this.field1158 &= 0x7;
        int var4 = arg1.method568((byte) 110) << arg2;
        int var5 = arg1.method568((byte) 110) << arg2;
        int var6 = arg1.method568((byte) 110) << arg2;
        int var7 = arg1.method617(2);
        int var8 = var7 * 2 + 1;
        this.field1160 = new short[var8];
        for (int var9 = 0; var9 < this.field1160.length; var9++) {
            short var13 = (short) arg1.method568((byte) 110);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field1160[var9] = (short) class31.method213(var14 << 8, var15);
        }
        int var10 = (var7 << class169.field2206) + class477.field6971;
        int var11 = class9.field97 == null ? class272.field3455[class339.method1998(arg1.method568((byte) 110), (byte) 30) & 0xFFFF] : class9.field97[arg1.method568((byte) 110)];
        int var12 = arg1.method617(2);
        this.field1154 = var12 & 0x1F;
        this.field1165 = var12 & 0xE0 << 3;
        if (this.field1154 != 31) {
            this.method542((byte) 7);
        }
        this.method546(arg0, var5, (byte) -110, var10, var4, var6, var11);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBIII)V")
    public final void method547(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -40) {
            this.field1158 = -64;
        }
        this.field1161 = arg0;
        this.field1162 = arg4;
        field1167++;
        this.field1163 = arg2;
        this.field1152 = arg3;
    }

    static {
        new class169("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field1164 = new int[500];
    }
}
