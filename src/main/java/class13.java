import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class13 {

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
    public int field182 = 1;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public int field184 = -1;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "Z")
    public boolean field183 = false;

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "Z")
    public boolean field188 = false;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
    public int field185 = 64;

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
    public int field189 = 2;

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
    public int field186 = 64;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "[I")
    public static int[] field181 = new int[6];

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "[I")
    public static int[] field187 = new int[32];

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
    public static int field190;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uw", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field191;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIII)Z")
    public static final boolean method182(int arg0, int arg1, int arg2, int arg3) {
        field179++;
        boolean var4 = true;
        class559 var5 = (class559) class548.method3123(arg3, arg0, arg2);
        if (var5 != null) {
            var4 &= class533.method3034(-77, var5);
        }
        int var6 = -51 / ((arg1 + 9) / 55);
        class559 var7 = (class559) class730.method4079(arg3, arg0, arg2, field191 == null ? (field191 = method186("op")) : field191);
        if (var7 != null) {
            var4 &= class533.method3034(-102, var7);
        }
        class559 var8 = (class559) class315.method1848(arg3, arg0, arg2);
        if (var8 != null) {
            var4 &= class533.method3034(-103, var8);
        }
        return var4;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIILtn;)V")
    private final void method183(int arg0, int arg1, int arg2, class179 arg3) {
        if (arg0 == 1) {
            this.field184 = arg3.method1107(false);
            if (this.field184 == 65535) {
                this.field184 = -1;
            }
        } else if (arg0 == 2) {
            this.field185 = arg3.method1107(false) + 1;
            this.field186 = arg3.method1107(false) + 1;
        } else if (arg0 == 3) {
            arg3.method1133(8);
        } else if (arg0 == 4) {
            this.field189 = arg3.method1094(255);
        } else if (arg0 == 5) {
            this.field182 = arg3.method1094(255);
        } else if (arg0 == 6) {
            this.field183 = true;
        } else if (arg0 == 7) {
            this.field188 = true;
        }
        field180++;
        int var5 = -109 % ((44 - arg2) / 57);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BILtn;)V")
    public final void method184(byte arg0, int arg1, class179 arg2) {
        if (arg0 != 2) {
            return;
        }
        while (true) {
            int var4 = arg2.method1094(255);
            if (var4 == 0) {
                field190++;
                return;
            }
            this.method183(var4, arg1, 119, arg2);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
    public static void method185(int arg0) {
        field181 = null;
        field187 = null;
        if (arg0 != -1) {
            method185(28);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method186(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
