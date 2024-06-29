import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class508 extends class583 {

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "Ljava/lang/String;")
    public String field7270;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "Llga;")
    public class711 field7267;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "Z")
    public static boolean field7269 = false;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "Lqfa;")
    public static class98 field7266 = new class98(3, 0);

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
    public int field7268;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZLjb;)V", line = 7)
    public static final void method2999(boolean arg0, class493 arg1) {
        field7272++;
        class493 var2 = class315.method2032(arg1, true);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class172.field2348;
            var4 = class446.field6323;
        } else {
            var3 = var2.field7031;
            var4 = var2.field7095;
        }
        class661.method3627(arg1, var3, (byte) -99, var4, arg0);
        class196.method1208(126, var3, arg1, var4);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLbe;)Z", line = 31)
    public final boolean method3000(byte arg0, class37 arg1) {
        int var3 = 50 / ((-arg0 - 67) / 57);
        field7264++;
        arg1.method3311(100);
        boolean var4 = true;
        class37 var5 = (class37) this.field7267.method4000((byte) -7);
        while (var5 != null) {
            if (class356.method2290(false, var5.field463, arg1.field463)) {
                class420.method2577(-48, var5, arg1);
                this.field7268++;
                if (var4) {
                    return false;
                }
                return true;
            }
            var5 = (class37) this.field7267.method4002(-77);
            var4 = false;
        }
        this.field7267.method3999(arg1, 21934);
        this.field7268++;
        return var4;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IB)V", line = 61)
    public static final void method3001(int arg0, byte arg1) {
        field7265++;
        if (class741.field10305 == null) {
            class741.field10305 = new byte[4][class336.field4683][class700.field9768];
        }
        int var2 = 36 % ((arg0 + 14) / 51);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < class336.field4683; var4++) {
                for (int var5 = 0; var5 < class700.field9768; var5++) {
                    class741.field10305[var3][var4][var5] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)I", line = 100)
    public final int method3002(byte arg0) {
        if (arg0 != 79) {
            this.field7270 = null;
        }
        field7274++;
        return this.field7267.field9891.field8206 == this.field7267.field9891 ? -1 : ((class37) this.field7267.field9891.field8206).field463;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lbe;B)Z", line = 123)
    public final boolean method3003(class37 arg0, byte arg1) {
        field7271++;
        if (arg1 != 20) {
            return false;
        }
        int var3 = this.method3002((byte) 79);
        arg0.method3311(100);
        this.field7268--;
        if (this.field7268 != 0) {
            return this.method3002((byte) 79) != var3;
        }
        this.method1185(-41);
        this.method3311(arg1 + 80);
        class350.field4958--;
        class609.field8569.method4018((byte) 127, this, arg0.field466);
        return false;
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)V", line = 150)
    public static void method3004(byte arg0) {
        if (arg0 <= 38) {
            field7266 = null;
        }
        field7266 = null;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 159)
    public class508(String arg0) {
        this.field7270 = arg0;
        this.field7267 = new class711();
    }
}
