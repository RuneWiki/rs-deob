import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class226 extends class188 {

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "Z")
    public static boolean field3412 = false;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Z")
    public static boolean field3415 = false;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field3416 = 0;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field3414 = 0;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field3413 = 0;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3417 = "white:";

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "Z")
    public static boolean field3425 = false;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "Ljava/lang/String;")
    public static String field3422 = "Started 3d Library";

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Lnk;")
    public static class16 field3406;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "Z")
    public boolean field3410;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)I", line = 8)
    public final int method1565(int arg0) {
        if (arg0 <= 22) {
            field3415 = true;
        }
        field3418++;
        return 1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()I", line = 23)
    public int method290() {
        field3421++;
        return 0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V", line = 32)
    public static final void method1566(int arg0, int arg1) {
        class277.field4353 = -1;
        class75.field971 = arg1;
        int var2 = 98 % ((arg0 + 22) / 62);
        field3407++;
        class162.field2489 = 100;
        class294.field4634 = 3;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)Z", line = 47)
    public final boolean method1567(int arg0) {
        field3423++;
        if (arg0 >= -51) {
            method1571(false, -15);
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)Z", line = 59)
    public final boolean method1568(int arg0) {
        field3424++;
        if (arg0 >= -53) {
            field3425 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 71)
    public static final int method1569(String arg0, int arg1) {
        field3409++;
        if (arg1 != -1) {
            field3417 = (String) null;
        }
        for (int var2 = 0; var2 < class247.field3902.length; var2++) {
            if (class247.field3902[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 98)
    public static final void method1570(boolean arg0) {
        if (class296.field4652 != null) {
            class322 var1 = new class322();
            for (int var2 = 0; var2 < 13; var2++) {
                for (int var3 = 0; var3 < 13; var3++) {
                    class296.field4652[var2][var3] = var1;
                }
            }
        }
        if (arg0) {
            field3411++;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)I", line = 141)
    public static final int method1571(boolean arg0, int arg1) {
        if (!arg0) {
            method1570(false);
        }
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        field3420++;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)Z", line = 162)
    public final boolean method1572(int arg0) {
        field3408++;
        if (arg0 != 192) {
            field3413 = -37;
        }
        return this.field3410;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V", line = 176)
    public static void method1573(byte arg0) {
        if (arg0 != -10) {
            method1571(true, -45);
        }
        field3417 = null;
        field3406 = null;
        field3422 = null;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public abstract void method296(int arg0);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()V")
    public abstract void method293();

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
    public abstract void method294(int arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()Z")
    public abstract boolean method291();

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
    public abstract void method295(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "()Z")
    public abstract boolean method292();
}
