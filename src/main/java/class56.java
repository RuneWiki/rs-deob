import java.util.zip.CRC32;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1242 = 0;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Loa;")
    private static class98 field1240 = class38.method349(255, "Loaded textures");

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Loa;")
    private static class98 field1241 = class38.method349(255, " seconds)3");

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Loa;")
    private static class98 field1244 = class38.method349(255, "No response from server)3");

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Loa;")
    public static class98 field1238 = field1241;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Loa;")
    public static class98 field1245 = field1240;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1248 = 0;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Loa;")
    public static class98 field1251 = field1244;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1247 = new CRC32();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "[J")
    public static long[] field1255 = new long[100];

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field1256 = 0;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Ltb;")
    public static class130 field1253;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lde;")
    public static class27 field1254;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Llf;")
    public static class82 field1252;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1250;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static final void method455(byte arg0) {
        field1249++;
        if (class63.field1344 == 0) {
            return;
        }
        if (arg0 <= 125) {
            field1247 = null;
        }
        int var1 = 0;
        if (class127.field2844 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class141.field3449[var2] != null) {
                int var3 = class148.field3670[var2];
                class98 var4 = class65.field1397[var2];
                if (var4 != null && var4.method792((byte) -84, class48.field1093)) {
                    var4 = var4.method781(0, 5);
                }
                if (var4 != null && var4.method792((byte) -84, class52.field1165)) {
                    var4 = var4.method781(0, 5);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class54.field1193 == 0 || class54.field1193 == 1 && class129.method1036(0, var4))) {
                    int var5 = 329 - var1 * 13;
                    if (class42.field990 > 4 && var5 - 10 < class123.field2749 + -4 && class123.field2749 - 4 <= var5 - -3) {
                        int var6 = class97.field2231.method398(class102.method840(new class98[] { class114.field2574, class18.field396, var4, class141.field3449[var2] }, 10)) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (var6 + 4 > class42.field990) {
                            class118.field2645++;
                            class67.field1427++;
                            if (class33.field823 >= 1) {
                                class91.field2086++;
                                class118.method935(0, class75.field1630, 2004, -23060, 0, class102.method840(new class98[] { class146.field3549, var4 }, 10), 0);
                            }
                            class118.method935(0, class105.field2412, 2057, -23060, 0, class102.method840(new class98[] { class146.field3549, var4 }, 10), 0);
                            class118.method935(0, class91.field2089, 2018, -23060, 0, class102.method840(new class98[] { class146.field3549, var4 }, 10), 0);
                        }
                    }
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class54.field1193 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lb;[BI)V")
    public final void method456(class8 arg0, byte[] arg1, int arg2) {
        field1243++;
        if (arg0.field132[arg0.field182] != 31 || arg0.field132[arg0.field182 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1250 == null) {
            this.field1250 = new Inflater(true);
        }
        try {
            if (arg2 != -14291) {
                this.method456(null, null, 16);
            }
            this.field1250.setInput(arg0.field132, arg0.field182 + 10, arg0.field132.length - 8 - (arg0.field182 + 10));
            this.field1250.inflate(arg1);
        } catch (Exception var4) {
            this.field1250.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1250.reset();
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Z")
    public static final boolean method457(int arg0) {
        field1246++;
        class16 var1 = class141.field3436;
        synchronized (class141.field3436) {
            if (class30.field697 == class15.field315) {
                return false;
            }
            class42.field985 = class1.field3[class30.field697];
            class4.field66 = class149.field3676[class30.field697];
            int var3 = -90 % ((77 - arg0) / 32);
            class30.field697 = class30.field697 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class56() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static void method458(int arg0) {
        field1255 = null;
        field1251 = null;
        field1245 = null;
        field1240 = null;
        field1253 = null;
        field1241 = null;
        if (arg0 != 7) {
            method455((byte) 42);
        }
        field1238 = null;
        field1247 = null;
        field1252 = null;
        field1244 = null;
        field1254 = null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III)V")
    private class56(int arg0, int arg1, int arg2) {
    }
}
