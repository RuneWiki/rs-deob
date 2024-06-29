import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class56 {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field777 = 0;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    private int field789 = -1;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lnk;")
    private class2 field784 = new class2();

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Z")
    public boolean field792 = false;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    private int field788;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "[Ltg;")
    private class77[] field787;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "[[I")
    private int[][] field791;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field786 = 0;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Leg;")
    public static class188 field781 = new class188(50);

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method365(int arg0, int arg1) {
        field782++;
        if (arg1 != 0) {
            field781 = (class188) null;
        }
        if (this.field788 == this.field778) {
            this.field792 = this.field787[arg0] == null;
            this.field787[arg0] = class194.field2921;
            return this.field791[arg0];
        } else if (this.field778 == 1) {
            this.field792 = this.field789 != arg0;
            this.field789 = arg0;
            return this.field791[0];
        } else {
            class77 var3 = this.field787[arg0];
            if (var3 == null) {
                this.field792 = true;
                if (this.field777 < this.field778) {
                    var3 = new class77(arg0, this.field777);
                    this.field777++;
                } else {
                    class77 var4 = (class77) this.field784.method6(true);
                    var3 = new class77(arg0, var4.field1153);
                    this.field787[var4.field1155] = null;
                    var4.method1284(arg1 ^ 0x0);
                }
                this.field787[arg0] = var3;
            } else {
                this.field792 = false;
            }
            this.field784.method14(var3, 82);
            return this.field791[var3.field1153];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILwf;)V", line = 75)
    public static final void method366(int arg0, class306 arg1) {
        if (arg0 == -8482) {
            field780++;
            class273.field4189 = arg1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)I", line = 87)
    public static final int method367(byte arg0) {
        if (arg0 != -100) {
            field790 = -53;
        }
        field776++;
        return 6;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(III)V", line = 287)
    public class56(int arg0, int arg1, int arg2) {
        this.field788 = arg1;
        this.field778 = arg0;
        this.field787 = new class77[this.field788];
        this.field791 = new int[this.field778][arg2];
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)[[I", line = 104)
    public final int[][] method368(int arg0) {
        field785++;
        if (this.field788 != this.field778) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field778; var2++) {
            this.field787[var2] = class194.field2921;
        }
        if (arg0 != 20378) {
            method366(-83, (class306) null);
        }
        return this.field791;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V", line = 134)
    public static final void method369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != -1) {
            field786 = 6;
        }
        field779++;
        if (arg0 > class88.field1324 || class323.field5030 > arg4) {
            return;
        }
        boolean var6;
        if (arg1 < class256.field3995) {
            var6 = false;
            arg1 = class256.field3995;
        } else if (class118.field1834 < arg1) {
            var6 = false;
            arg1 = class118.field1834;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg2 < class256.field3995) {
            arg2 = class256.field3995;
            var7 = false;
        } else if (class118.field1834 < arg2) {
            var7 = false;
            arg2 = class118.field1834;
        } else {
            var7 = true;
        }
        if (class323.field5030 > arg0) {
            arg0 = class323.field5030;
        } else {
            class253.method1704(arg1, arg2, arg5, class175.field2675[arg0++], 7);
        }
        if (arg4 <= class88.field1324) {
            class253.method1704(arg1, arg2, arg5, class175.field2675[arg4--], 7);
        } else {
            arg4 = class88.field1324;
        }
        if (var6 && var7) {
            for (int var8 = arg0; var8 <= arg4; var8++) {
                int[] var9 = class175.field2675[var8];
                var9[arg1] = var9[arg2] = arg5;
            }
        } else if (var6) {
            for (int var11 = arg0; var11 <= arg4; var11++) {
                class175.field2675[var11][arg1] = arg5;
            }
        } else if (var7) {
            for (int var10 = arg0; var10 <= arg4; var10++) {
                class175.field2675[var10][arg2] = arg5;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V", line = 244)
    public final void method370(int arg0) {
        field783++;
        for (int var2 = arg0; var2 < this.field778; var2++) {
            this.field791[var2] = null;
        }
        this.field787 = null;
        this.field791 = (int[][]) null;
        this.field784.method5(79);
        this.field784 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V", line = 276)
    public static void method371(byte arg0) {
        field781 = null;
        if (arg0 != 43) {
            method371((byte) -124);
        }
    }
}
