import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class115 {

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public int field2194 = -1;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Lvd;")
    public static class222 field2195 = class212.method1357("Update)2Liste geladen)3", 10731);

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Lig;")
    public static class93 field2186 = new class93(128);

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Lvd;")
    public static class222 field2196 = class212.method1357("headicons_pk", 10731);

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Lvd;")
    public static class222 field2199 = class212.method1357("Lade Eingabe)2Steuerungsprogramm)3)3)3", 10731);

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "[I")
    public static int[] field2198 = new int[50];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public int field2184;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public int field2189;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "Lve;")
    public static class223 field2197;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(JIII)Z")
    public static final boolean method744(long arg0, int arg1, int arg2, int arg3) {
        field2183++;
        int var5 = (int) arg0 >> 14 & 0x1F;
        if (arg1 >= -117) {
            field2196 = null;
        }
        int var6 = (int) arg0 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class65 var8 = class174.method1102(var7, 0);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field1209;
                var9 = var8.field1196;
            } else {
                var9 = var8.field1209;
                var10 = var8.field1196;
            }
            int var11 = var8.field1182;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class62.method431(true, 2, 0, var9, var10, var11, class17.field432.field1333[0], class17.field432.field1358[0], 0, arg2, arg3, -101);
        } else {
            class62.method431(true, 2, var5 + 1, 0, 0, 0, class17.field432.field1333[0], class17.field432.field1358[0], var6, arg2, arg3, -101);
        }
        class119.field2256 = 0;
        class57.field1070 = class153.field2938;
        class138.field2669 = class64.field1168;
        class106.field1958 = 2;
        return true;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method745(int arg0) {
        field2199 = null;
        field2198 = null;
        field2197 = null;
        field2186 = null;
        if (arg0 == 128) {
            field2196 = null;
            field2195 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lab;ZLab;B)V")
    public static final void method746(class3 arg0, boolean arg1, class3 arg2, byte arg3) {
        field2193++;
        class84.field1604 = arg1;
        class222.field4122 = arg2;
        class176.field3306 = arg0;
        if (arg3 <= 45) {
            field2198 = null;
        }
        class13.field275 = new class166(30);
    }
}
