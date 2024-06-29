import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class131 {

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lrc;")
    private class121 field2962 = new class121();

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "La;")
    private class1 field2973 = new class1();

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    private int field2974;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    private int field2972;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "Lec;")
    private class32 field2976;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "Lhe;")
    private static class54 field2965 = class6.method58("Press (Wchange your password(W on front page)3", false);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lhe;")
    public static class54 field2960 = field2965;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "Lhe;")
    private static class54 field2966 = class6.method58("Connection lost", false);

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Lhe;")
    public static class54 field2961 = field2966;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Lib;")
    public static class58 field2969 = new class58(5000);

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "Lhe;")
    public static class54 field2975 = class6.method58("(U0a )2 via: ", false);

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "Lsf;")
    public static class131 field2971 = new class131(64);

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "Lsf;")
    public static class131 field2978 = new class131(64);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "Leb;")
    public static class31 field2977;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "Ljava/awt/Image;")
    public static Image field2967;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method987(byte arg0) {
        field2969 = null;
        field2961 = null;
        field2977 = null;
        field2975 = null;
        field2960 = null;
        field2967 = null;
        field2971 = null;
        field2966 = null;
        field2965 = null;
        field2978 = null;
        if (arg0 != -117) {
            field2971 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
    public static final void method988(int arg0, int arg1) {
        field2963++;
        if (!class86.method691((byte) 116, arg0)) {
            return;
        }
        class93[] var2 = class59.field1481[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class93 var4 = var2[var3];
            if (var4 != null) {
                var4.field2254 = 0;
                var4.field2342 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IJ)V")
    public final void method989(int arg0, long arg1) {
        field2956++;
        class121 var4 = (class121) this.field2976.method246((byte) 117, arg1);
        if (arg0 > -54) {
            this.method989(75, -61L);
        }
        if (var4 != null) {
            var4.method48(-315);
            var4.method936(-1);
            this.field2974++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZJLrc;)V")
    public final void method990(boolean arg0, long arg1, class121 arg2) {
        if (!arg0) {
            return;
        }
        if (this.field2974 == 0) {
            class121 var5 = this.field2973.method5(118);
            var5.method48(-315);
            var5.method936(-1);
            if (this.field2962 == var5) {
                class121 var6 = this.field2973.method5(-101);
                var6.method48(-315);
                var6.method936(-1);
            }
        } else {
            this.field2974--;
        }
        field2964++;
        this.field2976.method241(arg2, arg1, false);
        this.field2973.method1(arg2, 3);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(JZ)Lrc;")
    public final class121 method991(long arg0, boolean arg1) {
        field2955++;
        if (!arg1) {
            method987((byte) -91);
        }
        class121 var4 = (class121) this.field2976.method246((byte) 117, arg0);
        if (var4 != null) {
            this.field2973.method1(var4, 3);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public final void method992(int arg0) {
        while (true) {
            class121 var2 = this.field2973.method5(-88);
            if (var2 == null) {
                if (arg0 != 0) {
                    method993(117, -70);
                }
                field2957++;
                this.field2974 = this.field2972;
                return;
            }
            var2.method48(-315);
            var2.method936(-1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Lta;")
    public static final class133 method993(int arg0, int arg1) {
        field2970++;
        class133 var2 = (class133) class100.field2541.method991((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class107.field2621.method266(arg1, (byte) 124, 0);
        if (var3 == null) {
            return null;
        }
        class133 var4 = new class133();
        int var5 = 0;
        class83 var6 = new class83(var3);
        var6.field2076 = var6.field2055.length - 12;
        int var7 = var6.method641((byte) 73);
        var4.field3012 = var6.method631((byte) -103);
        var4.field3001 = var6.method631((byte) -121);
        var4.field3011 = var6.method631((byte) -119);
        if (arg0 != 39) {
            method987((byte) 126);
        }
        var4.field3006 = var6.method631((byte) -111);
        var6.field2076 = 0;
        var4.field3010 = var6.method648((byte) 76);
        var4.field3009 = new int[var7];
        var4.field3016 = new class54[var7];
        var4.field3020 = new int[var7];
        while (var6.field2055.length - 12 > var6.field2076) {
            int var8 = var6.method631((byte) -104);
            if (var8 == 3) {
                var4.field3016[var5] = var6.method634(74);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field3009[var5] = var6.method638(arg0 - 39);
            } else {
                var4.field3009[var5] = var6.method641((byte) 73);
            }
            var4.field3020[var5++] = var8;
        }
        class100.field2541.method990(true, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I)V")
    public class131(int arg0) {
        this.field2974 = arg0;
        this.field2972 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2976 = new class32(var2);
    }
}
