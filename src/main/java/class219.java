import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class219 extends class452 {

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    private int field3111;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    private int field3103;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    private int field3105;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    private int field3108;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3104 = " has logged in.";

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field3100 = -1;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "[I")
    public static int[] field3110 = new int[4096];

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "[I")
    public static int[] field3109 = new int[13];

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIB)V")
    public final void method496(int arg0, int arg1, byte arg2) {
        ++field3101;
        int var4 = this.field3108 * arg1 >> 12;
        int var5 = this.field3105 * arg1 >> 12;
        if (arg2 == 75) {
            int var6 = this.field3103 * arg0 >> 12;
            int var7 = this.field3111 * arg0 >> 12;
            class39.method306(var4, var6, super.field6589, 1, var5, var7);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lfg;I)V")
    public static final void method1358(class18 arg0, int arg1) {
        if (arg1 <= -82) {
            ++field3112;
            int var2 = -class50.field698 + arg0.field281;
            int var3 = arg0.field256 * 128 - -(arg0.method130((byte) -116) * 64);
            int var4 = arg0.field224 * 128 + 64 * arg0.method130((byte) -98);
            arg0.field296 = 0;
            arg0.field5298 += (-arg0.field5298 + var4) / var2;
            arg0.field5284 += (var3 - arg0.field5284) / var2;
            if (~arg0.field242 == -1) {
                arg0.method143(-1408718297, 8192);
            }
            if (arg0.field242 == 1) {
                arg0.method143(-1408718297, 12288);
            }
            if (arg0.field242 == 2) {
                arg0.method143(-1408718297, 0);
            }
            if (~arg0.field242 == -4) {
                arg0.method143(-1408718297, 4096);
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IIIIIII)V")
    public class219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3111 = arg3;
        this.field3103 = arg1;
        this.field3105 = arg2;
        this.field3108 = arg0;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public static final void method1359(int arg0) {
        class152 var1 = class126.field1672;
        synchronized (class126.field1672) {
            class10.field100 = class179.field2363;
            ++class295.field4256;
            class34.field555 = class167.field2196;
            int var2 = 27 / ((arg0 - -42) / 59);
            class316.field4522 = class144.field1897;
            class84.field1173 = client.field3669;
            class242.field3390 = class424.field6308;
            class420.field6256 = class6.field62;
            class81.field1131 = class309.field4414;
            client.field3669 = 0;
        }
        ++field3099;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZI)V")
    public final void method493(int arg0, boolean arg1, int arg2) {
        ++field3107;
        int var4 = this.field3108 * arg2 >> 12;
        int var5 = this.field3105 * arg2 >> 12;
        int var6 = this.field3103 * arg0 >> 12;
        int var7 = this.field3111 * arg0 >> 12;
        class353.method2324(var4, var5, super.field6585, var7, arg1, var6, super.field6582);
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
    public static void method1360(int arg0) {
        field3104 = null;
        field3110 = null;
        field3109 = null;
        if (arg0 != 18161) {
            method1360(8);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
    public final void method492(int arg0, int arg1, int arg2) {
        ++field3113;
        int var4 = this.field3108 * arg0 >> 12;
        int var5 = this.field3105 * arg0 >> 12;
        int var6 = this.field3103 * arg1 >> 12;
        int var7 = this.field3111 * arg1 >> 12;
        if (arg2 != 0) {
            method1360(56);
        }
        class128.method874(var6, super.field6582, var5, 256, super.field6589, super.field6585, var4, var7);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/awt/Canvas;B)Le;")
    public static final class97 method1361(Canvas arg0, byte arg1) {
        ++field3106;
        try {
            Class var2 = Class.forName("uk");
            class97 var3 = (class97) var2.newInstance();
            int var4 = 4 / ((19 - arg1) / 59);
            var3.method637(arg0, 115);
            return var3;
        } catch (Throwable var6) {
            class189 var5 = new class189();
            var5.method637(arg0, -45);
            return var5;
        }
    }
}
