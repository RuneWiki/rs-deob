import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class80 {

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1342 = "cyan:";

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field1340 = 0;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Z")
    public static boolean field1345 = false;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "B")
    public byte field1339;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Ljava/lang/String;")
    public String field1343;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Ljava/lang/String;")
    public String field1346;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "Ljava/lang/String;")
    public String field1349;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static final void method556(int arg0) {
        if (class159.field2609 != null) {
            class159.field2609.method1070(103);
            class159.field2609 = null;
        }
        field1341++;
        class312.method2112(0);
        class20.method123();
        for (int var1 = 0; var1 < 4; var1++) {
            class225.field3790[var1].method2091((byte) 88);
        }
        class85.method600(false, (byte) 7);
        System.gc();
        class264.method1870(2, -119);
        class57.field1004 = -1;
        class101.field1601 = false;
        class209.method1467(21, true);
        class26.field462 = 0;
        class78.field1313 = 0;
        class260.field4363 = 0;
        if (arg0 != 104) {
            field1345 = false;
        }
        class222.field3722 = false;
        class263.field4395 = 0;
        for (int var2 = 0; var2 < class250.field4234.length; var2++) {
            class250.field4234[var2] = null;
        }
        class154.field2553 = 0;
        class303.field4932 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class15.field300[var3] = null;
            class77.field1309[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class57.field1002[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class125.field2101[var5][var6][var7] = null;
                }
            }
        }
        class183.method1330((byte) 72);
        class227.field3845 = 0;
        class190.method1374(false);
        class236.method1694(true, false);
        try {
            class288.method2005(class142.field2344.field1380, (byte) 100, "loggedout");
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public static final void method557(int arg0) {
        if (arg0 >= -102) {
            field1340 = -63;
        }
        for (class278 var1 = (class278) class306.field4952.method982(-9570); var1 != null; var1 = (class278) class306.field4952.method981(-1)) {
            int var2 = var1.field4622;
            if (class301.method2056(-1, var2)) {
                boolean var3 = true;
                class207[] var4 = class208.field3515[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3446;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2213;
                    class207 var7 = class222.method1574(117, var6);
                    if (var7 != null) {
                        class206.method1441(0, var7);
                    }
                }
            }
        }
        field1348++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method558(Component arg0, byte arg1) {
        field1338++;
        arg0.addMouseListener(class109.field1791);
        int var2 = -120 / (-arg1 / 36);
        arg0.addMouseMotionListener(class109.field1791);
        arg0.addFocusListener(class109.field1791);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
    public static void method559(int arg0) {
        if (arg0 == -1) {
            field1342 = null;
        }
    }
}
