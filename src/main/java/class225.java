import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class225 {

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public int field3860;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public int field3858;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public int field3852;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field3853 = 0;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Lr;")
    public static class66 field3856 = class93.method641(43, "blaugr-Un:");

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "[[B")
    public static byte[][] field3855 = new byte[250][];

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IJ)V")
    public static final void method1433(int arg0, long arg1) {
        field3857++;
        if (arg1 == 0L) {
            return;
        }
        class28.field412.method578(98, 42);
        if (arg0 != -256) {
            method1434(-102, 125, 108);
        }
        class28.field412.method1651(true, arg1);
        class11.field137++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)J")
    public static final long method1434(int arg0, int arg1, int arg2) {
        class16 var3 = class110.field2124[arg0][arg1][arg2];
        return var3 == null || var3.field205 == null ? 0L : var3.field205.field853;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static final void method1435(int arg0) {
        int var1 = class98.field1912.method868((byte) 70);
        field3861++;
        if (var1 == 0) {
            return;
        }
        class28.field412.method578(122, 67);
        class28.field412.method1638(32, 0);
        int var2 = class28.field412.field4335;
        int var3 = 0;
        class33.field495++;
        if (arg0 != -14394) {
            method1435(112);
        }
        class49 var4 = (class49) class98.field1912.method874(-98);
        class28.field412.method1650(false, var4.field873);
        int var5 = var4.field873;
        class49 var6;
        while ((var6 = (class49) class98.field1912.method874(-104)) != null) {
            if (var3 < 255 && (var5 + 1) == var6.field873) {
                var3++;
            } else {
                class28.field412.method1638(32, var3);
                var3 = 0;
                class28.field412.method1650(false, var6.field873);
            }
            var5 = var6.field873;
        }
        class28.field412.method1638(32, var3);
        class28.field412.method1662(class28.field412.field4335 - var2, 125);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lua;")
    public static final class244 method1436(Throwable arg0, String arg1) {
        field3850++;
        class244 var2;
        if (arg0 instanceof class244) {
            var2 = (class244) arg0;
            var2.field4266 = var2.field4266 + ' ' + arg1;
        } else {
            var2 = new class244(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static void method1437(int arg0) {
        field3855 = null;
        field3856 = null;
        if (arg0 <= 121) {
            method1434(33, 61, 40);
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public static final void method1438(int arg0) {
        if (arg0 != -13401) {
            method1435(46);
        }
        field3851++;
        int var1 = class207.method1346(arg0 ^ 0xFFFFCBA6);
        if (var1 == 0) {
            class102.field2000 = null;
            class161.method1090(-91, 0);
        } else if (var1 == 1) {
            class255.method1709(arg0 + 13498, (byte) 0);
            class161.method1090(-54, 512);
            class259.method1767(true);
        } else {
            class255.method1709(105, (byte) (class214.field3683 - 4 & 0xFF));
            class161.method1090(-56, 2);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class225() {
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lsh;)V")
    public class225(class225 arg0) {
        this.field3860 = arg0.field3860;
        this.field3858 = arg0.field3858;
        this.field3852 = arg0.field3852;
        this.field3849 = arg0.field3849;
    }
}
