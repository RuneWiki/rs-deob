import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class501 implements class418 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Luu;")
    private class237 field6983;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Ltd;")
    public static class519 field6986;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)I")
    public static final int method3019(int arg0, boolean arg1) {
        field6988++;
        if (class96.field1322 == null) {
            return 0;
        } else if (arg1 || class601.field8141 == null) {
            int var2 = arg0;
            for (int var3 = 0; var3 < class96.field1322.length; var3++) {
                int var4 = class96.field1322[var3];
                if (class676.field9378.method1578(var4, (byte) -81)) {
                    var2++;
                }
                if (class171.field2375.method1578(var4, (byte) -81)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class96.field1322.length * 2;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
    public static final void method3020(int arg0, int arg1) {
        class57.field826 = arg1;
        field6982++;
        if (arg0 < 62) {
            method3020(-63, -59);
        }
        class717.field9986.method3906(-97);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I")
    public final int method1338(byte arg0) {
        field6984++;
        if (this.field6983.method1591(0)) {
            return 100;
        } else {
            if (arg0 >= -107) {
                this.field6983 = null;
            }
            return this.field6983.method1601((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Lcca;")
    public final class464 method1337(int arg0) {
        field6987++;
        if (arg0 != 4790) {
            method3019(-45, false);
        }
        return class464.field6457;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Luu;)V")
    public class501(class237 arg0) {
        this.field6983 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public static void method3021(int arg0) {
        field6986 = null;
        if (arg0 != Integer.MAX_VALUE) {
            method3022(79, 119, -55, 88);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIII)I")
    public static final int method3022(int arg0, int arg1, int arg2, int arg3) {
        field6985++;
        if (arg0 != -23253) {
            return 44;
        } else if (class537.field7447 < 100) {
            return -2;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = arg3 - class461.field6400;
            int var7 = arg2 - class461.field6408;
            for (class717 var8 = (class717) class461.field6394.method3618(-102); var8 != null; var8 = (class717) class461.field6394.method3619(0)) {
                if (var8.field9990 == arg1) {
                    int var9 = var8.field9989;
                    int var10 = var8.field9985;
                    int var11 = class461.field6408 + var10 | class461.field6400 + var9 << 14;
                    int var12 = (var7 - var10) * (var7 - var10) + (var6 - var9) * (var6 - var9);
                    if (var4 < 0 || var12 < var5) {
                        var5 = var12;
                        var4 = var11;
                    }
                }
            }
            return var4;
        }
    }
}
