import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class311 extends class281 {

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "Z")
    public boolean field4474 = true;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!tr", name = "F", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!tr", name = "G", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!tr", name = "H", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!tr", name = "I", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!tr", name = "M", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "Ldl;")
    public class69 field4470;

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "[I")
    private int[] field4472;

    @OriginalMember(owner = "client!tr", name = "J", descriptor = "[I")
    public int[] field4480;

    @OriginalMember(owner = "client!tr", name = "K", descriptor = "[Ljava/lang/String;")
    private String[] field4481;

    @OriginalMember(owner = "client!tr", name = "L", descriptor = "[[I")
    private int[][] field4482;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public final void method1950(int arg0) {
        field4473++;
        if (arg0 <= 85) {
            field4478 = -40;
        }
        if (this.field4480 != null) {
            for (int var2 = 0; var2 < this.field4480.length; var2++) {
                this.field4480[var2] = class213.method1409(this.field4480[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(B)I")
    public final int method1951(byte arg0) {
        field4469++;
        if (this.field4472 == null) {
            return 0;
        } else if (arg0 == -26) {
            return this.field4472.length;
        } else {
            return -8;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljp;II)V")
    private final void method1952(class376 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field4481 = class46.method355(arg0.method2379((byte) 85), arg1 ^ 0xFFFF8789, '<');
        } else if (arg2 == 2) {
            int var4 = arg0.method2398(arg1 - 1372716417);
            this.field4480 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4480[var5] = arg0.method2359(-1);
            }
        } else if (arg2 == 3) {
            int var6 = arg0.method2398(-1372747256);
            this.field4472 = new int[var6];
            this.field4482 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method2359(-1);
                class419 var9 = class738.method4089(true, var8);
                if (var9 != null) {
                    this.field4472[var7] = var8;
                    this.field4482[var7] = new int[var9.field6016];
                    for (int var10 = 0; var10 < var9.field6016; var10++) {
                        this.field4482[var7][var10] = arg0.method2359(arg1 + 30838);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field4474 = false;
        }
        field4471++;
        if (arg1 != -30839) {
            this.method1957(null, -96);
        }
    }

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "(I)Ljava/lang/String;")
    public final String method1953(int arg0) {
        field4468++;
        StringBuffer var2 = new StringBuffer(arg0);
        if (this.field4481 == null) {
            return "";
        }
        var2.append(this.field4481[0]);
        for (int var3 = 1; var3 < this.field4481.length; var3++) {
            var2.append("...");
            var2.append(this.field4481[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljp;I)Ljava/lang/String;")
    public final String method1954(class376 arg0, int arg1) {
        field4479++;
        if (arg1 != 15628) {
            this.method1958(-67, -115);
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field4472 != null) {
            for (int var4 = 0; var4 < this.field4472.length; var4++) {
                var3.append(this.field4481[var4]);
                var3.append(this.field4470.method605(this.field4482[var4], (byte) -92, this.method1958(0, var4), arg0.method2372((byte) -61, class738.method4089(true, this.field4472[var4]).field6026)));
            }
        }
        var3.append(this.field4481[this.field4481.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(III)I")
    public final int method1955(int arg0, int arg1, int arg2) {
        field4475++;
        if (this.field4472 == null || arg2 < 0 || arg2 > this.field4472.length) {
            return -1;
        } else {
            if (arg1 != -1) {
                this.field4482 = null;
            }
            return this.field4482[arg2] == null || arg0 < 0 || this.field4482[arg2].length < arg0 ? -1 : this.field4482[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljp;[II)V")
    public final void method1956(class376 arg0, int[] arg1, int arg2) {
        field4477++;
        if (this.field4472 == null) {
            return;
        }
        if (arg2 != 60) {
            this.method1951((byte) 126);
        }
        for (int var4 = 0; var4 < this.field4472.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = this.method1958(0, var4).field6017;
            if (var5 > 0) {
                arg0.method2391(var5, (long) arg1[var4], 56);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(Ljp;I)V")
    public final void method1957(class376 arg0, int arg1) {
        field4476++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 == 0) {
                return;
            }
            this.method1952(arg0, -30839, var3);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)Lmt;")
    public final class419 method1958(int arg0, int arg1) {
        field4483++;
        if (this.field4472 == null || arg1 < 0 || arg1 > this.field4472.length) {
            return null;
        } else {
            if (arg0 != 0) {
                this.method1955(124, -58, 97);
            }
            return class738.method4089(true, this.field4472[arg1]);
        }
    }
}
