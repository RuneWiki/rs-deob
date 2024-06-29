import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class260 extends class137 {

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "Z")
    public static boolean field4339 = false;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Ljava/util/Random;")
    public static Random field4334 = new Random();

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public int field4337;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public int field4340;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public int field4342;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public int field4345;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "Lme;")
    public static class295 field4343;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "Lme;")
    public static class295 field4347;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "[I")
    public static int[] field4348;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V", line = 23)
    public static void method1802(int arg0) {
        field4347 = null;
        field4334 = null;
        field4343 = null;
        field4348 = null;
        if (arg0 != 967151976) {
            field4339 = true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIJ)Z", line = 48)
    public static final boolean method1803(int arg0, int arg1, int arg2, long arg3) {
        class245 var5 = class120.field2010[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field4098 != null && var5.field4098.field3325 == arg3) {
            return true;
        } else if (var5.field4104 != null && var5.field4104.field3606 == arg3) {
            return true;
        } else if (var5.field4085 != null && var5.field4085.field5074 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field4092; var6++) {
                if (var5.field4107[var6].field2673 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIBI)V", line = 99)
    public final void method1804(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4341++;
        int var6 = this.field4336 << 3;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = this.field4335 << 3;
        int var9 = (arg1 << 4) + (var8 & 0xF);
        this.method338(var6, var8, var7, var9, arg4, arg0);
        if (arg3 != -22) {
            method1803(-16, -28, 111, -40L);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
    public abstract void method341(int arg0, int arg1);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public abstract void method347(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V")
    public abstract void method337(int arg0, int arg1);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V")
    public abstract void method332(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)V")
    public abstract void method339(int arg0, int arg1, int arg2, int arg3, int arg4);
}
