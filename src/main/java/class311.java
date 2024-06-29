import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class311 extends InputStream {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field5001 = 100;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field5008 = 10;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "[I")
    public static int[] field5010 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lnh;")
    public static class305 field5009;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Z")
    public static final boolean method2104(int arg0, int arg1) {
        field5002++;
        if (class191.field2906[arg1]) {
            return true;
        } else if (class110.field1568.method2060(arg1, -31657)) {
            int var2 = class110.field1568.method2067(arg1, (byte) 51);
            if (var2 == 0) {
                class191.field2906[arg1] = true;
                return true;
            }
            if (class262.field4214[arg1] == null) {
                class262.field4214[arg1] = new class178[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class262.field4214[arg1][var3] == null) {
                    byte[] var4 = class110.field1568.method2050(91, arg1, var3);
                    if (var4 != null) {
                        class178 var5 = class262.field4214[arg1][var3] = new class178();
                        var5.field2545 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1127(-1, new class215(var4));
                        } else {
                            var5.method1135(-1, new class215(var4));
                        }
                    }
                }
            }
            if (arg0 < 29) {
                method2106('-', 95);
            }
            class191.field2906[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static final void method2105(byte arg0) {
        if (arg0 >= -89) {
            field5005 = -76;
        }
        class102.field1466 = 0;
        field5007++;
        class19.field322 = 0;
        class117.method747(2);
        class297.method2001(32);
        class149.method938(2);
        for (int var1 = 0; var1 < class19.field322; var1++) {
            int var3 = class194.field2959[var1];
            if (class35.field533 != class88.field1274[var3].field4119) {
                if (class88.field1274[var3].field4993.method1305(48)) {
                    class16.method113((byte) 95, class88.field1274[var3]);
                }
                class88.field1274[var3].method2103((class211) null, (byte) -119);
                class88.field1274[var3] = null;
            }
        }
        if (class114.field1632 != class131.field1830.field3280) {
            throw new RuntimeException("gnp1 pos:" + class131.field1830.field3280 + " psize:" + class114.field1632);
        }
        for (int var2 = 0; var2 < class306.field4921; var2++) {
            if (class88.field1274[class131.field1834[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class306.field4921);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "read", descriptor = "()I")
    public final int read() {
        field5004++;
        class17.method116(-125, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(CI)Z")
    public static final boolean method2106(char arg0, int arg1) {
        field5003++;
        int var2 = 102 % ((arg1 - 34) / 38);
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public static void method2107(byte arg0) {
        field5010 = null;
        field5009 = null;
        if (arg0 > -17) {
            method2107((byte) 7);
        }
    }
}
