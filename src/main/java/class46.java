import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class class46 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lob;")
    public static class141 field875 = class175.method1195(40, "jlv");

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lob;")
    private static class141 field882 = class175.method1195(40, "Loaded sprites");

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lob;")
    public static class141 field876 = field882;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lvc;")
    public static class212 field884 = new class212(30);

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field886 = 0;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "[I")
    public static int[] field887 = new int[128];

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lrf;")
    public static class175 field885 = new class175(0, 0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field880;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIBILra;)V")
    public static final void method303(int arg0, int arg1, byte arg2, int arg3, class170 arg4) {
        if (class184.field3590 < 3) {
            class11.field219.method684(arg1, arg3, arg4.field3299, arg4.field3284, class11.field219.field1985 / 2, class11.field219.field1981 / 2, class214.field4084, 256, arg4.field3347, arg4.field3362);
        } else {
            class148.method1038(arg1, arg3, 0, arg4.field3347, arg4.field3362);
        }
        class223.field4211[arg0] = true;
        field883++;
        if (arg2 != -9) {
            method306(-103, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
    public static final int method304(int arg0, int arg1) {
        if (arg1 != 22511) {
            field887 = null;
        }
        field878++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lca;ZIBIII)V")
    public static final void method305(class22 arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        long var7 = (long) ((arg2 << 16) + arg6);
        class209 var9 = (class209) class164.field3160.method792(var7, 22346);
        field879++;
        if (var9 != null || arg4 != -18963) {
            return;
        }
        class209 var10 = (class209) class154.field2974.method792(var7, arg4 + 41309);
        if (var10 != null) {
            return;
        }
        class209 var11 = (class209) class202.field3819.method792(var7, arg4 ^ 0xFFFFE2A7);
        if (var11 == null) {
            if (!arg1) {
                class209 var12 = (class209) class177.field3498.method792(var7, arg4 ^ 0xFFFFE2A7);
                if (var12 != null) {
                    return;
                }
            }
            class209 var13 = new class209();
            var13.field3944 = arg3;
            var13.field3981 = arg0;
            var13.field3979 = arg5;
            if (arg1) {
                class164.field3160.method797(var13, var7, true);
                class68.field1339++;
            } else {
                class126.field2417.method816((byte) -26, var13);
                class202.field3819.method797(var13, var7, true);
                class93.field1854++;
            }
        } else if (arg1) {
            var11.method1200((byte) 122);
            class164.field3160.method797(var11, var7, true);
            class93.field1854--;
            class68.field1339++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Lob;")
    public static final class141 method306(int arg0, byte arg1) {
        if (arg1 == 8) {
            field874++;
            return class223.field4210[arg0].method908(false) > 0 ? class220.method1422(new class141[] { class22.field396[arg0], class196.field3752, class223.field4210[arg0] }, arg1 ^ 0xFFFFFFF5) : class22.field396[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)[B")
    public abstract byte[] method307(int arg0);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILpe;Lpe;Lpe;)V")
    public static final void method308(int arg0, class154 arg1, class154 arg2, class154 arg3) {
        class76.field1555 = arg3;
        int var4 = -92 % ((arg0 + 77) / 37);
        class10.field210 = arg1;
        field877++;
        class10.field185 = arg2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BI)V")
    public abstract void method309(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method310(byte arg0) {
        field885 = null;
        field882 = null;
        field887 = null;
        field875 = null;
        field876 = null;
        field884 = null;
        int var1 = -93 / ((arg0 + 61) / 39);
        field880 = null;
    }
}
