import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public abstract class class215 {

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3251 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field3254 = 0;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lvg;")
    public static class56 field3248 = new class56(8);

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Z")
    public static boolean field3256 = false;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lnv;")
    public static class44 field3255 = new class44();

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Z")
    public static boolean field3250;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Lbq;")
    public abstract class345 method1473(int arg0);

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Z")
    public final boolean method1474(int arg0) {
        field3252++;
        if (arg0 != -15913) {
            this.method1479(-128);
        }
        return this.method1480(-106) || this.method1485(arg0 + 15787) || this.method1479(0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I")
    public abstract int method1475(byte arg0);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(CI)Z")
    public static final boolean method1476(char arg0, int arg1) {
        field3257++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class435.method2701(arg0, arg1 - 8153)) {
            return true;
        } else {
            char[] var2 = class92.field1486;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class62.field994;
            if (arg1 != 8025) {
                field3254 = -84;
            }
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1477(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3253++;
        if (arg4 != -43) {
            field3248 = null;
        }
        if (class232.field3492 <= arg1 && arg2 <= class36.field453 && arg6 >= class487.field7124 && arg0 <= class232.field3493) {
            class314.method2091(arg7, arg6, arg5, arg2, arg1, (byte) -37, arg0, arg3);
        } else {
            class280.method1894(arg3, 85, arg7, arg5, arg1, arg6, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public static void method1478(int arg0) {
        if (arg0 > -74) {
            field3255 = null;
        }
        field3255 = null;
        field3248 = null;
        field3251 = null;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Z")
    public abstract boolean method1479(int arg0);

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)Z")
    public abstract boolean method1480(int arg0);

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
    public abstract void method1481(int arg0);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
    public static final void method1482(int arg0, boolean arg1) {
        class249.field3884.method1631(arg0, (byte) -19);
        field3249++;
        class190.field2910.method1631(arg0, (byte) -19);
        class498.field7250.method1631(arg0, (byte) -19);
        class49.field761.method1631(arg0, (byte) -19);
        if (arg1) {
            class136.field2070.method1631(arg0, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public abstract void method1483(byte arg0);

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)I")
    public abstract int method1484(int arg0);

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)Z")
    public abstract boolean method1485(int arg0);
}
