import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public abstract class class76 extends class589 {

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IZI)V", line = 6)
    public static final void method469(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return;
        }
        if (class418.field5518 != arg2) {
            class64.field839 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class64.field839[var3] = (var3 << 12) / arg2;
            }
            class418.field5518 = arg2;
            class511.field6519 = arg2 - 1;
            class739.field9995 = arg2 * 32;
        }
        field1071++;
        if (class418.field5514 == arg0) {
            return;
        }
        if (class418.field5518 == arg0) {
            class427.field5623 = class64.field839;
        } else {
            class427.field5623 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class427.field5623[var4] = (var4 << 12) / arg0;
            }
        }
        class418.field5514 = arg0;
        class104.field1388 = arg0 - 1;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)Z", line = 51)
    public static final boolean method470(int arg0, int arg1, int arg2) {
        int var3 = -39 % ((arg1 + 9) / 48);
        field1072++;
        return false;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZIIBI)Llfa;", line = 62)
    public static final class278 method471(boolean arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1070++;
        if (arg3 != -95) {
            method470(-116, -62, -4);
        }
        class278 var5 = new class278();
        var5.field3613 = arg1;
        var5.field3617 = arg4;
        class149.field1895.method2619(var5, (long) arg2, arg3 ^ 0x5E);
        class278.method1710(true, arg4);
        class391 var6 = class738.method4006(122, arg2);
        if (var6 != null) {
            class776.method4255(var6, -1007);
        }
        if (class165.field2182 != null) {
            class776.method4255(class165.field2182, arg3 ^ 0x3B0);
            class165.field2182 = null;
        }
        class88.method541((byte) 2);
        if (var6 != null) {
            class564.method3052(var6, !arg0, arg3 + 94);
        }
        if (!arg0) {
            class760.method4142(arg4);
        }
        if (!arg0 && client.field6070 != -1) {
            class664.method3614(false, client.field6070, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILoq;)[Lrw;", line = 104)
    public static final class264[] method472(int arg0, class775 arg1) {
        field1068++;
        if (!arg1.method4230(5601)) {
            return new class264[0];
        } else if (arg0 == -19377) {
            class339 var2 = arg1.method4246(5);
            while (var2.field4144 == 0) {
                class591.method3181(10L, 0);
            }
            if (var2.field4144 == 2) {
                return new class264[0];
            }
            int[] var3 = (int[]) var2.field4142;
            class264[] var4 = new class264[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class264 var6 = new class264();
                var4[var5] = var6;
                var6.field3514 = var3[var5 << 2];
                var6.field3513 = var3[(var5 << 2) + 1];
                var6.field3512 = var3[(var5 << 2) + 2];
                var6.field3517 = var3[(var5 << 2) + 3];
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)Lmaa;")
    public abstract class528 method94(byte arg0);
}
