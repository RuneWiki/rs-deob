import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class35 extends class271 {

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    private int field519 = -1;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
    private int field520 = 0;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "[Lbl;")
    public static class295[] field521 = new class295[32768];

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "Lpi;")
    public static class294 field513;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "Lpi;")
    public static class294 field517;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 6)
    public static void method231(byte arg0) {
        field521 = null;
        field513 = null;
        field517 = null;
        int var1 = -91 / ((arg0 + 52) / 55);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V", line = 24)
    public static final void method232(byte arg0) {
        class246.field4168 = null;
        class7.field92 = null;
        class99.field1643 = null;
        class70.field1195 = null;
        field522++;
        if (arg0 < 86) {
            method231((byte) 106);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V", line = 40)
    public static final void method233(boolean arg0) {
        class213.field3618.method1201(-20111);
        if (!arg0) {
            method233(true);
        }
        field515++;
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)V", line = 53)
    public final void method234(int arg0) {
        field511++;
        int var2 = class303.method2086((byte) 113);
        if (arg0 != -65) {
            this.field520 = -36;
        }
        if ((var2 & 0x1) == 0) {
            class47.method317(this.field519);
        }
        if ((var2 & 0x2) == 0) {
            class47.method324(0);
        }
        if ((var2 & 0x4) == 0) {
            class47.method337(0);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Z)V", line = 86)
    public static final void method235(boolean arg0) {
        field516++;
        if (!arg0) {
            return;
        }
        int var1 = class3.field28.method779(class69.field1187);
        for (int var2 = 0; var2 < class126.field2188; var2++) {
            int var3 = class3.field28.method779(class147.method1134(var2, (byte) -90));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class126.field2188 * 15 + 21;
        int var5 = class217.field3708;
        if (var4 + var5 > class244.field4111) {
            var5 = class244.field4111 - var4;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        int var6 = class152.field2623 - (var1 / 2);
        if (class188.field3141 < var1 + var6) {
            var6 = class188.field3141 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class285.field4915 == 1) {
            if (class161.field2737 == class152.field2623 && class82.field1367 == class217.field3708) {
                class269.field4653 = var1;
                class270.field4677 = class126.field2188 * 15 + 22;
                class285.field4915 = 0;
                class59.field985 = var5;
                class153.field2625 = true;
                class188.field3135 = var6;
            }
        } else if (class39.field595 == class152.field2623 && class271.field4685 == class217.field3708) {
            class188.field3135 = var6;
            class270.field4677 = class126.field2188 * 15 + 22;
            class285.field4915 = 0;
            class269.field4653 = var1;
            class59.field985 = var5;
            class153.field2625 = true;
        } else {
            class82.field1367 = class271.field4685;
            class285.field4915 = 1;
            class161.field2737 = class39.field595;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZI)V", line = 184)
    public static final void method236(boolean arg0, int arg1) {
        for (int var2 = 0; var2 < class121.field2031; var2++) {
            class295 var3 = field521[class132.field2281[var2]];
            long var4 = (long) class132.field2281[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method744((byte) -99) && arg0 == var3.field5070.field3880 && var3.field5070.method1678(-5491)) {
                int var6 = var3.field3259 >> 7;
                int var7 = var3.field3218 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.method739(0) == 1 && (var3.field3259 & 0x7F) == 64 && (var3.field3218 & 0x7F) == 64) {
                        if (class123.field2051[var6][var7] == class190.field3167) {
                            continue;
                        }
                        class123.field2051[var6][var7] = class190.field3167;
                    }
                    if (!var3.field5070.field3887) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field3238 = class32.method217(var3.field3259, var3.field3218, true, class67.field1174);
                    class213.method1571(class67.field1174, var3.field3259, var3.field3218, var3.field3238, (var3.method739(0) - 1) * 64 + 60, var3, var3.field3274, var4, var3.field3220);
                }
            }
        }
        if (arg1 > -34) {
            field517 = (class294) null;
        }
        field518++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V", line = 238)
    public static final void method237(int arg0, int arg1) {
        if (arg0 != -3120) {
            method232((byte) 11);
        }
        class156 var2 = class206.method1525(3, -32701, arg1);
        var2.method1184((byte) 87);
        field509++;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V", line = 278)
    public class35(int arg0) {
        GL var2 = class47.field739;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field510 = class119.field2009;
        this.field519 = var3[0];
        class47.method317(this.field519);
        int var4 = class21.field290[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class119.field2008 += var6.limit() - this.field520;
        this.field520 = var6.limit();
    }

    @OriginalMember(owner = "client!dl", name = "finalize", descriptor = "()V", line = 257)
    protected final void finalize() throws Throwable {
        field514++;
        if (this.field519 != -1) {
            class119.method911(this.field519, this.field520, this.field510);
            this.field520 = 0;
            this.field519 = -1;
        }
        super.finalize();
    }
}
