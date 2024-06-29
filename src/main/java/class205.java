import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class205 {

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "Ldc;")
    private class5 field2829 = new class5(64);

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Ldc;")
    public class5 field2837 = new class5(64);

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "Lhe;")
    private class239 field2836;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Lhe;")
    public class239 field2832;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "Lwt;")
    public static class194 field2838;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "Liu;")
    public static class390 field2841;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2842;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public final void method1261(byte arg0) {
        field2830++;
        class5 var2 = this.field2829;
        synchronized (this.field2829) {
            this.field2829.method38(arg0);
        }
        class5 var3 = this.field2837;
        synchronized (this.field2837) {
            this.field2837.method38((byte) -113);
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)V")
    public static void method1262(byte arg0) {
        field2842 = null;
        if (arg0 != -121) {
            method1262((byte) 13);
        }
        field2841 = null;
        field2838 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIB)V")
    public final void method1263(int arg0, int arg1, byte arg2) {
        this.field2829 = new class5(arg1);
        field2840++;
        this.field2837 = new class5(arg0);
        int var4 = 123 % ((arg2 + 67) / 43);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)Lfp;")
    public final class203 method1264(int arg0, byte arg1) {
        field2831++;
        class5 var3 = this.field2829;
        class203 var4;
        synchronized (this.field2829) {
            var4 = (class203) this.field2829.method40(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2836.method1470(4, arg0, 34);
        class203 var6 = new class203();
        int var7 = 120 % ((arg1 + 53) / 55);
        var6.field2816 = this;
        if (var5 != null) {
            var6.method1252(-1, new class156(var5));
        }
        class5 var8 = this.field2829;
        synchronized (this.field2829) {
            this.field2829.method36(-20960, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
    public final void method1265(boolean arg0) {
        if (arg0) {
            this.method1267((byte) -128, -116);
        }
        field2833++;
        class5 var2 = this.field2829;
        synchronized (this.field2829) {
            this.field2829.method35((byte) -1);
        }
        class5 var3 = this.field2837;
        synchronized (this.field2837) {
            this.field2837.method35((byte) -1);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Lih;")
    public static final class474 method1266(int arg0, int arg1) {
        if (arg1 != -2) {
            method1266(-103, -43);
        }
        field2834++;
        if (arg0 == 0) {
            if ((double) class249.field3581 == 3.0D) {
                return class472.field6822;
            }
            if ((double) class249.field3581 == 4.0D) {
                return class94.field1268;
            }
            if ((double) class249.field3581 == 6.0D) {
                return class411.field6035;
            }
            if ((double) class249.field3581 >= 8.0D) {
                return class96.field1290;
            }
        } else if (arg0 == 1) {
            if ((double) class249.field3581 == 3.0D) {
                return class411.field6035;
            }
            if ((double) class249.field3581 == 4.0D) {
                return class96.field1290;
            }
            if ((double) class249.field3581 == 6.0D) {
                return class206.field2851;
            }
            if ((double) class249.field3581 >= 8.0D) {
                return class251.field3613;
            }
        } else if (arg0 == 2) {
            if ((double) class249.field3581 == 3.0D) {
                return class206.field2851;
            }
            if ((double) class249.field3581 == 4.0D) {
                return class251.field3613;
            }
            if ((double) class249.field3581 == 6.0D) {
                return class493.field7525;
            }
            if ((double) class249.field3581 >= 8.0D) {
                return class400.field5888;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V")
    public final void method1267(byte arg0, int arg1) {
        field2835++;
        class5 var3 = this.field2829;
        synchronized (this.field2829) {
            this.field2829.method39(false, arg1);
        }
        if (arg0 < 45) {
            field2843 = 98;
        }
        class5 var4 = this.field2837;
        synchronized (this.field2837) {
            this.field2837.method39(false, arg1);
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lci;ILhe;Lhe;)V")
    public class205(class298 arg0, int arg1, class239 arg2, class239 arg3) {
        this.field2836 = arg2;
        this.field2832 = arg3;
        this.field2836.method1473(4309, 34);
    }

    static {
        new class194("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field2838 = new class194("cyan:", "blaugrün:", "cyan:", "cyan:");
        field2841 = new class390(108, -1);
        field2842 = null;
    }
}
