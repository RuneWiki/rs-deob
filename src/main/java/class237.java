import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class class237 extends class513 {

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "Lkga;")
    public class506 field3188;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Z")
    public boolean field3190;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "Z")
    public static boolean field3191;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method1437(byte arg0) {
        field3192++;
        if (arg0 != -100) {
            this.field3188 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)Z", line = 14)
    public static final boolean method1438(byte arg0) {
        field3186++;
        try {
            class231 var1 = new class231();
            int var2 = -114 / ((22 - arg0) / 60);
            byte[] var3 = var1.method1397(0, class297.field3999);
            class700.method3921(var3, (byte) 37);
            return true;
        } catch (Exception var4) {
            return false;
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(B)Z", line = 43)
    public final boolean method1440(byte arg0) {
        if (arg0 != -112) {
            this.field3188 = null;
        }
        field3184++;
        return this.field3190;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I", line = 61)
    public final int method1442(int arg0) {
        if (arg0 == 1) {
            field3189++;
            return 1;
        } else {
            return -27;
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)I", line = 72)
    public int method1443(int arg0) {
        field3187++;
        if (arg0 != 1) {
            this.method1445(-120, false, -62);
        }
        return 0;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lkga;)V", line = 83)
    public class237(class506 arg0) {
        this.field3188 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
    public abstract void method1439(int arg0, int arg1);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Z")
    public abstract boolean method1441(int arg0);

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)Z")
    public abstract boolean method1444(byte arg0);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZI)V")
    public abstract void method1445(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lsaa;ILsaa;B)V")
    public abstract void method1446(class298 arg0, int arg1, class298 arg2, byte arg3);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
    public abstract void method1447(boolean arg0);
}
