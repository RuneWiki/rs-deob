import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class51 {

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Z")
    public boolean field737 = false;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Z")
    public static boolean field743 = true;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lch;")
    public static class151 field745 = new class151("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field746 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lrf;")
    public class106 field739;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lkk;IB)V", line = 14)
    private final void method488(class161 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field735 = arg0.method1134(-16848);
        } else if (arg1 == 2) {
            this.field738 = arg0.method1178((byte) 63);
        } else if (arg1 == 3) {
            this.field737 = true;
        } else if (arg1 == 4) {
            this.field735 = -1;
        }
        field742++;
        if (arg2 >= -126) {
            this.method491((byte) -40, (class161) null);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lvc;ZIB)Lrn;", line = 44)
    public final class417 method489(class89 arg0, boolean arg1, int arg2, byte arg3) {
        field744++;
        if (arg3 < 50) {
            this.field735 = -97;
        }
        long var5 = (long) ((arg1 ? 262144 : 0) | this.field735 | arg2 << 16 | arg0.field1262 << 19);
        class417 var7 = (class417) this.field739.field1496.method2113(0, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field739.field1492.method2627((byte) 87, this.field735)) {
            class355 var8 = class355.method2187(this.field739.field1492, this.field735, 0);
            if (var8 != null) {
                var8.field4878 = var8.field4874 = var8.field4875 = var8.field4873 = 0;
                if (arg1) {
                    var8.method2195();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method2191();
                }
            }
            class417 var10 = arg0.method302(var8, true);
            if (var10 != null) {
                this.field739.field1496.method2116(var5, (byte) -52, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 88)
    public static void method490(byte arg0) {
        field745 = null;
        field746 = null;
        if (arg0 != -84) {
            method490((byte) -125);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLkk;)V", line = 99)
    public final void method491(byte arg0, class161 arg1) {
        if (arg0 != -21) {
            return;
        }
        while (true) {
            int var3 = arg1.method1172((byte) -113);
            if (var3 == 0) {
                field736++;
                return;
            }
            this.method488(arg1, var3, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Z", line = 126)
    public final boolean method492(int arg0) {
        int var2 = -115 / ((arg0 - 65) / 33);
        field740++;
        return this.field739.field1492.method2627((byte) 32, this.field735);
    }
}
