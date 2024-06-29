import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class69 {

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
    public static final void method507(byte arg0) {
        field905++;
        if (arg0 > -84) {
            method510((class341) null, true, (String) null, true, 38);
        }
        class148.field2006 = null;
        class31.field432 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)V")
    public static final void method508(int arg0, byte arg1) {
        class42.field555 = new class363(arg0);
        if (arg1 != -13) {
            method508(-100, (byte) 89);
        }
        field907++;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class167.field2206 = arg0;
        class100.field1271 = 0x1 << class167.field2206;
        class135.field1852 = class100.field1271 >> 1;
        class100.field1295 = (int) Math.sqrt((double) (class135.field1852 * class135.field1852 + class135.field1852 * class135.field1852));
        class329.field4899 = arg2;
        class380.field5590 = arg3;
        class31.field431 = arg4;
        class349.field5121 = new class369[arg1][class329.field4899][class380.field5590];
        class28.field401 = new class378[arg1];
        if (arg5) {
            class200.field2829 = new class369[1][class329.field4899][class380.field5590];
            class299.field4360 = new int[class329.field4899][class380.field5590];
            class161.field2151 = new class378[1];
        } else {
            class200.field2829 = null;
            class299.field4360 = null;
            class161.field2151 = null;
        }
        if (arg6) {
            class455.field6730 = new long[arg1][arg2][arg3];
            class120.field1613 = new class157[65535];
            class464.field6839 = new boolean[65535];
            class234.field3516 = 0;
        } else {
            class455.field6730 = null;
            class120.field1613 = null;
            class464.field6839 = null;
            class234.field3516 = 0;
        }
        class204.method1400(false);
        class234.field3515 = new class96[500];
        class215.field3062 = 0;
        class373.field5448 = new class96[500];
        class200.field2827 = 0;
        class392.field5706 = new int[arg1][class329.field4899 + 1][class380.field5590 + 1];
        class93.field1163 = new class336[5000];
        class302.field4425 = 0;
        class57.field694 = new boolean[class31.field431 + class31.field431 + 1][class31.field431 + class31.field431 + 1];
        class276.field4081 = new boolean[class31.field431 + class31.field431 + 2][class31.field431 + class31.field431 + 2];
        class71.field930 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lgt;ZLjava/lang/String;ZI)V")
    public static final void method510(class341 arg0, boolean arg1, String arg2, boolean arg3, int arg4) {
        if (arg4 != 2) {
            method507((byte) -25);
        }
        field914++;
        if (!arg1) {
            class67.method500(true, arg2, 3, arg0);
            return;
        }
        if (class341.field5017.startsWith("win") && class341.field5007 != 3) {
            String var5 = null;
            if (arg0.field5023 != null) {
                var5 = arg0.field5023.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class350 var6 = class67.method500(true, arg2, 0, arg0);
                class279.field4114 = arg2;
                class431.field6284 = var6;
                class269.field3992 = arg0;
                return;
            }
        }
        if (class341.field5017.startsWith("mac")) {
            String var7 = null;
            if (arg0.field5023 != null) {
                var7 = arg0.field5023.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg3) {
                class67.method500(true, arg2, 1, arg0);
                return;
            }
        }
        class67.method500(true, arg2, 2, arg0);
    }
}
