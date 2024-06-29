import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class325 extends class152 {

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public int field4028;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "[Lfs;")
    public static class582[] field4027 = new class582[14];

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/lang/String;)V", line = 3)
    public static final void method1931(byte arg0, String arg1) {
        field4025++;
        class336 var2 = class495.method2916((byte) 89);
        var2.field4150.method2353(-120, class307.field3795.field6730);
        var2.field4150.method2369(-18090, 0);
        int var3 = var2.field4150.field5262;
        var2.field4150.method2369(-18090, 648);
        int[] var4 = class523.method3138(var2, 24960);
        int var5 = var2.field4150.field5262;
        var2.field4150.method2388(255, arg1);
        var2.field4150.method2353(-117, class770.field10592);
        if (arg0 < 63) {
            method1931((byte) -34, null);
        }
        var2.field4150.field5262 += 7;
        var2.field4150.method2385(var5, var2.field4150.field5262, var4, -22080);
        var2.field4150.method2416(-122, var2.field4150.field5262 - var3);
        class578.method3334(4, var2);
        class3.field43 = 0;
        class738.field10290 = 0;
        class5.field53 = 1;
        class26.field414 = -3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljw;I)Ljava/lang/String;", line = 38)
    public static final String method1933(class581 arg0, int arg1) {
        field4026++;
        int var2 = 16 % ((arg1 - 11) / 59);
        return arg0.field7922 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)V", line = 51)
    public static void method1935(byte arg0) {
        field4027 = null;
        if (arg0 >= -57) {
            method1931((byte) -116, null);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V", line = 64)
    public class325(int arg0) {
        this.field4028 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)Z")
    public abstract boolean method1932(byte arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1934(int arg0);
}
