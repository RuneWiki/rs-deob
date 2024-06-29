import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class176 extends class351 {

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    private int field2409;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    private int field2417;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    private int field2408;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    private int field2410;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2406 = "Drop";

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Lvn;")
    public static class11 field2411;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Lfh;")
    public static class140 field2407;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Z")
    public static boolean field2416;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V", line = 11)
    public static void method1293(int arg0) {
        field2407 = null;
        if (arg0 == -1) {
            field2411 = null;
            field2406 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)V", line = 28)
    public final void method1294(int arg0, int arg1, byte arg2) {
        int var4 = this.field2408 * arg0 >> 12;
        field2415++;
        int var5 = this.field2410 * arg1 >> 12;
        int var6 = this.field2409 * arg0 >> 12;
        int var7 = this.field2417 * arg1 >> 12;
        if (arg2 >= -108) {
            this.method1294(-60, -28, (byte) 83);
        }
        class248.method1736(var4, this.field5486, this.field5481, this.field5479, var7, var6, 4194303, var5);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZ)V", line = 47)
    public final void method1295(int arg0, int arg1, boolean arg2) {
        field2414++;
        int var4 = this.field2408 * arg0 >> 12;
        int var5 = this.field2409 * arg0 >> 12;
        int var6 = this.field2410 * arg1 >> 12;
        int var7 = this.field2417 * arg1 >> 12;
        class238.method1693(var4, this.field5486, var6, this.field5479, var7, var5, arg2);
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V", line = 64)
    public static final void method1296(int arg0) {
        field2413++;
        int var1 = -1;
        if (arg0 != 2047) {
            return;
        }
        while (class112.field1441 > var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class288.field4157[var1];
            }
            class239 var3 = class311.field4574[var2];
            if (var3 != null) {
                class130.method1000(-29399, var3.method1699(-1), var3);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIIIII)V", line = 96)
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2409 = arg2;
        this.field2417 = arg3;
        this.field2408 = arg0;
        this.field2410 = arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V", line = 113)
    public final void method1297(int arg0, int arg1, int arg2) {
        field2412++;
        int var4 = this.field2408 * arg1 >> 12;
        int var5 = this.field2409 * arg1 >> 12;
        if (arg0 != 1380163464) {
            this.field2410 = 25;
        }
        int var6 = this.field2410 * arg2 >> 12;
        int var7 = this.field2417 * arg2 >> 12;
        class186.method1348(var4, var7, var5, arg0 - 1380161011, var6, this.field5481);
    }
}
