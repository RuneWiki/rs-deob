import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class14 extends class307 {

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "[I")
    public int[] field219 = new int[5];

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "[Lhf;")
    public class193[] field230 = new class193[5];

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public int field221 = 0;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "[I")
    public static int[] field213 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Z")
    public static boolean field227 = false;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Lqd;")
    public static class40 field211 = class147.method1106("rect_debug=", (byte) -57);

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "Lqd;")
    public static class40 field234 = class147.method1106(" GMT", (byte) -70);

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    public static volatile int field241 = 0;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static volatile int field212 = 0;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public int field237;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "Lsf;")
    public class102 field222;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "Lel;")
    public class113 field231;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "Lue;")
    public class14 field238;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "Lub;")
    public class20 field225;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "Lgd;")
    public class299 field232;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "Lak;")
    public class302 field235;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "Lih;")
    public class30 field220;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "Z")
    public boolean field214;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "Z")
    public boolean field218;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "Z")
    public boolean field223;

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(III)V", line = 11)
    public class14(int arg0, int arg1, int arg2) {
        this.field217 = this.field229 = arg0;
        this.field239 = arg1;
        this.field233 = arg2;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)Lfg;", line = 23)
    public static final class206 method83(int arg0, byte arg1) {
        field224++;
        class206 var2 = (class206) class63.field1197.method984(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class237.field3917.method1651(0, arg0 & 0x7FFF, -1);
        } else {
            var3 = class306.field5127.method1651(0, arg0, -1);
        }
        class206 var4 = new class206();
        if (var3 != null) {
            var4.method1452(28908, new class26(var3));
        }
        int var5 = -77 % ((-arg1 - 8) / 54);
        if (arg0 >= 32768) {
            var4.method1449(32768);
        }
        class63.field1197.method982(var4, (long) arg0, (byte) 79);
        return var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)J", line = 61)
    public static final long method84(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field216; var4++) {
            class193 var5 = var3.field230[var4];
            if ((var5.field3101 >> 29 & 0x3L) == 2L && var5.field3107 == arg1 && var5.field3108 == arg2) {
                return var5.field3101;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 137)
    public static void method85(byte arg0) {
        field234 = null;
        field213 = null;
        field211 = null;
        if (arg0 != 104) {
            method83(-111, (byte) -33);
        }
    }
}
