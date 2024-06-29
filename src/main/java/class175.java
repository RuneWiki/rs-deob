import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class175 extends class62 {

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2033 = null;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public int field2031;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "Lpc;")
    public class22 field2024;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "[I")
    public static int[] field2032;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "[Lfi;")
    public class34[] field2030;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IB)V", line = 5)
    public static final void method1099(int arg0, String arg1, String arg2, String arg3, int arg4, String arg5, int arg6, byte arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class202.field2378[var8] = class202.field2378[var8 - 1];
            class411.field5662[var8] = class411.field5662[var8 - 1];
            class35.field382[var8] = class35.field382[var8 - 1];
            class217.field2664[var8] = class217.field2664[var8 - 1];
            class28.field321[var8] = class28.field321[var8 - 1];
            class293.field3857[var8] = class293.field3857[var8 - 1];
            class344.field4680[var8] = class344.field4680[var8 - 1];
        }
        field2028++;
        class202.field2378[0] = arg4;
        if (arg7 != 20) {
            field2032 = null;
        }
        class35.field382[0] = arg5;
        class411.field5662[0] = arg6;
        class217.field2664[0] = arg3;
        class28.field321[0] = arg1;
        class344.field4680[0] = arg0;
        class366.field4985 = class383.field5246;
        class293.field3857[0] = arg2;
        class33.field370++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILuo;)Z", line = 39)
    public final boolean method1100(int arg0, int arg1, int arg2, class118 arg3) {
        if (arg1 >= -78) {
            method1101(-124);
        }
        field2029++;
        if (this.field2030 != null) {
            for (int var5 = 0; var5 < this.field2030.length; var5++) {
                if (this.field2030[var5].method220(arg2, arg0) && this.field2024.method134(arg3, arg2, arg0, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V", line = 79)
    public static final void method1101(int arg0) {
        field2027++;
        class365 var1 = class168.field1960;
        synchronized (class168.field1960) {
            class168.field1960.method2290(arg0 ^ 0xFFFFBD70);
        }
        class365 var2 = class108.field1288;
        synchronized (class108.field1288) {
            class108.field1288.method2290(13831);
        }
        class365 var3 = class347.field4723;
        synchronized (class347.field4723) {
            class347.field4723.method2290(13831);
        }
        if (arg0 != -29833) {
            field2033 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V", line = 98)
    public static void method1102(int arg0) {
        field2032 = null;
        field2033 = null;
        if (arg0 != 1) {
            field2033 = null;
        }
    }
}
