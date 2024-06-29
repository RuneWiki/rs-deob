import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class123 extends class17 {

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field2965 = 0;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "Lmb;")
    public static class84 field2964 = class79.method672(true, "Side panel redrawn");

    @OriginalMember(owner = "client!se", name = "J", descriptor = "[I")
    public static int[] field2972 = new int[500];

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field2980 = 2;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "Lmb;")
    private static class84 field2979 = class79.method672(true, "Loading friend list");

    @OriginalMember(owner = "client!se", name = "I", descriptor = "Lmb;")
    public static class84 field2971 = field2979;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2970 = new CRC32();

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public static int field2983 = -1;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "Lmb;")
    private static class84 field2986 = class79.method672(true, "Private chat");

    @OriginalMember(owner = "client!se", name = "V", descriptor = "Lmb;")
    public static class84 field2984 = field2986;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "[I")
    public static int[] field2988 = new int[4000];

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
    public static int field2987 = 128;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Lsd;")
    public static class122 field2973;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "[I")
    public int[] field2963;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "[I")
    public int[] field2976;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "[I")
    public int[] field2985;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "[Lmc;")
    public class85[] field2962;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "[Lmc;")
    public class85[] field2975;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "[[[B")
    public byte[][][] field2967;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIBI)I")
    public static final int method1015(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 / arg3;
        field2969++;
        int var5 = arg3 - 1 & arg1;
        int var6 = arg0 / arg3;
        int var7 = arg0 & arg3 - 1;
        int var8 = class127.method1038(var4, var6, 128);
        int var9 = class127.method1038(var4 + 1, var6, 128);
        int var10 = class127.method1038(var4, var6 + 1, 128);
        int var11 = class127.method1038(var4 + 1, var6 + 1, 128);
        if (arg2 > -48) {
            field2965 = -89;
        }
        int var12 = class88.method750(arg3, var9, var5, var8, 2087664304);
        int var13 = class88.method750(arg3, var11, var5, var10, 2087664304);
        return class88.method750(arg3, var13, var7, var12, 2087664304);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)I")
    public static final int method1016(byte arg0) {
        field2982++;
        int var1 = class41.method309((byte) 64, class33.field733, class59.field1463, class13.field251);
        if (arg0 >= -13) {
            return 0;
        } else if (var1 - class64.field1575 >= 800 || (class62.field1540[class13.field251][class33.field733 >> 7][class59.field1463 >> 7] & 0x4) == 0) {
            return 3;
        } else {
            return class13.field251;
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V")
    public static final void method1017(int arg0) {
        for (int var1 = 0; var1 < class122.field2934; var1++) {
            int var10002 = class39.field888[var1]--;
            if (class39.field888[var1] >= -10) {
                class9 var4 = class111.field2676[var1];
                if (var4 == null) {
                    var4 = class9.method49(class120.field2870, class50.field1069[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class39.field888[var1] += var4.method51();
                    class111.field2676[var1] = var4;
                }
                if (class39.field888[var1] < 0) {
                    int var11;
                    if (class1.field6[var1] == 0) {
                        var11 = class49.field1051;
                    } else {
                        int var5 = (class1.field6[var1] & 0xFF) * 128;
                        int var6 = class1.field6[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class40.field925.field3549;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class1.field6[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class40.field925.field3535;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var9 + var7 - 128;
                        if (var5 < var10) {
                            class39.field888[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var11 = (var5 - var10) * class140.field3359 / var5;
                    }
                    class29 var12 = var4.method50().method224(class51.field1129);
                    class61 var13 = class61.method557(var12, 100, var11);
                    var13.method556(class52.field1182[var1] - 1);
                    class60.field1490.method1082(var13);
                    class39.field888[var1] = -100;
                }
            } else {
                class122.field2934--;
                for (int var3 = var1; var3 < class122.field2934; var3++) {
                    class50.field1069[var3] = class50.field1069[var3 + 1];
                    class111.field2676[var3] = class111.field2676[var3 + 1];
                    class52.field1182[var3] = class52.field1182[var3 + 1];
                    class39.field888[var3] = class39.field888[var3 + 1];
                    class1.field6[var3] = class1.field6[var3 + 1];
                }
                var1--;
            }
        }
        int var2 = 121 % ((arg0 - 33) / 33);
        field2977++;
        if (class76.field1920 && !class10.method56(0)) {
            if (class128.field3096 != 0 && class90.field2244 != -1) {
                class76.method653(class27.field655, class90.field2244, false, class128.field3096, 0, (byte) 88);
            }
            class76.field1920 = false;
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
    public static void method1018(byte arg0) {
        field2972 = null;
        field2988 = null;
        field2973 = null;
        field2984 = null;
        field2979 = null;
        if (arg0 != -111) {
            method1019(-16, null);
        }
        field2971 = null;
        field2970 = null;
        field2964 = null;
        field2986 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILnb;)V")
    public static final void method1019(int arg0, class90 arg1) {
        field2968++;
        if (arg0 != 16758643) {
            method1019(-114, null);
        }
        class63.field1556 = arg1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZ)V")
    public static final void method1020(int arg0, int arg1, boolean arg2) {
        field2961++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class43.field949 = arg2;
        if (arg1 == 1) {
            class1.field4 = arg0;
        }
    }
}
