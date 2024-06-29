import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class18 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field425 = -1;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Z")
    public static boolean field430 = true;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[S")
    public static short[] field437 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lmc;")
    public static class111 field433;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field429;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[I")
    public int[] field428;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[[[B")
    public static byte[][][] field426;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public abstract void method188(int arg0, int arg1, Graphics arg2, byte arg3);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method189(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIILcg;Z)V")
    public static final void method190(int arg0, int arg1, int arg2, class28 arg3, boolean arg4) {
        field427++;
        if (class166.field3404 >= 400) {
            return;
        }
        if (arg3.field623 != null) {
            arg3 = arg3.method281(true);
        }
        if (arg3 == null || !arg3.field667) {
            return;
        }
        class63 var5 = arg3.field624;
        if (arg3.field668 != 0) {
            var5 = class89.method772((byte) 42, new class63[] { var5, class139.method1003(arg3.field668, class3.field72.field1569, 10), class150.field3152, class130.field2845, class175.method1162((byte) -126, arg3.field668), class138.field2962 });
        }
        if (class184.field3729 == 1) {
            class111.field2510++;
            class78.method698((short) 13, arg0, class28.field669, -26415, arg2, (long) arg1, class89.method772((byte) 87, new class63[] { class62.field1554, class142.field3053, var5 }));
        } else if (!class181.field3680) {
            class71.field1800++;
            class63[] var6 = arg3.field646;
            if (class131.field2849) {
                var6 = class116.method913(var6, 12852);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method601(13117, class22.field520)) {
                        class22.field521++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 7;
                        }
                        if (var7 == 1) {
                            var8 = 8;
                        }
                        if (var7 == 2) {
                            var8 = 44;
                        }
                        if (var7 == 3) {
                            var8 = 14;
                        }
                        if (var7 == 4) {
                            var8 = 48;
                        }
                        class78.method698(var8, arg0, var6[var7], -26415, arg2, (long) arg1, class89.method772((byte) 38, new class63[] { class152.field3188, var5 }));
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method601(13117, class22.field520)) {
                        class74.field1821++;
                        short var10 = 0;
                        if (class3.field72.field1569 < arg3.field668) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 7;
                        }
                        if (var9 == 1) {
                            var11 = 8;
                        }
                        if (var9 == 2) {
                            var11 = 44;
                        }
                        if (var9 == 3) {
                            var11 = 14;
                        }
                        if (var9 == 4) {
                            var11 = 48;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class78.method698(var11, arg0, var6[var9], -26415, arg2, (long) arg1, class89.method772((byte) 102, new class63[] { class152.field3188, var5 }));
                    }
                }
            }
            class78.method698((short) 1001, arg0, class88.field2065, -26415, arg2, (long) arg1, class89.method772((byte) 47, new class63[] { class152.field3188, var5 }));
        } else if ((class167.field3452 & 0x2) == 2) {
            class78.method698((short) 28, arg0, class106.field2420, -26415, arg2, (long) arg1, class89.method772((byte) 34, new class63[] { class24.field547, class142.field3053, var5 }));
            class161.field3327++;
        }
        if (arg4) {
            field433 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        if (arg0 != -67) {
            method194((byte) 28);
        }
        field435++;
        class178.method1189(this.field428, this.field434, this.field431);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    protected class18() {
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method192(int arg0) {
        field437 = null;
        field426 = null;
        if (arg0 != -401) {
            method190(77, -61, 10, null, true);
        }
        field433 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method193(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
    public static final void method194(byte arg0) {
        field432++;
        class135 var1 = class45.field1066;
        synchronized (class45.field1066) {
            class47.field1106 = class26.field587;
            if (class85.field2020 >= 0) {
                while (class85.field2020 != class116.field2587) {
                    int var3 = class198.field3955[class116.field2587];
                    class116.field2587 = class116.field2587 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class9.field189[var3] = true;
                    } else {
                        class9.field189[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class9.field189[var2] = false;
                }
                class85.field2020 = class116.field2587;
            }
            class26.field587 = class103.field2382;
        }
        if (arg0 != -42) {
            field433 = null;
        }
    }
}
