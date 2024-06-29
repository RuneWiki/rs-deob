import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class204 extends class139 {

    @OriginalMember(owner = "client!si", name = "F", descriptor = "[S")
    public static short[] field3273 = new short[256];

    @OriginalMember(owner = "client!si", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3276 = " from your friend list first.";

    @OriginalMember(owner = "client!si", name = "z", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3268 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    public int field3266;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)V")
    public abstract void method74(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public abstract void method60(int arg0, int arg1);

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V")
    public static void method1489(int arg0) {
        field3268 = null;
        if (arg0 != 13463) {
            method1493(-84, true);
        }
        field3273 = null;
        field3276 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V")
    public abstract void method66(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V")
    public abstract void method72(int arg0, int arg1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V")
    public abstract void method65(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)Lsg;")
    public static final class166 method1490(int arg0, int arg1, int arg2) {
        class286 var3 = class220.field3525[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4541; var4++) {
            class166 var5 = var3.field4530[var4];
            if ((var5.field2683 >> 29 & 0x3L) == 2L && var5.field2678 == arg1 && var5.field2684 == arg2) {
                class177.method1325(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IIIII)V")
    public final void method1491(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3269++;
        int var6 = this.field3266 << 3;
        int var7 = (arg3 << 4) + (var6 & arg2);
        int var8 = this.field3274 << 3;
        int var9 = (arg1 << 4) + (var8 & 0xF);
        this.method68(var6, var8, var7, var9, arg4, arg0);
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IIII)Z")
    public static final boolean method1492(int arg0, int arg1, int arg2, int arg3) {
        if (class5.method29(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class77.method565(var4 + 1, class220.field3533[arg0][arg1][arg2] + arg3, var5 + 1) && class77.method565(var4 + 128 - 1, class220.field3533[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class77.method565(var4 + 128 - 1, class220.field3533[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class77.method565(var4 + 1, class220.field3533[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(II)V")
    public abstract void method69(int arg0, int arg1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
    public static final void method1493(int arg0, boolean arg1) {
        field3275++;
        if (arg1 == class110.field1583) {
            return;
        }
        class110.field1583 = arg1;
        class272.method1885(14);
        if (arg0 != 1) {
            field3277 = 71;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIII)V")
    public abstract void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
