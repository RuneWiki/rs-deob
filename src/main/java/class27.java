import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class27 {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Laj;")
    private class287 field921 = new class287(64);

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lom;")
    private class344 field925;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field924 = 0;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field920 = 1405;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lqfa;")
    public static class85 field918 = new class85(67, 6);

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field927 = 0;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "F")
    public static float field926 = 1024.0F;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field928 = 0;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)[Lmo;")
    public static final class695[] method490(byte arg0) {
        if (arg0 > -37) {
            field927 = 123;
        }
        field919++;
        return new class695[] { class534.field7487, class537.field7523, class424.field6130 };
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method491(int arg0) {
        field918 = null;
        if (arg0 != 0) {
            method490((byte) 106);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Ljh;")
    public final class145 method492(int arg0, int arg1) {
        field922++;
        class287 var3 = this.field921;
        class145 var4;
        synchronized (this.field921) {
            var4 = (class145) this.field921.method1900((long) arg1, 106);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field925;
        byte[] var6;
        synchronized (this.field925) {
            var6 = this.field925.method2216(arg0, arg1, true);
        }
        class145 var7 = new class145();
        if (var6 != null) {
            var7.method1159(new class61(var6), arg0 - 13);
        }
        class287 var8 = this.field921;
        synchronized (this.field921) {
            this.field921.method1904(var7, (long) arg1, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class27(class398 arg0, int arg1, class344 arg2) {
        this.field925 = arg2;
        this.field923 = this.field925.method2236(19, 0);
    }
}
