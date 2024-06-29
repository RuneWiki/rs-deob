import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class301 {

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lco;")
    private class210 field4475 = new class210(128);

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lg;")
    private class470 field4472;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Lec;")
    public static class40 field4474 = new class40("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "[Lrg;")
    public static class395[] field4470;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Lea;")
    public final class64 method1889(int arg0, int arg1) {
        field4473++;
        class210 var3 = this.field4475;
        class64 var4;
        synchronized (this.field4475) {
            var4 = (class64) this.field4475.method1163((byte) -52, (long) arg0);
            if (arg1 >= -12) {
                this.method1889(108, 69);
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4472.method2768(-20472, class199.method1089(-110, arg0), class459.method2705(arg0, 30753));
        class64 var6 = new class64();
        if (var5 != null) {
            var6.method327(3, new class179(var5));
        }
        class210 var7 = this.field4475;
        synchronized (this.field4475) {
            this.field4475.method1172((long) arg0, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZII)I")
    public static final int method1890(int arg0, boolean arg1, int arg2, int arg3) {
        field4471++;
        class458 var4 = class230.method1272((byte) -127, arg1, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = -120 / ((arg3 - 13) / 34);
            int var6 = 0;
            for (int var7 = 0; var7 < var4.field6454.length; var7++) {
                if (var4.field6447[var7] == arg0) {
                    var6 += var4.field6454[var7];
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lci;ILg;)V")
    public class301(class421 arg0, int arg1, class470 arg2) {
        this.field4472 = arg2;
        if (this.field4472 != null) {
            int var4 = this.field4472.method2756(true) - 1;
            this.field4472.method2755(-85, var4);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method1891(byte arg0) {
        if (arg0 >= 64) {
            field4470 = null;
            field4474 = null;
        }
    }
}
