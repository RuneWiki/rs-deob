import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class66 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field913 = 0;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field914 = -1;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
    public static int[] field915 = new int[2];

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lsi;")
    public static class512 field916 = new class512(13, 7);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 6)
    public static void method438(int arg0) {
        if (arg0 != 13) {
            field913 = -5;
        }
        field915 = null;
        field916 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lic;B)I", line = 29)
    public static final int method441(class32 arg0, byte arg1) {
        if (arg1 > -16) {
            method441(null, (byte) 54);
        }
        field912++;
        String var2 = class82.method528(-83, arg0);
        int[] var3 = null;
        if (class84.method550(127, arg0.field485)) {
            var3 = class84.field1154.method2451(-1, (int) arg0.field493).field863;
        } else if (arg0.field498 != -1) {
            var3 = class84.field1154.method2451(-1, arg0.field498).field863;
        } else if (class111.method730(arg0.field485, (byte) -40)) {
            class194 var4 = class151.field2174[(int) arg0.field493];
            if (var4 != null) {
                class329 var5 = var4.field2768;
                if (var5.field5068 != null) {
                    var5 = var5.method2125(class36.field583, false);
                }
                if (var5 != null) {
                    var3 = var5.field5035;
                }
            }
        } else if (class441.method2665(arg0.field485, -26)) {
            Object var6 = null;
            class130 var7;
            if (arg0.field485 == 1006) {
                var7 = class56.field755.method2031(0, (int) arg0.field493);
            } else {
                var7 = class56.field755.method2031(111, (int) (arg0.field493 >>> 32 & 0x7FFFFFFFL));
            }
            if (var7.field1823 != null) {
                var7 = var7.method832((byte) -125, class36.field583);
            }
            if (var7 != null) {
                var3 = var7.field1870;
            }
        }
        if (var3 != null) {
            var2 = var2 + class156.method1011(var3, 0);
        }
        int var8 = class472.field6901.method42((byte) -120, var2, class55.field748);
        if (arg0.field487) {
            var8 += class285.field4250.method220() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method437(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
    public abstract int method439(int arg0);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method440(int arg0, Component arg1);
}
