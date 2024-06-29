import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class258 implements Runnable {

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "[Ltj;")
    public volatile class201[] field4082 = new class201[2];

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "Z")
    public volatile boolean field4085 = false;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Z")
    public volatile boolean field4080 = false;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4077 = "Opened title screen";

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field4076 = 0;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "Lrj;")
    public class22 field4078;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 12)
    public static void method1819(int arg0) {
        field4077 = null;
        if (arg0 > -48) {
            method1819(-20);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V", line = 26)
    public static final void method1820(int arg0, boolean arg1) {
        field4084++;
        byte var2;
        byte[][] var3;
        if (class272.field4317 && arg1) {
            var2 = 1;
            var3 = class119.field1658;
        } else {
            var3 = class256.field4049;
            var2 = 4;
        }
        int var4 = 0;
        if (arg0 >= -67) {
            method1821(46);
        }
        while (var2 > var4) {
            class108.method698(-86);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class184.field2766[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3DA11F8) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 14 & 0x3FF;
                            int var10 = var7 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            int var12 = (var7 & 0x6) >> 1;
                            for (int var13 = 0; var13 < class218.field3277.length; var13++) {
                                if (class218.field3277[var13] == var11 && var3[var13] != null) {
                                    class117.method763(var12, (var10 & 0x7) * 8, (var9 & 0x7) * 8, var4, var3[var13], var5 * 8, var6 * 8, arg1, var8, true, class247.field3914);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!ol", name = "run", descriptor = "()V", line = 112)
    public final void run() {
        this.field4080 = true;
        try {
            while (!this.field4085) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class201 var2 = this.field4082[var1];
                    if (var2 != null) {
                        var2.method1413(2);
                    }
                }
                class19.method140(10L, 16711680);
                class27.method201(0, this.field4078, (Object) null);
            }
        } catch (Exception var7) {
            class27.method198(var7, (byte) 62, (String) null);
        } finally {
            this.field4080 = false;
        }
        field4079++;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)I", line = 155)
    public static final int method1821(int arg0) {
        if (arg0 == -10980) {
            field4081++;
            return class304.field4737;
        } else {
            return -74;
        }
    }
}
