import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class444 extends class313 implements Runnable {

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public int field6226 = -1;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "Z")
    private boolean field6232 = true;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lid;")
    private class242 field6227;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field6231 = 0;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lid;)V", line = 106)
    public class444(class242 arg0) {
        this.field6227 = arg0;
    }

    @OriginalMember(owner = "client!rf", name = "run", descriptor = "()V", line = 9)
    public final void run() {
        while (this.field6232) {
            this.field6227.method1569(this, -73);
        }
        field6230++;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V", line = 21)
    public final void method2747(byte arg0) {
        if (arg0 != 6) {
            this.field6232 = false;
        }
        this.field6232 = false;
        field6233++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 41)
    public static final String method2748(byte arg0, long arg1) {
        field6229++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0 != -17) {
                method2748((byte) -103, 18L);
            }
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class332.field4487[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)V", line = 96)
    public final void method2749(byte arg0) {
        if (arg0 != 103) {
            this.method2747((byte) -90);
        }
        (new Thread(this, "a")).start();
        field6234++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 118)
    public static final void method2750(int arg0) {
        field6228++;
        if (class356.field4785 < 1024.0F) {
            class356.field4785 = 1024.0F;
        }
        if (class356.field4785 > 3072.0F) {
            class356.field4785 = 3072.0F;
        }
        while (class332.field4483 >= 16384.0F) {
            class332.field4483 -= 16384.0F;
        }
        while (class332.field4483 < 0.0F) {
            class332.field4483 += 16384.0F;
        }
        if (arg0 != -20414) {
            return;
        }
        int var1 = class436.field6153 >> 7;
        int var2 = class431.field6044 >> 7;
        int var3 = class50.method408(class343.field4623, class436.field6153, class431.field6044, 16);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class343.field4623;
                    if (var7 < 3 && class21.method120((byte) 59, var5, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class91.field1276 != null && class91.field1276[var7] != null) {
                        var8 = (class91.field1276[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class436.field6160[var7].method329(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class343.field4624 < var10) {
            class343.field4624 += (var10 - class343.field4624) / 24;
        } else if (class343.field4624 > var10) {
            class343.field4624 += (var10 - class343.field4624) / 80;
            return;
        }
    }
}
