import java.util.Random;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class117 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lsg;")
    public static class30 field2298 = class167.method1221((byte) 33, "Untersuchen");

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Lsg;")
    public static class30 field2300 = class167.method1221((byte) 33, "overlay");

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lb;")
    public static class48 field2302 = new class48();

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lsg;")
    private static class30 field2306 = class167.method1221((byte) 33, "flash3:");

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field2305 = 3353893;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lsg;")
    public static class30 field2304 = class167.method1221((byte) 33, " <col=ffff00>");

    @OriginalMember(owner = "client!d", name = "m", descriptor = "[I")
    public static int[] field2308 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field2307 = 0;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "[I")
    public static int[] field2309 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lsg;")
    public static class30 field2312 = field2306;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Lsg;")
    public static class30 field2313 = class167.method1221((byte) 33, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Lsg;")
    public static class30 field2315 = class167.method1221((byte) 33, "(U5");

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field2316 = 0;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Lsg;")
    public static class30 field2317 = class167.method1221((byte) 33, "Versteckt");

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lsg;")
    public static class30 field2310 = field2306;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field2314 = 0;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field2318 = 0;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2296;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "[I")
    public static int[] field2311;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method900(int arg0) {
        field2309 = null;
        field2300 = null;
        field2311 = null;
        field2308 = null;
        field2310 = null;
        field2315 = null;
        field2317 = null;
        field2312 = null;
        field2304 = null;
        field2298 = null;
        field2313 = null;
        if (arg0 != 0) {
            method901(127, 48, -60, (class151) null);
        }
        field2302 = null;
        field2306 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIILmc;)[Lnb;")
    public static final class265[] method901(int arg0, int arg1, int arg2, class151 arg3) {
        field2297++;
        if (class224.method1608(arg0, arg2, arg3, 0)) {
            if (arg1 > -118) {
                method901(84, -25, 61, (class151) null);
            }
            return class269.method1845((byte) -67);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([BILaa;)V")
    public final void method902(byte[] arg0, int arg1, class8 arg2) {
        field2299++;
        if (arg2.field124[arg2.field146] != 31 || arg2.field124[arg2.field146 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2296 == null) {
            this.field2296 = new Inflater(true);
        }
        try {
            this.field2296.setInput(arg2.field124, arg2.field146 + 10, -arg2.field146 + -10 - (arg1 - arg2.field124.length));
            this.field2296.inflate(arg0);
        } catch (Exception var4) {
            this.field2296.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2296.reset();
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[B")
    public static final byte[] method903(int arg0, int arg1) {
        field2301++;
        if (arg0 != 512) {
            field2311 = null;
        }
        class191 var2 = (class191) class160.field3006.method174((long) arg1, (byte) -117);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class256.method1779(127, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class191(var3);
            class160.field3006.method169(var2, arg0 ^ 0xFFFFFD90, (long) arg1);
        }
        return var2.field3478;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V")
    private class117(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class117() {
        this(-1, 1000000, 1000000);
    }
}
