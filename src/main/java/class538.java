import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public abstract class class538 {

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field7866 = 0;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "Ljava/lang/String;")
    public static String field7869 = "";

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "[I")
    public static int[] field7872;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field7867;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lwm;I)V", line = 3)
    public static final void method3162(class403 arg0, int arg1) {
        field7868++;
        if ((arg0.field5663.length - arg0.field5665) < 1) {
            return;
        }
        int var2 = arg0.method2357((byte) 105);
        if (var2 < 0 || var2 > 1 || (arg0.field5663.length - arg0.field5665) < 2) {
            return;
        }
        int var3 = arg0.method2338(arg1);
        if ((arg0.field5663.length - arg0.field5665) < (var3 * 6)) {
            return;
        }
        for (int var4 = arg1; var4 < var3; var4++) {
            int var5 = arg0.method2338(0);
            int var6 = arg0.method2319((byte) 99);
            if (var5 < class336.field4863.length && class421.field5943[var5] && (class438.field6141.method2234((byte) 77, var5).field5947 != '1' || var6 >= -1 && var6 <= 1)) {
                class336.field4863[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 52)
    public static void method3163(int arg0) {
        field7867 = null;
        field7869 = null;
        field7872 = null;
        if (arg0 != -1) {
            field7866 = 10;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BJLza;)V", line = 73)
    public static final void method3164(byte arg0, long arg1, class290 arg2) {
        class255.field3771 = class369.field5271;
        class27.field329 = 0;
        field7871++;
        class369.field5271 = 0;
        long var4 = class465.method2699((byte) 14);
        for (class351 var6 = (class351) class271.field4027.method2748(2); var6 != null; var6 = (class351) class271.field4027.method2751(-16195)) {
            if (var6.method2073(arg2, arg1)) {
                class27.field329++;
            }
        }
        if (class435.field6115 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class271.field4027.method2750((byte) 77) + ", running: " + class27.field329 + ". Particles: " + class369.field5271 + ". Time taken: " + (class465.method2699((byte) 14) - var4) + "ms");
        }
        if (arg0 >= -115) {
            method3164((byte) -111, 105L, null);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BII[B)Ljava/lang/String;", line = 115)
    public static final String method3165(byte arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 < 61) {
            return null;
        }
        field7870++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg3[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class422.field5954[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBI)[B")
    public abstract byte[] method1224(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1226(byte arg0);

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B[B)V")
    public abstract void method1225(byte arg0, byte[] arg1);
}
