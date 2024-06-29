import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class63 {

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static volatile int field924 = 0;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field920 = -1;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Ljava/awt/Image;")
    public Image field921;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "[I")
    public int[] field918;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "[I")
    public static int[] field922;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;ZII)I", line = 9)
    public static final int method510(String arg0, boolean arg1, int arg2, int arg3) {
        field919++;
        if (arg3 > arg2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg2 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V", line = 84)
    public static void method511(boolean arg0) {
        field922 = null;
        if (!arg0) {
            method511(true);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 94)
    public final void method512(int arg0) {
        class280.method1983(this.field918, this.field926, this.field927);
        field923++;
        if (arg0 <= 4) {
            this.field926 = -2;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 131)
    protected class63() {
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method513(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method514(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method515(Graphics arg0, int arg1, int arg2, int arg3);
}
