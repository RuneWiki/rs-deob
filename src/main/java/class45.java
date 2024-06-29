import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class45 extends class75 implements Runnable {

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    private int field1178 = 256;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    private int field1181 = 0;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    private int field1179 = 0;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    private int field1180 = 0;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    private int field1182 = 0;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "[I")
    private int[] field1187 = new int[512];

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Z")
    private boolean field1186 = false;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "J")
    private long field1188 = 0L;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "[I")
    public static int[] field1190 = new int[256];

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    private int field1177;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    private int field1185;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "J")
    private long field1183;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "J")
    private long field1189;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(J)V", line = 6)
    private final void method379(long arg0) {
        if (this.field1188 != 0L) {
            while (true) {
                if (this.field1183 >= arg0) {
                    if (arg0 < this.field1188) {
                        return;
                    }
                    try {
                        this.method385(arg0);
                    } catch (Exception var8) {
                        this.method382();
                        this.field1188 += 5000L;
                        return;
                    }
                    this.field1188 = 0L;
                    break;
                }
                class75.method666(18839, 256);
                this.field1183 += 256000 / class66.field1776;
            }
        }
        while (this.field1183 < arg0) {
            this.field1183 += 250880 / class66.field1776;
            int var3;
            try {
                var3 = this.method380();
            } catch (Exception var6) {
                this.method382();
                this.field1188 = arg0;
                return;
            }
            this.method386(var3);
            int var4 = this.field1181 * 3 / 512 - this.field1179 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field1182) {
                var4 = this.field1182;
            }
            this.field1178 = this.field1184 - var4 - 256;
            if (this.field1178 < 256) {
                this.field1178 = 256;
            }
            if (this.field1184 < 16384) {
                if (var3 >= this.field1184) {
                    this.field1177 += 5;
                    if (this.field1177 >= 100) {
                        this.method382();
                        this.field1184 += 2048;
                        this.field1188 = arg0;
                        return;
                    }
                } else if (this.field1185 != var3 && this.field1177 > 0) {
                    this.field1177--;
                }
            }
            this.field1185 = var3;
            if (var3 < this.field1178) {
                break;
            }
            class75.method664(field1190, 256);
            try {
                this.method387();
            } catch (Exception var7) {
                this.method382();
                this.field1188 = arg0;
                return;
            }
            this.field1189 = arg0;
            this.field1185 -= 256;
        }
        if (arg0 < this.field1189 + 5000L) {
            return;
        }
        this.method382();
        this.field1188 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field1187[var5] = 0;
        }
        this.field1179 = this.field1182 = this.field1181 = 0;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()V", line = 122)
    public static void method381() {
        field1190 = null;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I)V", line = 144)
    public class45(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(J)V", line = 133)
    public final synchronized void method384(long arg0) {
        this.method379(arg0);
        if (this.field1183 < arg0) {
            this.field1183 = arg0;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(J)V", line = 156)
    private final void method385(long arg0) throws Exception {
        this.method383(this.field1184);
        while (true) {
            int var3 = this.method380();
            if (var3 < this.field1178) {
                this.field1177 = 0;
                this.field1185 = 0;
                this.field1183 = arg0;
                this.field1189 = arg0;
                return;
            }
            this.method387();
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V", line = 179)
    private final void method386(int arg0) {
        int var2 = arg0 - this.field1178;
        int var3 = this.field1187[this.field1180];
        this.field1187[this.field1180] = var2;
        this.field1181 += var2 - var3;
        int var4 = this.field1180 + 1 & 0x1FF;
        if (var2 > this.field1182) {
            this.field1182 = var2;
        }
        if (var2 < this.field1179) {
            this.field1179 = var2;
        }
        if (this.field1182 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field1180 != var6 && var5 < this.field1182; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field1187[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field1182 = var5;
        }
        if (this.field1179 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field1180 != var9 && var8 > this.field1179; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field1187[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field1179 = var8;
        }
        this.field1180 = var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V", line = 235)
    public final void method266() {
        synchronized (this) {
            this.field1186 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field1186) {
                    return;
                }
            }
            class58.method498(50L, 10);
        }
    }

    @OriginalMember(owner = "client!h", name = "run", descriptor = "()V", line = 261)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field1186) {
                        if (this.field1188 == 0L) {
                            this.method382();
                        }
                        this.field1186 = false;
                        return;
                    }
                    this.method384(System.currentTimeMillis());
                }
                class58.method498(5L, 10);
            }
        } catch (Exception var6) {
            class129.method1015(-86, var6, null);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lcc;I)V", line = 294)
    public final void method388(class15 arg0, int arg1) throws Exception {
        this.field1184 = arg1;
        this.method385(System.currentTimeMillis());
        arg0.method95((byte) 21, this, 10);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()I")
    public abstract int method380() throws Exception;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()V")
    public abstract void method382();

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    public abstract void method383(int arg0) throws Exception;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
    public abstract void method387() throws Exception;
}
