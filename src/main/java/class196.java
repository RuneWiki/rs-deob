import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class196 extends class254 {

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field3587 = 3353893;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "Lnh;")
    public static class54 field3585 = new class54(200);

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field3590 = 0;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Lcf;")
    public static class93 field3592 = class147.method1066("Suche nach Updates )2 ", -48);

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field3591 = 0;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Z")
    public static boolean field3593 = false;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Lcf;")
    public static class93 field3594 = class147.method1066("Textures charg-Bes", -48);

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method79(int arg0);

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)Z")
    public abstract boolean method80(byte arg0);

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public static void method1407(int arg0) {
        field3585 = null;
        field3594 = null;
        field3592 = null;
        if (arg0 < 11) {
            field3594 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)Lpi;")
    public static final class139 method1408(int arg0, int arg1) {
        class139 var2 = (class139) class212.field3887.method302((long) arg1, arg0 ^ arg0);
        field3583++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class80.field1493.method1271(33, -2154, arg1);
        class139 var4 = new class139();
        if (var3 != null) {
            var4.method1017(new class280(var3), arg1, arg0 - 36);
        }
        class212.field3887.method297((long) arg1, var4, 10414);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
    public static final void method1409(int arg0) {
        if (arg0 >= -126) {
            method1408(-7, 89);
        }
        field3589++;
        field3585.method300(0);
        class283.field5073.method300(0);
        class94.field1697.method300(0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Llh;I)V")
    public static final void method1410(class286 arg0, int arg1) {
        class66.field1216 = 3;
        field3588++;
        class12 var2 = null;
        class148.method1069(-114, true);
        class46.field748 = 0;
        class195.field3552 = 255;
        class280.field5052 = 2;
        class119.field2117 = true;
        class48.field772 = 0;
        class207.field3717 = true;
        class161.field2832 = true;
        class154.field2697 = true;
        class235.field4195 = true;
        class280.field5059 = true;
        class110.field1876 = true;
        class143.field2480 = 127;
        class154.field2699 = 0;
        class267.field4756 = 127;
        class119.field2121 = 0;
        class154.field2704 = true;
        class46.field739 = true;
        class230.field4124 = true;
        class170.field3000 = true;
        if (arg1 != -12060) {
            field3585 = null;
        }
        if (class58.field979 >= 96) {
            class91.method629(2);
        } else {
            class91.method629(0);
        }
        class42.field667 = true;
        class66.field1219 = 0;
        class133.field2340 = 0;
        class193.field3539 = false;
        class152.field2678 = false;
        class223.field4026 = false;
        class180.field3168 = 0;
        try {
            class22 var3 = arg0.method1961((byte) 127, "runescape");
            while (var3.field290 == 0) {
                class53.method290(1L, true);
            }
            if (var3.field290 == 1) {
                var2 = (class12) var3.field292;
                byte[] var4 = new byte[(int) var2.method50(true)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method49(var5, false, var4, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class130.method954(true, new class280(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method52(-7802);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)V")
    public static final void method1411(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class277.field4967 <= (arg3 - arg1) && (arg1 + arg3) <= class147.field2593 && (arg4 - arg1) >= class26.field342 && (arg1 + arg4) <= class271.field4820) {
            class123.method904(arg3, true, arg2, arg1, arg4);
        } else {
            class108.method775(arg3, arg4, -100, arg2, arg1);
        }
        field3586++;
        if (arg0 != 18650) {
            field3593 = true;
        }
    }
}
