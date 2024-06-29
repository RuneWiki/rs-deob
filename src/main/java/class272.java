import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class272 {

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field4353 = 1;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Z")
    public static boolean field4344 = false;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lnf;")
    public static class162 field4346 = new class162(64);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public int field4348;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public int field4349;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Ljava/awt/Image;")
    public Image field4342;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
    public int[] field4350;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public final void method1862(boolean arg0) {
        field4351++;
        if (arg0) {
            method1864((byte) 104);
        }
        class66.method527(this.field4350, this.field4349, this.field4348);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method1456(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILcc;)V")
    public static final void method1863(int arg0, class222 arg1) {
        if (arg0 > -102) {
            field4346 = null;
        }
        field4354++;
        int var2 = arg1.field3388;
        if (var2 == 324) {
            if (class151.field2232 == -1) {
                class239.field3772 = arg1.field3553;
                class151.field2232 = arg1.field3427;
            }
            if (class176.field2718.field2935) {
                arg1.field3427 = class151.field2232;
            } else {
                arg1.field3427 = class239.field3772;
            }
        } else if (var2 == 325) {
            if (class151.field2232 == -1) {
                class239.field3772 = arg1.field3553;
                class151.field2232 = arg1.field3427;
            }
            if (class176.field2718.field2935) {
                arg1.field3427 = class239.field3772;
            } else {
                arg1.field3427 = class151.field2232;
            }
        } else if (var2 == 327) {
            arg1.field3406 = 150;
            arg1.field3448 = (int) (Math.sin((double) class41.field686 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field3432 = 5;
            arg1.field3524 = -1;
        } else if (var2 == 328) {
            if (class263.field4168.field2064 == null) {
                arg1.field3524 = 0;
            } else {
                arg1.field3406 = 150;
                arg1.field3448 = (int) (Math.sin((double) class41.field686 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3432 = 5;
                arg1.field3524 = ((int) class170.method1223(true, class263.field4168.field2064) << 11) + 2047;
                arg1.field3442 = class263.field4168.field4771;
                arg1.field3462 = class263.field4168.field4736;
                arg1.field3470 = class263.field4168.field4748;
                arg1.field3498 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)I")
    public static final int method1864(byte arg0) {
        if (arg0 < 74) {
            method1865((byte) 28);
        }
        field4343++;
        return class188.field2959.method1170(0);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
    public static void method1865(byte arg0) {
        field4346 = null;
        if (arg0 != -12) {
            method1863(-109, (class222) null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method1460(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public abstract void method1457(int arg0, Graphics arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    protected class272() {
    }
}
