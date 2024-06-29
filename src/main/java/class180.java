import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class180 {

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2822 = "Ok";

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2828 = "Loading...";

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field2830 = 7759444;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lub;")
    public static class92 field2818;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2825;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[Lel;")
    public static class213[] field2819;

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class180() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lha;[BI)V")
    public final void method1286(class31 arg0, byte[] arg1, int arg2) {
        field2821++;
        if (arg2 != -9) {
            field2820 = -16;
        }
        if (arg0.field560[arg0.field541] != 31 || arg0.field560[arg0.field541 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2825 == null) {
            this.field2825 = new Inflater(true);
        }
        try {
            this.field2825.setInput(arg0.field560, arg0.field541 + 10, -arg0.field541 - 10 + arg0.field560.length + -8);
            this.field2825.inflate(arg1);
        } catch (Exception var4) {
            this.field2825.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2825.reset();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static void method1287(byte arg0) {
        int var1 = 86 % ((arg0 - 74) / 34);
        field2822 = null;
        field2828 = null;
        field2818 = null;
        field2819 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ[Lcc;)V")
    public static final void method1288(int arg0, boolean arg1, class222[] arg2) {
        field2829++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class222 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field3552 == 0) {
                    if (var4.field3526 != null) {
                        method1288(arg0, true, var4.field3526);
                    }
                    class288 var5 = (class288) class48.field787.method2043((long) var4.field3554, -1);
                    if (var5 != null) {
                        class112.method829(-65, arg0, var5.field4505);
                    }
                }
                if (arg0 == 0 && var4.field3455 != null) {
                    class26 var6 = new class26();
                    var6.field453 = var4;
                    var6.field450 = var4.field3455;
                    class15.method116(8, var6);
                }
                if (arg0 == 1 && var4.field3528 != null) {
                    if (var4.field3411 >= 0) {
                        class222 var7 = class169.method1217(var4.field3554, 12180);
                        if (var7 == null || var7.field3526 == null || var4.field3411 >= var7.field3526.length || var7.field3526[var4.field3411] != var4) {
                            continue;
                        }
                    }
                    class26 var8 = new class26();
                    var8.field450 = var4.field3528;
                    var8.field453 = var4;
                    class15.method116(8, var8);
                }
            }
        }
        if (!arg1) {
            method1288(-115, true, (class222[]) null);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V")
    public static final void method1289(byte arg0) {
        field2823++;
        int var1 = 26 % ((arg0 - 42) / 34);
        int var2 = 0;
        for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                if (class159.method1141(var4, (byte) -90, true, var2, var3, class149.field2210)) {
                    var2++;
                }
                if (var2 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V")
    public static final void method1290(byte arg0) {
        class236.field3728.method179((byte) -13);
        class220.field3361 = null;
        field2824++;
        class105.field1640 = 1;
        if (arg0 <= 104) {
            method1288(63, true, (class222[]) null);
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(III)V")
    private class180(int arg0, int arg1, int arg2) {
    }
}
