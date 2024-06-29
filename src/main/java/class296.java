import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class296 extends Canvas {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field5076;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Lrg;")
    public static class88 field5070;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2082(int arg0) {
        class272.method1899();
        field5072++;
        if (arg0 != 64) {
            field5070 = (class88) null;
        }
        class272.method1900();
    }

    @OriginalMember(owner = "client!vf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 28)
    public final void paint(Graphics arg0) {
        field5074++;
        this.field5076.paint(arg0);
    }

    @OriginalMember(owner = "client!vf", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 41)
    public final void update(Graphics arg0) {
        field5071++;
        this.field5076.update(arg0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lug;B)V", line = 55)
    public static final void method2083(class294 arg0, byte arg1) {
        long var2 = 0L;
        if (arg0.field5052 == 0) {
            var2 = class252.method1727(arg0.field5046, arg0.field5054, arg0.field5056);
        }
        field5075++;
        if (arg0.field5052 == 1) {
            var2 = class90.method648(arg0.field5046, arg0.field5054, arg0.field5056);
        }
        int var4 = 0;
        if (arg1 > -107) {
            return;
        }
        int var5 = -1;
        if (arg0.field5052 == 2) {
            var2 = class53.method324(arg0.field5046, arg0.field5054, arg0.field5056);
        }
        if (arg0.field5052 == 3) {
            var2 = class56.method347(arg0.field5046, arg0.field5054, arg0.field5056);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var4 = (int) var2 >> 20 & 0x3;
            var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = (int) var2 >> 14 & 0x1F;
        }
        arg0.field5047 = var5;
        arg0.field5058 = var6;
        arg0.field5048 = var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BZ)V", line = 101)
    public static final void method2084(byte arg0, boolean arg1) {
        byte[][] var2;
        if (class281.field4827 && arg1) {
            var2 = class222.field3737;
        } else {
            var2 = class149.field2511;
        }
        int var3 = class244.field4113.length;
        if (arg0 <= 76) {
            method2084((byte) 110, true);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class116.field1976[var4] >> 8) * 64 - class197.field3355;
                int var7 = (class116.field1976[var4] & 0xFF) * 64 - class268.field4615;
                class118.method885(true);
                class247.method1702((byte) 60, arg1, class310.field5292, var6, var7, var5);
            }
        }
        field5073++;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 137)
    public static void method2085(int arg0) {
        field5070 = null;
        if (arg0 != 2) {
            field5070 = (class88) null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 150)
    public class296(Component arg0) {
        this.field5076 = arg0;
    }
}
