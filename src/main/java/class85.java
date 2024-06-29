import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class85 extends class248 {

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "J")
    public static long field1638 = 0L;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field1645 = 0;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "[I")
    public static int[] field1644 = new int[5];

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "[I")
    public static int[] field1646 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lda;")
    public static class22 field1639;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(III)V")
    public abstract void method667(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
    public final void method668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1647++;
        int var6 = this.field1648 << 3;
        int var7 = (arg1 << 4) + (var6 & 0xF);
        int var8 = this.field1637 << 3;
        if (arg4 > 101) {
            int var9 = (arg3 << 4) + (var8 & 0xF);
            this.method669(var6, var8, var7, var9, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
    public abstract void method670(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
    public abstract void method671(int arg0, int arg1);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V")
    public static void method672(boolean arg0) {
        field1644 = null;
        field1646 = null;
        field1639 = null;
        if (arg0) {
            method672(false);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
    public abstract void method673(int arg0, int arg1);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BB)I")
    public static final int method674(byte arg0, byte arg1) {
        field1642++;
        if (arg0 >= 65 && arg0 <= 90) {
            return arg0 - 65;
        } else if (arg0 >= 97 && arg0 <= 122) {
            return arg0 - 71;
        } else if (arg0 >= 48 && arg0 <= 57) {
            return arg0 + 52 - 48;
        } else if (arg0 == 43) {
            return 62;
        } else if (arg0 == 42) {
            return 62;
        } else if (arg0 == 47) {
            return 63;
        } else if (arg0 == 45) {
            return 63;
        } else {
            if (arg1 != -117) {
                field1639 = null;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIII)V")
    public abstract void method675(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIIII)V")
    public abstract void method676(int arg0, int arg1, int arg2, int arg3, int arg4);
}
