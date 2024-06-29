import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class387 extends class501 {

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Llb;")
    private class465 field5321;

    static {
        new class572("Ok", "Okay", "OK", "Ok");
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLgw;)V", line = 4)
    public final void method2303(boolean arg0, class148 arg1) {
        while (true) {
            int var3 = arg1.method1032((byte) -33);
            if (var3 == 0) {
                if (!arg0) {
                    field5318 = 103;
                }
                field5319++;
                return;
            }
            this.method2304(arg0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZILgw;)V", line = 34)
    private final void method2304(boolean arg0, int arg1, class148 arg2) {
        field5315++;
        if (arg1 == 249) {
            int var4 = arg2.method1032((byte) -33);
            if (this.field5321 == null) {
                int var5 = class322.method1938(var4, 68);
                this.field5321 = new class465(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1032((byte) -33) == 1;
                int var8 = arg2.method1028((byte) 123);
                class417 var9;
                if (var7) {
                    var9 = new class528(arg2.method1023(-29153));
                } else {
                    var9 = new class556(arg2.method1026(-917302120));
                }
                this.field5321.method2797(-4234, var9, (long) var8);
            }
        }
        if (!arg0) {
            field5318 = 41;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BB)C", line = 79)
    public static final char method2305(byte arg0, byte arg1) {
        field5320++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class360.field4900[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        if (arg0 >= -77) {
            method2305((byte) 103, (byte) -7);
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I", line = 108)
    public final int method2306(int arg0, int arg1, int arg2) {
        field5316++;
        if (this.field5321 == null) {
            return arg0;
        } else if (arg1 > -107) {
            return 107;
        } else {
            class556 var4 = (class556) this.field5321.method2799((long) arg2, true);
            return var4 == null ? arg0 : var4.field8278;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;", line = 127)
    public final String method2307(int arg0, String arg1, byte arg2) {
        if (arg2 < 123) {
            field5318 = 87;
        }
        field5317++;
        if (this.field5321 == null) {
            return arg1;
        } else {
            class528 var4 = (class528) this.field5321.method2799((long) arg0, true);
            return var4 == null ? arg1 : var4.field7892;
        }
    }
}
