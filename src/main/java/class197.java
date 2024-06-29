import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class197 extends class130 {

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public int field3069;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!js", name = "r", descriptor = "I")
    public int field3076;

    @OriginalMember(owner = "client!js", name = "s", descriptor = "I")
    public int field3077;

    @OriginalMember(owner = "client!js", name = "t", descriptor = "I")
    public int field3078;

    @OriginalMember(owner = "client!js", name = "u", descriptor = "I")
    public int field3079;

    @OriginalMember(owner = "client!js", name = "v", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!js", name = "w", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!js", name = "x", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "I")
    public int field3084;

    @OriginalMember(owner = "client!js", name = "B", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!js", name = "D", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!js", name = "E", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!js", name = "F", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!js", name = "G", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!js", name = "A", descriptor = "Llm;")
    public class248 field3085;

    @OriginalMember(owner = "client!js", name = "H", descriptor = "Lwv;")
    public class321 field3091;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "Luj;")
    public class480 field3092;

    @OriginalMember(owner = "client!js", name = "y", descriptor = "Lrm;")
    public class79 field3083;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
    public final void method1406(byte arg0) {
        if (arg0 > -97) {
            this.field3087 = -103;
        }
        this.field3092 = null;
        this.field3091 = null;
        this.field3085 = null;
        this.field3083 = null;
        field3082++;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method1407(boolean arg0, String arg1, Throwable arg2) {
        field3080++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class339.method2195(0, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class50.method330(!arg0, var3);
            String var4 = class30.method186("%3a", var3, ":", (byte) 127);
            if (arg0) {
                String var5 = class30.method186("%40", var4, "@", (byte) -120);
                String var6 = class30.method186("%26", var5, "&", (byte) 123);
                String var7 = class30.method186("%23", var6, "#", (byte) 125);
                if (class227.field3445.field1062 != null) {
                    class329 var8 = class227.field3445.method446(new URL(class227.field3445.field1062.getCodeBase(), "clienterror.ws?c=" + class20.field225 + "&u=" + class528.field7726 + "&v1=" + class66.field1040 + "&v2=" + class66.field1046 + "&e=" + var7), 19779);
                    while (var8.field4974 == 0) {
                        class468.method2848(1L, (byte) -69);
                    }
                    if (var8.field4974 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field4975;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }
}
