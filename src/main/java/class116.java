import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class116 extends class137 {

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "[I")
    public int[] field1768 = new int[5];

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "[Lom;")
    public class90[] field1782 = new class90[5];

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public int field1779 = 0;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public int field1778;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public int field1777;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1764 = -1;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field1790 = 5063219;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "B")
    public byte field1770;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public int field1766;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "Lke;")
    public class116 field1771;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Lua;")
    public class122 field1765;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "Lfc;")
    public class129 field1774;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "Llb;")
    public class138 field1775;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "Lgi;")
    public static class164 field1781;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "Lih;")
    public class219 field1780;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Lmm;")
    public class240 field1776;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Lsa;")
    public class283 field1772;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Lrj;")
    public class9 field1783;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Z")
    public boolean field1767;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "Z")
    public boolean field1786;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "Z")
    public boolean field1789;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
    public static void method800(int arg0) {
        if (arg0 != -27943) {
            method800(63);
        }
        field1781 = null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(III)V")
    public class116(int arg0, int arg1, int arg2) {
        this.field1785 = arg2;
        this.field1777 = this.field1778 = arg0;
        this.field1784 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
    public static final void method801(int arg0) {
        field1763++;
        if (class18.field322 != null) {
            class18.field322.method416(64);
            class18.field322 = null;
        }
        class290.method2001((byte) 123);
        class104.method744();
        for (int var1 = 0; var1 < 4; var1++) {
            class310.field5021[var1].method353(arg0 ^ 0xFFFFFFE6);
        }
        class200.method1379(-842114134, false);
        System.gc();
        class253.method1713(2, 0);
        class215.field3393 = -1;
        class85.field1355 = false;
        class97.method696((byte) 89, true);
        class296.field4824 = 0;
        class311.field5030 = 0;
        class128.field2056 = false;
        class75.field1211 = 0;
        class145.field2327 = 0;
        for (int var2 = 0; var2 < class168.field2768.length; var2++) {
            class168.field2768[var2] = null;
        }
        class134.field2172 = 0;
        class91.field1439 = 0;
        if (arg0 != 104) {
            method800(-13);
        }
        for (int var3 = 0; var3 < 2048; var3++) {
            class28.field494[var3] = null;
            class191.field3113[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class131.field2113[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class296.field4827[var5][var6][var7] = null;
                }
            }
        }
        class294.method2019(-25488);
        class104.field1644 = 0;
        class50.method321(false);
        class107.method751(true, 0);
        try {
            class216.method1481(arg0 - 197, class44.field659.field1105, "loggedout");
        } catch (Throwable var8) {
        }
    }
}
