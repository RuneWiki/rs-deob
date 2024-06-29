import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class172 extends class361 {

    @OriginalMember(owner = "client!se", name = "F", descriptor = "Z")
    public volatile boolean field2496 = true;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Z")
    public static boolean field2487 = false;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "Z")
    public static boolean field2497 = false;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "Z")
    public static boolean field2492 = true;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "Ljava/awt/Font;")
    public static Font field2490;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "Z")
    public boolean field2493;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Z")
    public boolean field2494;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLoi;)V", line = 8)
    public static final void method1074(byte arg0, class53 arg1) {
        class256.field3817 = arg1;
        field2491++;
        if (arg0 != 84) {
            method1077(114, -97);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 20)
    public static void method1075(byte arg0) {
        field2490 = null;
        if (arg0 != 13) {
            method1077(-56, 21);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V", line = 30)
    public static final void method1076(byte arg0) {
        if (class385.field5414.method326()) {
            class385.field5414.method370(class487.field6799);
            class387.method2239(78);
            class385.field5414.method334(class487.field6799);
            class385.field5414.method285(class487.field6799);
        } else {
            class192.method1221((byte) -87, class405.field5737);
        }
        if (arg0 > -47) {
            field2497 = false;
        }
        field2498++;
        class385.method2235((byte) 113);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V", line = 65)
    public static final void method1077(int arg0, int arg1) {
        class427.field6022 = new int[arg1];
        class63.field792 = new int[arg1];
        field2495++;
        class14.field188 = new int[arg1];
        class405.field5736 = new int[arg1];
        class542.field7924 = new int[arg1];
        if (arg0 != 1004) {
            field2497 = false;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)Z", line = 90)
    public static final boolean method1079(byte arg0) {
        field2488++;
        class498 var1 = class363.field5190.field6378.field7056;
        if (var1 == null || class363.field5190.field6378 == var1) {
            return false;
        }
        class214 var2 = (class214) var1;
        if (arg0 >= -99) {
            return true;
        } else {
            if (var2.field3094 >= 2000) {
                var2.field3094 -= 2000;
            }
            return var2.field3094 == 1004;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1073(int arg0);

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)I")
    public abstract int method1078(int arg0);
}
