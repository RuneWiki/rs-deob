import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class80 implements Runnable {

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "[Lgaa;")
    public volatile class248[] field1078 = new class248[2];

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Z")
    public volatile boolean field1074 = false;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Z")
    public volatile boolean field1073 = false;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lh;")
    public static class572 field1075 = new class572("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Llp;")
    public class331 field1077;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[[S")
    public static short[][] field1072;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 3)
    public static final void method609(int arg0) {
        field1076++;
        if (class453.method2755(class472.field6670, 24152) || class136.method942(class472.field6670, arg0 - 283268804)) {
            class395.method2343(class125.field1760 >> 10, arg0 ^ 0x10E2569E, class214.field3161 >> 10, 5000);
        } else {
            int var1 = class541.field8119.field1957[0] >> 3;
            int var2 = class541.field8119.field1955[0] >> 3;
            if (var1 >= 0 && class146.field2125 >> 3 > var1 && var2 >= 0 && var2 < (class410.field5609 >> 3)) {
                class395.method2343(var1, 117, var2, 5000);
            } else {
                class395.method2343(class146.field2125 >> 4, 72, class410.field5609 >> 4, 0);
            }
        }
        class115.method830(7);
        class89.method666(125);
        class241.method1536(9079);
        if (arg0 != 283268810) {
            method611((byte) 115);
        }
        class123.method876(256);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 33)
    public static final int method610(boolean arg0, String arg1) {
        if (!arg0) {
            field1072 = null;
        }
        field1071++;
        if (class331.field4576 == 3) {
            return -1;
        } else if (class485.field6909.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class397.method2356(arg1, -84);
            if (var2 == null) {
                return -1;
            }
            String var3 = class564.field8355 + var2;
            if (!class18.field171.method1977(1, "", var3)) {
                return -1;
            } else if (class18.field171.method1987((byte) -82, var3)) {
                byte[] var4 = class18.field171.method1990("", 0, var3);
                File var5 = class88.field1315.method2009(var2, 0);
                if (var4 == null || var5 == null) {
                    return -1;
                }
                boolean var6 = true;
                byte[] var7 = class388.method2310(41, var5);
                if (var7 != null && var4.length == var7.length) {
                    for (int var8 = 0; var8 < var7.length; var8++) {
                        if (var4[var8] != var7[var8]) {
                            var6 = false;
                            break;
                        }
                    }
                } else {
                    var6 = false;
                }
                try {
                    if (!var6) {
                        class88.field1315.method2025(var5, 0, var4);
                    }
                } catch (Throwable var9) {
                    return -1;
                }
                class297.method1825(-253, arg1, var5);
                return 100;
            } else {
                return class18.field171.method1962(12010, var3);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 116)
    public static void method611(byte arg0) {
        field1072 = null;
        field1075 = null;
        int var1 = 50 % ((20 - arg0) / 61);
    }

    @OriginalMember(owner = "client!sd", name = "run", descriptor = "()V", line = 127)
    public final void run() {
        field1070++;
        this.field1073 = true;
        try {
            while (!this.field1074) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class248 var2 = this.field1078[var1];
                    if (var2 != null) {
                        var2.method1580((byte) 72);
                    }
                }
                class236.method1513(true, 10L);
                class369.method2213((byte) 110, this.field1077, null);
            }
        } catch (Exception var9) {
            class378.method2255(var9, null, -100);
        } finally {
            Object var6 = null;
            this.field1073 = false;
        }
    }
}
