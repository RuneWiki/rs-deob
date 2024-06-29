import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class173 extends Canvas {

    @OriginalMember(owner = "client!po", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field2765;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2760 = " is already on your ignore list.";

    @OriginalMember(owner = "client!po", name = "e", descriptor = "[J")
    public static long[] field2764 = new long[32];

    @OriginalMember(owner = "client!po", name = "c", descriptor = "[I")
    public static int[] field2762 = new int[4];

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field2767 = 1;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "Ljl;")
    public static class332 field2768 = new class332(64);

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 7)
    public static void method1355(int arg0) {
        if (arg0 != -28542) {
            method1357(-73);
        }
        field2764 = null;
        field2760 = null;
        field2762 = null;
        field2768 = null;
    }

    @OriginalMember(owner = "client!po", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 26)
    public final void paint(Graphics arg0) {
        field2763++;
        this.field2765.paint(arg0);
    }

    @OriginalMember(owner = "client!po", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 39)
    public final void update(Graphics arg0) {
        this.field2765.update(arg0);
        field2766++;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 54)
    public static final void method1356(int arg0) {
        field2761++;
        class77.field1342.method2327(arg0 + 29883);
        if (arg0 != -29882) {
            method1355(-5);
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)[Lml;", line = 70)
    public static final class17[] method1357(int arg0) {
        class17[] var1 = new class17[class301.field4845];
        field2769++;
        for (int var2 = 0; var2 < class301.field4845; var2++) {
            byte[] var3 = class163.field2578[var2];
            int var4 = class322.field5132[var2] * class221.field3595[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class121.field2026[class343.method2418(255, var3[var6])];
            }
            if (class42.field607) {
                var1[var2] = new class58(class164.field2595, class318.field5070, class189.field3035[var2], class19.field211[var2], class221.field3595[var2], class322.field5132[var2], var5);
            } else {
                var1[var2] = new class351(class164.field2595, class318.field5070, class189.field3035[var2], class19.field211[var2], class221.field3595[var2], class322.field5132[var2], var5);
            }
        }
        class211.method1592((byte) 41);
        if (arg0 != 1) {
            method1357(73);
        }
        return var1;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 109)
    public class173(Component arg0) {
        this.field2765 = arg0;
    }
}
