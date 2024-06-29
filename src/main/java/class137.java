import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class137 implements Runnable {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "[Lue;")
    public volatile class149[] field1905 = new class149[2];

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
    public volatile boolean field1906 = false;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Z")
    public volatile boolean field1907 = false;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field1910 = 0;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lap;")
    public static class310 field1904 = new class310(2, 3);

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field1912 = 1;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Lap;")
    public static class310 field1911 = new class310(3, 3);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lis;")
    public class65 field1903;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLoe;)V")
    public static final void method1008(byte arg0, class11 arg1) {
        if (arg1.field74 != null) {
            arg1.field74.field3385 = 0;
        }
        field1902++;
        arg1.field75 = false;
        if (arg0 != -84) {
            field1911 = null;
        }
        for (class11 var2 = arg1.method53(); var2 != null; var2 = arg1.method55()) {
            method1008((byte) -84, var2);
        }
    }

    @OriginalMember(owner = "client!eh", name = "run", descriptor = "()V")
    public final void run() {
        this.field1907 = true;
        field1908++;
        try {
            while (!this.field1906) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class149 var2 = this.field1905[var1];
                    if (var2 != null) {
                        var2.method1059((byte) 9);
                    }
                }
                class89.method752(0, 10L);
                class347.method2155(-99, (Object) null, this.field1903);
            }
        } catch (Exception var9) {
            class83.method704((byte) 127, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field1907 = false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method1009(int arg0) {
        field1904 = null;
        field1911 = null;
        if (arg0 != 3) {
            field1911 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static final void method1010(int arg0) {
        class303.field4308 = true;
        if (arg0 == 3) {
            field1909++;
        }
    }
}
