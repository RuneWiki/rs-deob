import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class375 {

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "Lvba;")
    private class36 field5706 = new class36();

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "Ltf;")
    private class248 field5710 = new class248();

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
    private int field5713;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    private int field5712;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "Lsd;")
    private class80 field5711;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Lmu;")
    public static class253 field5705;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "Ljava/awt/Frame;")
    public static Frame field5714;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(JLvba;Z)V", line = 6)
    public final void method2411(long arg0, class36 arg1, boolean arg2) {
        if (this.field5713 == 0) {
            class36 var5 = this.field5710.method1645(96);
            var5.method2108(true);
            var5.method199(-107);
            if (this.field5706 == var5) {
                class36 var6 = this.field5710.method1645(-66);
                var6.method2108(true);
                var6.method199(-110);
            }
        } else {
            this.field5713--;
        }
        field5709++;
        this.field5711.method520((byte) -58, arg1, arg0);
        if (!arg2) {
            this.field5710.method1646(126, arg1);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 40)
    public static void method2412(int arg0) {
        field5705 = null;
        field5714 = null;
        if (arg0 != 90) {
            field5714 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLqf;)V", line = 56)
    public static final void method2413(byte arg0, class593 arg1) {
        field5708++;
        if (!class169.field2063) {
            return;
        }
        if (arg0 != 75) {
            field5705 = null;
        }
        class215.field2974++;
        if (arg1.field8554 != null) {
            class593 var2 = class322.method2103(class238.field3397, false, class405.field6120);
            if (var2 != null) {
                class86 var3 = new class86();
                var3.field985 = arg1.field8554;
                var3.field983 = var2;
                var3.field976 = arg1;
                class604.method3516(var3);
            }
        }
        class308.method2044(class51.field542, arg0 ^ 0xFFFFE2BD);
        class468.field6960.method1223(true, arg1.field8579);
        class468.field6960.method1196((byte) 54, class192.field2529);
        class468.field6960.method1229(arg1.field8601, 30364);
        class468.field6960.method1196((byte) 54, class238.field3397);
        class468.field6960.method1229(arg1.field8593, 30364);
        class468.field6960.method1214(class405.field6120, 70);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V", line = 95)
    public final void method2414(byte arg0) {
        this.field5710.method1641(-5681);
        field5704++;
        this.field5711.method528(-519011192);
        this.field5706 = new class36();
        this.field5713 = this.field5712;
        if (arg0 < 47) {
            this.field5712 = 59;
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I)V", line = 153)
    public class375(int arg0) {
        this.field5713 = arg0;
        this.field5712 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field5711 = new class80(var2);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(JZ)Lvba;", line = 123)
    public final class36 method2415(long arg0, boolean arg1) {
        field5707++;
        if (arg1) {
            field5714 = null;
        }
        class36 var4 = (class36) this.field5711.method524((byte) 123, arg0);
        if (var4 != null) {
            this.field5710.method1646(6, var4);
        }
        return var4;
    }
}
