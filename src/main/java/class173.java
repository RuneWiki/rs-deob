import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class173 extends class305 {

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "Lna;")
    public class140 field2779;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field2775 = 0;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Lem;", line = 8)
    public static final class271 method1091(int arg0, int arg1, int arg2) {
        class47 var3 = class326.field4975[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field969; var4++) {
            class271 var5 = var3.field974[var4];
            if ((var5.field4191 >> 29 & 0x3L) == 2L && var5.field4180 == arg1 && var5.field4187 == arg2) {
                class8.method67(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZZLjava/lang/String;)V", line = 34)
    public static final void method1092(boolean arg0, boolean arg1, String arg2) {
        if (!arg0) {
            method1091(68, 70, -79);
        }
        field2778++;
        if (!arg1) {
            try {
                class102.method666(class177.field2849.field2139, false, "loggedout");
            } catch (Throwable var8) {
            }
            try {
                class34.field691.getAppletContext().showDocument(new URL(class34.field691.getCodeBase(), arg2), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class249.field3893 && class158.field2573) {
            try {
                class102.method668((byte) -113, new Object[] { (new URL(class34.field691.getCodeBase(), arg2)).toString() }, class177.field2849.field2139, "openjs");
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class34.field691.getAppletContext().showDocument(new URL(class34.field691.getCodeBase(), arg2), "_blank");
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)I", line = 85)
    public static final int method1093(byte arg0, int arg1) {
        if (arg0 != 58) {
            method1094(-81, -49, (byte) 108, -126, 88, 88);
        }
        field2774++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lna;)V", line = 103)
    public class173(class140 arg0) {
        this.field2779 = arg0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIBIII)V", line = 112)
    public static final void method1094(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2777++;
        if (arg4 == arg5) {
            class134.method878(arg4, arg3, arg1, -57, arg0);
            return;
        }
        int var6 = -119 % ((-arg2 - 39) / 54);
        if (class147.field2416 <= (arg0 - arg4) && arg0 + arg4 <= class259.field4024 && class59.field1162 <= (arg1 - arg5) && class186.field3028 >= arg1 + arg5) {
            class280.method1888(arg5, arg4, arg1, 127, arg0, arg3);
        } else {
            class103.method673(arg0, (byte) -83, arg4, arg5, arg3, arg1);
        }
    }
}
