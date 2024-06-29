import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class33 {

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "Lfe;")
    private class218 field407;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Lgh;")
    private class206 field400;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Lm;")
    private class41 field397;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field399 = 0;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Leb;")
    public static class103 field396 = null;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Ljava/lang/String;")
    public static String field405 = null;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Lhi;")
    private class264 field401;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "[I")
    public static int[] field395;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "[Lgi;")
    private class194[] field402;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public final void method226(int arg0) {
        field393++;
        if (this.field402 == null) {
            return;
        }
        int var2 = 0;
        if (arg0 < 126) {
            return;
        }
        while (var2 < this.field402.length) {
            if (this.field402[var2] != null) {
                this.field402[var2].method1309(0);
            }
            var2++;
        }
        for (int var3 = 0; var3 < this.field402.length; var3++) {
            if (this.field402[var3] != null) {
                this.field402[var3].method1318((byte) -64);
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static final void method227(byte arg0) {
        int var1 = 40 / ((arg0 + 10) / 51);
        field403++;
        class78.field1067 = new class61(32);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZILwh;Lwh;)Lgi;")
    private final class194 method228(int arg0, boolean arg1, int arg2, class9 arg3, class9 arg4) {
        field394++;
        if (this.field401 == null) {
            throw new RuntimeException();
        }
        this.field401.field4195 = arg0 * arg2 + 5;
        if (this.field401.field4198.length <= this.field401.field4195) {
            throw new RuntimeException();
        } else if (this.field402[arg2] == null) {
            int var6 = this.field401.method1765((byte) 103);
            int var7 = this.field401.method1765((byte) 122);
            class194 var8 = new class194(arg2, arg4, arg3, this.field400, this.field407, var6, var7, arg1);
            this.field402[arg2] = var8;
            return var8;
        } else {
            return this.field402[arg2];
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
    public static void method229(int arg0) {
        field395 = null;
        field396 = null;
        if (arg0 == -31225) {
            field405 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Z")
    public final boolean method230(byte arg0) {
        field406++;
        if (this.field401 != null) {
            return true;
        }
        if (this.field397 == null) {
            if (this.field400.method1391(3)) {
                return false;
            }
            this.field397 = this.field400.method1395(true, 255, 255, (byte) -128, (byte) 0);
        }
        if (this.field397.field998) {
            return false;
        }
        if (arg0 < 39) {
            method227((byte) -127);
        }
        this.field401 = new class264(this.field397.method7((byte) 115));
        this.field402 = new class194[(this.field401.field4198.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lwh;IILwh;)Lgi;")
    public final class194 method231(class9 arg0, int arg1, int arg2, class9 arg3) {
        field408++;
        if (arg1 < 7) {
            field399 = -77;
        }
        return this.method228(8, true, arg2, arg3, arg0);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lgh;Lfe;)V")
    public class33(class206 arg0, class218 arg1) {
        this.field407 = arg1;
        this.field400 = arg0;
        if (!this.field400.method1391(3)) {
            this.field397 = this.field400.method1395(true, 255, 255, (byte) -113, (byte) 0);
        }
    }
}
