import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class304 {

    @OriginalMember(owner = "client!go", name = "g", descriptor = "Lkj;")
    private class47 field4318 = new class47();

    @OriginalMember(owner = "client!go", name = "f", descriptor = "Lmf;")
    public static class282 field4317 = new class282();

    @OriginalMember(owner = "client!go", name = "k", descriptor = "Lap;")
    public static class310 field4322 = new class310(24, 3);

    @OriginalMember(owner = "client!go", name = "l", descriptor = "[I")
    public static int[] field4323 = new int[256];

    @OriginalMember(owner = "client!go", name = "n", descriptor = "Leo;")
    public static class443 field4325;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Lkj;")
    private class47 field4319;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4323[var0] = var1;
        }
        new class151("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field4325 = new class443(2, 14);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)Lkj;", line = 3)
    public final class47 method1954(boolean arg0) {
        field4315++;
        if (arg0) {
            field4322 = null;
        }
        class47 var2 = this.field4319;
        if (this.field4318 == var2) {
            this.field4319 = null;
            return null;
        } else {
            this.field4319 = var2.field717;
            return var2;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Lkj;", line = 23)
    public final class47 method1955(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field4312++;
        class47 var2 = this.field4318.field717;
        if (this.field4318 == var2) {
            this.field4319 = null;
            return null;
        } else {
            this.field4319 = var2.field717;
            return var2;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZIBIZ)V", line = 43)
    public static final void method1956(boolean arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field4316++;
        class372.method2272(0, arg1, arg3, arg0, arg4, true, class361.field4975.length - 1);
        if (arg2 != -12) {
            field4323 = null;
        }
        class407.field5563 = null;
        class268.field3926 = 0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V", line = 59)
    public static void method1957(byte arg0) {
        field4325 = null;
        if (arg0 >= 15) {
            field4317 = null;
            field4322 = null;
            field4323 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)I", line = 72)
    public final int method1958(int arg0) {
        field4320++;
        int var2 = 0;
        class47 var3 = this.field4318.field717;
        if (arg0 <= 90) {
            this.method1954(true);
        }
        while (this.field4318 != var3) {
            var2++;
            var3 = var3.field717;
        }
        return var2;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILjava/lang/String;IIII)V", line = 99)
    public static final void method1959(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field4324++;
        class367 var8 = new class367();
        var8.field5040 = arg2;
        var8.field5049 = arg7;
        var8.field5041 = arg3;
        var8.field5053 = class364.field5010 + arg6;
        var8.field5051 = arg5;
        var8.field5047 = arg1;
        if (arg4 > -65) {
            field4317 = null;
        }
        var8.field5046 = arg0;
        class271.field3945.method1765(118, var8);
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V", line = 130)
    public final void method1960(int arg0) {
        field4313++;
        if (arg0 != -257) {
            this.field4318 = null;
        }
        while (true) {
            class47 var2 = this.field4318.field717;
            if (this.field4318 == var2) {
                this.field4319 = null;
                return;
            }
            var2.method479((byte) -8);
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 190)
    public class304() {
        this.field4318.field717 = this.field4318;
        this.field4318.field718 = this.field4318;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(B)Lkj;", line = 155)
    public final class47 method1961(byte arg0) {
        field4321++;
        if (arg0 != 49) {
            this.method1958(-35);
        }
        class47 var2 = this.field4318.field717;
        if (this.field4318 == var2) {
            return null;
        } else {
            var2.method479((byte) -8);
            return var2;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BLkj;)V", line = 172)
    public final void method1962(byte arg0, class47 arg1) {
        if (arg1.field718 != null) {
            arg1.method479((byte) -8);
        }
        field4314++;
        arg1.field718 = this.field4318.field718;
        arg1.field717 = this.field4318;
        if (arg0 == -67) {
            arg1.field718.field717 = arg1;
            arg1.field717.field718 = arg1;
        }
    }
}
