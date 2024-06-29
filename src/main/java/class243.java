import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class243 {

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Ldf;")
    public static class51 field4211 = class46.method233(")3runescape)3com)4l=", 100);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4206 = -1;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lwc;")
    public static class213 field4207 = null;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lwc;")
    public static class213 field4205;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lwc;")
    public static class213 field4212;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4213;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III[Lnf;)V")
    public static final void method1662(int arg0, int arg1, int arg2, class149[] arg3) {
        field4204++;
        if (arg2 != 1 || arg1 >= arg0) {
            return;
        }
        int var4 = arg0 + 1;
        int var5 = arg1 - 1;
        int var6 = (arg1 + arg0) / 2;
        class149 var7 = arg3[var6];
        arg3[var6] = arg3[arg1];
        arg3[arg1] = var7;
        while (var5 < var4) {
            boolean var8 = true;
            do {
                var4--;
                for (int var9 = 0; var9 < 4; var9++) {
                    int var10;
                    int var11;
                    if (class204.field3405[var9] == 2) {
                        var10 = arg3[var4].field2491;
                        var11 = var7.field2491;
                    } else if (class204.field3405[var9] == 1) {
                        var10 = arg3[var4].field2499;
                        if (var10 == -1 && class109.field1850[var9] == 1) {
                            var10 = 2001;
                        }
                        var11 = var7.field2499;
                        if (var11 == -1 && class109.field1850[var9] == 1) {
                            var11 = 2001;
                        }
                    } else if (class204.field3405[var9] == 3) {
                        var11 = var7.field2496 ? 1 : 0;
                        var10 = arg3[var4].field2496 ? 1 : 0;
                    } else {
                        var10 = arg3[var4].field2495;
                        var11 = var7.field2495;
                    }
                    if (var10 != var11) {
                        if ((class109.field1850[var9] != 1 || var10 <= var11) && (class109.field1850[var9] != 0 || var11 <= var10)) {
                            var8 = false;
                        }
                        break;
                    }
                    if (var9 == 3) {
                        var8 = false;
                    }
                }
            } while (var8);
            boolean var12 = true;
            do {
                var5++;
                for (int var13 = 0; var13 < 4; var13++) {
                    int var14;
                    int var15;
                    if (class204.field3405[var13] == 2) {
                        var14 = arg3[var5].field2491;
                        var15 = var7.field2491;
                    } else if (class204.field3405[var13] == 1) {
                        var14 = arg3[var5].field2499;
                        var15 = var7.field2499;
                        if (var15 == -1 && class109.field1850[var13] == 1) {
                            var15 = 2001;
                        }
                        if (var14 == -1 && class109.field1850[var13] == 1) {
                            var14 = 2001;
                        }
                    } else if (class204.field3405[var13] == 3) {
                        var15 = var7.field2496 ? 1 : 0;
                        var14 = arg3[var5].field2496 ? 1 : 0;
                    } else {
                        var15 = var7.field2495;
                        var14 = arg3[var5].field2495;
                    }
                    if (var14 != var15) {
                        if ((class109.field1850[var13] != 1 || var14 >= var15) && (class109.field1850[var13] != 0 || var14 <= var15)) {
                            var12 = false;
                        }
                        break;
                    }
                    if (var13 == 3) {
                        var12 = false;
                    }
                }
            } while (var12);
            if (var4 > var5) {
                class149 var16 = arg3[var5];
                arg3[var5] = arg3[var4];
                arg3[var4] = var16;
            }
        }
        method1662(var4, arg1, 1, arg3);
        method1662(arg0, var4 + 1, 1, arg3);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1663(int arg0) {
        field4211 = null;
        field4207 = null;
        field4212 = null;
        if (arg0 != 0) {
            field4211 = null;
        }
        field4205 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([BLlb;I)V")
    public final void method1664(byte[] arg0, class121 arg1, int arg2) {
        field4210++;
        if (arg1.field2014[arg1.field2026] != 31 || arg1.field2014[arg1.field2026 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4213 == null) {
            this.field4213 = new Inflater(true);
        }
        try {
            this.field4213.setInput(arg1.field2014, arg1.field2026 + 10, -18 - (arg1.field2026 - arg1.field2014.length));
            if (arg2 != 0) {
                return;
            }
            this.field4213.inflate(arg0);
        } catch (Exception var4) {
            this.field4213.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4213.reset();
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class243() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(III)V")
    private class243(int arg0, int arg1, int arg2) {
    }
}
