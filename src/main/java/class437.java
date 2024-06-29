import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class437 {

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lvg;")
    private class49 field6661 = new class49(64);

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lri;")
    private class97 field6665;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lri;")
    private class97 field6658;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lsba;")
    public static class200 field6663 = new class200(32);

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Ljava/util/Random;")
    public static Random field6664 = new Random();

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "[I")
    public static int[] field6667 = new int[3];

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "F")
    public static float field6666;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Lhga;")
    public static class158 field6668;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Z")
    public static boolean field6669;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method2772(int arg0) {
        field6663 = null;
        if (arg0 != 31210) {
            field6669 = true;
        }
        field6664 = null;
        field6668 = null;
        field6667 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
    public static final void method2773(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 32767) {
            return;
        }
        if (arg0 < arg3) {
            class367.method2427(3803, arg4, arg3, class39.field527[arg2], arg0);
        } else {
            class367.method2427(3803, arg4, arg0, class39.field527[arg2], arg3);
        }
        field6660++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2774(boolean arg0, int arg1, int arg2) {
        field6659++;
        if (arg1 >= 0 && arg2 >= 0 && arg1 < class690.field9676[1].length && arg2 < class690.field9676[1][arg1].length) {
            if (!arg0) {
                method2772(-65);
            }
            return (class690.field9676[1][arg1][arg2] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Lhaa;")
    public final class72 method2775(int arg0, int arg1) {
        field6662++;
        class72 var3 = (class72) this.field6661.method560(false, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        if (arg1 > -32) {
            method2772(19);
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field6665.method926(0, -126, arg0 & 0x7FFF);
        } else {
            var4 = this.field6658.method926(0, -124, arg0);
        }
        class72 var5 = new class72();
        if (var4 != null) {
            var5.method737((byte) -114, new class6(var4));
        }
        if (arg0 >= 32768) {
            var5.method735(-1);
        }
        this.field6661.method559(var5, (long) arg0, 0);
        return var5;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(ILri;Lri;)V")
    public class437(int arg0, class97 arg1, class97 arg2) {
        this.field6665 = arg2;
        this.field6658 = arg1;
        if (this.field6658 != null) {
            this.field6658.method949(0, 0);
        }
        if (this.field6665 != null) {
            this.field6665.method949(0, 0);
        }
    }
}
