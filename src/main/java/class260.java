import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class260 {

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Z")
    public boolean field3987 = true;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "C")
    private char field3978;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Ljava/lang/String;")
    public String field3990;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "[[B")
    public static byte[][] field3983;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILya;ZILla;II)V", line = 4)
    public static final void method1737(int arg0, class38 arg1, boolean arg2, int arg3, class317 arg4, int arg5, int arg6) {
        if (arg2) {
            class23.field283.method132((class80.field1163 - class23.field283.method129()) / 2, (class76.field1105 - class23.field283.method139()) / 2);
            class177.field2680.method132((class80.field1163 - class177.field2680.method129()) / 2, 18);
        }
        field3984++;
        String var7 = "";
        if (class312.field4691 == class282.field4297) {
            var7 = class386.field5809.method1635(class224.field3673, (byte) 121);
        } else if (class86.field1228 == class312.field4691) {
            var7 = class504.field7292.method1635(class224.field3673, (byte) 33);
        }
        arg4.method2030(class76.field1105 / 2 - 26, var7, -1, 0, arg6, class80.field1163 / 2);
        int var8 = class76.field1105 / 2 - 18;
        arg1.method293(class80.field1163 / 2 - 152, var8, 304, 34, arg0, 0);
        arg1.method293(class80.field1163 / 2 - 151, var8 + 1, 302, 32, 0, 0);
        arg1.method284(class80.field1163 / 2 - 150, var8 - -2, class141.field2163 * 3, 30, arg3, 0);
        arg1.method284(class80.field1163 / 2 + (class141.field2163 * 3) - 150, var8 + 2, 300 - (class141.field2163 * 3), 30, 0, 0);
        arg4.method2030(class76.field1105 / arg5 + 4, class249.field3883, -1, 0, arg6, class80.field1163 / 2);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Z", line = 35)
    public final boolean method1738(int arg0) {
        field3985++;
        if (arg0 > -65) {
            this.field3978 = 'j';
        }
        return this.field3978 == 's';
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILhp;)V", line = 46)
    public final void method1739(int arg0, class217 arg1) {
        field3986++;
        if (arg0 != 28239) {
            method1743(false);
        }
        while (true) {
            int var3 = arg1.method1515((byte) 126);
            if (var3 == 0) {
                return;
            }
            this.method1740(var3, arg0 - 28389, arg1);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILhp;)V", line = 70)
    private final void method1740(int arg0, int arg1, class217 arg2) {
        if (arg1 != -150) {
            return;
        }
        if (arg0 == 1) {
            this.field3978 = class467.method2818(arg2.method1565(true), (byte) 116);
        } else if (arg0 == 2) {
            this.field3981 = arg2.method1556(126);
        } else if (arg0 == 4) {
            this.field3987 = false;
        } else if (arg0 == 5) {
            this.field3990 = arg2.method1550((byte) 28);
        }
        field3988++;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 105)
    public static void method1741(int arg0) {
        if (arg0 != 30) {
            field3983 = null;
        }
        field3983 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Luq;B)Ljava/lang/String;", line = 116)
    public static final String method1742(class114 arg0, byte arg1) {
        field3979++;
        if (client.method1387(arg0).method2410(-16758) == 0) {
            return null;
        } else if (arg0.field1583 == null || arg0.field1583.trim().length() == 0) {
            return class64.field780 ? "Hidden-use" : null;
        } else {
            if (arg1 > -104) {
                method1742(null, (byte) 99);
            }
            return arg0.field1583;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 143)
    public static final void method1743(boolean arg0) {
        field3980++;
        class51 var1 = null;
        try {
            class449 var2 = class360.field5349.method2194("2", true, 0);
            while (var2.field6570 == 0) {
                class434.method2690(10, 1L);
            }
            if (var2.field6570 == 1) {
                var1 = (class51) var2.field6569;
                byte[] var3 = new byte[(int) var1.method492((byte) -35)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method491(var4, -1, var3, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class181.method1209(!arg0, new class217(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method496(-32307);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            field3982 = 75;
        }
    }
}
