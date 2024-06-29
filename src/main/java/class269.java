import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class269 {

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "[I")
    public int[] field3984;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "[I")
    public int[] field3979;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "Luc;")
    public static class51 field3978 = new class51(64);

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "Luc;")
    public static class51 field3986 = new class51(50);

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "[I")
    public static int[] field3987 = new int[4];

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "Lir;")
    public static class185 field3990;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "[I")
    public static int[] field3989;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1793(int arg0) {
        field3982++;
        if (class362.field5367 || arg0 != 237) {
            return;
        }
        if (class331.field4880) {
            class39.field588 = (float) ((int) class39.field588 + 47 & 0xFFFFFFF0);
        } else {
            class397.field5791 += (12.0F - class397.field5791) / 2.0F;
        }
        class164.field2233 = true;
        class362.field5367 = true;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)La;", line = 31)
    public static final class21 method1794(int arg0, int arg1) {
        field3981++;
        class21 var2 = (class21) class238.field3346.method378((byte) 28, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -18176) {
            method1796((byte) 93);
        }
        byte[] var3 = class266.field3948.method1235(4, false, arg1);
        class21 var4 = new class21();
        if (var3 != null) {
            var4.method196(arg1, true, new class341(var3));
        }
        var4.method194((byte) -66, arg1);
        class238.field3346.method367((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(I)V", line = 62)
    public class269(int arg0) {
        this.field3983 = arg0;
        this.field3984 = new int[this.field3983];
        this.field3979 = new int[this.field3983];
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V", line = 73)
    public static void method1795(byte arg0) {
        field3978 = null;
        field3989 = null;
        if (arg0 == 125) {
            field3986 = null;
            field3987 = null;
            field3990 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V", line = 88)
    public static final void method1796(byte arg0) {
        field3980++;
        if (arg0 == 60 && class364.field5387 != 3) {
            class13.field209 = -1;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIII)I", line = 105)
    public static final int method1797(int arg0, int arg1, int arg2, int arg3) {
        field3985++;
        int var4 = arg3 & 0x3;
        if (arg0 != -282) {
            method1796((byte) -85);
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg1;
        }
    }
}
