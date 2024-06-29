import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class76 extends class155 {

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Lam;")
    public class226 field1294;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public static int field1298 = 0;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public static int field1296 = 0;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "[I")
    public static int[] field1301 = new int[32];

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public static volatile int field1299 = 0;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "Laj;")
    public static class151 field1293;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)J")
    public static final long method539(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2814; var4++) {
            class73 var5 = var3.field2812[var4];
            if ((var5.field1278 >> 29 & 0x3L) == 2L && var5.field1270 == arg1 && var5.field1266 == arg2) {
                return var5.field1278;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!d", name = "i", descriptor = "(I)V")
    public static void method540(int arg0) {
        field1293 = null;
        field1301 = null;
        if (arg0 != 0) {
            field1296 = 39;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILda;IJIIII)Z")
    public static final boolean method541(int arg0, int arg1, int arg2, int arg3, class312 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class42.method250(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lam;)V")
    public class76(class226 arg0) {
        this.field1294 = arg0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method542(int arg0, byte[] arg1, boolean arg2) {
        field1303++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 < arg1.length && !class194.field3110) {
            try {
                class157 var3 = (class157) Class.forName("wk").getDeclaredConstructor().newInstance();
                var3.method569(58, arg1);
                return var3;
            } catch (Throwable var4) {
                class194.field3110 = true;
            }
        }
        return arg2 ? class173.method1281(-108, arg1) : arg1;
    }
}
