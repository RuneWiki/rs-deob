import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class57 {

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field1026 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lij;")
    public static class50 field1022 = class78.method578(123, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "[S")
    public static short[] field1030 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field1025 = 0;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field1033 = 0;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field1037 = 0;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lqj;")
    public static class152 field1029;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Lij;")
    public class50 field1024;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Z")
    public boolean field1034;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[[[Lr;")
    public static class65[][][] field1027;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB)V")
    public static final void method449(int arg0, int arg1, byte arg2) {
        field1028++;
        int var3 = arg1--;
        int var4 = class101.field1857[arg1];
        int var5 = 66 % ((47 - arg2) / 63);
        int var6 = class20.field429[arg1];
        if (var3 > 25) {
            var3 = 25;
        }
        if (arg0 == 0) {
            class190.field3141.method1598((byte) -103, 212);
            class50.field899++;
            class190.field3141.method1471(var3 + var3 + 3, (byte) 24);
        }
        if (arg0 == 1) {
            class250.field4346++;
            class190.field3141.method1598((byte) -98, 133);
            class190.field3141.method1471(var3 + var3 + 3 + 14, (byte) 24);
        }
        if (arg0 == 2) {
            class190.field3141.method1598((byte) -99, 62);
            class103.field1887++;
            class190.field3141.method1471(var3 + var3 + 3, (byte) 24);
        }
        class190.field3141.method1494(var6 + class254.field4394, (byte) -36);
        class190.field3141.method1494(class61.field1124 + var4, (byte) -69);
        class259.field4512 = class101.field1857[0];
        class102.field1872 = class20.field429[0];
        for (int var7 = 1; var7 < var3; var7++) {
            arg1--;
            class190.field3141.method1485(125, class101.field1857[arg1] - var4);
            class190.field3141.method1467(0, class20.field429[arg1] - var6);
        }
        class190.field3141.method1488(true, class46.field846[82] ? 1 : 0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method450(int arg0, Component arg1) {
        field1031++;
        arg1.addMouseListener(class112.field1978);
        arg1.addMouseMotionListener(class112.field1978);
        arg1.addFocusListener(class112.field1978);
        if (arg0 != 0) {
            field1022 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method451(int arg0) {
        field1030 = null;
        if (arg0 >= -64) {
            field1027 = null;
        }
        field1027 = null;
        field1022 = null;
        field1029 = null;
    }
}
