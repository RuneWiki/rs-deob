import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class161 extends class342 {

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "Ljava/lang/Object;")
    private Object field2383;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "Ldu;")
    public static class242 field2378 = new class242(13, -1);

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "J")
    public static long field2382;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method535(boolean arg0) {
        if (!arg0) {
            method1024(false);
        }
        field2379++;
        return this.field2383;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lgo;Ljava/lang/Object;I)V")
    public class161(class451 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2383 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Z")
    public final boolean method536(int arg0) {
        field2381++;
        if (arg0 != -1) {
            field2378 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)V")
    public static void method1024(boolean arg0) {
        if (arg0) {
            method1025(null, (byte) -11, 109);
        }
        field2378 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method1025(String arg0, byte arg1, int arg2) {
        field2380++;
        if (arg1 <= -89) {
            class45 var3 = class354.method2094(arg2, (byte) -60, 2);
            var3.method260(9188);
            var3.field503 = arg0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lsq;IIIII)V")
    public static final void method1026(class121 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1669 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field1662[var6] != null) {
                arg0.field1669++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field1669; var7++) {
            long var8 = class400.field5635[arg1][arg2][arg3];
            while (var8 != 0L) {
                class391 var14 = class74.field899[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field1662[var7] == var14.field5504) {
                    continue label50;
                }
            }
            long var10 = class400.field5635[arg1][arg4][arg5];
            while (var10 != 0L) {
                class391 var13 = class74.field899[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field1662[var7] == var13.field5504) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field1669 - 1; var12++) {
                arg0.field1662[var12] = arg0.field1662[var12 + 1];
            }
            arg0.field1669--;
        }
    }
}
