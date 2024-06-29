import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class323 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Z")
    public boolean field5635 = false;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "[I")
    private int[] field5645 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public int field5655 = -1;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field5646 = 0;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "[Ltk;")
    public static class248[] field5647 = new class248[50];

    @OriginalMember(owner = "client!km", name = "n", descriptor = "[I")
    public static int[] field5648 = new int[2];

    @OriginalMember(owner = "client!km", name = "o", descriptor = "Lud;")
    private static class279 field5649 = class130.method1024("Created gameworld", 255);

    @OriginalMember(owner = "client!km", name = "i", descriptor = "[I")
    public static int[] field5643 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Lud;")
    public static class279 field5637 = field5649;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "[[Z")
    public static boolean[][] field5654 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "[I")
    private int[] field5653;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "[S")
    private short[] field5638;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[S")
    private short[] field5640;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "[S")
    private short[] field5650;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "[S")
    private short[] field5657;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)Z", line = 12)
    public final boolean method2271(int arg0) {
        field5652++;
        if (this.field5653 == null) {
            return true;
        }
        if (arg0 <= 114) {
            this.method2271(-56);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field5653.length; var3++) {
            if (!class109.field2012.method1180(0, 11934, this.field5653[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILqb;)V", line = 42)
    public static final void method2272(int arg0, class102 arg1) {
        if (arg0 >= -43) {
            field5646 = -99;
        }
        field5644++;
        for (class52 var2 = (class52) class60.field1263.method2248(112); var2 != null; var2 = (class52) class60.field1263.method2240(1138)) {
            if (var2.field1073 == arg1) {
                if (var2.field1083 != null) {
                    class322.field5630.method1957(var2.field1083);
                    var2.field1083 = null;
                }
                var2.method2221(true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)Ljj;", line = 76)
    public final class148 method2273(int arg0) {
        field5636++;
        class148[] var2 = new class148[5];
        int var3 = 0;
        int var4 = 0;
        if (arg0 > -100) {
            return (class148) null;
        }
        while (var4 < 5) {
            if (this.field5645[var4] != -1) {
                var2[var3++] = class148.method1157(class109.field2012, this.field5645[var4], 0);
            }
            var4++;
        }
        class148 var5 = new class148(var2, var3);
        if (this.field5640 != null) {
            for (int var6 = 0; var6 < this.field5640.length; var6++) {
                var5.method1140(this.field5640[var6], this.field5650[var6]);
            }
        }
        if (this.field5657 != null) {
            for (int var7 = 0; var7 < this.field5657.length; var7++) {
                var5.method1158(this.field5657[var7], this.field5638[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IBLvh;)V", line = 146)
    private final void method2274(int arg0, byte arg1, class53 arg2) {
        if (arg0 == 1) {
            this.field5655 = arg2.method483(-116);
        } else if (arg0 == 2) {
            int var4 = arg2.method483(-120);
            this.field5653 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5653[var5] = arg2.method468(28214);
            }
        } else if (arg0 == 3) {
            this.field5635 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method483(-117);
            this.field5640 = new short[var6];
            this.field5650 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5640[var7] = (short) arg2.method468(28214);
                this.field5650[var7] = (short) arg2.method468(28214);
            }
        } else if (arg0 == 41) {
            int var8 = arg2.method483(-119);
            this.field5638 = new short[var8];
            this.field5657 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field5657[var9] = (short) arg2.method468(28214);
                this.field5638[var9] = (short) arg2.method468(28214);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field5645[arg0 - 60] = arg2.method468(28214);
        }
        field5641++;
        int var10 = 81 % ((arg1 - 18) / 48);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Ljj;", line = 241)
    public final class148 method2275(byte arg0) {
        field5651++;
        if (this.field5653 == null) {
            return null;
        }
        class148[] var2 = new class148[this.field5653.length];
        for (int var3 = 0; var3 < this.field5653.length; var3++) {
            var2[var3] = class148.method1157(class109.field2012, this.field5653[var3], 0);
        }
        if (arg0 < 76) {
            this.field5653 = (int[]) null;
        }
        class148 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class148(var2, var2.length);
        }
        if (this.field5640 != null) {
            for (int var5 = 0; var5 < this.field5640.length; var5++) {
                var4.method1140(this.field5640[var5], this.field5650[var5]);
            }
        }
        if (this.field5657 != null) {
            for (int var6 = 0; var6 < this.field5657.length; var6++) {
                var4.method1158(this.field5657[var6], this.field5638[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)Z", line = 303)
    public final boolean method2276(byte arg0) {
        field5639++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field5645[var3] != -1 && !class109.field2012.method1180(0, 11934, this.field5645[var3])) {
                var2 = false;
            }
        }
        if (arg0 != -57) {
            method2272(45, (class102) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lvh;I)V", line = 330)
    public final void method2277(class53 arg0, int arg1) {
        field5642++;
        while (true) {
            int var3 = arg0.method483(-102);
            if (var3 == 0) {
                if (arg1 != -14223) {
                    this.method2277((class53) null, 20);
                }
                return;
            }
            this.method2274(var3, (byte) 73, arg0);
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V", line = 350)
    public static void method2278(int arg0) {
        field5649 = null;
        field5643 = null;
        if (arg0 != -60) {
            field5656 = 29;
        }
        field5654 = (boolean[][]) null;
        field5637 = null;
        field5647 = null;
        field5648 = null;
    }
}
