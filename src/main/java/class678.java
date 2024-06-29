import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class678 {

    @OriginalMember(owner = "client!on", name = "c", descriptor = "Lme;")
    private class668 field9347 = new class668(64);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "Lpe;")
    private class615 field9345;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "Lra;")
    public static class361 field9348 = new class361(35, -1);

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field9351;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field9352;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V", line = 3)
    public final void method3725(int arg0, int arg1) {
        class668 var3 = this.field9347;
        synchronized (this.field9347) {
            if (arg0 != -14331) {
                this.field9347 = null;
            }
            this.field9347.method3659(-117, arg1);
        }
        field9349++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 16)
    public static final boolean method3726(String arg0, boolean arg1) {
        field9346++;
        if (arg0 == null) {
            return false;
        }
        if (arg1) {
            field9348 = null;
        }
        for (int var2 = 0; var2 < class665.field9225; var2++) {
            if (arg0.equalsIgnoreCase(class405.field5160[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class233.field3130.field2492);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)Lsb;", line = 47)
    public final class362 method3727(int arg0, byte arg1) {
        field9351++;
        class668 var3 = this.field9347;
        class362 var4;
        synchronized (this.field9347) {
            var4 = (class362) this.field9347.method3655(-28, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field9345;
        byte[] var6;
        synchronized (this.field9345) {
            var6 = this.field9345.method3346(-1, 31, arg0);
        }
        class362 var7 = new class362();
        if (var6 != null) {
            var7.method2074(new class418(var6), 32767);
        }
        int var8 = 74 / ((arg1 - 31) / 53);
        class668 var9 = this.field9347;
        synchronized (this.field9347) {
            this.field9347.method3650((long) arg0, -109, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 79)
    public static void method3728(int arg0) {
        if (arg0 == -10718) {
            field9348 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 89)
    public final void method3729(int arg0) {
        field9352++;
        class668 var2 = this.field9347;
        synchronized (this.field9347) {
            this.field9347.method3656((byte) 0);
        }
        if (arg0 != -30915) {
            this.method3725(-86, -17);
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lvd;ILpe;)V", line = 122)
    public class678(class635 arg0, int arg1, class615 arg2) {
        this.field9345 = arg2;
        this.field9345.method3341(31, -19046);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 110)
    public final void method3730(byte arg0) {
        class668 var2 = this.field9347;
        synchronized (this.field9347) {
            this.field9347.method3658(0);
        }
        if (arg0 != -55) {
            method3726(null, false);
        }
        field9350++;
    }
}
