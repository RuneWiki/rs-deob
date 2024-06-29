import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class307 implements Runnable {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Z")
    public boolean field4753 = true;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field4754 = new Object();

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[I")
    public int[] field4757 = new int[500];

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public int field4758 = 0;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    public int[] field4759 = new int[500];

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field4755 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!pe", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        field4756++;
        while (this.field4753) {
            Object var1 = this.field4754;
            synchronized (this.field4754) {
                if (this.field4758 < 500) {
                    this.field4757[this.field4758] = class268.field4137;
                    this.field4759[this.field4758] = class78.field1129;
                    this.field4758++;
                }
            }
            class188.method1443(10, 50L);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 51)
    public static final void method2198(int arg0, String arg1, boolean arg2) {
        field4752++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class346.field5506.method1193(arg1, 250);
        int var7 = class346.field5506.method1200(arg1, 250) * 13;
        if (class240.field3737) {
            class213.method1593(var5 - var3, -var3 + var4, var6 + var3 + var3, var3 + var7 + var3, 0);
            class213.method1599(var5 - var3, -var3 + var4, var3 + var3 + var6, var3 + var7 - -var3, 16777215);
        } else {
            class60.method611(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var3 + var7, 0);
            class60.method604(var5 - var3, -var3 + var4, var3 + var6 + var3, var7 - -var3 + var3, 16777215);
        }
        class346.field5506.method1198(arg1, var5, var4, var6, var7, 16777215, arg0, 1, 1, 0);
        class89.method800(var7 - (-var3 - var3), (byte) -64, var6 + var3 + var3, var4 - var3, var5 - var3);
        if (!arg2) {
            class100.method874(75, var6, var5, var4, var7);
        } else if (class240.field3737) {
            class240.method1787();
        } else {
            try {
                Graphics var8 = class64.field974.getGraphics();
                class42.field665.method970(0, 0, (byte) 117, var8);
            } catch (Exception var10) {
                class64.field974.repaint();
            }
        }
    }
}
