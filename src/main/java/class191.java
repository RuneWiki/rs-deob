import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class191 {

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field2746 = 0;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "[B")
    public static byte[] field2750 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "[I")
    public static int[] field2751 = new int[50];

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2742;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "[I")
    public static int[] field2753;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public static final void method1372(byte arg0) {
        field2745++;
        class417.field5851.method1810(arg0 ^ 0x23);
        int var1 = class417.field5851.method1808(1, arg0 - 11929);
        if (arg0 != 25) {
            method1372((byte) -72);
        }
        if (var1 == 0) {
            return;
        }
        int var2 = class417.field5851.method1808(2, -11904);
        if (var2 == 0) {
            class344.field4664[class166.field2464++] = 2047;
        } else if (var2 == 1) {
            int var3 = class417.field5851.method1808(3, -11904);
            class95.field1379.method2271(22419, var3, 1);
            int var4 = class417.field5851.method1808(1, -11904);
            if (var4 == 1) {
                class344.field4664[class166.field2464++] = 2047;
            }
        } else if (var2 == 2) {
            if (class417.field5851.method1808(1, -11904) == 1) {
                int var5 = class417.field5851.method1808(3, -11904);
                class95.field1379.method2271(22419, var5, 2);
                int var6 = class417.field5851.method1808(3, arg0 ^ 0xFFFFD199);
                class95.field1379.method2271(arg0 + 22394, var6, 2);
            } else {
                int var7 = class417.field5851.method1808(3, -11904);
                class95.field1379.method2271(22419, var7, 0);
            }
            int var8 = class417.field5851.method1808(1, -11904);
            if (var8 == 1) {
                class344.field4664[class166.field2464++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class417.field5851.method1808(1, -11904);
            if (var9 == 1) {
                class344.field4664[class166.field2464++] = 2047;
            }
            int var10 = class417.field5851.method1808(1, arg0 ^ 0xFFFFD199);
            int var11 = class417.field5851.method1808(7, -11904);
            class69.field1046 = class417.field5851.method1808(2, arg0 - 11929);
            int var12 = class417.field5851.method1808(7, arg0 - 11929);
            class95.field1379.method2149(var11, var10 == 1, class69.field1046, 109, var12);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILap;)Lno;")
    public static final class277 method1373(int arg0, class289 arg1) {
        field2748++;
        if (arg0 != 0) {
            method1374(79);
        }
        return new class277(arg1.method1833(84), arg1.method1833(arg0 + 41), arg1.method1833(arg0 + 124), arg1.method1833(40), arg1.method1880((byte) -82), arg1.method1861((byte) -72));
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static final void method1374(int arg0) {
        field2747++;
        class19.field374.method607(0);
        if (arg0 != 2) {
            field2751 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;CI)I")
    public static final int method1375(String arg0, char arg1, int arg2) {
        field2749++;
        if (arg2 <= 23) {
            method1377((byte) 14);
        }
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILpe;Lwe;IIIII)Lkb;")
    public static final class80 method1376(int arg0, class391 arg1, class24 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class185.field2691.field4871 = arg1.field5484;
        class185.field2691.field4863 = arg3;
        class185.field2691.field4861 = arg2 != null;
        class185.field2691.field4869 = arg5;
        class185.field2691.field4874 = arg6;
        class185.field2691.field4862 = arg4;
        field2752++;
        if (arg0 >= -26) {
            return null;
        } else {
            class185.field2691.field4864 = arg7;
            return (class80) class234.field3227.method2175(-18, class185.field2691);
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V")
    public static void method1377(byte arg0) {
        field2750 = null;
        field2753 = null;
        field2751 = null;
        if (arg0 <= 100) {
            field2751 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
    public class191() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILap;[B)V")
    public final void method1378(int arg0, class289 arg1, byte[] arg2) {
        field2744++;
        if (arg1.field3882[arg1.field3938] != 31 || arg1.field3882[arg1.field3938 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (arg0 != 116) {
            method1373(78, (class289) null);
        }
        if (this.field2742 == null) {
            this.field2742 = new Inflater(true);
        }
        try {
            this.field2742.setInput(arg1.field3882, arg1.field3938 + 10, -18 - arg1.field3938 + arg1.field3882.length);
            this.field2742.inflate(arg2);
        } catch (Exception var4) {
            this.field2742.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2742.reset();
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)I")
    public static final int method1379(int arg0, int arg1) {
        field2743++;
        if (arg1 >= -68) {
            field2750 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(III)V")
    private class191(int arg0, int arg1, int arg2) {
    }
}
