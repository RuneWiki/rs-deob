import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class196 implements Runnable {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Z")
    public boolean field2957 = true;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Ljava/lang/Object;")
    public Object field2965 = new Object();

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "[I")
    public int[] field2968 = new int[500];

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "[I")
    public int[] field2969 = new int[500];

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public int field2970 = 0;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "S")
    public static short field2958 = 256;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[I")
    public static int[] field2962 = new int[100];

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[I")
    public static int[] field2960 = new int[1000];

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "[I")
    public static int[] field2967 = new int[8];

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2961 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lvl;")
    public static class138 field2959;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lpk;")
    public static class237 field2956;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)Ln;")
    public static final class283 method1321(int arg0, int arg1, int arg2) {
        if (arg1 != -501) {
            field2960 = null;
        }
        field2966++;
        for (class283 var3 = (class283) class85.field1297.method315((byte) 114); var3 != null; var3 = (class283) class85.field1297.method310(arg1 ^ 0x1B0)) {
            if (var3.field4340 && var3.method1876(arg2, arg0, (byte) -68)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rd", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2957) {
            Object var1 = this.field2965;
            synchronized (this.field2965) {
                if (this.field2970 < 500) {
                    this.field2969[this.field2970] = class12.field172;
                    this.field2968[this.field2970] = class105.field1542;
                    this.field2970++;
                }
            }
            client.method323(50L, -121);
        }
        field2955++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZ)V")
    public static final void method1322(boolean arg0, boolean arg1) {
        field2963++;
        if (arg1 != class4.field55) {
            class4.field55 = arg1;
            if (!arg0) {
                class159.method1076((byte) 92);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1323(int arg0) {
        field2960 = null;
        if (arg0 != 8) {
            field2956 = null;
        }
        field2959 = null;
        field2956 = null;
        field2962 = null;
        field2967 = null;
    }
}
