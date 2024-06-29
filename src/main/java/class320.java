import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class320 {

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Ltl;")
    private class400 field4786 = new class400(256);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lui;")
    private class451 field4781;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Liu;")
    public static class397 field4787;

    static {
        new class332("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 5)
    public final void method1965(int arg0) {
        field4784++;
        class400 var2 = this.field4786;
        synchronized (this.field4786) {
            this.field4786.method2401((byte) -43);
        }
        if (arg0 >= -120) {
            method1966(true, -6);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V", line = 18)
    public static final void method1966(boolean arg0, int arg1) {
        class418.method2483((byte) 123);
        field4782++;
        if (arg1 != -8109) {
            method1966(false, 120);
        }
        if (class316.field4752 != 30 && class316.field4752 != 25) {
            return;
        }
        class90.field1257++;
        if (class90.field1257 < 50 && !arg0) {
            return;
        }
        class90.field1257 = 0;
        if (!class143.field2039 && class27.field335 != null) {
            class378.method2320(class334.field4986, (byte) 119);
            class210.field3155++;
            try {
                class27.field335.method1000(30000, 0, class230.field3390.field6315, class230.field3390.field6316);
                class230.field3390.field6315 = 0;
            } catch (IOException var2) {
                class143.field2039 = true;
            }
        }
        class418.method2483((byte) 83);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 56)
    public final void method1967(int arg0) {
        class400 var2 = this.field4786;
        synchronized (this.field4786) {
            if (arg0 < 41) {
                method1971(-9, 59, (byte[]) null, -93);
            }
            this.field4786.method2388(-92);
        }
        field4783++;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V", line = 74)
    public static void method1968(int arg0) {
        field4787 = null;
        if (arg0 != -26150) {
            method1966(true, -90);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)V", line = 88)
    public final void method1969(int arg0, byte arg1) {
        if (arg1 <= 125) {
            method1966(true, 96);
        }
        field4785++;
        class400 var3 = this.field4786;
        synchronized (this.field4786) {
            this.field4786.method2389(false, arg0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lih;", line = 103)
    public final class115 method1970(int arg0, int arg1) {
        field4789++;
        class400 var3 = this.field4786;
        class115 var4;
        synchronized (this.field4786) {
            var4 = (class115) this.field4786.method2393(arg1 ^ 0xFFFFFF80, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4781.method2691(arg0, 26, arg1);
        class115 var6 = new class115();
        if (var5 != null) {
            var6.method819(new class446(var5), (byte) 85);
        }
        class400 var7 = this.field4786;
        synchronized (this.field4786) {
            this.field4786.method2395(0, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lgp;ILui;)V", line = 169)
    public class320(class430 arg0, int arg1, class451 arg2) {
        this.field4781 = arg2;
        this.field4781.method2662(26, (byte) -7);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 131)
    public static final String method1971(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != -28530) {
            method1966(true, 14);
        }
        field4788++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg2[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class271.field4082[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }
}
