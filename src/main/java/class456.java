import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class456 {

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public int field6675;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public int field6665;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "Lit;")
    public class456 field6671;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "Lia;")
    public class415 field6670;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "Z")
    public static boolean field6664 = false;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "[[B")
    public static byte[][] field6667 = new byte[50][];

    @OriginalMember(owner = "client!it", name = "j", descriptor = "J")
    public static long field6669 = 0L;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "[F")
    public static float[] field6666 = new float[4];

    @OriginalMember(owner = "client!it", name = "m", descriptor = "Lbj;")
    public static class159 field6672 = new class159(64);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public int field6662;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public int field6663;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public int field6676;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "Lm;")
    public static class126 field6677;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "Lgu;")
    public static class409 field6668;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "[[[B")
    public static byte[][][] field6661;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)Le;", line = 4)
    public final class370 method2687(int arg0) {
        field6673++;
        return arg0 == -2775 ? class278.method1571((byte) 126, this.field6675) : null;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V", line = 16)
    public static void method2688(int arg0) {
        if (arg0 != 4) {
            return;
        }
        field6677 = null;
        field6668 = null;
        field6667 = null;
        field6672 = null;
        field6666 = null;
        field6661 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBILvh;)Lgv;", line = 43)
    public static final class56 method2689(int arg0, byte arg1, int arg2, class240 arg3) {
        field6660++;
        byte[] var4 = arg3.method1411(true, arg0, arg2);
        if (arg1 > -16) {
            method2689(-127, (byte) -40, -120, null);
        }
        return var4 == null ? null : new class56(var4);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)Lit;", line = 79)
    public final class456 method2690(byte arg0, int arg1) {
        if (arg0 >= -80) {
            return null;
        } else {
            field6674++;
            return new class456(this.field6675, arg1);
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(II)V", line = 92)
    public class456(int arg0, int arg1) {
        this.field6675 = arg0;
        this.field6665 = arg1;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lit;I)V", line = 100)
    public class456(class456 arg0, int arg1) {
        this.field6671 = arg0;
        this.field6670 = this.field6671.field6670;
        this.field6665 = this.field6671.field6665 + arg1;
        this.field6675 = this.field6671.field6675;
    }
}
