import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class278 extends OutputStream {

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "[Lok;")
    public static class153[] field4093;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "Lwf;")
    public static class79 field4091;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public static void method1759(byte arg0) {
        if (arg0 <= -126) {
            field4091 = null;
            field4093 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4088++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1760(String arg0, byte arg1) {
        field4089++;
        if (arg0 == null) {
            return;
        }
        int var2 = 78 / ((19 - arg1) / 33);
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var3 = class191.method1180((byte) -105, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class350.field5065; var4++) {
            String var5 = class7.field70[var4];
            if (var5.startsWith("*")) {
                var5 = var5.substring(1);
            }
            String var6 = class191.method1180((byte) -102, var5);
            if (var6 != null && var6.equals(var3)) {
                class350.field5065--;
                for (int var7 = var4; var7 < class350.field5065; var7++) {
                    class7.field70[var7] = class7.field70[var7 + 1];
                    class143.field1897[var7] = class143.field1897[var7 + 1];
                    class204.field3025[var7] = class204.field3025[var7 + 1];
                    class404.field5693[var7] = class404.field5693[var7 + 1];
                    class328.field4751[var7] = class328.field4751[var7 + 1];
                }
                class99.field1271 = class27.field367;
                class343.field4994++;
                class15.method110(class141.field1879, -127);
                class225.field3415.method1753(true, class89.method501(arg0, true));
                class225.field3415.method1730(-11508, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ldt;I)V")
    public static final void method1761(class145 arg0, int arg1) {
        if (arg0.field2073 == 5 && arg0.field2016 != -1) {
            class41.method276((byte) 47, class141.field1878, arg0);
        }
        if (arg1 > -110) {
            field4092 = -2;
        }
        field4090++;
    }

    static {
        new class326("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field4092 = 0;
        field4093 = new class153[14];
        field4091 = new class79(51, 7);
    }
}
