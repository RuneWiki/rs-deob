import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class530 {

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "B")
    public byte field6884 = 0;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "S")
    public short field6888;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "B")
    public byte field6889;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "B")
    public byte field6897;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "S")
    public short field6882;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Lft;")
    public static class285 field6875 = new class285(1, 4);

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "B")
    public byte field6880;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "B")
    public byte field6881;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "B")
    public byte field6891;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "B")
    public byte field6899;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "J")
    public static long field6877;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "Lpga;")
    public class152 field6878;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "Llga;")
    public class17 field6879;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "Llga;")
    public class17 field6886;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "Lfi;")
    public class237 field6893;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "Lfi;")
    public class237 field6895;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "Lun;")
    public class266 field6896;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "Lqu;")
    public class282 field6890;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "Lgn;")
    public class530 field6898;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "Lsr;")
    public class571 field6887;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "S")
    public short field6883;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "Z")
    public boolean field6885;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "Z")
    public boolean field6892;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "Z")
    public boolean field6894;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2818(int arg0) {
        class62.field848 = arg0;
        for (int var1 = 0; var1 < class590.field8010; var1++) {
            for (int var2 = 0; var2 < class151.field1933; var2++) {
                if (class483.field6438[arg0][var1][var2] == null) {
                    class483.field6438[arg0][var1][var2] = new class530(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 29)
    public final void method2819(byte arg0) {
        while (this.field6887 != null) {
            class571 var2 = this.field6887.field7445;
            this.field6887.method3049((byte) 112);
            this.field6887 = var2;
        }
        field6876++;
        this.field6884 = 0;
        if (arg0 < 29) {
            this.method2819((byte) 127);
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V", line = 50)
    public static void method2820(byte arg0) {
        field6875 = null;
        if (arg0 != -127) {
            field6877 = 84L;
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)[Len;", line = 60)
    public static final class368[] method2821(int arg0) {
        field6873++;
        if (arg0 <= 18) {
            field6875 = null;
        }
        return new class368[] { class130.field1676, class556.field7273, class368.field4751 };
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V", line = 75)
    public static final void method2822(int arg0) {
        if (arg0 < 13) {
            field6877 = -52L;
        }
        for (class126 var1 = (class126) class600.field8094.method2102(-101); var1 != null; var1 = (class126) class600.field8094.method2102(-97)) {
            class596.method3233(72, var1);
        }
        field6874++;
        int var2;
        int var3;
        if (class260.field3509.method1571(class364.field4697, -23572)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class517.field6768;
            var2 = class517.field6768;
        }
        client.method706();
        for (int var4 = var2; var4 <= var3; var4++) {
            client.method705();
            client.method702(var4);
            client.method715(var4);
        }
        client.method703();
        client.method714();
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(III)V", line = 117)
    public class530(int arg0, int arg1, int arg2) {
        this.field6888 = (short) arg2;
        this.field6897 = this.field6889 = (byte) arg0;
        this.field6882 = (short) arg1;
    }
}
