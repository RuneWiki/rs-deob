import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class153 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2938 = 0;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lig;")
    public static class93 field2940 = new class93(64);

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Lvd;")
    public static class222 field2947 = class212.method1357("leuchten3:", 10731);

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Lvd;")
    private static class222 field2948 = class212.method1357("Use", 10731);

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lvd;")
    public static class222 field2946 = field2948;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lve;")
    public static class223 field2941;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2937;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static final void method980(byte arg0) {
        if (class47.field963 != null) {
            class47.field963.method200(-36);
        }
        if (class72.field1407 != null) {
            class72.field1407.method200(-103);
        }
        int var1 = 45 / ((-arg0 - 47) / 55);
        field2943++;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class153() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)I")
    public static final int method981(boolean arg0, int arg1) {
        if (arg0) {
            field2942++;
            return arg1 >> 11 & 0x3F;
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lka;[BI)V")
    public final void method982(class109 arg0, byte[] arg1, int arg2) {
        field2944++;
        if (arg0.field2006[arg0.field2053] != 31 || arg0.field2006[arg0.field2053 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2937 == null) {
            this.field2937 = new Inflater(true);
        }
        try {
            this.field2937.setInput(arg0.field2006, arg0.field2053 + 10, arg0.field2006.length + -arg0.field2053 + -18);
            this.field2937.inflate(arg1);
        } catch (Exception var4) {
            this.field2937.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2937.reset();
        if (arg2 != 0) {
            field2941 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IJ)V")
    public static final void method983(int arg0, long arg1) {
        field2945++;
        if (arg1 == 0L) {
            return;
        }
        if (class113.field2131 >= 100) {
            class160.method1007(false, class131.field2541, class29.field646, 0);
            return;
        }
        class222 var3 = class204.method1317((byte) -126, arg1).method1409(-7899);
        for (int var4 = 0; var4 < class113.field2131; var4++) {
            if (class64.field1173[var4] == arg1) {
                class160.method1007(false, class234.method1531(new class222[] { var3, class127.field2453 }, -10949), class29.field646, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class86.field1630; var5++) {
            if (class116.field2210[var5] == arg1) {
                class160.method1007(false, class234.method1531(new class222[] { class140.field2710, var3, class188.field3483 }, -10949), class29.field646, 0);
                return;
            }
        }
        if (var3.method1454(class17.field432.field853, true)) {
            class160.method1007(false, class228.field4271, class29.field646, 0);
            return;
        }
        class26.field592++;
        class64.field1173[class113.field2131] = arg1;
        class82.field1581[class113.field2131++] = class204.method1317((byte) 61, arg1);
        class68.field1283 = class28.field616;
        if (arg0 <= -23) {
            class42.field895.method1347((byte) -64, 160);
            class42.field895.method668(arg1, 8);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method984(int arg0) {
        field2948 = null;
        field2940 = null;
        field2947 = null;
        field2941 = null;
        if (arg0 > -28) {
            method981(true, 61);
        }
        field2946 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)V")
    public static final void method985(byte arg0, int arg1) {
        field2939++;
        if (class59.field1099 == 0) {
            class18.field435.method1065(arg1, (byte) -99);
        } else {
            class174.field3270 = arg1;
        }
        if (arg0 != -39) {
            field2941 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(III)V")
    private class153(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Le;IIIII)V")
    public static final void method986(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class184.field3411 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class126.field2409) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class181.field3357 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class121 var14 = class204.field3800[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class80.field1544[var11][var12 + 1][var13] + class80.field1544[var11][var12][var13] + class80.field1544[var11][var12][var13 + 1] + class80.field1544[var11][var12 + 1][var13 + 1]) / 4 - (class80.field1544[arg1][arg2 + 1][arg3] + class80.field1544[arg1][arg2][arg3] + class80.field1544[arg1][arg2][arg3 + 1] + class80.field1544[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class94 var16 = var14.field2306;
                                    if (var16 != null) {
                                        if (var16.field1764.method331()) {
                                            arg0.method333(var16.field1764, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1771 != null && var16.field1771.method331()) {
                                            arg0.method333(var16.field1771, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2299; var17++) {
                                        class23 var18 = var14.field2297[var17];
                                        if (var18 != null && var18.field543.method331() && (var18.field534 == var12 || var7 == var12) && (var18.field539 == var13 || var9 == var13)) {
                                            int var19 = var18.field549 + 1 - var18.field534;
                                            int var20 = var18.field535 + 1 - var18.field539;
                                            arg0.method333(var18.field543, (var18.field534 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field539 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
