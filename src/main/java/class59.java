import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class59 extends class303 {

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    private int field928 = 1;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    private int field931 = 204;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    private int field934 = 1;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "Ljava/lang/String;")
    public static String field925 = "glow1:";

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "[I")
    public static int[] field930 = new int[500];

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "J")
    public static long field929 = 0L;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)[I", line = 8)
    public final int[] method67(int arg0, int arg1) {
        field936++;
        int[] var3 = this.field4763.method394(arg0 ^ arg0, arg1);
        if (this.field4763.field863) {
            for (int var4 = 0; var4 < class70.field1108; var4++) {
                int var5 = class291.field4427[var4];
                int var6 = this.field934 * var5 >> 12;
                int var7 = class36.field591[arg1];
                int var8 = this.field928 * var7 >> 12;
                int var9 = var5 % (4096 / this.field934) * this.field934;
                int var10 = var7 % (4096 / this.field928) * this.field928;
                if (this.field931 > var10) {
                    for (var6 -= var8; var6 < 0; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field931 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field931) {
                    int var11;
                    for (var11 = var6 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(III)V", line = 91)
    public static final void method437(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field929 = 106L;
        }
        field932++;
        if (class288.field4397 != 0 && arg2 != -1) {
            class110.method835(arg2, class288.field4397, false, class207.field3272, 0, -91);
            class165.field2559 = true;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILpe;I)V", line = 118)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg2 == 0) {
            this.field934 = arg1.method741(104);
        } else if (arg2 == 1) {
            this.field928 = arg1.method741(106);
        } else if (arg2 == 2) {
            this.field931 = arg1.method731(false);
        }
        if (arg0 != -4004) {
            this.method65(99, (class101) null, -27);
        }
        field927++;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 157)
    public class59() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 177)
    public static final void method438(String arg0, byte arg1) {
        field935++;
        for (class169 var2 = (class169) class54.field852.method1490(200); var2 != null; var2 = (class169) class54.field852.method1487((byte) 117)) {
            if (var2.field2624.equals(arg0)) {
                class81.field1222 = var2;
                return;
            }
        }
        if (arg1 >= -53) {
            method437(72, -127, 56);
        }
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V", line = 208)
    public static void method439(int arg0) {
        if (arg0 != 22452) {
            field930 = (int[]) null;
        }
        field930 = null;
        field925 = null;
    }
}
