import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class17 {

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Lvb;")
    private class67 field246 = new class67();

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Lqc;")
    private class258 field250;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field243 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field248 = 0;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lmi;")
    public static class128 field239 = new class128();

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Lhh;")
    public static class163 field255 = class137.method1065("::rebuild", 17);

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Z")
    public static final boolean method110(int arg0, int arg1) {
        if (arg1 != 16) {
            field243 = 40;
        }
        field241++;
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public final void method111(byte arg0) {
        if (arg0 != -52) {
            method118(-70, -106, 106, 123, -20, 67, -84, -99, (byte) 107);
        }
        for (class56 var2 = (class56) this.field246.method468(-112); var2 != null; var2 = (class56) this.field246.method461((byte) 118)) {
            if (var2.method398((byte) -79)) {
                var2.method1063(90);
                var2.method1127(-24137);
                this.field238++;
            }
        }
        field252++;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V")
    public final void method112(int arg0, int arg1) {
        field244++;
        if (class113.field2117 != null) {
            for (class56 var3 = (class56) this.field246.method468(-106); var3 != null; var3 = (class56) this.field246.method461((byte) 73)) {
                if (var3.method398((byte) -79)) {
                    if (var3.method392(4) == null) {
                        var3.method1063(119);
                        var3.method1127(-24137);
                        this.field238++;
                    }
                } else if (((long) arg0) < (++var3.field2853)) {
                    class56 var4 = class113.field2117.method1308((byte) -57, var3);
                    this.field250.method1741(var4, false, var3.field2641);
                    class145.method1098(var3, false, var4);
                    var3.method1063(117);
                    var3.method1127(-24137);
                }
            }
        }
        if (arg1 < 107) {
            method110(-77, 67);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Lei;")
    public static final class159 method113(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2731;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method114(long arg0, int arg1) {
        field245++;
        class56 var4 = (class56) this.field250.method1743(arg0, false);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method392(4);
        if (var5 == null) {
            var4.method1063(118);
            var4.method1127(-24137);
            this.field238++;
            return null;
        }
        if (var4.method398((byte) -79)) {
            class134 var6 = new class134(var5);
            this.field250.method1741(var6, false, var4.field2641);
            this.field246.method471((byte) -96, var6);
            var6.field2853 = 0L;
            var4.method1063(93);
            var4.method1127(-24137);
        } else {
            this.field246.method471((byte) -81, var4);
            var4.field2853 = 0L;
        }
        if (arg1 != 0) {
            method119((byte) 78, (Component) null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    public static void method115(byte arg0) {
        field255 = null;
        int var1 = 25 % ((arg0 + 4) / 40);
        field239 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IJ)V")
    public final void method116(int arg0, long arg1) {
        field249++;
        class56 var4 = (class56) this.field250.method1743(arg1, false);
        if (arg0 != -23114) {
            method115((byte) -14);
        }
        if (var4 != null) {
            var4.method1063(90);
            var4.method1127(-24137);
            this.field238++;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/Object;ZJ)V")
    public final void method117(Object arg0, boolean arg1, long arg2) {
        field251++;
        this.method116(-23114, arg2);
        if (this.field238 == 0) {
            class56 var5 = (class56) this.field246.method462(394243696);
            var5.method1063(89);
            var5.method1127(-24137);
        } else {
            this.field238--;
        }
        class134 var6 = new class134(arg0);
        this.field250.method1741(var6, arg1, arg2);
        this.field246.method471((byte) -80, var6);
        var6.field2853 = 0L;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIIIB)V")
    public static final void method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field247++;
        if (class114.method906(0, arg4)) {
            class22.field367 = null;
            class260.method1756(class109.field2060[arg4], arg1, arg2, arg6, arg7, arg0, arg5, (byte) 28, -1, arg3);
            if (class22.field367 != null) {
                class260.method1756(class22.field367, class191.field3503, arg2, arg6, class159.field2933, arg0, arg5, (byte) 28, -1412584499, arg3);
                class22.field367 = null;
            }
            if (arg8 <= 112) {
                field243 = -105;
            }
        } else if (arg6 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class110.field2086[var9] = true;
            }
        } else {
            class110.field2086[arg6] = true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method119(byte arg0, Component arg1) {
        field253++;
        Method var2 = class166.field3064;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        if (arg0 < 69) {
            field239 = null;
        }
        arg1.addKeyListener(class191.field3494);
        arg1.addFocusListener(class191.field3494);
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)V")
    public final void method120(byte arg0) {
        this.field246.method464(125);
        this.field250.method1742((byte) 83);
        field242++;
        this.field238 = this.field254;
        if (arg0 >= -86) {
            field243 = -77;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I)V")
    public class17(int arg0) {
        this.field254 = arg0;
        this.field238 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field250 = new class258(var2);
    }
}
