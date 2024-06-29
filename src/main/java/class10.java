import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class10 {

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lsr;")
    private class167 field120;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "[I")
    public static int[] field118 = new int[500];

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lao;")
    public static class191 field122 = new class191(27, 0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lpe;")
    private class435 field117;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static void method63(byte arg0) {
        field118 = null;
        field122 = null;
        if (arg0 >= -10) {
            field122 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lsr;Z)V")
    public final void method64(class167 arg0, boolean arg1) {
        if (arg1) {
            method63((byte) -104);
        }
        field121++;
        this.field120 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)Lpe;")
    public final class435 method65(byte arg0) {
        field112++;
        class435 var2 = this.field117;
        int var3 = -99 / ((arg0 - 40) / 39);
        if (this.field120.field2165 == var2) {
            this.field117 = null;
            return null;
        } else {
            this.field117 = var2.field6344;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)Z")
    public static final boolean method66(int arg0, boolean arg1) {
        field119++;
        if (arg1) {
            return false;
        } else {
            return arg0 == 2 || arg0 == 4 || arg0 == 5;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method67(String[] arg0, byte arg1) {
        if (arg1 <= 36) {
            field118 = null;
        }
        field114++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Lpe;")
    public final class435 method68(int arg0) {
        field113++;
        class435 var2 = this.field120.field2165.field6344;
        if (arg0 >= -60) {
            this.method64(null, true);
        }
        if (this.field120.field2165 == var2) {
            this.field117 = null;
            return null;
        } else {
            this.field117 = var2.field6344;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class10() {
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lsr;)V")
    public class10(class167 arg0) {
        this.field120 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lza;ZIILsr;)V")
    public static final void method69(class287 arg0, boolean arg1, int arg2, int arg3, class167 arg4) {
        class342.field4590.method984(arg1);
        field111++;
        if (class533.field7848) {
            return;
        }
        for (class519 var5 = (class519) arg4.method970(12); var5 != null; var5 = (class519) arg4.method976((byte) 65)) {
            class48 var6 = class416.field5987.method993(var5.field7646, -21143);
            if (class384.method2337(var6, (byte) -128)) {
                boolean var7 = class282.method1707(var6, arg3, arg0, arg2, var5, Integer.MIN_VALUE);
                if (var7) {
                    class474.method2896(var5, arg0, (byte) 105, var6);
                }
            }
        }
    }
}
