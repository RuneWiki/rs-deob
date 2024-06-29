import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class23 extends class120 {

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    private int field348 = 2048;

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "I")
    private int field356 = 12288;

    @OriginalMember(owner = "client!kg", name = "eb", descriptor = "I")
    private int field358 = 8192;

    @OriginalMember(owner = "client!kg", name = "fb", descriptor = "I")
    private int field359 = 2048;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    private int field353 = 0;

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "I")
    private int field360 = 4096;

    @OriginalMember(owner = "client!kg", name = "jb", descriptor = "I")
    private int field363 = 0;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "Lok;")
    public static class41 field352 = class137.method956("<col=c0ff00>", 45);

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    public static int field349 = -1;

    @OriginalMember(owner = "client!kg", name = "ib", descriptor = "Z")
    public static boolean field362 = true;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!kg", name = "hb", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "Lji;")
    public static class154 field347;

    @OriginalMember(owner = "client!kg", name = "kb", descriptor = "[Ltb;")
    public static class199[] field364;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V", line = 15)
    public final void method31(int arg0) {
        if (arg0 != -31851) {
            this.method14(-22, -122);
        }
        field354++;
        class148.method1029(arg0 ^ 0x3C29);
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(III)Z", line = 30)
    private final boolean method160(int arg0, int arg1, int arg2) {
        field355++;
        if (arg1 != -24897) {
            return false;
        }
        int var4 = (arg0 + arg2) * this.field356 >> 12;
        int var5 = class136.field2040[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field356;
        int var7 = (var6 << 12) / this.field358;
        int var8 = this.field360 * var7 >> 12;
        return arg0 - arg2 < var8 && (-var8) < (arg0 - arg2);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Llb;II)V", line = 49)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field348 = -53;
        }
        field351++;
        if (arg2 == 0) {
            this.field348 = arg0.method759((byte) -105);
        } else if (arg2 == 1) {
            this.field353 = arg0.method759((byte) -72);
        } else if (arg2 == 2) {
            this.field363 = arg0.method759((byte) -51);
        } else if (arg2 == 3) {
            this.field359 = arg0.method759((byte) -116);
        } else if (arg2 == 4) {
            this.field356 = arg0.method759((byte) -73);
        } else if (arg2 == 5) {
            this.field360 = arg0.method759((byte) -96);
        } else if (arg2 == 6) {
            this.field358 = arg0.method759((byte) -61);
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 131)
    public class23() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(III)Z", line = 136)
    private final boolean method161(int arg0, int arg1, int arg2) {
        field350++;
        if (arg2 != -718594100) {
            this.method14(-96, -99);
        }
        int var4 = (arg0 - arg1) * this.field356 >> 12;
        int var5 = class136.field2040[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field356;
        int var7 = (var6 << 12) / this.field358;
        int var8 = this.field360 * var7 >> 12;
        return arg0 + arg1 < var8 && (-var8) < (arg0 + arg1);
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(B)V", line = 157)
    public static void method162(byte arg0) {
        field347 = null;
        field364 = null;
        if (arg0 == 25) {
            field352 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)[I", line = 190)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != -14959) {
            method162((byte) -31);
        }
        field361++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int var4 = class16.field216[arg0] - 2048;
            for (int var5 = 0; var5 < class307.field5160; var5++) {
                int var6 = var4 + this.field353;
                int var7 = class203.field3278[var5] - 2048;
                int var8 = var7 + this.field363;
                int var9 = this.field348 + var7;
                int var10 = var9 < -2048 ? var9 + 4096 : var9;
                int var11 = this.field359 + var4;
                int var12 = var10 > 2048 ? var10 - 4096 : var10;
                int var13 = var11 >= -2048 ? var11 : var11 + 4096;
                int var14 = var8 < -2048 ? var8 + 4096 : var8;
                int var15 = var6 < -2048 ? var6 + 4096 : var6;
                int var16 = var15 <= 2048 ? var15 : var15 - 4096;
                int var17 = var13 > 2048 ? var13 - 4096 : var13;
                int var18 = var14 > 2048 ? var14 - 4096 : var14;
                var3[var5] = this.method161(var16, var12, -718594100) || this.method160(var17, -24897, var18) ? 4096 : 0;
            }
        }
        return var3;
    }
}
