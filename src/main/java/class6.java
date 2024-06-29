import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 implements Runnable {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Z")
    public boolean field285 = true;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field290 = new Object();

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "[I")
    public int[] field299 = new int[500];

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public int field295 = 0;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "[I")
    public int[] field300 = new int[500];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Ljd;")
    public static class92 field287 = class202.method1325((byte) 90, ":trade:");

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[Lcb;")
    public static class23[] field292 = new class23[50];

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "[I")
    public static int[] field294 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "La;")
    public static class1 field298 = null;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field293 = new CRC32();

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "Ljd;")
    private static class92 field303 = class202.method1325((byte) 90, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Ljd;")
    public static class92 field302 = field303;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Ljd;")
    public static class92 field301 = class202.method1325((byte) 90, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Ljd;")
    public static class92 field305 = class202.method1325((byte) 90, "jlv");

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field304 = 0;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "B")
    public static byte field291;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B[BI)I")
    public static final int method39(byte arg0, byte[] arg1, int arg2) {
        field296++;
        if (arg0 >= -120) {
            method43((byte) 67);
        }
        return class43.method272(arg2, 0, (byte) 127, arg1);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lh;I)V")
    public static final void method40(class70 arg0, int arg1) {
        if (class55.field1153 != null) {
            try {
                class55.field1153.method778(arg1 ^ 0xFFFFFFF8, 0L);
                class55.field1153.method770(arg0.field1493, 24, arg1 ^ 0x45, arg0.field1472);
            } catch (Exception var2) {
            }
        }
        field297++;
        arg0.field1472 += 24;
        if (arg1 != 0) {
            field291 = 124;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
    public static final void method41(int arg0, int arg1, int arg2, int arg3) {
        class43 var4 = class31.field698[arg0][arg1][arg2];
        if (var4 != null) {
            class31.field698[arg0][arg1][arg2].field971 = arg3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static final void method42(byte arg0) {
        field288++;
        if (class47.field1022 != null) {
            class47.field1022.method825(4);
        }
        if (class177.field3404 != null) {
            class177.field3404.method825(4);
        }
        if (arg0 > -18) {
            method42((byte) -81);
        }
    }

    @OriginalMember(owner = "client!ae", name = "run", descriptor = "()V")
    public final void run() {
        field286++;
        while (this.field285) {
            Object var1 = this.field290;
            synchronized (this.field290) {
                if (this.field295 < 500) {
                    this.field300[this.field295] = class29.field641;
                    this.field299[this.field295] = class192.field3756;
                    this.field295++;
                }
            }
            class58.method357(-24534, 50L);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
    public static final void method43(byte arg0) {
        class143.field2836.method329(32);
        field289++;
        for (int var1 = 0; var1 < 32; var1++) {
            class159.field3166[var1] = 0L;
        }
        int var2 = -86 % ((arg0 - 48) / 41);
        for (int var3 = 0; var3 < 32; var3++) {
            class197.field3851[var3] = 0L;
        }
        class159.field3151 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static void method44(boolean arg0) {
        field298 = null;
        field305 = null;
        field292 = null;
        field303 = null;
        field301 = null;
        field287 = null;
        if (!arg0) {
            field302 = null;
        }
        field302 = null;
        field294 = null;
        field293 = null;
    }
}
