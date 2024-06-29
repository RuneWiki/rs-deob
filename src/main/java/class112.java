import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class112 {

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lcd;")
    private static class23 field2364 = class54.method414("Walk here", -1);

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Lcd;")
    private static class23 field2363 = class54.method414("Please reload this page)3", -1);

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lcd;")
    public static class23 field2366 = class54.method414("::", -1);

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Lcd;")
    public static class23 field2362 = field2363;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Lcd;")
    public static class23 field2371 = class54.method414("scrollen:", -1);

    @OriginalMember(owner = "client!me", name = "o", descriptor = "[I")
    public static int[] field2372 = new int[100];

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lcd;")
    public static class23 field2370 = class54.method414("", -1);

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lcd;")
    public static class23 field2367 = field2364;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lgd;")
    public static class58 field2360;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2365;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIZI)V")
    public static final void method718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field2358++;
        if (class82.method556(arg8, (byte) -7)) {
            if (arg7) {
                field2363 = null;
            }
            class56.field1309 = null;
            class34.method247(arg4, arg5, arg2, arg1, -1, arg6, arg0, class100.field2114[arg8], -110, arg3);
            if (class56.field1309 != null) {
                class34.method247(arg4, arg5, arg2, class48.field1162, -1412584499, arg6, class135.field2807, class56.field1309, -118, arg3);
                class56.field1309 = null;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class172.field3412[var9] = true;
            }
        } else {
            class172.field3412[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static final void method719(int arg0) {
        field2368++;
        if (arg0 != 8) {
            method720(-125);
        }
        if (!class103.field2202) {
            return;
        }
        class12.field241 = null;
        class156.field3125 = null;
        class3.field37 = null;
        class124.field2545 = null;
        class29.field617 = null;
        class56.field1314 = null;
        class74.field1678 = null;
        class116.field2419 = null;
        class31.field676 = null;
        class163.field3267 = null;
        class113.field2378 = null;
        class169.field3377 = null;
        class202.field3995 = null;
        class107.field2290 = null;
        class138.field2848 = null;
        class183.field3606 = null;
        class103.field2190 = null;
        class54.field1274 = null;
        class35.field711 = null;
        class163.field3263 = null;
        class94.field1979 = null;
        class34.field702 = null;
        class121.method754(2, (byte) -67);
        class115.method733((byte) 99, true);
        class103.field2202 = false;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method720(int arg0) {
        field2363 = null;
        field2371 = null;
        field2364 = null;
        if (arg0 != 16959) {
            field2364 = null;
        }
        field2372 = null;
        field2370 = null;
        field2366 = null;
        field2362 = null;
        field2360 = null;
        field2367 = null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(III)V")
    private class112(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B[BLva;)V")
    public final void method721(byte arg0, byte[] arg1, class189 arg2) {
        field2369++;
        if (arg2.field3753[arg2.field3752] != 31 || arg2.field3753[arg2.field3752 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2365 == null) {
            this.field2365 = new Inflater(true);
        }
        try {
            this.field2365.setInput(arg2.field3753, arg2.field3752 + 10, -arg2.field3752 - (18 - arg2.field3753.length));
            this.field2365.inflate(arg1);
        } catch (Exception var4) {
            this.field2365.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg0 != -56) {
            field2363 = null;
        }
        this.field2365.reset();
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class112() {
        this(-1, 1000000, 1000000);
    }
}
