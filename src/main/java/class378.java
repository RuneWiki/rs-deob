import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class class378 {

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "[Ljava/lang/Object;")
    public Object[] field5620 = new Object[5000];

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public volatile int field5623 = 0;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "[B")
    public byte[] field5617 = new byte[5000];

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "[F")
    public float[] field5615 = new float[5000];

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public int field5625 = 0;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    public volatile int field5626 = 0;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public int field5627 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "Z")
    public static boolean field5614 = false;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public static int field5630 = 0;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "Lui;")
    public static class451 field5624;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "Lbt;")
    public static class83 field5629;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5618;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public abstract void method93(int arg0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)V")
    public abstract void method99(int arg0, byte arg1);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
    public abstract void method98(int arg0, int arg1);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILui;ZIIII)V")
    public static final void method2317(int arg0, class451 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field5628++;
        class415.field5986 = arg1;
        class372.field5600 = arg0;
        class338.field5076 = arg3;
        class268.field3968 = arg4;
        class346.field5283 = arg2;
        class428.field6110 = 1;
        class479.field6747 = class245.field3510.method1157((byte) -14) / arg6;
        if (class479.field6747 < 1) {
            class479.field6747 = 1;
        }
        if (arg5 != 11204) {
            field5624 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lre;Z)V")
    public static final void method2318(class446 arg0, boolean arg1) {
        field5622++;
        if (!arg1) {
            field5629 = null;
        }
        byte[] var2 = new byte[24];
        if (class204.field3097 != null) {
            try {
                class204.field3097.method1729((byte) 122, 0L);
                class204.field3097.method1731(var2, -100);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method2606(0, 24, var2, (byte) 0);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILcl;ZIF)V")
    public abstract void method91(int arg0, class48 arg1, boolean arg2, int arg3, float arg4);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLke;)V")
    public abstract void method90(byte arg0, class337 arg1);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lke;I)V")
    public abstract void method100(class337 arg0, int arg1);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public abstract void method89(byte arg0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
    public static void method2319(boolean arg0) {
        field5618 = null;
        if (arg0) {
            field5630 = 113;
        }
        field5624 = null;
        field5629 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lct;B)V")
    public static final void method2320(class285 arg0, byte arg1) {
        if (arg1 != 119) {
            method2317(58, (class451) null, true, -41, -78, -124, -14);
        }
        class230.field3390.method376((byte) 87, arg0.method1821(true));
        field5621++;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(BLke;)V")
    public abstract void method94(byte arg0, class337 arg1);
}
