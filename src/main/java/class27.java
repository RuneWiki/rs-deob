import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class27 {

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Lku;")
    private class232 field364 = new class232(64);

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lb;")
    private class201 field369;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Z")
    public static boolean field360 = false;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Ldk;")
    public static class326 field363 = new class326("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field367 = 1;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lba;")
    public static class240 field368 = new class240(16);

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "[I")
    public static int[] field371 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field366;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lvl;")
    public final class11 method194(int arg0, int arg1) {
        if (arg1 != 1) {
            field367 = -96;
        }
        field365++;
        class232 var3 = this.field364;
        class11 var4;
        synchronized (this.field364) {
            var4 = (class11) this.field364.method1479(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field369.method1257(arg0, 35, arg1 ^ 0x5FEF);
        class11 var6 = new class11();
        if (var5 != null) {
            var6.method46(arg1 - 78, new class276(var5));
        }
        var6.method42(0);
        class232 var7 = this.field364;
        synchronized (this.field364) {
            this.field364.method1473(var6, (long) arg0, arg1 - 61);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([Ldt;BI)V")
    public static final void method195(class145[] arg0, byte arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class145 var4 = arg0[var3];
            if (var4 != null && var4.field1947 == arg2 && !client.method1125(var4)) {
                if (var4.field2073 == 0) {
                    method195(arg0, (byte) 108, var4.field1933);
                    if (var4.field1943 != null) {
                        method195(var4.field1943, (byte) 91, var4.field1933);
                    }
                    class465 var5 = (class465) class146.field2146.method2761((long) var4.field1933, (byte) -112);
                    if (var5 != null) {
                        class89.method505(var5.field6502, (byte) -105);
                    }
                }
                if (var4.field2073 == 6 && var4.field1967 != -1) {
                    class153 var6 = class64.field836.method2081(var4.field1967, 0);
                    if (var6 != null) {
                        var4.field1990 += class332.field4840;
                        while (var6.field2275[var4.field2011] < var4.field1990) {
                            var4.field1990 -= var6.field2275[var4.field2011];
                            var4.field2011++;
                            if (var4.field2011 >= var6.field2254.length) {
                                var4.field2011 -= var6.field2255;
                                if (var4.field2011 < 0 || var4.field2011 >= var6.field2254.length) {
                                    var4.field2011 = 0;
                                }
                            }
                            var4.field2052 = var4.field2011 + 1;
                            if (var4.field2052 >= var6.field2254.length) {
                                var4.field2052 -= var6.field2255;
                                if (var4.field2052 < 0 || var4.field2052 >= var6.field2254.length) {
                                    var4.field2052 = -1;
                                }
                            }
                            class22.method148((byte) -78, var4);
                        }
                    }
                }
            }
        }
        field370++;
        if (arg1 <= 42) {
            field363 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static void method196(int arg0) {
        field366 = null;
        field363 = null;
        field371 = null;
        field368 = null;
        if (arg0 != 35) {
            method196(-82);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public final void method197(int arg0) {
        field359++;
        class232 var2 = this.field364;
        synchronized (this.field364) {
            this.field364.method1478((byte) -103);
            if (arg0 != 5) {
                this.method194(112, -12);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)V")
    public final void method198(int arg0, byte arg1) {
        class232 var3 = this.field364;
        synchronized (this.field364) {
            if (arg1 < 13) {
                field360 = true;
            }
            this.field364.method1486(438127120, arg0);
        }
        field361++;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        class232 var2 = this.field364;
        synchronized (this.field364) {
            this.field364.method1475(0);
        }
        field362++;
        if (arg0 != 4) {
            this.method198(13, (byte) -28);
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class27(class353 arg0, int arg1, class201 arg2) {
        this.field369 = arg2;
        if (this.field369 != null) {
            this.field369.method1235(0, 35);
        }
    }
}
