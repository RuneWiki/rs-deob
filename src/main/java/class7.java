import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class7 extends class4 {

    @OriginalMember(owner = "mapview!da", name = "q", descriptor = "[J")
    private long[] field77 = new long[10];

    @OriginalMember(owner = "mapview!da", name = "z", descriptor = "I")
    private int field86 = 0;

    @OriginalMember(owner = "mapview!da", name = "w", descriptor = "I")
    private int field83 = 256;

    @OriginalMember(owner = "mapview!da", name = "s", descriptor = "I")
    private int field79 = 1;

    @OriginalMember(owner = "mapview!da", name = "D", descriptor = "J")
    private long field89 = class2.method3((byte) 79);

    @OriginalMember(owner = "mapview!da", name = "n", descriptor = "Lta;")
    public static class37 field74 = class20.method87(-121, "Prev page");

    @OriginalMember(owner = "mapview!da", name = "x", descriptor = "Lta;")
    public static class37 field84 = class20.method87(-89, "Switch to ");

    @OriginalMember(owner = "mapview!da", name = "o", descriptor = "I")
    private int field75;

    @OriginalMember(owner = "mapview!da", name = "p", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "mapview!da", name = "t", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "mapview!da", name = "u", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "mapview!da", name = "v", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "mapview!da", name = "C", descriptor = "J")
    public static long field88;

    @OriginalMember(owner = "mapview!da", name = "y", descriptor = "Lsa;")
    public static class35 field85;

    @OriginalMember(owner = "mapview!da", name = "B", descriptor = "Lc;")
    public static class4 field87;

    @OriginalMember(owner = "mapview!da", name = "E", descriptor = "Z")
    public static boolean field90;

    @OriginalMember(owner = "mapview!da", name = "r", descriptor = "[I")
    public static int[] field78;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(III)I", line = 23)
    public final int method17(int arg0, int arg1, int arg2) {
        int var4 = this.field79;
        int var5 = this.field83;
        this.field79 = 1;
        this.field83 = 300;
        this.field89 = class2.method3((byte) 83);
        if (this.field77[this.field75] == 0L) {
            this.field79 = var4;
            this.field83 = var5;
        } else if (this.field89 > this.field77[this.field75]) {
            this.field83 = (int) ((long) (arg0 * 2560) / (this.field89 - this.field77[this.field75]));
        }
        if (this.field83 < 25) {
            this.field83 = 25;
        }
        if (this.field83 > 256) {
            this.field83 = 256;
            this.field79 = (int) ((long) arg0 - (this.field89 - this.field77[this.field75]) / 10L);
        }
        if (this.field79 > arg0) {
            this.field79 = arg0;
        }
        this.field77[this.field75] = this.field89;
        this.field75 = (this.field75 + 1) % 10;
        if (this.field79 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field77[var6] != 0L) {
                    this.field77[var6] += this.field79;
                }
            }
        }
        if (arg2 > this.field79) {
            this.field79 = arg2;
        }
        class30.method183((long) this.field79, 1000);
        if (arg1 >= -101) {
            this.field83 = 19;
        }
        int var7 = 0;
        while (this.field86 < 256) {
            var7++;
            this.field86 += this.field83;
        }
        this.field86 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(II[Lta;I)Lta;", line = 106)
    public static final class37 method31(int arg0, int arg1, class37[] arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class36.field489;
            }
            var4 += arg2[arg1 + var5].field509;
        }
        if (arg0 != 472) {
            field81 = 92;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg3; var8++) {
            class37 var9 = arg2[arg1 + var8];
            class32.method190(var9.field499, 0, var7, var6, var9.field509);
            var6 += var9.field509;
        }
        class37 var10 = new class37();
        var10.field509 = var4;
        var10.field499 = var7;
        return var10;
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "()V", line = 177)
    public class7() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field77[var1] = this.field89;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(ILjava/awt/Component;)V", line = 202)
    public static final void method32(int arg0, Component arg1) {
        if (arg0 != 12220) {
            field76 = -70;
        }
        Method var2 = class3.field37;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class21.field238);
        arg1.addFocusListener(class21.field238);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(B)V", line = 225)
    public static void method33(byte arg0) {
        int var1 = 88 % ((arg0 - 73) / 44);
        field84 = null;
        field78 = null;
        field74 = null;
        field87 = null;
        field85 = null;
    }
}
