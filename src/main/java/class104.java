import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class104 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[F")
    public static float[] field1918 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
    public static int[] field1921 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field1923 = -1;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lcd;")
    public static class64 field1925 = class44.method335((byte) 71, ")4p=");

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lcd;")
    public static class64 field1927 = class44.method335((byte) 71, "null");

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field1929 = 0;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Z")
    public static boolean field1926 = false;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field1928 = 0;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field1933 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field1919;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public int field1930;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Ljava/awt/Image;")
    public Image field1931;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public int[] field1920;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 9)
    public final void method765(int arg0) {
        class210.method1466(this.field1920, this.field1919, this.field1930);
        if (arg0 != 0) {
            method768((class64[]) null, true);
        }
        field1924++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 35)
    public static final void method766(byte arg0) {
        field1932++;
        for (int var1 = 0; var1 < class228.field3878; var1++) {
            int var2 = class89.field1616[var1];
            class41 var3 = class284.field4888[var2];
            int var4 = class108.field1991.method152((byte) -108);
            if ((var4 & 0x2) != 0) {
                var4 += class108.field1991.method152((byte) -108) << 8;
            }
            class314.method2176(var4, var3, -128, var2);
        }
        if (arg0 >= -47) {
            field1918 = (float[]) null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILcd;IILcd;Lcd;)V", line = 68)
    public static final void method767(int arg0, class64 arg1, int arg2, int arg3, class64 arg4, class64 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class37.field601[var6] = class37.field601[var6 - 1];
            class9.field196[var6] = class9.field196[var6 - 1];
            class7.field177[var6] = class7.field177[var6 - 1];
            class237.field4002[var6] = class237.field4002[var6 - 1];
            class108.field2007[var6] = class108.field2007[var6 - 1];
        }
        class70.field1354++;
        class108.field2008 = class238.field4039;
        field1917++;
        class37.field601[0] = arg3;
        class9.field196[0] = arg5;
        if (arg2 != 32406) {
            method769(67);
        }
        class108.field2007[0] = arg0;
        class7.field177[0] = arg1;
        class237.field4002[0] = arg4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([Lcd;Z)Lcd;", line = 99)
    public static final class64 method768(class64[] arg0, boolean arg1) {
        if (arg1) {
            method767(-85, (class64) null, -74, -25, (class64) null, (class64) null);
        }
        field1922++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class205.method1431(arg0.length, 0, arg0, -8897);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 123)
    public static void method769(int arg0) {
        field1927 = null;
        field1918 = null;
        field1921 = null;
        field1925 = null;
        if (arg0 != 0) {
            field1923 = 59;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 165)
    protected class104() {
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLjava/awt/Component;II)V")
    public abstract void method671(byte arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method673(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
    public abstract void method679(int arg0, int arg1, boolean arg2, Graphics arg3, int arg4, int arg5);
}
