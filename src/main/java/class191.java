import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class191 extends class280 {

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "[Z")
    public boolean[] field3080;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "[[I")
    public int[][] field3077;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "[I")
    public int[] field3078;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "[I")
    public int[] field3084;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Ljava/lang/String;")
    public static String field3085 = "M";

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3079 = "Attack";

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Llc;")
    public static class86 field3081;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "[I")
    public static int[] field3073;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public static void method1421(int arg0) {
        field3085 = null;
        if (arg0 != 0) {
            method1421(-14);
        }
        field3073 = null;
        field3079 = null;
        field3081 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
    public static final void method1422(Throwable arg0, String arg1, byte arg2) {
        field3087++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class39.method304(-1, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class159.method1182(var3, (byte) 77);
            String var4 = class97.method751(":", var3, "%3a", (byte) -61);
            String var5 = class97.method751("@", var4, "%40", (byte) -61);
            String var6 = class97.method751("&", var5, "%26", (byte) -61);
            int var7 = 75 / ((9 - arg2) / 38);
            String var8 = class97.method751("#", var6, "%23", (byte) -61);
            if (class193.field3101.field63 != null) {
                class278 var9 = class193.field3101.method55(new URL(class193.field3101.field63.getCodeBase(), "clienterror.ws?c=" + class58.field824 + "&u=" + class266.field4304 + "&v1=" + class7.field67 + "&v2=" + class7.field68 + "&e=" + var8), 0);
                while (var9.field4450 == 0) {
                    class43.method324(1L, -127);
                }
                if (var9.field4450 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field4449;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I[B)V")
    public class191(int arg0, byte[] arg1) {
        this.field3075 = arg0;
        class152 var3 = new class152(arg1);
        this.field3074 = var3.method1111(255);
        this.field3080 = new boolean[this.field3074];
        this.field3077 = new int[this.field3074][];
        this.field3078 = new int[this.field3074];
        this.field3084 = new int[this.field3074];
        for (int var4 = 0; var4 < this.field3074; var4++) {
            this.field3084[var4] = var3.method1111(255);
        }
        for (int var5 = 0; var5 < this.field3074; var5++) {
            this.field3080[var5] = var3.method1111(255) == 1;
        }
        for (int var6 = 0; var6 < this.field3074; var6++) {
            this.field3078[var6] = var3.method1126(false);
        }
        for (int var7 = 0; var7 < this.field3074; var7++) {
            this.field3077[var7] = new int[var3.method1111(255)];
        }
        for (int var8 = 0; var8 < this.field3074; var8++) {
            for (int var9 = 0; var9 < this.field3077[var8].length; var9++) {
                this.field3077[var8][var9] = var3.method1111(255);
            }
        }
    }
}
