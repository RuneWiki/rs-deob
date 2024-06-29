import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class285 {

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "J")
    public long field4914 = 0L;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Lwa;")
    public static class75 field4894 = class66.method560("Zugewiesener Speicher)3", false);

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "Lwa;")
    public static class75 field4906 = class66.method560("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", false);

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Lwa;")
    private static class75 field4903 = class66.method560("Checking for updates )2 ", false);

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field4909 = 127;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lwa;")
    public static class75 field4897 = field4903;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field4913 = -1;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field4915 = 0;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field4901 = 0;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "Z")
    public static boolean field4916 = false;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public int field4893;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public int field4895;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public int field4896;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public int field4899;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public int field4900;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public int field4902;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public int field4907;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public int field4908;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public int field4911;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public int field4912;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Lpj;")
    public class171 field4898;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;", line = 12)
    public static final Object method2007(boolean arg0, byte[] arg1, boolean arg2) {
        field4905++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class259.field4346) {
            try {
                class112 var3 = (class112) Class.forName("jb").getDeclaredConstructor().newInstance();
                var3.method178(arg1, (byte) -125);
                return var3;
            } catch (Throwable var5) {
                class259.field4346 = true;
            }
        }
        if (arg0) {
            method2008((byte) -50);
        }
        return arg2 ? class118.method900((byte) -35, arg1) : arg1;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 75)
    public static void method2008(byte arg0) {
        field4903 = null;
        field4906 = null;
        if (arg0 != -106) {
            field4903 = (class75) null;
        }
        field4897 = null;
        field4894 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lja;I)V", line = 91)
    public static final void method2009(class60 arg0, int arg1) {
        field4910++;
        byte[] var2 = new byte[24];
        if (arg1 < 65) {
            field4903 = (class75) null;
        }
        if (class34.field493 != null) {
            try {
                class34.field493.method260(0L, -30524);
                int var3 = 0;
                class34.field493.method267(0, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method494(var2, (byte) -128, 0, 24);
    }
}
