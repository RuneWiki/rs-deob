import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class343 extends RuntimeException {

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5335;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "Ljava/lang/String;")
    public String field5336;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field5330 = -1;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field5331 = 0;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5332 = " ";

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "[I")
    public static int[] field5338 = new int[500];

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "[Lec;")
    public static class171[] field5333 = new class171[50];

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "[Lgd;")
    public static class134[] field5329 = new class134[4];

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "J")
    public static long field5341 = 0L;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BZLjava/lang/String;)V", line = 8)
    public static final void method2379(byte arg0, boolean arg1, String arg2) {
        field5340++;
        int var3 = 0;
        short[] var4 = new short[16];
        String var5 = arg2.toLowerCase();
        for (int var6 = 0; var6 < class200.field3258; var6++) {
            class330 var7 = class285.method2054(var6, 0);
            if ((!arg1 || var7.field5105) && var7.field5144 == -1 && var7.field5158 == -1 && var7.field5103 == 0 && var7.field5135.toLowerCase().indexOf(var5) != -1) {
                if (var3 >= 250) {
                    class219.field3544 = -1;
                    class94.field1287 = null;
                    return;
                }
                if (var3 >= var4.length) {
                    short[] var8 = new short[var4.length * 2];
                    for (int var9 = 0; var9 < var3; var9++) {
                        var8[var9] = var4[var9];
                    }
                    var4 = var8;
                }
                var4[var3++] = (short) var6;
            }
        }
        class17.field207 = 0;
        class94.field1287 = var4;
        class219.field3544 = var3;
        if (arg0 <= 96) {
            field5338 = (int[]) null;
        }
        String[] var10 = new String[class219.field3544];
        for (int var11 = 0; var11 < class219.field3544; var11++) {
            var10[var11] = class285.method2054(var4[var11], 0).field5135;
        }
        class101.method695((byte) 123, var10, class94.field1287);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V", line = 87)
    public static final void method2380(int arg0, int arg1) {
        field5334++;
        class176.field2942.method708(arg0, true);
        if (arg1 != -23882) {
            method2380(-12, -58);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 105)
    public static void method2381(int arg0) {
        field5333 = null;
        field5329 = null;
        if (arg0 >= -74) {
            field5341 = -42L;
        }
        field5332 = null;
        field5338 = null;
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 125)
    public class343(Throwable arg0, String arg1) {
        this.field5335 = arg0;
        this.field5336 = arg1;
    }
}
