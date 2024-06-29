import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class442 {

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field6209;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field6212 = 100;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "[I")
    public static int[] field6215 = new int[1000];

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field6206 = 0;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "[I")
    public static int[] field6205;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Ljava/lang/String;", line = 11)
    public final String method2763(int arg0, int arg1) {
        field6214++;
        int var3 = -55 / ((-arg0 - 26) / 48);
        return this.field6209[arg1];
    }

    @OriginalMember(owner = "client!kn", name = "toString", descriptor = "()Ljava/lang/String;", line = 28)
    public final String toString() {
        field6208++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 47)
    public static void method2764(int arg0) {
        field6205 = null;
        if (arg0 <= -89) {
            field6215 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)V", line = 86)
    public static final void method2765(boolean arg0, int arg1) {
        field6213++;
        byte[][] var2;
        if (arg0) {
            var2 = class67.field1014;
        } else {
            var2 = class161.field2249;
        }
        if (arg1 < 61) {
            return;
        }
        int var3 = class247.field3495.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class155.field2191[var4] >> 8) * 64 - class212.field2968;
                int var7 = (class155.field2191[var4] & 0xFF) * 64 - class447.field6269;
                class285.method1860(12);
                class243.method1649(arg0, var7, class64.field949, class426.field5999, var6, 1, var5);
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILko;)V", line = 134)
    public static final void method2766(int arg0, class294 arg1) {
        field6219++;
        class361.field5000 = 3;
        class34.method337(true, (byte) 120);
        class70.field1032 = true;
        class133.field1904 = true;
        class312.field4271 = true;
        class403.field5720 = arg0;
        class54.field755 = true;
        class61.field845 = true;
        class205.field2824 = 0;
        class64.field886 = true;
        class52.field731 = 255;
        class345.field4692 = 127;
        class306.field4224 = 0;
        class237.field3369 = 1;
        class414.field5867 = true;
        class371.field5212 = 127;
        class327.field4508 = 2;
        class53.field741 = 0;
        class106.field1472 = true;
        class171.field2346 = true;
        class154.field2169 = true;
        if (class445.field6242 < 96) {
            class244.method1654(0, 0);
        } else {
            class244.method1654(arg0, 2);
        }
        class42.field614 = 0;
        class392.field5610 = false;
        class251.field3544 = 2;
        class133.field1916 = false;
        class405.field5762 = 0;
        class288.field4049 = false;
        class175.field2397 = true;
        class214.field2988 = true;
        class411.field5840 = class71.field1038 == 1 ? 2 : 4;
        class284.field4010 = 2;
        class199 var2 = null;
        try {
            class283 var3 = arg1.method1906(2);
            while (var3.field3998 == 0) {
                class349.method2219(1L, -47);
            }
            if (var3.field3998 == 1) {
                var2 = (class199) var3.field3999;
                byte[] var4 = new byte[(int) var2.method1303(-15)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1302(var5, var4, var4.length - var5, 0);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class425.method2686(new class11(var4), -8);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1304(arg0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)Lms;", line = 223)
    public static final class453 method2767(int arg0, int arg1) {
        field6210++;
        if (arg1 != -1229996208) {
            field6211 = -51;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class143.field2057[var2] == null || class143.field2057[var2][var3] == null) {
            boolean var4 = class16.method238(var2, 21);
            if (!var4) {
                return null;
            }
        }
        return class143.field2057[var2][var3];
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 273)
    public static final void method2768(long[] arg0, int arg1, Object[] arg2) {
        field6216++;
        class218.method1408(arg0, (byte) -126, arg0.length - 1, arg2, arg1);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;", line = 302)
    public static final String[] method2769(String[] arg0, byte arg1) {
        field6217++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        int var4 = 47 / ((7 - arg1) / 45);
        return var2;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BZ)V", line = 326)
    public static final void method2770(byte arg0, boolean arg1) {
        field6218++;
        if (class222.field3108 == null) {
            class222.field3108 = new byte[4][class211.field2954][class290.field4061];
        }
        if (arg1) {
            field6215 = null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class211.field2954; var3++) {
                for (int var4 = 0; var4 < class290.field4061; var4++) {
                    class222.field3108[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 362)
    public class442(String arg0, String arg1, String arg2, String arg3) {
        this.field6209 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
