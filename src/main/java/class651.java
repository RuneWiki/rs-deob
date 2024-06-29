import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class651 extends class546 {

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field9037 = 64;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "Z")
    public static boolean field9042 = false;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "[Lnba;")
    public static class270[] field9044 = new class270[4];

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public int field9036;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public int field9038;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field9039;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public int field9041;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "Lls;")
    public class124 field9045;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "Lov;")
    public static class171 field9040;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 5)
    public static void method3667(int arg0) {
        if (arg0 > -33) {
            method3669((byte) -29);
        }
        field9044 = null;
        field9040 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[IILhb;)V", line = 24)
    public static final void method3668(int arg0, int[] arg1, int arg2, class677 arg3) {
        if (arg0 <= 118) {
            return;
        }
        field9035++;
        if (arg3.field1735 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg3.field1735.length; var5++) {
                if (arg3.field1735[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg3.field1779 != -1) {
                class403 var6 = class192.field2727.method3090(110, arg3.field1779);
                int var7 = var6.field5660;
                if (var7 == 1) {
                    arg3.field1722 = 0;
                    arg3.field1784 = 1;
                    arg3.field1739 = 0;
                    arg3.field1706 = arg2;
                    arg3.field1766 = 0;
                    if (!arg3.field1764) {
                        class234.method1476(arg3, var6, arg3.field1739, (byte) -54);
                    }
                }
                if (var7 == 2) {
                    arg3.field1722 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg3.field1735 == null || arg3.field1735[var9] == -1 || class192.field2727.method3090(103, arg1[var9]).field5668 >= class192.field2727.method3090(-106, arg3.field1735[var9]).field5668) {
                arg3.field1706 = arg2;
                arg3.field1735 = arg1;
                break;
            }
        }
        if (var8) {
            arg3.field1735 = arg1;
            arg3.field1706 = arg2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 120)
    public static final void method3669(byte arg0) {
        if (arg0 > -66) {
            return;
        }
        field9043++;
        if (!class307.method1862((byte) 107)) {
            return;
        }
        if (class61.field687 == null) {
            class639.method3566(118);
        }
        class555.field7483 = true;
        class588.field8258 = 0;
    }
}
