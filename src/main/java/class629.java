import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class629 {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "Lsw;")
    private class641 field9023 = new class641(64);

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "Ldn;")
    private class438 field9031;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "Lcea;")
    public static class180 field9029 = new class180("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IB)V", line = 3)
    public final void method3599(int arg0, byte arg1) {
        class641 var3 = this.field9023;
        synchronized (this.field9023) {
            this.field9023.method3686((byte) 53, arg0);
        }
        field9025++;
        if (arg1 != -104) {
            this.field9031 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 19)
    public final void method3600(int arg0) {
        class641 var2 = this.field9023;
        synchronized (this.field9023) {
            if (arg0 != -1) {
                this.method3600(-110);
            }
            this.field9023.method3694(arg0 + 1);
        }
        field9030++;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BII)Z", line = 32)
    public static final boolean method3601(byte arg0, int arg1, int arg2) {
        if (arg0 != -53) {
            field9029 = null;
        }
        field9028++;
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 43)
    public final void method3602(byte arg0) {
        field9032++;
        class641 var2 = this.field9023;
        synchronized (this.field9023) {
            this.field9023.method3687(1402);
            if (arg0 > -107) {
                field9033 = -68;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)I", line = 57)
    public static final int method3603(int arg0, int arg1, int arg2, int arg3) {
        field9024++;
        int var4 = arg0 / arg3;
        int var5 = arg0 & arg3 - 1;
        int var6 = arg2 / arg3;
        int var7 = arg2 & arg3 - 1;
        int var8 = class44.method231(var4, var6, -121);
        int var9 = class44.method231(var4 + 1, var6, arg1 ^ 0xFFFF95BF);
        int var10 = class44.method231(var4, var6 + 1, -123);
        int var11 = class44.method231(var4 + 1, var6 + 1, -114);
        int var12 = class360.method2021(var8, var9, arg1 ^ arg1, arg3, var5);
        int var13 = class360.method2021(var10, var11, arg1 - 27193, arg3, var5);
        return class360.method2021(var12, var13, 0, arg3, var7);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "([Let;IIZII)V", line = 85)
    public static final void method3604(class509[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field9026++;
        for (int var6 = arg2; var6 < arg0.length; var6++) {
            class509 var7 = arg0[var6];
            if (var7 != null && var7.field7054 == arg1) {
                class311.method1727(arg2 ^ 0x61, var7, arg4, arg3, arg5);
                class306.method1694(2, var7, arg4, arg5);
                if (var7.field7190 > var7.field7185 - var7.field7094) {
                    var7.field7190 = var7.field7185 - var7.field7094;
                }
                if ((var7.field7180 - var7.field7059) < var7.field7104) {
                    var7.field7104 = var7.field7180 - var7.field7059;
                }
                if (var7.field7190 < 0) {
                    var7.field7190 = 0;
                }
                if (var7.field7104 < 0) {
                    var7.field7104 = 0;
                }
                if (var7.field7197 == 0) {
                    class619.method3556(10438, var7, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Luw;", line = 142)
    public final class352 method3605(int arg0, int arg1) {
        field9027++;
        class641 var3 = this.field9023;
        class352 var4;
        synchronized (this.field9023) {
            var4 = (class352) this.field9023.method3682(arg1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field9031;
        byte[] var6;
        synchronized (this.field9031) {
            var6 = this.field9031.method2558(100, arg0, 32);
        }
        class352 var7 = new class352();
        if (var6 != null) {
            var7.method1957(-1, new class374(var6));
        }
        class641 var8 = this.field9023;
        synchronized (this.field9023) {
            this.field9023.method3684(var7, 0, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V", line = 168)
    public static void method3606(boolean arg0) {
        field9029 = null;
        if (arg0) {
            field9033 = -119;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lre;ILdn;)V", line = 184)
    public class629(class515 arg0, int arg1, class438 arg2) {
        this.field9031 = arg2;
        this.field9031.method2554(32, 124);
    }
}
