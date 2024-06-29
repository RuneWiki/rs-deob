import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class90 {

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lke;")
    public static class65 field2383 = class1.method17("Konfig geladen)3", -114);

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lke;")
    public static class65 field2386 = class1.method17("headicons_pk", -117);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lke;")
    public static class65 field2380 = class1.method17("@whi@", -117);

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "[I")
    public static int[] field2390 = new int[50];

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lke;")
    public static class65 field2393 = class1.method17("_", -118);

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2392 = 255;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field2394 = 0;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public int field2382;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Ljd;")
    public static class58 field2379;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field2389;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[I")
    public int[] field2385;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljd;ILjd;)V", line = 7)
    public static final void method788(class58 arg0, int arg1, class58 arg2) {
        if (arg1 >= -67) {
            field2392 = 83;
        }
        field2391++;
        class60.field1620 = arg0;
        class121.field2985 = arg2;
        class101.field2636 = class60.field1620.method479((byte) 97, 3);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 24)
    public static final void method791(int arg0) {
        class72.field1892.method834(5875);
        if (arg0 > 72) {
            field2381++;
            class76.field2031.method834(5875);
            class46.field1200.method834(5875);
            class70.field1794.method834(5875);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V", line = 38)
    public static void method792(byte arg0) {
        field2386 = null;
        field2380 = null;
        field2383 = null;
        if (arg0 == -79) {
            field2393 = null;
            field2390 = null;
            field2379 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 60)
    public final void method793(int arg0) {
        field2384++;
        class108.method889(this.field2385, this.field2387, this.field2382);
        if (arg0 > -100) {
            method788(null, 82, null);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 114)
    protected class90() {
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)I", line = 120)
    public static final int method794(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= -45) {
            return 118;
        } else {
            field2388++;
            int var5 = 65536 - class127.field3079[arg1 * 1024 / arg0] >> 1;
            return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method789(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method790(int arg0, int arg1, Graphics arg2, int arg3);
}
