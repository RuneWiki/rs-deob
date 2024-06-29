import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class400 implements Runnable {

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "[Lpo;")
    public volatile class202[] field5967 = new class202[2];

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Z")
    public volatile boolean field5963 = false;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Z")
    public volatile boolean field5964 = false;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field5969 = 255;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5968 = "shake:";

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Z")
    public static boolean field5975 = false;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lwd;")
    public class36 field5966;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field5965;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method2576(byte arg0) {
        field5965 = null;
        field5968 = null;
        int var1 = 109 % ((-arg0 - 45) / 59);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
    public static final void method2577(byte arg0) {
        field5972++;
        class87.field1228 = new class275(8);
        class134.field1868 = 0;
        for (class6 var1 = (class6) class106.field1530.method1005(107); var1 != null; var1 = (class6) class106.field1530.method1009(false)) {
            var1.method42();
        }
        if (arg0 > -105) {
            field5965 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method2578(int arg0) {
        if (class70.field932 == 10) {
            class232.method1391(-26, 28);
        }
        if (arg0 <= -105) {
            field5974++;
            if (class70.field932 == 30) {
                class232.method1391(-26, 25);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "run", descriptor = "()V")
    public final void run() {
        field5970++;
        this.field5964 = true;
        try {
            while (!this.field5963) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class202 var2 = this.field5967[var1];
                    if (var2 != null) {
                        var2.method1201(5426);
                    }
                }
                class144.method918(10L, true);
                class8.method61((byte) 87, (Object) null, this.field5966);
            }
        } catch (Exception var9) {
            class248.method1494((String) null, -86, var9);
        } finally {
            Object var6 = null;
            this.field5964 = false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
    public static final void method2579(byte arg0) {
        field5973++;
        class189 var1 = class27.field388;
        synchronized (class27.field388) {
            class27.field388.method1141(256);
            if (arg0 >= -34) {
                field5975 = true;
            }
        }
    }
}
