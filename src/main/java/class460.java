import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public abstract class class460 implements class605 {

    @OriginalMember(owner = "client!iga", name = "o", descriptor = "Z")
    private boolean field6292 = false;

    @OriginalMember(owner = "client!iga", name = "j", descriptor = "Z")
    private boolean field6287;

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
    public int field6282;

    @OriginalMember(owner = "client!iga", name = "n", descriptor = "Lrda;")
    public class663 field6291;

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "I")
    private int field6284;

    @OriginalMember(owner = "client!iga", name = "t", descriptor = "I")
    public int field6297;

    @OriginalMember(owner = "client!iga", name = "p", descriptor = "I")
    public int field6293;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!iga", name = "h", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!iga", name = "k", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!iga", name = "l", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!iga", name = "m", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!iga", name = "q", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!iga", name = "r", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!iga", name = "s", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)I")
    private final int method2609(int arg0) {
        if (arg0 != 330) {
            this.method2618(40);
        }
        field6295++;
        int var2 = this.field6291.method3648(this.field6297, 6407) * this.field6284;
        return this.field6287 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)I")
    public final int method2610(int arg0) {
        field6279++;
        if (arg0 != 6598) {
            this.field6291 = null;
        }
        return this.field6293;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)V")
    private final void method2611(int arg0, int arg1) {
        field6286++;
        this.field6291.field8967 -= arg1;
        if (arg0 == 350) {
            this.field6291.field8967 += this.method2609(330);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IZ)V")
    public static final void method2612(int arg0, boolean arg1) {
        class651.method3552(arg0 ^ 0xFF9ABA);
        field6294++;
        if (!class574.method3162((byte) 13, class15.field215)) {
            return;
        }
        class567.field7457++;
        if (class567.field7457 < 50 && !arg1) {
            return;
        }
        if (arg0 != -16777216) {
            method2617((byte) -30, null);
        }
        class567.field7457 = 0;
        if (!class383.field5328 && class209.field3089 != null) {
            class388.field5410++;
            class583 var2 = class381.method2246(arg0 ^ 0xFF000001, class128.field2105, class587.field7673);
            class42.method309(var2, arg0 ^ 0xFF000000);
            try {
                class539.method3007(7388);
            } catch (IOException var3) {
                class383.field5328 = true;
            }
        }
        class651.method3552(arg0 ^ 0xFF9ABA);
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(B)V")
    private final void method2613(byte arg0) {
        this.field6291.method3639(-2, this);
        field6289++;
        if (this.field6292) {
            OpenGL.glTexParameteri(this.field6282, 10241, this.field6287 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field6282, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field6282, 10241, this.field6287 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field6282, 10240, 9728);
        }
        int var2 = -98 / ((arg0 - 71) / 46);
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZI)V")
    public final void method2614(boolean arg0, int arg1) {
        if (arg1 != 31005) {
            this.field6282 = -2;
        }
        if (this.field6287 != arg0) {
            int var3 = this.method2609(330);
            this.field6287 = true;
            this.method2613((byte) 121);
            this.method2611(350, var3);
        }
        field6288++;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZZ)V")
    public final void method2615(boolean arg0, boolean arg1) {
        if (this.field6292 != arg1) {
            this.field6292 = arg1;
            this.method2613((byte) 125);
        }
        field6290++;
        if (arg0) {
            this.method2616((byte) 53);
        }
    }

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(B)Z")
    public final boolean method2616(byte arg0) {
        if (arg0 != -70) {
            return true;
        }
        field6278++;
        if (!this.field6291.field8985) {
            return false;
        }
        int var2 = this.method2609(arg0 ^ 0xFFFFFEF0);
        this.field6291.method3639(-2, this);
        OpenGL.glGenerateMipmapEXT(this.field6282);
        this.field6287 = true;
        this.method2613((byte) -21);
        this.method2611(350, var2);
        return true;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(BLha;)V")
    public static final void method2617(byte arg0, class59 arg1) {
        field6296++;
        int var2 = 0;
        int var3 = 0;
        if (class24.field412) {
            var2 = class367.method2167(-2);
            var3 = class672.method3717((byte) -101);
        }
        arg1.method419(var2, var3, class228.field3251 + var2, var3 + 350);
        arg1.method504(var2, var3, class228.field3251, 350, class360.field5083 << 24 | 0x332277, 1);
        class62.method539(class228.field3251 + var2, var2, (byte) -95, var3 + 350, var3);
        int var4 = 350 / class213.field3117;
        if (class723.field10069 > 0) {
            int var5 = 346 - class213.field3117 - 4;
            int var6 = var4 * var5 / (class723.field10069 + var4 - 1);
            int var7 = 4;
            if (class723.field10069 > 1) {
                var7 += (class723.field10069 - class313.field4476 - 1) * (var5 - var6) / (class723.field10069 - 1);
            }
            arg1.method504(var2 + class228.field3251 - 16, var3 + var7, 12, var6, class360.field5083 << 24 | 0x332277, 2);
            for (int var8 = class313.field4476; var8 < class313.field4476 + var4 && var8 < class723.field10069; var8++) {
                String[] var9 = class323.method1958(-115, class475.field6519[var8], '\b');
                int var10 = (class228.field3251 - 8 - 16) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = var10 * var11 + 8;
                    arg1.method419(var2 + var12, var3, var2 + var10 + var12 - 8, var3 - -350);
                    class148.field2334.method527(true, var2 + var12, class440.method2536(var9[var11], 88), var3 + 350 - ((var8 - class313.field4476) * class213.field3117 + class180.field2728.field7145 + 2) - class582.field7628, -16777216, -1);
                }
            }
        }
        class275.field3832.method534(-1, var2 + class228.field3251 - 25, -16777216, (byte) -108, var3 + 330, "Build: 640");
        arg1.method419(var2, var3, class228.field3251 + var2, var3 + 350);
        arg1.method467(32, var3 + 350 - class582.field7628, class228.field3251, var2, -1);
        class64.field785.method527(true, var2 + 10, "--> " + class440.method2536(class490.field6655, 82), var3 + 349 - class105.field1446.field7145, -16777216, -1);
        if (arg0 <= 18) {
            method2619(-111, '\u000f');
        }
        if (!class709.field9831) {
            return;
        }
        int var13 = -1;
        if (class29.field474 % 30 > 15) {
            var13 = 16777215;
        }
        arg1.method509(var13, 1, 12, var3 + 339 - class105.field1446.field7145, class105.field1446.method3001(-1, "--> " + class440.method2536(class490.field6655, 74).substring(0, class88.field1078)) + (var2 - -10));
    }

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(I)V")
    public final void method2618(int arg0) {
        int var2 = -36 % ((arg0 - 43) / 36);
        field6283++;
        if (this.field6293 > 0) {
            this.field6291.method3646(this.field6293, 0, this.method2609(330));
            this.field6293 = 0;
        }
    }

    @OriginalMember(owner = "client!iga", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2618(118);
        field6280++;
        super.finalize();
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IC)Z")
    public static final boolean method2619(int arg0, char arg1) {
        if (arg0 != 65) {
            method2617((byte) -22, null);
        }
        field6285++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Lrda;IIIZ)V")
    public class460(class663 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6287 = arg4;
        this.field6282 = arg1;
        this.field6291 = arg0;
        this.field6284 = arg3;
        this.field6297 = arg2;
        OpenGL.glGenTextures(1, class299.field4255, 0);
        this.field6293 = class299.field4255[0];
        this.method2611(350, 0);
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)V")
    public abstract void method2032(byte arg0);
}
