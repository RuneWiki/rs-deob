import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class64 extends class254 {

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "[Lij;")
    public static class69[] field1016;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[B)Z")
    public static final boolean method444(int arg0, byte[] arg1) {
        field1019++;
        class114 var2 = new class114(arg1);
        int var3 = var2.method760(false);
        if (var3 != 1) {
            return false;
        }
        int var4 = 17 / ((arg0 + 2) / 56);
        boolean var5 = var2.method760(false) == 1;
        if (var5) {
            class5.method64(var2, -3894);
        }
        class94.method637(true, var2);
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)V")
    public static final void method445(int arg0, int arg1) {
        if (arg1 <= 49) {
            method444(29, (byte[]) null);
        }
        field1018++;
        class270 var2 = class190.method1213(25702, arg0, 11);
        var2.method1806(-8173);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class64() {
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIILtk;Ltk;IIIIJ)V")
    public static final void method446(int arg0, int arg1, int arg2, int arg3, class219 arg4, class219 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class264 var12 = new class264();
        var12.field3979 = arg10;
        var12.field3978 = arg1 * 128 + 64;
        var12.field3980 = arg2 * 128 + 64;
        var12.field3986 = arg3;
        var12.field3974 = arg4;
        var12.field3970 = arg5;
        var12.field3968 = arg6;
        var12.field3987 = arg7;
        var12.field3969 = arg8;
        var12.field3984 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class16.field233[var13][arg1][arg2] == null) {
                class16.field233[var13][arg1][arg2] = new class131(var13, arg1, arg2);
            }
        }
        class16.field233[arg0][arg1][arg2].field1928 = var12;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public static void method447(int arg0) {
        int var1 = -70 % ((arg0 + 36) / 51);
        field1016 = null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I)V")
    public class64(int arg0) {
        this.field1015 = arg0;
    }
}
