import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class151 {

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public int field2295 = 2;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public int field2296 = 64;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Z")
    public boolean field2293 = false;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Z")
    public boolean field2289 = false;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public int field2300 = -1;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public int field2292 = 64;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public int field2288 = 1;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "J")
    public static long field2287 = 0L;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[S")
    public static short[] field2291 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field2297 = 0;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lwca;")
    public static class583 field2298;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field2294;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static void method1110(boolean arg0) {
        field2291 = null;
        field2294 = null;
        if (!arg0) {
            field2294 = null;
        }
        field2298 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILgw;IB)V")
    private final void method1111(int arg0, class148 arg1, int arg2, byte arg3) {
        if (arg0 == 1) {
            this.field2300 = arg1.method1045(true);
            if (this.field2300 == 65535) {
                this.field2300 = -1;
            }
        } else if (arg0 == 2) {
            this.field2292 = arg1.method1045(true) + 1;
            this.field2296 = arg1.method1045(true) + 1;
        } else if (arg0 == 3) {
            arg1.method1062(arg3 - 21286);
        } else if (arg0 == 4) {
            this.field2295 = arg1.method1032((byte) -33);
        } else if (arg0 == 5) {
            this.field2288 = arg1.method1032((byte) -33);
        } else if (arg0 == 6) {
            this.field2293 = true;
        } else if (arg0 == 7) {
            this.field2289 = true;
        }
        field2290++;
        if (arg3 != 98) {
            field2291 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILgw;)V")
    public final void method1112(int arg0, int arg1, class148 arg2) {
        field2299++;
        if (arg0 != 5) {
            field2294 = null;
        }
        while (true) {
            int var4 = arg2.method1032((byte) -33);
            if (var4 == 0) {
                return;
            }
            this.method1111(var4, arg2, arg1, (byte) 98);
        }
    }
}
