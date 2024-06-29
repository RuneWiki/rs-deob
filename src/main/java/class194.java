import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class194 implements Runnable {

    @OriginalMember(owner = "client!of", name = "j", descriptor = "[Lbi;")
    public volatile class67[] field3226 = new class67[2];

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Z")
    public volatile boolean field3227 = false;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Z")
    public volatile boolean field3221 = false;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Ltl;")
    public static class59 field3217 = class85.method639("Eingabeprozedur geladen)3", 9588);

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Ltl;")
    public static class59 field3223 = class85.method639("scrollen:", 9588);

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field3224 = 0;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Ltl;")
    public static class59 field3222 = class85.method639("Schlie-8en", 9588);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lim;")
    public class175 field3225;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIZ)V", line = 7)
    public static final void method1413(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class120.field2000 = arg1;
        class78.field1244 = arg2;
        class286.field4918 = arg3;
        class64.field990 = new class245[arg0][class120.field2000][class78.field1244];
        class239.field3993 = new int[arg0][class120.field2000 + 1][class78.field1244 + 1];
        if (class55.field815) {
            class213.field3485 = new class32[4][];
        }
        if (arg4) {
            class212.field3465 = new class245[1][class120.field2000][class78.field1244];
            class172.field2833 = new int[class120.field2000][class78.field1244];
            class4.field57 = new int[1][class120.field2000 + 1][class78.field1244 + 1];
            if (class55.field815) {
                class221.field3587 = new class32[1][];
            }
        } else {
            class212.field3465 = (class245[][][]) null;
            class172.field2833 = (int[][]) null;
            class4.field57 = (int[][][]) null;
            class221.field3587 = (class32[][]) null;
        }
        class265.method1835(false);
        class269.field4671 = new class86[500];
        class254.field4220 = 0;
        class154.field2517 = new class86[500];
        class255.field4234 = 0;
        class1.field2 = new int[arg0][class120.field2000 + 1][class78.field1244 + 1];
        class131.field2171 = new class165[5000];
        class269.field4672 = 0;
        class177.field2898 = new class165[100];
        class292.field4994 = new boolean[class286.field4918 + class286.field4918 + 1][class286.field4918 + class286.field4918 + 1];
        class77.field1238 = new boolean[class286.field4918 + class286.field4918 + 2][class286.field4918 + class286.field4918 + 2];
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 64)
    public static void method1414(boolean arg0) {
        field3223 = null;
        field3217 = null;
        if (!arg0) {
            field3223 = (class59) null;
        }
        field3222 = null;
    }

    @OriginalMember(owner = "client!of", name = "run", descriptor = "()V", line = 80)
    public final void run() {
        this.field3221 = true;
        try {
            while (!this.field3227) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class67 var2 = this.field3226[var1];
                    if (var2 != null) {
                        var2.method549((byte) -127);
                    }
                }
                class183.method1360(false, 10L);
                class46.method324(this.field3225, (Object) null, 2111924944);
            }
        } catch (Exception var7) {
            class306.method2126((String) null, -13, var7);
        } finally {
            this.field3221 = false;
        }
        field3219++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)Z", line = 124)
    public static final boolean method1415(int arg0, byte arg1) {
        field3220++;
        class231 var2 = class102.method770(arg0, -65536);
        if (var2 == null) {
            return false;
        } else if (class175.field2877 == 1 || class175.field2877 == 2 || class268.field4661 == 2) {
            byte[] var3 = var2.field3796.method459(1647627301);
            class124.field2056 = new String(var3, 0, var3.length);
            class46.field754 = var2.field3798;
            if (class268.field4661 != 0) {
                class299.field5109 = class46.field754 + 40000;
                class146.field2391 = class46.field754 + 50000;
                class131.field2170 = class299.field5109;
            }
            return true;
        } else {
            if (arg1 != -5) {
                field3224 = -78;
            }
            class59 var4 = class11.field149;
            if (class268.field4661 != 0) {
                var4 = class233.method1630(new class59[] { class31.field435, class81.method619((byte) -108, var2.field3798 + 7000) }, -2883);
            }
            class59 var5 = class11.field149;
            if (class308.field5233 != null) {
                var5 = class233.method1630(new class59[] { class221.field3578, class308.field5233 }, -2883);
            }
            class59 var6 = class233.method1630(new class59[] { class198.field3291, var2.field3796, var4, class150.field2461, class81.method619((byte) -75, class178.field2922), class307.field5199, class81.method619((byte) -106, class124.field2055), var5, class90.field1411, class155.field2542 ? class4.field53 : class88.field1388, class6.field71, class160.field2612 ? class4.field53 : class88.field1388, class263.field4383, class13.field182 ? class4.field53 : class88.field1388 }, arg1 - 2878);
            try {
                class237.field3964.getAppletContext().showDocument(var6.method457((byte) 65), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }
}
