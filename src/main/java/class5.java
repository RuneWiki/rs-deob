import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 {

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Lal;")
    private class252 field110 = new class252();

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "Lja;")
    private class61 field116 = new class61();

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Li;")
    private class58 field117;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Z")
    public static boolean field109 = false;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        field107++;
        this.field116.method392(0);
        this.field117.method377((byte) -1);
        this.field110 = new class252();
        if (!arg0) {
            this.field118 = this.field115;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lal;JI)V")
    public final void method59(class252 arg0, long arg1, int arg2) {
        field108++;
        if (this.field118 == 0) {
            class252 var5 = this.field116.method396(0);
            var5.method952((byte) 90);
            var5.method1708((byte) 90);
            if (this.field110 == var5) {
                class252 var6 = this.field116.method396(0);
                var6.method952((byte) 103);
                var6.method1708((byte) 90);
            }
        } else {
            this.field118--;
        }
        if (arg2 != 5) {
            this.method63(118);
        }
        this.field117.method368(arg1, arg0, arg2 - 108);
        this.field116.method388(arg0, false);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lrg;B)V")
    public static final void method60(class248 arg0, byte arg1) {
        int var2 = arg0.field3957;
        if (arg1 < 22) {
            return;
        }
        field114++;
        if (var2 == 324) {
            if (class41.field621 == -1) {
                class41.field621 = arg0.field3895;
                class65.field1047 = arg0.field4002;
            }
            if (class75.field1201.field4550) {
                arg0.field3895 = class41.field621;
            } else {
                arg0.field3895 = class65.field1047;
            }
        } else if (var2 == 325) {
            if (class41.field621 == -1) {
                class41.field621 = arg0.field3895;
                class65.field1047 = arg0.field4002;
            }
            if (class75.field1201.field4550) {
                arg0.field3895 = class65.field1047;
            } else {
                arg0.field3895 = class41.field621;
            }
        } else if (var2 == 327) {
            arg0.field4035 = 150;
            arg0.field4062 = (int) (Math.sin((double) class274.field4472 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field4055 = -1;
            arg0.field4042 = 5;
        } else if (var2 == 328) {
            if (class217.field3408.field222 == null) {
                arg0.field4055 = 0;
            } else {
                arg0.field4035 = 150;
                arg0.field4062 = (int) (Math.sin((double) class274.field4472 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field4042 = 5;
                arg0.field4055 = ((int) class162.method1114((byte) -124, class217.field3408.field222) << 11) + 2047;
                arg0.field3940 = class217.field3408.field947;
                arg0.field4031 = 0;
                arg0.field3927 = class217.field3408.field992;
                arg0.field3969 = class217.field3408.field961;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IJ)Lal;")
    public final class252 method61(int arg0, long arg1) {
        if (arg0 <= 23) {
            this.method61(-92, 108L);
        }
        field111++;
        class252 var4 = (class252) this.field117.method371(-111, arg1);
        if (var4 != null) {
            this.field116.method388(var4, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)Lqi;")
    public final class137 method62(int arg0) {
        if (arg0 < 61) {
            this.method58(false);
        }
        field113++;
        return this.field117.method369(true);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Lqi;")
    public final class137 method63(int arg0) {
        field112++;
        return arg0 == 256 ? this.field117.method379(-21146) : null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I)V")
    public class5(int arg0) {
        this.field115 = arg0;
        this.field118 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field117 = new class58(var2);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method64(boolean arg0, String arg1) {
        field106++;
        int var2 = arg1.length();
        byte var3 = 2;
        char[] var4 = new char[var2];
        if (arg0) {
            method64(true, (String) null);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var3 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var3 == 2 || Character.isUpperCase(var6)) {
                var6 = class63.method421((byte) 65, var6);
            }
            if (Character.isLetter(var6)) {
                var3 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var4[var5] = var6;
        }
        return new String(var4);
    }
}
