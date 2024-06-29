import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class72 implements Runnable {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Z")
    public boolean field1209 = true;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field1210 = new Object();

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[I")
    public int[] field1219 = new int[500];

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public int field1221 = 0;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[I")
    public int[] field1218 = new int[500];

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field1216 = new String[5];

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Lqd;")
    public static class173 field1214 = new class173(64);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Ldk;")
    public static class251 field1213;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1215;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method490(int arg0) {
        field1214 = null;
        field1215 = null;
        field1216 = null;
        if (arg0 > -105) {
            field1215 = null;
        }
        field1213 = null;
    }

    @OriginalMember(owner = "client!pe", name = "run", descriptor = "()V")
    public final void run() {
        field1212++;
        while (this.field1209) {
            Object var1 = this.field1210;
            synchronized (this.field1210) {
                if (this.field1221 < 500) {
                    this.field1218[this.field1221] = class269.field4344;
                    this.field1219[this.field1221] = class77.field1281;
                    this.field1221++;
                }
            }
            class262.method1758(50L, 29552);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)I")
    public static final int method491(int arg0, int arg1, int arg2) {
        class227 var3 = (class227) class1.field14.method1059(0, (long) arg1);
        field1220++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3664.length; var5++) {
                if (var3.field3666[var5] == arg2) {
                    var4 += var3.field3664[var5];
                }
            }
            if (arg0 <= 104) {
                return 61;
            } else {
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static final void method492(int arg0) {
        if (arg0 != -1) {
            method491(73, 37, 103);
        }
        field1217++;
        if (class46.field768) {
            class34.field513 = null;
            class266.field4284 = null;
            class46.field768 = false;
        }
    }
}
