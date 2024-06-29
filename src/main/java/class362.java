import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class362 {

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "Ljava/lang/String;")
    private String field5073 = "null";

    @OriginalMember(owner = "client!uia", name = "n", descriptor = "I")
    public static int field5077 = 0;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "C")
    public char field5067;

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "C")
    public char field5070;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "I")
    private int field5071;

    @OriginalMember(owner = "client!uia", name = "i", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!uia", name = "o", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!uia", name = "k", descriptor = "Lmp;")
    public class758 field5074;

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "Lmp;")
    private class758 field5076;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(II)I")
    public final int method2250(int arg0, int arg1) {
        field5075++;
        if (this.field5074 == null) {
            return this.field5071;
        } else if (arg1 < 16) {
            return 50;
        } else {
            class528 var3 = (class528) this.field5074.method4203(true, (long) arg0);
            return var3 == null ? this.field5071 : var3.field7502;
        }
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method2251(int arg0, int arg1) {
        field5069++;
        if (this.field5074 == null) {
            return this.field5073;
        }
        if (arg1 != -28891) {
            this.field5073 = null;
        }
        class589 var3 = (class589) this.field5074.method4203(true, (long) arg0);
        return var3 == null ? this.field5073 : var3.field8279;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2252(String arg0, int arg1) {
        field5078++;
        if (this.field5074 == null) {
            return false;
        }
        if (this.field5076 == null) {
            this.method2254(false);
        }
        for (class29 var3 = (class29) this.field5076.method4203(true, class426.method2594((byte) 26, arg0)); var3 != null; var3 = (class29) this.field5076.method4210(-127)) {
            if (var3.field399.equals(arg0)) {
                return true;
            }
        }
        if (arg1 != 3) {
            this.method2250(-56, -80);
        }
        return false;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IILud;)V")
    private final void method2253(int arg0, int arg1, class35 arg2) {
        if (arg0 != -3) {
            return;
        }
        if (arg1 == 1) {
            this.field5067 = class27.method199(16, arg2.method277((byte) -120));
        } else if (arg1 == 2) {
            this.field5070 = class27.method199(16, arg2.method277((byte) -128));
        } else if (arg1 == 3) {
            this.field5073 = arg2.method272(2);
        } else if (arg1 == 4) {
            this.field5071 = arg2.method234((byte) -107);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method253(arg0 ^ 0x3649);
            this.field5074 = new class758(class613.method3530(false, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method234((byte) -114);
                class626 var7;
                if (arg1 == 5) {
                    var7 = new class589(arg2.method272(~arg0));
                } else {
                    var7 = new class528(arg2.method234((byte) -105));
                }
                this.field5074.method4211(var7, (byte) 77, (long) var6);
            }
        }
        field5065++;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Z)V")
    private final void method2254(boolean arg0) {
        this.field5076 = new class758(this.field5074.method4206(-1));
        field5072++;
        for (class589 var2 = (class589) this.field5074.method4209(arg0); var2 != null; var2 = (class589) this.field5074.method4207(9356)) {
            class29 var3 = new class29(var2.field8279, (int) var2.field8991);
            this.field5076.method4211(var3, (byte) 61, class426.method2594((byte) 121, var2.field8279));
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V")
    private final void method2255(int arg0) {
        if (arg0 > -53) {
            this.method2251(125, 76);
        }
        field5066++;
        this.field5076 = new class758(this.field5074.method4206(-1));
        for (class528 var2 = (class528) this.field5074.method4209(false); var2 != null; var2 = (class528) this.field5074.method4207(9356)) {
            class528 var3 = new class528((int) var2.field8991);
            this.field5076.method4211(var3, (byte) 99, (long) var2.field7502);
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(JJ)J")
    public static long method2256(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(ILud;)V")
    public final void method2257(int arg0, class35 arg1) {
        field5068++;
        int var3 = -19 % ((70 - arg0) / 41);
        while (true) {
            int var4 = arg1.method273(255);
            if (var4 == 0) {
                return;
            }
            this.method2253(-3, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "(II)Z")
    public final boolean method2258(int arg0, int arg1) {
        field5064++;
        if (this.field5074 == null) {
            return false;
        }
        if (this.field5076 == null) {
            this.method2255(-62);
        }
        class528 var3 = (class528) this.field5076.method4203(true, (long) arg1);
        if (arg0 != -6) {
            this.method2252(null, 65);
        }
        return var3 != null;
    }
}
