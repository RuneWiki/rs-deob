import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class142 extends class290 {

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "I")
    private int field1925;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    private int field1916;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    private int field1915;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    private int field1912;

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "Lgi;")
    public static class437 field1927;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    private int field1913;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    private int field1918;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
    private int field1923;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "I")
    private int field1926;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "[B")
    private byte[] field1922;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method857(byte arg0, String arg1) {
        field1919++;
        if (class390.field5937 == null) {
            class186.method1162((byte) 123);
        }
        if (arg0 != 95) {
            return;
        }
        String[] var2 = class506.method3074((byte) 122, arg1, '\n');
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class274.field4352; var4 > 0; var4--) {
                class390.field5937[var4] = class390.field5937[var4 - 1];
            }
            class390.field5937[0] = var2[var3];
            if (class274.field4352 < class390.field5937.length - 1) {
                if (class294.field4642 > 0) {
                    class294.field4642++;
                }
                class274.field4352++;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIB)V")
    public void method858(int arg0, int arg1, byte arg2) {
        field1914++;
        if (arg0 == -1934) {
            this.field1922[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class142(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1925 = (int) (arg6 * 4096.0F);
        this.field1916 = (int) (arg7 * 4096.0F);
        this.field1912 = this.field1915 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
    public final void method859(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field1923 = this.field1925 - (arg1 >= 0 ? arg1 : -arg1);
            this.field1923 = this.field1923 * this.field1923 >> 12;
            this.field1918 = 4096;
            this.field1926 = this.field1923;
        } else {
            this.field1918 = this.field1923 * this.field1916 >> 12;
            if (this.field1918 < 0) {
                this.field1918 = 0;
            } else if (this.field1918 > 4096) {
                this.field1918 = 4096;
            }
            this.field1923 = this.field1925 - (arg1 < 0 ? -arg1 : arg1);
            this.field1923 = this.field1923 * this.field1923 >> 12;
            this.field1923 = this.field1923 * this.field1918 >> 12;
            this.field1926 += this.field1923 * this.field1912 >> 12;
            this.field1912 = this.field1915 * this.field1912 >> 12;
        }
        if (arg0 != -15289) {
            this.method860(-33);
        }
        field1920++;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
    public final void method860(int arg0) {
        field1924++;
        this.field1912 = this.field1915;
        this.field1926 >>= 0x4;
        if (this.field1926 < 0) {
            this.field1926 = 0;
        } else if (this.field1926 > 255) {
            this.field1926 = 255;
        }
        this.method858(-1934, this.field1913++, (byte) this.field1926);
        if (arg0 != 28094) {
            method857((byte) 35, null);
        }
        this.field1926 = 0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZII)I")
    public static final int method861(int arg0, boolean arg1, int arg2, int arg3) {
        field1917++;
        class339 var4 = class154.method940(arg3, arg1, (byte) 119);
        if (var4 == null) {
            return 0;
        }
        int var5 = 24 / ((53 - arg2) / 59);
        if (arg0 == -1) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var4.field5290.length; var7++) {
            if (var4.field5287[var7] == arg0) {
                var6 += var4.field5290[var7];
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
    public static void method862(int arg0) {
        if (arg0 != 10) {
            field1927 = null;
        }
        field1927 = null;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public final void method863(int arg0) {
        if (arg0 != 255) {
            this.method860(110);
        }
        this.field1913 = 0;
        this.field1926 = 0;
        field1921++;
    }

    static {
        new class213("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field1927 = null;
    }
}
