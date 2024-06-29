import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class625 {

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public int field8978 = 128;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public int field8981 = 128;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public int field8979;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public int field8976;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public int field8986;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public int field8984;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "Z")
    public static boolean field8980 = false;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "Lsq;")
    public static class178 field8985 = new class178(2, 4, 4, 0);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Loo;")
    public final class625 method3584(int arg0) {
        if (arg0 <= 30) {
            method3585(-97, 49, -79);
        }
        field8982++;
        return new class625(this.field8979, this.field8981, this.field8978, this.field8984, this.field8986, this.field8976);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)I")
    public static final int method3585(int arg0, int arg1, int arg2) {
        field8983++;
        if (arg2 == 2) {
            double var3 = Math.log((double) arg0) / Math.log(2.0D);
            double var5 = Math.log((double) arg1) / Math.log(2.0D);
            double var7 = var5 + Math.random() * (var3 - var5);
            return (int) (Math.pow(2.0D, var7) + 0.5D);
        } else {
            return 124;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
    public static final String[] method3586(String arg0, char arg1, int arg2) {
        field8977++;
        int var3 = class98.method685(arg0, arg1, (byte) -57);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        if (arg2 != -16647) {
            method3588(9);
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILoo;)V")
    public final void method3587(int arg0, class625 arg1) {
        this.field8978 = arg1.field8978;
        this.field8984 = arg1.field8984;
        this.field8976 = arg1.field8976;
        if (arg0 != -15083) {
            this.field8978 = 49;
        }
        this.field8981 = arg1.field8981;
        this.field8979 = arg1.field8979;
        this.field8986 = arg1.field8986;
        field8975++;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
    public static void method3588(int arg0) {
        field8985 = null;
        if (arg0 < 119) {
            method3588(-68);
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(I)V")
    public class625(int arg0) {
        this.field8979 = arg0;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IIIIII)V")
    private class625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8978 = arg2;
        this.field8981 = arg1;
        this.field8979 = arg0;
        this.field8976 = arg5;
        this.field8986 = arg4;
        this.field8984 = arg3;
    }
}
