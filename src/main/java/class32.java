import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class32 extends class426 {

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "Lbe;")
    public static class133 field411 = null;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "Lnn;")
    public static class151 field413;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Ljava/lang/String;")
    public String field408;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)J")
    public final long method186(int arg0) {
        ++field406;
        return arg0 >= -96 ? -50L : super.field6254 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)I")
    public final int method187(byte arg0) {
        if (arg0 >= -48) {
            field411 = null;
        }
        ++field409;
        return (int) super.field1339;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIIIIZ)V")
    public static final void method188(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field407;
        long var6 = (long) (arg4 | (arg0 ? Integer.MIN_VALUE : 0));
        class148 var8 = (class148) class72.field937.method2302(var6, 23576);
        if (arg5) {
            method188(true, -88, 65, -107, -88, false);
        }
        if (var8 == null) {
            var8 = new class148();
            class72.field937.method2301(112, var8, var6);
        }
        if (~arg1 <= ~var8.field2045.length) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; ~var11 > ~var8.field2045.length; ++var11) {
                var9[var11] = var8.field2045[var11];
                var10[var11] = var8.field2049[var11];
            }
            for (int var12 = var8.field2045.length; var12 < arg1; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field2045 = var9;
            var8.field2049 = var10;
        }
        var8.field2045[arg1] = arg3;
        var8.field2049[arg1] = arg2;
    }

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)V")
    public static final void method189(int arg0) {
        ++field401;
        class306.field4627.method1482((byte) 72);
        if (arg0 != 10663) {
            field411 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILef;)V")
    public static final void method190(int arg0, class385 arg1) {
        ++field402;
        if (arg0 < 32) {
            field411 = null;
        }
        byte[] var2 = new byte[24];
        if (class353.field5222 != null) {
            try {
                class353.field5222.method1189(0L, (byte) 83);
                class353.field5222.method1188(var2, 0);
                int var3;
                for (var3 = 0; ~var3 > -25 && var2[var3] == 0; ++var3) {
                }
                if (~var3 <= -25) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method2325((byte) 95, 0, var2, 24);
    }

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)V")
    public static void method191(int arg0) {
        if (arg0 != 0) {
            field411 = null;
        }
        field413 = null;
    }

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "(I)V")
    public final void method192(int arg0) {
        ++field405;
        if (arg0 != -17451) {
            this.method194(true);
        }
        super.field6254 = Long.MIN_VALUE & super.field6254 | 500L + class445.method2750(-27580);
        class236.field3537.method40(this, 17478);
    }

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "(I)I")
    public final int method193(int arg0) {
        if (arg0 != 964287584) {
            field414 = 39;
        }
        ++field403;
        return (int) (255L & super.field1339 >>> 32);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public final void method194(boolean arg0) {
        super.field6254 |= Long.MIN_VALUE;
        if (arg0) {
            field411 = null;
        }
        ++field410;
        if (~this.method186(-97) == -1L) {
            class423.field6225.method40(this, 17478);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(II)V")
    public class32(int arg0, int arg1) {
        super.field1339 = (long) arg0 << 32 | (long) arg1;
    }

    static {
        new class151("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field413 = new class151("Hidden", "Versteckt", "Caché", "Oculto");
    }
}
