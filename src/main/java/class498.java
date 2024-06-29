import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class498 extends class30 {

    @OriginalMember(owner = "client!ur", name = "C", descriptor = "Lem;")
    public static class206 field6770 = new class206(12, -2);

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "Z")
    public static boolean field6773 = true;

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!ur", name = "A", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!ur", name = "B", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!ur", name = "D", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field6769;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (arg0 != 1) {
            method2795(48, (class105) null, -99, (byte) -92, (Component) null);
        }
        if (super.field374.field9032) {
            class359.method2051(var3, 0, class31.field399, class430.field6016[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILlaa;IBLjava/awt/Component;)Ljca;")
    public static final class637 method2795(int arg0, class105 arg1, int arg2, byte arg3, Component arg4) {
        ++field6768;
        if (~class357.field4736 == -1) {
            throw new IllegalStateException();
        } else if (~arg2 <= -1 && arg2 < 2) {
            if (~arg0 > -257) {
                arg0 = 256;
            }
            try {
                class637 var5 = (class637) Class.forName("gaa").newInstance();
                var5.field8845 = arg0;
                var5.field8821 = new int[(!class506.field6945 ? 1 : 2) * 256];
                if (arg3 != 32) {
                    return null;
                } else {
                    var5.method834(arg4);
                    var5.field8835 = (-1024 & arg0) + 1024;
                    if (~var5.field8835 < -16385) {
                        var5.field8835 = 16384;
                    }
                    var5.method836(var5.field8835);
                    if (~class121.field1673 < -1 && class197.field2756 == null) {
                        class197.field2756 = new class4();
                        class197.field2756.field23 = arg1;
                        arg1.method757((byte) 81, class121.field1673, class197.field2756);
                    }
                    if (class197.field2756 != null) {
                        if (class197.field2756.field25[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class197.field2756.field25[arg2] = var5;
                    }
                    return var5;
                }
            } catch (Throwable var8) {
                try {
                    class117 var6 = new class117(arg1, arg2);
                    var6.field8845 = arg0;
                    var6.field8821 = new int[(!class506.field6945 ? 1 : 2) * 256];
                    var6.method834(arg4);
                    var6.field8835 = 16384;
                    var6.method836(var6.field8835);
                    if (class121.field1673 > 0 && class197.field2756 == null) {
                        class197.field2756 = new class4();
                        class197.field2756.field23 = arg1;
                        arg1.method757((byte) 124, class121.field1673, class197.field2756);
                    }
                    if (class197.field2756 != null) {
                        if (class197.field2756.field25[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class197.field2756.field25[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class637();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
    public class498() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IB)V")
    public static final void method2796(int arg0, byte arg1) {
        class663 var2 = class457.field6346;
        synchronized (class457.field6346) {
            int var3 = 13 / ((2 - arg1) / 35);
            class457.field6346.method3754(arg0, true);
        }
        ++field6771;
        class663 var4 = class466.field6416;
        synchronized (class466.field6416) {
            class466.field6416.method3754(arg0, true);
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V")
    public static void method2797(int arg0) {
        if (arg0 != -16385) {
            method2797(-46);
        }
        field6770 = null;
    }
}
