import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class class503 {

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "Lrl;")
    public class487 field7679;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "Ltq;")
    public static class426 field7678 = new class426(0, -1);

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field7680 = -1;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "Liu;")
    public static class390 field7681 = new class390(8, 2);

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "[Lkt;")
    public static class103[] field7684 = new class103[14];

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "Lw;")
    public static class186 field7685;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "Lqg;")
    public static class307 field7683;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3028(int arg0) {
        int var1 = 35 % ((arg0 + 7) / 41);
        class314.method1890();
        field7682++;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "()V", line = 17)
    public static final void method3029() {
        class424.method2532(1, class399.field5881);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIII)I", line = 23)
    public static final int method3030(int arg0, int arg1, int arg2, int arg3) {
        field7677++;
        int var4 = -102 / ((10 - arg1) / 45);
        int var5 = arg2 & 0x3;
        if (var5 == 0) {
            return arg0;
        } else if (var5 == 1) {
            return arg3;
        } else if (var5 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lrl;)V", line = 45)
    public class503(class487 arg0) {
        this.field7679 = arg0;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V", line = 63)
    public static void method3031(int arg0) {
        field7685 = null;
        field7683 = null;
        field7681 = null;
        if (arg0 != -16874) {
            field7685 = null;
        }
        field7684 = null;
        field7678 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBLtu;)V")
    public abstract void method626(int arg0, byte arg1, class221 arg2);

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Z")
    public abstract boolean method623(byte arg0);

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZZ)V")
    public abstract void method625(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V")
    public abstract void method624(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
    public abstract void method629(byte arg0);

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V")
    public abstract void method627(boolean arg0, int arg1);
}
