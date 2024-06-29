import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class94 {

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Lmm;")
    public class26 field1247 = null;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "Lmm;")
    public class26 field1246 = null;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "Lmm;")
    public class26 field1241 = null;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "[Lku;")
    public class495[] field1248 = null;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "[Lku;")
    public class495[] field1250 = null;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Z")
    public boolean field1243;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "[I")
    public static int[] field1244 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)Z")
    public static final boolean method513(int arg0, int arg1) {
        if (arg0 >= -119) {
            method514((byte) -13, -12, 54, -126, 2, 56);
        }
        field1245++;
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BIIIII)V")
    public static final void method514(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class594.field8575 <= arg2 && arg4 <= class355.field4972 && class535.field7467 <= arg5 && arg1 <= class113.field1453) {
            class613.method3503(arg1, arg4, arg3, arg5, 3, arg2);
        } else {
            class157.method854(arg5, 127, arg2, arg3, arg1, arg4);
        }
        field1242++;
        if (arg0 >= -83) {
            method514((byte) 66, -69, 27, 3, -128, -96);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static void method515(int arg0) {
        field1244 = null;
        int var1 = -74 % ((arg0 - 79) / 46);
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Luq;)V")
    public class94(class313 arg0) {
        this.field1243 = arg0.field4231;
        class228.method1447((byte) 104, arg0);
        if (this.field1243) {
            byte[] var6 = class584.method3371(class82.field1117, false, 3);
            this.field1247 = new class26(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class584.method3371(class452.field6401, false, 3);
            this.field1246 = new class26(arg0, 6410, 128, 128, 16, var7, 6410);
            class408 var8 = arg0.field4199;
            if (var8.method2432(35632)) {
                byte[] var9 = class584.method3371(class523.field7292, false, 3);
                this.field1241 = new class26(arg0, 6408, 128, 128, 16);
                class26 var10 = new class26(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method2433(var10, 11, this.field1241, 2.0F)) {
                    this.field1241.method810(true);
                } else {
                    this.field1241.method811(1);
                    this.field1241 = null;
                }
                var10.method811(1);
            }
        } else {
            this.field1250 = new class495[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class411.method2450(class82.field1117, var2 * 128 * 128 * 2, 3, 32768);
                this.field1250[var2] = new class495(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field1248 = new class495[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class411.method2450(class452.field6401, var3 * 256 * 128, 3, 32768);
                this.field1248[var3] = new class495(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }

    static {
        new class344("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field1249 = 0;
        field1251 = 0;
    }
}
