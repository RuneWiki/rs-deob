import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class197 {

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[J")
    public static long[] field3095 = new long[32];

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field3094 = -1;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "[[B")
    public static byte[][] field3101;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II[Lag;)V")
    public static final void method1317(int arg0, int arg1, class188[] arg2) {
        field3099++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class188 var5 = arg2[var3];
            if (var5 != null) {
                if (var5.field2937 == 0) {
                    if (var5.field2968 != null) {
                        method1317(-104, arg1, var5.field2968);
                    }
                    class120 var6 = (class120) class13.field230.method1414(true, (long) var5.field2977);
                    if (var6 != null) {
                        class205.method1374(var6.field1852, arg1, 1);
                    }
                }
                if (arg1 == 0 && var5.field2898 != null) {
                    class39 var7 = new class39();
                    var7.field647 = var5.field2898;
                    var7.field657 = var5;
                    class243.method1648((byte) 59, var7);
                }
                if (arg1 == 1 && var5.field2873 != null) {
                    if (var5.field2856 >= 0) {
                        class188 var8 = class5.method57((byte) -99, var5.field2977);
                        if (var8 == null || var8.field2968 == null || var5.field2856 >= var8.field2968.length || var8.field2968[var5.field2856] != var5) {
                            continue;
                        }
                    }
                    class39 var9 = new class39();
                    var9.field647 = var5.field2873;
                    var9.field657 = var5;
                    class243.method1648((byte) 65, var9);
                }
            }
        }
        int var4 = 6 % ((arg0 - 2) / 56);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method1318(byte arg0) {
        field3101 = null;
        if (arg0 != -126) {
            method1319((class37) null, -111);
        }
        field3095 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lf;I)V")
    public static final void method1319(class37 arg0, int arg1) {
        byte[] var2 = new byte[24];
        if (arg1 < 115) {
            return;
        }
        field3098++;
        if (class243.field3763 != null) {
            try {
                class243.field3763.method1857(-32, 0L);
                class243.field3763.method1856(55, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method296(0, var2, 24, -20484);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
    public static final void method1320(boolean arg0, int arg1) {
        class253 var2 = class276.field4349;
        synchronized (class276.field4349) {
            class187.field2820 = arg1;
        }
        field3102++;
        if (!arg0) {
            method1319((class37) null, 90);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILuf;)V")
    public static final void method1321(int arg0, class176 arg1) {
        class245.field3800 = arg1;
        field3096++;
        if (arg0 != 0) {
            method1321(66, (class176) null);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B[I)[I")
    public static final int[] method1322(byte arg0, int[] arg1) {
        field3092++;
        if (arg1 == null) {
            return null;
        }
        int[] var2 = new int[arg1.length];
        if (arg0 == -1) {
            class236.method1585(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return null;
        }
    }
}
