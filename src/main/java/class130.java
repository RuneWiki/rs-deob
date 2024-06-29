import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class130 implements Runnable {

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Z")
    public boolean field1898 = true;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field1896 = new Object();

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "[I")
    public int[] field1902 = new int[500];

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "[I")
    public int[] field1901 = new int[500];

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public int field1903 = 0;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1900 = " is already on your ignore list.";

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1897;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method896(int arg0) {
        field1897 = null;
        field1900 = null;
        if (arg0 <= 19) {
            method897(121, (class267) null, true);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILha;Z)V")
    public static final void method897(int arg0, class267 arg1, boolean arg2) {
        field1895++;
        int var3 = arg1.field4134 == 0 ? arg1.field4051 : arg1.field4134;
        int var4 = arg1.field4152 == 0 ? arg1.field4177 : arg1.field4152;
        class90.method610(class19.field268[arg1.field4113 >> 16], var3, arg2, 122, arg1.field4113, var4);
        if (arg1.field4160 != null) {
            class90.method610(arg1.field4160, var3, arg2, 123, arg1.field4113, var4);
        }
        if (arg0 != -501) {
            method896(-118);
        }
        class261 var5 = (class261) class128.field1874.method1218((long) arg1.field4113, arg0 ^ 0x1FB);
        if (var5 != null) {
            class206.method1331(var5.field3940, var3, (byte) -118, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static final void method898(int arg0) {
        if (arg0 != 50) {
            return;
        }
        field1899++;
        class57 var1 = class158.field2300;
        synchronized (class158.field2300) {
            class137.field1987 = class234.field3529;
            class273.field4345++;
            class25.field345 = class123.field1785;
            class190.field2688 = class23.field307;
            class200.field2894 = class282.field4493;
            class279.field4465 = class179.field2552;
            class42.field602 = class166.field2416;
            class31.field461 = class187.field2666;
            class282.field4493 = 0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "run", descriptor = "()V")
    public final void run() {
        field1893++;
        while (this.field1898) {
            Object var1 = this.field1896;
            synchronized (this.field1896) {
                if (this.field1903 < 500) {
                    this.field1901[this.field1903] = class25.field345;
                    this.field1902[this.field1903] = class190.field2688;
                    this.field1903++;
                }
            }
            class98.method660(50L, -75);
        }
    }
}
