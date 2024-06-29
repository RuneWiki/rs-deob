import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 {

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field822 = 0;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lfc;")
    public static class39 field825 = class90.method774("(Y", -110);

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lfc;")
    private static class39 field830 = class90.method774("as it was used to break our rules)3", -108);

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lfc;")
    public static class39 field827 = class90.method774("Lade Texturen )2 ", -94);

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Lfc;")
    public static class39 field821 = field830;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Laa;")
    public static class2 field829 = new class2();

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Lfc;")
    private static class39 field835 = class90.method774("Enter object name", -118);

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lfc;")
    public static class39 field833 = class90.method774("welle2:", -126);

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Lfc;")
    public static class39 field834 = field835;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "[[[B")
    public static byte[][][] field836;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lua;I)V", line = 3)
    public static final void method357(class137 arg0, int arg1) {
        class153.field3768 = arg0;
        field831++;
        if (arg1 != -13762) {
            method362(null, 22, (byte) -89, null);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Ljd;", line = 34)
    public static final class66 method358(int arg0) {
        if (arg0 != -18839) {
            field836 = null;
        }
        field826++;
        try {
            return (class66) Class.forName("re").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILfc;Lfc;Loc;)Lue;", line = 60)
    public static final class141 method359(int arg0, class39 arg1, class39 arg2, class100 arg3) {
        field823++;
        int var4 = arg3.method848(arg2, (byte) 100);
        if (arg0 >= -21) {
            field835 = null;
        }
        int var5 = arg3.method834(arg1, false, var4);
        return method364(-5577, var4, arg3, var5);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 78)
    public static void method360(int arg0) {
        field836 = null;
        int var1 = 12 % ((2 - arg0) / 36);
        field834 = null;
        field825 = null;
        field830 = null;
        field829 = null;
        field833 = null;
        field835 = null;
        field827 = null;
        field821 = null;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)J", line = 107)
    public static final synchronized long method361(int arg0) {
        if (arg0 != -5321) {
            method359(-49, null, null, null);
        }
        long var1 = System.currentTimeMillis();
        if (class3.field73 > var1) {
            class118.field3084 += class3.field73 - var1;
        }
        class3.field73 = var1;
        field824++;
        return var1 + class118.field3084;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lrb;IBLmf;)V", line = 139)
    public static final void method362(class120 arg0, int arg1, byte arg2, class89 arg3) {
        field819++;
        byte[] var4 = null;
        class2 var5 = class7.field214;
        synchronized (class7.field214) {
            for (class108 var6 = (class108) class7.field214.method8(-1); var6 != null; var6 = (class108) class7.field214.method9(1)) {
                if ((long) arg1 == var6.field3619 && var6.field2707 == arg0 && var6.field2704 == 0) {
                    var4 = var6.field2705;
                    break;
                }
            }
        }
        if (var4 == null) {
            int var7 = -110 / ((12 - arg2) / 43);
            byte[] var8 = arg0.method1030(0, arg1);
            arg3.method765(arg1, var8, arg0, 0, true);
        } else {
            arg3.method765(arg1, var4, arg0, 0, true);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BII)Lfc;", line = 181)
    public static final class39 method363(int arg0, byte[] arg1, int arg2, int arg3) {
        field820++;
        class39 var4 = new class39();
        var4.field1046 = 0;
        var4.field1067 = new byte[arg3];
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            if (arg1[var5] != 0) {
                var4.field1067[var4.field1046++] = arg1[var5];
            }
        }
        int var6 = -120 % ((18 - arg2) / 42);
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILoc;I)Lue;", line = 224)
    private static final class141 method364(int arg0, int arg1, class100 arg2, int arg3) {
        field828++;
        if (arg0 != -5577) {
            method357(null, -34);
        }
        return class127.method1054(arg3, (byte) 0, arg1, arg2) ? class120.method1031(96) : null;
    }
}
