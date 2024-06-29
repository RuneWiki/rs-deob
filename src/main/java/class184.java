import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class184 extends class114 {

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Lw;")
    public static class82 field3195 = new class82(64);

    @OriginalMember(owner = "client!te", name = "N", descriptor = "[Lti;")
    public static class128[] field3200 = new class128[27];

    @OriginalMember(owner = "client!te", name = "O", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3201 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "Lmb;")
    public static class178 field3203;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(II)V")
    public abstract void method486(int arg0, int arg1);

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(IIIII)V")
    public abstract void method479(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
    public abstract void method1254(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(II)V")
    public abstract void method477(int arg0, int arg1);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIII)V")
    public final void method1255(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field3194 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        field3199++;
        int var8 = this.field3198 << 3;
        int var9 = (arg4 << 4) + (var8 & 0xF);
        int var10 = -74 % ((arg0 + 17) / 63);
        this.method483(var6, var8, var7, var9, arg1, arg2);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIII)V")
    public abstract void method1256(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIII)V")
    public abstract void method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
    public abstract void method480(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILjava/awt/Component;Z)Lhc;")
    public static final class116 method1257(int arg0, int arg1, Component arg2, boolean arg3) {
        field3205++;
        try {
            Class var4 = Class.forName("eh");
            class116 var5 = (class116) var4.getDeclaredConstructor().newInstance();
            var5.method825(arg0, arg1, arg2, arg3);
            return var5;
        } catch (Throwable var7) {
            class200 var6 = new class200();
            var6.method825(arg0, arg1, arg2, true);
            return var6;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
    public static void method1258(byte arg0) {
        field3195 = null;
        int var1 = -42 % ((arg0 + 64) / 34);
        field3201 = null;
        field3200 = null;
        field3203 = null;
    }
}
