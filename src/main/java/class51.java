import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class51 extends class86 implements Runnable {

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "J")
    private long field1130 = 0L;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    private int field1131 = 0;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    private int field1136 = 256;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "[I")
    private int[] field1133 = new int[512];

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    private int field1140 = 0;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    private int field1141 = 0;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    private int field1142 = 0;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "Z")
    private boolean field1143 = false;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    private int field1135;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    private int field1138;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "J")
    private long field1134;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "J")
    private long field1137;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "[I")
    public static int[] field1132;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
    public final void method21() {
        synchronized (this) {
            this.field1143 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field1143) {
                    break;
                }
            }
            class28.method219(true, 50L);
        }
        field1132 = null;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(J)V")
    private final void method368(long arg0) throws Exception {
        this.method150(this.field1135);
        while (true) {
            int var3 = this.method153();
            if (var3 < this.field1136) {
                this.field1139 = 0;
                this.field1138 = 0;
                this.field1134 = arg0;
                this.field1137 = arg0;
                return;
            }
            this.method149();
        }
    }

    @OriginalMember(owner = "client!hb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field1143) {
                        if (this.field1130 == 0L) {
                            this.method151();
                        }
                        this.field1143 = false;
                        return;
                    }
                    this.method370(class60.method432(true));
                }
                class28.method219(true, 5L);
            }
        } catch (Exception var6) {
            class110.method850((byte) -57, null, var6);
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(J)V")
    private final void method369(long arg0) {
        if (this.field1130 != 0L) {
            while (true) {
                if (this.field1134 >= arg0) {
                    if (arg0 < this.field1130) {
                        return;
                    }
                    try {
                        this.method368(arg0);
                    } catch (Exception var8) {
                        this.method151();
                        this.field1130 += 5000L;
                        return;
                    }
                    this.field1130 = 0L;
                    break;
                }
                class86.method637(-127, 256);
                this.field1134 += 256000 / class85.field2025;
            }
        }
        while (this.field1134 < arg0) {
            this.field1134 += 250880 / class85.field2025;
            int var3;
            try {
                var3 = this.method153();
            } catch (Exception var6) {
                this.method151();
                this.field1130 = arg0;
                return;
            }
            this.method372(var3);
            int var4 = this.field1131 * 3 / 512 - this.field1141 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field1140) {
                var4 = this.field1140;
            }
            this.field1136 = this.field1135 - var4 - 256;
            if (this.field1136 < 256) {
                this.field1136 = 256;
            }
            if (this.field1135 < 16384) {
                if (var3 >= this.field1135) {
                    this.field1139 += 5;
                    if (this.field1139 >= 100) {
                        this.method151();
                        this.field1135 += 2048;
                        this.field1130 = arg0;
                        return;
                    }
                } else if (this.field1138 != var3 && this.field1139 > 0) {
                    this.field1139--;
                }
            }
            this.field1138 = var3;
            if (var3 < this.field1136) {
                break;
            }
            class86.method635(field1132, 256);
            try {
                this.method149();
            } catch (Exception var7) {
                this.method151();
                this.field1130 = arg0;
                return;
            }
            this.field1137 = arg0;
            this.field1138 -= 256;
        }
        if (arg0 < this.field1137 + 5000L) {
            return;
        }
        this.method151();
        this.field1130 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field1133[var5] = 0;
        }
        this.field1141 = this.field1140 = this.field1131 = 0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(J)V")
    public final synchronized void method370(long arg0) {
        this.method369(arg0);
        if (this.field1134 < arg0) {
            this.field1134 = arg0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lha;I)V")
    public final void method371(class50 arg0, int arg1) throws Exception {
        this.field1135 = arg1;
        this.method368(class60.method432(true));
        arg0.method358(this, 10, 0);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    private final void method372(int arg0) {
        int var2 = arg0 - this.field1136;
        int var3 = this.field1133[this.field1142];
        this.field1133[this.field1142] = var2;
        this.field1131 += var2 - var3;
        int var4 = this.field1142 + 1 & 0x1FF;
        if (var2 > this.field1140) {
            this.field1140 = var2;
        }
        if (var2 < this.field1141) {
            this.field1141 = var2;
        }
        if (this.field1140 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field1142 != var6 && var5 < this.field1140; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field1133[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field1140 = var5;
        }
        if (this.field1141 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field1142 != var9 && var8 > this.field1141; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field1133[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field1141 = var8;
        }
        this.field1142 = var4;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()I")
    public abstract int method153() throws Exception;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public abstract void method150(int arg0) throws Exception;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "()V")
    public static void method373() {
        field1132 = null;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "()V")
    public abstract void method149() throws Exception;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
    public abstract void method152(Component arg0, int arg1, boolean arg2) throws Exception;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "()V")
    public abstract void method151();

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class51() {
        int var1 = 256;
        if (class121.field2826) {
            var1 <<= 0x1;
        }
        field1132 = new int[var1];
    }
}
