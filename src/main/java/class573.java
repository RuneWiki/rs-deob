import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class573 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Z")
    public boolean field8299 = true;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8305 = new String[] { method4268(method4267("2vFxz")), method4268(method4267("2vFyz")), method4268(method4267("-n\u0004V")), method4268(method4267("2vF~z")), method4268(method4267("85F\u0014/")), method4268(method4267("2vF{z")) };

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field8301 = -1;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "C")
    private char field8302;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field8295;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field8297;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Ljava/lang/String;")
    public String field8298;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIB)V")
    public static final void method4263(int arg0, int arg1, byte arg2) {
        try {
            field8300++;
            if (arg2 <= 6) {
                method4263(7, -125, (byte) -38);
            }
            if (class586.method4335((byte) 120)) {
                class139.field1812 = arg1;
                if (class466.field6807 != arg0) {
                    class216.field3166 = "";
                }
                class466.field6807 = arg0;
                class699.method5035(6, 31754);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8305[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)Z")
    public final boolean method4264(byte arg0) {
        try {
            if (arg0 < 90) {
                return true;
            } else {
                field8303++;
                return this.field8302 == 's';
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8305[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljc;II)V")
    private final void method4265(class711 arg0, int arg1, int arg2) {
        try {
            if (arg2 <= 118) {
                this.field8299 = true;
            }
            field8297++;
            if (arg1 == 1) {
                this.field8302 = class365.method2901((byte) 116, arg0.method5125((byte) -102));
            } else if (arg1 == 2) {
                this.field8295 = arg0.method5113(18443);
                return;
            } else if (arg1 == 4) {
                this.field8299 = false;
                return;
            } else if (arg1 == 5) {
                this.field8298 = arg0.method5144(-16414);
                return;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8305[5] + (arg0 == null ? field8305[2] : field8305[4]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljc;I)V")
    public final void method4266(class711 arg0, int arg1) {
        try {
            field8296++;
            if (arg1 != -1) {
                this.method4264((byte) 44);
            }
            while (true) {
                int var3 = arg0.method5128(0);
                if (var3 == 0) {
                    return;
                }
                this.method4265(arg0, var3, 126);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8305[3] + (arg0 == null ? field8305[2] : field8305[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4267(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4268(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
