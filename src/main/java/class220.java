import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class220 implements Runnable {

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Z")
    public boolean field4089 = true;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field4086 = new Object();

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public int field4092 = 0;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "[I")
    public int[] field4091 = new int[500];

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "[I")
    public int[] field4094 = new int[500];

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Ldc;")
    public static class37 field4082 = class185.method1233((byte) 86, "welle:");

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[Ldc;")
    public static class37[] field4088 = new class37[500];

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Ldc;")
    public static class37 field4084 = class185.method1233((byte) 86, "mapflag");

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Ldc;")
    public static class37 field4085 = class185.method1233((byte) 86, "");

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Ldc;")
    public static class37 field4090 = class185.method1233((byte) 86, "loc)3dat");

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lbb;")
    public static class14 field4087 = new class14(20);

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Ldc;")
    public static class37 field4095 = class185.method1233((byte) 86, "sl_back");

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)I")
    public static final int method1453(byte arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0xD5555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg0 != 40) {
            method1454(-81);
        }
        int var6 = (var5 >>> 16) + var5;
        field4093++;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!uc", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field4089) {
            Object var1 = this.field4086;
            synchronized (this.field4086) {
                if (this.field4092 < 500) {
                    this.field4091[this.field4092] = class80.field1416;
                    this.field4094[this.field4092] = class235.field4271;
                    this.field4092++;
                }
            }
            class238.method1548((byte) -105, 50L);
        }
        field4081++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1454(int arg0) {
        field4087 = null;
        field4084 = null;
        if (arg0 > -85) {
            return;
        }
        field4095 = null;
        field4088 = null;
        field4082 = null;
        field4085 = null;
        field4090 = null;
    }
}
