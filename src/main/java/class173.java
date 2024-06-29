import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class173 extends class184 {

    @OriginalMember(owner = "client!tca", name = "s", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!tca", name = "t", descriptor = "I")
    public int field2682;

    @OriginalMember(owner = "client!tca", name = "r", descriptor = "[I")
    public int[] field2680;

    @OriginalMember(owner = "client!tca", name = "u", descriptor = "[I")
    public int[] field2683;

    @OriginalMember(owner = "client!tca", name = "m", descriptor = "[[I")
    public int[][] field2675;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "[Z")
    public boolean[] field2676;

    @OriginalMember(owner = "client!tca", name = "p", descriptor = "Lef;")
    public static class489 field2678 = new class489();

    @OriginalMember(owner = "client!tca", name = "v", descriptor = "Lmia;")
    public static class63 field2684 = new class63(48, 0);

    @OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
    public static int field2686 = 2;

    @OriginalMember(owner = "client!tca", name = "o", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!tca", name = "q", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!tca", name = "w", descriptor = "I")
    public static int field2685;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tca", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field2687;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1237(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIII)I", line = 14)
    public static final int method1234(int arg0, int arg1, int arg2, int arg3) {
        field2677++;
        if (arg3 != -2359) {
            field2684 = null;
        }
        int var4 = 255 - arg0;
        int var5 = ((arg2 & 0xFF00) * arg0 & 0xFF0000 | (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
        return (((arg1 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg1 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lst;", line = 31)
    public static final class435 method1235(Component arg0, boolean arg1, byte arg2) {
        field2685++;
        try {
            int var3 = 72 / ((arg2 - 11) / 41);
            Constructor var4 = Class.forName("sf").getDeclaredConstructor(field2687 == null ? (field2687 = method1237("java.awt.Component")) : field2687, Boolean.TYPE);
            return (class435) var4.newInstance(arg0, Boolean.valueOf(arg1));
        } catch (Throwable var5) {
            return new class502(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(I[B)V", line = 46)
    public class173(int arg0, byte[] arg1) {
        this.field2681 = arg0;
        class645 var3 = new class645(arg1);
        this.field2682 = var3.method3745(-6314);
        this.field2680 = new int[this.field2682];
        this.field2683 = new int[this.field2682];
        this.field2675 = new int[this.field2682][];
        this.field2676 = new boolean[this.field2682];
        for (int var4 = 0; var4 < this.field2682; var4++) {
            this.field2683[var4] = var3.method3745(-6314);
            if (this.field2683[var4] == 6) {
                this.field2683[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field2682; var5++) {
            this.field2676[var5] = var3.method3745(-6314) == 1;
        }
        for (int var6 = 0; var6 < this.field2682; var6++) {
            this.field2680[var6] = var3.method3712((byte) -112);
        }
        for (int var7 = 0; var7 < this.field2682; var7++) {
            this.field2675[var7] = new int[var3.method3745(-6314)];
        }
        for (int var8 = 0; var8 < this.field2682; var8++) {
            for (int var9 = 0; var9 < this.field2675[var8].length; var9++) {
                this.field2675[var8][var9] = var3.method3745(-6314);
            }
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V", line = 110)
    public static void method1236(byte arg0) {
        field2678 = null;
        field2684 = null;
        if (arg0 >= -29) {
            method1236((byte) 79);
        }
    }
}
