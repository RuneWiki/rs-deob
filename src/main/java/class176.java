import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class176 extends class107 {

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "[B")
    public byte[] field2882;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field2879 = 0;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Ldf;")
    public static class51 field2878 = class46.method233("rot:", 100);

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Ldf;")
    public static class51 field2881 = class46.method233(" )2> <col=ffffff>", 100);

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Ldf;")
    public static class51 field2886 = class46.method233("::rebuild", 100);

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field2887 = -1;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "Lja;")
    public static class55 field2883;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lre;B)V")
    public static final void method1233(class205 arg0, byte arg1) {
        int var2 = 39 / ((arg1 - 19) / 55);
        class74.method531(200000, -125, arg0);
        field2884++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method1234(KeyEvent arg0, int arg1) {
        int var2 = arg0.getKeyChar();
        field2877++;
        if (var2 == 8364) {
            return 128;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        int var3 = -39 / ((arg1 - 85) / 40);
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([B)V")
    public class176(byte[] arg0) {
        this.field2882 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public static final void method1235(int arg0) {
        field2888++;
        if (!class90.field1498) {
            if (class19.field267 != 0) {
                class191.field3203 = class29.field420;
                class264.field4616 = class242.field4193;
            } else if (class19.field269 == 0) {
                class264.field4616 = class89.field1482;
                class191.field3203 = class90.field1504;
            } else {
                class191.field3203 = class221.field3834;
                class264.field4616 = class265.field4642;
            }
            class129.field2166[0] = class97.field1628;
            class67.field1103[0] = 1005;
            class77.field1235[0] = class43.field696;
            class39.field616 = 1;
        }
        if (class243.field4206 != -1) {
            class215.method1475(class243.field4206, arg0 ^ 0xFFFFFC12);
        }
        for (int var1 = 0; var1 < class167.field2713; var1++) {
            if (class213.field3705[var1]) {
                class42.field681[var1] = true;
            }
            class93.field1547[var1] = class213.field3705[var1];
            class213.field3705[var1] = false;
        }
        class221.field3829 = null;
        class37.field564 = -1;
        class248.field4366 = class179.field2960;
        class78.field1248 = -1;
        if (class243.field4206 != -1) {
            class167.field2713 = 0;
            class8.method41(0, class76.field1230, (byte) 109, class95.field1578, 0, -1, 0, 0, class243.field4206);
        }
        class59.method391();
        if (arg0 != 1005) {
            method1235(-126);
        }
        class12.method72((byte) -95);
        if (class90.field1498) {
            class180.method1282(arg0 ^ 0x6F9B);
        } else if (class37.field564 != -1) {
            class189.method1352(class78.field1248, false, class37.field564);
        }
        if (class90.field1487 == 3) {
            for (int var2 = 0; var2 < class167.field2713; var2++) {
                if (class93.field1547[var2]) {
                    class59.method387(class41.field663[var2], class237.field4124[var2], class62.field1014[var2], class87.field1460[var2], 16711935, 128);
                } else if (class42.field681[var2]) {
                    class59.method387(class41.field663[var2], class237.field4124[var2], class62.field1014[var2], class87.field1460[var2], 16711680, 128);
                }
            }
        }
        class5.method18((byte) 111, class225.field3945, class44.field706.field4319, class44.field706.field4348, class257.field4496);
        class225.field3945 = 0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static void method1236(boolean arg0) {
        field2883 = null;
        field2881 = null;
        field2878 = null;
        field2886 = null;
        if (!arg0) {
            field2883 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lu;ILu;)V")
    public static final void method1237(class111 arg0, int arg1, class111 arg2) {
        class160.field2629 = arg0;
        class118.field1976 = arg2;
        if (arg1 == 31907) {
            field2885++;
        }
    }
}
