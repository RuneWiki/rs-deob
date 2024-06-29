import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class255 extends class159 {

    @OriginalMember(owner = "client!md", name = "p", descriptor = "J")
    public long field4044;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "[I")
    public static int[] field4042 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field4043 = 0;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4045 = "Loaded wordpack";

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1813(boolean arg0) {
        field4042 = null;
        if (arg0) {
            field4045 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)Z", line = 16)
    public static final boolean method1814(int arg0) {
        field4041++;
        if (arg0 != 38) {
            field4045 = (String) null;
        }
        try {
            return class96.method636(-244);
        } catch (IOException var5) {
            class84.method554(arg0 + 62);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class185.field2867 + "," + class291.field4823 + "," + class50.field738 + " - " + class201.field3091 + "," + (class329.field5388.field4762[0] + class215.field3313) + "," + (class329.field5388.field4757[0] + class150.field2420) + " - ";
            for (int var4 = 0; var4 < class201.field3091 && var4 < 50; var4++) {
                var3 = var3 + class159.field2552.field5124[var4] + ",";
            }
            class326.method2328(var6, var3, true);
            class278.method1983(arg0 ^ 0x27);
            return true;
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V", line = 45)
    public static final void method1815(int arg0) {
        if (arg0 != 5424) {
            return;
        }
        field4040++;
        if (!class219.field3371 && class290.field4818 != 2) {
            try {
                class73.method499(105, "tbrefresh", class96.field1394);
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIILkm;IJZ)Z", line = 68)
    public static final boolean method1816(int arg0, int arg1, int arg2, int arg3, int arg4, class162 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class265.method1870(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 105)
    public class255() {
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(J)V", line = 107)
    public class255(long arg0) {
        this.field4044 = arg0;
    }
}
