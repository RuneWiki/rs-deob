import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public abstract class class715 {

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "Lgt;")
    public class453 field9979;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "[[I")
    public static int[][] field9978 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "F")
    public static float field9982;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field9980;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    public static int field9983;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public static int field9985;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    public static int field9986;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    public static int field9987;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
    public static int field9988;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
    public static int field9989;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 3)
    public void method886(int arg0) {
        field9981++;
        if (arg0 > -37) {
            field9989 = -86;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZCLjava/lang/String;)I", line = 20)
    public static final int method3980(boolean arg0, char arg1, String arg2) {
        field9986++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
        }
        if (arg0) {
            return 71;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V", line = 48)
    public void method888(boolean arg0) {
        field9983++;
        if (arg0) {
            this.field9979 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V", line = 61)
    public void method887(int arg0) {
        field9987++;
        if (arg0 != -13878) {
            field9978 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(Z)V", line = 71)
    public static void method3981(boolean arg0) {
        field9978 = null;
        if (arg0) {
            field9989 = -120;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIILtb;Lka;I)V", line = 87)
    public static final void method3982(int arg0, int arg1, int arg2, class397 arg3, class469 arg4, int arg5) {
        field9985++;
        if (arg4 != null) {
            arg3.method2462(arg2, arg4.method362(), arg4.method338(), arg4.method356(), arg5, arg1, arg4.method335(), arg4.method312(), arg4.method353(), arg4.method327(), arg0 + 16736697);
            if (arg0 != -24762) {
                field9989 = 79;
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V", line = 105)
    public void method884(int arg0) {
        int var2 = 4 / ((-arg0 - 43) / 42);
        field9984++;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lgt;)V", line = 115)
    public class715(class453 arg0) {
        this.field9979 = arg0;
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)V", line = 123)
    public void method885(int arg0) {
        field9980++;
        if (arg0 != 8) {
            this.method687(38, -77, -33);
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V", line = 133)
    public void method2085(byte arg0) {
        if (arg0 < -45) {
            field9988++;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)V")
    public abstract void method687(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Z")
    public abstract boolean method690(byte arg0);

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)V")
    public abstract void method689(int arg0);

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILdu;I)V")
    public abstract void method693(int arg0, class355 arg1, int arg2);

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI)V")
    public abstract void method691(boolean arg0, int arg1);

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BZ)V")
    public abstract void method686(byte arg0, boolean arg1);
}
