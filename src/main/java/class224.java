import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class224 extends class153 {

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public int field3849 = 0;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
    public int field3853 = 12800;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    public int field3850 = 0;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "Z")
    public boolean field3848 = true;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public int field3843 = 12800;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public int field3844 = -1;

    @OriginalMember(owner = "client!kk", name = "cb", descriptor = "I")
    public int field3866;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "Lpj;")
    public class237 field3857;

    @OriginalMember(owner = "client!kk", name = "Y", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "Lpj;")
    public class237 field3846;

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "Lub;")
    public class88 field3859;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "Z")
    public static boolean field3845 = false;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "[I")
    public static int[] field3854 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "Lpj;")
    public static class237 field3861 = class33.method353("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 109);

    @OriginalMember(owner = "client!kk", name = "ab", descriptor = "[I")
    public static int[] field3864 = new int[1000];

    @OriginalMember(owner = "client!kk", name = "bb", descriptor = "I")
    public static int field3865 = 0;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "[I")
    public static int[] field3860 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "[I")
    public static int[] field3855;

    @OriginalMember(owner = "client!kk", name = "Z", descriptor = "[I")
    public static int[] field3863;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
    public static final void method1486(boolean arg0, int arg1) {
        class55.field1131.method939(arg1, 1);
        class238.field4168.method939(arg1, 1);
        if (!arg0) {
            field3858++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBI)Z")
    public final boolean method1487(int arg0, byte arg1, int arg2) {
        if (arg1 > -82) {
            field3855 = null;
        }
        field3856++;
        if (arg2 < this.field3843 || this.field3850 < arg2 || arg0 < this.field3853 || this.field3849 < arg0) {
            return false;
        }
        for (class23 var4 = (class23) this.field3859.method673(false); var4 != null; var4 = (class23) this.field3859.method680(120)) {
            if (var4.method212((byte) 111, arg0, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)Lcj;")
    public static final class115 method1488(int arg0) {
        field3842++;
        int var1 = class175.field3063[0] * class174.field3060[0];
        byte[] var2 = class127.field2221[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class139.field2398[class272.method1817(255, var2[var4])];
        }
        class225 var5 = new class225(class52.field1094, class43.field944, class252.field4341[0], class226.field3868[arg0], class174.field3060[0], class175.field3063[0], var3);
        class190.method1291((byte) 103);
        return var5;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1489(int arg0, String arg1) throws ClassNotFoundException {
        field3847++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else {
            if (arg0 != 0) {
                method1490((byte) -66);
            }
            if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
    public static void method1490(byte arg0) {
        field3855 = null;
        field3863 = null;
        if (arg0 != 37) {
            method1486(false, 107);
        }
        field3861 = null;
        field3860 = null;
        field3854 = null;
        field3864 = null;
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V")
    public final void method1491(int arg0) {
        this.field3853 = arg0;
        this.field3849 = 0;
        this.field3850 = 0;
        field3851++;
        this.field3843 = 12800;
        for (class23 var2 = (class23) this.field3859.method673(false); var2 != null; var2 = (class23) this.field3859.method680(arg0 - 12776)) {
            if (var2.field412 > this.field3849) {
                this.field3849 = var2.field412;
            }
            if (this.field3843 > var2.field413) {
                this.field3843 = var2.field413;
            }
            if (var2.field418 < this.field3853) {
                this.field3853 = var2.field418;
            }
            if (var2.field421 > this.field3850) {
                this.field3850 = var2.field421;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lpj;Lpj;IIIZ)V")
    public class224(class237 arg0, class237 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3866 = arg2;
        this.field3844 = arg4;
        this.field3857 = arg0;
        this.field3848 = arg5;
        this.field3862 = arg3;
        this.field3846 = arg1;
        this.field3859 = new class88();
    }
}
