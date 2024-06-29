import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class67 implements class687 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Lsi;")
    private class688 field910;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[Ln;")
    private class682[] field913;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Loa;")
    private class43 field908;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Z")
    private boolean field914;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)I")
    public final int method545(int arg0) {
        field912++;
        if (arg0 != -17121) {
            field909 = 117;
        }
        return this.field910.field9411;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public final void method546(int arg0) {
        if (class520.field6799 != this.field908) {
            this.field914 = true;
            this.field908 = class520.field6799;
        }
        if (arg0 != -369) {
            return;
        }
        field911++;
        this.field908.method162(0);
        class682[] var2 = this.field913;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class682 var4 = var2[var3];
            if (var4 != null) {
                var4.method449(-31);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
    public final int method547(byte arg0) {
        field916++;
        int var2 = 0;
        if (arg0 != -17) {
            return 30;
        }
        class682[] var3 = this.field913;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class682 var5 = var3[var4];
            if (var5 == null || var5.method444((byte) -125)) {
                var2++;
            }
        }
        return var2 * 100 / this.field913.length;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZJ)Z")
    public final boolean method548(boolean arg0, long arg1) {
        if (arg0) {
            this.method550(true, 116);
        }
        field915++;
        return class584.method3191(1) >= ((long) this.field910.field9417 + arg1);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public final void method549(int arg0) {
        if (arg0 != 25742) {
            this.field908 = null;
        }
        field918++;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lsi;Lem;)V")
    public class67(class688 arg0, class570 arg1) {
        this.field910 = arg0;
        this.field913 = new class682[this.field910.field9416.length];
        for (int var3 = 0; var3 < this.field913.length; var3++) {
            this.field913[var3] = arg1.method3047(this.field910.field9416[var3], -75);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)V")
    public final void method550(boolean arg0, int arg1) {
        field917++;
        if (arg1 != 1277) {
            this.method546(-117);
        }
        boolean var3 = true;
        class682[] var4 = this.field913;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class682 var6 = var4[var5];
            if (var6 != null) {
                var6.method448(arg1 ^ 0xFFFFFBCC, var3 || this.field914);
            }
        }
        this.field914 = false;
    }
}
