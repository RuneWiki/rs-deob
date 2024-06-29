import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class127 extends class7 {

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2093 = 0;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Lic;")
    public static class160 field2095 = new class160(64);

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2103 = null;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2101 = "Unable to find ";

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lsb;")
    public static class124 field2104;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[[[B")
    public static byte[][][] field2098;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvj;")
    public static final class174 method926(Throwable arg0, String arg1) {
        class174 var2;
        if ((arg0 instanceof class174)) {
            var2 = (class174) arg0;
            var2.field2937 = var2.field2937 + ' ' + arg1;
        } else {
            var2 = new class174(arg0, arg1);
        }
        field2100++;
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method927(byte arg0) {
        field2103 = null;
        if (arg0 < -93) {
            field2104 = null;
            field2101 = null;
            field2095 = null;
            field2098 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lmk;Z)V")
    public static final void method928(class213 arg0, boolean arg1) {
        field2099++;
        class132 var2 = (class132) class269.field4315.method1063((byte) -37, class260.method1739(arg1, arg0.field3445));
        if (var2 == null) {
            return;
        }
        if (var2.field2205 != null) {
            class145.field2394.method1242(var2.field2205);
            var2.field2205 = null;
        }
        var2.method1074((byte) -122);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB[BI)Z")
    public static final boolean method929(int arg0, byte arg1, byte[] arg2, int arg3) {
        field2097++;
        boolean var4 = true;
        class136 var5 = new class136(arg2);
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method1020(true);
            if (var7 == 0) {
                if (arg1 != 27) {
                    field2104 = null;
                }
                return var4;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                int var12;
                class248 var16;
                do {
                    int var13;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var5.method1004(122);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method1012(4);
                                    }
                                    int var10 = var5.method1004(122);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var9 += var10 - 1;
                                    int var11 = var9 & 0x3F;
                                    var12 = var5.method1012(4) >> 2;
                                    var13 = arg0 + var11;
                                    int var14 = (var9 & 0xFEE) >> 6;
                                    var15 = arg3 + var14;
                                } while (var15 <= 0);
                            } while (var13 <= 0);
                        } while (var15 >= 103);
                    } while (var13 >= 103);
                    var16 = class46.method396(var6, (byte) 63);
                } while (var12 == 22 && !class151.field2470 && var16.field3936 == 0 && var16.field3892 != 1 && !var16.field3930);
                var8 = true;
                if (!var16.method1649(arg1 - 27)) {
                    class161.field2631++;
                    var4 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IJ)V")
    public static final void method930(int arg0, long arg1) {
        field2094++;
        if (arg1 == 0L) {
            return;
        }
        class87.field1405.method607(174, (byte) 102);
        class87.field1405.method967((byte) -8, arg1);
        if (arg0 == -8071) {
            class161.field2638++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IJ)V")
    public static final void method931(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 != -9114) {
                field2102 = -116;
            }
        } catch (InterruptedException var3) {
        }
        field2096++;
    }
}
