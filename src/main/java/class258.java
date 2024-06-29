import java.awt.Point;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class258 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lhc;")
    public static class151 field3912 = new class151();

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Ljl;")
    public static class231 field3913 = new class231(64);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lnj;")
    public static class198 field3914;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
    public static void method1730(boolean arg0) {
        field3913 = null;
        if (arg0) {
            field3914 = null;
            field3912 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)V")
    public static final void method1731(byte arg0, int arg1) {
        field3911++;
        if (!class262.field3949) {
            arg1 = -1;
        }
        if (class148.field2116 == arg1) {
            return;
        }
        if (arg0 != 105) {
            field3914 = null;
        }
        if (arg1 != -1) {
            class224 var2 = class145.method973((byte) 122, arg1);
            class244 var3 = var2.method1463((byte) -35);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class163.field2378.method555(var3.field1079, new Point(var2.field3361, var2.field3362), class80.field1247, var3.field1082, var3.method1585(), 17);
                class148.field2116 = arg1;
            }
        }
        if (arg1 == -1 && class148.field2116 != -1) {
            class163.field2378.method555(-1, new Point(), class80.field1247, -1, (int[]) null, 17);
            class148.field2116 = -1;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1394(int arg0, int arg1);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Z")
    public static final boolean method1732(int arg0) {
        field3910++;
        if (arg0 > -116) {
            return true;
        }
        try {
            return class184.method1190(0);
        } catch (IOException var4) {
            class259.method1736((byte) -13);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class195.field2807 + "," + class104.field1545 + "," + class211.field3039 + " - " + class7.field140 + "," + (class55.field847.field119[0] + class113.field1615) + "," + (class55.field847.field50[0] + class95.field1445) + " - ";
            for (int var3 = 0; class7.field140 > var3 && var3 < 50; var3++) {
                var2 = var2 + class68.field1071.field1629[var3] + ",";
            }
            class37.method259(-70, var2, var5);
            class178.method1157(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
    public static final void method1733(boolean arg0) {
        field3915++;
        if (arg0) {
            method1730(false);
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var6 = 0; var6 < 104; var6++) {
                class180.field2575[var1][var6] = 0;
            }
        }
        for (int var2 = 0; var2 < class193.field2770; var2++) {
            class53 var5 = class194.field2777[class110.field1589[var2]];
            if (var5 != null) {
                var5.field110 = false;
            }
        }
        for (int var3 = 0; var3 < class51.field756; var3++) {
            class72 var4 = class82.field1268[class67.field1049[var3]];
            if (var4 != null) {
                var4.field110 = false;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)V")
    public abstract void method1391(int arg0, int arg1);

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(II)I")
    public abstract int method1390(int arg0, int arg1);

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)Lqj;")
    public abstract class221 method1397(int arg0);
}
