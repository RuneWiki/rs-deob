import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class601 extends class114 {

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "J")
    private long field8606 = -1L;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Ljava/lang/String;")
    private String field8608 = null;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8612 = new String[] { method4444(method4443("ih\u0013t")), method4444(method4443("|3Q6Z")), method4444(method4443("c~Q\\\u000f")), method4444(method4443("c~QY\u000f")), method4444(method4443("c~Q[\u000f")), method4444(method4443("c~QZ\u000f")) };

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lgia;")
    public static class173 field8609 = new class173(method4444(method4443("U^")), 1);

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lmv;")
    public static class125 field8611 = new class125(63, 3);

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "[Llt;")
    public static class182[] field8604;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static final void method4441(byte arg0) {
        try {
            class63.method672(false, 64);
            if (arg0 != 72) {
                method4441((byte) -123);
            }
            field8610++;
            if (class467.field6819 >= 0 && class467.field6819 != 0) {
                class279.method2271(7, false, class467.field6819);
                class467.field6819 = -1;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8612[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method4442(int arg0) {
        try {
            field8604 = null;
            if (arg0 != -1) {
                method4442(-102);
            }
            field8611 = null;
            field8609 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8612[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljc;I)V")
    public final void method116(class711 arg0, int arg1) {
        try {
            if (arg0.method5128(0) != 255) {
                arg0.field9945--;
                this.field8606 = arg0.method5147((byte) 101);
            }
            if (arg1 != -27800) {
                this.method115(-106, null);
            }
            field8603++;
            this.field8608 = arg0.method5084(-71);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8612[3] + (arg0 == null ? field8612[0] : field8612[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILwfa;)V")
    public final void method115(int arg0, class286 arg1) {
        try {
            if (arg0 != 95) {
                method4441((byte) 31);
            }
            field8607++;
            arg1.method2324(this.field8608, arg0 - 96, this.field8606);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8612[2] + arg0 + ',' + (arg1 == null ? field8612[0] : field8612[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4443(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4444(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 7;
                    break;
                case 1:
                    var10005 = 29;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 24;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
