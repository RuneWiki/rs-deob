import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class614 extends class219 {

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "I")
    public int field8662 = 12800;

    @OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
    public int field8663 = 12800;

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
    public int field8666 = -1;

    @OriginalMember(owner = "client!ot", name = "J", descriptor = "Z")
    public boolean field8672 = true;

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
    public int field8661 = 0;

    @OriginalMember(owner = "client!ot", name = "N", descriptor = "I")
    public int field8675 = 0;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
    public int field8659 = -1;

    @OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
    public int field8670;

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "Ljava/lang/String;")
    public String field8667;

    @OriginalMember(owner = "client!ot", name = "G", descriptor = "I")
    public int field8669;

    @OriginalMember(owner = "client!ot", name = "C", descriptor = "Ljava/lang/String;")
    public String field8665;

    @OriginalMember(owner = "client!ot", name = "B", descriptor = "Lga;")
    public class420 field8664;

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "Lke;")
    public static class622 field8658 = new class622(84, 2);

    @OriginalMember(owner = "client!ot", name = "O", descriptor = "[[I")
    public static int[][] field8676 = new int[128][128];

    @OriginalMember(owner = "client!ot", name = "I", descriptor = "Lrh;")
    public static class275 field8671 = new class275(1, 2, 2, 0);

    @OriginalMember(owner = "client!ot", name = "Q", descriptor = "Lel;")
    public static class571 field8678 = new class571(8);

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!ot", name = "F", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!ot", name = "L", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!ot", name = "M", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "Lip;")
    public static class734 field8657;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)Z")
    public final boolean method3526(int arg0, int arg1, int arg2) {
        field8674++;
        for (class265 var4 = (class265) this.field8664.method2508((byte) -73); var4 != null; var4 = (class265) this.field8664.method2505((byte) -55)) {
            if (var4.method1744(16, arg1, arg0)) {
                return true;
            }
        }
        if (arg2 != -14237) {
            this.method3531((byte) 104, 105, 90, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "([IIII)Z")
    public final boolean method3527(int[] arg0, int arg1, int arg2, int arg3) {
        field8660++;
        class265 var5 = (class265) this.field8664.method2508((byte) 109);
        if (arg1 < 59) {
            method3528((byte) 23);
        }
        while (var5 != null) {
            if (var5.method1742(arg2, -49, arg3)) {
                var5.method1746(arg0, (byte) -123, arg3, arg2);
                return true;
            }
            var5 = (class265) this.field8664.method2505((byte) -55);
        }
        return false;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
    public static void method3528(byte arg0) {
        int var1 = -91 % ((arg0 + 37) / 61);
        field8678 = null;
        field8676 = null;
        field8657 = null;
        field8658 = null;
        field8671 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II[IIZ)Z")
    public final boolean method3529(int arg0, int arg1, int[] arg2, int arg3, boolean arg4) {
        field8668++;
        if (arg4) {
            this.field8666 = -93;
        }
        for (class265 var6 = (class265) this.field8664.method2508((byte) -111); var6 != null; var6 = (class265) this.field8664.method2505((byte) -55)) {
            if (var6.method1743((byte) -122, arg3, arg1, arg0)) {
                var6.method1747(arg3, arg0, -75, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "(B)V")
    public final void method3530(byte arg0) {
        this.field8662 = 12800;
        this.field8663 = 12800;
        this.field8675 = 0;
        field8656++;
        if (arg0 != 9) {
            this.field8662 = 20;
        }
        this.field8661 = 0;
        for (class265 var2 = (class265) this.field8664.method2508((byte) 114); var2 != null; var2 = (class265) this.field8664.method2505((byte) -55)) {
            if (var2.field3739 < this.field8663) {
                this.field8663 = var2.field3739;
            }
            if (this.field8662 > var2.field3740) {
                this.field8662 = var2.field3740;
            }
            if (this.field8675 < var2.field3737) {
                this.field8675 = var2.field3737;
            }
            if (var2.field3741 > this.field8661) {
                this.field8661 = var2.field3741;
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BII[I)Z")
    public final boolean method3531(byte arg0, int arg1, int arg2, int[] arg3) {
        field8673++;
        if (arg0 != 30) {
            method3528((byte) -94);
        }
        for (class265 var5 = (class265) this.field8664.method2508((byte) 110); var5 != null; var5 = (class265) this.field8664.method2505((byte) -55)) {
            if (var5.method1744(16, arg2, arg1)) {
                var5.method1747(arg2, arg1, -112, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class614(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field8670 = arg3;
        this.field8666 = arg6;
        this.field8659 = arg4;
        this.field8667 = arg2;
        this.field8672 = arg5;
        this.field8669 = arg0;
        this.field8665 = arg1;
        if (this.field8666 == 255) {
            this.field8666 = 0;
        }
        this.field8664 = new class420();
    }
}
